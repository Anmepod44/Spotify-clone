package com.example.musify.data.remote.musicservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJO\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014JC\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018JM\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u001b\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ9\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJC\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J/\u0010#\u001a\u00020$2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ9\u0010%\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020\'2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(JC\u0010)\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,JM\u0010-\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u00100\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/example/musify/data/remote/musicservice/SpotifyService;", "", "getAlbumWithId", "Lcom/example/musify/data/remote/response/AlbumResponse;", "albumId", "", "market", "token", "Lcom/example/musify/data/remote/token/BearerToken;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/remote/token/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlbumsOfArtistWithId", "Lcom/example/musify/data/remote/response/AlbumsMetadataResponse;", "artistId", "limit", "", "offset", "includeGroups", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/remote/token/BearerToken;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArtistInfoWithId", "Lcom/example/musify/data/remote/response/ArtistResponse;", "(Ljava/lang/String;Lcom/example/musify/data/remote/token/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBrowseCategories", "Lcom/example/musify/data/remote/response/BrowseCategoriesResponse;", "locale", "(Lcom/example/musify/data/remote/token/BearerToken;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeaturedPlaylists", "Lcom/example/musify/data/remote/response/FeaturedPlaylistsResponse;", "timestamp", "(Lcom/example/musify/data/remote/token/BearerToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewReleases", "Lcom/example/musify/data/remote/response/NewReleasesResponse;", "(Lcom/example/musify/data/remote/token/BearerToken;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaylistsForCategory", "Lcom/example/musify/data/remote/response/PlaylistsForSpecificCategoryResponse;", "categoryId", "getTopTenTracksForArtistWithId", "Lcom/example/musify/data/remote/response/TracksWithAlbumMetadataListResponse;", "getTracksForGenre", "genre", "Lcom/example/musify/data/remote/musicservice/SupportedSpotifyGenres;", "(Lcom/example/musify/data/remote/musicservice/SupportedSpotifyGenres;Ljava/lang/String;Lcom/example/musify/data/remote/token/BearerToken;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTracksForPlaylist", "Lcom/example/musify/data/remote/response/PlaylistItemsResponse;", "playlistId", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/remote/token/BearerToken;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/example/musify/data/remote/response/SearchResultsResponse;", "searchQuery", "type", "app_debug"})
public abstract interface SpotifyService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/artists/{id}")
    public abstract java.lang.Object getArtistInfoWithId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.ArtistResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/artists/{id}/albums")
    public abstract java.lang.Object getAlbumsOfArtistWithId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "include_groups")
    java.lang.String includeGroups, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.AlbumsMetadataResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/artists/{id}/top-tracks")
    public abstract java.lang.Object getTopTenTracksForArtistWithId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.TracksWithAlbumMetadataListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/albums/{id}")
    public abstract java.lang.Object getAlbumWithId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.AlbumResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/search")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.SearchResultsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/recommendations")
    public abstract java.lang.Object getTracksForGenre(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "seed_genres")
    com.example.musify.data.remote.musicservice.SupportedSpotifyGenres genre, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.TracksWithAlbumMetadataListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/playlists/{playlist_id}/tracks")
    public abstract java.lang.Object getTracksForPlaylist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "playlist_id")
    java.lang.String playlistId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.PlaylistItemsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/browse/new-releases")
    public abstract java.lang.Object getNewReleases(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String market, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.NewReleasesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/browse/featured-playlists")
    public abstract java.lang.Object getFeaturedPlaylists(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "locale")
    java.lang.String locale, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "timestamp")
    java.lang.String timestamp, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.FeaturedPlaylistsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/browse/categories")
    public abstract java.lang.Object getBrowseCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "locale")
    java.lang.String locale, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.BrowseCategoriesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/browse/categories/{category_id}/playlists")
    public abstract java.lang.Object getPlaylistsForCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    com.example.musify.data.remote.token.BearerToken token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "category_id")
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String market, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.response.PlaylistsForSpecificCategoryResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}