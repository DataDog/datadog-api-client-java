# HostsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHostTotals**](HostsApi.md#getHostTotals) | **GET** /api/v1/hosts/totals | Get the total number of active hosts
[**listHosts**](HostsApi.md#listHosts) | **GET** /api/v1/hosts | Get all hosts for your organization
[**muteHost**](HostsApi.md#muteHost) | **POST** /api/v1/host/{host_name}/mute | Mute a host
[**unmuteHost**](HostsApi.md#unmuteHost) | **POST** /api/v1/host/{host_name}/unmute | Unmute a host



## getHostTotals

> HostTotals getHostTotals().from(from).execute();

Get the total number of active hosts

This endpoint returns the total number of active and up hosts in your Datadog account.
Active means the host has reported in the past hour, and up means it has reported in the past two hours.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.HostsApi;

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

        HostsApi apiInstance = new HostsApi(defaultClient);
        Long from = 56L; // Long | Number of seconds from which you want to get total number of active hosts.
        try {
            HostTotals result = api.getHostTotals()
                .from(from)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#getHostTotals");
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
 **from** | **Long**| Number of seconds from which you want to get total number of active hosts. | [optional]

### Return type

[**HostTotals**](HostTotals.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |


## listHosts

> HostListResponse listHosts().filter(filter).sortField(sortField).sortDir(sortDir).start(start).count(count).from(from).execute();

Get all hosts for your organization

This endpoint allows searching for hosts by name, alias, or tag.
Hosts live within the past 3 hours are included.
Results are paginated with a max of 1000 results at a time.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.HostsApi;

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

        HostsApi apiInstance = new HostsApi(defaultClient);
        String filter = "filter_example"; // String | String to filter search results.
        String sortField = "sortField_example"; // String | Sort hosts by this field.
        String sortDir = "sortDir_example"; // String | Direction of sort. Options include `asc` and `desc`.
        Long start = 56L; // Long | Host result to start search from.
        Long count = 56L; // Long | Number of hosts to return. Max 1000.
        Long from = 56L; // Long | Number of seconds since UNIX epoch from which you want to search your hosts.
        try {
            HostListResponse result = api.listHosts()
                .filter(filter)
                .sortField(sortField)
                .sortDir(sortDir)
                .start(start)
                .count(count)
                .from(from)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#listHosts");
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
 **filter** | **String**| String to filter search results. | [optional]
 **sortField** | **String**| Sort hosts by this field. | [optional]
 **sortDir** | **String**| Direction of sort. Options include &#x60;asc&#x60; and &#x60;desc&#x60;. | [optional]
 **start** | **Long**| Host result to start search from. | [optional]
 **count** | **Long**| Number of hosts to return. Max 1000. | [optional]
 **from** | **Long**| Number of seconds since UNIX epoch from which you want to search your hosts. | [optional]

### Return type

[**HostListResponse**](HostListResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |


## muteHost

> HostMuteResponse muteHost(hostName).body(body).execute();

Mute a host

Mute a host.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.HostsApi;

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

        HostsApi apiInstance = new HostsApi(defaultClient);
        String hostName = "hostName_example"; // String | Name of the host to mute.
        HostMuteSettings body = new HostMuteSettings(); // HostMuteSettings | Mute a host.
        try {
            HostMuteResponse result = api.muteHost(hostName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#muteHost");
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
 **hostName** | **String**| Name of the host to mute. |
 **body** | [**HostMuteSettings**](HostMuteSettings.md)| Mute a host. | [optional]

### Return type

[**HostMuteResponse**](HostMuteResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |


## unmuteHost

> HostMuteResponse unmuteHost(hostName).execute();

Unmute a host

Unmutes a host. This endpoint takes no JSON arguments.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.HostsApi;

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

        HostsApi apiInstance = new HostsApi(defaultClient);
        String hostName = "hostName_example"; // String | Name of the host to unmute.
        try {
            HostMuteResponse result = api.unmuteHost(hostName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#unmuteHost");
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
 **hostName** | **String**| Name of the host to unmute. |

### Return type

[**HostMuteResponse**](HostMuteResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid Parameter Error |  -  |
| **403** | Forbidden |  -  |

