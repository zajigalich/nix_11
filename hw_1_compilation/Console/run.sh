
echo Main-Class: ua.com.alevel.Main>MANIFEST.MF

javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.11.jar src/ua/com/alevel/Main.java

mkdir -p build/jar

cd build/classes

jar xf ../../libs/commons-lang3-3.12.0.jar

cd ../../

jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .
