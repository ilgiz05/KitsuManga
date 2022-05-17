package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?,
)

fun TinyXModel.toUI() = TinyXUI(width, height)