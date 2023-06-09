package com.example.musify.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2;", "", "currentPlaybackStateStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "getCurrentPlaybackStateStream", "()Lkotlinx/coroutines/flow/Flow;", "pauseCurrentlyPlayingTrack", "", "playTrack", "track", "Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "stopPlayingTrack", "tryResume", "", "PlaybackState", "Track", "app_debug"})
public abstract interface MusicPlayerV2 {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.musify.musicplayer.MusicPlayerV2.PlaybackState> getCurrentPlaybackStateStream();
    
    public abstract void playTrack(@org.jetbrains.annotations.NotNull()
    com.example.musify.musicplayer.MusicPlayerV2.Track track);
    
    public abstract void pauseCurrentlyPlayingTrack();
    
    public abstract void stopPlayingTrack();
    
    public abstract boolean tryResume();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "", "()V", "Ended", "Error", "Idle", "Paused", "Playing", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Playing;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Paused;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Ended;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Error;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Idle;", "app_debug"})
    public static abstract class PlaybackState {
        
        private PlaybackState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Playing;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "currentlyPlayingTrack", "Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "totalDuration", "", "currentPlaybackPositionInMillisFlow", "Lkotlinx/coroutines/flow/Flow;", "(Lcom/example/musify/musicplayer/MusicPlayerV2$Track;JLkotlinx/coroutines/flow/Flow;)V", "getCurrentPlaybackPositionInMillisFlow", "()Lkotlinx/coroutines/flow/Flow;", "getCurrentlyPlayingTrack", "()Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "getTotalDuration", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Playing extends com.example.musify.musicplayer.MusicPlayerV2.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack = null;
            private final long totalDuration = 0L;
            @org.jetbrains.annotations.NotNull()
            private final kotlinx.coroutines.flow.Flow<java.lang.Long> currentPlaybackPositionInMillisFlow = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Playing copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack, long totalDuration, @org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.flow.Flow<java.lang.Long> currentPlaybackPositionInMillisFlow) {
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
            
            public Playing(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack, long totalDuration, @org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.flow.Flow<java.lang.Long> currentPlaybackPositionInMillisFlow) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track getCurrentlyPlayingTrack() {
                return null;
            }
            
            public final long component2() {
                return 0L;
            }
            
            public final long getTotalDuration() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.coroutines.flow.Flow<java.lang.Long> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.coroutines.flow.Flow<java.lang.Long> getCurrentPlaybackPositionInMillisFlow() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Paused;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "currentlyPlayingTrack", "Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "(Lcom/example/musify/musicplayer/MusicPlayerV2$Track;)V", "getCurrentlyPlayingTrack", "()Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Paused extends com.example.musify.musicplayer.MusicPlayerV2.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Paused copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack) {
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
            
            public Paused(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track getCurrentlyPlayingTrack() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Ended;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "track", "Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "(Lcom/example/musify/musicplayer/MusicPlayerV2$Track;)V", "getTrack", "()Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Ended extends com.example.musify.musicplayer.MusicPlayerV2.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.musicplayer.MusicPlayerV2.Track track = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Ended copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track track) {
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
            
            public Ended(@org.jetbrains.annotations.NotNull()
            com.example.musify.musicplayer.MusicPlayerV2.Track track) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.musicplayer.MusicPlayerV2.Track getTrack() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Error;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "()V", "app_debug"})
        public static final class Error extends com.example.musify.musicplayer.MusicPlayerV2.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Idle;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "()V", "app_debug"})
        public static final class Idle extends com.example.musify.musicplayer.MusicPlayerV2.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "", "id", "", "title", "artistsString", "albumArt", "Landroid/graphics/Bitmap;", "albumArtUrlString", "trackUrlString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "getAlbumArt", "()Landroid/graphics/Bitmap;", "getAlbumArtUrlString", "()Ljava/lang/String;", "getArtistsString", "getId", "getTitle", "getTrackUrlString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Track {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String artistsString = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Bitmap albumArt = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String albumArtUrlString = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String trackUrlString = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.musicplayer.MusicPlayerV2.Track copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String artistsString, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap albumArt, @org.jetbrains.annotations.NotNull()
        java.lang.String albumArtUrlString, @org.jetbrains.annotations.NotNull()
        java.lang.String trackUrlString) {
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
        
        public Track(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String artistsString, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap albumArt, @org.jetbrains.annotations.NotNull()
        java.lang.String albumArtUrlString, @org.jetbrains.annotations.NotNull()
        java.lang.String trackUrlString) {
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
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getArtistsString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Bitmap component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Bitmap getAlbumArt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAlbumArtUrlString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTrackUrlString() {
            return null;
        }
    }
}