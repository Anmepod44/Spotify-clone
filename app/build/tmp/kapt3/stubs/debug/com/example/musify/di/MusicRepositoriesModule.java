package com.example.musify.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/example/musify/di/MusicRepositoriesModule;", "", "()V", "bindAlbumsRepository", "Lcom/example/musify/data/repositories/albumsrepository/AlbumsRepository;", "impl", "Lcom/example/musify/data/repositories/albumsrepository/MusifyAlbumsRepository;", "bindArtistsRepository", "Lcom/example/musify/data/repositories/artistsrepository/ArtistsRepository;", "Lcom/example/musify/data/repositories/artistsrepository/MusifyArtistsRepository;", "bindGeneresRepository", "Lcom/example/musify/data/repositories/genresrepository/GenresRepository;", "Lcom/example/musify/data/repositories/genresrepository/MusifyGenresRepository;", "bindHomeFeedRepository", "Lcom/example/musify/data/repositories/homefeedrepository/HomeFeedRepository;", "Lcom/example/musify/data/repositories/homefeedrepository/MusifyHomeFeedRepository;", "bindSearchRepository", "Lcom/example/musify/data/repositories/searchrepository/SearchRepository;", "Lcom/example/musify/data/repositories/searchrepository/MusifySearchRepository;", "bindTracksRepository", "Lcom/example/musify/data/repositories/tracksrepository/TracksRepository;", "Lcom/example/musify/data/repositories/tracksrepository/MusifyTracksRepository;", "app_debug"})
@dagger.Module()
public abstract class MusicRepositoriesModule {
    
    public MusicRepositoriesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.tracksrepository.TracksRepository bindTracksRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tracksrepository.MusifyTracksRepository impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.albumsrepository.AlbumsRepository bindAlbumsRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.albumsrepository.MusifyAlbumsRepository impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.artistsrepository.ArtistsRepository bindArtistsRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.artistsrepository.MusifyArtistsRepository impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.genresrepository.GenresRepository bindGeneresRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.genresrepository.MusifyGenresRepository impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.searchrepository.SearchRepository bindSearchRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.searchrepository.MusifySearchRepository impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.musify.data.repositories.homefeedrepository.HomeFeedRepository bindHomeFeedRepository(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.homefeedrepository.MusifyHomeFeedRepository impl);
}