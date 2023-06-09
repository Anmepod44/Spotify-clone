package com.example.musify.ui.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"DefaultMusifyErrorMessage", "", "title", "", "subtitle", "onRetryButtonClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class DefaultMusifyErrorMessageKt {
    
    /**
     * A composable that is used to display an error message through-out
     * the app with the specified [title] and [subtitle]. It manages the
     * styling of the both the [title] and [subtitle].
     * @param modifier the modifier to be applied to the composable.
     */
    @androidx.compose.runtime.Composable()
    @java.lang.Deprecated()
    public static final void DefaultMusifyErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * A composable that is used to display an error message through-out
     * the app with the specified [title] and [subtitle]. It manages the
     * styling of the both the [title] and [subtitle]. This composable
     * is an overload of [DefaultMusifyErrorMessage] that also displays
     * a retry button.
     * @param modifier the modifier to be applied to the composable.
     * @param onRetryButtonClicked the lambda to execute when the retry
     * button is clicked.
     */
    @androidx.compose.runtime.Composable()
    public static final void DefaultMusifyErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRetryButtonClicked, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}