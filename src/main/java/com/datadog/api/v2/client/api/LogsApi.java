package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.LogsAggregateRequest;
import com.datadog.api.v2.client.model.LogsAggregateResponse;
import com.datadog.api.v2.client.model.LogsListRequest;
import com.datadog.api.v2.client.model.LogsListResponse;
import com.datadog.api.v2.client.model.LogsSort;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsApi {
  private ApiClient apiClient;

  public LogsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsApi(ApiClient apiClient) {
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


private ApiResponse<LogsAggregateResponse> aggregateLogsWithHttpInfo(LogsAggregateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aggregateLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/analytics/aggregate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "aggregateLogs");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsAggregateResponse> localVarReturnType = new GenericType<LogsAggregateResponse>() {};

    return apiClient.invokeAPI("LogsApi.aggregateLogs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaggregateLogsRequest {
    private LogsAggregateRequest body;

    private APIaggregateLogsRequest() {
    }

    /**
     * Set body
     * @param body  (required)
     * @return APIaggregateLogsRequest
     */
    public APIaggregateLogsRequest body(LogsAggregateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute aggregateLogs request
     * @return LogsAggregateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsAggregateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute aggregateLogs request with HTTP info returned
     * @return ApiResponse&lt;LogsAggregateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsAggregateResponse> executeWithHttpInfo() throws ApiException {
      return aggregateLogsWithHttpInfo(body);
    }
  }

  /**
   * Aggregate events
   * The API endpoint to aggregate events into buckets and compute metrics and timeseries.
   * @return aggregateLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaggregateLogsRequest aggregateLogs() throws ApiException {
    return new APIaggregateLogsRequest();
  }

private ApiResponse<LogsListResponse> listLogsWithHttpInfo(LogsListRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/events/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogs");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsListResponse> localVarReturnType = new GenericType<LogsListResponse>() {};

    return apiClient.invokeAPI("LogsApi.listLogs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistLogsRequest {
    private LogsListRequest body;

    private APIlistLogsRequest() {
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIlistLogsRequest
     */
    public APIlistLogsRequest body(LogsListRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute listLogs request
     * @return LogsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogs request with HTTP info returned
     * @return ApiResponse&lt;LogsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsListResponse> executeWithHttpInfo() throws ApiException {
      return listLogsWithHttpInfo(body);
    }
  }

  /**
   * Search logs
   * List endpoint returns logs that match a log search query. [Results are paginated][1].  Use this endpoint to build complex logs filtering and search.  **If you are considering archiving logs for your organization, consider use of the Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].**  [1]: /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives
   * @return listLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsRequest listLogs() throws ApiException {
    return new APIlistLogsRequest();
  }

private ApiResponse<LogsListResponse> listLogsGetWithHttpInfo(String filterQuery, String filterIndex, OffsetDateTime filterFrom, OffsetDateTime filterTo, LogsSort sort, String pageCursor, Integer pageLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/events";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[index]", filterIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsGet");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsListResponse> localVarReturnType = new GenericType<LogsListResponse>() {};

    return apiClient.invokeAPI("LogsApi.listLogsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistLogsGetRequest {
    private String filterQuery;
    private String filterIndex;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private LogsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    private APIlistLogsGetRequest() {
    }

    /**
     * Set filterQuery
     * @param filterQuery Search query following logs syntax. (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterIndex
     * @param filterIndex For customers with multiple indexes, the indexes to search Defaults to &#39;*&#39; which means all indexes (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest filterIndex(String filterIndex) {
      this.filterIndex = filterIndex;
      return this;
    }

    /**
     * Set filterFrom
     * @param filterFrom Minimum timestamp for requested logs. (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     * @param filterTo Maximum timestamp for requested logs. (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort
     * @param sort Order of logs in results. (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest sort(LogsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor
     * @param pageCursor List following results with a cursor provided in the previous query. (optional)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit
     * @param pageLimit Maximum number of logs in the response. (optional, default to 10)
     * @return APIlistLogsGetRequest
     */
    public APIlistLogsGetRequest pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Execute listLogsGet request
     * @return LogsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogsGet request with HTTP info returned
     * @return ApiResponse&lt;LogsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsListResponse> executeWithHttpInfo() throws ApiException {
      return listLogsGetWithHttpInfo(filterQuery, filterIndex, filterFrom, filterTo, sort, pageCursor, pageLimit);
    }
  }

  /**
   * Get a list of logs
   * List endpoint returns logs that match a log search query. [Results are paginated][1].  Use this endpoint to see your latest logs.  **If you are considering archiving logs for your organization, consider use of the Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].**  [1]: /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives
   * @return listLogsGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsGetRequest listLogsGet() throws ApiException {
    return new APIlistLogsGetRequest();
  }
}
