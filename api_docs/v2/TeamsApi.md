# TeamsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTeam**](TeamsApi.md#createTeam) | **POST** /api/v2/teams | Create a new team
[**deleteTeam**](TeamsApi.md#deleteTeam) | **DELETE** /api/v2/teams/{team_id} | Delete an existing team
[**getTeam**](TeamsApi.md#getTeam) | **GET** /api/v2/teams/{team_id} | Get details of a team
[**getTeams**](TeamsApi.md#getTeams) | **GET** /api/v2/teams | Get a list of all teams
[**updateTeam**](TeamsApi.md#updateTeam) | **PATCH** /api/v2/teams/{team_id} | Update an existing team



## createTeam

> TeamResponse createTeam().body(body).execute();

Create a new team

Creates a new team.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.TeamsApi;

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

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        TeamCreateRequest body = new TeamCreateRequest(); // TeamCreateRequest | Teams Payload.
        try {
            TeamResponse result = api.createTeam()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#createTeam");
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
 **body** | [**TeamCreateRequest**](TeamCreateRequest.md)| Teams Payload. |

### Return type

[**TeamResponse**](TeamResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## deleteTeam

> deleteTeam(teamId).execute();

Delete an existing team

Deletes an existing team.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.TeamsApi;

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

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the team.
        try {
            api.deleteTeam(teamId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#deleteTeam");
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
 **teamId** | **String**| The ID of the team. |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getTeam

> TeamResponse getTeam(teamId).include(include).execute();

Get details of a team

Get details of a team. If the `include[users]` query parameter is provided, the included attribute will contain the users related to these teams.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.TeamsApi;

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

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the team.
        String include = "include_example"; // String | Specifies which types of related objects should be included in the response.
        try {
            TeamResponse result = api.getTeam(teamId)
                .include(include)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeam");
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
 **teamId** | **String**| The ID of the team. |
 **include** | **String**| Specifies which types of related objects should be included in the response. | [optional] [enum: users]

### Return type

[**TeamResponse**](TeamResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getTeams

> TeamsResponse getTeams().include(include).pageSize(pageSize).pageOffset(pageOffset).execute();

Get a list of all teams

Get all teams for the requesting user's organization. If the `include[users]` query parameter is provided, the included attribute will contain the users related to these teams.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.TeamsApi;

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

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String include = "include_example"; // String | Specifies which types of related objects should be included in the response.
        Long pageSize = 10lL; // Long | Size for a given page.
        Long pageOffset = 0lL; // Long | Specific offset to use as the beginning of the returned page.
        try {
            TeamsResponse result = api.getTeams()
                .include(include)
                .pageSize(pageSize)
                .pageOffset(pageOffset)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeams");
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
 **include** | **String**| Specifies which types of related objects should be included in the response. | [optional] [enum: users]
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10l]
 **pageOffset** | **Long**| Specific offset to use as the beginning of the returned page. | [optional] [default to 0l]

### Return type

[**TeamsResponse**](TeamsResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## updateTeam

> TeamResponse updateTeam(teamId).body(body).execute();

Update an existing team

Updates an existing team. Only provide the attributes which should be updated as this request is a partial update.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.TeamsApi;

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

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the team.
        TeamUpdateRequest body = new TeamUpdateRequest(); // TeamUpdateRequest | Teams Payload.
        try {
            TeamResponse result = api.updateTeam(teamId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#updateTeam");
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
 **teamId** | **String**| The ID of the team. |
 **body** | [**TeamUpdateRequest**](TeamUpdateRequest.md)| Teams Payload. |

### Return type

[**TeamResponse**](TeamResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

