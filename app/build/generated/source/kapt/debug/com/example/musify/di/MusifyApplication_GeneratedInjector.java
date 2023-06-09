package com.example.musify.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MusifyApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MusifyApplication_GeneratedInjector {
  void injectMusifyApplication(MusifyApplication musifyApplication);
}
