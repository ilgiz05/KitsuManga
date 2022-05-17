package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.MediumModel
import com.google.gson.annotations.SerializedName

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun Medium.toDomain() = MediumModel(width, height)