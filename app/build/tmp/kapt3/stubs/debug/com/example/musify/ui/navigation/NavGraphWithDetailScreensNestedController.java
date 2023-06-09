package com.example.musify.ui.navigation;

import java.lang.System;

/**
 * A class that acts a controller that is used to navigate within
 * destinations defined in [NavGraphBuilder.navGraphWithDetailScreens].
 *
 * Navigation component doesn't work deterministically when the same
 * nested graph is used more than once in the same graph. Since the
 * same destinations defined in [NavGraphBuilder.navGraphWithDetailScreens] are
 * reused (with the same routes) multiple times within the same graph,
 * navigation component chooses the destination that appears in the first call
 * to [NavGraphBuilder.navGraphWithDetailScreens] when ever the client
 * chooses to navigate to one of the screens defined in
 * [NavGraphBuilder.navGraphWithDetailScreens].
 * Eg:
 * Let's assume that NavGraphBuilder.navGraphWithDetailScreens has an artist
 * and album detail screen.
 * ```
 * NavHost(...){
 *
 *      // (1) contains detail screens
 *      navGraphWithDetailScreens(){
 *         / * Other composable destinations * /
 *      }
 *
 *      // (2) contains the same detail screens as (1)
 *      navGraphWithDetailScreens(){
 *         / * Other composable destinations * /
 *      }
 * }
 * ```
 * When the client wants to navigate to a detail screen (lets take album detail
 * screen for example), then, the navigation component will navigate to the
 * album detail screen defined in (1) and not the detail screen defined in (2)
 * even if the client is navigating from one of the composable destinations defined
 * in the second call since the route strings for the detail screens are the same in
 * both graphs ((1) and (2)). This results in navigating to a destination that has an
 * unexpected parent navGraph. In order to avoid this, the destinations defined
 * in [NavGraphBuilder.navGraphWithDetailScreens] are prefixed with the route
 * of the said navGraph using [prefixedWithRouteOfNavGraphRoute]. The
 * [NavGraphWithDetailScreensNestedController.navigateToDetailScreen]
 * prefixes [associatedNavGraphRoute] before navigating in-order to accommodate
 * for this.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/musify/ui/navigation/NavGraphWithDetailScreensNestedController;", "", "navController", "Landroidx/navigation/NavHostController;", "associatedNavGraphRoute", "", "playTrack", "Lkotlin/Function1;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "navigateToDetailScreen", "searchResult", "Lcom/example/musify/domain/SearchResult;", "app_debug"})
public final class NavGraphWithDetailScreensNestedController {
    private final androidx.navigation.NavHostController navController = null;
    private final java.lang.String associatedNavGraphRoute = null;
    private final kotlin.jvm.functions.Function1<com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> playTrack = null;
    
    public NavGraphWithDetailScreensNestedController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    java.lang.String associatedNavGraphRoute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, kotlin.Unit> playTrack) {
        super();
    }
    
    public final void navigateToDetailScreen(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.SearchResult searchResult) {
    }
}