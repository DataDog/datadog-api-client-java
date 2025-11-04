package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.DistributionPointsContentEncoding;
import com.datadog.api.client.v1.model.DistributionPointsPayload;
import com.datadog.api.client.v1.model.IntakePayloadAccepted;
import com.datadog.api.client.v1.model.MetricContentEncoding;
import com.datadog.api.client.v1.model.MetricMetadata;
import com.datadog.api.client.v1.model.MetricSearchResponse;
import com.datadog.api.client.v1.model.MetricsListResponse;
import com.datadog.api.client.v1.model.MetricsPayload;
import com.datadog.api.client.v1.model.MetricsQueryResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
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
   * Get metric metadata.
   *
   * <p>See {@link #getMetricMetadataWithHttpInfo}.
   *
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return MetricMetadata
   * @throws ApiException if fails to make API call
   */
  public MetricMetadata getMetricMetadata(String metricName) throws ApiException {
    return getMetricMetadataWithHttpInfo(metricName).getData();
  }

  /**
   * Get metric metadata.
   *
   * <p>See {@link #getMetricMetadataWithHttpInfoAsync}.
   *
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return CompletableFuture&lt;MetricMetadata&gt;
   */
  public CompletableFuture<MetricMetadata> getMetricMetadataAsync(String metricName) {
    return getMetricMetadataWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get metadata about a specific metric.
   *
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return ApiResponse&lt;MetricMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricMetadata> getMetricMetadataWithHttpInfo(String metricName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling getMetricMetadata");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/metrics/{metric_name}"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.getMetricMetadata",
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
        new GenericType<MetricMetadata>() {});
  }

  /**
   * Get metric metadata.
   *
   * <p>See {@link #getMetricMetadataWithHttpInfo}.
   *
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricMetadata&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricMetadata>> getMetricMetadataWithHttpInfoAsync(
      String metricName) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricMetadata>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricName' when calling getMetricMetadata"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/metrics/{metric_name}"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.getMetricMetadata",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricMetadata>> result = new CompletableFuture<>();
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
        new GenericType<MetricMetadata>() {});
  }

  /** Manage optional parameters to listActiveMetrics. */
  public static class ListActiveMetricsOptionalParameters {
    private String host;
    private String tagFilter;

    /**
     * Set host.
     *
     * @param host Hostname for filtering the list of metrics returned. If set, metrics retrieved
     *     are those with the corresponding hostname tag. (optional)
     * @return ListActiveMetricsOptionalParameters
     */
    public ListActiveMetricsOptionalParameters host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set tagFilter.
     *
     * @param tagFilter Filter metrics that have been submitted with the given tags. Supports
     *     boolean and wildcard expressions. Cannot be combined with other filters. (optional)
     * @return ListActiveMetricsOptionalParameters
     */
    public ListActiveMetricsOptionalParameters tagFilter(String tagFilter) {
      this.tagFilter = tagFilter;
      return this;
    }
  }

  /**
   * Get active metrics list.
   *
   * <p>See {@link #listActiveMetricsWithHttpInfo}.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @return MetricsListResponse
   * @throws ApiException if fails to make API call
   */
  public MetricsListResponse listActiveMetrics(Long from) throws ApiException {
    return listActiveMetricsWithHttpInfo(from, new ListActiveMetricsOptionalParameters()).getData();
  }

  /**
   * Get active metrics list.
   *
   * <p>See {@link #listActiveMetricsWithHttpInfoAsync}.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @return CompletableFuture&lt;MetricsListResponse&gt;
   */
  public CompletableFuture<MetricsListResponse> listActiveMetricsAsync(Long from) {
    return listActiveMetricsWithHttpInfoAsync(from, new ListActiveMetricsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get active metrics list.
   *
   * <p>See {@link #listActiveMetricsWithHttpInfo}.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricsListResponse
   * @throws ApiException if fails to make API call
   */
  public MetricsListResponse listActiveMetrics(
      Long from, ListActiveMetricsOptionalParameters parameters) throws ApiException {
    return listActiveMetricsWithHttpInfo(from, parameters).getData();
  }

  /**
   * Get active metrics list.
   *
   * <p>See {@link #listActiveMetricsWithHttpInfoAsync}.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricsListResponse&gt;
   */
  public CompletableFuture<MetricsListResponse> listActiveMetricsAsync(
      Long from, ListActiveMetricsOptionalParameters parameters) {
    return listActiveMetricsWithHttpInfoAsync(from, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of actively reporting metrics from a given time until now.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricsListResponse> listActiveMetricsWithHttpInfo(
      Long from, ListActiveMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(
          400, "Missing the required parameter 'from' when calling listActiveMetrics");
    }
    String host = parameters.host;
    String tagFilter = parameters.tagFilter;
    // create path and map variables
    String localVarPath = "/api/v1/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "host", host));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_filter", tagFilter));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.listActiveMetrics",
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
        new GenericType<MetricsListResponse>() {});
  }

  /**
   * Get active metrics list.
   *
   * <p>See {@link #listActiveMetricsWithHttpInfo}.
   *
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricsListResponse>> listActiveMetricsWithHttpInfoAsync(
      Long from, ListActiveMetricsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'from' is set
    if (from == null) {
      CompletableFuture<ApiResponse<MetricsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'from' when calling listActiveMetrics"));
      return result;
    }
    String host = parameters.host;
    String tagFilter = parameters.tagFilter;
    // create path and map variables
    String localVarPath = "/api/v1/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "host", host));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_filter", tagFilter));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.listActiveMetrics",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricsListResponse>() {});
  }

  /**
   * Search metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfo}.
   *
   * @param q Query string to search metrics upon. Can optionally be prefixed with <code>metrics:
   *     </code>. (required)
   * @return MetricSearchResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public MetricSearchResponse listMetrics(String q) throws ApiException {
    return listMetricsWithHttpInfo(q).getData();
  }

  /**
   * Search metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfoAsync}.
   *
   * @param q Query string to search metrics upon. Can optionally be prefixed with <code>metrics:
   *     </code>. (required)
   * @return CompletableFuture&lt;MetricSearchResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<MetricSearchResponse> listMetricsAsync(String q) {
    return listMetricsWithHttpInfoAsync(q)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>Note</strong>: This endpoint is deprecated. Use <code>/api/v2/metrics</code> instead.
   *
   * <p>Search for metrics from the last 24 hours in Datadog.
   *
   * @param q Query string to search metrics upon. Can optionally be prefixed with <code>metrics:
   *     </code>. (required)
   * @return ApiResponse&lt;MetricSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<MetricSearchResponse> listMetricsWithHttpInfo(String q) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling listMetrics");
    }
    // create path and map variables
    String localVarPath = "/api/v1/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.listMetrics",
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
        new GenericType<MetricSearchResponse>() {});
  }

  /**
   * Search metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfo}.
   *
   * @param q Query string to search metrics upon. Can optionally be prefixed with <code>metrics:
   *     </code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricSearchResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<MetricSearchResponse>> listMetricsWithHttpInfoAsync(
      String q) {
    Object localVarPostBody = null;

    // verify the required parameter 'q' is set
    if (q == null) {
      CompletableFuture<ApiResponse<MetricSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'q' when calling listMetrics"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.listMetrics",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricSearchResponse>() {});
  }

  /**
   * Query timeseries points.
   *
   * <p>See {@link #queryMetricsWithHttpInfo}.
   *
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return MetricsQueryResponse
   * @throws ApiException if fails to make API call
   */
  public MetricsQueryResponse queryMetrics(Long from, Long to, String query) throws ApiException {
    return queryMetricsWithHttpInfo(from, to, query).getData();
  }

  /**
   * Query timeseries points.
   *
   * <p>See {@link #queryMetricsWithHttpInfoAsync}.
   *
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return CompletableFuture&lt;MetricsQueryResponse&gt;
   */
  public CompletableFuture<MetricsQueryResponse> queryMetricsAsync(
      Long from, Long to, String query) {
    return queryMetricsWithHttpInfoAsync(from, to, query)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query timeseries points.
   *
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return ApiResponse&lt;MetricsQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricsQueryResponse> queryMetricsWithHttpInfo(
      Long from, Long to, String query) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(
          400, "Missing the required parameter 'from' when calling queryMetrics");
    }

    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling queryMetrics");
    }

    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(
          400, "Missing the required parameter 'query' when calling queryMetrics");
    }
    // create path and map variables
    String localVarPath = "/api/v1/query";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.queryMetrics",
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
        new GenericType<MetricsQueryResponse>() {});
  }

  /**
   * Query timeseries points.
   *
   * <p>See {@link #queryMetricsWithHttpInfo}.
   *
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricsQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricsQueryResponse>> queryMetricsWithHttpInfoAsync(
      Long from, Long to, String query) {
    Object localVarPostBody = null;

    // verify the required parameter 'from' is set
    if (from == null) {
      CompletableFuture<ApiResponse<MetricsQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'from' when calling queryMetrics"));
      return result;
    }

    // verify the required parameter 'to' is set
    if (to == null) {
      CompletableFuture<ApiResponse<MetricsQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'to' when calling queryMetrics"));
      return result;
    }

    // verify the required parameter 'query' is set
    if (query == null) {
      CompletableFuture<ApiResponse<MetricsQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'query' when calling queryMetrics"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/query";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.queryMetrics",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricsQueryResponse>> result = new CompletableFuture<>();
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
        new GenericType<MetricsQueryResponse>() {});
  }

  /** Manage optional parameters to submitDistributionPoints. */
  public static class SubmitDistributionPointsOptionalParameters {
    private DistributionPointsContentEncoding contentEncoding;

    /**
     * Set contentEncoding.
     *
     * @param contentEncoding HTTP header used to compress the media-type. (optional)
     * @return SubmitDistributionPointsOptionalParameters
     */
    public SubmitDistributionPointsOptionalParameters contentEncoding(
        DistributionPointsContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }
  }

  /**
   * Submit distribution points.
   *
   * <p>See {@link #submitDistributionPointsWithHttpInfo}.
   *
   * @param body (required)
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   */
  public IntakePayloadAccepted submitDistributionPoints(DistributionPointsPayload body)
      throws ApiException {
    return submitDistributionPointsWithHttpInfo(
            body, new SubmitDistributionPointsOptionalParameters())
        .getData();
  }

  /**
   * Submit distribution points.
   *
   * <p>See {@link #submitDistributionPointsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IntakePayloadAccepted&gt;
   */
  public CompletableFuture<IntakePayloadAccepted> submitDistributionPointsAsync(
      DistributionPointsPayload body) {
    return submitDistributionPointsWithHttpInfoAsync(
            body, new SubmitDistributionPointsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit distribution points.
   *
   * <p>See {@link #submitDistributionPointsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   */
  public IntakePayloadAccepted submitDistributionPoints(
      DistributionPointsPayload body, SubmitDistributionPointsOptionalParameters parameters)
      throws ApiException {
    return submitDistributionPointsWithHttpInfo(body, parameters).getData();
  }

  /**
   * Submit distribution points.
   *
   * <p>See {@link #submitDistributionPointsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IntakePayloadAccepted&gt;
   */
  public CompletableFuture<IntakePayloadAccepted> submitDistributionPointsAsync(
      DistributionPointsPayload body, SubmitDistributionPointsOptionalParameters parameters) {
    return submitDistributionPointsWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The distribution points end-point allows you to post distribution data that can be graphed on
   * Datadog’s dashboards.
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
  public ApiResponse<IntakePayloadAccepted> submitDistributionPointsWithHttpInfo(
      DistributionPointsPayload body, SubmitDistributionPointsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitDistributionPoints");
    }
    DistributionPointsContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v1/distribution_points";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.submitDistributionPoints",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/json", "application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"text/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IntakePayloadAccepted>() {});
  }

  /**
   * Submit distribution points.
   *
   * <p>See {@link #submitDistributionPointsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IntakePayloadAccepted&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntakePayloadAccepted>>
      submitDistributionPointsWithHttpInfoAsync(
          DistributionPointsPayload body, SubmitDistributionPointsOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IntakePayloadAccepted>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling submitDistributionPoints"));
      return result;
    }
    DistributionPointsContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v1/distribution_points";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.submitDistributionPoints",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/json", "application/json"},
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
        new String[] {"text/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IntakePayloadAccepted>() {});
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
  public IntakePayloadAccepted submitMetrics(MetricsPayload body) throws ApiException {
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
  public CompletableFuture<IntakePayloadAccepted> submitMetricsAsync(MetricsPayload body) {
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
      MetricsPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
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
      MetricsPayload body, SubmitMetricsOptionalParameters parameters) {
    return submitMetricsWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The metrics end-point allows you to post time-series data that can be graphed on Datadog’s
   * dashboards. The maximum payload size is 3.2 megabytes (3200000 bytes). Compressed payloads must
   * have a decompressed size of less than 62 megabytes (62914560 bytes).
   *
   * <p>If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:
   *
   * <ul>
   *   <li>64 bits for the timestamp
   *   <li>64 bits for the value
   *   <li>40 bytes for the metric names
   *   <li>50 bytes for the timeseries
   *   <li>The full payload is approximately 100 bytes. However, with the DogStatsD API, compression
   *       is applied, which reduces the payload size.
   * </ul>
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
      MetricsPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitMetrics");
    }
    MetricContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v1/series";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.submitMetrics",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/json", "application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"text/json"},
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
      MetricsPayload body, SubmitMetricsOptionalParameters parameters) {
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
    String localVarPath = "/api/v1/series";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.submitMetrics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/json", "application/json"},
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
        new String[] {"text/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IntakePayloadAccepted>() {});
  }

  /**
   * Edit metric metadata.
   *
   * <p>See {@link #updateMetricMetadataWithHttpInfo}.
   *
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return MetricMetadata
   * @throws ApiException if fails to make API call
   */
  public MetricMetadata updateMetricMetadata(String metricName, MetricMetadata body)
      throws ApiException {
    return updateMetricMetadataWithHttpInfo(metricName, body).getData();
  }

  /**
   * Edit metric metadata.
   *
   * <p>See {@link #updateMetricMetadataWithHttpInfoAsync}.
   *
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return CompletableFuture&lt;MetricMetadata&gt;
   */
  public CompletableFuture<MetricMetadata> updateMetricMetadataAsync(
      String metricName, MetricMetadata body) {
    return updateMetricMetadataWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit metadata of a specific metric. Find out more about <a
   * href="https://docs.datadoghq.com/developers/metrics">supported types</a>.
   *
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return ApiResponse&lt;MetricMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricMetadata> updateMetricMetadataWithHttpInfo(
      String metricName, MetricMetadata body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling updateMetricMetadata");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMetricMetadata");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/metrics/{metric_name}"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MetricsApi.updateMetricMetadata",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricMetadata>() {});
  }

  /**
   * Edit metric metadata.
   *
   * <p>See {@link #updateMetricMetadataWithHttpInfo}.
   *
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MetricMetadata&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricMetadata>> updateMetricMetadataWithHttpInfoAsync(
      String metricName, MetricMetadata body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<MetricMetadata>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling updateMetricMetadata"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MetricMetadata>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMetricMetadata"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/metrics/{metric_name}"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MetricsApi.updateMetricMetadata",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MetricMetadata>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MetricMetadata>() {});
  }
}
