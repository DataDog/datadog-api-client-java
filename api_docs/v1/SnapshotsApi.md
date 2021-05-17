# SnapshotsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**getGraphSnapshot**](SnapshotsApi.md#getGraphSnapshot) | **GET** /api/v1/graph/snapshot | Take graph snapshots



## getGraphSnapshot

> GraphSnapshot getGraphSnapshot(start, end, parameters);

Take graph snapshots.
**Note**: When a snapshot is created, there is some delay before it is available.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SnapshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
        Long start = 56L; // Long | The POSIX timestamp of the start of the query.
        Long end = 56L; // Long | The POSIX timestamp of the end of the query.
        String metricQuery = "metricQuery_example"; // String | The metric query.
        String eventQuery = "eventQuery_example"; // String | A query that adds event bands to the graph.
        String graphDef = "graphDef_example"; // String | A JSON document defining the graph. `graph_def` can be used instead of `metric_query`. The JSON document uses the [grammar defined here](https://docs.datadoghq.com/graphing/graphing_json/#grammar) and should be formatted to a single line then URL encoded.
        String title = "title_example"; // String | A title for the graph. If no title is specified, the graph does not have a title.
        try {
	    GraphSnapshot result = apiInstance.getGraphSnapshot(start, end, new SnapshotsApi.GetGraphSnapshotOptionalParameters()
                .metricQuery(metricQuery)
                .eventQuery(eventQuery)
                .graphDef(graphDef)
                .title(title));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotsApi#getGraphSnapshot");
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
 **start** | **Long**| The POSIX timestamp of the start of the query. |
 **end** | **Long**| The POSIX timestamp of the end of the query. |
 **metricQuery** | **String**| The metric query. | [optional]
 **eventQuery** | **String**| A query that adds event bands to the graph. | [optional]
 **graphDef** | **String**| A JSON document defining the graph. &#x60;graph_def&#x60; can be used instead of &#x60;metric_query&#x60;. The JSON document uses the [grammar defined here](https://docs.datadoghq.com/graphing/graphing_json/#grammar) and should be formatted to a single line then URL encoded. | [optional]
 **title** | **String**| A title for the graph. If no title is specified, the graph does not have a title. | [optional]

### Return type

[**GraphSnapshot**](GraphSnapshot.md)

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
| **403** | Forbidden |  -  |

