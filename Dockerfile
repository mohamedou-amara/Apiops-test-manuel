# Use a base image with Java installed
FROM openjdk:11-jdk
# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/Apiops-test-manuel-app.jar .

# Expose a port (if your application listens on a specific port)
EXPOSE 8080

# Set the command to run when the container starts
CMD ["java", "-jar", "Apiops-test-manuel-app.jar"]
