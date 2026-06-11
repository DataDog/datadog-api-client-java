package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OrgAuthorizedClientData;
import com.datadog.api.client.v2.model.OrgAuthorizedClientResponse;
import com.datadog.api.client.v2.model.OrgAuthorizedClientUpdateRequest;
import com.datadog.api.client.v2.model.OrgAuthorizedClientUserAuthorizationsSort;
import com.datadog.api.client.v2.model.OrgAuthorizedClientsResponse;
import com.datadog.api.client.v2.model.UserAuthorizedClientData;
import com.datadog.api.client.v2.model.UserAuthorizedClientsResponse;
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
public class OrgAuthorizedClientsApi {
  private ApiClient apiClient;

  public OrgAuthorizedClientsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OrgAuthorizedClientsApi(ApiClient apiClient) {
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
   * Delete an org authorized client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgAuthorizedClient(String orgAuthorizedClientId) throws ApiException {
    deleteOrgAuthorizedClientWithHttpInfo(orgAuthorizedClientId);
  }

  /**
   * Delete an org authorized client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgAuthorizedClientAsync(String orgAuthorizedClientId) {
    return deleteOrgAuthorizedClientWithHttpInfoAsync(orgAuthorizedClientId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable an OAuth2 client authorization for the current organization, revoking access for all
   * users.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOrgAuthorizedClientWithHttpInfo(String orgAuthorizedClientId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " deleteOrgAuthorizedClient");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClient",
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
   * Delete an org authorized client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrgAuthorizedClientWithHttpInfoAsync(
      String orgAuthorizedClientId) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " deleteOrgAuthorizedClient"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClient",
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
   * Delete a user&#39;s authorizations for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userId The ID of the user. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgAuthorizedClientAllUserAuthorizations(
      String orgAuthorizedClientId, String userId) throws ApiException {
    deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfo(orgAuthorizedClientId, userId);
  }

  /**
   * Delete a user&#39;s authorizations for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userId The ID of the user. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgAuthorizedClientAllUserAuthorizationsAsync(
      String orgAuthorizedClientId, String userId) {
    return deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfoAsync(
            orgAuthorizedClientId, userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable all authorizations for a specific user for the specified OAuth2 client in the current
   * organization.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfo(
      String orgAuthorizedClientId, String userId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " deleteOrgAuthorizedClientAllUserAuthorizations");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userId' when calling"
              + " deleteOrgAuthorizedClientAllUserAuthorizations");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user/{user_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClientAllUserAuthorizations",
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
   * Delete a user&#39;s authorizations for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteOrgAuthorizedClientAllUserAuthorizationsWithHttpInfoAsync(
          String orgAuthorizedClientId, String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " deleteOrgAuthorizedClientAllUserAuthorizations"));
      return result;
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'userId' when calling"
                  + " deleteOrgAuthorizedClientAllUserAuthorizations"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user/{user_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClientAllUserAuthorizations",
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
   * Delete a user authorization for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientUserAuthorizationWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgAuthorizedClientUserAuthorization(
      String orgAuthorizedClientId, String userAuthorizedClientId) throws ApiException {
    deleteOrgAuthorizedClientUserAuthorizationWithHttpInfo(
        orgAuthorizedClientId, userAuthorizedClientId);
  }

  /**
   * Delete a user authorization for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientUserAuthorizationWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgAuthorizedClientUserAuthorizationAsync(
      String orgAuthorizedClientId, String userAuthorizedClientId) {
    return deleteOrgAuthorizedClientUserAuthorizationWithHttpInfoAsync(
            orgAuthorizedClientId, userAuthorizedClientId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable a specific user authorization for the specified OAuth2 client in the current
   * organization.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOrgAuthorizedClientUserAuthorizationWithHttpInfo(
      String orgAuthorizedClientId, String userAuthorizedClientId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " deleteOrgAuthorizedClientUserAuthorization");
    }

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userAuthorizedClientId' when calling"
              + " deleteOrgAuthorizedClientUserAuthorization");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()))
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClientUserAuthorization",
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
   * Delete a user authorization for a client.
   *
   * <p>See {@link #deleteOrgAuthorizedClientUserAuthorizationWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteOrgAuthorizedClientUserAuthorizationWithHttpInfoAsync(
          String orgAuthorizedClientId, String userAuthorizedClientId) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " deleteOrgAuthorizedClientUserAuthorization"));
      return result;
    }

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'userAuthorizedClientId' when calling"
                  + " deleteOrgAuthorizedClientUserAuthorization"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()))
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.deleteOrgAuthorizedClientUserAuthorization",
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

  /** Manage optional parameters to getOrgAuthorizedClient. */
  public static class GetOrgAuthorizedClientOptionalParameters {
    private String include;
    private String filterUserAuthorizedClientsDisabled;
    private String filterUserAuthorizedClientsUserDisabled;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Options: <code>
     *     oauth2_client</code>, <code>oauth2_client.app</code>, <code>oauth2_client.scopes</code>,
     *     <code>user_authorized_clients.user</code>. (optional)
     * @return GetOrgAuthorizedClientOptionalParameters
     */
    public GetOrgAuthorizedClientOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterUserAuthorizedClientsDisabled.
     *
     * @param filterUserAuthorizedClientsDisabled Filter included user authorized clients by
     *     disabled status. (optional)
     * @return GetOrgAuthorizedClientOptionalParameters
     */
    public GetOrgAuthorizedClientOptionalParameters filterUserAuthorizedClientsDisabled(
        String filterUserAuthorizedClientsDisabled) {
      this.filterUserAuthorizedClientsDisabled = filterUserAuthorizedClientsDisabled;
      return this;
    }

    /**
     * Set filterUserAuthorizedClientsUserDisabled.
     *
     * @param filterUserAuthorizedClientsUserDisabled Filter included user authorized clients by
     *     user disabled status. (optional)
     * @return GetOrgAuthorizedClientOptionalParameters
     */
    public GetOrgAuthorizedClientOptionalParameters filterUserAuthorizedClientsUserDisabled(
        String filterUserAuthorizedClientsUserDisabled) {
      this.filterUserAuthorizedClientsUserDisabled = filterUserAuthorizedClientsUserDisabled;
      return this;
    }
  }

  /**
   * Get an org authorized client.
   *
   * <p>See {@link #getOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return OrgAuthorizedClientResponse
   * @throws ApiException if fails to make API call
   */
  public OrgAuthorizedClientResponse getOrgAuthorizedClient(String orgAuthorizedClientId)
      throws ApiException {
    return getOrgAuthorizedClientWithHttpInfo(
            orgAuthorizedClientId, new GetOrgAuthorizedClientOptionalParameters())
        .getData();
  }

  /**
   * Get an org authorized client.
   *
   * <p>See {@link #getOrgAuthorizedClientWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return CompletableFuture&lt;OrgAuthorizedClientResponse&gt;
   */
  public CompletableFuture<OrgAuthorizedClientResponse> getOrgAuthorizedClientAsync(
      String orgAuthorizedClientId) {
    return getOrgAuthorizedClientWithHttpInfoAsync(
            orgAuthorizedClientId, new GetOrgAuthorizedClientOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an org authorized client.
   *
   * <p>See {@link #getOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return OrgAuthorizedClientResponse
   * @throws ApiException if fails to make API call
   */
  public OrgAuthorizedClientResponse getOrgAuthorizedClient(
      String orgAuthorizedClientId, GetOrgAuthorizedClientOptionalParameters parameters)
      throws ApiException {
    return getOrgAuthorizedClientWithHttpInfo(orgAuthorizedClientId, parameters).getData();
  }

  /**
   * Get an org authorized client.
   *
   * <p>See {@link #getOrgAuthorizedClientWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgAuthorizedClientResponse&gt;
   */
  public CompletableFuture<OrgAuthorizedClientResponse> getOrgAuthorizedClientAsync(
      String orgAuthorizedClientId, GetOrgAuthorizedClientOptionalParameters parameters) {
    return getOrgAuthorizedClientWithHttpInfoAsync(orgAuthorizedClientId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single OAuth2 client authorized for the current organization.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgAuthorizedClientResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgAuthorizedClientResponse> getOrgAuthorizedClientWithHttpInfo(
      String orgAuthorizedClientId, GetOrgAuthorizedClientOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " getOrgAuthorizedClient");
    }
    String include = parameters.include;
    String filterUserAuthorizedClientsDisabled = parameters.filterUserAuthorizedClientsDisabled;
    String filterUserAuthorizedClientsUserDisabled =
        parameters.filterUserAuthorizedClientsUserDisabled;
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[user_authorized_clients][disabled]", filterUserAuthorizedClientsDisabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[user_authorized_clients][user][disabled]",
            filterUserAuthorizedClientsUserDisabled));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.getOrgAuthorizedClient",
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
        new GenericType<OrgAuthorizedClientResponse>() {});
  }

  /**
   * Get an org authorized client.
   *
   * <p>See {@link #getOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgAuthorizedClientResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>>
      getOrgAuthorizedClientWithHttpInfoAsync(
          String orgAuthorizedClientId, GetOrgAuthorizedClientOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " getOrgAuthorizedClient"));
      return result;
    }
    String include = parameters.include;
    String filterUserAuthorizedClientsDisabled = parameters.filterUserAuthorizedClientsDisabled;
    String filterUserAuthorizedClientsUserDisabled =
        parameters.filterUserAuthorizedClientsUserDisabled;
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[user_authorized_clients][disabled]", filterUserAuthorizedClientsDisabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[user_authorized_clients][user][disabled]",
            filterUserAuthorizedClientsUserDisabled));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.getOrgAuthorizedClient",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<OrgAuthorizedClientResponse>() {});
  }

  /** Manage optional parameters to listOrgAuthorizedClients. */
  public static class ListOrgAuthorizedClientsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filter;
    private String filterOauth2ClientName;
    private String filterDisabled;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort results by. Options include <code>oauth2_client.name</code>.
     *     (optional, default to "oauth2_client.name")
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter results by client name, app title, or app description. (optional)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterOauth2ClientName.
     *
     * @param filterOauth2ClientName Filter results by the OAuth2 client name. (optional)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters filterOauth2ClientName(
        String filterOauth2ClientName) {
      this.filterOauth2ClientName = filterOauth2ClientName;
      return this;
    }

    /**
     * Set filterDisabled.
     *
     * @param filterDisabled Filter results by the org-level disabled status. (optional)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters filterDisabled(String filterDisabled) {
      this.filterDisabled = filterDisabled;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Options: <code>
     *     oauth2_client</code>, <code>oauth2_client.app</code>, <code>user_authorized_clients.user
     *     </code>. (optional)
     * @return ListOrgAuthorizedClientsOptionalParameters
     */
    public ListOrgAuthorizedClientsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfo}.
   *
   * @return OrgAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public OrgAuthorizedClientsResponse listOrgAuthorizedClients() throws ApiException {
    return listOrgAuthorizedClientsWithHttpInfo(new ListOrgAuthorizedClientsOptionalParameters())
        .getData();
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<OrgAuthorizedClientsResponse> listOrgAuthorizedClientsAsync() {
    return listOrgAuthorizedClientsWithHttpInfoAsync(
            new ListOrgAuthorizedClientsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return OrgAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public OrgAuthorizedClientsResponse listOrgAuthorizedClients(
      ListOrgAuthorizedClientsOptionalParameters parameters) throws ApiException {
    return listOrgAuthorizedClientsWithHttpInfo(parameters).getData();
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<OrgAuthorizedClientsResponse> listOrgAuthorizedClientsAsync(
      ListOrgAuthorizedClientsOptionalParameters parameters) {
    return listOrgAuthorizedClientsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;OrgAuthorizedClientData&gt;
   */
  public PaginationIterable<OrgAuthorizedClientData> listOrgAuthorizedClientsWithPagination() {
    ListOrgAuthorizedClientsOptionalParameters parameters =
        new ListOrgAuthorizedClientsOptionalParameters();
    return listOrgAuthorizedClientsWithPagination(parameters);
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfo}.
   *
   * @return OrgAuthorizedClientsResponse
   */
  public PaginationIterable<OrgAuthorizedClientData> listOrgAuthorizedClientsWithPagination(
      ListOrgAuthorizedClientsOptionalParameters parameters) {
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
            "listOrgAuthorizedClients",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get a list of all OAuth2 clients authorized for the current organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgAuthorizedClientsResponse&gt;
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
  public ApiResponse<OrgAuthorizedClientsResponse> listOrgAuthorizedClientsWithHttpInfo(
      ListOrgAuthorizedClientsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filter = parameters.filter;
    String filterOauth2ClientName = parameters.filterOauth2ClientName;
    String filterDisabled = parameters.filterDisabled;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/org_authorized_clients";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[oauth2_client][name]", filterOauth2ClientName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.listOrgAuthorizedClients",
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
        new GenericType<OrgAuthorizedClientsResponse>() {});
  }

  /**
   * List org authorized clients.
   *
   * <p>See {@link #listOrgAuthorizedClientsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgAuthorizedClientsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgAuthorizedClientsResponse>>
      listOrgAuthorizedClientsWithHttpInfoAsync(
          ListOrgAuthorizedClientsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filter = parameters.filter;
    String filterOauth2ClientName = parameters.filterOauth2ClientName;
    String filterDisabled = parameters.filterDisabled;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/org_authorized_clients";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[oauth2_client][name]", filterOauth2ClientName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.listOrgAuthorizedClients",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<OrgAuthorizedClientsResponse>() {});
  }

  /** Manage optional parameters to listOrgAuthorizedClientUserAuthorizations. */
  public static class ListOrgAuthorizedClientUserAuthorizationsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private OrgAuthorizedClientUserAuthorizationsSort sort;
    private String filterDisabled;
    private String filterUserName;
    private String filterUserEmail;
    private String filterUserDisabled;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort results by. Options: <code>user.name</code>, <code>user.email
     *     </code>, <code>oauth2_client.name</code>. (optional)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters sort(
        OrgAuthorizedClientUserAuthorizationsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filterDisabled.
     *
     * @param filterDisabled Filter results by the user authorization disabled status. (optional)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters filterDisabled(
        String filterDisabled) {
      this.filterDisabled = filterDisabled;
      return this;
    }

    /**
     * Set filterUserName.
     *
     * @param filterUserName Filter results by user name. (optional)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters filterUserName(
        String filterUserName) {
      this.filterUserName = filterUserName;
      return this;
    }

    /**
     * Set filterUserEmail.
     *
     * @param filterUserEmail Filter results by user email. (optional)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters filterUserEmail(
        String filterUserEmail) {
      this.filterUserEmail = filterUserEmail;
      return this;
    }

    /**
     * Set filterUserDisabled.
     *
     * @param filterUserDisabled Filter results by whether the user is disabled. (optional)
     * @return ListOrgAuthorizedClientUserAuthorizationsOptionalParameters
     */
    public ListOrgAuthorizedClientUserAuthorizationsOptionalParameters filterUserDisabled(
        String filterUserDisabled) {
      this.filterUserDisabled = filterUserDisabled;
      return this;
    }
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return UserAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public UserAuthorizedClientsResponse listOrgAuthorizedClientUserAuthorizations(
      String orgAuthorizedClientId) throws ApiException {
    return listOrgAuthorizedClientUserAuthorizationsWithHttpInfo(
            orgAuthorizedClientId,
            new ListOrgAuthorizedClientUserAuthorizationsOptionalParameters())
        .getData();
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return CompletableFuture&lt;UserAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<UserAuthorizedClientsResponse>
      listOrgAuthorizedClientUserAuthorizationsAsync(String orgAuthorizedClientId) {
    return listOrgAuthorizedClientUserAuthorizationsWithHttpInfoAsync(
            orgAuthorizedClientId,
            new ListOrgAuthorizedClientUserAuthorizationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return UserAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public UserAuthorizedClientsResponse listOrgAuthorizedClientUserAuthorizations(
      String orgAuthorizedClientId,
      ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters)
      throws ApiException {
    return listOrgAuthorizedClientUserAuthorizationsWithHttpInfo(orgAuthorizedClientId, parameters)
        .getData();
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UserAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<UserAuthorizedClientsResponse>
      listOrgAuthorizedClientUserAuthorizationsAsync(
          String orgAuthorizedClientId,
          ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters) {
    return listOrgAuthorizedClientUserAuthorizationsWithHttpInfoAsync(
            orgAuthorizedClientId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return PaginationIterable&lt;UserAuthorizedClientData&gt;
   */
  public PaginationIterable<UserAuthorizedClientData>
      listOrgAuthorizedClientUserAuthorizationsWithPagination(String orgAuthorizedClientId) {
    ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters =
        new ListOrgAuthorizedClientUserAuthorizationsOptionalParameters();
    return listOrgAuthorizedClientUserAuthorizationsWithPagination(
        orgAuthorizedClientId, parameters);
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @return UserAuthorizedClientsResponse
   */
  public PaginationIterable<UserAuthorizedClientData>
      listOrgAuthorizedClientUserAuthorizationsWithPagination(
          String orgAuthorizedClientId,
          ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters) {
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
    args.put("orgAuthorizedClientId", orgAuthorizedClientId);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listOrgAuthorizedClientUserAuthorizations",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get a list of user authorizations for the specified OAuth2 client in the current organization.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UserAuthorizedClientsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserAuthorizedClientsResponse>
      listOrgAuthorizedClientUserAuthorizationsWithHttpInfo(
          String orgAuthorizedClientId,
          ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " listOrgAuthorizedClientUserAuthorizations");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    OrgAuthorizedClientUserAuthorizationsSort sort = parameters.sort;
    String filterDisabled = parameters.filterDisabled;
    String filterUserName = parameters.filterUserName;
    String filterUserEmail = parameters.filterUserEmail;
    String filterUserDisabled = parameters.filterUserDisabled;
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user_authorized_clients"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][name]", filterUserName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][email]", filterUserEmail));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][disabled]", filterUserDisabled));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.listOrgAuthorizedClientUserAuthorizations",
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
        new GenericType<UserAuthorizedClientsResponse>() {});
  }

  /**
   * List user authorizations for a client.
   *
   * <p>See {@link #listOrgAuthorizedClientUserAuthorizationsWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UserAuthorizedClientsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserAuthorizedClientsResponse>>
      listOrgAuthorizedClientUserAuthorizationsWithHttpInfoAsync(
          String orgAuthorizedClientId,
          ListOrgAuthorizedClientUserAuthorizationsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<UserAuthorizedClientsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " listOrgAuthorizedClientUserAuthorizations"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    OrgAuthorizedClientUserAuthorizationsSort sort = parameters.sort;
    String filterDisabled = parameters.filterDisabled;
    String filterUserName = parameters.filterUserName;
    String filterUserEmail = parameters.filterUserEmail;
    String filterUserDisabled = parameters.filterUserDisabled;
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}/user_authorized_clients"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][name]", filterUserName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][email]", filterUserEmail));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[user][disabled]", filterUserDisabled));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.listOrgAuthorizedClientUserAuthorizations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserAuthorizedClientsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<UserAuthorizedClientsResponse>() {});
  }

  /**
   * Update an org authorized client.
   *
   * <p>See {@link #updateOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param body (required)
   * @return OrgAuthorizedClientResponse
   * @throws ApiException if fails to make API call
   */
  public OrgAuthorizedClientResponse updateOrgAuthorizedClient(
      String orgAuthorizedClientId, OrgAuthorizedClientUpdateRequest body) throws ApiException {
    return updateOrgAuthorizedClientWithHttpInfo(orgAuthorizedClientId, body).getData();
  }

  /**
   * Update an org authorized client.
   *
   * <p>See {@link #updateOrgAuthorizedClientWithHttpInfoAsync}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgAuthorizedClientResponse&gt;
   */
  public CompletableFuture<OrgAuthorizedClientResponse> updateOrgAuthorizedClientAsync(
      String orgAuthorizedClientId, OrgAuthorizedClientUpdateRequest body) {
    return updateOrgAuthorizedClientWithHttpInfoAsync(orgAuthorizedClientId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enable or disable an OAuth2 client authorization for the current organization.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgAuthorizedClientResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgAuthorizedClientResponse> updateOrgAuthorizedClientWithHttpInfo(
      String orgAuthorizedClientId, OrgAuthorizedClientUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgAuthorizedClientId' when calling"
              + " updateOrgAuthorizedClient");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgAuthorizedClient");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgAuthorizedClientsApi.updateOrgAuthorizedClient",
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
        new GenericType<OrgAuthorizedClientResponse>() {});
  }

  /**
   * Update an org authorized client.
   *
   * <p>See {@link #updateOrgAuthorizedClientWithHttpInfo}.
   *
   * @param orgAuthorizedClientId The ID of the org authorized client. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgAuthorizedClientResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>>
      updateOrgAuthorizedClientWithHttpInfoAsync(
          String orgAuthorizedClientId, OrgAuthorizedClientUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'orgAuthorizedClientId' is set
    if (orgAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgAuthorizedClientId' when calling"
                  + " updateOrgAuthorizedClient"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgAuthorizedClient"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_authorized_clients/{org_authorized_client_id}"
            .replaceAll(
                "\\{" + "org_authorized_client_id" + "\\}",
                apiClient.escapeString(orgAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgAuthorizedClientsApi.updateOrgAuthorizedClient",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgAuthorizedClientResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<OrgAuthorizedClientResponse>() {});
  }
}
