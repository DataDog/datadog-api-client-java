# IpRangesApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPRanges**](IpRangesApi.md#getIPRanges) | **GET** / | List IP Ranges



## getIPRanges

> IPRanges getIPRanges().execute();

List IP Ranges

Get information about Datadog IP ranges.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.IpRangesApi;

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
        defaultClient.configureApiKeys(secrets);

        IpRangesApi apiInstance = new IpRangesApi(defaultClient);
        try {
            IPRanges result = api.getIPRanges()
                .execute();
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
| **200** | List of IP ranges. |  -  |

