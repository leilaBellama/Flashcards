plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("androidx.annotation:annotation:1.7.1")
    testImplementation("junit:junit:4.13.2")
}