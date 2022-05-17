package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.LinksModel
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String,
)

fun Links.toDomain() = LinksModel(
    self
)