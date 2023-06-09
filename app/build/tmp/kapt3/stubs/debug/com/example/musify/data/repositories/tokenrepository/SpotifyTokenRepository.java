package com.example.musify.data.repositories.tokenrepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/musify/data/repositories/tokenrepository/SpotifyTokenRepository;", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "tokenManager", "Lcom/example/musify/data/remote/token/tokenmanager/TokenManager;", "base64Encoder", "Lcom/example/musify/data/encoder/Base64Encoder;", "(Lcom/example/musify/data/remote/token/tokenmanager/TokenManager;Lcom/example/musify/data/encoder/Base64Encoder;)V", "token", "Lcom/example/musify/data/remote/token/BearerToken;", "getAndAssignToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValidBearerToken", "app_debug"})
public final class SpotifyTokenRepository implements com.example.musify.data.repositories.tokenrepository.TokenRepository {
    private final com.example.musify.data.remote.token.tokenmanager.TokenManager tokenManager = null;
    private final com.example.musify.data.encoder.Base64Encoder base64Encoder = null;
    private com.example.musify.data.remote.token.BearerToken token;
    
    @javax.inject.Inject()
    public SpotifyTokenRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.token.tokenmanager.TokenManager tokenManager, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.encoder.Base64Encoder base64Encoder) {
        super();
    }
    
    /**
     * Used to get an instance of [BearerToken].
     * If the [token] is null or expired, a new token would be automatically
     * requested and assigned. Therefore, this function guarantees that
     * a valid token would always be returned. Thus, this function can
     * be safely called multiple times.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValidBearerToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.musify.data.remote.token.BearerToken> continuation) {
        return null;
    }
    
    /**
     * A helper function that gets and assigns a new [token].
     */
    private final java.lang.Object getAndAssignToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}