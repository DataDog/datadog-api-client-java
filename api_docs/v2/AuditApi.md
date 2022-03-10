# AuditApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                             | HTTP request                         | Description                     |
| -------------------------------------------------- | ------------------------------------ | ------------------------------- |
| [**listAuditLogs**](AuditApi.md#listAuditLogs)     | **GET** /api/v2/audit/events         | Get a list of Audit Logs events |
| [**searchAuditLogs**](AuditApi.md#searchAuditLogs) | **POST** /api/v2/audit/events/search | Search Audit Logs events        |

## listAuditLogs

> AuditLogsEventsResponse listAuditLogs(parameters);

List endpoint returns events that match a Audit Logs search query.
[Results are paginated][1].

Use this endpoint to see your latest Audit Logs events.

[1]: https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuditApi apiInstance = new AuditApi(defaultClient);
        String filterQuery = "@type:session @application_id:xxxx"; // String | Search query following Audit Logs syntax.
        OffsetDateTime filterFrom = OffsetDateTime.parse("2019-01-02T09:42:36.320Z"); // OffsetDateTime | Minimum timestamp for requested events.
        OffsetDateTime filterTo = OffsetDateTime.parse("2019-01-03T09:42:36.320Z"); // OffsetDateTime | Maximum timestamp for requested events.
        AuditLogsSort sort = AuditLogsSort.fromValue("timestamp"); // AuditLogsSort | Order of events in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | Maximum number of events in the response.
        try {
            AuditLogsEventsResponse result = apiInstance.listAuditLogs(new AuditApi.ListAuditLogsOptionalParameters()
                .filterQuery(filterQuery)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditApi#listAuditLogs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type               | Description                                                          | Notes                                    |
| --------------- | ------------------ | -------------------------------------------------------------------- | ---------------------------------------- |
| **filterQuery** | **String**         | Search query following Audit Logs syntax.                            | [optional]                               |
| **filterFrom**  | **OffsetDateTime** | Minimum timestamp for requested events.                              | [optional]                               |
| **filterTo**    | **OffsetDateTime** | Maximum timestamp for requested events.                              | [optional]                               |
| **sort**        | **AuditLogsSort**  | Order of events in results.                                          | [optional] [enum: timestamp, -timestamp] |
| **pageCursor**  | **String**         | List following results with a cursor provided in the previous query. | [optional]                               |
| **pageLimit**   | **Integer**        | Maximum number of events in the response.                            | [optional] [default to 10]               |

### Return type

[**AuditLogsEventsResponse**](AuditLogsEventsResponse.md)

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

## searchAuditLogs

> AuditLogsEventsResponse searchAuditLogs(parameters);

List endpoint returns Audit Logs events that match an Audit search query.
[Results are paginated][1].

Use this endpoint to build complex Audit Logs events filtering and search.

[1]: https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuditApi apiInstance = new AuditApi(defaultClient);
        AuditLogsSearchEventsRequest body = new AuditLogsSearchEventsRequest(); // AuditLogsSearchEventsRequest |
        try {
            AuditLogsEventsResponse result = apiInstance.searchAuditLogs(new AuditApi.SearchAuditLogsOptionalParameters()
                .body(body));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditApi#searchAuditLogs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                                | Description | Notes      |
| -------- | ------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**AuditLogsSearchEventsRequest**](AuditLogsSearchEventsRequest.md) |             | [optional] |

### Return type

[**AuditLogsEventsResponse**](AuditLogsEventsResponse.md)

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
