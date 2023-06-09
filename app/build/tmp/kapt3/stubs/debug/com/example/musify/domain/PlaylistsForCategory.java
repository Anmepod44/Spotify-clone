package com.example.musify.domain;

import java.lang.System;

/**
 * A domain class that contains a list of [associatedPlaylists] fir a specific
 * playlist category. Eg. "Focus" could be a category that contains playlists
 * that contain ambient music.
 * @param categoryId the id of the category
 * @param nameOfCategory the name of the category. Examples - ["Top lists","Summer","Sleep"]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/musify/domain/PlaylistsForCategory;", "", "categoryId", "", "nameOfCategory", "associatedPlaylists", "", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAssociatedPlaylists", "()Ljava/util/List;", "getCategoryId", "()Ljava/lang/String;", "getNameOfCategory", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PlaylistsForCategory {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String categoryId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameOfCategory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> associatedPlaylists = null;
    
    /**
     * A domain class that contains a list of [associatedPlaylists] fir a specific
     * playlist category. Eg. "Focus" could be a category that contains playlists
     * that contain ambient music.
     * @param categoryId the id of the category
     * @param nameOfCategory the name of the category. Examples - ["Top lists","Summer","Sleep"]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PlaylistsForCategory copy(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOfCategory, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> associatedPlaylists) {
        return null;
    }
    
    /**
     * A domain class that contains a list of [associatedPlaylists] fir a specific
     * playlist category. Eg. "Focus" could be a category that contains playlists
     * that contain ambient music.
     * @param categoryId the id of the category
     * @param nameOfCategory the name of the category. Examples - ["Top lists","Summer","Sleep"]
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A domain class that contains a list of [associatedPlaylists] fir a specific
     * playlist category. Eg. "Focus" could be a category that contains playlists
     * that contain ambient music.
     * @param categoryId the id of the category
     * @param nameOfCategory the name of the category. Examples - ["Top lists","Summer","Sleep"]
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A domain class that contains a list of [associatedPlaylists] fir a specific
     * playlist category. Eg. "Focus" could be a category that contains playlists
     * that contain ambient music.
     * @param categoryId the id of the category
     * @param nameOfCategory the name of the category. Examples - ["Top lists","Summer","Sleep"]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PlaylistsForCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOfCategory, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> associatedPlaylists) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameOfCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.domain.SearchResult.PlaylistSearchResult> getAssociatedPlaylists() {
        return null;
    }
}