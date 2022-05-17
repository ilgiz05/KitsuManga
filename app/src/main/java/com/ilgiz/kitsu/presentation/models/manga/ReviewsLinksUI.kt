package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
