package com.example.musify.domain;

import java.lang.System;

/**
 * A domain class the represents a single card in a home feed
 * carousel with the specified [id],[imageUrlString] and [caption].
 * It also contains the [associatedSearchResult] object for this specific
 * carousel card.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/musify/domain/HomeFeedCarouselCardInfo;", "", "id", "", "imageUrlString", "caption", "associatedSearchResult", "Lcom/example/musify/domain/SearchResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/domain/SearchResult;)V", "getAssociatedSearchResult", "()Lcom/example/musify/domain/SearchResult;", "getCaption", "()Ljava/lang/String;", "getId", "getImageUrlString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class HomeFeedCarouselCardInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imageUrlString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String caption = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.domain.SearchResult associatedSearchResult = null;
    
    /**
     * A domain class the represents a single card in a home feed
     * carousel with the specified [id],[imageUrlString] and [caption].
     * It also contains the [associatedSearchResult] object for this specific
     * carousel card.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.HomeFeedCarouselCardInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrlString, @org.jetbrains.annotations.NotNull()
    java.lang.String caption, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult associatedSearchResult) {
        return null;
    }
    
    /**
     * A domain class the represents a single card in a home feed
     * carousel with the specified [id],[imageUrlString] and [caption].
     * It also contains the [associatedSearchResult] object for this specific
     * carousel card.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A domain class the represents a single card in a home feed
     * carousel with the specified [id],[imageUrlString] and [caption].
     * It also contains the [associatedSearchResult] object for this specific
     * carousel card.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A domain class the represents a single card in a home feed
     * carousel with the specified [id],[imageUrlString] and [caption].
     * It also contains the [associatedSearchResult] object for this specific
     * carousel card.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public HomeFeedCarouselCardInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrlString, @org.jetbrains.annotations.NotNull()
    java.lang.String caption, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult associatedSearchResult) {
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
    public final java.lang.String getImageUrlString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCaption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.SearchResult component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.SearchResult getAssociatedSearchResult() {
        return null;
    }
}