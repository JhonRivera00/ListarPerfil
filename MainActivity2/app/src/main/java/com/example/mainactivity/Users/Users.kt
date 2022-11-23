package com.example.mainactivity.Users

import retrofit2.Call
import retrofit2.http.GET

interface Users {
    @GET("viewUser/1")
    fun getUsers(): Call<ResponResult>
}