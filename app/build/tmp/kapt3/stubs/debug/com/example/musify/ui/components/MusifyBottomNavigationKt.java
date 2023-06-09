package com.example.musify.ui.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"MusifyBottomNavigation", "", "navigationItems", "", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "currentlySelectedItem", "onItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class MusifyBottomNavigationKt {
    
    /**
     * A bottom navigation bar composable with a background gradient.
     * Note: The bottom navigation bar has a fixed height of 80dp.
     *
     * @param navigationItems the [MusifyBottomNavigationDestinations] to
     * display in the navigation bar.
     * @param currentlySelectedItem the currently selected [MusifyBottomNavigationDestinations].
     * The currently selected item will be highlighted and will also use the
     * [MusifyBottomNavigationDestinations.filledIconVariantResourceId] for the image resource.
     * @param onItemClick the lambda to execute when an item is clicked. A reference to
     * an instance of [MusifyBottomNavigationDestinations] that was clicked will be provided
     * as a parameter to the lambda.
     * @param modifier the modifier to be applied to the navigation bar. The height of the
     * composable is fixed at 80dp.
     * @see [com.example.musify.ui.navigation.MusifyBottomNavigationConnectedWithBackStack]
     */
    @androidx.compose.runtime.Composable()
    public static final void MusifyBottomNavigation(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.musify.ui.navigation.MusifyBottomNavigationDestinations> navigationItems, @org.jetbrains.annotations.NotNull()
    com.example.musify.ui.navigation.MusifyBottomNavigationDestinations currentlySelectedItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.ui.navigation.MusifyBottomNavigationDestinations, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}