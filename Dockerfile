FROM openjdk:8
ADD maventest-1.0-SNAPSHOT.jar maventest-1.0-SNAPSHOT.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","maventest-1.0-SNAPSHOT.jar"]