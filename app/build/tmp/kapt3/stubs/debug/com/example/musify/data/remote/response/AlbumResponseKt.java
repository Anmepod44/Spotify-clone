package com.example.musify.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\b\u001a\u00020\u0002*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b\u00a8\u0006\r"}, d2 = {"getTracks", "", "Lcom/example/musify/domain/SearchResult$TrackSearchResult;", "Lcom/example/musify/data/remote/response/AlbumResponse;", "imageSize", "Lcom/example/musify/data/utils/MapperImageSize;", "toAlbumSearchResult", "Lcom/example/musify/domain/SearchResult$AlbumSearchResult;", "toTrackSearchResult", "Lcom/example/musify/data/remote/response/AlbumResponse$TrackResponseWithoutAlbumMetadataResponse;", "albumArtImageUrlString", "", "albumArtistsString", "app_debug"})
public final class AlbumResponseKt {
    
    /**
     * A mapper function used to map an instance of [AlbumResponse] to
     * an instance of [SearchResult.AlbumSearchResult]. The [imageSize]
     * parameter describes the size of image to be used for the
     * [SearchResult.AlbumSearchResult] instance.
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.domain.SearchResult.AlbumSearchResult toAlbumSearchResult(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.AlbumResponse $this$toAlbumSearchResult, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize) {
        return null;
    }
    
    /**
     * A utility function used to get a list of [SearchResult.TrackSearchResult]s
     * associated with a [AlbumResponse].
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.example.musify.domain.SearchResult.TrackSearchResult> getTracks(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.AlbumResponse $this$getTracks, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.utils.MapperImageSize imageSize) {
        return null;
    }
    
    /**
     * A mapper function used to map an instance of [AlbumResponse.TrackResponseWithoutAlbumMetadataResponse]
     * to an instance of [SearchResult.TrackSearchResult].
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.domain.SearchResult.TrackSearchResult toTrackSearchResult(@org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.response.AlbumResponse.TrackResponseWithoutAlbumMetadataResponse $this$toTrackSearchResult, @org.jetbrains.annotations.NotNull()
    java.lang.String albumArtImageUrlString, @org.jetbrains.annotations.NotNull()
    java.lang.String albumArtistsString) {
        return null;
    }
}