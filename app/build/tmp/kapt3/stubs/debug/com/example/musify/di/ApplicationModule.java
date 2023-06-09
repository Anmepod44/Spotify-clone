package com.example.musify.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/musify/di/ApplicationModule;", "", "()V", "bindBase64Encoder", "Lcom/example/musify/data/encoder/Base64Encoder;", "androidBase64Encoder", "Lcom/example/musify/data/encoder/AndroidBase64Encoder;", "bindTokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "spotifyTokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/SpotifyTokenRepository;", "app_debug"})
@dagger.Module()
public abstract class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.encoder.Base64Encoder bindBase64Encoder(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.encoder.AndroidBase64Encoder androidBase64Encoder);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.tokenrepository.TokenRepository bindTokenRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.SpotifyTokenRepository spotifyTokenRepository);
}