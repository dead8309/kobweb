import com.varabyte.kobweb.gradle.publish.FILTER_OUT_MULTIPLATFORM_PUBLICATIONS
import com.varabyte.kobweb.gradle.publish.set

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("kobweb-compose")
    id("com.varabyte.kobweb.internal.publish")
}

group = "com.varabyte.kobweb"
version = libs.versions.kobweb.libs.get()

kotlin {
    js {
        browser()
    }

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)

            api(projects.frontend.kobwebCore)
            api(projects.frontend.silkFoundation)
            api(projects.frontend.silkWidgets)
            api(projects.frontend.silkWidgetsKobweb)
        }
    }
}

kobwebPublication {
    artifactName.set("Kobweb Silk")
    artifactId.set("kobweb-silk")
    description.set("An artifact that includes all relevant Silk dependencies and glues them together.")
    filter.set(FILTER_OUT_MULTIPLATFORM_PUBLICATIONS)
}
