#!/usr/bin/env bash

#./extract-code-blocks.sh examples

for f in examples/*/*/*.java ; do
    filename=$(basename -- "$f")
    filename="${filename%.*}"
    sed -i.bak "s/public class Example/public class $filename/" $f
done

mvn --batch-mode  dependency:copy-dependencies

find examples/v1/*/*.java -print0 | xargs -0 javac -cp "target/dependency/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build v1 examples"
    exit 1
fi

find examples/v2/*/*.java -print0 | xargs -0 javac -cp "target/dependency/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build v2 examples"
    exit 1
fi