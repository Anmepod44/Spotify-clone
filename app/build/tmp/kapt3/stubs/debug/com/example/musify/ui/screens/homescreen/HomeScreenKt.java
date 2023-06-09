package com.example.musify.ui.screens.homescreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u001a\u001a\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0003\u001az\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0007\u00a8\u0006\u001b"}, d2 = {"CarouselLazyRow", "", "carousel", "Lcom/example/musify/domain/HomeFeedCarousel;", "onHomeFeedCardClick", "Lkotlin/Function1;", "Lcom/example/musify/domain/HomeFeedCarouselCardInfo;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "HeaderRow", "timeBasedGreeting", "", "HomeScreen", "homeFeedFilters", "", "Lcom/example/musify/domain/HomeFeedFilters;", "currentlySelectedHomeFeedFilter", "onHomeFeedFilterClick", "carousels", "onHomeFeedCarouselCardClick", "onErrorRetryButtonClick", "Lkotlin/Function0;", "isLoading", "", "isErrorMessageVisible", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String timeBasedGreeting, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.musify.domain.HomeFeedFilters> homeFeedFilters, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.HomeFeedFilters currentlySelectedHomeFeedFilter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.HomeFeedFilters, kotlin.Unit> onHomeFeedFilterClick, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.domain.HomeFeedCarousel> carousels, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.domain.HomeFeedCarouselCardInfo, kotlin.Unit> onHomeFeedCarouselCardClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onErrorRetryButtonClick, boolean isLoading, boolean isErrorMessageVisible) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void CarouselLazyRow(com.example.musify.domain.HomeFeedCarousel carousel, kotlin.jvm.functions.Function1<? super com.example.musify.domain.HomeFeedCarouselCardInfo, kotlin.Unit> onHomeFeedCardClick, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues contentPadding) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void HeaderRow(androidx.compose.ui.Modifier modifier, java.lang.String timeBasedGreeting) {
    }
}