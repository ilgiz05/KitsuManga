package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.MetaModel
import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions,
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())