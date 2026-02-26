package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.LogsMetricCreateRequest;
import com.datadog.api.client.v2.model.LogsMetricResponse;
import com.datadog.api.client.v2.model.LogsMetricUpdateRequest;
import com.datadog.api.client.v2.model.LogsMetricsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricsApi {
  private ApiClient apiClient;

  public LogsMetricsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsMetricsApi(ApiClient apiClient) {
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
   * Create a log-based metric.
   *
   * <p>See {@link #createLogsMetricWithHttpInfo}.
   *
   * @param body The definition of the new log-based metric. (required)
   * @return LogsMetricResponse
   * @throws ApiException if fails to make API call
   */
  public LogsMetricResponse createLogsMetric(LogsMetricCreateRequest body) throws ApiException {
    return createLogsMetricWithHttpInfo(body).getData();
  }

  /**
   * Create a log-based metric.
   *
   * <p>See {@link #createLogsMetricWithHttpInfoAsync}.
   *
   * @param body The definition of the new log-based metric. (required)
   * @return CompletableFuture&lt;LogsMetricResponse&gt;
   */
  public CompletableFuture<LogsMetricResponse> createLogsMetricAsync(LogsMetricCreateRequest body) {
    return createLogsMetricWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a metric based on your ingested logs in your organization. Returns the log-based metric
   * object from the request body when the request is successful.
   *
   * @param body The definition of the new log-based metric. (required)
   * @return ApiResponse&lt;LogsMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsMetricResponse> createLogsMetricWithHttpInfo(LogsMetricCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLogsMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsMetricsApi.createLogsMetric",
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
        new GenericType<LogsMetricResponse>() {});
  }

  /**
   * Create a log-based metric.
   *
   * <p>See {@link #createLogsMetricWithHttpInfo}.
   *
   * @param body The definition of the new log-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsMetricResponse>> createLogsMetricWithHttpInfoAsync(
      LogsMetricCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLogsMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsMetricsApi.createLogsMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsMetricResponse>() {});
  }

  /**
   * Delete a log-based metric.
   *
   * <p>See {@link #deleteLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLogsMetric(String metricId) throws ApiException {
    deleteLogsMetricWithHttpInfo(metricId);
  }

  /**
   * Delete a log-based metric.
   *
   * <p>See {@link #deleteLogsMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLogsMetricAsync(String metricId) {
    return deleteLogsMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific log-based metric from your organization.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLogsMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling deleteLogsMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsMetricsApi.deleteLogsMetric",
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
   * Delete a log-based metric.
   *
   * <p>See {@link #deleteLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLogsMetricWithHttpInfoAsync(String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling deleteLogsMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsMetricsApi.deleteLogsMetric",
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
   * Get a log-based metric.
   *
   * <p>See {@link #getLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return LogsMetricResponse
   * @throws ApiException if fails to make API call
   */
  public LogsMetricResponse getLogsMetric(String metricId) throws ApiException {
    return getLogsMetricWithHttpInfo(metricId).getData();
  }

  /**
   * Get a log-based metric.
   *
   * <p>See {@link #getLogsMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return CompletableFuture&lt;LogsMetricResponse&gt;
   */
  public CompletableFuture<LogsMetricResponse> getLogsMetricAsync(String metricId) {
    return getLogsMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific log-based metric from your organization.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return ApiResponse&lt;LogsMetricResponse&gt;
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
  public ApiResponse<LogsMetricResponse> getLogsMetricWithHttpInfo(String metricId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling getLogsMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsMetricsApi.getLogsMetric",
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
        new GenericType<LogsMetricResponse>() {});
  }

  /**
   * Get a log-based metric.
   *
   * <p>See {@link #getLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsMetricResponse>> getLogsMetricWithHttpInfoAsync(
      String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling getLogsMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsMetricsApi.getLogsMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsMetricResponse>() {});
  }

  /**
   * Get all log-based metrics.
   *
   * <p>See {@link #listLogsMetricsWithHttpInfo}.
   *
   * @return LogsMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public LogsMetricsResponse listLogsMetrics() throws ApiException {
    return listLogsMetricsWithHttpInfo().getData();
  }

  /**
   * Get all log-based metrics.
   *
   * <p>See {@link #listLogsMetricsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsMetricsResponse&gt;
   */
  public CompletableFuture<LogsMetricsResponse> listLogsMetricsAsync() {
    return listLogsMetricsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of configured log-based metrics with their definitions.
   *
   * @return ApiResponse&lt;LogsMetricsResponse&gt;
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
  public ApiResponse<LogsMetricsResponse> listLogsMetricsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsMetricsApi.listLogsMetrics",
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
        new GenericType<LogsMetricsResponse>() {});
  }

  /**
   * Get all log-based metrics.
   *
   * <p>See {@link #listLogsMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsMetricsResponse>> listLogsMetricsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsMetricsApi.listLogsMetrics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsMetricsResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsMetricsResponse>() {});
  }

  /**
   * Update a log-based metric.
   *
   * <p>See {@link #updateLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @param body New definition of the log-based metric. (required)
   * @return LogsMetricResponse
   * @throws ApiException if fails to make API call
   */
  public LogsMetricResponse updateLogsMetric(String metricId, LogsMetricUpdateRequest body)
      throws ApiException {
    return updateLogsMetricWithHttpInfo(metricId, body).getData();
  }

  /**
   * Update a log-based metric.
   *
   * <p>See {@link #updateLogsMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @param body New definition of the log-based metric. (required)
   * @return CompletableFuture&lt;LogsMetricResponse&gt;
   */
  public CompletableFuture<LogsMetricResponse> updateLogsMetricAsync(
      String metricId, LogsMetricUpdateRequest body) {
    return updateLogsMetricWithHttpInfoAsync(metricId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific log-based metric from your organization. Returns the log-based metric object
   * from the request body when the request is successful.
   *
   * @param metricId The name of the log-based metric. (required)
   * @param body New definition of the log-based metric. (required)
   * @return ApiResponse&lt;LogsMetricResponse&gt;
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
  public ApiResponse<LogsMetricResponse> updateLogsMetricWithHttpInfo(
      String metricId, LogsMetricUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling updateLogsMetric");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsMetricsApi.updateLogsMetric",
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
        new GenericType<LogsMetricResponse>() {});
  }

  /**
   * Update a log-based metric.
   *
   * <p>See {@link #updateLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @param body New definition of the log-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsMetricResponse>> updateLogsMetricWithHttpInfoAsync(
      String metricId, LogsMetricUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling updateLogsMetric"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsMetricsApi.updateLogsMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsMetricResponse>() {});
  }
}
