package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.MetaXModel

data class MetaXUI(
    val dimensions: DimensionsXUI,
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())