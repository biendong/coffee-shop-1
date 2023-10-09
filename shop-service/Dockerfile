FROM maven:3.8-openjdk-17-slim AS build
COPY src ./src
COPY pom.xml .
RUN mvn clean package -DskipTests

FROM tomcat:9-jdk17-openjdk-slim AS run
COPY --from=build target/*.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]