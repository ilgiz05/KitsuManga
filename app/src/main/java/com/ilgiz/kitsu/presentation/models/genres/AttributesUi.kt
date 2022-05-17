package com.ilgiz.kitsu.presentation.models.genres

import com.ilgiz.domain.models.genres.AttributesModels


data class AttributesUi(
    val createdAt: String,
    val name: String,
    val description: String,
    val slug: String,
    val updatedAt: String,
)

fun AttributesModels.toUI() = AttributesUi(createdAt, name, description, slug, updatedAt)