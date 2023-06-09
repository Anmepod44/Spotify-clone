// Generated by Dagger (https://dagger.dev).
package com.example.musify.di;

import com.example.musify.data.remote.token.tokenmanager.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MusicServiceModule_ProvideTokenManagerFactory implements Factory<TokenManager> {
  @Override
  public TokenManager get() {
    return provideTokenManager();
  }

  public static MusicServiceModule_ProvideTokenManagerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TokenManager provideTokenManager() {
    return Preconditions.checkNotNullFromProvides(MusicServiceModule.INSTANCE.provideTokenManager());
  }

  private static final class InstanceHolder {
    private static final MusicServiceModule_ProvideTokenManagerFactory INSTANCE = new MusicServiceModule_ProvideTokenManagerFactory();
  }
}
