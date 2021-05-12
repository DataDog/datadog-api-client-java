# NotebooksApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createNotebook**](NotebooksApi.md#createNotebook) | **POST** /api/v1/notebooks | Create a notebook
[**deleteNotebook**](NotebooksApi.md#deleteNotebook) | **DELETE** /api/v1/notebooks/{notebook_id} | Delete a notebook
[**getNotebook**](NotebooksApi.md#getNotebook) | **GET** /api/v1/notebooks/{notebook_id} | Get a notebook
[**listNotebooks**](NotebooksApi.md#listNotebooks) | **GET** /api/v1/notebooks | Get all notebooks
[**updateNotebook**](NotebooksApi.md#updateNotebook) | **PUT** /api/v1/notebooks/{notebook_id} | Update a notebook



## createNotebook

> NotebookResponse createNotebook(body);

Create a notebook using the specified options.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        NotebookCreateRequest body = new NotebookCreateRequest(); // NotebookCreateRequest | The JSON description of the notebook you want to create.
        try {
            NotebookResponse result = apiInstance.createNotebook(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#createNotebook");
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
 **body** | [**NotebookCreateRequest**](NotebookCreateRequest.md)| The JSON description of the notebook you want to create. |

### Return type

[**NotebookResponse**](NotebookResponse.md)

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


## deleteNotebook

> deleteNotebook(notebookId);

Delete a notebook using the specified ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        Long notebookId = 56L; // Long | Unique ID, assigned when you create the notebook.
        try {
            apiInstance.deleteNotebook(notebookId);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#deleteNotebook");
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
 **notebookId** | **Long**| Unique ID, assigned when you create the notebook. |

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
| **400** | Bad Request |  -  |
| **403** | Authentication Error |  -  |
| **404** | Not Found |  -  |


## getNotebook

> NotebookResponse getNotebook(notebookId);

Get a notebook using the specified notebook ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        Long notebookId = 56L; // Long | Unique ID, assigned when you create the notebook.
        try {
            NotebookResponse result = apiInstance.getNotebook(notebookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#getNotebook");
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
 **notebookId** | **Long**| Unique ID, assigned when you create the notebook. |

### Return type

[**NotebookResponse**](NotebookResponse.md)

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
| **404** | Not Found |  -  |


## listNotebooks

> NotebooksResponse listNotebooks(parameters);

Get all notebooks. This can also be used to search for notebooks with a particular `query` in the notebook
`name` or author `handle`.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        String authorHandle = "test@datadoghq.com"; // String | Return notebooks created by the given `author_handle`.
        String excludeAuthorHandle = "test@datadoghq.com"; // String | Return notebooks not created by the given `author_handle`.
        Long start = 0L; // Long | The index of the first notebook you want returned.
        Long count = 5L; // Long | The number of notebooks to be returned.
        String sortField = "modified"; // String | Sort by field `modified` or `name`.
        String sortDir = "desc"; // String | Sort by direction `asc` or `desc`.
        String query = "postmortem"; // String | Return only notebooks with `query` string in notebook name or author handle.
        Boolean includeCells = true; // Boolean | Value of `false` excludes the `cells` and global `time` for each notebook.
        try {
	    NotebooksResponse result = apiInstance.listNotebooks(new NotebooksApi.ListNotebooksOptionalParameters()
                .authorHandle(authorHandle)
                .excludeAuthorHandle(excludeAuthorHandle)
                .start(start)
                .count(count)
                .sortField(sortField)
                .sortDir(sortDir)
                .query(query)
                .includeCells(includeCells));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#listNotebooks");
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
 **authorHandle** | **String**| Return notebooks created by the given &#x60;author_handle&#x60;. | [optional]
 **excludeAuthorHandle** | **String**| Return notebooks not created by the given &#x60;author_handle&#x60;. | [optional]
 **start** | **Long**| The index of the first notebook you want returned. | [optional]
 **count** | **Long**| The number of notebooks to be returned. | [optional]
 **sortField** | **String**| Sort by field &#x60;modified&#x60; or &#x60;name&#x60;. | [optional] [default to modified]
 **sortDir** | **String**| Sort by direction &#x60;asc&#x60; or &#x60;desc&#x60;. | [optional] [default to desc]
 **query** | **String**| Return only notebooks with &#x60;query&#x60; string in notebook name or author handle. | [optional]
 **includeCells** | **Boolean**| Value of &#x60;false&#x60; excludes the &#x60;cells&#x60; and global &#x60;time&#x60; for each notebook. | [optional] [default to true]

### Return type

[**NotebooksResponse**](NotebooksResponse.md)

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


## updateNotebook

> NotebookResponse updateNotebook(notebookId, body);

Update a notebook using the specified ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        Long notebookId = 56L; // Long | Unique ID, assigned when you create the notebook.
        NotebookUpdateRequest body = new NotebookUpdateRequest(); // NotebookUpdateRequest | Update notebook request body.
        try {
            NotebookResponse result = apiInstance.updateNotebook(notebookId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#updateNotebook");
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
 **notebookId** | **Long**| Unique ID, assigned when you create the notebook. |
 **body** | [**NotebookUpdateRequest**](NotebookUpdateRequest.md)| Update notebook request body. |

### Return type

[**NotebookResponse**](NotebookResponse.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

