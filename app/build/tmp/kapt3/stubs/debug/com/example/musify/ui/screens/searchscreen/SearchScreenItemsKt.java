package com.example.musify.ui.screens.searchscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u00d6\u0001\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u0011H\b\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u001a2H\u0010\u001b\u001aD\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u0001H\b\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00070\u001c\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u001aH\u0002\u001ar\u0010\u001e\u001a\u00020\u0007*\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020$0\u00172\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00070\u0010H\u0007\u001az\u0010(\u001a\u00020\u0007*\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\u00172\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010+\u001a\u00020,H\u0007\u001az\u0010-\u001a\u00020\u0007*\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020$0\u00172\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u00100\u001a\u00020,H\u0007\u001a|\u00101\u001a\u00020\u0007*\u00020\n2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\f2\b\u00104\u001a\u0004\u0018\u0001032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020$0\u00172\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00172\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00070\u0010H\u0007\"\u0017\u0010\u0000\u001a\u00020\u00018CX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"CardBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getCardBackgroundColor", "()J", "CardShape", "Landroidx/compose/ui/graphics/Shape;", "itemsIndexedWithEmptyListContent", "", "T", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "items", "Landroidx/paging/compose/LazyPagingItems;", "cardType", "Lcom/example/musify/ui/components/ListItemCardType;", "key", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "item", "emptyListContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "itemContent", "Lkotlin/Function3;", "value", "searchAlbumListItems", "albumListForSearchQuery", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "onItemClick", "Lcom/example/musify/domain/SearchResult;", "isLoadingPlaceholderVisible", "", "onImageLoading", "onImageLoadingFinished", "", "searchArtistListItems", "artistListForSearchQuery", "Lcom/example/musify/domain/SearchResult$ArtistSearchResult;", "artistImageErrorPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "searchPlaylistListItems", "playlistListForSearchQuery", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "playlistImageErrorPainter", "searchTrackListItems", "tracksListForSearchQuery", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "currentlyPlayingTrack", "app_debug"})
public final class SearchScreenItemsKt {
    private static final androidx.compose.ui.graphics.Shape CardShape = null;
    
    @androidx.compose.runtime.Composable()
    private static final long getCardBackgroundColor() {
        return 0L;
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void searchTrackListItems(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListScope $this$searchTrackListItems, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.TrackSearchResult> tracksListForSearchQuery, @org.jetbrains.annotations.Nullable()
    com.example.musify.domain.SearchResult.TrackSearchResult currentlyPlayingTrack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.TrackSearchResult, java.lang.Boolean> isLoadingPlaceholderVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onImageLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.musify.domain.SearchResult.TrackSearchResult, ? super java.lang.Throwable, kotlin.Unit> onImageLoadingFinished) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void searchAlbumListItems(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListScope $this$searchAlbumListItems, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.AlbumSearchResult> albumListForSearchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.AlbumSearchResult, java.lang.Boolean> isLoadingPlaceholderVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onImageLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.musify.domain.SearchResult.AlbumSearchResult, ? super java.lang.Throwable, kotlin.Unit> onImageLoadingFinished) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void searchArtistListItems(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListScope $this$searchArtistListItems, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.ArtistSearchResult> artistListForSearchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.ArtistSearchResult, java.lang.Boolean> isLoadingPlaceholderVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onImageLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.musify.domain.SearchResult.ArtistSearchResult, ? super java.lang.Throwable, kotlin.Unit> onImageLoadingFinished, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.painter.Painter artistImageErrorPainter) {
    }
    
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void searchPlaylistListItems(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListScope $this$searchPlaylistListItems, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.example.musify.domain.SearchResult.PlaylistSearchResult> playlistListForSearchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult.PlaylistSearchResult, java.lang.Boolean> isLoadingPlaceholderVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.SearchResult, kotlin.Unit> onImageLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.musify.domain.SearchResult.PlaylistSearchResult, ? super java.lang.Throwable, kotlin.Unit> onImageLoadingFinished, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.painter.Painter playlistImageErrorPainter) {
    }
    
    private static final <T extends java.lang.Object>void itemsIndexedWithEmptyListContent(androidx.compose.foundation.lazy.LazyListScope $this$itemsIndexedWithEmptyListContent, androidx.paging.compose.LazyPagingItems<T> items, com.example.musify.ui.components.ListItemCardType cardType, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> key, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyItemScope, kotlin.Unit> emptyListContent, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super T, kotlin.Unit> itemContent) {
    }
}