# AwsIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount) | **POST** /v1/integration/aws | Create an AWS Account
[**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /v1/integration/aws | Delete an AWS Account
[**getAllAWSAccounts**](AwsIntegrationApi.md#getAllAWSAccounts) | **GET** /v1/integration/aws | Get Installed AWS Accounts
[**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount) | **PUT** /v1/integration/aws | Update an AWS Account


<a name="createAWSAccount"></a>
# **createAWSAccount**
> Map&lt;String, String&gt; createAWSAccount(awSAccount)

Create an AWS Account

### Overview Create the AWS Account with the provided values * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.

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
      Map<String, String> result = apiInstance.createAWSAccount(awSAccount);
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

**Map&lt;String, String&gt;**

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |

<a name="deleteAWSAccount"></a>
# **deleteAWSAccount**
> Object deleteAWSAccount(accountId, roleName)

Delete an AWS Account

### Overview Delete the AWS Account matching the specified account_id and role_name parameters ### ARGUMENTS * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this account_id.&#39; * **&#x60;role_name&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this role_name.&#39;

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
    String accountId = "accountId_example"; // String | 
    String roleName = "roleName_example"; // String | 
    try {
      Object result = apiInstance.deleteAWSAccount(accountId, roleName);
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
 **accountId** | **String**|  |
 **roleName** | **String**|  |

### Return type

**Object**

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Item Not Found |  -  |

<a name="getAllAWSAccounts"></a>
# **getAllAWSAccounts**
> Map&lt;String, List&lt;Object&gt;&gt; getAllAWSAccounts(accountId, roleName, accessKeyId)

Get Installed AWS Accounts

### Overview Get All Installed AWS Accounts ### ARGUMENTS * **&#x60;account_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.&#39; * **&#x60;role_name&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.&#39; * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.&#39;

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
    String accountId = "accountId_example"; // String | 
    String roleName = "roleName_example"; // String | 
    String accessKeyId = "accessKeyId_example"; // String | 
    try {
      Map<String, List<Object>> result = apiInstance.getAllAWSAccounts(accountId, roleName, accessKeyId);
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
 **accountId** | **String**|  | [optional]
 **roleName** | **String**|  | [optional]
 **accessKeyId** | **String**|  | [optional]

### Return type

[**Map&lt;String, List&lt;Object&gt;&gt;**](List.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**404** | Item Not Found |  -  |

<a name="updateAWSAccount"></a>
# **updateAWSAccount**
> Object updateAWSAccount(awSAccount)

Update an AWS Account

### Overview Update the AWS Account based on the provided values ### ARGUMENTS * **&#x60;account_id&#x60;** [*required if role_name is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.&#39; * **&#x60;role_name&#x60;** [*required if account_id is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.&#39; * **&#x60;access_key_id&#x60;** [*required if none of the other two options are specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.&#39;  ### Payload * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID. * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info. * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID. * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration. * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.

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
      Object result = apiInstance.updateAWSAccount(awSAccount);
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
**200** | OK |  -  |
**400** | Bad Request |  -  |

