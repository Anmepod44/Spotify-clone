package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that contains metadata about a specific album.
 * Note: The object only contains metadata. It doesn't contain
 * the track list. [AlbumResponse] contains the track list in addition
 * to the metadata.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001,Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000eH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u000eH\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012\u00a8\u0006-"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumMetadataResponse;", "", "id", "", "name", "albumType", "artists", "", "Lcom/example/musify/data/remote/response/AlbumMetadataResponse$ArtistInfoResponse;", "images", "Lcom/example/musify/data/remote/response/ImageResponse;", "releaseDate", "releaseDatePrecision", "totalTracks", "", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAlbumType", "()Ljava/lang/String;", "getArtists", "()Ljava/util/List;", "getId", "getImages", "getName", "getReleaseDate", "getReleaseDatePrecision", "getTotalTracks", "()I", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "ArtistInfoResponse", "app_debug"})
public final class AlbumMetadataResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String albumType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse> artists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.ImageResponse> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseDatePrecision = null;
    private final int totalTracks = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    
    /**
     * A response object that contains metadata about a specific album.
     * Note: The object only contains metadata. It doesn't contain
     * the track list. [AlbumResponse] contains the track list in addition
     * to the metadata.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumMetadataResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album_type")
    java.lang.String albumType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date_precision")
    java.lang.String releaseDatePrecision, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_tracks")
    int totalTracks, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    /**
     * A response object that contains metadata about a specific album.
     * Note: The object only contains metadata. It doesn't contain
     * the track list. [AlbumResponse] contains the track list in addition
     * to the metadata.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains metadata about a specific album.
     * Note: The object only contains metadata. It doesn't contain
     * the track list. [AlbumResponse] contains the track list in addition
     * to the metadata.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains metadata about a specific album.
     * Note: The object only contains metadata. It doesn't contain
     * the track list. [AlbumResponse] contains the track list in addition
     * to the metadata.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AlbumMetadataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album_type")
    java.lang.String albumType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date_precision")
    java.lang.String releaseDatePrecision, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_tracks")
    int totalTracks, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlbumType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse> getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDatePrecision() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getTotalTracks() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    /**
     * A response object associated with [AlbumMetadataResponse] that contains information
     * about an artist.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumMetadataResponse$ArtistInfoResponse;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ArtistInfoResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        /**
         * A response object associated with [AlbumMetadataResponse] that contains information
         * about an artist.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.AlbumMetadataResponse.ArtistInfoResponse copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        /**
         * A response object associated with [AlbumMetadataResponse] that contains information
         * about an artist.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response object associated with [AlbumMetadataResponse] that contains information
         * about an artist.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response object associated with [AlbumMetadataResponse] that contains information
         * about an artist.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ArtistInfoResponse(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
    }
}