package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.QuerySortOrder;
import com.datadog.api.v2.client.model.UserCreateRequest;
import com.datadog.api.v2.client.model.UserInvitationResponse;
import com.datadog.api.v2.client.model.UserInvitationsRequest;
import com.datadog.api.v2.client.model.UserInvitationsResponse;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.v2.client.model.UserUpdateRequest;
import com.datadog.api.v2.client.model.UsersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<UserResponse> createUserWithHttpInfo(UserCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/users";

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

    return apiClient.invokeAPI("UsersApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateUserRequest {
    private UserCreateRequest body;

    private APIcreateUserRequest() {
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIcreateUserRequest
     */
    public APIcreateUserRequest body(UserCreateRequest body) {
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
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
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
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return createUserWithHttpInfo(body);
    }
  }

  /**
   * Create a user
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "disableUser");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("UsersApi.disableUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
   * Disable a user
   * Disable a user. Can only be used with an application key belonging to an administrator user.
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getInvitation");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserInvitationResponse> localVarReturnType = new GenericType<UserInvitationResponse>() {};

    return apiClient.invokeAPI("UsersApi.getInvitation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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

private ApiResponse<UserResponse> getUserWithHttpInfo(String userId) throws ApiException {
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

    return apiClient.invokeAPI("UsersApi.getUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUserRequest {
    private String userId;

    private APIgetUserRequest(String userId) {
      this.userId = userId;
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
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
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
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return getUserWithHttpInfo(userId);
    }
  }

  /**
   * Get user details
   * Get a user in the organization specified by the user’s &#x60;user_id&#x60;.
   * @param userId The ID of the user. (required)
   * @return getUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUserRequest getUser(String userId) throws ApiException {
    return new APIgetUserRequest(userId);
  }

private ApiResponse<UserResponse> listUserOrganizationsWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listUserOrganizations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}/orgs"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserOrganizations");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI("UsersApi.listUserOrganizations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistUserOrganizationsRequest {
    private String userId;

    private APIlistUserOrganizationsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Execute listUserOrganizations request
     * @return UserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUserOrganizations request with HTTP info returned
     * @return ApiResponse&lt;UserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
      return listUserOrganizationsWithHttpInfo(userId);
    }
  }

  /**
   * Get a user organization
   * Get a user organization. Returns the user information and all organizations joined by this user.
   * @param userId The ID of the user. (required)
   * @return listUserOrganizationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistUserOrganizationsRequest listUserOrganizations(String userId) throws ApiException {
    return new APIlistUserOrganizationsRequest(userId);
  }

private ApiResponse<PermissionsResponse> listUserPermissionsWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listUserPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/users/{user_id}/permissions"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserPermissions");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI("UsersApi.listUserPermissions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistUserPermissionsRequest {
    private String userId;

    private APIlistUserPermissionsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Execute listUserPermissions request
     * @return PermissionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PermissionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUserPermissions request with HTTP info returned
     * @return ApiResponse&lt;PermissionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PermissionsResponse> executeWithHttpInfo() throws ApiException {
      return listUserPermissionsWithHttpInfo(userId);
    }
  }

  /**
   * Get a user permissions
   * Get a user permission set. Returns a list of the user’s permissions granted by the associated user&#39;s roles.
   * @param userId The ID of the user. (required)
   * @return listUserPermissionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistUserPermissionsRequest listUserPermissions(String userId) throws ApiException {
    return new APIlistUserPermissionsRequest(userId);
  }

private ApiResponse<UsersResponse> listUsersWithHttpInfo(Long pageSize, Long pageNumber, String sort, QuerySortOrder sortDir, String filter, String filterStatus) throws ApiException {
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

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI("UsersApi.listUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
     * @param pageSize Size for a given page. (optional, default to 10l)
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
     * @param filterStatus Filter on status attribute. Comma separated list, with possible values &#x60;Active&#x60;, &#x60;Pending&#x60;, and &#x60;Disabled&#x60;. Defaults to no filtering. (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Execute listUsers request
     * @return UsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUsers request with HTTP info returned
     * @return ApiResponse&lt;UsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsersResponse> executeWithHttpInfo() throws ApiException {
      return listUsersWithHttpInfo(pageSize, pageNumber, sort, sortDir, filter, filterStatus);
    }
  }

  /**
   * List all users
   * Get the list of all users in the organization. This list includes all users even if they are deactivated or unverified.
   * @return listUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistUsersRequest listUsers() throws ApiException {
    return new APIlistUsersRequest();
  }

private ApiResponse<UserInvitationsResponse> sendInvitationsWithHttpInfo(UserInvitationsRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/user_invitations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "sendInvitations");

    
    
    
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

    return apiClient.invokeAPI("UsersApi.sendInvitations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendInvitationsRequest {
    private UserInvitationsRequest body;

    private APIsendInvitationsRequest() {
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIsendInvitationsRequest
     */
    public APIsendInvitationsRequest body(UserInvitationsRequest body) {
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

private ApiResponse<UserResponse> updateUserWithHttpInfo(String userId, UserUpdateRequest body) throws ApiException {
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

    return apiClient.invokeAPI("UsersApi.updateUser", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateUserRequest {
    private String userId;
    private UserUpdateRequest body;

    private APIupdateUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateUserRequest
     */
    public APIupdateUserRequest body(UserUpdateRequest body) {
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
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
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
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UserResponse> executeWithHttpInfo() throws ApiException {
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
