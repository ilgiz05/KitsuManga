package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String,
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)