plugins {
    java
    kotlin("jvm") version "2.0.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "com.author.plugin"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    val paperVersion: String by project

    shadow("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
    compileOnly("io.papermc.paper:paper-api:$paperVersion-R0.1-SNAPSHOT")
}

kotlin {
    jvmToolchain(17)
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}