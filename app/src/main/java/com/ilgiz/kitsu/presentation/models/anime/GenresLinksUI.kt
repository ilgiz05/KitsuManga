package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String,
)

fun LinksXModel.toUI() = LinksXUI(self, related)