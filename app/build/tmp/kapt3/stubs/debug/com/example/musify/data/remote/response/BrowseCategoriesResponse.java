package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response object that contains a list of different [categories] that
 * are available to a specific region and local. These categories can
 * then be used to fetch playlists that belong to the same category.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/remote/response/BrowseCategoriesResponse;", "", "categories", "Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryItemsResponse;", "(Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryItemsResponse;)V", "getCategories", "()Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryItemsResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BrowseCategoryItemsResponse", "BrowseCategoryResponse", "app_debug"})
public final class BrowseCategoriesResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse categories = null;
    
    /**
     * A response object that contains a list of different [categories] that
     * are available to a specific region and local. These categories can
     * then be used to fetch playlists that belong to the same category.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.BrowseCategoriesResponse copy(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse categories) {
        return null;
    }
    
    /**
     * A response object that contains a list of different [categories] that
     * are available to a specific region and local. These categories can
     * then be used to fetch playlists that belong to the same category.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains a list of different [categories] that
     * are available to a specific region and local. These categories can
     * then be used to fetch playlists that belong to the same category.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains a list of different [categories] that
     * are available to a specific region and local. These categories can
     * then be used to fetch playlists that belong to the same category.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BrowseCategoriesResponse(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse categories) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse getCategories() {
        return null;
    }
    
    /**
     * A response object that contains a list of [BrowseCategoriesResponse].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryItemsResponse;", "", "items", "", "Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryResponse;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class BrowseCategoryItemsResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse> items = null;
        
        /**
         * A response object that contains a list of [BrowseCategoriesResponse].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryItemsResponse copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse> items) {
            return null;
        }
        
        /**
         * A response object that contains a list of [BrowseCategoriesResponse].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response object that contains a list of [BrowseCategoriesResponse].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response object that contains a list of [BrowseCategoriesResponse].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public BrowseCategoryItemsResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse> items) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse> getItems() {
            return null;
        }
    }
    
    /**
     * A response object that contains the [id] and [name] associated with
     * a specific browse category.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/remote/response/BrowseCategoriesResponse$BrowseCategoryResponse;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class BrowseCategoryResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        /**
         * A response object that contains the [id] and [name] associated with
         * a specific browse category.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.remote.response.BrowseCategoriesResponse.BrowseCategoryResponse copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        /**
         * A response object that contains the [id] and [name] associated with
         * a specific browse category.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A response object that contains the [id] and [name] associated with
         * a specific browse category.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A response object that contains the [id] and [name] associated with
         * a specific browse category.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public BrowseCategoryResponse(@org.jetbrains.annotations.NotNull()
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