package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.StreamingLinksModel

data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI,
)

fun StreamingLinksModel.toUI() = StreamingLinksUI(links.toUI())