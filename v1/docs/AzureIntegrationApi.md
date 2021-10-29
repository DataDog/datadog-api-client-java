# AzureIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createAzureIntegration**](AzureIntegrationApi.md#createAzureIntegration) | **POST** /api/v1/integration/azure | Create an Azure integration
[**deleteAzureIntegration**](AzureIntegrationApi.md#deleteAzureIntegration) | **DELETE** /api/v1/integration/azure | Delete an Azure integration
[**listAzureIntegration**](AzureIntegrationApi.md#listAzureIntegration) | **GET** /api/v1/integration/azure | List all Azure integrations
[**updateAzureHostFilters**](AzureIntegrationApi.md#updateAzureHostFilters) | **POST** /api/v1/integration/azure/host_filters | Update Azure integration host filters
[**updateAzureIntegration**](AzureIntegrationApi.md#updateAzureIntegration) | **PUT** /api/v1/integration/azure | Update an Azure integration



## createAzureIntegration

> Object createAzureIntegration(body);

Create a Datadog-Azure integration.

Using the `POST` method updates your integration configuration by adding your new
configuration to the existing one in your Datadog organization.

Using the `PUT` method updates your integration configuration by replacing your
current configuration with the new one sent to your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Create a Datadog-Azure integration for your Datadog account request body.
        try {
            Object result = apiInstance.createAzureIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#createAzureIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureAccount**](AzureAccount.md)| Create a Datadog-Azure integration for your Datadog account request body. |

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |


## deleteAzureIntegration

> Object deleteAzureIntegration(body);

Delete a given Datadog-Azure integration from your Datadog account.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Delete a given Datadog-Azure integration request body.
        try {
            Object result = apiInstance.deleteAzureIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#deleteAzureIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureAccount**](AzureAccount.md)| Delete a given Datadog-Azure integration request body. |

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |


## listAzureIntegration

> List&lt;AzureAccount&gt; listAzureIntegration();

List all Datadog-Azure integrations configured in your Datadog account.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        try {
            List<AzureAccount> result = apiInstance.listAzureIntegration();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#listAzureIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;AzureAccount&gt;**](AzureAccount.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |


## updateAzureHostFilters

> Object updateAzureHostFilters(body);

Update the defined list of host filters for a given Datadog-Azure integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Update a Datadog-Azure integration's host filters request body.
        try {
            Object result = apiInstance.updateAzureHostFilters(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#updateAzureHostFilters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureAccount**](AzureAccount.md)| Update a Datadog-Azure integration&#39;s host filters request body. |

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |


## updateAzureIntegration

> Object updateAzureIntegration(body);

Update a Datadog-Azure integration. Requires an existing `tenant_name` and `client_id`.
Any other fields supplied will overwrite existing values. To overwrite `tenant_name` or `client_id`,
use `new_tenant_name` and `new_client_id`. To leave a field unchanged, do not supply that field in the payload.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Update a Datadog-Azure integration request body.
        try {
            Object result = apiInstance.updateAzureIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#updateAzureIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureAccount**](AzureAccount.md)| Update a Datadog-Azure integration request body. |

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |

