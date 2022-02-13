#!/bin/sh

javac -sourcepath ./src -classpath "libs/commons-lang3-3.12.0.jar;
libs/commons-geometry-euclidean-1.0.jar" src/ua/com/alevel/HelloWorld.java

mkdir -p build/jar

cd build/

jar xf ../../libs/commons-lang3-3.12.0.jar

jar xf ../../libs/commons-geometry-euclidean-1.0.jar

cd ../../

jar cmf MANIFEST.MF ./jar/main.jar -C build/classes/ .

