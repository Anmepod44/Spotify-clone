package com.example.musify.data.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/musify/data/paging/AlbumsOfArtistPagingSource;", "Lcom/example/musify/data/paging/SpotifyPagingSource;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "artistId", "", "market", "mapperImageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/utils/MapperImageSize;Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;Lcom/example/musify/data/remote/musicservice/SpotifyService;)V", "app_debug"})
public final class AlbumsOfArtistPagingSource extends com.example.musify.data.paging.SpotifyPagingSource<com.example.musify.domain.SearchResult.AlbumSearchResult> {
    private final java.lang.String artistId = null;
    private final java.lang.String market = null;
    private final com.example.musify.data.utils.MapperImageSize mapperImageSize = null;
    private final com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository = null;
    private final com.example.musify.data.remote.musicservice.SpotifyService spotifyService = null;
    
    public AlbumsOfArtistPagingSource(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize mapperImageSize, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService) {
        super(null);
    }
}