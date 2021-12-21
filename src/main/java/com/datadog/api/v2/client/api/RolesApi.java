package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.RelationshipToPermission;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RoleCloneRequest;
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
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Grant permission to a role Adds a permission to a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public PermissionsResponse addPermissionToRole(String roleId, RelationshipToPermission body)
      throws ApiException {
    return addPermissionToRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Grant permission to a role Adds a permission to a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PermissionsResponse> addPermissionToRoleWithHttpInfo(
      String roleId, RelationshipToPermission body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling addPermissionToRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addPermissionToRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addPermissionToRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.addPermissionToRole",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Add a user to a role Adds a user to a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UsersResponse addUserToRole(String roleId, RelationshipToUser body) throws ApiException {
    return addUserToRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Add a user to a role Adds a user to a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsersResponse> addUserToRoleWithHttpInfo(
      String roleId, RelationshipToUser body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling addUserToRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addUserToRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addUserToRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.addUserToRole",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create a new role by cloning an existing role Clone an existing role
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return RoleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RoleResponse cloneRole(String roleId, RoleCloneRequest body) throws ApiException {
    return cloneRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Create a new role by cloning an existing role Clone an existing role
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;RoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RoleResponse> cloneRoleWithHttpInfo(String roleId, RoleCloneRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling cloneRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling cloneRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/clone"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "cloneRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<RoleResponse> localVarReturnType = new GenericType<RoleResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.cloneRole",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create role Create a new role for your organization.
   *
   * @param body (required)
   * @return RoleCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RoleCreateResponse createRole(RoleCreateRequest body) throws ApiException {
    return createRoleWithHttpInfo(body).getData();
  }

  /**
   * Create role Create a new role for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;RoleCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RoleCreateResponse> createRoleWithHttpInfo(RoleCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRole");
    }
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<RoleCreateResponse> localVarReturnType = new GenericType<RoleCreateResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.createRole",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete role Disables a role.
   *
   * @param roleId The ID of the role. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteRole(String roleId) throws ApiException {
    deleteRoleWithHttpInfo(roleId);
  }

  /**
   * Delete role Disables a role.
   *
   * @param roleId The ID of the role. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRoleWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling deleteRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "RolesApi.deleteRole",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Get a role Get a role in the organization specified by the role’s &#x60;role_id&#x60;.
   *
   * @param roleId The ID of the role. (required)
   * @return RoleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RoleResponse getRole(String roleId) throws ApiException {
    return getRoleWithHttpInfo(roleId).getData();
  }

  /**
   * Get a role Get a role in the organization specified by the role’s &#x60;role_id&#x60;.
   *
   * @param roleId The ID of the role. (required)
   * @return ApiResponse&lt;RoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RoleResponse> getRoleWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<RoleResponse> localVarReturnType = new GenericType<RoleResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.getRole",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * List permissions Returns a list of all permissions, including name, description, and ID.
   *
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public PermissionsResponse listPermissions() throws ApiException {
    return listPermissionsWithHttpInfo().getData();
  }

  /**
   * List permissions Returns a list of all permissions, including name, description, and ID.
   *
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PermissionsResponse> listPermissionsWithHttpInfo() throws ApiException {
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.listPermissions",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * List permissions for a role Returns a list of all permissions for a single role.
   *
   * @param roleId The ID of the role. (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public PermissionsResponse listRolePermissions(String roleId) throws ApiException {
    return listRolePermissionsWithHttpInfo(roleId).getData();
  }

  /**
   * List permissions for a role Returns a list of all permissions for a single role.
   *
   * @param roleId The ID of the role. (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PermissionsResponse> listRolePermissionsWithHttpInfo(String roleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling listRolePermissions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listRolePermissions");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.listRolePermissions",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listRoleUsers. */
  public static class ListRoleUsersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filter;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort User attribute to order results by. Sort order is **ascending** by default. Sort
     *     order is **descending** if the field is prefixed by a negative sign, for example
     *     &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;email&#x60;,
     *     &#x60;status&#x60;. (optional, default to name)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter all users by the given string. Defaults to no filtering. (optional)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
   * Get all users of a role Gets all users of a role.
   *
   * @param roleId The ID of the role. (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UsersResponse listRoleUsers(String roleId) throws ApiException {
    return listRoleUsersWithHttpInfo(roleId, new ListRoleUsersOptionalParameters()).getData();
  }

  /**
   * Get all users of a role Gets all users of a role.
   *
   * @param roleId The ID of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UsersResponse listRoleUsers(String roleId, ListRoleUsersOptionalParameters parameters)
      throws ApiException {
    return listRoleUsersWithHttpInfo(roleId, parameters).getData();
  }

  /**
   * Get all users of a role Gets all users of a role.
   *
   * @param roleId The ID of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsersResponse> listRoleUsersWithHttpInfo(
      String roleId, ListRoleUsersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling listRoleUsers");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.listRoleUsers",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listRoles. */
  public static class ListRolesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private RolesSort sort;
    private String filter;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Sort roles depending on the given field. Sort order is **ascending** by default.
     *     Sort order is **descending** if the field is prefixed by a negative sign, for example:
     *     &#x60;sort&#x3D;-name&#x60;. (optional, default to name)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters sort(RolesSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter all roles by the given string. (optional)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
   * List roles Returns all roles, including their names and IDs.
   *
   * @return RolesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RolesResponse listRoles() throws ApiException {
    return listRolesWithHttpInfo(new ListRolesOptionalParameters()).getData();
  }

  /**
   * List roles Returns all roles, including their names and IDs.
   *
   * @param parameters Optional parameters for the request.
   * @return RolesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RolesResponse listRoles(ListRolesOptionalParameters parameters) throws ApiException {
    return listRolesWithHttpInfo(parameters).getData();
  }

  /**
   * List roles Returns all roles, including their names and IDs.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RolesResponse> listRolesWithHttpInfo(ListRolesOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    RolesSort sort = parameters.sort;
    String filter = parameters.filter;
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<RolesResponse> localVarReturnType = new GenericType<RolesResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.listRoles",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Revoke permission Removes a permission from a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public PermissionsResponse removePermissionFromRole(String roleId, RelationshipToPermission body)
      throws ApiException {
    return removePermissionFromRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Revoke permission Removes a permission from a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PermissionsResponse> removePermissionFromRoleWithHttpInfo(
      String roleId, RelationshipToPermission body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling removePermissionFromRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling removePermissionFromRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removePermissionFromRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.removePermissionFromRole",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Remove a user from a role Removes a user from a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UsersResponse removeUserFromRole(String roleId, RelationshipToUser body)
      throws ApiException {
    return removeUserFromRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Remove a user from a role Removes a user from a role.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsersResponse> removeUserFromRoleWithHttpInfo(
      String roleId, RelationshipToUser body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling removeUserFromRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling removeUserFromRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removeUserFromRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.removeUserFromRole",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update a role Edit a role. Can only be used with application keys belonging to administrators.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return RoleUpdateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public RoleUpdateResponse updateRole(String roleId, RoleUpdateRequest body) throws ApiException {
    return updateRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Update a role Edit a role. Can only be used with application keys belonging to administrators.
   *
   * @param roleId The ID of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;RoleUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RoleUpdateResponse> updateRoleWithHttpInfo(
      String roleId, RoleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling updateRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateRole");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<RoleUpdateResponse> localVarReturnType = new GenericType<RoleUpdateResponse>() {};

    return apiClient.invokeAPI(
        "RolesApi.updateRole",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
