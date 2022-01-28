package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.LogsMetricCreateRequest;
import com.datadog.api.v2.client.model.LogsMetricResponse;
import com.datadog.api.v2.client.model.LogsMetricUpdateRequest;
import com.datadog.api.v2.client.model.LogsMetricsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsMetricsApi {
  private ApiClient apiClient;

  public LogsMetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsMetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a log-based metric
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

  public CompletableFuture<LogsMetricResponse> createLogsMetricAsync(LogsMetricCreateRequest body) {
    return createLogsMetricWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a log-based metric
   *
   * <p>Create a metric based on your ingested logs in your organization. Returns the log-based
   * metric object from the request body when the request is successful.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI(
        "LogsMetricsApi.createLogsMetric",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create a log-based metric
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPIAsync(
        "LogsMetricsApi.createLogsMetric",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete a log-based metric
   *
   * <p>See {@link #deleteLogsMetricWithHttpInfo}.
   *
   * @param metricId The name of the log-based metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLogsMetric(String metricId) throws ApiException {
    deleteLogsMetricWithHttpInfo(metricId);
  }

  public CompletableFuture<Void> deleteLogsMetricAsync(String metricId) {
    return deleteLogsMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a log-based metric
   *
   * <p>Delete a specific log-based metric from your organization.
   *
   * @param metricId The name of the log-based metric. (required)
   * @return ApiResponse&lt;Void&gt;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "LogsMetricsApi.deleteLogsMetric",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Delete a log-based metric
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "LogsMetricsApi.deleteLogsMetric",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Get a log-based metric
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

  public CompletableFuture<LogsMetricResponse> getLogsMetricAsync(String metricId) {
    return getLogsMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a log-based metric
   *
   * <p>Get a specific log-based metric from your organization.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI(
        "LogsMetricsApi.getLogsMetric",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get a log-based metric
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPIAsync(
        "LogsMetricsApi.getLogsMetric",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get all log-based metrics
   *
   * <p>See {@link #listLogsMetricsWithHttpInfo}.
   *
   * @return LogsMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public LogsMetricsResponse listLogsMetrics() throws ApiException {
    return listLogsMetricsWithHttpInfo().getData();
  }

  public CompletableFuture<LogsMetricsResponse> listLogsMetricsAsync() {
    return listLogsMetricsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all log-based metrics
   *
   * <p>Get the list of configured log-based metrics with their definitions.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsMetrics");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricsResponse> localVarReturnType = new GenericType<LogsMetricsResponse>() {};

    return apiClient.invokeAPI(
        "LogsMetricsApi.listLogsMetrics",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get all log-based metrics
   *
   * <p>See {@link #listLogsMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsMetricsResponse>> listLogsMetricsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsMetrics");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricsResponse> localVarReturnType = new GenericType<LogsMetricsResponse>() {};

    return apiClient.invokeAPIAsync(
        "LogsMetricsApi.listLogsMetrics",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update a log-based metric
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

  public CompletableFuture<LogsMetricResponse> updateLogsMetricAsync(
      String metricId, LogsMetricUpdateRequest body) {
    return updateLogsMetricWithHttpInfoAsync(metricId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a log-based metric
   *
   * <p>Update a specific log-based metric from your organization. Returns the log-based metric
   * object from the request body when the request is successful.
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI(
        "LogsMetricsApi.updateLogsMetric",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update a log-based metric
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsMetric");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPIAsync(
        "LogsMetricsApi.updateLogsMetric",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
