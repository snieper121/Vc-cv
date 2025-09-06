plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.simple.codeeditor.core.common"
    compileSdk = 34
    defaultConfig { minSdk = 26 }
}

dependencies {
    implementation(libs.google.gson)
}
