package com.example.musify.domain;

import java.lang.System;

/**
 * A sealed class hierarchy that contains different filters that can be
 * applied to make the home screen display different items.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/musify/domain/HomeFeedFilters;", "", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Music", "None", "PodcastsAndShows", "Lcom/example/musify/domain/HomeFeedFilters$Music;", "Lcom/example/musify/domain/HomeFeedFilters$PodcastsAndShows;", "Lcom/example/musify/domain/HomeFeedFilters$None;", "app_debug"})
public abstract class HomeFeedFilters {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    
    private HomeFeedFilters(java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/domain/HomeFeedFilters$Music;", "Lcom/example/musify/domain/HomeFeedFilters;", "()V", "app_debug"})
    public static final class Music extends com.example.musify.domain.HomeFeedFilters {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.domain.HomeFeedFilters.Music INSTANCE = null;
        
        private Music() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/domain/HomeFeedFilters$PodcastsAndShows;", "Lcom/example/musify/domain/HomeFeedFilters;", "()V", "app_debug"})
    public static final class PodcastsAndShows extends com.example.musify.domain.HomeFeedFilters {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.domain.HomeFeedFilters.PodcastsAndShows INSTANCE = null;
        
        private PodcastsAndShows() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/domain/HomeFeedFilters$None;", "Lcom/example/musify/domain/HomeFeedFilters;", "()V", "app_debug"})
    public static final class None extends com.example.musify.domain.HomeFeedFilters {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.domain.HomeFeedFilters.None INSTANCE = null;
        
        private None() {
            super(null);
        }
    }
}