package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.ReviewsModel
import com.google.gson.annotations.SerializedName

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX,
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())