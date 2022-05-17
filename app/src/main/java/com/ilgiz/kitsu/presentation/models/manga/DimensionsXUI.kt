package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI,
)

fun DimensionsXModel.toUI() =
    DimensionsXUI(tiny.toUI(),
        small.toUI(),
        large.toUI())