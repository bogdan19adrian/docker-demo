FROM openjdk:17-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]



docker build -t demo:1.0.0 .
docker run -p 8083:8080 demo:1.0.0

z1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zz

version: '3.4'
services:
demo-service:
image: ${REGISTRY_URL}/demo:1.0.1
ports:
- "8084:8080"
environment:
- TZ=Europe/London
networks:
-  demo-management-net
deploy:
update_config:
failure_action: continue
order: start-first
mode: replicated
replicas: 1

mongodb_container:
image: mongo:latest
environment:
MONGO_INITDB_ROOT_USERNAME: root
MONGO_INITDB_ROOT_PASSWORD: rootpassword
ports:
- "27017:27017"
networks:
- demo-management-net
deploy:
update_config:
failure_action: continue
order: start-first
mode: replicated
replicas: 1


networks:
demo-management-net:
driver: overlay
attachable: true