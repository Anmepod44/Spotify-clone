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
public final class CoroutineDispatchersModule_ProvideIoDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideIoDispatcher();
  }

  public static CoroutineDispatchersModule_ProvideIoDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideIoDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutineDispatchersModule.INSTANCE.provideIoDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutineDispatchersModule_ProvideIoDispatcherFactory INSTANCE = new CoroutineDispatchersModule_ProvideIoDispatcherFactory();
  }
}