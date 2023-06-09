package com.example.musify.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007\u001a(\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a8\u0010\u0010\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0003\u00a8\u0006\u0014"}, d2 = {"MusifyNavigation", "", "navController", "Landroidx/navigation/NavHostController;", "playTrack", "Lkotlin/Function1;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "isPlaybackLoading", "", "isFullScreenNowPlayingOverlayScreenVisible", "homeScreen", "Landroidx/navigation/NavGraphBuilder;", "route", "", "onCarouselCardClicked", "Lcom/example/musify/domain/HomeFeedCarouselCardInfo;", "searchScreen", "onSearchResultClicked", "Lcom/example/musify/domain/SearchResult;", "isFullScreenNowPlayingScreenOverlayVisible", "app_debug"})
public final class MusifyNavigationKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.ui.ExperimentalComposeUiApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void MusifyNavigation(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> playTrack, boolean isPlaybackLoading, boolean isFullScreenNowPlayingOverlayScreenVisible) {
    }
    
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void homeScreen(androidx.navigation.NavGraphBuilder $this$homeScreen, java.lang.String route, kotlin.jvm.functions.Function1<? super com.example.musify.domain.HomeFeedCarouselCardInfo, kotlin.Unit> onCarouselCardClicked) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    @androidx.compose.ui.ExperimentalComposeUiApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    private static final void searchScreen(androidx.navigation.NavGraphBuilder $this$searchScreen, java.lang.String route, boolean isPlaybackLoading, kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onSearchResultClicked, boolean isFullScreenNowPlayingScreenOverlayVisible) {
    }
}