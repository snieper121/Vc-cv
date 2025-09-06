plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.simple.codeeditor.feature.filemanager"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.material3)

    implementation(libs.androidx.documentfile)
    implementation(libs.common.utilcode)
}
