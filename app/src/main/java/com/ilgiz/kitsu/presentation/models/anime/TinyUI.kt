package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.domain.models.anime.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?,
)

fun TinyModel.toUI() = TinyUI(
    width, height
)