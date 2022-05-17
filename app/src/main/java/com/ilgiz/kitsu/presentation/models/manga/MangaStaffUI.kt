package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.MangaStaffModel

data class MangaStaffUI(
    val links: LinksXXXXXXXXXXUI,
)

fun MangaStaffModel.toUI() = MangaStaffUI(links.toUI())