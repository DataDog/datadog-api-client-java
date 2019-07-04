# Example Application Using Datadog Java API Client

This directory contains an example application that demonstrates the usage
of Datadog Java API Client. See `src/main/java/com/test/App.java` file
which contains the code manipulating API objects.

**NOTE**: The example app actually creates, modifies and deletes some objects.
Never run it on your production account!

## Running

To run the example application, you need to compile and install the client
library locally first. In order to do that, run:

```
./build-client.sh
```

Then you can actually run the example application (you can also use this
to re-compile and run the example application itself if you do local
modifications to it):

```
# the example application reads Datadog API and application keys
# from environment variables
export DATADOG_API_KEY=<your-datadog-api-key>
export DATADOG_APP_KEY=<your-datadog-app-key>
./run-example-app.sh
```