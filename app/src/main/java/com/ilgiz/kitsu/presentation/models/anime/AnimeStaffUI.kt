package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.AnimeStaffModel

data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI,
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())