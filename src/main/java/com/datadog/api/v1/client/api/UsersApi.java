package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
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

private ApiResponse<UserResponse> createUserWithHttpInfo(User body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createUser");

    
    
    
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
    return apiClient.invokeAPI("UsersApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateUserRequest {
    private User body;

    private APIcreateUserRequest() {
    }
    

    /**
     * Set body
     * @param body User object that needs to be created. (required)
     * @return APIcreateUserRequest
     */
    public APIcreateUserRequest body(User body) {
      this.body = body;
      return this;
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
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
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
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return createUserWithHttpInfo(body);
    }
  }

  /**
   * Create a user
   * Create a user for your organization.  **Note**: Users can only be created with the admin access role if application keys belong to administrators.
   * @return createUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateUserRequest createUser() throws ApiException {
    return new APIcreateUserRequest();
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "disableUser");

    
    
    
    final String[] localVarAccepts = {
      "applcation/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserDisableResponse> localVarReturnType = new GenericType<UserDisableResponse>() {};
    return apiClient.invokeAPI("UsersApi.disableUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserDisableResponse> executeWithHttpInfo() throws ApiException {
      return disableUserWithHttpInfo(userHandle);
    }
  }

  /**
   * Disable a user
   * Delete a user from an organization.  **Note**: This endpoint can only be used with application keys belonging to administrators.
   * @param userHandle The handle of the user. (required)
   * @return disableUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdisableUserRequest disableUser(String userHandle) throws ApiException {
    return new APIdisableUserRequest(userHandle);
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUser");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("UsersApi.getUser", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return getUserWithHttpInfo(userHandle);
    }
  }

  /**
   * Get user details
   * Get a user&#39;s details.
   * @param userHandle The ID of the user. (required)
   * @return getUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUserRequest getUser(String userHandle) throws ApiException {
    return new APIgetUserRequest(userHandle);
  }

private ApiResponse<UserListResponse> listUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUsers");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserListResponse> localVarReturnType = new GenericType<UserListResponse>() {};
    return apiClient.invokeAPI("UsersApi.listUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistUsersRequest {

    private APIlistUsersRequest() {
    }
    

    /**
     * Execute listUsers request
     * @return UserListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUsers request with HTTP info returned
     * @return ApiResponse&lt;UserListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserListResponse> executeWithHttpInfo() throws ApiException {
      return listUsersWithHttpInfo();
    }
  }

  /**
   * Get all users
   * Get all users for your organization.
   * @return listUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistUsersRequest listUsers() throws ApiException {
    return new APIlistUsersRequest();
  }

private ApiResponse<UserResponse> updateUserWithHttpInfo(String userHandle, User body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(400, "Missing the required parameter 'userHandle' when calling updateUser");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{user_handle}"
      .replaceAll("\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateUser");

    
    
    
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
    return apiClient.invokeAPI("UsersApi.updateUser", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateUserRequest {
    private String userHandle;
    private User body;

    private APIupdateUserRequest(String userHandle) {
      this.userHandle = userHandle;
    }
    

    /**
     * Set body
     * @param body Description of the update. (required)
     * @return APIupdateUserRequest
     */
    public APIupdateUserRequest body(User body) {
      this.body = body;
      return this;
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
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return updateUserWithHttpInfo(userHandle, body);
    }
  }

  /**
   * Update a user
   * Update a user information.  **Note**: It can only be used with application keys belonging to administrators.
   * @param userHandle The ID of the user. (required)
   * @return updateUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateUserRequest updateUser(String userHandle) throws ApiException {
    return new APIupdateUserRequest(userHandle);
  }
}
