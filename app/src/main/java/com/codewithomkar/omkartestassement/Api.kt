package com.codewithomkar.omkartestassement

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class User(
    val email: String,
    val password: String
)

data class LoginResponse(
    val token: String
)

interface Api{
    @POST("api/login")
    fun loginUser(@Body user: User): Call<LoginResponse>
}