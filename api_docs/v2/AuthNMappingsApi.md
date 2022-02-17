# AuthNMappingsApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                           | HTTP request                                         | Description                  |
| ---------------------------------------------------------------- | ---------------------------------------------------- | ---------------------------- |
| [**createAuthNMapping**](AuthNMappingsApi.md#createAuthNMapping) | **POST** /api/v2/authn_mappings                      | Create an AuthN Mapping      |
| [**deleteAuthNMapping**](AuthNMappingsApi.md#deleteAuthNMapping) | **DELETE** /api/v2/authn_mappings/{authn_mapping_id} | Delete an AuthN Mapping      |
| [**getAuthNMapping**](AuthNMappingsApi.md#getAuthNMapping)       | **GET** /api/v2/authn_mappings/{authn_mapping_id}    | Get an AuthN Mapping by UUID |
| [**listAuthNMappings**](AuthNMappingsApi.md#listAuthNMappings)   | **GET** /api/v2/authn_mappings                       | List all AuthN Mappings      |
| [**updateAuthNMapping**](AuthNMappingsApi.md#updateAuthNMapping) | **PATCH** /api/v2/authn_mappings/{authn_mapping_id}  | Edit an AuthN Mapping        |

## createAuthNMapping

> AuthNMappingResponse createAuthNMapping(body);

Create an AuthN Mapping.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        AuthNMappingCreateRequest body = new AuthNMappingCreateRequest(); // AuthNMappingCreateRequest |
        try {
            AuthNMappingResponse result = apiInstance.createAuthNMapping(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#createAuthNMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                          | Description | Notes |
| -------- | ------------------------------------------------------------- | ----------- | ----- |
| **body** | [**AuthNMappingCreateRequest**](AuthNMappingCreateRequest.md) |             |

### Return type

[**AuthNMappingResponse**](AuthNMappingResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication Error | -                |
| **404**     | Not Found            | -                |
| **429**     | Too many requests    | -                |

## deleteAuthNMapping

> deleteAuthNMapping(authnMappingId);

Delete an AuthN Mapping specified by AuthN Mapping UUID.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        String authnMappingId = "authnMappingId_example"; // String | The UUID of the AuthN Mapping.
        try {
            apiInstance.deleteAuthNMapping(authnMappingId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#deleteAuthNMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name               | Type       | Description                    | Notes |
| ------------------ | ---------- | ------------------------------ | ----- |
| **authnMappingId** | **String** | The UUID of the AuthN Mapping. |

### Return type

null (empty response body)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **204**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **404**     | Not Found            | -                |
| **429**     | Too many requests    | -                |

## getAuthNMapping

> AuthNMappingResponse getAuthNMapping(authnMappingId);

Get an AuthN Mapping specified by the AuthN Mapping UUID.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        String authnMappingId = "authnMappingId_example"; // String | The UUID of the AuthN Mapping.
        try {
            AuthNMappingResponse result = apiInstance.getAuthNMapping(authnMappingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#getAuthNMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name               | Type       | Description                    | Notes |
| ------------------ | ---------- | ------------------------------ | ----- |
| **authnMappingId** | **String** | The UUID of the AuthN Mapping. |

### Return type

[**AuthNMappingResponse**](AuthNMappingResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **404**     | Not Found            | -                |
| **429**     | Too many requests    | -                |

## listAuthNMappings

> AuthNMappingsResponse listAuthNMappings(parameters);

List all AuthN Mappings in the org.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        AuthNMappingsSort sort = AuthNMappingsSort.fromValue("created_at"); // AuthNMappingsSort | Sort AuthN Mappings depending on the given field.
        List<String> include = Arrays.asList(); // List<String> | Include additional information in the response.
        String filter = "filter_example"; // String | Filter all mappings by the given string.
        try {
            AuthNMappingsResponse result = apiInstance.listAuthNMappings(new AuthNMappingsApi.ListAuthNMappingsOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .include(include)
                .filter(filter));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#listAuthNMappings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name           | Type                   | Description                                       | Notes                                                                                                                                                                                                                                                                                                                 |
| -------------- | ---------------------- | ------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **pageSize**   | **Long**               | Size for a given page.                            | [optional] [default to 10]                                                                                                                                                                                                                                                                                            |
| **pageNumber** | **Long**               | Specific page number to return.                   | [optional] [default to 0]                                                                                                                                                                                                                                                                                             |
| **sort**       | **AuthNMappingsSort**  | Sort AuthN Mappings depending on the given field. | [optional] [enum: created_at, -created_at, role_id, -role_id, saml_assertion_attribute_id, -saml_assertion_attribute_id, role.name, -role.name, saml_assertion_attribute.attribute_key, -saml_assertion_attribute.attribute_key, saml_assertion_attribute.attribute_value, -saml_assertion_attribute.attribute_value] |
| **include**    | **List&lt;String&gt;** | Include additional information in the response.   | [optional]                                                                                                                                                                                                                                                                                                            |
| **filter**     | **String**             | Filter all mappings by the given string.          | [optional]                                                                                                                                                                                                                                                                                                            |

### Return type

[**AuthNMappingsResponse**](AuthNMappingsResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **403**     | Authentication Error | -                |
| **429**     | Too many requests    | -                |

## updateAuthNMapping

> AuthNMappingResponse updateAuthNMapping(authnMappingId, body);

Edit an AuthN Mapping.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        String authnMappingId = "authnMappingId_example"; // String | The UUID of the AuthN Mapping.
        AuthNMappingUpdateRequest body = new AuthNMappingUpdateRequest(); // AuthNMappingUpdateRequest |
        try {
            AuthNMappingResponse result = apiInstance.updateAuthNMapping(authnMappingId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#updateAuthNMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name               | Type                                                          | Description                    | Notes |
| ------------------ | ------------------------------------------------------------- | ------------------------------ | ----- |
| **authnMappingId** | **String**                                                    | The UUID of the AuthN Mapping. |
| **body**           | [**AuthNMappingUpdateRequest**](AuthNMappingUpdateRequest.md) |                                |

### Return type

[**AuthNMappingResponse**](AuthNMappingResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description          | Response headers |
| ----------- | -------------------- | ---------------- |
| **200**     | OK                   | -                |
| **400**     | Bad Request          | -                |
| **403**     | Authentication Error | -                |
| **404**     | Not Found            | -                |
| **409**     | Conflict             | -                |
| **422**     | Unprocessable Entity | -                |
| **429**     | Too many requests    | -                |
