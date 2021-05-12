# LogsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**listLogs**](LogsApi.md#listLogs) | **POST** /api/v1/logs-queries/list | Search logs
[**submitLog**](LogsApi.md#submitLog) | **POST** /v1/input | Send logs



## listLogs

> LogsListResponse listLogs(body);

List endpoint returns logs that match a log search query.
[Results are paginated][1].

**If you are considering archiving logs for your organization,
consider use of the Datadog archive capabilities instead of the log list API.
See [Datadog Logs Archive documentation][2].**

[1]: /logs/guide/collect-multiple-logs-with-pagination
[2]: https://docs.datadoghq.com/logs/archives

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        LogsListRequest body = new LogsListRequest(); // LogsListRequest | Logs filter
        try {
            LogsListResponse result = apiInstance.listLogs(body);
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
 **body** | [**LogsListRequest**](LogsListRequest.md)| Logs filter |

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
| **403** | Authentication error |  -  |


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
- 200: OK
- 400: Bad request (likely an issue in the payload formatting)
- 403: Permission issue (likely using an invalid API Key)
- 413: Payload too large (batch is above 5MB uncompressed)
- 5xx: Internal error, request should be retried after some time

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsApi;

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;HTTPLogItem&gt;**](HTTPLogItem.md)| Log to send (JSON format). |
 **contentEncoding** | **ContentEncoding**| HTTP header used to compress the media-type. | [optional] [enum: gzip, deflate]
 **ddtags** | **String**| Log tags can be passed as query parameters with &#x60;text/plain&#x60; content type. | [optional]

### Return type

**Object**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/logplex-1, text/plain
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response from server (always 200 empty JSON). |  -  |
| **400** | unexpected error |  -  |

