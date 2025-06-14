# Stage 1: Build
FROM maven:3.9.3-eclipse-temurin-21 as builder
WORKDIR /app
COPY app/pom.xml .
COPY app/src ./src
RUN mvn clean package


# State 2: run
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/target/*.war app.war

#create directories for bind and volume
RUN mkdir /logs /data

#app port
EXPOSE 8080

#run app 
ENTRYPOINT ["java", "-jar", "app.war"]