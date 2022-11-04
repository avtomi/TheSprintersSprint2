FROM maven:3-jdk-11-slim AS build 

# Copy the java source files to docker image 
COPY ./src ./src
# Copy the pom file from java source to docker image
COPY ./pom.xml ./pom.xml
# Run a maven build to package the jar
RUN mvn -f ./pom.xml clean package

 
FROM openjdk:11-jre-slim

# Copy jar from the target folder to the docker image 
RUN pwd
COPY --from=build ./target/coordsgame-0.0.1-SNAPSHOT-jar-with-dependencies.jar .
# Expose port
EXPOSE 8080 

# Set the Entrypoint to run the java .jar
ENTRYPOINT ["java","-jar","./coordsgame-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]
