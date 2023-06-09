package com.example.musify.data.repositories.artistsrepository;

import java.lang.System;

/**
 * A repository that contains methods related to artists. **All methods
 * of this interface will always return an instance of [SearchResult.ArtistSearchResult]**
 * encapsulated inside [FetchedResource.Success] if the resource was
 * fetched successfully. This ensures that the return value of all the
 * methods of [ArtistsRepository] will always return [SearchResult.ArtistSearchResult]
 * in the case of a successful fetch operation.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/musify/data/repositories/artistsrepository/ArtistsRepository;", "", "fetchArtistSummaryForId", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "artistId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ArtistsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchArtistSummaryForId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<com.example.musify.domain.SearchResult.ArtistSearchResult, com.example.musify.domain.MusifyErrorType>> continuation);
}