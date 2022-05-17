package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI,
)

fun GenresModel.toUI() = GenresUI(links.toUI())