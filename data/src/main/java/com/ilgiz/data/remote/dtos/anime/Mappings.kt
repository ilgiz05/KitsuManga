package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.MappingsModel
import com.google.gson.annotations.SerializedName

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX,
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())