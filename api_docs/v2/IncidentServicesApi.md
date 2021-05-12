# IncidentServicesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createIncidentService**](IncidentServicesApi.md#createIncidentService) | **POST** /api/v2/services | Create a new incident service
[**deleteIncidentService**](IncidentServicesApi.md#deleteIncidentService) | **DELETE** /api/v2/services/{service_id} | Delete an existing incident service
[**getIncidentService**](IncidentServicesApi.md#getIncidentService) | **GET** /api/v2/services/{service_id} | Get details of an incident service
[**listIncidentServices**](IncidentServicesApi.md#listIncidentServices) | **GET** /api/v2/services | Get a list of all incident services
[**updateIncidentService**](IncidentServicesApi.md#updateIncidentService) | **PATCH** /api/v2/services/{service_id} | Update an existing incident service



## createIncidentService

> IncidentServiceResponse createIncidentService(body);

Creates a new incident service.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        IncidentServiceCreateRequest body = new IncidentServiceCreateRequest(); // IncidentServiceCreateRequest | Incident Service Payload.
        try {
            IncidentServiceResponse result = apiInstance.createIncidentService(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#createIncidentService");
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
 **body** | [**IncidentServiceCreateRequest**](IncidentServiceCreateRequest.md)| Incident Service Payload. |

### Return type

[**IncidentServiceResponse**](IncidentServiceResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## deleteIncidentService

> deleteIncidentService(serviceId);

Deletes an existing incident service.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        String serviceId = "serviceId_example"; // String | The ID of the incident service.
        try {
            apiInstance.deleteIncidentService(serviceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#deleteIncidentService");
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
 **serviceId** | **String**| The ID of the incident service. |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getIncidentService

> IncidentServiceResponse getIncidentService(serviceId, parameters);

Get details of an incident service. If the `include[users]` query parameter is provided,
the included attribute will contain the users related to these incident services.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        String serviceId = "serviceId_example"; // String | The ID of the incident service.
        IncidentRelatedObject include = IncidentRelatedObject.fromValue("users"); // IncidentRelatedObject | Specifies which types of related objects should be included in the response.
        try {
	    IncidentServiceResponse result = apiInstance.getIncidentService(serviceId, new IncidentServicesApi.GetIncidentServiceOptionalParameters()
                .include(include));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#getIncidentService");
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
 **serviceId** | **String**| The ID of the incident service. |
 **include** | **IncidentRelatedObject**| Specifies which types of related objects should be included in the response. | [optional] [enum: users]

### Return type

[**IncidentServiceResponse**](IncidentServiceResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## listIncidentServices

> IncidentServicesResponse listIncidentServices(parameters);

Get all incident services uploaded for the requesting user's organization. If the `include[users]` query parameter is provided, the included attribute will contain the users related to these incident services.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        IncidentRelatedObject include = IncidentRelatedObject.fromValue("users"); // IncidentRelatedObject | Specifies which types of related objects should be included in the response.
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageOffset = 0L; // Long | Specific offset to use as the beginning of the returned page.
        String filter = "ExampleServiceName"; // String | A search query that filters services by name.
        try {
	    IncidentServicesResponse result = apiInstance.listIncidentServices(new IncidentServicesApi.ListIncidentServicesOptionalParameters()
                .include(include)
                .pageSize(pageSize)
                .pageOffset(pageOffset)
                .filter(filter));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#listIncidentServices");
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
 **include** | **IncidentRelatedObject**| Specifies which types of related objects should be included in the response. | [optional] [enum: users]
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageOffset** | **Long**| Specific offset to use as the beginning of the returned page. | [optional] [default to 0]
 **filter** | **String**| A search query that filters services by name. | [optional]

### Return type

[**IncidentServicesResponse**](IncidentServicesResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## updateIncidentService

> IncidentServiceResponse updateIncidentService(serviceId, body);

Updates an existing incident service. Only provide the attributes which should be updated as this request is a partial update.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        String serviceId = "serviceId_example"; // String | The ID of the incident service.
        IncidentServiceUpdateRequest body = new IncidentServiceUpdateRequest(); // IncidentServiceUpdateRequest | Incident Service Payload.
        try {
            IncidentServiceResponse result = apiInstance.updateIncidentService(serviceId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#updateIncidentService");
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
 **serviceId** | **String**| The ID of the incident service. |
 **body** | [**IncidentServiceUpdateRequest**](IncidentServiceUpdateRequest.md)| Incident Service Payload. |

### Return type

[**IncidentServiceResponse**](IncidentServiceResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

