package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXXXXXModel

data class LinksXXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)