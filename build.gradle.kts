plugins {
	java
	id("org.springframework.boot") version "2.6.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.hector"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.springframework.boot:spring-boot-starter-security")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
