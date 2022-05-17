package com.ilgiz.data.remote.dtos.anime

import com.ilgiz.domain.models.anime.TitlesModel
import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String?,
    @SerializedName("en_jp")
    val enJp: String?,
    @SerializedName("ja_jp")
    val jaJp: String?,
)

fun Titles.toDomain() = TitlesModel(
    en, enJp, jaJp
)