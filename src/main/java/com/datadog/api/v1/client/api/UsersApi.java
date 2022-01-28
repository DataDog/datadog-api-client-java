package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.User;
import com.datadog.api.v1.client.model.UserDisableResponse;
import com.datadog.api.v1.client.model.UserListResponse;
import com.datadog.api.v1.client.model.UserResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

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
   * Create a user
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

  public CompletableFuture<UserResponse> createUserAsync(User body) {
    return createUserWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a user
   *
   * <p>Create a user for your organization. **Note**: Users can only be created with the admin
   * access role if application keys belong to administrators.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.createUser",
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
   * Create a user
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.createUser",
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
   * Disable a user
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

  public CompletableFuture<UserDisableResponse> disableUserAsync(String userHandle) {
    return disableUserWithHttpInfoAsync(userHandle)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable a user
   *
   * <p>Delete a user from an organization. **Note**: This endpoint can only be used with
   * application keys belonging to administrators.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "disableUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserDisableResponse> localVarReturnType = new GenericType<UserDisableResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.disableUser",
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
   * Disable a user
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "disableUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserDisableResponse> localVarReturnType = new GenericType<UserDisableResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.disableUser",
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
   * Get user details
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

  public CompletableFuture<UserResponse> getUserAsync(String userHandle) {
    return getUserWithHttpInfoAsync(userHandle)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get user details
   *
   * <p>Get a user&#39;s details.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.getUser",
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
   * Get user details
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.getUser",
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
   * List all users
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return UserListResponse
   * @throws ApiException if fails to make API call
   */
  public UserListResponse listUsers() throws ApiException {
    return listUsersWithHttpInfo().getData();
  }

  public CompletableFuture<UserListResponse> listUsersAsync() {
    return listUsersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users
   *
   * <p>List all users for your organization.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUsers");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserListResponse> localVarReturnType = new GenericType<UserListResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.listUsers",
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
   * List all users
   *
   * <p>See {@link #listUsersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;UserListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserListResponse>> listUsersWithHttpInfoAsync() {
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserListResponse> localVarReturnType = new GenericType<UserListResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.listUsers",
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
   * Update a user
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

  public CompletableFuture<UserResponse> updateUserAsync(String userHandle, User body) {
    return updateUserWithHttpInfoAsync(userHandle, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a user
   *
   * <p>Update a user information. **Note**: It can only be used with application keys belonging to
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.updateUser",
        localVarPath,
        "PUT",
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
   * Update a user
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateUser");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.updateUser",
        localVarPath,
        "PUT",
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
