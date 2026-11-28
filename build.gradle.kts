plugins {
    kotlin("jvm") version "2.4.21"
    id("com.gradleup.shadow") version "9.2.2"
    id("io.github.fassionfruit") version "0.5.1"
}

group = "io.github.fassionfruit"
version = "1.0-SNAPSHOT"


tasks.jar {
    manifest.attributes["Main-Class"] = "examples.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.fassionfruit:core:0.5.0")
    implementation("io.github.fassionfruit:api:0.5.0")

    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
}

tasks.build {
    dependsOn("shadowJar")
}

tasks.shadowJar {
    archiveClassifier.set("")
}

tasks.test {
    useJUnitPlatform()
}