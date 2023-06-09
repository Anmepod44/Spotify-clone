package com.example.musify.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/di/MusicServiceModule;", "", "()V", "provideSpotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "provideTokenManager", "Lcom/example/musify/data/remote/token/tokenmanager/TokenManager;", "app_debug"})
@dagger.Module()
public final class MusicServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.di.MusicServiceModule INSTANCE = null;
    
    private MusicServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.musify.data.remote.musicservice.SpotifyService provideSpotifyService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.musify.data.remote.token.tokenmanager.TokenManager provideTokenManager() {
        return null;
    }
}