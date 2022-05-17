package com.ilgiz.data.remote.dtos.manga

import com.google.gson.annotations.SerializedName
import com.ilgiz.domain.models.manga.MetaModel

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())