package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.MetaXModel
import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX,
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)