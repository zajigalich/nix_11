#!/bin/sh

cd Console/

. ./build.sh

cd ../

cd Ant/

. ./build.sh

cd ../

cd Maven/app

. ./build.sh

cd ../../