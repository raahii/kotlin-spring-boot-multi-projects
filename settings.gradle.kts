plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "kotlin-spring-boot-multi-projects"
include("apps:webmvc")
include("apps:webflux")
