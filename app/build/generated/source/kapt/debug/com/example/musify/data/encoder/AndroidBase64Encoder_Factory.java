// Generated by Dagger (https://dagger.dev).
package com.example.musify.data.encoder;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AndroidBase64Encoder_Factory implements Factory<AndroidBase64Encoder> {
  @Override
  public AndroidBase64Encoder get() {
    return newInstance();
  }

  public static AndroidBase64Encoder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AndroidBase64Encoder newInstance() {
    return new AndroidBase64Encoder();
  }

  private static final class InstanceHolder {
    private static final AndroidBase64Encoder_Factory INSTANCE = new AndroidBase64Encoder_Factory();
  }
}