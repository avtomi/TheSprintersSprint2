FROM maven:3-jdk-11-slim AS build 

# Copy the java source files to docker image 
COPY ./src .
# Copy the pom file from java source to docker image
COPY ./pom.xml .
# Run a maven build to package the jar
mvn clean
mvn package 
FROM openjdk:11-jre-slim

# Copy jar from the target folder to the docker image 
COPY ./target/coordsgame-0.0.1-SNAPSHOT.jar .
# Expose port
EXPOSE 8080 

# Set the Entrypoint to run the java .jar
