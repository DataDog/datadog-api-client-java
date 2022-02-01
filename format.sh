#!/bin/bash

set -e

if [ $# -ne 0 ]; then
    JAR_FILE="/app/google-java-format.jar"
    if [[ -e $JAR_FILE ]]; then
        find "$@" -name '*.java' | xargs java -jar /app/google-java-format.jar -i
    else
        docker build -t google-java-format -f Dockerfile.format .
        docker run --rm -v ${PWD}:/app/src --workdir /app/src google-java-format --replace --set-exit-if-changed $(find "$@" -name '*.java')
    fi
fi
