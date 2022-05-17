package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXModel.toUI() = LinksXXXUI(self, related)