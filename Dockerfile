FROM openjdk:8-jdk-alpine
COPY target/cd-test-0.0.1-SNAPSHOT.jar DatabaseService.jar
EXPOSE 8091
ENTRYPOINT java -jar DatabaseService.jar database