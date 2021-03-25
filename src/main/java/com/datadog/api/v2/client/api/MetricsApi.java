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
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  private ApiResponse<MetricTagConfigurationResponse> createTagConfigurationWithHttpInfo(
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

  public class APIcreateTagConfigurationRequest {
    private String metricName;
    private MetricTagConfigurationCreateRequest body;

    private APIcreateTagConfigurationRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateTagConfigurationRequest
     */
    public APIcreateTagConfigurationRequest body(MetricTagConfigurationCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createTagConfiguration request
     *
     * @return MetricTagConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricTagConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createTagConfiguration request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricTagConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return createTagConfigurationWithHttpInfo(metricName, body);
    }
  }

  /**
   * Create a tag configuration Create and define a list of queryable tag keys for a
   * count/gauge/rate/distribution metric. Optionally, include percentile aggregations on any
   * distribution metric. Can only be used with application keys of users with the &#x60;Manage Tags
   * for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return createTagConfigurationRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateTagConfigurationRequest createTagConfiguration(String metricName)
      throws ApiException {
    String operationId = "createTagConfiguration";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIcreateTagConfigurationRequest(metricName);
  }

  private ApiResponse<Void> deleteTagConfigurationWithHttpInfo(String metricName)
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

  public class APIdeleteTagConfigurationRequest {
    private String metricName;

    private APIdeleteTagConfigurationRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Execute deleteTagConfiguration request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteTagConfiguration request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteTagConfigurationWithHttpInfo(metricName);
    }
  }

  /**
   * Delete a tag configuration Deletes a metric&#39;s tag configuration. Can only be used with
   * application keys from users with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return deleteTagConfigurationRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteTagConfigurationRequest deleteTagConfiguration(String metricName)
      throws ApiException {
    String operationId = "deleteTagConfiguration";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIdeleteTagConfigurationRequest(metricName);
  }

  private ApiResponse<MetricTagConfigurationResponse> listTagConfigurationByNameWithHttpInfo(
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

  public class APIlistTagConfigurationByNameRequest {
    private String metricName;

    private APIlistTagConfigurationByNameRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Execute listTagConfigurationByName request
     *
     * @return MetricTagConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricTagConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listTagConfigurationByName request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricTagConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return listTagConfigurationByNameWithHttpInfo(metricName);
    }
  }

  /**
   * List tag configuration by name Returns the tag configuration for the given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return listTagConfigurationByNameRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistTagConfigurationByNameRequest listTagConfigurationByName(String metricName)
      throws ApiException {
    String operationId = "listTagConfigurationByName";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistTagConfigurationByNameRequest(metricName);
  }

  private ApiResponse<MetricsAndMetricTagConfigurationsResponse> listTagConfigurationsWithHttpInfo(
      Boolean filterConfigured,
      String filterTagsConfigured,
      MetricTagConfigurationMetricTypes filterMetricType,
      Boolean filterIncludePercentiles,
      String filterTags,
      Long windowSeconds)
      throws ApiException {
    Object localVarPostBody = null;

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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  public class APIlistTagConfigurationsRequest {
    private Boolean filterConfigured;
    private String filterTagsConfigured;
    private MetricTagConfigurationMetricTypes filterMetricType;
    private Boolean filterIncludePercentiles;
    private String filterTags;
    private Long windowSeconds;

    private APIlistTagConfigurationsRequest() {}

    /**
     * Set filterConfigured
     *
     * @param filterConfigured Filter metrics that have configured tags. (optional)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest filterConfigured(Boolean filterConfigured) {
      this.filterConfigured = filterConfigured;
      return this;
    }

    /**
     * Set filterTagsConfigured
     *
     * @param filterTagsConfigured Filter tag configurations by configured tags. (optional)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest filterTagsConfigured(String filterTagsConfigured) {
      this.filterTagsConfigured = filterTagsConfigured;
      return this;
    }

    /**
     * Set filterMetricType
     *
     * @param filterMetricType Filter tag configurations by metric type. (optional, default to
     *     gauge)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest filterMetricType(
        MetricTagConfigurationMetricTypes filterMetricType) {
      this.filterMetricType = filterMetricType;
      return this;
    }

    /**
     * Set filterIncludePercentiles
     *
     * @param filterIncludePercentiles Filter distributions with additional percentile aggregations
     *     enabled or disabled. (optional)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest filterIncludePercentiles(
        Boolean filterIncludePercentiles) {
      this.filterIncludePercentiles = filterIncludePercentiles;
      return this;
    }

    /**
     * Set filterTags
     *
     * @param filterTags Filter metrics that have been submitted with the given tags. Supports
     *     boolean and wildcard expressions. Cannot be combined with other filters. (optional)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set windowSeconds
     *
     * @param windowSeconds The number of seconds of look back (from now) to apply to a filter[tag]
     *     query. Defaults value is 3600 (1 hour), maximum value is 172,800 (2 days). (optional)
     * @return APIlistTagConfigurationsRequest
     */
    public APIlistTagConfigurationsRequest windowSeconds(Long windowSeconds) {
      this.windowSeconds = windowSeconds;
      return this;
    }

    /**
     * Execute listTagConfigurations request
     *
     * @return MetricsAndMetricTagConfigurationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricsAndMetricTagConfigurationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listTagConfigurations request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricsAndMetricTagConfigurationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricsAndMetricTagConfigurationsResponse> executeWithHttpInfo()
        throws ApiException {
      return listTagConfigurationsWithHttpInfo(
          filterConfigured,
          filterTagsConfigured,
          filterMetricType,
          filterIncludePercentiles,
          filterTags,
          windowSeconds);
    }
  }

  /**
   * List tag configurations Returns all configured count/gauge/rate/distribution metric names (with
   * additional filters if specified).
   *
   * @return listTagConfigurationsRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistTagConfigurationsRequest listTagConfigurations() throws ApiException {
    String operationId = "listTagConfigurations";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistTagConfigurationsRequest();
  }

  private ApiResponse<MetricAllTagsResponse> listTagsByMetricNameWithHttpInfo(String metricName)
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  public class APIlistTagsByMetricNameRequest {
    private String metricName;

    private APIlistTagsByMetricNameRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Execute listTagsByMetricName request
     *
     * @return MetricAllTagsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricAllTagsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listTagsByMetricName request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricAllTagsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricAllTagsResponse> executeWithHttpInfo() throws ApiException {
      return listTagsByMetricNameWithHttpInfo(metricName);
    }
  }

  /**
   * List tags by metric name View indexed tag key-value pairs for a given metric name.
   *
   * @param metricName The name of the metric. (required)
   * @return listTagsByMetricNameRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistTagsByMetricNameRequest listTagsByMetricName(String metricName)
      throws ApiException {
    String operationId = "listTagsByMetricName";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistTagsByMetricNameRequest(metricName);
  }

  private ApiResponse<MetricVolumesResponse> listVolumesByMetricNameWithHttpInfo(String metricName)
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  public class APIlistVolumesByMetricNameRequest {
    private String metricName;

    private APIlistVolumesByMetricNameRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Execute listVolumesByMetricName request
     *
     * @return MetricVolumesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricVolumesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listVolumesByMetricName request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricVolumesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricVolumesResponse> executeWithHttpInfo() throws ApiException {
      return listVolumesByMetricNameWithHttpInfo(metricName);
    }
  }

  /**
   * List distinct metric volumes by metric name View distinct metrics volumes for the given metric
   * name. Custom distribution metrics will return both ingested and indexed custom metric volumes.
   * For Metrics without Limits&amp;trade; beta customers, all metrics will return both
   * ingested/indexed volumes. Custom metrics generated in-app from other products will return
   * &#x60;null&#x60; for ingested volumes.
   *
   * @param metricName The name of the metric. (required)
   * @return listVolumesByMetricNameRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistVolumesByMetricNameRequest listVolumesByMetricName(String metricName)
      throws ApiException {
    String operationId = "listVolumesByMetricName";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistVolumesByMetricNameRequest(metricName);
  }

  private ApiResponse<MetricTagConfigurationResponse> updateTagConfigurationWithHttpInfo(
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

  public class APIupdateTagConfigurationRequest {
    private String metricName;
    private MetricTagConfigurationUpdateRequest body;

    private APIupdateTagConfigurationRequest(String metricName) {
      this.metricName = metricName;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateTagConfigurationRequest
     */
    public APIupdateTagConfigurationRequest body(MetricTagConfigurationUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateTagConfiguration request
     *
     * @return MetricTagConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public MetricTagConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTagConfiguration request with HTTP info returned
     *
     * @return ApiResponse&lt;MetricTagConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     * <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MetricTagConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return updateTagConfigurationWithHttpInfo(metricName, body);
    }
  }

  /**
   * Update a tag configuration Update the tag configuration of a metric or percentile aggregations
   * of a distribution metric. Can only be used with application keys from users with the
   * &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @param metricName The name of the metric. (required)
   * @return updateTagConfigurationRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateTagConfigurationRequest updateTagConfiguration(String metricName)
      throws ApiException {
    String operationId = "updateTagConfiguration";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateTagConfigurationRequest(metricName);
  }
}
