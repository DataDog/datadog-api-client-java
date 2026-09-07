package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigUpdateRequest;
import com.datadog.api.client.v2.model.RumRetentionQuotaScopeType;
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
   * <p>See {@link #deleteRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRumQuotaConfig(RumRetentionQuotaScopeType scopeType, String scopeId)
      throws ApiException {
    deleteRumQuotaConfigWithHttpInfo(scopeType, scopeId);
  }

  /**
   * Delete a RUM retention quota configuration.
   *
   * <p>See {@link #deleteRumQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRumQuotaConfigAsync(
      RumRetentionQuotaScopeType scopeType, String scopeId) {
    return deleteRumQuotaConfigWithHttpInfoAsync(scopeType, scopeId)
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
  public ApiResponse<Void> deleteRumQuotaConfigWithHttpInfo(
      RumRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling deleteRumQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling deleteRumQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.deleteRumQuotaConfig",
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
   * Delete a RUM retention quota configuration.
   *
   * <p>See {@link #deleteRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRumQuotaConfigWithHttpInfoAsync(
      RumRetentionQuotaScopeType scopeType, String scopeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling deleteRumQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling deleteRumQuotaConfig"));
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
              "v2.RumRetentionQuotasApi.deleteRumQuotaConfig",
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
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return RumRetentionQuotaConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionQuotaConfigResponse getRumQuotaConfig(
      RumRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    return getRumQuotaConfigWithHttpInfo(scopeType, scopeId).getData();
  }

  /**
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRumQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;RumRetentionQuotaConfigResponse&gt;
   */
  public CompletableFuture<RumRetentionQuotaConfigResponse> getRumQuotaConfigAsync(
      RumRetentionQuotaScopeType scopeType, String scopeId) {
    return getRumQuotaConfigWithHttpInfoAsync(scopeType, scopeId)
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
   * @return ApiResponse&lt;RumRetentionQuotaConfigResponse&gt;
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
  public ApiResponse<RumRetentionQuotaConfigResponse> getRumQuotaConfigWithHttpInfo(
      RumRetentionQuotaScopeType scopeType, String scopeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling getRumQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling getRumQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.getRumQuotaConfig",
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
        new GenericType<RumRetentionQuotaConfigResponse>() {});
  }

  /**
   * Get a RUM retention quota configuration.
   *
   * <p>See {@link #getRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionQuotaConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>>
      getRumQuotaConfigWithHttpInfoAsync(RumRetentionQuotaScopeType scopeType, String scopeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling getRumQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling getRumQuotaConfig"));
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
              "v2.RumRetentionQuotasApi.getRumQuotaConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
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
        new GenericType<RumRetentionQuotaConfigResponse>() {});
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return RumRetentionQuotaConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionQuotaConfigResponse upsertRumQuotaConfig(
      RumRetentionQuotaScopeType scopeType,
      String scopeId,
      RumRetentionQuotaConfigUpdateRequest body)
      throws ApiException {
    return upsertRumQuotaConfigWithHttpInfo(scopeType, scopeId, body).getData();
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRumQuotaConfigWithHttpInfoAsync}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required, default to "application")
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return CompletableFuture&lt;RumRetentionQuotaConfigResponse&gt;
   */
  public CompletableFuture<RumRetentionQuotaConfigResponse> upsertRumQuotaConfigAsync(
      RumRetentionQuotaScopeType scopeType,
      String scopeId,
      RumRetentionQuotaConfigUpdateRequest body) {
    return upsertRumQuotaConfigWithHttpInfoAsync(scopeType, scopeId, body)
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
   * @return ApiResponse&lt;RumRetentionQuotaConfigResponse&gt;
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
  public ApiResponse<RumRetentionQuotaConfigResponse> upsertRumQuotaConfigWithHttpInfo(
      RumRetentionQuotaScopeType scopeType,
      String scopeId,
      RumRetentionQuotaConfigUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeType' when calling upsertRumQuotaConfig");
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scopeId' when calling upsertRumQuotaConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertRumQuotaConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/retention-quota/{scope_type}/{scope_id}"
            .replaceAll("\\{" + "scope_type" + "\\}", apiClient.escapeString(scopeType.toString()))
            .replaceAll("\\{" + "scope_id" + "\\}", apiClient.escapeString(scopeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionQuotasApi.upsertRumQuotaConfig",
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
        new GenericType<RumRetentionQuotaConfigResponse>() {});
  }

  /**
   * Create or update a RUM retention quota config.
   *
   * <p>See {@link #upsertRumQuotaConfigWithHttpInfo}.
   *
   * @param scopeType The type of scope the retention quota configuration applies to. <code>
   *     application</code> is the only supported scope type. (required)
   * @param scopeId The identifier of the scope the retention quota configuration applies to. For
   *     the <code>application</code> scope, this is the RUM application ID. (required)
   * @param body The definition of the RUM retention quota configuration to create or update.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionQuotaConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>>
      upsertRumQuotaConfigWithHttpInfoAsync(
          RumRetentionQuotaScopeType scopeType,
          String scopeId,
          RumRetentionQuotaConfigUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'scopeType' is set
    if (scopeType == null) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeType' when calling upsertRumQuotaConfig"));
      return result;
    }

    // verify the required parameter 'scopeId' is set
    if (scopeId == null) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scopeId' when calling upsertRumQuotaConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertRumQuotaConfig"));
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
              "v2.RumRetentionQuotasApi.upsertRumQuotaConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionQuotaConfigResponse>> result =
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
        new GenericType<RumRetentionQuotaConfigResponse>() {});
  }
}
