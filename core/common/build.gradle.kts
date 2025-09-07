plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.simple.codeeditor.core.common"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
		viewBinding = true
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
    implementation(libs.google.gson)
    implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.appcompat)
	implementation(libs.androidx.preference)
	implementation(libs.google.material)
	implementation(libs.androidx.security.crypto)
	implementation(libs.kotlinx.coroutines.core)
	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.common.utilcode)
	implementation(libs.androidx.annotation)
}