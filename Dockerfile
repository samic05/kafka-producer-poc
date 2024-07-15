FROM docker.io/azul/zulu-openjdk-alpine:17-latest
ARG JAR_FILE='build/libs/*.jar'
COPY ${JAR_FILE} app.jar


EXPOSE 8080

ENTRYPOINT java -jar app.jar