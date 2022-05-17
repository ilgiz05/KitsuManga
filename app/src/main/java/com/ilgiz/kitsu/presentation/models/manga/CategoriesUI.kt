package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI,
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())