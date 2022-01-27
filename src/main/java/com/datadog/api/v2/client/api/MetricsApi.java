package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.MetricAllTagsResponse;
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
   * Create a tag configuration Create and define a list of queryable tag keys for an existing
   * count/gauge/rate/distribution metric. Optionally, include percentile aggregations on any
   * distribution metric or configure custom aggregations on any count, rate, or gauge metric. Can
   * only be used with application keys of users with the &#x60;Manage Tags for Metrics&#x60;
   * permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricTagConfigurationResponse createTagConfiguration(
      String metricName, MetricTagConfigurationCreateRequest body) throws ApiException {
    return createTagConfigurationWithHttpInfo(metricName, body).getData();
  }

  public CompletableFuture<MetricTagConfigurationResponse> createTagConfigurationAsync(
      String metricName, MetricTagConfigurationCreateRequest body) {
    return createTagConfigurationWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a tag configuration Create and define a list of queryable tag keys for an existing
   * count/gauge/rate/distribution metric. Optionally, include percentile aggregations on any
   * distribution metric or configure custom aggregations on any count, rate, or gauge metric. Can
   * only be used with application keys of users with the &#x60;Manage Tags for Metrics&#x60;
   * permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.createTagConfiguration",
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
   * Create a tag configuration Create and define a list of queryable tag keys for an existing
   * count/gauge/rate/distribution metric. Optionally, include percentile aggregations on any
   * distribution metric or configure custom aggregations on any count, rate, or gauge metric. Can
   * only be used with application keys of users with the &#x60;Manage Tags for Metrics&#x60;
   * permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.createTagConfiguration",
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
   * Delete a tag configuration Deletes a metric&#39;s tag configuration. Can only be used with
   * application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteTagConfiguration(String metricName) throws ApiException {
    deleteTagConfigurationWithHttpInfo(metricName);
  }

  public CompletableFuture<Void> deleteTagConfigurationAsync(String metricName) {
    return deleteTagConfigurationWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag configuration Deletes a metric&#39;s tag configuration. Can only be used with
   * application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "MetricsApi.deleteTagConfiguration",
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
   * Delete a tag configuration Deletes a metric&#39;s tag configuration. Can only be used with
   * application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "MetricsApi.deleteTagConfiguration",
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
   * List tag configuration by name Returns the tag configuration for the given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricTagConfigurationResponse listTagConfigurationByName(String metricName)
      throws ApiException {
    return listTagConfigurationByNameWithHttpInfo(metricName).getData();
  }

  public CompletableFuture<MetricTagConfigurationResponse> listTagConfigurationByNameAsync(
      String metricName) {
    return listTagConfigurationByNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag configuration by name Returns the tag configuration for the given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagConfigurationByName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.listTagConfigurationByName",
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
   * List tag configuration by name Returns the tag configuration for the given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagConfigurationByName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.listTagConfigurationByName",
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
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @return MetricsAndMetricTagConfigurationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricsAndMetricTagConfigurationsResponse listTagConfigurations() throws ApiException {
    return listTagConfigurationsWithHttpInfo(new ListTagConfigurationsOptionalParameters())
        .getData();
  }

  /**
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @return CompletableFuture<MetricsAndMetricTagConfigurationsResponse>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<MetricsAndMetricTagConfigurationsResponse> listTagConfigurationsAsync() {
    return listTagConfigurationsWithHttpInfoAsync(new ListTagConfigurationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @param parameters Optional parameters for the request.
   * @return MetricsAndMetricTagConfigurationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricsAndMetricTagConfigurationsResponse listTagConfigurations(
      ListTagConfigurationsOptionalParameters parameters) throws ApiException {
    return listTagConfigurationsWithHttpInfo(parameters).getData();
  }

  /**
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture<MetricsAndMetricTagConfigurationsResponse>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricsAndMetricTagConfigurationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricsAndMetricTagConfigurationsResponse> localVarReturnType =
        new GenericType<MetricsAndMetricTagConfigurationsResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.listTagConfigurations",
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
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricsAndMetricTagConfigurationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricsAndMetricTagConfigurationsResponse> localVarReturnType =
        new GenericType<MetricsAndMetricTagConfigurationsResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.listTagConfigurations",
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
   * List tags by metric name View indexed tag key-value pairs for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricAllTagsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricAllTagsResponse listTagsByMetricName(String metricName) throws ApiException {
    return listTagsByMetricNameWithHttpInfo(metricName).getData();
  }

  public CompletableFuture<MetricAllTagsResponse> listTagsByMetricNameAsync(String metricName) {
    return listTagsByMetricNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tags by metric name View indexed tag key-value pairs for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricAllTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagsByMetricName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricAllTagsResponse> localVarReturnType =
        new GenericType<MetricAllTagsResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.listTagsByMetricName",
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
   * List tags by metric name View indexed tag key-value pairs for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricAllTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTagsByMetricName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricAllTagsResponse> localVarReturnType =
        new GenericType<MetricAllTagsResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.listTagsByMetricName",
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
   * List distinct metric volumes by metric name View distinct metrics volumes for the given metric
   * name. Custom distribution metrics will return both ingested and indexed custom metric volumes.
   * For Metrics without Limits&amp;trade; beta customers, all metrics will return both
   * ingested/indexed volumes. Custom metrics generated in-app from other products will return
   * &#x60;null&#x60; for ingested volumes.
   *
   * @param metricName The name of the metric. (required)
   * @return MetricVolumesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricVolumesResponse listVolumesByMetricName(String metricName) throws ApiException {
    return listVolumesByMetricNameWithHttpInfo(metricName).getData();
  }

  public CompletableFuture<MetricVolumesResponse> listVolumesByMetricNameAsync(String metricName) {
    return listVolumesByMetricNameWithHttpInfoAsync(metricName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List distinct metric volumes by metric name View distinct metrics volumes for the given metric
   * name. Custom distribution metrics will return both ingested and indexed custom metric volumes.
   * For Metrics without Limits&amp;trade; beta customers, all metrics will return both
   * ingested/indexed volumes. Custom metrics generated in-app from other products will return
   * &#x60;null&#x60; for ingested volumes.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricVolumesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listVolumesByMetricName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricVolumesResponse> localVarReturnType =
        new GenericType<MetricVolumesResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.listVolumesByMetricName",
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
   * List distinct metric volumes by metric name View distinct metrics volumes for the given metric
   * name. Custom distribution metrics will return both ingested and indexed custom metric volumes.
   * For Metrics without Limits&amp;trade; beta customers, all metrics will return both
   * ingested/indexed volumes. Custom metrics generated in-app from other products will return
   * &#x60;null&#x60; for ingested volumes.
   *
   * @param metricName The name of the metric. (required)
   * @return ApiResponse&lt;MetricVolumesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listVolumesByMetricName");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MetricVolumesResponse> localVarReturnType =
        new GenericType<MetricVolumesResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.listVolumesByMetricName",
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
   * Update a tag configuration Update the tag configuration of a metric or percentile aggregations
   * of a distribution metric or custom aggregations of a count, rate, or gauge metric. Can only be
   * used with application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return MetricTagConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricTagConfigurationResponse updateTagConfiguration(
      String metricName, MetricTagConfigurationUpdateRequest body) throws ApiException {
    return updateTagConfigurationWithHttpInfo(metricName, body).getData();
  }

  public CompletableFuture<MetricTagConfigurationResponse> updateTagConfigurationAsync(
      String metricName, MetricTagConfigurationUpdateRequest body) {
    return updateTagConfigurationWithHttpInfoAsync(metricName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a tag configuration Update the tag configuration of a metric or percentile aggregations
   * of a distribution metric or custom aggregations of a count, rate, or gauge metric. Can only be
   * used with application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPI(
        "MetricsApi.updateTagConfiguration",
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
   * Update a tag configuration Update the tag configuration of a metric or percentile aggregations
   * of a distribution metric or custom aggregations of a count, rate, or gauge metric. Can only be
   * used with application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTagConfiguration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<MetricTagConfigurationResponse> localVarReturnType =
        new GenericType<MetricTagConfigurationResponse>() {};

    return apiClient.invokeAPIAsync(
        "MetricsApi.updateTagConfiguration",
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
