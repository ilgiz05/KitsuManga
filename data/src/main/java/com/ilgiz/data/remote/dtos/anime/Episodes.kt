package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.EpisodesModel
import com.google.gson.annotations.SerializedName

data class Episodes(
    @SerializedName("links")
    val links: LinksXXXXXXXX,
)

fun Episodes.toDomain() = EpisodesModel(
    links.toDomain()
)