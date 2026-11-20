package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigUpdateRequest;
import com.datadog.api.client.v2.model.RUMRetentionQuotaScopeType;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionQuotasApi {
  private ApiClient apiClient;

  public RumRetentionQuotasApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRetentionQuotasApi(ApiClient apiClient) {
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
   * Delete a RUM retention quota configuration.
   *
   * <p>See {@link #deleteRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMQuotaConfig(RUMRetentionQuotaScopeType scopeType, String scopeId)
      throws ApiException {
    deleteRUMQuotaConfigWithHttpInfo(scopeType, scopeId);
  }

  /**
   * Delete a RUM retention quota configuration.
   *
   * <p>See {@link #deleteRUMQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMQuotaConfigAsync(
      RUMRetentionQuotaScopeType scopeType, String scopeId) {
    return deleteRUMQuotaConfigWithHttpInfoAsync(scopeType, scopeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the RUM retention quota configuration for a given scope.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMQuotaConfigWithHttpInfo(
      RUMRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling deleteRUMQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling deleteRUMQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.deleteRUMQuotaConfig",
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
   * Delete a RUM retention quota configuration.
   *
   * <p>See {@link #deleteRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMQuotaConfigWithHttpInfoAsync(
      RUMRetentionQuotaScopeType scopeType, String scopeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling deleteRUMQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling deleteRUMQuotaConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionQuotasApi.deleteRUMQuotaConfig",
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
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return RUMRetentionQuotaConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionQuotaConfigResponse getRUMQuotaConfig(
      RUMRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    return getRUMQuotaConfigWithHttpInfo(scopeType, scopeId).getData();
  }

  /**
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRUMQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;RUMRetentionQuotaConfigResponse&gt;
   */
  public CompletableFuture<RUMRetentionQuotaConfigResponse> getRUMQuotaConfigAsync(
      RUMRetentionQuotaScopeType scopeType, String scopeId) {
    return getRUMQuotaConfigWithHttpInfoAsync(scopeType, scopeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the RUM retention quota configuration for a given scope.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return ApiResponse&lt;RUMRetentionQuotaConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMRetentionQuotaConfigResponse> getRUMQuotaConfigWithHttpInfo(
      RUMRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling getRUMQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling getRUMQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.getRUMQuotaConfig",
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
        new GenericType<RUMRetentionQuotaConfigResponse>() {});
  }

  /**
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionQuotaConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>>
      getRUMQuotaConfigWithHttpInfoAsync(RUMRetentionQuotaScopeType scopeType, String scopeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling getRUMQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling getRUMQuotaConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionQuotasApi.getRUMQuotaConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
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
        new GenericType<RUMRetentionQuotaConfigResponse>() {});
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return RUMRetentionQuotaConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionQuotaConfigResponse upsertRUMQuotaConfig(
      RUMRetentionQuotaScopeType scopeType,
      String scopeId,
      RUMRetentionQuotaConfigUpdateRequest body)
      throws ApiException {
    return upsertRUMQuotaConfigWithHttpInfo(scopeType, scopeId, body).getData();
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRUMQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return CompletableFuture&lt;RUMRetentionQuotaConfigResponse&gt;
   */
  public CompletableFuture<RUMRetentionQuotaConfigResponse> upsertRUMQuotaConfigAsync(
      RUMRetentionQuotaScopeType scopeType,
      String scopeId,
      RUMRetentionQuotaConfigUpdateRequest body) {
    return upsertRUMQuotaConfigWithHttpInfoAsync(scopeType, scopeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update the RUM retention quota configuration for a given scope. Returns the retention
   * quota configuration object when the request is successful.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return ApiResponse&lt;RUMRetentionQuotaConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMRetentionQuotaConfigResponse> upsertRUMQuotaConfigWithHttpInfo(
      RUMRetentionQuotaScopeType scopeType,
      String scopeId,
      RUMRetentionQuotaConfigUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling upsertRUMQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling upsertRUMQuotaConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertRUMQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.upsertRUMQuotaConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RUMRetentionQuotaConfigResponse>() {});
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRUMQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionQuotaConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>>
      upsertRUMQuotaConfigWithHttpInfoAsync(
          RUMRetentionQuotaScopeType scopeType,
          String scopeId,
          RUMRetentionQuotaConfigUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling upsertRUMQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling upsertRUMQuotaConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertRUMQuotaConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionQuotasApi.upsertRUMQuotaConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<RUMRetentionQuotaConfigResponse>() {});
  }
}
