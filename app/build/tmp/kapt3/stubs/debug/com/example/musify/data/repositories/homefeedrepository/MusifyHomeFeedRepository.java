package com.example.musify.data.repositories.homefeedrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J=\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J;\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001d"}, d2 = {"Lcom/example/musify/data/repositories/homefeedrepository/MusifyHomeFeedRepository;", "Lcom/example/musify/data/repositories/homefeedrepository/HomeFeedRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "(Lcom/example/musify/data/remote/musicservice/SpotifyService;Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;)V", "fetchFeaturedPlaylistsForCurrentTimeStamp", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/FeaturedPlaylists;", "Lcom/example/musify/domain/MusifyErrorType;", "timestampMillis", "", "countryCode", "", "languageCode", "Lcom/example/musify/data/repositories/homefeedrepository/ISO6391LanguageCode;", "fetchFeaturedPlaylistsForCurrentTimeStamp-isJ2fTA", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewlyReleasedAlbums", "", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "mapperImageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPlaylistsBasedOnCategoriesAvailableForCountry", "Lcom/example/musify/domain/PlaylistsForCategory;", "fetchPlaylistsBasedOnCategoriesAvailableForCountry-503dy6U", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MusifyHomeFeedRepository implements com.example.musify.data.repositories.homefeedrepository.HomeFeedRepository {
    private final com.example.musify.data.remote.musicservice.SpotifyService spotifyService = null;
    private final com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository = null;
    
    @javax.inject.Inject()
    public MusifyHomeFeedRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchNewlyReleasedAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize mapperImageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
}