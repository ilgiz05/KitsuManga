package com.ilgiz.kitsu.presentation.models.genres

import com.ilgiz.domain.models.genres.GenresModel

data class GenresUi(
    val data: List<DataItemUi>?,
    val meta: MetaUi,
    val links: LinksUi,
)

fun GenresModel.toUI() = GenresUi(data?.map { it.toUI() }, meta.toUI(), links.toUI())