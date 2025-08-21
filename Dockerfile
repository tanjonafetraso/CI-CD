FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar /app/teackstore.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/teackstore.jar"]