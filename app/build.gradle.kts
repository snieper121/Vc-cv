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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.6.11"
    }
    
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.activity.compose)
    
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
	implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Rosemoe Editor
    implementation(libs.rosemoe.editor)
    implementation(libs.rosemoe.textmate)
    
    // Модули проекта
    implementation(project(":feature:editor"))
    implementation(project(":feature:filemanager"))
    implementation(project(":feature:preferences"))
    implementation(project(":core:common"))
    implementation(project(":core:resources"))
    
    // Утилиты
    implementation(libs.common.utilcode)
    implementation(libs.google.gson)
}