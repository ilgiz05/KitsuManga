package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.CastingsModel
import com.google.gson.annotations.SerializedName

data class Castings(
    @SerializedName("links")
    val links: LinksXXX,
)

fun Castings.toDomain() = CastingsModel(
    links.toDomain()
)