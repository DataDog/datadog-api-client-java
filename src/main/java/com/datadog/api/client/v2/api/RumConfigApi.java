package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMConfigCreateRequest;
import com.datadog.api.client.v2.model.RUMConfigResponse;
import com.datadog.api.client.v2.model.RUMConfigUpdateRequest;
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
   * <p>See {@link #createRUMConfigWithHttpInfo}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return RUMConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMConfigResponse createRUMConfig(RUMConfigCreateRequest body) throws ApiException {
    return createRUMConfigWithHttpInfo(body).getData();
  }

  /**
   * Create the RUM configuration.
   *
   * <p>See {@link #createRUMConfigWithHttpInfoAsync}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return CompletableFuture&lt;RUMConfigResponse&gt;
   */
  public CompletableFuture<RUMConfigResponse> createRUMConfigAsync(RUMConfigCreateRequest body) {
    return createRUMConfigWithHttpInfoAsync(body)
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
   * @return ApiResponse&lt;RUMConfigResponse&gt;
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
  public ApiResponse<RUMConfigResponse> createRUMConfigWithHttpInfo(RUMConfigCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRUMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumConfigApi.createRUMConfig",
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
        new GenericType<RUMConfigResponse>() {});
  }

  /**
   * Create the RUM configuration.
   *
   * <p>See {@link #createRUMConfigWithHttpInfo}.
   *
   * @param body The definition of the RUM configuration to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMConfigResponse>> createRUMConfigWithHttpInfoAsync(
      RUMConfigCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRUMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumConfigApi.createRUMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMConfigResponse>() {});
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRUMConfigWithHttpInfo}.
   *
   * @return RUMConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMConfigResponse getRUMConfig() throws ApiException {
    return getRUMConfigWithHttpInfo().getData();
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRUMConfigWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMConfigResponse&gt;
   */
  public CompletableFuture<RUMConfigResponse> getRUMConfigAsync() {
    return getRUMConfigWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the RUM configuration for your organization.
   *
   * @return ApiResponse&lt;RUMConfigResponse&gt;
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
  public ApiResponse<RUMConfigResponse> getRUMConfigWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRUMConfig";
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
            "v2.RumConfigApi.getRUMConfig",
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
        new GenericType<RUMConfigResponse>() {});
  }

  /**
   * Get the RUM configuration.
   *
   * <p>See {@link #getRUMConfigWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RUMConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMConfigResponse>> getRUMConfigWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getRUMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
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
              "v2.RumConfigApi.getRUMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMConfigResponse>() {});
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRUMConfigWithHttpInfo}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return RUMConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RUMConfigResponse updateRUMConfig(RUMConfigUpdateRequest body) throws ApiException {
    return updateRUMConfigWithHttpInfo(body).getData();
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRUMConfigWithHttpInfoAsync}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return CompletableFuture&lt;RUMConfigResponse&gt;
   */
  public CompletableFuture<RUMConfigResponse> updateRUMConfigAsync(RUMConfigUpdateRequest body) {
    return updateRUMConfigWithHttpInfoAsync(body)
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
   * @return ApiResponse&lt;RUMConfigResponse&gt;
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
  public ApiResponse<RUMConfigResponse> updateRUMConfigWithHttpInfo(RUMConfigUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRUMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumConfigApi.updateRUMConfig",
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
        new GenericType<RUMConfigResponse>() {});
  }

  /**
   * Update the RUM configuration.
   *
   * <p>See {@link #updateRUMConfigWithHttpInfo}.
   *
   * @param body New definition of the RUM configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMConfigResponse>> updateRUMConfigWithHttpInfoAsync(
      RUMConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRUMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumConfigApi.updateRUMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMConfigResponse>() {});
  }
}
