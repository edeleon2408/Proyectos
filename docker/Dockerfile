# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="edeleon2408@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8082

#Archivo a desplegar
# The application's jar file
ARG JAR_FILE=/target/jenkins-0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} jenkins-0.1.jar

# Run the jar file 
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/jenkins-0.1.jar"]