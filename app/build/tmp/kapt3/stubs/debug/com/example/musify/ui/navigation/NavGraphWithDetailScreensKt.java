package com.example.musify.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0003\u001ab\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003\u001an\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042,\u0010\u0018\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\u0019\u00a2\u0006\u0002\b\u001eH\u0007\u001aN\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003\u001a\u0014\u0010!\u001a\u00020\u0004*\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002\u00a8\u0006$"}, d2 = {"albumDetailScreen", "", "Landroidx/navigation/NavGraphBuilder;", "route", "", "onBackButtonClicked", "Lkotlin/Function0;", "onPlayTrack", "Lkotlin/Function1;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "isPlaybackLoading", "", "artistDetailScreen", "onAlbumClicked", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "navGraphWithDetailScreens", "navGraphRoute", "navController", "Landroidx/navigation/NavHostController;", "playTrack", "startDestination", "builder", "Lkotlin/Function2;", "Lcom/example/musify/ui/navigation/NavGraphWithDetailScreensNestedController;", "Lkotlin/ParameterName;", "name", "nestedController", "Lkotlin/ExtensionFunctionType;", "playlistDetailScreen", "navigationArguments", "prefixedWithRouteOfNavGraphRoute", "Lcom/example/musify/ui/navigation/MusifyNavigationDestinations;", "routeOfNavGraph", "app_debug"})
public final class NavGraphWithDetailScreensKt {
    
    /**
     * A nested navigation graph that consists of detail screens.
     *
     * It uses [prefixedWithRouteOfNavGraphRoute] for the nested destinations.
     * For information on why [prefixedWithRouteOfNavGraphRoute] see
     * docs of [NavGraphWithDetailScreensNestedController] class.
     *
     * @param navGraphRoute the destination's unique route
     * @param navController the nav controller to be associated with the nav graph.
     * @param startDestination the route for the start destination.
     * @param playTrack lambda to execute when a track is to be played.
     * @param isPlaybackLoading indicates whether the playback is loading.
     * @param builder the builder used to define other composables that belong
     * to this nested graph.
     * @see NavGraphBuilder.artistDetailScreen
     * @see NavGraphBuilder.albumDetailScreen
     * @see NavGraphBuilder.playlistDetailScreen
     */
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void navGraphWithDetailScreens(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$navGraphWithDetailScreens, @org.jetbrains.annotations.NotNull()
    java.lang.String navGraphRoute, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> playTrack, boolean isPlaybackLoading, @org.jetbrains.annotations.NotNull()
    java.lang.String startDestination, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super androidx.navigation.NavGraphBuilder, ? super com.example.musify.ui.navigation.NavGraphWithDetailScreensNestedController, kotlin.Unit> builder) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void artistDetailScreen(androidx.navigation.NavGraphBuilder $this$artistDetailScreen, java.lang.String route, kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onPlayTrack, boolean isPlaybackLoading, kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.AlbumSearchResult, kotlin.Unit> onAlbumClicked, java.util.List<androidx.navigation.NamedNavArgument> arguments) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void albumDetailScreen(androidx.navigation.NavGraphBuilder $this$albumDetailScreen, java.lang.String route, kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onPlayTrack, boolean isPlaybackLoading) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void playlistDetailScreen(androidx.navigation.NavGraphBuilder $this$playlistDetailScreen, java.lang.String route, kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> onPlayTrack, boolean isPlaybackLoading, java.util.List<androidx.navigation.NamedNavArgument> navigationArguments) {
    }
    
    /**
     * A utility function that appends the [routeOfNavGraph] to [MusifyNavigationDestinations.route]
     * as prefix. See docs of [NavGraphWithDetailScreensNestedController] for more information.
     */
    private static final java.lang.String prefixedWithRouteOfNavGraphRoute(com.example.musify.ui.navigation.MusifyNavigationDestinations $this$prefixedWithRouteOfNavGraphRoute, java.lang.String routeOfNavGraph) {
        return null;
    }
}