# MetricsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editMetricMetadata**](MetricsApi.md#editMetricMetadata) | **PUT** /api/v1/metrics/{metric_name} | Edit metric metadata
[**getAllActiveMetrics**](MetricsApi.md#getAllActiveMetrics) | **GET** /api/v1/metrics | Get active metrics list
[**getMetricMetadata**](MetricsApi.md#getMetricMetadata) | **GET** /api/v1/metrics/{metric_name} | Get metric metadata
[**queryMetrics**](MetricsApi.md#queryMetrics) | **GET** /api/v1/query | Query timeseries points
[**searchMetrics**](MetricsApi.md#searchMetrics) | **GET** /api/v1/search | Search metrics
[**submitMetrics**](MetricsApi.md#submitMetrics) | **POST** /api/v1/series | Submit metrics



## editMetricMetadata


> MetricMetadata editMetricMetadata(metricName).body(body).execute();

Edit metric metadata

Edit metadata of a specific metric.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "metricName_example"; // String | Name of the metric for which to edit metadata
        MetricMetadata body = new MetricMetadata(); // MetricMetadata | New metadata
        try { 
            MetricMetadata result = api.editMetricMetadata(metricName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#editMetricMetadata");
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
 **metricName** | **String**| Name of the metric for which to edit metadata |
 **body** | [**MetricMetadata**](MetricMetadata.md)| New metadata |

### Return type

[**MetricMetadata**](MetricMetadata.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## getAllActiveMetrics


> MetricsListResponse getAllActiveMetrics().from(from).host(host).execute();

Get active metrics list

Get the list of actively reporting metrics from a given time until now.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Long from = 56L; // Long | Seconds since the Unix epoch
        String host = "host_example"; // String | Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag.
        try { 
            MetricsListResponse result = api.getAllActiveMetrics()
                .from(from)
                .host(host)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getAllActiveMetrics");
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
 **from** | **Long**| Seconds since the Unix epoch |
 **host** | **String**| Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag. | [optional]

### Return type

[**MetricsListResponse**](MetricsListResponse.md)

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


## getMetricMetadata


> MetricMetadata getMetricMetadata(metricName).execute();

Get metric metadata

Get metadata about a specific metric.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "metricName_example"; // String | Name of the metric for which to get metadata
        try { 
            MetricMetadata result = api.getMetricMetadata(metricName)
                .execute();
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
 **metricName** | **String**| Name of the metric for which to get metadata |

### Return type

[**MetricMetadata**](MetricMetadata.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## queryMetrics


> MetricsQueryResponse queryMetrics().from(from).to(to).query(query).execute();

Query timeseries points

Query timeseries points.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Long from = 56L; // Long | Start of the queried time period, seconds since the Unix epoch
        Long to = 56L; // Long | End of the queried time period, seconds since the Unix epoch
        String query = "query_example"; // String | Query string
        try { 
            MetricsQueryResponse result = api.queryMetrics()
                .from(from)
                .to(to)
                .query(query)
                .execute();
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
 **from** | **Long**| Start of the queried time period, seconds since the Unix epoch |
 **to** | **Long**| End of the queried time period, seconds since the Unix epoch |
 **query** | **String**| Query string |

### Return type

[**MetricsQueryResponse**](MetricsQueryResponse.md)

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


## searchMetrics


> MetricSearchResponse searchMetrics().q(q).execute();

Search metrics

Search for metrics from the last 24 hours in Datadog.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String q = "q_example"; // String | Query string to search metrics upon. Must be prefixed with `metrics:`
        try { 
            MetricSearchResponse result = api.searchMetrics()
                .q(q)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#searchMetrics");
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
 **q** | **String**| Query string to search metrics upon. Must be prefixed with &#x60;metrics:&#x60; |

### Return type

[**MetricSearchResponse**](MetricSearchResponse.md)

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
| **500** | Internal Server Error |  -  |


## submitMetrics


> IntakePayloadAccepted submitMetrics().body(body).execute();

Submit metrics

The metrics end-point allows you to post time-series data that can be graphed on Datadog’s dashboards. The limit for compressed payloads is 3.2 megabytes (3200000), and 62 megabytes (62914560) for decompressed payloads.
# Overhead:
If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:
64 bits for the timestamp 64 bits for the value 20 bytes for the metric names 50 bytes for the timeseries The full payload is approximately ~ 100 bytes. However, with the DogStatsD API, compression is applied, which reduces the payload size.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        MetricsPayload body = new MetricsPayload(); // MetricsPayload | 
        try { 
            IntakePayloadAccepted result = api.submitMetrics()
                .body(body)
                .execute();
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

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

