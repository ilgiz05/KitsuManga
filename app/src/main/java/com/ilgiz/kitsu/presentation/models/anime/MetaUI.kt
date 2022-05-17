package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.MetaModel

data class MetaUI(
    val dimensions: DimensionsUI,
)

fun MetaModel.toUI() = MetaUI(
    dimensionsModel.toUI()
)