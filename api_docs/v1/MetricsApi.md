# MetricsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**getMetricMetadata**](MetricsApi.md#getMetricMetadata) | **GET** /api/v1/metrics/{metric_name} | Get metric metadata
[**listActiveMetrics**](MetricsApi.md#listActiveMetrics) | **GET** /api/v1/metrics | Get active metrics list
[**listMetrics**](MetricsApi.md#listMetrics) | **GET** /api/v1/search | Search metrics
[**queryMetrics**](MetricsApi.md#queryMetrics) | **GET** /api/v1/query | Query timeseries points
[**submitMetrics**](MetricsApi.md#submitMetrics) | **POST** /api/v1/series | Submit metrics
[**updateMetricMetadata**](MetricsApi.md#updateMetricMetadata) | **PUT** /api/v1/metrics/{metric_name} | Edit metric metadata



## getMetricMetadata

> MetricMetadata getMetricMetadata(metricName);

Get metadata about a specific metric.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "metricName_example"; // String | Name of the metric for which to get metadata.
        try {
            MetricMetadata result = apiInstance.getMetricMetadata(metricName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getMetricMetadata");
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
 **metricName** | **String**| Name of the metric for which to get metadata. |

### Return type

[**MetricMetadata**](MetricMetadata.md)

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


## listActiveMetrics

> MetricsListResponse listActiveMetrics(from, parameters);

Get the list of actively reporting metrics from a given time until now.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Long from = 56L; // Long | Seconds since the Unix epoch.
        String host = "host_example"; // String | Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag.
        String tagFilter = "env IN (staging,test) AND service:web"; // String | Filter metrics that have been submitted with the given tags. Supports boolean and wildcard expressions. Cannot be combined with other filters.
        try {
	    MetricsListResponse result = apiInstance.listActiveMetrics(from, new MetricsApi.ListActiveMetricsOptionalParameters()
                .host(host)
                .tagFilter(tagFilter));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listActiveMetrics");
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
 **from** | **Long**| Seconds since the Unix epoch. |
 **host** | **String**| Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag. | [optional]
 **tagFilter** | **String**| Filter metrics that have been submitted with the given tags. Supports boolean and wildcard expressions. Cannot be combined with other filters. | [optional]

### Return type

[**MetricsListResponse**](MetricsListResponse.md)

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
| **403** | Forbidden |  -  |


## listMetrics

> MetricSearchResponse listMetrics(q);

Search for metrics from the last 24 hours in Datadog.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String q = "q_example"; // String | Query string to search metrics upon. Must be prefixed with `metrics:`.
        try {
            MetricSearchResponse result = apiInstance.listMetrics(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listMetrics");
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
 **q** | **String**| Query string to search metrics upon. Must be prefixed with &#x60;metrics:&#x60;. |

### Return type

[**MetricSearchResponse**](MetricSearchResponse.md)

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
| **403** | Forbidden |  -  |


## queryMetrics

> MetricsQueryResponse queryMetrics(from, to, query);

Query timeseries points.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Long from = 56L; // Long | Start of the queried time period, seconds since the Unix epoch.
        Long to = 56L; // Long | End of the queried time period, seconds since the Unix epoch.
        String query = "query_example"; // String | Query string.
        try {
            MetricsQueryResponse result = apiInstance.queryMetrics(from, to, query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#queryMetrics");
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
 **from** | **Long**| Start of the queried time period, seconds since the Unix epoch. |
 **to** | **Long**| End of the queried time period, seconds since the Unix epoch. |
 **query** | **String**| Query string. |

### Return type

[**MetricsQueryResponse**](MetricsQueryResponse.md)

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
| **403** | Forbidden |  -  |


## submitMetrics

> IntakePayloadAccepted submitMetrics(body);

The metrics end-point allows you to post time-series data that can be graphed on Datadog’s dashboards.
The maximum payload size is 3.2 megabytes (3200000). Compressed payloads must have a decompressed size of up to 62 megabytes (62914560).

If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect

- 64 bits for the timestamp
- 32 bits for the value
- 20 bytes for the metric names
- 50 bytes for the timeseries
- The full payload is approximately ~ 100 bytes. However, with the DogStatsD API,
compression is applied, which reduces the payload size.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        MetricsPayload body = new MetricsPayload(); // MetricsPayload | 
        try {
            IntakePayloadAccepted result = apiInstance.submitMetrics(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#submitMetrics");
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
 **body** | [**MetricsPayload**](MetricsPayload.md)|  |

### Return type

[**IntakePayloadAccepted**](IntakePayloadAccepted.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Payload accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **408** | Request timeout |  -  |
| **413** | Payload too large |  -  |


## updateMetricMetadata

> MetricMetadata updateMetricMetadata(metricName, body);

Edit metadata of a specific metric. Find out more about [supported types](https://docs.datadoghq.com/developers/metrics).

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "metricName_example"; // String | Name of the metric for which to edit metadata.
        MetricMetadata body = new MetricMetadata(); // MetricMetadata | New metadata.
        try {
            MetricMetadata result = apiInstance.updateMetricMetadata(metricName, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#updateMetricMetadata");
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
 **metricName** | **String**| Name of the metric for which to edit metadata. |
 **body** | [**MetricMetadata**](MetricMetadata.md)| New metadata. |

### Return type

[**MetricMetadata**](MetricMetadata.md)

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
| **404** | Not Found |  -  |

