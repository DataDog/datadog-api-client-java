#!/bin/sh

docker build -t google-java-format -f Dockerfile.format .

FILES_TO_FORMAT=$(find ./src -name '*.java' | xargs docker run -v ${PWD}/src:/app/src google-java-format --dry-run)

if [ -n "${FILES_TO_FORMAT}" ]; then
    docker run -v ${PWD}/src:/app/src google-java-format --replace --set-exit-if-changed ${FILES_TO_FORMAT}
    # How to commit the formatted files?
fi
