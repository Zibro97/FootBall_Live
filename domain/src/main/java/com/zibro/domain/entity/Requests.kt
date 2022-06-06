package com.zibro.domain.entity


import com.google.gson.annotations.SerializedName

data class Requests(
    @SerializedName("current")
    val current: Int,
    @SerializedName("limit_day")
    val limitDay: Int
)