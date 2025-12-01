# Create the package. Skip tests since this is just for testing the contents of the jar. We've already run the tests in another step.
mvn package -DskipTests -Dmaven.javadoc.skip=true
if [ $? -ne 0 ]; then
  exit 1
fi
# List everything in the shaded jar. Anything in com/datadog is good since that's either shaded or our own code.
# We intentionally avoid shading anything in META-INF in the pom.xml.
# And there are some native libraries in other directories that we don't shade so we only want to check for .class files.
if unzip -Z1 target/datadog-api-client-*-shaded-jar.jar | grep -v "^com/datadog" | grep -v "^META-INF" | grep "\.class$"; then
  exit 1
else
  exit 0
fi

