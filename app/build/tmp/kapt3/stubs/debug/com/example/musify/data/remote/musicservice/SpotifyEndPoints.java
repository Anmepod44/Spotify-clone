package com.example.musify.data.remote.musicservice;

import java.lang.System;

/**
 * An object that contains the different end points
 * used by [SpotifyService]. It also contains certain defaults for the
 * api calls made by [SpotifyService].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/musicservice/SpotifyEndPoints;", "", "()V", "API_TOKEN_ENDPOINT", "", "BROWSE_CATEGORIES_FOR_COUNTRY_AND_LOCALE_ENDPOINT", "FEATURED_PLAYLISTS", "NEW_RELEASES_ENDPOINT", "PLAYLISTS_FOR_BESPOKE_CATEGORY", "PLAYLIST_TRACKS_ENDPOINT", "RECOMMENDATIONS_ENDPOINT", "SEARCH_ENDPOINT", "SPECIFIC_ALBUM_ENDPOINT", "SPECIFIC_ARTIST_ALBUMS_ENDPOINT", "SPECIFIC_ARTIST_ENDPOINT", "TOP_TRACKS_ENDPOINT", "Defaults", "app_debug"})
public final class SpotifyEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.data.remote.musicservice.SpotifyEndPoints INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPECIFIC_ARTIST_ENDPOINT = "v1/artists/{id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPECIFIC_ARTIST_ALBUMS_ENDPOINT = "v1/artists/{id}/albums";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPECIFIC_ALBUM_ENDPOINT = "v1/albums/{id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOP_TRACKS_ENDPOINT = "v1/artists/{id}/top-tracks";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_ENDPOINT = "v1/search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_TOKEN_ENDPOINT = "api/token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECOMMENDATIONS_ENDPOINT = "v1/recommendations";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST_TRACKS_ENDPOINT = "v1/playlists/{playlist_id}/tracks";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEW_RELEASES_ENDPOINT = "v1/browse/new-releases";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEATURED_PLAYLISTS = "v1/browse/featured-playlists";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLISTS_FOR_BESPOKE_CATEGORY = "v1/browse/categories/{category_id}/playlists";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROWSE_CATEGORIES_FOR_COUNTRY_AND_LOCALE_ENDPOINT = "v1/browse/categories";
    
    private SpotifyEndPoints() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/musify/data/remote/musicservice/SpotifyEndPoints$Defaults;", "", "()V", "defaultPlaylistFields", "", "defaultSearchQueryTypes", "getDefaultSearchQueryTypes", "()Ljava/lang/String;", "app_debug"})
    public static final class Defaults {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.data.remote.musicservice.SpotifyEndPoints.Defaults INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String defaultPlaylistFields = "id,images,name,description,owner.display_name,tracks.items,followers.total";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String defaultSearchQueryTypes = null;
        
        private Defaults() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultSearchQueryTypes() {
            return null;
        }
    }
}