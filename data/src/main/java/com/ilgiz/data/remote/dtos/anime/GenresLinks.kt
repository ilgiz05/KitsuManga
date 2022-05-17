package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LinksXModel
import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksX.toDomain() = LinksXModel(
    self, related
)