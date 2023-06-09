package com.example.musify.data.repositories.tokenrepository;

import java.lang.System;

/**
 * An interface that contains all the methods that are requisite for
 * an class that implements [TokenRepository].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "", "getValidBearerToken", "Lcom/example/musify/data/remote/token/BearerToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TokenRepository {
    
    /**
     * Used to get an instance of a valid [BearerToken].
     * This method should always return a valid token.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValidBearerToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.token.BearerToken> continuation);
}