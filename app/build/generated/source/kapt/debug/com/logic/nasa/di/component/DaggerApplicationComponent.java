// Generated by Dagger (https://dagger.dev).
package com.logic.nasa.di.component;

import com.logic.nasa.App;
import com.logic.nasa.data.network.ApiInterface;
import com.logic.nasa.data.repositery.MainRepository;
import com.logic.nasa.di.module.ApplicationModule;
import com.logic.nasa.di.module.ApplicationModule_ProvidesApiInterfaceFactory;
import com.logic.nasa.di.module.ApplicationModule_ProvidesCompositeDisposableFactory;
import com.logic.nasa.di.module.ApplicationModule_ProvidesNetworkHelperFactory;
import com.logic.nasa.utils.NetworkHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<CompositeDisposable> providesCompositeDisposableProvider;

  private Provider<NetworkHelper> providesNetworkHelperProvider;

  private Provider<ApiInterface> providesApiInterfaceProvider;

  private DaggerApplicationComponent(ApplicationModule applicationModuleParam) {

    initialize(applicationModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationModule applicationModuleParam) {
    this.providesCompositeDisposableProvider = DoubleCheck.provider(ApplicationModule_ProvidesCompositeDisposableFactory.create(applicationModuleParam));
    this.providesNetworkHelperProvider = DoubleCheck.provider(ApplicationModule_ProvidesNetworkHelperFactory.create(applicationModuleParam));
    this.providesApiInterfaceProvider = DoubleCheck.provider(ApplicationModule_ProvidesApiInterfaceFactory.create(applicationModuleParam));
  }

  @Override
  public void inject(App application) {
  }

  @Override
  public CompositeDisposable getCompositeDisposable() {
    return providesCompositeDisposableProvider.get();}

  @Override
  public NetworkHelper getNetworkHelper() {
    return providesNetworkHelperProvider.get();}

  @Override
  public MainRepository getMainRepositery() {
    return new MainRepository(providesApiInterfaceProvider.get());}

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public ApplicationComponent build() {
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      return new DaggerApplicationComponent(applicationModule);
    }
  }
}
