# SlackIntegrationApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSlackIntegrationChannel**](SlackIntegrationApi.md#createSlackIntegrationChannel) | **POST** /api/v1/integration/slack/configuration/accounts/{account_name}/channels | Create a Slack integration channel
[**getSlackIntegrationChannel**](SlackIntegrationApi.md#getSlackIntegrationChannel) | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Get a Slack integration channel
[**getSlackIntegrationChannels**](SlackIntegrationApi.md#getSlackIntegrationChannels) | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels | Get all channels in a Slack integration
[**removeSlackIntegrationChannel**](SlackIntegrationApi.md#removeSlackIntegrationChannel) | **DELETE** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Remove a Slack integration channel
[**updateSlackIntegrationChannel**](SlackIntegrationApi.md#updateSlackIntegrationChannel) | **PATCH** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Update a Slack integration channel



## createSlackIntegrationChannel

> SlackIntegrationChannel createSlackIntegrationChannel(accountName).body(body).execute();

Create a Slack integration channel

Add a channel to your Datadog-Slack integration.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

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

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        SlackIntegrationChannel body = new SlackIntegrationChannel(); // SlackIntegrationChannel | Payload describing Slack channel to be created
        try {
            SlackIntegrationChannel result = apiInstance.createSlackIntegrationChannel(accountName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#createSlackIntegrationChannel");
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
 **accountName** | **String**| Your Slack account name. |
 **body** | [**SlackIntegrationChannel**](SlackIntegrationChannel.md)| Payload describing Slack channel to be created |

### Return type

[**SlackIntegrationChannel**](SlackIntegrationChannel.md)

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
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## getSlackIntegrationChannel

> SlackIntegrationChannel getSlackIntegrationChannel(accountName, channelName).execute();

Get a Slack integration channel

Get a channel configured for your Datadog-Slack integration.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

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

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        String channelName = "channelName_example"; // String | The name of the Slack channel being operated on.
        try {
            SlackIntegrationChannel result = apiInstance.getSlackIntegrationChannel(accountName, channelName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#getSlackIntegrationChannel");
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
 **accountName** | **String**| Your Slack account name. |
 **channelName** | **String**| The name of the Slack channel being operated on. |

### Return type

[**SlackIntegrationChannel**](SlackIntegrationChannel.md)

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
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## getSlackIntegrationChannels

> List&lt;SlackIntegrationChannel&gt; getSlackIntegrationChannels(accountName).execute();

Get all channels in a Slack integration

Get a list of all channels configured for your Datadog-Slack integration.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

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

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        try {
            List<SlackIntegrationChannel> result = apiInstance.getSlackIntegrationChannels(accountName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#getSlackIntegrationChannels");
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
 **accountName** | **String**| Your Slack account name. |

### Return type

[**List&lt;SlackIntegrationChannel&gt;**](SlackIntegrationChannel.md)

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
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## removeSlackIntegrationChannel

> removeSlackIntegrationChannel(accountName, channelName).execute();

Remove a Slack integration channel

Remove a channel from your Datadog-Slack integration.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

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

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        String channelName = "channelName_example"; // String | The name of the Slack channel being operated on.
        try {
            apiInstance.removeSlackIntegrationChannel(accountName, channelName)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#removeSlackIntegrationChannel");
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
 **accountName** | **String**| Your Slack account name. |
 **channelName** | **String**| The name of the Slack channel being operated on. |

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
| **204** | The channel was removed successfully. |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |


## updateSlackIntegrationChannel

> SlackIntegrationChannel updateSlackIntegrationChannel(accountName, channelName).body(body).execute();

Update a Slack integration channel

Update a channel used in your Datadog-Slack integration.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

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

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        String channelName = "channelName_example"; // String | The name of the Slack channel being operated on.
        SlackIntegrationChannel body = new SlackIntegrationChannel(); // SlackIntegrationChannel | Payload describing fields and values to be updated.
        try {
            SlackIntegrationChannel result = apiInstance.updateSlackIntegrationChannel(accountName, channelName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#updateSlackIntegrationChannel");
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
 **accountName** | **String**| Your Slack account name. |
 **channelName** | **String**| The name of the Slack channel being operated on. |
 **body** | [**SlackIntegrationChannel**](SlackIntegrationChannel.md)| Payload describing fields and values to be updated. |

### Return type

[**SlackIntegrationChannel**](SlackIntegrationChannel.md)

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
| **403** | Authentication error |  -  |
| **404** | Item Not Found |  -  |

