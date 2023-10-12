# Start with a base image containing Java runtime (Choose your desired base image)
FROM openjdk:11-jre-slim

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file (Modify this according to your jar's name or path)
ARG JAR_FILE=target/chamadasHttp-test.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
