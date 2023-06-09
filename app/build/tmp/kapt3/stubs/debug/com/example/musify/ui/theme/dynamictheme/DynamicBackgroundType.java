package com.example.musify.ui.theme.dynamictheme;

import java.lang.System;

/**
 * A sealed class hierarchy that contains the different background types
 * associated with the [DynamicallyThemedSurface] composable.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType;", "", "()V", "Filled", "Gradient", "Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType$Gradient;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType$Filled;", "app_debug"})
public abstract class DynamicBackgroundType {
    
    private DynamicBackgroundType() {
        super();
    }
    
    /**
     * A gradient that fills the specified [fraction] of the maximum size of the screen,
     * between 0.0 and 1.0, inclusive.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType$Gradient;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType;", "fraction", "", "(F)V", "getFraction", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Gradient extends com.example.musify.ui.theme.dynamictheme.DynamicBackgroundType {
        private final float fraction = 0.0F;
        
        /**
         * A gradient that fills the specified [fraction] of the maximum size of the screen,
         * between 0.0 and 1.0, inclusive.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.ui.theme.dynamictheme.DynamicBackgroundType.Gradient copy(float fraction) {
            return null;
        }
        
        /**
         * A gradient that fills the specified [fraction] of the maximum size of the screen,
         * between 0.0 and 1.0, inclusive.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A gradient that fills the specified [fraction] of the maximum size of the screen,
         * between 0.0 and 1.0, inclusive.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A gradient that fills the specified [fraction] of the maximum size of the screen,
         * between 0.0 and 1.0, inclusive.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Gradient() {
            super();
        }
        
        public Gradient(float fraction) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getFraction() {
            return 0.0F;
        }
    }
    
    /**
     * Fills the background based on the color extracted from [DynamicThemeResource] passed
     * to the [DynamicallyThemedSurface].
     * A scrim can also be applied using the [scrimColor] param. The alpha of the scrim
     * can be specified using the [Color.copy] method.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0014\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0002\b\bJ \u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0013"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType$Filled;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicBackgroundType;", "scrimColor", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getScrimColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component1-QN2ZGVo", "copy", "copy-Y2TPw74", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Filled extends com.example.musify.ui.theme.dynamictheme.DynamicBackgroundType {
        @org.jetbrains.annotations.Nullable()
        private final androidx.compose.ui.graphics.Color scrimColor = null;
        
        /**
         * Fills the background based on the color extracted from [DynamicThemeResource] passed
         * to the [DynamicallyThemedSurface].
         * A scrim can also be applied using the [scrimColor] param. The alpha of the scrim
         * can be specified using the [Color.copy] method.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Fills the background based on the color extracted from [DynamicThemeResource] passed
         * to the [DynamicallyThemedSurface].
         * A scrim can also be applied using the [scrimColor] param. The alpha of the scrim
         * can be specified using the [Color.copy] method.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Fills the background based on the color extracted from [DynamicThemeResource] passed
         * to the [DynamicallyThemedSurface].
         * A scrim can also be applied using the [scrimColor] param. The alpha of the scrim
         * can be specified using the [Color.copy] method.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        private Filled(androidx.compose.ui.graphics.Color scrimColor) {
            super();
        }
    }
}