package com.example.musify.data.repositories.searchrepository;

import java.lang.System;

/**
 * A repository that contains all methods related to searching.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J,\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J,\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/musify/data/repositories/searchrepository/SearchRepository;", "", "fetchSearchResultsForQuery", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/SearchResults;", "Lcom/example/musify/domain/MusifyErrorType;", "searchQuery", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "countryCode", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaginatedSearchStreamForAlbums", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "getPaginatedSearchStreamForArtists", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "getPaginatedSearchStreamForPlaylists", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "getPaginatedSearchStreamForTracks", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "app_debug"})
public abstract interface SearchRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchSearchResultsForQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<com.example.musify.domain.SearchResults, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> getPaginatedSearchStreamForAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.ArtistSearchResult>> getPaginatedSearchStreamForArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> getPaginatedSearchStreamForTracks(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.PlaylistSearchResult>> getPaginatedSearchStreamForPlaylists(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
}