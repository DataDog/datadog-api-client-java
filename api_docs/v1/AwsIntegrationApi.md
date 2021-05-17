# AwsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS integration
[**createAWSTagFilter**](AwsIntegrationApi.md#createAWSTagFilter) | **POST** /api/v1/integration/aws/filtering | Set an AWS tag filter
[**createNewAWSExternalID**](AwsIntegrationApi.md#createNewAWSExternalID) | **PUT** /api/v1/integration/aws/generate_new_external_id | Generate a new external ID
[**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS integration
[**deleteAWSTagFilter**](AwsIntegrationApi.md#deleteAWSTagFilter) | **DELETE** /api/v1/integration/aws/filtering | Delete a tag filtering entry
[**listAWSAccounts**](AwsIntegrationApi.md#listAWSAccounts) | **GET** /api/v1/integration/aws | List all AWS integrations
[**listAWSTagFilters**](AwsIntegrationApi.md#listAWSTagFilters) | **GET** /api/v1/integration/aws/filtering | Get all AWS tag filters
[**listAvailableAWSNamespaces**](AwsIntegrationApi.md#listAvailableAWSNamespaces) | **GET** /api/v1/integration/aws/available_namespace_rules | List namespace rules
[**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS integration



## createAWSAccount

> AWSAccountCreateResponse createAWSAccount(body);

Create a Datadog-Amazon Web Services integration.
Using the `POST` method updates your integration configuration
by adding your new configuration to the existing one in your Datadog organization.
A unique AWS Account ID for role based authentication.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS Request Object
        try {
            AWSAccountCreateResponse result = apiInstance.createAWSAccount(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
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
 **body** | [**AWSAccount**](AWSAccount.md)| AWS Request Object |

### Return type

[**AWSAccountCreateResponse**](AWSAccountCreateResponse.md)

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
| **409** | Conflict Error |  -  |


## createAWSTagFilter

> Object createAWSTagFilter(body);

Set an AWS tag filter.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSTagFilterCreateRequest body = new AWSTagFilterCreateRequest(); // AWSTagFilterCreateRequest | Set an AWS tag filter using an `aws_account_identifier`, `namespace`, and filtering string. Namespace options are `application_elb`, `elb`, `lambda`, `network_elb`, `rds`, `sqs`, and `custom`.
        try {
            Object result = apiInstance.createAWSTagFilter(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createAWSTagFilter");
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
 **body** | [**AWSTagFilterCreateRequest**](AWSTagFilterCreateRequest.md)| Set an AWS tag filter using an &#x60;aws_account_identifier&#x60;, &#x60;namespace&#x60;, and filtering string. Namespace options are &#x60;application_elb&#x60;, &#x60;elb&#x60;, &#x60;lambda&#x60;, &#x60;network_elb&#x60;, &#x60;rds&#x60;, &#x60;sqs&#x60;, and &#x60;custom&#x60;. |

### Return type

**Object**

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


## createNewAWSExternalID

> AWSAccountCreateResponse createNewAWSExternalID(body);

Generate a new AWS external ID for a given AWS account ID and role name pair.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | Your Datadog role delegation name. For more information about your AWS account Role name, see the [Datadog AWS integration configuration info](https://github.com/DataDog/documentation/blob/master/integrations/amazon_web_services/#installation).
        try {
            AWSAccountCreateResponse result = apiInstance.createNewAWSExternalID(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createNewAWSExternalID");
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
 **body** | [**AWSAccount**](AWSAccount.md)| Your Datadog role delegation name. For more information about your AWS account Role name, see the [Datadog AWS integration configuration info](https://github.com/DataDog/documentation/blob/master/integrations/amazon_web_services/#installation). |

### Return type

[**AWSAccountCreateResponse**](AWSAccountCreateResponse.md)

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


## deleteAWSAccount

> Object deleteAWSAccount(body);

Delete a Datadog-AWS integration matching the specified `account_id` and `role_name parameters`.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        try {
            Object result = apiInstance.deleteAWSAccount(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#deleteAWSAccount");
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
 **body** | [**AWSAccount**](AWSAccount.md)| AWS request object |

### Return type

**Object**

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
| **409** | Conflict Error |  -  |


## deleteAWSTagFilter

> Object deleteAWSTagFilter(body);

Delete a tag filtering entry.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSTagFilterDeleteRequest body = new AWSTagFilterDeleteRequest(); // AWSTagFilterDeleteRequest | Delete a tag filtering entry for a given AWS account and `dd-aws` namespace.
        try {
            Object result = apiInstance.deleteAWSTagFilter(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#deleteAWSTagFilter");
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
 **body** | [**AWSTagFilterDeleteRequest**](AWSTagFilterDeleteRequest.md)| Delete a tag filtering entry for a given AWS account and &#x60;dd-aws&#x60; namespace. |

### Return type

**Object**

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


## listAWSAccounts

> AWSAccountListResponse listAWSAccounts(parameters);

List all Datadog-AWS integrations available in your Datadog organization.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        String accountId = "accountId_example"; // String | Only return AWS accounts that matches this `account_id`.
        String roleName = "roleName_example"; // String | Only return AWS accounts that matches this role_name.
        String accessKeyId = "accessKeyId_example"; // String | Only return AWS accounts that matches this `access_key_id`.
        try {
	    AWSAccountListResponse result = apiInstance.listAWSAccounts(new AwsIntegrationApi.ListAWSAccountsOptionalParameters()
                .accountId(accountId)
                .roleName(roleName)
                .accessKeyId(accessKeyId));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#listAWSAccounts");
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
 **accountId** | **String**| Only return AWS accounts that matches this &#x60;account_id&#x60;. | [optional]
 **roleName** | **String**| Only return AWS accounts that matches this role_name. | [optional]
 **accessKeyId** | **String**| Only return AWS accounts that matches this &#x60;access_key_id&#x60;. | [optional]

### Return type

[**AWSAccountListResponse**](AWSAccountListResponse.md)

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


## listAWSTagFilters

> AWSTagFilterListResponse listAWSTagFilters(accountId);

Get all AWS tag filters.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        String accountId = "accountId_example"; // String | Only return AWS filters that matches this `account_id`.
        try {
            AWSTagFilterListResponse result = apiInstance.listAWSTagFilters(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#listAWSTagFilters");
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
 **accountId** | **String**| Only return AWS filters that matches this &#x60;account_id&#x60;. |

### Return type

[**AWSTagFilterListResponse**](AWSTagFilterListResponse.md)

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


## listAvailableAWSNamespaces

> List&lt;String&gt; listAvailableAWSNamespaces();

List all namespace rules for a given Datadog-AWS integration. This endpoint takes no arguments.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        try {
            List<String> result = apiInstance.listAvailableAWSNamespaces();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#listAvailableAWSNamespaces");
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

**List&lt;String&gt;**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication Error |  -  |


## updateAWSAccount

> Object updateAWSAccount(body, parameters);

Update a Datadog-Amazon Web Services integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        String accountId = "accountId_example"; // String | Only return AWS accounts that matches this `account_id`.
        String roleName = "roleName_example"; // String | Only return AWS accounts that match this `role_name`. Required if `account_id` is specified.
        String accessKeyId = "accessKeyId_example"; // String | Only return AWS accounts that matches this `access_key_id`. Required if none of the other two options are specified.
        try {
	    Object result = apiInstance.updateAWSAccount(body, new AwsIntegrationApi.UpdateAWSAccountOptionalParameters()
                .accountId(accountId)
                .roleName(roleName)
                .accessKeyId(accessKeyId));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
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
 **body** | [**AWSAccount**](AWSAccount.md)| AWS request object |
 **accountId** | **String**| Only return AWS accounts that matches this &#x60;account_id&#x60;. | [optional]
 **roleName** | **String**| Only return AWS accounts that match this &#x60;role_name&#x60;. Required if &#x60;account_id&#x60; is specified. | [optional]
 **accessKeyId** | **String**| Only return AWS accounts that matches this &#x60;access_key_id&#x60;. Required if none of the other two options are specified. | [optional]

### Return type

**Object**

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
| **409** | Conflict Error |  -  |

