package com.example.musify.usecases.getCurrentlyPlayingTrackUseCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/MusifyGetCurrentlyPlayingTrackUseCase;", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "musicPlayer", "Lcom/example/musify/musicplayer/MusicPlayerV2;", "(Lcom/example/musify/musicplayer/MusicPlayerV2;)V", "getMusicPlayer", "()Lcom/example/musify/musicplayer/MusicPlayerV2;", "getCurrentlyPlayingTrackStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "app_debug"})
public final class MusifyGetCurrentlyPlayingTrackUseCase implements com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.musicplayer.MusicPlayerV2 musicPlayer = null;
    
    @javax.inject.Inject()
    public MusifyGetCurrentlyPlayingTrackUseCase(@org.jetbrains.annotations.NotNull()
    com.example.musify.musicplayer.MusicPlayerV2 musicPlayer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.musicplayer.MusicPlayerV2 getMusicPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream() {
        return null;
    }
}