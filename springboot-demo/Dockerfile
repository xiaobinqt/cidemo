# Webhook5
FROM maven:3.8.1-openjdk-8-slim
ADD pom.xml /tmp/build/
WORKDIR /tmp/build
RUN  mvn dependency:resolve

ADD src /tmp/build/src
RUN mvn -DskipTests=true package && \
    mv target/*.jar /app.jar && \
    cd / && rm -rf /tmp/build

FROM openjdk:8u292-jre-slim
COPY --from=0 /app.jar .
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
