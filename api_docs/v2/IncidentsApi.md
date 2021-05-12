# IncidentsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createIncident**](IncidentsApi.md#createIncident) | **POST** /api/v2/incidents | Create an incident
[**deleteIncident**](IncidentsApi.md#deleteIncident) | **DELETE** /api/v2/incidents/{incident_id} | Delete an existing incident
[**getIncident**](IncidentsApi.md#getIncident) | **GET** /api/v2/incidents/{incident_id} | Get the details of an incident
[**listIncidents**](IncidentsApi.md#listIncidents) | **GET** /api/v2/incidents | Get a list of incidents
[**updateIncident**](IncidentsApi.md#updateIncident) | **PATCH** /api/v2/incidents/{incident_id} | Update an existing incident



## createIncident

> IncidentResponse createIncident(body);

Create an incident.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        IncidentCreateRequest body = new IncidentCreateRequest(); // IncidentCreateRequest | Incident payload.
        try {
            IncidentResponse result = apiInstance.createIncident(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#createIncident");
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
 **body** | [**IncidentCreateRequest**](IncidentCreateRequest.md)| Incident payload. |

### Return type

[**IncidentResponse**](IncidentResponse.md)

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


## deleteIncident

> deleteIncident(incidentId);

Deletes an existing incident from the users organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        String incidentId = "incidentId_example"; // String | The UUID the incident.
        try {
            apiInstance.deleteIncident(incidentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#deleteIncident");
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
 **incidentId** | **String**| The UUID the incident. |

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


## getIncident

> IncidentResponse getIncident(incidentId, parameters);

Get the details of an incident by `incident_id`.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        String incidentId = "incidentId_example"; // String | The UUID the incident.
        List<IncidentRelatedObject> include = Arrays.asList(); // List<IncidentRelatedObject> | Specifies which types of related objects should be included in the response.
        try {
	    IncidentResponse result = apiInstance.getIncident(incidentId, new IncidentsApi.GetIncidentOptionalParameters()
                .include(include));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#getIncident");
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
 **incidentId** | **String**| The UUID the incident. |
 **include** | **List&lt;IncidentRelatedObject&gt;**| Specifies which types of related objects should be included in the response. | [optional]

### Return type

[**IncidentResponse**](IncidentResponse.md)

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


## listIncidents

> IncidentsResponse listIncidents(parameters);

Get all incidents for the user's organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        List<IncidentRelatedObject> include = Arrays.asList(); // List<IncidentRelatedObject> | Specifies which types of related objects should be included in the response.
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageOffset = 0L; // Long | Specific offset to use as the beginning of the returned page.
        try {
	    IncidentsResponse result = apiInstance.listIncidents(new IncidentsApi.ListIncidentsOptionalParameters()
                .include(include)
                .pageSize(pageSize)
                .pageOffset(pageOffset));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#listIncidents");
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
 **include** | **List&lt;IncidentRelatedObject&gt;**| Specifies which types of related objects should be included in the response. | [optional]
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageOffset** | **Long**| Specific offset to use as the beginning of the returned page. | [optional] [default to 0]

### Return type

[**IncidentsResponse**](IncidentsResponse.md)

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


## updateIncident

> IncidentResponse updateIncident(incidentId, body);

Updates an incident. Provide only the attributes that should be updated as this request is a partial update.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        String incidentId = "incidentId_example"; // String | The UUID the incident.
        IncidentUpdateRequest body = new IncidentUpdateRequest(); // IncidentUpdateRequest | Incident Payload.
        try {
            IncidentResponse result = apiInstance.updateIncident(incidentId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#updateIncident");
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
 **incidentId** | **String**| The UUID the incident. |
 **body** | [**IncidentUpdateRequest**](IncidentUpdateRequest.md)| Incident Payload. |

### Return type

[**IncidentResponse**](IncidentResponse.md)

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

