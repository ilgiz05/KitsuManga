package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.LargeXModel
import com.google.gson.annotations.SerializedName

data class LargeX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun LargeX.toDomain() = LargeXModel(width, height)