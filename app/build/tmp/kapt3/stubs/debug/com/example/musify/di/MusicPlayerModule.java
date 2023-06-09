package com.example.musify.di;

import java.lang.System;

/**
 * Note: The dependencies are not scoped because the underlying
 * media player is always a singleton. [ExoPlayerModule.provideExoplayer]
 * is annotated with @Singleton, therefore any class that depends on it
 * need not be a singleton since the class will be provided the same
 * instance of ExoPlayer.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/di/MusicPlayerModule;", "", "()V", "bindMusicPlayerV2", "Lcom/example/musify/musicplayer/MusicPlayerV2;", "musifyBackgroundMusicPlayerV2", "Lcom/example/musify/musicplayer/MusifyBackgroundMusicPlayerV2;", "app_debug"})
@dagger.Module()
public abstract class MusicPlayerModule {
    
    public MusicPlayerModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.musify.musicplayer.MusicPlayerV2 bindMusicPlayerV2(@org.jetbrains.annotations.NotNull()
    com.example.musify.musicplayer.MusifyBackgroundMusicPlayerV2 musifyBackgroundMusicPlayerV2);
}