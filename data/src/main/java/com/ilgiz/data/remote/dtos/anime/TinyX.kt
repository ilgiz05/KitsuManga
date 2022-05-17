package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.TinyXModel
import com.google.gson.annotations.SerializedName

data class TinyX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun TinyX.toDomain() = TinyXModel(width, height)