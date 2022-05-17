package com.ilgiz.domain.models.genres

data class GenresModel(
    val data: List<DataItemModels>?,
    val meta: MetaModel,
    val links: LinksModel,
)