# LogsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**aggregateLogs**](LogsApi.md#aggregateLogs) | **POST** /api/v2/logs/analytics/aggregate | Aggregate events
[**listLogs**](LogsApi.md#listLogs) | **POST** /api/v2/logs/events/search | Search logs
[**listLogsGet**](LogsApi.md#listLogsGet) | **GET** /api/v2/logs/events | Get a list of logs



## aggregateLogs

> LogsAggregateResponse aggregateLogs(body);

The API endpoint to aggregate events into buckets and compute metrics and timeseries.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        LogsAggregateRequest body = new LogsAggregateRequest(); // LogsAggregateRequest | 
        try {
            LogsAggregateResponse result = apiInstance.aggregateLogs(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#aggregateLogs");
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
 **body** | [**LogsAggregateRequest**](LogsAggregateRequest.md)|  |

### Return type

[**LogsAggregateResponse**](LogsAggregateResponse.md)

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


## listLogs

> LogsListResponse listLogs(parameters);

List endpoint returns logs that match a log search query.
[Results are paginated][1].

Use this endpoint to build complex logs filtering and search.

**If you are considering archiving logs for your organization,
consider use of the Datadog archive capabilities instead of the log list API.
See [Datadog Logs Archive documentation][2].**

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        LogsListRequest body = new LogsListRequest(); // LogsListRequest | 
        try {
	    LogsListResponse result = apiInstance.listLogs(new LogsApi.ListLogsOptionalParameters()
                .body(body));
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
 **body** | [**LogsListRequest**](LogsListRequest.md)|  | [optional]

### Return type

[**LogsListResponse**](LogsListResponse.md)

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


## listLogsGet

> LogsListResponse listLogsGet(parameters);

List endpoint returns logs that match a log search query.
[Results are paginated][1].

Use this endpoint to see your latest logs.

**If you are considering archiving logs for your organization,
consider use of the Datadog archive capabilities instead of the log list API.
See [Datadog Logs Archive documentation][2].**

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        String filterQuery = "@datacenter:us @role:db"; // String | Search query following logs syntax.
        String filterIndex = "main"; // String | For customers with multiple indexes, the indexes to search Defaults to '*' which means all indexes
        OffsetDateTime filterFrom = OffsetDateTime.now(); // OffsetDateTime | Minimum timestamp for requested logs.
        OffsetDateTime filterTo = OffsetDateTime.now(); // OffsetDateTime | Maximum timestamp for requested logs.
        LogsSort sort = LogsSort.fromValue("timestamp"); // LogsSort | Order of logs in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | Maximum number of logs in the response.
        try {
	    LogsListResponse result = apiInstance.listLogsGet(new LogsApi.ListLogsGetOptionalParameters()
                .filterQuery(filterQuery)
                .filterIndex(filterIndex)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#listLogsGet");
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
 **filterQuery** | **String**| Search query following logs syntax. | [optional]
 **filterIndex** | **String**| For customers with multiple indexes, the indexes to search Defaults to &#39;*&#39; which means all indexes | [optional]
 **filterFrom** | **OffsetDateTime**| Minimum timestamp for requested logs. | [optional]
 **filterTo** | **OffsetDateTime**| Maximum timestamp for requested logs. | [optional]
 **sort** | **LogsSort**| Order of logs in results. | [optional] [enum: timestamp, -timestamp]
 **pageCursor** | **String**| List following results with a cursor provided in the previous query. | [optional]
 **pageLimit** | **Integer**| Maximum number of logs in the response. | [optional] [default to 10]

### Return type

[**LogsListResponse**](LogsListResponse.md)

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
| **403** | Not Authorized |  -  |

