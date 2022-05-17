package com.ilgiz.data.remote.dtos.manga

import com.ilgiz.domain.models.manga.MangaStaffModel
import com.google.gson.annotations.SerializedName

data class MangaStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX,
)

fun MangaStaff.toDomain() =
    MangaStaffModel(links.toDomain())