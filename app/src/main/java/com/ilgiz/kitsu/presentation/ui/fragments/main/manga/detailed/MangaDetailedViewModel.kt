package com.ilgiz.kitsu.presentation.ui.fragments.main.manga.detailed

import com.ilgiz.domain.usecase.FetchMangaUseCase
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.manga.SingleMangaUI
import com.ilgiz.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MangaDetailedViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase,
) : BaseViewModel() {
    private val _mangaDetailedState = mutableUiStateFlow<SingleMangaUI>()
    var mangaDetailedState = _mangaDetailedState.asStateFlow()

    fun fetchDetailedManga(id: String) =
        fetchMangaUseCase(id).gatherRequest(_mangaDetailedState) { it.toUI() }
}
