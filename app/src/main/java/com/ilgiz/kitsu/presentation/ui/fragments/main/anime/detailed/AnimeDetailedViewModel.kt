package com.ilgiz.kitsu.presentation.ui.fragments.main.anime.detailed

import com.ilgiz.domain.usecase.FetchAnimeUseCase
import com.ilgiz.domain.usecase.FetchGenresUseCase
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.anime.SingleAnimeUI
import com.ilgiz.kitsu.presentation.models.anime.toUI
import com.ilgiz.kitsu.presentation.models.genres.GenresUi
import com.ilgiz.kitsu.presentation.models.genres.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeDetailedViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase,
    private val fetchGenresUseCase: FetchGenresUseCase,
) : BaseViewModel() {
    private val _animeDetailedState = mutableUiStateFlow<SingleAnimeUI>()
    var animeDetailedState = _animeDetailedState.asStateFlow()

    private val _animeGenresState = mutableUiStateFlow<GenresUi>()
    var animeGenresState = _animeGenresState.asStateFlow()

    fun fetchADetailedAnime(id: String) =
        fetchAnimeUseCase(id).gatherRequest(_animeDetailedState) { it.toUI() }

    fun fetchGenres(id: String) =
        fetchGenresUseCase(id).gatherRequest(_animeGenresState) { it.toUI() }
}