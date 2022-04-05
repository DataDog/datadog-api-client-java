# datadog-api-client-java

This repository contains a Java API client for the [Datadog API](https://docs.datadoghq.com/api/).
The code is generated using [openapi-generator](https://github.com/OpenAPITools/openapi-generator)
and [apigentools](https://github.com/DataDog/apigentools).

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.datadoghq</groupId>
  <artifactId>datadog-api-client</artifactId>
  <version>1.2.0</version>
  <scope>compile</scope>
</dependency>
```

See the [Releases page](https://github.com/DataDog/datadog-api-client-java/releases) for the latest available version.

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.datadoghq:datadog-api-client:1.2.0"
```

See the [Releases page](https://github.com/DataDog/datadog-api-client-java/releases) for the latest available version.

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/datadog-api-client-<VERSION>.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.datadog.api.v1.client.*;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class AwsIntegrationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization:
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        try {
            AWSAccountCreateResponse result = apiInstance.createAWSAccount(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Asynchronous support

All API methods have asynchronous versions returning `CompletableFuture` when adding the `Async` suffix to their names:

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;

public class ListMonitorsAsyncExample {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    apiInstance.listMonitorsAsync().thenApply(monitors -> {
      System.out.println(monitors);
      return null;
    }).exceptionally(error -> {
      System.out.println(error);
      return null;
    });
  }
}
```

### Unstable Endpoints

This client includes access to Datadog API endpoints while they are in an unstable state and may undergo breaking changes. An extra configuration step is required to enable these endpoints:

```java
defaultClient.setUnstableOperationEnabled("<OperationName>", true);
```

where `<OperationName>` is the name of the method used to interact with that endpoint. For example: `listSLOCorrection`, or `getSLOHistory`

### Changing Server

When talking to a different server, like the `eu` instance, change the `serverVariables` on your client:

```java
HashMap<String, String> serverVariables = new HashMap<String, String>();
serverVariables.put("site", "datadoghq.eu");
defaultApiClient.setServerVariables(serverVariables);
```

### Disable compressed payloads

If you want to disable GZIP compressed responses, set the `compress` flag
on your client:

```java
defaultClient.setCompress(false)
```

### Enable requests logging

If you want to enable requests logging, set the `debugging` flag on your client:

```java
defaultClient.setDebugging(true)
```

## Documentation for API Endpoints and Models

Javadoc is available on [javadoc.io](https://www.javadoc.io/doc/com.datadoghq/datadog-api-client/latest/).

## Documentation for Authorization

To programmatically defined authorization headers, calls the `configureApiKeys`
method with a map containing the required secrets for the operations:

```java
HashMap<String, String> secrets = new HashMap<>();
secrets.put("apiKeyAuth", "<YOUR API KEY>");
secrets.put("appKeyAuth", "<YOUR APPLICATION KEY>");
generalApiClient.configureApiKeys(secrets);
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@datadoghq.com
