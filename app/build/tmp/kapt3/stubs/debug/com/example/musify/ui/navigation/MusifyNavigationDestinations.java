package com.example.musify.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "AlbumDetailScreen", "ArtistDetailScreen", "HomeScreen", "PlaylistDetailScreen", "SearchScreen", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$SearchScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$ArtistDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$AlbumDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$PlaylistDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$HomeScreen;", "app_debug"})
public abstract class MusifyNavigationDestinations {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private MusifyNavigationDestinations(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$SearchScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "()V", "app_debug"})
    public static final class SearchScreen extends com.example.musify.ui.navigation.MusifyNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyNavigationDestinations.SearchScreen INSTANCE = null;
        
        private SearchScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$ArtistDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "()V", "NAV_ARG_ARTIST_ID", "", "NAV_ARG_ARTIST_NAME", "NAV_ARG_ENCODED_IMAGE_URL_STRING", "buildRoute", "artistSearchResult", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "app_debug"})
    public static final class ArtistDetailScreen extends com.example.musify.ui.navigation.MusifyNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyNavigationDestinations.ArtistDetailScreen INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ARTIST_ID = "artistId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ARTIST_NAME = "artistName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ENCODED_IMAGE_URL_STRING = "encodedImageUrlString";
        
        private ArtistDetailScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String buildRoute(@org.jetbrains.annotations.NotNull()
        com.example.musify.domain.SearchResult.ArtistSearchResult artistSearchResult) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$AlbumDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "()V", "NAV_ARG_ALBUM_ID", "", "NAV_ARG_ALBUM_NAME", "NAV_ARG_ARTISTS_STRING", "NAV_ARG_ENCODED_IMAGE_URL_STRING", "NAV_ARG_YEAR_OF_RELEASE_STRING", "buildRoute", "albumSearchResult", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "app_debug"})
    public static final class AlbumDetailScreen extends com.example.musify.ui.navigation.MusifyNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyNavigationDestinations.AlbumDetailScreen INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ALBUM_ID = "albumId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ALBUM_NAME = "albumName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ARTISTS_STRING = "artistsString";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ENCODED_IMAGE_URL_STRING = "encodedImageUrlString";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_YEAR_OF_RELEASE_STRING = "yearOfReleaseString";
        
        private AlbumDetailScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String buildRoute(@org.jetbrains.annotations.NotNull()
        com.example.musify.domain.SearchResult.AlbumSearchResult albumSearchResult) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$PlaylistDetailScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "()V", "NAV_ARG_ENCODED_IMAGE_URL_STRING", "", "NAV_ARG_NUMBER_OF_TRACKS", "NAV_ARG_OWNER_NAME", "NAV_ARG_PLAYLIST_ID", "NAV_ARG_PLAYLIST_NAME", "buildRoute", "playlistSearchResult", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "app_debug"})
    public static final class PlaylistDetailScreen extends com.example.musify.ui.navigation.MusifyNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyNavigationDestinations.PlaylistDetailScreen INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_PLAYLIST_ID = "playlistId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_PLAYLIST_NAME = "playlistName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_ENCODED_IMAGE_URL_STRING = "encodedImageUrlString";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_OWNER_NAME = "ownerName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAV_ARG_NUMBER_OF_TRACKS = "numberOfTracks";
        
        private PlaylistDetailScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String buildRoute(@org.jetbrains.annotations.NotNull()
        com.example.musify.domain.SearchResult.PlaylistSearchResult playlistSearchResult) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyNavigationDestinations$HomeScreen;", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "()V", "app_debug"})
    public static final class HomeScreen extends com.example.musify.ui.navigation.MusifyNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyNavigationDestinations.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
            super(null);
        }
    }
}