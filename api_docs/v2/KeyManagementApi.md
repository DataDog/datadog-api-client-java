# KeyManagementApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAPIKey**](KeyManagementApi.md#createAPIKey) | **POST** /api/v2/api_keys | Create an API key
[**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey) | **DELETE** /api/v2/api_keys/{api_key_id} | Delete an API key
[**getAPIKey**](KeyManagementApi.md#getAPIKey) | **GET** /api/v2/api_keys/{api_key_id} | Get API key
[**listAPIKeys**](KeyManagementApi.md#listAPIKeys) | **GET** /api/v2/api_keys | Get all API keys
[**updateAPIKey**](KeyManagementApi.md#updateAPIKey) | **PATCH** /api/v2/api_keys/{api_key_id} | Edit an API key



## createAPIKey

> APIKeyResponse createAPIKey().body(body).execute();

Create an API key

Create an API key.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

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

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        APIKeyCreateRequest body = new APIKeyCreateRequest(); // APIKeyCreateRequest | 
        try {
            APIKeyResponse result = apiInstance.createAPIKey()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#createAPIKey");
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
 **body** | [**APIKeyCreateRequest**](APIKeyCreateRequest.md)|  |

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## deleteAPIKey

> deleteAPIKey(apiKeyId).execute();

Delete an API key

Delete an API key.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

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

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        try {
            apiInstance.deleteAPIKey(apiKeyId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#deleteAPIKey");
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
 **apiKeyId** | **String**| The ID of the API key. |

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
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getAPIKey

> APIKeyResponse getAPIKey(apiKeyId).include(include).execute();

Get API key

Get an API key.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

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

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        String include = "created_by,modified_by"; // String | Comma separated list of resource paths for related resources to include in the response. Supported resource paths are `created_by` and `modified_by`.
        try {
            APIKeyResponse result = apiInstance.getAPIKey(apiKeyId)
                .include(include)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#getAPIKey");
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
 **apiKeyId** | **String**| The ID of the API key. |
 **include** | **String**| Comma separated list of resource paths for related resources to include in the response. Supported resource paths are &#x60;created_by&#x60; and &#x60;modified_by&#x60;. | [optional]

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

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
| **404** | Not Found |  -  |


## listAPIKeys

> APIKeysResponse listAPIKeys().pageSize(pageSize).pageNumber(pageNumber).sort(sort).filter(filter).filterCreatedAtStart(filterCreatedAtStart).filterCreatedAtEnd(filterCreatedAtEnd).filterModifiedAtStart(filterModifiedAtStart).filterModifiedAtEnd(filterModifiedAtEnd).include(include).execute();

Get all API keys

List all API keys available for your account.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

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

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        Long pageSize = 10l; // Long | Size for a given page.
        Long pageNumber = 0l; // Long | Specific page number to return.
        String sort = "name"; // String | API key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter API keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or before the specified date.
        String filterModifiedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or after the specified date.
        String filterModifiedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or before the specified date.
        String include = "created_by,modified_by"; // String | Comma separated list of resource paths for related resources to include in the response. Supported resource paths are `created_by` and `modified_by`.
        try {
            APIKeysResponse result = apiInstance.listAPIKeys()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd)
                .filterModifiedAtStart(filterModifiedAtStart)
                .filterModifiedAtEnd(filterModifiedAtEnd)
                .include(include)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#listAPIKeys");
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10l]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0l]
 **sort** | **String**| API key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign. | [optional] [default to name] [enum: created_at, -created_at, last4, -last4, modified_at, -modified_at, name, -name]
 **filter** | **String**| Filter API keys by the specified string. | [optional]
 **filterCreatedAtStart** | **String**| Only include API keys created on or after the specified date. | [optional]
 **filterCreatedAtEnd** | **String**| Only include API keys created on or before the specified date. | [optional]
 **filterModifiedAtStart** | **String**| Only include API keys modified on or after the specified date. | [optional]
 **filterModifiedAtEnd** | **String**| Only include API keys modified on or before the specified date. | [optional]
 **include** | **String**| Comma separated list of resource paths for related resources to include in the response. Supported resource paths are &#x60;created_by&#x60; and &#x60;modified_by&#x60;. | [optional]

### Return type

[**APIKeysResponse**](APIKeysResponse.md)

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


## updateAPIKey

> APIKeyResponse updateAPIKey(apiKeyId).body(body).execute();

Edit an API key

Update an API key.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

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

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        APIKeyUpdateRequest body = new APIKeyUpdateRequest(); // APIKeyUpdateRequest | 
        try {
            APIKeyResponse result = apiInstance.updateAPIKey(apiKeyId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#updateAPIKey");
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
 **apiKeyId** | **String**| The ID of the API key. |
 **body** | [**APIKeyUpdateRequest**](APIKeyUpdateRequest.md)|  |

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

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
| **404** | Not Found |  -  |

