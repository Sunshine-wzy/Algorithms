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
    
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}