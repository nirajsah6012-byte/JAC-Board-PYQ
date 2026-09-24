package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PyqDao {
    @Query("SELECT * FROM bookmarks ORDER BY bookmarkedAt DESC")
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(bookmark: BookmarkEntity)

    @Query("DELETE FROM bookmarks WHERE questionId = :questionId")
    suspend fun deleteBookmark(questionId: String)

    @Query("SELECT EXISTS(SELECT 1 FROM bookmarks WHERE questionId = :questionId)")
    fun isBookmarked(questionId: String): Flow<Boolean>

    @Query("SELECT * FROM practiced")
    fun getAllPracticed(): Flow<List<PracticedEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertPracticed(practiced: PracticedEntity)

    @Query("DELETE FROM practiced WHERE questionId = :questionId")
    suspend fun removePracticed(questionId: String)
}
