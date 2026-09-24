package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "practiced")
data class PracticedEntity(
    @PrimaryKey val questionId: String,
    val isPracticed: Boolean = true,
    val note: String = "",
    val updatedAt: Long = System.currentTimeMillis()
)
