package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.HTTPLog;
import com.datadog.api.v1.client.model.HTTPLogError;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsListRequest;
import com.datadog.api.v1.client.model.LogsListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogsApi {
  private ApiClient apiClient;

  public LogsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<LogsListResponse> listLogsWithHttpInfo(LogsListRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs-queries/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
    return apiClient.invokeAPI("LogsApi.listLogs", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistLogsRequest {
    private LogsListRequest body;

    private APIlistLogsRequest() {
    }
    

    /**
     * Set body
     * @param body Logs filter (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsListResponse> executeWithHttpInfo() throws ApiException {
      return listLogsWithHttpInfo(body);
    }
  }

  /**
   * Get a list of logs
   * ## Overview List endpoint returns logs that match a log search query. [Results are paginated][1]. **If you are thinking about archiving logs for your organization, consider using Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].** **ARGUMENTS**: * **&#x60;query&#x60;** [*required*]:     The search query - following the [Log search syntax][3] .  * **&#x60;time.from&#x60;** [*required*]:     Minimum timestamp for requested logs. Format can be either      - an ISO-8601 string      - a unix timestamp (number representing the elapsed millisec since epoch)      - a relative time (&#x60;now -10m&#x60;, &#x60;now - 1h&#x60;, &#x60;now - 1d&#x60;)  * **&#x60;time.to&#x60;** [*required*]:     Maximum timestamp for requested logs. Format can be either      - an ISO-8601 string with minute, second or millisecond precision      - a unix timestamp (number representing the elapsed millisec since epoch)      - a relative time (&#x60;now&#x60;, &#x60;now -10m&#x60;, &#x60;now - 1h&#x60;, &#x60;now - 1d&#x60;)  * **&#x60;time.timezone&#x60;** [*optional*, *default*&#x3D;**None**]:   Can be specified both as an offset (e.g. \&quot;UTC+03:00\&quot;) or a regional zone (e.g. \&quot;Europe/Paris\&quot;)  * **&#x60;time.offset&#x60;** [*optional*, *default*&#x3D;**None**]:   Equivalent to &#x60;time.timezone&#x60;. But value in seconds.   If both timezone and offset are specified, timezone is ignored.  * **&#x60;startAt&#x60;** [*optional*, *default*&#x3D;**None**]:   Hash identifier of the first log to return in the list, available in a log &#x60;id&#x60; attribute. This parameter is used for the [pagination feature][1].   **Note**: this parameter is ignored if the corresponding log is out of the scope of the specified time window.  * **&#x60;sort&#x60;** [*optional*, *default*&#x3D;**desc**]:     Time-ascending &#x60;asc&#x60; or time-descending &#x60;desc&#x60;results.  * **&#x60;limit&#x60;** [*optional*, *default*&#x3D;**10**]:     Number of logs return in the response (maximum is 1000)  * **&#x60;index&#x60;** [*optional*, *default*&#x3D;**main**]:     For multi-index organizations, the log index in which the request is performed.  [1]: /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives [3]: https://docs.datadoghq.com/logs/explorer/search/#search-syntax
   * @return listLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistLogsRequest listLogs() throws ApiException {
    return new APIlistLogsRequest();
  }

private ApiResponse<Object> sendLogWithHttpInfo(HTTPLog body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling sendLog");
    }
    
    // create path and map variables
    String localVarPath = "/v1/input";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("LogsApi.sendLog", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIsendLogRequest {
    private HTTPLog body;

    private APIsendLogRequest() {
    }
    

    /**
     * Set body
     * @param body Log to send (JSON format) (required)
     * @return APIsendLogRequest
     */
    public APIsendLogRequest body(HTTPLog body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute sendLog request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> response from server (always 200 empty JSON) </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendLog request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> response from server (always 200 empty JSON) </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return sendLogWithHttpInfo(body);
    }
  }

  /**
   * 
   * Send logs
   * @return sendLogRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIsendLogRequest sendLog() throws ApiException {
    return new APIsendLogRequest();
  }
}
