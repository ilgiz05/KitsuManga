package com.ilgiz.kitsu.presentation.models.genres

import com.ilgiz.domain.models.genres.LinksModel

data class LinksUi(
    val last: String,
    val first: String,
)

fun LinksModel.toUI() = LinksUi(last, first)