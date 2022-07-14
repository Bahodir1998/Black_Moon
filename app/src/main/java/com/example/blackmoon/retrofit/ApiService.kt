package com.example.blackmoon.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search")
    fun getAllTerms(@Query("word") word:String): Call<List<com.example.blackmoon.database.Term>>

    @GET("page")
    suspend fun getTermsByCategoryId(@Query("category_id") category_id:Int): List<com.example.blackmoon.database.Term>

    @GET("search")
    suspend fun getTermsBySearch(@Query("word") word:String): List<com.example.blackmoon.database.Term>
}