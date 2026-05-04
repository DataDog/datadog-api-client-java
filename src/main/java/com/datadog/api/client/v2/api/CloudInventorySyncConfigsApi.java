package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CloudInventorySyncConfigResponse;
import com.datadog.api.client.v2.model.UpsertCloudInventorySyncConfigRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudInventorySyncConfigsApi {
  private ApiClient apiClient;

  public CloudInventorySyncConfigsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudInventorySyncConfigsApi(ApiClient apiClient) {
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
   * Create or update a sync configuration.
   *
   * <p>See {@link #upsertSyncConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CloudInventorySyncConfigResponse
   * @throws ApiException if fails to make API call
   */
  public CloudInventorySyncConfigResponse upsertSyncConfig(
      UpsertCloudInventorySyncConfigRequest body) throws ApiException {
    return upsertSyncConfigWithHttpInfo(body).getData();
  }

  /**
   * Create or update a sync configuration.
   *
   * <p>See {@link #upsertSyncConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CloudInventorySyncConfigResponse&gt;
   */
  public CompletableFuture<CloudInventorySyncConfigResponse> upsertSyncConfigAsync(
      UpsertCloudInventorySyncConfigRequest body) {
    return upsertSyncConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update a cloud inventory sync configuration. Specify the cloud provider in <code>
   * data.id</code> and provider-specific settings under <code>data.attributes</code>. This endpoint
   * uses an upsert model.
   *
   * @param body (required)
   * @return ApiResponse&lt;CloudInventorySyncConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudInventorySyncConfigResponse> upsertSyncConfigWithHttpInfo(
      UpsertCloudInventorySyncConfigRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertSyncConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertSyncConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloudinventoryservice/syncconfigs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudInventorySyncConfigsApi.upsertSyncConfig",
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
        new GenericType<CloudInventorySyncConfigResponse>() {});
  }

  /**
   * Create or update a sync configuration.
   *
   * <p>See {@link #upsertSyncConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudInventorySyncConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudInventorySyncConfigResponse>>
      upsertSyncConfigWithHttpInfoAsync(UpsertCloudInventorySyncConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "upsertSyncConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CloudInventorySyncConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CloudInventorySyncConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertSyncConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloudinventoryservice/syncconfigs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudInventorySyncConfigsApi.upsertSyncConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudInventorySyncConfigResponse>> result =
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
        new GenericType<CloudInventorySyncConfigResponse>() {});
  }
}
