package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksModel

data class LinksUI(
    val self: String,
)

fun LinksModel.toUI() = LinksUI(self)