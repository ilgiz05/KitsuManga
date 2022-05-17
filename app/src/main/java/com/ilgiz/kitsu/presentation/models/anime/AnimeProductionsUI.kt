package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.AnimeProductionsModel

data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI,
)

fun AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())