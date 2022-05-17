package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?,
)

fun LargeModel.toUI() = LargeUI(width, height)