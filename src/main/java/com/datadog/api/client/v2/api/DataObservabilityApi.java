package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetDataObservabilityMonitorRunStatusResponse;
import com.datadog.api.client.v2.model.RunDataObservabilityMonitorResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataObservabilityApi {
  private ApiClient apiClient;

  public DataObservabilityApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DataObservabilityApi(ApiClient apiClient) {
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
   * Get data observability monitor run status.
   *
   * <p>See {@link #getDataObservabilityMonitorRunStatusWithHttpInfo}.
   *
   * @param runId The ID of the monitor run to retrieve status for. (required)
   * @return GetDataObservabilityMonitorRunStatusResponse
   * @throws ApiException if fails to make API call
   */
  public GetDataObservabilityMonitorRunStatusResponse getDataObservabilityMonitorRunStatus(
      String runId) throws ApiException {
    return getDataObservabilityMonitorRunStatusWithHttpInfo(runId).getData();
  }

  /**
   * Get data observability monitor run status.
   *
   * <p>See {@link #getDataObservabilityMonitorRunStatusWithHttpInfoAsync}.
   *
   * @param runId The ID of the monitor run to retrieve status for. (required)
   * @return CompletableFuture&lt;GetDataObservabilityMonitorRunStatusResponse&gt;
   */
  public CompletableFuture<GetDataObservabilityMonitorRunStatusResponse>
      getDataObservabilityMonitorRunStatusAsync(String runId) {
    return getDataObservabilityMonitorRunStatusWithHttpInfoAsync(runId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the current status of a data observability monitor run. Poll this endpoint after
   * triggering a run to determine when evaluation is complete.
   *
   * @param runId The ID of the monitor run to retrieve status for. (required)
   * @return ApiResponse&lt;GetDataObservabilityMonitorRunStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetDataObservabilityMonitorRunStatusResponse>
      getDataObservabilityMonitorRunStatusWithHttpInfo(String runId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDataObservabilityMonitorRunStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'runId' when calling"
              + " getDataObservabilityMonitorRunStatus");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-observability/monitors/runs/{run_id}/status"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DataObservabilityApi.getDataObservabilityMonitorRunStatus",
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
        new GenericType<GetDataObservabilityMonitorRunStatusResponse>() {});
  }

  /**
   * Get data observability monitor run status.
   *
   * <p>See {@link #getDataObservabilityMonitorRunStatusWithHttpInfo}.
   *
   * @param runId The ID of the monitor run to retrieve status for. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;GetDataObservabilityMonitorRunStatusResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetDataObservabilityMonitorRunStatusResponse>>
      getDataObservabilityMonitorRunStatusWithHttpInfoAsync(String runId) {
    // Check if unstable operation is enabled
    String operationId = "getDataObservabilityMonitorRunStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetDataObservabilityMonitorRunStatusResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<GetDataObservabilityMonitorRunStatusResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'runId' when calling"
                  + " getDataObservabilityMonitorRunStatus"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-observability/monitors/runs/{run_id}/status"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DataObservabilityApi.getDataObservabilityMonitorRunStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetDataObservabilityMonitorRunStatusResponse>> result =
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
        new GenericType<GetDataObservabilityMonitorRunStatusResponse>() {});
  }

  /**
   * Run a data observability monitor.
   *
   * <p>See {@link #runDataObservabilityMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the data observability monitor to run. (required)
   * @return RunDataObservabilityMonitorResponse
   * @throws ApiException if fails to make API call
   */
  public RunDataObservabilityMonitorResponse runDataObservabilityMonitor(Long monitorId)
      throws ApiException {
    return runDataObservabilityMonitorWithHttpInfo(monitorId).getData();
  }

  /**
   * Run a data observability monitor.
   *
   * <p>See {@link #runDataObservabilityMonitorWithHttpInfoAsync}.
   *
   * @param monitorId The ID of the data observability monitor to run. (required)
   * @return CompletableFuture&lt;RunDataObservabilityMonitorResponse&gt;
   */
  public CompletableFuture<RunDataObservabilityMonitorResponse> runDataObservabilityMonitorAsync(
      Long monitorId) {
    return runDataObservabilityMonitorWithHttpInfoAsync(monitorId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Manually triggers a run for a data observability monitor. Only monitors that are not scheduled
   * (manually-runnable) can be triggered this way.
   *
   * @param monitorId The ID of the data observability monitor to run. (required)
   * @return ApiResponse&lt;RunDataObservabilityMonitorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RunDataObservabilityMonitorResponse> runDataObservabilityMonitorWithHttpInfo(
      Long monitorId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "runDataObservabilityMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'monitorId' when calling runDataObservabilityMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-observability/monitors/{monitor_id}/run"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DataObservabilityApi.runDataObservabilityMonitor",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RunDataObservabilityMonitorResponse>() {});
  }

  /**
   * Run a data observability monitor.
   *
   * <p>See {@link #runDataObservabilityMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the data observability monitor to run. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RunDataObservabilityMonitorResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RunDataObservabilityMonitorResponse>>
      runDataObservabilityMonitorWithHttpInfoAsync(Long monitorId) {
    // Check if unstable operation is enabled
    String operationId = "runDataObservabilityMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RunDataObservabilityMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<RunDataObservabilityMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling"
                  + " runDataObservabilityMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-observability/monitors/{monitor_id}/run"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DataObservabilityApi.runDataObservabilityMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RunDataObservabilityMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RunDataObservabilityMonitorResponse>() {});
  }
}
