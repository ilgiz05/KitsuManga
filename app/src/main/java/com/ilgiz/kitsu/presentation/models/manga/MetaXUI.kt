package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI,
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
