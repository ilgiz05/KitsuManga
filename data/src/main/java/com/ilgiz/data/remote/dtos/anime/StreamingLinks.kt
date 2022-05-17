package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.StreamingLinksModel
import com.google.gson.annotations.SerializedName

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXX,
)

fun StreamingLinks.toDomain() = StreamingLinksModel(links.toDomain())