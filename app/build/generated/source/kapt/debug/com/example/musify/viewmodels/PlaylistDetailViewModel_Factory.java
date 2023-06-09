// Generated by Dagger (https://dagger.dev).
package com.example.musify.viewmodels;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.example.musify.data.repositories.tracksrepository.TracksRepository;
import com.example.musify.usecases.getCurrentlyPlayingTrackUseCase.GetCurrentlyPlayingTrackUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlaylistDetailViewModel_Factory implements Factory<PlaylistDetailViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<TracksRepository> tracksRepositoryProvider;

  private final Provider<GetCurrentlyPlayingTrackUseCase> getCurrentlyPlayingTrackUseCaseProvider;

  public PlaylistDetailViewModel_Factory(Provider<Application> applicationProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<TracksRepository> tracksRepositoryProvider,
      Provider<GetCurrentlyPlayingTrackUseCase> getCurrentlyPlayingTrackUseCaseProvider) {
    this.applicationProvider = applicationProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.tracksRepositoryProvider = tracksRepositoryProvider;
    this.getCurrentlyPlayingTrackUseCaseProvider = getCurrentlyPlayingTrackUseCaseProvider;
  }

  @Override
  public PlaylistDetailViewModel get() {
    return newInstance(applicationProvider.get(), savedStateHandleProvider.get(), tracksRepositoryProvider.get(), getCurrentlyPlayingTrackUseCaseProvider.get());
  }

  public static PlaylistDetailViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<TracksRepository> tracksRepositoryProvider,
      Provider<GetCurrentlyPlayingTrackUseCase> getCurrentlyPlayingTrackUseCaseProvider) {
    return new PlaylistDetailViewModel_Factory(applicationProvider, savedStateHandleProvider, tracksRepositoryProvider, getCurrentlyPlayingTrackUseCaseProvider);
  }

  public static PlaylistDetailViewModel newInstance(Application application,
      SavedStateHandle savedStateHandle, TracksRepository tracksRepository,
      GetCurrentlyPlayingTrackUseCase getCurrentlyPlayingTrackUseCase) {
    return new PlaylistDetailViewModel(application, savedStateHandle, tracksRepository, getCurrentlyPlayingTrackUseCase);
  }
}