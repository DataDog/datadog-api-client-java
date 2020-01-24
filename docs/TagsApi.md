# TagsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToHostTags**](TagsApi.md#addToHostTags) | **POST** /api/v1/tags/hosts/{host_name} | Add tags to a host
[**getAllHostTags**](TagsApi.md#getAllHostTags) | **GET** /api/v1/tags/hosts | Get a mapping of tags to hosts for your whole infrastrucutre
[**getHostTags**](TagsApi.md#getHostTags) | **GET** /api/v1/tags/hosts/{host_name} | Get list of tags for a specific hosts
[**removeHostTags**](TagsApi.md#removeHostTags) | **DELETE** /api/v1/tags/hosts/{host_name} | Remove Host Tags
[**updateHostTags**](TagsApi.md#updateHostTags) | **PUT** /api/v1/tags/hosts/{host_name} | Update a tags on a host



## addToHostTags

> HostTags addToHostTags(hostName).body(body).source(source).execute();

Add tags to a host

### Add Tags to Host

 * **`tags`** [*required*]: A list of tags to apply to the host.

 * **`source`** [*optional*, *default*= **users**]: The source of the tags (e.g. chef, puppet).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.TagsApi;

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

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to add new tags to a host, optionally specifying where the tags came from.
        HostTags body = new HostTags(); // HostTags | Add tags to host
        String source = "source_example"; // String | The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
        try {
            HostTags result = api.addToHostTags(hostName)
                .body(body)
                .source(source)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#addToHostTags");
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
 **hostName** | **String**| This endpoint allows you to add new tags to a host, optionally specifying where the tags came from. |
 **body** | [**HostTags**](HostTags.md)| Add tags to host |
 **source** | **String**| The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) | [optional]

### Return type

[**HostTags**](HostTags.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Error |  -  |


## getAllHostTags

> TagToHosts getAllHostTags().source(source).execute();

Get a mapping of tags to hosts for your whole infrastrucutre

### Get Tags
* **`source`** [*optional*, *default*= **users**]: The source of the tags (e.g. chef, puppet).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.TagsApi;

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

        TagsApi apiInstance = new TagsApi(defaultClient);
        String source = "source_example"; // String | When specified, filters host list to those tags with the specified source
        try {
            TagToHosts result = api.getAllHostTags()
                .source(source)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getAllHostTags");
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
 **source** | **String**| When specified, filters host list to those tags with the specified source | [optional]

### Return type

[**TagToHosts**](TagToHosts.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Error |  -  |


## getHostTags

> HostTags getHostTags(hostName).source(source).execute();

Get list of tags for a specific hosts

### Get Host Tags

 * **`source`** [*optional*, *default*= **users**]: The source of the tags (e.g. chef, puppet).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.TagsApi;

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

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | When specified, filters list of tags to those tags with the specified source.
        String source = "source_example"; // String | Source to filter
        try {
            HostTags result = api.getHostTags(hostName)
                .source(source)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getHostTags");
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
 **hostName** | **String**| When specified, filters list of tags to those tags with the specified source. |
 **source** | **String**| Source to filter | [optional]

### Return type

[**HostTags**](HostTags.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Error |  -  |


## removeHostTags

> removeHostTags(hostName).source(source).execute();

Remove Host Tags

### Remove Host Tags

 * **`source`** [*optional*, *default*= **users**]: The source of the tags (e.g. chef, puppet).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.TagsApi;

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

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to remove all user-assigned tags for a single host.
        String source = "source_example"; // String | The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
        try {
            api.removeHostTags(hostName)
                .source(source)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#removeHostTags");
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
 **hostName** | **String**| This endpoint allows you to remove all user-assigned tags for a single host. |
 **source** | **String**| The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) | [optional]

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
| **204** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Error |  -  |


## updateHostTags

> HostTags updateHostTags(hostName).body(body).source(source).execute();

Update a tags on a host

### Update Host Tags

 * **`tags`** [*required*]: A list of tags to apply to the host.

 * **`source`** [*optional*, *default*= **users**]: The source of the tags (e.g. chef, puppet).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.TagsApi;

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

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to update/replace all in an integration source with those supplied in the request.
        HostTags body = new HostTags(); // HostTags | Add tags to host
        String source = "source_example"; // String | The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
        try {
            HostTags result = api.updateHostTags(hostName)
                .body(body)
                .source(source)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#updateHostTags");
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
 **hostName** | **String**| This endpoint allows you to update/replace all in an integration source with those supplied in the request. |
 **body** | [**HostTags**](HostTags.md)| Add tags to host |
 **source** | **String**| The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) | [optional]

### Return type

[**HostTags**](HostTags.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Error |  -  |

