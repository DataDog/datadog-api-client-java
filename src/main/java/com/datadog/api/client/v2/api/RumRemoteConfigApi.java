package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMSdkConfigResponse;
import com.datadog.api.client.v2.model.RUMSdkConfigUpdateRequest;
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
   * <p>See {@link #getRUMSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return RUMSdkConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMSdkConfigResponse getRUMSdkConfig(String configId) throws ApiException {
    return getRUMSdkConfigWithHttpInfo(configId).getData();
  }

  /**
   * Get a RUM SDK configuration.
   *
   * <p>See {@link #getRUMSdkConfigWithHttpInfoAsync}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return CompletableFuture&lt;RUMSdkConfigResponse&gt;
   */
  public CompletableFuture<RUMSdkConfigResponse> getRUMSdkConfigAsync(String configId) {
    return getRUMSdkConfigWithHttpInfoAsync(configId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a RUM SDK configuration by its identifier.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return ApiResponse&lt;RUMSdkConfigResponse&gt;
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
  public ApiResponse<RUMSdkConfigResponse> getRUMSdkConfigWithHttpInfo(String configId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRUMSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configId' when calling getRUMSdkConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRemoteConfigApi.getRUMSdkConfig",
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
        new GenericType<RUMSdkConfigResponse>() {});
  }

  /**
   * Get a RUM SDK configuration.
   *
   * <p>See {@link #getRUMSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMSdkConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMSdkConfigResponse>> getRUMSdkConfigWithHttpInfoAsync(
      String configId) {
    // Check if unstable operation is enabled
    String operationId = "getRUMSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'configId' when calling getRUMSdkConfig"));
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
              "v2.RumRemoteConfigApi.getRUMSdkConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMSdkConfigResponse>() {});
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRUMSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return RUMSdkConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMSdkConfigResponse updateRUMSdkConfig(String configId, RUMSdkConfigUpdateRequest body)
      throws ApiException {
    return updateRUMSdkConfigWithHttpInfo(configId, body).getData();
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRUMSdkConfigWithHttpInfoAsync}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return CompletableFuture&lt;RUMSdkConfigResponse&gt;
   */
  public CompletableFuture<RUMSdkConfigResponse> updateRUMSdkConfigAsync(
      String configId, RUMSdkConfigUpdateRequest body) {
    return updateRUMSdkConfigWithHttpInfoAsync(configId, body)
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
   * @return ApiResponse&lt;RUMSdkConfigResponse&gt;
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
  public ApiResponse<RUMSdkConfigResponse> updateRUMSdkConfigWithHttpInfo(
      String configId, RUMSdkConfigUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRUMSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configId' when calling updateRUMSdkConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMSdkConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/rum/configs/{config_id}"
            .replaceAll("\\{" + "config_id" + "\\}", apiClient.escapeString(configId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRemoteConfigApi.updateRUMSdkConfig",
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
        new GenericType<RUMSdkConfigResponse>() {});
  }

  /**
   * Update a RUM SDK configuration.
   *
   * <p>See {@link #updateRUMSdkConfigWithHttpInfo}.
   *
   * @param configId The ID of the RUM SDK configuration. (required)
   * @param body The RUM SDK configuration update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMSdkConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMSdkConfigResponse>> updateRUMSdkConfigWithHttpInfoAsync(
      String configId, RUMSdkConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRUMSdkConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configId' is set
    if (configId == null) {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'configId' when calling updateRUMSdkConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMSdkConfig"));
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
              "v2.RumRemoteConfigApi.updateRUMSdkConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMSdkConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMSdkConfigResponse>() {});
  }
}
