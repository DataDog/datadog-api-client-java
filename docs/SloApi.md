# SloApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkPartialDeleteSlo**](SloApi.md#bulkPartialDeleteSlo) | **POST** /api/v1/slo/bulk_delete | Delete (or partially delete) multiple service level objective objects.
[**checkCanDeleteSlo**](SloApi.md#checkCanDeleteSlo) | **GET** /api/v1/slo/can_delete | Check if SLOs can be safely deleted.
[**createSlo**](SloApi.md#createSlo) | **POST** /api/v1/slo | Create a service level objective object.
[**deleteSlo**](SloApi.md#deleteSlo) | **DELETE** /api/v1/slo/{slo_id} | Delete the specified service level objective object.
[**editSlo**](SloApi.md#editSlo) | **PUT** /api/v1/slo/{slo_id} | Edit the specified service level objective
[**getSlo**](SloApi.md#getSlo) | **GET** /api/v1/slo/{slo_id} | Get a service level objective object
[**getSlos**](SloApi.md#getSlos) | **GET** /api/v1/slo | Get multiple service level objective objects by their IDs.
[**historyForSlo**](SloApi.md#historyForSlo) | **GET** /api/v1/slo/{slo_id}/history | Get the history of the service level objective.



## bulkPartialDeleteSlo

> ServiceLevelObjectivesBulkDeleted bulkPartialDeleteSlo(requestBody)

Delete (or partially delete) multiple service level objective objects.

### Overview
Delete (or partially delete) multiple service level objective objects.
This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        Map<String, List<SloTimeframe>> requestBody = new HashMap(); // Map<String, List<SloTimeframe>> | Thresholds by service level objective object ID
        try {
            ServiceLevelObjectivesBulkDeleted result = apiInstance.bulkPartialDeleteSlo(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#bulkPartialDeleteSlo");
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
 **requestBody** | [**Map&lt;String, List&lt;SloTimeframe&gt;&gt;**](List.md)| Thresholds by service level objective object ID |

### Return type

[**ServiceLevelObjectivesBulkDeleted**](ServiceLevelObjectivesBulkDeleted.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## checkCanDeleteSlo

> CheckCanDeleteServiceLevelObjectiveResponse checkCanDeleteSlo(ids)

Check if SLOs can be safely deleted.

### Overview
Check if an SLO can be safely deleted without disrupting dashboards for example.
### Arguments
* **`ids`** [*required*]: The ID (csv) of the service level objective objects to check.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        String ids = "ids_example"; // String | A comma separated list of the IDs of the service level objectives objects (e.g. \"id1,id2,id3\").
        try {
            CheckCanDeleteServiceLevelObjectiveResponse result = apiInstance.checkCanDeleteSlo(ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#checkCanDeleteSlo");
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
 **ids** | **String**| A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). |

### Return type

[**CheckCanDeleteServiceLevelObjectiveResponse**](CheckCanDeleteServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## createSlo

> ServiceLevelObjectiveResponse createSlo(serviceLevelObjective)

Create a service level objective object.

### Overview
Create a service level objective object.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        ServiceLevelObjective serviceLevelObjective = new ServiceLevelObjective(); // ServiceLevelObjective | Service level objective request object
        try {
            ServiceLevelObjectiveResponse result = apiInstance.createSlo(serviceLevelObjective);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#createSlo");
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
 **serviceLevelObjective** | [**ServiceLevelObjective**](ServiceLevelObjective.md)| Service level objective request object |

### Return type

[**ServiceLevelObjectiveResponse**](ServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## deleteSlo

> ServiceLevelObjectiveDeleted deleteSlo(sloId)

Delete the specified service level objective object.

### Overview
Delete the specified service level objective object.
### Arguments
* **`slo_id`** [*required*]: The ID of the service level objective object

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        Long sloId = 56L; // Long | The id of the service level objective
        try {
            ServiceLevelObjectiveDeleted result = apiInstance.deleteSlo(sloId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#deleteSlo");
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
 **sloId** | **Long**| The id of the service level objective |

### Return type

[**ServiceLevelObjectiveDeleted**](ServiceLevelObjectiveDeleted.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## editSlo

> ServiceLevelObjectiveResponse editSlo(sloId, serviceLevelObjective)

Edit the specified service level objective

### Overview
Edit the specified service level objective object.
### Arguments
* **`slo_id`** [*required*]: The ID of the service level objective object

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        String sloId = "sloId_example"; // String | The ID of the service level objective object
        ServiceLevelObjective serviceLevelObjective = new ServiceLevelObjective(); // ServiceLevelObjective | The edited service level objective request object.
        try {
            ServiceLevelObjectiveResponse result = apiInstance.editSlo(sloId, serviceLevelObjective);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#editSlo");
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
 **sloId** | **String**| The ID of the service level objective object |
 **serviceLevelObjective** | [**ServiceLevelObjective**](ServiceLevelObjective.md)| The edited service level objective request object. |

### Return type

[**ServiceLevelObjectiveResponse**](ServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getSlo

> ServiceLevelObjectiveResponse getSlo(sloId)

Get a service level objective object

### Overview
Get a service level objective object.
### Arguments
* **`slo_id`** [*required*]: The ID of the service level objective object

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        String sloId = "sloId_example"; // String | The ID of the service level objective object
        try {
            ServiceLevelObjectiveResponse result = apiInstance.getSlo(sloId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#getSlo");
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
 **sloId** | **String**| The ID of the service level objective object |

### Return type

[**ServiceLevelObjectiveResponse**](ServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## getSlos

> ServiceLevelObjectiveResponse getSlos(ids)

Get multiple service level objective objects by their IDs.

### Overview
Get multiple service level objective objects by their IDs.
### Arguments
* **`ids`** [*required*]: A comma separated list of the IDs of the service level
  objectives objects (e.g. "id1,id2,id3").

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        String ids = "ids_example"; // String | A comma separated list of the IDs of the service level objectives objects (e.g. \"id1,id2,id3\").
        try {
            ServiceLevelObjectiveResponse result = apiInstance.getSlos(ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#getSlos");
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
 **ids** | **String**| A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). |

### Return type

[**ServiceLevelObjectiveResponse**](ServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## historyForSlo

> HistoryServiceLevelObjectiveResponse historyForSlo(sloId, fromTs, toTs)

Get the history of the service level objective.

### Overview
Get the SLO history data
### Arguments
* **`slo_id`** [*required*]: The ID of the service level objective object
* **`from_ts`** [*required*]: The `from` timestamp in epoch seconds for the query timeframe
* **`to_ts`** [*required*]: The `to` timestamp in epoch seconds for the query timeframe

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SloApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        SloApi apiInstance = new SloApi(defaultClient);
        String sloId = "sloId_example"; // String | The ID of the service level objective object
        String fromTs = "fromTs_example"; // String | The `from` timestamp for the query window in epoch seconds
        String toTs = "toTs_example"; // String | The `to` timestamp for the query window in epoch seconds
        try {
            HistoryServiceLevelObjectiveResponse result = apiInstance.historyForSlo(sloId, fromTs, toTs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#historyForSlo");
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
 **sloId** | **String**| The ID of the service level objective object |
 **fromTs** | **String**| The &#x60;from&#x60; timestamp for the query window in epoch seconds |
 **toTs** | **String**| The &#x60;to&#x60; timestamp for the query window in epoch seconds |

### Return type

[**HistoryServiceLevelObjectiveResponse**](HistoryServiceLevelObjectiveResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

