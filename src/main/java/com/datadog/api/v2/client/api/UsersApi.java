package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.QuerySortOrder;
import com.datadog.api.v2.client.model.ServiceAccountCreateRequest;
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
   * Create a service account Create a service account for your organization.
   *
   * @param body (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UserResponse createServiceAccount(ServiceAccountCreateRequest body) throws ApiException {
    return createServiceAccountWithHttpInfo(body).getData();
  }

  public CompletableFuture<UserResponse> createServiceAccountAsync(
      ServiceAccountCreateRequest body) {
    return createServiceAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a service account Create a service account for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> createServiceAccountWithHttpInfo(
      ServiceAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createServiceAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/service_accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createServiceAccount");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.createServiceAccount",
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
   * Create a service account Create a service account for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<UserResponse>> createServiceAccountWithHttpInfoAsync(
      ServiceAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createServiceAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/service_accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createServiceAccount");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.createServiceAccount",
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
   * Create a user Create a user for your organization.
   *
   * @param body (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UserResponse createUser(UserCreateRequest body) throws ApiException {
    return createUserWithHttpInfo(body).getData();
  }

  public CompletableFuture<UserResponse> createUserAsync(UserCreateRequest body) {
    return createUserWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a user Create a user for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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
   * Create a user Create a user for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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
   * Disable a user Disable a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
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
  public void disableUser(String userId) throws ApiException {
    disableUserWithHttpInfo(userId);
  }

  public CompletableFuture<Void> disableUserAsync(String userId) {
    return disableUserWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable a user Disable a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
        null,
        false);
  }

  /**
   * Disable a user Disable a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
        null,
        false);
  }

  /**
   * Get a user invitation Returns a single user invitation by its UUID.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return UserInvitationResponse
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
  public UserInvitationResponse getInvitation(String userInvitationUuid) throws ApiException {
    return getInvitationWithHttpInfo(userInvitationUuid).getData();
  }

  public CompletableFuture<UserInvitationResponse> getInvitationAsync(String userInvitationUuid) {
    return getInvitationWithHttpInfoAsync(userInvitationUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user invitation Returns a single user invitation by its UUID.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return ApiResponse&lt;UserInvitationResponse&gt;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getInvitation");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserInvitationResponse> localVarReturnType =
        new GenericType<UserInvitationResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.getInvitation",
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
   * Get a user invitation Returns a single user invitation by its UUID.
   *
   * @param userInvitationUuid The UUID of the user invitation. (required)
   * @return ApiResponse&lt;UserInvitationResponse&gt;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getInvitation");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserInvitationResponse> localVarReturnType =
        new GenericType<UserInvitationResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.getInvitation",
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
   * Get user details Get a user in the organization specified by the user’s &#x60;user_id&#x60;.
   *
   * @param userId The ID of the user. (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UserResponse getUser(String userId) throws ApiException {
    return getUserWithHttpInfo(userId).getData();
  }

  public CompletableFuture<UserResponse> getUserAsync(String userId) {
    return getUserWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get user details Get a user in the organization specified by the user’s &#x60;user_id&#x60;.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get user details Get a user in the organization specified by the user’s &#x60;user_id&#x60;.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK for get user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a user organization Get a user organization. Returns the user information and all
   * organizations joined by this user.
   *
   * @param userId The ID of the user. (required)
   * @return UserResponse
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
  public UserResponse listUserOrganizations(String userId) throws ApiException {
    return listUserOrganizationsWithHttpInfo(userId).getData();
  }

  public CompletableFuture<UserResponse> listUserOrganizationsAsync(String userId) {
    return listUserOrganizationsWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user organization Get a user organization. Returns the user information and all
   * organizations joined by this user.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserOrganizations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.listUserOrganizations",
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
   * Get a user organization Get a user organization. Returns the user information and all
   * organizations joined by this user.
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;UserResponse&gt;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserOrganizations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.listUserOrganizations",
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
   * Get a user permissions Get a user permission set. Returns a list of the user’s permissions
   * granted by the associated user&#39;s roles.
   *
   * @param userId The ID of the user. (required)
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
  public PermissionsResponse listUserPermissions(String userId) throws ApiException {
    return listUserPermissionsWithHttpInfo(userId).getData();
  }

  public CompletableFuture<PermissionsResponse> listUserPermissionsAsync(String userId) {
    return listUserPermissionsWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a user permissions Get a user permission set. Returns a list of the user’s permissions
   * granted by the associated user&#39;s roles.
   *
   * @param userId The ID of the user. (required)
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserPermissions");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.listUserPermissions",
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
   * Get a user permissions Get a user permission set. Returns a list of the user’s permissions
   * granted by the associated user&#39;s roles.
   *
   * @param userId The ID of the user. (required)
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listUserPermissions");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.listUserPermissions",
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

  /** Manage optional parameters to listUsers. */
  public static class ListUsersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private QuerySortOrder sortDir;
    private String filter;
    private String filterStatus;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort User attribute to order results by. Sort order is ascending by default. Sort
     *     order is descending if the field is prefixed by a negative sign, for example
     *     &#x60;sort&#x3D;-name&#x60;. Options: &#x60;name&#x60;, &#x60;modified_at&#x60;,
     *     &#x60;user_count&#x60;. (optional, default to name)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set sortDir
     *
     * @param sortDir Direction of sort. Options: &#x60;asc&#x60;, &#x60;desc&#x60;. (optional,
     *     default to desc)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters sortDir(QuerySortOrder sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter all users by the given string. Defaults to no filtering. (optional)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterStatus
     *
     * @param filterStatus Filter on status attribute. Comma separated list, with possible values
     *     &#x60;Active&#x60;, &#x60;Pending&#x60;, and &#x60;Disabled&#x60;. Defaults to no
     *     filtering. (optional)
     * @return ListUsersOptionalParameters
     */
    public ListUsersOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
  }

  /**
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @return UsersResponse
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
  public UsersResponse listUsers() throws ApiException {
    return listUsersWithHttpInfo(new ListUsersOptionalParameters()).getData();
  }

  /**
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @return CompletableFuture<UsersResponse>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<UsersResponse> listUsersAsync() {
    return listUsersWithHttpInfoAsync(new ListUsersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @param parameters Optional parameters for the request.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UsersResponse listUsers(ListUsersOptionalParameters parameters) throws ApiException {
    return listUsersWithHttpInfo(parameters).getData();
  }

  /**
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture<UsersResponse>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<UsersResponse> listUsersAsync(ListUsersOptionalParameters parameters) {
    return listUsersWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

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
   * List all users Get the list of all users in the organization. This list includes all users even
   * if they are deactivated or unverified.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};

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
   * Send invitation emails Sends emails to one or more users inviting them to join the
   * organization.
   *
   * @param body (required)
   * @return UserInvitationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public UserInvitationsResponse sendInvitations(UserInvitationsRequest body) throws ApiException {
    return sendInvitationsWithHttpInfo(body).getData();
  }

  public CompletableFuture<UserInvitationsResponse> sendInvitationsAsync(
      UserInvitationsRequest body) {
    return sendInvitationsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send invitation emails Sends emails to one or more users inviting them to join the
   * organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserInvitationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "sendInvitations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserInvitationsResponse> localVarReturnType =
        new GenericType<UserInvitationsResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.sendInvitations",
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
   * Send invitation emails Sends emails to one or more users inviting them to join the
   * organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserInvitationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "sendInvitations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserInvitationsResponse> localVarReturnType =
        new GenericType<UserInvitationsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.sendInvitations",
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
   * Update a user Edit a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return UserResponse
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
  public UserResponse updateUser(String userId, UserUpdateRequest body) throws ApiException {
    return updateUserWithHttpInfo(userId, body).getData();
  }

  public CompletableFuture<UserResponse> updateUserAsync(String userId, UserUpdateRequest body) {
    return updateUserWithHttpInfoAsync(userId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a user Edit a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPI(
        "UsersApi.updateUser",
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

  /**
   * Update a user Edit a user. Can only be used with an application key belonging to an
   * administrator user.
   *
   * @param userId The ID of the user. (required)
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsersApi.updateUser",
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
