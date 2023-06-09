package com.example.musify.data.repositories.genresrepository;

import java.lang.System;

/**
 * A repository that contains all methods related to genres.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/data/repositories/genresrepository/GenresRepository;", "", "fetchAvailableGenres", "", "Lcom/example/musify/domain/Genre;", "app_debug"})
public abstract interface GenresRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.musify.domain.Genre> fetchAvailableGenres();
}