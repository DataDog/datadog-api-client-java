mvn package -DskipTests
if unzip -Z1 target/datadog-api-client-*-shaded-jar.jar | grep -v "^com/datadog" | grep -v "^META-INF" | grep "\.class$"; then
  exit 1
else
  exit 0
fi

