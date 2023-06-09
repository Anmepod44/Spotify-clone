package com.example.musify.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\b\"\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"currentDestinationRoute", "", "Landroidx/navigation/NavHostController;", "getCurrentDestinationRoute", "(Landroidx/navigation/NavHostController;)Ljava/lang/String;", "isInNestedNavGraph", "", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;)Z", "parentOfCurrentDestination", "Landroidx/navigation/NavGraph;", "getParentOfCurrentDestination", "(Landroidx/navigation/NavHostController;)Landroidx/navigation/NavGraph;", "MusifyBottomNavigationConnectedWithBackStack", "", "navController", "navigationItems", "", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class MusifyBottomNavigationConnectedWithBackstackKt {
    
    /**
     * A composable that takes care of setting the active icon of the bottom
     * navigation composable based on the currentBackStackEntry of the [navController].
     * This composable acts as a recomposition scope. Therefore, reading the
     * state value of [NavHostController.currentBackStackEntryAsState()] will result
     * in the recomposition of only this composable.
     */
    @androidx.compose.runtime.Composable()
    public static final void MusifyBottomNavigationConnectedWithBackStack(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.musify.ui.navigation.MusifyBottomNavigationDestinations> navigationItems, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    private static final boolean isInNestedNavGraph(androidx.navigation.NavBackStackEntry $this$isInNestedNavGraph) {
        return false;
    }
    
    private static final java.lang.String getCurrentDestinationRoute(androidx.navigation.NavHostController $this$currentDestinationRoute) {
        return null;
    }
    
    private static final androidx.navigation.NavGraph getParentOfCurrentDestination(androidx.navigation.NavHostController $this$parentOfCurrentDestination) {
        return null;
    }
}