plugins {
    id("java")
    alias(libs.plugins.run.paper)
}

group = "io.papermc"
version = "1.0.0"

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(libs.paper.api)
}

tasks {
    runServer {
        minecraftVersion(libs.versions.minecraft.get())
        jvmArgs("-Dcom.mojang.eula.agree=true", "-Xms4G", "-Xmx4G")
    }
}