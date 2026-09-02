package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.User;
import com.datadog.api.client.v1.model.UserDisableResponse;
import com.datadog.api.client.v1.model.UserListResponse;
import com.datadog.api.client.v1.model.UserResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
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
   * @param body User object that needs to be created. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse createUser(User body) throws ApiException {
    return createUserWithHttpInfo(body).getData();
  }

  /**
   * Create a user.
   *
   * <p>See {@link #createUserWithHttpInfoAsync}.
   *
   * @param body User object that needs to be created. (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> createUserAsync(User body) {
    return createUserWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a user for your organization.
   *
   * <p><strong>Note</strong>: Users can only be created with the admin access role if application
   * keys belong to administrators.
   *
   * @param body User object that needs to be created. (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> User created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> createUserWithHttpInfo(User body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUser");
    }
    // create path and map variables
    String localVarPath = "/api/v1/user";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.UsersApi.createUser",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * @param body User object that needs to be created. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> createUserWithHttpInfoAsync(User body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createUser"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/user";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.UsersApi.createUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * @param userHandle The handle of the user. (required)
   * @return UserDisableResponse
   * @throws ApiException if fails to make API call
   */
  public UserDisableResponse disableUser(String userHandle) throws ApiException {
    return disableUserWithHttpInfo(userHandle).getData();
  }

  /**
   * Disable a user.
   *
   * <p>See {@link #disableUserWithHttpInfoAsync}.
   *
   * @param userHandle The handle of the user. (required)
   * @return CompletableFuture&lt;UserDisableResponse&gt;
   */
  public CompletableFuture<UserDisableResponse> disableUserAsync(String userHandle) {
    return disableUserWithHttpInfoAsync(userHandle)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a user from an organization.
   *
   * <p><strong>Note</strong>: This endpoint can only be used with application keys belonging to
   * administrators.
   *
   * @param userHandle The handle of the user. (required)
   * @return ApiResponse&lt;UserDisableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> User disabled </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserDisableResponse> disableUserWithHttpInfo(String userHandle)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userHandle' when calling disableUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.UsersApi.disableUser",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UserDisableResponse>() {});
  }

  /**
   * Disable a user.
   *
   * <p>See {@link #disableUserWithHttpInfo}.
   *
   * @param userHandle The handle of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserDisableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserDisableResponse>> disableUserWithHttpInfoAsync(
      String userHandle) {
    Object localVarPostBody = null;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      CompletableFuture<ApiResponse<UserDisableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userHandle' when calling disableUser"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.UsersApi.disableUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserDisableResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserDisableResponse>() {});
  }

  /**
   * Get user details.
   *
   * <p>See {@link #getUserWithHttpInfo}.
   *
   * @param userHandle The ID of the user. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse getUser(String userHandle) throws ApiException {
    return getUserWithHttpInfo(userHandle).getData();
  }

  /**
   * Get user details.
   *
   * <p>See {@link #getUserWithHttpInfoAsync}.
   *
   * @param userHandle The ID of the user. (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> getUserAsync(String userHandle) {
    return getUserWithHttpInfoAsync(userHandle)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user's details.
   *
   * @param userHandle The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> getUserWithHttpInfo(String userHandle) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userHandle' when calling getUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.UsersApi.getUser",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * @param userHandle The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> getUserWithHttpInfoAsync(String userHandle) {
    Object localVarPostBody = null;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userHandle' when calling getUser"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.UsersApi.getUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return UserListResponse
   * @throws ApiException if fails to make API call
   */
  public UserListResponse listUsers() throws ApiException {
    return listUsersWithHttpInfo().getData();
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;UserListResponse&gt;
   */
  public CompletableFuture<UserListResponse> listUsersAsync() {
    return listUsersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users for your organization.
   *
   * @return ApiResponse&lt;UserListResponse&gt;
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
  public ApiResponse<UserListResponse> listUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/user";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.UsersApi.listUsers",
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
        new GenericType<UserListResponse>() {});
  }

  /**
   * List all users.
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;UserListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserListResponse>> listUsersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/user";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.UsersApi.listUsers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserListResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserListResponse>() {});
  }

  /**
   * Update a user.
   *
   * <p>See {@link #updateUserWithHttpInfo}.
   *
   * @param userHandle The ID of the user. (required)
   * @param body Description of the update. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse updateUser(String userHandle, User body) throws ApiException {
    return updateUserWithHttpInfo(userHandle, body).getData();
  }

  /**
   * Update a user.
   *
   * <p>See {@link #updateUserWithHttpInfoAsync}.
   *
   * @param userHandle The ID of the user. (required)
   * @param body Description of the update. (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> updateUserAsync(String userHandle, User body) {
    return updateUserWithHttpInfoAsync(userHandle, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a user information.
   *
   * <p><strong>Note</strong>: It can only be used with application keys belonging to
   * administrators.
   *
   * @param userHandle The ID of the user. (required)
   * @param body Description of the update. (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> User updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> updateUserWithHttpInfo(String userHandle, User body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userHandle' when calling updateUser");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.UsersApi.updateUser",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
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
   * @param userHandle The ID of the user. (required)
   * @param body Description of the update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> updateUserWithHttpInfoAsync(
      String userHandle, User body) {
    Object localVarPostBody = body;

    // verify the required parameter 'userHandle' is set
    if (userHandle == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userHandle' when calling updateUser"));
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
        "/api/v1/user/{user_handle}"
            .replaceAll(
                "\\{" + "user_handle" + "\\}", apiClient.escapeString(userHandle.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.UsersApi.updateUser",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UserResponse>() {});
  }
}
