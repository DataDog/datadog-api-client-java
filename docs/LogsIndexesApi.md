# LogsIndexesApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllLogIndexes**](LogsIndexesApi.md#getAllLogIndexes) | **GET** /api/v1/logs/config/indexes | This endpoint returns an array of the LogIndex objects of your organization.
[**getLogsIndex**](LogsIndexesApi.md#getLogsIndex) | **GET** /api/v1/logs/config/indexes/{name} | This endpoint returns an Index identified by its name.
[**getLogsIndexOrder**](LogsIndexesApi.md#getLogsIndexOrder) | **GET** /api/v1/logs/config/index-order | Get the current order of your log indexes.
[**updateLogsIndex**](LogsIndexesApi.md#updateLogsIndex) | **PUT** /api/v1/logs/config/indexes/{name} | This endpoint updates an Index identified by its name.
[**updateLogsIndexOrder**](LogsIndexesApi.md#updateLogsIndexOrder) | **PUT** /api/v1/logs/config/index-order | Update the order of your log indexes.



## getAllLogIndexes

> LogsIndexListResponse getAllLogIndexes().execute();

This endpoint returns an array of the LogIndex objects of your organization.

## Overview
Get all log indexes of your organization.
### Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuthHeader
        ApiKeyAuth appKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuthHeader");
        appKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuthHeader.setApiKeyPrefix("Token");

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        try {
            LogsIndexListResponse result = api.getAllLogIndexes()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#getAllLogIndexes");
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

[**LogsIndexListResponse**](LogsIndexListResponse.md)

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader), [appKeyAuthHeader](../README.md#appKeyAuthHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## getLogsIndex

> LogsIndex getLogsIndex(name).execute();

This endpoint returns an Index identified by its name.

## Overview
Get one log index from your organization.
### Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuthHeader
        ApiKeyAuth appKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuthHeader");
        appKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuthHeader.setApiKeyPrefix("Token");

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        String name = "name_example"; // String | Name of the log index
        try {
            LogsIndex result = api.getLogsIndex(name)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#getLogsIndex");
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
 **name** | **String**| Name of the log index |

### Return type

[**LogsIndex**](LogsIndex.md)

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader), [appKeyAuthHeader](../README.md#appKeyAuthHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getLogsIndexOrder

> LogsIndexesOrder getLogsIndexOrder().execute();

Get the current order of your log indexes.

## Overview
Get the current order of your log indexes.
### Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuthHeader
        ApiKeyAuth appKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuthHeader");
        appKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuthHeader.setApiKeyPrefix("Token");

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        try {
            LogsIndexesOrder result = api.getLogsIndexOrder()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#getLogsIndexOrder");
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

[**LogsIndexesOrder**](LogsIndexesOrder.md)

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader), [appKeyAuthHeader](../README.md#appKeyAuthHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## updateLogsIndex

> LogsIndex updateLogsIndex(name).body(body).execute();

This endpoint updates an Index identified by its name.

## Overview
It returns the Index object passed in the request body when the request is successful.
**Note:** Using the PUT method updates your index’s configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
### Arguments
* **`filter.query`**  [*required*]:
    Only logs matching the filter criteria will be considered for this index. The search query follows the [Log search syntax][1]

* **`exclusion_filters`** An array of `ExclusionFilter` objects (see hereafter). The logs are tested against the query of each `ExclusionFilter`, following the order of the array. Only the first matching active `ExclusionFilter` matters, others (if any) are ignored. The `ExclusionFilter` object describes the configuration of an [exclusion filter][2]. It has the following attributes:

  * **`name`** [*required*]:
    The name of the exclusion filter

  * **`is_enabled`**  [*optional*, *default*=**False**]:
    A boolean stating if the exclusion is active.

  * **`filter.query`** [*optional*]:
    Only logs matching the filter criteria AND the query of the parent index will be considered for this exclusion filter. The search query follows the [Log search syntax][1]

  * **`filter.sample_rate`** [*required*]:
    The fraction of logs excluded by the exclusion filter, when active. The sampling is uniform.

[1]: /logs/explorer/search
[2]: /logs/indexes/#exclusion-filters

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuthHeader
        ApiKeyAuth appKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuthHeader");
        appKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuthHeader.setApiKeyPrefix("Token");

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        String name = "name_example"; // String | Name of the log index
        LogsIndex body = new LogsIndex(); // LogsIndex | Object containing the new LogsIndex
        try {
            LogsIndex result = api.updateLogsIndex(name)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#updateLogsIndex");
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
 **name** | **String**| Name of the log index |
 **body** | [**LogsIndex**](LogsIndex.md)| Object containing the new LogsIndex | [optional]

### Return type

[**LogsIndex**](LogsIndex.md)

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader), [appKeyAuthHeader](../README.md#appKeyAuthHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## updateLogsIndexOrder

> LogsIndexesOrder updateLogsIndexOrder().body(body).execute();

Update the order of your log indexes.

## Overview
This endpoint updates the index order of your organization. It returns the index order object passed in the request body when the request is successful.
### Arguments
- **`index_names`** [*required*]: Array of strings identifying by their name(s) the index(es) of your organisation. Logs are tested against the query filter of each index one by one, following the order of the array. Logs are eventually stored in the first matching index.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuthHeader
        ApiKeyAuth appKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuthHeader");
        appKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuthHeader.setApiKeyPrefix("Token");

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        LogsIndexesOrder body = new LogsIndexesOrder(); // LogsIndexesOrder | Object containing the new ordered list of index names
        try {
            LogsIndexesOrder result = api.updateLogsIndexOrder()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#updateLogsIndexOrder");
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
 **body** | [**LogsIndexesOrder**](LogsIndexesOrder.md)| Object containing the new ordered list of index names | [optional]

### Return type

[**LogsIndexesOrder**](LogsIndexesOrder.md)

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader), [appKeyAuthHeader](../README.md#appKeyAuthHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

