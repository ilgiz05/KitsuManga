package com.ilgiz.data.remote.dtos.anime

import com.google.gson.annotations.SerializedName
import com.ilgiz.domain.models.anime.DimensionsXModel

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyX,
    @SerializedName("small")
    val small: SmallX,
    @SerializedName("large")
    val large: LargeX
)

fun DimensionsX.toDomain() = DimensionsXModel(
    tiny.toDomain(),
    small.toDomain(),
    large.toDomain()
)