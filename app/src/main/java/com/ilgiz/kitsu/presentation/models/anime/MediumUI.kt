package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?,
)

fun MediumModel.toUI() = MediumUI(width, height)