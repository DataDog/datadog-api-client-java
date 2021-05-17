# MetricsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createTagConfiguration**](MetricsApi.md#createTagConfiguration) | **POST** /api/v2/metrics/{metric_name}/tags | Create a tag configuration
[**deleteTagConfiguration**](MetricsApi.md#deleteTagConfiguration) | **DELETE** /api/v2/metrics/{metric_name}/tags | Delete a tag configuration
[**listTagConfigurationByName**](MetricsApi.md#listTagConfigurationByName) | **GET** /api/v2/metrics/{metric_name}/tags | List tag configuration by name
[**listTagConfigurations**](MetricsApi.md#listTagConfigurations) | **GET** /api/v2/metrics | List tag configurations
[**listTagsByMetricName**](MetricsApi.md#listTagsByMetricName) | **GET** /api/v2/metrics/{metric_name}/all-tags | List tags by metric name
[**listVolumesByMetricName**](MetricsApi.md#listVolumesByMetricName) | **GET** /api/v2/metrics/{metric_name}/volumes | List distinct metric volumes by metric name
[**updateTagConfiguration**](MetricsApi.md#updateTagConfiguration) | **PATCH** /api/v2/metrics/{metric_name}/tags | Update a tag configuration



## createTagConfiguration

> MetricTagConfigurationResponse createTagConfiguration(metricName, body);

Create and define a list of queryable tag keys for an existing count/gauge/rate/distribution metric. Optionally, include percentile aggregations on any distribution metric.
Can only be used with application keys of users with the `Manage Tags for Metrics` permission.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        MetricTagConfigurationCreateRequest body = new MetricTagConfigurationCreateRequest(); // MetricTagConfigurationCreateRequest | 
        try {
            MetricTagConfigurationResponse result = apiInstance.createTagConfiguration(metricName, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#createTagConfiguration");
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
 **metricName** | **String**| The name of the metric. |
 **body** | [**MetricTagConfigurationCreateRequest**](MetricTagConfigurationCreateRequest.md)|  |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## deleteTagConfiguration

> deleteTagConfiguration(metricName);

Deletes a metric's tag configuration. Can only be used with application
keys from users with the `Manage Tags for Metrics` permission.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            apiInstance.deleteTagConfiguration(metricName);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#deleteTagConfiguration");
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
 **metricName** | **String**| The name of the metric. |

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
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## listTagConfigurationByName

> MetricTagConfigurationResponse listTagConfigurationByName(metricName);

Returns the tag configuration for the given metric name.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            MetricTagConfigurationResponse result = apiInstance.listTagConfigurationByName(metricName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listTagConfigurationByName");
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
 **metricName** | **String**| The name of the metric. |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## listTagConfigurations

> MetricsAndMetricTagConfigurationsResponse listTagConfigurations(parameters);

Returns all configured count/gauge/rate/distribution metric names
(with additional filters if specified).

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Boolean filterConfigured = true; // Boolean | Filter metrics that have configured tags.
        String filterTagsConfigured = "app"; // String | Filter tag configurations by configured tags.
        MetricTagConfigurationMetricTypes filterMetricType = MetricTagConfigurationMetricTypes.fromValue("gauge"); // MetricTagConfigurationMetricTypes | Filter tag configurations by metric type.
        Boolean filterIncludePercentiles = true; // Boolean | Filter distributions with additional percentile aggregations enabled or disabled.
        String filterTags = "env IN (staging,test) AND service:web"; // String | Filter metrics that have been submitted with the given tags. Supports boolean and wildcard expressions. Cannot be combined with other filters.
        Long windowSeconds = 3600L; // Long | The number of seconds of look back (from now) to apply to a filter[tag] query. Defaults value is 3600 (1 hour), maximum value is 172,800 (2 days).
        try {
	    MetricsAndMetricTagConfigurationsResponse result = apiInstance.listTagConfigurations(new MetricsApi.ListTagConfigurationsOptionalParameters()
                .filterConfigured(filterConfigured)
                .filterTagsConfigured(filterTagsConfigured)
                .filterMetricType(filterMetricType)
                .filterIncludePercentiles(filterIncludePercentiles)
                .filterTags(filterTags)
                .windowSeconds(windowSeconds));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listTagConfigurations");
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
 **filterConfigured** | **Boolean**| Filter metrics that have configured tags. | [optional]
 **filterTagsConfigured** | **String**| Filter tag configurations by configured tags. | [optional]
 **filterMetricType** | **MetricTagConfigurationMetricTypes**| Filter tag configurations by metric type. | [optional] [enum: gauge, count, rate, distribution]
 **filterIncludePercentiles** | **Boolean**| Filter distributions with additional percentile aggregations enabled or disabled. | [optional]
 **filterTags** | **String**| Filter metrics that have been submitted with the given tags. Supports boolean and wildcard expressions. Cannot be combined with other filters. | [optional]
 **windowSeconds** | **Long**| The number of seconds of look back (from now) to apply to a filter[tag] query. Defaults value is 3600 (1 hour), maximum value is 172,800 (2 days). | [optional]

### Return type

[**MetricsAndMetricTagConfigurationsResponse**](MetricsAndMetricTagConfigurationsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |


## listTagsByMetricName

> MetricAllTagsResponse listTagsByMetricName(metricName);

View indexed tag key-value pairs for a given metric name.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            MetricAllTagsResponse result = apiInstance.listTagsByMetricName(metricName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listTagsByMetricName");
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
 **metricName** | **String**| The name of the metric. |

### Return type

[**MetricAllTagsResponse**](MetricAllTagsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## listVolumesByMetricName

> MetricVolumesResponse listVolumesByMetricName(metricName);

View distinct metrics volumes for the given metric name.

Custom distribution metrics will return both ingested and indexed custom metric volumes.
For Metrics without Limits&trade; beta customers, all metrics will return both ingested/indexed volumes.
Custom metrics generated in-app from other products will return `null` for ingested volumes.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            MetricVolumesResponse result = apiInstance.listVolumesByMetricName(metricName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listVolumesByMetricName");
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
 **metricName** | **String**| The name of the metric. |

### Return type

[**MetricVolumesResponse**](MetricVolumesResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## updateTagConfiguration

> MetricTagConfigurationResponse updateTagConfiguration(metricName, body);

Update the tag configuration of a metric or percentile aggregations of a distribution metric. Can only be used with
application keys from users with the `Manage Tags for Metrics` permission.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        MetricTagConfigurationUpdateRequest body = new MetricTagConfigurationUpdateRequest(); // MetricTagConfigurationUpdateRequest | 
        try {
            MetricTagConfigurationResponse result = apiInstance.updateTagConfiguration(metricName, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#updateTagConfiguration");
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
 **metricName** | **String**| The name of the metric. |
 **body** | [**MetricTagConfigurationUpdateRequest**](MetricTagConfigurationUpdateRequest.md)|  |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

