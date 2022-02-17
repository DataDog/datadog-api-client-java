# ServiceAccountsApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                                                             | HTTP request                                                                           | Description                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------- |
| [**createServiceAccountApplicationKey**](ServiceAccountsApi.md#createServiceAccountApplicationKey) | **POST** /api/v2/service_accounts/{service_account_id}/application_keys                | Create an application key for this service account |
| [**deleteServiceAccountApplicationKey**](ServiceAccountsApi.md#deleteServiceAccountApplicationKey) | **DELETE** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id} | Delete an application key for this service account |
| [**getServiceAccountApplicationKey**](ServiceAccountsApi.md#getServiceAccountApplicationKey)       | **GET** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}    | Get one application key for this service account   |
| [**listServiceAccountApplicationKeys**](ServiceAccountsApi.md#listServiceAccountApplicationKeys)   | **GET** /api/v2/service_accounts/{service_account_id}/application_keys                 | List application keys for this service account     |
| [**updateServiceAccountApplicationKey**](ServiceAccountsApi.md#updateServiceAccountApplicationKey) | **PATCH** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}  | Edit an application key for this service account   |

## createServiceAccountApplicationKey

> ApplicationKeyResponse createServiceAccountApplicationKey(serviceAccountId, body);

Create an application key for this service account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        ApplicationKeyCreateRequest body = new ApplicationKeyCreateRequest(); // ApplicationKeyCreateRequest |
        try {
            ApplicationKeyResponse result = apiInstance.createServiceAccountApplicationKey(serviceAccountId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#createServiceAccountApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type                                                              | Description                    | Notes |
| -------------------- | ----------------------------------------------------------------- | ------------------------------ | ----- |
| **serviceAccountId** | **String**                                                        | The ID of the service account. |
| **body**             | [**ApplicationKeyCreateRequest**](ApplicationKeyCreateRequest.md) |                                |

### Return type

[**ApplicationKeyResponse**](ApplicationKeyResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **201**     | Created           | -                |
| **400**     | Bad Request       | -                |
| **403**     | Forbidden         | -                |
| **429**     | Too many requests | -                |

## deleteServiceAccountApplicationKey

> deleteServiceAccountApplicationKey(serviceAccountId, appKeyId);

Delete an application key owned by this service account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            apiInstance.deleteServiceAccountApplicationKey(serviceAccountId, appKeyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#deleteServiceAccountApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type       | Description                    | Notes |
| -------------------- | ---------- | ------------------------------ | ----- |
| **serviceAccountId** | **String** | The ID of the service account. |
| **appKeyId**         | **String** | The ID of the application key. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **204**     | No Content        | -                |
| **403**     | Forbidden         | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |

## getServiceAccountApplicationKey

> PartialApplicationKeyResponse getServiceAccountApplicationKey(serviceAccountId, appKeyId);

Get an application key owned by this service account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            PartialApplicationKeyResponse result = apiInstance.getServiceAccountApplicationKey(serviceAccountId, appKeyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#getServiceAccountApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type       | Description                    | Notes |
| -------------------- | ---------- | ------------------------------ | ----- |
| **serviceAccountId** | **String** | The ID of the service account. |
| **appKeyId**         | **String** | The ID of the application key. |

### Return type

[**PartialApplicationKeyResponse**](PartialApplicationKeyResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **403**     | Forbidden         | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |

## listServiceAccountApplicationKeys

> ListApplicationKeysResponse listServiceAccountApplicationKeys(serviceAccountId, parameters);

List all application keys available for this service account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        ApplicationKeysSort sort = ApplicationKeysSort.fromValue("created_at"); // ApplicationKeysSort | Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign.
        String filter = "filter_example"; // String | Filter application keys by the specified string.
        String filterCreatedAtStart = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or after the specified date.
        String filterCreatedAtEnd = "2020-11-24T18:46:21+00:00"; // String | Only include application keys created on or before the specified date.
        try {
            ListApplicationKeysResponse result = apiInstance.listServiceAccountApplicationKeys(serviceAccountId, new ServiceAccountsApi.ListServiceAccountApplicationKeysOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .filterCreatedAtStart(filterCreatedAtStart)
                .filterCreatedAtEnd(filterCreatedAtEnd));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#listServiceAccountApplicationKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                     | Type                    | Description                                                                                                                                                        | Notes                                                                                    |
| ------------------------ | ----------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------- |
| **serviceAccountId**     | **String**              | The ID of the service account.                                                                                                                                     |
| **pageSize**             | **Long**                | Size for a given page.                                                                                                                                             | [optional] [default to 10]                                                               |
| **pageNumber**           | **Long**                | Specific page number to return.                                                                                                                                    | [optional] [default to 0]                                                                |
| **sort**                 | **ApplicationKeysSort** | Application key attribute used to sort results. Sort order is ascending by default. In order to specify a descending sort, prefix the attribute with a minus sign. | [optional] [default to name] [enum: created_at, -created_at, last4, -last4, name, -name] |
| **filter**               | **String**              | Filter application keys by the specified string.                                                                                                                   | [optional]                                                                               |
| **filterCreatedAtStart** | **String**              | Only include application keys created on or after the specified date.                                                                                              | [optional]                                                                               |
| **filterCreatedAtEnd**   | **String**              | Only include application keys created on or before the specified date.                                                                                             | [optional]                                                                               |

### Return type

[**ListApplicationKeysResponse**](ListApplicationKeysResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Forbidden         | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |

## updateServiceAccountApplicationKey

> PartialApplicationKeyResponse updateServiceAccountApplicationKey(serviceAccountId, appKeyId, body);

Edit an application key owned by this service account.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        ApplicationKeyUpdateRequest body = new ApplicationKeyUpdateRequest(); // ApplicationKeyUpdateRequest |
        try {
            PartialApplicationKeyResponse result = apiInstance.updateServiceAccountApplicationKey(serviceAccountId, appKeyId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#updateServiceAccountApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type                                                              | Description                    | Notes |
| -------------------- | ----------------------------------------------------------------- | ------------------------------ | ----- |
| **serviceAccountId** | **String**                                                        | The ID of the service account. |
| **appKeyId**         | **String**                                                        | The ID of the application key. |
| **body**             | [**ApplicationKeyUpdateRequest**](ApplicationKeyUpdateRequest.md) |                                |

### Return type

[**PartialApplicationKeyResponse**](PartialApplicationKeyResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Forbidden         | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |
