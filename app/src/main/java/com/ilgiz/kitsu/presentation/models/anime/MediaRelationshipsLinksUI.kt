package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String,
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)