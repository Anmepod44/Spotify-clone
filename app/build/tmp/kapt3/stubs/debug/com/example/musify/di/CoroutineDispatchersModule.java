package com.example.musify.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/di/CoroutineDispatchersModule;", "", "()V", "provideDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "provideMainDispatcher", "app_debug"})
@dagger.Module()
public final class CoroutineDispatchersModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.di.CoroutineDispatchersModule INSTANCE = null;
    
    private CoroutineDispatchersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @DefaultDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @IODispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @MainDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideMainDispatcher() {
        return null;
    }
}