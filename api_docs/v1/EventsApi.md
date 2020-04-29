# EventsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvent**](EventsApi.md#getEvent) | **GET** /api/v1/events/{event_id} | Get an event
[**listEvents**](EventsApi.md#listEvents) | **GET** /api/v1/events | Query the event stream



## getEvent

> EventResponse getEvent(eventId).execute();

Get an event

This endpoint allows you to query for event details.

Note: if the event you’re querying contains markdown formatting of any kind,
you may see characters such as %,\,n in your output.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long eventId = 56L; // Long | The id of the event.
        try {
            EventResponse result = api.getEvent(eventId)
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
 **eventId** | **Long**| The id of the event. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

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

**Note**: If the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\,n in your output.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long start = 56L; // Long | POSIX timestamp.
        Long end = 56L; // Long | POSIX timestamp.
        EventPriority priority = new EventPriority(); // EventPriority | Priority of your events, either `low` or `normal`.
        String sources = "sources_example"; // String | A comma separated string of sources.
        String tags = host:host0; // String | A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope.
        Boolean unaggregated = true; // Boolean | Set unaggregated to `true` to return all events within the specified [`start`,`end`] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won't be available in the output.
        try {
            EventListResponse result = api.listEvents()
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
 **priority** | [**EventPriority**](.md)| Priority of your events, either &#x60;low&#x60; or &#x60;normal&#x60;. | [optional] [enum: normal, low]
 **sources** | **String**| A comma separated string of sources. | [optional]
 **tags** | **String**| A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. | [optional]
 **unaggregated** | **Boolean**| Set unaggregated to &#x60;true&#x60; to return all events within the specified [&#x60;start&#x60;,&#x60;end&#x60;] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won&#39;t be available in the output. | [optional]

### Return type

[**EventListResponse**](EventListResponse.md)

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
| **403** | Authentication Error |  -  |

