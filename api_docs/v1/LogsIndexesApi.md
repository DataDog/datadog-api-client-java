# LogsIndexesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createLogsIndex**](LogsIndexesApi.md#createLogsIndex) | **POST** /api/v1/logs/config/indexes | Create an index
[**getLogsIndex**](LogsIndexesApi.md#getLogsIndex) | **GET** /api/v1/logs/config/indexes/{name} | Get an index
[**getLogsIndexOrder**](LogsIndexesApi.md#getLogsIndexOrder) | **GET** /api/v1/logs/config/index-order | Get indexes order
[**listLogIndexes**](LogsIndexesApi.md#listLogIndexes) | **GET** /api/v1/logs/config/indexes | Get all indexes
[**updateLogsIndex**](LogsIndexesApi.md#updateLogsIndex) | **PUT** /api/v1/logs/config/indexes/{name} | Update an index
[**updateLogsIndexOrder**](LogsIndexesApi.md#updateLogsIndexOrder) | **PUT** /api/v1/logs/config/index-order | Update indexes order



## createLogsIndex

> LogsIndex createLogsIndex(body);

Creates a new index. Returns the Index object passed in the request body when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        LogsIndex body = new LogsIndex(); // LogsIndex | Object containing the new index.
        try {
            LogsIndex result = apiInstance.createLogsIndex(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#createLogsIndex");
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
 **body** | [**LogsIndex**](LogsIndex.md)| Object containing the new index. |

### Return type

[**LogsIndex**](LogsIndex.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |


## getLogsIndex

> LogsIndex getLogsIndex(name);

Get one log index from your organization. This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        String name = "name_example"; // String | Name of the log index.
        try {
            LogsIndex result = apiInstance.getLogsIndex(name);
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
 **name** | **String**| Name of the log index. |

### Return type

[**LogsIndex**](LogsIndex.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> LogsIndexesOrder getLogsIndexOrder();

Get the current order of your log indexes. This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        try {
            LogsIndexesOrder result = apiInstance.getLogsIndexOrder();
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## listLogIndexes

> LogsIndexListResponse listLogIndexes();

The Index object describes the configuration of a log index.
This endpoint returns an array of the `LogIndex` objects of your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        try {
            LogsIndexListResponse result = apiInstance.listLogIndexes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#listLogIndexes");
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## updateLogsIndex

> LogsIndex updateLogsIndex(name, body);

Update an index as identified by its name.
Returns the Index object passed in the request body when the request is successful.

Using the `PUT` method updates your index’s configuration by **replacing**
your current configuration with the new one sent to your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        String name = "name_example"; // String | Name of the log index.
        LogsIndexUpdateRequest body = new LogsIndexUpdateRequest(); // LogsIndexUpdateRequest | Object containing the new `LogsIndexUpdateRequest`.
        try {
            LogsIndex result = apiInstance.updateLogsIndex(name, body);
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
 **name** | **String**| Name of the log index. |
 **body** | [**LogsIndexUpdateRequest**](LogsIndexUpdateRequest.md)| Object containing the new &#x60;LogsIndexUpdateRequest&#x60;. |

### Return type

[**LogsIndex**](LogsIndex.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |


## updateLogsIndexOrder

> LogsIndexesOrder updateLogsIndexOrder(body);

This endpoint updates the index order of your organization.
It returns the index order object passed in the request body when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        LogsIndexesOrder body = new LogsIndexesOrder(); // LogsIndexesOrder | Object containing the new ordered list of index names
        try {
            LogsIndexesOrder result = apiInstance.updateLogsIndexOrder(body);
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
 **body** | [**LogsIndexesOrder**](LogsIndexesOrder.md)| Object containing the new ordered list of index names |

### Return type

[**LogsIndexesOrder**](LogsIndexesOrder.md)

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
| **403** | Forbidden |  -  |

