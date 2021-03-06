package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.PosterImageModel

data class PosterImageUI(
    val tiny: String,
    val small: String,
    val medium: String,
    val large: String,
    val original: String,
    val meta: MetaUI,
)

fun PosterImageModel.toUI() = PosterImageUI(tiny, small, medium, large, original,
    meta.toUI())