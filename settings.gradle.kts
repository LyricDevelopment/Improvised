rootProject.name = "Improvised"

include("utilitiesapi")

dependencyResolutionManagement {

    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }

}
