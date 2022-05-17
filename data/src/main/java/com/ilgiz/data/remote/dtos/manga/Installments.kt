package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.InstallmentsModel
import com.google.gson.annotations.SerializedName

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX,
)

fun Installments.toDomain() =
    InstallmentsModel(links.toDomain())