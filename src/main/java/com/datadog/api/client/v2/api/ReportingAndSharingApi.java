package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateSnapshotRequest;
import com.datadog.api.client.v2.model.CreateSnapshotResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportingAndSharingApi {
  private ApiClient apiClient;

  public ReportingAndSharingApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ReportingAndSharingApi(ApiClient apiClient) {
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
   * Create a graph snapshot.
   *
   * <p>See {@link #createSnapshotWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateSnapshotResponse
   * @throws ApiException if fails to make API call
   */
  public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest body) throws ApiException {
    return createSnapshotWithHttpInfo(body).getData();
  }

  /**
   * Create a graph snapshot.
   *
   * <p>See {@link #createSnapshotWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateSnapshotResponse&gt;
   */
  public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest body) {
    return createSnapshotWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a snapshot of a graph widget. The snapshot is rendered asynchronously; the returned URL
   * can be polled until the image is ready.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateSnapshotResponse&gt;
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
  public ApiResponse<CreateSnapshotResponse> createSnapshotWithHttpInfo(CreateSnapshotRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSnapshot";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSnapshot");
    }
    // create path and map variables
    String localVarPath = "/api/v2/snapshot";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportingAndSharingApi.createSnapshot",
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
        new GenericType<CreateSnapshotResponse>() {});
  }

  /**
   * Create a graph snapshot.
   *
   * <p>See {@link #createSnapshotWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateSnapshotResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateSnapshotResponse>> createSnapshotWithHttpInfoAsync(
      CreateSnapshotRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSnapshot";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateSnapshotResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateSnapshotResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSnapshot"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/snapshot";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportingAndSharingApi.createSnapshot",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateSnapshotResponse>> result = new CompletableFuture<>();
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
        new GenericType<CreateSnapshotResponse>() {});
  }
}
