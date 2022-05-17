package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.SmallXModel
import com.google.gson.annotations.SerializedName

data class SmallX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun SmallX.toDomain() = SmallXModel(width, height)