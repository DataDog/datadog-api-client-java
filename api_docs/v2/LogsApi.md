# LogsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLogs**](LogsApi.md#listLogs) | **POST** /api/v2/logs/events/search | Get a list of logs
[**listLogsGet**](LogsApi.md#listLogsGet) | **GET** /api/v2/logs/events | Get a quick list of logs



## listLogs

> LogsListResponse listLogs().body(body).execute();

Get a list of logs

List endpoint returns logs that match a log search query.
[Results are paginated][1].

Both this endpoint and the GET endpoint can be used interchangeably when listing
logs.

**If you are considering archiving logs for your organization,
consider use of the Datadog archive capabilities instead of the log list API.
See [Datadog Logs Archive documentation][2].**

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.LogsApi;

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

        LogsApi apiInstance = new LogsApi(defaultClient);
        LogsListRequest body = new LogsListRequest(); // LogsListRequest | 
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
 **body** | [**LogsListRequest**](LogsListRequest.md)|  | [optional]

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
| **403** | Not Authorized |  -  |


## listLogsGet

> LogsListResponse listLogsGet().filterQuery(filterQuery).filterIndex(filterIndex).filterFrom(filterFrom).filterTo(filterTo).sort(sort).pageCursor(pageCursor).pageLimit(pageLimit).execute();

Get a quick list of logs

List endpoint returns logs that match a log search query.
[Results are paginated][1].

Both this endpoint and the POST endpoint can be used interchangeably when listing
logs.

**If you are considering archiving logs for your organization,
consider use of the Datadog archive capabilities instead of the log list API.
See [Datadog Logs Archive documentation][2].**

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.LogsApi;

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

        LogsApi apiInstance = new LogsApi(defaultClient);
        String filterQuery = @datacenter:us @role:db; // String | Search query following logs syntax.
        String filterIndex = main; // String | For customers with multiple indexes, the indexes to search Defaults to '*' which means all indexes
        OffsetDateTime filterFrom = 2019-01-02T09:42:36.320Z; // OffsetDateTime | Minimum timestamp for requested logs.
        OffsetDateTime filterTo = 2019-01-03T09:42:36.320Z; // OffsetDateTime | Maximum timestamp for requested logs.
        LogsSort sort = new LogsSort(); // LogsSort | Order of logs in results.
        String pageCursor = eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 25; // Integer | Maximum number of logs in the response.
        try {
            LogsListResponse result = api.listLogsGet()
                .filterQuery(filterQuery)
                .filterIndex(filterIndex)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit)
                .execute();
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
 **sort** | [**LogsSort**](.md)| Order of logs in results. | [optional] [enum: timestamp, -timestamp]
 **pageCursor** | **String**| List following results with a cursor provided in the previous query. | [optional]
 **pageLimit** | **Integer**| Maximum number of logs in the response. | [optional] [default to 10]

### Return type

[**LogsListResponse**](LogsListResponse.md)

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
| **403** | Not Authorized |  -  |

