#!/bin/sh

find ./src -name '*.java' | xargs java -jar google-java-format-1.9-all-deps.jar -i
