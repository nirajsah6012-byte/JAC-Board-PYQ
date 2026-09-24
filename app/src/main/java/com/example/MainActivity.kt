package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.screens.BookmarksScreen
import com.example.ui.screens.ChapterScreen
import com.example.ui.screens.HindiBookSelectionScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.QuestionDetailScreen
import com.example.ui.screens.SearchScreen
import com.example.ui.screens.SstBookSelectionScreen
import com.example.ui.screens.SubjectScreen
import com.example.ui.screens.YearScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.PyqViewModel
import com.example.ui.viewmodel.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            )
        )
        setContent {
            MyApplicationTheme(darkTheme = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PyqAppMain()
                }
            }
        }
    }
}

@Composable
fun PyqAppMain(viewModel: PyqViewModel = viewModel()) {
    val currentScreen by viewModel.currentScreen.collectAsStateWithLifecycle()

    // Android back button handling for the simple breadcrumb navigation
    BackHandler(enabled = currentScreen !is Screen.Home) {
        viewModel.navigateBack()
    }

    AnimatedContent(
        targetState = currentScreen,
        transitionSpec = {
            fadeIn() togetherWith fadeOut()
        },
        label = "ScreenTransition"
    ) { screen ->
        when (screen) {
            is Screen.Home -> {
                HomeScreen(viewModel = viewModel)
            }
            is Screen.Subjects -> {
                SubjectScreen(classType = screen.classType, viewModel = viewModel)
            }
            is Screen.SstBooks -> {
                SstBookSelectionScreen(
                    classType = screen.classType,
                    subjectId = screen.subjectId,
                    viewModel = viewModel
                )
            }
            is Screen.HindiBooks -> {
                HindiBookSelectionScreen(
                    classType = screen.classType,
                    subjectId = screen.subjectId,
                    viewModel = viewModel
                )
            }
            is Screen.Chapters -> {
                ChapterScreen(
                    classType = screen.classType,
                    subjectId = screen.subjectId,
                    viewModel = viewModel
                )
            }
            is Screen.Years -> {
                YearScreen(
                    classType = screen.classType,
                    subjectId = screen.subjectId,
                    chapterId = screen.chapterId,
                    viewModel = viewModel
                )
            }
            is Screen.Questions -> {
                QuestionDetailScreen(
                    classType = screen.classType,
                    subjectId = screen.subjectId,
                    chapterId = screen.chapterId,
                    year = screen.year,
                    viewModel = viewModel
                )
            }
            is Screen.Bookmarks -> {
                BookmarksScreen(viewModel = viewModel)
            }
            is Screen.Search -> {
                SearchScreen(viewModel = viewModel)
            }
        }
    }
}
