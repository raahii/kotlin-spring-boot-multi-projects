plugins {
    id("convention.app")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springboot.starter.webflux)
}

