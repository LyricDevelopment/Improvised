plugins {
    alias(libs.plugins.jvm) apply false
    alias(libs.plugins.shadow) apply false
    java
}

dependencies {

    compileOnly(libs.paper)
    compileOnly(libs.stdlib)
}