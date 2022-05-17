package com.ilgiz.data.remote.dtos.manga

import com.google.gson.annotations.SerializedName
import com.ilgiz.domain.models.manga.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Medium.toDomain() = MediumModel(width, height)