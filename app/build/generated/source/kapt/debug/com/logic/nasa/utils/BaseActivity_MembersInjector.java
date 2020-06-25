// Generated by Dagger (https://dagger.dev).
package com.logic.nasa.utils;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector<VM extends BaseViewModel> implements MembersInjector<BaseActivity<VM>> {
  private final Provider<VM> viewModelProvider;

  public BaseActivity_MembersInjector(Provider<VM> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static <VM extends BaseViewModel> MembersInjector<BaseActivity<VM>> create(
      Provider<VM> viewModelProvider) {
    return new BaseActivity_MembersInjector<VM>(viewModelProvider);}

  @Override
  public void injectMembers(BaseActivity<VM> instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.logic.nasa.utils.BaseActivity.viewModel")
  public static <VM extends BaseViewModel> void injectViewModel(BaseActivity<VM> instance,
      VM viewModel) {
    instance.viewModel = viewModel;
  }
}
