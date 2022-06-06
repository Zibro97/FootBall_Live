package com.zibro.domain.entity


import com.google.gson.annotations.SerializedName

data class Account(
    @SerializedName("email")
    val email: String,
    @SerializedName("firstname")
    val firstname: String,
    @SerializedName("lastname")
    val lastname: String
)