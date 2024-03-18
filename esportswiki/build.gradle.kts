plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.starfoxinc"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-web")
	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")

	//sqlite
	//runtimeOnly("org.xerial:sqlite-jdbc:3.43.0")

	//mysql
	implementation("mysql:mysql-connector-java")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
