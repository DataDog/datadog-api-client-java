#!/bin/sh

find ./src -name '*.java' | xargs java -jar /app/google-java-format.jar -i
