# RumApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                 | HTTP request                             | Description              |
| ------------------------------------------------------ | ---------------------------------------- | ------------------------ |
| [**aggregateRUMEvents**](RumApi.md#aggregateRUMEvents) | **POST** /api/v2/rum/analytics/aggregate | Aggregate RUM events     |
| [**listRUMEvents**](RumApi.md#listRUMEvents)           | **GET** /api/v2/rum/events               | Get a list of RUM events |
| [**searchRUMEvents**](RumApi.md#searchRUMEvents)       | **POST** /api/v2/rum/events/search       | Search RUM events        |

## aggregateRUMEvents

> RUMAnalyticsAggregateResponse aggregateRUMEvents(body);

The API endpoint to aggregate RUM events into buckets of computed metrics and timeseries.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.RumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        RumApi apiInstance = new RumApi(defaultClient);
        RUMAggregateRequest body = new RUMAggregateRequest(); // RUMAggregateRequest |
        try {
            RUMAnalyticsAggregateResponse result = apiInstance.aggregateRUMEvents(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApi#aggregateRUMEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                              | Description | Notes |
| -------- | ------------------------------------------------- | ----------- | ----- |
| **body** | [**RUMAggregateRequest**](RUMAggregateRequest.md) |             |

### Return type

[**RUMAnalyticsAggregateResponse**](RUMAnalyticsAggregateResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

## listRUMEvents

> RUMEventsResponse listRUMEvents(parameters);

List endpoint returns events that match a RUM search query.
[Results are paginated][1].

Use this endpoint to see your latest RUM events.

[1]: https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.RumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        RumApi apiInstance = new RumApi(defaultClient);
        String filterQuery = "@type:session @application_id:xxxx"; // String | Search query following RUM syntax.
        OffsetDateTime filterFrom = OffsetDateTime.parse("2019-01-02T09:42:36.320Z"); // OffsetDateTime | Minimum timestamp for requested events.
        OffsetDateTime filterTo = OffsetDateTime.parse("2019-01-03T09:42:36.320Z"); // OffsetDateTime | Maximum timestamp for requested events.
        RUMSort sort = RUMSort.fromValue("timestamp"); // RUMSort | Order of events in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | Maximum number of events in the response.
        try {
            RUMEventsResponse result = apiInstance.listRUMEvents(new RumApi.ListRUMEventsOptionalParameters()
                .filterQuery(filterQuery)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApi#listRUMEvents");
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
| **filterQuery** | **String**         | Search query following RUM syntax.                                   | [optional]                               |
| **filterFrom**  | **OffsetDateTime** | Minimum timestamp for requested events.                              | [optional]                               |
| **filterTo**    | **OffsetDateTime** | Maximum timestamp for requested events.                              | [optional]                               |
| **sort**        | **RUMSort**        | Order of events in results.                                          | [optional] [enum: timestamp, -timestamp] |
| **pageCursor**  | **String**         | List following results with a cursor provided in the previous query. | [optional]                               |
| **pageLimit**   | **Integer**        | Maximum number of events in the response.                            | [optional] [default to 10]               |

### Return type

[**RUMEventsResponse**](RUMEventsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

## searchRUMEvents

> RUMEventsResponse searchRUMEvents(body);

List endpoint returns RUM events that match a RUM search query.
[Results are paginated][1].

Use this endpoint to build complex RUM events filtering and search.

[1]: https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.RumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        RumApi apiInstance = new RumApi(defaultClient);
        RUMSearchEventsRequest body = new RUMSearchEventsRequest(); // RUMSearchEventsRequest |
        try {
            RUMEventsResponse result = apiInstance.searchRUMEvents(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApi#searchRUMEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                    | Description | Notes |
| -------- | ------------------------------------------------------- | ----------- | ----- |
| **body** | [**RUMSearchEventsRequest**](RUMSearchEventsRequest.md) |             |

### Return type

[**RUMEventsResponse**](RUMEventsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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
