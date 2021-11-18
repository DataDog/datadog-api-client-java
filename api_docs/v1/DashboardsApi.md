# DashboardsApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                      | HTTP request                                | Description                |
| ----------------------------------------------------------- | ------------------------------------------- | -------------------------- |
| [**createDashboard**](DashboardsApi.md#createDashboard)     | **POST** /api/v1/dashboard                  | Create a new dashboard     |
| [**deleteDashboard**](DashboardsApi.md#deleteDashboard)     | **DELETE** /api/v1/dashboard/{dashboard_id} | Delete a dashboard         |
| [**deleteDashboards**](DashboardsApi.md#deleteDashboards)   | **DELETE** /api/v1/dashboard                | Delete dashboards          |
| [**getDashboard**](DashboardsApi.md#getDashboard)           | **GET** /api/v1/dashboard/{dashboard_id}    | Get a dashboard            |
| [**listDashboards**](DashboardsApi.md#listDashboards)       | **GET** /api/v1/dashboard                   | Get all dashboards         |
| [**restoreDashboards**](DashboardsApi.md#restoreDashboards) | **PATCH** /api/v1/dashboard                 | Restore deleted dashboards |
| [**updateDashboard**](DashboardsApi.md#updateDashboard)     | **PUT** /api/v1/dashboard/{dashboard_id}    | Update a dashboard         |

## createDashboard

> Dashboard createDashboard(body);

Create a dashboard using the specified options. When defining queries in your widgets, take note of which queries should have the `as_count()` or `as_rate()` modifiers appended.
Refer to the following [documentation](https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab=count#in-application-modifiers) for more information on these modifiers.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard body = new Dashboard(); // Dashboard | Create a dashboard request body.
        try {
            Dashboard result = apiInstance.createDashboard(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#createDashboard");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                          | Description                      | Notes |
| -------- | ----------------------------- | -------------------------------- | ----- |
| **body** | [**Dashboard**](Dashboard.md) | Create a dashboard request body. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication Error | -                |
| **429**     | Too many requests    | -                |

## deleteDashboard

> DashboardDeleteResponse deleteDashboard(dashboardId);

Delete a dashboard using the specified ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
        try {
            DashboardDeleteResponse result = apiInstance.deleteDashboard(dashboardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboard");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type       | Description              | Notes |
| --------------- | ---------- | ------------------------ | ----- |
| **dashboardId** | **String** | The ID of the dashboard. |

### Return type

[**DashboardDeleteResponse**](DashboardDeleteResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **404**     | Dashboards Not Found | -                |
| **429**     | Too many requests    | -                |

## deleteDashboards

> deleteDashboards(body);

Delete dashboards using the specified IDs. If there are any failures, no dashboards will be deleted (partial success is not allowed).

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        DashboardBulkDeleteRequest body = new DashboardBulkDeleteRequest(); // DashboardBulkDeleteRequest | Delete dashboards request body.
        try {
            apiInstance.deleteDashboards(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboards");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                            | Description                     | Notes |
| -------- | --------------------------------------------------------------- | ------------------------------- | ----- |
| **body** | [**DashboardBulkDeleteRequest**](DashboardBulkDeleteRequest.md) | Delete dashboards request body. |

### Return type

null (empty response body)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **204**     | No Content           | -                |
| **400**     | Bad Request          | -                |
| **403**     | Forbidden            | -                |
| **404**     | Dashboards Not Found | -                |
| **429**     | Too many requests    | -                |

## getDashboard

> Dashboard getDashboard(dashboardId);

Get a dashboard using the specified ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
        try {
            Dashboard result = apiInstance.getDashboard(dashboardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboard");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type       | Description              | Notes |
| --------------- | ---------- | ------------------------ | ----- |
| **dashboardId** | **String** | The ID of the dashboard. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **404**     | Item Not Found       | -                |
| **429**     | Too many requests    | -                |

## listDashboards

> DashboardSummary listDashboards(parameters);

Get all dashboards.

**Note**: This query will only return custom created or cloned dashboards.
This query will not return preset dashboards.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Boolean filterShared = true; // Boolean | When `true`, this query only returns shared custom created or cloned dashboards.
        try {
            DashboardSummary result = apiInstance.listDashboards(new DashboardsApi.ListDashboardsOptionalParameters()
                .filterShared(filterShared));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#listDashboards");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name             | Type        | Description                                                                                | Notes      |
| ---------------- | ----------- | ------------------------------------------------------------------------------------------ | ---------- |
| **filterShared** | **Boolean** | When &#x60;true&#x60;, this query only returns shared custom created or cloned dashboards. | [optional] |

### Return type

[**DashboardSummary**](DashboardSummary.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **429**     | Too many requests    | -                |

## restoreDashboards

> restoreDashboards(body);

Restore dashboards using the specified IDs. If there are any failures, no dashboards will be restored (partial success is not allowed).

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        DashboardRestoreRequest body = new DashboardRestoreRequest(); // DashboardRestoreRequest | Restore dashboards request body.
        try {
            apiInstance.restoreDashboards(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#restoreDashboards");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                      | Description                      | Notes |
| -------- | --------------------------------------------------------- | -------------------------------- | ----- |
| **body** | [**DashboardRestoreRequest**](DashboardRestoreRequest.md) | Restore dashboards request body. |

### Return type

null (empty response body)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **204**     | No Content           | -                |
| **400**     | Bad Request          | -                |
| **403**     | Forbidden            | -                |
| **404**     | Dashboards Not Found | -                |
| **429**     | Too many requests    | -                |

## updateDashboard

> Dashboard updateDashboard(dashboardId, body);

Update a dashboard using the specified ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
        Dashboard body = new Dashboard(); // Dashboard | Update Dashboard request body.
        try {
            Dashboard result = apiInstance.updateDashboard(dashboardId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateDashboard");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type                          | Description                    | Notes |
| --------------- | ----------------------------- | ------------------------------ | ----- |
| **dashboardId** | **String**                    | The ID of the dashboard.       |
| **body**        | [**Dashboard**](Dashboard.md) | Update Dashboard request body. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication Error | -                |
| **404**     | Item Not Found       | -                |
| **429**     | Too many requests    | -                |
