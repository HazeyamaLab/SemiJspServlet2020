FROM adoptopenjdk/openjdk11:alpine

ENV APP_PATH /usr/local/SpringWork2020G2
ENV DRIVER_URL jdbc:mysql://semi2020_db:3306/semi?useUnicode=true&characterEncoding=UTF-8&useSSL=false

WORKDIR ${APP_PATH}
RUN mkdir -p ${APP_PATH}
COPY . ${APP_PATH}

ENTRYPOINT ./gradlew tR