# Use a JDK base image
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy the compiled jar from target (Maven build)
COPY target/discount-calculator-1.0-SNAPSHOT.jar app.jar

# Command to run the jar
ENTRYPOINT ["java","-jar","app.jar"]