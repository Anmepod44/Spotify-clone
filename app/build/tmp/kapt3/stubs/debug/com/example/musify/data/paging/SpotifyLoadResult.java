package com.example.musify.data.paging;

import java.lang.System;

/**
 * A load result sealed class that is associated with [SpotifySearchPagingSource].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/musify/data/paging/SpotifyLoadResult;", "Value", "", "()V", "Error", "PageData", "Lcom/example/musify/data/paging/SpotifyLoadResult$PageData;", "Lcom/example/musify/data/paging/SpotifyLoadResult$Error;", "app_debug"})
public abstract class SpotifyLoadResult<Value extends java.lang.Object> {
    
    private SpotifyLoadResult() {
        super();
    }
    
    /**
     * A class that models a successful load with the specified [data]
     * of type [Value].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u00c6\u0003J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/paging/SpotifyLoadResult$PageData;", "Value", "", "Lcom/example/musify/data/paging/SpotifyLoadResult;", "data", "", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class PageData<Value extends java.lang.Object> extends com.example.musify.data.paging.SpotifyLoadResult<Value> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<Value> data = null;
        
        /**
         * A class that models a successful load with the specified [data]
         * of type [Value].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.paging.SpotifyLoadResult.PageData<Value> copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends Value> data) {
            return null;
        }
        
        /**
         * A class that models a successful load with the specified [data]
         * of type [Value].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A class that models a successful load with the specified [data]
         * of type [Value].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A class that models a successful load with the specified [data]
         * of type [Value].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PageData(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends Value> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<Value> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<Value> getData() {
            return null;
        }
    }
    
    /**
     * A class that models an error that happened during a load. It contains
     * a [throwable] that specifies the exception that occured.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/paging/SpotifyLoadResult$Error;", "Value", "", "Lcom/example/musify/data/paging/SpotifyLoadResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error<Value extends java.lang.Object> extends com.example.musify.data.paging.SpotifyLoadResult<Value> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        
        /**
         * A class that models an error that happened during a load. It contains
         * a [throwable] that specifies the exception that occured.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.paging.SpotifyLoadResult.Error<Value> copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
        
        /**
         * A class that models an error that happened during a load. It contains
         * a [throwable] that specifies the exception that occured.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A class that models an error that happened during a load. It contains
         * a [throwable] that specifies the exception that occured.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A class that models an error that happened during a load. It contains
         * a [throwable] that specifies the exception that occured.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
            return null;
        }
    }
}