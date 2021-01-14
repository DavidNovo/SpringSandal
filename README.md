# SpringSandal

## Introduction

## Operations

### Running the application
If you use Maven, you can run the application by using 
    ./mvnw spring-boot:run
Alternatively, you can build the JAR file with 
    ./mvnw clean package 
and then run the JAR file, as follows:
    java -jar target/gs-rest-service-0.1.0.jar

### Default end points for the applications

#### Actuator 
These are default endpoints used to monitor the health and characterists of the application.

By default, the endpoints start with the prefix of '/actuator' and append the specific endpoint.  See https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html for a complete list.

Location os swagger docs
http://localhost:8080/swagger-ui/index.html
