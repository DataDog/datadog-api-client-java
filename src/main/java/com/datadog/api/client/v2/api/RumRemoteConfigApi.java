package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumSdkConfigResponse;
import com.datadog.api.client.v2.model.RumSdkConfigUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRemoteConfigApi {
  private ApiClient apiClient;

  public RumRemoteConfigApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRemoteConfigApi(ApiClient apiClient) {
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
   * Get a RUM SDK configuration.
   *
   * <p>See {@link #getRumSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return RumSdkConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumSdkConfigResponse getRumSdkConfig(String configId) throws ApiException {
    return getRumSdkConfigWithHttpInfo(configId).getData();
  }

  /**
   * Get a RUM SDK configuration.
   *
   * <p>See {@link #getRumSdkConfigWithHttpInfoAsync}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return CompletableFuture&lt;RumSdkConfigResponse&gt;
   */
  public CompletableFuture<RumSdkConfigResponse> getRumSdkConfigAsync(String configId) {
    return getRumSdkConfigWithHttpInfoAsync(configId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a RUM SDK configuration by its identifier.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return ApiResponse&lt;RumSdkConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumSdkConfigResponse> getRumSdkConfigWithHttpInfo(String configId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configId' when calling getRumSdkConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRemoteConfigApi.getRumSdkConfig",
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
        new GenericType<RumSdkConfigResponse>() {});
  }

  /**
   * Get a RUM SDK configuration.
   *
   * <p>See {@link #getRumSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSdkConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSdkConfigResponse>> getRumSdkConfigWithHttpInfoAsync(
      String configId) {
    // Check if unstable operation is enabled
    String operationId = "getRumSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'configId' when calling getRumSdkConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRemoteConfigApi.getRumSdkConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSdkConfigResponse>() {});
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRumSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return RumSdkConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumSdkConfigResponse updateRumSdkConfig(String configId, RumSdkConfigUpdateRequest body)
      throws ApiException {
    return updateRumSdkConfigWithHttpInfo(configId, body).getData();
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRumSdkConfigWithHttpInfoAsync}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return CompletableFuture&lt;RumSdkConfigResponse&gt;
   */
  public CompletableFuture<RumSdkConfigResponse> updateRumSdkConfigAsync(
      String configId, RumSdkConfigUpdateRequest body) {
    return updateRumSdkConfigWithHttpInfoAsync(configId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing RUM SDK configuration by its identifier. Returns the updated configuration
   * when successful.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return ApiResponse&lt;RumSdkConfigResponse&gt;
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
  public ApiResponse<RumSdkConfigResponse> updateRumSdkConfigWithHttpInfo(
      String configId, RumSdkConfigUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRumSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configId' when calling updateRumSdkConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumSdkConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRemoteConfigApi.updateRumSdkConfig",
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
        new GenericType<RumSdkConfigResponse>() {});
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRumSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSdkConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSdkConfigResponse>> updateRumSdkConfigWithHttpInfoAsync(
      String configId, RumSdkConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRumSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'configId' when calling updateRumSdkConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumSdkConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRemoteConfigApi.updateRumSdkConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSdkConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSdkConfigResponse>() {});
  }
}
