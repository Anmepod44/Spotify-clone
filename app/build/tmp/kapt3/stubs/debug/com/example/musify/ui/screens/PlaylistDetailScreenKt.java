package com.example.musify.ui.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a8\u0006\u0014"}, d2 = {"PlaylistDetailScreen", "", "playlistName", "", "playlistImageUrlString", "nameOfPlaylistOwner", "totalNumberOfTracks", "imageResToUseWhenImageUrlStringIsNull", "", "tracks", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "currentlyPlayingTrack", "onBackButtonClicked", "Lkotlin/Function0;", "onTrackClicked", "Lkotlin/Function1;", "isLoading", "", "isErrorMessageVisible", "app_debug"})
public final class PlaylistDetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void PlaylistDetailScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.Nullable()
    java.lang.String playlistImageUrlString, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOfPlaylistOwner, @org.jetbrains.annotations.NotNull()
    java.lang.String totalNumberOfTracks, @androidx.annotation.DrawableRes()
    int imageResToUseWhenImageUrlStringIsNull, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.TrackSearchResult> tracks, @org.jetbrains.annotations.Nullable()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onTrackClicked, boolean isLoading, boolean isErrorMessageVisible) {
    }
}