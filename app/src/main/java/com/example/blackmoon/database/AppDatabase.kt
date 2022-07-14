package com.example.blackmoon.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Term::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun termDao(): TermDao

    companion object {

        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context:Context): AppDatabase{
            if (instance == null){
                instance = Room.databaseBuilder(context,AppDatabase::class.java,"term_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }
}