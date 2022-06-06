package com.zibro.domain.entity


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("account")
    val account: Account,
    @SerializedName("requests")
    val requests: Requests,
    @SerializedName("subscription")
    val subscription: Subscription
)