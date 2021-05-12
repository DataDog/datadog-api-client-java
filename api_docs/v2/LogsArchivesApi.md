# LogsArchivesApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**addReadRoleToArchive**](LogsArchivesApi.md#addReadRoleToArchive) | **POST** /api/v2/logs/config/archives/{archive_id}/readers | Grant role to an archive
[**createLogsArchive**](LogsArchivesApi.md#createLogsArchive) | **POST** /api/v2/logs/config/archives | Create an archive
[**deleteLogsArchive**](LogsArchivesApi.md#deleteLogsArchive) | **DELETE** /api/v2/logs/config/archives/{archive_id} | Delete an archive
[**getLogsArchive**](LogsArchivesApi.md#getLogsArchive) | **GET** /api/v2/logs/config/archives/{archive_id} | Get an archive
[**getLogsArchiveOrder**](LogsArchivesApi.md#getLogsArchiveOrder) | **GET** /api/v2/logs/config/archive-order | Get archive order
[**listArchiveReadRoles**](LogsArchivesApi.md#listArchiveReadRoles) | **GET** /api/v2/logs/config/archives/{archive_id}/readers | List read roles for an archive
[**listLogsArchives**](LogsArchivesApi.md#listLogsArchives) | **GET** /api/v2/logs/config/archives | Get all archives
[**removeRoleFromArchive**](LogsArchivesApi.md#removeRoleFromArchive) | **DELETE** /api/v2/logs/config/archives/{archive_id}/readers | Revoke role from an archive
[**updateLogsArchive**](LogsArchivesApi.md#updateLogsArchive) | **PUT** /api/v2/logs/config/archives/{archive_id} | Update an archive
[**updateLogsArchiveOrder**](LogsArchivesApi.md#updateLogsArchiveOrder) | **PUT** /api/v2/logs/config/archive-order | Update archive order



## addReadRoleToArchive

> addReadRoleToArchive(archiveId, body);

Adds a read role to an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        RelationshipToRole body = new RelationshipToRole(); // RelationshipToRole | 
        try {
            apiInstance.addReadRoleToArchive(archiveId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#addReadRoleToArchive");
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
 **archiveId** | **String**| The ID of the archive. |
 **body** | [**RelationshipToRole**](RelationshipToRole.md)|  |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## createLogsArchive

> LogsArchive createLogsArchive(body);

Create an archive in your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        LogsArchiveCreateRequest body = new LogsArchiveCreateRequest(); // LogsArchiveCreateRequest | The definition of the new archive.
        try {
            LogsArchive result = apiInstance.createLogsArchive(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#createLogsArchive");
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
 **body** | [**LogsArchiveCreateRequest**](LogsArchiveCreateRequest.md)| The definition of the new archive. |

### Return type

[**LogsArchive**](LogsArchive.md)

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


## deleteLogsArchive

> deleteLogsArchive(archiveId);

Delete a given archive from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        try {
            apiInstance.deleteLogsArchive(archiveId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#deleteLogsArchive");
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
 **archiveId** | **String**| The ID of the archive. |

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
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## getLogsArchive

> LogsArchive getLogsArchive(archiveId);

Get a specific archive from your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        try {
            LogsArchive result = apiInstance.getLogsArchive(archiveId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#getLogsArchive");
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
 **archiveId** | **String**| The ID of the archive. |

### Return type

[**LogsArchive**](LogsArchive.md)

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
| **404** | Not found |  -  |


## getLogsArchiveOrder

> LogsArchiveOrder getLogsArchiveOrder();

Get the current order of your archives.
This endpoint takes no JSON arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        try {
            LogsArchiveOrder result = apiInstance.getLogsArchiveOrder();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#getLogsArchiveOrder");
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

[**LogsArchiveOrder**](LogsArchiveOrder.md)

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


## listArchiveReadRoles

> RolesResponse listArchiveReadRoles(archiveId);

Returns all read roles a given archive is restricted to.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        try {
            RolesResponse result = apiInstance.listArchiveReadRoles(archiveId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#listArchiveReadRoles");
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
 **archiveId** | **String**| The ID of the archive. |

### Return type

[**RolesResponse**](RolesResponse.md)

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
| **404** | Not found |  -  |


## listLogsArchives

> LogsArchives listLogsArchives();

Get the list of configured logs archives with their definitions.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        try {
            LogsArchives result = apiInstance.listLogsArchives();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#listLogsArchives");
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

[**LogsArchives**](LogsArchives.md)

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


## removeRoleFromArchive

> removeRoleFromArchive(archiveId, body);

Removes a role from an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        RelationshipToRole body = new RelationshipToRole(); // RelationshipToRole | 
        try {
            apiInstance.removeRoleFromArchive(archiveId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#removeRoleFromArchive");
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
 **archiveId** | **String**| The ID of the archive. |
 **body** | [**RelationshipToRole**](RelationshipToRole.md)|  |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## updateLogsArchive

> LogsArchive updateLogsArchive(archiveId, body);

Update a given archive configuration.

**Note**: Using this method updates your archive configuration by **replacing**
your current configuration with the new one sent to your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        String archiveId = "archiveId_example"; // String | The ID of the archive.
        LogsArchiveCreateRequest body = new LogsArchiveCreateRequest(); // LogsArchiveCreateRequest | New definition of the archive.
        try {
            LogsArchive result = apiInstance.updateLogsArchive(archiveId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#updateLogsArchive");
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
 **archiveId** | **String**| The ID of the archive. |
 **body** | [**LogsArchiveCreateRequest**](LogsArchiveCreateRequest.md)| New definition of the archive. |

### Return type

[**LogsArchive**](LogsArchive.md)

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
| **404** | Not found |  -  |


## updateLogsArchiveOrder

> LogsArchiveOrder updateLogsArchiveOrder(body);

Update the order of your archives. Since logs are processed sequentially, reordering an archive may change
the structure and content of the data processed by other archives.

**Note**: Using the `PUT` method updates your archive's order by replacing the current order
with the new one.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        LogsArchiveOrder body = new LogsArchiveOrder(); // LogsArchiveOrder | An object containing the new ordered list of archive IDs.
        try {
            LogsArchiveOrder result = apiInstance.updateLogsArchiveOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsArchivesApi#updateLogsArchiveOrder");
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
 **body** | [**LogsArchiveOrder**](LogsArchiveOrder.md)| An object containing the new ordered list of archive IDs. |

### Return type

[**LogsArchiveOrder**](LogsArchiveOrder.md)

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
| **422** | Unprocessable Entity |  -  |

