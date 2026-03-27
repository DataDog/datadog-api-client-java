package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumMetricCreateRequest;
import com.datadog.api.client.v2.model.RumMetricResponse;
import com.datadog.api.client.v2.model.RumMetricUpdateRequest;
import com.datadog.api.client.v2.model.RumMetricsResponse;
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
   * Create a rum-based metric.
   *
   * <p>See {@link #createRumMetricWithHttpInfo}.
   *
   * @param body The definition of the new rum-based metric. (required)
   * @return RumMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RumMetricResponse createRumMetric(RumMetricCreateRequest body) throws ApiException {
    return createRumMetricWithHttpInfo(body).getData();
  }

  /**
   * Create a rum-based metric.
   *
   * <p>See {@link #createRumMetricWithHttpInfoAsync}.
   *
   * @param body The definition of the new rum-based metric. (required)
   * @return CompletableFuture&lt;RumMetricResponse&gt;
   */
  public CompletableFuture<RumMetricResponse> createRumMetricAsync(RumMetricCreateRequest body) {
    return createRumMetricWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a metric based on your organization's RUM data. Returns the rum-based metric object from
   * the request body when the request is successful.
   *
   * @param body The definition of the new rum-based metric. (required)
   * @return ApiResponse&lt;RumMetricResponse&gt;
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
  public ApiResponse<RumMetricResponse> createRumMetricWithHttpInfo(RumMetricCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.createRumMetric",
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
        new GenericType<RumMetricResponse>() {});
  }

  /**
   * Create a rum-based metric.
   *
   * <p>See {@link #createRumMetricWithHttpInfo}.
   *
   * @param body The definition of the new rum-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumMetricResponse>> createRumMetricWithHttpInfoAsync(
      RumMetricCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRumMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.createRumMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumMetricResponse>() {});
  }

  /**
   * Delete a rum-based metric.
   *
   * <p>See {@link #deleteRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRumMetric(String metricId) throws ApiException {
    deleteRumMetricWithHttpInfo(metricId);
  }

  /**
   * Delete a rum-based metric.
   *
   * <p>See {@link #deleteRumMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRumMetricAsync(String metricId) {
    return deleteRumMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific rum-based metric from your organization.
   *
   * @param metricId The name of the rum-based metric. (required)
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
  public ApiResponse<Void> deleteRumMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling deleteRumMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.deleteRumMetric",
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
   * Delete a rum-based metric.
   *
   * <p>See {@link #deleteRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRumMetricWithHttpInfoAsync(String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling deleteRumMetric"));
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
              "v2.RumMetricsApi.deleteRumMetric",
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
   * Get a rum-based metric.
   *
   * <p>See {@link #getRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return RumMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RumMetricResponse getRumMetric(String metricId) throws ApiException {
    return getRumMetricWithHttpInfo(metricId).getData();
  }

  /**
   * Get a rum-based metric.
   *
   * <p>See {@link #getRumMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return CompletableFuture&lt;RumMetricResponse&gt;
   */
  public CompletableFuture<RumMetricResponse> getRumMetricAsync(String metricId) {
    return getRumMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific rum-based metric from your organization.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return ApiResponse&lt;RumMetricResponse&gt;
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
  public ApiResponse<RumMetricResponse> getRumMetricWithHttpInfo(String metricId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling getRumMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.getRumMetric",
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
        new GenericType<RumMetricResponse>() {});
  }

  /**
   * Get a rum-based metric.
   *
   * <p>See {@link #getRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumMetricResponse>> getRumMetricWithHttpInfoAsync(
      String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling getRumMetric"));
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
              "v2.RumMetricsApi.getRumMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumMetricResponse>() {});
  }

  /**
   * Get all rum-based metrics.
   *
   * <p>See {@link #listRumMetricsWithHttpInfo}.
   *
   * @return RumMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public RumMetricsResponse listRumMetrics() throws ApiException {
    return listRumMetricsWithHttpInfo().getData();
  }

  /**
   * Get all rum-based metrics.
   *
   * <p>See {@link #listRumMetricsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RumMetricsResponse&gt;
   */
  public CompletableFuture<RumMetricsResponse> listRumMetricsAsync() {
    return listRumMetricsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of configured rum-based metrics with their definitions.
   *
   * @return ApiResponse&lt;RumMetricsResponse&gt;
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
  public ApiResponse<RumMetricsResponse> listRumMetricsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.listRumMetrics",
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
        new GenericType<RumMetricsResponse>() {});
  }

  /**
   * Get all rum-based metrics.
   *
   * <p>See {@link #listRumMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RumMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumMetricsResponse>> listRumMetricsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumMetricsApi.listRumMetrics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumMetricsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumMetricsResponse>() {});
  }

  /**
   * Update a rum-based metric.
   *
   * <p>See {@link #updateRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @param body New definition of the rum-based metric. (required)
   * @return RumMetricResponse
   * @throws ApiException if fails to make API call
   */
  public RumMetricResponse updateRumMetric(String metricId, RumMetricUpdateRequest body)
      throws ApiException {
    return updateRumMetricWithHttpInfo(metricId, body).getData();
  }

  /**
   * Update a rum-based metric.
   *
   * <p>See {@link #updateRumMetricWithHttpInfoAsync}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @param body New definition of the rum-based metric. (required)
   * @return CompletableFuture&lt;RumMetricResponse&gt;
   */
  public CompletableFuture<RumMetricResponse> updateRumMetricAsync(
      String metricId, RumMetricUpdateRequest body) {
    return updateRumMetricWithHttpInfoAsync(metricId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific rum-based metric from your organization. Returns the rum-based metric object
   * from the request body when the request is successful.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @param body New definition of the rum-based metric. (required)
   * @return ApiResponse&lt;RumMetricResponse&gt;
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
  public ApiResponse<RumMetricResponse> updateRumMetricWithHttpInfo(
      String metricId, RumMetricUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling updateRumMetric");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumMetricsApi.updateRumMetric",
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
        new GenericType<RumMetricResponse>() {});
  }

  /**
   * Update a rum-based metric.
   *
   * <p>See {@link #updateRumMetricWithHttpInfo}.
   *
   * @param metricId The name of the rum-based metric. (required)
   * @param body New definition of the rum-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumMetricResponse>> updateRumMetricWithHttpInfoAsync(
      String metricId, RumMetricUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling updateRumMetric"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumMetric"));
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
              "v2.RumMetricsApi.updateRumMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumMetricResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumMetricResponse>() {});
  }
}
