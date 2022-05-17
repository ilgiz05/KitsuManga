package com.ilgiz.domain.models.manga

data class MangaDataModel(
    val id: String,
    val type: String,
    val links: LinksModel,
    val mangaDto: MangaModel,
    val relationships: RelationshipsModel,
)