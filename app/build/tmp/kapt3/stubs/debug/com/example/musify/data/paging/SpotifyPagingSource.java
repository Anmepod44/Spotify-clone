package com.example.musify.data.paging;

import java.lang.System;

/**
 * A sealed class that contains the logic to manage keys for a paginated
 * stream of type [V], from the Spotify API. The [loadBlock] can be used
 * to define what is to be loaded. The lambda will be provided with the
 * limit, and offset. The caller just needs to define how to fetch the required type,
 * taking care of handling any exceptions. The keys will be completely managed
 * by this class.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0018*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0018BX\b\u0004\u0012L\u0010\u0005\u001aH\b\u0001\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017RY\u0010\u0005\u001aH\b\u0001\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u000e\u0082\u0001\u0003\u0019\u001a\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/musify/data/paging/SpotifyPagingSource;", "V", "", "Landroidx/paging/PagingSource;", "", "loadBlock", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "limit", "offset", "Lkotlin/coroutines/Continuation;", "Lcom/example/musify/data/paging/SpotifyLoadResult;", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Lcom/example/musify/data/paging/AlbumsOfArtistPagingSource;", "Lcom/example/musify/data/paging/PlaylistTracksPagingSource;", "Lcom/example/musify/data/paging/SpotifySearchPagingSource;", "app_debug"})
public abstract class SpotifyPagingSource<V extends java.lang.Object> extends androidx.paging.PagingSource<java.lang.Integer, V> {
    private final kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, kotlin.coroutines.Continuation<? super com.example.musify.data.paging.SpotifyLoadResult<V>>, java.lang.Object> loadBlock = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.data.paging.SpotifyPagingSource.Companion Companion = null;
    public static final int DEFAULT_PAGE_SIZE = 20;
    
    private SpotifyPagingSource(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super com.example.musify.data.paging.SpotifyLoadResult<V>>, ? extends java.lang.Object> loadBlock) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, V> state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, V>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/data/paging/SpotifyPagingSource$Companion;", "", "()V", "DEFAULT_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}