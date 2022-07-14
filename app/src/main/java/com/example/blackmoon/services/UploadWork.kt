package com.example.blackmoon.services

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.blackmoon.database.AppDatabase
import com.example.blackmoon.database.Term
import com.example.blackmoon.retrofit.RetrofitClient
import com.example.blackmoon.utils.InternetConnection
import com.example.blackmoon.utils.SharedPref
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UploadWork(var context: Context, workerParameters: WorkerParameters) :
    Worker(context, workerParameters) {

    lateinit var list: ArrayList<Term>
    lateinit var appDatabase: AppDatabase
    override fun doWork(): Result {
        uploadTerms()
        return Result.success()
    }

     private fun uploadTerms() {
        val a = InternetConnection.isNetworkConnected(context)
        if (a) {
            RetrofitClient.apiService.getAllTerms("").enqueue(object : Callback<List<Term>>{
                override fun onResponse(call: Call<List<Term>>, response: Response<List<Term>>) {
                    list = ArrayList()
                    appDatabase = AppDatabase.getInstance(context)
                    list.addAll(response?.body()!! as ArrayList<Term>)
                    appDatabase.termDao().insert(list)
                }
                override fun onFailure(call: Call<List<Term>>, t: Throwable) {

                }
            })
//            val apiService = RetrofitClient.apiService
//            CoroutineScope(Dispatchers.IO).launch {
//                val list = apiService.getTermsBySearch("")
//                SharedPref.getInstanceDis(context)
//                SharedPref.size = list.size
//                dao.insert(list)
//            }
        }
    }
}