#!/usr/bin/env bash

./extract-code-blocks.sh

for f in examples/v*/*/*.java ; do
    filename=$(basename -- "$f")
    filename="${filename%.*}"
    sed -i.bak "s/public class Example/public class $filename/" $f
done

mvn -DskipTests -Dmaven.javadoc.skip=true clean install

# We separate v1 and v2 as operation IDs can be duplicated between the 2
ls examples/v1/*/*.java | xargs javac -cp "target/lib/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build v1 examples"
    exit 1
fi

ls examples/v2/*/*.java | xargs javac -cp "target/lib/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build v2 examples"
    exit 1
fi
