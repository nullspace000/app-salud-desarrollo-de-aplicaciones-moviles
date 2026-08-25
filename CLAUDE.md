# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project overview

Single-module Android app (`:app`) built with Kotlin and Jetpack Compose. Package: `com.example.actividad2`.
This is a school assignment ("Actividad2") for a mobile development course, currently at the default
Android Studio Compose-template stage — expect it to grow feature by feature.

## Commands

Run all commands from the repo root (`Actividad2/`), using the Gradle wrapper.

- Build debug APK: `./gradlew assembleDebug`
- Full build (compile + lint + unit tests): `./gradlew build`
- Unit tests (JVM, `app/src/test`): `./gradlew testDebugUnitTest`
- Run a single unit test: `./gradlew testDebugUnitTest --tests "com.example.actividad2.ExampleUnitTest.addition_isCorrect"`
- Instrumented tests (`app/src/androidTest`, needs a connected device/emulator): `./gradlew connectedDebugAndroidTest`
- Lint: `./gradlew lint`
- Install debug build on a connected device/emulator: `./gradlew installDebug`

## Architecture

- **Toolchain**: AGP 9.3.1, Kotlin 2.2.10, Compose BOM 2026.02.01, compileSdk/targetSdk 37, minSdk 24. Java 11 source/target compatibility. Dependency versions are centralized in `gradle/libs.versions.toml` (version catalog) — add new dependencies there rather than hardcoding versions in `app/build.gradle.kts`.
- **Entry point**: `MainActivity` (`app/src/main/java/com/example/actividad2/MainActivity.kt`) is the sole launcher activity. It uses `enableEdgeToEdge()` and hosts all UI via `setContent { }` with a single Compose `Scaffold`.
- **UI**: Pure Jetpack Compose, no XML layouts, no Fragments. `@Composable` functions live alongside the activity for now; as screens are added, prefer organizing them under a `ui/` package (a `ui/theme/` package already exists).
- **Theming**: `ui/theme/` holds `Color.kt`, `Theme.kt` (`Actividad2Theme` wrapper — always wrap screen content in this), and `Type.kt`. Follow the existing dynamic-color/Material3 setup in `Theme.kt` when adjusting theming.
- **Resources**: Standard `res/values/{colors,strings,themes}.xml`; add user-facing strings to `strings.xml` rather than inlining them in Composables.
- **No dependency injection, networking, persistence, or navigation libraries are set up yet** — if a task requires one (e.g. Navigation Compose, Retrofit, Room), it needs to be added to the version catalog and `app/build.gradle.kts` first.
