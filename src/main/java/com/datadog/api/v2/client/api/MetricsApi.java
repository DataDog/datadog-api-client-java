package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.MetricAllTagsResponse;
import com.datadog.api.v2.client.model.MetricBulkTagConfigCreateRequest;
import com.datadog.api.v2.client.model.MetricBulkTagConfigDeleteRequest;
import com.datadog.api.v2.client.model.MetricBulkTagConfigResponse;
import com.datadog.api.v2.client.model.MetricTagConfigurationCreateRequest;
import com.datadog.api.v2.client.model.MetricTagConfigurationMetricTypes;
import com.datadog.api.v2.client.model.MetricTagConfigurationResponse;
import com.datadog.api.v2.client.model.MetricTagConfigurationUpdateRequest;
import com.datadog.api.v2.client.model.MetricVolumesResponse;
import com.datadog.api.v2.client.model.MetricsAndMetricTagConfigurationsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
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
   * Configure tags for multiple metrics
   *
   * <p>See {@link #createBulkTagsMetricsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return MetricBulkTagConfigResponse
   * @throws ApiException if fails to make API call
   */
  public MetricBulkTagConfigResponse createBulkTagsMetricsConfiguration(
      MetricBulkTagConfigCreateRequest body) throws ApiException {
    return createBulkTagsMetricsConfigurationWithHttpInfo(body).getData();
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>See {@link #createBulkTagsMetricsConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;MetricBulkTagConfigResponse&gt;
   */
  public CompletableFuture<MetricBulkTagConfigResponse> createBulkTagsMetricsConfigurationAsync(
      MetricBulkTagConfigCreateRequest body) {
    return createBulkTagsMetricsConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>Create and define a list of queryable tag keys for a set of existing count, gauge, rate, and
   * distribution metrics. Metrics are selected by passing a metric name prefix. Use the Delete
   * method of this API path to remove tag configurations. Results can be sent to a set of account
   * email addresses, just like the same operation in the Datadog web app. If multiple calls include
   * the same metric, the last configuration applied (not by submit order) is used, do not expect
   * deterministic ordering of concurrent calls. Can only be used with application keys of users
   * with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;MetricBulkTagConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricBulkTagConfigResponse> createBulkTagsMetricsConfigurationWithHttpInfo(
      MetricBulkTagConfigCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createBulkTagsMetricsConfiguration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/config/bulk-tags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.createBulkTagsMetricsConfiguration",
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
        new GenericType<MetricBulkTagConfigResponse>() {});
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>See {@link #createBulkTagsMetricsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricBulkTagConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>>
      createBulkTagsMetricsConfigurationWithHttpInfoAsync(MetricBulkTagConfigCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createBulkTagsMetricsConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/config/bulk-tags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createBulkTagsMetricsConfiguration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.createBulkTagsMetricsConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>> result =
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
        new GenericType<MetricBulkTagConfigResponse>() {});
  }

  /**
   * Create a tag configuration
   *
   * <p>See {@link #createTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public MetricTagConfigurationResponse createTagConfiguration(
      String metricName, MetricTagConfigurationCreateRequest body) throws ApiException {
    return createTagConfigurationWithHttpInfo(metricName, body).getData();
  }

  /**
   * Create a tag configuration
   *
   * <p>See {@link #createTagConfigurationWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;MetricTagConfigurationResponse&gt;
   */
  public CompletableFuture<MetricTagConfigurationResponse> createTagConfigurationAsync(
      String metricName, MetricTagConfigurationCreateRequest body) {
    return createTagConfigurationWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a tag configuration
   *
   * <p>Create and define a list of queryable tag keys for an existing count/gauge/rate/distribution
   * metric. Optionally, include percentile aggregations on any distribution metric or configure
   * custom aggregations on any count, rate, or gauge metric. Can only be used with application keys
   * of users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricTagConfigurationResponse> createTagConfigurationWithHttpInfo(
      String metricName, MetricTagConfigurationCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling createTagConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.createTagConfiguration",
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /**
   * Create a tag configuration
   *
   * <p>See {@link #createTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricTagConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricTagConfigurationResponse>>
      createTagConfigurationWithHttpInfoAsync(
          String metricName, MetricTagConfigurationCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling createTagConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTagConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createTagConfiguration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.createTagConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>See {@link #deleteBulkTagsMetricsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return MetricBulkTagConfigResponse
   * @throws ApiException if fails to make API call
   */
  public MetricBulkTagConfigResponse deleteBulkTagsMetricsConfiguration(
      MetricBulkTagConfigDeleteRequest body) throws ApiException {
    return deleteBulkTagsMetricsConfigurationWithHttpInfo(body).getData();
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>See {@link #deleteBulkTagsMetricsConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;MetricBulkTagConfigResponse&gt;
   */
  public CompletableFuture<MetricBulkTagConfigResponse> deleteBulkTagsMetricsConfigurationAsync(
      MetricBulkTagConfigDeleteRequest body) {
    return deleteBulkTagsMetricsConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>Delete all custom lists of queryable tag keys for a set of existing count, gauge, rate, and
   * distribution metrics. Metrics are selected by passing a metric name prefix. Results can be sent
   * to a set of account email addresses, just like the same operation in the Datadog web app. Can
   * only be used with application keys of users with the &#x60;Manage Tags for Metrics&#x60;
   * permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;MetricBulkTagConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricBulkTagConfigResponse> deleteBulkTagsMetricsConfigurationWithHttpInfo(
      MetricBulkTagConfigDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling deleteBulkTagsMetricsConfiguration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/config/bulk-tags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.deleteBulkTagsMetricsConfiguration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricBulkTagConfigResponse>() {});
  }

  /**
   * Configure tags for multiple metrics
   *
   * <p>See {@link #deleteBulkTagsMetricsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricBulkTagConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>>
      deleteBulkTagsMetricsConfigurationWithHttpInfoAsync(MetricBulkTagConfigDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " deleteBulkTagsMetricsConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/config/bulk-tags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteBulkTagsMetricsConfiguration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.deleteBulkTagsMetricsConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricBulkTagConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricBulkTagConfigResponse>() {});
  }

  /**
   * Delete a tag configuration
   *
   * <p>See {@link #deleteTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagConfiguration(String metricName) throws ApiException {
    deleteTagConfigurationWithHttpInfo(metricName);
  }

  /**
   * Delete a tag configuration
   *
   * <p>See {@link #deleteTagConfigurationWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   */
  public CompletableFuture<Void> deleteTagConfigurationAsync(String metricName) {
    return deleteTagConfigurationWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag configuration
   *
   * <p>Deletes a metric&#39;s tag configuration. Can only be used with application keys from users
   * with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTagConfigurationWithHttpInfo(String metricName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling deleteTagConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.deleteTagConfiguration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
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
   * Delete a tag configuration
   *
   * <p>See {@link #deleteTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagConfigurationWithHttpInfoAsync(
      String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling deleteTagConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteTagConfiguration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.deleteTagConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
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
   * List tag configuration by name
   *
   * <p>See {@link #listTagConfigurationByNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public MetricTagConfigurationResponse listTagConfigurationByName(String metricName)
      throws ApiException {
    return listTagConfigurationByNameWithHttpInfo(metricName).getData();
  }

  /**
   * List tag configuration by name
   *
   * <p>See {@link #listTagConfigurationByNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricTagConfigurationResponse&gt;
   */
  public CompletableFuture<MetricTagConfigurationResponse> listTagConfigurationByNameAsync(
      String metricName) {
    return listTagConfigurationByNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag configuration by name
   *
   * <p>Returns the tag configuration for the given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricTagConfigurationResponse> listTagConfigurationByNameWithHttpInfo(
      String metricName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling listTagConfigurationByName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.listTagConfigurationByName",
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /**
   * List tag configuration by name
   *
   * <p>See {@link #listTagConfigurationByNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricTagConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricTagConfigurationResponse>>
      listTagConfigurationByNameWithHttpInfoAsync(String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " listTagConfigurationByName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagConfigurationByName");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.listTagConfigurationByName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /** Manage optional parameters to listTagConfigurations. */
  public static class ListTagConfigurationsOptionalParameters {
    private Boolean filterConfigured;
    private String filterTagsConfigured;
    private MetricTagConfigurationMetricTypes filterMetricType;
    private Boolean filterIncludePercentiles;
    private String filterTags;
    private Long windowSeconds;

    /**
     * Set filterConfigured
     *
     * @param filterConfigured Filter metrics that have configured tags. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterConfigured(Boolean filterConfigured) {
      this.filterConfigured = filterConfigured;
      return this;
    }

    /**
     * Set filterTagsConfigured
     *
     * @param filterTagsConfigured Filter tag configurations by configured tags. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterTagsConfigured(
        String filterTagsConfigured) {
      this.filterTagsConfigured = filterTagsConfigured;
      return this;
    }

    /**
     * Set filterMetricType
     *
     * @param filterMetricType Filter tag configurations by metric type. (optional, default to
     *     gauge)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterMetricType(
        MetricTagConfigurationMetricTypes filterMetricType) {
      this.filterMetricType = filterMetricType;
      return this;
    }

    /**
     * Set filterIncludePercentiles
     *
     * @param filterIncludePercentiles Filter distributions with additional percentile aggregations
     *     enabled or disabled. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterIncludePercentiles(
        Boolean filterIncludePercentiles) {
      this.filterIncludePercentiles = filterIncludePercentiles;
      return this;
    }

    /**
     * Set filterTags
     *
     * @param filterTags Filter metrics that have been submitted with the given tags. Supports
     *     boolean and wildcard expressions. Cannot be combined with other filters. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set windowSeconds
     *
     * @param windowSeconds The number of seconds of look back (from now) to apply to a filter[tag]
     *     query. Defaults value is 3600 (1 hour), maximum value is 172,800 (2 days). (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }
  }

  /**
   * List tag configurations
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @return MetricsAndMetricTagConfigurationsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricsAndMetricTagConfigurationsResponse listTagConfigurations() throws ApiException {
    return listTagConfigurationsWithHttpInfo(new ListTagConfigurationsOptionalParameters())
        .getData();
  }

  /**
   * List tag configurations
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;MetricsAndMetricTagConfigurationsResponse&gt;
   */
  public CompletableFuture<MetricsAndMetricTagConfigurationsResponse> listTagConfigurationsAsync() {
    return listTagConfigurationsWithHttpInfoAsync(new ListTagConfigurationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag configurations
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return MetricsAndMetricTagConfigurationsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricsAndMetricTagConfigurationsResponse listTagConfigurations(
      ListTagConfigurationsOptionalParameters parameters) throws ApiException {
    return listTagConfigurationsWithHttpInfo(parameters).getData();
  }

  /**
   * List tag configurations
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricsAndMetricTagConfigurationsResponse&gt;
   */
  public CompletableFuture<MetricsAndMetricTagConfigurationsResponse> listTagConfigurationsAsync(
      ListTagConfigurationsOptionalParameters parameters) {
    return listTagConfigurationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag configurations
   *
   * <p>Returns all configured count/gauge/rate/distribution metric names (with additional filters
   * if specified).
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricsAndMetricTagConfigurationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricsAndMetricTagConfigurationsResponse> listTagConfigurationsWithHttpInfo(
      ListTagConfigurationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean filterConfigured = parameters.filterConfigured;
    String filterTagsConfigured = parameters.filterTagsConfigured;
    MetricTagConfigurationMetricTypes filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    String filterTags = parameters.filterTags;
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath = "/api/v2/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[configured]", filterConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[tags_configured]", filterTagsConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[metric_type]", filterMetricType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_percentiles]", filterIncludePercentiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.listTagConfigurations",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricsAndMetricTagConfigurationsResponse>() {});
  }

  /**
   * List tag configurations
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricsAndMetricTagConfigurationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricsAndMetricTagConfigurationsResponse>>
      listTagConfigurationsWithHttpInfoAsync(ListTagConfigurationsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean filterConfigured = parameters.filterConfigured;
    String filterTagsConfigured = parameters.filterTagsConfigured;
    MetricTagConfigurationMetricTypes filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    String filterTags = parameters.filterTags;
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath = "/api/v2/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[configured]", filterConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[tags_configured]", filterTagsConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[metric_type]", filterMetricType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_percentiles]", filterIncludePercentiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagConfigurations");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.listTagConfigurations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricsAndMetricTagConfigurationsResponse>> result =
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
        new GenericType<MetricsAndMetricTagConfigurationsResponse>() {});
  }

  /**
   * List tags by metric name
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricAllTagsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricAllTagsResponse listTagsByMetricName(String metricName) throws ApiException {
    return listTagsByMetricNameWithHttpInfo(metricName).getData();
  }

  /**
   * List tags by metric name
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricAllTagsResponse&gt;
   */
  public CompletableFuture<MetricAllTagsResponse> listTagsByMetricNameAsync(String metricName) {
    return listTagsByMetricNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tags by metric name
   *
   * <p>View indexed tag key-value pairs for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricAllTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricAllTagsResponse> listTagsByMetricNameWithHttpInfo(String metricName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling listTagsByMetricName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/all-tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.listTagsByMetricName",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricAllTagsResponse>() {});
  }

  /**
   * List tags by metric name
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricAllTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricAllTagsResponse>>
      listTagsByMetricNameWithHttpInfoAsync(String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricAllTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling listTagsByMetricName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/all-tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagsByMetricName");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.listTagsByMetricName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricAllTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricAllTagsResponse>() {});
  }

  /**
   * List distinct metric volumes by metric name
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricVolumesResponse
   * @throws ApiException if fails to make API call
   */
  public MetricVolumesResponse listVolumesByMetricName(String metricName) throws ApiException {
    return listVolumesByMetricNameWithHttpInfo(metricName).getData();
  }

  /**
   * List distinct metric volumes by metric name
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricVolumesResponse&gt;
   */
  public CompletableFuture<MetricVolumesResponse> listVolumesByMetricNameAsync(String metricName) {
    return listVolumesByMetricNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List distinct metric volumes by metric name
   *
   * <p>View distinct metrics volumes for the given metric name. Custom distribution metrics will
   * return both ingested and indexed custom metric volumes. For Metrics without Limits&amp;trade;
   * beta customers, all metrics will return both ingested/indexed volumes. Custom metrics generated
   * in-app from other products will return &#x60;null&#x60; for ingested volumes.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricVolumesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricVolumesResponse> listVolumesByMetricNameWithHttpInfo(String metricName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling listVolumesByMetricName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/volumes"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.listVolumesByMetricName",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricVolumesResponse>() {});
  }

  /**
   * List distinct metric volumes by metric name
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricVolumesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricVolumesResponse>>
      listVolumesByMetricNameWithHttpInfoAsync(String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricVolumesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling listVolumesByMetricName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/volumes"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listVolumesByMetricName");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.listVolumesByMetricName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricVolumesResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricVolumesResponse>() {});
  }

  /**
   * Update a tag configuration
   *
   * <p>See {@link #updateTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public MetricTagConfigurationResponse updateTagConfiguration(
      String metricName, MetricTagConfigurationUpdateRequest body) throws ApiException {
    return updateTagConfigurationWithHttpInfo(metricName, body).getData();
  }

  /**
   * Update a tag configuration
   *
   * <p>See {@link #updateTagConfigurationWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;MetricTagConfigurationResponse&gt;
   */
  public CompletableFuture<MetricTagConfigurationResponse> updateTagConfigurationAsync(
      String metricName, MetricTagConfigurationUpdateRequest body) {
    return updateTagConfigurationWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a tag configuration
   *
   * <p>Update the tag configuration of a metric or percentile aggregations of a distribution metric
   * or custom aggregations of a count, rate, or gauge metric. Can only be used with application
   * keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricTagConfigurationResponse> updateTagConfigurationWithHttpInfo(
      String metricName, MetricTagConfigurationUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling updateTagConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTagConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MetricsApi.updateTagConfiguration",
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /**
   * Update a tag configuration
   *
   * <p>See {@link #updateTagConfigurationWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricTagConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricTagConfigurationResponse>>
      updateTagConfigurationWithHttpInfoAsync(
          String metricName, MetricTagConfigurationUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling updateTagConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTagConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTagConfiguration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MetricsApi.updateTagConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricTagConfigurationResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }
}
