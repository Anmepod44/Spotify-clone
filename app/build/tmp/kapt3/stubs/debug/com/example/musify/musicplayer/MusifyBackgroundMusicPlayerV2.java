package com.example.musify.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/example/musify/musicplayer/MusifyBackgroundMusicPlayerV2;", "Lcom/example/musify/musicplayer/MusicPlayerV2;", "context", "Landroid/content/Context;", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "(Landroid/content/Context;Lcom/google/android/exoplayer2/ExoPlayer;)V", "currentPlaybackStateStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState;", "getCurrentPlaybackStateStream", "()Lkotlinx/coroutines/flow/Flow;", "currentlyPlayingTrack", "Lcom/example/musify/musicplayer/MusicPlayerV2$Track;", "notificationManagerBuilder", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$Builder;", "getNotificationManagerBuilder", "()Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$Builder;", "notificationManagerBuilder$delegate", "Lkotlin/Lazy;", "buildPlayingState", "Lcom/example/musify/musicplayer/MusicPlayerV2$PlaybackState$Playing;", "track", "player", "Lcom/google/android/exoplayer2/Player;", "createEventsListener", "Lcom/google/android/exoplayer2/Player$Listener;", "onEvents", "Lkotlin/Function2;", "Lcom/google/android/exoplayer2/Player$Events;", "", "pauseCurrentlyPlayingTrack", "playTrack", "stopPlayingTrack", "tryResume", "", "Companion", "app_debug"})
public final class MusifyBackgroundMusicPlayerV2 implements com.example.musify.musicplayer.MusicPlayerV2 {
    private final com.google.android.exoplayer2.ExoPlayer exoPlayer = null;
    private com.example.musify.musicplayer.MusicPlayerV2.Track currentlyPlayingTrack;
    private final kotlin.Lazy notificationManagerBuilder$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.musify.musicplayer.MusicPlayerV2.PlaybackState> currentPlaybackStateStream = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.musify.musicplayer.MusifyBackgroundMusicPlayerV2.Companion Companion = null;
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "com.example.musify.musicplayer.MusicPlayerV2Service.NOTIFICATION_CHANNEL_ID";
    private static final int NOTIFICATION_ID = 1;
    
    @javax.inject.Inject()
    public MusifyBackgroundMusicPlayerV2(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        super();
    }
    
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder getNotificationManagerBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.example.musify.musicplayer.MusicPlayerV2.PlaybackState> getCurrentPlaybackStateStream() {
        return null;
    }
    
    private final com.google.android.exoplayer2.Player.Listener createEventsListener(kotlin.jvm.functions.Function2<? super com.google.android.exoplayer2.Player, ? super com.google.android.exoplayer2.Player.Events, kotlin.Unit> onEvents) {
        return null;
    }
    
    private final com.example.musify.musicplayer.MusicPlayerV2.PlaybackState.Playing buildPlayingState(com.example.musify.musicplayer.MusicPlayerV2.Track track, com.google.android.exoplayer2.Player player) {
        return null;
    }
    
    @java.lang.Override()
    public void playTrack(@org.jetbrains.annotations.NotNull()
    com.example.musify.musicplayer.MusicPlayerV2.Track track) {
    }
    
    @java.lang.Override()
    public void pauseCurrentlyPlayingTrack() {
    }
    
    @java.lang.Override()
    public void stopPlayingTrack() {
    }
    
    @java.lang.Override()
    public boolean tryResume() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/musify/musicplayer/MusifyBackgroundMusicPlayerV2$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}