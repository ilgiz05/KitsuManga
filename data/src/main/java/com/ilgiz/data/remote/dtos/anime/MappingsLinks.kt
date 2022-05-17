package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LinksXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXX.toDomain() = LinksXXXXXModel(
    self, related
)