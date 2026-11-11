plugins {
    id("com.android.application")
}

android {
    namespace = "com.franlavin.misdecimos"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.franlavin.misdecimos"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "1.1"
    }
}

dependencies {
    implementation("androidx.core:core:1.15.0")
}
