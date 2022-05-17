package com.ilgiz.data.remote.apiservice

import com.ilgiz.data.remote.dtos.anime.AnimeListDto
import com.ilgiz.data.remote.dtos.anime.SingleAnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnimes(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeListDto

    @GET("anime/{id}")
    suspend fun fetchAnime(@Path("id") id: String): SingleAnimeDto
}