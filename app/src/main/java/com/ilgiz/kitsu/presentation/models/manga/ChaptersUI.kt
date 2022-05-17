package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.ChaptersModel


data class ChaptersUI(
    val links: LinksXXXXXXXXUI,
)

fun ChaptersModel.toUI() = ChaptersUI(links.toUI())