package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.domain.models.manga.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?,
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)