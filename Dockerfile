FROM openjdk:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN java -version


FROM alpine
ARG VERSION
ARG GIT_COMMIT
RUN echo  "ci demo, version:${VERSION}" > ci_demo.txt \
    && tar -czvf cidemo.${VERSION}.${GIT_COMMIT}.tar.gz ci_demo.txt \
    && mkdir -p /ci/package \
    && mv cidemo.${VERSION}.${GIT_COMMIT}.tar.gz /ci/package
