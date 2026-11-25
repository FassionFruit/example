plugins {
    kotlin("jvm") version "2.4.21"
    id("io.github.fassionfruit") version "0.5.0"
}

group = "io.github.fassionfruit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.fassionfruit:core:0.5.0")
    implementation("io.github.fassionfruit:api:0.5.0")

    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(26)
}

tasks.test {
    useJUnitPlatform()
}