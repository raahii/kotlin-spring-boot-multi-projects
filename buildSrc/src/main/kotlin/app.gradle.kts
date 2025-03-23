package convention

import libs

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.springboot)

    id("convention.kotlin")
}

dependencies {
    implementation(platform(libs.springboot.bom))
}
