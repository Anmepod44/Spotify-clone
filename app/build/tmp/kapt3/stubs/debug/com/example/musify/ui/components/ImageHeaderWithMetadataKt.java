package com.example.musify.ui.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"ImageHeaderWithMetadata", "", "title", "", "headerImageSource", "Lcom/example/musify/ui/components/HeaderImageSource;", "subtitle", "onBackButtonClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoadingPlaceholderVisible", "", "onImageLoading", "onImageLoaded", "Lkotlin/Function1;", "", "additionalMetadataContent", "Landroidx/compose/runtime/Composable;", "app_debug"})
public final class ImageHeaderWithMetadataKt {
    
    /**
     * A composable that is used to display an image together with it's
     * [title] and [subtitle]. The image will be centered. The [title]
     * and [subtitle] will be placed after the image, in a vertical
     * manner.
     * @param title the title associated with the image.
     * @param headerImageSource the source to be used for the image.
     * @param subtitle the subtitle associated with the image.
     * @param onBackButtonClicked the lambda that will be executed when the
     * back button is pressed.
     * @param isLoadingPlaceholderVisible used to indicate whether the loading
     * placeholder for the image is visible.
     * @param onImageLoading the lambda to execute when the image is
     * loading.
     * @param onImageLoaded the lambda to execute when the image has finished
     * loading. It is also provided with a nullable [Throwable] parameter that
     * can be used to determine whether the image was loaded successfully.
     * @param additionalMetadataContent the lambda the can be used to add additional
     * items that will appear after the [subtitle].
     */
    @androidx.compose.runtime.Composable()
    public static final void ImageHeaderWithMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.example.musify.ui.components.HeaderImageSource headerImageSource, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClicked, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean isLoadingPlaceholderVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImageLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onImageLoaded, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> additionalMetadataContent) {
    }
}