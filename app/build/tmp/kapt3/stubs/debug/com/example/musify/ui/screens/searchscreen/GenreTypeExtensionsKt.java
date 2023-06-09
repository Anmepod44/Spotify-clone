package com.example.musify.ui.screens.searchscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"getAssociatedBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/example/musify/domain/Genre$GenreType;", "(Lcom/example/musify/domain/Genre$GenreType;)J", "getAssociatedImageResource", "", "app_debug"})
public final class GenreTypeExtensionsKt {
    
    /**
     * Used to get the associated image resource id of the [Genre.GenreType].
     */
    public static final int getAssociatedImageResource(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.Genre.GenreType $this$getAssociatedImageResource) {
        return 0;
    }
    
    /**
     * Used to get the associated background color of the [Genre.GenreType].
     * They were directly scraped from the official spotify web app.
     * Note: Certain colors may not match with the official app. This
     * is because, all genres listed in the api where not listed in the
     * spotify web app.
     */
    public static final long getAssociatedBackgroundColor(@org.jetbrains.annotations.NotNull()
    com.example.musify.domain.Genre.GenreType $this$getAssociatedBackgroundColor) {
        return 0L;
    }
}