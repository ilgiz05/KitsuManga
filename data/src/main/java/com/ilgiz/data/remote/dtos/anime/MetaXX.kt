package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.MetaXXModel
import com.google.gson.annotations.SerializedName

data class MetaXX(
    @SerializedName("count")
    val count: Int,
)

fun MetaXX.toDomain() = MetaXXModel(
    count
)