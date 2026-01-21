package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IntakePayloadAccepted;
import com.datadog.api.client.v2.model.MetricAllTagsResponse;
import com.datadog.api.client.v2.model.MetricAssetsResponse;
import com.datadog.api.client.v2.model.MetricBulkTagConfigCreateRequest;
import com.datadog.api.client.v2.model.MetricBulkTagConfigDeleteRequest;
import com.datadog.api.client.v2.model.MetricBulkTagConfigResponse;
import com.datadog.api.client.v2.model.MetricContentEncoding;
import com.datadog.api.client.v2.model.MetricEstimateResponse;
import com.datadog.api.client.v2.model.MetricPayload;
import com.datadog.api.client.v2.model.MetricSuggestedTagsAndAggregationsResponse;
import com.datadog.api.client.v2.model.MetricTagCardinalitiesResponse;
import com.datadog.api.client.v2.model.MetricTagConfigurationCreateRequest;
import com.datadog.api.client.v2.model.MetricTagConfigurationMetricTypeCategory;
import com.datadog.api.client.v2.model.MetricTagConfigurationResponse;
import com.datadog.api.client.v2.model.MetricTagConfigurationUpdateRequest;
import com.datadog.api.client.v2.model.MetricVolumesResponse;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurations;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurationsResponse;
import com.datadog.api.client.v2.model.ScalarFormulaQueryRequest;
import com.datadog.api.client.v2.model.ScalarFormulaQueryResponse;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryRequest;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
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
   * Configure tags for multiple metrics.
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
   * Configure tags for multiple metrics.
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
   * Create and define a list of queryable tag keys for a set of existing count, gauge, rate, and
   * distribution metrics. Metrics are selected by passing a metric name prefix. Use the Delete
   * method of this API path to remove tag configurations. Results can be sent to a set of account
   * email addresses, just like the same operation in the Datadog web app. If multiple calls include
   * the same metric, the last configuration applied (not by submit order) is used, do not expect
   * deterministic ordering of concurrent calls. The <code>exclude_tags_mode</code> value will set
   * all metrics that match the prefix to the same exclusion state, metric tag configurations do not
   * support mixed inclusion and exclusion for tags on the same metric. Can only be used with
   * application keys of users with the <code>Manage Tags for Metrics</code> permission.
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
            "v2.MetricsApi.createBulkTagsMetricsConfiguration",
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
   * Configure tags for multiple metrics.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.createBulkTagsMetricsConfiguration",
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
   * Create a tag configuration.
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
   * Create a tag configuration.
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
   * Create and define a list of queryable tag keys for an existing count/gauge/rate/distribution
   * metric. Optionally, include percentile aggregations on any distribution metric. By setting
   * <code>exclude_tags_mode</code> to true, the behavior is changed from an allow-list to a
   * deny-list, and tags in the defined list are not queryable. Can only be used with application
   * keys of users with the <code>Manage Tags for Metrics</code> permission.
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
            "v2.MetricsApi.createTagConfiguration",
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
   * Create a tag configuration.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.createTagConfiguration",
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
   * Delete tags for multiple metrics.
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
   * Delete tags for multiple metrics.
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
   * Delete all custom lists of queryable tag keys for a set of existing count, gauge, rate, and
   * distribution metrics. Metrics are selected by passing a metric name prefix. Results can be sent
   * to a set of account email addresses, just like the same operation in the Datadog web app. Can
   * only be used with application keys of users with the <code>Manage Tags for Metrics</code>
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
            "v2.MetricsApi.deleteBulkTagsMetricsConfiguration",
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
   * Delete tags for multiple metrics.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.deleteBulkTagsMetricsConfiguration",
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
   * Delete a tag configuration.
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
   * Delete a tag configuration.
   *
   * <p>See {@link #deleteTagConfigurationWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagConfigurationAsync(String metricName) {
    return deleteTagConfigurationWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a metric's tag configuration. Can only be used with application keys from users with
   * the <code>Manage Tags for Metrics</code> permission.
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
            "v2.MetricsApi.deleteTagConfiguration",
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
   * Delete a tag configuration.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.deleteTagConfiguration",
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

  /** Manage optional parameters to estimateMetricsOutputSeries. */
  public static class EstimateMetricsOutputSeriesOptionalParameters {
    private String filterGroups;
    private Integer filterHoursAgo;
    private Integer filterNumAggregations;
    private Boolean filterPct;
    private Integer filterTimespanH;

    /**
     * Set filterGroups.
     *
     * @param filterGroups Filtered tag keys that the metric is configured to query with. (optional)
     * @return EstimateMetricsOutputSeriesOptionalParameters
     */
    public EstimateMetricsOutputSeriesOptionalParameters filterGroups(String filterGroups) {
      this.filterGroups = filterGroups;
      return this;
    }

    /**
     * Set filterHoursAgo.
     *
     * @param filterHoursAgo The number of hours of look back (from now) to estimate cardinality
     *     with. If unspecified, it defaults to 0 hours. (optional)
     * @return EstimateMetricsOutputSeriesOptionalParameters
     */
    public EstimateMetricsOutputSeriesOptionalParameters filterHoursAgo(Integer filterHoursAgo) {
      this.filterHoursAgo = filterHoursAgo;
      return this;
    }

    /**
     * Set filterNumAggregations.
     *
     * @param filterNumAggregations Deprecated. Number of aggregations has no impact on volume.
     *     (optional)
     * @return EstimateMetricsOutputSeriesOptionalParameters
     */
    public EstimateMetricsOutputSeriesOptionalParameters filterNumAggregations(
        Integer filterNumAggregations) {
      this.filterNumAggregations = filterNumAggregations;
      return this;
    }

    /**
     * Set filterPct.
     *
     * @param filterPct A boolean, for distribution metrics only, to estimate cardinality if the
     *     metric includes additional percentile aggregators. (optional)
     * @return EstimateMetricsOutputSeriesOptionalParameters
     */
    public EstimateMetricsOutputSeriesOptionalParameters filterPct(Boolean filterPct) {
      this.filterPct = filterPct;
      return this;
    }

    /**
     * Set filterTimespanH.
     *
     * @param filterTimespanH A window, in hours, from the look back to estimate cardinality with.
     *     The minimum and default is 1 hour. (optional)
     * @return EstimateMetricsOutputSeriesOptionalParameters
     */
    public EstimateMetricsOutputSeriesOptionalParameters filterTimespanH(Integer filterTimespanH) {
      this.filterTimespanH = filterTimespanH;
      return this;
    }
  }

  /**
   * Tag Configuration Cardinality Estimator.
   *
   * <p>See {@link #estimateMetricsOutputSeriesWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricEstimateResponse
   * @throws ApiException if fails to make API call
   */
  public MetricEstimateResponse estimateMetricsOutputSeries(String metricName) throws ApiException {
    return estimateMetricsOutputSeriesWithHttpInfo(
            metricName, new EstimateMetricsOutputSeriesOptionalParameters())
        .getData();
  }

  /**
   * Tag Configuration Cardinality Estimator.
   *
   * <p>See {@link #estimateMetricsOutputSeriesWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricEstimateResponse&gt;
   */
  public CompletableFuture<MetricEstimateResponse> estimateMetricsOutputSeriesAsync(
      String metricName) {
    return estimateMetricsOutputSeriesWithHttpInfoAsync(
            metricName, new EstimateMetricsOutputSeriesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Tag Configuration Cardinality Estimator.
   *
   * <p>See {@link #estimateMetricsOutputSeriesWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricEstimateResponse
   * @throws ApiException if fails to make API call
   */
  public MetricEstimateResponse estimateMetricsOutputSeries(
      String metricName, EstimateMetricsOutputSeriesOptionalParameters parameters)
      throws ApiException {
    return estimateMetricsOutputSeriesWithHttpInfo(metricName, parameters).getData();
  }

  /**
   * Tag Configuration Cardinality Estimator.
   *
   * <p>See {@link #estimateMetricsOutputSeriesWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricEstimateResponse&gt;
   */
  public CompletableFuture<MetricEstimateResponse> estimateMetricsOutputSeriesAsync(
      String metricName, EstimateMetricsOutputSeriesOptionalParameters parameters) {
    return estimateMetricsOutputSeriesWithHttpInfoAsync(metricName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the estimated cardinality for a metric with a given tag, percentile and number of
   * aggregations configuration using Metrics without Limits&trade;.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricEstimateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricEstimateResponse> estimateMetricsOutputSeriesWithHttpInfo(
      String metricName, EstimateMetricsOutputSeriesOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling estimateMetricsOutputSeries");
    }
    String filterGroups = parameters.filterGroups;
    Integer filterHoursAgo = parameters.filterHoursAgo;
    Integer filterNumAggregations = parameters.filterNumAggregations;
    Boolean filterPct = parameters.filterPct;
    Integer filterTimespanH = parameters.filterTimespanH;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/estimate"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[groups]", filterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[hours_ago]", filterHoursAgo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[num_aggregations]", filterNumAggregations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[pct]", filterPct));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[timespan_h]", filterTimespanH));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.estimateMetricsOutputSeries",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<MetricEstimateResponse>() {});
  }

  /**
   * Tag Configuration Cardinality Estimator.
   *
   * <p>See {@link #estimateMetricsOutputSeriesWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricEstimateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricEstimateResponse>>
      estimateMetricsOutputSeriesWithHttpInfoAsync(
          String metricName, EstimateMetricsOutputSeriesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricEstimateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " estimateMetricsOutputSeries"));
      return result;
    }
    String filterGroups = parameters.filterGroups;
    Integer filterHoursAgo = parameters.filterHoursAgo;
    Integer filterNumAggregations = parameters.filterNumAggregations;
    Boolean filterPct = parameters.filterPct;
    Integer filterTimespanH = parameters.filterTimespanH;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/estimate"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[groups]", filterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[hours_ago]", filterHoursAgo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[num_aggregations]", filterNumAggregations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[pct]", filterPct));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[timespan_h]", filterTimespanH));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.estimateMetricsOutputSeries",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricEstimateResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricEstimateResponse>() {});
  }

  /**
   * Get tag key cardinality details.
   *
   * <p>See {@link #getMetricTagCardinalityDetailsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricTagCardinalitiesResponse
   * @throws ApiException if fails to make API call
   */
  public MetricTagCardinalitiesResponse getMetricTagCardinalityDetails(String metricName)
      throws ApiException {
    return getMetricTagCardinalityDetailsWithHttpInfo(metricName).getData();
  }

  /**
   * Get tag key cardinality details.
   *
   * <p>See {@link #getMetricTagCardinalityDetailsWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricTagCardinalitiesResponse&gt;
   */
  public CompletableFuture<MetricTagCardinalitiesResponse> getMetricTagCardinalityDetailsAsync(
      String metricName) {
    return getMetricTagCardinalityDetailsWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the cardinality details of tags for a specific metric.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricTagCardinalitiesResponse&gt;
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
  public ApiResponse<MetricTagCardinalitiesResponse> getMetricTagCardinalityDetailsWithHttpInfo(
      String metricName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling"
              + " getMetricTagCardinalityDetails");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-cardinalities"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.getMetricTagCardinalityDetails",
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
        new GenericType<MetricTagCardinalitiesResponse>() {});
  }

  /**
   * Get tag key cardinality details.
   *
   * <p>See {@link #getMetricTagCardinalityDetailsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricTagCardinalitiesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricTagCardinalitiesResponse>>
      getMetricTagCardinalityDetailsWithHttpInfoAsync(String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricTagCardinalitiesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " getMetricTagCardinalityDetails"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-cardinalities"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.getMetricTagCardinalityDetails",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricTagCardinalitiesResponse>> result =
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
        new GenericType<MetricTagCardinalitiesResponse>() {});
  }

  /** Manage optional parameters to listActiveMetricConfigurations. */
  public static class ListActiveMetricConfigurationsOptionalParameters {
    private Long windowSeconds;

    /**
     * Set windowSeconds.
     *
     * @param windowSeconds The number of seconds of look back (from now). Default value is 604,800
     *     (1 week), minimum value is 7200 (2 hours), maximum value is 2,630,000 (1 month).
     *     (optional)
     * @return ListActiveMetricConfigurationsOptionalParameters
     */
    public ListActiveMetricConfigurationsOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }
  }

  /**
   * List active tags and aggregations.
   *
   * <p>See {@link #listActiveMetricConfigurationsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricSuggestedTagsAndAggregationsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricSuggestedTagsAndAggregationsResponse listActiveMetricConfigurations(
      String metricName) throws ApiException {
    return listActiveMetricConfigurationsWithHttpInfo(
            metricName, new ListActiveMetricConfigurationsOptionalParameters())
        .getData();
  }

  /**
   * List active tags and aggregations.
   *
   * <p>See {@link #listActiveMetricConfigurationsWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricSuggestedTagsAndAggregationsResponse&gt;
   */
  public CompletableFuture<MetricSuggestedTagsAndAggregationsResponse>
      listActiveMetricConfigurationsAsync(String metricName) {
    return listActiveMetricConfigurationsWithHttpInfoAsync(
            metricName, new ListActiveMetricConfigurationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List active tags and aggregations.
   *
   * <p>See {@link #listActiveMetricConfigurationsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricSuggestedTagsAndAggregationsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricSuggestedTagsAndAggregationsResponse listActiveMetricConfigurations(
      String metricName, ListActiveMetricConfigurationsOptionalParameters parameters)
      throws ApiException {
    return listActiveMetricConfigurationsWithHttpInfo(metricName, parameters).getData();
  }

  /**
   * List active tags and aggregations.
   *
   * <p>See {@link #listActiveMetricConfigurationsWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricSuggestedTagsAndAggregationsResponse&gt;
   */
  public CompletableFuture<MetricSuggestedTagsAndAggregationsResponse>
      listActiveMetricConfigurationsAsync(
          String metricName, ListActiveMetricConfigurationsOptionalParameters parameters) {
    return listActiveMetricConfigurationsWithHttpInfoAsync(metricName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tags and aggregations that are actively queried on dashboards, notebooks, monitors, the
   * Metrics Explorer, and using the API for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricSuggestedTagsAndAggregationsResponse&gt;
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
  public ApiResponse<MetricSuggestedTagsAndAggregationsResponse>
      listActiveMetricConfigurationsWithHttpInfo(
          String metricName, ListActiveMetricConfigurationsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling"
              + " listActiveMetricConfigurations");
    }
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/active-configurations"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listActiveMetricConfigurations",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<MetricSuggestedTagsAndAggregationsResponse>() {});
  }

  /**
   * List active tags and aggregations.
   *
   * <p>See {@link #listActiveMetricConfigurationsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricSuggestedTagsAndAggregationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricSuggestedTagsAndAggregationsResponse>>
      listActiveMetricConfigurationsWithHttpInfoAsync(
          String metricName, ListActiveMetricConfigurationsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricSuggestedTagsAndAggregationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " listActiveMetricConfigurations"));
      return result;
    }
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/active-configurations"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listActiveMetricConfigurations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricSuggestedTagsAndAggregationsResponse>> result =
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
        new GenericType<MetricSuggestedTagsAndAggregationsResponse>() {});
  }

  /**
   * Related Assets to a Metric.
   *
   * <p>See {@link #listMetricAssetsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricAssetsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricAssetsResponse listMetricAssets(String metricName) throws ApiException {
    return listMetricAssetsWithHttpInfo(metricName).getData();
  }

  /**
   * Related Assets to a Metric.
   *
   * <p>See {@link #listMetricAssetsWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricAssetsResponse&gt;
   */
  public CompletableFuture<MetricAssetsResponse> listMetricAssetsAsync(String metricName) {
    return listMetricAssetsWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns dashboards, monitors, notebooks, and SLOs that a metric is stored in, if any. Updated
   * every 24 hours.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricAssetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricAssetsResponse> listMetricAssetsWithHttpInfo(String metricName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling listMetricAssets");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/assets"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listMetricAssets",
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
        new GenericType<MetricAssetsResponse>() {});
  }

  /**
   * Related Assets to a Metric.
   *
   * <p>See {@link #listMetricAssetsWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricAssetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricAssetsResponse>> listMetricAssetsWithHttpInfoAsync(
      String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricAssetsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricName' when calling listMetricAssets"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/assets"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listMetricAssets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricAssetsResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricAssetsResponse>() {});
  }

  /**
   * List tag configuration by name.
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
   * List tag configuration by name.
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
   * Returns the tag configuration for the given metric name.
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
            "v2.MetricsApi.listTagConfigurationByName",
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
        new GenericType<MetricTagConfigurationResponse>() {});
  }

  /**
   * List tag configuration by name.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listTagConfigurationByName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
    private MetricTagConfigurationMetricTypeCategory filterMetricType;
    private Boolean filterIncludePercentiles;
    private Boolean filterQueried;
    private String filterTags;
    private Boolean filterRelatedAssets;
    private Long windowSeconds;
    private Integer pageSize;
    private String pageCursor;

    /**
     * Set filterConfigured.
     *
     * @param filterConfigured Filter custom metrics that have configured tags. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterConfigured(Boolean filterConfigured) {
      this.filterConfigured = filterConfigured;
      return this;
    }

    /**
     * Set filterTagsConfigured.
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
     * Set filterMetricType.
     *
     * @param filterMetricType Filter metrics by metric type. (optional, default to "distribution")
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterMetricType(
        MetricTagConfigurationMetricTypeCategory filterMetricType) {
      this.filterMetricType = filterMetricType;
      return this;
    }

    /**
     * Set filterIncludePercentiles.
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
     * Set filterQueried.
     *
     * @param filterQueried (Preview) Filter custom metrics that have or have not been queried in
     *     the past 30 days. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterQueried(Boolean filterQueried) {
      this.filterQueried = filterQueried;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter metrics that have been submitted with the given tags. Supports
     *     boolean and wildcard expressions. Can only be combined with the filter[queried] filter.
     *     (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterRelatedAssets.
     *
     * @param filterRelatedAssets (Preview) Filter metrics that are used in dashboards, monitors,
     *     notebooks, SLOs. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterRelatedAssets(
        Boolean filterRelatedAssets) {
      this.filterRelatedAssets = filterRelatedAssets;
      return this;
    }

    /**
     * Set windowSeconds.
     *
     * @param windowSeconds The number of seconds of look back (from now) to apply to a filter[tag]
     *     or filter[queried] query. Default value is 3600 (1 hour), maximum value is 2,592,000 (30
     *     days). (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of results returned. (optional, default to 10000)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor String to query the next page of results. This key is provided with each
     *     valid response from the API in <code>meta.pagination.next_cursor</code>. Once the <code>
     *     meta.pagination.next_cursor</code> key is null, all pages have been retrieved. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get a list of metrics.
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
   * Get a list of metrics.
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfoAsync}.
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
   * Get a list of metrics.
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
   * Get a list of metrics.
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
   * Get a list of metrics.
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;MetricsAndMetricTagConfigurations&gt;
   */
  public PaginationIterable<MetricsAndMetricTagConfigurations>
      listTagConfigurationsWithPagination() {
    ListTagConfigurationsOptionalParameters parameters =
        new ListTagConfigurationsOptionalParameters();
    return listTagConfigurationsWithPagination(parameters);
  }

  /**
   * Get a list of metrics.
   *
   * <p>See {@link #listTagConfigurationsWithHttpInfo}.
   *
   * @return MetricsAndMetricTagConfigurationsResponse
   */
  public PaginationIterable<MetricsAndMetricTagConfigurations> listTagConfigurationsWithPagination(
      ListTagConfigurationsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPagination.getNextCursor";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageSize == null) {
      limit = 10000;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listTagConfigurations",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Returns all metrics that can be configured in the Metrics Summary page or with Metrics without
   * Limits™ (matching additional filters if specified). Optionally, paginate by using the <code>
   * page[cursor]</code> and/or <code>page[size]</code> query parameters. To fetch the first page,
   * pass in a query parameter with either a valid <code>page[size]</code> or an empty cursor like
   * <code>page[cursor]=</code>. To fetch the next page, pass in the <code>next_cursor</code> value
   * from the response as the new <code>page[cursor]</code> value. Once the <code>
   * meta.pagination.next_cursor</code> value is null, all pages have been retrieved.
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
    MetricTagConfigurationMetricTypeCategory filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    Boolean filterQueried = parameters.filterQueried;
    String filterTags = parameters.filterTags;
    Boolean filterRelatedAssets = parameters.filterRelatedAssets;
    Long windowSeconds = parameters.windowSeconds;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[queried]", filterQueried));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[related_assets]", filterRelatedAssets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listTagConfigurations",
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
        new GenericType<MetricsAndMetricTagConfigurationsResponse>() {});
  }

  /**
   * Get a list of metrics.
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
    MetricTagConfigurationMetricTypeCategory filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    Boolean filterQueried = parameters.filterQueried;
    String filterTags = parameters.filterTags;
    Boolean filterRelatedAssets = parameters.filterRelatedAssets;
    Long windowSeconds = parameters.windowSeconds;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[queried]", filterQueried));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[related_assets]", filterRelatedAssets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listTagConfigurations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /** Manage optional parameters to listTagsByMetricName. */
  public static class ListTagsByMetricNameOptionalParameters {
    private Long windowSeconds;
    private String filterTags;
    private String filterMatch;
    private Boolean filterIncludeTagValues;
    private Boolean filterAllowPartial;
    private Integer pageLimit;

    /**
     * Set windowSeconds.
     *
     * @param windowSeconds The number of seconds of look back (from now) to query for tag data.
     *     Default value is 14400 (4 hours), minimum value is 14400 (4 hours). (optional)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter results to tags from data points that have the specified tags. For
     *     example, <code>filter[tags]=env:staging,host:123</code> returns tags only from data
     *     points with both <code>env:staging</code> and <code>host:123</code>. (optional)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterMatch.
     *
     * @param filterMatch Filter returned tags to those matching a substring. For example, <code>
     *     filter[match]=env</code> returns tags like <code>env:prod</code>, <code>
     *     environment:staging</code>, etc. (optional)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters filterMatch(String filterMatch) {
      this.filterMatch = filterMatch;
      return this;
    }

    /**
     * Set filterIncludeTagValues.
     *
     * @param filterIncludeTagValues Whether to include tag values in the response. Defaults to
     *     true. (optional)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters filterIncludeTagValues(
        Boolean filterIncludeTagValues) {
      this.filterIncludeTagValues = filterIncludeTagValues;
      return this;
    }

    /**
     * Set filterAllowPartial.
     *
     * @param filterAllowPartial Whether to allow partial results. Defaults to false. (optional)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters filterAllowPartial(Boolean filterAllowPartial) {
      this.filterAllowPartial = filterAllowPartial;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. (optional, default to 1000000)
     * @return ListTagsByMetricNameOptionalParameters
     */
    public ListTagsByMetricNameOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List tags by metric name.
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricAllTagsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricAllTagsResponse listTagsByMetricName(String metricName) throws ApiException {
    return listTagsByMetricNameWithHttpInfo(
            metricName, new ListTagsByMetricNameOptionalParameters())
        .getData();
  }

  /**
   * List tags by metric name.
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;MetricAllTagsResponse&gt;
   */
  public CompletableFuture<MetricAllTagsResponse> listTagsByMetricNameAsync(String metricName) {
    return listTagsByMetricNameWithHttpInfoAsync(
            metricName, new ListTagsByMetricNameOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tags by metric name.
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricAllTagsResponse
   * @throws ApiException if fails to make API call
   */
  public MetricAllTagsResponse listTagsByMetricName(
      String metricName, ListTagsByMetricNameOptionalParameters parameters) throws ApiException {
    return listTagsByMetricNameWithHttpInfo(metricName, parameters).getData();
  }

  /**
   * List tags by metric name.
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricAllTagsResponse&gt;
   */
  public CompletableFuture<MetricAllTagsResponse> listTagsByMetricNameAsync(
      String metricName, ListTagsByMetricNameOptionalParameters parameters) {
    return listTagsByMetricNameWithHttpInfoAsync(metricName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * View indexed and ingested tags for a given metric name. Results are filtered by the <code>
   * window[seconds]</code> parameter, which defaults to 14400 (4 hours).
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
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
  public ApiResponse<MetricAllTagsResponse> listTagsByMetricNameWithHttpInfo(
      String metricName, ListTagsByMetricNameOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling listTagsByMetricName");
    }
    Long windowSeconds = parameters.windowSeconds;
    String filterTags = parameters.filterTags;
    String filterMatch = parameters.filterMatch;
    Boolean filterIncludeTagValues = parameters.filterIncludeTagValues;
    Boolean filterAllowPartial = parameters.filterAllowPartial;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/all-tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[match]", filterMatch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_tag_values]", filterIncludeTagValues));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[allow_partial]", filterAllowPartial));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listTagsByMetricName",
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
        new GenericType<MetricAllTagsResponse>() {});
  }

  /**
   * List tags by metric name.
   *
   * <p>See {@link #listTagsByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricAllTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricAllTagsResponse>>
      listTagsByMetricNameWithHttpInfoAsync(
          String metricName, ListTagsByMetricNameOptionalParameters parameters) {
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
    Long windowSeconds = parameters.windowSeconds;
    String filterTags = parameters.filterTags;
    String filterMatch = parameters.filterMatch;
    Boolean filterIncludeTagValues = parameters.filterIncludeTagValues;
    Boolean filterAllowPartial = parameters.filterAllowPartial;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/all-tags"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[match]", filterMatch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_tag_values]", filterIncludeTagValues));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[allow_partial]", filterAllowPartial));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listTagsByMetricName",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * List distinct metric volumes by metric name.
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
   * List distinct metric volumes by metric name.
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
   * View distinct metrics volumes for the given metric name.
   *
   * <p>Custom metrics generated in-app from other products will return <code>null</code> for
   * ingested volumes.
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
            "v2.MetricsApi.listVolumesByMetricName",
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
        new GenericType<MetricVolumesResponse>() {});
  }

  /**
   * List distinct metric volumes by metric name.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listVolumesByMetricName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Query scalar data across multiple products.
   *
   * <p>See {@link #queryScalarDataWithHttpInfo}.
   *
   * @param body (required)
   * @return ScalarFormulaQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ScalarFormulaQueryResponse queryScalarData(ScalarFormulaQueryRequest body)
      throws ApiException {
    return queryScalarDataWithHttpInfo(body).getData();
  }

  /**
   * Query scalar data across multiple products.
   *
   * <p>See {@link #queryScalarDataWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ScalarFormulaQueryResponse&gt;
   */
  public CompletableFuture<ScalarFormulaQueryResponse> queryScalarDataAsync(
      ScalarFormulaQueryRequest body) {
    return queryScalarDataWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query scalar values (as seen on Query Value, Table, and Toplist widgets). Multiple data sources
   * are supported with the ability to process the data using formulas and functions.
   *
   * @param body (required)
   * @return ApiResponse&lt;ScalarFormulaQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ScalarFormulaQueryResponse> queryScalarDataWithHttpInfo(
      ScalarFormulaQueryRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryScalarData");
    }
    // create path and map variables
    String localVarPath = "/api/v2/query/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.queryScalarData",
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
        new GenericType<ScalarFormulaQueryResponse>() {});
  }

  /**
   * Query scalar data across multiple products.
   *
   * <p>See {@link #queryScalarDataWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ScalarFormulaQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ScalarFormulaQueryResponse>>
      queryScalarDataWithHttpInfoAsync(ScalarFormulaQueryRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ScalarFormulaQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryScalarData"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/query/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.queryScalarData",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ScalarFormulaQueryResponse>> result = new CompletableFuture<>();
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
        new GenericType<ScalarFormulaQueryResponse>() {});
  }

  /**
   * Query timeseries data across multiple products.
   *
   * <p>See {@link #queryTimeseriesDataWithHttpInfo}.
   *
   * @param body (required)
   * @return TimeseriesFormulaQueryResponse
   * @throws ApiException if fails to make API call
   */
  public TimeseriesFormulaQueryResponse queryTimeseriesData(TimeseriesFormulaQueryRequest body)
      throws ApiException {
    return queryTimeseriesDataWithHttpInfo(body).getData();
  }

  /**
   * Query timeseries data across multiple products.
   *
   * <p>See {@link #queryTimeseriesDataWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TimeseriesFormulaQueryResponse&gt;
   */
  public CompletableFuture<TimeseriesFormulaQueryResponse> queryTimeseriesDataAsync(
      TimeseriesFormulaQueryRequest body) {
    return queryTimeseriesDataWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query timeseries data across various data sources and process the data by applying formulas and
   * functions.
   *
   * @param body (required)
   * @return ApiResponse&lt;TimeseriesFormulaQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TimeseriesFormulaQueryResponse> queryTimeseriesDataWithHttpInfo(
      TimeseriesFormulaQueryRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryTimeseriesData");
    }
    // create path and map variables
    String localVarPath = "/api/v2/query/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.queryTimeseriesData",
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
        new GenericType<TimeseriesFormulaQueryResponse>() {});
  }

  /**
   * Query timeseries data across multiple products.
   *
   * <p>See {@link #queryTimeseriesDataWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TimeseriesFormulaQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TimeseriesFormulaQueryResponse>>
      queryTimeseriesDataWithHttpInfoAsync(TimeseriesFormulaQueryRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TimeseriesFormulaQueryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryTimeseriesData"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/query/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.queryTimeseriesData",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TimeseriesFormulaQueryResponse>> result =
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
        new GenericType<TimeseriesFormulaQueryResponse>() {});
  }

  /** Manage optional parameters to submitMetrics. */
  public static class SubmitMetricsOptionalParameters {
    private MetricContentEncoding contentEncoding;

    /**
     * Set contentEncoding.
     *
     * @param contentEncoding HTTP header used to compress the media-type. (optional, default to
     *     "deflate")
     * @return SubmitMetricsOptionalParameters
     */
    public SubmitMetricsOptionalParameters contentEncoding(MetricContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }
  }

  /**
   * Submit metrics.
   *
   * <p>See {@link #submitMetricsWithHttpInfo}.
   *
   * @param body (required)
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   */
  public IntakePayloadAccepted submitMetrics(MetricPayload body) throws ApiException {
    return submitMetricsWithHttpInfo(body, new SubmitMetricsOptionalParameters()).getData();
  }

  /**
   * Submit metrics.
   *
   * <p>See {@link #submitMetricsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IntakePayloadAccepted&gt;
   */
  public CompletableFuture<IntakePayloadAccepted> submitMetricsAsync(MetricPayload body) {
    return submitMetricsWithHttpInfoAsync(body, new SubmitMetricsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit metrics.
   *
   * <p>See {@link #submitMetricsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   */
  public IntakePayloadAccepted submitMetrics(
      MetricPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
    return submitMetricsWithHttpInfo(body, parameters).getData();
  }

  /**
   * Submit metrics.
   *
   * <p>See {@link #submitMetricsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IntakePayloadAccepted&gt;
   */
  public CompletableFuture<IntakePayloadAccepted> submitMetricsAsync(
      MetricPayload body, SubmitMetricsOptionalParameters parameters) {
    return submitMetricsWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The metrics end-point allows you to post time-series data that can be graphed on Datadog’s
   * dashboards. The maximum payload size is 500 kilobytes (512000 bytes). Compressed payloads must
   * have a decompressed size of less than 5 megabytes (5242880 bytes).
   *
   * <p>If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:
   *
   * <ul>
   *   <li>64 bits for the timestamp
   *   <li>64 bits for the value
   *   <li>20 bytes for the metric names
   *   <li>50 bytes for the timeseries
   *   <li>The full payload is approximately 100 bytes.
   * </ul>
   *
   * <p>Host name is one of the resources in the Resources field.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IntakePayloadAccepted&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IntakePayloadAccepted> submitMetricsWithHttpInfo(
      MetricPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitMetrics");
    }
    MetricContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/series";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.submitMetrics",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IntakePayloadAccepted>() {});
  }

  /**
   * Submit metrics.
   *
   * <p>See {@link #submitMetricsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IntakePayloadAccepted&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntakePayloadAccepted>> submitMetricsWithHttpInfoAsync(
      MetricPayload body, SubmitMetricsOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IntakePayloadAccepted>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling submitMetrics"));
      return result;
    }
    MetricContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/series";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.submitMetrics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntakePayloadAccepted>> result = new CompletableFuture<>();
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
        new GenericType<IntakePayloadAccepted>() {});
  }

  /**
   * Update a tag configuration.
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
   * Update a tag configuration.
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
   * Update the tag configuration of a metric or percentile aggregations of a distribution metric or
   * custom aggregations of a count, rate, or gauge metric. By setting <code>exclude_tags_mode
   * </code> to true the behavior is changed from an allow-list to a deny-list, and tags in the
   * defined list will not be queryable. Can only be used with application keys from users with the
   * <code>Manage Tags for Metrics</code> permission. This endpoint requires a tag configuration to
   * be created first.
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
            "v2.MetricsApi.updateTagConfiguration",
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
   * Update a tag configuration.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.updateTagConfiguration",
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
