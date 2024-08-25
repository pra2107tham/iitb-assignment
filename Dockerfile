FROM openjdk:21-jdk-slim
LABEL authors="pratham"
ARG JAR_FILE=target/*.jar
COPY ./target/courses-api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]