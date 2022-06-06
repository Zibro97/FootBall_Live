package com.zibro.domain.entity


import com.google.gson.annotations.SerializedName

data class Subscription(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("end")
    val end: String,
    @SerializedName("plan")
    val plan: String
)