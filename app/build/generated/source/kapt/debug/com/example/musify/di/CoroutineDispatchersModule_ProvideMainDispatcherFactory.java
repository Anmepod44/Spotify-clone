// Generated by Dagger (https://dagger.dev).
package com.example.musify.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineDispatchersModule_ProvideMainDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideMainDispatcher();
  }

  public static CoroutineDispatchersModule_ProvideMainDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideMainDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutineDispatchersModule.INSTANCE.provideMainDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutineDispatchersModule_ProvideMainDispatcherFactory INSTANCE = new CoroutineDispatchersModule_ProvideMainDispatcherFactory();
  }
}
