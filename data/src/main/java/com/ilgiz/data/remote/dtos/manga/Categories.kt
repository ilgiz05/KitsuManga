package com.ilgiz.data.remote.dtos.manga

import com.google.gson.annotations.SerializedName
import com.ilgiz.domain.models.manga.CategoriesModel

data class Categories(
    @SerializedName("links")
    val links: LinksXX
)

fun Categories.toDomain() = CategoriesModel(
    links.toDomain()
)