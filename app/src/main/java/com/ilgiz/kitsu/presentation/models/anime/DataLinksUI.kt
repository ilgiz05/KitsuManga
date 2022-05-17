package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksModel

data class LinksUI(
    val self: String,
)

fun LinksModel.toUI() = LinksUI(
    self
)