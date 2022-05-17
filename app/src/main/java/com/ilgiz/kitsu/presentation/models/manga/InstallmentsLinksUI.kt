package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)