# Use Eclipse Temurin JDK 24
FROM eclipse-temurin:24-jdk

# Directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]