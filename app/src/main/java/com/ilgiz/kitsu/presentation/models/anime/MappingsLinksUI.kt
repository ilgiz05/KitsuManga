package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)