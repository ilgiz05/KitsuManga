package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LinksXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String,
)

fun LinksXXXXXXXXXXXXX.toDomain() =
    LinksXXXXXXXXXXXXXModel(
        first, prev, next, last
    )