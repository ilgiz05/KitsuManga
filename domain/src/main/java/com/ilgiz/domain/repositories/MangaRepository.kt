package com.ilgiz.domain.repositories

import com.ilgiz.domain.either.Either
import com.ilgiz.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(id: String): Flow<Either<String, SingleMangaModel>>
}