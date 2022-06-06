package com.zibro.domain.entity


import com.google.gson.annotations.SerializedName

data class StatusInfo(
    @SerializedName("errors")
    val errors: List<Any>,
    @SerializedName("get")
    val `get`: String,
    @SerializedName("paging")
    val paging: Paging,
    @SerializedName("parameters")
    val parameters: List<Any>,
    @SerializedName("response")
    val response: Response,
    @SerializedName("results")
    val results: Int
)