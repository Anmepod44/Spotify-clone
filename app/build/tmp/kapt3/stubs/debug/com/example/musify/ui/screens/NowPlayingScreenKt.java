package com.example.musify.ui.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a.\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a\u00b2\u0001\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001an\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001aX\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010$H\u0003\u00a8\u0006%"}, d2 = {"Footer", "", "modifier", "Landroidx/compose/ui/Modifier;", "onShareButtonClicked", "Lkotlin/Function0;", "onAvailableDevicesButtonClicked", "Header", "onCloseButtonClicked", "onTrailingButtonClick", "NowPlayingScreen", "currentlyPlayingTrack", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "playbackProgressFlow", "Lkotlinx/coroutines/flow/Flow;", "", "timeElapsedStringFlow", "", "playbackDurationRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "isPlaybackPaused", "", "totalDurationOfCurrentTrackProvider", "onShuffleButtonClicked", "onSkipPreviousButtonClicked", "onPlayButtonClicked", "onPauseButtonClicked", "onSkipNextButtonClicked", "onRepeatButtonClicked", "PlaybackControls", "isPlayIconVisible", "ProgressSliderWithTimeText", "currentTimeElapsedStringFlow", "currentPlaybackProgressFlow", "totalDurationOfTrack", "onSliderValueChange", "Lkotlin/Function1;", "app_debug"})
public final class NowPlayingScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void NowPlayingScreen(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.Float> playbackProgressFlow, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.String> timeElapsedStringFlow, @org.jetbrains.annotations.NotNull()
    kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> playbackDurationRange, boolean isPlaybackPaused, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> totalDurationOfCurrentTrackProvider, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShuffleButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSkipPreviousButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPlayButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPauseButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSkipNextButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRepeatButtonClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void Header(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onTrailingButtonClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void Footer(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onShareButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onAvailableDevicesButtonClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void PlaybackControls(androidx.compose.ui.Modifier modifier, boolean isPlayIconVisible, kotlin.jvm.functions.Function0<kotlin.Unit> onSkipPreviousButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onShuffleButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onPlayButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onPauseButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onSkipNextButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onRepeatButtonClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ProgressSliderWithTimeText(androidx.compose.ui.Modifier modifier, kotlinx.coroutines.flow.Flow<java.lang.String> currentTimeElapsedStringFlow, kotlinx.coroutines.flow.Flow<java.lang.Float> currentPlaybackProgressFlow, java.lang.String totalDurationOfTrack, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> playbackDurationRange, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> onSliderValueChange) {
    }
}