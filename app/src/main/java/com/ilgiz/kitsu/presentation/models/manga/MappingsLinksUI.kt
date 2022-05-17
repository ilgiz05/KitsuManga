package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)