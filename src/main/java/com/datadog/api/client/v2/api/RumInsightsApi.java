package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AggregatedLongTasksRequest;
import com.datadog.api.client.v2.model.AggregatedLongTasksResponse;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsRequest;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsResponse;
import com.datadog.api.client.v2.model.AggregatedWaterfallRequest;
import com.datadog.api.client.v2.model.AggregatedWaterfallResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumInsightsApi {
  private ApiClient apiClient;

  public RumInsightsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumInsightsApi(ApiClient apiClient) {
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
   * Query aggregated long tasks.
   *
   * <p>See {@link #queryAggregatedLongTasksWithHttpInfo}.
   *
   * @param body (required)
   * @return AggregatedLongTasksResponse
   * @throws ApiException if fails to make API call
   */
  public AggregatedLongTasksResponse queryAggregatedLongTasks(AggregatedLongTasksRequest body)
      throws ApiException {
    return queryAggregatedLongTasksWithHttpInfo(body).getData();
  }

  /**
   * Query aggregated long tasks.
   *
   * <p>See {@link #queryAggregatedLongTasksWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AggregatedLongTasksResponse&gt;
   */
  public CompletableFuture<AggregatedLongTasksResponse> queryAggregatedLongTasksAsync(
      AggregatedLongTasksRequest body) {
    return queryAggregatedLongTasksWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get aggregated long task data for a RUM view, grouped by invoker type and sampled across
   * multiple view instances.
   *
   * @param body (required)
   * @return ApiResponse&lt;AggregatedLongTasksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AggregatedLongTasksResponse> queryAggregatedLongTasksWithHttpInfo(
      AggregatedLongTasksRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedLongTasks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryAggregatedLongTasks");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_long_tasks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumInsightsApi.queryAggregatedLongTasks",
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
        new GenericType<AggregatedLongTasksResponse>() {});
  }

  /**
   * Query aggregated long tasks.
   *
   * <p>See {@link #queryAggregatedLongTasksWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AggregatedLongTasksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AggregatedLongTasksResponse>>
      queryAggregatedLongTasksWithHttpInfoAsync(AggregatedLongTasksRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedLongTasks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AggregatedLongTasksResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AggregatedLongTasksResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryAggregatedLongTasks"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_long_tasks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumInsightsApi.queryAggregatedLongTasks",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AggregatedLongTasksResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AggregatedLongTasksResponse>() {});
  }

  /**
   * Query aggregated signals and problems.
   *
   * <p>See {@link #queryAggregatedSignalsProblemsWithHttpInfo}.
   *
   * @param body (required)
   * @return AggregatedSignalsProblemsResponse
   * @throws ApiException if fails to make API call
   */
  public AggregatedSignalsProblemsResponse queryAggregatedSignalsProblems(
      AggregatedSignalsProblemsRequest body) throws ApiException {
    return queryAggregatedSignalsProblemsWithHttpInfo(body).getData();
  }

  /**
   * Query aggregated signals and problems.
   *
   * <p>See {@link #queryAggregatedSignalsProblemsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AggregatedSignalsProblemsResponse&gt;
   */
  public CompletableFuture<AggregatedSignalsProblemsResponse> queryAggregatedSignalsProblemsAsync(
      AggregatedSignalsProblemsRequest body) {
    return queryAggregatedSignalsProblemsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get aggregated performance signals and problem detections for a RUM view, sampled across
   * multiple view instances.
   *
   * @param body (required)
   * @return ApiResponse&lt;AggregatedSignalsProblemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AggregatedSignalsProblemsResponse> queryAggregatedSignalsProblemsWithHttpInfo(
      AggregatedSignalsProblemsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedSignalsProblems";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryAggregatedSignalsProblems");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_signals_problems";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumInsightsApi.queryAggregatedSignalsProblems",
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
        new GenericType<AggregatedSignalsProblemsResponse>() {});
  }

  /**
   * Query aggregated signals and problems.
   *
   * <p>See {@link #queryAggregatedSignalsProblemsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AggregatedSignalsProblemsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AggregatedSignalsProblemsResponse>>
      queryAggregatedSignalsProblemsWithHttpInfoAsync(AggregatedSignalsProblemsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedSignalsProblems";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AggregatedSignalsProblemsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AggregatedSignalsProblemsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling queryAggregatedSignalsProblems"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_signals_problems";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumInsightsApi.queryAggregatedSignalsProblems",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AggregatedSignalsProblemsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AggregatedSignalsProblemsResponse>() {});
  }

  /**
   * Query aggregated waterfall.
   *
   * <p>See {@link #queryAggregatedWaterfallWithHttpInfo}.
   *
   * @param body (required)
   * @return AggregatedWaterfallResponse
   * @throws ApiException if fails to make API call
   */
  public AggregatedWaterfallResponse queryAggregatedWaterfall(AggregatedWaterfallRequest body)
      throws ApiException {
    return queryAggregatedWaterfallWithHttpInfo(body).getData();
  }

  /**
   * Query aggregated waterfall.
   *
   * <p>See {@link #queryAggregatedWaterfallWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AggregatedWaterfallResponse&gt;
   */
  public CompletableFuture<AggregatedWaterfallResponse> queryAggregatedWaterfallAsync(
      AggregatedWaterfallRequest body) {
    return queryAggregatedWaterfallWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get aggregated network resource waterfall data for a RUM view, sampled across multiple view
   * instances.
   *
   * @param body (required)
   * @return ApiResponse&lt;AggregatedWaterfallResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AggregatedWaterfallResponse> queryAggregatedWaterfallWithHttpInfo(
      AggregatedWaterfallRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedWaterfall";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryAggregatedWaterfall");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_waterfall";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumInsightsApi.queryAggregatedWaterfall",
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
        new GenericType<AggregatedWaterfallResponse>() {});
  }

  /**
   * Query aggregated waterfall.
   *
   * <p>See {@link #queryAggregatedWaterfallWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AggregatedWaterfallResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AggregatedWaterfallResponse>>
      queryAggregatedWaterfallWithHttpInfoAsync(AggregatedWaterfallRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryAggregatedWaterfall";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AggregatedWaterfallResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AggregatedWaterfallResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryAggregatedWaterfall"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/query/insight/aggregated_waterfall";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumInsightsApi.queryAggregatedWaterfall",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AggregatedWaterfallResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AggregatedWaterfallResponse>() {});
  }
}
