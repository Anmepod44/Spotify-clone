package com.example.musify.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003./0B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020&J,\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u001c\b\u0002\u0010*\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&\u0018\u00010+J\u0006\u0010-\u001a\u00020&R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001f\u00a8\u00061"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "musicPlayer", "Lcom/example/musify/musicplayer/MusicPlayerV2;", "downloadDrawableFromUrlUseCase", "Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/DownloadDrawableFromUrlUseCase;", "(Landroid/app/Application;Lcom/example/musify/musicplayer/MusicPlayerV2;Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/DownloadDrawableFromUrlUseCase;)V", "_eventChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/musify/viewmodels/PlaybackViewModel$Event;", "_playbackState", "Landroidx/compose/runtime/MutableState;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "_totalDurationOfCurrentTrackTimeText", "", "flowOfProgressOfCurrentTrack", "Lkotlinx/coroutines/flow/Flow;", "", "getFlowOfProgressOfCurrentTrack", "()Landroidx/compose/runtime/MutableState;", "flowOfProgressTextOfCurrentTrack", "getFlowOfProgressTextOfCurrentTrack", "playbackErrorMessage", "playbackEventsFlow", "getPlaybackEventsFlow", "()Lkotlinx/coroutines/flow/Flow;", "playbackState", "Landroidx/compose/runtime/State;", "getPlaybackState", "()Landroidx/compose/runtime/State;", "totalDurationOfCurrentTrackTimeText", "getTotalDurationOfCurrentTrackTimeText", "convertTimestampMillisToString", "millis", "", "pauseCurrentlyPlayingTrack", "", "playTrack", "track", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "onSuccess", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "resumePlaybackIfPaused", "Companion", "Event", "PlaybackState", "app_debug"})
public final class PlaybackViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.musify.musicplayer.MusicPlayerV2 musicPlayer = null;
    private final com.example.musify.usecases.downloadDrawableFromUrlUseCase.DownloadDrawableFromUrlUseCase downloadDrawableFromUrlUseCase = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _totalDurationOfCurrentTrackTimeText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> totalDurationOfCurrentTrackTimeText = null;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.PlaybackViewModel.PlaybackState> _playbackState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.PlaybackViewModel.PlaybackState> playbackState = null;
    private final kotlinx.coroutines.channels.Channel<com.example.musify.viewmodels.PlaybackViewModel.Event> _eventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.viewmodels.PlaybackViewModel.Event> playbackEventsFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<kotlinx.coroutines.flow.Flow<java.lang.Float>> flowOfProgressOfCurrentTrack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<kotlinx.coroutines.flow.Flow<java.lang.String>> flowOfProgressTextOfCurrentTrack = null;
    private final java.lang.String playbackErrorMessage = "An error occurred. Please check internet connection.";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.viewmodels.PlaybackViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> PLAYBACK_PROGRESS_RANGE = null;
    
    @javax.inject.Inject()
    public PlaybackViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.musify.musicplayer.MusicPlayerV2 musicPlayer, @org.jetbrains.annotations.NotNull()
    com.example.musify.usecases.downloadDrawableFromUrlUseCase.DownloadDrawableFromUrlUseCase downloadDrawableFromUrlUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getTotalDurationOfCurrentTrackTimeText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.PlaybackViewModel.PlaybackState> getPlaybackState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.musify.viewmodels.PlaybackViewModel.Event> getPlaybackEventsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<kotlinx.coroutines.flow.Flow<java.lang.Float>> getFlowOfProgressOfCurrentTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<kotlinx.coroutines.flow.Flow<java.lang.String>> getFlowOfProgressTextOfCurrentTrack() {
        return null;
    }
    
    public final void playTrack(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult.TrackSearchResult track, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super com.example.musify.domain.SearchResult.TrackSearchResult, ? super android.graphics.Bitmap, kotlin.Unit> onSuccess) {
    }
    
    public final void pauseCurrentlyPlayingTrack() {
    }
    
    public final void resumePlaybackIfPaused() {
    }
    
    private final java.lang.String convertTimestampMillisToString(long millis) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "", "currentlyPlayingTrack", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "previouslyPlayingTrack", "(Lcom/example/musify/domain/SearchResult$TrackSearchResult;Lcom/example/musify/domain/SearchResult$TrackSearchResult;)V", "getCurrentlyPlayingTrack", "()Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "getPreviouslyPlayingTrack", "Error", "Idle", "Loading", "Paused", "PlaybackEnded", "Playing", "Stopped", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Idle;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Stopped;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Error;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Paused;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Playing;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$PlaybackEnded;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Loading;", "app_debug"})
    public static abstract class PlaybackState {
        @org.jetbrains.annotations.Nullable()
        private final com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.musify.domain.SearchResult.TrackSearchResult previouslyPlayingTrack = null;
        
        private PlaybackState(com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, com.example.musify.domain.SearchResult.TrackSearchResult previouslyPlayingTrack) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.musify.domain.SearchResult.TrackSearchResult getCurrentlyPlayingTrack() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.musify.domain.SearchResult.TrackSearchResult getPreviouslyPlayingTrack() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Idle;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "()V", "app_debug"})
        public static final class Idle extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Idle INSTANCE = null;
            
            private Idle() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Stopped;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "()V", "app_debug"})
        public static final class Stopped extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Stopped INSTANCE = null;
            
            private Stopped() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Error;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String errorMessage = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage) {
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
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getErrorMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Paused;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "track", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "(Lcom/example/musify/domain/SearchResult$TrackSearchResult;)V", "getTrack", "()Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Paused extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.domain.SearchResult.TrackSearchResult track = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Paused copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
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
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult getTrack() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Playing;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "track", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "(Lcom/example/musify/domain/SearchResult$TrackSearchResult;)V", "getTrack", "()Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Playing extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.domain.SearchResult.TrackSearchResult track = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Playing copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
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
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult getTrack() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$PlaybackEnded;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "track", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "(Lcom/example/musify/domain/SearchResult$TrackSearchResult;)V", "getTrack", "()Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class PlaybackEnded extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.musify.domain.SearchResult.TrackSearchResult track = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.PlaybackEnded copy(@org.jetbrains.annotations.NotNull()
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
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
            
            public PlaybackEnded(@org.jetbrains.annotations.NotNull()
            com.example.musify.domain.SearchResult.TrackSearchResult track) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.domain.SearchResult.TrackSearchResult getTrack() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState$Loading;", "Lcom/example/musify/viewmodels/PlaybackViewModel$PlaybackState;", "previousTrack", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "(Lcom/example/musify/domain/SearchResult$TrackSearchResult;)V", "getPreviousTrack", "()Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Loading extends com.example.musify.viewmodels.PlaybackViewModel.PlaybackState {
            @org.jetbrains.annotations.Nullable()
            private final com.example.musify.domain.SearchResult.TrackSearchResult previousTrack = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.musify.viewmodels.PlaybackViewModel.PlaybackState.Loading copy(@org.jetbrains.annotations.Nullable()
            com.example.musify.domain.SearchResult.TrackSearchResult previousTrack) {
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
            
            public Loading(@org.jetbrains.annotations.Nullable()
            com.example.musify.domain.SearchResult.TrackSearchResult previousTrack) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.musify.domain.SearchResult.TrackSearchResult component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.musify.domain.SearchResult.TrackSearchResult getPreviousTrack() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$Event;", "", "()V", "PlaybackError", "Lcom/example/musify/viewmodels/PlaybackViewModel$Event$PlaybackError;", "app_debug"})
    public static abstract class Event {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$Event$PlaybackError;", "Lcom/example/musify/viewmodels/PlaybackViewModel$Event;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class PlaybackError extends com.example.musify.viewmodels.PlaybackViewModel.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String errorMessage = null;
            
            public PlaybackError(@org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getErrorMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/musify/viewmodels/PlaybackViewModel$Companion;", "", "()V", "PLAYBACK_PROGRESS_RANGE", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "getPLAYBACK_PROGRESS_RANGE", "()Lkotlin/ranges/ClosedFloatingPointRange;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getPLAYBACK_PROGRESS_RANGE() {
            return null;
        }
    }
}