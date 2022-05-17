package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.DimensionsXModel
import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyX,
    @SerializedName("small")
    val small: SmallX,
    @SerializedName("large")
    val large: LargeX,
)

fun DimensionsX.toDomain() = DimensionsXModel(
    tiny.toDomain(), small.toDomain(), large.toDomain()
)