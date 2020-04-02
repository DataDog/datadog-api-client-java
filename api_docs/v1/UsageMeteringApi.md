# UsageMeteringApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageFargate**](UsageMeteringApi.md#getUsageFargate) | **GET** /api/v1/usage/fargate | Get hourly usage for Fargate
[**getUsageHosts**](UsageMeteringApi.md#getUsageHosts) | **GET** /api/v1/usage/hosts | Get hourly usage for hosts and containers
[**getUsageLambda**](UsageMeteringApi.md#getUsageLambda) | **GET** /api/v1/usage/aws_lambda | Get hourly usage for Lambda
[**getUsageLogs**](UsageMeteringApi.md#getUsageLogs) | **GET** /api/v1/usage/logs | Get hourly usage for Logs
[**getUsageLogsByIndex**](UsageMeteringApi.md#getUsageLogsByIndex) | **GET** /api/v1/usage/logs_by_index | Get hourly usage for Logs by Index
[**getUsageNetworkFlows**](UsageMeteringApi.md#getUsageNetworkFlows) | **GET** /api/v1/usage/network_flows | Get hourly usage for Network Flows
[**getUsageNetworkHosts**](UsageMeteringApi.md#getUsageNetworkHosts) | **GET** /api/v1/usage/network_hosts | Get hourly usage for Network Hosts
[**getUsageRumSessions**](UsageMeteringApi.md#getUsageRumSessions) | **GET** /api/v1/usage/rum_sessions | Get hourly usage for RUM Sessions
[**getUsageSummary**](UsageMeteringApi.md#getUsageSummary) | **GET** /api/v1/usage/summary | Get usage across your multi-org account
[**getUsageSynthetics**](UsageMeteringApi.md#getUsageSynthetics) | **GET** /api/v1/usage/synthetics | Get hourly usage for Synthetics API Checks
[**getUsageSyntheticsAPI**](UsageMeteringApi.md#getUsageSyntheticsAPI) | **GET** /api/v1/usage/synthetics_api | Get hourly usage for Synthetics API Checks
[**getUsageSyntheticsBrowser**](UsageMeteringApi.md#getUsageSyntheticsBrowser) | **GET** /api/v1/usage/synthetics_browser | Get hourly usage for Synthetics Browser Checks
[**getUsageTimeseries**](UsageMeteringApi.md#getUsageTimeseries) | **GET** /api/v1/usage/timeseries | Get hourly usage for custom metrics
[**getUsageTopAvgMetrics**](UsageMeteringApi.md#getUsageTopAvgMetrics) | **GET** /api/v1/usage/top_avg_metrics | Get top 500 custom metrics by hourly average
[**getUsageTrace**](UsageMeteringApi.md#getUsageTrace) | **GET** /api/v1/usage/traces | Get hourly usage for Trace Search



## getUsageFargate

> UsageFargateResponse getUsageFargate().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Fargate

Get hourly usage for [fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageFargateResponse result = api.getUsageFargate()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageFargateResponse**](UsageFargateResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageHosts

> UsageHostsResponse getUsageHosts().startHr(startHr).endHr(endHr).execute();

Get hourly usage for hosts and containers

Get hourly usage for hosts and containers.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageHostsResponse result = api.getUsageHosts()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageHostsResponse**](UsageHostsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageLambda

> UsageLambdaResponse getUsageLambda().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Lambda

Get hourly usage for lambda.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageLambdaResponse result = api.getUsageLambda()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageLambdaResponse**](UsageLambdaResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageLogs

> UsageLogsResponse getUsageLogs().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Logs

Get hourly usage for logs.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageLogsResponse result = api.getUsageLogs()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageLogsResponse**](UsageLogsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageLogsByIndex

> UsageLogsByIndexResponse getUsageLogsByIndex().startHr(startHr).endHr(endHr).indexName(indexName).execute();

Get hourly usage for Logs by Index

Get hourly usage for logs by index.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        List<String> indexName = Arrays.asList(); // List<String> | Comma-separated list of log index names.
        try {
            UsageLogsByIndexResponse result = api.getUsageLogsByIndex()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]
 **indexName** | [**List&lt;String&gt;**](String.md)| Comma-separated list of log index names. | [optional]

### Return type

[**UsageLogsByIndexResponse**](UsageLogsByIndexResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageNetworkFlows

> UsageNetworkFlowsResponse getUsageNetworkFlows().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Network Flows

Get hourly usage for network flows.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageNetworkFlowsResponse result = api.getUsageNetworkFlows()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageNetworkFlowsResponse**](UsageNetworkFlowsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageNetworkHosts

> UsageNetworkHostsResponse getUsageNetworkHosts().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Network Hosts

Get hourly usage for network hosts.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageNetworkHostsResponse result = api.getUsageNetworkHosts()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageNetworkHostsResponse**](UsageNetworkHostsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageRumSessions

> UsageRumSessionsResponse getUsageRumSessions().startHr(startHr).endHr(endHr).execute();

Get hourly usage for RUM Sessions

Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageRumSessionsResponse result = api.getUsageRumSessions()
                .startHr(startHr)
                .endHr(endHr)
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageRumSessionsResponse**](UsageRumSessionsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageSummary

> UsageSummaryResponse getUsageSummary().startMonth(startMonth).endMonth(endMonth).includeOrgDetails(includeOrgDetails).execute();

Get usage across your multi-org account

Get usage across your multi-org account.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning in this month. Maximum of 15 months ago.
        OffsetDateTime endMonth = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage ending this month.
        Boolean includeOrgDetails = true; // Boolean | Include usage summaries for each sub-org.
        try {
            UsageSummaryResponse result = api.getUsageSummary()
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
 **startMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning in this month. Maximum of 15 months ago. |
 **endMonth** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage ending this month. | [optional]
 **includeOrgDetails** | **Boolean**| Include usage summaries for each sub-org. | [optional]

### Return type

[**UsageSummaryResponse**](UsageSummaryResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageSynthetics

> UsageSyntheticsResponse getUsageSynthetics().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics API Checks

Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageSyntheticsResponse result = api.getUsageSynthetics()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageSyntheticsResponse**](UsageSyntheticsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageSyntheticsAPI

> UsageSyntheticsAPIResponse getUsageSyntheticsAPI().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics API Checks

Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageSyntheticsAPIResponse result = api.getUsageSyntheticsAPI()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageSyntheticsAPIResponse**](UsageSyntheticsAPIResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageSyntheticsBrowser

> UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Synthetics Browser Checks

Get hourly usage for synthetics browser checks.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageSyntheticsBrowserResponse result = api.getUsageSyntheticsBrowser()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageSyntheticsBrowserResponse**](UsageSyntheticsBrowserResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageTimeseries

> UsageTimeseriesResponse getUsageTimeseries().startHr(startHr).endHr(endHr).execute();

Get hourly usage for custom metrics

Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageTimeseriesResponse result = api.getUsageTimeseries()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageTimeseriesResponse**](UsageTimeseriesResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageTopAvgMetrics

> UsageTopAvgMetricsResponse getUsageTopAvgMetrics().month(month).names(names).execute();

Get top 500 custom metrics by hourly average

Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime month = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour.
        List<String> names = Arrays.asList(); // List<String> | Comma-separated list of metric names.
        try {
            UsageTopAvgMetricsResponse result = api.getUsageTopAvgMetrics()
                .month(month)
                .names(names)
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
 **names** | [**List&lt;String&gt;**](String.md)| Comma-separated list of metric names. | [optional]

### Return type

[**UsageTopAvgMetricsResponse**](UsageTopAvgMetricsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getUsageTrace

> UsageTraceResponse getUsageTrace().startHr(startHr).endHr(endHr).execute();

Get hourly usage for Trace Search

Get hourly usage for trace search.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

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

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour
        OffsetDateTime endHr = new OffsetDateTime(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
        try {
            UsageTraceResponse result = api.getUsageTrace()
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
 **startHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour |
 **endHr** | **OffsetDateTime**| Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour | [optional]

### Return type

[**UsageTraceResponse**](UsageTraceResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;datetime-format=rfc3339

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

