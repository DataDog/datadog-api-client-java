# MonitorsApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                                | HTTP request                                   | Description                       |
| --------------------------------------------------------------------- | ---------------------------------------------- | --------------------------------- |
| [**checkCanDeleteMonitor**](MonitorsApi.md#checkCanDeleteMonitor)     | **GET** /api/v1/monitor/can_delete             | Check if a monitor can be deleted |
| [**createMonitor**](MonitorsApi.md#createMonitor)                     | **POST** /api/v1/monitor                       | Create a monitor                  |
| [**deleteMonitor**](MonitorsApi.md#deleteMonitor)                     | **DELETE** /api/v1/monitor/{monitor_id}        | Delete a monitor                  |
| [**getMonitor**](MonitorsApi.md#getMonitor)                           | **GET** /api/v1/monitor/{monitor_id}           | Get a monitor&#39;s details       |
| [**listMonitors**](MonitorsApi.md#listMonitors)                       | **GET** /api/v1/monitor                        | Get all monitor details           |
| [**searchMonitorGroups**](MonitorsApi.md#searchMonitorGroups)         | **GET** /api/v1/monitor/groups/search          | Monitors group search             |
| [**searchMonitors**](MonitorsApi.md#searchMonitors)                   | **GET** /api/v1/monitor/search                 | Monitors search                   |
| [**updateMonitor**](MonitorsApi.md#updateMonitor)                     | **PUT** /api/v1/monitor/{monitor_id}           | Edit a monitor                    |
| [**validateExistingMonitor**](MonitorsApi.md#validateExistingMonitor) | **POST** /api/v1/monitor/{monitor_id}/validate | Validate an existing monitor      |
| [**validateMonitor**](MonitorsApi.md#validateMonitor)                 | **POST** /api/v1/monitor/validate              | Validate a monitor                |

## checkCanDeleteMonitor

> CheckCanDeleteMonitorResponse checkCanDeleteMonitor(monitorIds);

Check if the given monitors can be deleted.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        List<Long> monitorIds = Arrays.asList(); // List<Long> | The IDs of the monitor to check.
        try {
            CheckCanDeleteMonitorResponse result = apiInstance.checkCanDeleteMonitor(monitorIds);
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

| Name           | Type                 | Description                      | Notes |
| -------------- | -------------------- | -------------------------------- | ----- |
| **monitorIds** | **List&lt;Long&gt;** | The IDs of the monitor to check. |

### Return type

[**CheckCanDeleteMonitorResponse**](CheckCanDeleteMonitorResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description             | Response headers |
| ----------- | ----------------------- | ---------------- |
| **200**     | OK                      | -                |
| **400**     | Bad Request             | -                |
| **403**     | Forbidden               | -                |
| **409**     | Deletion conflict error | -                |
| **429**     | Too many requests       | -                |

## createMonitor

> Monitor createMonitor(body);

Create a monitor using the specified options.

#### Monitor Types

The type of monitor chosen from:

- anomaly: `query alert`
- APM: `query alert` or `trace-analytics alert`
- composite: `composite`
- custom: `service check`
- event: `event alert`
- forecast: `query alert`
- host: `service check`
- integration: `query alert` or `service check`
- live process: `process alert`
- logs: `log alert`
- metric: `query alert`
- network: `service check`
- outlier: `query alert`
- process: `service check`
- rum: `rum alert`
- SLO: `slo alert`
- watchdog: `event alert`
- event-v2: `event-v2 alert`
- audit: `audit alert`
- error-tracking: `error-tracking alert`

#### Query Types

**Metric Alert Query**

Example: `time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator #`

- `time_aggr`: avg, sum, max, min, change, or pct_change
- `time_window`: `last_#m` (with `#` between 1 and 10080 depending on the monitor type) or `last_#h`(with `#` between 1 and 168 depending on the monitor type) or `last_1d`, or `last_1w`
- `space_aggr`: avg, sum, min, or max
- `tags`: one or more tags (comma-separated), or \*
- `key`: a 'key' in key:value tag syntax; defines a separate alert for each tag in the group (multi-alert)
- `operator`: <, <=, >, >=, ==, or !=
- `#`: an integer or decimal number used to set the threshold

If you are using the `_change_` or `_pct_change_` time aggregator, instead use `change_aggr(time_aggr(time_window), timeshift):space_aggr:metric{tags} [by {key}] operator #` with:

- `change_aggr` change, pct_change
- `time_aggr` avg, sum, max, min [Learn more](https://docs.datadoghq.com/monitors/create/types/#define-the-conditions)
- `time_window` last\_#m (between 1 and 2880 depending on the monitor type), last\_#h (between 1 and 48 depending on the monitor type), or last\_#d (1 or 2)
- `timeshift` #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago

Use this to create an outlier monitor using the following query:
`avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host}, 'dbscan', 7) > 0`

**Service Check Query**

Example: `"check".over(tags).last(count).by(group).count_by_status()`

- **`check`** name of the check, for example `datadog.agent.up`
- **`tags`** one or more quoted tags (comma-separated), or "\*". for example: `.over("env:prod", "role:db")`; **`over`** cannot be blank.
- **`count`** must be at greater than or equal to your max threshold (defined in the `options`). It is limited to 100.
  For example, if you've specified to notify on 1 critical, 3 ok, and 2 warn statuses, `count` should be at least 3.
- **`group`** must be specified for check monitors. Per-check grouping is already explicitly known for some service checks.
  For example, Postgres integration monitors are tagged by `db`, `host`, and `port`, and Network monitors by `host`, `instance`, and `url`. See [Service Checks](https://docs.datadoghq.com/api/latest/service-checks/) documentation for more information.

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
- **`last`** the timeframe to roll up the counts. Examples: 45m, 4h. Supported timeframes: m, h and d. This value should not exceed 48 hours.

**NOTE** The Event Alert Query is being deprecated and replaced by the Event V2 Alert Query. For more information, see the [Event Migration guide](https://docs.datadoghq.com/events/guides/migrating_to_new_events_features/).

**Event V2 Alert Query**

Example: `events(query).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`rollup_method`** The stats roll-up method - supports `count`, `avg` and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (between 1 and 2880), #h (between 1 and 48).
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

**NOTE** Only available on US1-FED, US3, US5 and in closed beta on EU and US1.

**Process Alert Query**

Example: `processes(search).over(tags).rollup('count').last(timeframe) operator #`

- **`search`** free text search string for querying processes.
  Matching processes match results on the [Live Processes](https://docs.datadoghq.com/infrastructure/process/?tab=linuxwindows) page.
- **`tags`** one or more tags (comma-separated)
- **`timeframe`** the timeframe to roll up the counts. Examples: 10m, 4h. Supported timeframes: s, m, h and d
- **`operator`** <, <=, >, >=, ==, or !=
- **`#`** an integer or decimal number used to set the threshold

**Logs Alert Query**

Example: `logs(query).index(index_name).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`index_name`** For multi-index organizations, the log index in which the request is performed.
- **`rollup_method`** The stats roll-up method - supports `count`, `avg` and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (between 1 and 2880), #h (between 1 and 48).
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

**Composite Query**

Example: `12345 && 67890`, where `12345` and `67890` are the IDs of non-composite monitors

- **`name`** [*required*, *default* = **dynamic, based on query**]: The name of the alert.
- **`message`** [*required*, *default* = **dynamic, based on query**]: A message to include with notifications for this monitor.
  Email notifications can be sent to specific users by using the same '@username' notation as events.
- **`tags`** [*optional*, *default* = **empty list**]: A list of tags to associate with your monitor.
  When getting all monitor details via the API, use the `monitor_tags` argument to filter results by these tags.
  It is only available via the API and isn't visible or editable in the Datadog UI.

**SLO Alert Query**

Example: `error_budget("slo_id").over("time_window") operator #`

- **`slo_id`**: The alphanumeric SLO ID of the SLO you are configuring the alert for.
- **`time_window`**: The time window of the SLO target you wish to alert on. Valid options: `7d`, `30d`, `90d`.
- **`operator`**: `>=` or `>`

**Audit Alert Query**

Example: `audits(query).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`rollup_method`** The stats roll-up method - supports `count`, `avg` and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (between 1 and 2880), #h (between 1 and 48).
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

**NOTE** Only available on US1-FED and in closed beta on US1, EU, US3, and US5.

**CI Pipelines Alert Query**

Example: `ci-pipelines(query).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`rollup_method`** The stats roll-up method - supports `count`, `avg`, and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (between 1 and 2880), #h (between 1 and 48).
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

**NOTE** CI Pipeline monitors are in alpha on US1, EU, US3 and US5.

**Error Tracking Alert Query**

Example(RUM): `error-tracking-rum(query).rollup(rollup_method[, measure]).last(time_window) operator #`
Example(APM Traces): `error-tracking-traces(query).rollup(rollup_method[, measure]).last(time_window) operator #`

- **`query`** The search query - following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/).
- **`rollup_method`** The stats roll-up method - supports `count`, `avg`, and `cardinality`.
- **`measure`** For `avg` and cardinality `rollup_method` - specify the measure or the facet name you want to use.
- **`time_window`** #m (between 1 and 2880), #h (between 1 and 48).
- **`operator`** `<`, `<=`, `>`, `>=`, `==`, or `!=`.
- **`#`** an integer or decimal number used to set the threshold.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Monitor body = new Monitor(); // Monitor | Create a monitor request body.
        try {
            Monitor result = apiInstance.createMonitor(body);
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

| Name     | Type                      | Description                    | Notes |
| -------- | ------------------------- | ------------------------------ | ----- |
| **body** | [**Monitor**](Monitor.md) | Create a monitor request body. |

### Return type

[**Monitor**](Monitor.md)

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
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## deleteMonitor

> DeletedMonitor deleteMonitor(monitorId, parameters);

Delete the specified monitor

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 666486743L; // Long | The ID of the monitor.
        String force = "false"; // String | Delete the monitor even if it's referenced by other resources (for example SLO, composite monitor).
        try {
            DeletedMonitor result = apiInstance.deleteMonitor(monitorId, new MonitorsApi.DeleteMonitorOptionalParameters()
                .force(force));
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

| Name          | Type       | Description                                                                                             | Notes      |
| ------------- | ---------- | ------------------------------------------------------------------------------------------------------- | ---------- |
| **monitorId** | **Long**   | The ID of the monitor.                                                                                  |
| **force**     | **String** | Delete the monitor even if it&#39;s referenced by other resources (for example SLO, composite monitor). | [optional] |

### Return type

[**DeletedMonitor**](DeletedMonitor.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **401**     | Authentication error | -                |
| **403**     | Forbidden            | -                |
| **404**     | Item not found error | -                |
| **429**     | Too many requests    | -                |

## getMonitor

> Monitor getMonitor(monitorId, parameters);

Get details about the specified monitor from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 666486743L; // Long | The ID of the monitor
        String groupStates = "groupStates_example"; // String | When specified, shows additional information about the group states. Choose one or more from `all`, `alert`, `warn`, and `no data`.
        try {
            Monitor result = apiInstance.getMonitor(monitorId, new MonitorsApi.GetMonitorOptionalParameters()
                .groupStates(groupStates));
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

| Name            | Type       | Description                                                                                                                                                                 | Notes      |
| --------------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **monitorId**   | **Long**   | The ID of the monitor                                                                                                                                                       |
| **groupStates** | **String** | When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. | [optional] |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description             | Response headers |
| ----------- | ----------------------- | ---------------- |
| **200**     | OK                      | -                |
| **400**     | Bad Request             | -                |
| **403**     | Authentication error    | -                |
| **404**     | Monitor Not Found error | -                |
| **429**     | Too many requests       | -                |

## listMonitors

> List&lt;Monitor&gt; listMonitors(parameters);

Get details about the specified monitor from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        String groupStates = "alert"; // String | When specified, shows additional information about the group states. Choose one or more from `all`, `alert`, `warn`, and `no data`.
        String name = "name_example"; // String | A string to filter monitors by name.
        String tags = "host:host0"; // String | A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. For example, `host:host0`.
        String monitorTags = "service:my-app"; // String | A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended. For example, `service:my-app`.
        Boolean withDowntimes = true; // Boolean | If this argument is set to true, then the returned data includes all current active downtimes for each monitor.
        Long idOffset = 56L; // Long | Use this parameter for paginating through large sets of monitors. Start with a value of zero, make a request, set the value to the last ID of result set, and then repeat until the response is empty.
        Long page = 0L; // Long | The page to start paginating from. If this argument is not specified, the request returns all monitors without pagination.
        Integer pageSize = 20; // Integer | The number of monitors to return per page. If the page argument is not specified, the default behavior returns all monitors without a `page_size` limit. However, if page is specified and `page_size` is not, the argument defaults to 100.
        try {
            List<Monitor> result = apiInstance.listMonitors(new MonitorsApi.ListMonitorsOptionalParameters()
                .groupStates(groupStates)
                .name(name)
                .tags(tags)
                .monitorTags(monitorTags)
                .withDowntimes(withDowntimes)
                .idOffset(idOffset)
                .page(page)
                .pageSize(pageSize));
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

| Name              | Type        | Description                                                                                                                                                                                                                                                      | Notes      |
| ----------------- | ----------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **groupStates**   | **String**  | When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;.                                                                                      | [optional] |
| **name**          | **String**  | A string to filter monitors by name.                                                                                                                                                                                                                             | [optional] |
| **tags**          | **String**  | A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. For example, &#x60;host:host0&#x60;.                                                                                                                | [optional] |
| **monitorTags**   | **String**  | A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended. For example, &#x60;service:my-app&#x60;.                  | [optional] |
| **withDowntimes** | **Boolean** | If this argument is set to true, then the returned data includes all current active downtimes for each monitor.                                                                                                                                                  | [optional] |
| **idOffset**      | **Long**    | Use this parameter for paginating through large sets of monitors. Start with a value of zero, make a request, set the value to the last ID of result set, and then repeat until the response is empty.                                                           | [optional] |
| **page**          | **Long**    | The page to start paginating from. If this argument is not specified, the request returns all monitors without pagination.                                                                                                                                       | [optional] |
| **pageSize**      | **Integer** | The number of monitors to return per page. If the page argument is not specified, the default behavior returns all monitors without a &#x60;page_size&#x60; limit. However, if page is specified and &#x60;page_size&#x60; is not, the argument defaults to 100. | [optional] |

### Return type

[**List&lt;Monitor&gt;**](Monitor.md)

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
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## searchMonitorGroups

> MonitorGroupSearchResponse searchMonitorGroups(parameters);

Search and filter your monitor groups details.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        String query = "query_example"; // String | After entering a search query in your [Manage Monitor page][1] use the query parameter value in the URL of the page as value for this parameter. Consult the dedicated [manage monitor documentation][2] page to learn more.  The query can contain any number of space-separated monitor attributes, for instance `query=\"type:metric status:alert\"`.  [1]: https://app.datadoghq.com/monitors/manage [2]: /monitors/manage/#find-the-monitors
        Long page = 0L; // Long | Page to start paginating from.
        Long perPage = 30L; // Long | Number of monitors to return per page.
        String sort = "sort_example"; // String | String for sort order, composed of field and sort order separate by a comma, for example `name,asc`. Supported sort directions: `asc`, `desc`. Supported fields:  * `name` * `status` * `tags`
        try {
            MonitorGroupSearchResponse result = apiInstance.searchMonitorGroups(new MonitorsApi.SearchMonitorGroupsOptionalParameters()
                .query(query)
                .page(page)
                .perPage(perPage)
                .sort(sort));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#searchMonitorGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Notes                      |
| ----------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------- |
| **query**   | **String** | After entering a search query in your [Manage Monitor page][1] use the query parameter value in the URL of the page as value for this parameter. Consult the dedicated [manage monitor documentation][2] page to learn more. The query can contain any number of space-separated monitor attributes, for instance &#x60;query&#x3D;\&quot;type:metric status:alert\&quot;&#x60;. [1]: https://app.datadoghq.com/monitors/manage [2]: /monitors/manage/#find-the-monitors | [optional]                 |
| **page**    | **Long**   | Page to start paginating from.                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [default to 0]  |
| **perPage** | **Long**   | Number of monitors to return per page.                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional] [default to 30] |
| **sort**    | **String** | String for sort order, composed of field and sort order separate by a comma, for example &#x60;name,asc&#x60;. Supported sort directions: &#x60;asc&#x60;, &#x60;desc&#x60;. Supported fields: _ &#x60;name&#x60; _ &#x60;status&#x60; \* &#x60;tags&#x60;                                                                                                                                                                                                               | [optional]                 |

### Return type

[**MonitorGroupSearchResponse**](MonitorGroupSearchResponse.md)

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
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## searchMonitors

> MonitorSearchResponse searchMonitors(parameters);

Search and filter your monitors details.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        String query = "query_example"; // String | After entering a search query in your [Manage Monitor page][1] use the query parameter value in the URL of the page as value for this parameter. Consult the dedicated [manage monitor documentation][2] page to learn more.  The query can contain any number of space-separated monitor attributes, for instance `query=\"type:metric status:alert\"`.  [1]: https://app.datadoghq.com/monitors/manage [2]: /monitors/manage/#find-the-monitors
        Long page = 0L; // Long | Page to start paginating from.
        Long perPage = 30L; // Long | Number of monitors to return per page.
        String sort = "sort_example"; // String | String for sort order, composed of field and sort order separate by a comma, for example `name,asc`. Supported sort directions: `asc`, `desc`. Supported fields:  * `name` * `status` * `tags`
        try {
            MonitorSearchResponse result = apiInstance.searchMonitors(new MonitorsApi.SearchMonitorsOptionalParameters()
                .query(query)
                .page(page)
                .perPage(perPage)
                .sort(sort));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#searchMonitors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Notes                      |
| ----------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------- |
| **query**   | **String** | After entering a search query in your [Manage Monitor page][1] use the query parameter value in the URL of the page as value for this parameter. Consult the dedicated [manage monitor documentation][2] page to learn more. The query can contain any number of space-separated monitor attributes, for instance &#x60;query&#x3D;\&quot;type:metric status:alert\&quot;&#x60;. [1]: https://app.datadoghq.com/monitors/manage [2]: /monitors/manage/#find-the-monitors | [optional]                 |
| **page**    | **Long**   | Page to start paginating from.                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [default to 0]  |
| **perPage** | **Long**   | Number of monitors to return per page.                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional] [default to 30] |
| **sort**    | **String** | String for sort order, composed of field and sort order separate by a comma, for example &#x60;name,asc&#x60;. Supported sort directions: &#x60;asc&#x60;, &#x60;desc&#x60;. Supported fields: _ &#x60;name&#x60; _ &#x60;status&#x60; \* &#x60;tags&#x60;                                                                                                                                                                                                               | [optional]                 |

### Return type

[**MonitorSearchResponse**](MonitorSearchResponse.md)

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
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## updateMonitor

> Monitor updateMonitor(monitorId, body);

Edit the specified monitor.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 666486743L; // Long | The ID of the monitor.
        MonitorUpdateRequest body = new MonitorUpdateRequest(); // MonitorUpdateRequest | Edit a monitor request body.
        try {
            Monitor result = apiInstance.updateMonitor(monitorId, body);
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

| Name          | Type                                                | Description                  | Notes |
| ------------- | --------------------------------------------------- | ---------------------------- | ----- |
| **monitorId** | **Long**                                            | The ID of the monitor.       |
| **body**      | [**MonitorUpdateRequest**](MonitorUpdateRequest.md) | Edit a monitor request body. |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description             | Response headers |
| ----------- | ----------------------- | ---------------- |
| **200**     | OK                      | -                |
| **400**     | Bad Request             | -                |
| **401**     | Authentication error    | -                |
| **403**     | Forbidden               | -                |
| **404**     | Monitor Not Found error | -                |
| **429**     | Too many requests       | -                |

## validateExistingMonitor

> Object validateExistingMonitor(monitorId, body);

Validate the monitor provided in the request.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Long monitorId = 666486743L; // Long | The ID of the monitor
        Monitor body = new Monitor(); // Monitor | Monitor request object
        try {
            Object result = apiInstance.validateExistingMonitor(monitorId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#validateExistingMonitor");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name          | Type                      | Description            | Notes |
| ------------- | ------------------------- | ---------------------- | ----- |
| **monitorId** | **Long**                  | The ID of the monitor  |
| **body**      | [**Monitor**](Monitor.md) | Monitor request object |

### Return type

**Object**

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Invalid JSON      | -                |
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## validateMonitor

> Object validateMonitor(body);

Validate the monitor provided in the request.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MonitorsApi apiInstance = new MonitorsApi(defaultClient);
        Monitor body = new Monitor(); // Monitor | Monitor request object
        try {
            Object result = apiInstance.validateMonitor(body);
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

| Name     | Type                      | Description            | Notes |
| -------- | ------------------------- | ---------------------- | ----- |
| **body** | [**Monitor**](Monitor.md) | Monitor request object |

### Return type

**Object**

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Invalid JSON      | -                |
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |
