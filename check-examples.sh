#!/usr/bin/env bash

./extract-code-blocks.sh

for f in examples/v*/*/*.java ; do
    df=$(dirname $f)/$(basename $f .java)
    mkdir -p $df
    mv $f $df/Example.java
done

mvn -DskipTests -Dmaven.javadoc.skip=true clean install
ls examples/v*/*/*/Example.java | xargs -P $(($(nproc)*2)) -n 1 javac -cp "target/lib/*" -sourcepath src/main/java/
if [ $? -ne 0 ]; then
    echo -e "Failed to build examples"
    exit 1
fi
