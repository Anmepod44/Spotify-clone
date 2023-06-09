package com.example.musify.data.repositories.tracksrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ;\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J;\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J;\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/musify/data/repositories/tracksrepository/MusifyTracksRepository;", "Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "pagingConfig", "Landroidx/paging/PagingConfig;", "(Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;Lcom/example/musify/data/remote/musicservice/SpotifyService;Landroidx/paging/PagingConfig;)V", "fetchTopTenTracksForArtistWithId", "Lcom/example/musify/data/utils/FetchedResource;", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "artistId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "countryCode", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTracksForAlbumWithId", "albumId", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTracksForGenre", "genre", "Lcom/example/musify/domain/Genre;", "(Lcom/example/musify/domain/Genre;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaginatedStreamForPlaylistTracks", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "playlistId", "app_debug"})
public final class MusifyTracksRepository implements com.example.musify.data.repositories.tracksrepository.TracksRepository {
    private final com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository = null;
    private final com.example.musify.data.remote.musicservice.SpotifyService spotifyService = null;
    private final androidx.paging.PagingConfig pagingConfig = null;
    
    @javax.inject.Inject()
    public MusifyTracksRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingConfig pagingConfig) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchTopTenTracksForArtistWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchTracksForGenre(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.Genre genre, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchTracksForAlbumWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.TrackSearchResult>> getPaginatedStreamForPlaylistTracks(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize) {
        return null;
    }
}