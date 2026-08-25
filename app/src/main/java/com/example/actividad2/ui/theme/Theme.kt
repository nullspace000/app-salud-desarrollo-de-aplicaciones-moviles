package com.example.actividad2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = SerenePrimary,
    onPrimary = SereneOnPrimary,
    primaryContainer = SerenePrimaryContainer,
    onPrimaryContainer = SereneOnPrimaryContainer,
    inversePrimary = SereneInversePrimary,
    secondary = SereneSecondary,
    onSecondary = SereneOnSecondary,
    secondaryContainer = SereneSecondaryContainer,
    onSecondaryContainer = SereneOnSecondaryContainer,
    tertiary = SereneTertiary,
    onTertiary = SereneOnTertiary,
    tertiaryContainer = SereneTertiaryContainer,
    onTertiaryContainer = SereneOnTertiaryContainer,
    error = SereneError,
    onError = SereneOnError,
    errorContainer = SereneErrorContainer,
    onErrorContainer = SereneOnErrorContainer,
    background = SereneBackground,
    onBackground = SereneOnBackground,
    surface = SereneSurface,
    onSurface = SereneOnSurface,
    surfaceVariant = SereneSurfaceVariant,
    onSurfaceVariant = SereneOnSurfaceVariant,
    outline = SereneOutline,
    outlineVariant = SereneOutlineVariant,
    inverseSurface = SereneInverseSurface,
    inverseOnSurface = SereneInverseOnSurface,
    surfaceTint = SereneSurfaceTint,
    surfaceDim = SereneSurfaceDim,
    surfaceBright = SereneSurfaceBright,
    surfaceContainerLowest = SereneSurfaceContainerLowest,
    surfaceContainerLow = SereneSurfaceContainerLow,
    surfaceContainer = SereneSurfaceContainer,
    surfaceContainerHigh = SereneSurfaceContainerHigh,
    surfaceContainerHighest = SereneSurfaceContainerHighest,
)

private val DarkColorScheme = darkColorScheme(
    primary = SereneDarkPrimary,
    onPrimary = SereneDarkOnPrimary,
    primaryContainer = SereneDarkPrimaryContainer,
    onPrimaryContainer = SereneDarkOnPrimaryContainer,
    secondary = SereneDarkSecondary,
    onSecondary = SereneDarkOnSecondary,
    secondaryContainer = SereneDarkSecondaryContainer,
    onSecondaryContainer = SereneDarkOnSecondaryContainer,
    error = SereneError,
    onError = SereneOnError,
    errorContainer = SereneErrorContainer,
    onErrorContainer = SereneOnErrorContainer,
    background = SereneDarkBackground,
    onBackground = SereneDarkOnBackground,
    surface = SereneDarkBackground,
    onSurface = SereneDarkOnBackground,
    onSurfaceVariant = SereneDarkOnSurfaceVariant,
    outline = SereneDarkOutline,
    outlineVariant = SereneDarkOutlineVariant,
    surfaceContainerLowest = SereneDarkSurfaceContainerLowest,
    surfaceContainerLow = SereneDarkSurfaceContainerLow,
    surfaceContainer = SereneDarkSurfaceContainer,
    surfaceContainerHigh = SereneDarkSurfaceContainerHigh,
    surfaceContainerHighest = SereneDarkSurfaceContainerHighest,
)

/**
 * Wraps screen content with the Serene Care Material3 theme.
 * Dynamic color is intentionally not used: the design has a fixed brand palette.
 */
@Composable
fun Actividad2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
