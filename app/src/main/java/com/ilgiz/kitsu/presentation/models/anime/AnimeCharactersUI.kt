package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.AnimeCharactersModel

data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI,
)

fun AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())