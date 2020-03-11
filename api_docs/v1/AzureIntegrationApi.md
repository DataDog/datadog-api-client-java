# AzureIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**azureUpdateHostFilters**](AzureIntegrationApi.md#azureUpdateHostFilters) | **POST** /api/v1/integration/azure/host_filters | Update the defined list of host filters for a given Datadog-Azure integration.
[**createAzureIntegration**](AzureIntegrationApi.md#createAzureIntegration) | **POST** /api/v1/integration/azure | Add a Azure integration to your Datadog account.
[**deleteAzureIntegration**](AzureIntegrationApi.md#deleteAzureIntegration) | **DELETE** /api/v1/integration/azure | Delete an Azure Integration from your Datadog account.
[**listAzureIntegration**](AzureIntegrationApi.md#listAzureIntegration) | **GET** /api/v1/integration/azure | List configured Azure integrations.
[**updateAzureIntegration**](AzureIntegrationApi.md#updateAzureIntegration) | **PUT** /api/v1/integration/azure | Update an Azure integration to your Datadog account.



## azureUpdateHostFilters

> Object azureUpdateHostFilters().body(body).execute();

Update the defined list of host filters for a given Datadog-Azure integration.

### Overview
Update the defined list of host filters for a given Datadog-Azure integration.
### Arguments
* **`tenant_name`** [*required*, *default* = **None**]: Your Azure Active Directory ID.
* **`client_id`** [*required*, *default* = **None**]: Your Azure web application ID.
* **`host_filters`** [*required*, *default* = **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

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

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Update a Datadog-Azure integrations host filters.
        try {
            Object result = api.azureUpdateHostFilters()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#azureUpdateHostFilters");
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
 **body** | [**AzureAccount**](AzureAccount.md)| Update a Datadog-Azure integrations host filters. |

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


## createAzureIntegration

> Object createAzureIntegration().body(body).execute();

Add a Azure integration to your Datadog account.

### Overview
Create a Datadog-Azure integration.
### Arguments
* **`tenant_name`** [*required*, *default* = **None**]: Your Azure Active Directory ID.
* **`client_id`** [*required*, *default* = **None**]: Your Azure web application ID.
* **`client_secret`** [*required*, *default* = **None**]: Your Azure web application secret key.
* **`host_filters`** [*optional*, *default* = **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

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

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Create a Datadog-Azure integration.
        try {
            Object result = api.createAzureIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#createAzureIntegration");
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
 **body** | [**AzureAccount**](AzureAccount.md)| Create a Datadog-Azure integration. |

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


## deleteAzureIntegration

> Object deleteAzureIntegration().body(body).execute();

Delete an Azure Integration from your Datadog account.

### Overview
Delete a given Datadog-Azure integration.
### Arguments
* **`tenant_name`** [*required*, *default* = **None**]: Your Azure Active Directory ID.
* **`client_id`** [*required*, *default* = **None**]: Your Azure web application ID.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

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

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Delete a given Datadog-Azure integration.
        try {
            Object result = api.deleteAzureIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#deleteAzureIntegration");
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
 **body** | [**AzureAccount**](AzureAccount.md)| Delete a given Datadog-Azure integration. |

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


## listAzureIntegration

> List&lt;AzureAccount&gt; listAzureIntegration().execute();

List configured Azure integrations.

### Overview
List all Datadog-Azure integrations configured in your Datadog account.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

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

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        try {
            List<AzureAccount> result = api.listAzureIntegration()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#listAzureIntegration");
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

[**List&lt;AzureAccount&gt;**](AzureAccount.md)

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


## updateAzureIntegration

> Object updateAzureIntegration().body(body).execute();

Update an Azure integration to your Datadog account.

### Overview
Update an Datadog-Azure integration. Requires an existing tenant_name and client_id. Any other fields supplied will overwrite existing values. To overwrite tenant_name or client_id, use new_tenant_name and new_client_id. To leave a field unchanged, do not supply that field in the payload.
### Arguments
* **`tenant_name`** [*required*, *default* = **None**]: Your existing Azure Active Directory ID.
* **`new_tenant_name`** [*optional*, *default* = **None**]: Your new Azure Active Directory ID.
* **`client_id`** [*required*, *default* = **None**]: Your existing Azure web application ID.
* **`new_client_id`** [*optional*, *default* = **None**]: Your new Azure web application ID.
* **`client_secret`** [*optional*, *default* = **None**]: Your Azure web application secret key.
* **`host_filters`** [*optional*, *default* = **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AzureIntegrationApi;

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

        AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
        AzureAccount body = new AzureAccount(); // AzureAccount | Update a Datadog-Azure integration.
        try {
            Object result = api.updateAzureIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#updateAzureIntegration");
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
 **body** | [**AzureAccount**](AzureAccount.md)| Update a Datadog-Azure integration. |

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

