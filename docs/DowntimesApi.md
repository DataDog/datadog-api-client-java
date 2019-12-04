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
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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
| **204** | OK |  -  |
| **404** | Downtime not found error |  -  |


## cancelDowntimesByScope

> CanceledDowntimesIds cancelDowntimesByScope(cancelDowntimesByScopeRequest)

Cancel downtimes by scope

### Overview
DELETE all Downtimes that match the scope of X
### Arguments
* **`scope`** [*required*]: Cancel all downtimes with the given scope(s),
  e.g.: `env:prod`, `role:db,role:db-slave`

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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

* **`scope`** [*required*]: The scope(s) to which the downtime applies, e.g. `host:app2`.
  Provide multiple scopes as a comma-separated list, e.g. `env:dev,env:prod`. The
  resulting downtime applies to sources that matches ALL provided scopes (i.e.
  `env:dev` **AND** `env:prod`), NOT any of them.

* **`monitor_tags`** [*optional*, *default*=**no monitor tag filter**]: A comma-separated
  list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags
  that are used in monitor queries (which are filtered by the `scope` parameter), to
  which the downtime applies. The resulting downtime applies to monitors that match
  ALL provided monitor tags (i.e. `service:postgres` **AND** `team:frontend`), NOT any of them.

* **`monitor_id`** [*optional*, *default*=**None**]: A single monitor to which the downtime
  applies. If not provided, the downtime applies to all monitors.

* **`start`** [*optional*, *default*=**None**]: POSIX timestamp to start the downtime.
  If not provided, the downtime starts the moment it is created.

* **`end`** [*optional*, *default*=**None**]: POSIX timestamp to end the downtime.
  If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).

* **`message`** [*optional*, *default*=**None**]: A message to include with notifications
  for this downtime. Email notifications can be sent to specific users by using
   the same '@username' notation as events

* **`timezone`** [*optional*, *default* = **UTC**]: The timezone for the downtime.
* **`recurrence`** [*optional*, *default*=**None**]: An object defining the recurrence of the
  downtime with a variety of parameters:

  * **`type`** the type of recurrence. Choose from: `days`, `weeks`, `months`, `years`.

  * **`period`** how often to repeat as an integer. For example to repeat every 3 days,
    select a type of `days` and a period of `3`.

  * **`week_days`** (optional) a list of week days to repeat on. Choose from: `Mon`,
    `Tue`, `Wed`, `Thu`, `Fri`, `Sat` or `Sun`. Only applicable when `type` is `weeks`.
    **First letter must be capitalized.**
  * **`until_occurrences`** (optional) how many times the downtime is rescheduled.
    **`until_occurrences` and `until_date`** are mutually exclusive

  * **`until_date`** (optional) the date at which the recurrence should end
    as a POSIX timestmap. **`until_occurrences` and `until_date`** are mutually exclusive

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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

### Overview
Get All Scheduled Downtimes
### Arguments
* **`current_only`** [*optional*, *default* = **False**]: Only return downtimes
  that are active when the request is made.'

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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

### Overview
Get Downtime Detail by downtime_id
### Arguments
This endpoint takes no JSON arguments."

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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

### Overview
Update a single Downtime by downtime_id.
### Arguments
* **`id`** [*required*]: The integer id of the downtime to be updated
* **`scope`** [*required*]: The scope to which the downtime applies, e.g. 'host:app2'.
  Provide multiple scopes as a comma-separated list, e.g. 'env:dev,env:prod'.
  The resulting downtime applies to sources that matches ALL provided scopes
  (i.e. env:dev AND env:prod), NOT any of them.

* **`monitor_tags`** [*optional*, *default*=**no monitor tag filter**]: A comma-separated
  list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags that
  are used in monitor queries (which are filtered by the `scope` parameter), to which
  the downtime applies. The resulting downtime applies to monitors that match ALL provided
  monitor tags (i.e. `service:postgres` **AND** `team:frontend`), NOT any of them.

* **`monitor_id`** [*optional*, *default*=**None**]: A single monitor to which the downtime
  applies. If not provided, the downtime applies to all monitors.

* **`start`** [*optional*, *default* = **original start**]: POSIX timestamp to start
  the downtime.

* **`end`** [*optional*, *default* = **original end**]: POSIX timestamp to end the downtime.
  If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).

* **`message`** [*required*, *default* = **original message**]: A message to include with
  notifications for this downtime. Email notifications can be sent to specific users by
  using the same '@username' notation as events

* **`timezone`** [*optional*, default = **original timezone** ]: The timezone for the downtime.
* **`recurrence`** [*optional*, *default* = **original recurrence**]: An object defining the
  recurrence of the downtime with a variety of parameters:

    * **`type`** the type of recurrence. Choose from: `days`, `weeks`, `months`, `years`.

    * **`period`** how often to repeat as an integer. For example to repeat every 3 days,
      select a type of `days` and a period of `3`.

    * **`week_days`** (optional) a list of week days to repeat on. Choose from: `Mon`, `Tue`,
      `Wed`, `Thu`, `Fri`, `Sat` or `Sun`. Only applicable when `type` is `weeks`.
      **First letter must be capitalized.**

    * **`until_occurrences`** (optional) how many times the downtime is rescheduled.
      **`until_occurrences` and `until_date`** are mutually exclusive

    * **`until_date`** (optional) the date at which the recurrence should end as a POSIX
      timestmap. **`until_occurrences` and `until_date`** are mutually exclusive

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.DowntimesApi;

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

