package com.ilgiz.data.remote.dtos.genres

import com.ilgiz.domain.models.genres.LinksModel
import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("last")
    val last: String,
    @SerializedName("first")
    val first: String,
)
fun LinksDto.toDomain() = LinksModel(last,first)