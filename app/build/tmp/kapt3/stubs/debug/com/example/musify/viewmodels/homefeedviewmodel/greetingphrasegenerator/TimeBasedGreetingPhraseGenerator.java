package com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator;

import java.lang.System;

/**
 * A concrete implementation of [GreetingPhraseGenerator] that generates
 * greeting phrases based on the provided [time] value. By default the
 * [time] property is set to [LocalTime.now].
 * @see CurrentTimeBasedGreetingPhraseGenerator
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/TimeBasedGreetingPhraseGenerator;", "Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/GreetingPhraseGenerator;", "time", "Ljava/time/LocalTime;", "(Ljava/time/LocalTime;)V", "generatePhrase", "", "app_debug"})
public final class TimeBasedGreetingPhraseGenerator implements com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator.GreetingPhraseGenerator {
    private final java.time.LocalTime time = null;
    
    public TimeBasedGreetingPhraseGenerator() {
        super();
    }
    
    public TimeBasedGreetingPhraseGenerator(@org.jetbrains.annotations.NotNull()
    java.time.LocalTime time) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String generatePhrase() {
        return null;
    }
}