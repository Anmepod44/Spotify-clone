package com.example.musify.viewmodels.searchviewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\f\u00106\u001a\b\u0012\u0004\u0012\u00020807J\u000e\u00109\u001a\u0002012\u0006\u00102\u001a\u000203J\b\u0010:\u001a\u000201H\u0002J\u000e\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u0015J4\u0010=\u001a\u000201\"\u0004\b\u0000\u0010>*\b\u0012\u0004\u0012\u0002H>0\u001d2\u0006\u0010?\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u0002010BH\u0002R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0%\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\'\u00a8\u0006C"}, d2 = {"Lcom/example/musify/viewmodels/searchviewmodel/SearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "getCurrentlyPlayingTrackUseCase", "Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "genresRepository", "Lcom/example/musify/data/repositories/genresrepository/GenresRepository;", "searchRepository", "Lcom/example/musify/data/repositories/searchrepository/SearchRepository;", "(Landroid/app/Application;Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/example/musify/data/repositories/genresrepository/GenresRepository;Lcom/example/musify/data/repositories/searchrepository/SearchRepository;)V", "_albumListForSearchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "_artistListForSearchQuery", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "_currentlySelectedFilter", "Landroidx/compose/runtime/MutableState;", "Lcom/example/musify/viewmodels/searchviewmodel/SearchFilter;", "_playlistListForSearchQuery", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "_trackListForSearchQuery", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "_uiState", "Lcom/example/musify/viewmodels/searchviewmodel/SearchScreenUiState;", "albumListForSearchQuery", "Lkotlinx/coroutines/flow/Flow;", "getAlbumListForSearchQuery", "()Lkotlinx/coroutines/flow/Flow;", "artistListForSearchQuery", "getArtistListForSearchQuery", "currentlyPlayingTrackStream", "getCurrentlyPlayingTrackStream", "currentlySelectedFilter", "Landroidx/compose/runtime/State;", "getCurrentlySelectedFilter", "()Landroidx/compose/runtime/State;", "playlistListForSearchQuery", "getPlaylistListForSearchQuery", "searchJob", "Lkotlinx/coroutines/Job;", "trackListForSearchQuery", "getTrackListForSearchQuery", "uiState", "getUiState", "collectAndAssignSearchResults", "", "searchQuery", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "getAvailableGenres", "", "Lcom/example/musify/domain/Genre;", "search", "setEmptyValuesToAllSearchResults", "updateSearchFilter", "newSearchFilter", "collectInViewModelScopeUpdatingUiState", "T", "updateUiStatePredicate", "", "collectBlock", "Lkotlin/Function1;", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final com.example.musify.data.repositories.genresrepository.GenresRepository genresRepository = null;
    private final com.example.musify.data.repositories.searchrepository.SearchRepository searchRepository = null;
    private kotlinx.coroutines.Job searchJob;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.searchviewmodel.SearchScreenUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.searchviewmodel.SearchScreenUiState> uiState = null;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.searchviewmodel.SearchFilter> _currentlySelectedFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.searchviewmodel.SearchFilter> currentlySelectedFilter = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> _albumListForSearchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> albumListForSearchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.ArtistSearchResult>> _artistListForSearchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.ArtistSearchResult>> artistListForSearchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> _trackListForSearchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> trackListForSearchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.PlaylistSearchResult>> _playlistListForSearchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.PlaylistSearchResult>> playlistListForSearchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> currentlyPlayingTrackStream = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase getCurrentlyPlayingTrackUseCase, @org.jetbrains.annotations.NotNull()
    @com.example.musify.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.genresrepository.GenresRepository genresRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.searchrepository.SearchRepository searchRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.searchviewmodel.SearchScreenUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.searchviewmodel.SearchFilter> getCurrentlySelectedFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> getAlbumListForSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.ArtistSearchResult>> getArtistListForSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> getTrackListForSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.PlaylistSearchResult>> getPlaylistListForSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream() {
        return null;
    }
    
    private final void collectAndAssignSearchResults(java.lang.String searchQuery, com.example.musify.data.utils.MapperImageSize imageSize) {
    }
    
    private final void setEmptyValuesToAllSearchResults() {
    }
    
    /**
     * Used to collect a flow and set the the [_uiState] to
     * [SearchScreenUiState.SUCCESS] based on the [updateUiStatePredicate]
     * after running the [collectBlock]. The [_uiState] will be set to
     * [SearchScreenUiState.SUCCESS] if, and only if, [updateUiStatePredicate]
     * is true and the current value of [_uiState] is equal to
     * [SearchScreenUiState.LOADING].
     *
     * This method is mainly used to update the [_uiState] to
     * [SearchScreenUiState.SUCCESS] based on the [currentlySelectedFilter].
     * This prevents the [_uiState] to be assigned to [SearchScreenUiState.LOADING]
     * for as long as all the flows get collected. Instead, the ui state will be
     * updated to [SearchScreenUiState.SUCCESS] as soon as the flow
     * for the [currentlySelectedFilter] is collected.
     *
     * For eg: If the user has selected the current filter to be [SearchFilter.ALBUMS],
     * this [_uiState] will be set to [SearchScreenUiState.SUCCESS] immediately
     * after the search results for the album has been set. This precludes the
     * need for waiting for other flows, such as artists/tracks to be collected
     * before setting the [_uiState] to [SearchScreenUiState.SUCCESS]
     * for the search results since the user just wants to see the album list.
     */
    private final <T extends java.lang.Object>void collectInViewModelScopeUpdatingUiState(kotlinx.coroutines.flow.Flow<? extends T> $this$collectInViewModelScopeUpdatingUiState, boolean updateUiStatePredicate, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> collectBlock) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.Genre> getAvailableGenres() {
        return null;
    }
    
    public final void updateSearchFilter(@org.jetbrains.annotations.NotNull()
    com.example.musify.viewmodels.searchviewmodel.SearchFilter newSearchFilter) {
    }
}