# UsageMeteringApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDailyCustomReports**](UsageMeteringApi.md#getDailyCustomReports) | **GET** /api/v1/daily_custom_reports | Get the list of available daily custom reports
[**getIncidentManagement**](UsageMeteringApi.md#getIncidentManagement) | **GET** /api/v1/usage/incident-management | Get hourly usage for incident management
[**getIngestedSpans**](UsageMeteringApi.md#getIngestedSpans) | **GET** /api/v1/usage/ingested-spans | Get hourly usage for ingested spans
[**getMonthlyCustomReports**](UsageMeteringApi.md#getMonthlyCustomReports) | **GET** /api/v1/monthly_custom_reports | Get the list of available monthly custom reports
[**getSpecifiedDailyCustomReports**](UsageMeteringApi.md#getSpecifiedDailyCustomReports) | **GET** /api/v1/daily_custom_reports/{report_id} | Get specified daily custom reports
[**getSpecifiedMonthlyCustomReports**](UsageMeteringApi.md#getSpecifiedMonthlyCustomReports) | **GET** /api/v1/monthly_custom_reports/{report_id} | Get specified monthly custom reports
[**getTracingWithoutLimits**](UsageMeteringApi.md#getTracingWithoutLimits) | **GET** /api/v1/usage/tracing-without-limits | Get hourly usage for tracing without limits
[**getUsageAnalyzedLogs**](UsageMeteringApi.md#getUsageAnalyzedLogs) | **GET** /api/v1/usage/analyzed_logs | Get hourly usage for analyzed logs
[**getUsageAttribution**](UsageMeteringApi.md#getUsageAttribution) | **GET** /api/v1/usage/attribution | Get Usage Attribution
[**getUsageBillableSummary**](UsageMeteringApi.md#getUsageBillableSummary) | **GET** /api/v1/usage/billable-summary | Get billable usage across your multi-org account
[**getUsageFargate**](UsageMeteringApi.md#getUsageFargate) | **GET** /api/v1/usage/fargate | Get hourly usage for Fargate
[**getUsageHosts**](UsageMeteringApi.md#getUsageHosts) | **GET** /api/v1/usage/hosts | Get hourly usage for hosts and containers
[**getUsageIndexedSpans**](UsageMeteringApi.md#getUsageIndexedSpans) | **GET** /api/v1/usage/indexed-spans | Get hourly usage for indexed spans
[**getUsageLambda**](UsageMeteringApi.md#getUsageLambda) | **GET** /api/v1/usage/aws_lambda | Get hourly usage for Lambda
[**getUsageLogs**](UsageMeteringApi.md#getUsageLogs) | **GET** /api/v1/usage/logs | Get hourly usage for Logs
[**getUsageLogsByIndex**](UsageMeteringApi.md#getUsageLogsByIndex) | **GET** /api/v1/usage/logs_by_index | Get hourly usage for Logs by Index
[**getUsageNetworkFlows**](UsageMeteringApi.md#getUsageNetworkFlows) | **GET** /api/v1/usage/network_flows | Get hourly usage for Network Flows
[**getUsageNetworkHosts**](UsageMeteringApi.md#getUsageNetworkHosts) | **GET** /api/v1/usage/network_hosts | Get hourly usage for Network Hosts
[**getUsageProfiling**](UsageMeteringApi.md#getUsageProfiling) | **GET** /api/v1/usage/profiling | Get hourly usage for profiled hosts
[**getUsageRumSessions**](UsageMeteringApi.md#getUsageRumSessions) | **GET** /api/v1/usage/rum_sessions | Get hourly usage for RUM Sessions
[**getUsageSNMP**](UsageMeteringApi.md#getUsageSNMP) | **GET** /api/v1/usage/snmp | Get hourly usage for SNMP devices
[**getUsageSummary**](UsageMeteringApi.md#getUsageSummary) | **GET** /api/v1/usage/summary | Get usage across your multi-org account
[**getUsageSynthetics**](UsageMeteringApi.md#getUsageSynthetics) | **GET** /api/v1/usage/synthetics | Get hourly usage for Synthetics Checks
[**getUsageSyntheticsAPI**](UsageMeteringApi.md#getUsageSyntheticsAPI) | **GET** /api/v1/usage/synthetics_api | Get hourly usage for Synthetics API Checks
[**getUsageSyntheticsBrowser**](UsageMeteringApi.md#getUsageSyntheticsBrowser) | **GET** /api/v1/usage/synthetics_browser | Get hourly usage for Synthetics Browser Checks
[**getUsageTimeseries**](UsageMeteringApi.md#getUsageTimeseries) | **GET** /api/v1/usage/timeseries | Get hourly usage for custom metrics
[**getUsageTopAvgMetrics**](UsageMeteringApi.md#getUsageTopAvgMetrics) | **GET** /api/v1/usage/top_avg_metrics | Get top 500 custom metrics by hourly average
[**getUsageTrace**](UsageMeteringApi.md#getUsageTrace) | **GET** /api/v1/usage/traces | Get hourly usage for Trace Search



## getDailyCustomReports

> UsageCustomReportsResponse getDailyCustomReports().pageSize(pageSize).pageNumber(pageNumber).sortDir(sortDir).sort(sort).execute();

Get the list of available daily custom reports

Get daily custom reports.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        Long pageSize = 56L; // Long | The number of files to return in the response. `[default=60]`.
        Long pageNumber = 56L; // Long | The identifier of the first page to return. This parameter is used for the pagination feature `[default=0]`.
        UsageSortDirection sortDir = new UsageSortDirection(); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageSort sort = new UsageSort(); // UsageSort | The field to sort by: `[computed_on, size, start_date, end_date]`.
        try {
            UsageCustomReportsResponse result = apiInstance.getDailyCustomReports()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sortDir(sortDir)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getDailyCustomReports");
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
 **pageSize** | **Long**| The number of files to return in the response. &#x60;[default&#x3D;60]&#x60;. | [optional]
 **pageNumber** | **Long**| The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. | [optional]
 **sortDir** | **UsageSortDirection**| The direction to sort by: &#x60;[desc, asc]&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **sort** | **UsageSort**| The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;. | [optional] [default to start_date] [enum: computed_on, size, start_date, end_date]

### Return type

[**UsageCustomReportsResponse**](UsageCustomReportsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getIncidentManagement

> UsageIncidentManagementResponse getIncidentManagement().startHr(startHr).endHr(endHr).execute();

Get hourly usage for incident management

Get hourly usage for incident management.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIncidentManagementResponse result = apiInstance.getIncidentManagement()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getIncidentManagement");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageIncidentManagementResponse**](UsageIncidentManagementResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getIngestedSpans

> UsageIngestedSpansResponse getIngestedSpans().startHr(startHr).endHr(endHr).execute();

Get hourly usage for ingested spans

Get hourly usage for ingested spans.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIngestedSpansResponse result = apiInstance.getIngestedSpans()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getIngestedSpans");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageIngestedSpansResponse**](UsageIngestedSpansResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getMonthlyCustomReports

> UsageCustomReportsResponse getMonthlyCustomReports().pageSize(pageSize).pageNumber(pageNumber).sortDir(sortDir).sort(sort).execute();

Get the list of available monthly custom reports

Get monthly custom reports.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        Long pageSize = 56L; // Long | The number of files to return in the response `[default=60].`
        Long pageNumber = 56L; // Long | The identifier of the first page to return. This parameter is used for the pagination feature `[default=0]`.
        UsageSortDirection sortDir = new UsageSortDirection(); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageSort sort = new UsageSort(); // UsageSort | The field to sort by: `[computed_on, size, start_date, end_date]`.
        try {
            UsageCustomReportsResponse result = apiInstance.getMonthlyCustomReports()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sortDir(sortDir)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getMonthlyCustomReports");
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
 **pageSize** | **Long**| The number of files to return in the response &#x60;[default&#x3D;60].&#x60; | [optional]
 **pageNumber** | **Long**| The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. | [optional]
 **sortDir** | **UsageSortDirection**| The direction to sort by: &#x60;[desc, asc]&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **sort** | **UsageSort**| The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;. | [optional] [default to start_date] [enum: computed_on, size, start_date, end_date]

### Return type

[**UsageCustomReportsResponse**](UsageCustomReportsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getSpecifiedDailyCustomReports

> UsageSpecifiedCustomReportsResponse getSpecifiedDailyCustomReports(reportId).execute();

Get specified daily custom reports

Get specified daily custom reports.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        String reportId = "reportId_example"; // String | The specified ID to search results for.
        try {
            UsageSpecifiedCustomReportsResponse result = apiInstance.getSpecifiedDailyCustomReports(reportId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getSpecifiedDailyCustomReports");
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
 **reportId** | **String**| The specified ID to search results for. |

### Return type

[**UsageSpecifiedCustomReportsResponse**](UsageSpecifiedCustomReportsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden - User is not authorized |  -  |
| **404** | Not Found |  -  |


## getSpecifiedMonthlyCustomReports

> UsageSpecifiedCustomReportsResponse getSpecifiedMonthlyCustomReports(reportId).execute();

Get specified monthly custom reports

Get specified monthly custom reports.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        String reportId = "reportId_example"; // String | The specified ID to search results for.
        try {
            UsageSpecifiedCustomReportsResponse result = apiInstance.getSpecifiedMonthlyCustomReports(reportId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getSpecifiedMonthlyCustomReports");
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
 **reportId** | **String**| The specified ID to search results for. |

### Return type

[**UsageSpecifiedCustomReportsResponse**](UsageSpecifiedCustomReportsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |
| **404** | Not Found |  -  |


## getTracingWithoutLimits

> UsageTracingWithoutLimitsResponse getTracingWithoutLimits().startHr(startHr).endHr(endHr).execute();

Get hourly usage for tracing without limits

Get hourly usage for tracing without limits.

**Note** This endpoint has been renamed to `/api/v1/usage/ingested-spans`.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageTracingWithoutLimitsResponse result = apiInstance.getTracingWithoutLimits()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getTracingWithoutLimits");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageTracingWithoutLimitsResponse**](UsageTracingWithoutLimitsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageAnalyzedLogs

> UsageAnalyzedLogsResponse getUsageAnalyzedLogs().startHr(startHr).endHr(endHr).execute();

Get hourly usage for analyzed logs

Get hourly usage for analyzed logs (Security Monitoring).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageAnalyzedLogsResponse result = apiInstance.getUsageAnalyzedLogs()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageAnalyzedLogs");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageAnalyzedLogsResponse**](UsageAnalyzedLogsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageAttribution

> UsageAttributionResponse getUsageAttribution().startMonth(startMonth).fields(fields).endMonth(endMonth).orgId(orgId).sortDirection(sortDirection).sortName(sortName).execute();

Get Usage Attribution

Get Usage Attribution.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        String fields = "fields_example"; // String | The specified field to search results for.
        OffsetDateTime endMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        Long orgId = 56L; // Long | Include usage summaries for each sub-org.
        UsageSortDirection sortDirection = new UsageSortDirection(); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageAttributionSort sortName = new UsageAttributionSort(); // UsageAttributionSort | The field to sort by.
        try {
            UsageAttributionResponse result = apiInstance.getUsageAttribution()
                .startMonth(startMonth)
                .fields(fields)
                .endMonth(endMonth)
                .orgId(orgId)
                .sortDirection(sortDirection)
                .sortName(sortName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageAttribution");
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
 **startMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. |
 **fields** | **String**| The specified field to search results for. |
 **endMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month. | [optional]
 **orgId** | **Long**| Include usage summaries for each sub-org. | [optional]
 **sortDirection** | **UsageSortDirection**| The direction to sort by: &#x60;[desc, asc]&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **sortName** | **UsageAttributionSort**| The field to sort by. | [optional] [default to custom_timeseries_usage] [enum: api_percentage, snmp_usage, lambda_percentage, apm_host_usage, api_usage, container_usage, custom_timeseries_percentage, container_percentage, lambda_usage, apm_host_percentage, npm_host_percentage, browser_percentage, browser_usage, infra_host_percentage, snmp_percentage, npm_host_usage, infra_host_usage, custom_timeseries_usage]

### Return type

[**UsageAttributionResponse**](UsageAttributionResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageBillableSummary

> UsageBillableSummaryResponse getUsageBillableSummary().month(month).execute();

Get billable usage across your multi-org account

Get billable usage across your multi-org account.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime month = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage starting this month.
        try {
            UsageBillableSummaryResponse result = apiInstance.getUsageBillableSummary()
                .month(month)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageBillableSummary");
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
 **month** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage starting this month. | [optional]

### Return type

[**UsageBillableSummaryResponse**](UsageBillableSummaryResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageFargate

> UsageFargateResponse getUsageFargate().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Fargate

Get hourly usage for [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageFargateResponse result = apiInstance.getUsageFargate()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageFargate");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageFargateResponse**](UsageFargateResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageHosts

> UsageHostsResponse getUsageHosts().startHr(startHr).endHr(endHr).execute();

Get hourly usage for hosts and containers

Get hourly usage for hosts and containers.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageHostsResponse result = apiInstance.getUsageHosts()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageHosts");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageHostsResponse**](UsageHostsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageIndexedSpans

> UsageIndexedSpansResponse getUsageIndexedSpans().startHr(startHr).endHr(endHr).execute();

Get hourly usage for indexed spans

Get hourly usage for indexed spans.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIndexedSpansResponse result = apiInstance.getUsageIndexedSpans()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageIndexedSpans");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageIndexedSpansResponse**](UsageIndexedSpansResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageLambda

> UsageLambdaResponse getUsageLambda().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Lambda

Get hourly usage for lambda.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageLambdaResponse result = apiInstance.getUsageLambda()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageLambda");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageLambdaResponse**](UsageLambdaResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageLogs

> UsageLogsResponse getUsageLogs().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Logs

Get hourly usage for logs.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageLogsResponse result = apiInstance.getUsageLogs()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageLogs");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageLogsResponse**](UsageLogsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageLogsByIndex

> UsageLogsByIndexResponse getUsageLogsByIndex().startHr(startHr).endHr(endHr).indexName(indexName).execute();

Get hourly usage for Logs by Index

Get hourly usage for logs by index.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        List<String> indexName = Arrays.asList(); // List<String> | Comma-separated list of log index names.
        try {
            UsageLogsByIndexResponse result = apiInstance.getUsageLogsByIndex()
                .startHr(startHr)
                .endHr(endHr)
                .indexName(indexName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageLogsByIndex");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]
 **indexName** | **List&lt;String&gt;**| Comma-separated list of log index names. | [optional]

### Return type

[**UsageLogsByIndexResponse**](UsageLogsByIndexResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageNetworkFlows

> UsageNetworkFlowsResponse getUsageNetworkFlows().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Network Flows

Get hourly usage for network flows.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageNetworkFlowsResponse result = apiInstance.getUsageNetworkFlows()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageNetworkFlows");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageNetworkFlowsResponse**](UsageNetworkFlowsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageNetworkHosts

> UsageNetworkHostsResponse getUsageNetworkHosts().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Network Hosts

Get hourly usage for network hosts.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageNetworkHostsResponse result = apiInstance.getUsageNetworkHosts()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageNetworkHosts");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageNetworkHostsResponse**](UsageNetworkHostsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageProfiling

> UsageProfilingResponse getUsageProfiling().startHr(startHr).endHr(endHr).execute();

Get hourly usage for profiled hosts

Get hourly usage for profiled hosts.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageProfilingResponse result = apiInstance.getUsageProfiling()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageProfiling");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageProfilingResponse**](UsageProfilingResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageRumSessions

> UsageRumSessionsResponse getUsageRumSessions().startHr(startHr).endHr(endHr).type(type).execute();

Get hourly usage for RUM Sessions

Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        String type = "type_example"; // String | RUM type: `[browser, mobile]`. Defaults to `browser`.
        try {
            UsageRumSessionsResponse result = apiInstance.getUsageRumSessions()
                .startHr(startHr)
                .endHr(endHr)
                .type(type)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageRumSessions");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]
 **type** | **String**| RUM type: &#x60;[browser, mobile]&#x60;. Defaults to &#x60;browser&#x60;. | [optional]

### Return type

[**UsageRumSessionsResponse**](UsageRumSessionsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageSNMP

> UsageSNMPResponse getUsageSNMP().startHr(startHr).endHr(endHr).execute();

Get hourly usage for SNMP devices

Get hourly usage for SNMP devices.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageSNMPResponse result = apiInstance.getUsageSNMP()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSNMP");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional]

### Return type

[**UsageSNMPResponse**](UsageSNMPResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageSummary

> UsageSummaryResponse getUsageSummary().startMonth(startMonth).endMonth(endMonth).includeOrgDetails(includeOrgDetails).execute();

Get usage across your multi-org account

Get usage across your multi-org account.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        OffsetDateTime endMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        Boolean includeOrgDetails = true; // Boolean | Include usage summaries for each sub-org.
        try {
            UsageSummaryResponse result = apiInstance.getUsageSummary()
                .startMonth(startMonth)
                .endMonth(endMonth)
                .includeOrgDetails(includeOrgDetails)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSummary");
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
 **startMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. |
 **endMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month. | [optional]
 **includeOrgDetails** | **Boolean**| Include usage summaries for each sub-org. | [optional]

### Return type

[**UsageSummaryResponse**](UsageSummaryResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageSynthetics

> UsageSyntheticsResponse getUsageSynthetics().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics Checks

Get hourly usage for [Synthetics checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsResponse result = apiInstance.getUsageSynthetics()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSynthetics");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageSyntheticsResponse**](UsageSyntheticsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageSyntheticsAPI

> UsageSyntheticsAPIResponse getUsageSyntheticsAPI().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics API Checks

Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsAPIResponse result = apiInstance.getUsageSyntheticsAPI()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSyntheticsAPI");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageSyntheticsAPIResponse**](UsageSyntheticsAPIResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageSyntheticsBrowser

> UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics Browser Checks

Get hourly usage for synthetics browser checks.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsBrowserResponse result = apiInstance.getUsageSyntheticsBrowser()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSyntheticsBrowser");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageSyntheticsBrowserResponse**](UsageSyntheticsBrowserResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageTimeseries

> UsageTimeseriesResponse getUsageTimeseries().startHr(startHr).endHr(endHr).execute();

Get hourly usage for custom metrics

Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageTimeseriesResponse result = apiInstance.getUsageTimeseries()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageTimeseries");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageTimeseriesResponse**](UsageTimeseriesResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageTopAvgMetrics

> UsageTopAvgMetricsResponse getUsageTopAvgMetrics().month(month).names(names).limit(limit).execute();

Get top 500 custom metrics by hourly average

Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime month = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour.
        List<String> names = Arrays.asList(); // List<String> | Comma-separated list of metric names.
        Integer limit = 500; // Integer | Maximum number of results to return.
        try {
            UsageTopAvgMetricsResponse result = apiInstance.getUsageTopAvgMetrics()
                .month(month)
                .names(names)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageTopAvgMetrics");
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
 **month** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. |
 **names** | **List&lt;String&gt;**| Comma-separated list of metric names. | [optional]
 **limit** | **Integer**| Maximum number of results to return. | [optional] [default to 500]

### Return type

[**UsageTopAvgMetricsResponse**](UsageTopAvgMetricsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |


## getUsageTrace

> UsageTraceResponse getUsageTrace().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Trace Search

Get hourly usage for trace search.

**Note** This endpoint has been renamed to `/api/v1/usage/indexed-spans`.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageTraceResponse result = apiInstance.getUsageTrace()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageTrace");
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional]

### Return type

[**UsageTraceResponse**](UsageTraceResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden - User is not authorized |  -  |

