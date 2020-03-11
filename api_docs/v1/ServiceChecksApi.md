# ServiceChecksApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitServiceCheck**](ServiceChecksApi.md#submitServiceCheck) | **POST** /api/v1/check_run | Submit a Service Check



## submitServiceCheck

> IntakePayloadAccepted submitServiceCheck().body(body).execute();

Submit a Service Check

### Overview
Submit a list of Service Checks.
**Note**: valid API key is required.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.ServiceChecksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuthQuery
        ApiKeyAuth apiKeyAuthQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuthQuery");
        apiKeyAuthQuery.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuthQuery.setApiKeyPrefix("Token");

        ServiceChecksApi apiInstance = new ServiceChecksApi(defaultClient);
        List<ServiceCheck> body = Arrays.asList(); // List<ServiceCheck> | Service Check body
        try {
            IntakePayloadAccepted result = api.submitServiceCheck()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceChecksApi#submitServiceCheck");
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
 **body** | [**List&lt;ServiceCheck&gt;**](ServiceCheck.md)| Service Check body |

### Return type

[**IntakePayloadAccepted**](IntakePayloadAccepted.md)

### Authorization

[apiKeyAuthQuery](../README.md#apiKeyAuthQuery)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Payload accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **408** | Request timeout |  -  |
| **413** | Payload too large |  -  |

