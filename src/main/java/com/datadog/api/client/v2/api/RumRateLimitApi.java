package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumRateLimitConfigResponse;
import com.datadog.api.client.v2.model.RumRateLimitConfigUpdateRequest;
import com.datadog.api.client.v2.model.RumRateLimitScopeType;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRateLimitApi {
  private ApiClient apiClient;

  public RumRateLimitApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRateLimitApi(ApiClient apiClient) {
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
   * Delete a RUM rate limit configuration.
   *
   * <p>See {@link #deleteRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRumRateLimitConfig(RumRateLimitScopeType scopeType, String scopeId)
      throws ApiException {
    deleteRumRateLimitConfigWithHttpInfo(scopeType, scopeId);
  }

  /**
   * Delete a RUM rate limit configuration.
   *
   * <p>See {@link #deleteRumRateLimitConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRumRateLimitConfigAsync(
      RumRateLimitScopeType scopeType, String scopeId) {
    return deleteRumRateLimitConfigWithHttpInfoAsync(scopeType, scopeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the RUM rate limit configuration for a given scope.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRumRateLimitConfigWithHttpInfo(
      RumRateLimitScopeType scopeType, String scopeId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling deleteRumRateLimitConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling deleteRumRateLimitConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRateLimitApi.deleteRumRateLimitConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a RUM rate limit configuration.
   *
   * <p>See {@link #deleteRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRumRateLimitConfigWithHttpInfoAsync(
      RumRateLimitScopeType scopeType, String scopeId) {
    // Check if unstable operation is enabled
    String operationId = "deleteRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scopeType' when calling deleteRumRateLimitConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scopeId' when calling deleteRumRateLimitConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRateLimitApi.deleteRumRateLimitConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get a RUM rate limit configuration.
   *
   * <p>See {@link #getRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return RumRateLimitConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumRateLimitConfigResponse getRumRateLimitConfig(
      RumRateLimitScopeType scopeType, String scopeId) throws ApiException {
    return getRumRateLimitConfigWithHttpInfo(scopeType, scopeId).getData();
  }

  /**
   * Get a RUM rate limit configuration.
   *
   * <p>See {@link #getRumRateLimitConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;RumRateLimitConfigResponse&gt;
   */
  public CompletableFuture<RumRateLimitConfigResponse> getRumRateLimitConfigAsync(
      RumRateLimitScopeType scopeType, String scopeId) {
    return getRumRateLimitConfigWithHttpInfoAsync(scopeType, scopeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the RUM rate limit configuration for a given scope.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return ApiResponse&lt;RumRateLimitConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumRateLimitConfigResponse> getRumRateLimitConfigWithHttpInfo(
      RumRateLimitScopeType scopeType, String scopeId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling getRumRateLimitConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling getRumRateLimitConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRateLimitApi.getRumRateLimitConfig",
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
        new GenericType<RumRateLimitConfigResponse>() {});
  }

  /**
   * Get a RUM rate limit configuration.
   *
   * <p>See {@link #getRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRateLimitConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRateLimitConfigResponse>>
      getRumRateLimitConfigWithHttpInfoAsync(RumRateLimitScopeType scopeType, String scopeId) {
    // Check if unstable operation is enabled
    String operationId = "getRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scopeType' when calling getRumRateLimitConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling getRumRateLimitConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRateLimitApi.getRumRateLimitConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRateLimitConfigResponse>() {});
  }

  /**
   * Create or update a RUM rate limit configuration.
   *
   * <p>See {@link #updateRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM rate limit configuration to create or update. (required)
   * @return RumRateLimitConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumRateLimitConfigResponse updateRumRateLimitConfig(
      RumRateLimitScopeType scopeType, String scopeId, RumRateLimitConfigUpdateRequest body)
      throws ApiException {
    return updateRumRateLimitConfigWithHttpInfo(scopeType, scopeId, body).getData();
  }

  /**
   * Create or update a RUM rate limit configuration.
   *
   * <p>See {@link #updateRumRateLimitConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required, default
   *     to "application")
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM rate limit configuration to create or update. (required)
   * @return CompletableFuture&lt;RumRateLimitConfigResponse&gt;
   */
  public CompletableFuture<RumRateLimitConfigResponse> updateRumRateLimitConfigAsync(
      RumRateLimitScopeType scopeType, String scopeId, RumRateLimitConfigUpdateRequest body) {
    return updateRumRateLimitConfigWithHttpInfoAsync(scopeType, scopeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update the RUM rate limit configuration for a given scope. Returns the rate limit
   * configuration object when the request is successful.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM rate limit configuration to create or update. (required)
   * @return ApiResponse&lt;RumRateLimitConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumRateLimitConfigResponse> updateRumRateLimitConfigWithHttpInfo(
      RumRateLimitScopeType scopeType, String scopeId, RumRateLimitConfigUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling updateRumRateLimitConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling updateRumRateLimitConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumRateLimitConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRateLimitApi.updateRumRateLimitConfig",
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
        new GenericType<RumRateLimitConfigResponse>() {});
  }

  /**
   * Create or update a RUM rate limit configuration.
   *
   * <p>See {@link #updateRumRateLimitConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the rate limit configuration applies to. (required)
   * @param scopeId The identifier of the scope the rate limit configuration applies to. For the
   *     <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM rate limit configuration to create or update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRateLimitConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRateLimitConfigResponse>>
      updateRumRateLimitConfigWithHttpInfoAsync(
          RumRateLimitScopeType scopeType, String scopeId, RumRateLimitConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRumRateLimitConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scopeType' when calling updateRumRateLimitConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scopeId' when calling updateRumRateLimitConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumRateLimitConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/rate-limit/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRateLimitApi.updateRumRateLimitConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRateLimitConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRateLimitConfigResponse>() {});
  }
}
