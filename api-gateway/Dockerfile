#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar
#
#EXPOSE 8765
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:17-jdk
COPY target/apigateway.jar .
EXPOSE 8765
ENTRYPOINT ["java", "-jar", "apigateway.jar"]