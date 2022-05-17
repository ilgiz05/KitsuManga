package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)