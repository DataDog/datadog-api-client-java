# AwsLogsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**checkAWSLogsLambdaAsync**](AwsLogsIntegrationApi.md#checkAWSLogsLambdaAsync) | **POST** /api/v1/integration/aws/logs/check_async | Check that an AWS Lambda Function exists
[**checkAWSLogsServicesAsync**](AwsLogsIntegrationApi.md#checkAWSLogsServicesAsync) | **POST** /api/v1/integration/aws/logs/services_async | Check permissions for log services
[**createAWSLambdaARN**](AwsLogsIntegrationApi.md#createAWSLambdaARN) | **POST** /api/v1/integration/aws/logs | Add AWS Log Lambda ARN
[**deleteAWSLambdaARN**](AwsLogsIntegrationApi.md#deleteAWSLambdaARN) | **DELETE** /api/v1/integration/aws/logs | Delete an AWS Logs integration
[**enableAWSLogServices**](AwsLogsIntegrationApi.md#enableAWSLogServices) | **POST** /api/v1/integration/aws/logs/services | Enable an AWS Logs integration
[**listAWSLogsIntegrations**](AwsLogsIntegrationApi.md#listAWSLogsIntegrations) | **GET** /api/v1/integration/aws/logs | List all AWS Logs integrations
[**listAWSLogsServices**](AwsLogsIntegrationApi.md#listAWSLogsServices) | **GET** /api/v1/integration/aws/logs/services | Get list of AWS log ready services



## checkAWSLogsLambdaAsync

> AWSLogsAsyncResponse checkAWSLogsLambdaAsync(body);

Test if permissions are present to add a log-forwarding triggers for the given services and AWS account. The input
is the same as for Enable an AWS service log collection. Subsequent requests will always repeat the above, so this
endpoint can be polled intermittently instead of blocking.

- Returns a status of 'created' when it's checking if the Lambda exists in the account.
- Returns a status of 'waiting' while checking.
- Returns a status of 'checked and ok' if the Lambda exists.
- Returns a status of 'error' if the Lambda does not exist.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Check AWS Log Lambda Async request body.
        try {
            AWSLogsAsyncResponse result = apiInstance.checkAWSLogsLambdaAsync(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#checkAWSLogsLambdaAsync");
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
 **body** | [**AWSAccountAndLambdaRequest**](AWSAccountAndLambdaRequest.md)| Check AWS Log Lambda Async request body. |

### Return type

[**AWSLogsAsyncResponse**](AWSLogsAsyncResponse.md)

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
| **403** | Authentication Error |  -  |


## checkAWSLogsServicesAsync

> AWSLogsAsyncResponse checkAWSLogsServicesAsync(body);

Test if permissions are present to add log-forwarding triggers for the
given services and AWS account. Input is the same as for `EnableAWSLogServices`.
Done async, so can be repeatedly polled in a non-blocking fashion until
the async request completes.

- Returns a status of `created` when it's checking if the permissions exists
  in the AWS account.
- Returns a status of `waiting` while checking.
- Returns a status of `checked and ok` if the Lambda exists.
- Returns a status of `error` if the Lambda does not exist.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSLogsServicesRequest body = new AWSLogsServicesRequest(); // AWSLogsServicesRequest | Check AWS Logs Async Services request body.
        try {
            AWSLogsAsyncResponse result = apiInstance.checkAWSLogsServicesAsync(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#checkAWSLogsServicesAsync");
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
 **body** | [**AWSLogsServicesRequest**](AWSLogsServicesRequest.md)| Check AWS Logs Async Services request body. |

### Return type

[**AWSLogsAsyncResponse**](AWSLogsAsyncResponse.md)

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
| **403** | Authentication Error |  -  |


## createAWSLambdaARN

> Object createAWSLambdaARN(body);

Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS account ID to enable log collection.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | AWS Log Lambda Async request body.
        try {
            Object result = apiInstance.createAWSLambdaARN(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#createAWSLambdaARN");
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
 **body** | [**AWSAccountAndLambdaRequest**](AWSAccountAndLambdaRequest.md)| AWS Log Lambda Async request body. |

### Return type

**Object**

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
| **403** | Authentication Error |  -  |


## deleteAWSLambdaARN

> Object deleteAWSLambdaARN(body);

Delete a Datadog-AWS logs configuration by removing the specific Lambda ARN associated with a given AWS account.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Delete AWS Lambda ARN request body.
        try {
            Object result = apiInstance.deleteAWSLambdaARN(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#deleteAWSLambdaARN");
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
 **body** | [**AWSAccountAndLambdaRequest**](AWSAccountAndLambdaRequest.md)| Delete AWS Lambda ARN request body. |

### Return type

**Object**

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
| **403** | Authentication Error |  -  |


## enableAWSLogServices

> Object enableAWSLogServices(body);

Enable automatic log collection for a list of services. This should be run after running `CreateAWSLambdaARN` to save the configuration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSLogsServicesRequest body = new AWSLogsServicesRequest(); // AWSLogsServicesRequest | Enable AWS Log Services request body.
        try {
            Object result = apiInstance.enableAWSLogServices(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#enableAWSLogServices");
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
 **body** | [**AWSLogsServicesRequest**](AWSLogsServicesRequest.md)| Enable AWS Log Services request body. |

### Return type

**Object**

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
| **403** | Authentication Error |  -  |


## listAWSLogsIntegrations

> List&lt;AWSLogsListResponse&gt; listAWSLogsIntegrations();

List all Datadog-AWS Logs integrations configured in your Datadog account.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        try {
            List<AWSLogsListResponse> result = apiInstance.listAWSLogsIntegrations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#listAWSLogsIntegrations");
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

[**List&lt;AWSLogsListResponse&gt;**](AWSLogsListResponse.md)

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
| **403** | Authentication Error |  -  |


## listAWSLogsServices

> List&lt;AWSLogsListServicesResponse&gt; listAWSLogsServices();

Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        try {
            List<AWSLogsListServicesResponse> result = apiInstance.listAWSLogsServices();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#listAWSLogsServices");
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

[**List&lt;AWSLogsListServicesResponse&gt;**](AWSLogsListServicesResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication Error |  -  |

