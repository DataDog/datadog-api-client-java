package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumConfigCreateRequest;
import com.datadog.api.client.v2.model.RumConfigResponse;
import com.datadog.api.client.v2.model.RumConfigUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumConfigApi {
  private ApiClient apiClient;

  public RumConfigApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumConfigApi(ApiClient apiClient) {
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
   * Create the RUM configuration.
   *
   * <p>See {@link #createRumConfigWithHttpInfo}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return RumConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumConfigResponse createRumConfig(RumConfigCreateRequest body) throws ApiException {
    return createRumConfigWithHttpInfo(body).getData();
  }

  /**
   * Create the RUM configuration.
   *
   * <p>See {@link #createRumConfigWithHttpInfoAsync}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return CompletableFuture&lt;RumConfigResponse&gt;
   */
  public CompletableFuture<RumConfigResponse> createRumConfigAsync(RumConfigCreateRequest body) {
    return createRumConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create the RUM configuration for your organization. Returns the RUM configuration object from
   * the request body when the request is successful.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return ApiResponse&lt;RumConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumConfigResponse> createRumConfigWithHttpInfo(RumConfigCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumConfigApi.createRumConfig",
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
        new GenericType<RumConfigResponse>() {});
  }

  /**
   * Create the RUM configuration.
   *
   * <p>See {@link #createRumConfigWithHttpInfo}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumConfigResponse>> createRumConfigWithHttpInfoAsync(
      RumConfigCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRumConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumConfigApi.createRumConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumConfigResponse>() {});
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRumConfigWithHttpInfo}.
   *
   * @return RumConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumConfigResponse getRumConfig() throws ApiException {
    return getRumConfigWithHttpInfo().getData();
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRumConfigWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RumConfigResponse&gt;
   */
  public CompletableFuture<RumConfigResponse> getRumConfigAsync() {
    return getRumConfigWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the RUM configuration for your organization.
   *
   * @return ApiResponse&lt;RumConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumConfigResponse> getRumConfigWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumConfigApi.getRumConfig",
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
        new GenericType<RumConfigResponse>() {});
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRumConfigWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RumConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumConfigResponse>> getRumConfigWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumConfigApi.getRumConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumConfigResponse>() {});
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRumConfigWithHttpInfo}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return RumConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumConfigResponse updateRumConfig(RumConfigUpdateRequest body) throws ApiException {
    return updateRumConfigWithHttpInfo(body).getData();
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRumConfigWithHttpInfoAsync}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return CompletableFuture&lt;RumConfigResponse&gt;
   */
  public CompletableFuture<RumConfigResponse> updateRumConfigAsync(RumConfigUpdateRequest body) {
    return updateRumConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the RUM configuration for your organization. Returns the RUM configuration object from
   * the request body when the request is successful.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return ApiResponse&lt;RumConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumConfigResponse> updateRumConfigWithHttpInfo(RumConfigUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumConfigApi.updateRumConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumConfigResponse>() {});
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRumConfigWithHttpInfo}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumConfigResponse>> updateRumConfigWithHttpInfoAsync(
      RumConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRumConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumConfigApi.updateRumConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumConfigResponse>() {});
  }
}
