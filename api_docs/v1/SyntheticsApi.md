# SyntheticsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createGlobalVariable**](SyntheticsApi.md#createGlobalVariable) | **POST** /api/v1/synthetics/variables | Create a global variable
[**createPrivateLocation**](SyntheticsApi.md#createPrivateLocation) | **POST** /api/v1/synthetics/private-locations | Create a private location
[**createSyntheticsAPITest**](SyntheticsApi.md#createSyntheticsAPITest) | **POST** /api/v1/synthetics/tests/api | Create an API test
[**createSyntheticsBrowserTest**](SyntheticsApi.md#createSyntheticsBrowserTest) | **POST** /api/v1/synthetics/tests/browser | Create a browser test
[**deleteGlobalVariable**](SyntheticsApi.md#deleteGlobalVariable) | **DELETE** /api/v1/synthetics/variables/{variable_id} | Delete a global variable
[**deletePrivateLocation**](SyntheticsApi.md#deletePrivateLocation) | **DELETE** /api/v1/synthetics/private-locations/{location_id} | Delete a private location
[**deleteTests**](SyntheticsApi.md#deleteTests) | **POST** /api/v1/synthetics/tests/delete | Delete tests
[**editGlobalVariable**](SyntheticsApi.md#editGlobalVariable) | **PUT** /api/v1/synthetics/variables/{variable_id} | Edit a global variable
[**getAPITest**](SyntheticsApi.md#getAPITest) | **GET** /api/v1/synthetics/tests/api/{public_id} | Get an API test
[**getAPITestLatestResults**](SyntheticsApi.md#getAPITestLatestResults) | **GET** /api/v1/synthetics/tests/{public_id}/results | Get an API test&#39;s latest results summaries
[**getAPITestResult**](SyntheticsApi.md#getAPITestResult) | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id} | Get an API test result
[**getBrowserTest**](SyntheticsApi.md#getBrowserTest) | **GET** /api/v1/synthetics/tests/browser/{public_id} | Get a browser test
[**getBrowserTestLatestResults**](SyntheticsApi.md#getBrowserTestLatestResults) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results | Get a browser test&#39;s latest results summaries
[**getBrowserTestResult**](SyntheticsApi.md#getBrowserTestResult) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id} | Get a browser test result
[**getGlobalVariable**](SyntheticsApi.md#getGlobalVariable) | **GET** /api/v1/synthetics/variables/{variable_id} | Get a global variable
[**getPrivateLocation**](SyntheticsApi.md#getPrivateLocation) | **GET** /api/v1/synthetics/private-locations/{location_id} | Get a private location
[**getTest**](SyntheticsApi.md#getTest) | **GET** /api/v1/synthetics/tests/{public_id} | Get a test configuration
[**listLocations**](SyntheticsApi.md#listLocations) | **GET** /api/v1/synthetics/locations | Get all locations (public and private)
[**listTests**](SyntheticsApi.md#listTests) | **GET** /api/v1/synthetics/tests | Get the list of all tests
[**triggerCITests**](SyntheticsApi.md#triggerCITests) | **POST** /api/v1/synthetics/tests/trigger/ci | Trigger tests from CI/CD pipelines
[**updateAPITest**](SyntheticsApi.md#updateAPITest) | **PUT** /api/v1/synthetics/tests/api/{public_id} | Edit an API test
[**updateBrowserTest**](SyntheticsApi.md#updateBrowserTest) | **PUT** /api/v1/synthetics/tests/browser/{public_id} | Edit a browser test
[**updatePrivateLocation**](SyntheticsApi.md#updatePrivateLocation) | **PUT** /api/v1/synthetics/private-locations/{location_id} | Edit a private location
[**updateTestPauseStatus**](SyntheticsApi.md#updateTestPauseStatus) | **PUT** /api/v1/synthetics/tests/{public_id}/status | Pause or start a test



## createGlobalVariable

> SyntheticsGlobalVariable createGlobalVariable(body);

Create a Synthetics global variable.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsGlobalVariable body = new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable to create.
        try {
            SyntheticsGlobalVariable result = apiInstance.createGlobalVariable(body);
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


## createPrivateLocation

> SyntheticsPrivateLocationCreationResponse createPrivateLocation(body);

Create a new Synthetics private location.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsPrivateLocation body = new SyntheticsPrivateLocation(); // SyntheticsPrivateLocation | Details of the private location to create.
        try {
            SyntheticsPrivateLocationCreationResponse result = apiInstance.createPrivateLocation(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createPrivateLocation");
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
 **body** | [**SyntheticsPrivateLocation**](SyntheticsPrivateLocation.md)| Details of the private location to create. |

### Return type

[**SyntheticsPrivateLocationCreationResponse**](SyntheticsPrivateLocationCreationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Quota reached for private locations |  -  |
| **404** | Private locations are not activated for the user |  -  |


## createSyntheticsAPITest

> SyntheticsAPITest createSyntheticsAPITest(body);

Create a Synthetic API test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsAPITest body = new SyntheticsAPITest(); // SyntheticsAPITest | Details of the test to create.
        try {
            SyntheticsAPITest result = apiInstance.createSyntheticsAPITest(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createSyntheticsAPITest");
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
 **body** | [**SyntheticsAPITest**](SyntheticsAPITest.md)| Details of the test to create. |

### Return type

[**SyntheticsAPITest**](SyntheticsAPITest.md)

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


## createSyntheticsBrowserTest

> SyntheticsBrowserTest createSyntheticsBrowserTest(body);

Create a Synthetic browser test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsBrowserTest body = new SyntheticsBrowserTest(); // SyntheticsBrowserTest | Details of the test to create.
        try {
            SyntheticsBrowserTest result = apiInstance.createSyntheticsBrowserTest(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createSyntheticsBrowserTest");
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
 **body** | [**SyntheticsBrowserTest**](SyntheticsBrowserTest.md)| Details of the test to create. |

### Return type

[**SyntheticsBrowserTest**](SyntheticsBrowserTest.md)

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

> deleteGlobalVariable(variableId);

Delete a Synthetics global variable.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        try {
            apiInstance.deleteGlobalVariable(variableId);
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


## deletePrivateLocation

> deletePrivateLocation(locationId);

Delete a Synthetics private location.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String locationId = "locationId_example"; // String | The ID of the private location.
        try {
            apiInstance.deletePrivateLocation(locationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#deletePrivateLocation");
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
 **locationId** | **String**| The ID of the private location. |

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
| **404** | - Private locations are not activated for the user - Private location does not exist |  -  |


## deleteTests

> SyntheticsDeleteTestsResponse deleteTests(body);

Delete multiple Synthetic tests by ID.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsDeleteTestsPayload body = new SyntheticsDeleteTestsPayload(); // SyntheticsDeleteTestsPayload | Public ID list of the Synthetic tests to be deleted.
        try {
            SyntheticsDeleteTestsResponse result = apiInstance.deleteTests(body);
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

> SyntheticsGlobalVariable editGlobalVariable(variableId, body);

Edit a Synthetics global variable.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        SyntheticsGlobalVariable body = new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable to update.
        try {
            SyntheticsGlobalVariable result = apiInstance.editGlobalVariable(variableId, body);
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


## getAPITest

> SyntheticsAPITest getAPITest(publicId);

Get the detailed configuration associated with
a Synthetic API test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        try {
            SyntheticsAPITest result = apiInstance.getAPITest(publicId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getAPITest");
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

[**SyntheticsAPITest**](SyntheticsAPITest.md)

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
| **404** | - Synthetic Monitoring is not activated for the user - Test is not owned by the user |  -  |


## getAPITestLatestResults

> SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(publicId, parameters);

Get the last 50 test results summaries for a given Synthetics API test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test for which to search results for.
        Long fromTs = 56L; // Long | Timestamp from which to start querying results.
        Long toTs = 56L; // Long | Timestamp up to which to query results.
        List<String> probeDc = Arrays.asList(); // List<String> | Locations for which to query results.
        try {
	    SyntheticsGetAPITestLatestResultsResponse result = apiInstance.getAPITestLatestResults(publicId, new SyntheticsApi.GetAPITestLatestResultsOptionalParameters()
                .fromTs(fromTs)
                .toTs(toTs)
                .probeDc(probeDc));
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
 **probeDc** | **List&lt;String&gt;**| Locations for which to query results. | [optional]

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

> SyntheticsAPITestResultFull getAPITestResult(publicId, resultId);

Get a specific full result from a given (API) Synthetic test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the API test to which the target result belongs.
        String resultId = "resultId_example"; // String | The ID of the result to get.
        try {
            SyntheticsAPITestResultFull result = apiInstance.getAPITestResult(publicId, resultId);
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

> SyntheticsBrowserTest getBrowserTest(publicId);

Get the detailed configuration (including steps) associated with
a Synthetic browser test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        try {
            SyntheticsBrowserTest result = apiInstance.getBrowserTest(publicId);
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

[**SyntheticsBrowserTest**](SyntheticsBrowserTest.md)

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

> SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(publicId, parameters);

Get the last 50 test results summaries for a given Synthetics Browser test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the browser test for which to search results for.
        Long fromTs = 56L; // Long | Timestamp from which to start querying results.
        Long toTs = 56L; // Long | Timestamp up to which to query results.
        List<String> probeDc = Arrays.asList(); // List<String> | Locations for which to query results.
        try {
	    SyntheticsGetBrowserTestLatestResultsResponse result = apiInstance.getBrowserTestLatestResults(publicId, new SyntheticsApi.GetBrowserTestLatestResultsOptionalParameters()
                .fromTs(fromTs)
                .toTs(toTs)
                .probeDc(probeDc));
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
 **probeDc** | **List&lt;String&gt;**| Locations for which to query results. | [optional]

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

> SyntheticsBrowserTestResultFull getBrowserTestResult(publicId, resultId);

Get a specific full result from a given (browser) Synthetic test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the browser test to which the target result belongs.
        String resultId = "resultId_example"; // String | The ID of the result to get.
        try {
            SyntheticsBrowserTestResultFull result = apiInstance.getBrowserTestResult(publicId, resultId);
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

> SyntheticsGlobalVariable getGlobalVariable(variableId);

Get the detailed configuration of a global variable.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String variableId = "variableId_example"; // String | The ID of the global variable.
        try {
            SyntheticsGlobalVariable result = apiInstance.getGlobalVariable(variableId);
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


## getPrivateLocation

> SyntheticsPrivateLocation getPrivateLocation(locationId);

Get a Synthetics private location.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String locationId = "locationId_example"; // String | The ID of the private location.
        try {
            SyntheticsPrivateLocation result = apiInstance.getPrivateLocation(locationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getPrivateLocation");
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
 **locationId** | **String**| The ID of the private location. |

### Return type

[**SyntheticsPrivateLocation**](SyntheticsPrivateLocation.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | - Synthetic private locations are not activated for the user - Private location does not exist |  -  |


## getTest

> SyntheticsTestDetails getTest(publicId);

Get the detailed configuration associated with a Synthetics test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        try {
            SyntheticsTestDetails result = apiInstance.getTest(publicId);
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

> SyntheticsLocations listLocations();

Get the list of public and private locations available for Synthetic
tests. No arguments required.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        try {
            SyntheticsLocations result = apiInstance.listLocations();
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

> SyntheticsListTestsResponse listTests();

Get the list of all Synthetic tests.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        try {
            SyntheticsListTestsResponse result = apiInstance.listTests();
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

> SyntheticsTriggerCITestsResponse triggerCITests(body);

Trigger a set of Synthetics tests for continuous integration.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsCITestBody body = new SyntheticsCITestBody(); // SyntheticsCITestBody | Details of the test to trigger.
        try {
            SyntheticsTriggerCITestsResponse result = apiInstance.triggerCITests(body);
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


## updateAPITest

> SyntheticsAPITest updateAPITest(publicId, body);

Edit the configuration of a Synthetic API test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        SyntheticsAPITest body = new SyntheticsAPITest(); // SyntheticsAPITest | New test details to be saved.
        try {
            SyntheticsAPITest result = apiInstance.updateAPITest(publicId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#updateAPITest");
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
 **body** | [**SyntheticsAPITest**](SyntheticsAPITest.md)| New test details to be saved. |

### Return type

[**SyntheticsAPITest**](SyntheticsAPITest.md)

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
| **404** | - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found |  -  |


## updateBrowserTest

> SyntheticsBrowserTest updateBrowserTest(publicId, body);

Edit the configuration of a Synthetic browser test.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the test to get details from.
        SyntheticsBrowserTest body = new SyntheticsBrowserTest(); // SyntheticsBrowserTest | New test details to be saved.
        try {
            SyntheticsBrowserTest result = apiInstance.updateBrowserTest(publicId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#updateBrowserTest");
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
 **body** | [**SyntheticsBrowserTest**](SyntheticsBrowserTest.md)| New test details to be saved. |

### Return type

[**SyntheticsBrowserTest**](SyntheticsBrowserTest.md)

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
| **404** | - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found |  -  |


## updatePrivateLocation

> SyntheticsPrivateLocation updatePrivateLocation(locationId, body);

Edit a Synthetics private location.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String locationId = "locationId_example"; // String | The ID of the private location.
        SyntheticsPrivateLocation body = new SyntheticsPrivateLocation(); // SyntheticsPrivateLocation | Details of the private location to be updated.
        try {
            SyntheticsPrivateLocation result = apiInstance.updatePrivateLocation(locationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#updatePrivateLocation");
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
 **locationId** | **String**| The ID of the private location. |
 **body** | [**SyntheticsPrivateLocation**](SyntheticsPrivateLocation.md)| Details of the private location to be updated. |

### Return type

[**SyntheticsPrivateLocation**](SyntheticsPrivateLocation.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | - Private locations are not activated for the user - Private location does not exist |  -  |


## updateTestPauseStatus

> Boolean updateTestPauseStatus(publicId, body);

Pause or start a Synthetics test by changing the status.

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        String publicId = "publicId_example"; // String | The public ID of the Synthetic test to update.
        SyntheticsUpdateTestPauseStatusPayload body = new SyntheticsUpdateTestPauseStatusPayload(); // SyntheticsUpdateTestPauseStatusPayload | Status to set the given Synthetic test to.
        try {
            Boolean result = apiInstance.updateTestPauseStatus(publicId, body);
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

