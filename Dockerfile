FROM openjdk:17
COPY ./target/ProyectoDavidDeportes-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8036
ENTRYPOINT [ "java", "jar", "app.jar"]