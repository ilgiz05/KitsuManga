package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.EpisodesModel

data class EpisodesUI(
    val links: LinksXXXXXXXXUI,
)

fun EpisodesModel.toUI() = EpisodesUI(links.toUI())
