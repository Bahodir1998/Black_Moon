package com.example.blackmoon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.example.blackmoon.databinding.ActivitySplashBinding
import com.example.blackmoon.services.UploadWork
import com.example.blackmoon.utils.SharedPref
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplashBinding
    var url: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val workRequest: WorkRequest = PeriodicWorkRequestBuilder<UploadWork>(1,TimeUnit.DAYS).build()
        WorkManager.getInstance(this).enqueue(workRequest)
        url = intent.data.toString()
        if (url != "null"){
            SharedPref.getInstanceDis(this)
            SharedPref.url =  url.substringAfter("=").toInt()
        }else{
            SharedPref.getInstanceDis(this)
            SharedPref.url = 9
        }
        val handler = Handler()

        handler.postDelayed(runnable, 2000)
    }

    var runnable = object : Runnable {
        override fun run() {
            val intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}