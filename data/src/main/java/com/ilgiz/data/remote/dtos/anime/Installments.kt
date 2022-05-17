package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.InstallmentsModel
import com.google.gson.annotations.SerializedName

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX,
)

fun Installments.toDomain() = InstallmentsModel(
    links.toDomain()
)