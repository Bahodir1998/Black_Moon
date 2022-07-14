package com.example.blackmoon.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object SharedPref {
    lateinit var sharedPreferences: SharedPreferences

    fun getInstanceDis(context: Context) {
        sharedPreferences = context.getSharedPreferences(
            "" +
                    "", Context.MODE_PRIVATE
        )
    }

    var url: Int?
        get() = sharedPreferences.getInt("user",9)
        set(value) = sharedPreferences.edit {
            if (value != null) {
                this.putInt("user", value)
            }
        }

    var size: Int?
        get() = sharedPreferences.getInt("size",9)
        set(value) = sharedPreferences.edit {
            if (value != null) {
                this.putInt("size", value)
            }
        }
}