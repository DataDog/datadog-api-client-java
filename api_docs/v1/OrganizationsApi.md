# OrganizationsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createChildOrg**](OrganizationsApi.md#createChildOrg) | **POST** /api/v1/org | Create a child organization
[**getOrg**](OrganizationsApi.md#getOrg) | **GET** /api/v1/org/{public_id} | Get organization information
[**listOrgs**](OrganizationsApi.md#listOrgs) | **GET** /api/v1/org | List your managed organizations
[**updateOrg**](OrganizationsApi.md#updateOrg) | **PUT** /api/v1/org/{public_id} | Update your organization
[**uploadIdPForOrg**](OrganizationsApi.md#uploadIdPForOrg) | **POST** /api/v1/org/{public_id}/idp_metadata | Upload IdP metadata



## createChildOrg

> OrganizationCreateResponse createChildOrg(body);

Create a child organization.

This endpoint requires the
[multi-organization account](https://docs.datadoghq.com/account_management/multi_organization/)
feature and must be enabled by
[contacting support](https://docs.datadoghq.com/help/).

Once a new child organization is created, you can interact with it
by using the `org.public_id`, `pi_key.key`, and
`application_key.hash` provided in the response.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        OrganizationCreateBody body = new OrganizationCreateBody(); // OrganizationCreateBody | Organization object that needs to be created
        try {
            OrganizationCreateResponse result = apiInstance.createChildOrg(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#createChildOrg");
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
 **body** | [**OrganizationCreateBody**](OrganizationCreateBody.md)| Organization object that needs to be created |

### Return type

[**OrganizationCreateResponse**](OrganizationCreateResponse.md)

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


## getOrg

> OrganizationResponse getOrg(publicId);

Get organization information.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String publicId = "abc123"; // String | The `public_id` of the organization you are operating within.
        try {
            OrganizationResponse result = apiInstance.getOrg(publicId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getOrg");
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
 **publicId** | **String**| The &#x60;public_id&#x60; of the organization you are operating within. |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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


## listOrgs

> OrganizationListResponse listOrgs();

List your managed organizations.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        try {
            OrganizationListResponse result = apiInstance.listOrgs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listOrgs");
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

[**OrganizationListResponse**](OrganizationListResponse.md)

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


## updateOrg

> OrganizationResponse updateOrg(publicId, body);

Update your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String publicId = "abc123"; // String | The `public_id` of the organization you are operating within.
        Organization body = new Organization(); // Organization | 
        try {
            OrganizationResponse result = apiInstance.updateOrg(publicId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#updateOrg");
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
 **publicId** | **String**| The &#x60;public_id&#x60; of the organization you are operating within. |
 **body** | [**Organization**](Organization.md)|  |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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


## uploadIdPForOrg

> IdpResponse uploadIdPForOrg(publicId, idpFile);

There are a couple of options for updating the Identity Provider (IdP)
metadata from your SAML IdP.

* **Multipart Form-Data**: Post the IdP metadata file using a form post.

* **XML Body:** Post the IdP metadata file as the body of the request.

### Example

```java
import java.io.File;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String publicId = "abc123"; // String | The `public_id` of the organization you are operating with
        File idpFile = new File("/path/to/file"); // File | The path to the XML metadata file you wish to upload.
        try {
            IdpResponse result = apiInstance.uploadIdPForOrg(publicId, idpFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#uploadIdPForOrg");
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
 **publicId** | **String**| The &#x60;public_id&#x60; of the organization you are operating with |
 **idpFile** | **File**| The path to the XML metadata file you wish to upload. |

### Return type

[**IdpResponse**](IdpResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |

