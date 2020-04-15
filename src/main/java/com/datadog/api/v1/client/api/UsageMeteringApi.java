package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import java.time.OffsetDateTime;
import com.datadog.api.v1.client.model.UsageFargateResponse;
import com.datadog.api.v1.client.model.UsageHostsResponse;
import com.datadog.api.v1.client.model.UsageLambdaResponse;
import com.datadog.api.v1.client.model.UsageLogsByIndexResponse;
import com.datadog.api.v1.client.model.UsageLogsResponse;
import com.datadog.api.v1.client.model.UsageNetworkFlowsResponse;
import com.datadog.api.v1.client.model.UsageNetworkHostsResponse;
import com.datadog.api.v1.client.model.UsageRumSessionsResponse;
import com.datadog.api.v1.client.model.UsageSummaryResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsAPIResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsBrowserResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsResponse;
import com.datadog.api.v1.client.model.UsageTimeseriesResponse;
import com.datadog.api.v1.client.model.UsageTopAvgMetricsResponse;
import com.datadog.api.v1.client.model.UsageTraceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsageMeteringApi {
  private ApiClient apiClient;

  public UsageMeteringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageMeteringApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<UsageFargateResponse> getUsageFargateWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageFargate");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageFargate");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageFargateResponse> localVarReturnType = new GenericType<UsageFargateResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageFargate", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageFargateRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageFargateRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageFargateRequest
     */
    public APIgetUsageFargateRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageFargateRequest
     */
    public APIgetUsageFargateRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageFargate request
     * @return UsageFargateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageFargateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageFargate request with HTTP info returned
     * @return ApiResponse&lt;UsageFargateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageFargateResponse> executeWithHttpInfo() throws ApiException {
      return getUsageFargateWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Fargate
   * Get hourly usage for [fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
   * @return getUsageFargateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageFargateRequest getUsageFargate() throws ApiException {
    return new APIgetUsageFargateRequest();
  }

private ApiResponse<UsageHostsResponse> getUsageHostsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageHosts");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageHosts");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageHostsResponse> localVarReturnType = new GenericType<UsageHostsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageHostsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageHostsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageHostsRequest
     */
    public APIgetUsageHostsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageHostsRequest
     */
    public APIgetUsageHostsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageHosts request
     * @return UsageHostsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageHostsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageHosts request with HTTP info returned
     * @return ApiResponse&lt;UsageHostsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageHostsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageHostsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for hosts and containers
   * Get hourly usage for hosts and containers.
   * @return getUsageHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageHostsRequest getUsageHosts() throws ApiException {
    return new APIgetUsageHostsRequest();
  }

private ApiResponse<UsageLambdaResponse> getUsageLambdaWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambda");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLambda");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLambdaResponse> localVarReturnType = new GenericType<UsageLambdaResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageLambda", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageLambdaRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageLambdaRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageLambdaRequest
     */
    public APIgetUsageLambdaRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageLambdaRequest
     */
    public APIgetUsageLambdaRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageLambda request
     * @return UsageLambdaResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLambdaResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLambda request with HTTP info returned
     * @return ApiResponse&lt;UsageLambdaResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageLambdaResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLambdaWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Lambda
   * Get hourly usage for lambda.
   * @return getUsageLambdaRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageLambdaRequest getUsageLambda() throws ApiException {
    return new APIgetUsageLambdaRequest();
  }

private ApiResponse<UsageLogsResponse> getUsageLogsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogs");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLogsResponse> localVarReturnType = new GenericType<UsageLogsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageLogsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageLogsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageLogsRequest
     */
    public APIgetUsageLogsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageLogsRequest
     */
    public APIgetUsageLogsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageLogs request
     * @return UsageLogsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLogsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLogs request with HTTP info returned
     * @return ApiResponse&lt;UsageLogsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageLogsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLogsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Logs
   * Get hourly usage for logs.
   * @return getUsageLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageLogsRequest getUsageLogs() throws ApiException {
    return new APIgetUsageLogsRequest();
  }

private ApiResponse<UsageLogsByIndexResponse> getUsageLogsByIndexWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr, List<String> indexName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByIndex");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLogsByIndexResponse> localVarReturnType = new GenericType<UsageLogsByIndexResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageLogsByIndex", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageLogsByIndexRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;
    private List<String> indexName;

    private APIgetUsageLogsByIndexRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Set indexName
     * @param indexName Comma-separated list of log index names. (optional)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest indexName(List<String> indexName) {
      this.indexName = indexName;
      return this;
    }
    

    /**
     * Execute getUsageLogsByIndex request
     * @return UsageLogsByIndexResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLogsByIndexResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLogsByIndex request with HTTP info returned
     * @return ApiResponse&lt;UsageLogsByIndexResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageLogsByIndexResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLogsByIndexWithHttpInfo(startHr, endHr, indexName);
    }
  }

  /**
   * Get hourly usage for Logs by Index
   * Get hourly usage for logs by index.
   * @return getUsageLogsByIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageLogsByIndexRequest getUsageLogsByIndex() throws ApiException {
    return new APIgetUsageLogsByIndexRequest();
  }

private ApiResponse<UsageNetworkFlowsResponse> getUsageNetworkFlowsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkFlows");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageNetworkFlowsResponse> localVarReturnType = new GenericType<UsageNetworkFlowsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageNetworkFlows", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageNetworkFlowsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageNetworkFlowsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageNetworkFlowsRequest
     */
    public APIgetUsageNetworkFlowsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageNetworkFlowsRequest
     */
    public APIgetUsageNetworkFlowsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageNetworkFlows request
     * @return UsageNetworkFlowsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageNetworkFlowsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageNetworkFlows request with HTTP info returned
     * @return ApiResponse&lt;UsageNetworkFlowsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageNetworkFlowsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageNetworkFlowsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Network Flows
   * Get hourly usage for network flows.
   * @return getUsageNetworkFlowsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageNetworkFlowsRequest getUsageNetworkFlows() throws ApiException {
    return new APIgetUsageNetworkFlowsRequest();
  }

private ApiResponse<UsageNetworkHostsResponse> getUsageNetworkHostsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkHosts");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageNetworkHostsResponse> localVarReturnType = new GenericType<UsageNetworkHostsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageNetworkHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageNetworkHostsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageNetworkHostsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageNetworkHostsRequest
     */
    public APIgetUsageNetworkHostsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageNetworkHostsRequest
     */
    public APIgetUsageNetworkHostsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageNetworkHosts request
     * @return UsageNetworkHostsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageNetworkHostsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageNetworkHosts request with HTTP info returned
     * @return ApiResponse&lt;UsageNetworkHostsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageNetworkHostsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageNetworkHostsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Network Hosts
   * Get hourly usage for network hosts.
   * @return getUsageNetworkHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageNetworkHostsRequest getUsageNetworkHosts() throws ApiException {
    return new APIgetUsageNetworkHostsRequest();
  }

private ApiResponse<UsageRumSessionsResponse> getUsageRumSessionsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumSessions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumSessions");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageRumSessionsResponse> localVarReturnType = new GenericType<UsageRumSessionsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageRumSessions", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageRumSessionsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageRumSessionsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageRumSessionsRequest
     */
    public APIgetUsageRumSessionsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageRumSessionsRequest
     */
    public APIgetUsageRumSessionsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageRumSessions request
     * @return UsageRumSessionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageRumSessionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageRumSessions request with HTTP info returned
     * @return ApiResponse&lt;UsageRumSessionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageRumSessionsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageRumSessionsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for RUM Sessions
   * Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
   * @return getUsageRumSessionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageRumSessionsRequest getUsageRumSessions() throws ApiException {
    return new APIgetUsageRumSessionsRequest();
  }

private ApiResponse<UsageSummaryResponse> getUsageSummaryWithHttpInfo(OffsetDateTime startMonth, OffsetDateTime endMonth, Boolean includeOrgDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getUsageSummary");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSummary");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSummaryResponse> localVarReturnType = new GenericType<UsageSummaryResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageSummaryRequest {
    private OffsetDateTime startMonth;
    private OffsetDateTime endMonth;
    private Boolean includeOrgDetails;

    private APIgetUsageSummaryRequest() {
    }
    

    /**
     * Set startMonth
     * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning in this month. Maximum of 15 months ago. (required)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest startMonth(OffsetDateTime startMonth) {
      this.startMonth = startMonth;
      return this;
    }
    

    /**
     * Set endMonth
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage ending this month. (optional)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }
    

    /**
     * Set includeOrgDetails
     * @param includeOrgDetails Include usage summaries for each sub-org. (optional)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest includeOrgDetails(Boolean includeOrgDetails) {
      this.includeOrgDetails = includeOrgDetails;
      return this;
    }
    

    /**
     * Execute getUsageSummary request
     * @return UsageSummaryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSummaryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSummary request with HTTP info returned
     * @return ApiResponse&lt;UsageSummaryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageSummaryResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSummaryWithHttpInfo(startMonth, endMonth, includeOrgDetails);
    }
  }

  /**
   * Get usage across your multi-org account
   * Get usage across your multi-org account.
   * @return getUsageSummaryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageSummaryRequest getUsageSummary() throws ApiException {
    return new APIgetUsageSummaryRequest();
  }

private ApiResponse<UsageSyntheticsResponse> getUsageSyntheticsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSynthetics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSynthetics");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsResponse> localVarReturnType = new GenericType<UsageSyntheticsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageSynthetics", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageSyntheticsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageSyntheticsRequest
     */
    public APIgetUsageSyntheticsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageSyntheticsRequest
     */
    public APIgetUsageSyntheticsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageSynthetics request
     * @return UsageSyntheticsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public UsageSyntheticsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSynthetics request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<UsageSyntheticsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics API Checks
   * Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).
   * @return getUsageSyntheticsRequest
   * @throws ApiException if fails to make API call
   * @deprecated
   
   */
  @Deprecated
  public APIgetUsageSyntheticsRequest getUsageSynthetics() throws ApiException {
    return new APIgetUsageSyntheticsRequest();
  }

private ApiResponse<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsAPI");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsAPIResponse> localVarReturnType = new GenericType<UsageSyntheticsAPIResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageSyntheticsAPI", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageSyntheticsAPIRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsAPIRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageSyntheticsAPIRequest
     */
    public APIgetUsageSyntheticsAPIRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageSyntheticsAPIRequest
     */
    public APIgetUsageSyntheticsAPIRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageSyntheticsAPI request
     * @return UsageSyntheticsAPIResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSyntheticsAPIResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSyntheticsAPI request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsAPIResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageSyntheticsAPIResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsAPIWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics API Checks
   * Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).
   * @return getUsageSyntheticsAPIRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageSyntheticsAPIRequest getUsageSyntheticsAPI() throws ApiException {
    return new APIgetUsageSyntheticsAPIRequest();
  }

private ApiResponse<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsBrowser");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsBrowserResponse> localVarReturnType = new GenericType<UsageSyntheticsBrowserResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageSyntheticsBrowser", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageSyntheticsBrowserRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsBrowserRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageSyntheticsBrowserRequest
     */
    public APIgetUsageSyntheticsBrowserRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageSyntheticsBrowserRequest
     */
    public APIgetUsageSyntheticsBrowserRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageSyntheticsBrowser request
     * @return UsageSyntheticsBrowserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSyntheticsBrowserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSyntheticsBrowser request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageSyntheticsBrowserResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsBrowserWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   * Get hourly usage for synthetics browser checks.
   * @return getUsageSyntheticsBrowserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageSyntheticsBrowserRequest getUsageSyntheticsBrowser() throws ApiException {
    return new APIgetUsageSyntheticsBrowserRequest();
  }

private ApiResponse<UsageTimeseriesResponse> getUsageTimeseriesWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTimeseries");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTimeseries");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTimeseriesResponse> localVarReturnType = new GenericType<UsageTimeseriesResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageTimeseries", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageTimeseriesRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageTimeseriesRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageTimeseriesRequest
     */
    public APIgetUsageTimeseriesRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageTimeseriesRequest
     */
    public APIgetUsageTimeseriesRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageTimeseries request
     * @return UsageTimeseriesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageTimeseriesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTimeseries request with HTTP info returned
     * @return ApiResponse&lt;UsageTimeseriesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTimeseriesResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTimeseriesWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for custom metrics
   * Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).
   * @return getUsageTimeseriesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageTimeseriesRequest getUsageTimeseries() throws ApiException {
    return new APIgetUsageTimeseriesRequest();
  }

private ApiResponse<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsWithHttpInfo(OffsetDateTime month, List<String> names) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'month' is set
    if (month == null) {
      throw new ApiException(400, "Missing the required parameter 'month' when calling getUsageTopAvgMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTopAvgMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTopAvgMetricsResponse> localVarReturnType = new GenericType<UsageTopAvgMetricsResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageTopAvgMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageTopAvgMetricsRequest {
    private OffsetDateTime month;
    private List<String> names;

    private APIgetUsageTopAvgMetricsRequest() {
    }
    

    /**
     * Set month
     * @param month Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (required)
     * @return APIgetUsageTopAvgMetricsRequest
     */
    public APIgetUsageTopAvgMetricsRequest month(OffsetDateTime month) {
      this.month = month;
      return this;
    }
    

    /**
     * Set names
     * @param names Comma-separated list of metric names. (optional)
     * @return APIgetUsageTopAvgMetricsRequest
     */
    public APIgetUsageTopAvgMetricsRequest names(List<String> names) {
      this.names = names;
      return this;
    }
    

    /**
     * Execute getUsageTopAvgMetrics request
     * @return UsageTopAvgMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageTopAvgMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTopAvgMetrics request with HTTP info returned
     * @return ApiResponse&lt;UsageTopAvgMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTopAvgMetricsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTopAvgMetricsWithHttpInfo(month, names);
    }
  }

  /**
   * Get top 500 custom metrics by hourly average
   * Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average.
   * @return getUsageTopAvgMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageTopAvgMetricsRequest getUsageTopAvgMetrics() throws ApiException {
    return new APIgetUsageTopAvgMetricsRequest();
  }

private ApiResponse<UsageTraceResponse> getUsageTraceWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTrace");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/traces";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTrace");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTraceResponse> localVarReturnType = new GenericType<UsageTraceResponse>() {};
    return apiClient.invokeAPI("UsageMeteringApi.getUsageTrace", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetUsageTraceRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageTraceRequest() {
    }
    

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour (required)
     * @return APIgetUsageTraceRequest
     */
    public APIgetUsageTraceRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }
    

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour (optional)
     * @return APIgetUsageTraceRequest
     */
    public APIgetUsageTraceRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
    

    /**
     * Execute getUsageTrace request
     * @return UsageTraceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageTraceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTrace request with HTTP info returned
     * @return ApiResponse&lt;UsageTraceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTraceResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTraceWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Trace Search
   * Get hourly usage for trace search.
   * @return getUsageTraceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageTraceRequest getUsageTrace() throws ApiException {
    return new APIgetUsageTraceRequest();
  }
}
