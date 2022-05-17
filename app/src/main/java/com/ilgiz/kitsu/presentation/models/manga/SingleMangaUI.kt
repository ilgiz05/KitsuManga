package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI,
)

fun SingleMangaModel.toUI() =
    SingleMangaUI(data.toUI())