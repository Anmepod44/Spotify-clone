package com.example.musify.di

import com.example.musify.data.remote.musicservice.SpotifyBaseUrls
import com.example.musify.data.remote.musicservice.SpotifyService
import com.example.musify.data.remote.token.tokenmanager.TokenManager
import com.example.musify.utils.Constants.CONNECTION_TIMEOUT
import com.example.musify.utils.Constants.READ_TIMEOUT
import com.example.musify.utils.Constants.WRITE_TIMEOUT
import com.example.musify.utils.defaultMusifyJacksonConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MusicServiceModule {
    @Provides
    @Singleton
    fun provideSpotifyService(): SpotifyService {
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(logger)
            .connectTimeout(
                CONNECTION_TIMEOUT.toLong(),
                TimeUnit.SECONDS
            )
            .readTimeout(
                READ_TIMEOUT.toLong(),
                TimeUnit.SECONDS
            )
            .writeTimeout(WRITE_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
       return Retrofit.Builder()
            .baseUrl(SpotifyBaseUrls.API_URL)
            .addConverterFactory(defaultMusifyJacksonConverterFactory)
           .client(client)
            .build()
            .create(SpotifyService::class.java)
    }
    @Provides
    @Singleton
    fun provideTokenManager(): TokenManager {

        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(logger)
            .connectTimeout(
                CONNECTION_TIMEOUT.toLong(),
                TimeUnit.SECONDS
            )
            .readTimeout(
                READ_TIMEOUT.toLong(),
                TimeUnit.SECONDS
            )
            .writeTimeout(WRITE_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()

        return Retrofit.Builder()
            .baseUrl(SpotifyBaseUrls.AUTHENTICATION_URL)
            .addConverterFactory(defaultMusifyJacksonConverterFactory)
            .client(client)
            .build()
            .create(TokenManager::class.java)
    }
}