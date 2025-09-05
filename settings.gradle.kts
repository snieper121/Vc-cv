@file:Suppress("UnstableApiUsage")

pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-plugin")
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("https://jitpack.io") }
  }
}

rootProject.name = "SimpleCodeEditor"

include(":app")
include(":feature:editor")
include(":feature:filemanager")
include(":core:common")
include(":core:resources")