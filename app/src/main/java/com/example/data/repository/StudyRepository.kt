package com.example.data.repository

import com.example.data.local.BookmarkEntity
import com.example.data.local.PracticedEntity
import com.example.data.local.PyqDao
import com.example.model.Chapter
import com.example.model.EnglishBook
import com.example.model.ExamYear
import com.example.model.HindiBook
import com.example.model.PyqClass
import com.example.model.PyqQuestion
import com.example.model.QuestionType
import com.example.model.SstBook
import com.example.model.Stream
import com.example.model.Subject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class StudyRepository(private val pyqDao: PyqDao) {

    val allBookmarks: Flow<List<PyqQuestion>> = pyqDao.getAllBookmarks().map { bookmarkList ->
        val ids = bookmarkList.map { it.questionId }.toSet()
        PyqDataRepository.questions.filter { it.id in ids }
    }

    val practicedMap: Flow<Map<String, PracticedEntity>> = pyqDao.getAllPracticed().map { list ->
        list.associateBy { it.questionId }
    }

    fun isBookmarked(questionId: String): Flow<Boolean> = pyqDao.isBookmarked(questionId)

    suspend fun toggleBookmark(questionId: String, currentBookmarked: Boolean) {
        if (currentBookmarked) {
            pyqDao.deleteBookmark(questionId)
        } else {
            pyqDao.insertBookmark(BookmarkEntity(questionId))
        }
    }

    suspend fun setPracticed(questionId: String, isPracticed: Boolean, note: String = "") {
        if (isPracticed) {
            pyqDao.upsertPracticed(PracticedEntity(questionId = questionId, isPracticed = true, note = note))
        } else {
            pyqDao.removePracticed(questionId)
        }
    }

    fun getSubjects(classType: PyqClass, stream: Stream = Stream.ALL): List<Subject> =
        PyqDataRepository.getSubjectsForClass(classType, stream)

    fun getSstBooks(): List<SstBook> =
        PyqDataRepository.sstBooks

    fun getHindiBooks(): List<HindiBook> =
        PyqDataRepository.hindiBooks

    fun getEnglishBooks(): List<EnglishBook> =
        PyqDataRepository.englishBooks

    fun getSubjectById(subjectId: String): Subject? =
        PyqDataRepository.getSubjectById(subjectId)

    fun getChapters(subjectId: String): List<Chapter> =
        PyqDataRepository.getChaptersForSubject(subjectId)

    fun getChapterById(chapterId: String): Chapter? =
        PyqDataRepository.getChapterById(chapterId)

    fun getYears(subjectId: String): List<ExamYear> =
        PyqDataRepository.getYearsForSubject(subjectId)

    fun getQuestions(
        classType: PyqClass,
        subjectId: String,
        chapterId: String? = null,
        year: Int? = null,
        type: QuestionType? = null
    ): List<PyqQuestion> =
        PyqDataRepository.getQuestions(classType, subjectId, chapterId, year, type)

    fun search(query: String): List<PyqQuestion> =
        PyqDataRepository.searchQuestions(query)
}
