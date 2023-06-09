// Generated by Dagger (https://dagger.dev).
package com.example.musify.data.repositories.homefeedrepository;

import com.example.musify.data.remote.musicservice.SpotifyService;
import com.example.musify.data.repositories.tokenrepository.TokenRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MusifyHomeFeedRepository_Factory implements Factory<MusifyHomeFeedRepository> {
  private final Provider<SpotifyService> spotifyServiceProvider;

  private final Provider<TokenRepository> tokenRepositoryProvider;

  public MusifyHomeFeedRepository_Factory(Provider<SpotifyService> spotifyServiceProvider,
      Provider<TokenRepository> tokenRepositoryProvider) {
    this.spotifyServiceProvider = spotifyServiceProvider;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
  }

  @Override
  public MusifyHomeFeedRepository get() {
    return newInstance(spotifyServiceProvider.get(), tokenRepositoryProvider.get());
  }

  public static MusifyHomeFeedRepository_Factory create(
      Provider<SpotifyService> spotifyServiceProvider,
      Provider<TokenRepository> tokenRepositoryProvider) {
    return new MusifyHomeFeedRepository_Factory(spotifyServiceProvider, tokenRepositoryProvider);
  }

  public static MusifyHomeFeedRepository newInstance(SpotifyService spotifyService,
      TokenRepository tokenRepository) {
    return new MusifyHomeFeedRepository(spotifyService, tokenRepository);
  }
}
