@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
dependencyResolutionManagement {
    repositories {
        System.getenv("GITHUB_ACTIONS")?.let {
            maven("https://maven.aliyun.com/repository/public/")
        }

        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        System.getenv("GITHUB_ACTIONS")?.let {
            maven("https://maven.aliyun.com/repository/gradle-plugin/")
        }

        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "kotlin-multiplatform-template"

include("app")
