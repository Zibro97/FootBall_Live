package com.zibro.data.api

import com.zibro.data.BuildConfig
import com.zibro.domain.entity.StatusInfo
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballApi {
    //test api Request
    @GET("/")
    suspend fun status():StatusInfo
}