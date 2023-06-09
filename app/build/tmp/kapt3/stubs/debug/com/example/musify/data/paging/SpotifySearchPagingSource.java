package com.example.musify.data.paging;

import java.lang.System;

/**
 * A paging source that is used to get a paginated list of
 * results, of type [T], for the corresponding searchQuery.
 * Note: **The [SearchResultsResponse] parameter provided to the resultsBlock
 * will be based on the searchQueryType**. Only the field corresponding
 * to that [SearchQueryType] will be returned. All other lists would
 * be null.
 *
 * Eg. If [SearchQueryType.TRACK] is passed, all the fields except
 * [SearchResultsResponse.tracks] will be null in the [SearchResultsResponse]
 * instance passed to the resultsBlock.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/musify/data/paging/SpotifySearchPagingSource;", "T", "Lcom/example/musify/domain/SearchResult;", "Lcom/example/musify/data/paging/SpotifyPagingSource;", "searchQuery", "", "countryCode", "searchQueryType", "Lcom/example/musify/data/remote/musicservice/SearchQueryType;", "tokenRepository", "Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;", "spotifyService", "Lcom/example/musify/data/remote/musicservice/SpotifyService;", "resultsBlock", "Lkotlin/Function1;", "Lcom/example/musify/data/remote/response/SearchResultsResponse;", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/musify/data/remote/musicservice/SearchQueryType;Lcom/example/musify/data/repositories/tokenrepository/TokenRepository;Lcom/example/musify/data/remote/musicservice/SpotifyService;Lkotlin/jvm/functions/Function1;)V", "app_debug"})
public final class SpotifySearchPagingSource<T extends com.example.musify.domain.SearchResult> extends com.example.musify.data.paging.SpotifyPagingSource<T> {
    
    public SpotifySearchPagingSource(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SearchQueryType searchQueryType, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.tokenrepository.TokenRepository tokenRepository, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.remote.musicservice.SpotifyService spotifyService, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.musify.data.remote.response.SearchResultsResponse, ? extends java.util.List<? extends T>> resultsBlock) {
        super(null);
    }
}