# WebhooksIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                                                                           | HTTP request                                                                                  | Description                   |
| ---------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | ----------------------------- |
| [**createWebhooksIntegration**](WebhooksIntegrationApi.md#createWebhooksIntegration)                             | **POST** /api/v1/integration/webhooks/configuration/webhooks                                  | Create a webhooks integration |
| [**createWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#createWebhooksIntegrationCustomVariable) | **POST** /api/v1/integration/webhooks/configuration/custom-variables                          | Create a custom variable      |
| [**deleteWebhooksIntegration**](WebhooksIntegrationApi.md#deleteWebhooksIntegration)                             | **DELETE** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                 | Delete a webhook              |
| [**deleteWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#deleteWebhooksIntegrationCustomVariable) | **DELETE** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name} | Delete a custom variable      |
| [**getWebhooksIntegration**](WebhooksIntegrationApi.md#getWebhooksIntegration)                                   | **GET** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                    | Get a webhook integration     |
| [**getWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#getWebhooksIntegrationCustomVariable)       | **GET** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}    | Get a custom variable         |
| [**updateWebhooksIntegration**](WebhooksIntegrationApi.md#updateWebhooksIntegration)                             | **PUT** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                    | Update a webhook              |
| [**updateWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#updateWebhooksIntegrationCustomVariable) | **PUT** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}    | Update a custom variable      |

## createWebhooksIntegration

> WebhooksIntegration createWebhooksIntegration(body);

Creates an endpoint with the name `<WEBHOOK_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    WebhooksIntegration body = new WebhooksIntegration(); // WebhooksIntegration | Create a webhooks integration request body.
    try {
      WebhooksIntegration result = apiInstance.createWebhooksIntegration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#createWebhooksIntegration"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name     | Type                                              | Description                                 | Notes |
| -------- | ------------------------------------------------- | ------------------------------------------- | ----- |
| **body** | [**WebhooksIntegration**](WebhooksIntegration.md) | Create a webhooks integration request body. |

### Return type

[**WebhooksIntegration**](WebhooksIntegration.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **201**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |

## createWebhooksIntegrationCustomVariable

> WebhooksIntegrationCustomVariableResponse createWebhooksIntegrationCustomVariable(body);

Creates an endpoint with the name `<CUSTOM_VARIABLE_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    WebhooksIntegrationCustomVariable body = new WebhooksIntegrationCustomVariable(); // WebhooksIntegrationCustomVariable | Define a custom variable request body.
    try {
      WebhooksIntegrationCustomVariableResponse result = apiInstance.createWebhooksIntegrationCustomVariable(
        body
      );
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#createWebhooksIntegrationCustomVariable"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name     | Type                                                                          | Description                            | Notes |
| -------- | ----------------------------------------------------------------------------- | -------------------------------------- | ----- |
| **body** | [**WebhooksIntegrationCustomVariable**](WebhooksIntegrationCustomVariable.md) | Define a custom variable request body. |

### Return type

[**WebhooksIntegrationCustomVariableResponse**](WebhooksIntegrationCustomVariableResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **201**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |

## deleteWebhooksIntegration

> deleteWebhooksIntegration(webhookName);

Deletes the endpoint with the name `<WEBHOOK NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String webhookName = "webhookName_example"; // String | The name of the webhook.
    try {
      apiInstance.deleteWebhooksIntegration(webhookName);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#deleteWebhooksIntegration"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name            | Type       | Description              | Notes |
| --------------- | ---------- | ------------------------ | ----- |
| **webhookName** | **String** | The name of the webhook. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |

## deleteWebhooksIntegrationCustomVariable

> deleteWebhooksIntegrationCustomVariable(customVariableName);

Deletes the endpoint with the name `<CUSTOM_VARIABLE_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String customVariableName = "customVariableName_example"; // String | The name of the custom variable.
    try {
      apiInstance.deleteWebhooksIntegrationCustomVariable(customVariableName);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#deleteWebhooksIntegrationCustomVariable"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name                   | Type       | Description                      | Notes |
| ---------------------- | ---------- | -------------------------------- | ----- |
| **customVariableName** | **String** | The name of the custom variable. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |

## getWebhooksIntegration

> WebhooksIntegration getWebhooksIntegration(webhookName);

Gets the content of the webhook with the name `<WEBHOOK_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String webhookName = "webhookName_example"; // String | The name of the webhook.
    try {
      WebhooksIntegration result = apiInstance.getWebhooksIntegration(
        webhookName
      );
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#getWebhooksIntegration"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name            | Type       | Description              | Notes |
| --------------- | ---------- | ------------------------ | ----- |
| **webhookName** | **String** | The name of the webhook. |

### Return type

[**WebhooksIntegration**](WebhooksIntegration.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |

## getWebhooksIntegrationCustomVariable

> WebhooksIntegrationCustomVariableResponse getWebhooksIntegrationCustomVariable(customVariableName);

Shows the content of the custom variable with the name `<CUSTOM_VARIABLE_NAME>`.

If the custom variable is secret, the value does not return in the
response payload.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String customVariableName = "customVariableName_example"; // String | The name of the custom variable.
    try {
      WebhooksIntegrationCustomVariableResponse result = apiInstance.getWebhooksIntegrationCustomVariable(
        customVariableName
      );
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#getWebhooksIntegrationCustomVariable"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name                   | Type       | Description                      | Notes |
| ---------------------- | ---------- | -------------------------------- | ----- |
| **customVariableName** | **String** | The name of the custom variable. |

### Return type

[**WebhooksIntegrationCustomVariableResponse**](WebhooksIntegrationCustomVariableResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |

## updateWebhooksIntegration

> WebhooksIntegration updateWebhooksIntegration(webhookName, body);

Updates the endpoint with the name `<WEBHOOK_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String webhookName = "webhookName_example"; // String | The name of the webhook.
    WebhooksIntegrationUpdateRequest body = new WebhooksIntegrationUpdateRequest(); // WebhooksIntegrationUpdateRequest | Update an existing Datadog-Webhooks integration.
    try {
      WebhooksIntegration result = apiInstance.updateWebhooksIntegration(
        webhookName,
        body
      );
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#updateWebhooksIntegration"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name            | Type                                                                        | Description                                      | Notes |
| --------------- | --------------------------------------------------------------------------- | ------------------------------------------------ | ----- |
| **webhookName** | **String**                                                                  | The name of the webhook.                         |
| **body**        | [**WebhooksIntegrationUpdateRequest**](WebhooksIntegrationUpdateRequest.md) | Update an existing Datadog-Webhooks integration. |

### Return type

[**WebhooksIntegration**](WebhooksIntegration.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |

## updateWebhooksIntegrationCustomVariable

> WebhooksIntegrationCustomVariableResponse updateWebhooksIntegrationCustomVariable(customVariableName, body);

Updates the endpoint with the name `<CUSTOM_VARIABLE_NAME>`.

### Example

```java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(
      defaultClient
    );
    String customVariableName = "customVariableName_example"; // String | The name of the custom variable.
    WebhooksIntegrationCustomVariableUpdateRequest body = new WebhooksIntegrationCustomVariableUpdateRequest(); // WebhooksIntegrationCustomVariableUpdateRequest | Update an existing custom variable request body.
    try {
      WebhooksIntegrationCustomVariableResponse result = apiInstance.updateWebhooksIntegrationCustomVariable(
        customVariableName,
        body
      );
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
        "Exception when calling WebhooksIntegrationApi#updateWebhooksIntegrationCustomVariable"
      );
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name                   | Type                                                                                                    | Description                                      | Notes |
| ---------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------ | ----- |
| **customVariableName** | **String**                                                                                              | The name of the custom variable.                 |
| **body**               | [**WebhooksIntegrationCustomVariableUpdateRequest**](WebhooksIntegrationCustomVariableUpdateRequest.md) | Update an existing custom variable request body. |

### Return type

[**WebhooksIntegrationCustomVariableResponse**](WebhooksIntegrationCustomVariableResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication error | -                |
| **404**     | Item Not Found       | -                |
