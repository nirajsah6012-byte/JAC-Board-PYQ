package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BookmarkEntity::class, PracticedEntity::class], version = 1, exportSchema = false)
abstract class PyqDatabase : RoomDatabase() {
    abstract fun pyqDao(): PyqDao

    companion object {
        @Volatile
        private var INSTANCE: PyqDatabase? = null

        fun getDatabase(context: Context): PyqDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PyqDatabase::class.java,
                    "jharkhand_pyq_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}
