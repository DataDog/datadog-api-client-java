package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsListRequest;
import com.datadog.api.v1.client.model.LogsListResponse;

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
   * Search logs
   * List endpoint returns logs that match a log search query. [Results are paginated][1].  **If you are considering archiving logs for your organization, consider use of the Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].**  [1]: /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives
   * @return listLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsRequest listLogs() throws ApiException {
    return new APIlistLogsRequest();
  }
}
