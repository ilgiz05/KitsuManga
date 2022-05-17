package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI,
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())