FROM maven:3.5.4-jdk-8-alpine

ENV APP_NAME=mkt-ex-demo-application.jar

RUN apk add --update jq && rm -rf /var/cache/apk/*

RUN mkdir /app
COPY ./application/target/$APP_NAME /app

WORKDIR /app
CMD java -Xmx512m -jar $APP_NAME
