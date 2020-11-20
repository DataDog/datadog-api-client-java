# SyntheticsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGlobalVariable**](SyntheticsApi.md#createGlobalVariable) | **POST** /api/v1/synthetics/variables | Create a global variable
[**createTest**](SyntheticsApi.md#createTest) | **POST** /api/v1/synthetics/tests | Create a test
[**deleteGlobalVariable**](SyntheticsApi.md#deleteGlobalVariable) | **DELETE** /api/v1/synthetics/variables/{variable_id} | Delete a global variable
[**deleteTests**](SyntheticsApi.md#deleteTests) | **POST** /api/v1/synthetics/tests/delete | Delete tests
[**editGlobalVariable**](SyntheticsApi.md#editGlobalVariable) | **PUT** /api/v1/synthetics/variables/{variable_id} | Edit a global variable
[**getAPITestLatestResults**](SyntheticsApi.md#getAPITestLatestResults) | **GET** /api/v1/synthetics/tests/{public_id}/results | Get the test&#39;s latest results summaries (API)
[**getAPITestResult**](SyntheticsApi.md#getAPITestResult) | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id} | Get a test result (API)
[**getBrowserTest**](SyntheticsApi.md#getBrowserTest) | **GET** /api/v1/synthetics/tests/browser/{public_id} | Get a test configuration (browser)
[**getBrowserTestLatestResults**](SyntheticsApi.md#getBrowserTestLatestResults) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results | Get the test&#39;s latest results summaries (browser)
[**getBrowserTestResult**](SyntheticsApi.md#getBrowserTestResult) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id} | Get a test result (browser)
[**getGlobalVariable**](SyntheticsApi.md#getGlobalVariable) | **GET** /api/v1/synthetics/variables/{variable_id} | Get a global variable
[**getTest**](SyntheticsApi.md#getTest) | **GET** /api/v1/synthetics/tests/{public_id} | Get a test configuration (API)
[**listLocations**](SyntheticsApi.md#listLocations) | **GET** /api/v1/synthetics/locations | Get all locations (public and private)
[**listTests**](SyntheticsApi.md#listTests) | **GET** /api/v1/synthetics/tests | Get the list of all tests
[**triggerCITests**](SyntheticsApi.md#triggerCITests) | **POST** /api/v1/synthetics/tests/trigger/ci | Trigger some Synthetics tests for CI
[**updateTest**](SyntheticsApi.md#updateTest) | **PUT** /api/v1/synthetics/tests/{public_id} | Edit a test
[**updateTestPauseStatus**](SyntheticsApi.md#updateTestPauseStatus) | **PUT** /api/v1/synthetics/tests/{public_id}/status | Pause or start a test



## createGlobalVariable

> SyntheticsGlobalVariable createGlobalVariable().body(body).execute();

Create a global variable

Create a Synthetics global variable.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsGlobalVariable body = new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable to create.
        try {
            SyntheticsGlobalVariable result = api.createGlobalVariable()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createGlobalVariable");
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
 **body** | [**SyntheticsGlobalVariable**](SyntheticsGlobalVariable.md)| Details of the global variable to create. |

### Return type

[**SyntheticsGlobalVariable**](SyntheticsGlobalVariable.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **403** | Forbidden |  -  |


## createTest

> SyntheticsTestDetails createTest().body(body).execute();

Create a test

Create a Synthetic test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsTestDetails body = new SyntheticsTestDetails(); // SyntheticsTestDetails | Details of the test to create.
        try {
            SyntheticsTestDetails result = api.createTest()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createTest");
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
 **body** | [**SyntheticsTestDetails**](SyntheticsTestDetails.md)| Details of the test to create. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns the created test details. |  -  |
| **400** | - JSON format is wrong - Creation failed |  -  |
| **402** | Test quota is reached |  -  |
| **403** | Forbidden |  -  |


## deleteGlobalVariable

> deleteGlobalVariable(variableId).execute();

Delete a global variable

Delete a Synthetics global variable.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        try {
            api.deleteGlobalVariable(variableId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#deleteGlobalVariable");
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
 **variableId** | **String**| The ID of the global variable. |

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
| **200** | OK |  -  |
| **400** | JSON format is wrong |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## deleteTests

> SyntheticsDeleteTestsResponse deleteTests().body(body).execute();

Delete tests

Delete multiple Synthetic tests by ID.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsDeleteTestsPayload body = new SyntheticsDeleteTestsPayload(); // SyntheticsDeleteTestsPayload | Public ID list of the Synthetic tests to be deleted.
        try {
            SyntheticsDeleteTestsResponse result = api.deleteTests()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#deleteTests");
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
 **body** | [**SyntheticsDeleteTestsPayload**](SyntheticsDeleteTestsPayload.md)| Public ID list of the Synthetic tests to be deleted. |

### Return type

[**SyntheticsDeleteTestsResponse**](SyntheticsDeleteTestsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **400** | - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user |  -  |
| **403** | Forbidden |  -  |
| **404** | - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user |  -  |


## editGlobalVariable

> SyntheticsGlobalVariable editGlobalVariable(variableId).body(body).execute();

Edit a global variable

Edit a Synthetics global variable.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        SyntheticsGlobalVariable body = new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable to update.
        try {
            SyntheticsGlobalVariable result = api.editGlobalVariable(variableId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#editGlobalVariable");
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
 **variableId** | **String**| The ID of the global variable. |
 **body** | [**SyntheticsGlobalVariable**](SyntheticsGlobalVariable.md)| Details of the global variable to update. |

### Return type

[**SyntheticsGlobalVariable**](SyntheticsGlobalVariable.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **403** | Forbidden |  -  |


## getAPITestLatestResults

> SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(publicId).fromTs(fromTs).toTs(toTs).probeDc(probeDc).execute();

Get the test&#39;s latest results summaries (API)

Get the last 50 test results summaries for a given Synthetics API test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test for which to search results for.
        Long fromTs = 56L; // Long | Timestamp from which to start querying results.
        Long toTs = 56L; // Long | Timestamp up to which to query results.
        List<String> probeDc = Arrays.asList(); // List<String> | Locations for which to query results.
        try {
            SyntheticsGetAPITestLatestResultsResponse result = api.getAPITestLatestResults(publicId)
                .fromTs(fromTs)
                .toTs(toTs)
                .probeDc(probeDc)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getAPITestLatestResults");
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
 **publicId** | **String**| The public ID of the test for which to search results for. |
 **fromTs** | **Long**| Timestamp from which to start querying results. | [optional]
 **toTs** | **Long**| Timestamp up to which to query results. | [optional]
 **probeDc** | [**List&lt;String&gt;**](String.md)| Locations for which to query results. | [optional]

### Return type

[**SyntheticsGetAPITestLatestResultsResponse**](SyntheticsGetAPITestLatestResultsResponse.md)

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
| **404** | - Synthetic is not activated for the user - Test is not owned by the user |  -  |


## getAPITestResult

> SyntheticsAPITestResultFull getAPITestResult(publicId, resultId).execute();

Get a test result (API)

Get a specific full result from a given (API) Synthetic test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the API test to which the target result belongs.
        String resultId = "resultId_example"; // String | The ID of the result to get.
        try {
            SyntheticsAPITestResultFull result = api.getAPITestResult(publicId, resultId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getAPITestResult");
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
 **publicId** | **String**| The public ID of the API test to which the target result belongs. |
 **resultId** | **String**| The ID of the result to get. |

### Return type

[**SyntheticsAPITestResultFull**](SyntheticsAPITestResultFull.md)

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
| **404** | - Synthetic is not activated for the user - Test or result is not owned by the user |  -  |


## getBrowserTest

> SyntheticsTestDetails getBrowserTest(publicId).execute();

Get a test configuration (browser)

Get the detailed configuration (including steps) associated with
a Synthetic browser test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        try {
            SyntheticsTestDetails result = api.getBrowserTest(publicId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getBrowserTest");
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
 **publicId** | **String**| The public ID of the test to get details from. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

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
| **404** | - Synthetic is not activated for the user - Test is not owned by the user |  -  |


## getBrowserTestLatestResults

> SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(publicId).fromTs(fromTs).toTs(toTs).probeDc(probeDc).execute();

Get the test&#39;s latest results summaries (browser)

Get the last 50 test results summaries for a given Synthetics Browser test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the browser test for which to search results for.
        Long fromTs = 56L; // Long | Timestamp from which to start querying results.
        Long toTs = 56L; // Long | Timestamp up to which to query results.
        List<String> probeDc = Arrays.asList(); // List<String> | Locations for which to query results.
        try {
            SyntheticsGetBrowserTestLatestResultsResponse result = api.getBrowserTestLatestResults(publicId)
                .fromTs(fromTs)
                .toTs(toTs)
                .probeDc(probeDc)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getBrowserTestLatestResults");
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
 **publicId** | **String**| The public ID of the browser test for which to search results for. |
 **fromTs** | **Long**| Timestamp from which to start querying results. | [optional]
 **toTs** | **Long**| Timestamp up to which to query results. | [optional]
 **probeDc** | [**List&lt;String&gt;**](String.md)| Locations for which to query results. | [optional]

### Return type

[**SyntheticsGetBrowserTestLatestResultsResponse**](SyntheticsGetBrowserTestLatestResultsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | - Synthetic is not activated for the user - Test is not owned by the user |  -  |


## getBrowserTestResult

> SyntheticsBrowserTestResultFull getBrowserTestResult(publicId, resultId).execute();

Get a test result (browser)

Get a specific full result from a given (browser) Synthetic test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the browser test to which the target result belongs.
        String resultId = "resultId_example"; // String | The ID of the result to get.
        try {
            SyntheticsBrowserTestResultFull result = api.getBrowserTestResult(publicId, resultId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getBrowserTestResult");
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
 **publicId** | **String**| The public ID of the browser test to which the target result belongs. |
 **resultId** | **String**| The ID of the result to get. |

### Return type

[**SyntheticsBrowserTestResultFull**](SyntheticsBrowserTestResultFull.md)

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
| **404** | - Synthetic is not activated for the user - Test or result is not owned by the user |  -  |


## getGlobalVariable

> SyntheticsGlobalVariable getGlobalVariable(variableId).execute();

Get a global variable

Get the detailed configuration of a global variable.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        try {
            SyntheticsGlobalVariable result = api.getGlobalVariable(variableId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getGlobalVariable");
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
 **variableId** | **String**| The ID of the global variable. |

### Return type

[**SyntheticsGlobalVariable**](SyntheticsGlobalVariable.md)

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
| **404** | Not found |  -  |


## getTest

> SyntheticsTestDetails getTest(publicId).execute();

Get a test configuration (API)

Get the detailed configuration associated with a Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        try {
            SyntheticsTestDetails result = api.getTest(publicId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getTest");
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
 **publicId** | **String**| The public ID of the test to get details from. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

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
| **404** | - Synthetic is not activated for the user - Test is not owned by the user |  -  |


## listLocations

> SyntheticsLocations listLocations().execute();

Get all locations (public and private)

Get the list of public and private locations available for Synthetic
tests. No arguments required.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        try {
            SyntheticsLocations result = api.listLocations()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#listLocations");
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

[**SyntheticsLocations**](SyntheticsLocations.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listTests

> SyntheticsListTestsResponse listTests().execute();

Get the list of all tests

Get the list of all Synthetic tests.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        try {
            SyntheticsListTestsResponse result = api.listTests()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#listTests");
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

[**SyntheticsListTestsResponse**](SyntheticsListTestsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns the list of all Synthetic tests. |  -  |
| **403** | Forbidden |  -  |
| **404** | Synthetics is not activated for the user. |  -  |


## triggerCITests

> SyntheticsTriggerCITestsResponse triggerCITests().body(body).execute();

Trigger some Synthetics tests for CI

Trigger a set of Synthetics tests for continuous integration

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsCITestBody body = new SyntheticsCITestBody(); // SyntheticsCITestBody | Details of the test to trigger.
        try {
            SyntheticsTriggerCITestsResponse result = api.triggerCITests()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#triggerCITests");
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
 **body** | [**SyntheticsCITestBody**](SyntheticsCITestBody.md)| Details of the test to trigger. |

### Return type

[**SyntheticsTriggerCITestsResponse**](SyntheticsTriggerCITestsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | JSON format is wrong |  -  |


## updateTest

> SyntheticsTestDetails updateTest(publicId).body(body).execute();

Edit a test

Edit the configuration of a Synthetic test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        SyntheticsTestDetails body = new SyntheticsTestDetails(); // SyntheticsTestDetails | New test details to be saved.
        try {
            SyntheticsTestDetails result = api.updateTest(publicId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#updateTest");
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
 **publicId** | **String**| The public ID of the test to get details from. |
 **body** | [**SyntheticsTestDetails**](SyntheticsTestDetails.md)| New test details to be saved. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | - JSON format is wrong - Updating sub-type is forbidden |  -  |
| **403** | Forbidden |  -  |
| **404** | - Synthetic is not activated for the user - Test is not owned by the user - Test can&#39;t be found |  -  |


## updateTestPauseStatus

> Boolean updateTestPauseStatus(publicId).body(body).execute();

Pause or start a test

Pause or start a Synthetics test by changing the status.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the Synthetic test to update.
        SyntheticsUpdateTestPauseStatusPayload body = new SyntheticsUpdateTestPauseStatusPayload(); // SyntheticsUpdateTestPauseStatusPayload | Status to set the given Synthetic test to.
        try {
            Boolean result = api.updateTestPauseStatus(publicId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#updateTestPauseStatus");
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
 **publicId** | **String**| The public ID of the Synthetic test to update. |
 **body** | [**SyntheticsUpdateTestPauseStatusPayload**](SyntheticsUpdateTestPauseStatusPayload.md)| Status to set the given Synthetic test to. |

### Return type

**Boolean**

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns a boolean indicating if the update was successful. |  -  |
| **400** | JSON format is wrong. |  -  |
| **403** | Forbidden |  -  |
| **404** | - Synthetic is not activated for the user - Test is not owned by the user |  -  |

