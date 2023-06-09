package com.example.musify.data.repositories.albumsrepository;

import java.lang.System;

/**
 * A repository that contains methods related to albums. **All methods
 * of this interface will always return an instance of [SearchResult.AlbumSearchResult]**
 * encapsulated inside [FetchedResource.Success] if the resource was
 * fetched successfully. This ensures that the return value of all the
 * methods of [AlbumsRepository] will always return [SearchResult.AlbumSearchResult]
 * in the case of a successful fetch operation.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ;\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/repositories/albumsrepository/AlbumsRepository;", "", "fetchAlbumWithId", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "albumId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "countryCode", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAlbumsOfArtistWithId", "", "artistId", "getPaginatedStreamForAlbumsOfArtist", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "app_debug"})
public abstract interface AlbumsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAlbumWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<com.example.musify.domain.SearchResult.AlbumSearchResult, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAlbumsOfArtistWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> getPaginatedStreamForAlbumsOfArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize);
}