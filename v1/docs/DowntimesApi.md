# DowntimesApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDowntime**](DowntimesApi.md#cancelDowntime) | **DELETE** /api/v1/downtime/{downtime_id} | Cancel a downtime
[**cancelDowntimesByScope**](DowntimesApi.md#cancelDowntimesByScope) | **POST** /api/v1/downtime/cancel/by_scope | Cancel downtimes by scope
[**createDowntime**](DowntimesApi.md#createDowntime) | **POST** /api/v1/downtime | Schedule a downtime
[**getAllDowntimes**](DowntimesApi.md#getAllDowntimes) | **GET** /api/v1/downtime | Get all downtimes
[**getDowntime**](DowntimesApi.md#getDowntime) | **GET** /api/v1/downtime/{downtime_id} | Get a downtime
[**updateDowntime**](DowntimesApi.md#updateDowntime) | **PUT** /api/v1/downtime/{downtime_id} | Update a downtime



## cancelDowntime

> cancelDowntime(downtimeId)

Cancel a downtime

Cancel a Downtime

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456; // Long | ID of the downtime to cancel
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
 **downtimeId** | **Long**| ID of the downtime to cancel |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Downtime not found error |  -  |


## cancelDowntimesByScope

> CanceledDowntimesIds cancelDowntimesByScope(cancelDowntimesByScopeRequest)

Cancel downtimes by scope

### Overview DELETE all Downtimes that match the scope of X ### Arguments * **&#x60;scope&#x60;** [*required*]: Cancel all downtimes with the given scope(s),   e.g.: &#x60;env:prod&#x60;, &#x60;role:db,role:db-slave&#x60;

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest = new CancelDowntimesByScopeRequest(); // CancelDowntimesByScopeRequest | Scope to cancel downtimes for
        try {
            CanceledDowntimesIds result = apiInstance.cancelDowntimesByScope(cancelDowntimesByScopeRequest);
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
 **cancelDowntimesByScopeRequest** | [**CancelDowntimesByScopeRequest**](CancelDowntimesByScopeRequest.md)| Scope to cancel downtimes for |

### Return type

[**CanceledDowntimesIds**](CanceledDowntimesIds.md)

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
| **404** | No downtimes found error |  -  |


## createDowntime

> Downtime createDowntime(downtime)

Schedule a downtime

* **&#x60;scope&#x60;** [*required*]: The scope(s) to which the downtime applies, e.g. &#x60;host:app2&#x60;.   Provide multiple scopes as a comma-separated list, e.g. &#x60;env:dev,env:prod&#x60;. The   resulting downtime applies to sources that matches ALL provided scopes (i.e.   &#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;), NOT any of them. * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags   that are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to   which the downtime applies. The resulting downtime applies to monitors that match   ALL provided monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them. * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors. * **&#x60;start&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to start the downtime.   If not provided, the downtime starts the moment it is created. * **&#x60;end&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it). * **&#x60;message&#x60;** [*optional*, *default*&#x3D;**None**]: A message to include with notifications   for this downtime. Email notifications can be sent to specific users by using    the same &#39;@username&#39; notation as events * **&#x60;timezone&#x60;** [*optional*, *default* &#x3D; **UTC**]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default*&#x3D;**None**]: An object defining the recurrence of the   downtime with a variety of parameters:   * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.   * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,     select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.   * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;,     &#x60;Tue&#x60;, &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.     **First letter must be capitalized.**   * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.     **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive   * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end     as a POSIX timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Downtime downtime = new Downtime(); // Downtime | Downtime request object
        try {
            Downtime result = apiInstance.createDowntime(downtime);
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
 **downtime** | [**Downtime**](Downtime.md)| Downtime request object |

### Return type

[**Downtime**](Downtime.md)

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


## getAllDowntimes

> List&lt;Downtime&gt; getAllDowntimes(currentOnly)

Get all downtimes

### Overview Get All Scheduled Downtimes ### ARGUMENTS * **&#x60;current_only&#x60;** [*optional*, *default* &#x3D; **False**]: Only return downtimes   that are active when the request is made.&#39;

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Boolean currentOnly = true; // Boolean | 
        try {
            List<Downtime> result = apiInstance.getAllDowntimes(currentOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#getAllDowntimes");
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
 **currentOnly** | **Boolean**|  | [optional]

### Return type

[**List&lt;Downtime&gt;**](Downtime.md)

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


## getDowntime

> Downtime getDowntime(downtimeId)

Get a downtime

### Overview Get Downtime Detail by downtime_id ### Arguments This endpoint takes no JSON arguments.\&quot;

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456; // Long | ID of the downtime to fetch
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
 **downtimeId** | **Long**| ID of the downtime to fetch |

### Return type

[**Downtime**](Downtime.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Downtime not found error |  -  |


## updateDowntime

> Downtime updateDowntime(downtimeId, downtime)

Update a downtime

### Overview Update a single Downtime by downtime_id. ### Arguments * **&#x60;id&#x60;** [*required*]: The integer id of the downtime to be updated * **&#x60;scope&#x60;** [*required*]: The scope to which the downtime applies, e.g. &#39;host:app2&#39;.   Provide multiple scopes as a comma-separated list, e.g. &#39;env:dev,env:prod&#39;.   The resulting downtime applies to sources that matches ALL provided scopes   (i.e. env:dev AND env:prod), NOT any of them. * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags that   are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to which   the downtime applies. The resulting downtime applies to monitors that match ALL provided   monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them. * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors. * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **original start**]: POSIX timestamp to start   the downtime. * **&#x60;end&#x60;** [*optional*, *default* &#x3D; **original end**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it). * **&#x60;message&#x60;** [*required*, *default* &#x3D; **original message**]: A message to include with   notifications for this downtime. Email notifications can be sent to specific users by   using the same &#39;@username&#39; notation as events * **&#x60;timezone&#x60;** [*optional*, default &#x3D; **original timezone** ]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default* &#x3D; **original recurrence**]: An object defining the   recurrence of the downtime with a variety of parameters:     * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.     * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,       select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.     * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;, &#x60;Tue&#x60;,       &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.       **First letter must be capitalized.**     * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.       **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive     * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end as a POSIX       timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.DowntimesApi;

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

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456; // Long | ID of the downtime to update
        Downtime downtime = new Downtime(); // Downtime | Downtime request object
        try {
            Downtime result = apiInstance.updateDowntime(downtimeId, downtime);
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
 **downtimeId** | **Long**| ID of the downtime to update |
 **downtime** | [**Downtime**](Downtime.md)| Downtime request object |

### Return type

[**Downtime**](Downtime.md)

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
| **404** | Downtime not found error |  -  |

