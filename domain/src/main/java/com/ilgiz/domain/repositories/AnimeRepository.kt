package com.ilgiz.domain.repositories

import com.ilgiz.domain.either.Either
import com.ilgiz.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime(id: String): Flow<Either<String, SingleAnimeModel>>
}