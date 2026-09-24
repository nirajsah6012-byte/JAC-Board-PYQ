package com.example.ui.screens

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.TextDecrease
import androidx.compose.material.icons.filled.TextIncrease
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.model.PyqClass
import com.example.model.PyqQuestion
import com.example.model.QuestionType
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.AccentGreen
import com.example.ui.theme.Class10Blue
import com.example.ui.theme.Class12Red
import com.example.ui.theme.PrimaryNavy
import com.example.ui.viewmodel.PyqViewModel

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun QuestionDetailScreen(
    classType: PyqClass,
    subjectId: String,
    chapterId: String?,
    year: Int?,
    viewModel: PyqViewModel,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val subject = viewModel.getSubject(subjectId)
    val chapter = chapterId?.let { viewModel.getChapter(it) }
    val selectedType by viewModel.selectedQuestionType.collectAsStateWithLifecycle()
    val revealedAnswers by viewModel.revealedAnswers.collectAsStateWithLifecycle()
    val textScale by viewModel.textScale.collectAsStateWithLifecycle()
    val bookmarks by viewModel.bookmarks.collectAsStateWithLifecycle()
    val practicedMap by viewModel.practicedMap.collectAsStateWithLifecycle()

    val questions = viewModel.getQuestions(classType, subjectId, chapterId, year, selectedType)
    val themeColor = if (classType == PyqClass.CLASS_10) Class10Blue else Class12Red

    val subtitle = buildString {
        if (chapter != null) append(chapter.name) else append("All Chapters")
        if (year != null) append(" • $year") else append(" • All Years")
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "${subject?.name ?: "Subject"} Questions",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            text = subtitle,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = { viewModel.navigateBack() },
                        modifier = Modifier.testTag("back_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    // Font size adjuster
                    IconButton(onClick = { viewModel.decreaseFontSize() }) {
                        Icon(
                            imageVector = Icons.Default.TextDecrease,
                            contentDescription = "Smaller Text",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    IconButton(onClick = { viewModel.increaseFontSize() }) {
                        Icon(
                            imageVector = Icons.Default.TextIncrease,
                            contentDescription = "Larger Text",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Filter chips row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    selected = selectedType == null,
                    onClick = { viewModel.setQuestionTypeFilter(null) },
                    label = { Text("All (${questions.size})", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = themeColor,
                        selectedLabelColor = Color.White
                    )
                )

                FilterChip(
                    selected = selectedType == QuestionType.MCQ,
                    onClick = { viewModel.setQuestionTypeFilter(QuestionType.MCQ) },
                    label = { Text("1M MCQ", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = themeColor,
                        selectedLabelColor = Color.White
                    )
                )

                FilterChip(
                    selected = selectedType == QuestionType.SHORT,
                    onClick = { viewModel.setQuestionTypeFilter(QuestionType.SHORT) },
                    label = { Text("Short (2-3M)", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = themeColor,
                        selectedLabelColor = Color.White
                    )
                )

                FilterChip(
                    selected = selectedType == QuestionType.LONG,
                    onClick = { viewModel.setQuestionTypeFilter(QuestionType.LONG) },
                    label = { Text("Long (5M)", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = themeColor,
                        selectedLabelColor = Color.White
                    )
                )
            }

            if (questions.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "📚",
                            fontSize = 48.sp
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "No questions match this filter.",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedButton(onClick = { viewModel.setQuestionTypeFilter(null) }) {
                            Text("Reset Filter")
                        }
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .testTag("questions_lazy_column"),
                    contentPadding = PaddingValues(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 48.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    itemsIndexed(questions, key = { _, q -> q.id }) { index, question ->
                        val isRevealed = revealedAnswers.contains(question.id)
                        val isBookmarked = bookmarks.any { it.id == question.id }
                        val isPracticed = practicedMap.containsKey(question.id)

                        QuestionCard(
                            displayIndex = index + 1,
                            question = question,
                            textScale = textScale,
                            isAnswerRevealed = isRevealed,
                            isBookmarked = isBookmarked,
                            isPracticed = isPracticed,
                            themeColor = themeColor,
                            onToggleReveal = { viewModel.toggleAnswerReveal(question.id) },
                            onToggleBookmark = { viewModel.toggleBookmark(question) },
                            onTogglePracticed = { viewModel.togglePracticed(question.id) },
                            onCopy = {
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                val clip = ClipData.newPlainText(
                                    "JAC PYQ Question",
                                    "Q: ${question.questionHindi}\n${question.questionEnglish}\n\nAnswer: ${question.answerHindi}\n${question.answerEnglish}"
                                )
                                clipboard.setPrimaryClip(clip)
                                Toast.makeText(context, "Question & Answer Copied!", Toast.LENGTH_SHORT).show()
                            }
                        )
                    }

                    item {
                        Spacer(modifier = Modifier.height(32.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun QuestionCard(
    displayIndex: Int,
    question: PyqQuestion,
    textScale: Float,
    isAnswerRevealed: Boolean,
    isBookmarked: Boolean,
    isPracticed: Boolean,
    themeColor: Color,
    onToggleReveal: () -> Unit,
    onToggleBookmark: () -> Unit,
    onTogglePracticed: () -> Unit,
    onCopy: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .border(
                width = if (isPracticed) 1.5.dp else 1.dp,
                color = if (isPracticed) AccentGreen.copy(alpha = 0.5f) else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                shape = RoundedCornerShape(16.dp)
            )
            .testTag("question_item_${question.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Row: Year, Marks & Practiced status
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = themeColor.copy(alpha = 0.12f)
                    ) {
                        Text(
                            text = "JAC ${question.year} • Q.${question.questionNo}",
                            fontSize = (11 * textScale).sp,
                            fontWeight = FontWeight.Bold,
                            color = themeColor,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant
                    ) {
                        Text(
                            text = "${question.marks} Marks",
                            fontSize = (11 * textScale).sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Copy button
                    IconButton(
                        onClick = onCopy,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ContentCopy,
                            contentDescription = "Copy Question",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    // Bookmark button
                    IconButton(
                        onClick = onToggleBookmark,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Bookmark Question",
                            tint = if (isBookmarked) AccentAmber else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Question text in Hindi
            Text(
                text = "प्र. $displayIndex. ${question.questionHindi}",
                fontSize = (16 * textScale).sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = (22 * textScale).sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Question text in English
            Text(
                text = "Q. $displayIndex. ${question.questionEnglish}",
                fontSize = (14.5f * textScale).sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = (20 * textScale).sp
            )

            // Multiple choice options if present
            if (!question.options.isNullOrEmpty()) {
                Spacer(modifier = Modifier.height(10.dp))
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    val optionLabels = listOf("(A)", "(B)", "(C)", "(D)")
                    question.options.forEachIndexed { optIndex, optText ->
                        val isCorrect = isAnswerRevealed && question.correctOptionIndex == optIndex
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = if (isCorrect) AccentGreen.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                            border = if (isCorrect) androidx.compose.foundation.BorderStroke(1.dp, AccentGreen) else null,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "${optionLabels.getOrElse(optIndex) { "" }} $optText",
                                    fontSize = (13.5f * textScale).sp,
                                    fontWeight = if (isCorrect) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isCorrect) AccentGreen else MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Answer Reveal Button (Distraction-free toggle so student can attempt first)
            Button(
                onClick = onToggleReveal,
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("toggle_answer_button_${question.id}"),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isAnswerRevealed) MaterialTheme.colorScheme.surfaceVariant else themeColor
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = if (isAnswerRevealed) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = null,
                        tint = if (isAnswerRevealed) MaterialTheme.colorScheme.onSurfaceVariant else Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isAnswerRevealed) "उत्तर छुपाएं / Hide Solution" else "उत्तर एवं व्याख्या देखें / View Solution",
                        fontSize = (13.5f * textScale).sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isAnswerRevealed) MaterialTheme.colorScheme.onSurfaceVariant else Color.White
                    )
                }
            }

            // Expandable Solution Area
            AnimatedVisibility(
                visible = isAnswerRevealed,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f))
                        .padding(14.dp)
                ) {
                    Text(
                        text = "हल / विस्तृत उत्तर (Detailed Solution):",
                        fontSize = (14 * textScale).sp,
                        fontWeight = FontWeight.Bold,
                        color = themeColor
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = question.answerHindi,
                        fontSize = (14 * textScale).sp,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = (21 * textScale).sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = question.answerEnglish,
                        fontSize = (13.5f * textScale).sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = (20 * textScale).sp
                    )

                    // Key Concepts / Formulas
                    if (question.keyFormulasOrPoints.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        HorizontalDivider(color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "💡 मुख्य सूत्र एवं बिंदु (Key Concepts):",
                            fontSize = (12.5f * textScale).sp,
                            fontWeight = FontWeight.Bold,
                            color = AccentAmber
                        )
                        question.keyFormulasOrPoints.forEach { point ->
                            Text(
                                text = "• $point",
                                fontSize = (12.5f * textScale).sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }

                    // Examiner Tip
                    if (!question.examTip.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = AccentAmber.copy(alpha = 0.1f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, AccentAmber.copy(alpha = 0.3f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp),
                                verticalAlignment = Alignment.Top
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Lightbulb,
                                    contentDescription = "Tip",
                                    tint = AccentAmber,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "JAC Board Exam Tip: ${question.examTip}",
                                    fontSize = (11.5f * textScale).sp,
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Footer: Practiced Status toggle
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = onTogglePracticed),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = if (isPracticed) Icons.Default.CheckCircle else Icons.Default.CheckCircleOutline,
                    contentDescription = "Practiced Status",
                    tint = if (isPracticed) AccentGreen else MaterialTheme.colorScheme.outline,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = if (isPracticed) "अभ्यास पूरा हुआ (Completed)" else "अभ्यास के रूप में चिह्नित करें (Mark as Practiced)",
                    fontSize = (12 * textScale).sp,
                    color = if (isPracticed) AccentGreen else MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = if (isPracticed) FontWeight.Bold else FontWeight.Normal
                )
            }
        }
    }
}
