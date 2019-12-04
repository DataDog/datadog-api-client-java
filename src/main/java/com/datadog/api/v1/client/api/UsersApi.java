package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.User;
import com.datadog.api.v1.client.model.UserDisableResponse;
import com.datadog.api.v1.client.model.UserListResponse;
import com.datadog.api.v1.client.model.UserResponse;

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

private ApiResponse<UserResponse> createUserWithHttpInfo(User user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateUserRequest {
    private User user;

    private APIcreateUserRequest(User user) {
      this.user = user;
    }
    

    /**
     * Execute createUser request
     * @return UserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> User created </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createUser request with HTTP info returned
     * @return ApiResponse&lt;UserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> User created </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return createUserWithHttpInfo(user);
    }
  }

  /**
   * Create user
   * ### Overview Create a user for your organization. ### Arguments * **&#x60;handle&#x60;** [*required*]: The user handle, must be a valid email. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The name of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:    *  **st** (standard user),    *  **adm** (admin user),    *  **ro** (read-only user).    **Note**: users can be created with admin access role      only with application keys belonging to administrators.
   * @param user User object that needs to be created (require)
   * @return createUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateUserRequest createUser(User user) throws ApiException {
    return new APIcreateUserRequest(user);
  }

private ApiResponse<UserDisableResponse> disableUserWithHttpInfo(String userHandle) throws ApiException {
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
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdisableUserRequest {
    private String userHandle;

    private APIdisableUserRequest(String userHandle) {
      this.userHandle = userHandle;
    }
    

    /**
     * Execute disableUser request
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
    
    public UserDisableResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute disableUser request with HTTP info returned
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
    
    public ApiResponse<UserDisableResponse> executeWithHttpInfo() throws ApiException {
      return disableUserWithHttpInfo(userHandle);
    }
  }

  /**
   * Disable user
   * ### Overview Delete a user from an organization.  **Note**: This endpoint can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user.
   * @param userHandle The handle of the user (required)
   
   * @return disableUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdisableUserRequest disableUser(String userHandle) throws ApiException {
    return new APIdisableUserRequest(userHandle);
  }

private ApiResponse<UserListResponse> getAllUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserListResponse> localVarReturnType = new GenericType<UserListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllUsersRequest {

    private APIgetAllUsersRequest() {
    }
    

    /**
     * Execute getAllUsers request
     * @return UserListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllUsers request with HTTP info returned
     * @return ApiResponse&lt;UserListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserListResponse> executeWithHttpInfo() throws ApiException {
      return getAllUsersWithHttpInfo();
    }
  }

  /**
   * Get all users
   * ### Overview Get all users for your organization. ### Arguments This endpoint takes no JSON argument.
   
   * @return getAllUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllUsersRequest getAllUsers() throws ApiException {
    return new APIgetAllUsersRequest();
  }

private ApiResponse<UserResponse> getUserWithHttpInfo(String userHandle) throws ApiException {
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
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUserRequest {
    private String userHandle;

    private APIgetUserRequest(String userHandle) {
      this.userHandle = userHandle;
    }
    

    /**
     * Execute getUser request
     * @return UserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUser request with HTTP info returned
     * @return ApiResponse&lt;UserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return getUserWithHttpInfo(userHandle);
    }
  }

  /**
   * Get user
   * ### Overview Get a user details. ### Arguments * **&#x60;user_handle&#x60;** [*required*]: The handle of the user.
   * @param userHandle The id of the user (required)
   
   * @return getUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUserRequest getUser(String userHandle) throws ApiException {
    return new APIgetUserRequest(userHandle);
  }

private ApiResponse<UserResponse> updateUserWithHttpInfo(String userHandle, User user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(400, "Missing the required parameter 'userHandle' when calling updateUser");
    }
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{user_handle}"
      .replaceAll("\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateUserRequest {
    private String userHandle;
    private User user;

    private APIupdateUserRequest(String userHandle, User user) {
      this.userHandle = userHandle;
      this.user = user;
    }
    

    /**
     * Execute updateUser request
     * @return UserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> User updated </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateUser request with HTTP info returned
     * @return ApiResponse&lt;UserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> User updated </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return updateUserWithHttpInfo(userHandle, user);
    }
  }

  /**
   * Update user
   * ### Overview Update a user informations.  **Note**: It can only be used with application keys belonging to administrators. ### Arguments * **&#x60;id&#x60;** [*required*]: The handle of the user. * **&#x60;name&#x60;** [*optional*, *default*&#x3D;**None**]: The new name of the user. * **&#x60;email&#x60;** [*optional*, *default*&#x3D;**None**]: The new email of the user. * **&#x60;disabled&#x60;** [*optional*, *default*&#x3D;**None**]: The new disabled status of the user. * **&#x60;access_role&#x60;** [*optional*, *default*&#x3D;**st**]: The access role of the user. Choose from:    *  **st** (standard user)    *  **adm** (admin user)    *  **ro** (read-only user)
   * @param userHandle The id of the user (required)
   * @param user Description of the update (require)
   * @return updateUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateUserRequest updateUser(String userHandle, User user) throws ApiException {
    return new APIupdateUserRequest(userHandle, user);
  }
}
