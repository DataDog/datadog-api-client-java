#!/bin/sh

set -e

if [ $# -ne 0 ]; then
    JAR_FILE="target/google-java-format.jar"
    if [[ -e $JAR_FILE ]]; then
        ARGS=" --add-exports jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-exports jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-exports jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"
        find "$@" -name '*.java' | xargs java ${ARGS} -jar target/google-java-format.jar -i
    else
        docker build -t google-java-format -f Dockerfile.format .
        docker run -v ${PWD}/src:/app/src google-java-format --replace --set-exit-if-changed $@
    fi
fi
