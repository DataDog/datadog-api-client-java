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
import com.datadog.api.client.v2.model.TagIndexingRuleCreateRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionCreateRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleOrderRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleUpdateRequest;
import com.datadog.api.client.v2.model.TagIndexingRulesResponse;
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
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<MetricBulkTagConfigResponse> createBulkTagsMetricsConfigurationAsync(
      MetricBulkTagConfigCreateRequest body) {
    return createBulkTagsMetricsConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>Note</strong>: This endpoint is deprecated. Use <a
   * href="/api/latest/metrics/#create-a-tag-indexing-rule">Tag Indexing Rules</a> (<code>
   * POST /api/v2/metrics/tag-indexing-rules</code>) instead.
   *
   * <p>Create and define a list of queryable tag keys for a set of existing count, gauge, rate, and
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
   *
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
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
   * Create a tag indexing rule.
   *
   * <p>See {@link #createTagIndexingRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return TagIndexingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRuleResponse createTagIndexingRule(TagIndexingRuleCreateRequest body)
      throws ApiException {
    return createTagIndexingRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a tag indexing rule.
   *
   * <p>See {@link #createTagIndexingRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TagIndexingRuleResponse&gt;
   */
  public CompletableFuture<TagIndexingRuleResponse> createTagIndexingRuleAsync(
      TagIndexingRuleCreateRequest body) {
    return createTagIndexingRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a tag indexing rule for the org. <code>rule_order</code> is assigned server-side as
   * max+1 among existing rules; use the reorder endpoint to change the evaluation order. Requires
   * the <code>Manage Tags for Metrics</code> permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;TagIndexingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRuleResponse> createTagIndexingRuleWithHttpInfo(
      TagIndexingRuleCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagIndexingRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.createTagIndexingRule",
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
        new GenericType<TagIndexingRuleResponse>() {});
  }

  /**
   * Create a tag indexing rule.
   *
   * <p>See {@link #createTagIndexingRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRuleResponse>>
      createTagIndexingRuleWithHttpInfoAsync(TagIndexingRuleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTagIndexingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.createTagIndexingRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagIndexingRuleResponse>() {});
  }

  /**
   * Create a tag indexing rule exemption.
   *
   * <p>See {@link #createTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return TagIndexingRuleExemptionResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRuleExemptionResponse createTagIndexingRuleExemption(
      String metricName, TagIndexingRuleExemptionCreateRequest body) throws ApiException {
    return createTagIndexingRuleExemptionWithHttpInfo(metricName, body).getData();
  }

  /**
   * Create a tag indexing rule exemption.
   *
   * <p>See {@link #createTagIndexingRuleExemptionWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TagIndexingRuleExemptionResponse&gt;
   */
  public CompletableFuture<TagIndexingRuleExemptionResponse> createTagIndexingRuleExemptionAsync(
      String metricName, TagIndexingRuleExemptionCreateRequest body) {
    return createTagIndexingRuleExemptionWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Exempt a metric from all tag indexing rules. The response includes the created exemption
   * resource. Requires the <code>Manage Tags for Metrics</code> permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;TagIndexingRuleExemptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRuleExemptionResponse> createTagIndexingRuleExemptionWithHttpInfo(
      String metricName, TagIndexingRuleExemptionCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling"
              + " createTagIndexingRuleExemption");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagIndexingRuleExemption");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.createTagIndexingRuleExemption",
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
        new GenericType<TagIndexingRuleExemptionResponse>() {});
  }

  /**
   * Create a tag indexing rule exemption.
   *
   * <p>See {@link #createTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRuleExemptionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>>
      createTagIndexingRuleExemptionWithHttpInfoAsync(
          String metricName, TagIndexingRuleExemptionCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " createTagIndexingRuleExemption"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createTagIndexingRuleExemption"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.createTagIndexingRuleExemption",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
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
        new GenericType<TagIndexingRuleExemptionResponse>() {});
  }

  /**
   * Delete tags for multiple metrics.
   *
   * <p>See {@link #deleteBulkTagsMetricsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return MetricBulkTagConfigResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<MetricBulkTagConfigResponse> deleteBulkTagsMetricsConfigurationAsync(
      MetricBulkTagConfigDeleteRequest body) {
    return deleteBulkTagsMetricsConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>Note</strong>: This endpoint is deprecated. Use <a
   * href="/api/latest/metrics/#create-a-tag-indexing-rule">Tag Indexing Rules</a> (<code>
   * POST /api/v2/metrics/tag-indexing-rules</code>) instead.
   *
   * <p>Delete all custom lists of queryable tag keys for a set of existing count, gauge, rate, and
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
   *
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
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
   * the <code>Manage Tags for Metrics</code> permission. Note: This operation is irreversible.
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

  /**
   * Delete a tag indexing rule.
   *
   * <p>See {@link #deleteTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagIndexingRule(String id) throws ApiException {
    deleteTagIndexingRuleWithHttpInfo(id);
  }

  /**
   * Delete a tag indexing rule.
   *
   * <p>See {@link #deleteTagIndexingRuleWithHttpInfoAsync}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagIndexingRuleAsync(String id) {
    return deleteTagIndexingRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Soft-delete a tag indexing rule. Idempotent: returns 204 whether the rule existed or was
   * already deleted. Remaining rules in the org are automatically re-sequenced to keep <code>
   * rule_order</code> dense and 1-based. Requires the <code>Manage Tags for Metrics</code>
   * permission.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTagIndexingRuleWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteTagIndexingRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.deleteTagIndexingRule",
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
   * Delete a tag indexing rule.
   *
   * <p>See {@link #deleteTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagIndexingRuleWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteTagIndexingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.deleteTagIndexingRule",
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
   * Delete a tag indexing rule exemption.
   *
   * <p>See {@link #deleteTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagIndexingRuleExemption(String metricName) throws ApiException {
    deleteTagIndexingRuleExemptionWithHttpInfo(metricName);
  }

  /**
   * Delete a tag indexing rule exemption.
   *
   * <p>See {@link #deleteTagIndexingRuleExemptionWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagIndexingRuleExemptionAsync(String metricName) {
    return deleteTagIndexingRuleExemptionWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a metric's exemption from tag indexing rules. Idempotent: returns 204 whether or not an
   * exemption existed. Any associated legacy tag configuration record is also removed. Requires the
   * <code>Manage Tags for Metrics</code> permission.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTagIndexingRuleExemptionWithHttpInfo(String metricName)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling"
              + " deleteTagIndexingRuleExemption");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.deleteTagIndexingRuleExemption",
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
   * Delete a tag indexing rule exemption.
   *
   * <p>See {@link #deleteTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagIndexingRuleExemptionWithHttpInfoAsync(
      String metricName) {
    // Check if unstable operation is enabled
    String operationId = "deleteTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " deleteTagIndexingRuleExemption"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.deleteTagIndexingRuleExemption",
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
     * @param filterGroups Comma-separated list of tag keys that the metric is configured to query
     *     with. For example: <code>filter[groups]=app,host</code>. (optional)
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

  /**
   * Get a tag indexing rule.
   *
   * <p>See {@link #getTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return TagIndexingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRuleResponse getTagIndexingRule(String id) throws ApiException {
    return getTagIndexingRuleWithHttpInfo(id).getData();
  }

  /**
   * Get a tag indexing rule.
   *
   * <p>See {@link #getTagIndexingRuleWithHttpInfoAsync}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return CompletableFuture&lt;TagIndexingRuleResponse&gt;
   */
  public CompletableFuture<TagIndexingRuleResponse> getTagIndexingRuleAsync(String id) {
    return getTagIndexingRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single tag indexing rule by its UUID.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return ApiResponse&lt;TagIndexingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRuleResponse> getTagIndexingRuleWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getTagIndexingRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.getTagIndexingRule",
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
        new GenericType<TagIndexingRuleResponse>() {});
  }

  /**
   * Get a tag indexing rule.
   *
   * <p>See {@link #getTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRuleResponse>>
      getTagIndexingRuleWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getTagIndexingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.getTagIndexingRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagIndexingRuleResponse>() {});
  }

  /**
   * Get a tag indexing rule exemption.
   *
   * <p>See {@link #getTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return TagIndexingRuleExemptionResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRuleExemptionResponse getTagIndexingRuleExemption(String metricName)
      throws ApiException {
    return getTagIndexingRuleExemptionWithHttpInfo(metricName).getData();
  }

  /**
   * Get a tag indexing rule exemption.
   *
   * <p>See {@link #getTagIndexingRuleExemptionWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;TagIndexingRuleExemptionResponse&gt;
   */
  public CompletableFuture<TagIndexingRuleExemptionResponse> getTagIndexingRuleExemptionAsync(
      String metricName) {
    return getTagIndexingRuleExemptionWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns why a metric is excluded from tag indexing rules. Returns 200 with <code>kind=exemption
   * </code> when an explicit exemption exists, 200 with <code>kind=legacy_tag_configuration</code>
   * when the metric has a legacy tag configuration acting as an implicit exclusion, or 404 when
   * neither applies.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;TagIndexingRuleExemptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRuleExemptionResponse> getTagIndexingRuleExemptionWithHttpInfo(
      String metricName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling getTagIndexingRuleExemption");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.getTagIndexingRuleExemption",
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
        new GenericType<TagIndexingRuleExemptionResponse>() {});
  }

  /**
   * Get a tag indexing rule exemption.
   *
   * <p>See {@link #getTagIndexingRuleExemptionWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRuleExemptionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>>
      getTagIndexingRuleExemptionWithHttpInfoAsync(String metricName) {
    // Check if unstable operation is enabled
    String operationId = "getTagIndexingRuleExemption";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " getTagIndexingRuleExemption"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rule-exemptions"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.getTagIndexingRuleExemption",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRuleExemptionResponse>> result =
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
        new GenericType<TagIndexingRuleExemptionResponse>() {});
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
    private Boolean filterIsConfigurable;
    private String filterTagsConfigured;
    private MetricTagConfigurationMetricTypeCategory filterMetricType;
    private Boolean filterIncludePercentiles;
    private Boolean filterQueried;
    private Long filterQueriedWindowSeconds;
    private String filterTags;
    private Boolean filterRelatedAssets;
    private String include;
    private String sort;
    private Long windowSeconds;
    private Integer pageSize;
    private String pageCursor;

    /**
     * Set filterConfigured.
     *
     * @param filterConfigured Only return custom metrics that have been configured (<code>true
     *     </code>) or not configured (<code>false</code>) with Metrics Without Limits. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterConfigured(Boolean filterConfigured) {
      this.filterConfigured = filterConfigured;
      return this;
    }

    /**
     * Set filterIsConfigurable.
     *
     * @param filterIsConfigurable Only return metrics that are eligible (<code>true</code>) or
     *     ineligible (<code>false</code>) for configuration with Metrics Without Limits. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterIsConfigurable(
        Boolean filterIsConfigurable) {
      this.filterIsConfigurable = filterIsConfigurable;
      return this;
    }

    /**
     * Set filterTagsConfigured.
     *
     * @param filterTagsConfigured Only return metrics that have the given tag key(s) in their
     *     Metrics Without Limits configuration (included or excluded). (optional)
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
     * @param filterMetricType Only return metrics of the given metric type. (optional, default to
     *     "distribution")
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
     * @param filterIncludePercentiles Only return distribution metrics that have percentile
     *     aggregations enabled (true) or disabled (false). (optional)
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
     * @param filterQueried Only return metrics that have been queried (true) or not queried (false)
     *     in the look back window. Set the window with <code>filter[queried][window][seconds]
     *     </code>; if omitted, a default window is used. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterQueried(Boolean filterQueried) {
      this.filterQueried = filterQueried;
      return this;
    }

    /**
     * Set filterQueriedWindowSeconds.
     *
     * @param filterQueriedWindowSeconds This parameter has no effect unless <code>filter[queried]
     *     </code> is also set. Only return metrics that have been queried or not queried in the
     *     specified window. The default value is 2,592,000 seconds (30 days), the maximum value is
     *     15,552,000 seconds (180 days), and the minimum value is 1 second. For example: <code>
     *     filter[queried]=true&amp;filter[queried][window][seconds]=604800</code>. (optional,
     *     default to 2592000)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterQueriedWindowSeconds(
        Long filterQueriedWindowSeconds) {
      this.filterQueriedWindowSeconds = filterQueriedWindowSeconds;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Only return metrics that were submitted with tags matching this expression.
     *     You can use AND, OR, IN, and wildcards. For example: <code>
     *     filter[tags]=env IN (staging,test) AND service:web*</code>. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterRelatedAssets.
     *
     * @param filterRelatedAssets Only return metrics that are used in at least one dashboard,
     *     monitor, notebook, or SLO. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters filterRelatedAssets(
        Boolean filterRelatedAssets) {
      this.filterRelatedAssets = filterRelatedAssets;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Include related resources in the response. Set to <code>metric_volumes</code>
     *     to include indexed and ingested volume counts for each metric. (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort results by metric volume. Prefix a key with <code>-</code> for descending
     *     order. Supported keys: <code>metric_volumes.indexed_volume</code>, <code>
     *     metric_volumes.ingested_volume</code>, <code>metric_volumes.indexed_volume_delta</code>,
     *     <code>metric_volumes.ingested_volume_delta</code>. Requires a paginated request (<code>
     *     page[size]</code> or <code>page[cursor]</code>). (optional)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set windowSeconds.
     *
     * @param windowSeconds Only return metrics that have been actively reporting in the specified
     *     window. The default value is 3600 seconds (1 hour), the maximum value is 2,592,000
     *     seconds (30 days), and the minimum value is 1 second. (optional, default to 3600)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of results per page. Send <code>page[size]</code> on the first
     *     request to opt in to pagination. On each subsequent request, send <code>page[cursor]
     *     </code> set to the value of <code>meta.pagination.next_cursor</code> from the previous
     *     response. The default value is 10000, the maximum value is 10000, and the minimum value
     *     is 1. (optional, default to 10000)
     * @return ListTagConfigurationsOptionalParameters
     */
    public ListTagConfigurationsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Cursor for pagination. Use <code>page[size]</code> to opt-in to pagination
     *     and get the first page; for subsequent pages, use the value from <code>
     *     meta.pagination.next_cursor</code> in the response. Pagination is complete when <code>
     *     next_cursor</code> is null. (optional)
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
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get a list of actively reporting metrics for your organization. Pagination is optional using
   * the <code>page[cursor]</code> and <code>page[size]</code> query parameters.
   *
   * <p>Query parameters use bracket notation (for example, <code>filter[tags]</code>, <code>
   * filter[queried][window][seconds]</code>). Pass them as standard URL query strings, URL-encoding
   * the brackets if your client does not handle them. For example: <code>
   * GET /api/v2/metrics?filter[tags]=env:prod&amp;window[seconds]=86400&amp;page[size]=500</code>.
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
    Boolean filterIsConfigurable = parameters.filterIsConfigurable;
    String filterTagsConfigured = parameters.filterTagsConfigured;
    MetricTagConfigurationMetricTypeCategory filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    Boolean filterQueried = parameters.filterQueried;
    Long filterQueriedWindowSeconds = parameters.filterQueriedWindowSeconds;
    String filterTags = parameters.filterTags;
    Boolean filterRelatedAssets = parameters.filterRelatedAssets;
    String include = parameters.include;
    String sort = parameters.sort;
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
        apiClient.parameterToPairs("", "filter[is_configurable]", filterIsConfigurable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[tags_configured]", filterTagsConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[metric_type]", filterMetricType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_percentiles]", filterIncludePercentiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[queried]", filterQueried));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[queried][window][seconds]", filterQueriedWindowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[related_assets]", filterRelatedAssets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
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
    Boolean filterIsConfigurable = parameters.filterIsConfigurable;
    String filterTagsConfigured = parameters.filterTagsConfigured;
    MetricTagConfigurationMetricTypeCategory filterMetricType = parameters.filterMetricType;
    Boolean filterIncludePercentiles = parameters.filterIncludePercentiles;
    Boolean filterQueried = parameters.filterQueried;
    Long filterQueriedWindowSeconds = parameters.filterQueriedWindowSeconds;
    String filterTags = parameters.filterTags;
    Boolean filterRelatedAssets = parameters.filterRelatedAssets;
    String include = parameters.include;
    String sort = parameters.sort;
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
        apiClient.parameterToPairs("", "filter[is_configurable]", filterIsConfigurable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[tags_configured]", filterTagsConfigured));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[metric_type]", filterMetricType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[include_percentiles]", filterIncludePercentiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[queried]", filterQueried));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[queried][window][seconds]", filterQueriedWindowSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[related_assets]", filterRelatedAssets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
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

  /** Manage optional parameters to listTagIndexingRules. */
  public static class ListTagIndexingRulesOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;
    private String search;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Page size (1–1000, default 100). (optional)
     * @return ListTagIndexingRulesOptionalParameters
     */
    public ListTagIndexingRulesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Page offset from the start of the list (default 0). (optional)
     * @return ListTagIndexingRulesOptionalParameters
     */
    public ListTagIndexingRulesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Substring filter on rule name. (optional)
     * @return ListTagIndexingRulesOptionalParameters
     */
    public ListTagIndexingRulesOptionalParameters search(String search) {
      this.search = search;
      return this;
    }
  }

  /**
   * List tag indexing rules.
   *
   * <p>See {@link #listTagIndexingRulesWithHttpInfo}.
   *
   * @return TagIndexingRulesResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRulesResponse listTagIndexingRules() throws ApiException {
    return listTagIndexingRulesWithHttpInfo(new ListTagIndexingRulesOptionalParameters()).getData();
  }

  /**
   * List tag indexing rules.
   *
   * <p>See {@link #listTagIndexingRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TagIndexingRulesResponse&gt;
   */
  public CompletableFuture<TagIndexingRulesResponse> listTagIndexingRulesAsync() {
    return listTagIndexingRulesWithHttpInfoAsync(new ListTagIndexingRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag indexing rules.
   *
   * <p>See {@link #listTagIndexingRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TagIndexingRulesResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRulesResponse listTagIndexingRules(
      ListTagIndexingRulesOptionalParameters parameters) throws ApiException {
    return listTagIndexingRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List tag indexing rules.
   *
   * <p>See {@link #listTagIndexingRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagIndexingRulesResponse&gt;
   */
  public CompletableFuture<TagIndexingRulesResponse> listTagIndexingRulesAsync(
      ListTagIndexingRulesOptionalParameters parameters) {
    return listTagIndexingRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag indexing rules for an org, sorted by <code>rule_order</code>, with offset/limit
   * pagination.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagIndexingRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRulesResponse> listTagIndexingRulesWithHttpInfo(
      ListTagIndexingRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTagIndexingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listTagIndexingRules",
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
        new GenericType<TagIndexingRulesResponse>() {});
  }

  /**
   * List tag indexing rules.
   *
   * <p>See {@link #listTagIndexingRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRulesResponse>>
      listTagIndexingRulesWithHttpInfoAsync(ListTagIndexingRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTagIndexingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listTagIndexingRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagIndexingRulesResponse>() {});
  }

  /**
   * List tag indexing rules for a metric.
   *
   * <p>See {@link #listTagIndexingRulesForMetricWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return TagIndexingRulesResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRulesResponse listTagIndexingRulesForMetric(String metricName)
      throws ApiException {
    return listTagIndexingRulesForMetricWithHttpInfo(metricName).getData();
  }

  /**
   * List tag indexing rules for a metric.
   *
   * <p>See {@link #listTagIndexingRulesForMetricWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;TagIndexingRulesResponse&gt;
   */
  public CompletableFuture<TagIndexingRulesResponse> listTagIndexingRulesForMetricAsync(
      String metricName) {
    return listTagIndexingRulesForMetricWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the tag indexing rules that apply to a given metric, sorted by <code>rule_order</code>.
   * Matching is performed server-side using each rule's <code>metric_name_matches</code> glob
   * patterns.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;TagIndexingRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRulesResponse> listTagIndexingRulesForMetricWithHttpInfo(
      String metricName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTagIndexingRulesForMetric";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricName' when calling listTagIndexingRulesForMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rules"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listTagIndexingRulesForMetric",
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
        new GenericType<TagIndexingRulesResponse>() {});
  }

  /**
   * List tag indexing rules for a metric.
   *
   * <p>See {@link #listTagIndexingRulesForMetricWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRulesResponse>>
      listTagIndexingRulesForMetricWithHttpInfoAsync(String metricName) {
    // Check if unstable operation is enabled
    String operationId = "listTagIndexingRulesForMetric";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      CompletableFuture<ApiResponse<TagIndexingRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricName' when calling"
                  + " listTagIndexingRulesForMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/tag-indexing-rules"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listTagIndexingRulesForMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagIndexingRulesResponse>() {});
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

  /** Manage optional parameters to listVolumesByMetricName. */
  public static class ListVolumesByMetricNameOptionalParameters {
    private Long windowSeconds;

    /**
     * Set windowSeconds.
     *
     * @param windowSeconds The number of seconds of look back (from now). Default value is 3,600 (1
     *     hour), maximum value is 2,592,000 (1 month). (optional)
     * @return ListVolumesByMetricNameOptionalParameters
     */
    public ListVolumesByMetricNameOptionalParameters windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }
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
    return listVolumesByMetricNameWithHttpInfo(
            metricName, new ListVolumesByMetricNameOptionalParameters())
        .getData();
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
    return listVolumesByMetricNameWithHttpInfoAsync(
            metricName, new ListVolumesByMetricNameOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List distinct metric volumes by metric name.
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricVolumesResponse
   * @throws ApiException if fails to make API call
   */
  public MetricVolumesResponse listVolumesByMetricName(
      String metricName, ListVolumesByMetricNameOptionalParameters parameters) throws ApiException {
    return listVolumesByMetricNameWithHttpInfo(metricName, parameters).getData();
  }

  /**
   * List distinct metric volumes by metric name.
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfoAsync}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MetricVolumesResponse&gt;
   */
  public CompletableFuture<MetricVolumesResponse> listVolumesByMetricNameAsync(
      String metricName, ListVolumesByMetricNameOptionalParameters parameters) {
    return listVolumesByMetricNameWithHttpInfoAsync(metricName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * View hourly average cardinality for the given metric name over the look back period. For Metric
   * Name Pricing customers, view total point volume for the given metric name over the look back
   * period.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
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
  public ApiResponse<MetricVolumesResponse> listVolumesByMetricNameWithHttpInfo(
      String metricName, ListVolumesByMetricNameOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricName' when calling listVolumesByMetricName");
    }
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/volumes"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.listVolumesByMetricName",
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
        new GenericType<MetricVolumesResponse>() {});
  }

  /**
   * List distinct metric volumes by metric name.
   *
   * <p>See {@link #listVolumesByMetricNameWithHttpInfo}.
   *
   * @param metricName The name of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MetricVolumesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MetricVolumesResponse>>
      listVolumesByMetricNameWithHttpInfoAsync(
          String metricName, ListVolumesByMetricNameOptionalParameters parameters) {
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
    Long windowSeconds = parameters.windowSeconds;
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/{metric_name}/volumes"
            .replaceAll(
                "\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window[seconds]", windowSeconds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.listVolumesByMetricName",
              localVarPath,
              localVarQueryParams,
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

  /**
   * Reorder tag indexing rules.
   *
   * <p>See {@link #reorderTagIndexingRulesWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void reorderTagIndexingRules(TagIndexingRuleOrderRequest body) throws ApiException {
    reorderTagIndexingRulesWithHttpInfo(body);
  }

  /**
   * Reorder tag indexing rules.
   *
   * <p>See {@link #reorderTagIndexingRulesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> reorderTagIndexingRulesAsync(TagIndexingRuleOrderRequest body) {
    return reorderTagIndexingRulesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Atomically re-sequence the tag indexing rules for an org to match the supplied list of rule
   * UUIDs. The server assigns <code>rule_order</code> 1, 2, … matching each rule UUID by position
   * in the list. The UUIDs of all active rules must be provided; omitting any active rule UUID
   * returns a 400 error. Requires the <code>Manage Tags for Metrics</code> permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> reorderTagIndexingRulesWithHttpInfo(TagIndexingRuleOrderRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "reorderTagIndexingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling reorderTagIndexingRules");
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules/order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.reorderTagIndexingRules",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Reorder tag indexing rules.
   *
   * <p>See {@link #reorderTagIndexingRulesWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> reorderTagIndexingRulesWithHttpInfoAsync(
      TagIndexingRuleOrderRequest body) {
    // Check if unstable operation is enabled
    String operationId = "reorderTagIndexingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling reorderTagIndexingRules"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/metrics/tag-indexing-rules/order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.reorderTagIndexingRules",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

  /**
   * Update a tag indexing rule.
   *
   * <p>See {@link #updateTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @param body (required)
   * @return TagIndexingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagIndexingRuleResponse updateTagIndexingRule(String id, TagIndexingRuleUpdateRequest body)
      throws ApiException {
    return updateTagIndexingRuleWithHttpInfo(id, body).getData();
  }

  /**
   * Update a tag indexing rule.
   *
   * <p>See {@link #updateTagIndexingRuleWithHttpInfoAsync}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TagIndexingRuleResponse&gt;
   */
  public CompletableFuture<TagIndexingRuleResponse> updateTagIndexingRuleAsync(
      String id, TagIndexingRuleUpdateRequest body) {
    return updateTagIndexingRuleWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update a tag indexing rule. Fields omitted from the request body are left unchanged.
   * Setting <code>rule_order</code> to a value already used by another rule returns 409; use the
   * reorder endpoint for atomic re-sequencing. Requires the <code>Manage Tags for Metrics</code>
   * permission.
   *
   * @param id ID of the tag indexing rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;TagIndexingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagIndexingRuleResponse> updateTagIndexingRuleWithHttpInfo(
      String id, TagIndexingRuleUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateTagIndexingRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTagIndexingRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MetricsApi.updateTagIndexingRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TagIndexingRuleResponse>() {});
  }

  /**
   * Update a tag indexing rule.
   *
   * <p>See {@link #updateTagIndexingRuleWithHttpInfo}.
   *
   * @param id ID of the tag indexing rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagIndexingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagIndexingRuleResponse>>
      updateTagIndexingRuleWithHttpInfoAsync(String id, TagIndexingRuleUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTagIndexingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateTagIndexingRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTagIndexingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/metrics/tag-indexing-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MetricsApi.updateTagIndexingRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagIndexingRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagIndexingRuleResponse>() {});
  }
}
