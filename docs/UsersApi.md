# UsersApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /api/v1/user | Create user
[**disableUser**](UsersApi.md#disableUser) | **DELETE** /api/v1/user/{user_handle} | Disable user
[**getAllUsers**](UsersApi.md#getAllUsers) | **GET** /api/v1/user | Get all users
[**getUser**](UsersApi.md#getUser) | **GET** /api/v1/user/{user_handle} | Get user
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/v1/user/{user_handle} | Update user



## createUser


> UserResponse createUser(user).execute();

Create user

### Overview
Create a user for your organization.
### Arguments
* **`handle`** [*required*]: The user handle, must be a valid email.
* **`name`** [*optional*, *default*=**None**]: The name of the user.
* **`access_role`** [*optional*, *default*=**st**]: The access role of the user. Choose from:

  *  **st** (standard user),

  *  **adm** (admin user),

  *  **ro** (read-only user).

  **Note**: users can be created with admin access role
     only with application keys belonging to administrators.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsersApi;

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
        User user = new User(); // User | User object that needs to be created
        try { 
            UserResponse result = api.createUser(user)
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
 **user** | [**User**](User.md)| User object that needs to be created |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User created |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## disableUser


> UserDisableResponse disableUser(userHandle).execute();

Disable user

### Overview
Delete a user from an organization.

**Note**: This endpoint can only be used with application keys belonging to administrators.
### Arguments
* **`id`** [*required*]: The handle of the user.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsersApi;

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
        String userHandle = test@datadoghq.com; // String | The handle of the user
        try { 
            UserDisableResponse result = api.disableUser(userHandle)
                .execute();
            System.out.println(result);
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
 **userHandle** | [**String**](.md)| The handle of the user |

### Return type

[**UserDisableResponse**](UserDisableResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: applcation/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User disabled |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## getAllUsers


> UserListResponse getAllUsers().execute();

Get all users

### Overview
Get all users for your organization.
### Arguments
This endpoint takes no JSON argument.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsersApi;

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
        try { 
            UserListResponse result = api.getAllUsers()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getAllUsers");
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

[**UserListResponse**](UserListResponse.md)

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
| **403** | Authentication error |  -  |


## getUser


> UserResponse getUser(userHandle).execute();

Get user

### Overview
Get a user details.
### Arguments
* **`user_handle`** [*required*]: The handle of the user.

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsersApi;

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
        String userHandle = test@datadoghq.com; // String | The id of the user
        try { 
            UserResponse result = api.getUser(userHandle)
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
 **userHandle** | [**String**](.md)| The id of the user |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK for get user |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |


## updateUser


> UserResponse updateUser(userHandle, user).execute();

Update user

### Overview
Update a user informations.

**Note**: It can only be used with application keys belonging to administrators.
### Arguments
* **`id`** [*required*]: The handle of the user.
* **`name`** [*optional*, *default*=**None**]: The new name of the user.
* **`email`** [*optional*, *default*=**None**]: The new email of the user.
* **`disabled`** [*optional*, *default*=**None**]: The new disabled status of the user.
* **`access_role`** [*optional*, *default*=**st**]: The access role of the user. Choose from:

  *  **st** (standard user)

  *  **adm** (admin user)

  *  **ro** (read-only user)

### Example

```java
// Import classes:
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.models.*;
import com.datadog.api.v1.client.api.UsersApi;

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
        String userHandle = test@datadoghq.com; // String | The id of the user
        User user = new User(); // User | Description of the update
        try { 
            UserResponse result = api.updateUser(userHandle, user)
                .execute();
            System.out.println(result);
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
 **userHandle** | [**String**](.md)| The id of the user |
 **user** | [**User**](User.md)| Description of the update |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User updated |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication error |  -  |

