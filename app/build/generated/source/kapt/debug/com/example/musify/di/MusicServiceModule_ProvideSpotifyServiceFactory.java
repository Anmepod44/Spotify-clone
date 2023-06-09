// Generated by Dagger (https://dagger.dev).
package com.example.musify.di;

import com.example.musify.data.remote.musicservice.SpotifyService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MusicServiceModule_ProvideSpotifyServiceFactory implements Factory<SpotifyService> {
  @Override
  public SpotifyService get() {
    return provideSpotifyService();
  }

  public static MusicServiceModule_ProvideSpotifyServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SpotifyService provideSpotifyService() {
    return Preconditions.checkNotNullFromProvides(MusicServiceModule.INSTANCE.provideSpotifyService());
  }

  private static final class InstanceHolder {
    private static final MusicServiceModule_ProvideSpotifyServiceFactory INSTANCE = new MusicServiceModule_ProvideSpotifyServiceFactory();
  }
}