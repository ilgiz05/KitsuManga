package com.ilgiz.data.repositories

import com.ilgiz.data.remote.apiservice.GenresApiService
import com.ilgiz.data.remote.dtos.genres.toDomain
import com.ilgiz.data.repositories.base.BaseRepository
import com.ilgiz.domain.repositories.GenresRepository
import javax.inject.Inject

class GenresRepositoryImpl @Inject constructor(
    private val genresApiService: GenresApiService,
) : BaseRepository(), GenresRepository {

    override fun fetchAnimeGenres(id: String) = sendRequest {
        genresApiService.fetchGenresAnime(id).toDomain()
    }

}