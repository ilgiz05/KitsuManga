package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?,
)

fun MediumModel.toUI() = MediumUI(width, height)