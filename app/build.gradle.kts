plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.simple.codeeditor"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.simple.codeeditor"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }

    packaging {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.activity.compose)

    implementation(project(":feature:editor"))
    implementation(project(":feature:filemanager"))
    implementation(project(":core:common"))
    implementation(project(":core:resources"))
}