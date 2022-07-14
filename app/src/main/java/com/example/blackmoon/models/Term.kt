package com.example.blackmoon.models

import java.io.Serializable

data class Term(
    val id: Int,
    val name: String,
    val description: String,
    val status: Int
): Serializable