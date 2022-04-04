# UsageMeteringApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                                                                   | HTTP request                                       | Description                                      |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------- | ------------------------------------------------ |
| [**getDailyCustomReports**](UsageMeteringApi.md#getDailyCustomReports)                                   | **GET** /api/v1/daily_custom_reports               | Get the list of available daily custom reports   |
| [**getHourlyUsageAttribution**](UsageMeteringApi.md#getHourlyUsageAttribution)                           | **GET** /api/v1/usage/hourly-attribution           | Get Hourly Usage Attribution                     |
| [**getIncidentManagement**](UsageMeteringApi.md#getIncidentManagement)                                   | **GET** /api/v1/usage/incident-management          | Get hourly usage for incident management         |
| [**getIngestedSpans**](UsageMeteringApi.md#getIngestedSpans)                                             | **GET** /api/v1/usage/ingested-spans               | Get hourly usage for ingested spans              |
| [**getMonthlyCustomReports**](UsageMeteringApi.md#getMonthlyCustomReports)                               | **GET** /api/v1/monthly_custom_reports             | Get the list of available monthly custom reports |
| [**getMonthlyUsageAttribution**](UsageMeteringApi.md#getMonthlyUsageAttribution)                         | **GET** /api/v1/usage/monthly-attribution          | Get Monthly Usage Attribution                    |
| [**getSpecifiedDailyCustomReports**](UsageMeteringApi.md#getSpecifiedDailyCustomReports)                 | **GET** /api/v1/daily_custom_reports/{report_id}   | Get specified daily custom reports               |
| [**getSpecifiedMonthlyCustomReports**](UsageMeteringApi.md#getSpecifiedMonthlyCustomReports)             | **GET** /api/v1/monthly_custom_reports/{report_id} | Get specified monthly custom reports             |
| [**getUsageAnalyzedLogs**](UsageMeteringApi.md#getUsageAnalyzedLogs)                                     | **GET** /api/v1/usage/analyzed_logs                | Get hourly usage for analyzed logs               |
| [**getUsageAttribution**](UsageMeteringApi.md#getUsageAttribution)                                       | **GET** /api/v1/usage/attribution                  | Get Usage Attribution                            |
| [**getUsageAuditLogs**](UsageMeteringApi.md#getUsageAuditLogs)                                           | **GET** /api/v1/usage/audit_logs                   | Get hourly usage for audit logs                  |
| [**getUsageBillableSummary**](UsageMeteringApi.md#getUsageBillableSummary)                               | **GET** /api/v1/usage/billable-summary             | Get billable usage across your account           |
| [**getUsageCIApp**](UsageMeteringApi.md#getUsageCIApp)                                                   | **GET** /api/v1/usage/ci-app                       | Get hourly usage for CI Visibility               |
| [**getUsageCWS**](UsageMeteringApi.md#getUsageCWS)                                                       | **GET** /api/v1/usage/cws                          | Get hourly usage for Cloud Workload Security     |
| [**getUsageCloudSecurityPostureManagement**](UsageMeteringApi.md#getUsageCloudSecurityPostureManagement) | **GET** /api/v1/usage/cspm                         | Get hourly usage for CSPM                        |
| [**getUsageDBM**](UsageMeteringApi.md#getUsageDBM)                                                       | **GET** /api/v1/usage/dbm                          | Get hourly usage for Database Monitoring         |
| [**getUsageFargate**](UsageMeteringApi.md#getUsageFargate)                                               | **GET** /api/v1/usage/fargate                      | Get hourly usage for Fargate                     |
| [**getUsageHosts**](UsageMeteringApi.md#getUsageHosts)                                                   | **GET** /api/v1/usage/hosts                        | Get hourly usage for hosts and containers        |
| [**getUsageIndexedSpans**](UsageMeteringApi.md#getUsageIndexedSpans)                                     | **GET** /api/v1/usage/indexed-spans                | Get hourly usage for indexed spans               |
| [**getUsageInternetOfThings**](UsageMeteringApi.md#getUsageInternetOfThings)                             | **GET** /api/v1/usage/iot                          | Get hourly usage for IoT                         |
| [**getUsageLambda**](UsageMeteringApi.md#getUsageLambda)                                                 | **GET** /api/v1/usage/aws_lambda                   | Get hourly usage for Lambda                      |
| [**getUsageLogs**](UsageMeteringApi.md#getUsageLogs)                                                     | **GET** /api/v1/usage/logs                         | Get hourly usage for Logs                        |
| [**getUsageLogsByIndex**](UsageMeteringApi.md#getUsageLogsByIndex)                                       | **GET** /api/v1/usage/logs_by_index                | Get hourly usage for Logs by Index               |
| [**getUsageLogsByRetention**](UsageMeteringApi.md#getUsageLogsByRetention)                               | **GET** /api/v1/usage/logs-by-retention            | Get hourly logs usage by retention               |
| [**getUsageNetworkFlows**](UsageMeteringApi.md#getUsageNetworkFlows)                                     | **GET** /api/v1/usage/network_flows                | Get hourly usage for Network Flows               |
| [**getUsageNetworkHosts**](UsageMeteringApi.md#getUsageNetworkHosts)                                     | **GET** /api/v1/usage/network_hosts                | Get hourly usage for Network Hosts               |
| [**getUsageOnlineArchive**](UsageMeteringApi.md#getUsageOnlineArchive)                                   | **GET** /api/v1/usage/online-archive               | Get hourly usage for Online Archive              |
| [**getUsageProfiling**](UsageMeteringApi.md#getUsageProfiling)                                           | **GET** /api/v1/usage/profiling                    | Get hourly usage for profiled hosts              |
| [**getUsageRumSessions**](UsageMeteringApi.md#getUsageRumSessions)                                       | **GET** /api/v1/usage/rum_sessions                 | Get hourly usage for RUM Sessions                |
| [**getUsageRumUnits**](UsageMeteringApi.md#getUsageRumUnits)                                             | **GET** /api/v1/usage/rum                          | Get hourly usage for RUM Units                   |
| [**getUsageSDS**](UsageMeteringApi.md#getUsageSDS)                                                       | **GET** /api/v1/usage/sds                          | Get hourly usage for Sensitive Data Scanner      |
| [**getUsageSNMP**](UsageMeteringApi.md#getUsageSNMP)                                                     | **GET** /api/v1/usage/snmp                         | Get hourly usage for SNMP devices                |
| [**getUsageSummary**](UsageMeteringApi.md#getUsageSummary)                                               | **GET** /api/v1/usage/summary                      | Get usage across your multi-org account          |
| [**getUsageSynthetics**](UsageMeteringApi.md#getUsageSynthetics)                                         | **GET** /api/v1/usage/synthetics                   | Get hourly usage for Synthetics Checks           |
| [**getUsageSyntheticsAPI**](UsageMeteringApi.md#getUsageSyntheticsAPI)                                   | **GET** /api/v1/usage/synthetics_api               | Get hourly usage for Synthetics API Checks       |
| [**getUsageSyntheticsBrowser**](UsageMeteringApi.md#getUsageSyntheticsBrowser)                           | **GET** /api/v1/usage/synthetics_browser           | Get hourly usage for Synthetics Browser Checks   |
| [**getUsageTimeseries**](UsageMeteringApi.md#getUsageTimeseries)                                         | **GET** /api/v1/usage/timeseries                   | Get hourly usage for custom metrics              |
| [**getUsageTopAvgMetrics**](UsageMeteringApi.md#getUsageTopAvgMetrics)                                   | **GET** /api/v1/usage/top_avg_metrics              | Get all custom metrics by hourly average         |

## getDailyCustomReports

> UsageCustomReportsResponse getDailyCustomReports(parameters);

Get daily custom reports.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        Long pageSize = 56L; // Long | The number of files to return in the response. `[default=60]`.
        Long pageNumber = 56L; // Long | The identifier of the first page to return. This parameter is used for the pagination feature `[default=0]`.
        UsageSortDirection sortDir = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageSort sort = UsageSort.fromValue("computed_on"); // UsageSort | The field to sort by: `[computed_on, size, start_date, end_date]`.
        try {
            UsageCustomReportsResponse result = apiInstance.getDailyCustomReports(new UsageMeteringApi.GetDailyCustomReportsOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sortDir(sortDir)
                .sort(sort));
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

| Name           | Type                   | Description                                                                                                                 | Notes                                                                              |
| -------------- | ---------------------- | --------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| **pageSize**   | **Long**               | The number of files to return in the response. &#x60;[default&#x3D;60]&#x60;.                                               | [optional]                                                                         |
| **pageNumber** | **Long**               | The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. | [optional]                                                                         |
| **sortDir**    | **UsageSortDirection** | The direction to sort by: &#x60;[desc, asc]&#x60;.                                                                          | [optional] [default to desc] [enum: desc, asc]                                     |
| **sort**       | **UsageSort**          | The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;.                                                | [optional] [default to start_date] [enum: computed_on, size, start_date, end_date] |

### Return type

[**UsageCustomReportsResponse**](UsageCustomReportsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getHourlyUsageAttribution

> HourlyUsageAttributionResponse getHourlyUsageAttribution(startHr, usageType, parameters);

Get Hourly Usage Attribution.

This API endpoint is paginated. To make sure you receive all records, check if the value of `next_record_id` is
set in the response. If it is, make another request and pass `next_record_id` as a parameter.
Pseudo code example:

```
response := GetHourlyUsageAttribution(start_month)
cursor := response.metadata.pagination.next_record_id
WHILE cursor != null BEGIN
  sleep(5 seconds)  # Avoid running into rate limit
  response := GetHourlyUsageAttribution(start_month, next_record_id=cursor)
  cursor := response.metadata.pagination.next_record_id
END
```

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        HourlyUsageAttributionUsageType usageType = HourlyUsageAttributionUsageType.fromValue("api_usage"); // HourlyUsageAttributionUsageType | Usage type to retrieve.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        String nextRecordId = "nextRecordId_example"; // String | List following results with a next_record_id provided in the previous query.
        String tagBreakdownKeys = "tagBreakdownKeys_example"; // String | Comma separated list of tags used to group usage. If no value is provided the usage will not be broken down by tags.  To see which tags are available, look for the value of `tag_config_source` in the API response.
        try {
            HourlyUsageAttributionResponse result = apiInstance.getHourlyUsageAttribution(startHr, usageType, new UsageMeteringApi.GetHourlyUsageAttributionOptionalParameters()
                .endHr(endHr)
                .nextRecordId(nextRecordId)
                .tagBreakdownKeys(tagBreakdownKeys));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getHourlyUsageAttribution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type                                | Description                                                                                                                                                                                                                    | Notes                                                                                                                                                                                                                                                                                        |
| -------------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **startHr**          | **OffsetDateTime**                  | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.                                                                                                               |
| **usageType**        | **HourlyUsageAttributionUsageType** | Usage type to retrieve.                                                                                                                                                                                                        | [enum: api_usage, apm_host_usage, browser_usage, container_usage, custom_timeseries_usage, estimated_indexed_logs_usage, fargate_usage, functions_usage, indexed_logs_usage, infra_host_usage, invocations_usage, npm_host_usage, profiled_container_usage, profiled_host_usage, snmp_usage] |
| **endHr**            | **OffsetDateTime**                  | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour.                                                                                                          | [optional]                                                                                                                                                                                                                                                                                   |
| **nextRecordId**     | **String**                          | List following results with a next_record_id provided in the previous query.                                                                                                                                                   | [optional]                                                                                                                                                                                                                                                                                   |
| **tagBreakdownKeys** | **String**                          | Comma separated list of tags used to group usage. If no value is provided the usage will not be broken down by tags. To see which tags are available, look for the value of &#x60;tag_config_source&#x60; in the API response. | [optional]                                                                                                                                                                                                                                                                                   |

### Return type

[**HourlyUsageAttributionResponse**](HourlyUsageAttributionResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getIncidentManagement

> UsageIncidentManagementResponse getIncidentManagement(startHr, parameters);

Get hourly usage for incident management.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIncidentManagementResponse result = apiInstance.getIncidentManagement(startHr, new UsageMeteringApi.GetIncidentManagementOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageIncidentManagementResponse**](UsageIncidentManagementResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getIngestedSpans

> UsageIngestedSpansResponse getIngestedSpans(startHr, parameters);

Get hourly usage for ingested spans.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIngestedSpansResponse result = apiInstance.getIngestedSpans(startHr, new UsageMeteringApi.GetIngestedSpansOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageIngestedSpansResponse**](UsageIngestedSpansResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getMonthlyCustomReports

> UsageCustomReportsResponse getMonthlyCustomReports(parameters);

Get monthly custom reports.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        Long pageSize = 56L; // Long | The number of files to return in the response `[default=60].`
        Long pageNumber = 56L; // Long | The identifier of the first page to return. This parameter is used for the pagination feature `[default=0]`.
        UsageSortDirection sortDir = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageSort sort = UsageSort.fromValue("computed_on"); // UsageSort | The field to sort by: `[computed_on, size, start_date, end_date]`.
        try {
            UsageCustomReportsResponse result = apiInstance.getMonthlyCustomReports(new UsageMeteringApi.GetMonthlyCustomReportsOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sortDir(sortDir)
                .sort(sort));
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

| Name           | Type                   | Description                                                                                                                 | Notes                                                                              |
| -------------- | ---------------------- | --------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| **pageSize**   | **Long**               | The number of files to return in the response &#x60;[default&#x3D;60].&#x60;                                                | [optional]                                                                         |
| **pageNumber** | **Long**               | The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. | [optional]                                                                         |
| **sortDir**    | **UsageSortDirection** | The direction to sort by: &#x60;[desc, asc]&#x60;.                                                                          | [optional] [default to desc] [enum: desc, asc]                                     |
| **sort**       | **UsageSort**          | The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;.                                                | [optional] [default to start_date] [enum: computed_on, size, start_date, end_date] |

### Return type

[**UsageCustomReportsResponse**](UsageCustomReportsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getMonthlyUsageAttribution

> MonthlyUsageAttributionResponse getMonthlyUsageAttribution(startMonth, fields, parameters);

Get Monthly Usage Attribution.

This API endpoint is paginated. To make sure you receive all records, check if the value of `next_record_id` is
set in the response. If it is, make another request and pass `next_record_id` as a parameter.
Pseudo code example:

```
response := GetMonthlyUsageAttribution(start_month)
cursor := response.metadata.pagination.next_record_id
WHILE cursor != null BEGIN
  sleep(5 seconds)  # Avoid running into rate limit
  response := GetMonthlyUsageAttribution(start_month, next_record_id=cursor)
  cursor := response.metadata.pagination.next_record_id
END
```

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        MonthlyUsageAttributionSupportedMetrics fields = MonthlyUsageAttributionSupportedMetrics.fromValue("api_usage"); // MonthlyUsageAttributionSupportedMetrics | Comma-separated list of usage types to return, or `*` for all usage types.
        OffsetDateTime endMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        UsageSortDirection sortDirection = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        MonthlyUsageAttributionSupportedMetrics sortName = MonthlyUsageAttributionSupportedMetrics.fromValue("api_usage"); // MonthlyUsageAttributionSupportedMetrics | The field to sort by.
        String tagBreakdownKeys = "tagBreakdownKeys_example"; // String | Comma separated list of tag keys used to group usage. If no value is provided the usage will not be broken down by tags.  To see which tags are available, look for the value of `tag_config_source` in the API response.
        String nextRecordId = "nextRecordId_example"; // String | List following results with a next_record_id provided in the previous query.
        try {
            MonthlyUsageAttributionResponse result = apiInstance.getMonthlyUsageAttribution(startMonth, fields, new UsageMeteringApi.GetMonthlyUsageAttributionOptionalParameters()
                .endMonth(endMonth)
                .sortDirection(sortDirection)
                .sortName(sortName)
                .tagBreakdownKeys(tagBreakdownKeys)
                .nextRecordId(nextRecordId));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getMonthlyUsageAttribution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type                                        | Description                                                                                                                                                                                                                        | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| -------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **startMonth**       | **OffsetDateTime**                          | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago.                                                                                             |
| **fields**           | **MonthlyUsageAttributionSupportedMetrics** | Comma-separated list of usage types to return, or &#x60;\*&#x60; for all usage types.                                                                                                                                              | [enum: api_usage, api_percentage, apm_host_usage, apm_host_percentage, browser_usage, browser_percentage, container_usage, container_percentage, custom_timeseries_usage, custom_timeseries_percentage, estimated_indexed_logs_usage, estimated_indexed_logs_percentage, fargate_usage, fargate_percentage, functions_usage, functions_percentage, indexed_logs_usage, indexed_logs_percentage, infra_host_usage, infra_host_percentage, invocations_usage, invocations_percentage, npm_host_usage, npm_host_percentage, profiled_container_usage, profiled_container_percentage, profiled_host_usage, profiled_host_percentage, snmp_usage, snmp_percentage, *]            |
| **endMonth**         | **OffsetDateTime**                          | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month.                                                                                                                             | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| **sortDirection**    | **UsageSortDirection**                      | The direction to sort by: &#x60;[desc, asc]&#x60;.                                                                                                                                                                                 | [optional] [default to desc] [enum: desc, asc]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **sortName**         | **MonthlyUsageAttributionSupportedMetrics** | The field to sort by.                                                                                                                                                                                                              | [optional] [enum: api_usage, api_percentage, apm_host_usage, apm_host_percentage, browser_usage, browser_percentage, container_usage, container_percentage, custom_timeseries_usage, custom_timeseries_percentage, estimated_indexed_logs_usage, estimated_indexed_logs_percentage, fargate_usage, fargate_percentage, functions_usage, functions_percentage, indexed_logs_usage, indexed_logs_percentage, infra_host_usage, infra_host_percentage, invocations_usage, invocations_percentage, npm_host_usage, npm_host_percentage, profiled_container_usage, profiled_container_percentage, profiled_host_usage, profiled_host_percentage, snmp_usage, snmp_percentage, *] |
| **tagBreakdownKeys** | **String**                                  | Comma separated list of tag keys used to group usage. If no value is provided the usage will not be broken down by tags. To see which tags are available, look for the value of &#x60;tag_config_source&#x60; in the API response. | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| **nextRecordId**     | **String**                                  | List following results with a next_record_id provided in the previous query.                                                                                                                                                       | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |

### Return type

[**MonthlyUsageAttributionResponse**](MonthlyUsageAttributionResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getSpecifiedDailyCustomReports

> UsageSpecifiedCustomReportsResponse getSpecifiedDailyCustomReports(reportId);

Get specified daily custom reports.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        String reportId = "reportId_example"; // String | Date of the report in the format `YYYY-MM-DD`.
        try {
            UsageSpecifiedCustomReportsResponse result = apiInstance.getSpecifiedDailyCustomReports(reportId);
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

| Name         | Type       | Description                                              | Notes |
| ------------ | ---------- | -------------------------------------------------------- | ----- |
| **reportId** | **String** | Date of the report in the format &#x60;YYYY-MM-DD&#x60;. |

### Return type

[**UsageSpecifiedCustomReportsResponse**](UsageSpecifiedCustomReportsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **404**     | Not Found                          | -                |
| **429**     | Too many requests                  | -                |

## getSpecifiedMonthlyCustomReports

> UsageSpecifiedCustomReportsResponse getSpecifiedMonthlyCustomReports(reportId);

Get specified monthly custom reports.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        String reportId = "reportId_example"; // String | Date of the report in the format `YYYY-MM-DD`.
        try {
            UsageSpecifiedCustomReportsResponse result = apiInstance.getSpecifiedMonthlyCustomReports(reportId);
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

| Name         | Type       | Description                                              | Notes |
| ------------ | ---------- | -------------------------------------------------------- | ----- |
| **reportId** | **String** | Date of the report in the format &#x60;YYYY-MM-DD&#x60;. |

### Return type

[**UsageSpecifiedCustomReportsResponse**](UsageSpecifiedCustomReportsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **404**     | Not Found                          | -                |
| **429**     | Too many requests                  | -                |

## getUsageAnalyzedLogs

> UsageAnalyzedLogsResponse getUsageAnalyzedLogs(startHr, parameters);

Get hourly usage for analyzed logs (Security Monitoring).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageAnalyzedLogsResponse result = apiInstance.getUsageAnalyzedLogs(startHr, new UsageMeteringApi.GetUsageAnalyzedLogsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageAnalyzedLogsResponse**](UsageAnalyzedLogsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageAttribution

> UsageAttributionResponse getUsageAttribution(startMonth, fields, parameters);

Get Usage Attribution.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        UsageAttributionSupportedMetrics fields = UsageAttributionSupportedMetrics.fromValue("custom_timeseries_usage"); // UsageAttributionSupportedMetrics | Comma-separated list of usage types to return, or `*` for all usage types.
        OffsetDateTime endMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        UsageSortDirection sortDirection = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageAttributionSort sortName = UsageAttributionSort.fromValue("api_percentage"); // UsageAttributionSort | The field to sort by.
        Boolean includeDescendants = false; // Boolean | Include child org usage in the response. Defaults to false.
        Long offset = 0L; // Long | Number of records to skip before beginning to return.
        Long limit = 5000L; // Long | Maximum number of records to be returned.
        try {
            UsageAttributionResponse result = apiInstance.getUsageAttribution(startMonth, fields, new UsageMeteringApi.GetUsageAttributionOptionalParameters()
                .endMonth(endMonth)
                .sortDirection(sortDirection)
                .sortName(sortName)
                .includeDescendants(includeDescendants)
                .offset(offset)
                .limit(limit));
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

| Name                   | Type                                 | Description                                                                                                                            | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| ---------------------- | ------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **startMonth**         | **OffsetDateTime**                   | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. |
| **fields**             | **UsageAttributionSupportedMetrics** | Comma-separated list of usage types to return, or &#x60;\*&#x60; for all usage types.                                                  | [enum: custom_timeseries_usage, container_usage, snmp_percentage, apm_host_usage, browser_usage, npm_host_percentage, infra_host_usage, custom_timeseries_percentage, container_percentage, api_usage, apm_host_percentage, infra_host_percentage, snmp_usage, browser_percentage, api_percentage, npm_host_usage, lambda_functions_usage, lambda_functions_percentage, lambda_invocations_usage, lambda_invocations_percentage, fargate_usage, fargate_percentage, profiled_host_usage, profiled_host_percentage, profiled_container_usage, profiled_container_percentage, dbm_hosts_usage, dbm_hosts_percentage, dbm_queries_usage, dbm_queries_percentage, estimated_indexed_logs_usage, estimated_indexed_logs_percentage, *] |
| **endMonth**           | **OffsetDateTime**                   | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month.                                 | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| **sortDirection**      | **UsageSortDirection**               | The direction to sort by: &#x60;[desc, asc]&#x60;.                                                                                     | [optional] [default to desc] [enum: desc, asc]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| **sortName**           | **UsageAttributionSort**             | The field to sort by.                                                                                                                  | [optional] [default to custom_timeseries_usage] [enum: api_percentage, snmp_usage, apm_host_usage, api_usage, container_usage, custom_timeseries_percentage, container_percentage, apm_host_percentage, npm_host_percentage, browser_percentage, browser_usage, infra_host_percentage, snmp_percentage, npm_host_usage, infra_host_usage, custom_timeseries_usage, lambda_functions_usage, lambda_functions_percentage, lambda_invocations_usage, lambda_invocations_percentage, estimated_indexed_logs_usage, estimated_indexed_logs_percentage]                                                                                                                                                                                 |
| **includeDescendants** | **Boolean**                          | Include child org usage in the response. Defaults to false.                                                                            | [optional] [default to false]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| **offset**             | **Long**                             | Number of records to skip before beginning to return.                                                                                  | [optional] [default to 0]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| **limit**              | **Long**                             | Maximum number of records to be returned.                                                                                              | [optional] [default to 5000]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |

### Return type

[**UsageAttributionResponse**](UsageAttributionResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageAuditLogs

> UsageAuditLogsResponse getUsageAuditLogs(startHr, parameters);

Get hourly usage for audit logs.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageAuditLogsResponse result = apiInstance.getUsageAuditLogs(startHr, new UsageMeteringApi.GetUsageAuditLogsOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageAuditLogs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageAuditLogsResponse**](UsageAuditLogsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageBillableSummary

> UsageBillableSummaryResponse getUsageBillableSummary(parameters);

Get billable usage across your account.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime month = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage starting this month.
        try {
            UsageBillableSummaryResponse result = apiInstance.getUsageBillableSummary(new UsageMeteringApi.GetUsageBillableSummaryOptionalParameters()
                .month(month));
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

| Name      | Type               | Description                                                                                              | Notes      |
| --------- | ------------------ | -------------------------------------------------------------------------------------------------------- | ---------- |
| **month** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage starting this month. | [optional] |

### Return type

[**UsageBillableSummaryResponse**](UsageBillableSummaryResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageCIApp

> UsageCIVisibilityResponse getUsageCIApp(startHr, parameters);

Get hourly usage for CI Visibility (Tests, Pipeline, Combo, and Spans).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageCIVisibilityResponse result = apiInstance.getUsageCIApp(startHr, new UsageMeteringApi.GetUsageCIAppOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageCIApp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageCIVisibilityResponse**](UsageCIVisibilityResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageCWS

> UsageCWSResponse getUsageCWS(startHr, parameters);

Get hourly usage for Cloud Workload Security.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageCWSResponse result = apiInstance.getUsageCWS(startHr, new UsageMeteringApi.GetUsageCWSOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageCWS");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageCWSResponse**](UsageCWSResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageCloudSecurityPostureManagement

> UsageCloudSecurityPostureManagementResponse getUsageCloudSecurityPostureManagement(startHr, parameters);

Get hourly usage for Cloud Security Posture Management (CSPM).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageCloudSecurityPostureManagementResponse result = apiInstance.getUsageCloudSecurityPostureManagement(startHr, new UsageMeteringApi.GetUsageCloudSecurityPostureManagementOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageCloudSecurityPostureManagement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageCloudSecurityPostureManagementResponse**](UsageCloudSecurityPostureManagementResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageDBM

> UsageDBMResponse getUsageDBM(startHr, parameters);

Get hourly usage for Database Monitoring

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageDBMResponse result = apiInstance.getUsageDBM(startHr, new UsageMeteringApi.GetUsageDBMOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageDBM");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageDBMResponse**](UsageDBMResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageFargate

> UsageFargateResponse getUsageFargate(startHr, parameters);

Get hourly usage for [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageFargateResponse result = apiInstance.getUsageFargate(startHr, new UsageMeteringApi.GetUsageFargateOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageFargateResponse**](UsageFargateResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageHosts

> UsageHostsResponse getUsageHosts(startHr, parameters);

Get hourly usage for hosts and containers.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageHostsResponse result = apiInstance.getUsageHosts(startHr, new UsageMeteringApi.GetUsageHostsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageHostsResponse**](UsageHostsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageIndexedSpans

> UsageIndexedSpansResponse getUsageIndexedSpans(startHr, parameters);

Get hourly usage for indexed spans.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIndexedSpansResponse result = apiInstance.getUsageIndexedSpans(startHr, new UsageMeteringApi.GetUsageIndexedSpansOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageIndexedSpansResponse**](UsageIndexedSpansResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageInternetOfThings

> UsageIoTResponse getUsageInternetOfThings(startHr, parameters);

Get hourly usage for IoT.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageIoTResponse result = apiInstance.getUsageInternetOfThings(startHr, new UsageMeteringApi.GetUsageInternetOfThingsOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageInternetOfThings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageIoTResponse**](UsageIoTResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageLambda

> UsageLambdaResponse getUsageLambda(startHr, parameters);

Get hourly usage for lambda.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageLambdaResponse result = apiInstance.getUsageLambda(startHr, new UsageMeteringApi.GetUsageLambdaOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageLambdaResponse**](UsageLambdaResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageLogs

> UsageLogsResponse getUsageLogs(startHr, parameters);

Get hourly usage for logs.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageLogsResponse result = apiInstance.getUsageLogs(startHr, new UsageMeteringApi.GetUsageLogsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageLogsResponse**](UsageLogsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageLogsByIndex

> UsageLogsByIndexResponse getUsageLogsByIndex(startHr, parameters);

Get hourly usage for logs by index.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        List<String> indexName = Arrays.asList(); // List<String> | Comma-separated list of log index names.
        try {
            UsageLogsByIndexResponse result = apiInstance.getUsageLogsByIndex(startHr, new UsageMeteringApi.GetUsageLogsByIndexOptionalParameters()
                .endHr(endHr)
                .indexName(indexName));
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

| Name          | Type                   | Description                                                                                               | Notes      |
| ------------- | ---------------------- | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr**   | **OffsetDateTime**     | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**     | **OffsetDateTime**     | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |
| **indexName** | **List&lt;String&gt;** | Comma-separated list of log index names.                                                                  | [optional] |

### Return type

[**UsageLogsByIndexResponse**](UsageLogsByIndexResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageLogsByRetention

> UsageLogsByRetentionResponse getUsageLogsByRetention(startHr, parameters);

Get hourly usage for indexed logs by retention period.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageLogsByRetentionResponse result = apiInstance.getUsageLogsByRetention(startHr, new UsageMeteringApi.GetUsageLogsByRetentionOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageLogsByRetention");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageLogsByRetentionResponse**](UsageLogsByRetentionResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageNetworkFlows

> UsageNetworkFlowsResponse getUsageNetworkFlows(startHr, parameters);

Get hourly usage for network flows.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageNetworkFlowsResponse result = apiInstance.getUsageNetworkFlows(startHr, new UsageMeteringApi.GetUsageNetworkFlowsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageNetworkFlowsResponse**](UsageNetworkFlowsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageNetworkHosts

> UsageNetworkHostsResponse getUsageNetworkHosts(startHr, parameters);

Get hourly usage for network hosts.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageNetworkHostsResponse result = apiInstance.getUsageNetworkHosts(startHr, new UsageMeteringApi.GetUsageNetworkHostsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageNetworkHostsResponse**](UsageNetworkHostsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageOnlineArchive

> UsageOnlineArchiveResponse getUsageOnlineArchive(startHr, parameters);

Get hourly usage for Online Archive.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageOnlineArchiveResponse result = apiInstance.getUsageOnlineArchive(startHr, new UsageMeteringApi.GetUsageOnlineArchiveOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageOnlineArchive");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageOnlineArchiveResponse**](UsageOnlineArchiveResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageProfiling

> UsageProfilingResponse getUsageProfiling(startHr, parameters);

Get hourly usage for profiled hosts.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageProfilingResponse result = apiInstance.getUsageProfiling(startHr, new UsageMeteringApi.GetUsageProfilingOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageProfilingResponse**](UsageProfilingResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageRumSessions

> UsageRumSessionsResponse getUsageRumSessions(startHr, parameters);

Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        String type = "type_example"; // String | RUM type: `[browser, mobile]`. Defaults to `browser`.
        try {
            UsageRumSessionsResponse result = apiInstance.getUsageRumSessions(startHr, new UsageMeteringApi.GetUsageRumSessionsOptionalParameters()
                .endHr(endHr)
                .type(type));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |
| **type**    | **String**         | RUM type: &#x60;[browser, mobile]&#x60;. Defaults to &#x60;browser&#x60;.                                 | [optional] |

### Return type

[**UsageRumSessionsResponse**](UsageRumSessionsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageRumUnits

> UsageRumUnitsResponse getUsageRumUnits(startHr, parameters);

Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Units.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageRumUnitsResponse result = apiInstance.getUsageRumUnits(startHr, new UsageMeteringApi.GetUsageRumUnitsOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageRumUnits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageRumUnitsResponse**](UsageRumUnitsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSDS

> UsageSDSResponse getUsageSDS(startHr, parameters);

Get hourly usage for Sensitive Data Scanner.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageSDSResponse result = apiInstance.getUsageSDS(startHr, new UsageMeteringApi.GetUsageSDSOptionalParameters()
                .endHr(endHr));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageSDS");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageSDSResponse**](UsageSDSResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSNMP

> UsageSNMPResponse getUsageSNMP(startHr, parameters);

Get hourly usage for SNMP devices.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: `[YYYY-MM-DDThh]` for usage ending **before** this hour.
        try {
            UsageSNMPResponse result = apiInstance.getUsageSNMP(startHr, new UsageMeteringApi.GetUsageSNMPOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                                           | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. | [optional] |

### Return type

[**UsageSNMPResponse**](UsageSNMPResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSummary

> UsageSummaryResponse getUsageSummary(startMonth, parameters);

Get usage across your multi-org account. You must have the multi-org feature enabled.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        OffsetDateTime endMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        Boolean includeOrgDetails = true; // Boolean | Include usage summaries for each sub-org.
        try {
            UsageSummaryResponse result = apiInstance.getUsageSummary(startMonth, new UsageMeteringApi.GetUsageSummaryOptionalParameters()
                .endMonth(endMonth)
                .includeOrgDetails(includeOrgDetails));
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

| Name                  | Type               | Description                                                                                                                            | Notes      |
| --------------------- | ------------------ | -------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startMonth**        | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. |
| **endMonth**          | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month.                                 | [optional] |
| **includeOrgDetails** | **Boolean**        | Include usage summaries for each sub-org.                                                                                              | [optional] |

### Return type

[**UsageSummaryResponse**](UsageSummaryResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSynthetics

> UsageSyntheticsResponse getUsageSynthetics(startHr, parameters);

Get hourly usage for [Synthetics checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsResponse result = apiInstance.getUsageSynthetics(startHr, new UsageMeteringApi.GetUsageSyntheticsOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageSyntheticsResponse**](UsageSyntheticsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSyntheticsAPI

> UsageSyntheticsAPIResponse getUsageSyntheticsAPI(startHr, parameters);

Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsAPIResponse result = apiInstance.getUsageSyntheticsAPI(startHr, new UsageMeteringApi.GetUsageSyntheticsAPIOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageSyntheticsAPIResponse**](UsageSyntheticsAPIResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageSyntheticsBrowser

> UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(startHr, parameters);

Get hourly usage for synthetics browser checks.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageSyntheticsBrowserResponse result = apiInstance.getUsageSyntheticsBrowser(startHr, new UsageMeteringApi.GetUsageSyntheticsBrowserOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageSyntheticsBrowserResponse**](UsageSyntheticsBrowserResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageTimeseries

> UsageTimeseriesResponse getUsageTimeseries(startHr, parameters);

Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        try {
            UsageTimeseriesResponse result = apiInstance.getUsageTimeseries(startHr, new UsageMeteringApi.GetUsageTimeseriesOptionalParameters()
                .endHr(endHr));
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

| Name        | Type               | Description                                                                                               | Notes      |
| ----------- | ------------------ | --------------------------------------------------------------------------------------------------------- | ---------- |
| **startHr** | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.      |
| **endHr**   | **OffsetDateTime** | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. | [optional] |

### Return type

[**UsageTimeseriesResponse**](UsageTimeseriesResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |

## getUsageTopAvgMetrics

> UsageTopAvgMetricsResponse getUsageTopAvgMetrics(parameters);

Get all [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. Use the month parameter to get a month-to-date data resolution or use the day parameter to get a daily resolution. One of the two is required, and only one of the two is allowed.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime month = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (Either month or day should be specified, but not both)
        OffsetDateTime day = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to day: [YYYY-MM-DD] for usage beginning at this hour. (Either month or day should be specified, but not both)
        List<String> names = Arrays.asList(); // List<String> | Comma-separated list of metric names.
        Integer limit = 500; // Integer | Maximum number of results to return (between 1 and 5000) - defaults to 500 results if limit not specified.
        String nextRecordId = "nextRecordId_example"; // String | List following results with a next_record_id provided in the previous query.
        try {
            UsageTopAvgMetricsResponse result = apiInstance.getUsageTopAvgMetrics(new UsageMeteringApi.GetUsageTopAvgMetricsOptionalParameters()
                .month(month)
                .day(day)
                .names(names)
                .limit(limit)
                .nextRecordId(nextRecordId));
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

| Name             | Type                   | Description                                                                                                                                              | Notes                       |
| ---------------- | ---------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------- |
| **month**        | **OffsetDateTime**     | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (Either month or day should be specified, but not both)  | [optional]                  |
| **day**          | **OffsetDateTime**     | Datetime in ISO-8601 format, UTC, precise to day: [YYYY-MM-DD] for usage beginning at this hour. (Either month or day should be specified, but not both) | [optional]                  |
| **names**        | **List&lt;String&gt;** | Comma-separated list of metric names.                                                                                                                    | [optional]                  |
| **limit**        | **Integer**            | Maximum number of results to return (between 1 and 5000) - defaults to 500 results if limit not specified.                                               | [optional] [default to 500] |
| **nextRecordId** | **String**             | List following results with a next_record_id provided in the previous query.                                                                             | [optional]                  |

### Return type

[**UsageTopAvgMetricsResponse**](UsageTopAvgMetricsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details

| Status code | Description                        | Response headers |
| ----------- | ---------------------------------- | ---------------- |
| **200**     | OK                                 | -                |
| **400**     | Bad Request                        | -                |
| **403**     | Forbidden - User is not authorized | -                |
| **429**     | Too many requests                  | -                |
