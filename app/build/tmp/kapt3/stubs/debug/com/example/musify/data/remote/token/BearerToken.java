package com.example.musify.data.remote.token;

import java.lang.System;

/**
 * A class that contains an OAuth Bearer token. A 'Bearer' token always
 * starts with the word 'Bearer' followed by the api token.
 * Eg. 'Bearer <api token>'
 * This is the reason as to why the toString method is overridden to
 * include the prefix. This becomes especially useful when used in
 * conjunction with Retrofit, because, the toString method will be called
 * under the hood, when retrofit encounters this object. This will prevent
 * the boilerplate code of concatenating the token with the prefix
 * 'Bearer'.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/musify/data/remote/token/BearerToken;", "", "tokenString", "", "timeOfCreation", "Ljava/time/LocalDateTime;", "secondsUntilExpiration", "", "(Ljava/lang/String;Ljava/time/LocalDateTime;I)V", "getSecondsUntilExpiration", "()I", "getTimeOfCreation", "()Ljava/time/LocalDateTime;", "value", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BearerToken {
    private final java.lang.String tokenString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime timeOfCreation = null;
    private final int secondsUntilExpiration = 0;
    
    /**
     * A class that contains an OAuth Bearer token. A 'Bearer' token always
     * starts with the word 'Bearer' followed by the api token.
     * Eg. 'Bearer <api token>'
     * This is the reason as to why the toString method is overridden to
     * include the prefix. This becomes especially useful when used in
     * conjunction with Retrofit, because, the toString method will be called
     * under the hood, when retrofit encounters this object. This will prevent
     * the boilerplate code of concatenating the token with the prefix
     * 'Bearer'.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.token.BearerToken copy(@org.jetbrains.annotations.NotNull()
    java.lang.String tokenString, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime timeOfCreation, int secondsUntilExpiration) {
        return null;
    }
    
    /**
     * A class that contains an OAuth Bearer token. A 'Bearer' token always
     * starts with the word 'Bearer' followed by the api token.
     * Eg. 'Bearer <api token>'
     * This is the reason as to why the toString method is overridden to
     * include the prefix. This becomes especially useful when used in
     * conjunction with Retrofit, because, the toString method will be called
     * under the hood, when retrofit encounters this object. This will prevent
     * the boilerplate code of concatenating the token with the prefix
     * 'Bearer'.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class that contains an OAuth Bearer token. A 'Bearer' token always
     * starts with the word 'Bearer' followed by the api token.
     * Eg. 'Bearer <api token>'
     * This is the reason as to why the toString method is overridden to
     * include the prefix. This becomes especially useful when used in
     * conjunction with Retrofit, because, the toString method will be called
     * under the hood, when retrofit encounters this object. This will prevent
     * the boilerplate code of concatenating the token with the prefix
     * 'Bearer'.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public BearerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String tokenString, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime timeOfCreation, int secondsUntilExpiration) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getTimeOfCreation() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getSecondsUntilExpiration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}