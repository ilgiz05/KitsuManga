package com.ilgiz.kitsu.presentation.ui.fragments.main.anime

import com.ilgiz.data.repositories.AnimeRepositoryImpl
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl,
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPageAnime().collectPagingRequest {
            it.toUI()
        }
}