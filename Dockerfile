
FROM openjdk:8
EXPOSE 8081
ADD target/Calculator-1.0-SNAPSHOT.jar Calculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-cp","Calculator-1.0-SNAPSHOT.jar","calculator.Calculator"]
