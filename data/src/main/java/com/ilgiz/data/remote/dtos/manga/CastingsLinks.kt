package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.LinksXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXX.toDomain() = LinksXXXModel(
    self, related
)