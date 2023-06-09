package com.example.musify.data.repositories.tracksrepository;

import java.lang.System;

/**
 * A repository that contains methods related to tracks. **All methods
 * of this interface will always return an instance of [SearchResult.TrackSearchResult]**
 * encapsulated inside [FetchedResource.Success] if the resource was
 * fetched successfully. This ensures that the return value of all the
 * methods of [TracksRepository] will always return [SearchResult.TrackSearchResult]
 * in the case of a successful fetch operation.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ;\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ;\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "", "fetchTopTenTracksForArtistWithId", "Lcom/example/musify/data/utils/FetchedResource;", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "artistId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "countryCode", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTracksForAlbumWithId", "albumId", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTracksForGenre", "genre", "Lcom/example/musify/domain/Genre;", "(Lcom/example/musify/domain/Genre;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaginatedStreamForPlaylistTracks", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "playlistId", "app_debug"})
public abstract interface TracksRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTopTenTracksForArtistWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTracksForGenre(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.Genre genre, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTracksForAlbumWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> getPaginatedStreamForPlaylistTracks(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
}