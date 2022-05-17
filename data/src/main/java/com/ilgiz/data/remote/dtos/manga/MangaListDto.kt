package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.MangaListModel
import com.google.gson.annotations.SerializedName

data class MangaListDto(
    @SerializedName("data")
    val data: List<MangaData>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX,
)

fun MangaListDto.toDomain() =
    MangaListModel(
        data.map { it.toDomain() },
        meta.toDomain(),
        links.toDomain()
    )