// Generated by Dagger (https://dagger.dev).
package com.example.musify.usecases.getCurrentlyPlayingTrackUseCase;

import com.example.musify.musicplayer.MusicPlayerV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MusifyGetCurrentlyPlayingTrackUseCase_Factory implements Factory<MusifyGetCurrentlyPlayingTrackUseCase> {
  private final Provider<MusicPlayerV2> musicPlayerProvider;

  public MusifyGetCurrentlyPlayingTrackUseCase_Factory(
      Provider<MusicPlayerV2> musicPlayerProvider) {
    this.musicPlayerProvider = musicPlayerProvider;
  }

  @Override
  public MusifyGetCurrentlyPlayingTrackUseCase get() {
    return newInstance(musicPlayerProvider.get());
  }

  public static MusifyGetCurrentlyPlayingTrackUseCase_Factory create(
      Provider<MusicPlayerV2> musicPlayerProvider) {
    return new MusifyGetCurrentlyPlayingTrackUseCase_Factory(musicPlayerProvider);
  }

  public static MusifyGetCurrentlyPlayingTrackUseCase newInstance(MusicPlayerV2 musicPlayer) {
    return new MusifyGetCurrentlyPlayingTrackUseCase(musicPlayer);
  }
}
