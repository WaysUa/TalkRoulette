buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
    }
}

plugins {
    id(Plugins.Application.dependency) version Plugins.Application.version apply false
    id(Plugins.Library.dependency) version Plugins.Library.version apply false
    id(Plugins.Android.dependency) version Plugins.Android.version apply false
}