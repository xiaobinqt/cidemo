FROM openjdk:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN java -version

