# PagerDutyIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPagerDutyIntegration**](PagerDutyIntegrationApi.md#createPagerDutyIntegration) | **PUT** /api/v1/integration/pagerduty | Create a PagerDuty integration
[**createPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#createPagerDutyIntegrationService) | **POST** /api/v1/integration/pagerduty/configuration/services | Create a new service object
[**deletePagerDutyIntegration**](PagerDutyIntegrationApi.md#deletePagerDutyIntegration) | **DELETE** /api/v1/integration/pagerduty | Delete a PagerDuty integration
[**deletePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#deletePagerDutyIntegrationService) | **DELETE** /api/v1/integration/pagerduty/configuration/services/{service_name} | Delete a single service object
[**getPagerDutyIntegration**](PagerDutyIntegrationApi.md#getPagerDutyIntegration) | **GET** /api/v1/integration/pagerduty | Get a PagerDuty integration
[**getPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#getPagerDutyIntegrationService) | **GET** /api/v1/integration/pagerduty/configuration/services/{service_name} | Get a single service object
[**updatePagerDutyIntegration**](PagerDutyIntegrationApi.md#updatePagerDutyIntegration) | **POST** /api/v1/integration/pagerduty | Add new services and schedules
[**updatePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#updatePagerDutyIntegrationService) | **PUT** /api/v1/integration/pagerduty/configuration/services/{service_name} | Update a single service object



## createPagerDutyIntegration

> createPagerDutyIntegration().body(body).execute();

Create a PagerDuty integration

Create a new Datadog-PagerDuty integration.
**Note:** All arguments are required when creating (`PUT`) a new PagerDuty configuration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        PagerDutyIntegration body = new PagerDutyIntegration(); // PagerDutyIntegration | Create Datadog-PagerDuty integration.
        try {
            api.createPagerDutyIntegration()
                .body(body)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#createPagerDutyIntegration");
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
 **body** | [**PagerDutyIntegration**](PagerDutyIntegration.md)| Create Datadog-PagerDuty integration. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## createPagerDutyIntegrationService

> PagerDutyServiceName createPagerDutyIntegrationService().body(body).execute();

Create a new service object

Create a new service object in the PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        PagerDutyService body = new PagerDutyService(); // PagerDutyService | Create a new service object in the Datadog-PagerDuty integration.
        try {
            PagerDutyServiceName result = api.createPagerDutyIntegrationService()
                .body(body)
                .execute();
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
 **body** | [**PagerDutyService**](PagerDutyService.md)| Create a new service object in the Datadog-PagerDuty integration. |

### Return type

[**PagerDutyServiceName**](PagerDutyServiceName.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **404** | Not Found |  -  |


## deletePagerDutyIntegration

> deletePagerDutyIntegration().execute();

Delete a PagerDuty integration

Delete the Datadog-PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        try {
            api.deletePagerDutyIntegration()
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#deletePagerDutyIntegration");
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

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | Integration does not exist |  -  |
| **403** | Authentication error |  -  |


## deletePagerDutyIntegrationService

> deletePagerDutyIntegrationService(serviceName).execute();

Delete a single service object

Delete a single service object in the Datadog-PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name
        try {
            api.deletePagerDutyIntegrationService(serviceName)
                .execute();
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## getPagerDutyIntegration

> PagerDutyIntegration getPagerDutyIntegration().execute();

Get a PagerDuty integration

Get all information about your Datadog-PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        try {
            PagerDutyIntegration result = api.getPagerDutyIntegration()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#getPagerDutyIntegration");
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

[**PagerDutyIntegration**](PagerDutyIntegration.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

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

> PagerDutyServiceName getPagerDutyIntegrationService(serviceName).execute();

Get a single service object

Get service name in the Datadog-PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name
        try {
            PagerDutyServiceName result = api.getPagerDutyIntegrationService(serviceName)
                .execute();
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
 **serviceName** | **String**| The service name |

### Return type

[**PagerDutyServiceName**](PagerDutyServiceName.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## updatePagerDutyIntegration

> updatePagerDutyIntegration().body(body).execute();

Add new services and schedules

Add new services and schedules to your Datadog-PagerDuty integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        PagerDutyServicesAndSchedules body = new PagerDutyServicesAndSchedules(); // PagerDutyServicesAndSchedules | Update an existing Datadog-PagerDuty integration.
        try {
            api.updatePagerDutyIntegration()
                .body(body)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#updatePagerDutyIntegration");
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
 **body** | [**PagerDutyServicesAndSchedules**](PagerDutyServicesAndSchedules.md)| Update an existing Datadog-PagerDuty integration. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## updatePagerDutyIntegrationService

> updatePagerDutyIntegrationService(serviceName).body(body).execute();

Update a single service object

Update a single service object in the Datadog-PagerDuty integration

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;

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
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
        String serviceName = "serviceName_example"; // String | The service name
        PagerDutyServiceKey body = new PagerDutyServiceKey(); // PagerDutyServiceKey | Update an existing service object in the Datadog-PagerDuty integration.
        try {
            api.updatePagerDutyIntegrationService(serviceName)
                .body(body)
                .execute();
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
 **body** | [**PagerDutyServiceKey**](PagerDutyServiceKey.md)| Update an existing service object in the Datadog-PagerDuty integration. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

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

