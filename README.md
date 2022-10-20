FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]



docker build -t demo:1.0.0 .
docker run -p 8080:8080 demo:1.0.0

z1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zz