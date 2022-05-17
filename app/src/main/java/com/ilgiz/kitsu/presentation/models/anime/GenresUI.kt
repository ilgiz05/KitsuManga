package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI,
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())