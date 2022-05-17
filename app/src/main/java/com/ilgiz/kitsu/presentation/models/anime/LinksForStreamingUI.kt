package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)