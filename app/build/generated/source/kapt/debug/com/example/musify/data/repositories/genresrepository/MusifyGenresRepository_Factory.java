// Generated by Dagger (https://dagger.dev).
package com.example.musify.data.repositories.genresrepository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MusifyGenresRepository_Factory implements Factory<MusifyGenresRepository> {
  @Override
  public MusifyGenresRepository get() {
    return newInstance();
  }

  public static MusifyGenresRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MusifyGenresRepository newInstance() {
    return new MusifyGenresRepository();
  }

  private static final class InstanceHolder {
    private static final MusifyGenresRepository_Factory INSTANCE = new MusifyGenresRepository_Factory();
  }
}