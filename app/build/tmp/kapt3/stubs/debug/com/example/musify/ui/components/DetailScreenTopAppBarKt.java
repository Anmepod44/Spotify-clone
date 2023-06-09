package com.example.musify.ui.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u00a8\u0006\f"}, d2 = {"DetailScreenTopAppBar", "", "title", "", "onBackButtonClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "dynamicThemeResource", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource;", "DetailScreenTopAppBarPreview", "app_debug"})
public final class DetailScreenTopAppBarKt {
    
    /**
     * An appbar that is meant to be used in a detail screen. It is mainly
     * used to display the [title] with a back button.
     * @param title the title to be displayed.
     * @param onBackButtonClicked the lambda to execute with the user clicks
     * on the back button.
     * @param modifier the modifier to be applied to the app bar.
     * @param onClick the lambda to execute when the app bar clicked. This is
     * usually used to scroll a list to the first item.
     * @param dynamicThemeResource the resource to be ugit status
     * sed to set the
     * background color. By default, it is set to [DynamicThemeResource.Empty].
     */
    @androidx.compose.runtime.Composable()
    public static final void DetailScreenTopAppBar(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    com.example.musify.ui.theme.dynamictheme.DynamicThemeResource dynamicThemeResource) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void DetailScreenTopAppBarPreview() {
    }
}