package com.ilgiz.kitsu.di

import com.ilgiz.data.repositories.AnimeRepositoryImpl
import com.ilgiz.data.repositories.AuthenticationRepositoryImpl
import com.ilgiz.data.repositories.GenresRepositoryImpl
import com.ilgiz.data.repositories.MangaRepositoryImpl
import com.ilgiz.domain.repositories.AnimeRepository
import com.ilgiz.domain.repositories.AuthenticationRepository
import com.ilgiz.domain.repositories.GenresRepository
import com.ilgiz.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    abstract fun provideMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract fun provideAuthenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository

    @Binds
    abstract fun provideGenresRepository(genresRepositoryImpl: GenresRepositoryImpl): GenresRepository
}