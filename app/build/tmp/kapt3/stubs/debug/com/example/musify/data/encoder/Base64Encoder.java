package com.example.musify.data.encoder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/musify/data/encoder/Base64Encoder;", "", "encodeToString", "", "input", "", "app_debug"})
public abstract interface Base64Encoder {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encodeToString(@org.jetbrains.annotations.NotNull()
    byte[] input);
}