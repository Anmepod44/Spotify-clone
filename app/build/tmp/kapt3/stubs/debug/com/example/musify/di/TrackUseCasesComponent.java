package com.example.musify.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/musify/di/TrackUseCasesComponent;", "", "()V", "bindDownloadDrawableFromUrlUseCase", "Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/DownloadDrawableFromUrlUseCase;", "impl", "Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/MusifyDownloadDrawableFromUrlUseCase;", "bindGetCurrentlyPlayingTrackUseCase", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/MusifyGetCurrentlyPlayingTrackUseCase;", "app_debug"})
@dagger.Module()
public abstract class TrackUseCasesComponent {
    
    public TrackUseCasesComponent() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.usecases.downloadDrawableFromUrlUseCase.DownloadDrawableFromUrlUseCase bindDownloadDrawableFromUrlUseCase(@org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.downloadDrawableFromUrlUseCase.MusifyDownloadDrawableFromUrlUseCase impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase bindGetCurrentlyPlayingTrackUseCase(@org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.MusifyGetCurrentlyPlayingTrackUseCase impl);
}