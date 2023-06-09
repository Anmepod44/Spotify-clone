package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response that contains the results of a search operation.
 * All the properties are nullable because a search operation
 * for just [tracks],[albums],[artists] or [playlists], or
 * a combination of any of the above can be made, in which
 * case, the other properties will be null.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/example/musify/data/remote/response/SearchResultsResponse;", "", "tracks", "Lcom/example/musify/data/remote/response/SearchResultsResponse$Tracks;", "albums", "Lcom/example/musify/data/remote/response/SearchResultsResponse$Albums;", "artists", "Lcom/example/musify/data/remote/response/SearchResultsResponse$Artists;", "playlists", "Lcom/example/musify/data/remote/response/SearchResultsResponse$Playlists;", "(Lcom/example/musify/data/remote/response/SearchResultsResponse$Tracks;Lcom/example/musify/data/remote/response/SearchResultsResponse$Albums;Lcom/example/musify/data/remote/response/SearchResultsResponse$Artists;Lcom/example/musify/data/remote/response/SearchResultsResponse$Playlists;)V", "getAlbums", "()Lcom/example/musify/data/remote/response/SearchResultsResponse$Albums;", "getArtists", "()Lcom/example/musify/data/remote/response/SearchResultsResponse$Artists;", "getPlaylists", "()Lcom/example/musify/data/remote/response/SearchResultsResponse$Playlists;", "getTracks", "()Lcom/example/musify/data/remote/response/SearchResultsResponse$Tracks;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Albums", "Artists", "Playlists", "Tracks", "app_debug"})
public final class SearchResultsResponse {
    @org.jetbrains.annotations.Nullable()
    private final com.example.musify.data.remote.response.SearchResultsResponse.Tracks tracks = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.musify.data.remote.response.SearchResultsResponse.Albums albums = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.musify.data.remote.response.SearchResultsResponse.Artists artists = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.musify.data.remote.response.SearchResultsResponse.Playlists playlists = null;
    
    /**
     * A response that contains the results of a search operation.
     * All the properties are nullable because a search operation
     * for just [tracks],[albums],[artists] or [playlists], or
     * a combination of any of the above can be made, in which
     * case, the other properties will be null.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.SearchResultsResponse copy(@org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Tracks tracks, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Albums albums, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Artists artists, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Playlists playlists) {
        return null;
    }
    
    /**
     * A response that contains the results of a search operation.
     * All the properties are nullable because a search operation
     * for just [tracks],[albums],[artists] or [playlists], or
     * a combination of any of the above can be made, in which
     * case, the other properties will be null.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response that contains the results of a search operation.
     * All the properties are nullable because a search operation
     * for just [tracks],[albums],[artists] or [playlists], or
     * a combination of any of the above can be made, in which
     * case, the other properties will be null.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response that contains the results of a search operation.
     * All the properties are nullable because a search operation
     * for just [tracks],[albums],[artists] or [playlists], or
     * a combination of any of the above can be made, in which
     * case, the other properties will be null.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchResultsResponse(@org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Tracks tracks, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Albums albums, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Artists artists, @org.jetbrains.annotations.Nullable()
    com.example.musify.data.remote.response.SearchResultsResponse.Playlists playlists) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Tracks component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Tracks getTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Albums component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Albums getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Artists component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Artists getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Playlists component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.musify.data.remote.response.SearchResultsResponse.Playlists getPlaylists() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/SearchResultsResponse$Tracks;", "", "value", "", "Lcom/example/musify/data/remote/response/TrackResponseWithAlbumMetadata;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Tracks {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata> value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.SearchResultsResponse.Tracks copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata> value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Tracks(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata> getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/SearchResultsResponse$Albums;", "", "value", "", "Lcom/example/musify/data/remote/response/AlbumMetadataResponse;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Albums {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.SearchResultsResponse.Albums copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Albums(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/SearchResultsResponse$Artists;", "", "value", "", "Lcom/example/musify/data/remote/response/ArtistResponse;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Artists {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.ArtistResponse> value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.SearchResultsResponse.Artists copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.ArtistResponse> value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Artists(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.ArtistResponse> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.ArtistResponse> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.ArtistResponse> getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/SearchResultsResponse$Playlists;", "", "value", "", "Lcom/example/musify/data/remote/response/PlaylistMetadataResponse;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Playlists {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.PlaylistMetadataResponse> value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.SearchResultsResponse.Playlists copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.PlaylistMetadataResponse> value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Playlists(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.PlaylistMetadataResponse> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.PlaylistMetadataResponse> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.PlaylistMetadataResponse> getValue() {
            return null;
        }
    }
}