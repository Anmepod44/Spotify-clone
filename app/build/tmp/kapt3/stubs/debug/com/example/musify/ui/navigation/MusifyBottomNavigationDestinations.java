package com.example.musify.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "", "route", "", "label", "outlinedIconVariantResourceId", "", "filledIconVariantResourceId", "(Ljava/lang/String;Ljava/lang/String;II)V", "getFilledIconVariantResourceId", "()I", "getLabel", "()Ljava/lang/String;", "getOutlinedIconVariantResourceId", "getRoute", "Home", "Premium", "Search", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Home;", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Search;", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Premium;", "app_debug"})
public abstract class MusifyBottomNavigationDestinations {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    private final int outlinedIconVariantResourceId = 0;
    private final int filledIconVariantResourceId = 0;
    
    private MusifyBottomNavigationDestinations(java.lang.String route, java.lang.String label, int outlinedIconVariantResourceId, int filledIconVariantResourceId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final int getOutlinedIconVariantResourceId() {
        return 0;
    }
    
    public final int getFilledIconVariantResourceId() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Home;", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "()V", "app_debug"})
    public static final class Home extends com.example.musify.ui.navigation.MusifyBottomNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyBottomNavigationDestinations.Home INSTANCE = null;
        
        private Home() {
            super(null, null, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Search;", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "()V", "app_debug"})
    public static final class Search extends com.example.musify.ui.navigation.MusifyBottomNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyBottomNavigationDestinations.Search INSTANCE = null;
        
        private Search() {
            super(null, null, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations$Premium;", "Lcom/example/musify/ui/navigation/MusifyBottomNavigationDestinations;", "()V", "app_debug"})
    public static final class Premium extends com.example.musify.ui.navigation.MusifyBottomNavigationDestinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.ui.navigation.MusifyBottomNavigationDestinations.Premium INSTANCE = null;
        
        private Premium() {
            super(null, null, 0, 0);
        }
    }
}