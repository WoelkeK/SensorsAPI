FROM openjdk:20-ea-31-jdk-oracle
VOLUME /sensorApi
ADD target/sensorApi-0.0.1-SNAPSHOT.jar sensorApi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/sensorApi.jar"]
