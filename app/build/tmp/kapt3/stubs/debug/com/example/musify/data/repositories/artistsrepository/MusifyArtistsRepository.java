package com.example.musify.data.repositories.artistsrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/musify/data/repositories/artistsrepository/MusifyArtistsRepository;", "Lcom/example/musify/data/repositories/artistsrepository/ArtistsRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "(Lcom/example/musify/data/remote/musicservice/SpotifyService;Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;)V", "fetchArtistSummaryForId", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "artistId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MusifyArtistsRepository implements com.example.musify.data.repositories.artistsrepository.ArtistsRepository {
    private final com.example.musify.data.remote.musicservice.SpotifyService spotifyService = null;
    private final com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository = null;
    
    @javax.inject.Inject()
    public MusifyArtistsRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchArtistSummaryForId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<com.example.musify.domain.SearchResult.ArtistSearchResult, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
}