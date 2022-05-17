package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)