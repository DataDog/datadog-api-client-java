# ServiceLevelObjectiveCorrectionsApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#createSLOCorrection) | **POST** /api/v1/slo/correction | Create an SLO correction
[**deleteSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#deleteSLOCorrection) | **DELETE** /api/v1/slo/correction/{slo_correction_id} | Delete an SLO correction
[**getSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#getSLOCorrection) | **GET** /api/v1/slo/correction/{slo_correction_id} | Get an SLO correction for an SLO
[**listSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#listSLOCorrection) | **GET** /api/v1/slo/correction | Get all SLO corrections
[**updateSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#updateSLOCorrection) | **PATCH** /api/v1/slo/correction/{slo_correction_id} | Update an SLO correction



## createSLOCorrection

> SLOCorrectionResponse createSLOCorrection(body);

Create an SLO Correction

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        SLOCorrectionCreateRequest body = new SLOCorrectionCreateRequest(); // SLOCorrectionCreateRequest | Create an SLO Correction
        try {
            SLOCorrectionResponse result = apiInstance.createSLOCorrection(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#createSLOCorrection");
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
 **body** | [**SLOCorrectionCreateRequest**](SLOCorrectionCreateRequest.md)| Create an SLO Correction |

### Return type

[**SLOCorrectionResponse**](SLOCorrectionResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | SLO Not Found |  -  |


## deleteSLOCorrection

> deleteSLOCorrection(sloCorrectionId);

Permanently delete the specified SLO correction object

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        String sloCorrectionId = "sloCorrectionId_example"; // String | The ID of the SLO correction object
        try {
            apiInstance.deleteSLOCorrection(sloCorrectionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#deleteSLOCorrection");
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
 **sloCorrectionId** | **String**| The ID of the SLO correction object |

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
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## getSLOCorrection

> SLOCorrectionResponse getSLOCorrection(sloCorrectionId);

Get an SLO correction

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        String sloCorrectionId = "sloCorrectionId_example"; // String | The ID of the SLO correction object
        try {
            SLOCorrectionResponse result = apiInstance.getSLOCorrection(sloCorrectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#getSLOCorrection");
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
 **sloCorrectionId** | **String**| The ID of the SLO correction object |

### Return type

[**SLOCorrectionResponse**](SLOCorrectionResponse.md)

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
| **403** | Forbidden |  -  |


## listSLOCorrection

> SLOCorrectionListResponse listSLOCorrection();

Get all Service Level Objective corrections

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        try {
            SLOCorrectionListResponse result = apiInstance.listSLOCorrection();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#listSLOCorrection");
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

[**SLOCorrectionListResponse**](SLOCorrectionListResponse.md)

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


## updateSLOCorrection

> SLOCorrectionResponse updateSLOCorrection(sloCorrectionId, body);

Update the specified SLO correction object object

### Example

```java
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        String sloCorrectionId = "sloCorrectionId_example"; // String | The ID of the SLO correction object
        SLOCorrectionUpdateRequest body = new SLOCorrectionUpdateRequest(); // SLOCorrectionUpdateRequest | The edited SLO correction object.
        try {
            SLOCorrectionResponse result = apiInstance.updateSLOCorrection(sloCorrectionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#updateSLOCorrection");
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
 **sloCorrectionId** | **String**| The ID of the SLO correction object |
 **body** | [**SLOCorrectionUpdateRequest**](SLOCorrectionUpdateRequest.md)| The edited SLO correction object. |

### Return type

[**SLOCorrectionResponse**](SLOCorrectionResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

