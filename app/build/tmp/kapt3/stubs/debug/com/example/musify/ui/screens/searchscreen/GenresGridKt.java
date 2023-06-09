package com.example.musify.ui.screens.searchscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"GenresGrid", "", "availableGenres", "", "Lcom/example/musify/domain/Genre;", "onGenreItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class GenresGridKt {
    
    /**
     * A [LazyVerticalGrid] that displays the [availableGenres].
     * @param availableGenres the genres that are to be displayed.
     * @param onGenreItemClick the lambda to execute when a [Genre] item
     * is clicked. This lambda also provides an instance of [Genre] that
     * indicates the item that was clicked.
     * @param modifier the modifier to be applied to the grid.
     */
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void GenresGrid(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.Genre> availableGenres, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.Genre, kotlin.Unit> onGenreItemClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}