# LogsPipelinesApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLogsPipeline**](LogsPipelinesApi.md#createLogsPipeline) | **POST** /api/v1/logs/config/pipelines | Create a pipeline in your organization.
[**deleteLogsPipeline**](LogsPipelinesApi.md#deleteLogsPipeline) | **DELETE** /api/v1/logs/config/pipelines/{pipeline_id} | Delete a given pipeline from your organization.
[**getAllLogsPipelines**](LogsPipelinesApi.md#getAllLogsPipelines) | **GET** /api/v1/logs/config/pipelines | Get all pipelines from your organization.
[**getLogsPipeline**](LogsPipelinesApi.md#getLogsPipeline) | **GET** /api/v1/logs/config/pipelines/{pipeline_id} | Get a specific pipeline from your organization.
[**getLogsPipelineOrder**](LogsPipelinesApi.md#getLogsPipelineOrder) | **GET** /api/v1/logs/config/pipeline-order | Get the current order of your pipelines.
[**updateLogsPipeline**](LogsPipelinesApi.md#updateLogsPipeline) | **PUT** /api/v1/logs/config/pipelines/{pipeline_id} | Update a pipeline in your organization.
[**updateLogsPipelineOrder**](LogsPipelinesApi.md#updateLogsPipelineOrder) | **PUT** /api/v1/logs/config/pipeline-order | Update the order of your pipelines.



## createLogsPipeline

> LogsPipeline createLogsPipeline().body(body).execute();

Create a pipeline in your organization.

## Overview
Create a Pipeline in your organization.
## Arguments
- **`name`** [*required*]: Your pipeline name.
- **`is_enabled`** [*optional*, default=`False`]: Boolean value to enable your pipeline.
- **`filter.query`** [*optional*]: Defines your pipeline filter. Only logs that match the filter criteria are processed by this pipeline.
- **`processors`** [*optional*]: Ordered array of processors or nested pipelines.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        LogsPipeline body = new LogsPipeline(); // LogsPipeline | Definition of the new pipeline
        try {
            LogsPipeline result = api.createLogsPipeline()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#createLogsPipeline");
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
 **body** | [**LogsPipeline**](LogsPipeline.md)| Definition of the new pipeline |

### Return type

[**LogsPipeline**](LogsPipeline.md)

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
| **422** | Unprocessable Entity |  -  |


## deleteLogsPipeline

> deleteLogsPipeline(pipelineId).execute();

Delete a given pipeline from your organization.

## Overview
Delete a given pipeline from your organization.
## Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to delete
        try {
            api.deleteLogsPipeline(pipelineId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#deleteLogsPipeline");
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
 **pipelineId** | **String**| ID of the pipeline to delete |

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## getAllLogsPipelines

> List&lt;LogsPipeline&gt; getAllLogsPipelines().execute();

Get all pipelines from your organization.

## Overview
Get all pipelines from your organization.
## Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        try {
            List<LogsPipeline> result = api.getAllLogsPipelines()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#getAllLogsPipelines");
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

[**List&lt;LogsPipeline&gt;**](LogsPipeline.md)

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


## getLogsPipeline

> LogsPipeline getLogsPipeline(pipelineId).execute();

Get a specific pipeline from your organization.

## Overview
Get a specific pipeline from your organization.
## Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to get
        try {
            LogsPipeline result = api.getLogsPipeline(pipelineId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#getLogsPipeline");
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
 **pipelineId** | **String**| ID of the pipeline to get |

### Return type

[**LogsPipeline**](LogsPipeline.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## getLogsPipelineOrder

> LogsPipelinesOrder getLogsPipelineOrder().execute();

Get the current order of your pipelines.

## Overview
Get the current order of your pipelines.
## Arguments
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        try {
            LogsPipelinesOrder result = api.getLogsPipelineOrder()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#getLogsPipelineOrder");
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

[**LogsPipelinesOrder**](LogsPipelinesOrder.md)

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


## updateLogsPipeline

> LogsPipeline updateLogsPipeline(pipelineId).body(body).execute();

Update a pipeline in your organization.

## Overview
Update a given pipeline configuration to change it’s processors or their order.
## Arguments
**Note**: Using this method updates your pipeline configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
- **`name`** [*required*]: Your pipeline name.
- **`is_enabled`** [*optional*, default=`False`]: Boolean value to enable your pipeline.
- **`filter.query`** [*optional*]: Defines your pipeline filter. Only logs that match the filter criteria are processed by this pipeline.
- **`processors`** [*optional*]: Ordered array of processors or nested pipelines.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to delete
        LogsPipeline body = new LogsPipeline(); // LogsPipeline | New definition of the pipeline
        try {
            LogsPipeline result = api.updateLogsPipeline(pipelineId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#updateLogsPipeline");
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
 **pipelineId** | **String**| ID of the pipeline to delete |
 **body** | [**LogsPipeline**](LogsPipeline.md)| New definition of the pipeline |

### Return type

[**LogsPipeline**](LogsPipeline.md)

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
| **422** | Unprocessable Entity |  -  |


## updateLogsPipelineOrder

> LogsPipelinesOrder updateLogsPipelineOrder().body(body).execute();

Update the order of your pipelines.

## Overview
Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change the structure and content of the data processed by other pipelines and their processors.
**Note**: Using the PUT method updates your pipeline order by replacing your current order with the new one sent to your Datadog organization.
## Arguments
- **`pipeline_ids`** [*required*]: Ordered Array of <PIPELINE_ID> strings, the order of pipeline IDs in the array define the overall Pipelines order for Datadog.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

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

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        LogsPipelinesOrder body = new LogsPipelinesOrder(); // LogsPipelinesOrder | Object containing the new ordered list of pipeline IDs
        try {
            LogsPipelinesOrder result = api.updateLogsPipelineOrder()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#updateLogsPipelineOrder");
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
 **body** | [**LogsPipelinesOrder**](LogsPipelinesOrder.md)| Object containing the new ordered list of pipeline IDs | [optional]

### Return type

[**LogsPipelinesOrder**](LogsPipelinesOrder.md)

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
| **422** | Unprocessable Entity |  -  |

