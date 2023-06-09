package com.example.musify.viewmodels.homefeedviewmodel.greetingphrasegenerator;

import java.lang.System;

/**
 * An interface that contains the requisite functions required for a
 * class that is responsible for generating a greeting phrase.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/musify/viewmodels/homefeedviewmodel/greetingphrasegenerator/GreetingPhraseGenerator;", "", "generatePhrase", "", "app_debug"})
public abstract interface GreetingPhraseGenerator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generatePhrase();
}