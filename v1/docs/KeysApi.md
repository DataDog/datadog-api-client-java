# KeysApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAPIKey**](KeysApi.md#createAPIKey) | **POST** /api/v1/api_key | Create an API key with a given name.
[**createApplicationKey**](KeysApi.md#createApplicationKey) | **POST** /api/v1/application_key | Create an application key with a given name.
[**deleteAPIKey**](KeysApi.md#deleteAPIKey) | **DELETE** /api/v1/api_key/{api_key} | Delete a given API key.
[**deleteApplicationKey**](KeysApi.md#deleteApplicationKey) | **DELETE** /api/v1/application_key/{app_key} | Delete a given application key.
[**editAPIKey**](KeysApi.md#editAPIKey) | **PUT** /api/v1/api_key/{api_key} | Edit an API key name.
[**editApplicationKey**](KeysApi.md#editApplicationKey) | **PUT** /api/v1/application_key/{app_key} | Edit an application key name.
[**getAPIKey**](KeysApi.md#getAPIKey) | **GET** /api/v1/api_key/{api_key} | Get a given API key.
[**getAllAPIKeys**](KeysApi.md#getAllAPIKeys) | **GET** /api/v1/api_key | Get all API keys available for your account.
[**getAllApplicationKeys**](KeysApi.md#getAllApplicationKeys) | **GET** /api/v1/application_key | Get all application keys available for your account.
[**getApplicationKey**](KeysApi.md#getApplicationKey) | **GET** /api/v1/application_key/{app_key} | Get a given application key.



## createAPIKey

> ApiKeyResponse createAPIKey(apiKey)

Create an API key with a given name.

## Overview
Creates an API key
### ARGUMENTS
* **`name`** [*required*]: Name of your API key.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        ApiKey apiKey = new ApiKey(); // ApiKey | 
        try {
            ApiKeyResponse result = apiInstance.createAPIKey(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#createAPIKey");
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
 **apiKey** | [**ApiKey**](ApiKey.md)|  | [optional]

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

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
| **409** | Conflict |  -  |


## createApplicationKey

> ApplicationKeyResponse createApplicationKey(applicationKey)

Create an application key with a given name.

## Overview
Create an application key with a given name.
### ARGUMENTS
* **`name`** [*required*]: Name of your application key.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        ApplicationKey applicationKey = new ApplicationKey(); // ApplicationKey | 
        try {
            ApplicationKeyResponse result = apiInstance.createApplicationKey(applicationKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#createApplicationKey");
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
 **applicationKey** | [**ApplicationKey**](ApplicationKey.md)|  | [optional]

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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
| **409** | Conflict |  -  |


## deleteAPIKey

> ApiKeyResponse deleteAPIKey(apiKey)

Delete a given API key.

## Overview
Delete a given API key.
### ARGUMENTS
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String apiKey = "apiKey_example"; // String | The specific API key you are working with
        try {
            ApiKeyResponse result = apiInstance.deleteAPIKey(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#deleteAPIKey");
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
 **apiKey** | **String**| The specific API key you are working with |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

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
| **404** | Not Found |  -  |


## deleteApplicationKey

> ApplicationKeyResponse deleteApplicationKey(appKey)

Delete a given application key.

## Overview
Delete a given application key.
### ARGUMENTS
* **`name`** [*required*]: Name of your application key.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String appKey = "appKey_example"; // String | The specific APP key you are working with
        try {
            ApplicationKeyResponse result = apiInstance.deleteApplicationKey(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#deleteApplicationKey");
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
 **appKey** | **String**| The specific APP key you are working with |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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
| **404** | Not Found |  -  |


## editAPIKey

> ApiKeyResponse editAPIKey(apiKey, apiKey)

Edit an API key name.

## Overview
Edit an API key name.
### ARGUMENTS
* **`name`** [*required*]: Name of your API key.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String apiKey = "apiKey_example"; // String | The specific API key you are working with
        ApiKey apiKey = new ApiKey(); // ApiKey | 
        try {
            ApiKeyResponse result = apiInstance.editAPIKey(apiKey, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#editAPIKey");
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
 **apiKey** | **String**| The specific API key you are working with |
 **apiKey** | [**ApiKey**](ApiKey.md)|  | [optional]

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

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


## editApplicationKey

> ApplicationKeyResponse editApplicationKey(appKey, applicationKey)

Edit an application key name.

## Overview
Edit an application key name.
### ARGUMENTS
* **`name`** [*required*]: Name of your application key.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String appKey = "appKey_example"; // String | The specific APP key you are working with
        ApplicationKey applicationKey = new ApplicationKey(); // ApplicationKey | 
        try {
            ApplicationKeyResponse result = apiInstance.editApplicationKey(appKey, applicationKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#editApplicationKey");
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
 **appKey** | **String**| The specific APP key you are working with |
 **applicationKey** | [**ApplicationKey**](ApplicationKey.md)|  | [optional]

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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


## getAPIKey

> ApiKeyResponse getAPIKey(apiKey)

Get a given API key.

## Overview
Get a given API key.
### ARGUMENTS
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String apiKey = "apiKey_example"; // String | The specific API key you are working with
        try {
            ApiKeyResponse result = apiInstance.getAPIKey(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#getAPIKey");
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
 **apiKey** | **String**| The specific API key you are working with |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

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
| **404** | Not Found |  -  |


## getAllAPIKeys

> ApiKeyListResponse getAllAPIKeys()

Get all API keys available for your account.

## Overview
Get all API keys available for your account.
### ARGUMENTS
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        try {
            ApiKeyListResponse result = apiInstance.getAllAPIKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#getAllAPIKeys");
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

[**ApiKeyListResponse**](ApiKeyListResponse.md)

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


## getAllApplicationKeys

> ApplicationKeyListResponse getAllApplicationKeys()

Get all application keys available for your account.

## Overview
Get all application keys available for your account.
### ARGUMENTS
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        try {
            ApplicationKeyListResponse result = apiInstance.getAllApplicationKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#getAllApplicationKeys");
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

[**ApplicationKeyListResponse**](ApplicationKeyListResponse.md)

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


## getApplicationKey

> ApplicationKeyResponse getApplicationKey(appKey)

Get a given application key.

## Overview
Get a given application key.
### ARGUMENTS
This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.KeysApi;

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

        KeysApi apiInstance = new KeysApi(defaultClient);
        String appKey = "appKey_example"; // String | The specific APP key you are working with
        try {
            ApplicationKeyResponse result = apiInstance.getApplicationKey(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#getApplicationKey");
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
 **appKey** | **String**| The specific APP key you are working with |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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
| **404** | Not Found |  -  |

