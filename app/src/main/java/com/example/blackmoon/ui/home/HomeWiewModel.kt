package com.example.blackmoon.ui.home

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blackmoon.App
import com.example.blackmoon.database.AppDatabase
import com.example.blackmoon.models.Symbol
import com.example.blackmoon.retrofit.RetrofitClient
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class HomeWiewModel() : ViewModel() {

    var termsList = MutableLiveData<List<com.example.blackmoon.database.Term>>()
    var category = MutableLiveData<Int>()
    val appDatabase = AppDatabase.getInstance(App.applicationContext())

    fun getTermsByCategory(symbol: String): MutableLiveData<List<com.example.blackmoon.database.Term>> {
        viewModelScope.launch {
            val list = appDatabase.termDao().getTermsBySymbol(symbol)
            if (list!=null){
                termsList.postValue(list)
            }
        }
        return termsList
    }

    fun getTermsBySearch(word: String): MutableLiveData<List<com.example.blackmoon.database.Term>> {
        viewModelScope.launch {
            val list = appDatabase.termDao().getTermsBySearch(word)
            if (list!=null){
                termsList.postValue(list)
            }
        }
        return termsList
    }

}