# EventsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEvent**](EventsApi.md#createEvent) | **POST** /api/v1/events | Post an event
[**getEvent**](EventsApi.md#getEvent) | **GET** /api/v1/events/{event_id} | Get an event
[**listEvents**](EventsApi.md#listEvents) | **GET** /api/v1/events | Query the event stream



## createEvent

> EventCreateResponse createEvent().body(body).execute();

Post an event

This endpoint allows you to post events to the stream.
Tag them, set priority and event aggregate them with other events.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventCreateRequest body = new EventCreateRequest(); // EventCreateRequest | Event request object
        try {
            EventCreateResponse result = apiInstance.createEvent()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#createEvent");
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
 **body** | [**EventCreateRequest**](EventCreateRequest.md)| Event request object |

### Return type

[**EventCreateResponse**](EventCreateResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |
| **400** | Bad Request |  -  |


## getEvent

> EventResponse getEvent(eventId).execute();

Get an event

This endpoint allows you to query for event details.

**Note**: If the event you’re querying contains markdown formatting of any kind,
you may see characters such as `%`,`\`,`n` in your output.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long eventId = 56L; // Long | The ID of the event.
        try {
            EventResponse result = apiInstance.getEvent(eventId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEvent");
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
 **eventId** | **Long**| The ID of the event. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication Error |  -  |
| **404** | Item Not Found |  -  |


## listEvents

> EventListResponse listEvents().start(start).end(end).priority(priority).sources(sources).tags(tags).unaggregated(unaggregated).execute();

Query the event stream

The event stream can be queried and filtered by time, priority, sources and tags.

**Notes**:
- If the event you’re querying contains markdown formatting of any kind,
you may see characters such as `%`,`\`,`n` in your output.

- This endpoint returns a maximum of `1000` most recent results. To return additional results,
identify the last timestamp of the last result and set that as the `end` query time to
paginate the results.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long start = 56L; // Long | POSIX timestamp.
        Long end = 56L; // Long | POSIX timestamp.
        EventPriority priority = EventPriority.fromValue("normal"); // EventPriority | Priority of your events, either `low` or `normal`.
        String sources = "sources_example"; // String | A comma separated string of sources.
        String tags = "host:host0"; // String | A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope.
        Boolean unaggregated = true; // Boolean | Set unaggregated to `true` to return all events within the specified [`start`,`end`] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won't be available in the output.
        try {
            EventListResponse result = apiInstance.listEvents()
                .start(start)
                .end(end)
                .priority(priority)
                .sources(sources)
                .tags(tags)
                .unaggregated(unaggregated)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#listEvents");
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
 **start** | **Long**| POSIX timestamp. |
 **end** | **Long**| POSIX timestamp. |
 **priority** | **EventPriority**| Priority of your events, either &#x60;low&#x60; or &#x60;normal&#x60;. | [optional] [enum: normal, low]
 **sources** | **String**| A comma separated string of sources. | [optional]
 **tags** | **String**| A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. | [optional]
 **unaggregated** | **Boolean**| Set unaggregated to &#x60;true&#x60; to return all events within the specified [&#x60;start&#x60;,&#x60;end&#x60;] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won&#39;t be available in the output. | [optional]

### Return type

[**EventListResponse**](EventListResponse.md)

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
| **403** | Authentication Error |  -  |

