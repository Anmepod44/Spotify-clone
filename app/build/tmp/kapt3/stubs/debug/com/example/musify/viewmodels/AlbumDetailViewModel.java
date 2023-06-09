package com.example.musify.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c\u00a8\u0006!"}, d2 = {"Lcom/example/musify/viewmodels/AlbumDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getCurrentlyPlayingTrackUseCase", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "tracksRepository", "Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;)V", "_tracks", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "_uiState", "Lcom/example/musify/viewmodels/AlbumDetailUiState;", "albumId", "", "currentlyPlayingTrackStream", "Lkotlinx/coroutines/flow/Flow;", "getCurrentlyPlayingTrackStream", "()Lkotlinx/coroutines/flow/Flow;", "defaultMapperImageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "tracks", "Landroidx/compose/runtime/State;", "getTracks", "()Landroidx/compose/runtime/State;", "uiState", "getUiState", "fetchAndAssignTrackList", "", "app_debug"})
public final class AlbumDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.musify.data.repositories.tracksrepository.TracksRepository tracksRepository = null;
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> _tracks = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> tracks = null;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.AlbumDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.AlbumDetailUiState> uiState = null;
    private final java.lang.String albumId = null;
    private final com.example.musify.data.utils.MapperImageSize defaultMapperImageSize = com.example.musify.data.utils.MapperImageSize.MEDIUM;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> currentlyPlayingTrackStream = null;
    
    @javax.inject.Inject()
    public AlbumDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase getCurrentlyPlayingTrackUseCase, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tracksrepository.TracksRepository tracksRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> getTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.AlbumDetailUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream() {
        return null;
    }
    
    private final void fetchAndAssignTrackList() {
    }
}