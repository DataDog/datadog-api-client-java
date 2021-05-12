# LogsPipelinesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createLogsPipeline**](LogsPipelinesApi.md#createLogsPipeline) | **POST** /api/v1/logs/config/pipelines | Create a pipeline
[**deleteLogsPipeline**](LogsPipelinesApi.md#deleteLogsPipeline) | **DELETE** /api/v1/logs/config/pipelines/{pipeline_id} | Delete a pipeline
[**getLogsPipeline**](LogsPipelinesApi.md#getLogsPipeline) | **GET** /api/v1/logs/config/pipelines/{pipeline_id} | Get a pipeline
[**getLogsPipelineOrder**](LogsPipelinesApi.md#getLogsPipelineOrder) | **GET** /api/v1/logs/config/pipeline-order | Get pipeline order
[**listLogsPipelines**](LogsPipelinesApi.md#listLogsPipelines) | **GET** /api/v1/logs/config/pipelines | Get all pipelines
[**updateLogsPipeline**](LogsPipelinesApi.md#updateLogsPipeline) | **PUT** /api/v1/logs/config/pipelines/{pipeline_id} | Update a pipeline
[**updateLogsPipelineOrder**](LogsPipelinesApi.md#updateLogsPipelineOrder) | **PUT** /api/v1/logs/config/pipeline-order | Update pipeline order



## createLogsPipeline

> LogsPipeline createLogsPipeline(body);

Create a pipeline in your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        LogsPipeline body = new LogsPipeline(); // LogsPipeline | Definition of the new pipeline.
        try {
            LogsPipeline result = apiInstance.createLogsPipeline(body);
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
 **body** | [**LogsPipeline**](LogsPipeline.md)| Definition of the new pipeline. |

### Return type

[**LogsPipeline**](LogsPipeline.md)

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
| **403** | Forbidden |  -  |


## deleteLogsPipeline

> deleteLogsPipeline(pipelineId);

Delete a given pipeline from your organization.
This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to delete.
        try {
            apiInstance.deleteLogsPipeline(pipelineId);
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
 **pipelineId** | **String**| ID of the pipeline to delete. |

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## getLogsPipeline

> LogsPipeline getLogsPipeline(pipelineId);

Get a specific pipeline from your organization.
This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to get.
        try {
            LogsPipeline result = apiInstance.getLogsPipeline(pipelineId);
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
 **pipelineId** | **String**| ID of the pipeline to get. |

### Return type

[**LogsPipeline**](LogsPipeline.md)

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
| **403** | Forbidden |  -  |


## getLogsPipelineOrder

> LogsPipelinesOrder getLogsPipelineOrder();

Get the current order of your pipelines.
This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        try {
            LogsPipelinesOrder result = apiInstance.getLogsPipelineOrder();
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## listLogsPipelines

> List&lt;LogsPipeline&gt; listLogsPipelines();

Get all pipelines from your organization.
This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        try {
            List<LogsPipeline> result = apiInstance.listLogsPipelines();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#listLogsPipelines");
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |


## updateLogsPipeline

> LogsPipeline updateLogsPipeline(pipelineId, body);

Update a given pipeline configuration to change it’s processors or their order.

**Note**: Using this method updates your pipeline configuration by **replacing**
your current configuration with the new one sent to your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to delete.
        LogsPipeline body = new LogsPipeline(); // LogsPipeline | New definition of the pipeline.
        try {
            LogsPipeline result = apiInstance.updateLogsPipeline(pipelineId, body);
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
 **pipelineId** | **String**| ID of the pipeline to delete. |
 **body** | [**LogsPipeline**](LogsPipeline.md)| New definition of the pipeline. |

### Return type

[**LogsPipeline**](LogsPipeline.md)

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
| **403** | Forbidden |  -  |


## updateLogsPipelineOrder

> LogsPipelinesOrder updateLogsPipelineOrder(body);

Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change
the structure and content of the data processed by other pipelines and their processors.

**Note**: Using the `PUT` method updates your pipeline order by replacing your current order
with the new one sent to your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        LogsPipelinesOrder body = new LogsPipelinesOrder(); // LogsPipelinesOrder | Object containing the new ordered list of pipeline IDs.
        try {
            LogsPipelinesOrder result = apiInstance.updateLogsPipelineOrder(body);
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
 **body** | [**LogsPipelinesOrder**](LogsPipelinesOrder.md)| Object containing the new ordered list of pipeline IDs. |

### Return type

[**LogsPipelinesOrder**](LogsPipelinesOrder.md)

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
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |

