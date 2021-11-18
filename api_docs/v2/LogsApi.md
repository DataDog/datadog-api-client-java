# LogsApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                        | HTTP request                              | Description        |
| --------------------------------------------- | ----------------------------------------- | ------------------ |
| [**aggregateLogs**](LogsApi.md#aggregateLogs) | **POST** /api/v2/logs/analytics/aggregate | Aggregate events   |
| [**listLogs**](LogsApi.md#listLogs)           | **POST** /api/v2/logs/events/search       | Search logs        |
| [**listLogsGet**](LogsApi.md#listLogsGet)     | **GET** /api/v2/logs/events               | Get a list of logs |
| [**submitLog**](LogsApi.md#submitLog)         | **POST** /api/v2/logs                     | Send logs          |

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

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**LogsAggregateRequest**](LogsAggregateRequest.md) |             |

### Return type

[**LogsAggregateResponse**](LogsAggregateResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Not Authorized    | -                |
| **429**     | Too many requests | -                |

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

| Name     | Type                                      | Description | Notes      |
| -------- | ----------------------------------------- | ----------- | ---------- |
| **body** | [**LogsListRequest**](LogsListRequest.md) |             | [optional] |

### Return type

[**LogsListResponse**](LogsListResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Not Authorized    | -                |
| **429**     | Too many requests | -                |

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
        OffsetDateTime filterFrom = OffsetDateTime.parse("2019-01-02T09:42:36.320Z"); // OffsetDateTime | Minimum timestamp for requested logs.
        OffsetDateTime filterTo = OffsetDateTime.parse("2019-01-03T09:42:36.320Z"); // OffsetDateTime | Maximum timestamp for requested logs.
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

| Name            | Type               | Description                                                                                                 | Notes                                    |
| --------------- | ------------------ | ----------------------------------------------------------------------------------------------------------- | ---------------------------------------- |
| **filterQuery** | **String**         | Search query following logs syntax.                                                                         | [optional]                               |
| **filterIndex** | **String**         | For customers with multiple indexes, the indexes to search Defaults to &#39;\*&#39; which means all indexes | [optional]                               |
| **filterFrom**  | **OffsetDateTime** | Minimum timestamp for requested logs.                                                                       | [optional]                               |
| **filterTo**    | **OffsetDateTime** | Maximum timestamp for requested logs.                                                                       | [optional]                               |
| **sort**        | **LogsSort**       | Order of logs in results.                                                                                   | [optional] [enum: timestamp, -timestamp] |
| **pageCursor**  | **String**         | List following results with a cursor provided in the previous query.                                        | [optional]                               |
| **pageLimit**   | **Integer**        | Maximum number of logs in the response.                                                                     | [optional] [default to 10]               |

### Return type

[**LogsListResponse**](LogsListResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Not Authorized    | -                |
| **429**     | Too many requests | -                |

## submitLog

> Object submitLog(body, parameters);

Send your logs to your Datadog platform over HTTP. Limits per HTTP request are:

- Maximum content size per payload (uncompressed): 5MB
- Maximum size for a single log: 1MB
- Maximum array size if sending multiple logs in an array: 1000 entries

Any log exceeding 1MB is accepted and truncated by Datadog:

- For a single log request, the API truncates the log at 1MB and returns a 2xx.
- For a multi-logs request, the API processes all logs, truncates only logs larger than 1MB, and returns a 2xx.

Datadog recommends sending your logs compressed.
Add the `Content-Encoding: gzip` header to the request when sending compressed logs.

The status codes answered by the HTTP API are:

- 202: Accepted: the request has been accepted for processing
- 400: Bad request (likely an issue in the payload formatting)
- 401: Unauthorized (likely a missing API Key)
- 403: Permission issue (likely using an invalid API Key)
- 408: Request Timeout, request should be retried after some time
- 413: Payload too large (batch is above 5MB uncompressed)
- 429: Too Many Requests, request should be retried after some time
- 500: Internal Server Error, the server encountered an unexpected condition that prevented it from fulfilling the request, request should be retried after some time
- 503: Service Unavailable, the server is not ready to handle the request probably because it is overloaded, request should be retried after some time

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
        List<HTTPLogItem> body = Arrays.asList(); // List<HTTPLogItem> | Log to send (JSON format).
        ContentEncoding contentEncoding = ContentEncoding.fromValue("gzip"); // ContentEncoding | HTTP header used to compress the media-type.
        String ddtags = "env:prod,user:my-user"; // String | Log tags can be passed as query parameters with `text/plain` content type.
        try {
            Object result = apiInstance.submitLog(body, new LogsApi.SubmitLogOptionalParameters()
                .contentEncoding(contentEncoding)
                .ddtags(ddtags));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#submitLog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type                                          | Description                                                                          | Notes                            |
| ------------------- | --------------------------------------------- | ------------------------------------------------------------------------------------ | -------------------------------- |
| **body**            | [**List&lt;HTTPLogItem&gt;**](HTTPLogItem.md) | Log to send (JSON format).                                                           |
| **contentEncoding** | **ContentEncoding**                           | HTTP header used to compress the media-type.                                         | [optional] [enum: gzip, deflate] |
| **ddtags**          | **String**                                    | Log tags can be passed as query parameters with &#x60;text/plain&#x60; content type. | [optional]                       |

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/logplex-1, text/plain
- **Accept**: application/json

### HTTP response details

| Status code | Description                                              | Response headers |
| ----------- | -------------------------------------------------------- | ---------------- |
| **202**     | Request accepted for processing (always 202 empty JSON). | -                |
| **400**     | Bad Request                                              | -                |
| **401**     | Unauthorized                                             | -                |
| **403**     | Forbidden                                                | -                |
| **408**     | Request Timeout                                          | -                |
| **413**     | Payload Too Large                                        | -                |
| **429**     | Too Many Requests                                        | -                |
| **500**     | Internal Server Error                                    | -                |
| **503**     | Service Unavailable                                      | -                |
