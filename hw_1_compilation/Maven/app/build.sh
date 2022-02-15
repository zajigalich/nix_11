#!/bin/sh

mvn clean package

java -jar target/main.jar

sleep 5s