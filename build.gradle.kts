import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("plugin.jpa") version "1.8.22"
}

group = "com.morph"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

object Versions {
	const val kLogger = "4.+"
	const val hibernate = "6.1.4.Final"
}

dependencies {
	// runtime
	runtimeOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

	// kotlin
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// spring validation
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// logging
	implementation("io.github.oshai:kotlin-logging-jvm:${Versions.kLogger}")

	// testing
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// db
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	runtimeOnly("com.mysql:mysql-connector-j")
	implementation ("javax.persistence:javax.persistence-api:2.2")
	implementation ("org.hibernate:hibernate-core:${Versions.hibernate}")

	// optional
	implementation("org.springframework.boot:spring-boot-starter-mustache")
	implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
