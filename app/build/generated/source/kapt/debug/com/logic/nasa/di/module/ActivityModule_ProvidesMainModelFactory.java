// Generated by Dagger (https://dagger.dev).
package com.logic.nasa.di.module;

import com.logic.nasa.data.repositery.MainRepository;
import com.logic.nasa.ui.main.MainViewModel;
import com.logic.nasa.utils.NetworkHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvidesMainModelFactory implements Factory<MainViewModel> {
  private final ActivityModule module;

  private final Provider<NetworkHelper> networkHelperProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  private final Provider<MainRepository> mainRepositoryProvider;

  public ActivityModule_ProvidesMainModelFactory(ActivityModule module,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<MainRepository> mainRepositoryProvider) {
    this.module = module;
    this.networkHelperProvider = networkHelperProvider;
    this.compositeDisposableProvider = compositeDisposableProvider;
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return providesMainModel(module, networkHelperProvider.get(), compositeDisposableProvider.get(), mainRepositoryProvider.get());
  }

  public static ActivityModule_ProvidesMainModelFactory create(ActivityModule module,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<MainRepository> mainRepositoryProvider) {
    return new ActivityModule_ProvidesMainModelFactory(module, networkHelperProvider, compositeDisposableProvider, mainRepositoryProvider);
  }

  public static MainViewModel providesMainModel(ActivityModule instance,
      NetworkHelper networkHelper, CompositeDisposable compositeDisposable,
      MainRepository mainRepository) {
    return Preconditions.checkNotNull(instance.providesMainModel(networkHelper, compositeDisposable, mainRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
