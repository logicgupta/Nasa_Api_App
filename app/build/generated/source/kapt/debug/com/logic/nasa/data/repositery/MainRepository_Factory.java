// Generated by Dagger (https://dagger.dev).
package com.logic.nasa.data.repositery;

import com.logic.nasa.data.network.ApiInterface;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public MainRepository_Factory(Provider<ApiInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(apiInterfaceProvider.get());
  }

  public static MainRepository_Factory create(Provider<ApiInterface> apiInterfaceProvider) {
    return new MainRepository_Factory(apiInterfaceProvider);
  }

  public static MainRepository newInstance(ApiInterface apiInterface) {
    return new MainRepository(apiInterface);
  }
}
