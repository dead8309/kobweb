import org.jetbrains.kotlin.cli.jvm.main

plugins {
    `kotlin-dsl`
    kotlin("jvm")
    id("com.varabyte.kobweb.internal.publish")
    `java-library`
    `java-gradle-plugin`
}

group = "com.varabyte.kobwebx.gradle"
version = libs.versions.kobweb.get()

dependencies {
    implementation(kotlin("stdlib"))
    // Get access to Kotlin multiplatform source sets
    implementation(kotlin("gradle-plugin"))

    implementation(libs.bundles.commonmark)

    implementation(project(":common:kobweb-project"))

    // Compile only - the plugin itself should exist at runtime
    compileOnly(project(":frontend:gradle:application"))
}

val DESCRIPTION = "A Gradle plugin that adds markdown support to a Kobweb project"
gradlePlugin {
    plugins {
        create("kobwebxMarkdown") {
            id = "com.varabyte.kobwebx.markdown"
            displayName = "Kobwebx Markdown Plugin"
            description = DESCRIPTION
            implementationClass = "com.varabyte.kobwebx.gradle.markdown.KobwebxMarkdownPlugin"
        }
    }
}

kobwebPublication {
    // Leave artifactId blank. It will be set to the name of this module, and then the gradlePlugin step does some
    // additional tweaking that we don't want to interfere with.
    description.set(DESCRIPTION)
}