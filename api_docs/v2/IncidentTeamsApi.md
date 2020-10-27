# IncidentTeamsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIncidentTeam**](IncidentTeamsApi.md#createIncidentTeam) | **POST** /api/v2/teams | Create a new incident team
[**deleteIncidentTeam**](IncidentTeamsApi.md#deleteIncidentTeam) | **DELETE** /api/v2/teams/{team_id} | Delete an existing incident team
[**getIncidentTeam**](IncidentTeamsApi.md#getIncidentTeam) | **GET** /api/v2/teams/{team_id} | Get details of an incident team
[**getIncidentTeams**](IncidentTeamsApi.md#getIncidentTeams) | **GET** /api/v2/teams | Get a list of all incident teams
[**updateIncidentTeam**](IncidentTeamsApi.md#updateIncidentTeam) | **PATCH** /api/v2/teams/{team_id} | Update an existing incident team



## createIncidentTeam

> IncidentTeamResponse createIncidentTeam().body(body).execute();

Create a new incident team

Creates a new incident team.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

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

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        IncidentTeamCreateRequest body = new IncidentTeamCreateRequest(); // IncidentTeamCreateRequest | Incident Team Payload.
        try {
            IncidentTeamResponse result = api.createIncidentTeam()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#createIncidentTeam");
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
 **body** | [**IncidentTeamCreateRequest**](IncidentTeamCreateRequest.md)| Incident Team Payload. |

### Return type

[**IncidentTeamResponse**](IncidentTeamResponse.md)

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


## deleteIncidentTeam

> deleteIncidentTeam(teamId).execute();

Delete an existing incident team

Deletes an existing incident team.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

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

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the incident team.
        try {
            api.deleteIncidentTeam(teamId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#deleteIncidentTeam");
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
 **teamId** | **String**| The ID of the incident team. |

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


## getIncidentTeam

> IncidentTeamResponse getIncidentTeam(teamId).include(include).execute();

Get details of an incident team

Get details of an incident team. If the `include[users]` query parameter is provided, the included attribute will contain the users related to these incident teams.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

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

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the incident team.
        String include = "include_example"; // String | Specifies which types of related objects should be included in the response.
        try {
            IncidentTeamResponse result = api.getIncidentTeam(teamId)
                .include(include)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#getIncidentTeam");
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
 **teamId** | **String**| The ID of the incident team. |
 **include** | **String**| Specifies which types of related objects should be included in the response. | [optional] [enum: users]

### Return type

[**IncidentTeamResponse**](IncidentTeamResponse.md)

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


## getIncidentTeams

> IncidentTeamsResponse getIncidentTeams().include(include).pageSize(pageSize).pageOffset(pageOffset).execute();

Get a list of all incident teams

Get all incident teams for the requesting user's organization. If the `include[users]` query parameter is provided, the included attribute will contain the users related to these incident teams.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

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

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        String include = "include_example"; // String | Specifies which types of related objects should be included in the response.
        Long pageSize = 10lL; // Long | Size for a given page.
        Long pageOffset = 0lL; // Long | Specific offset to use as the beginning of the returned page.
        try {
            IncidentTeamsResponse result = api.getIncidentTeams()
                .include(include)
                .pageSize(pageSize)
                .pageOffset(pageOffset)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#getIncidentTeams");
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

[**IncidentTeamsResponse**](IncidentTeamsResponse.md)

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


## updateIncidentTeam

> IncidentTeamResponse updateIncidentTeam(teamId).body(body).execute();

Update an existing incident team

Updates an existing incident team. Only provide the attributes which should be updated as this request is a partial update.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

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

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the incident team.
        IncidentTeamUpdateRequest body = new IncidentTeamUpdateRequest(); // IncidentTeamUpdateRequest | Incident Team Payload.
        try {
            IncidentTeamResponse result = api.updateIncidentTeam(teamId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#updateIncidentTeam");
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
 **teamId** | **String**| The ID of the incident team. |
 **body** | [**IncidentTeamUpdateRequest**](IncidentTeamUpdateRequest.md)| Incident Team Payload. |

### Return type

[**IncidentTeamResponse**](IncidentTeamResponse.md)

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

