#!/bin/sh

rm -rf build

rm -f MANIFEST.MF

echo Main-Class: ua.com.alevel.Main>MANIFEST.MF

javac -sourcepath ./src -d build/classes -classpath ./libs/commons-lang3-3.12.0.jar src/ua/com/alevel/Main.java

mkdir -p build/jar

cd build/classes

jar xf ../../libs/commons-lang3-3.12.0.jar

cd ../../

jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .

java -jar ./build/jar/HelloWorld.jar

sleep 5s