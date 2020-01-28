# LogsHttpIntakeApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendLog**](LogsHttpIntakeApi.md#sendLog) | **POST** /v1/input | 



## sendLog

> Object sendLog().body(body).execute();



Send logs

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsHttpIntakeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthHeader
        ApiKeyAuth apiKeyAuthHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthHeader");
        apiKeyAuthHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthHeader.setApiKeyPrefix("Token");

        LogsHttpIntakeApi apiInstance = new LogsHttpIntakeApi(defaultClient);
        HTTPLog body = new HTTPLog(); // HTTPLog | Log to send (JSON format)
        try {
            Object result = api.sendLog()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsHttpIntakeApi#sendLog");
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
 **body** | [**HTTPLog**](HTTPLog.md)| Log to send (JSON format) |

### Return type

**Object**

### Authorization

[apiKeyAuthHeader](../README.md#apiKeyAuthHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response from server (always 200 empty JSON) |  -  |
| **0** | unexpected error |  -  |

