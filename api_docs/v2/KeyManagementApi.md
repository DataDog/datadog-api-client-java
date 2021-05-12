# KeyManagementApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createAPIKey**](KeyManagementApi.md#createAPIKey) | **POST** /api/v2/api_keys | Create an API key
[**createCurrentUserApplicationKey**](KeyManagementApi.md#createCurrentUserApplicationKey) | **POST** /api/v2/current_user/application_keys | Create an application key for current user
[**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey) | **DELETE** /api/v2/api_keys/{api_key_id} | Delete an API key
[**deleteApplicationKey**](KeyManagementApi.md#deleteApplicationKey) | **DELETE** /api/v2/application_keys/{app_key_id} | Delete an application key
[**deleteCurrentUserApplicationKey**](KeyManagementApi.md#deleteCurrentUserApplicationKey) | **DELETE** /api/v2/current_user/application_keys/{app_key_id} | Delete an application key owned by current user
[**getAPIKey**](KeyManagementApi.md#getAPIKey) | **GET** /api/v2/api_keys/{api_key_id} | Get API key
[**getCurrentUserApplicationKey**](KeyManagementApi.md#getCurrentUserApplicationKey) | **GET** /api/v2/current_user/application_keys/{app_key_id} | Get one application key owned by current user
[**listAPIKeys**](KeyManagementApi.md#listAPIKeys) | **GET** /api/v2/api_keys | Get all API keys
[**listApplicationKeys**](KeyManagementApi.md#listApplicationKeys) | **GET** /api/v2/application_keys | Get all application keys
[**listCurrentUserApplicationKeys**](KeyManagementApi.md#listCurrentUserApplicationKeys) | **GET** /api/v2/current_user/application_keys | Get all application keys owned by current user
[**updateAPIKey**](KeyManagementApi.md#updateAPIKey) | **PATCH** /api/v2/api_keys/{api_key_id} | Edit an API key
[**updateApplicationKey**](KeyManagementApi.md#updateApplicationKey) | **PATCH** /api/v2/application_keys/{app_key_id} | Edit an application key
[**updateCurrentUserApplicationKey**](KeyManagementApi.md#updateCurrentUserApplicationKey) | **PATCH** /api/v2/current_user/application_keys/{app_key_id} | Edit an application key owned by current user



## createAPIKey

> APIKeyResponse createAPIKey(body);

Create an API key.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        APIKeyCreateRequest body = new APIKeyCreateRequest(); // APIKeyCreateRequest | 
        try {
            APIKeyResponse result = apiInstance.createAPIKey(body);
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


## createCurrentUserApplicationKey

> ApplicationKeyResponse createCurrentUserApplicationKey(body);

Create an application key for current user

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        ApplicationKeyCreateRequest body = new ApplicationKeyCreateRequest(); // ApplicationKeyCreateRequest | 
        try {
            ApplicationKeyResponse result = apiInstance.createCurrentUserApplicationKey(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#createCurrentUserApplicationKey");
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
 **body** | [**ApplicationKeyCreateRequest**](ApplicationKeyCreateRequest.md)|  |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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

> deleteAPIKey(apiKeyId);

Delete an API key.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        try {
            apiInstance.deleteAPIKey(apiKeyId);
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


## deleteApplicationKey

> deleteApplicationKey(appKeyId);

Delete an application key

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            apiInstance.deleteApplicationKey(appKeyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#deleteApplicationKey");
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
 **appKeyId** | **String**| The ID of the application key. |

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


## deleteCurrentUserApplicationKey

> deleteCurrentUserApplicationKey(appKeyId);

Delete an application key owned by current user

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            apiInstance.deleteCurrentUserApplicationKey(appKeyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#deleteCurrentUserApplicationKey");
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
 **appKeyId** | **String**| The ID of the application key. |

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

> APIKeyResponse getAPIKey(apiKeyId, parameters);

Get an API key.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        String include = "created_by,modified_by"; // String | Comma separated list of resource paths for related resources to include in the response. Supported resource paths are `created_by` and `modified_by`.
        try {
	    APIKeyResponse result = apiInstance.getAPIKey(apiKeyId, new KeyManagementApi.GetAPIKeyOptionalParameters()
                .include(include));
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


## getCurrentUserApplicationKey

> ApplicationKeyResponse getCurrentUserApplicationKey(appKeyId);

Get an application key owned by current user

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            ApplicationKeyResponse result = apiInstance.getCurrentUserApplicationKey(appKeyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#getCurrentUserApplicationKey");
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
 **appKeyId** | **String**| The ID of the application key. |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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

> APIKeysResponse listAPIKeys(parameters);

List all API keys available for your account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        APIKeysSort sort = APIKeysSort.fromValue("created_at"); // APIKeysSort | API key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter API keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys created on or before the specified date.
        String filterModifiedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or after the specified date.
        String filterModifiedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include API keys modified on or before the specified date.
        String include = "created_by,modified_by"; // String | Comma separated list of resource paths for related resources to include in the response. Supported resource paths are `created_by` and `modified_by`.
        try {
	    APIKeysResponse result = apiInstance.listAPIKeys(new KeyManagementApi.ListAPIKeysOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd)
                .filterModifiedAtStart(filterModifiedAtStart)
                .filterModifiedAtEnd(filterModifiedAtEnd)
                .include(include));
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0]
 **sort** | **APIKeysSort**| API key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign. | [optional] [enum: created_at, -created_at, last4, -last4, modified_at, -modified_at, name, -name]
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


## listApplicationKeys

> ListApplicationKeysResponse listApplicationKeys(parameters);

List all application keys available for your org

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        ApplicationKeysSort sort = ApplicationKeysSort.fromValue("created_at"); // ApplicationKeysSort | Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter application keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or before the specified date.
        try {
	    ListApplicationKeysResponse result = apiInstance.listApplicationKeys(new KeyManagementApi.ListApplicationKeysOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#listApplicationKeys");
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0]
 **sort** | **ApplicationKeysSort**| Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign. | [optional] [enum: created_at, -created_at, last4, -last4, name, -name]
 **filter** | **String**| Filter application keys by the specified string. | [optional]
 **filterCreatedAtStart** | **String**| Only include application keys created on or after the specified date. | [optional]
 **filterCreatedAtEnd** | **String**| Only include application keys created on or before the specified date. | [optional]

### Return type

[**ListApplicationKeysResponse**](ListApplicationKeysResponse.md)

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
| **404** | Not Found |  -  |


## listCurrentUserApplicationKeys

> ListApplicationKeysResponse listCurrentUserApplicationKeys(parameters);

List all application keys available for current user

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        ApplicationKeysSort sort = ApplicationKeysSort.fromValue("created_at"); // ApplicationKeysSort | Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter application keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or before the specified date.
        try {
	    ListApplicationKeysResponse result = apiInstance.listCurrentUserApplicationKeys(new KeyManagementApi.ListCurrentUserApplicationKeysOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#listCurrentUserApplicationKeys");
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0]
 **sort** | **ApplicationKeysSort**| Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign. | [optional] [enum: created_at, -created_at, last4, -last4, name, -name]
 **filter** | **String**| Filter application keys by the specified string. | [optional]
 **filterCreatedAtStart** | **String**| Only include application keys created on or after the specified date. | [optional]
 **filterCreatedAtEnd** | **String**| Only include application keys created on or before the specified date. | [optional]

### Return type

[**ListApplicationKeysResponse**](ListApplicationKeysResponse.md)

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
| **404** | Not Found |  -  |


## updateAPIKey

> APIKeyResponse updateAPIKey(apiKeyId, body);

Update an API key.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
        APIKeyUpdateRequest body = new APIKeyUpdateRequest(); // APIKeyUpdateRequest | 
        try {
            APIKeyResponse result = apiInstance.updateAPIKey(apiKeyId, body);
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


## updateApplicationKey

> ApplicationKeyResponse updateApplicationKey(appKeyId, body);

Edit an application key

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        ApplicationKeyUpdateRequest body = new ApplicationKeyUpdateRequest(); // ApplicationKeyUpdateRequest | 
        try {
            ApplicationKeyResponse result = apiInstance.updateApplicationKey(appKeyId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#updateApplicationKey");
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
 **appKeyId** | **String**| The ID of the application key. |
 **body** | [**ApplicationKeyUpdateRequest**](ApplicationKeyUpdateRequest.md)|  |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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


## updateCurrentUserApplicationKey

> ApplicationKeyResponse updateCurrentUserApplicationKey(appKeyId, body);

Edit an application key owned by current user

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        ApplicationKeyUpdateRequest body = new ApplicationKeyUpdateRequest(); // ApplicationKeyUpdateRequest | 
        try {
            ApplicationKeyResponse result = apiInstance.updateCurrentUserApplicationKey(appKeyId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#updateCurrentUserApplicationKey");
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
 **appKeyId** | **String**| The ID of the application key. |
 **body** | [**ApplicationKeyUpdateRequest**](ApplicationKeyUpdateRequest.md)|  |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

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

