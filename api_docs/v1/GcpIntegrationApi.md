# GcpIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createGCPIntegration**](GcpIntegrationApi.md#createGCPIntegration) | **POST** /api/v1/integration/gcp | Create a GCP integration
[**deleteGCPIntegration**](GcpIntegrationApi.md#deleteGCPIntegration) | **DELETE** /api/v1/integration/gcp | Delete a GCP integration
[**listGCPIntegration**](GcpIntegrationApi.md#listGCPIntegration) | **GET** /api/v1/integration/gcp | List all GCP integrations
[**updateGCPIntegration**](GcpIntegrationApi.md#updateGCPIntegration) | **PUT** /api/v1/integration/gcp | Update a GCP integration



## createGCPIntegration

> Object createGCPIntegration(body);

Create a Datadog-GCP integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Create a Datadog-GCP integration.
        try {
            Object result = apiInstance.createGCPIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#createGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Create a Datadog-GCP integration. |

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
| **403** | Authentication error |  -  |


## deleteGCPIntegration

> Object deleteGCPIntegration(body);

Delete a given Datadog-GCP integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Delete a given Datadog-GCP integration.
        try {
            Object result = apiInstance.deleteGCPIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#deleteGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Delete a given Datadog-GCP integration. |

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
| **403** | Authentication error |  -  |


## listGCPIntegration

> List&lt;GCPAccount&gt; listGCPIntegration();

List all Datadog-GCP integrations configured in your Datadog account.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        try {
            List<GCPAccount> result = apiInstance.listGCPIntegration();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#listGCPIntegration");
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

[**List&lt;GCPAccount&gt;**](GCPAccount.md)

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
| **403** | Authentication error |  -  |


## updateGCPIntegration

> Object updateGCPIntegration(body);

Update a Datadog-GCP integrations host_filters and/or auto-mute.
Requires a `project_id` and `client_email`, however these fields cannot be updated.
If you need to update these fields, delete and use the create (`POST`) endpoint.
The unspecified fields will keep their original values.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Update a Datadog-GCP integration.
        try {
            Object result = apiInstance.updateGCPIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#updateGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Update a Datadog-GCP integration. |

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
| **403** | Authentication error |  -  |

