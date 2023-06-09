package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that contains information about an Artist.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/example/musify/data/remote/response/ArtistResponse;", "", "id", "", "name", "images", "", "Lcom/example/musify/data/remote/response/ImageResponse;", "followers", "Lcom/example/musify/data/remote/response/ArtistResponse$Followers;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/musify/data/remote/response/ArtistResponse$Followers;)V", "getFollowers", "()Lcom/example/musify/data/remote/response/ArtistResponse$Followers;", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Followers", "app_debug"})
public final class ArtistResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.ImageResponse> images = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.ArtistResponse.Followers followers = null;
    
    /**
     * A response object that contains information about an Artist.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.ArtistResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.ArtistResponse.Followers followers) {
        return null;
    }
    
    /**
     * A response object that contains information about an Artist.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains information about an Artist.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains information about an Artist.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ArtistResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.ImageResponse> images, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.ImageResponse> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.ArtistResponse.Followers component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.ArtistResponse.Followers getFollowers() {
        return null;
    }
    
    /**
     * A response class that holds the number of followers that follow
     * an Artist.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/musify/data/remote/response/ArtistResponse$Followers;", "", "total", "", "(Ljava/lang/String;)V", "getTotal", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Followers {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String total = null;
        
        /**
         * A response class that holds the number of followers that follow
         * an Artist.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.ArtistResponse.Followers copy(@org.jetbrains.annotations.NotNull()
        java.lang.String total) {
            return null;
        }
        
        /**
         * A response class that holds the number of followers that follow
         * an Artist.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response class that holds the number of followers that follow
         * an Artist.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response class that holds the number of followers that follow
         * an Artist.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Followers(@org.jetbrains.annotations.NotNull()
        java.lang.String total) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotal() {
            return null;
        }
    }
}