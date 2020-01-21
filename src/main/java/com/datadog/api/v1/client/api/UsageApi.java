package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error401;
import com.datadog.api.v1.client.model.Error403;
import java.time.OffsetDateTime;
import com.datadog.api.v1.client.model.UsageFargateResponse;
import com.datadog.api.v1.client.model.UsageHostsResponse;
import com.datadog.api.v1.client.model.UsageLogsResponse;
import com.datadog.api.v1.client.model.UsageSummaryResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsResponse;
import com.datadog.api.v1.client.model.UsageTimeseriesResponse;
import com.datadog.api.v1.client.model.UsageTopAvgMetricsResponse;
import com.datadog.api.v1.client.model.UsageTraceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsageApi {
  private ApiClient apiClient;

  public UsageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageApi(ApiClient apiClient) {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageFargateResponse> localVarReturnType = new GenericType<UsageFargateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageFargateResponse> executeWithHttpInfo() throws ApiException {
      return getUsageFargateWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for fargate.
   * ### Overview Get hourly usage for [fargate](https://docs.datadoghq.com/integrations/ecs_fargate/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageHostsResponse> localVarReturnType = new GenericType<UsageHostsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageHostsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageHostsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for hosts and containers.
   * ### Overview Get hourly usage for hosts and containers. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
   * @return getUsageHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageHostsRequest getUsageHosts() throws ApiException {
    return new APIgetUsageHostsRequest();
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLogsResponse> localVarReturnType = new GenericType<UsageLogsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageLogsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLogsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for logs.
   * ### Overview Get hourly usage for logs. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
   * @return getUsageLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageLogsRequest getUsageLogs() throws ApiException {
    return new APIgetUsageLogsRequest();
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSummaryResponse> localVarReturnType = new GenericType<UsageSummaryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageSummaryResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSummaryWithHttpInfo(startMonth, endMonth, includeOrgDetails);
    }
  }

  /**
   * Get usage across your multi-org account.
   * ### Overview Get usage across your multi-org account. ### Arguments * **&#x60;start_month&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning in this month. Maximum of 15 months ago. * **&#x60;end_month&#x60;** [*optional*, *default* &#x3D; **current_month-3d**] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage ending this month. * **&#x60;include_org_details&#x60;** [*optional*, *default* &#x3D; **true**] Include usage summaries for each sub-org.
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsResponse> localVarReturnType = new GenericType<UsageSyntheticsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageSyntheticsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for synthetics.
   * ### Overview Get hourly usage for [synthetics](https://docs.datadoghq.com/synthetics/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
   * @return getUsageSyntheticsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageSyntheticsRequest getUsageSynthetics() throws ApiException {
    return new APIgetUsageSyntheticsRequest();
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTimeseriesResponse> localVarReturnType = new GenericType<UsageTimeseriesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTimeseriesResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTimeseriesWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for custom metrics.
   * ### Overview Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTopAvgMetricsResponse> localVarReturnType = new GenericType<UsageTopAvgMetricsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTopAvgMetricsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTopAvgMetricsWithHttpInfo(month, names);
    }
  }

  /**
   * Get top custom metrics by hourly average.
   * ### Overview Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. ### Arguments * **&#x60;month&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. * **&#x60;names&#x60;** [*optional*, *default* &#x3D; **None**] Comma-separated list of metric names.
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

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTraceResponse> localVarReturnType = new GenericType<UsageTraceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<UsageTraceResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTraceWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for trace search.
   * ### Overview Get hourly usage for trace search. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
   * @return getUsageTraceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetUsageTraceRequest getUsageTrace() throws ApiException {
    return new APIgetUsageTraceRequest();
  }
}
