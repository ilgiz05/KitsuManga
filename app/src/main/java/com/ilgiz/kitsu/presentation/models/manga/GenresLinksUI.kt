package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String,
)

fun LinksXModel.toUI() = LinksXUI(self, related)