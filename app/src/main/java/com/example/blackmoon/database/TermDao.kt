package com.example.blackmoon.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TermDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(data: List<Term>)

    @Query("Select * from term_entity where name like :symbol || '%'")
    fun getTermsBySymbol(symbol: String): List<Term>

    @Query("Select * from term_entity where name like '%' || :search || '%'")
    fun getTermsBySearch(search: String): List<Term>
}