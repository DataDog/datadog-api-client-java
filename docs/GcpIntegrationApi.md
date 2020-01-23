# GcpIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGCPIntegration**](GcpIntegrationApi.md#createGCPIntegration) | **POST** /api/v1/integration/gcp | Add a GCP integration to your Datadog account.
[**deleteGCPIntegration**](GcpIntegrationApi.md#deleteGCPIntegration) | **DELETE** /api/v1/integration/gcp | Delete a GCP Integration from your Datadog account.
[**listGCPIntegration**](GcpIntegrationApi.md#listGCPIntegration) | **GET** /api/v1/integration/gcp | List configured GCP integrations.
[**updateGCPIntegration**](GcpIntegrationApi.md#updateGCPIntegration) | **PUT** /api/v1/integration/gcp | Update a GCP integration in your Datadog account.



## createGCPIntegration

> Object createGCPIntegration().body(body).execute();

Add a GCP integration to your Datadog account.

### Overview
Create a Datadog-GCP integration.
### Arguments
* **`type`** [*required*, *default* = **None**]: The value for service_account found in your JSON service account key.
* **`project_id`** [*required*, *default* = **None**]: Your Google Cloud project ID found in your JSON service account key.
* **`private_key_id`** [*required*, *default* = **None**]: Your private key ID found in your JSON service account key.
* **`private_key`** [*required*, *default* = **None**]: Your private key name found in your JSON service account key.
* **`client_email`** [*required*, *default* = **None**]: Your email found in your JSON service account key.
* **`client_id`** [*required*, *default* = **None**]: Your ID found in your JSON service account key.
* **`auth_uri`** [*required*, *default* = **None**]: Should be https://accounts.google.com/o/oauth2/auth.
* **`token_uri`** [*required*, *default* = **None**]: Should be https://accounts.google.com/o/oauth2/token.
* **`auth_provider_x509_cert_url`** [*required*, *default* = **None**]: Should be https://www.googleapis.com/oauth2/v1/certs.
* **`client_x509_cert_url`** [*required*, *default* = **None**]: Should be https://www.googleapis.com/robot/v1/metadata/x509/<CLIENT_EMAIL> where <CLIENT_EMAIL> is the email found in your JSON service account key.
* **`host_filters`** [*optional*, *default* = **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
* **`automute`** [*optional*, *default* = false]: Silence monitors for expected GCE instance shutdowns.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

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

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Create a Datadog-Azure integration.
        try {
            Object result = api.createGCPIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#createGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Create a Datadog-Azure integration. |

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


## deleteGCPIntegration

> Object deleteGCPIntegration().body(body).execute();

Delete a GCP Integration from your Datadog account.

### Overview
Delete a given Datadog-GCP integration.
### Arguments
* **`project_id`** [*required*, *default* = **None**]: Your Google Cloud project ID to be deleted.
* **`client_email`** [*required*, *default* = **None**]: Your client email associated with the integration to be deleted.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

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

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Delete a given Datadog-GCP integration.
        try {
            Object result = api.deleteGCPIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#deleteGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Delete a given Datadog-GCP integration. |

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


## listGCPIntegration

> List&lt;GCPAccount&gt; listGCPIntegration().execute();

List configured GCP integrations.

### Overview
List all Datadog-GCP integrations configured in your Datadog account.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

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

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        try {
            List<GCPAccount> result = api.listGCPIntegration()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#listGCPIntegration");
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

[**List&lt;GCPAccount&gt;**](GCPAccount.md)

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


## updateGCPIntegration

> Object updateGCPIntegration().body(body).execute();

Update a GCP integration in your Datadog account.

### Overview
Update a Datadog-GCP integrations host_filters and/or automute. Requires a project_id and client_email, however these fields cannot be updated. If you need to update these fields please delete and use the create (POST) endpoint. The unspecified fields will keep their original values.
### Arguments
* **`project_id`** [*required*, *default* = **None**]: Your Google Cloud project ID associated with the integration to be updated.
* **`client_email`** [*required*, *default* = **None**]: Your client email associated with the integration to be updated.
* **`host_filters`** [*optional*, *default* = **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
* **`automute`** [*optional*, *default* = false]: Silence monitors for expected GCE instance shutdowns.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

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

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Update a Datadog-GCP integration.
        try {
            Object result = api.updateGCPIntegration()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#updateGCPIntegration");
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
 **body** | [**GCPAccount**](GCPAccount.md)| Update a Datadog-GCP integration. |

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

