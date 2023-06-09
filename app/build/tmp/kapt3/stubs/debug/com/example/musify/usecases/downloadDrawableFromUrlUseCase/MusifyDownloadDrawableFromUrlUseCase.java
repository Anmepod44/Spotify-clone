package com.example.musify.usecases.downloadDrawableFromUrlUseCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u000e"}, d2 = {"Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/MusifyDownloadDrawableFromUrlUseCase;", "Lcom/example/musify/usecases/downloadDrawableFromUrlUseCase/DownloadDrawableFromUrlUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lkotlin/Result;", "Landroid/graphics/drawable/Drawable;", "urlString", "", "context", "Landroid/content/Context;", "invoke-0E7RQCE", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MusifyDownloadDrawableFromUrlUseCase implements com.example.musify.usecases.downloadDrawableFromUrlUseCase.DownloadDrawableFromUrlUseCase {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public MusifyDownloadDrawableFromUrlUseCase(@org.jetbrains.annotations.NotNull()
    @com.example.musify.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
}