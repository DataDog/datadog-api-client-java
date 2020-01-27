# AwsLogsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aWSLogsCheckLambdaAsync**](AwsLogsIntegrationApi.md#aWSLogsCheckLambdaAsync) | **POST** /api/v1/integration/aws/logs/check_async | Check function to see if a lambda_arn exists within an account.
[**aWSLogsCheckServicesAsync**](AwsLogsIntegrationApi.md#aWSLogsCheckServicesAsync) | **POST** /api/v1/integration/aws/logs/services_async | Asynchronous check for permissions for AWS log lambda config.
[**aWSLogsList**](AwsLogsIntegrationApi.md#aWSLogsList) | **GET** /api/v1/integration/aws/logs | List configured AWS log integrations.
[**aWSLogsServicesList**](AwsLogsIntegrationApi.md#aWSLogsServicesList) | **GET** /api/v1/integration/aws/logs/services | Get list of AWS log ready services.
[**addAWSLambdaARN**](AwsLogsIntegrationApi.md#addAWSLambdaARN) | **POST** /api/v1/integration/aws/logs | Add a AWS Lambda ARN to your Datadog account.
[**deleteAWSLambdaARN**](AwsLogsIntegrationApi.md#deleteAWSLambdaARN) | **DELETE** /api/v1/integration/aws/logs | Delete a AWS Lambda ARN from your Datadog account.
[**enableAWSLogServices**](AwsLogsIntegrationApi.md#enableAWSLogServices) | **POST** /api/v1/integration/aws/logs/services | Enable Automatic Log collection for your AWS services.



## aWSLogsCheckLambdaAsync

> AWSLogsAsyncResponse aWSLogsCheckLambdaAsync().body(body).execute();

Check function to see if a lambda_arn exists within an account.

### Overview
Check function to see if a lambda_arn exists within an account. This sends a job on our side if it does not exist, then immediately returns the status of that job. Subsequent requests will always repeat the above, so this endpoint can be polled intermittently instead of blocking.
- Returns a status of 'created' when it's checking if the Lambda exists in the account.
- Returns a status of 'waiting' while checking.
- Returns a status of 'checked and ok' if the Lambda exists.
- Returns a status of 'error' if the Lambda does not exist.
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Your AWS Account ID without dashes.
* **`lambda_arn`** [*required*, *default* = **None**]: ARN of the Lambda to be checked.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Check AWS Log Lambda Async request body.
        try {
            AWSLogsAsyncResponse result = api.aWSLogsCheckLambdaAsync()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#aWSLogsCheckLambdaAsync");
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


## aWSLogsCheckServicesAsync

> AWSLogsAsyncResponse aWSLogsCheckServicesAsync().body(body).execute();

Asynchronous check for permissions for AWS log lambda config.

### Overview
Test if permissions are present to add log-forwarding triggers for the given services + AWS account. Input is the same as for EnableAWSLogServices. Done async, so can be repeatedly polled in a non-blocking fashion until the async request completes
- Returns a status of 'created' when it's checking if the permissions exists in the AWS account.
- Returns a status of 'waiting' while checking.
- Returns a status of 'checked and ok' if the Lambda exists.
- Returns a status of 'error' if the Lambda does not exist.
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Your AWS Account ID without dashes.
* **`services`** [*required*, *default* = **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSLogsServicesRequest body = new AWSLogsServicesRequest(); // AWSLogsServicesRequest | AWS Logs Async Services check request body
        try {
            AWSLogsAsyncResponse result = api.aWSLogsCheckServicesAsync()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#aWSLogsCheckServicesAsync");
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
 **body** | [**AWSLogsServicesRequest**](AWSLogsServicesRequest.md)| AWS Logs Async Services check request body |

### Return type

[**AWSLogsAsyncResponse**](AWSLogsAsyncResponse.md)

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


## aWSLogsList

> List&lt;AWSLogsListResponse&gt; aWSLogsList().execute();

List configured AWS log integrations.

### Overview
List all Datadog-AWS Logs integrations configured in your Datadog account.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        try {
            List<AWSLogsListResponse> result = api.aWSLogsList()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#aWSLogsList");
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## aWSLogsServicesList

> List&lt;AWSLogsListServicesResponse&gt; aWSLogsServicesList().execute();

Get list of AWS log ready services.

### Overview
Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        try {
            List<AWSLogsListServicesResponse> result = api.aWSLogsServicesList()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#aWSLogsServicesList");
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## addAWSLambdaARN

> Object addAWSLambdaARN().body(body).execute();

Add a AWS Lambda ARN to your Datadog account.

### Overview
Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS account ID to enable log collection.
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Your AWS Account ID without dashes.
* **`lambda_arn`** [*required*, *default* = **None**]: ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Check AWS Log Lambda Async request body.
        try {
            Object result = api.addAWSLambdaARN()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#addAWSLambdaARN");
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

**Object**

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


## deleteAWSLambdaARN

> Object deleteAWSLambdaARN().body(body).execute();

Delete a AWS Lambda ARN from your Datadog account.

### Overview
Delete a Lambda ARN of a Lambda created for the Datadog-AWS log collection in your Datadog account.
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Your AWS Account ID without dashes.
* **`lambda_arn`** [*required*, *default* = **None**]: ARN of the Lambda to be deleted.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Check AWS Log Lambda Async request body.
        try {
            Object result = api.deleteAWSLambdaARN()
                .body(body)
                .execute();
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
 **body** | [**AWSAccountAndLambdaRequest**](AWSAccountAndLambdaRequest.md)| Check AWS Log Lambda Async request body. |

### Return type

**Object**

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


## enableAWSLogServices

> Object enableAWSLogServices().body(body).execute();

Enable Automatic Log collection for your AWS services.

### Overview
Enable automatic log collection for a list of services. This should be run after running 'AddAWSLambdaARN' to save the config.
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Your AWS Account ID without dashes.
* **`services`** [*required*, *default* = **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

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

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        AWSLogsServicesRequest body = new AWSLogsServicesRequest(); // AWSLogsServicesRequest | Enable AWS Log Services request object
        try {
            Object result = api.enableAWSLogServices()
                .body(body)
                .execute();
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
 **body** | [**AWSLogsServicesRequest**](AWSLogsServicesRequest.md)| Enable AWS Log Services request object |

### Return type

**Object**

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

