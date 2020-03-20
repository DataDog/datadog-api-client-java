# LogsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLogs**](LogsApi.md#listLogs) | **POST** /api/v1/logs-queries/list | Get a list of logs
[**sendLog**](LogsApi.md#sendLog) | **POST** /v1/input | Send logs



## listLogs

> LogsListResponse listLogs().body(body).execute();

Get a list of logs

## Overview
List endpoint returns logs that match a log search query. [Results are paginated][1].
**If you are thinking about archiving logs for your organization, consider using Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].**
**ARGUMENTS**:
* **`query`** [*required*]:
    The search query - following the [Log search syntax][3] .

* **`time.from`** [*required*]:
    Minimum timestamp for requested logs. Format can be either

    - an ISO-8601 string

    - a unix timestamp (number representing the elapsed millisec since epoch)

    - a relative time (`now -10m`, `now - 1h`, `now - 1d`)

* **`time.to`** [*required*]:
    Maximum timestamp for requested logs. Format can be either

    - an ISO-8601 string with minute, second or millisecond precision

    - a unix timestamp (number representing the elapsed millisec since epoch)

    - a relative time (`now`, `now -10m`, `now - 1h`, `now - 1d`)

* **`time.timezone`** [*optional*, *default*=**None**]:
  Can be specified both as an offset (e.g. "UTC+03:00") or a regional zone (e.g. "Europe/Paris")

* **`time.offset`** [*optional*, *default*=**None**]:
  Equivalent to `time.timezone`. But value in seconds.
  If both timezone and offset are specified, timezone is ignored.

* **`startAt`** [*optional*, *default*=**None**]:
  Hash identifier of the first log to return in the list, available in a log `id` attribute. This parameter is used for the [pagination feature][1].
  **Note**: this parameter is ignored if the corresponding log is out of the scope of the specified time window.

* **`sort`** [*optional*, *default*=**desc**]:
    Time-ascending `asc` or time-descending `desc`results.

* **`limit`** [*optional*, *default*=**10**]:
    Number of logs return in the response (maximum is 1000)

* **`index`** [*optional*, *default*=**main**]:
    For multi-index organizations, the log index in which the request is performed.

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives
[3]: https://docs.datadoghq.com/logs/explorer/search/#search-syntax

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsApi;

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

        LogsApi apiInstance = new LogsApi(defaultClient);
        LogsListRequest body = new LogsListRequest(); // LogsListRequest | Logs filter
        try {
            LogsListResponse result = api.listLogs()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#listLogs");
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
 **body** | [**LogsListRequest**](LogsListRequest.md)| Logs filter |

### Return type

[**LogsListResponse**](LogsListResponse.md)

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
| **403** | Authentication error |  -  |


## sendLog

> Object sendLog().body(body).execute();

Send logs

Send logs

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        HTTPLog body = new HTTPLog(); // HTTPLog | Log to send (JSON format)
        try {
            Object result = api.sendLog()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#sendLog");
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
 **body** | [**HTTPLog**](HTTPLog.md)| Log to send (JSON format) |

### Return type

**Object**

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response from server (always 200 empty JSON) |  -  |
| **0** | unexpected error |  -  |

