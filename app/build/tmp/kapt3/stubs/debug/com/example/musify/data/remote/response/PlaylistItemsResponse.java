package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response class that contains a list of tracks in a particular
 * playlist.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/remote/response/PlaylistItemsResponse;", "", "items", "", "Lcom/example/musify/data/remote/response/PlaylistItemsResponse$TrackResponseWithAlbumMetadataWrapper;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrackResponseWithAlbumMetadataWrapper", "app_debug"})
public final class PlaylistItemsResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper> items = null;
    
    /**
     * A response class that contains a list of tracks in a particular
     * playlist.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistItemsResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper> items) {
        return null;
    }
    
    /**
     * A response class that contains a list of tracks in a particular
     * playlist.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response class that contains a list of tracks in a particular
     * playlist.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response class that contains a list of tracks in a particular
     * playlist.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PlaylistItemsResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper> getItems() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/musify/data/remote/response/PlaylistItemsResponse$TrackResponseWithAlbumMetadataWrapper;", "", "track", "Lcom/example/musify/data/remote/response/TrackResponseWithAlbumMetadata;", "(Lcom/example/musify/data/remote/response/TrackResponseWithAlbumMetadata;)V", "getTrack", "()Lcom/example/musify/data/remote/response/TrackResponseWithAlbumMetadata;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TrackResponseWithAlbumMetadataWrapper {
        @org.jetbrains.annotations.NotNull()
        private final com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata track = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.PlaylistItemsResponse.TrackResponseWithAlbumMetadataWrapper copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "track")
        com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata track) {
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
        
        public TrackResponseWithAlbumMetadataWrapper(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "track")
        com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata track) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata getTrack() {
            return null;
        }
    }
}