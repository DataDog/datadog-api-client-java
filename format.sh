#!/bin/sh

find "$@" -name '*.java' | xargs java -jar /app/google-java-format.jar -i
