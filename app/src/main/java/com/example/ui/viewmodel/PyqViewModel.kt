package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.PracticedEntity
import com.example.data.local.PyqDatabase
import com.example.data.repository.StudyRepository
import com.example.model.Chapter
import com.example.model.ExamYear
import com.example.model.HindiBook
import com.example.model.PyqClass
import com.example.model.PyqQuestion
import com.example.model.QuestionType
import com.example.model.SstBook
import com.example.model.Stream
import com.example.model.Subject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

sealed class Screen {
    object Home : Screen()
    data class Subjects(val classType: PyqClass) : Screen()
    data class SstBooks(val classType: PyqClass, val subjectId: String = "c10_sst") : Screen()
    data class HindiBooks(val classType: PyqClass, val subjectId: String = "c10_hin") : Screen()
    data class Chapters(val classType: PyqClass, val subjectId: String) : Screen()
    data class Years(val classType: PyqClass, val subjectId: String, val chapterId: String) : Screen()
    data class Questions(
        val classType: PyqClass,
        val subjectId: String,
        val chapterId: String?,
        val year: Int?
    ) : Screen()
    object Bookmarks : Screen()
    object Search : Screen()
}

class PyqViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: StudyRepository

    init {
        val database = PyqDatabase.getDatabase(application)
        repository = StudyRepository(database.pyqDao())
    }

    // Navigation backstack
    private val _backstack = MutableStateFlow<List<Screen>>(listOf(Screen.Home))
    val currentScreen: StateFlow<Screen> = _backstack.combine(MutableStateFlow(Unit)) { stack, _ ->
        stack.lastOrNull() ?: Screen.Home
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), Screen.Home)

    // Stream filter for Class 12
    private val _selectedStream = MutableStateFlow(Stream.ALL)
    val selectedStream: StateFlow<Stream> = _selectedStream.asStateFlow()

    // Question type filter
    private val _selectedQuestionType = MutableStateFlow<QuestionType?>(null)
    val selectedQuestionType: StateFlow<QuestionType?> = _selectedQuestionType.asStateFlow()

    // Search query
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    // Expanded answers set
    private val _revealedAnswers = MutableStateFlow<Set<String>>(emptySet())
    val revealedAnswers: StateFlow<Set<String>> = _revealedAnswers.asStateFlow()

    // Text scale for reading comfort
    private val _textScale = MutableStateFlow(1.0f)
    val textScale: StateFlow<Float> = _textScale.asStateFlow()

    // Room Bookmarks & Practiced
    val bookmarks: StateFlow<List<PyqQuestion>> = repository.allBookmarks
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val practicedMap: StateFlow<Map<String, PracticedEntity>> = repository.practicedMap
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())

    // Navigation methods
    fun navigateTo(screen: Screen) {
        _backstack.value = _backstack.value + screen
    }

    fun navigateBack(): Boolean {
        val current = _backstack.value
        return if (current.size > 1) {
            _backstack.value = current.dropLast(1)
            true
        } else {
            false
        }
    }

    fun navigateHome() {
        _backstack.value = listOf(Screen.Home)
    }

    fun selectClass(classType: PyqClass) {
        _selectedStream.value = Stream.ALL
        _selectedQuestionType.value = null
        navigateTo(Screen.Subjects(classType))
    }

    fun selectSubject(classType: PyqClass, subjectId: String) {
        if (classType == PyqClass.CLASS_10 && (subjectId == "c10_sst" || subjectId.startsWith("c10_sst"))) {
            navigateTo(Screen.SstBooks(classType, subjectId))
        } else if (classType == PyqClass.CLASS_10 && (subjectId == "c10_hin" || subjectId.startsWith("c10_hin"))) {
            navigateTo(Screen.HindiBooks(classType, subjectId))
        } else {
            navigateTo(Screen.Chapters(classType, subjectId))
        }
    }

    fun selectSstBook(classType: PyqClass, bookSubjectId: String) {
        navigateTo(Screen.Chapters(classType, bookSubjectId))
    }

    fun selectHindiBook(classType: PyqClass, bookSubjectId: String) {
        navigateTo(Screen.Chapters(classType, bookSubjectId))
    }

    fun selectChapter(classType: PyqClass, subjectId: String, chapterId: String) {
        navigateTo(Screen.Years(classType, subjectId, chapterId))
    }

    fun selectYear(classType: PyqClass, subjectId: String, chapterId: String?, year: Int?) {
        _selectedQuestionType.value = null
        navigateTo(Screen.Questions(classType, subjectId, chapterId, year))
    }

    fun setStream(stream: Stream) {
        _selectedStream.value = stream
    }

    fun setQuestionTypeFilter(type: QuestionType?) {
        _selectedQuestionType.value = type
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun toggleAnswerReveal(questionId: String) {
        val current = _revealedAnswers.value
        _revealedAnswers.value = if (current.contains(questionId)) {
            current - questionId
        } else {
            current + questionId
        }
    }

    fun increaseFontSize() {
        if (_textScale.value < 1.35f) {
            _textScale.value += 0.1f
        }
    }

    fun decreaseFontSize() {
        if (_textScale.value > 0.85f) {
            _textScale.value -= 0.1f
        }
    }

    fun resetFontSize() {
        _textScale.value = 1.0f
    }

    fun toggleBookmark(question: PyqQuestion) {
        viewModelScope.launch {
            val isCurrentlyBookmarked = bookmarks.value.any { it.id == question.id }
            repository.toggleBookmark(question.id, isCurrentlyBookmarked)
        }
    }

    fun togglePracticed(questionId: String) {
        viewModelScope.launch {
            val isCurrentlyPracticed = practicedMap.value.containsKey(questionId)
            repository.setPracticed(questionId, !isCurrentlyPracticed)
        }
    }

    fun getSubjects(classType: PyqClass, stream: Stream): List<Subject> =
        repository.getSubjects(classType, stream)

    fun getSubject(subjectId: String): Subject? =
        repository.getSubjectById(subjectId)

    fun getChapters(subjectId: String): List<Chapter> =
        repository.getChapters(subjectId)

    fun getSstBooks(): List<SstBook> =
        repository.getSstBooks()

    fun getHindiBooks(): List<HindiBook> =
        repository.getHindiBooks()

    fun getChapter(chapterId: String): Chapter? =
        repository.getChapterById(chapterId)

    fun getYears(subjectId: String): List<ExamYear> =
        repository.getYears(subjectId)

    fun getQuestions(
        classType: PyqClass,
        subjectId: String,
        chapterId: String?,
        year: Int?,
        type: QuestionType?
    ): List<PyqQuestion> =
        repository.getQuestions(classType, subjectId, chapterId, year, type)

    fun searchQuestions(query: String): List<PyqQuestion> =
        repository.search(query)
}
