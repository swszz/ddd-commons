plugins {
    alias(libs.plugins.kotlin.jvm) apply true
    alias(libs.plugins.maven.publish) apply true
}

group = "org.github.swszz"
version = "0.1.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        sourceCompatibility = JavaVersion.VERSION_21
    }
}

publishing {
    repositories {
        maven {
            name = "ddd4k"
            url = uri("https://maven.pkg.github.com/swszz/ddd4k")
            credentials {
                username = System.getenv("DDD4K_ACTOR")
                password = System.getenv("DDD4K_TOKEN")
            }
        }
    }
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stblib)
    implementation(libs.kotlin.coroutines.test)
    implementation(libs.kotlin.coroutines.core)
    testImplementation(libs.junit.api)
    testImplementation(libs.junit.engine.jupiter)
    testImplementation(libs.assertj)
    testImplementation(libs.kotlin.junit.test)
    testRuntimeOnly(libs.junit.platform.launcher)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
