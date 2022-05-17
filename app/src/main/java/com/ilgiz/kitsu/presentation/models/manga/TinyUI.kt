package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?,
)

fun TinyModel.toUI() = TinyUI(width, height)