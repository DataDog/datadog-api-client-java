package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.LogsMetricCreateRequest;
import com.datadog.api.v2.client.model.LogsMetricResponse;
import com.datadog.api.v2.client.model.LogsMetricUpdateRequest;
import com.datadog.api.v2.client.model.LogsMetricsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsMetricsApi {
  private ApiClient apiClient;

  public LogsMetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsMetricsApi(ApiClient apiClient) {
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


private ApiResponse<LogsMetricResponse> createLogsMetricWithHttpInfo(LogsMetricCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createLogsMetric");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsMetric");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI("LogsMetricsApi.createLogsMetric", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateLogsMetricRequest {
    private LogsMetricCreateRequest body;

    private APIcreateLogsMetricRequest() {
    }

    /**
     * Set body
     * @param body The definition of the new log-based metric. (required)
     * @return APIcreateLogsMetricRequest
     */
    public APIcreateLogsMetricRequest body(LogsMetricCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createLogsMetric request
     * @return LogsMetricResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsMetricResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createLogsMetric request with HTTP info returned
     * @return ApiResponse&lt;LogsMetricResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsMetricResponse> executeWithHttpInfo() throws ApiException {
      return createLogsMetricWithHttpInfo(body);
    }
  }

  /**
   * Create a log-based metric
   * Create a metric based on your ingested logs in your organization. Returns the log-based metric object from the request body when the request is successful.
   * @return createLogsMetricRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateLogsMetricRequest createLogsMetric() throws ApiException {
    return new APIcreateLogsMetricRequest();
  }

private ApiResponse<Void> deleteLogsMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling deleteLogsMetric");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsMetric");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsMetricsApi.deleteLogsMetric", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteLogsMetricRequest {
    private String metricId;

    private APIdeleteLogsMetricRequest(String metricId) {
      this.metricId = metricId;
    }

    /**
     * Execute deleteLogsMetric request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteLogsMetric request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteLogsMetricWithHttpInfo(metricId);
    }
  }

  /**
   * Delete a log-based metric
   * Delete a specific log-based metric from your organization.
   * @param metricId The name of the log-based metric. (required)
   * @return deleteLogsMetricRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteLogsMetricRequest deleteLogsMetric(String metricId) throws ApiException {
    return new APIdeleteLogsMetricRequest(metricId);
  }

private ApiResponse<LogsMetricResponse> getLogsMetricWithHttpInfo(String metricId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling getLogsMetric");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsMetric");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI("LogsMetricsApi.getLogsMetric", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetLogsMetricRequest {
    private String metricId;

    private APIgetLogsMetricRequest(String metricId) {
      this.metricId = metricId;
    }

    /**
     * Execute getLogsMetric request
     * @return LogsMetricResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsMetricResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsMetric request with HTTP info returned
     * @return ApiResponse&lt;LogsMetricResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsMetricResponse> executeWithHttpInfo() throws ApiException {
      return getLogsMetricWithHttpInfo(metricId);
    }
  }

  /**
   * Get a log-based metric
   * Get a specific log-based metric from your organization.
   * @param metricId The name of the log-based metric. (required)
   * @return getLogsMetricRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetLogsMetricRequest getLogsMetric(String metricId) throws ApiException {
    return new APIgetLogsMetricRequest(metricId);
  }

private ApiResponse<LogsMetricsResponse> listLogsMetricsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsMetricsResponse> localVarReturnType = new GenericType<LogsMetricsResponse>() {};

    return apiClient.invokeAPI("LogsMetricsApi.listLogsMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistLogsMetricsRequest {

    private APIlistLogsMetricsRequest() {
    }

    /**
     * Execute listLogsMetrics request
     * @return LogsMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogsMetrics request with HTTP info returned
     * @return ApiResponse&lt;LogsMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsMetricsResponse> executeWithHttpInfo() throws ApiException {
      return listLogsMetricsWithHttpInfo();
    }
  }

  /**
   * Get all log-based metrics
   * Get the list of configured log-based metrics with their definitions.
   * @return listLogsMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsMetricsRequest listLogsMetrics() throws ApiException {
    return new APIlistLogsMetricsRequest();
  }

private ApiResponse<LogsMetricResponse> updateLogsMetricWithHttpInfo(String metricId, LogsMetricUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(400, "Missing the required parameter 'metricId' when calling updateLogsMetric");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsMetric");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/metrics/{metric_id}"
      .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsMetric");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsMetricResponse> localVarReturnType = new GenericType<LogsMetricResponse>() {};

    return apiClient.invokeAPI("LogsMetricsApi.updateLogsMetric", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateLogsMetricRequest {
    private String metricId;
    private LogsMetricUpdateRequest body;

    private APIupdateLogsMetricRequest(String metricId) {
      this.metricId = metricId;
    }

    /**
     * Set body
     * @param body New definition of the log-based metric. (required)
     * @return APIupdateLogsMetricRequest
     */
    public APIupdateLogsMetricRequest body(LogsMetricUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateLogsMetric request
     * @return LogsMetricResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsMetricResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsMetric request with HTTP info returned
     * @return ApiResponse&lt;LogsMetricResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsMetricResponse> executeWithHttpInfo() throws ApiException {
      return updateLogsMetricWithHttpInfo(metricId, body);
    }
  }

  /**
   * Update a log-based metric
   * Update a specific log-based metric from your organization. Returns the log-based metric object from the request body when the request is successful.
   * @param metricId The name of the log-based metric. (required)
   * @return updateLogsMetricRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateLogsMetricRequest updateLogsMetric(String metricId) throws ApiException {
    return new APIupdateLogsMetricRequest(metricId);
  }
}
