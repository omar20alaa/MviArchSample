plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id ("dagger.hilt.android.plugin")

}

android {
    namespace = "app.mvi_arch"
    compileSdk = 34

    defaultConfig {
        applicationId = "app.mvi_arch"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    dataBinding {
        enable = true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // paging 3
    implementation("androidx.paging:paging-runtime-ktx:3.1.1")
    implementation("androidx.paging:paging-compose:1.0.0-alpha14")

    //navigation
    implementation("androidx.navigation:navigation-compose:2.4.1")


    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.0")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")

    //Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.48")

    // Dagger - Hilt
    // Hilt (Dependency Injection) for decreased coupling
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-compiler:2.48")
    implementation("androidx.hilt:hilt-navigation-fragment:1.1.0")
    implementation("androidx.hilt:hilt-work:1.1.0")
    kapt("androidx.hilt:hilt-compiler:1.1.0")
    // Android WorkManager runtime library
    implementation("androidx.work:work-runtime-ktx:2.8.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")

    // Coil
    implementation("io.coil-kt:coil-compose:1.4.0")

    // system ui controller
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")

    // flow layout
    implementation("com.google.accompanist:accompanist-flowlayout:0.24.4-alpha")

    // Rounded image view
    implementation("com.makeramen:roundedimageview:2.3.0")

    //Glide library for loading images
    implementation("com.github.bumptech.glide:glide:4.12.0")


}
kapt {
    correctErrorTypes = true
}