package com.example.musify.data.repositories.tokenrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"runCatchingWithToken", "Lcom/example/musify/data/utils/FetchedResource;", "R", "Lcom/example/musify/domain/MusifyErrorType;", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "block", "Lkotlin/Function2;", "Lcom/example/musify/data/remote/token/BearerToken;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TokenRepositoryExtensionsKt {
    
    /**
     * A utility function used to run the [block] with a token retrieved
     * from the [TokenRepository] instance. It returns an instance of
     * [FetchedResource.Success] if the block did not throw an exception.
     * If the block throws either - a [HttpException] or an [IOException],
     * then [FetchedResource.Failure] containing the corresponding exception
     * will be returned. Any other exception thrown by the [block]
     * **will not be caught**.
     */
    @org.jetbrains.annotations.Nullable()
    public static final <R extends java.lang.Object>java.lang.Object runCatchingWithToken(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository $this$runCatchingWithToken, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.musify.data.remote.token.BearerToken, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.utils.FetchedResource<R, com.example.musify.domain.MusifyErrorType>> p2) {
        return null;
    }
}