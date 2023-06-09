package com.example.musify.ui.screens.homescreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ar\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"ExpandableMiniPlayerWithSnackbar", "", "track", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "onPauseButtonClicked", "Lkotlin/Function0;", "onPlayButtonClicked", "Lkotlin/Function1;", "isPlaybackPaused", "", "timeElapsedStringFlow", "Lkotlinx/coroutines/flow/Flow;", "", "playbackProgressFlow", "", "totalDurationOfCurrentTrackText", "modifier", "Landroidx/compose/ui/Modifier;", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "app_debug"})
public final class ExpandableMiniPlayerWithSnackbarKt {
    
    /**
     * A mini player that can expand to fill the entire screen when clicked.
     * This composable also contains a snack bar. The snack bar will be
     * displayed on top of the mini player if it is collapsed. If the
     * mine player is expanded, then the snack bar will be displayed
     * at the bottom of the screen.
     *
     * @param track the track to be displayed.
     * @param onPauseButtonClicked the lambda to execute when the pause button
     * is clicked.
     * @param onPlayButtonClicked the lambda to execute when the play button
     * is clicked.
     * @param isPlaybackPaused indicates whether the playback is paused. Based on
     * this, the play/pause button will be shown.
     * @param timeElapsedStringFlow a [Flow] that emits a stream of strings
     * that represent the time elapsed.
     * @param playbackProgressFlow a [Flow] that emits the current playback progress.
     * @param totalDurationOfCurrentTrackText represents the total duration of the
     * currently playing track as a string.
     * @param modifier the modifier to be applied to the composable.
     * @param snackbarHostState the [SnackbarHostState] that will be used for
     * handing the snackbar used in this composable.
     */
    @androidx.compose.runtime.Composable()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void ExpandableMiniPlayerWithSnackbar(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult.TrackSearchResult track, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPauseButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onPlayButtonClicked, boolean isPlaybackPaused, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.String> timeElapsedStringFlow, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.Float> playbackProgressFlow, @org.jetbrains.annotations.NotNull()
    java.lang.String totalDurationOfCurrentTrackText, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.SnackbarHostState snackbarHostState) {
    }
}