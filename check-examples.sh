#!/usr/bin/env bash

if [ $# -eq 0 ]; then
    echo "No arguments supplied"
    exit 2
fi

./extract-code-blocks.sh examples $1

for f in examples/$1/*/*.java ; do
    filename=$(basename -- "$f")
    filename="${filename%.*}"
    sed -i.bak "s/public class Example/public class $filename/" $f
done

mvn --batch-mode  dependency:copy-dependencies

ls examples/$1/*/*.java | xargs javac -cp "target/dependency/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build examples"
    exit 1
fi
