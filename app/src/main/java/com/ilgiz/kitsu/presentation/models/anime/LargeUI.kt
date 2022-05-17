package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?,
)

fun LargeModel.toUI() = LargeUI(width, height)