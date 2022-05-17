package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.MappingsModel
import com.google.gson.annotations.SerializedName

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX,
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())