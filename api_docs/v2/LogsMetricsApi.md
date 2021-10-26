# LogsMetricsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createLogsMetric**](LogsMetricsApi.md#createLogsMetric) | **POST** /api/v2/logs/config/metrics | Create a log-based metric
[**deleteLogsMetric**](LogsMetricsApi.md#deleteLogsMetric) | **DELETE** /api/v2/logs/config/metrics/{metric_id} | Delete a log-based metric
[**getLogsMetric**](LogsMetricsApi.md#getLogsMetric) | **GET** /api/v2/logs/config/metrics/{metric_id} | Get a log-based metric
[**listLogsMetrics**](LogsMetricsApi.md#listLogsMetrics) | **GET** /api/v2/logs/config/metrics | Get all log-based metrics
[**updateLogsMetric**](LogsMetricsApi.md#updateLogsMetric) | **PATCH** /api/v2/logs/config/metrics/{metric_id} | Update a log-based metric



## createLogsMetric

> LogsMetricResponse createLogsMetric(body);

Create a metric based on your ingested logs in your organization.
Returns the log-based metric object from the request body when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        LogsMetricCreateRequest body = new LogsMetricCreateRequest(); // LogsMetricCreateRequest | The definition of the new log-based metric.
        try {
            LogsMetricResponse result = apiInstance.createLogsMetric(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsMetricsApi#createLogsMetric");
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
 **body** | [**LogsMetricCreateRequest**](LogsMetricCreateRequest.md)| The definition of the new log-based metric. |

### Return type

[**LogsMetricResponse**](LogsMetricResponse.md)

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
| **403** | Not Authorized |  -  |
| **409** | Conflict |  -  |
| **429** | Too many requests |  -  |


## deleteLogsMetric

> deleteLogsMetric(metricId);

Delete a specific log-based metric from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        String metricId = "metricId_example"; // String | The name of the log-based metric.
        try {
            apiInstance.deleteLogsMetric(metricId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsMetricsApi#deleteLogsMetric");
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
 **metricId** | **String**| The name of the log-based metric. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **429** | Too many requests |  -  |


## getLogsMetric

> LogsMetricResponse getLogsMetric(metricId);

Get a specific log-based metric from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        String metricId = "metricId_example"; // String | The name of the log-based metric.
        try {
            LogsMetricResponse result = apiInstance.getLogsMetric(metricId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsMetricsApi#getLogsMetric");
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
 **metricId** | **String**| The name of the log-based metric. |

### Return type

[**LogsMetricResponse**](LogsMetricResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **429** | Too many requests |  -  |


## listLogsMetrics

> LogsMetricsResponse listLogsMetrics();

Get the list of configured log-based metrics with their definitions.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        try {
            LogsMetricsResponse result = apiInstance.listLogsMetrics();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsMetricsApi#listLogsMetrics");
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

[**LogsMetricsResponse**](LogsMetricsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Not Authorized |  -  |
| **429** | Too many requests |  -  |


## updateLogsMetric

> LogsMetricResponse updateLogsMetric(metricId, body);

Update a specific log-based metric from your organization.
Returns the log-based metric object from the request body when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        String metricId = "metricId_example"; // String | The name of the log-based metric.
        LogsMetricUpdateRequest body = new LogsMetricUpdateRequest(); // LogsMetricUpdateRequest | New definition of the log-based metric.
        try {
            LogsMetricResponse result = apiInstance.updateLogsMetric(metricId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsMetricsApi#updateLogsMetric");
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
 **metricId** | **String**| The name of the log-based metric. |
 **body** | [**LogsMetricUpdateRequest**](LogsMetricUpdateRequest.md)| New definition of the log-based metric. |

### Return type

[**LogsMetricResponse**](LogsMetricResponse.md)

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
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **429** | Too many requests |  -  |

