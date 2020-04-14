# UsersApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /api/v2/users | Create user
[**disableUser**](UsersApi.md#disableUser) | **DELETE** /api/v2/users/{user_id} | Disable user
[**getInvitation**](UsersApi.md#getInvitation) | **GET** /api/v2/user_invitations/{user_invitation_uuid} | Get a user invitation
[**getUser**](UsersApi.md#getUser) | **GET** /api/v2/users/{user_id} | Get a user
[**getUserOrganization**](UsersApi.md#getUserOrganization) | **GET** /api/v2/users/{user_id}/orgs | Get a user organization
[**getUserPermissions**](UsersApi.md#getUserPermissions) | **GET** /api/v2/users/{user_id}/permissions | Get a user permissions
[**listUsers**](UsersApi.md#listUsers) | **GET** /api/v2/users | List all users
[**sendInvitations**](UsersApi.md#sendInvitations) | **POST** /api/v2/user_invitations | Send invitation emails
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /api/v2/users/{user_id} | Update a user



## createUser

> UserResponsePayload createUser().body(body).execute();

Create user

Create a user for your organization.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserCreatePayload body = new UserCreatePayload(); // UserCreatePayload | 
        try {
            UserResponsePayload result = api.createUser()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
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
 **body** | [**UserCreatePayload**](UserCreatePayload.md)|  | [optional]

### Return type

[**UserResponsePayload**](UserResponsePayload.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## disableUser

> disableUser(userId).execute();

Disable user

Disable user. Can only be used with an application key belonging to an administrator user.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            api.disableUser(userId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#disableUser");
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
 **userId** | **String**| The ID of the user. |

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## getInvitation

> UserInvitationResponse getInvitation(userInvitationUuid).execute();

Get a user invitation

Returns a single user invitation by its UUID.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userInvitationUuid = "userInvitationUuid_example"; // String | The UUID of the user invitation.
        try {
            UserInvitationResponse result = api.getInvitation(userInvitationUuid)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getInvitation");
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
 **userInvitationUuid** | **String**| The UUID of the user invitation. |

### Return type

[**UserInvitationResponse**](UserInvitationResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## getUser

> UserResponsePayload getUser(userId).execute();

Get a user

Get a user in the organization specified by the user’s `user_id`.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            UserResponsePayload result = api.getUser(userId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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
 **userId** | **String**| The ID of the user. |

### Return type

[**UserResponsePayload**](UserResponsePayload.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK for get user |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## getUserOrganization

> UserResponsePayload getUserOrganization(userId).execute();

Get a user organization

Get a user organization. Returns the user information and all organizations joined by this user.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            UserResponsePayload result = api.getUserOrganization(userId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserOrganization");
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
 **userId** | **String**| The ID of the user. |

### Return type

[**UserResponsePayload**](UserResponsePayload.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## getUserPermissions

> Permissions getUserPermissions(userId).execute();

Get a user permissions

Get a user permission set. Returns a list of the user’s permissions granted by the associated user's roles.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            Permissions result = api.getUserPermissions(userId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserPermissions");
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
 **userId** | **String**| The ID of the user. |

### Return type

[**Permissions**](Permissions.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## listUsers

> UsersResponsePayload listUsers().pageSize(pageSize).pageNumber(pageNumber).sort(sort).sortDir(sortDir).filter(filter).filterStatus(filterStatus).execute();

List all users

Get the list of all users in the organization. This list includes all users even if they are disabled or unverified.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        Long pageSize = 10lL; // Long | Number of users to return for a given page.
        Long pageNumber = 0lL; // Long | Specific page number to return.
        String sort = "\"name\""; // String | User attribute to order results by. Sort order is ascending by default. Sort order is descending if the field is prefixed by a negative sign, for example `sort=-name`. Options: `name`, `modified_at`, `user_count`.
        QuerySortOrder sortDir = new QuerySortOrder(); // QuerySortOrder | Direction of sort. Options: `asc`, `desc`.
        String filter = "filter_example"; // String | Filter all users by the given string. Defaults to no filtering.
        String filterStatus = "filterStatus_example"; // String | Filter on status attribute. Comma separated list: Active, Pending, and Disabled. Defaults to no filtering.
        try {
            UsersResponsePayload result = api.listUsers()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .sortDir(sortDir)
                .filter(filter)
                .filterStatus(filterStatus)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#listUsers");
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
 **pageSize** | **Long**| Number of users to return for a given page. | [optional] [default to 10l]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0l]
 **sort** | **String**| User attribute to order results by. Sort order is ascending by default. Sort order is descending if the field is prefixed by a negative sign, for example &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;modified_at&#x60;, &#x60;user_count&#x60;. | [optional] [default to &quot;name&quot;]
 **sortDir** | [**QuerySortOrder**](.md)| Direction of sort. Options: &#x60;asc&#x60;, &#x60;desc&#x60;. | [optional] [default to desc] [enum: asc, desc]
 **filter** | **String**| Filter all users by the given string. Defaults to no filtering. | [optional]
 **filterStatus** | **String**| Filter on status attribute. Comma separated list: Active, Pending, and Disabled. Defaults to no filtering. | [optional]

### Return type

[**UsersResponsePayload**](UsersResponsePayload.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, applcation/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## sendInvitations

> UserInvitationsResponse sendInvitations().body(body).execute();

Send invitation emails

Sends emails to one or more users inviting them to join the organization.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserInvitationPayload body = new UserInvitationPayload(); // UserInvitationPayload | 
        try {
            UserInvitationsResponse result = api.sendInvitations()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#sendInvitations");
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
 **body** | [**UserInvitationPayload**](UserInvitationPayload.md)|  | [optional]

### Return type

[**UserInvitationsResponse**](UserInvitationsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## updateUser

> updateUser(userId).body(body).execute();

Update a user

Edit a user. Can only be used with an application key belonging to an administrator user.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        UserUpdatePayload body = new UserUpdatePayload(); // UserUpdatePayload | 
        try {
            api.updateUser(userId)
                .body(body)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
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
 **userId** | **String**| The ID of the user. |
 **body** | [**UserUpdatePayload**](UserUpdatePayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |

