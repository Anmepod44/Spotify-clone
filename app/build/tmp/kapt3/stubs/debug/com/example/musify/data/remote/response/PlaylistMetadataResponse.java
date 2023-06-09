package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that contains only the metadata associated with a
 * particular playlist. [PlaylistResponse] contains additional
 * tracks and followers properties.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\"#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/example/musify/data/remote/response/PlaylistMetadataResponse;", "", "id", "", "name", "images", "", "Lcom/example/musify/data/remote/response/ImageResponse;", "ownerName", "Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$OwnerNameWrapper;", "totalNumberOfTracks", "Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$TotalNumberOfTracksWrapper;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$OwnerNameWrapper;Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$TotalNumberOfTracksWrapper;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "getOwnerName", "()Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$OwnerNameWrapper;", "getTotalNumberOfTracks", "()Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$TotalNumberOfTracksWrapper;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "OwnerNameWrapper", "TotalNumberOfTracksWrapper", "app_debug"})
public final class PlaylistMetadataResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.ImageResponse> images = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper ownerName = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper totalNumberOfTracks = null;
    
    /**
     * A response object that contains only the metadata associated with a
     * particular playlist. [PlaylistResponse] contains additional
     * tracks and followers properties.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistMetadataResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "owner")
    com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper ownerName, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "tracks")
    com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper totalNumberOfTracks) {
        return null;
    }
    
    /**
     * A response object that contains only the metadata associated with a
     * particular playlist. [PlaylistResponse] contains additional
     * tracks and followers properties.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains only the metadata associated with a
     * particular playlist. [PlaylistResponse] contains additional
     * tracks and followers properties.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains only the metadata associated with a
     * particular playlist. [PlaylistResponse] contains additional
     * tracks and followers properties.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PlaylistMetadataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "owner")
    com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper ownerName, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "tracks")
    com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper totalNumberOfTracks) {
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
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper getOwnerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper getTotalNumberOfTracks() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$TotalNumberOfTracksWrapper;", "", "value", "", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class TotalNumberOfTracksWrapper {
        private final int value = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.PlaylistMetadataResponse.TotalNumberOfTracksWrapper copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "total")
        int value) {
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
        
        public TotalNumberOfTracksWrapper(@com.fasterxml.jackson.annotation.JsonProperty(value = "total")
        int value) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getValue() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/musify/data/remote/response/PlaylistMetadataResponse$OwnerNameWrapper;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class OwnerNameWrapper {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.PlaylistMetadataResponse.OwnerNameWrapper copy(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "display_name")
        java.lang.String value) {
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
        
        public OwnerNameWrapper(@org.jetbrains.annotations.NotNull()
        @com.fasterxml.jackson.annotation.JsonProperty(value = "display_name")
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
}