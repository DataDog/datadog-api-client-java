# CloudWorkloadSecurityApi

All URIs are relative to *https://api.datadoghq.com*

| Method                                                                                                       | HTTP request                                                                               | Description                                   |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | --------------------------------------------- |
| [**createCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#createCloudWorkloadSecurityAgentRule) | **POST** /api/v2/security_monitoring/cloud_workload_security/agent_rules                   | Create a Cloud Workload Security Agent rule   |
| [**deleteCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#deleteCloudWorkloadSecurityAgentRule) | **DELETE** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id} | Delete a Cloud Workload Security Agent rule   |
| [**downloadCloudWorkloadPolicyFile**](CloudWorkloadSecurityApi.md#downloadCloudWorkloadPolicyFile)           | **GET** /api/v2/security/cloud_workload/policy/download                                    | Get the latest Cloud Workload Security policy |
| [**getCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#getCloudWorkloadSecurityAgentRule)       | **GET** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}    | Get a Cloud Workload Security Agent rule      |
| [**listCloudWorkloadSecurityAgentRules**](CloudWorkloadSecurityApi.md#listCloudWorkloadSecurityAgentRules)   | **GET** /api/v2/security_monitoring/cloud_workload_security/agent_rules                    | Get all Cloud Workload Security Agent rules   |
| [**updateCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#updateCloudWorkloadSecurityAgentRule) | **PATCH** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}  | Update a Cloud Workload Security Agent rule   |

## createCloudWorkloadSecurityAgentRule

> CloudWorkloadSecurityAgentRuleResponse createCloudWorkloadSecurityAgentRule(body);

Create a new Agent rule with the given parameters.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        CloudWorkloadSecurityAgentRuleCreateRequest body = new CloudWorkloadSecurityAgentRuleCreateRequest(); // CloudWorkloadSecurityAgentRuleCreateRequest | The definition of the new Agent rule.
        try {
            CloudWorkloadSecurityAgentRuleResponse result = apiInstance.createCloudWorkloadSecurityAgentRule(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#createCloudWorkloadSecurityAgentRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type                                                                                              | Description                           | Notes |
| -------- | ------------------------------------------------------------------------------------------------- | ------------------------------------- | ----- |
| **body** | [**CloudWorkloadSecurityAgentRuleCreateRequest**](CloudWorkloadSecurityAgentRuleCreateRequest.md) | The definition of the new Agent rule. |

### Return type

[**CloudWorkloadSecurityAgentRuleResponse**](CloudWorkloadSecurityAgentRuleResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **400**     | Bad Request       | -                |
| **403**     | Not Authorized    | -                |
| **409**     | Conflict          | -                |
| **429**     | Too many requests | -                |

## deleteCloudWorkloadSecurityAgentRule

> deleteCloudWorkloadSecurityAgentRule(agentRuleId);

Delete a specific Agent rule.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        String agentRuleId = "3b5-v82-ns6"; // String | The ID of the Agent rule.
        try {
            apiInstance.deleteCloudWorkloadSecurityAgentRule(agentRuleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#deleteCloudWorkloadSecurityAgentRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type       | Description               | Notes |
| --------------- | ---------- | ------------------------- | ----- |
| **agentRuleId** | **String** | The ID of the Agent rule. |

### Return type

null (empty response body)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **204**     | OK                | -                |
| **403**     | Not Authorized    | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |

## downloadCloudWorkloadPolicyFile

> File downloadCloudWorkloadPolicyFile();

The download endpoint generates a Cloud Workload Security policy file from your currently active
Cloud Workload Security rules, and downloads them as a .policy file. This file can then be deployed to
your agents to update the policy running in your environment.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        try {
            File result = apiInstance.downloadCloudWorkloadPolicyFile();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#downloadCloudWorkloadPolicyFile");
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

[**File**](File.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/yaml, application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **403**     | Not Authorized    | -                |
| **429**     | Too many requests | -                |

## getCloudWorkloadSecurityAgentRule

> CloudWorkloadSecurityAgentRuleResponse getCloudWorkloadSecurityAgentRule(agentRuleId);

Get the details of a specific Agent rule.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        String agentRuleId = "3b5-v82-ns6"; // String | The ID of the Agent rule.
        try {
            CloudWorkloadSecurityAgentRuleResponse result = apiInstance.getCloudWorkloadSecurityAgentRule(agentRuleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#getCloudWorkloadSecurityAgentRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type       | Description               | Notes |
| --------------- | ---------- | ------------------------- | ----- |
| **agentRuleId** | **String** | The ID of the Agent rule. |

### Return type

[**CloudWorkloadSecurityAgentRuleResponse**](CloudWorkloadSecurityAgentRuleResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **403**     | Not Authorized    | -                |
| **404**     | Not Found         | -                |
| **429**     | Too many requests | -                |

## listCloudWorkloadSecurityAgentRules

> CloudWorkloadSecurityAgentRulesListResponse listCloudWorkloadSecurityAgentRules();

Get the list of Agent rules.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        try {
            CloudWorkloadSecurityAgentRulesListResponse result = apiInstance.listCloudWorkloadSecurityAgentRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#listCloudWorkloadSecurityAgentRules");
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

[**CloudWorkloadSecurityAgentRulesListResponse**](CloudWorkloadSecurityAgentRulesListResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers |
| ----------- | ----------------- | ---------------- |
| **200**     | OK                | -                |
| **403**     | Not Authorized    | -                |
| **429**     | Too many requests | -                |

## updateCloudWorkloadSecurityAgentRule

> CloudWorkloadSecurityAgentRuleResponse updateCloudWorkloadSecurityAgentRule(agentRuleId, body);

Update a specific Agent rule.
Returns the Agent rule object when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        String agentRuleId = "3b5-v82-ns6"; // String | The ID of the Agent rule.
        CloudWorkloadSecurityAgentRuleUpdateRequest body = new CloudWorkloadSecurityAgentRuleUpdateRequest(); // CloudWorkloadSecurityAgentRuleUpdateRequest | New definition of the Agent rule.
        try {
            CloudWorkloadSecurityAgentRuleResponse result = apiInstance.updateCloudWorkloadSecurityAgentRule(agentRuleId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#updateCloudWorkloadSecurityAgentRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type                                                                                              | Description                       | Notes |
| --------------- | ------------------------------------------------------------------------------------------------- | --------------------------------- | ----- |
| **agentRuleId** | **String**                                                                                        | The ID of the Agent rule.         |
| **body**        | [**CloudWorkloadSecurityAgentRuleUpdateRequest**](CloudWorkloadSecurityAgentRuleUpdateRequest.md) | New definition of the Agent rule. |

### Return type

[**CloudWorkloadSecurityAgentRuleResponse**](CloudWorkloadSecurityAgentRuleResponse.md)

### Authorization

[AuthZ](README.md#AuthZ), [apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description             | Response headers |
| ----------- | ----------------------- | ---------------- |
| **200**     | OK                      | -                |
| **400**     | Bad Request             | -                |
| **403**     | Not Authorized          | -                |
| **404**     | Not Found               | -                |
| **409**     | Concurrent Modification | -                |
| **429**     | Too many requests       | -                |
