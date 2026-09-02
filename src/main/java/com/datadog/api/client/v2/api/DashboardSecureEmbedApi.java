package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SecureEmbedCreateRequest;
import com.datadog.api.client.v2.model.SecureEmbedCreateResponse;
import com.datadog.api.client.v2.model.SecureEmbedGetResponse;
import com.datadog.api.client.v2.model.SecureEmbedUpdateRequest;
import com.datadog.api.client.v2.model.SecureEmbedUpdateResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSecureEmbedApi {
  private ApiClient apiClient;

  public DashboardSecureEmbedApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardSecureEmbedApi(ApiClient apiClient) {
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
   * Create a secure embed for a dashboard.
   *
   * <p>See {@link #createDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Secure embed creation request body. (required)
   * @return SecureEmbedCreateResponse
   * @throws ApiException if fails to make API call
   */
  public SecureEmbedCreateResponse createDashboardSecureEmbed(
      String dashboardId, SecureEmbedCreateRequest body) throws ApiException {
    return createDashboardSecureEmbedWithHttpInfo(dashboardId, body).getData();
  }

  /**
   * Create a secure embed for a dashboard.
   *
   * <p>See {@link #createDashboardSecureEmbedWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Secure embed creation request body. (required)
   * @return CompletableFuture&lt;SecureEmbedCreateResponse&gt;
   */
  public CompletableFuture<SecureEmbedCreateResponse> createDashboardSecureEmbedAsync(
      String dashboardId, SecureEmbedCreateRequest body) {
    return createDashboardSecureEmbedWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a secure embed share for a dashboard. The response includes a one-time <code>credential
   * </code> used for HMAC-SHA256 signing. Store it securely — it cannot be retrieved again.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Secure embed creation request body. (required)
   * @return ApiResponse&lt;SecureEmbedCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboard Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict — max 1000 share URLs per dashboard exceeded </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecureEmbedCreateResponse> createDashboardSecureEmbedWithHttpInfo(
      String dashboardId, SecureEmbedCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling createDashboardSecureEmbed");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboardSecureEmbed");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardSecureEmbedApi.createDashboardSecureEmbed",
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
        new GenericType<SecureEmbedCreateResponse>() {});
  }

  /**
   * Create a secure embed for a dashboard.
   *
   * <p>See {@link #createDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Secure embed creation request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecureEmbedCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecureEmbedCreateResponse>>
      createDashboardSecureEmbedWithHttpInfoAsync(
          String dashboardId, SecureEmbedCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecureEmbedCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<SecureEmbedCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " createDashboardSecureEmbed"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecureEmbedCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createDashboardSecureEmbed"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardSecureEmbedApi.createDashboardSecureEmbed",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecureEmbedCreateResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecureEmbedCreateResponse>() {});
  }

  /**
   * Delete a secure embed for a dashboard.
   *
   * <p>See {@link #deleteDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardSecureEmbed(String dashboardId, String token) throws ApiException {
    deleteDashboardSecureEmbedWithHttpInfo(dashboardId, token);
  }

  /**
   * Delete a secure embed for a dashboard.
   *
   * <p>See {@link #deleteDashboardSecureEmbedWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDashboardSecureEmbedAsync(String dashboardId, String token) {
    return deleteDashboardSecureEmbedWithHttpInfoAsync(dashboardId, token)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a secure embed share for a dashboard.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDashboardSecureEmbedWithHttpInfo(String dashboardId, String token)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling deleteDashboardSecureEmbed");
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling deleteDashboardSecureEmbed");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardSecureEmbedApi.deleteDashboardSecureEmbed",
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
   * Delete a secure embed for a dashboard.
   *
   * <p>See {@link #deleteDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDashboardSecureEmbedWithHttpInfoAsync(
      String dashboardId, String token) {
    // Check if unstable operation is enabled
    String operationId = "deleteDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " deleteDashboardSecureEmbed"));
      return result;
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'token' when calling deleteDashboardSecureEmbed"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardSecureEmbedApi.deleteDashboardSecureEmbed",
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
   * Get a secure embed for a dashboard.
   *
   * <p>See {@link #getDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return SecureEmbedGetResponse
   * @throws ApiException if fails to make API call
   */
  public SecureEmbedGetResponse getDashboardSecureEmbed(String dashboardId, String token)
      throws ApiException {
    return getDashboardSecureEmbedWithHttpInfo(dashboardId, token).getData();
  }

  /**
   * Get a secure embed for a dashboard.
   *
   * <p>See {@link #getDashboardSecureEmbedWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return CompletableFuture&lt;SecureEmbedGetResponse&gt;
   */
  public CompletableFuture<SecureEmbedGetResponse> getDashboardSecureEmbedAsync(
      String dashboardId, String token) {
    return getDashboardSecureEmbedWithHttpInfoAsync(dashboardId, token)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve an existing secure embed configuration for a dashboard.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return ApiResponse&lt;SecureEmbedGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecureEmbedGetResponse> getDashboardSecureEmbedWithHttpInfo(
      String dashboardId, String token) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling getDashboardSecureEmbed");
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling getDashboardSecureEmbed");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardSecureEmbedApi.getDashboardSecureEmbed",
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
        new GenericType<SecureEmbedGetResponse>() {});
  }

  /**
   * Get a secure embed for a dashboard.
   *
   * <p>See {@link #getDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecureEmbedGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecureEmbedGetResponse>>
      getDashboardSecureEmbedWithHttpInfoAsync(String dashboardId, String token) {
    // Check if unstable operation is enabled
    String operationId = "getDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecureEmbedGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<SecureEmbedGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling getDashboardSecureEmbed"));
      return result;
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SecureEmbedGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'token' when calling getDashboardSecureEmbed"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardSecureEmbedApi.getDashboardSecureEmbed",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecureEmbedGetResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecureEmbedGetResponse>() {});
  }

  /**
   * Update a secure embed for a dashboard.
   *
   * <p>See {@link #updateDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @param body Secure embed update request body. (required)
   * @return SecureEmbedUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public SecureEmbedUpdateResponse updateDashboardSecureEmbed(
      String dashboardId, String token, SecureEmbedUpdateRequest body) throws ApiException {
    return updateDashboardSecureEmbedWithHttpInfo(dashboardId, token, body).getData();
  }

  /**
   * Update a secure embed for a dashboard.
   *
   * <p>See {@link #updateDashboardSecureEmbedWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @param body Secure embed update request body. (required)
   * @return CompletableFuture&lt;SecureEmbedUpdateResponse&gt;
   */
  public CompletableFuture<SecureEmbedUpdateResponse> updateDashboardSecureEmbedAsync(
      String dashboardId, String token, SecureEmbedUpdateRequest body) {
    return updateDashboardSecureEmbedWithHttpInfoAsync(dashboardId, token, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update a secure embed configuration. All fields are optional (PATCH semantics).
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @param body Secure embed update request body. (required)
   * @return ApiResponse&lt;SecureEmbedUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecureEmbedUpdateResponse> updateDashboardSecureEmbedWithHttpInfo(
      String dashboardId, String token, SecureEmbedUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling updateDashboardSecureEmbed");
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling updateDashboardSecureEmbed");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboardSecureEmbed");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardSecureEmbedApi.updateDashboardSecureEmbed",
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
        new GenericType<SecureEmbedUpdateResponse>() {});
  }

  /**
   * Update a secure embed for a dashboard.
   *
   * <p>See {@link #updateDashboardSecureEmbedWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param token The share token identifying the secure embed. (required)
   * @param body Secure embed update request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecureEmbedUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>>
      updateDashboardSecureEmbedWithHttpInfoAsync(
          String dashboardId, String token, SecureEmbedUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateDashboardSecureEmbed";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " updateDashboardSecureEmbed"));
      return result;
    }

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'token' when calling updateDashboardSecureEmbed"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateDashboardSecureEmbed"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared/secure-embed/{token}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardSecureEmbedApi.updateDashboardSecureEmbed",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecureEmbedUpdateResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecureEmbedUpdateResponse>() {});
  }
}
