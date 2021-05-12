# IpRangesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**getIPRanges**](IpRangesApi.md#getIPRanges) | **GET** / | List IP Ranges



## getIPRanges

> IPRanges getIPRanges();

Get information about Datadog IP ranges.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.IpRangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IpRangesApi apiInstance = new IpRangesApi(defaultClient);
        try {
            IPRanges result = apiInstance.getIPRanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpRangesApi#getIPRanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**IPRanges**](IPRanges.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

