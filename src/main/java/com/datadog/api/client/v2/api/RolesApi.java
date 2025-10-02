package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.PermissionsResponse;
import com.datadog.api.client.v2.model.RelationshipToPermission;
import com.datadog.api.client.v2.model.RelationshipToUser;
import com.datadog.api.client.v2.model.RoleCloneRequest;
import com.datadog.api.client.v2.model.RoleCreateRequest;
import com.datadog.api.client.v2.model.RoleCreateResponse;
import com.datadog.api.client.v2.model.RoleResponse;
import com.datadog.api.client.v2.model.RoleTemplateArray;
import com.datadog.api.client.v2.model.RoleUpdateRequest;
import com.datadog.api.client.v2.model.RoleUpdateResponse;
import com.datadog.api.client.v2.model.RolesResponse;
import com.datadog.api.client.v2.model.RolesSort;
import com.datadog.api.client.v2.model.UsersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Grant permission to a role.
   *
   * <p>See {@link #addPermissionToRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse addPermissionToRole(String roleId, RelationshipToPermission body)
      throws ApiException {
    return addPermissionToRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Grant permission to a role.
   *
   * <p>See {@link #addPermissionToRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PermissionsResponse&gt;
   */
  public CompletableFuture<PermissionsResponse> addPermissionToRoleAsync(
      String roleId, RelationshipToPermission body) {
    return addPermissionToRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Adds a permission to a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.addPermissionToRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * Grant permission to a role.
   *
   * <p>See {@link #addPermissionToRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PermissionsResponse>> addPermissionToRoleWithHttpInfoAsync(
      String roleId, RelationshipToPermission body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling addPermissionToRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addPermissionToRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.addPermissionToRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * Add a user to a role.
   *
   * <p>See {@link #addUserToRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse addUserToRole(String roleId, RelationshipToUser body) throws ApiException {
    return addUserToRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Add a user to a role.
   *
   * <p>See {@link #addUserToRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> addUserToRoleAsync(
      String roleId, RelationshipToUser body) {
    return addUserToRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Adds a user to a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.addUserToRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Add a user to a role.
   *
   * <p>See {@link #addUserToRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsersResponse>> addUserToRoleWithHttpInfoAsync(
      String roleId, RelationshipToUser body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling addUserToRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addUserToRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.addUserToRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Create a new role by cloning an existing role.
   *
   * <p>See {@link #cloneRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return RoleResponse
   * @throws ApiException if fails to make API call
   */
  public RoleResponse cloneRole(String roleId, RoleCloneRequest body) throws ApiException {
    return cloneRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Create a new role by cloning an existing role.
   *
   * <p>See {@link #cloneRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;RoleResponse&gt;
   */
  public CompletableFuture<RoleResponse> cloneRoleAsync(String roleId, RoleCloneRequest body) {
    return cloneRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Clone an existing role
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;RoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.cloneRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleResponse>() {});
  }

  /**
   * Create a new role by cloning an existing role.
   *
   * <p>See {@link #cloneRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RoleResponse>> cloneRoleWithHttpInfoAsync(
      String roleId, RoleCloneRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<RoleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'roleId' when calling cloneRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RoleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling cloneRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/clone"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.cloneRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RoleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleResponse>() {});
  }

  /**
   * Create role.
   *
   * <p>See {@link #createRoleWithHttpInfo}.
   *
   * @param body (required)
   * @return RoleCreateResponse
   * @throws ApiException if fails to make API call
   */
  public RoleCreateResponse createRole(RoleCreateRequest body) throws ApiException {
    return createRoleWithHttpInfo(body).getData();
  }

  /**
   * Create role.
   *
   * <p>See {@link #createRoleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RoleCreateResponse&gt;
   */
  public CompletableFuture<RoleCreateResponse> createRoleAsync(RoleCreateRequest body) {
    return createRoleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new role for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;RoleCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.createRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleCreateResponse>() {});
  }

  /**
   * Create role.
   *
   * <p>See {@link #createRoleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RoleCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RoleCreateResponse>> createRoleWithHttpInfoAsync(
      RoleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RoleCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createRole"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.createRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RoleCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleCreateResponse>() {});
  }

  /**
   * Delete role.
   *
   * <p>See {@link #deleteRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String roleId) throws ApiException {
    deleteRoleWithHttpInfo(roleId);
  }

  /**
   * Delete role.
   *
   * <p>See {@link #deleteRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRoleAsync(String roleId) {
    return deleteRoleWithHttpInfoAsync(roleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disables a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.deleteRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete role.
   *
   * <p>See {@link #deleteRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRoleWithHttpInfoAsync(String roleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'roleId' when calling deleteRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.deleteRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a role.
   *
   * <p>See {@link #getRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return RoleResponse
   * @throws ApiException if fails to make API call
   */
  public RoleResponse getRole(String roleId) throws ApiException {
    return getRoleWithHttpInfo(roleId).getData();
  }

  /**
   * Get a role.
   *
   * <p>See {@link #getRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;RoleResponse&gt;
   */
  public CompletableFuture<RoleResponse> getRoleAsync(String roleId) {
    return getRoleWithHttpInfoAsync(roleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a role in the organization specified by the role’s <code>role_id</code>.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return ApiResponse&lt;RoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.getRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleResponse>() {});
  }

  /**
   * Get a role.
   *
   * <p>See {@link #getRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RoleResponse>> getRoleWithHttpInfoAsync(String roleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<RoleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'roleId' when calling getRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.getRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RoleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleResponse>() {});
  }

  /**
   * List permissions.
   *
   * <p>See {@link #listPermissionsWithHttpInfo}.
   *
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse listPermissions() throws ApiException {
    return listPermissionsWithHttpInfo().getData();
  }

  /**
   * List permissions.
   *
   * <p>See {@link #listPermissionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PermissionsResponse&gt;
   */
  public CompletableFuture<PermissionsResponse> listPermissionsAsync() {
    return listPermissionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a list of all permissions, including name, description, and ID.
   *
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.listPermissions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * List permissions.
   *
   * <p>See {@link #listPermissionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;PermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PermissionsResponse>> listPermissionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/permissions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.listPermissions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * List permissions for a role.
   *
   * <p>See {@link #listRolePermissionsWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse listRolePermissions(String roleId) throws ApiException {
    return listRolePermissionsWithHttpInfo(roleId).getData();
  }

  /**
   * List permissions for a role.
   *
   * <p>See {@link #listRolePermissionsWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;PermissionsResponse&gt;
   */
  public CompletableFuture<PermissionsResponse> listRolePermissionsAsync(String roleId) {
    return listRolePermissionsWithHttpInfoAsync(roleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a list of all permissions for a single role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.listRolePermissions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * List permissions for a role.
   *
   * <p>See {@link #listRolePermissionsWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PermissionsResponse>> listRolePermissionsWithHttpInfoAsync(
      String roleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling listRolePermissions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.listRolePermissions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /** Manage optional parameters to listRoles. */
  public static class ListRolesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private RolesSort sort;
    private String filter;
    private String filterId;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort roles depending on the given field. Sort order is <strong>ascending</strong>
     *     by default. Sort order is <strong>descending</strong> if the field is prefixed by a
     *     negative sign, for example: <code>sort=-name</code>. (optional, default to "name")
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters sort(RolesSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter all roles by the given string. (optional)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter all roles by the given list of role IDs. (optional)
     * @return ListRolesOptionalParameters
     */
    public ListRolesOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }
  }

  /**
   * List roles.
   *
   * <p>See {@link #listRolesWithHttpInfo}.
   *
   * @return RolesResponse
   * @throws ApiException if fails to make API call
   */
  public RolesResponse listRoles() throws ApiException {
    return listRolesWithHttpInfo(new ListRolesOptionalParameters()).getData();
  }

  /**
   * List roles.
   *
   * <p>See {@link #listRolesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RolesResponse&gt;
   */
  public CompletableFuture<RolesResponse> listRolesAsync() {
    return listRolesWithHttpInfoAsync(new ListRolesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List roles.
   *
   * <p>See {@link #listRolesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RolesResponse
   * @throws ApiException if fails to make API call
   */
  public RolesResponse listRoles(ListRolesOptionalParameters parameters) throws ApiException {
    return listRolesWithHttpInfo(parameters).getData();
  }

  /**
   * List roles.
   *
   * <p>See {@link #listRolesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RolesResponse&gt;
   */
  public CompletableFuture<RolesResponse> listRolesAsync(ListRolesOptionalParameters parameters) {
    return listRolesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all roles, including their names and their unique identifiers.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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
    String filterId = parameters.filterId;
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.listRoles",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RolesResponse>() {});
  }

  /**
   * List roles.
   *
   * <p>See {@link #listRolesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RolesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RolesResponse>> listRolesWithHttpInfoAsync(
      ListRolesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    RolesSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterId = parameters.filterId;
    // create path and map variables
    String localVarPath = "/api/v2/roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.listRoles",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RolesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RolesResponse>() {});
  }

  /**
   * List role templates.
   *
   * <p>See {@link #listRoleTemplatesWithHttpInfo}.
   *
   * @return RoleTemplateArray
   * @throws ApiException if fails to make API call
   */
  public RoleTemplateArray listRoleTemplates() throws ApiException {
    return listRoleTemplatesWithHttpInfo().getData();
  }

  /**
   * List role templates.
   *
   * <p>See {@link #listRoleTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RoleTemplateArray&gt;
   */
  public CompletableFuture<RoleTemplateArray> listRoleTemplatesAsync() {
    return listRoleTemplatesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all role templates
   *
   * @return ApiResponse&lt;RoleTemplateArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RoleTemplateArray> listRoleTemplatesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRoleTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/roles/templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.listRoleTemplates",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleTemplateArray>() {});
  }

  /**
   * List role templates.
   *
   * <p>See {@link #listRoleTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RoleTemplateArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RoleTemplateArray>> listRoleTemplatesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listRoleTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RoleTemplateArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/roles/templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.listRoleTemplates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RoleTemplateArray>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleTemplateArray>() {});
  }

  /** Manage optional parameters to listRoleUsers. */
  public static class ListRoleUsersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filter;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort User attribute to order results by. Sort order is <strong>ascending</strong> by
     *     default. Sort order is <strong>descending</strong> if the field is prefixed by a negative
     *     sign, for example <code>sort=-name</code>. Options: <code>name</code>, <code>email</code>
     *     , <code>status</code>. (optional, default to "name")
     * @return ListRoleUsersOptionalParameters
     */
    public ListRoleUsersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
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
   * Get all users of a role.
   *
   * <p>See {@link #listRoleUsersWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listRoleUsers(String roleId) throws ApiException {
    return listRoleUsersWithHttpInfo(roleId, new ListRoleUsersOptionalParameters()).getData();
  }

  /**
   * Get all users of a role.
   *
   * <p>See {@link #listRoleUsersWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listRoleUsersAsync(String roleId) {
    return listRoleUsersWithHttpInfoAsync(roleId, new ListRoleUsersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all users of a role.
   *
   * <p>See {@link #listRoleUsersWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listRoleUsers(String roleId, ListRoleUsersOptionalParameters parameters)
      throws ApiException {
    return listRoleUsersWithHttpInfo(roleId, parameters).getData();
  }

  /**
   * Get all users of a role.
   *
   * <p>See {@link #listRoleUsersWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listRoleUsersAsync(
      String roleId, ListRoleUsersOptionalParameters parameters) {
    return listRoleUsersWithHttpInfoAsync(roleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Gets all users of a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.listRoleUsers",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Get all users of a role.
   *
   * <p>See {@link #listRoleUsersWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsersResponse>> listRoleUsersWithHttpInfoAsync(
      String roleId, ListRoleUsersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling listRoleUsers"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.listRoleUsers",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Revoke permission.
   *
   * <p>See {@link #removePermissionFromRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse removePermissionFromRole(String roleId, RelationshipToPermission body)
      throws ApiException {
    return removePermissionFromRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Revoke permission.
   *
   * <p>See {@link #removePermissionFromRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PermissionsResponse&gt;
   */
  public CompletableFuture<PermissionsResponse> removePermissionFromRoleAsync(
      String roleId, RelationshipToPermission body) {
    return removePermissionFromRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes a permission from a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;PermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.removePermissionFromRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * Revoke permission.
   *
   * <p>See {@link #removePermissionFromRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PermissionsResponse>>
      removePermissionFromRoleWithHttpInfoAsync(String roleId, RelationshipToPermission body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleId' when calling removePermissionFromRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling removePermissionFromRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/permissions"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.removePermissionFromRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PermissionsResponse>() {});
  }

  /**
   * Remove a user from a role.
   *
   * <p>See {@link #removeUserFromRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse removeUserFromRole(String roleId, RelationshipToUser body)
      throws ApiException {
    return removeUserFromRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Remove a user from a role.
   *
   * <p>See {@link #removeUserFromRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> removeUserFromRoleAsync(
      String roleId, RelationshipToUser body) {
    return removeUserFromRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes a user from a role.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.removeUserFromRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Remove a user from a role.
   *
   * <p>See {@link #removeUserFromRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsersResponse>> removeUserFromRoleWithHttpInfoAsync(
      String roleId, RelationshipToUser body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling removeUserFromRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling removeUserFromRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}/users"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.removeUserFromRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsersResponse>() {});
  }

  /**
   * Update a role.
   *
   * <p>See {@link #updateRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return RoleUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public RoleUpdateResponse updateRole(String roleId, RoleUpdateRequest body) throws ApiException {
    return updateRoleWithHttpInfo(roleId, body).getData();
  }

  /**
   * Update a role.
   *
   * <p>See {@link #updateRoleWithHttpInfoAsync}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;RoleUpdateResponse&gt;
   */
  public CompletableFuture<RoleUpdateResponse> updateRoleAsync(
      String roleId, RoleUpdateRequest body) {
    return updateRoleWithHttpInfoAsync(roleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a role. Can only be used with application keys belonging to administrators.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return ApiResponse&lt;RoleUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RolesApi.updateRole",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleUpdateResponse>() {});
  }

  /**
   * Update a role.
   *
   * <p>See {@link #updateRoleWithHttpInfo}.
   *
   * @param roleId The unique identifier of the role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RoleUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RoleUpdateResponse>> updateRoleWithHttpInfoAsync(
      String roleId, RoleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<RoleUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'roleId' when calling updateRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RoleUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RolesApi.updateRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RoleUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RoleUpdateResponse>() {});
  }
}
