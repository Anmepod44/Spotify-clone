package com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator;

import java.lang.System;

/**
 * A [GreetingPhraseGenerator] that uses [TimeBasedGreetingPhraseGenerator]
 * under the hood by passing [LocalTime.now] to its constructor. This class
 * was mainly created because default constructor parameters causes an exception
 * when injecting. A constructor with default arguments will generate two constructors
 * in java that are annotated with [Inject]. This will cause ambiguity for the hilt
 * annotation processor. In order to circumvent this, inject this class instead of
 * directly using [TimeBasedGreetingPhraseGenerator]. If the logic of that class
 * is to be tested, use that class by passing the time to be tested directly in its
 * constructor.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/CurrentTimeBasedGreetingPhraseGenerator;", "Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/GreetingPhraseGenerator;", "()V", "generatePhrase", "", "app_debug"})
public final class CurrentTimeBasedGreetingPhraseGenerator implements com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator.GreetingPhraseGenerator {
    
    @javax.inject.Inject()
    public CurrentTimeBasedGreetingPhraseGenerator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String generatePhrase() {
        return null;
    }
}