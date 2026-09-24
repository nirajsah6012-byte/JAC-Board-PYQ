package com.example.model

enum class PyqClass(val displayName: String, val hindiName: String, val shortDesc: String) {
    CLASS_10(
        displayName = "Class 10",
        hindiName = "कक्षा 10 (मैट्रिक)",
        shortDesc = "JAC Matric Board • Science, Maths, Social Science, Hindi, English, Sanskrit"
    ),
    CLASS_12(
        displayName = "Class 12",
        hindiName = "कक्षा 12 (इंटरमीडिएट - Science)",
        shortDesc = "JAC Intermediate Board • Science (Physics, Chemistry, Maths, Biology, Economics, Computer Science)"
    )
}

enum class Stream(val displayName: String, val hindiName: String) {
    ALL("All Subjects", "सभी विषय"),
    SCIENCE("Science Stream", "विज्ञान संकाय")
}

enum class QuestionType(val title: String, val marksBadge: String) {
    MCQ("Objective / MCQ", "1 Mark"),
    VERY_SHORT("Very Short Answer", "1 Mark"),
    SHORT("Short Answer", "2-3 Marks"),
    LONG("Long Answer", "5 Marks")
}

data class Subject(
    val id: String,
    val classType: PyqClass,
    val name: String,
    val hindiName: String,
    val iconName: String,
    val stream: Stream = Stream.ALL,
    val chaptersCount: Int,
    val totalQuestions: Int,
    val description: String,
    val isSubSubject: Boolean = false,
    val parentSubjectId: String? = null
)

data class SstBook(
    val id: String,
    val subjectId: String,
    val name: String,
    val hindiName: String,
    val bookTitleHindi: String,
    val iconName: String,
    val chaptersCount: Int,
    val colorHex: Long,
    val description: String
)

data class HindiBook(
    val id: String,
    val subjectId: String,
    val name: String,
    val hindiName: String,
    val bookTitleHindi: String,
    val iconName: String,
    val chaptersCount: Int,
    val colorHex: Long,
    val description: String
)

data class EnglishBook(
    val id: String,
    val subjectId: String,
    val name: String,
    val hindiName: String,
    val bookTitleHindi: String,
    val iconName: String,
    val chaptersCount: Int,
    val colorHex: Long,
    val description: String
)

data class Chapter(
    val id: String,
    val subjectId: String,
    val chapterNumber: Int,
    val name: String,
    val hindiName: String,
    val questionCount: Int,
    val keyTopics: String
)

data class ExamYear(
    val year: Int,
    val label: String,
    val questionCount: Int,
    val isLatest: Boolean = false
)

data class PyqQuestion(
    val id: String,
    val classType: PyqClass,
    val subjectId: String,
    val chapterId: String,
    val chapterName: String,
    val year: Int,
    val questionNo: Int,
    val marks: Int,
    val type: QuestionType,
    val questionHindi: String,
    val questionEnglish: String,
    val options: List<String>? = null,
    val correctOptionIndex: Int? = null,
    val answerHindi: String,
    val answerEnglish: String,
    val solutionSteps: List<String> = emptyList(),
    val keyFormulasOrPoints: List<String> = emptyList(),
    val examTip: String? = null
)
