# AI Chat Application</p>


## Overview

Weather application using OpenWeatherMap API, where you can access the weather of all cities in the world.

## Technologies

-Kotlin
-Firebase
-OpenWeatherMap API


## Screenshots


<div style="display: flex; flex-wrap: wrap;">
    <img width="200" alt="weather1" src="https://github.com/user-attachments/assets/b6468a86-3a00-4c4b-89f5-cff8c7bc2b68">
    <img width="200" alt="chatbot2" src="https://github.com/user-attachments/assets/f49a9571-58ae-470d-9e77-22e981d51423">
    <img width="200" alt="chatbot2" src="https://github.com/user-attachments/assets/6c4a7f01-7d5f-4cf0-a2a9-e235707b05ff">
    <img width="610" alt="chatbot2" src="https://github.com/user-attachments/assets/1cc427f3-a3e2-4f38-a2d4-373b20dacb48">
</div>


## Dependencies

```kotlin
dependencies {
    
    implementation 'androidx.core:core-ktx:1.10.1'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'com.google.firebase:firebase-database:20.3.0'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'

    // retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    // coroutine
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4'

    //picasso
    implementation 'com.squareup.picasso:picasso:2.8'

    //barchart
    implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'

    //location
    implementation 'com.google.android.gms:play-services-location:21.0.1'
}

```
