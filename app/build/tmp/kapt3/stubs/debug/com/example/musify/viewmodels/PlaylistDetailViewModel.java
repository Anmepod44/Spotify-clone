package com.example.musify.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/musify/viewmodels/PlaylistDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "tracksRepository", "Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "getCurrentlyPlayingTrackUseCase", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;)V", "currentlyPlayingTrackStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "getCurrentlyPlayingTrackStream", "()Lkotlinx/coroutines/flow/Flow;", "playlistId", "", "tracks", "Landroidx/paging/PagingData;", "getTracks", "app_debug"})
public final class PlaylistDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String playlistId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> tracks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> currentlyPlayingTrackStream = null;
    
    @javax.inject.Inject()
    public PlaylistDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tracksrepository.TracksRepository tracksRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase getCurrentlyPlayingTrackUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> getTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream() {
        return null;
    }
}