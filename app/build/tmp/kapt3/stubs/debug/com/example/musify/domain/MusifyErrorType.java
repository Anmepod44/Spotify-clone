package com.example.musify.domain;

import java.lang.System;

/**
 * An enum that contains different error types associated with [HttpException.code].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/musify/domain/MusifyErrorType;", "", "(Ljava/lang/String;I)V", "BAD_OR_EXPIRED_TOKEN", "BAD_OAUTH_REQUEST", "INVALID_REQUEST", "RATE_LIMIT_EXCEEDED", "UNKNOWN_ERROR", "NETWORK_CONNECTION_FAILURE", "RESOURCE_NOT_FOUND", "DESERIALIZATION_ERROR", "app_debug"})
public enum MusifyErrorType {
    /*public static final*/ BAD_OR_EXPIRED_TOKEN /* = new BAD_OR_EXPIRED_TOKEN() */,
    /*public static final*/ BAD_OAUTH_REQUEST /* = new BAD_OAUTH_REQUEST() */,
    /*public static final*/ INVALID_REQUEST /* = new INVALID_REQUEST() */,
    /*public static final*/ RATE_LIMIT_EXCEEDED /* = new RATE_LIMIT_EXCEEDED() */,
    /*public static final*/ UNKNOWN_ERROR /* = new UNKNOWN_ERROR() */,
    /*public static final*/ NETWORK_CONNECTION_FAILURE /* = new NETWORK_CONNECTION_FAILURE() */,
    /*public static final*/ RESOURCE_NOT_FOUND /* = new RESOURCE_NOT_FOUND() */,
    /*public static final*/ DESERIALIZATION_ERROR /* = new DESERIALIZATION_ERROR() */;
    
    MusifyErrorType() {
    }
}