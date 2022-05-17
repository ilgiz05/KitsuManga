package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI,
)

fun CastingsModel.toUI() = CastingsUI(
    links.toUI()
)