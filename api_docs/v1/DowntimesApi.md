# DowntimesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**cancelDowntime**](DowntimesApi.md#cancelDowntime) | **DELETE** /api/v1/downtime/{downtime_id} | Cancel a downtime
[**cancelDowntimesByScope**](DowntimesApi.md#cancelDowntimesByScope) | **POST** /api/v1/downtime/cancel/by_scope | Cancel downtimes by scope
[**createDowntime**](DowntimesApi.md#createDowntime) | **POST** /api/v1/downtime | Schedule a downtime
[**getDowntime**](DowntimesApi.md#getDowntime) | **GET** /api/v1/downtime/{downtime_id} | Get a downtime
[**listDowntimes**](DowntimesApi.md#listDowntimes) | **GET** /api/v1/downtime | Get all downtimes
[**listMonitorDowntimes**](DowntimesApi.md#listMonitorDowntimes) | **GET** /api/v1/monitor/{monitor_id}/downtimes | Get all downtimes for a monitor
[**updateDowntime**](DowntimesApi.md#updateDowntime) | **PUT** /api/v1/downtime/{downtime_id} | Update a downtime



## cancelDowntime

> cancelDowntime(downtimeId);

Cancel a downtime.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456L; // Long | ID of the downtime to cancel.
        try {
            apiInstance.cancelDowntime(downtimeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#cancelDowntime");
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
 **downtimeId** | **Long**| ID of the downtime to cancel. |

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
| **204** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Downtime not found |  -  |


## cancelDowntimesByScope

> CanceledDowntimesIds cancelDowntimesByScope(body);

Delete all downtimes that match the scope of `X`.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        CancelDowntimesByScopeRequest body = new CancelDowntimesByScopeRequest(); // CancelDowntimesByScopeRequest | Scope to cancel downtimes for.
        try {
            CanceledDowntimesIds result = apiInstance.cancelDowntimesByScope(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#cancelDowntimesByScope");
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
 **body** | [**CancelDowntimesByScopeRequest**](CancelDowntimesByScopeRequest.md)| Scope to cancel downtimes for. |

### Return type

[**CanceledDowntimesIds**](CanceledDowntimesIds.md)

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
| **404** | Downtimes not found |  -  |


## createDowntime

> Downtime createDowntime(body);

Schedule a downtime.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Downtime body = new Downtime(); // Downtime | Schedule a downtime request body.
        try {
            Downtime result = apiInstance.createDowntime(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#createDowntime");
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
 **body** | [**Downtime**](Downtime.md)| Schedule a downtime request body. |

### Return type

[**Downtime**](Downtime.md)

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


## getDowntime

> Downtime getDowntime(downtimeId);

Get downtime detail by `downtime_id`.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456L; // Long | ID of the downtime to fetch.
        try {
            Downtime result = apiInstance.getDowntime(downtimeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#getDowntime");
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
 **downtimeId** | **Long**| ID of the downtime to fetch. |

### Return type

[**Downtime**](Downtime.md)

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
| **404** | Downtime not found |  -  |


## listDowntimes

> List&lt;Downtime&gt; listDowntimes(parameters);

Get all scheduled downtimes.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Boolean currentOnly = true; // Boolean | Only return downtimes that are active when the request is made.
        try {
	    List<Downtime> result = apiInstance.listDowntimes(new DowntimesApi.ListDowntimesOptionalParameters()
                .currentOnly(currentOnly));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#listDowntimes");
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
 **currentOnly** | **Boolean**| Only return downtimes that are active when the request is made. | [optional]

### Return type

[**List&lt;Downtime&gt;**](Downtime.md)

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


## listMonitorDowntimes

> List&lt;Downtime&gt; listMonitorDowntimes(monitorId);

Get all downtimes for the specified monitor

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long monitorId = 56L; // Long | The id of the monitor
        try {
            List<Downtime> result = apiInstance.listMonitorDowntimes(monitorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#listMonitorDowntimes");
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
 **monitorId** | **Long**| The id of the monitor |

### Return type

[**List&lt;Downtime&gt;**](Downtime.md)

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
| **404** | Monitor Not Found error |  -  |


## updateDowntime

> Downtime updateDowntime(downtimeId, body);

Update a single downtime by `downtime_id`.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456L; // Long | ID of the downtime to update.
        Downtime body = new Downtime(); // Downtime | Update a downtime request body.
        try {
            Downtime result = apiInstance.updateDowntime(downtimeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#updateDowntime");
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
 **downtimeId** | **Long**| ID of the downtime to update. |
 **body** | [**Downtime**](Downtime.md)| Update a downtime request body. |

### Return type

[**Downtime**](Downtime.md)

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
| **404** | Downtime not found |  -  |

