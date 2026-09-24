package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Biotech
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.Functions
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.model.PyqClass
import com.example.model.Stream
import com.example.model.Subject
import com.example.ui.theme.Class10Blue
import com.example.ui.theme.Class12Red
import com.example.ui.theme.PrimaryNavy
import com.example.ui.viewmodel.PyqViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectScreen(
    classType: PyqClass,
    viewModel: PyqViewModel,
    modifier: Modifier = Modifier
) {
    val selectedStream by viewModel.selectedStream.collectAsStateWithLifecycle()
    val subjects = viewModel.getSubjects(classType, selectedStream)
    val themeColor = if (classType == PyqClass.CLASS_10) Class10Blue else Class12Red

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "${classType.displayName} • Subjects",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Step 2: Choose Subject / विषय चुनें",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
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
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background),
            contentPadding = PaddingValues(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 48.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Science stream banner for Class 12 (Arts & Commerce removed)
            if (classType == PyqClass.CLASS_12) {
                item {
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = themeColor.copy(alpha = 0.08f),
                        border = androidx.compose.foundation.BorderStroke(1.dp, themeColor.copy(alpha = 0.25f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "🔬 विज्ञान संकाय (Science Stream) • All 6 Subjects",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = themeColor
                            )
                        }
                    }
                }
            }

            items(subjects, key = { it.id }) { subject ->
                SubjectCard(
                    subject = subject,
                    themeColor = themeColor,
                    onClick = { viewModel.selectSubject(classType, subject.id) }
                )
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
fun SubjectCard(
    subject: Subject,
    themeColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .testTag("subject_card_${subject.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon avatar
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(themeColor.copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = getSubjectIcon(subject.iconName),
                        contentDescription = subject.name,
                        tint = themeColor,
                        modifier = Modifier.size(26.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = subject.name,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "(${subject.hindiName})",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = themeColor
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    if (subject.id == "c10_sst") {
                        Text(
                            text = "4 Books: History, Geography, Economics, Civics",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = themeColor
                        )
                        Text(
                            text = "कुल 25 अध्याय • Solved 2018-2024",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    } else if (subject.id == "c10_hin") {
                        Text(
                            text = "2 पुस्तकें: क्षितिज भाग - 2 एवं कृतिका भाग - 2",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = themeColor
                        )
                        Text(
                            text = "कुल 22 अध्याय (Old NCERT) • Solved 2018-2024",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    } else {
                        Text(
                            text = "${subject.chaptersCount} Chapters • Solved 2018-2024",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Select",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

fun getSubjectIcon(name: String): ImageVector {
    return when (name) {
        "science" -> Icons.Default.Science
        "calculate" -> Icons.Default.Calculate
        "public" -> Icons.Default.Public
        "auto_stories" -> Icons.Default.AutoStories
        "menu_book" -> Icons.AutoMirrored.Filled.MenuBook
        "school" -> Icons.Default.School
        "bolt" -> Icons.Default.Bolt
        "functions" -> Icons.Default.Functions
        "biotech" -> Icons.Default.Biotech
        "trending_up" -> Icons.Default.TrendingUp
        "computer" -> Icons.Default.Computer
        "account_balance" -> Icons.Default.AccountBalance
        "history_edu" -> Icons.Default.HistoryEdu
        else -> Icons.AutoMirrored.Filled.MenuBook
    }
}
