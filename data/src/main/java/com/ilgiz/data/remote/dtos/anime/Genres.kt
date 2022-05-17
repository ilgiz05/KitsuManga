package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.GenresModel
import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksX,
)

fun Genres.toDomain() = GenresModel(
    links.toDomain()
)
