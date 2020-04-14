package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.Permissions;
import com.datadog.api.v2.client.model.QuerySortOrder;
import com.datadog.api.v2.client.model.UserCreatePayload;
import com.datadog.api.v2.client.model.UserInvitationPayload;
import com.datadog.api.v2.client.model.UserInvitationResponse;
import com.datadog.api.v2.client.model.UserInvitationsResponse;
import com.datadog.api.v2.client.model.UserResponsePayload;
import com.datadog.api.v2.client.model.UserUpdatePayload;
import com.datadog.api.v2.client.model.UsersResponsePayload;

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

private ApiResponse<UserResponsePayload> createUserWithHttpInfo(UserCreatePayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/users";

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

    GenericType<UserResponsePayload> localVarReturnType = new GenericType<UserResponsePayload>() {};
    return apiClient.invokeAPI("UsersApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateUserRequest {
    private UserCreatePayload body;

    private APIcreateUserRequest() {
    }
    

    /**
     * Set body
     * @param body  (optional)
     * @return APIcreateUserRequest
     */
    public APIcreateUserRequest body(UserCreatePayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createUser request
     * @return UserResponsePayload
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponsePayload execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createUser request with HTTP info returned
     * @return ApiResponse&lt;UserResponsePayload&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponsePayload> executeWithHttpInfo() throws ApiException {
      return createUserWithHttpInfo(body);
    }
  }

  /**
   * Create user
   * Create a user for your organization.
   * @return createUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateUserRequest createUser() throws ApiException {
    return new APIcreateUserRequest();
  }

private ApiResponse<Void> disableUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling disableUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    return apiClient.invokeAPI("UsersApi.disableUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIdisableUserRequest {
    private String userId;

    private APIdisableUserRequest(String userId) {
      this.userId = userId;
    }
    

    /**
     * Execute disableUser request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute disableUser request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return disableUserWithHttpInfo(userId);
    }
  }

  /**
   * Disable user
   * Disable user. Can only be used with an application key belonging to an administrator user.
   * @param userId The ID of the user. (required)
   * @return disableUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdisableUserRequest disableUser(String userId) throws ApiException {
    return new APIdisableUserRequest(userId);
  }

private ApiResponse<UserInvitationResponse> getInvitationWithHttpInfo(String userInvitationUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userInvitationUuid' is set
    if (userInvitationUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userInvitationUuid' when calling getInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/user_invitations/{user_invitation_uuid}"
      .replaceAll("\\{" + "user_invitation_uuid" + "\\}", apiClient.escapeString(userInvitationUuid.toString()));

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

    GenericType<UserInvitationResponse> localVarReturnType = new GenericType<UserInvitationResponse>() {};
    return apiClient.invokeAPI("UsersApi.getInvitation", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetInvitationRequest {
    private String userInvitationUuid;

    private APIgetInvitationRequest(String userInvitationUuid) {
      this.userInvitationUuid = userInvitationUuid;
    }
    

    /**
     * Execute getInvitation request
     * @return UserInvitationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserInvitationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getInvitation request with HTTP info returned
     * @return ApiResponse&lt;UserInvitationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserInvitationResponse> executeWithHttpInfo() throws ApiException {
      return getInvitationWithHttpInfo(userInvitationUuid);
    }
  }

  /**
   * Get a user invitation
   * Returns a single user invitation by its UUID.
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return getInvitationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetInvitationRequest getInvitation(String userInvitationUuid) throws ApiException {
    return new APIgetInvitationRequest(userInvitationUuid);
  }

private ApiResponse<UserResponsePayload> getUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserResponsePayload> localVarReturnType = new GenericType<UserResponsePayload>() {};
    return apiClient.invokeAPI("UsersApi.getUser", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUserRequest {
    private String userId;

    private APIgetUserRequest(String userId) {
      this.userId = userId;
    }
    

    /**
     * Execute getUser request
     * @return UserResponsePayload
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponsePayload execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUser request with HTTP info returned
     * @return ApiResponse&lt;UserResponsePayload&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponsePayload> executeWithHttpInfo() throws ApiException {
      return getUserWithHttpInfo(userId);
    }
  }

  /**
   * Get a user
   * Get a user in the organization specified by the user’s &#x60;user_id&#x60;.
   * @param userId The ID of the user. (required)
   * @return getUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUserRequest getUser(String userId) throws ApiException {
    return new APIgetUserRequest(userId);
  }

private ApiResponse<UserResponsePayload> getUserOrganizationWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserOrganization");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}/orgs"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserResponsePayload> localVarReturnType = new GenericType<UserResponsePayload>() {};
    return apiClient.invokeAPI("UsersApi.getUserOrganization", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUserOrganizationRequest {
    private String userId;

    private APIgetUserOrganizationRequest(String userId) {
      this.userId = userId;
    }
    

    /**
     * Execute getUserOrganization request
     * @return UserResponsePayload
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponsePayload execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUserOrganization request with HTTP info returned
     * @return ApiResponse&lt;UserResponsePayload&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserResponsePayload> executeWithHttpInfo() throws ApiException {
      return getUserOrganizationWithHttpInfo(userId);
    }
  }

  /**
   * Get a user organization
   * Get a user organization. Returns the user information and all organizations joined by this user.
   * @param userId The ID of the user. (required)
   * @return getUserOrganizationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUserOrganizationRequest getUserOrganization(String userId) throws ApiException {
    return new APIgetUserOrganizationRequest(userId);
  }

private ApiResponse<Permissions> getUserPermissionsWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}/permissions"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Permissions> localVarReturnType = new GenericType<Permissions>() {};
    return apiClient.invokeAPI("UsersApi.getUserPermissions", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUserPermissionsRequest {
    private String userId;

    private APIgetUserPermissionsRequest(String userId) {
      this.userId = userId;
    }
    

    /**
     * Execute getUserPermissions request
     * @return Permissions
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Permissions execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUserPermissions request with HTTP info returned
     * @return ApiResponse&lt;Permissions&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Permissions> executeWithHttpInfo() throws ApiException {
      return getUserPermissionsWithHttpInfo(userId);
    }
  }

  /**
   * Get a user permissions
   * Get a user permission set. Returns a list of the user’s permissions granted by the associated user&#39;s roles.
   * @param userId The ID of the user. (required)
   * @return getUserPermissionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUserPermissionsRequest getUserPermissions(String userId) throws ApiException {
    return new APIgetUserPermissionsRequest(userId);
  }

private ApiResponse<UsersResponsePayload> listUsersWithHttpInfo(Long pageSize, Long pageNumber, String sort, QuerySortOrder sortDir, String filter, String filterStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "applcation/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsersResponsePayload> localVarReturnType = new GenericType<UsersResponsePayload>() {};
    return apiClient.invokeAPI("UsersApi.listUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistUsersRequest {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private QuerySortOrder sortDir;
    private String filter;
    private String filterStatus;

    private APIlistUsersRequest() {
    }
    

    /**
     * Set pageSize
     * @param pageSize Number of users to return for a given page. (optional, default to 10l)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
    

    /**
     * Set pageNumber
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
    

    /**
     * Set sort
     * @param sort User attribute to order results by. Sort order is ascending by default. Sort order is descending if the field is prefixed by a negative sign, for example &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;modified_at&#x60;, &#x60;user_count&#x60;. (optional, default to &quot;name&quot;)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest sort(String sort) {
      this.sort = sort;
      return this;
    }
    

    /**
     * Set sortDir
     * @param sortDir Direction of sort. Options: &#x60;asc&#x60;, &#x60;desc&#x60;. (optional, default to desc)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest sortDir(QuerySortOrder sortDir) {
      this.sortDir = sortDir;
      return this;
    }
    

    /**
     * Set filter
     * @param filter Filter all users by the given string. Defaults to no filtering. (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest filter(String filter) {
      this.filter = filter;
      return this;
    }
    

    /**
     * Set filterStatus
     * @param filterStatus Filter on status attribute. Comma separated list: Active, Pending, and Disabled. Defaults to no filtering. (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
    

    /**
     * Execute listUsers request
     * @return UsersResponsePayload
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsersResponsePayload execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUsers request with HTTP info returned
     * @return ApiResponse&lt;UsersResponsePayload&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsersResponsePayload> executeWithHttpInfo() throws ApiException {
      return listUsersWithHttpInfo(pageSize, pageNumber, sort, sortDir, filter, filterStatus);
    }
  }

  /**
   * List all users
   * Get the list of all users in the organization. This list includes all users even if they are disabled or unverified.
   * @return listUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistUsersRequest listUsers() throws ApiException {
    return new APIlistUsersRequest();
  }

private ApiResponse<UserInvitationsResponse> sendInvitationsWithHttpInfo(UserInvitationPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/user_invitations";

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

    GenericType<UserInvitationsResponse> localVarReturnType = new GenericType<UserInvitationsResponse>() {};
    return apiClient.invokeAPI("UsersApi.sendInvitations", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIsendInvitationsRequest {
    private UserInvitationPayload body;

    private APIsendInvitationsRequest() {
    }
    

    /**
     * Set body
     * @param body  (optional)
     * @return APIsendInvitationsRequest
     */
    public APIsendInvitationsRequest body(UserInvitationPayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute sendInvitations request
     * @return UserInvitationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserInvitationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendInvitations request with HTTP info returned
     * @return ApiResponse&lt;UserInvitationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UserInvitationsResponse> executeWithHttpInfo() throws ApiException {
      return sendInvitationsWithHttpInfo(body);
    }
  }

  /**
   * Send invitation emails
   * Sends emails to one or more users inviting them to join the organization.
   * @return sendInvitationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIsendInvitationsRequest sendInvitations() throws ApiException {
    return new APIsendInvitationsRequest();
  }

private ApiResponse<Void> updateUserWithHttpInfo(String userId, UserUpdatePayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    return apiClient.invokeAPI("UsersApi.updateUser", localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIupdateUserRequest {
    private String userId;
    private UserUpdatePayload body;

    private APIupdateUserRequest(String userId) {
      this.userId = userId;
    }
    

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateUserRequest
     */
    public APIupdateUserRequest body(UserUpdatePayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateUser request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateUser request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return updateUserWithHttpInfo(userId, body);
    }
  }

  /**
   * Update a user
   * Edit a user. Can only be used with an application key belonging to an administrator user.
   * @param userId The ID of the user. (required)
   * @return updateUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateUserRequest updateUser(String userId) throws ApiException {
    return new APIupdateUserRequest(userId);
  }
}
