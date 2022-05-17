package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?,
)

fun LargeXModel.toUI() = LargeXUI(width, height)