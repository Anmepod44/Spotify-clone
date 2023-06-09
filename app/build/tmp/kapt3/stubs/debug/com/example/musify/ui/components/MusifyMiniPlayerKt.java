package com.example.musify.ui.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a8\u0006\r"}, d2 = {"MusifyMiniPlayer", "", "currentlyPlayingTrack", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "isPlaybackPaused", "", "modifier", "Landroidx/compose/ui/Modifier;", "onLikedButtonClicked", "Lkotlin/Function1;", "onPlayButtonClicked", "Lkotlin/Function0;", "onPauseButtonClicked", "app_debug"})
public final class MusifyMiniPlayerKt {
    
    /**
     * A mini player composable that contains information of the [currentlyPlayingTrack].
     * It also contains 3 icons - Available Devices, Favorite and Play/Pause.
     *
     * Note: The size of this composable is **fixed to 60dp**.
     *
     * @param currentlyPlayingTrack the currently playing track.
     * @param isPlaybackPaused indicates whether the playback is paused.
     * Based on this, either [onPlayButtonClicked] or [onPauseButtonClicked]
     * will be invoked. Also, the play and pause icons will also be displayed
     * based on this parameter.
     * @param modifier the modifier to be applied to this composable.
     * @param onLikedButtonClicked the lambda to execute when the like
     * button is clicked. It is provided with a boolean that indicates
     * whether the the track is currently liked or not.
     * @param onPlayButtonClicked the lambda to execute when the play button
     * is clicked.
     * @param onPauseButtonClicked the lambda to execute when the pause button
     * is clicked.
     */
    @androidx.compose.runtime.Composable()
    public static final void MusifyMiniPlayer(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, boolean isPlaybackPaused, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onLikedButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPlayButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPauseButtonClicked) {
    }
}