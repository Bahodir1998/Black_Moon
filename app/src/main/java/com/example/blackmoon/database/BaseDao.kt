package com.example.blackmoon.database

import androidx.room.*

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: T): Long

    @Insert
    suspend fun insertAll(data: List<T>): Int

    @Delete
    suspend fun delete(data: T): Int

    @Delete
    suspend fun deleteAll(data: List<T>): Int

    @Update
    suspend fun update(data: T): Int

    @Update
    suspend fun updateAll(data: List<T>): Int


}