package com.example.musify.viewmodels.homefeedviewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002JU\u0010 \u001a\u00020\u001a\"\u0004\b\u0000\u0010!*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020$0#0\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a0&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020\u001a0&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(JA\u0010)\u001a\u00020\u001a\"\u0004\b\u0000\u0010!*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020$0#0\"2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020\u001a0&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/musify/viewmodels/homefeedviewmodel/HomeFeedViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "greetingPhraseGenerator", "Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/GreetingPhraseGenerator;", "homeFeedRepository", "Lcom/example/musify/data/repositories/homefeedrepository/HomeFeedRepository;", "(Landroid/app/Application;Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/GreetingPhraseGenerator;Lcom/example/musify/data/repositories/homefeedrepository/HomeFeedRepository;)V", "_homeFeedCarousels", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/musify/domain/HomeFeedCarousel;", "_uiState", "Lcom/example/musify/viewmodels/homefeedviewmodel/HomeFeedViewModel$HomeFeedUiState;", "greetingPhrase", "", "getGreetingPhrase", "()Ljava/lang/String;", "homeFeedCarousels", "Landroidx/compose/runtime/State;", "getHomeFeedCarousels", "()Landroidx/compose/runtime/State;", "uiState", "getUiState", "fetchAndAssignHomeFeedCarousels", "", "refreshFeed", "toHomeFeedCarouselCardInfo", "Lcom/example/musify/domain/HomeFeedCarouselCardInfo;", "searchResult", "Lcom/example/musify/domain/SearchResult;", "awaitFetchedResource", "FetchedResourceType", "Lkotlinx/coroutines/Deferred;", "Lcom/example/musify/data/utils/FetchedResource;", "Lcom/example/musify/domain/MusifyErrorType;", "onError", "Lkotlin/Function1;", "onSuccess", "(Lkotlinx/coroutines/Deferred;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFetchedResourceUpdatingUiState", "(Lkotlinx/coroutines/Deferred;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeFeedUiState", "app_debug"})
public final class HomeFeedViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.musify.data.repositories.homefeedrepository.HomeFeedRepository homeFeedRepository = null;
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.musify.domain.HomeFeedCarousel>> _homeFeedCarousels = null;
    private final androidx.compose.runtime.MutableState<com.example.musify.viewmodels.homefeedviewmodel.HomeFeedViewModel.HomeFeedUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.musify.viewmodels.homefeedviewmodel.HomeFeedViewModel.HomeFeedUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.HomeFeedCarousel>> homeFeedCarousels = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String greetingPhrase = null;
    
    @javax.inject.Inject()
    public HomeFeedViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator.GreetingPhraseGenerator greetingPhraseGenerator, @org.jetbrains.annotations.NotNull()
    com.example.musify.data.repositories.homefeedrepository.HomeFeedRepository homeFeedRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.musify.viewmodels.homefeedviewmodel.HomeFeedViewModel.HomeFeedUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.util.List<com.example.musify.domain.HomeFeedCarousel>> getHomeFeedCarousels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGreetingPhrase() {
        return null;
    }
    
    private final void fetchAndAssignHomeFeedCarousels() {
    }
    
    public final void refreshFeed() {
    }
    
    /**
     * A utility function that sets the appropriate [_uiState] based on
     * the result of [Deferred.await]. It uses [awaitFetchedResource]
     * under the hood. This utility function manages the [_uiState]
     * on its own without requiring the caller to explicitly pass the
     * "onError" and "onSuccess" callbacks to the [awaitFetchedResource].
     * @see [awaitFetchedResource]
     */
    private final <FetchedResourceType extends java.lang.Object>java.lang.Object awaitFetchedResourceUpdatingUiState(kotlinx.coroutines.Deferred<? extends com.example.musify.data.utils.FetchedResource<FetchedResourceType, com.example.musify.domain.MusifyErrorType>> $this$awaitFetchedResourceUpdatingUiState, kotlin.jvm.functions.Function1<? super FetchedResourceType, kotlin.Unit> onSuccess, kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    /**
     * A method that will await the result of the deferred object and execute the
     * [onSuccess] lambda if, and only if, the call to [Deferred.await] returned an instance
     * of [FetchedResource.Success]. The [onSuccess] has a parameter that will provide
     * the [FetchedResourceType], which represents the type of data that will be
     * encapsulated within the [FetchedResource.Success] class. In other words,
     * the [onSuccess]'s parameter will contain [FetchedResource.Success.data].
     */
    private final <FetchedResourceType extends java.lang.Object>java.lang.Object awaitFetchedResource(kotlinx.coroutines.Deferred<? extends com.example.musify.data.utils.FetchedResource<FetchedResourceType, com.example.musify.domain.MusifyErrorType>> $this$awaitFetchedResource, kotlin.jvm.functions.Function1<? super com.example.musify.domain.MusifyErrorType, kotlin.Unit> onError, kotlin.jvm.functions.Function1<? super FetchedResourceType, kotlin.Unit> onSuccess, kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    private final com.example.musify.domain.HomeFeedCarouselCardInfo toHomeFeedCarouselCardInfo(com.example.musify.domain.SearchResult searchResult) {
        return null;
    }
    
    /**
     * An enum class that contains the different UI states associated
     * with a screen that displays the home feed.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/musify/viewmodels/homefeedviewmodel/HomeFeedViewModel$HomeFeedUiState;", "", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "ERROR", "app_debug"})
    public static enum HomeFeedUiState {
        /*public static final*/ IDLE /* = new IDLE() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        HomeFeedUiState() {
        }
    }
}