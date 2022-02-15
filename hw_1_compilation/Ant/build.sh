#!/bin/sh

ant clean compile jar

java -jar ./build/jar/thanks.jar

sleep 5s