package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.TinyModel
import com.google.gson.annotations.SerializedName

data class Tiny(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun Tiny.toDomain() = TinyModel(width, height)