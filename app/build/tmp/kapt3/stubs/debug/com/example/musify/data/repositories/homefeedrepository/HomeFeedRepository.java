package com.example.musify.data.repositories.homefeedrepository;

import java.lang.System;

/**
 * An interface that contains the requisite methods required for a repository
 * that contains methods for fetching items to be displayed in the home
 * feed.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J;\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0018"}, d2 = {"Lcom/example/musify/data/repositories/homefeedrepository/HomeFeedRepository;", "", "fetchFeaturedPlaylistsForCurrentTimeStamp", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/FeaturedPlaylists;", "Lcom/example/musify/domain/MusifyErrorType;", "timestampMillis", "", "countryCode", "", "languageCode", "Lcom/example/musify/data/repositories/homefeedrepository/ISO6391LanguageCode;", "fetchFeaturedPlaylistsForCurrentTimeStamp-isJ2fTA", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewlyReleasedAlbums", "", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "mapperImageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPlaylistsBasedOnCategoriesAvailableForCountry", "Lcom/example/musify/domain/PlaylistsForCategory;", "fetchPlaylistsBasedOnCategoriesAvailableForCountry-503dy6U", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface HomeFeedRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchNewlyReleasedAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize mapperImageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation);
}