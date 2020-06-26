package com.logic.nasa.di.component;

import java.lang.System;

@com.logic.nasa.di.ActivityScope()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/logic/nasa/di/component/ActivityComponent;", "", "injectMainActivity", "", "activity", "Lcom/logic/nasa/ui/main/MainActivity;", "injectPlayVideoActivity", "Lcom/logic/nasa/ui/main/PlayVideoActivity;", "app_debug"})
@dagger.Component(dependencies = {com.logic.nasa.di.component.ApplicationComponent.class}, modules = {com.logic.nasa.di.module.ActivityModule.class})
public abstract interface ActivityComponent {
    
    public abstract void injectMainActivity(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.ui.main.MainActivity activity);
    
    public abstract void injectPlayVideoActivity(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.ui.main.PlayVideoActivity activity);
}