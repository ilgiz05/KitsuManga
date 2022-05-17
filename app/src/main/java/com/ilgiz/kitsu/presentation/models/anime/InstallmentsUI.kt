package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI,
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())