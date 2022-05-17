package com.ilgiz.data.remote.dtos.genres

import com.ilgiz.domain.models.genres.DataItemModels
import com.google.gson.annotations.SerializedName

data class DataItemDto(
    @SerializedName("links")
    val links: LinksDto,
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
)

fun DataItemDto.toDomain() = DataItemModels(links.toDomain(), attributes.toDomain(), id, type)