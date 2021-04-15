#!/bin/sh

if [ $# -ne 0 ]; then
    docker build -t google-java-format -f Dockerfile.format .
    docker run -v ${PWD}/src:/app/src google-java-format --replace --set-exit-if-changed $@
fi
