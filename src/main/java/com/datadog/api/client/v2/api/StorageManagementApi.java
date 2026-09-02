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
public class StorageManagementApi {
  private ApiClient apiClient;

  public StorageManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StorageManagementApi(ApiClient apiClient) {
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
   * Delete a Storage Management configuration.
   *
   * <p>See {@link #deleteSyncConfigWithHttpInfo}.
   *
   * @param id Unique identifier of the Storage Management configuration. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSyncConfig(String id) throws ApiException {
    deleteSyncConfigWithHttpInfo(id);
  }

  /**
   * Delete a Storage Management configuration.
   *
   * <p>See {@link #deleteSyncConfigWithHttpInfoAsync}.
   *
   * @param id Unique identifier of the Storage Management configuration. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSyncConfigAsync(String id) {
    return deleteSyncConfigWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Storage Management configuration by its unique identifier. Deleting a configuration
   * stops inventory file synchronization for the associated cloud account.
   *
   * @param id Unique identifier of the Storage Management configuration. (required)
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
  public ApiResponse<Void> deleteSyncConfigWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteSyncConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloudinventoryservice/syncconfigs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StorageManagementApi.deleteSyncConfig",
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
   * Delete a Storage Management configuration.
   *
   * <p>See {@link #deleteSyncConfigWithHttpInfo}.
   *
   * @param id Unique identifier of the Storage Management configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSyncConfigWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteSyncConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloudinventoryservice/syncconfigs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StorageManagementApi.deleteSyncConfig",
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
   * Enable Storage Management for a bucket.
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
   * Enable Storage Management for a bucket.
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
   * Enable Storage Management for an S3 bucket, GCS bucket, or Azure container by registering the
   * destination that holds its inventory reports. Set <code>data.id</code> to the cloud provider (
   * <code>aws</code>, <code>gcp</code>, or <code>azure</code>) and provide the matching settings
   * under data.attributes. Calling this endpoint with the same provider replaces the existing
   * configuration.
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
            "v2.StorageManagementApi.upsertSyncConfig",
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
   * Enable Storage Management for a bucket.
   *
   * <p>See {@link #upsertSyncConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudInventorySyncConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudInventorySyncConfigResponse>>
      upsertSyncConfigWithHttpInfoAsync(UpsertCloudInventorySyncConfigRequest body) {
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
              "v2.StorageManagementApi.upsertSyncConfig",
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
