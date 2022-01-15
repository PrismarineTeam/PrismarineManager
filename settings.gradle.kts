import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "Prismarine"
for (name in listOf("Prismarine-API", "Prismarine-Server")) {
    val projName = name
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
