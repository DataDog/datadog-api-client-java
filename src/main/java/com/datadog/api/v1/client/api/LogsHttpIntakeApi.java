package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.HTTPLog;
import com.datadog.api.v1.client.model.HTTPLogError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogsHttpIntakeApi {
  private ApiClient apiClient;

  public LogsHttpIntakeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsHttpIntakeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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

    String[] localVarAuthNames = new String[] { "apiKeyAuthHeader" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("LogsHttpIntakeApi.sendLog", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
