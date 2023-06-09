package com.example.musify.domain;

import java.lang.System;

/**
 * A class that models a search result. It contains all the [tracks],
 * [albums],[artists] and [playlists] that matched a search query.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003JI\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/example/musify/domain/SearchResults;", "", "tracks", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "albums", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "artists", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "playlists", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAlbums", "()Ljava/util/List;", "getArtists", "getPlaylists", "getTracks", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class SearchResults {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> tracks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult> albums = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.domain.SearchResult.ArtistSearchResult> artists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> playlists = null;
    
    /**
     * A class that models a search result. It contains all the [tracks],
     * [albums],[artists] and [playlists] that matched a search query.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.SearchResults copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> tracks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult> albums, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.ArtistSearchResult> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> playlists) {
        return null;
    }
    
    /**
     * A class that models a search result. It contains all the [tracks],
     * [albums],[artists] and [playlists] that matched a search query.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class that models a search result. It contains all the [tracks],
     * [albums],[artists] and [playlists] that matched a search query.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A class that models a search result. It contains all the [tracks],
     * [albums],[artists] and [playlists] that matched a search query.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> tracks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult> albums, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.ArtistSearchResult> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> playlists) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> getTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.AlbumSearchResult> getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.ArtistSearchResult> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.ArtistSearchResult> getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> getPlaylists() {
        return null;
    }
}