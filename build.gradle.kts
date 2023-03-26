plugins {
    id("java")
}

group = "io.github.sunshinewzy"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(fileTree("libs"))
    
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}