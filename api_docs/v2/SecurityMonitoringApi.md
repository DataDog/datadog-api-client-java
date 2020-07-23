# SecurityMonitoringApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityMonitoringRule**](SecurityMonitoringApi.md#createSecurityMonitoringRule) | **POST** /api/v2/security_monitoring/rules | Create a detection rule
[**deleteSecurityMonitoringRule**](SecurityMonitoringApi.md#deleteSecurityMonitoringRule) | **DELETE** /api/v2/security_monitoring/rules/{rule_id} | Delete an existing rule
[**getSecurityMonitoringRule**](SecurityMonitoringApi.md#getSecurityMonitoringRule) | **GET** /api/v2/security_monitoring/rules/{rule_id} | Get a rule&#39;s details
[**listSecurityMonitoringRules**](SecurityMonitoringApi.md#listSecurityMonitoringRules) | **GET** /api/v2/security_monitoring/rules | List rules
[**listSecurityMonitoringSignals**](SecurityMonitoringApi.md#listSecurityMonitoringSignals) | **GET** /api/v2/security_monitoring/signals | Get a quick list of security signals
[**searchSecurityMonitoringSignals**](SecurityMonitoringApi.md#searchSecurityMonitoringSignals) | **POST** /api/v2/security_monitoring/signals/search | Get a list of security signals
[**updateSecurityMonitoringRule**](SecurityMonitoringApi.md#updateSecurityMonitoringRule) | **PUT** /api/v2/security_monitoring/rules/{rule_id} | Update an existing rule



## createSecurityMonitoringRule

> SecurityMonitoringRuleResponse createSecurityMonitoringRule().body(body).execute();

Create a detection rule

Create a detection rule.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        SecurityMonitoringRuleCreatePayload body = new SecurityMonitoringRuleCreatePayload(); // SecurityMonitoringRuleCreatePayload | 
        try {
            SecurityMonitoringRuleResponse result = api.createSecurityMonitoringRule()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#createSecurityMonitoringRule");
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
 **body** | [**SecurityMonitoringRuleCreatePayload**](SecurityMonitoringRuleCreatePayload.md)|  | [optional]

### Return type

[**SecurityMonitoringRuleResponse**](SecurityMonitoringRuleResponse.md)

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
| **403** | Not Authorized |  -  |


## deleteSecurityMonitoringRule

> deleteSecurityMonitoringRule(ruleId).execute();

Delete an existing rule

Delete an existing rule. Default rules cannot be deleted.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        try {
            api.deleteSecurityMonitoringRule(ruleId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#deleteSecurityMonitoringRule");
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
 **ruleId** | **String**| The ID of the rule. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |


## getSecurityMonitoringRule

> SecurityMonitoringRuleResponse getSecurityMonitoringRule(ruleId).execute();

Get a rule&#39;s details

Get a rule's details.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        try {
            SecurityMonitoringRuleResponse result = api.getSecurityMonitoringRule(ruleId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#getSecurityMonitoringRule");
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
 **ruleId** | **String**| The ID of the rule. |

### Return type

[**SecurityMonitoringRuleResponse**](SecurityMonitoringRuleResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## listSecurityMonitoringRules

> SecurityMonitoringListRulesResponse listSecurityMonitoringRules().pageSize(pageSize).pageNumber(pageNumber).execute();

List rules

List rules.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        Long pageSize = 10lL; // Long | Size for a given page.
        Long pageNumber = 0lL; // Long | Specific page number to return.
        try {
            SecurityMonitoringListRulesResponse result = api.listSecurityMonitoringRules()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#listSecurityMonitoringRules");
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10l]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0l]

### Return type

[**SecurityMonitoringListRulesResponse**](SecurityMonitoringListRulesResponse.md)

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


## listSecurityMonitoringSignals

> SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals().filterQuery(filterQuery).filterFrom(filterFrom).filterTo(filterTo).sort(sort).pageCursor(pageCursor).pageLimit(pageLimit).execute();

Get a quick list of security signals

List endpoint returns security signals that match a search query.
Both this endpoint and the POST endpoint can be used interchangeably when listing
security signals.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String filterQuery = security:attack status:high; // String | Search query for security signals.
        OffsetDateTime filterFrom = 2019-01-02T09:42:36.320Z; // OffsetDateTime | Minimum timestamp for requested security signals.
        OffsetDateTime filterTo = 2019-01-03T09:42:36.320Z; // OffsetDateTime | Maximum timestamp for requested security signals.
        SecurityMonitoringSignalsSort sort = new SecurityMonitoringSignalsSort(); // SecurityMonitoringSignalsSort | Order of security signals in results.
        String pageCursor = eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==; // String | List following results with a cursor provided in the previous query.
        Integer pageLimit = 25; // Integer | Maximum number of security signals in the response.
        try {
            SecurityMonitoringSignalsListResponse result = api.listSecurityMonitoringSignals()
                .filterQuery(filterQuery)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#listSecurityMonitoringSignals");
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
 **filterQuery** | **String**| Search query for security signals. | [optional]
 **filterFrom** | **OffsetDateTime**| Minimum timestamp for requested security signals. | [optional]
 **filterTo** | **OffsetDateTime**| Maximum timestamp for requested security signals. | [optional]
 **sort** | [**SecurityMonitoringSignalsSort**](.md)| Order of security signals in results. | [optional] [enum: timestamp, -timestamp]
 **pageCursor** | **String**| List following results with a cursor provided in the previous query. | [optional]
 **pageLimit** | **Integer**| Maximum number of security signals in the response. | [optional] [default to 10]

### Return type

[**SecurityMonitoringSignalsListResponse**](SecurityMonitoringSignalsListResponse.md)

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
| **403** | Not Authorized |  -  |


## searchSecurityMonitoringSignals

> SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals().body(body).execute();

Get a list of security signals

Returns security signals that match a search query.
Both this endpoint and the GET endpoint can be used interchangeably when listing
security signals.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        SecurityMonitoringSignalListRequest body = new SecurityMonitoringSignalListRequest(); // SecurityMonitoringSignalListRequest | 
        try {
            SecurityMonitoringSignalsListResponse result = api.searchSecurityMonitoringSignals()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#searchSecurityMonitoringSignals");
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
 **body** | [**SecurityMonitoringSignalListRequest**](SecurityMonitoringSignalListRequest.md)|  | [optional]

### Return type

[**SecurityMonitoringSignalsListResponse**](SecurityMonitoringSignalsListResponse.md)

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
| **403** | Not Authorized |  -  |


## updateSecurityMonitoringRule

> SecurityMonitoringRuleResponse updateSecurityMonitoringRule(ruleId).body(body).execute();

Update an existing rule

Update an existing rule. When updating `cases`, `queries` or `options`, the whole field
must be included. For example, when modifying a query all queries must be included.
Default rules can only be updated to be enabled and to change notifications.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        SecurityMonitoringRuleUpdatePayload body = new SecurityMonitoringRuleUpdatePayload(); // SecurityMonitoringRuleUpdatePayload | 
        try {
            SecurityMonitoringRuleResponse result = api.updateSecurityMonitoringRule(ruleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityMonitoringRule");
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
 **ruleId** | **String**| The ID of the rule. |
 **body** | [**SecurityMonitoringRuleUpdatePayload**](SecurityMonitoringRuleUpdatePayload.md)|  | [optional]

### Return type

[**SecurityMonitoringRuleResponse**](SecurityMonitoringRuleResponse.md)

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
| **401** | Concurrent Modification |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |

