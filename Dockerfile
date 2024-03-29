# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

EXPOSE 85

# The application's jar file
ARG JAR_FILE=target/date-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
COPY ${JAR_FILE} date-service.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/date-service.jar"]