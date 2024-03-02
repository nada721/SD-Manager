FROM openjdk:11-jdk-slim

ADD target/SD-Manager-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]