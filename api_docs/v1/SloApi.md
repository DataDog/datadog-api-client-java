# SloApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkPartialDeleteSLO**](SloApi.md#bulkPartialDeleteSLO) | **POST** /api/v1/slo/bulk_delete | Delete (or partially delete) multiple service level objective objects.
[**checkCanDeleteSLO**](SloApi.md#checkCanDeleteSLO) | **GET** /api/v1/slo/can_delete | Check if SLOs can be safely deleted.
[**createSLO**](SloApi.md#createSLO) | **POST** /api/v1/slo | Create a service level objective object.
[**deleteSLO**](SloApi.md#deleteSLO) | **DELETE** /api/v1/slo/{slo_id} | Delete the specified service level objective object.
[**editSLO**](SloApi.md#editSLO) | **PUT** /api/v1/slo/{slo_id} | Edit the specified service level objective
[**getSLO**](SloApi.md#getSLO) | **GET** /api/v1/slo/{slo_id} | Get a service level objective object
[**getSLOs**](SloApi.md#getSLOs) | **GET** /api/v1/slo | Get multiple service level objective objects by their IDs.
[**historyForSLO**](SloApi.md#historyForSLO) | **GET** /api/v1/slo/{slo_id}/history | Get the history of the service level objective.



## bulkPartialDeleteSLO

> ServiceLevelObjectivesBulkDeleted bulkPartialDeleteSLO().body(body).execute();

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
        Map<String, List<SLOTimeframe>> body = new HashMap(); // Map<String, List<SLOTimeframe>> | Thresholds by service level objective object ID
        try {
            ServiceLevelObjectivesBulkDeleted result = api.bulkPartialDeleteSLO()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#bulkPartialDeleteSLO");
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
 **body** | [**Map&lt;String, List&lt;SLOTimeframe&gt;&gt;**](List.md)| Thresholds by service level objective object ID |

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


## checkCanDeleteSLO

> CheckCanDeleteServiceLevelObjectiveResponse checkCanDeleteSLO().ids(ids).execute();

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
            CheckCanDeleteServiceLevelObjectiveResponse result = api.checkCanDeleteSLO()
                .ids(ids)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#checkCanDeleteSLO");
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


## createSLO

> ServiceLevelObjectiveListResponse createSLO().body(body).execute();

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
        ServiceLevelObjective body = new ServiceLevelObjective(); // ServiceLevelObjective | Service level objective request object
        try {
            ServiceLevelObjectiveListResponse result = api.createSLO()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#createSLO");
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
 **body** | [**ServiceLevelObjective**](ServiceLevelObjective.md)| Service level objective request object |

### Return type

[**ServiceLevelObjectiveListResponse**](ServiceLevelObjectiveListResponse.md)

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


## deleteSLO

> ServiceLevelObjectiveDeleted deleteSLO(sloId).execute();

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
        String sloId = "sloId_example"; // String | The id of the service level objective
        try {
            ServiceLevelObjectiveDeleted result = api.deleteSLO(sloId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#deleteSLO");
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
 **sloId** | **String**| The id of the service level objective |

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


## editSLO

> ServiceLevelObjectiveListResponse editSLO(sloId).body(body).execute();

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
        ServiceLevelObjective body = new ServiceLevelObjective(); // ServiceLevelObjective | The edited service level objective request object.
        try {
            ServiceLevelObjectiveListResponse result = api.editSLO(sloId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#editSLO");
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
 **body** | [**ServiceLevelObjective**](ServiceLevelObjective.md)| The edited service level objective request object. |

### Return type

[**ServiceLevelObjectiveListResponse**](ServiceLevelObjectiveListResponse.md)

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


## getSLO

> ServiceLevelObjectiveResponse getSLO(sloId).execute();

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
            ServiceLevelObjectiveResponse result = api.getSLO(sloId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#getSLO");
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


## getSLOs

> ServiceLevelObjectiveListResponse getSLOs().ids(ids).execute();

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
            ServiceLevelObjectiveListResponse result = api.getSLOs()
                .ids(ids)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#getSLOs");
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

[**ServiceLevelObjectiveListResponse**](ServiceLevelObjectiveListResponse.md)

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


## historyForSLO

> HistoryServiceLevelObjectiveResponse historyForSLO(sloId).fromTs(fromTs).toTs(toTs).execute();

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
            HistoryServiceLevelObjectiveResponse result = api.historyForSLO(sloId)
                .fromTs(fromTs)
                .toTs(toTs)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SloApi#historyForSLO");
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

