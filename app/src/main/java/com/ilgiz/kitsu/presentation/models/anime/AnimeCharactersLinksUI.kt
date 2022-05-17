package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(self, related)