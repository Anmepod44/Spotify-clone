package com.example.musify.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"}, d2 = {"toPlaylistSearchResult", "Lcom/example/musify/domain/SearchResult$PlaylistSearchResult;", "Lcom/example/musify/data/remote/response/PlaylistMetadataResponse;", "app_debug"})
public final class PlaylistMetadataResponseKt {
    
    /**
     * A mapper function used to map an instance of [PlaylistMetadataResponse] to
     * an instance of [PlaylistSearchResult].
     *
     * Note:[getImageResponseForImageSize] cannot be used because playlists usually
     * contain only a single image. Therefore, the url of the first image
     * is mapped to [PlaylistSearchResult.imageUrlString].
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.domain.SearchResult.PlaylistSearchResult toPlaylistSearchResult(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.PlaylistMetadataResponse $this$toPlaylistSearchResult) {
        return null;
    }
}