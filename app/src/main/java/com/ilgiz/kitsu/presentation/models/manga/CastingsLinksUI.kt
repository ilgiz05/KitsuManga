package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXModel.toUI() = LinksXXXUI(
    self, related
)