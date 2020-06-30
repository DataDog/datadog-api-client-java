# MonitorsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCanDeleteMonitor**](MonitorsApi.md#checkCanDeleteMonitor) | **GET** /api/v1/monitor/can_delete | Check if a monitor can be deleted
[**createMonitor**](MonitorsApi.md#createMonitor) | **POST** /api/v1/monitor | Create a monitor
[**deleteMonitor**](MonitorsApi.md#deleteMonitor) | **DELETE** /api/v1/monitor/{monitor_id} | Delete a monitor
[**getMonitor**](MonitorsApi.md#getMonitor) | **GET** /api/v1/monitor/{monitor_id} | Get a monitor&#39;s details
[**listMonitors**](MonitorsApi.md#listMonitors) | **GET** /api/v1/monitor | Get all monitor details
[**updateMonitor**](MonitorsApi.md#updateMonitor) | **PUT** /api/v1/monitor/{monitor_id} | Edit a monitor
[**validateMonitor**](MonitorsApi.md#validateMonitor) | **POST** /api/v1/monitor/validate | Validate a monitor



## checkCanDeleteMonitor

> CheckCanDeleteMonitorResponse checkCanDeleteMonitor().monitorIds(monitorIds).execute();

Check if a monitor can be deleted

Check if the given monitors can be deleted.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        List<Long> monitorIds = Arrays.asList(); // List<Long> | The IDs of the monitor to check.
        try {
            CheckCanDeleteMonitorResponse result = api.checkCanDeleteMonitor()
                .monitorIds(monitorIds)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#checkCanDeleteMonitor");
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
 **monitorIds** | [**List&lt;Long&gt;**](Long.md)| The IDs of the monitor to check. |

### Return type

[**CheckCanDeleteMonitorResponse**](CheckCanDeleteMonitorResponse.md)

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
| **403** | Forbidden |  -  |
| **409** | Deletion conflict error |  -  |


## createMonitor

> Monitor createMonitor().body(body).execute();

Create a monitor

Create a monitor using the specified options.

#### Monitor Types

The type of monitor chosen from:

- anomaly: `query alert`
- APM: `query alert`
- composite: `composite`
- custom: `service check`
- event: `event alert`
- forecast: `query alert`
- host: `service check`
- integration: `query alert` or `service check`
- live process: `process alert`
- logs: `logs alert`
- metric: `metric alert`
- network: `service check`
- outlier: `query alert`
- process: `service query`
- rum: `alert`
- watchdog: `event alert`

#### Query Types

**Metric Alert Query**

Example: `time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator #`

- `time_aggr`: avg, sum, max, min, change, or pct_change
- `time_window`: `last_#m` (with `#` being 5, 10, 15, or 30) or `last_#h`(with `#` being 1, 2, or 4), or `last_1d`
- `space_aggr`: avg, sum, min, or max
- `tags`: one or more tags (comma-separated), or *
- `key`: a 'key' in key:value tag syntax; defines a separate alert for each tag in the group (multi-alert)
- `operator`: <, <=, >, >=, ==, or !=
- `#`: an integer or decimal number used to set the threshold

If you are using the `_change_` or `_pct_change_` time aggregator, instead use `change_aggr(time_aggr(time_window),
timeshift):space_aggr:metric{tags} [by {key}] operator #` with:

- `change_aggr` change, pct_change
- `time_aggr` avg, sum, max, min [Learn more](https://docs.datadoghq.com/monitors/monitor_types/#define-the-conditions)
- `time_window` last\_#m (1, 5, 10, 15, or 30), last\_#h (1, 2, or 4), or last_#d (1 or 2)
- `timeshift` #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago

Use this to create an outlier monitor using the following query:
`avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host}, 'dbscan', 7) > 0`

**Service Check Query**

Example: `"check".over(tags).last(count).count_by_status()`

- **`check`** name of the check, e.g. `datadog.agent.up`
- **`tags`** one or more quoted tags (comma-separated), or "*". e.g.: `.over("env:prod", "role:db")`
- **`count`** must be at >= your max threshold (defined in the `options`).
e.g. if you want to notify on 1 critical, 3 ok and 2 warn statuses count should be 3. It is limited to 100.

**Event Alert Query**

Example: `events('sources:nagios status:error,warning priority:normal tags: "string query"').rollup("count").last("1h")"`

- **`event`**, the event query string:
- **`string_query`** free text query to match against event title and text.
- **`sources`** event sources (comma-separated).
- **`status`** event statuses (comma-separated). Valid options: error, warn, and info.
- **`priority`** event priorities (comma-separated). Valid options: low, normal, all.
- **`host`** event reporting host (comma-separated).
- **`tags`** event tags (comma-separated).
- **`excluded_tags`** excluded event tags (comma-separated).
- **`rollup`** the stats roll-up method. `count` is the only supported method now.
- **`last`** the timeframe to roll up the counts. Examples: 60s, 4h. Supported timeframes: s, m, h and d. This value should not exceed 48 hours.

**Process Alert Query**

Example: `processes(search).over(tags).rollup('count').last(timeframe) operator #`

- **`search`** free text search string for querying processes.
Matching processes match results on the [Live Processes](https://docs.datadoghq.com/infrastructure/process/?tab=linuxwindows) page.
- **`tags`** one or more tags (comma-separated)
- **`timeframe`** the timeframe to roll up the counts. Examples: 60s, 4h. Supported timeframes: s, m, h and d
- **`operator`** <, <=, >, >=, ==, or !=
- **`#`** an integer or decimal number used to set the threshold

**Logs Alert Query**

Example: `logs(query).index(index_name).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`index_name`** For multi-index organizations, the log index in which the request is performed.
- **`rollup_method`** The stats roll-up method - supports `count`, `avg` and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (5, 10, 15, or 30), #h (1, 2, or 4, 24)
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

**Composite Query**

Example: `12345 && 67890`, where `12345` and `67890` are the IDs of non-composite monitors

* **`name`** [*required*, *default* = **dynamic, based on query**]: The name of the alert.
* **`message`** [*required*, *default* = **dynamic, based on query**]: A message to include with notifications for this monitor.
Email notifications can be sent to specific users by using the same '@username' notation as events.
* **`tags`** [*optional*, *default* = **empty list**]: A list of tags to associate with your monitor.
When getting all monitor details via the API, use the `monitor_tags` argument to filter results by these tags.
It is only available via the API and isn't visible or editable in the Datadog UI.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Monitor body = new Monitor(); // Monitor | Create a monitor request body.
        try {
            Monitor result = api.createMonitor()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#createMonitor");
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
 **body** | [**Monitor**](Monitor.md)| Create a monitor request body. |

### Return type

[**Monitor**](Monitor.md)

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
| **403** | Forbidden |  -  |


## deleteMonitor

> DeletedMonitor deleteMonitor(monitorId).force(force).execute();

Delete a monitor

Delete the specified monitor

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 56L; // Long | The ID of the monitor.
        String force = "force_example"; // String | Delete the monitor even if it's referenced by other resources (e.g. SLO, composite monitor).
        try {
            DeletedMonitor result = api.deleteMonitor(monitorId)
                .force(force)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#deleteMonitor");
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
 **monitorId** | **Long**| The ID of the monitor. |
 **force** | **String**| Delete the monitor even if it&#39;s referenced by other resources (e.g. SLO, composite monitor). | [optional]

### Return type

[**DeletedMonitor**](DeletedMonitor.md)

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
| **401** | Authentication error |  -  |
| **403** | Forbidden |  -  |
| **404** | Item not found error |  -  |


## getMonitor

> Monitor getMonitor(monitorId).groupStates(groupStates).execute();

Get a monitor&#39;s details

Get details about the specified monitor from your organization.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 56L; // Long | The ID of the monitor
        String groupStates = "groupStates_example"; // String | When specified, shows additional information about the group states. Choose one or more from `all`, `alert`, `warn`, and `no data`.
        try {
            Monitor result = api.getMonitor(monitorId)
                .groupStates(groupStates)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#getMonitor");
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
 **monitorId** | **Long**| The ID of the monitor |
 **groupStates** | **String**| When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. | [optional]

### Return type

[**Monitor**](Monitor.md)

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
| **403** | Authentication error |  -  |
| **404** | Monitor Not Found error |  -  |


## listMonitors

> List&lt;Monitor&gt; listMonitors().groupStates(groupStates).name(name).tags(tags).monitorTags(monitorTags).withDowntimes(withDowntimes).idOffset(idOffset).page(page).pageSize(pageSize).execute();

Get all monitor details

Get details about the specified monitor from your organization.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        String groupStates = "groupStates_example"; // String | When specified, shows additional information about the group states. Choose one or more from `all`, `alert`, `warn`, and `no data`.
        String name = "name_example"; // String | A string to filter monitors by name.
        String tags = "tags_example"; // String | A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. For example, `host:host0`.
        String monitorTags = "monitorTags_example"; // String | A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended. For example, `service:my-app`.
        Boolean withDowntimes = true; // Boolean | If this argument is set to true, then the returned data includes all current downtimes for each monitor.
        Long idOffset = 56L; // Long | Monitor ID offset.
        Long page = 56L; // Long | The page to start paginating from. If this argument is not specified, the request returns all monitors without pagination.
        Integer pageSize = 56; // Integer | The number of monitors to return per page. If the page argument is not specified, the default behavior returns all monitors without a `page_size` limit. However, if page is specified and `page_size` is not, the argument defaults to 100.
        try {
            List<Monitor> result = api.listMonitors()
                .groupStates(groupStates)
                .name(name)
                .tags(tags)
                .monitorTags(monitorTags)
                .withDowntimes(withDowntimes)
                .idOffset(idOffset)
                .page(page)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#listMonitors");
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
 **groupStates** | **String**| When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. | [optional]
 **name** | **String**| A string to filter monitors by name. | [optional]
 **tags** | **String**| A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. For example, &#x60;host:host0&#x60;. | [optional]
 **monitorTags** | **String**| A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended. For example, &#x60;service:my-app&#x60;. | [optional]
 **withDowntimes** | **Boolean**| If this argument is set to true, then the returned data includes all current downtimes for each monitor. | [optional]
 **idOffset** | **Long**| Monitor ID offset. | [optional]
 **page** | **Long**| The page to start paginating from. If this argument is not specified, the request returns all monitors without pagination. | [optional]
 **pageSize** | **Integer**| The number of monitors to return per page. If the page argument is not specified, the default behavior returns all monitors without a &#x60;page_size&#x60; limit. However, if page is specified and &#x60;page_size&#x60; is not, the argument defaults to 100. | [optional]

### Return type

[**List&lt;Monitor&gt;**](Monitor.md)

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
| **403** | Forbidden |  -  |


## updateMonitor

> Monitor updateMonitor(monitorId).body(body).execute();

Edit a monitor

Edit the specified monitor.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 56L; // Long | The ID of the monitor.
        MonitorUpdateRequest body = new MonitorUpdateRequest(); // MonitorUpdateRequest | Edit a monitor request body.
        try {
            Monitor result = api.updateMonitor(monitorId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#updateMonitor");
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
 **monitorId** | **Long**| The ID of the monitor. |
 **body** | [**MonitorUpdateRequest**](MonitorUpdateRequest.md)| Edit a monitor request body. |

### Return type

[**Monitor**](Monitor.md)

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
| **401** | Authentication error |  -  |
| **403** | Forbidden |  -  |
| **404** | Monitor Not Found error |  -  |


## validateMonitor

> Monitor validateMonitor().body(body).execute();

Validate a monitor

Validate the monitor provided in the request.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.MonitorsApi;

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

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Monitor body = new Monitor(); // Monitor | Monitor request object
        try {
            Monitor result = api.validateMonitor()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#validateMonitor");
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
 **body** | [**Monitor**](Monitor.md)| Monitor request object |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid JSON |  -  |
| **403** | Forbidden |  -  |

