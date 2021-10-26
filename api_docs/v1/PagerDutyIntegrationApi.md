# PagerDutyIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#createPagerDutyIntegrationService) | **POST** /api/v1/integration/pagerduty/configuration/services | Create a new service object
[**deletePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#deletePagerDutyIntegrationService) | **DELETE** /api/v1/integration/pagerduty/configuration/services/{service_name} | Delete a single service object
[**getPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#getPagerDutyIntegrationService) | **GET** /api/v1/integration/pagerduty/configuration/services/{service_name} | Get a single service object
[**updatePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#updatePagerDutyIntegrationService) | **PUT** /api/v1/integration/pagerduty/configuration/services/{service_name} | Update a single service object



## createPagerDutyIntegrationService

> PagerDutyServiceName createPagerDutyIntegrationService(body);

Create a new service object in the PagerDuty integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        PagerDutyService body = new PagerDutyService(); // PagerDutyService | Create a new service object request body.
        try {
            PagerDutyServiceName result = apiInstance.createPagerDutyIntegrationService(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#createPagerDutyIntegrationService");
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
 **body** | [**PagerDutyService**](PagerDutyService.md)| Create a new service object request body. |

### Return type

[**PagerDutyServiceName**](PagerDutyServiceName.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## deletePagerDutyIntegrationService

> deletePagerDutyIntegrationService(serviceName);

Delete a single service object in the Datadog-PagerDuty integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name
        try {
            apiInstance.deletePagerDutyIntegrationService(serviceName);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#deletePagerDutyIntegrationService");
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
 **serviceName** | **String**| The service name |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## getPagerDutyIntegrationService

> PagerDutyServiceName getPagerDutyIntegrationService(serviceName);

Get service name in the Datadog-PagerDuty integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name.
        try {
            PagerDutyServiceName result = apiInstance.getPagerDutyIntegrationService(serviceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#getPagerDutyIntegrationService");
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
 **serviceName** | **String**| The service name. |

### Return type

[**PagerDutyServiceName**](PagerDutyServiceName.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## updatePagerDutyIntegrationService

> updatePagerDutyIntegrationService(serviceName, body);

Update a single service object in the Datadog-PagerDuty integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name
        PagerDutyServiceKey body = new PagerDutyServiceKey(); // PagerDutyServiceKey | Update an existing service object request body.
        try {
            apiInstance.updatePagerDutyIntegrationService(serviceName, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#updatePagerDutyIntegrationService");
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
 **serviceName** | **String**| The service name |
 **body** | [**PagerDutyServiceKey**](PagerDutyServiceKey.md)| Update an existing service object request body. |

### Return type

null (empty response body)

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
| **404** | Item Not Found |  -  |

