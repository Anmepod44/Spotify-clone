package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that contains information about a specific track
 * together with the metadata of the associated album.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\fH\u00c6\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/example/musify/data/remote/response/TrackResponseWithAlbumMetadata;", "", "id", "", "name", "previewUrl", "isPlayable", "", "explicit", "durationInMillis", "", "albumMetadata", "Lcom/example/musify/data/remote/response/AlbumMetadataResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/example/musify/data/remote/response/AlbumMetadataResponse;)V", "getAlbumMetadata", "()Lcom/example/musify/data/remote/response/AlbumMetadataResponse;", "getDurationInMillis", "()I", "getExplicit", "()Z", "getId", "()Ljava/lang/String;", "getName", "getPreviewUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class TrackResponseWithAlbumMetadata {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String previewUrl = null;
    private final boolean isPlayable = false;
    private final boolean explicit = false;
    private final int durationInMillis = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.AlbumMetadataResponse albumMetadata = null;
    
    /**
     * A response object that contains information about a specific track
     * together with the metadata of the associated album.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.TrackResponseWithAlbumMetadata copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "preview_url")
    java.lang.String previewUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "is_playable")
    boolean isPlayable, boolean explicit, @com.fasterxml.jackson.annotation.JsonProperty(value = "duration_ms")
    int durationInMillis, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album")
    com.example.musify.data.remote.response.AlbumMetadataResponse albumMetadata) {
        return null;
    }
    
    /**
     * A response object that contains information about a specific track
     * together with the metadata of the associated album.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains information about a specific track
     * together with the metadata of the associated album.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains information about a specific track
     * together with the metadata of the associated album.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TrackResponseWithAlbumMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "preview_url")
    java.lang.String previewUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "is_playable")
    boolean isPlayable, boolean explicit, @com.fasterxml.jackson.annotation.JsonProperty(value = "duration_ms")
    int durationInMillis, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "album")
    com.example.musify.data.remote.response.AlbumMetadataResponse albumMetadata) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumMetadataResponse component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumMetadataResponse getAlbumMetadata() {
        return null;
    }
}