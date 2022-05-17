package com.ilgiz.data.remote.dtos.manga

import com.google.gson.annotations.SerializedName
import com.ilgiz.domain.models.manga.ReviewsModel

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())