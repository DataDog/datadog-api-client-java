#!/bin/bash -ex

pushd ../v1/
DATADOG_V1_VERSION=`mvn -q \
  -Dexec.executable="echo" \
  -Dexec.args='${project.version}' \
  --non-recursive \
  org.codehaus.mojo:exec-maven-plugin:1.6.0:exec`
popd

mvn clean install exec:java -Dexec.mainClass="com.test.App" -Dexec.cleanupDaemonThreads=false -Ddatadog-v1-client-version=${DATADOG_V1_VERSION}