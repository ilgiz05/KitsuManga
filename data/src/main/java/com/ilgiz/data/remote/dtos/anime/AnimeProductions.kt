package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.AnimeProductionsModel
import com.google.gson.annotations.SerializedName

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX,
)

fun AnimeProductions.toDomain() = AnimeProductionsModel(

    links.toDomain()
)