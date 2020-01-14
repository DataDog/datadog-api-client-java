# EventsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEvent**](EventsApi.md#createEvent) | **POST** /api/v1/events | Post an event
[**getEvent**](EventsApi.md#getEvent) | **GET** /api/v1/events/{event_id} | Get an event
[**listEvents**](EventsApi.md#listEvents) | **GET** /api/v1/events | Query the event stream.



## createEvent


> EventResponse createEvent().body(body).execute();

Post an event

### Overview
This endpoint allows you to post events to the stream. Tag them, set priority and event aggregate them with other events.
### Arguments
* **`title`** [*required*]:
    The event title. *Limited to 100 characters.*
    Use `msg_title` with [the Datadog Ruby library][1].

* **`text`** [*required*]:
    The body of the event. *Limited to 4000 characters.*
    The text supports [markdown][2].
    Use `msg_text` with [the Datadog Ruby library][1]

* **`date_happened`** [*optional*, *default* = **now**]:
    POSIX timestamp of the event. Must be sent as an integer (i.e. no quotes). *Limited to events no older than 1 year, 24 days (389 days)*

* **`priority`** [*optional*, *default* = **normal**]:
    The priority of the event: **normal** or **low**.

* **`host`** [*optional*, *default*=**None**]:
    Host name to associate with the event. Any tags associated with the host are also applied to this event.

* **`tags`** [*optional*, *default*=**None**]:
    A list of tags to apply to the event.

* **`alert_type`** [*optional*, *default* = **info**]:
    If it's an alert event, set its type between: **error**, **warning**, **info**, and **success**.

* **`aggregation_key`** [*optional*, *default*=**None**]:
    An arbitrary string to use for aggregation. *Limited to 100 characters.*
    If you specify a key, all events using that key are grouped together in the Event Stream.

* **`source_type_name`** [*optional*, *default*=**None**]:
    The type of event being posted.
    Options: **nagios**, **hudson**, **jenkins**, **my_apps**, **chef**, **puppet**, **git**, **bitbucket**...
    [Complete list of source attribute values][3]

* **`related_event_id`** [*optional*, *default*=**None**]:
    ID of the parent event. Must be sent as an integer (i.e. no quotes).

* **`device_name`** [*optional*, *default*=**None**]:
    A list of device names to post the event with.

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        Event body = new Event(); // Event | Event request object
        try { 
            EventResponse result = api.createEvent()
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
 **body** | [**Event**](Event.md)| Event request object |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

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

### Overview
This endpoint allows you to query for event details.
Note: if the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\,n in your output.

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long eventId = 56L; // Long | The id of the event
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
 **eventId** | **Long**| The id of the event |

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
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## listEvents


> EventListResponse listEvents().start(start).end(end).priority(priority).sources(sources).tags(tags).unaggregated(unaggregated).execute();

Query the event stream.

### Overview
The event stream can be queried and filtered by time, priority, sources and tags.
Note: if the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\,n in your output.
### Arguments
* **`start`** [*required*]:
    POSIX timestamp.

* **`end`** [*required*]:
    POSIX timestamp.

* **`priority`** [*optional*, *default*=**None**]:
    Priority of your events: **low** or **normal**.

* **`sources`** [*optional*, *default*=**None**]:
    A comma separated string of sources.

* **`tags`** [*optional*, *default*=**None**]:
    A comma separated string of tags. To use a negative tag filter, prefix your tag with `-`.
    See the Event Stream documentation to learn more.

* **`unaggregated`** [*optional*, *default*=*false*]:
    Set unaggregated to `true` to return all events within the specified [`start`,`end`] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won't be available in the output.

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long start = 56L; // Long | POSIX timestamp.
        Long end = 56L; // Long | POSIX timestamp.
        String priority = "priority_example"; // String | Priority of your events: **low** or **normal**.
        String sources = "sources_example"; // String | A comma separated string of sources.
        String tags = "tags_example"; // String | A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0.
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
 **priority** | **String**| Priority of your events: **low** or **normal**. | [optional] [enum: low, normal]
 **sources** | **String**| A comma separated string of sources. | [optional]
 **tags** | **String**| A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0. | [optional]
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

