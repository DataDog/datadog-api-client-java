# AwsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS Account
[**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS Account
[**getAllAWSAccounts**](AwsIntegrationApi.md#getAllAWSAccounts) | **GET** /api/v1/integration/aws | Get Installed AWS Accounts
[**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS Account



## createAWSAccount

> AWSAccountCreateResponse createAWSAccount(awSAccount)

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
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.AwsIntegrationApi;

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
        AWSAccount awSAccount = new AWSAccount(); // AWSAccount | AWS request object
        try {
            AWSAccountCreateResponse result = apiInstance.createAWSAccount(awSAccount);
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
 **awSAccount** | [**AWSAccount**](AWSAccount.md)| AWS request object |

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


## deleteAWSAccount

> Object deleteAWSAccount(awSAccount)

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
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.AwsIntegrationApi;

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
        AWSAccount awSAccount = new AWSAccount(); // AWSAccount | AWS request object
        try {
            Object result = apiInstance.deleteAWSAccount(awSAccount);
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
 **awSAccount** | [**AWSAccount**](AWSAccount.md)| AWS request object |

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
| **404** | Item Not Found |  -  |


## getAllAWSAccounts

> AWSAccountListResponse getAllAWSAccounts(accountId, roleName, accessKeyId)

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
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.AwsIntegrationApi;

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
            AWSAccountListResponse result = apiInstance.getAllAWSAccounts(accountId, roleName, accessKeyId);
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
| **404** | Item Not Found |  -  |


## updateAWSAccount

> Object updateAWSAccount(awSAccount, accountId, roleName, accessKeyId)

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
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.models.*;
import com.datadog.api.client.v1.api.AwsIntegrationApi;

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
        AWSAccount awSAccount = new AWSAccount(); // AWSAccount | AWS request object
        String accountId = "accountId_example"; // String | 
        String roleName = "roleName_example"; // String | 
        String accessKeyId = "accessKeyId_example"; // String | 
        try {
            Object result = apiInstance.updateAWSAccount(awSAccount, accountId, roleName, accessKeyId);
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
 **awSAccount** | [**AWSAccount**](AWSAccount.md)| AWS request object |
 **accountId** | **String**|  | [optional]
 **roleName** | **String**|  | [optional]
 **accessKeyId** | **String**|  | [optional]

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

