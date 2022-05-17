package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)