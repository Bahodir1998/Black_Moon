package com.example.blackmoon.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {

    val BASE = "https://atama.idm.uz/api/"

    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}