package com.ilgiz.kitsu.presentation.models.genres

import com.ilgiz.domain.models.genres.DataItemModels
import com.ilgiz.kitsu.presentation.base.BaseDiffModel

data class DataItemUi(
    val links: LinksUi,
    val attributes: AttributesUi,
    override val id: String,
    val type: String,
) : BaseDiffModel

fun DataItemModels.toUI() = DataItemUi(links.toUI(), attributes.toUI(), id, type)