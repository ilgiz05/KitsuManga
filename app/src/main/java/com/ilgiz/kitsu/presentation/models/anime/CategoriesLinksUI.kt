package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String,
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)