FROM openjdk:17-jdk
COPY target/namingserver.jar .
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "namingserver.jar"]