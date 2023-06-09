package com.example.musify.ui.theme.dynamictheme;

import java.lang.System;

/**
 * A sealed class hierarchy that contains classes representing the
 * different resources that could be used to get the dynamic theme.
 * Thought this hierarchy contains only one meaningful class for
 * now, being a sealed class, it makes adding of additional resources
 * easier. For example, in the future, we could add a class to
 * the hierarchy, that will directly take a bitmap as input.
 * This could be useful if an image has already been pre-fetched.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource;", "", "()V", "Empty", "FromImageUrl", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource$FromImageUrl;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource$Empty;", "app_debug"})
public abstract class DynamicThemeResource {
    
    private DynamicThemeResource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource$FromImageUrl;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FromImageUrl extends com.example.musify.ui.theme.dynamictheme.DynamicThemeResource {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.ui.theme.dynamictheme.DynamicThemeResource.FromImageUrl copy(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FromImageUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource$Empty;", "Lcom/example/musify/ui/theme/dynamictheme/DynamicThemeResource;", "()V", "app_debug"})
    public static final class Empty extends com.example.musify.ui.theme.dynamictheme.DynamicThemeResource {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.theme.dynamictheme.DynamicThemeResource.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
}