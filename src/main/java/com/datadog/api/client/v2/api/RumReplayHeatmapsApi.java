package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Snapshot;
import com.datadog.api.client.v2.model.SnapshotArray;
import com.datadog.api.client.v2.model.SnapshotCreateRequest;
import com.datadog.api.client.v2.model.SnapshotUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplayHeatmapsApi {
  private ApiClient apiClient;

  public RumReplayHeatmapsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplayHeatmapsApi(ApiClient apiClient) {
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
   * Create replay heatmap snapshot.
   *
   * <p>See {@link #createReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param body (required)
   * @return Snapshot
   * @throws ApiException if fails to make API call
   */
  public Snapshot createReplayHeatmapSnapshot(SnapshotCreateRequest body) throws ApiException {
    return createReplayHeatmapSnapshotWithHttpInfo(body).getData();
  }

  /**
   * Create replay heatmap snapshot.
   *
   * <p>See {@link #createReplayHeatmapSnapshotWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;Snapshot&gt;
   */
  public CompletableFuture<Snapshot> createReplayHeatmapSnapshotAsync(SnapshotCreateRequest body) {
    return createReplayHeatmapSnapshotWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a heatmap snapshot.
   *
   * @param body (required)
   * @return ApiResponse&lt;Snapshot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Snapshot> createReplayHeatmapSnapshotWithHttpInfo(SnapshotCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createReplayHeatmapSnapshot");
    }
    // create path and map variables
    String localVarPath = "/api/v2/replay/heatmap/snapshots";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayHeatmapsApi.createReplayHeatmapSnapshot",
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
        new GenericType<Snapshot>() {});
  }

  /**
   * Create replay heatmap snapshot.
   *
   * <p>See {@link #createReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Snapshot&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Snapshot>> createReplayHeatmapSnapshotWithHttpInfoAsync(
      SnapshotCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Snapshot>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createReplayHeatmapSnapshot"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/replay/heatmap/snapshots";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayHeatmapsApi.createReplayHeatmapSnapshot",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Snapshot>> result = new CompletableFuture<>();
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
        new GenericType<Snapshot>() {});
  }

  /**
   * Delete replay heatmap snapshot.
   *
   * <p>See {@link #deleteReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReplayHeatmapSnapshot(String snapshotId) throws ApiException {
    deleteReplayHeatmapSnapshotWithHttpInfo(snapshotId);
  }

  /**
   * Delete replay heatmap snapshot.
   *
   * <p>See {@link #deleteReplayHeatmapSnapshotWithHttpInfoAsync}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteReplayHeatmapSnapshotAsync(String snapshotId) {
    return deleteReplayHeatmapSnapshotWithHttpInfoAsync(snapshotId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a heatmap snapshot.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteReplayHeatmapSnapshotWithHttpInfo(String snapshotId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'snapshotId' when calling deleteReplayHeatmapSnapshot");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/heatmap/snapshots/{snapshot_id}"
            .replaceAll(
                "\\{" + "snapshot_id" + "\\}", apiClient.escapeString(snapshotId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayHeatmapsApi.deleteReplayHeatmapSnapshot",
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
   * Delete replay heatmap snapshot.
   *
   * <p>See {@link #deleteReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteReplayHeatmapSnapshotWithHttpInfoAsync(
      String snapshotId) {
    Object localVarPostBody = null;

    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'snapshotId' when calling"
                  + " deleteReplayHeatmapSnapshot"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/heatmap/snapshots/{snapshot_id}"
            .replaceAll(
                "\\{" + "snapshot_id" + "\\}", apiClient.escapeString(snapshotId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayHeatmapsApi.deleteReplayHeatmapSnapshot",
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

  /** Manage optional parameters to listReplayHeatmapSnapshots. */
  public static class ListReplayHeatmapSnapshotsOptionalParameters {
    private String filterDeviceType;
    private Integer pageLimit;
    private String filterApplicationId;

    /**
     * Set filterDeviceType.
     *
     * @param filterDeviceType Device type to filter snapshots. (optional)
     * @return ListReplayHeatmapSnapshotsOptionalParameters
     */
    public ListReplayHeatmapSnapshotsOptionalParameters filterDeviceType(String filterDeviceType) {
      this.filterDeviceType = filterDeviceType;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of snapshots to return. (optional)
     * @return ListReplayHeatmapSnapshotsOptionalParameters
     */
    public ListReplayHeatmapSnapshotsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set filterApplicationId.
     *
     * @param filterApplicationId Filter by application ID. (optional)
     * @return ListReplayHeatmapSnapshotsOptionalParameters
     */
    public ListReplayHeatmapSnapshotsOptionalParameters filterApplicationId(
        String filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }
  }

  /**
   * List replay heatmap snapshots.
   *
   * <p>See {@link #listReplayHeatmapSnapshotsWithHttpInfo}.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @return SnapshotArray
   * @throws ApiException if fails to make API call
   */
  public SnapshotArray listReplayHeatmapSnapshots(String filterViewName) throws ApiException {
    return listReplayHeatmapSnapshotsWithHttpInfo(
            filterViewName, new ListReplayHeatmapSnapshotsOptionalParameters())
        .getData();
  }

  /**
   * List replay heatmap snapshots.
   *
   * <p>See {@link #listReplayHeatmapSnapshotsWithHttpInfoAsync}.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @return CompletableFuture&lt;SnapshotArray&gt;
   */
  public CompletableFuture<SnapshotArray> listReplayHeatmapSnapshotsAsync(String filterViewName) {
    return listReplayHeatmapSnapshotsWithHttpInfoAsync(
            filterViewName, new ListReplayHeatmapSnapshotsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List replay heatmap snapshots.
   *
   * <p>See {@link #listReplayHeatmapSnapshotsWithHttpInfo}.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @param parameters Optional parameters for the request.
   * @return SnapshotArray
   * @throws ApiException if fails to make API call
   */
  public SnapshotArray listReplayHeatmapSnapshots(
      String filterViewName, ListReplayHeatmapSnapshotsOptionalParameters parameters)
      throws ApiException {
    return listReplayHeatmapSnapshotsWithHttpInfo(filterViewName, parameters).getData();
  }

  /**
   * List replay heatmap snapshots.
   *
   * <p>See {@link #listReplayHeatmapSnapshotsWithHttpInfoAsync}.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SnapshotArray&gt;
   */
  public CompletableFuture<SnapshotArray> listReplayHeatmapSnapshotsAsync(
      String filterViewName, ListReplayHeatmapSnapshotsOptionalParameters parameters) {
    return listReplayHeatmapSnapshotsWithHttpInfoAsync(filterViewName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List heatmap snapshots.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SnapshotArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SnapshotArray> listReplayHeatmapSnapshotsWithHttpInfo(
      String filterViewName, ListReplayHeatmapSnapshotsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'filterViewName' is set
    if (filterViewName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterViewName' when calling"
              + " listReplayHeatmapSnapshots");
    }
    String filterDeviceType = parameters.filterDeviceType;
    Integer pageLimit = parameters.pageLimit;
    String filterApplicationId = parameters.filterApplicationId;
    // create path and map variables
    String localVarPath = "/api/v2/replay/heatmap/snapshots";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[device_type]", filterDeviceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayHeatmapsApi.listReplayHeatmapSnapshots",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<SnapshotArray>() {});
  }

  /**
   * List replay heatmap snapshots.
   *
   * <p>See {@link #listReplayHeatmapSnapshotsWithHttpInfo}.
   *
   * @param filterViewName View name to filter snapshots. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SnapshotArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SnapshotArray>> listReplayHeatmapSnapshotsWithHttpInfoAsync(
      String filterViewName, ListReplayHeatmapSnapshotsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'filterViewName' is set
    if (filterViewName == null) {
      CompletableFuture<ApiResponse<SnapshotArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterViewName' when calling"
                  + " listReplayHeatmapSnapshots"));
      return result;
    }
    String filterDeviceType = parameters.filterDeviceType;
    Integer pageLimit = parameters.pageLimit;
    String filterApplicationId = parameters.filterApplicationId;
    // create path and map variables
    String localVarPath = "/api/v2/replay/heatmap/snapshots";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[device_type]", filterDeviceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayHeatmapsApi.listReplayHeatmapSnapshots",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SnapshotArray>> result = new CompletableFuture<>();
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
        new GenericType<SnapshotArray>() {});
  }

  /**
   * Update replay heatmap snapshot.
   *
   * <p>See {@link #updateReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @param body (required)
   * @return Snapshot
   * @throws ApiException if fails to make API call
   */
  public Snapshot updateReplayHeatmapSnapshot(String snapshotId, SnapshotUpdateRequest body)
      throws ApiException {
    return updateReplayHeatmapSnapshotWithHttpInfo(snapshotId, body).getData();
  }

  /**
   * Update replay heatmap snapshot.
   *
   * <p>See {@link #updateReplayHeatmapSnapshotWithHttpInfoAsync}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Snapshot&gt;
   */
  public CompletableFuture<Snapshot> updateReplayHeatmapSnapshotAsync(
      String snapshotId, SnapshotUpdateRequest body) {
    return updateReplayHeatmapSnapshotWithHttpInfoAsync(snapshotId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a heatmap snapshot.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @param body (required)
   * @return ApiResponse&lt;Snapshot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Snapshot> updateReplayHeatmapSnapshotWithHttpInfo(
      String snapshotId, SnapshotUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'snapshotId' when calling updateReplayHeatmapSnapshot");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateReplayHeatmapSnapshot");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/heatmap/snapshots/{snapshot_id}"
            .replaceAll(
                "\\{" + "snapshot_id" + "\\}", apiClient.escapeString(snapshotId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayHeatmapsApi.updateReplayHeatmapSnapshot",
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
        new GenericType<Snapshot>() {});
  }

  /**
   * Update replay heatmap snapshot.
   *
   * <p>See {@link #updateReplayHeatmapSnapshotWithHttpInfo}.
   *
   * @param snapshotId Unique identifier of the heatmap snapshot. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Snapshot&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Snapshot>> updateReplayHeatmapSnapshotWithHttpInfoAsync(
      String snapshotId, SnapshotUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      CompletableFuture<ApiResponse<Snapshot>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'snapshotId' when calling"
                  + " updateReplayHeatmapSnapshot"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Snapshot>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateReplayHeatmapSnapshot"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/heatmap/snapshots/{snapshot_id}"
            .replaceAll(
                "\\{" + "snapshot_id" + "\\}", apiClient.escapeString(snapshotId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayHeatmapsApi.updateReplayHeatmapSnapshot",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Snapshot>> result = new CompletableFuture<>();
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
        new GenericType<Snapshot>() {});
  }
}
