FROM maven:3.8.4-openjdk-11
WORKDIR /app
COPY . /app
COPY ./target/MiniProject_SPE-1.0-SNAPSHOT.jar ./
CMD ["java", "-cp", "MiniProject_SPE-1.0-SNAPSHOT.jar", "org.example.Main"]


