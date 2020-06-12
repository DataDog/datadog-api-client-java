package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.RelationshipToPermission;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RoleCreateRequest;
import com.datadog.api.v2.client.model.RoleCreateResponse;
import com.datadog.api.v2.client.model.RoleResponse;
import com.datadog.api.v2.client.model.RoleUpdateRequest;
import com.datadog.api.v2.client.model.RoleUpdateResponse;
import com.datadog.api.v2.client.model.RolesResponse;
import com.datadog.api.v2.client.model.RolesSort;
import com.datadog.api.v2.client.model.UsersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
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


private ApiResponse<PermissionsResponse> addPermissionToRoleWithHttpInfo(String roleId, RelationshipToPermission body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling addPermissionToRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/permissions"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addPermissionToRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI("RolesApi.addPermissionToRole", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIaddPermissionToRoleRequest {
    private String roleId;
    private RelationshipToPermission body;

    private APIaddPermissionToRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIaddPermissionToRoleRequest
     */
    public APIaddPermissionToRoleRequest body(RelationshipToPermission body) {
      this.body = body;
      return this;
    }

    /**
     * Execute addPermissionToRole request
     * @return PermissionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PermissionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addPermissionToRole request with HTTP info returned
     * @return ApiResponse&lt;PermissionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PermissionsResponse> executeWithHttpInfo() throws ApiException {
      return addPermissionToRoleWithHttpInfo(roleId, body);
    }
  }

  /**
   * Grant permission to a role
   * Adds a permission to a role.
   * @param roleId The ID of the role. (required)
   * @return addPermissionToRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddPermissionToRoleRequest addPermissionToRole(String roleId) throws ApiException {
    return new APIaddPermissionToRoleRequest(roleId);
  }

private ApiResponse<UsersResponse> addUserToRoleWithHttpInfo(String roleId, RelationshipToUser body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling addUserToRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/users"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addUserToRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI("RolesApi.addUserToRole", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIaddUserToRoleRequest {
    private String roleId;
    private RelationshipToUser body;

    private APIaddUserToRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIaddUserToRoleRequest
     */
    public APIaddUserToRoleRequest body(RelationshipToUser body) {
      this.body = body;
      return this;
    }

    /**
     * Execute addUserToRole request
     * @return UsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addUserToRole request with HTTP info returned
     * @return ApiResponse&lt;UsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsersResponse> executeWithHttpInfo() throws ApiException {
      return addUserToRoleWithHttpInfo(roleId, body);
    }
  }

  /**
   * Add a user to a role
   * Adds a user to a role.
   * @param roleId The ID of the role. (required)
   * @return addUserToRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddUserToRoleRequest addUserToRole(String roleId) throws ApiException {
    return new APIaddUserToRoleRequest(roleId);
  }

private ApiResponse<RoleCreateResponse> createRoleWithHttpInfo(RoleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<RoleCreateResponse> localVarReturnType = new GenericType<RoleCreateResponse>() {};

    return apiClient.invokeAPI("RolesApi.createRole", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcreateRoleRequest {
    private RoleCreateRequest body;

    private APIcreateRoleRequest() {
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIcreateRoleRequest
     */
    public APIcreateRoleRequest body(RoleCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createRole request
     * @return RoleCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RoleCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createRole request with HTTP info returned
     * @return ApiResponse&lt;RoleCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RoleCreateResponse> executeWithHttpInfo() throws ApiException {
      return createRoleWithHttpInfo(body);
    }
  }

  /**
   * Create role
   * Create a new role for your organization.
   * @return createRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateRoleRequest createRole() throws ApiException {
    return new APIcreateRoleRequest();
  }

private ApiResponse<Void> deleteRoleWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("RolesApi.deleteRole", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null);
  }

  public class APIdeleteRoleRequest {
    private String roleId;

    private APIdeleteRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Execute deleteRole request
     
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
     * Execute deleteRole request with HTTP info returned
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
      return deleteRoleWithHttpInfo(roleId);
    }
  }

  /**
   * Delete role
   * Disables a role.
   * @param roleId The ID of the role. (required)
   * @return deleteRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteRoleRequest deleteRole(String roleId) throws ApiException {
    return new APIdeleteRoleRequest(roleId);
  }

private ApiResponse<RoleResponse> getRoleWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<RoleResponse> localVarReturnType = new GenericType<RoleResponse>() {};

    return apiClient.invokeAPI("RolesApi.getRole", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIgetRoleRequest {
    private String roleId;

    private APIgetRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Execute getRole request
     * @return RoleResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get role </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RoleResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getRole request with HTTP info returned
     * @return ApiResponse&lt;RoleResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK for get role </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RoleResponse> executeWithHttpInfo() throws ApiException {
      return getRoleWithHttpInfo(roleId);
    }
  }

  /**
   * Get a role
   * Get a role in the organization specified by the role’s &#x60;role_id&#x60;.
   * @param roleId The ID of the role. (required)
   * @return getRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetRoleRequest getRole(String roleId) throws ApiException {
    return new APIgetRoleRequest(roleId);
  }

private ApiResponse<PermissionsResponse> listPermissionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/permissions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listPermissions");

    
    
    
    final String[] localVarAccepts = {
      "application/json", "applcation/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI("RolesApi.listPermissions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistPermissionsRequest {

    private APIlistPermissionsRequest() {
    }

    /**
     * Execute listPermissions request
     * @return PermissionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PermissionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPermissions request with HTTP info returned
     * @return ApiResponse&lt;PermissionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PermissionsResponse> executeWithHttpInfo() throws ApiException {
      return listPermissionsWithHttpInfo();
    }
  }

  /**
   * List permissions
   * Returns a list of all permissions, including name, description, and ID.
   * @return listPermissionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPermissionsRequest listPermissions() throws ApiException {
    return new APIlistPermissionsRequest();
  }

private ApiResponse<PermissionsResponse> listRolePermissionsWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling listRolePermissions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/permissions"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listRolePermissions");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI("RolesApi.listRolePermissions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistRolePermissionsRequest {
    private String roleId;

    private APIlistRolePermissionsRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Execute listRolePermissions request
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
     * Execute listRolePermissions request with HTTP info returned
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
      return listRolePermissionsWithHttpInfo(roleId);
    }
  }

  /**
   * List permissions for a role
   * Returns a list of all permissions for a single role.
   * @param roleId The ID of the role. (required)
   * @return listRolePermissionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRolePermissionsRequest listRolePermissions(String roleId) throws ApiException {
    return new APIlistRolePermissionsRequest(roleId);
  }

private ApiResponse<UsersResponse> listRoleUsersWithHttpInfo(String roleId, Long pageSize, Long pageNumber, String sort, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling listRoleUsers");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/users"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listRoleUsers");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI("RolesApi.listRoleUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistRoleUsersRequest {
    private String roleId;
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filter;

    private APIlistRoleUsersRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistRoleUsersRequest
     */
    public APIlistRoleUsersRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistRoleUsersRequest
     */
    public APIlistRoleUsersRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     * @param sort User attribute to order results by. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;email&#x60;, &#x60;status&#x60;. (optional, default to &quot;name&quot;)
     * @return APIlistRoleUsersRequest
     */
    public APIlistRoleUsersRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     * @param filter Filter all users by the given string. Defaults to no filtering. (optional)
     * @return APIlistRoleUsersRequest
     */
    public APIlistRoleUsersRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Execute listRoleUsers request
     * @return UsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listRoleUsers request with HTTP info returned
     * @return ApiResponse&lt;UsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsersResponse> executeWithHttpInfo() throws ApiException {
      return listRoleUsersWithHttpInfo(roleId, pageSize, pageNumber, sort, filter);
    }
  }

  /**
   * Get all users of a role
   * Gets all users of a role.
   * @param roleId The ID of the role. (required)
   * @return listRoleUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRoleUsersRequest listRoleUsers(String roleId) throws ApiException {
    return new APIlistRoleUsersRequest(roleId);
  }

private ApiResponse<RolesResponse> listRolesWithHttpInfo(Long pageSize, Long pageNumber, RolesSort sort, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listRoles");

    
    
    
    final String[] localVarAccepts = {
      "application/json", "applcation/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<RolesResponse> localVarReturnType = new GenericType<RolesResponse>() {};

    return apiClient.invokeAPI("RolesApi.listRoles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistRolesRequest {
    private Long pageSize;
    private Long pageNumber;
    private RolesSort sort;
    private String filter;

    private APIlistRolesRequest() {
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistRolesRequest
     */
    public APIlistRolesRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistRolesRequest
     */
    public APIlistRolesRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     * @param sort Sort roles depending on the given field. Sort order is **ascending** by default. Sort order is **descending** if the field is prefixed by a negative sign, for example: &#x60;sort&#x3D;-name&#x60;. (optional, default to name)
     * @return APIlistRolesRequest
     */
    public APIlistRolesRequest sort(RolesSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     * @param filter Filter all roles by the given string. (optional)
     * @return APIlistRolesRequest
     */
    public APIlistRolesRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Execute listRoles request
     * @return RolesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RolesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listRoles request with HTTP info returned
     * @return ApiResponse&lt;RolesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RolesResponse> executeWithHttpInfo() throws ApiException {
      return listRolesWithHttpInfo(pageSize, pageNumber, sort, filter);
    }
  }

  /**
   * List roles
   * Returns all roles, including their names and IDs.
   * @return listRolesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRolesRequest listRoles() throws ApiException {
    return new APIlistRolesRequest();
  }

private ApiResponse<PermissionsResponse> removePermissionFromRoleWithHttpInfo(String roleId, RelationshipToPermission body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling removePermissionFromRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/permissions"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removePermissionFromRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI("RolesApi.removePermissionFromRole", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIremovePermissionFromRoleRequest {
    private String roleId;
    private RelationshipToPermission body;

    private APIremovePermissionFromRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIremovePermissionFromRoleRequest
     */
    public APIremovePermissionFromRoleRequest body(RelationshipToPermission body) {
      this.body = body;
      return this;
    }

    /**
     * Execute removePermissionFromRole request
     * @return PermissionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PermissionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removePermissionFromRole request with HTTP info returned
     * @return ApiResponse&lt;PermissionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PermissionsResponse> executeWithHttpInfo() throws ApiException {
      return removePermissionFromRoleWithHttpInfo(roleId, body);
    }
  }

  /**
   * Revoke permission
   * Removes a permission from a role.
   * @param roleId The ID of the role. (required)
   * @return removePermissionFromRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremovePermissionFromRoleRequest removePermissionFromRole(String roleId) throws ApiException {
    return new APIremovePermissionFromRoleRequest(roleId);
  }

private ApiResponse<UsersResponse> removeUserFromRoleWithHttpInfo(String roleId, RelationshipToUser body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling removeUserFromRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}/users"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removeUserFromRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI("RolesApi.removeUserFromRole", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIremoveUserFromRoleRequest {
    private String roleId;
    private RelationshipToUser body;

    private APIremoveUserFromRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIremoveUserFromRoleRequest
     */
    public APIremoveUserFromRoleRequest body(RelationshipToUser body) {
      this.body = body;
      return this;
    }

    /**
     * Execute removeUserFromRole request
     * @return UsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeUserFromRole request with HTTP info returned
     * @return ApiResponse&lt;UsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsersResponse> executeWithHttpInfo() throws ApiException {
      return removeUserFromRoleWithHttpInfo(roleId, body);
    }
  }

  /**
   * Remove a user from a role
   * Removes a user from a role.
   * @param roleId The ID of the role. (required)
   * @return removeUserFromRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveUserFromRoleRequest removeUserFromRole(String roleId) throws ApiException {
    return new APIremoveUserFromRoleRequest(roleId);
  }

private ApiResponse<RoleUpdateResponse> updateRoleWithHttpInfo(String roleId, RoleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling updateRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateRole");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<RoleUpdateResponse> localVarReturnType = new GenericType<RoleUpdateResponse>() {};

    return apiClient.invokeAPI("RolesApi.updateRole", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIupdateRoleRequest {
    private String roleId;
    private RoleUpdateRequest body;

    private APIupdateRoleRequest(String roleId) {
      this.roleId = roleId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateRoleRequest
     */
    public APIupdateRoleRequest body(RoleUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateRole request
     * @return RoleUpdateResponse
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
    
    public RoleUpdateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateRole request with HTTP info returned
     * @return ApiResponse&lt;RoleUpdateResponse&gt;
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
    public ApiResponse<RoleUpdateResponse> executeWithHttpInfo() throws ApiException {
      return updateRoleWithHttpInfo(roleId, body);
    }
  }

  /**
   * Update a role
   * Edit a role. Can only be used with application keys belonging to administrators.
   * @param roleId The ID of the role. (required)
   * @return updateRoleRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateRoleRequest updateRole(String roleId) throws ApiException {
    return new APIupdateRoleRequest(roleId);
  }
}
