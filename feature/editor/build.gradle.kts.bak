plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.simple.codeeditor.feature.editor"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
    
    sourceSets {
		getByName("main").java.exclude("com/teixeira/vcspace/editor/**")
	}
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.material3)

    // Rosemoe Editor
    implementation(libs.rosemoe.editor)
    implementation(libs.rosemoe.textmate)
    
	implementation(libs.androidx.core.ktx)
}