FROM openjdk:11
LABEL authors="prudhveee"
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]