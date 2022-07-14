package com.example.blackmoon.repository

import com.example.blackmoon.retrofit.ApiService

class TermsRepository(val apiService: ApiService) {

    suspend fun getTermsByCategoryId() = apiService.getTermsByCategoryId(9)
    suspend fun getTermsBySearch() = apiService.getTermsBySearch("")

}