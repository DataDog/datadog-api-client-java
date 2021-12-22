#!/bin/bash

set -e

JAVA=$(which java)

if [ $# -ne 0 ]; then
    if [[ -x "$JAVA" ]]; then
        JAR_FILE="google-java-format.jar"
        if [[ ! -f "$JAR_FILE" ]]; then
            curl -L https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar -o $JAR_FILE
        fi
        find "$@" -name '*.java' | xargs java -jar $JAR_FILE -i
    else
        docker build -t google-java-format -f Dockerfile.format .
        docker run -v ${PWD}:/app/src --workdir /app/src google-java-format --replace --set-exit-if-changed $(find "$@" -name '*.java')
    fi
fi
