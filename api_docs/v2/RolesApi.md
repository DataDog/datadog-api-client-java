# RolesApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPermissionToRole**](RolesApi.md#addPermissionToRole) | **POST** /api/v2/roles/{role_id}/permissions | Grant permission to a role
[**addUserToRole**](RolesApi.md#addUserToRole) | **POST** /api/v2/roles/{role_id}/users | Add a user to a role
[**createRole**](RolesApi.md#createRole) | **POST** /api/v2/roles | Create role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /api/v2/roles/{role_id} | Delete role
[**getRole**](RolesApi.md#getRole) | **GET** /api/v2/roles/{role_id} | Get a role
[**listPermissions**](RolesApi.md#listPermissions) | **GET** /api/v2/permissions | List permissions
[**listRolePermissions**](RolesApi.md#listRolePermissions) | **GET** /api/v2/roles/{role_id}/permissions | List permissions for a role
[**listRoleUsers**](RolesApi.md#listRoleUsers) | **GET** /api/v2/roles/{role_id}/users | Get all users of a role
[**listRoles**](RolesApi.md#listRoles) | **GET** /api/v2/roles | List roles
[**removePermissionFromRole**](RolesApi.md#removePermissionFromRole) | **DELETE** /api/v2/roles/{role_id}/permissions | Revoke permission
[**removeUserFromRole**](RolesApi.md#removeUserFromRole) | **DELETE** /api/v2/roles/{role_id}/users | Remove a user from a role
[**updateRole**](RolesApi.md#updateRole) | **PATCH** /api/v2/roles/{role_id} | Update a role



## addPermissionToRole

> PermissionsResponse addPermissionToRole(roleId).body(body).execute();

Grant permission to a role

Adds a permission to a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        RelationshipToPermission body = new RelationshipToPermission(); // RelationshipToPermission | 
        try {
            PermissionsResponse result = api.addPermissionToRole(roleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#addPermissionToRole");
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
 **roleId** | **String**| The ID of the role. |
 **body** | [**RelationshipToPermission**](RelationshipToPermission.md)|  | [optional]

### Return type

[**PermissionsResponse**](PermissionsResponse.md)

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## addUserToRole

> UsersResponse addUserToRole(roleId).body(body).execute();

Add a user to a role

Adds a user to a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        RelationshipToUser body = new RelationshipToUser(); // RelationshipToUser | 
        try {
            UsersResponse result = api.addUserToRole(roleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#addUserToRole");
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
 **roleId** | **String**| The ID of the role. |
 **body** | [**RelationshipToUser**](RelationshipToUser.md)|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## createRole

> RoleResponse createRole().body(body).execute();

Create role

Create a new role for your organization.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        RoleCreatePayload body = new RoleCreatePayload(); // RoleCreatePayload | 
        try {
            RoleResponse result = api.createRole()
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
 **body** | [**RoleCreatePayload**](RoleCreatePayload.md)|  | [optional]

### Return type

[**RoleResponse**](RoleResponse.md)

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
| **403** | Authentication error |  -  |


## deleteRole

> deleteRole(roleId).execute();

Delete role

Disables a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        try {
            api.deleteRole(roleId)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
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
 **roleId** | **String**| The ID of the role. |

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


## getRole

> RoleResponse getRole(roleId).execute();

Get a role

Get a role in the organization specified by the role’s `role_id`.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        try {
            RoleResponse result = api.getRole(roleId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
 **roleId** | **String**| The ID of the role. |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK for get role |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## listPermissions

> PermissionsResponse listPermissions().execute();

List permissions

Returns a list of all permissions, including name, description, and ID.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        try {
            PermissionsResponse result = api.listPermissions()
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listPermissions");
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

[**PermissionsResponse**](PermissionsResponse.md)

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


## listRolePermissions

> PermissionsResponse listRolePermissions(roleId).execute();

List permissions for a role

Returns a list of all permissions for a single role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        try {
            PermissionsResponse result = api.listRolePermissions(roleId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listRolePermissions");
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
 **roleId** | **String**| The ID of the role. |

### Return type

[**PermissionsResponse**](PermissionsResponse.md)

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


## listRoleUsers

> UsersResponse listRoleUsers(roleId).pageSize(pageSize).pageNumber(pageNumber).sort(sort).filter(filter).execute();

Get all users of a role

Gets all users of a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        Long pageSize = 10lL; // Long | Number of users to return for a given page.
        Long pageNumber = 0lL; // Long | Specific page number to return.
        String sort = "\"name\""; // String | User attribute to order results by. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example `sort=-name`. Options: `name`, `email`, `status`.
        String filter = "filter_example"; // String | Filter all users by the given string. Defaults to no filtering.
        try {
            UsersResponse result = api.listRoleUsers(roleId)
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listRoleUsers");
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
 **roleId** | **String**| The ID of the role. |
 **pageSize** | **Long**| Number of users to return for a given page. | [optional] [default to 10l]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0l]
 **sort** | **String**| User attribute to order results by. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;email&#x60;, &#x60;status&#x60;. | [optional] [default to &quot;name&quot;]
 **filter** | **String**| Filter all users by the given string. Defaults to no filtering. | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

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


## listRoles

> RolesResponse listRoles().pageSize(pageSize).pageNumber(pageNumber).sort(sort).filter(filter).execute();

List roles

Returns all roles, including their names and IDs.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        Long pageSize = 10lL; // Long | Number of users to return for a given page.
        Long pageNumber = 0lL; // Long | Specific page number to return.
        RolesSort sort = new RolesSort(); // RolesSort | Sort roles depending on the given field. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example: `sort=-name`.
        String filter = "filter_example"; // String | Filter all roles by the given string.
        try {
            RolesResponse result = api.listRoles()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .filter(filter)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listRoles");
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
 **sort** | [**RolesSort**](.md)| Sort roles depending on the given field. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example: &#x60;sort&#x3D;-name&#x60;. | [optional] [default to name] [enum: name, -name, modified_at, -modified_at, user_count, -user_count]
 **filter** | **String**| Filter all roles by the given string. | [optional]

### Return type

[**RolesResponse**](RolesResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [appKeyAuth](../README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, applcation/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |


## removePermissionFromRole

> PermissionsResponse removePermissionFromRole(roleId).body(body).execute();

Revoke permission

Removes a permission from a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        RelationshipToPermission body = new RelationshipToPermission(); // RelationshipToPermission | 
        try {
            PermissionsResponse result = api.removePermissionFromRole(roleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#removePermissionFromRole");
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
 **roleId** | **String**| The ID of the role. |
 **body** | [**RelationshipToPermission**](RelationshipToPermission.md)|  | [optional]

### Return type

[**PermissionsResponse**](PermissionsResponse.md)

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## removeUserFromRole

> UsersResponse removeUserFromRole(roleId).body(body).execute();

Remove a user from a role

Removes a user from a role.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        RelationshipToUser body = new RelationshipToUser(); // RelationshipToUser | 
        try {
            UsersResponse result = api.removeUserFromRole(roleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#removeUserFromRole");
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
 **roleId** | **String**| The ID of the role. |
 **body** | [**RelationshipToUser**](RelationshipToUser.md)|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## updateRole

> RoleResponse updateRole(roleId).body(body).execute();

Update a role

Edit a role. Can only be used with application keys belonging to administrators.

### Example

```java
// Import classes:
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.models.*;
import com.datadog.api.v2.client.api.RolesApi;

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

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The ID of the role.
        RoleUpdatePayload body = new RoleUpdatePayload(); // RoleUpdatePayload | 
        try {
            RoleResponse result = api.updateRole(roleId)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
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
 **roleId** | **String**| The ID of the role. |
 **body** | [**RoleUpdatePayload**](RoleUpdatePayload.md)|  | [optional]

### Return type

[**RoleResponse**](RoleResponse.md)

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
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |

