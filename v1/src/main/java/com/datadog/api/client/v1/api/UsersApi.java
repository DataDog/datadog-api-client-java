package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiResponse;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.UserCreatePayload;
import com.datadog.api.client.v1.model.UserCreateResponse;
import com.datadog.api.client.v1.model.UserDisableResponse;
import com.datadog.api.client.v1.model.UserGetAllResponse;
import com.datadog.api.client.v1.model.UserGetResponse;
import com.datadog.api.client.v1.model.UserUpdatePayload;
import com.datadog.api.client.v1.model.UserUpdateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create user
   * ### Overview Create a user for your organization. ### Arguments * **&#x60;handle&#x60;** [*required*]: The user handle, must be a valid email. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The name of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:    *  **st** (standard user),    *  **adm** (admin user),    *  **ro** (read-only user). *Note: users can be created with admin access role      only with application keys belonging to administrators.*
   * @param userCreatePayload User object that needs to be created (required)
   * @return UserCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public UserCreateResponse createUser(UserCreatePayload userCreatePayload) throws ApiException {
    return createUserWithHttpInfo(userCreatePayload).getData();
      }

  /**
   * Create user
   * ### Overview Create a user for your organization. ### Arguments * **&#x60;handle&#x60;** [*required*]: The user handle, must be a valid email. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The name of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:    *  **st** (standard user),    *  **adm** (admin user),    *  **ro** (read-only user). *Note: users can be created with admin access role      only with application keys belonging to administrators.*
   * @param userCreatePayload User object that needs to be created (required)
   * @return ApiResponse&lt;UserCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserCreateResponse> createUserWithHttpInfo(UserCreatePayload userCreatePayload) throws ApiException {
    Object localVarPostBody = userCreatePayload;
    
    // verify the required parameter 'userCreatePayload' is set
    if (userCreatePayload == null) {
      throw new ApiException(400, "Missing the required parameter 'userCreatePayload' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserCreateResponse> localVarReturnType = new GenericType<UserCreateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Disable user
   * ### Overview Delete a user from an organization. **Note**: This endpoint can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user.
   * @param userHandle The handle of the user (required)
   * @return UserDisableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public UserDisableResponse disableUser(String userHandle) throws ApiException {
    return disableUserWithHttpInfo(userHandle).getData();
      }

  /**
   * Disable user
   * ### Overview Delete a user from an organization. **Note**: This endpoint can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user.
   * @param userHandle The handle of the user (required)
   * @return ApiResponse&lt;UserDisableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserDisableResponse> disableUserWithHttpInfo(String userHandle) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(400, "Missing the required parameter 'userHandle' when calling disableUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{user_handle}"
      .replaceAll("\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "applcation/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserDisableResponse> localVarReturnType = new GenericType<UserDisableResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all users
   * ### Overview Get all users for your organization. ### Arguments This endpoint takes no JSON argument.
   * @return UserGetAllResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public UserGetAllResponse getAllUsers() throws ApiException {
    return getAllUsersWithHttpInfo().getData();
      }

  /**
   * Get all users
   * ### Overview Get all users for your organization. ### Arguments This endpoint takes no JSON argument.
   * @return ApiResponse&lt;UserGetAllResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserGetAllResponse> getAllUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserGetAllResponse> localVarReturnType = new GenericType<UserGetAllResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user
   * ### Overview Get a user details. ### Arguments * **&#x60;user_handle&#x60;** [*required*]: The handle of the user.
   * @param userHandle The id of the user (required)
   * @return UserGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public UserGetResponse getUser(String userHandle) throws ApiException {
    return getUserWithHttpInfo(userHandle).getData();
      }

  /**
   * Get user
   * ### Overview Get a user details. ### Arguments * **&#x60;user_handle&#x60;** [*required*]: The handle of the user.
   * @param userHandle The id of the user (required)
   * @return ApiResponse&lt;UserGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserGetResponse> getUserWithHttpInfo(String userHandle) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(400, "Missing the required parameter 'userHandle' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{user_handle}"
      .replaceAll("\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserGetResponse> localVarReturnType = new GenericType<UserGetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update user
   * ### Overview Update a user informations **Note**: It can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The new name of the user. * **&#x60;email&#x60;** [*optional*, *default*&#x3D;**None**]: The new email of the user. * **&#x60;disabled&#x60;** [*optional*, *default*&#x3D;**None**]: The new disabled status of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:   *  **st** (standard user),   *  **adm** (admin user),   *  **ro** (read-only user).
   * @param userHandle The id of the user (required)
   * @param userUpdatePayload Description of the update (required)
   * @return UserUpdateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public UserUpdateResponse updateUser(String userHandle, UserUpdatePayload userUpdatePayload) throws ApiException {
    return updateUserWithHttpInfo(userHandle, userUpdatePayload).getData();
      }

  /**
   * Update user
   * ### Overview Update a user informations **Note**: It can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The new name of the user. * **&#x60;email&#x60;** [*optional*, *default*&#x3D;**None**]: The new email of the user. * **&#x60;disabled&#x60;** [*optional*, *default*&#x3D;**None**]: The new disabled status of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:   *  **st** (standard user),   *  **adm** (admin user),   *  **ro** (read-only user).
   * @param userHandle The id of the user (required)
   * @param userUpdatePayload Description of the update (required)
   * @return ApiResponse&lt;UserUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserUpdateResponse> updateUserWithHttpInfo(String userHandle, UserUpdatePayload userUpdatePayload) throws ApiException {
    Object localVarPostBody = userUpdatePayload;
    
    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(400, "Missing the required parameter 'userHandle' when calling updateUser");
    }
    
    // verify the required parameter 'userUpdatePayload' is set
    if (userUpdatePayload == null) {
      throw new ApiException(400, "Missing the required parameter 'userUpdatePayload' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{user_handle}"
      .replaceAll("\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserUpdateResponse> localVarReturnType = new GenericType<UserUpdateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
