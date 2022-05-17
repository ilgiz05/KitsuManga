package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)