package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?,
)

fun SmallModel.toUI() = SmallUI(width, height)