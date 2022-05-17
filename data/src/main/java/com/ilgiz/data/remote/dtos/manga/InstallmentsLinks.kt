package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.LinksXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXX.toDomain() = LinksXXXXModel(
    self, related
)