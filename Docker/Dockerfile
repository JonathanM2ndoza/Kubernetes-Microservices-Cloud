FROM openjdk:8-jdk-alpine

LABEL maintainer="Jonathan Mendoza"

EXPOSE 8071

ARG JAR_FILE=kubernetes-cloud-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} kubernetes-cloud.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/kubernetes-cloud.jar"]