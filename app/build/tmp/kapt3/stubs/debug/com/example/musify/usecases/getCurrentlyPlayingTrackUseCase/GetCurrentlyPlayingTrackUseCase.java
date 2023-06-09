package com.example.musify.usecases.getCurrentlyPlayingTrackUseCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/usecases/getCurrentlyPlayingTrackUseCase/GetCurrentlyPlayingTrackUseCase;", "", "getCurrentlyPlayingTrackStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "app_debug"})
public abstract interface GetCurrentlyPlayingTrackUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.musify.domain.SearchResult.TrackSearchResult> getCurrentlyPlayingTrackStream();
}