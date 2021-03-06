package com.ilgiz.kitsu.di

import com.ilgiz.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Singleton
    @Provides
    fun provideAnimeApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideAnimeApiService()

    @Singleton
    @Provides
    fun provideMangaApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideMangaApiService()

    @Singleton
    @Provides
    fun provideAuthenticationApiService(authenticationClient: RetrofitClient.AuthenticationClient) =
        authenticationClient.provideAuthenticationApiService()
    @Singleton
    @Provides
    fun provideGenresApiService(retrofitClient: RetrofitClient) = retrofitClient.provideGenresApiService()
}