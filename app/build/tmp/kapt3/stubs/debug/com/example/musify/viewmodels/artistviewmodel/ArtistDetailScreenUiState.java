package com.example.musify.viewmodels.artistviewmodel;

import java.lang.System;

/**
 * A sealed class hierarchy consisting of all UI states that are related to a screen
 * displaying the details of an artist.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState;", "", "()V", "Error", "Idle", "Loading", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Idle;", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Loading;", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Error;", "app_debug"})
public abstract class ArtistDetailScreenUiState {
    
    private ArtistDetailScreenUiState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Idle;", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState;", "()V", "app_debug"})
    public static final class Idle extends com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState.Idle INSTANCE = null;
        
        private Idle() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Loading;", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState;", "()V", "app_debug"})
    public static final class Loading extends com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState$Error;", "Lcom/example/musify/viewmodels/artistviewmodel/ArtistDetailScreenUiState;", "message", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState {
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.viewmodels.artistviewmodel.ArtistDetailScreenUiState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        private final java.lang.String component1() {
            return null;
        }
    }
}