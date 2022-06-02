buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.6.21"))
    }
}

allprojects {
    repositories {
        jcenter()

        // JetPack Compose - Desktop
        // https://github.com/JetBrains/compose-jb
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
