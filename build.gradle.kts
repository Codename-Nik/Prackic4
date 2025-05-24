plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.0.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}