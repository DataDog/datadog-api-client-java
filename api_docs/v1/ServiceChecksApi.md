# ServiceChecksApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**submitServiceCheck**](ServiceChecksApi.md#submitServiceCheck) | **POST** /api/v1/check_run | Submit a Service Check



## submitServiceCheck

> IntakePayloadAccepted submitServiceCheck(body);

Submit a list of Service Checks.

**Note**: A valid API key is required.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceChecksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceChecksApi apiInstance = new ServiceChecksApi(defaultClient);
        List<ServiceCheck> body = Arrays.asList(); // List<ServiceCheck> | Service Check request body.
        try {
            IntakePayloadAccepted result = apiInstance.submitServiceCheck(body);
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
 **body** | [**List&lt;ServiceCheck&gt;**](ServiceCheck.md)| Service Check request body. |

### Return type

[**IntakePayloadAccepted**](IntakePayloadAccepted.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Payload accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |
| **408** | Request timeout |  -  |
| **413** | Payload too large |  -  |

