#!/bin/bash -ex

pushd ..
DATADOG_CLIENT_VERSION=`mvn -q \
  -Dexec.executable="echo" \
  -Dexec.args='${project.version}' \
  --non-recursive \
  org.codehaus.mojo:exec-maven-plugin:1.6.0:exec`
popd

mvn clean install exec:java -Dexec.mainClass="com.test.App" -Dexec.cleanupDaemonThreads=false -Ddatadog-client-version=${DATADOG_CLIENT_VERSION}
