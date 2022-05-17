package com.ilgiz.kitsu.presentation.models.genres

import com.ilgiz.domain.models.genres.MetaModel

data class MetaUi(val count: Int = 0)

fun MetaModel.toUI() = MetaUi(count)