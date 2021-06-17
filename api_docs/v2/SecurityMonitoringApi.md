# SecurityMonitoringApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createSecurityFilter**](SecurityMonitoringApi.md#createSecurityFilter) | **POST** /api/v2/security_monitoring/configuration/security_filters | Create a security filter
[**createSecurityMonitoringRule**](SecurityMonitoringApi.md#createSecurityMonitoringRule) | **POST** /api/v2/security_monitoring/rules | Create a detection rule
[**deleteSecurityFilter**](SecurityMonitoringApi.md#deleteSecurityFilter) | **DELETE** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Delete a security filter
[**deleteSecurityMonitoringRule**](SecurityMonitoringApi.md#deleteSecurityMonitoringRule) | **DELETE** /api/v2/security_monitoring/rules/{rule_id} | Delete an existing rule
[**getSecurityFilter**](SecurityMonitoringApi.md#getSecurityFilter) | **GET** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Get a security filter
[**getSecurityMonitoringRule**](SecurityMonitoringApi.md#getSecurityMonitoringRule) | **GET** /api/v2/security_monitoring/rules/{rule_id} | Get a rule&#39;s details
[**listSecurityFilters**](SecurityMonitoringApi.md#listSecurityFilters) | **GET** /api/v2/security_monitoring/configuration/security_filters | Get all security filters
[**listSecurityMonitoringRules**](SecurityMonitoringApi.md#listSecurityMonitoringRules) | **GET** /api/v2/security_monitoring/rules | List rules
[**listSecurityMonitoringSignals**](SecurityMonitoringApi.md#listSecurityMonitoringSignals) | **GET** /api/v2/security_monitoring/signals | Get a quick list of security signals
[**searchSecurityMonitoringSignals**](SecurityMonitoringApi.md#searchSecurityMonitoringSignals) | **POST** /api/v2/security_monitoring/signals/search | Get a list of security signals
[**updateSecurityFilter**](SecurityMonitoringApi.md#updateSecurityFilter) | **PATCH** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Update a security filter
[**updateSecurityMonitoringRule**](SecurityMonitoringApi.md#updateSecurityMonitoringRule) | **PUT** /api/v2/security_monitoring/rules/{rule_id} | Update an existing rule



## createSecurityFilter

> SecurityFilterResponse createSecurityFilter(body);

Create a security filter.

See the [security filter guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
for more examples.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        SecurityFilterCreateRequest body = new SecurityFilterCreateRequest(); // SecurityFilterCreateRequest | The definition of the new security filter.
        try {
            SecurityFilterResponse result = apiInstance.createSecurityFilter(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#createSecurityFilter");
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
 **body** | [**SecurityFilterCreateRequest**](SecurityFilterCreateRequest.md)| The definition of the new security filter. |

### Return type

[**SecurityFilterResponse**](SecurityFilterResponse.md)

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
| **403** | Not Authorized |  -  |
| **409** | Conflict |  -  |
| **429** | Too many requests |  -  |


## createSecurityMonitoringRule

> SecurityMonitoringRuleResponse createSecurityMonitoringRule(body);

Create a detection rule.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        SecurityMonitoringRuleCreatePayload body = new SecurityMonitoringRuleCreatePayload(); // SecurityMonitoringRuleCreatePayload | 
        try {
            SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
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
 **body** | [**SecurityMonitoringRuleCreatePayload**](SecurityMonitoringRuleCreatePayload.md)|  |

### Return type

[**SecurityMonitoringRuleResponse**](SecurityMonitoringRuleResponse.md)

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
| **403** | Not Authorized |  -  |


## deleteSecurityFilter

> deleteSecurityFilter(securityFilterId);

Delete a specific security filter.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String securityFilterId = "securityFilterId_example"; // String | The ID of the security filter.
        try {
            apiInstance.deleteSecurityFilter(securityFilterId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#deleteSecurityFilter");
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
 **securityFilterId** | **String**| The ID of the security filter. |

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
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **429** | Too many requests |  -  |


## deleteSecurityMonitoringRule

> deleteSecurityMonitoringRule(ruleId);

Delete an existing rule. Default rules cannot be deleted.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        try {
            apiInstance.deleteSecurityMonitoringRule(ruleId);
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |


## getSecurityFilter

> SecurityFilterResponse getSecurityFilter(securityFilterId);

Get the details of a specific security filter.

See the [security filter guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
for more examples.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String securityFilterId = "securityFilterId_example"; // String | The ID of the security filter.
        try {
            SecurityFilterResponse result = apiInstance.getSecurityFilter(securityFilterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#getSecurityFilter");
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
 **securityFilterId** | **String**| The ID of the security filter. |

### Return type

[**SecurityFilterResponse**](SecurityFilterResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **429** | Too many requests |  -  |


## getSecurityMonitoringRule

> SecurityMonitoringRuleResponse getSecurityMonitoringRule(ruleId);

Get a rule's details.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        try {
            SecurityMonitoringRuleResponse result = apiInstance.getSecurityMonitoringRule(ruleId);
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## listSecurityFilters

> SecurityFiltersResponse listSecurityFilters();

Get the list of configured security filters with their definitions.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        try {
            SecurityFiltersResponse result = apiInstance.listSecurityFilters();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#listSecurityFilters");
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

[**SecurityFiltersResponse**](SecurityFiltersResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Not Authorized |  -  |
| **429** | Too many requests |  -  |


## listSecurityMonitoringRules

> SecurityMonitoringListRulesResponse listSecurityMonitoringRules(parameters);

List rules.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        try {
	    SecurityMonitoringListRulesResponse result = apiInstance.listSecurityMonitoringRules(new SecurityMonitoringApi.ListSecurityMonitoringRulesOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber));
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0]

### Return type

[**SecurityMonitoringListRulesResponse**](SecurityMonitoringListRulesResponse.md)

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


## listSecurityMonitoringSignals

> SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals(parameters);

The list endpoint returns security signals that match a search query.
Both this endpoint and the POST endpoint can be used interchangeably when listing
security signals.

### Example

```java
import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String filterQuery = "security:attack status:high"; // String | The search query for security signals.
        OffsetDateTime filterFrom = OffsetDateTime.now(); // OffsetDateTime | The minimum timestamp for requested security signals.
        OffsetDateTime filterTo = OffsetDateTime.now(); // OffsetDateTime | The maximum timestamp for requested security signals.
        SecurityMonitoringSignalsSort sort = SecurityMonitoringSignalsSort.fromValue("timestamp"); // SecurityMonitoringSignalsSort | The order of the security signals in results.
        String pageCursor = "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | A list of results using the cursor provided in the previous query.
        Integer pageLimit = 10; // Integer | The maximum number of security signals in the response.
        try {
	    SecurityMonitoringSignalsListResponse result = apiInstance.listSecurityMonitoringSignals(new SecurityMonitoringApi.ListSecurityMonitoringSignalsOptionalParameters()
                .filterQuery(filterQuery)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .sort(sort)
                .pageCursor(pageCursor)
                .pageLimit(pageLimit));
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
 **filterQuery** | **String**| The search query for security signals. | [optional]
 **filterFrom** | **OffsetDateTime**| The minimum timestamp for requested security signals. | [optional]
 **filterTo** | **OffsetDateTime**| The maximum timestamp for requested security signals. | [optional]
 **sort** | **SecurityMonitoringSignalsSort**| The order of the security signals in results. | [optional] [enum: timestamp, -timestamp]
 **pageCursor** | **String**| A list of results using the cursor provided in the previous query. | [optional]
 **pageLimit** | **Integer**| The maximum number of security signals in the response. | [optional] [default to 10]

### Return type

[**SecurityMonitoringSignalsListResponse**](SecurityMonitoringSignalsListResponse.md)

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
| **403** | Not Authorized |  -  |


## searchSecurityMonitoringSignals

> SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals(parameters);

Returns security signals that match a search query.
Both this endpoint and the GET endpoint can be used interchangeably for listing
security signals.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        SecurityMonitoringSignalListRequest body = new SecurityMonitoringSignalListRequest(); // SecurityMonitoringSignalListRequest | 
        try {
	    SecurityMonitoringSignalsListResponse result = apiInstance.searchSecurityMonitoringSignals(new SecurityMonitoringApi.SearchSecurityMonitoringSignalsOptionalParameters()
                .body(body));
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Not Authorized |  -  |


## updateSecurityFilter

> SecurityFilterResponse updateSecurityFilter(securityFilterId, body);

Update a specific security filter.
Returns the security filter object when the request is successful.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String securityFilterId = "securityFilterId_example"; // String | The ID of the security filter.
        SecurityFilterUpdateRequest body = new SecurityFilterUpdateRequest(); // SecurityFilterUpdateRequest | New definition of the security filter.
        try {
            SecurityFilterResponse result = apiInstance.updateSecurityFilter(securityFilterId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityFilter");
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
 **securityFilterId** | **String**| The ID of the security filter. |
 **body** | [**SecurityFilterUpdateRequest**](SecurityFilterUpdateRequest.md)| New definition of the security filter. |

### Return type

[**SecurityFilterResponse**](SecurityFilterResponse.md)

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
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |
| **409** | Concurrent Modification |  -  |
| **429** | Too many requests |  -  |


## updateSecurityMonitoringRule

> SecurityMonitoringRuleResponse updateSecurityMonitoringRule(ruleId, body);

Update an existing rule. When updating `cases`, `queries` or `options`, the whole field
must be included. For example, when modifying a query all queries must be included.
Default rules can only be updated to be enabled and to change notifications.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        String ruleId = "ruleId_example"; // String | The ID of the rule.
        SecurityMonitoringRuleUpdatePayload body = new SecurityMonitoringRuleUpdatePayload(); // SecurityMonitoringRuleUpdatePayload | 
        try {
            SecurityMonitoringRuleResponse result = apiInstance.updateSecurityMonitoringRule(ruleId, body);
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
 **body** | [**SecurityMonitoringRuleUpdatePayload**](SecurityMonitoringRuleUpdatePayload.md)|  |

### Return type

[**SecurityMonitoringRuleResponse**](SecurityMonitoringRuleResponse.md)

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
| **401** | Concurrent Modification |  -  |
| **403** | Not Authorized |  -  |
| **404** | Not Found |  -  |

