package com.example.musify.data.repositories.albumsrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J;\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00180\u00172\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/musify/data/repositories/albumsrepository/MusifyAlbumsRepository;", "Lcom/example/musify/data/repositories/albumsrepository/AlbumsRepository;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "pagingConfig", "Landroidx/paging/PagingConfig;", "(Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;Lcom/example/musify/data/remote/musicservice/SpotifyService;Landroidx/paging/PagingConfig;)V", "fetchAlbumWithId", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "Lcom/example/musify/domain/MusifyErrorType;", "albumId", "", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "countryCode", "(Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAlbumsOfArtistWithId", "", "artistId", "getPaginatedStreamForAlbumsOfArtist", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "app_debug"})
public final class MusifyAlbumsRepository implements com.example.musify.data.repositories.albumsrepository.AlbumsRepository {
    private final com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository = null;
    private final com.example.musify.data.remote.musicservice.SpotifyService spotifyService = null;
    private final androidx.paging.PagingConfig pagingConfig = null;
    
    @javax.inject.Inject()
    public MusifyAlbumsRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingConfig pagingConfig) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAlbumsOfArtistWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult>, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAlbumWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<com.example.musify.domain.SearchResult.AlbumSearchResult, com.example.musify.domain.MusifyErrorType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.musify.domain.SearchResult.AlbumSearchResult>> getPaginatedStreamForAlbumsOfArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize) {
        return null;
    }
}