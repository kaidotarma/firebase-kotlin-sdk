include(
    "firebase-app",
    "firebase-auth",
    "firebase-common",
    "firebase-common-internal",
    "firebase-config",
    "firebase-database",
    "firebase-firestore",
    "firebase-functions",
    "firebase-installations",
    "firebase-perf",
    "firebase-crashlytics",
    "firebase-storage",
    "test-utils"
)

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("multiplatform") version kotlinVersion
        kotlin("native.cocoapods") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
        id("com.android.application") version "8.1.3"
        id("org.jetbrains.kotlin.android") version "1.9.0"
        id("maven-publish")
    }
}
