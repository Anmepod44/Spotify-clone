package com.example.musify.ui.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001ar\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u0013"}, d2 = {"AlbumArtHeaderMetadata", "", "yearOfRelease", "", "AlbumDetailScreen", "albumName", "artistsString", "albumArtUrlString", "trackList", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "onTrackItemClick", "Lkotlin/Function1;", "onBackButtonClicked", "Lkotlin/Function0;", "isLoading", "", "isErrorMessageVisible", "currentlyPlayingTrack", "app_debug"})
public final class AlbumDetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void AlbumDetailScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String albumName, @org.jetbrains.annotations.NotNull()
    java.lang.String artistsString, @org.jetbrains.annotations.NotNull()
    java.lang.String yearOfRelease, @org.jetbrains.annotations.NotNull()
    java.lang.String albumArtUrlString, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> trackList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onTrackItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, boolean isLoading, boolean isErrorMessageVisible, @org.jetbrains.annotations.Nullable()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void AlbumArtHeaderMetadata(java.lang.String yearOfRelease) {
    }
}