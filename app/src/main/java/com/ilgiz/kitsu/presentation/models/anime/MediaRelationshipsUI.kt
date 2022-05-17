package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI,
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())