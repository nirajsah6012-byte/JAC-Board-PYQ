package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Clean, bright White Theme
private val LightColorScheme =
  lightColorScheme(
    primary = PrimaryNavy,
    onPrimary = Color.White,
    primaryContainer = Class10Container,
    onPrimaryContainer = PrimaryNavyDark,
    secondary = AccentAmber,
    onSecondary = Color.White,
    secondaryContainer = AccentAmberContainer,
    onSecondaryContainer = Color(0xFF78350F),
    tertiary = AccentGreen,
    background = Color(0xFFF8FAFC),
    onBackground = TextPrimaryLight,
    surface = Color(0xFFFFFFFF),
    onSurface = TextPrimaryLight,
    surfaceVariant = Color(0xFFF1F5F9),
    onSurfaceVariant = TextSecondaryLight,
    outline = Color(0xFFE2E8F0),
    outlineVariant = Color(0xFFF1F5F9)
  )

@Composable
fun MyApplicationTheme(
  darkTheme: Boolean = false, // Always default to clean White Theme as requested
  dynamicColor: Boolean = false,
  content: @Composable () -> Unit,
) {
  // Use bright, distraction-free White Theme
  val colorScheme = LightColorScheme

  MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}
