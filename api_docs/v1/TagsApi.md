# TagsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createHostTags**](TagsApi.md#createHostTags) | **POST** /api/v1/tags/hosts/{host_name} | Add tags to a host
[**deleteHostTags**](TagsApi.md#deleteHostTags) | **DELETE** /api/v1/tags/hosts/{host_name} | Remove host tags
[**getHostTags**](TagsApi.md#getHostTags) | **GET** /api/v1/tags/hosts/{host_name} | Get host tags
[**listHostTags**](TagsApi.md#listHostTags) | **GET** /api/v1/tags/hosts | Get Tags
[**updateHostTags**](TagsApi.md#updateHostTags) | **PUT** /api/v1/tags/hosts/{host_name} | Update host tags



## createHostTags

> HostTags createHostTags(hostName, body, parameters);

This endpoint allows you to add new tags to a host,
optionally specifying where these tags come from.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to add new tags to a host, optionally specifying where the tags came from.
        HostTags body = new HostTags(); // HostTags | Update host tags request body.
        String source = "chef"; // String | The source of the tags. [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
        try {
	    HostTags result = apiInstance.createHostTags(hostName, body, new TagsApi.CreateHostTagsOptionalParameters()
                .source(source));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createHostTags");
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
 **body** | [**HostTags**](HostTags.md)| Update host tags request body. |
 **source** | **String**| The source of the tags. [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value). | [optional]

### Return type

[**HostTags**](HostTags.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## deleteHostTags

> deleteHostTags(hostName, parameters);

This endpoint allows you to remove all user-assigned tags
for a single host.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to remove all user-assigned tags for a single host.
        String source = "source_example"; // String | The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
        try {
	    apiInstance.deleteHostTags(hostName, new TagsApi.DeleteHostTagsOptionalParameters()
                .source(source));
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#deleteHostTags");
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
 **source** | **String**| The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value). | [optional]

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
| **204** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getHostTags

> HostTags getHostTags(hostName, parameters);

Return the list of tags that apply to a given host.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | When specified, filters list of tags to those tags with the specified source.
        String source = "source_example"; // String | Source to filter.
        try {
	    HostTags result = apiInstance.getHostTags(hostName, new TagsApi.GetHostTagsOptionalParameters()
                .source(source));
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
 **source** | **String**| Source to filter. | [optional]

### Return type

[**HostTags**](HostTags.md)

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


## listHostTags

> TagToHosts listHostTags(parameters);

Return a mapping of tags to hosts for your whole infrastructure.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String source = "source_example"; // String | When specified, filters host list to those tags with the specified source.
        try {
	    TagToHosts result = apiInstance.listHostTags(new TagsApi.ListHostTagsOptionalParameters()
                .source(source));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#listHostTags");
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
 **source** | **String**| When specified, filters host list to those tags with the specified source. | [optional]

### Return type

[**TagToHosts**](TagToHosts.md)

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


## updateHostTags

> HostTags updateHostTags(hostName, body, parameters);

This endpoint allows you to update/replace all tags in
an integration source with those supplied in the request.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String hostName = "hostName_example"; // String | This endpoint allows you to update/replace all in an integration source with those supplied in the request.
        HostTags body = new HostTags(); // HostTags | Add tags to host
        String source = "source_example"; // String | The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
        try {
	    HostTags result = apiInstance.updateHostTags(hostName, body, new TagsApi.UpdateHostTagsOptionalParameters()
                .source(source));
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

