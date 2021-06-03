FROM openjdk:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN java -version


FROM alpine
RUN echo  "ci demo" > ci_demo.txt \
    && tar -czvf cidemo.tar.gz ci_demo.txt \
    && mkdir -p /ci/package \
    && mv cidemo.tar.gz /ci/package
