package com.example.blackmoon.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "term_entity")
data class Term (
    @PrimaryKey(autoGenerate = true)
    var id:Long,
    var name: String,
    var description:String,
    var status: String
):Serializable
