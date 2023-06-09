package com.example.musify.ui.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u001a\u009e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0007\u001a\u001a\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0003\u001ax\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010!\u001a\u00020\u00132\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0018\b\u0002\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002\u00a8\u0006%"}, d2 = {"ArtistDetailScreen", "", "artistName", "", "artistImageUrlString", "popularTracks", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "releases", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "currentlyPlayingTrack", "onBackButtonClicked", "Lkotlin/Function0;", "onPlayButtonClicked", "onTrackClicked", "Lkotlin/Function1;", "onAlbumClicked", "isLoading", "", "fallbackImageRes", "", "isErrorMessageVisible", "SubtitleText", "modifier", "Landroidx/compose/ui/Modifier;", "text", "artistCoverArtHeaderItem", "Landroidx/compose/foundation/lazy/LazyListScope;", "artistCoverArtUrlString", "fallbackImagePainter", "Landroidx/compose/ui/graphics/painter/Painter;", "onPLayButtonClick", "isLoadingPlaceholderVisible", "onCoverArtLoading", "onCoverArtLoaded", "", "app_debug"})
public final class ArtistDetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void ArtistDetailScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    java.lang.String artistImageUrlString, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> popularTracks, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.AlbumSearchResult> releases, @org.jetbrains.annotations.Nullable()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPlayButtonClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onTrackClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.AlbumSearchResult, kotlin.Unit> onAlbumClicked, boolean isLoading, @androidx.annotation.DrawableRes()
    int fallbackImageRes, boolean isErrorMessageVisible) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SubtitleText(androidx.compose.ui.Modifier modifier, java.lang.String text) {
    }
    
    private static final void artistCoverArtHeaderItem(androidx.compose.foundation.lazy.LazyListScope $this$artistCoverArtHeaderItem, java.lang.String artistName, java.lang.String artistCoverArtUrlString, androidx.compose.ui.graphics.painter.Painter fallbackImagePainter, kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, kotlin.jvm.functions.Function0<kotlin.Unit> onPLayButtonClick, boolean isLoadingPlaceholderVisible, kotlin.jvm.functions.Function0<kotlin.Unit> onCoverArtLoading, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCoverArtLoaded) {
    }
}