package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI,
)

fun MangaCharactersModel.toUI() =
    MangaCharactersUI(links.toUI())