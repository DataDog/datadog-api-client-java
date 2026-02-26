package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.PermissionsResponse;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.User;
import com.datadog.api.client.v2.model.UserCreateRequest;
import com.datadog.api.client.v2.model.UserInvitationResponse;
import com.datadog.api.client.v2.model.UserInvitationsRequest;
import com.datadog.api.client.v2.model.UserInvitationsResponse;
import com.datadog.api.client.v2.model.UserResponse;
import com.datadog.api.client.v2.model.UserUpdateRequest;
import com.datadog.api.client.v2.model.UsersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
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
   * Create a user.
   *
   * <p>See {@link #createUserWithHttpInfo}.
   *
   * @param body (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse createUser(UserCreateRequest body) throws ApiException {
    return createUserWithHttpInfo(body).getData();
  }

  /**
   * Create a user.
   *
   * <p>See {@link #createUserWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> createUserAsync(UserCreateRequest body) {
    return createUserWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a user for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> createUserWithHttpInfo(UserCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUser");
    }
    // create path and map variables
    String localVarPath = "/api/v2/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.createUser",
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Create a user.
   *
   * <p>See {@link #createUserWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> createUserWithHttpInfoAsync(
      UserCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createUser"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.createUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Disable a user.
   *
   * <p>See {@link #disableUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @throws ApiException if fails to make API call
   */
  public void disableUser(String userId) throws ApiException {
    disableUserWithHttpInfo(userId);
  }

  /**
   * Disable a user.
   *
   * <p>See {@link #disableUserWithHttpInfoAsync}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> disableUserAsync(String userId) {
    return disableUserWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable a user. Can only be used with an application key belonging to an administrator user.
   *
   * @param userId The ID of the user. (required)
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
  public ApiResponse<Void> disableUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling disableUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.disableUser",
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
   * Disable a user.
   *
   * <p>See {@link #disableUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> disableUserWithHttpInfoAsync(String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling disableUser"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.disableUser",
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
   * Get a user invitation.
   *
   * <p>See {@link #getInvitationWithHttpInfo}.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return UserInvitationResponse
   * @throws ApiException if fails to make API call
   */
  public UserInvitationResponse getInvitation(String userInvitationUuid) throws ApiException {
    return getInvitationWithHttpInfo(userInvitationUuid).getData();
  }

  /**
   * Get a user invitation.
   *
   * <p>See {@link #getInvitationWithHttpInfoAsync}.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return CompletableFuture&lt;UserInvitationResponse&gt;
   */
  public CompletableFuture<UserInvitationResponse> getInvitationAsync(String userInvitationUuid) {
    return getInvitationWithHttpInfoAsync(userInvitationUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a single user invitation by its UUID.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return ApiResponse&lt;UserInvitationResponse&gt;
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
  public ApiResponse<UserInvitationResponse> getInvitationWithHttpInfo(String userInvitationUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userInvitationUuid' is set
    if (userInvitationUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userInvitationUuid' when calling getInvitation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_invitations/{user_invitation_uuid}"
            .replaceAll(
                "\\{" + "user_invitation_uuid" + "\\}",
                apiClient.escapeString(userInvitationUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.getInvitation",
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
        new GenericType<UserInvitationResponse>() {});
  }

  /**
   * Get a user invitation.
   *
   * <p>See {@link #getInvitationWithHttpInfo}.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserInvitationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserInvitationResponse>> getInvitationWithHttpInfoAsync(
      String userInvitationUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'userInvitationUuid' is set
    if (userInvitationUuid == null) {
      CompletableFuture<ApiResponse<UserInvitationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'userInvitationUuid' when calling getInvitation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_invitations/{user_invitation_uuid}"
            .replaceAll(
                "\\{" + "user_invitation_uuid" + "\\}",
                apiClient.escapeString(userInvitationUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.getInvitation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserInvitationResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserInvitationResponse>() {});
  }

  /**
   * Get user details.
   *
   * <p>See {@link #getUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse getUser(String userId) throws ApiException {
    return getUserWithHttpInfo(userId).getData();
  }

  /**
   * Get user details.
   *
   * <p>See {@link #getUserWithHttpInfoAsync}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> getUserAsync(String userId) {
    return getUserWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user in the organization specified by the user’s <code>user_id</code>.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
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
  public ApiResponse<UserResponse> getUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.getUser",
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Get user details.
   *
   * <p>See {@link #getUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> getUserWithHttpInfoAsync(String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'userId' when calling getUser"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.getUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Get a user organization.
   *
   * <p>See {@link #listUserOrganizationsWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse listUserOrganizations(String userId) throws ApiException {
    return listUserOrganizationsWithHttpInfo(userId).getData();
  }

  /**
   * Get a user organization.
   *
   * <p>See {@link #listUserOrganizationsWithHttpInfoAsync}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> listUserOrganizationsAsync(String userId) {
    return listUserOrganizationsWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user organization. Returns the user information and all organizations joined by this
   * user.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
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
  public ApiResponse<UserResponse> listUserOrganizationsWithHttpInfo(String userId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling listUserOrganizations");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}/orgs"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.listUserOrganizations",
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Get a user organization.
   *
   * <p>See {@link #listUserOrganizationsWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> listUserOrganizationsWithHttpInfoAsync(
      String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling listUserOrganizations"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}/orgs"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.listUserOrganizations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Get a user permissions.
   *
   * <p>See {@link #listUserPermissionsWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse listUserPermissions(String userId) throws ApiException {
    return listUserPermissionsWithHttpInfo(userId).getData();
  }

  /**
   * Get a user permissions.
   *
   * <p>See {@link #listUserPermissionsWithHttpInfoAsync}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;PermissionsResponse&gt;
   */
  public CompletableFuture<PermissionsResponse> listUserPermissionsAsync(String userId) {
    return listUserPermissionsWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user permission set. Returns a list of the user’s permissions granted by the associated
   * user's roles.
   *
   * @param userId The ID of the user. (required)
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
  public ApiResponse<PermissionsResponse> listUserPermissionsWithHttpInfo(String userId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling listUserPermissions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}/permissions"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.listUserPermissions",
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
   * Get a user permissions.
   *
   * <p>See {@link #listUserPermissionsWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PermissionsResponse>> listUserPermissionsWithHttpInfoAsync(
      String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<PermissionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling listUserPermissions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}/permissions"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.listUserPermissions",
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

  /** Manage optional parameters to listUsers. */
  public static class ListUsersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private QuerySortOrder sortDir;
    private String filter;
    private String filterStatus;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort User attribute to order results by. Sort order is ascending by default. Sort
     *     order is descending if the field is prefixed by a negative sign, for example <code>
     *     sort=-name</code>. Options: <code>name</code>, <code>modified_at</code>, <code>user_count
     *     </code>. (optional, default to "name")
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set sortDir.
     *
     * @param sortDir Direction of sort. Options: <code>asc</code>, <code>desc</code>. (optional,
     *     default to "desc")
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters sortDir(QuerySortOrder sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter all users by the given string. Defaults to no filtering. (optional)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter on status attribute. Comma separated list, with possible values
     *     <code>Active</code>, <code>Pending</code>, and <code>Disabled</code>. Defaults to no
     *     filtering. (optional)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listUsers() throws ApiException {
    return listUsersWithHttpInfo(new ListUsersOptionalParameters()).getData();
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listUsersAsync() {
    return listUsersWithHttpInfoAsync(new ListUsersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listUsers(ListUsersOptionalParameters parameters) throws ApiException {
    return listUsersWithHttpInfo(parameters).getData();
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listUsersAsync(ListUsersOptionalParameters parameters) {
    return listUsersWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return PaginationIterable&lt;User&gt;
   */
  public PaginationIterable<User> listUsersWithPagination() {
    ListUsersOptionalParameters parameters = new ListUsersOptionalParameters();
    return listUsersWithPagination(parameters);
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return UsersResponse
   */
  public PaginationIterable<User> listUsersWithPagination(ListUsersOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listUsers",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Get the list of all users in the organization. This list includes all users even if they are
   * deactivated or unverified.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
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
  public ApiResponse<UsersResponse> listUsersWithHttpInfo(ListUsersOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    QuerySortOrder sortDir = parameters.sortDir;
    String filter = parameters.filter;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/users";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.listUsers",
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
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsersResponse>> listUsersWithHttpInfoAsync(
      ListUsersOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    QuerySortOrder sortDir = parameters.sortDir;
    String filter = parameters.filter;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/users";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.listUsers",
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
   * Send invitation emails.
   *
   * <p>See {@link #sendInvitationsWithHttpInfo}.
   *
   * @param body (required)
   * @return UserInvitationsResponse
   * @throws ApiException if fails to make API call
   */
  public UserInvitationsResponse sendInvitations(UserInvitationsRequest body) throws ApiException {
    return sendInvitationsWithHttpInfo(body).getData();
  }

  /**
   * Send invitation emails.
   *
   * <p>See {@link #sendInvitationsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;UserInvitationsResponse&gt;
   */
  public CompletableFuture<UserInvitationsResponse> sendInvitationsAsync(
      UserInvitationsRequest body) {
    return sendInvitationsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Sends emails to one or more users inviting them to join the organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserInvitationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserInvitationsResponse> sendInvitationsWithHttpInfo(
      UserInvitationsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling sendInvitations");
    }
    // create path and map variables
    String localVarPath = "/api/v2/user_invitations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.sendInvitations",
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
        new GenericType<UserInvitationsResponse>() {});
  }

  /**
   * Send invitation emails.
   *
   * <p>See {@link #sendInvitationsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserInvitationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserInvitationsResponse>> sendInvitationsWithHttpInfoAsync(
      UserInvitationsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserInvitationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling sendInvitations"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/user_invitations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.sendInvitations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserInvitationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserInvitationsResponse>() {});
  }

  /**
   * Update a user.
   *
   * <p>See {@link #updateUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse updateUser(String userId, UserUpdateRequest body) throws ApiException {
    return updateUserWithHttpInfo(userId, body).getData();
  }

  /**
   * Update a user.
   *
   * <p>See {@link #updateUserWithHttpInfoAsync}.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> updateUserAsync(String userId, UserUpdateRequest body) {
    return updateUserWithHttpInfoAsync(userId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a user. Can only be used with an application key belonging to an administrator user.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
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
  public ApiResponse<UserResponse> updateUserWithHttpInfo(String userId, UserUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling updateUser");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UsersApi.updateUser",
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Update a user.
   *
   * <p>See {@link #updateUserWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> updateUserWithHttpInfoAsync(
      String userId, UserUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'userId' when calling updateUser"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateUser"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UsersApi.updateUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserResponse>() {});
  }
}
