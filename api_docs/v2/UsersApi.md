# UsersApi

All URIs are relative to *https://api.datadoghq.com*

Method        | HTTP request | Description
------------- | ------------ | ------------
[**createUser**](UsersApi.md#createUser) | **POST** /api/v2/users | Create a user
[**disableUser**](UsersApi.md#disableUser) | **DELETE** /api/v2/users/{user_id} | Disable a user
[**getInvitation**](UsersApi.md#getInvitation) | **GET** /api/v2/user_invitations/{user_invitation_uuid} | Get a user invitation
[**getUser**](UsersApi.md#getUser) | **GET** /api/v2/users/{user_id} | Get user details
[**listUserOrganizations**](UsersApi.md#listUserOrganizations) | **GET** /api/v2/users/{user_id}/orgs | Get a user organization
[**listUserPermissions**](UsersApi.md#listUserPermissions) | **GET** /api/v2/users/{user_id}/permissions | Get a user permissions
[**listUsers**](UsersApi.md#listUsers) | **GET** /api/v2/users | List all users
[**sendInvitations**](UsersApi.md#sendInvitations) | **POST** /api/v2/user_invitations | Send invitation emails
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /api/v2/users/{user_id} | Update a user



## createUser

> UserResponse createUser(body);

Create a user for your organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserCreateRequest body = new UserCreateRequest(); // UserCreateRequest | 
        try {
            UserResponse result = apiInstance.createUser(body);
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
 **body** | [**UserCreateRequest**](UserCreateRequest.md)|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> disableUser(userId);

Disable a user. Can only be used with an application key belonging
to an administrator user.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            apiInstance.disableUser(userId);
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> UserInvitationResponse getInvitation(userInvitationUuid);

Returns a single user invitation by its UUID.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userInvitationUuid = "userInvitationUuid_example"; // String | The UUID of the user invitation.
        try {
            UserInvitationResponse result = apiInstance.getInvitation(userInvitationUuid);
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

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> UserResponse getUser(userId);

Get a user in the organization specified by the user’s `user_id`.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            UserResponse result = apiInstance.getUser(userId);
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

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK for get user |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## listUserOrganizations

> UserResponse listUserOrganizations(userId);

Get a user organization. Returns the user information and all organizations
joined by this user.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            UserResponse result = apiInstance.listUserOrganizations(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#listUserOrganizations");
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

[**UserResponse**](UserResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authentication error |  -  |
| **404** | Not found |  -  |


## listUserPermissions

> PermissionsResponse listUserPermissions(userId);

Get a user permission set. Returns a list of the user’s permissions
granted by the associated user's roles.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        try {
            PermissionsResponse result = apiInstance.listUserPermissions(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#listUserPermissions");
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

[**PermissionsResponse**](PermissionsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> UsersResponse listUsers(parameters);

Get the list of all users in the organization. This list includes
all users even if they are deactivated or unverified.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        String sort = "name"; // String | User attribute to order results by. Sort order is ascending by default. Sort order is descending if the field is prefixed by a negative sign, for example `sort=-name`. Options: `name`, `modified_at`, `user_count`.
        QuerySortOrder sortDir = QuerySortOrder.fromValue("asc"); // QuerySortOrder | Direction of sort. Options: `asc`, `desc`.
        String filter = "filter_example"; // String | Filter all users by the given string. Defaults to no filtering.
        String filterStatus = "filterStatus_example"; // String | Filter on status attribute. Comma separated list, with possible values `Active`, `Pending`, and `Disabled`. Defaults to no filtering.
        try {
	    UsersResponse result = apiInstance.listUsers(new UsersApi.ListUsersOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .sort(sort)
                .sortDir(sortDir)
                .filter(filter)
                .filterStatus(filterStatus));
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
 **pageSize** | **Long**| Size for a given page. | [optional] [default to 10]
 **pageNumber** | **Long**| Specific page number to return. | [optional] [default to 0]
 **sort** | **String**| User attribute to order results by. Sort order is ascending by default. Sort order is descending if the field is prefixed by a negative sign, for example &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;modified_at&#x60;, &#x60;user_count&#x60;. | [optional] [default to name]
 **sortDir** | **QuerySortOrder**| Direction of sort. Options: &#x60;asc&#x60;, &#x60;desc&#x60;. | [optional] [enum: asc, desc]
 **filter** | **String**| Filter all users by the given string. Defaults to no filtering. | [optional]
 **filterStatus** | **String**| Filter on status attribute. Comma separated list, with possible values &#x60;Active&#x60;, &#x60;Pending&#x60;, and &#x60;Disabled&#x60;. Defaults to no filtering. | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

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


## sendInvitations

> UserInvitationsResponse sendInvitations(body);

Sends emails to one or more users inviting them to join the organization.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserInvitationsRequest body = new UserInvitationsRequest(); // UserInvitationsRequest | 
        try {
            UserInvitationsResponse result = apiInstance.sendInvitations(body);
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
 **body** | [**UserInvitationsRequest**](UserInvitationsRequest.md)|  |

### Return type

[**UserInvitationsResponse**](UserInvitationsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

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

> UserResponse updateUser(userId, body);

Edit a user. Can only be used with an application key belonging
to an administrator user.

### Example

```java
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user.
        UserUpdateRequest body = new UserUpdateRequest(); // UserUpdateRequest | 
        try {
            UserResponse result = apiInstance.updateUser(userId, body);
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
 **userId** | **String**| The ID of the user. |
 **body** | [**UserUpdateRequest**](UserUpdateRequest.md)|  |

### Return type

[**UserResponse**](UserResponse.md)

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
| **404** | Not found |  -  |
| **422** | Unprocessable Entity |  -  |

