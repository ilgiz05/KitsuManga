package com.ilgiz.domain.repositories

import com.ilgiz.domain.either.Either
import com.ilgiz.domain.models.genres.GenresModel
import kotlinx.coroutines.flow.Flow

interface GenresRepository {
    fun fetchAnimeGenres(id: String): Flow<Either<String, GenresModel>>
}