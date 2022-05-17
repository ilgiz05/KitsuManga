package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(
    self, related
)