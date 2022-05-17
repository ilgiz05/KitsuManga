package com.ilgiz.data.remote.dtos.genres

import com.ilgiz.domain.models.genres.MetaModel


data class MetaDto(val count: Int = 0)
fun MetaDto.toDomain() = MetaModel(count)