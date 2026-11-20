package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMMetricCreateRequest;
import com.datadog.api.client.v2.model.RUMMetricResponse;
import com.datadog.api.client.v2.model.RUMMetricUpdateRequest;
import com.datadog.api.client.v2.model.RUMMetricsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumMetricsApi {
  private ApiClient apiClient;

  public RumMetricsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumMetricsApi(ApiClient apiClient) {
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
   * Create a RUM-based metric.
   *
   * <p>See {@link #createRUMMetricWithHttpInfo}.
   *
   * @param body The definition of the new RUM-based metric. (required)
   * @return RUMMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RUMMetricResponse createRUMMetric(RUMMetricCreateRequest body) throws ApiException {
    return createRUMMetricWithHttpInfo(body).getData();
  }

  /**
   * Create a RUM-based metric.
   *
   * <p>See {@link #createRUMMetricWithHttpInfoAsync}.
   *
   * @param body The definition of the new RUM-based metric. (required)
   * @return CompletableFuture&lt;RUMMetricResponse&gt;
   */
  public CompletableFuture<RUMMetricResponse> createRUMMetricAsync(RUMMetricCreateRequest body) {
    return createRUMMetricWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a metric based on your organization's RUM data. The metric name is set in <code>data.id
   * </code>, is unique within your organization, and cannot be changed after creation. The <code>
   * event_type</code>, <code>compute</code>, and <code>uniqueness</code> settings cannot be changed
   * after creation either. Only <code>filter</code>, <code>group_by</code>, and <code>
   * compute.include_percentiles</code> can be changed with <code>UpdateRUMMetric</code>. <code>
   * uniqueness</code> is required when <code>event_type</code> is <code>session</code> or <code>
   * view</code>, and must be omitted for any other event type. When <code>aggregation_type</code>
   * is <code>distribution</code>, <code>include_percentiles</code> is required. When it is <code>
   * count</code>, <code>include_percentiles</code> and <code>path</code> must be omitted. Returns
   * the created RUM-based metric when the request is successful. The request returns a <code>
   * 409 Conflict</code> error if a metric with the same name already exists.
   *
   * @param body The definition of the new RUM-based metric. (required)
   * @return ApiResponse&lt;RUMMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMMetricResponse> createRUMMetricWithHttpInfo(RUMMetricCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.createRUMMetric",
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
        new GenericType<RUMMetricResponse>() {});
  }

  /**
   * Create a RUM-based metric.
   *
   * <p>See {@link #createRUMMetricWithHttpInfo}.
   *
   * @param body The definition of the new RUM-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMMetricResponse>> createRUMMetricWithHttpInfoAsync(
      RUMMetricCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.createRUMMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMMetricResponse>() {});
  }

  /**
   * Delete a RUM-based metric.
   *
   * <p>See {@link #deleteRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMMetric(String metricId) throws ApiException {
    deleteRUMMetricWithHttpInfo(metricId);
  }

  /**
   * Delete a RUM-based metric.
   *
   * <p>See {@link #deleteRUMMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMMetricAsync(String metricId) {
    return deleteRUMMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific RUM-based metric from your organization. Metric data that was already
   * generated is not deleted. Deleting a metric cannot be undone.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling deleteRUMMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.deleteRUMMetric",
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
   * Delete a RUM-based metric.
   *
   * <p>See {@link #deleteRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMMetricWithHttpInfoAsync(String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling deleteRUMMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.deleteRUMMetric",
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

  /**
   * Get a RUM-based metric.
   *
   * <p>See {@link #getRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return RUMMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RUMMetricResponse getRUMMetric(String metricId) throws ApiException {
    return getRUMMetricWithHttpInfo(metricId).getData();
  }

  /**
   * Get a RUM-based metric.
   *
   * <p>See {@link #getRUMMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return CompletableFuture&lt;RUMMetricResponse&gt;
   */
  public CompletableFuture<RUMMetricResponse> getRUMMetricAsync(String metricId) {
    return getRUMMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific RUM-based metric from your organization. The <code>metric_id</code> is the
   * metric name returned in <code>data.id</code> by <code>ListRUMMetrics</code> and <code>
   * CreateRUMMetric</code>.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return ApiResponse&lt;RUMMetricResponse&gt;
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
  public ApiResponse<RUMMetricResponse> getRUMMetricWithHttpInfo(String metricId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling getRUMMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.getRUMMetric",
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
        new GenericType<RUMMetricResponse>() {});
  }

  /**
   * Get a RUM-based metric.
   *
   * <p>See {@link #getRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMMetricResponse>> getRUMMetricWithHttpInfoAsync(
      String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling getRUMMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.getRUMMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMMetricResponse>() {});
  }

  /**
   * Get all RUM-based metrics.
   *
   * <p>See {@link #listRUMMetricsWithHttpInfo}.
   *
   * @return RUMMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMMetricsResponse listRUMMetrics() throws ApiException {
    return listRUMMetricsWithHttpInfo().getData();
  }

  /**
   * Get all RUM-based metrics.
   *
   * <p>See {@link #listRUMMetricsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMMetricsResponse&gt;
   */
  public CompletableFuture<RUMMetricsResponse> listRUMMetricsAsync() {
    return listRUMMetricsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of all RUM-based metrics configured for your organization, with their definitions.
   * The list is not paginated. Metrics whose stored definition cannot be converted to the RUM
   * format are omitted from the list. To retrieve a single metric, use <code>GetRUMMetric</code>.
   *
   * @return ApiResponse&lt;RUMMetricsResponse&gt;
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
  public ApiResponse<RUMMetricsResponse> listRUMMetricsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.listRUMMetrics",
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
        new GenericType<RUMMetricsResponse>() {});
  }

  /**
   * Get all RUM-based metrics.
   *
   * <p>See {@link #listRUMMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RUMMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMMetricsResponse>> listRUMMetricsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.listRUMMetrics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMMetricsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMMetricsResponse>() {});
  }

  /**
   * Update a RUM-based metric.
   *
   * <p>See {@link #updateRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @param body New definition of the RUM-based metric. (required)
   * @return RUMMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RUMMetricResponse updateRUMMetric(String metricId, RUMMetricUpdateRequest body)
      throws ApiException {
    return updateRUMMetricWithHttpInfo(metricId, body).getData();
  }

  /**
   * Update a RUM-based metric.
   *
   * <p>See {@link #updateRUMMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @param body New definition of the RUM-based metric. (required)
   * @return CompletableFuture&lt;RUMMetricResponse&gt;
   */
  public CompletableFuture<RUMMetricResponse> updateRUMMetricAsync(
      String metricId, RUMMetricUpdateRequest body) {
    return updateRUMMetricWithHttpInfoAsync(metricId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific RUM-based metric from your organization. Only <code>filter</code>, <code>
   * group_by</code>, and <code>compute.include_percentiles</code> can be updated. <code>event_type
   * </code>, <code>uniqueness</code>, <code>compute.aggregation_type</code>, <code>compute.path
   * </code>, and the metric name are immutable. To change them, delete the metric and create a new
   * one. Omitted attributes keep their current value. When provided, <code>filter.query</code>
   * replaces the whole filter query (an empty query is ignored) and <code>group_by</code> replaces
   * the whole list of group by rules. <code>data.id</code> is required and must match the <code>
   * metric_id</code> path parameter, otherwise the request returns a <code>409 Conflict</code>
   * error. The request also returns a <code>409 Conflict</code> error when <code>
   * compute.include_percentiles</code> is set on a metric whose <code>aggregation_type</code> is
   * not <code>distribution</code>. Returns the updated RUM-based metric when the request is
   * successful.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @param body New definition of the RUM-based metric. (required)
   * @return ApiResponse&lt;RUMMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMMetricResponse> updateRUMMetricWithHttpInfo(
      String metricId, RUMMetricUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling updateRUMMetric");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.updateRUMMetric",
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
        new GenericType<RUMMetricResponse>() {});
  }

  /**
   * Update a RUM-based metric.
   *
   * <p>See {@link #updateRUMMetricWithHttpInfo}.
   *
   * @param metricId The name of the RUM-based metric, as returned in <code>data.id</code> by <code>
   *     ListRUMMetrics</code>. (required)
   * @param body New definition of the RUM-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMMetricResponse>> updateRUMMetricWithHttpInfoAsync(
      String metricId, RUMMetricUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling updateRUMMetric"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.updateRUMMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMMetricResponse>() {});
  }
}
