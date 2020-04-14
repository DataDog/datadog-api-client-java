# SyntheticsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTest**](SyntheticsApi.md#createTest) | **POST** /api/v1/synthetics/tests | Create or clone test
[**deleteTests**](SyntheticsApi.md#deleteTests) | **POST** /api/v1/synthetics/tests/delete | Delete multiple tests
[**getAPITestLatestResults**](SyntheticsApi.md#getAPITestLatestResults) | **GET** /api/v1/synthetics/tests/{public_id}/results | Get test latest results (as summaries)
[**getAPITestResult**](SyntheticsApi.md#getAPITestResult) | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id} | Get test result (API)
[**getBrowserTestLatestResults**](SyntheticsApi.md#getBrowserTestLatestResults) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results | Get test latest results (as summaries)
[**getBrowserTestResult**](SyntheticsApi.md#getBrowserTestResult) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id} | Get test result (browser)
[**getTest**](SyntheticsApi.md#getTest) | **GET** /api/v1/synthetics/tests/{public_id} | Get test
[**listTests**](SyntheticsApi.md#listTests) | **GET** /api/v1/synthetics/tests | Get all test
[**updateTest**](SyntheticsApi.md#updateTest) | **PUT** /api/v1/synthetics/tests/{public_id} | Update test
[**updateTestPauseStatus**](SyntheticsApi.md#updateTestPauseStatus) | **PUT** /api/v1/synthetics/tests/{public_id}/status | Change test pause/live status



## createTest

> SyntheticsTestDetails createTest().body(body).fromTestId(fromTestId).execute();

Create or clone test

Create (or clone) a Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsTestDetails body = new SyntheticsTestDetails(); // SyntheticsTestDetails | Details of the test to create.
        String fromTestId = "fromTestId_example"; // String | Public id of the test to clone, undefined if the test is created ex nihilo.
        try {
            SyntheticsTestDetails result = api.createTest()
                .body(body)
                .fromTestId(fromTestId)
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
 **fromTestId** | **String**| Public id of the test to clone, undefined if the test is created ex nihilo. | [optional]

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns the created/cloned test details. |  -  |
| **400** | JSON format is wrong, creation/cloning failed. |  -  |
| **402** | Test quota is reached. |  -  |
| **403** | forbidden |  -  |


## deleteTests

> SyntheticsDeleteTestsResponse deleteTests().body(body).execute();

Delete multiple tests

Delete multiple Synthetics tests by id

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsDeleteTestsPayload body = new SyntheticsDeleteTestsPayload(); // SyntheticsDeleteTestsPayload | Public id list of the Synthetics tests to be deleted
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
 **body** | [**SyntheticsDeleteTestsPayload**](SyntheticsDeleteTestsPayload.md)| Public id list of the Synthetics tests to be deleted |

### Return type

[**SyntheticsDeleteTestsResponse**](SyntheticsDeleteTestsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | JSON format is wrong, test cannot be deleted as it&#39;s used elsewhere (as a subtest or in an uptime widget), some ids are not owned by the user |  -  |
| **403** | forbidden |  -  |
| **404** | tests to be deleted can&#39;t be found or Synthetics is not activated for the user |  -  |


## getAPITestLatestResults

> SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(publicId).fromTs(fromTs).toTs(toTs).probeDc(probeDc).execute();

Get test latest results (as summaries)

Get the latest results (as summaries) from a given API Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the test for which to search results for.
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
 **publicId** | **String**| The public id of the test for which to search results for. |
 **fromTs** | **Long**| Timestamp from which to start querying results. | [optional]
 **toTs** | **Long**| Timestamp up to which to query results. | [optional]
 **probeDc** | [**List&lt;String&gt;**](String.md)| Locations for which to query results. | [optional]

### Return type

[**SyntheticsGetAPITestLatestResultsResponse**](SyntheticsGetAPITestLatestResultsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test is not owned by the user. |  -  |


## getAPITestResult

> SyntheticsAPITestResultFull getAPITestResult(publicId, resultId).execute();

Get test result (API)

Get a specific full result from a given (API) Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the API test to which the target result belongs.
        String resultId = "resultId_example"; // String | The id of the result to get.
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
 **publicId** | **String**| The public id of the API test to which the target result belongs. |
 **resultId** | **String**| The id of the result to get. |

### Return type

[**SyntheticsAPITestResultFull**](SyntheticsAPITestResultFull.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test or result is not owned by the user. |  -  |


## getBrowserTestLatestResults

> SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(publicId).fromTs(fromTs).toTs(toTs).probeDc(probeDc).execute();

Get test latest results (as summaries)

Get the latest results (as summaries) from a given browser Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the browser test for which to search results for.
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
 **publicId** | **String**| The public id of the browser test for which to search results for. |
 **fromTs** | **Long**| Timestamp from which to start querying results. | [optional]
 **toTs** | **Long**| Timestamp up to which to query results. | [optional]
 **probeDc** | [**List&lt;String&gt;**](String.md)| Locations for which to query results. | [optional]

### Return type

[**SyntheticsGetBrowserTestLatestResultsResponse**](SyntheticsGetBrowserTestLatestResultsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test is not owned by the user. |  -  |


## getBrowserTestResult

> SyntheticsBrowserTestResultFull getBrowserTestResult(publicId, resultId).execute();

Get test result (browser)

Get a specific full result from a given (browser) Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the browser test to which the target result belongs.
        String resultId = "resultId_example"; // String | The id of the result to get.
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
 **publicId** | **String**| The public id of the browser test to which the target result belongs. |
 **resultId** | **String**| The id of the result to get. |

### Return type

[**SyntheticsBrowserTestResultFull**](SyntheticsBrowserTestResultFull.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test or result is not owned by the user. |  -  |


## getTest

> SyntheticsTestDetails getTest(publicId).execute();

Get test

Get the details of a specific Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the test to get details from.
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
 **publicId** | **String**| The public id of the test to get details from. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test is not owned by the user. |  -  |


## listTests

> SyntheticsListTestsResponse listTests().checkType(checkType).execute();

Get all test

Get the list of all Synthetics tests (can be filtered by type).

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String checkType = "checkType_example"; // String | API or browser to filter the list by type, undefined to get the unfiltered list.
        try {
            SyntheticsListTestsResponse result = api.listTests()
                .checkType(checkType)
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkType** | **String**| API or browser to filter the list by type, undefined to get the unfiltered list. | [optional]

### Return type

[**SyntheticsListTestsResponse**](SyntheticsListTestsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns the list of all Synthetics test (properly filtered by type). |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user. |  -  |


## updateTest

> SyntheticsTestDetails updateTest(publicId).body(body).execute();

Update test

Update the details of a specific Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the test to get details from.
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
 **publicId** | **String**| The public id of the test to get details from. |
 **body** | [**SyntheticsTestDetails**](SyntheticsTestDetails.md)| New test details to be saved. |

### Return type

[**SyntheticsTestDetails**](SyntheticsTestDetails.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | JSON format is wrong, updating subtype is forbidden. |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test is not owned by the user, test can&#39;t be found. |  -  |


## updateTestPauseStatus

> Boolean updateTestPauseStatus(publicId).body(body).execute();

Change test pause/live status

Change pause/live status of a given Synthetics test.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

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

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public id of the Synthetics test to update
        SyntheticsUpdateTestPauseStatusPayload body = new SyntheticsUpdateTestPauseStatusPayload(); // SyntheticsUpdateTestPauseStatusPayload | Pause/live status to set the given Synthetics test to
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
 **publicId** | **String**| The public id of the Synthetics test to update |
 **body** | [**SyntheticsUpdateTestPauseStatusPayload**](SyntheticsUpdateTestPauseStatusPayload.md)| Pause/live status to set the given Synthetics test to |

### Return type

**Boolean**

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Returns a boolean indicating if the update was successful |  -  |
| **400** | JSON format is wrong |  -  |
| **403** | forbidden |  -  |
| **404** | Synthetics is not activated for the user, test is not owned by the user |  -  |

