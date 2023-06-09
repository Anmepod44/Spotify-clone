package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that represents an album. It also contains additional
 * meta data about the album and includes information about the
 * artists.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003./0Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0010H\u00c6\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u000eH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00061"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumResponse;", "", "id", "", "name", "albumType", "artists", "", "Lcom/example/musify/data/remote/response/AlbumResponse$ArtistResponseWithNullableImagesAndFollowers;", "images", "Lcom/example/musify/data/remote/response/ImageResponse;", "releaseDate", "releaseDatePrecision", "totalTracks", "", "tracks", "Lcom/example/musify/data/remote/response/AlbumResponse$TracksWithoutAlbumMetadataListResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILcom/example/musify/data/remote/response/AlbumResponse$TracksWithoutAlbumMetadataListResponse;)V", "getAlbumType", "()Ljava/lang/String;", "getArtists", "()Ljava/util/List;", "getId", "getImages", "getName", "getReleaseDate", "getReleaseDatePrecision", "getTotalTracks", "()I", "getTracks", "()Lcom/example/musify/data/remote/response/AlbumResponse$TracksWithoutAlbumMetadataListResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "ArtistResponseWithNullableImagesAndFollowers", "TrackResponseWithoutAlbumMetadataResponse", "TracksWithoutAlbumMetadataListResponse", "app_debug"})
public final class AlbumResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String albumType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers> artists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.ImageResponse> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseDatePrecision = null;
    private final int totalTracks = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse tracks = null;
    
    /**
     * A response object that represents an album. It also contains additional
     * meta data about the album and includes information about the
     * artists.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album_type")
    java.lang.String albumType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date_precision")
    java.lang.String releaseDatePrecision, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_tracks")
    int totalTracks, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse tracks) {
        return null;
    }
    
    /**
     * A response object that represents an album. It also contains additional
     * meta data about the album and includes information about the
     * artists.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that represents an album. It also contains additional
     * meta data about the album and includes information about the
     * artists.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that represents an album. It also contains additional
     * meta data about the album and includes information about the
     * artists.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AlbumResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album_type")
    java.lang.String albumType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers> artists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "release_date_precision")
    java.lang.String releaseDatePrecision, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_tracks")
    int totalTracks, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse tracks) {
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
    public final java.util.List<com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers> getArtists() {
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
    public final com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse getTracks() {
        return null;
    }
    
    /**
     * A data class that contains the list of tracks associated with
     * a particular [AlbumResponse].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumResponse$TracksWithoutAlbumMetadataListResponse;", "", "value", "", "Lcom/example/musify/data/remote/response/AlbumResponse$TrackResponseWithoutAlbumMetadataResponse;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TracksWithoutAlbumMetadataListResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse> value = null;
        
        /**
         * A data class that contains the list of tracks associated with
         * a particular [AlbumResponse].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.AlbumResponse.TracksWithoutAlbumMetadataListResponse copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse> value) {
            return null;
        }
        
        /**
         * A data class that contains the list of tracks associated with
         * a particular [AlbumResponse].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A data class that contains the list of tracks associated with
         * a particular [AlbumResponse].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A data class that contains the list of tracks associated with
         * a particular [AlbumResponse].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TracksWithoutAlbumMetadataListResponse(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "items")
        java.util.List<com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse> getValue() {
            return null;
        }
    }
    
    /**
     * A response object that contains information about a specific track
     * without containing metadata about the album.
     * [TrackResponseWithAlbumMetadata] contains both, information about
     * the track and the metadata about the associated album.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumResponse$TrackResponseWithoutAlbumMetadataResponse;", "", "id", "", "name", "previewUrl", "isPlayable", "", "explicit", "durationInMillis", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", "getDurationInMillis", "()I", "getExplicit", "()Z", "getId", "()Ljava/lang/String;", "getName", "getPreviewUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class TrackResponseWithoutAlbumMetadataResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String previewUrl = null;
        private final boolean isPlayable = false;
        private final boolean explicit = false;
        private final int durationInMillis = 0;
        
        /**
         * A response object that contains information about a specific track
         * without containing metadata about the album.
         * [TrackResponseWithAlbumMetadata] contains both, information about
         * the track and the metadata about the associated album.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "preview_url")
        java.lang.String previewUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "is_playable")
        boolean isPlayable, boolean explicit, @com.fasterxml.jackson.annotation.JsonProperty(value = "duration_ms")
        int durationInMillis) {
            return null;
        }
        
        /**
         * A response object that contains information about a specific track
         * without containing metadata about the album.
         * [TrackResponseWithAlbumMetadata] contains both, information about
         * the track and the metadata about the associated album.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response object that contains information about a specific track
         * without containing metadata about the album.
         * [TrackResponseWithAlbumMetadata] contains both, information about
         * the track and the metadata about the associated album.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response object that contains information about a specific track
         * without containing metadata about the album.
         * [TrackResponseWithAlbumMetadata] contains both, information about
         * the track and the metadata about the associated album.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TrackResponseWithoutAlbumMetadataResponse(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "preview_url")
        java.lang.String previewUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "is_playable")
        boolean isPlayable, boolean explicit, @com.fasterxml.jackson.annotation.JsonProperty(value = "duration_ms")
        int durationInMillis) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPreviewUrl() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isPlayable() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean getExplicit() {
            return false;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getDurationInMillis() {
            return 0;
        }
    }
    
    /**
     * A response object that contains information about an Artist.
     * [ArtistResponse] mandates these two parameters whereas this object
     * makes [images] and [followers] as nullable type.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/example/musify/data/remote/response/AlbumResponse$ArtistResponseWithNullableImagesAndFollowers;", "", "id", "", "name", "images", "", "Lcom/example/musify/data/remote/response/ImageResponse;", "followers", "Lcom/example/musify/data/remote/response/ArtistResponse$Followers;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/musify/data/remote/response/ArtistResponse$Followers;)V", "getFollowers", "()Lcom/example/musify/data/remote/response/ArtistResponse$Followers;", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ArtistResponseWithNullableImagesAndFollowers {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.example.musify.data.remote.response.ImageResponse> images = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.musify.data.remote.response.ArtistResponse.Followers followers = null;
        
        /**
         * A response object that contains information about an Artist.
         * [ArtistResponse] mandates these two parameters whereas this object
         * makes [images] and [followers] as nullable type.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.AlbumResponse.ArtistResponseWithNullableImagesAndFollowers copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.Nullable()
        com.example.musify.data.remote.response.ArtistResponse.Followers followers) {
            return null;
        }
        
        /**
         * A response object that contains information about an Artist.
         * [ArtistResponse] mandates these two parameters whereas this object
         * makes [images] and [followers] as nullable type.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response object that contains information about an Artist.
         * [ArtistResponse] mandates these two parameters whereas this object
         * makes [images] and [followers] as nullable type.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response object that contains information about an Artist.
         * [ArtistResponse] mandates these two parameters whereas this object
         * makes [images] and [followers] as nullable type.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ArtistResponseWithNullableImagesAndFollowers(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.Nullable()
        com.example.musify.data.remote.response.ArtistResponse.Followers followers) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.example.musify.data.remote.response.ImageResponse> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.example.musify.data.remote.response.ImageResponse> getImages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.musify.data.remote.response.ArtistResponse.Followers component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.musify.data.remote.response.ArtistResponse.Followers getFollowers() {
            return null;
        }
    }
}