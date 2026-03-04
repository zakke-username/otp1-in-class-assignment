FROM maven:latest
WORKDIR /app
COPY pom.xml .
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/otp1-in-class-assignment-1.0-SNAPSHOT.jar"]