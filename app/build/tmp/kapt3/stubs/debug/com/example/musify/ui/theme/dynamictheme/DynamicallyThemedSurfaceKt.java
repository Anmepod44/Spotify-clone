package com.example.musify.ui.theme.dynamictheme;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\b\fH\u0007\u001a-\u0010\r\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u0003*\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u00f8\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0019"}, d2 = {"DarkColorPalette", "Landroidx/compose/material/Colors;", "DynamicallyThemedSurface", "", "dynamicThemeResource", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource;", "modifier", "Landroidx/compose/ui/Modifier;", "dynamicBackgroundType", "Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "drawRectFilledWithColor", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "color", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "drawRectFilledWithColor-KZA9ayg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/Color;)V", "drawRectWithGradient", "backgroundGradientColors", "", "fraction", "", "app_debug"})
public final class DynamicallyThemedSurfaceKt {
    private static final androidx.compose.material.Colors DarkColorPalette = null;
    
    /**
     * A surface that sets background based on the provided [dynamicThemeResource].
     * The type of background can be specified by using the [dynamicBackgroundType]
     * param.
     * @param modifier the modifier to be applied to the surface.
     * @param content the content behind which the gradient background is to
     * be applied.
     */
    @androidx.compose.runtime.Composable()
    public static final void DynamicallyThemedSurface(@org.jetbrains.annotations.NotNull()
    com.example.musify.ui.theme.dynamictheme.DynamicThemeResource dynamicThemeResource, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.musify.ui.theme.dynamictheme.DynamicBackgroundType dynamicBackgroundType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    private static final void drawRectWithGradient(androidx.compose.ui.graphics.drawscope.DrawScope $this$drawRectWithGradient, java.util.List<androidx.compose.ui.graphics.Color> backgroundGradientColors, float fraction) {
    }
}