package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.MetricMetadata;
import com.datadog.api.v1.client.model.MetricSearchResponse;
import com.datadog.api.v1.client.model.MetricsListResponse;
import com.datadog.api.v1.client.model.MetricsQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<MetricMetadata> getMetricMetadataWithHttpInfo(String metricName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(400, "Missing the required parameter 'metricName' when calling getMetricMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/metrics/{metric_name}"
      .replaceAll("\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMetricMetadata");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricMetadata> localVarReturnType = new GenericType<MetricMetadata>() {};
    return apiClient.invokeAPI("MetricsApi.getMetricMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetMetricMetadataRequest {
    private String metricName;

    private APIgetMetricMetadataRequest(String metricName) {
      this.metricName = metricName;
    }
    

    /**
     * Execute getMetricMetadata request
     * @return MetricMetadata
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public MetricMetadata execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getMetricMetadata request with HTTP info returned
     * @return ApiResponse&lt;MetricMetadata&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<MetricMetadata> executeWithHttpInfo() throws ApiException {
      return getMetricMetadataWithHttpInfo(metricName);
    }
  }

  /**
   * Get metric metadata
   * Get metadata about a specific metric.
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return getMetricMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetMetricMetadataRequest getMetricMetadata(String metricName) throws ApiException {
    return new APIgetMetricMetadataRequest(metricName);
  }

private ApiResponse<MetricsListResponse> listActiveMetricsWithHttpInfo(Long from, String host) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling listActiveMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "host", host));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listActiveMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricsListResponse> localVarReturnType = new GenericType<MetricsListResponse>() {};
    return apiClient.invokeAPI("MetricsApi.listActiveMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistActiveMetricsRequest {
    private Long from;
    private String host;

    private APIlistActiveMetricsRequest() {
    }
    

    /**
     * Set from
     * @param from Seconds since the Unix epoch. (required)
     * @return APIlistActiveMetricsRequest
     */
    public APIlistActiveMetricsRequest from(Long from) {
      this.from = from;
      return this;
    }
    

    /**
     * Set host
     * @param host Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag. (optional)
     * @return APIlistActiveMetricsRequest
     */
    public APIlistActiveMetricsRequest host(String host) {
      this.host = host;
      return this;
    }
    

    /**
     * Execute listActiveMetrics request
     * @return MetricsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public MetricsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listActiveMetrics request with HTTP info returned
     * @return ApiResponse&lt;MetricsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<MetricsListResponse> executeWithHttpInfo() throws ApiException {
      return listActiveMetricsWithHttpInfo(from, host);
    }
  }

  /**
   * Get active metrics list
   * Get the list of actively reporting metrics from a given time until now.
   * @return listActiveMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistActiveMetricsRequest listActiveMetrics() throws ApiException {
    return new APIlistActiveMetricsRequest();
  }

private ApiResponse<MetricSearchResponse> listMetricsWithHttpInfo(String q) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling listMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricSearchResponse> localVarReturnType = new GenericType<MetricSearchResponse>() {};
    return apiClient.invokeAPI("MetricsApi.listMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistMetricsRequest {
    private String q;

    private APIlistMetricsRequest() {
    }
    

    /**
     * Set q
     * @param q Query string to search metrics upon. Must be prefixed with &#x60;metrics:&#x60;. (required)
     * @return APIlistMetricsRequest
     */
    public APIlistMetricsRequest q(String q) {
      this.q = q;
      return this;
    }
    

    /**
     * Execute listMetrics request
     * @return MetricSearchResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public MetricSearchResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMetrics request with HTTP info returned
     * @return ApiResponse&lt;MetricSearchResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<MetricSearchResponse> executeWithHttpInfo() throws ApiException {
      return listMetricsWithHttpInfo(q);
    }
  }

  /**
   * Search metrics
   * Search for metrics from the last 24 hours in Datadog.
   * @return listMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistMetricsRequest listMetrics() throws ApiException {
    return new APIlistMetricsRequest();
  }

private ApiResponse<MetricsQueryResponse> queryMetricsWithHttpInfo(Long from, Long to, String query) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling queryMetrics");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling queryMetrics");
    }
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling queryMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/query";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "queryMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricsQueryResponse> localVarReturnType = new GenericType<MetricsQueryResponse>() {};
    return apiClient.invokeAPI("MetricsApi.queryMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIqueryMetricsRequest {
    private Long from;
    private Long to;
    private String query;

    private APIqueryMetricsRequest() {
    }
    

    /**
     * Set from
     * @param from Start of the queried time period, seconds since the Unix epoch. (required)
     * @return APIqueryMetricsRequest
     */
    public APIqueryMetricsRequest from(Long from) {
      this.from = from;
      return this;
    }
    

    /**
     * Set to
     * @param to End of the queried time period, seconds since the Unix epoch. (required)
     * @return APIqueryMetricsRequest
     */
    public APIqueryMetricsRequest to(Long to) {
      this.to = to;
      return this;
    }
    

    /**
     * Set query
     * @param query Query string. (required)
     * @return APIqueryMetricsRequest
     */
    public APIqueryMetricsRequest query(String query) {
      this.query = query;
      return this;
    }
    

    /**
     * Execute queryMetrics request
     * @return MetricsQueryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public MetricsQueryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute queryMetrics request with HTTP info returned
     * @return ApiResponse&lt;MetricsQueryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<MetricsQueryResponse> executeWithHttpInfo() throws ApiException {
      return queryMetricsWithHttpInfo(from, to, query);
    }
  }

  /**
   * Query timeseries points
   * Query timeseries points.
   * @return queryMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIqueryMetricsRequest queryMetrics() throws ApiException {
    return new APIqueryMetricsRequest();
  }

private ApiResponse<MetricMetadata> updateMetricMetadataWithHttpInfo(String metricName, MetricMetadata body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(400, "Missing the required parameter 'metricName' when calling updateMetricMetadata");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMetricMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/metrics/{metric_name}"
      .replaceAll("\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateMetricMetadata");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricMetadata> localVarReturnType = new GenericType<MetricMetadata>() {};
    return apiClient.invokeAPI("MetricsApi.updateMetricMetadata", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateMetricMetadataRequest {
    private String metricName;
    private MetricMetadata body;

    private APIupdateMetricMetadataRequest(String metricName) {
      this.metricName = metricName;
    }
    

    /**
     * Set body
     * @param body New metadata. (required)
     * @return APIupdateMetricMetadataRequest
     */
    public APIupdateMetricMetadataRequest body(MetricMetadata body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateMetricMetadata request
     * @return MetricMetadata
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public MetricMetadata execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateMetricMetadata request with HTTP info returned
     * @return ApiResponse&lt;MetricMetadata&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<MetricMetadata> executeWithHttpInfo() throws ApiException {
      return updateMetricMetadataWithHttpInfo(metricName, body);
    }
  }

  /**
   * Edit metric metadata
   * Edit metadata of a specific metric. Find out more about [supported types](https://docs.datadoghq.com/developers/metrics).
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @return updateMetricMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateMetricMetadataRequest updateMetricMetadata(String metricName) throws ApiException {
    return new APIupdateMetricMetadataRequest(metricName);
  }
}
