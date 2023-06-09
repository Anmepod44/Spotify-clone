package com.example.musify.viewmodels.artistviewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010%\u001a\u00020&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 \u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "albumsRepository", "Lcom/example/musify/data/repositories/albumsrepository/AlbumsRepository;", "getCurrentlyPlayingTrackUseCase", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "tracksRepository", "Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Lcom/example/musify/data/repositories/albumsrepository/AlbumsRepository;Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;)V", "_popularTracks", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "_uiState", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState;", "albumsOfArtistFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "getAlbumsOfArtistFlow", "()Lkotlinx/coroutines/flow/Flow;", "artistId", "", "currentlyPlayingTrackStream", "getCurrentlyPlayingTrackStream", "defaultMapperImageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "popularTracks", "Landroidx/compose/runtime/State;", "getPopularTracks", "()Landroidx/compose/runtime/State;", "uiState", "getUiState", "fetchAndAssignPopularTracks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ArtistDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.musify.data.repositories.tracksrepository.TracksRepository tracksRepository = null;
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> _popularTracks = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> popularTracks = null;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState> uiState = null;
    private final com.example.musify.data.utils.MapperImageSize defaultMapperImageSize = com.example.musify.data.utils.MapperImageSize.MEDIUM;
    private final java.lang.String artistId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> currentlyPlayingTrackStream = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> albumsOfArtistFlow = null;
    
    @javax.inject.Inject()
    public ArtistDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.albumsrepository.AlbumsRepository albumsRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase getCurrentlyPlayingTrackUseCase, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tracksrepository.TracksRepository tracksRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>> getPopularTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> getAlbumsOfArtistFlow() {
        return null;
    }
    
    private final java.lang.Object fetchAndAssignPopularTracks(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}