package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LinksModel
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String,
)

fun Links.toDomain() = LinksModel(self)