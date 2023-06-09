package com.example.musify.data.remote.token;

import java.lang.System;

/**
 * A response object that contains the [accessToken] for any specific api.
 * It also contains additional information such as the [secondsUntilExpiration]
 * and the [tokenType].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/musify/data/remote/token/AccessTokenResponse;", "", "accessToken", "", "secondsUntilExpiration", "", "tokenType", "(Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getSecondsUntilExpiration", "()I", "getTokenType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class AccessTokenResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String accessToken = null;
    private final int secondsUntilExpiration = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tokenType = null;
    
    /**
     * A response object that contains the [accessToken] for any specific api.
     * It also contains additional information such as the [secondsUntilExpiration]
     * and the [tokenType].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.token.AccessTokenResponse copy(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "access_token")
    java.lang.String accessToken, @com.fasterxml.jackson.annotation.JsonProperty(value = "expires_in")
    int secondsUntilExpiration, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "token_type")
    java.lang.String tokenType) {
        return null;
    }
    
    /**
     * A response object that contains the [accessToken] for any specific api.
     * It also contains additional information such as the [secondsUntilExpiration]
     * and the [tokenType].
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response object that contains the [accessToken] for any specific api.
     * It also contains additional information such as the [secondsUntilExpiration]
     * and the [tokenType].
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response object that contains the [accessToken] for any specific api.
     * It also contains additional information such as the [secondsUntilExpiration]
     * and the [tokenType].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AccessTokenResponse(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "access_token")
    java.lang.String accessToken, @com.fasterxml.jackson.annotation.JsonProperty(value = "expires_in")
    int secondsUntilExpiration, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "token_type")
    java.lang.String tokenType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSecondsUntilExpiration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenType() {
        return null;
    }
}