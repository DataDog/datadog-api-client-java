# AwsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS Account
[**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS Account
[**generateNewAWSExternalID**](AwsIntegrationApi.md#generateNewAWSExternalID) | **PUT** /api/v1/integration/aws/generate_new_external_id | Generate New External ID
[**getAllAWSAccounts**](AwsIntegrationApi.md#getAllAWSAccounts) | **GET** /api/v1/integration/aws | Get Installed AWS Accounts
[**listAvailableAWSNamespaces**](AwsIntegrationApi.md#listAvailableAWSNamespaces) | **GET** /api/v1/integration/aws/available_namespace_rules | List available namespaces.
[**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS Account



## createAWSAccount

> AWSAccountCreateResponse createAWSAccount().body(body).execute();

Create an AWS Account

### Overview
Create the AWS Account with the provided values
### Arguments
* **`account_id`** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS
  integration to learn more about your AWS account ID.

* **`role_name`** [*required*]: Your Datadog role delegation name. For more information about you
  AWS account Role name, see the Datadog AWS integration configuration info.

* **`access_key_id`** [*optional*, *default* = **None**]: If your AWS account is a GovCloud or
  China account, enter the corresponding Access Key ID.

* **`filter_tags`** [*optional*, *default* = **None**]: The array of EC2 tags (in the form key:value)
  defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?
  (for single characters) and * (for multiple characters) can also be used. Only hosts that match one
  of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given
  tag can also be excluded by adding ! before the tag.
  e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,
  see the AWS tagging documentation

* **`host_tags`** [*optional*, *default* = **None**]: Array of tags (in the form key:value) to add
  to all hosts and metrics reporting through this integration.

* **`account_specific_namespace_rules`** [*optional*, *default* = **None**]: An object (in the form
  {"namespace1":true/false, "namespace2":true/false}) that enables or disables metric collection for
  specific AWS namespaces for this AWS account only. A list of namespaces can be found at the
  /v1/integration/aws/available_namespace_rules endpoint.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        try {
            AWSAccountCreateResponse result = api.createAWSAccount()
                .body(body)
                .execute();
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
 **body** | [**AWSAccount**](AWSAccount.md)| AWS request object |

### Return type

[**AWSAccountCreateResponse**](AWSAccountCreateResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## deleteAWSAccount

> Object deleteAWSAccount().body(body).execute();

Delete an AWS Account

### Overview
Delete the AWS Account matching the specified account_id and role_name parameters
### Arguments
* **`account_id`** [*required*, *default* = **None**]: Delete the AWS account that
  matches this account_id.

* **`role_name`** [*required*, *default* = **None**]: Delete the AWS account that
  matches this role_name.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        try {
            Object result = api.deleteAWSAccount()
                .body(body)
                .execute();
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## generateNewAWSExternalID

> AWSAccountCreateResponse generateNewAWSExternalID().body(body).execute();

Generate New External ID

###Overview
Generate new AWS external ID for a specific integrated account
### Arguments
* **`account_id`** [*required*]: Generate new external ID for the AWS account that
  matches this account_id.

* **`role_name`** [*required*]: Generate new external ID for the AWS account that
  matches this role_name.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | Generate New AWS External ID request object
        try {
            AWSAccountCreateResponse result = api.generateNewAWSExternalID()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#generateNewAWSExternalID");
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
 **body** | [**AWSAccount**](AWSAccount.md)| Generate New AWS External ID request object |

### Return type

[**AWSAccountCreateResponse**](AWSAccountCreateResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## getAllAWSAccounts

> AWSAccountListResponse getAllAWSAccounts().accountId(accountId).roleName(roleName).accessKeyId(accessKeyId).execute();

Get Installed AWS Accounts

### Overview
Get All Installed AWS Accounts
### Arguments
* **`account_id`** [*optional*, *default* = **None**]: Only return AWS accounts that
  matches this account_id.

* **`role_name`** [*optional*, *default* = **None**]: Only return AWS accounts that
  matches this role_name.

* **`access_key_id`** [*optional*, *default* = **None**]: Only return AWS accounts that
  matches this access_key_id.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        String accountId = "accountId_example"; // String | Only return AWS accounts that matches this account_id.
        String roleName = "roleName_example"; // String | Only return AWS accounts that matches this role_name.
        String accessKeyId = "accessKeyId_example"; // String | Only return AWS accounts that matches this access_key_id.
        try {
            AWSAccountListResponse result = api.getAllAWSAccounts()
                .accountId(accountId)
                .roleName(roleName)
                .accessKeyId(accessKeyId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#getAllAWSAccounts");
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
 **accountId** | **String**| Only return AWS accounts that matches this account_id. | [optional]
 **roleName** | **String**| Only return AWS accounts that matches this role_name. | [optional]
 **accessKeyId** | **String**| Only return AWS accounts that matches this access_key_id. | [optional]

### Return type

[**AWSAccountListResponse**](AWSAccountListResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## listAvailableAWSNamespaces

> List&lt;String&gt; listAvailableAWSNamespaces().execute();

List available namespaces.

### Overview
List all namespace rules for a given Datadog-AWS integration.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        try {
            List<String> result = api.listAvailableAWSNamespaces()
                .execute();
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

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## updateAWSAccount

> Object updateAWSAccount().body(body).accountId(accountId).roleName(roleName).accessKeyId(accessKeyId).execute();

Update an AWS Account

### Overview
Update the AWS Account based on the provided values
### Arguments
* **`account_id`** [*required if role_name is specified*, *default* = **None**]: Only return AWS accounts that
  matches this account_id.

* **`role_name`** [*required if account_id is specified*, *default* = **None**]: Only return AWS accounts that
  matches this role_name.

* **`access_key_id`** [*required if none of the other two options are specified*, *default* = **None**]: Only return AWS accounts that
  matches this access_key_id.

### Payload
* **`account_id`** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS
  integration to learn more about your AWS account ID.

* **`role_name`** [*required*]: Your Datadog role delegation name. For more information about you
  AWS account Role name, see the Datadog AWS integration configuration info.

* **`access_key_id`** [*optional*, *default* = **None**]: If your AWS account is a GovCloud or
  China account, enter the corresponding Access Key ID.

* **`filter_tags`** [*optional*, *default* = **None**]: The array of EC2 tags (in the form key:value)
  defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?
  (for single characters) and * (for multiple characters) can also be used. Only hosts that match one
  of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given
  tag can also be excluded by adding ! before the tag.
  e.g. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,
  see the AWS tagging documentation.

* **`host_tags`** [*optional*, *default* = **None**]: Array of tags (in the form key:value) to add
  to all hosts and metrics reporting through this integration.

* **`account_specific_namespace_rules`** [*optional*, *default* = **None**]: An object (in the form
  {"namespace1":true/false, "namespace2":true/false}) that enables or disables metric collection for
  specific AWS namespaces for this AWS account only. A list of namespaces can be found at the
  /v1/integration/aws/available_namespace_rules endpoint.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

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

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        String accountId = "accountId_example"; // String | Only return AWS accounts that matches this account_id.
        String roleName = "roleName_example"; // String | Only return AWS accounts that matches this role_name. *It is required if account_id is specified.*
        String accessKeyId = "accessKeyId_example"; // String | Only return AWS accounts that matches this access_key_id. *It required if none of the other two options are specified.*
        try {
            Object result = api.updateAWSAccount()
                .body(body)
                .accountId(accountId)
                .roleName(roleName)
                .accessKeyId(accessKeyId)
                .execute();
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
 **accountId** | **String**| Only return AWS accounts that matches this account_id. | [optional]
 **roleName** | **String**| Only return AWS accounts that matches this role_name. *It is required if account_id is specified.* | [optional]
 **accessKeyId** | **String**| Only return AWS accounts that matches this access_key_id. *It required if none of the other two options are specified.* | [optional]

### Return type

**Object**

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |

