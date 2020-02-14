# DashboardListsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDashboardListItems**](DashboardListsApi.md#addDashboardListItems) | **POST** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Add dashboards to an existing dashboard list.
[**deleteDashboardListItems**](DashboardListsApi.md#deleteDashboardListItems) | **DELETE** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Delete dashboards from an existing dashboard list.
[**getDashboardListItems**](DashboardListsApi.md#getDashboardListItems) | **GET** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Fetch the dashboard list&#39;s dashboard definitions.
[**updateDashboardListItems**](DashboardListsApi.md#updateDashboardListItems) | **PUT** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Update dashboards of an existing dashboard list.



## addDashboardListItems

> DashboardListAddItemsResponse addDashboardListItems(dashboardListId).body(body).execute();

Add dashboards to an existing dashboard list.

### Overview
Add dashboards to an existing dashboard list.
### Arguments
- **`dashboards`** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:

  - **`type`** [*required*]: The type of the dashboard. The type must be one of:

    - `"custom_timeboard"`

    - `"custom_screenboard"`

    - `"integration_screenboard"`

    - `"integration_timeboard"`

    - `"host_timeboard"`

  - **`id`** [*required*]: The id of the dashboard.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.DashboardListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
        Long dashboardListId = 56L; // Long | ID of the dashboard list to add items to
        DashboardListItems body = new DashboardListItems(); // DashboardListItems | Dashboards to add to the dashboard list
        try {
            DashboardListAddItemsResponse result = api.addDashboardListItems(dashboardListId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardListsApi#addDashboardListItems");
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
 **dashboardListId** | **Long**| ID of the dashboard list to add items to |
 **body** | [**DashboardListItems**](DashboardListItems.md)| Dashboards to add to the dashboard list |

### Return type

[**DashboardListAddItemsResponse**](DashboardListAddItemsResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## deleteDashboardListItems

> DashboardListDeleteItemsResponse deleteDashboardListItems(dashboardListId).body(body).execute();

Delete dashboards from an existing dashboard list.

### Overview
Delete dashboards from an existing dashboard list.
### Arguments
- **`dashboards`** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:

  - **`type`** [*required*]: The type of the dashboard. The type must be one of:

    - `"custom_timeboard"`

    - `"custom_screenboard"`

    - `"integration_screenboard"`

    - `"integration_timeboard"`

    - `"host_timeboard"`

  - **`id`** [*required*]: The id of the dashboard.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.DashboardListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
        Long dashboardListId = 56L; // Long | ID of the dashboard list to delete items from
        DashboardListItems body = new DashboardListItems(); // DashboardListItems | Dashboards to delete from the dashboard list
        try {
            DashboardListDeleteItemsResponse result = api.deleteDashboardListItems(dashboardListId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardListsApi#deleteDashboardListItems");
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
 **dashboardListId** | **Long**| ID of the dashboard list to delete items from |
 **body** | [**DashboardListItems**](DashboardListItems.md)| Dashboards to delete from the dashboard list |

### Return type

[**DashboardListDeleteItemsResponse**](DashboardListDeleteItemsResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getDashboardListItems

> DashboardListItems getDashboardListItems(dashboardListId).execute();

Fetch the dashboard list&#39;s dashboard definitions.

### Overview
Fetch the dashboard list’s dashboard definitions.
### Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.DashboardListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
        Long dashboardListId = 56L; // Long | ID of the dashboard list to get items from
        try {
            DashboardListItems result = api.getDashboardListItems(dashboardListId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardListsApi#getDashboardListItems");
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
 **dashboardListId** | **Long**| ID of the dashboard list to get items from |

### Return type

[**DashboardListItems**](DashboardListItems.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## updateDashboardListItems

> DashboardListItems updateDashboardListItems(dashboardListId).body(body).execute();

Update dashboards of an existing dashboard list.

### Overview
Update dashboards of an existing dashboard list.
### Arguments
- **`dashboards`** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:

  - **`type`** [*required*]: The type of the dashboard. The type must be one of:

    - `"custom_timeboard"`

    - `"custom_screenboard"`

    - `"integration_screenboard"`

    - `"integration_timeboard"`

    - `"host_timeboard"`

  - **`id`** [*required*]: The id of the dashboard.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.DashboardListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
        Long dashboardListId = 56L; // Long | ID of the dashboard list to update items from
        DashboardListItems body = new DashboardListItems(); // DashboardListItems | New dashboards of the dashboard list
        try {
            DashboardListItems result = api.updateDashboardListItems(dashboardListId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardListsApi#updateDashboardListItems");
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
 **dashboardListId** | **Long**| ID of the dashboard list to update items from |
 **body** | [**DashboardListItems**](DashboardListItems.md)| New dashboards of the dashboard list |

### Return type

[**DashboardListItems**](DashboardListItems.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

