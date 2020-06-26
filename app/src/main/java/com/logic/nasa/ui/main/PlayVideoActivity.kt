package com.logic.nasa.ui.main

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.extractor.ExtractorsFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.source.dash.DashMediaSource
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.trackselection.TrackSelector
import com.google.android.exoplayer2.upstream.BandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.logic.nasa.R
import com.logic.nasa.di.component.ActivityComponent
import com.logic.nasa.utils.BaseActivity
import com.logic.nasa.utils.showToast
import kotlinx.android.synthetic.main.activity_detailed.*
import kotlinx.android.synthetic.main.custom_controller.*

class PlayVideoActivity : BaseActivity<MainViewModel>() {

    lateinit var simpleExoPlayer:SimpleExoPlayer

    var flag:Boolean=true
    var url:String?=null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        url=intent.getStringExtra("url");

    }

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.injectPlayVideoActivity(this)
    }

    override fun provideLayoutId(): Int = R.layout.activity_detailed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    @SuppressLint("SourceLockedOrientationActivity")
    override fun setupView() {
        supportActionBar!!.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        bt_fullscreen.setImageDrawable(resources.getDrawable(R.drawable.ic_fullscreen_exit))

        // Set Landscape
        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        val videoUrl:Uri= Uri.parse(url)

        // Initialize load control

        val loadControl:LoadControl=DefaultLoadControl()

        //Initialize Bandwidth Meter
        val bandwidthMeter:BandwidthMeter=DefaultBandwidthMeter()

        // Initialize track selector
        val trackSelector:TrackSelector=DefaultTrackSelector(
            AdaptiveTrackSelection.Factory(bandwidthMeter)
        )

        //Initialze simple Exo Player
        simpleExoPlayer=ExoPlayerFactory.newSimpleInstance(this
        ,trackSelector,loadControl)

        // Initialize data source factory
        val defaultHttpDataSourceFactory=
            DefaultHttpDataSourceFactory("exoplayer_video")

        // Initialize extractor Factory

        val extractorsFactory:ExtractorsFactory=DefaultExtractorsFactory()

        // Initialize media source
        val mediaSource:MediaSource=ExtractorMediaSource(
            videoUrl,defaultHttpDataSourceFactory,extractorsFactory,
            null,null
        )

        // set Player
        playerView.player=simpleExoPlayer

        // Keep Screen on
        playerView.keepScreenOn=true

        // Prepare Media
        simpleExoPlayer.prepare(mediaSource)

        // Play Video when ready

        simpleExoPlayer.playWhenReady=true

        simpleExoPlayer.addListener(object:Player.EventListener{
            override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters?) {

            }

            override fun onSeekProcessed() {

            }

            override fun onTracksChanged(
                trackGroups: TrackGroupArray?,
                trackSelections: TrackSelectionArray?
            ) {

            }

            override fun onPlayerError(error: ExoPlaybackException?) {
                showToast("Error in Parsing Video !");
            }

            override fun onLoadingChanged(isLoading: Boolean) {
            }

            override fun onPositionDiscontinuity(reason: Int) {
            }

            override fun onRepeatModeChanged(repeatMode: Int) {
            }

            override fun onShuffleModeEnabledChanged(shuffleModeEnabled: Boolean) {
            }

            override fun onTimelineChanged(timeline: Timeline?, manifest: Any?, reason: Int) {
            }

            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                // check condition
                if(playbackState==Player.STATE_BUFFERING){
                   // when buffering
                    // show progress bar
                    progress_bar.visibility=View.VISIBLE
                }
                else if (playbackState==Player.STATE_READY){

                    // when ready
                    // Hide Progress Bar

                    progress_bar.visibility=View.GONE

                }

            }

        })

        bt_fullscreen.setOnClickListener {

                if(flag){
                    // when flag iis true
                    // set Full Screen Image
                    bt_fullscreen.setImageDrawable(resources.getDrawable(R.drawable.ic_fullscreen))

                    // set Potrait
                    requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                    flag=false
                }
            else{
                    // When flag is false
                    // Set Exit Full Screen
                    bt_fullscreen.setImageDrawable(resources.getDrawable(R.drawable.ic_fullscreen_exit))

                    // Set Landscape
                    requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

                    flag=true

                }
        }
    }

    override fun onPause() {
        super.onPause()
        // Stop Video When Ready
        simpleExoPlayer.playWhenReady=false

        // Get Playback state

        simpleExoPlayer.playbackState
    }

    override fun onRestart() {
        super.onRestart()
        // Play video when ready
        simpleExoPlayer.playWhenReady=true

        // Get Playback state
        simpleExoPlayer.playbackState
    }
}

