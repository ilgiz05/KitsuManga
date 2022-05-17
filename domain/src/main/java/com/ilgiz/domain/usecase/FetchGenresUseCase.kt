package com.ilgiz.domain.usecase

import com.ilgiz.domain.repositories.GenresRepository
import javax.inject.Inject

class FetchGenresUseCase @Inject constructor(
    private val genresRepository: GenresRepository
) {
    operator fun invoke(id : String) = genresRepository.fetchAnimeGenres(id)
}