plugins {
	id("com.android.library")
	kotlin("android")
}

android {
	namespace = "com.simple.codeeditor.resources"
	compileSdk = 34

	defaultConfig {
		minSdk = 26
	}

	buildFeatures {
		viewBinding = true
		compose = false
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
	kotlinOptions {
		jvmTarget = "17"
	}
}

dependencies {
	implementation(libs.google.material)
	// Если в ресурсах используются AppCompat виджеты, раскомментируйте:
	implementation(libs.androidx.appcompat)
}