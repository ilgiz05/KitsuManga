package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.DimensionsModel
import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("tiny")
    val tiny: Tiny,
    @SerializedName("small")
    val small: Small,
    @SerializedName("medium")
    val medium: Medium,
    @SerializedName("large")
    val large: Large,
)

fun Dimensions.toDomain() =
    DimensionsModel(
        tiny.toDomain(),
        small.toDomain(),
        medium.toDomain(),
        large.toDomain()
    )