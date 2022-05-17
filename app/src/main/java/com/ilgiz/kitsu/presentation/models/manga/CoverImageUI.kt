package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.CoverImageModel

data class CoverImageUI(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXUI,
)

fun CoverImageModel.toUI() = CoverImageUI(tiny, small, large, original,
    meta.toUI())