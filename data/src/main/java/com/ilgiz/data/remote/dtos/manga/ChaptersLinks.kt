package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.LinksXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,

    )

fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(
    self, related
)