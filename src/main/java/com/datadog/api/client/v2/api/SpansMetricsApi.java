
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.SpansMetricsResponse;
import com.datadog.api.client.v2.model.SpansMetricResponse;
import com.datadog.api.client.v2.model.SpansMetricCreateRequest;
import com.datadog.api.client.v2.model.SpansMetricUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricsApi {
  private ApiClient apiClient;
  public SpansMetricsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SpansMetricsApi(ApiClient apiClient) {
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
 * Create a span-based metric.
 *
 * See {@link #createSpansMetricWithHttpInfo}.
 *
 * @param body The definition of the new span-based metric. (required)
 * @return SpansMetricResponse
 * @throws ApiException if fails to make API call
 */
  public SpansMetricResponse  createSpansMetric(SpansMetricCreateRequest body) throws ApiException {
    return createSpansMetricWithHttpInfo(body).getData();
  }

  /**
 * Create a span-based metric.
 *
 * See {@link #createSpansMetricWithHttpInfoAsync}.
 *
 * @param body The definition of the new span-based metric. (required)
 * @return CompletableFuture&lt;SpansMetricResponse&gt;
 */
  public CompletableFuture<SpansMetricResponse>createSpansMetricAsync(SpansMetricCreateRequest body) {
    return createSpansMetricWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a metric based on your ingested spans in your organization.
   * Returns the span-based metric object from the request body when the request is successful.</p>
   *
   * @param body The definition of the new span-based metric. (required)
   * @return ApiResponse&lt;SpansMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansMetricResponse> createSpansMetricWithHttpInfo(SpansMetricCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSpansMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansMetricsApi.createSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }

  /**
   * Create a span-based metric.
   *
   * See {@link #createSpansMetricWithHttpInfo}.
   *
   * @param body The definition of the new span-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SpansMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansMetricResponse>> createSpansMetricWithHttpInfoAsync(SpansMetricCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSpansMetric"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansMetricsApi.createSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }

  /**
 * Delete a span-based metric.
 *
 * See {@link #deleteSpansMetricWithHttpInfo}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteSpansMetric(String metricId) throws ApiException {
    deleteSpansMetricWithHttpInfo(metricId);
  }

  /**
 * Delete a span-based metric.
 *
 * See {@link #deleteSpansMetricWithHttpInfoAsync}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteSpansMetricAsync(String metricId) {
    return deleteSpansMetricWithHttpInfoAsync(metricId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific span-based metric from your organization.</p>
   *
   * @param metricId The name of the span-based metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSpansMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling deleteSpansMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansMetricsApi.deleteSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a span-based metric.
   *
   * See {@link #deleteSpansMetricWithHttpInfo}.
   *
   * @param metricId The name of the span-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSpansMetricWithHttpInfoAsync(String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'metricId' when calling deleteSpansMetric"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansMetricsApi.deleteSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a span-based metric.
 *
 * See {@link #getSpansMetricWithHttpInfo}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @return SpansMetricResponse
 * @throws ApiException if fails to make API call
 */
  public SpansMetricResponse  getSpansMetric(String metricId) throws ApiException {
    return getSpansMetricWithHttpInfo(metricId).getData();
  }

  /**
 * Get a span-based metric.
 *
 * See {@link #getSpansMetricWithHttpInfoAsync}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @return CompletableFuture&lt;SpansMetricResponse&gt;
 */
  public CompletableFuture<SpansMetricResponse>getSpansMetricAsync(String metricId) {
    return getSpansMetricWithHttpInfoAsync(metricId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific span-based metric from your organization.</p>
   *
   * @param metricId The name of the span-based metric. (required)
   * @return ApiResponse&lt;SpansMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansMetricResponse> getSpansMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling getSpansMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansMetricsApi.getSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }

  /**
   * Get a span-based metric.
   *
   * See {@link #getSpansMetricWithHttpInfo}.
   *
   * @param metricId The name of the span-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SpansMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansMetricResponse>> getSpansMetricWithHttpInfoAsync(String metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
        CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'metricId' when calling getSpansMetric"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansMetricsApi.getSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }

  /**
 * Get all span-based metrics.
 *
 * See {@link #listSpansMetricsWithHttpInfo}.
 *
 * @return SpansMetricsResponse
 * @throws ApiException if fails to make API call
 */
  public SpansMetricsResponse  listSpansMetrics() throws ApiException {
    return listSpansMetricsWithHttpInfo().getData();
  }

  /**
 * Get all span-based metrics.
 *
 * See {@link #listSpansMetricsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SpansMetricsResponse&gt;
 */
  public CompletableFuture<SpansMetricsResponse>listSpansMetricsAsync() {
    return listSpansMetricsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of configured span-based metrics with their definitions.</p>
   *
   * @return ApiResponse&lt;SpansMetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansMetricsResponse> listSpansMetricsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansMetricsApi.listSpansMetrics", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricsResponse>() {});
  }

  /**
   * Get all span-based metrics.
   *
   * See {@link #listSpansMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SpansMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansMetricsResponse>> listSpansMetricsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansMetricsApi.listSpansMetrics", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansMetricsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricsResponse>() {});
  }

  /**
 * Update a span-based metric.
 *
 * See {@link #updateSpansMetricWithHttpInfo}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @param body New definition of the span-based metric. (required)
 * @return SpansMetricResponse
 * @throws ApiException if fails to make API call
 */
  public SpansMetricResponse  updateSpansMetric(String metricId, SpansMetricUpdateRequest body) throws ApiException {
    return updateSpansMetricWithHttpInfo(metricId, body).getData();
  }

  /**
 * Update a span-based metric.
 *
 * See {@link #updateSpansMetricWithHttpInfoAsync}.
 *
 * @param metricId The name of the span-based metric. (required)
 * @param body New definition of the span-based metric. (required)
 * @return CompletableFuture&lt;SpansMetricResponse&gt;
 */
  public CompletableFuture<SpansMetricResponse>updateSpansMetricAsync(String metricId, SpansMetricUpdateRequest body) {
    return updateSpansMetricWithHttpInfoAsync(metricId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a specific span-based metric from your organization.
   * Returns the span-based metric object from the request body when the request is successful.</p>
   *
   * @param metricId The name of the span-based metric. (required)
   * @param body New definition of the span-based metric. (required)
   * @return ApiResponse&lt;SpansMetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansMetricResponse> updateSpansMetricWithHttpInfo(String metricId, SpansMetricUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling updateSpansMetric");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSpansMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansMetricsApi.updateSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }

  /**
   * Update a span-based metric.
   *
   * See {@link #updateSpansMetricWithHttpInfo}.
   *
   * @param metricId The name of the span-based metric. (required)
   * @param body New definition of the span-based metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SpansMetricResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansMetricResponse>> updateSpansMetricWithHttpInfoAsync(String metricId, SpansMetricUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
        CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'metricId' when calling updateSpansMetric"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateSpansMetric"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansMetricsApi.updateSpansMetric", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansMetricResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansMetricResponse>() {});
  }
}