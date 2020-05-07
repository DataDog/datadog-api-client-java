package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsIndex;
import com.datadog.api.v1.client.model.LogsIndexListResponse;
import com.datadog.api.v1.client.model.LogsIndexesOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogsIndexesApi {
  private ApiClient apiClient;

  public LogsIndexesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsIndexesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<LogsIndex> getLogsIndexWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getLogsIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndex");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};
    return apiClient.invokeAPI("LogsIndexesApi.getLogsIndex", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsIndexRequest {
    private String name;

    private APIgetLogsIndexRequest(String name) {
      this.name = name;
    }
    

    /**
     * Execute getLogsIndex request
     * @return LogsIndex
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndex execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsIndex request with HTTP info returned
     * @return ApiResponse&lt;LogsIndex&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndex> executeWithHttpInfo() throws ApiException {
      return getLogsIndexWithHttpInfo(name);
    }
  }

  /**
   * Get an index
   * Get one log index from your organization. This endpoint takes no JSON arguments.
   * @param name Name of the log index. (required)
   * @return getLogsIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetLogsIndexRequest getLogsIndex(String name) throws ApiException {
    String operationId = "getLogsIndex";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetLogsIndexRequest(name);
  }

private ApiResponse<LogsIndexesOrder> getLogsIndexOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndexOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};
    return apiClient.invokeAPI("LogsIndexesApi.getLogsIndexOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsIndexOrderRequest {

    private APIgetLogsIndexOrderRequest() {
    }
    

    /**
     * Execute getLogsIndexOrder request
     * @return LogsIndexesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsIndexOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexesOrder> executeWithHttpInfo() throws ApiException {
      return getLogsIndexOrderWithHttpInfo();
    }
  }

  /**
   * Get indexes order
   * Get the current order of your log indexes. This endpoint takes no JSON arguments.
   * @return getLogsIndexOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetLogsIndexOrderRequest getLogsIndexOrder() throws ApiException {
    String operationId = "getLogsIndexOrder";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetLogsIndexOrderRequest();
  }

private ApiResponse<LogsIndexListResponse> listLogIndexesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogIndexes");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsIndexListResponse> localVarReturnType = new GenericType<LogsIndexListResponse>() {};
    return apiClient.invokeAPI("LogsIndexesApi.listLogIndexes", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistLogIndexesRequest {

    private APIlistLogIndexesRequest() {
    }
    

    /**
     * Execute listLogIndexes request
     * @return LogsIndexListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogIndexes request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexListResponse> executeWithHttpInfo() throws ApiException {
      return listLogIndexesWithHttpInfo();
    }
  }

  /**
   * Get all indexes
   * The Index object describes the configuration of a log index. This endpoint returns an array of the &#x60;LogIndex&#x60; objects of your organization.
   * @return listLogIndexesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistLogIndexesRequest listLogIndexes() throws ApiException {
    String operationId = "listLogIndexes";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistLogIndexesRequest();
  }

private ApiResponse<LogsIndex> updateLogsIndexWithHttpInfo(String name, LogsIndex body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateLogsIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndex");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};
    return apiClient.invokeAPI("LogsIndexesApi.updateLogsIndex", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsIndexRequest {
    private String name;
    private LogsIndex body;

    private APIupdateLogsIndexRequest(String name) {
      this.name = name;
    }
    

    /**
     * Set body
     * @param body Object containing the new &#x60;LogsIndex&#x60;. (optional)
     * @return APIupdateLogsIndexRequest
     */
    public APIupdateLogsIndexRequest body(LogsIndex body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateLogsIndex request
     * @return LogsIndex
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndex execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsIndex request with HTTP info returned
     * @return ApiResponse&lt;LogsIndex&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndex> executeWithHttpInfo() throws ApiException {
      return updateLogsIndexWithHttpInfo(name, body);
    }
  }

  /**
   * Update an index
   * Update an index as identified by its name. Returns the Index object passed in the request body when the request is successful.  Using the &#x60;PUT&#x60; method updates your index’s configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
   * @param name Name of the log index. (required)
   * @return updateLogsIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateLogsIndexRequest updateLogsIndex(String name) throws ApiException {
    String operationId = "updateLogsIndex";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateLogsIndexRequest(name);
  }

private ApiResponse<LogsIndexesOrder> updateLogsIndexOrderWithHttpInfo(LogsIndexesOrder body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndexOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};
    return apiClient.invokeAPI("LogsIndexesApi.updateLogsIndexOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsIndexOrderRequest {
    private LogsIndexesOrder body;

    private APIupdateLogsIndexOrderRequest() {
    }
    

    /**
     * Set body
     * @param body Object containing the new ordered list of index names (optional)
     * @return APIupdateLogsIndexOrderRequest
     */
    public APIupdateLogsIndexOrderRequest body(LogsIndexesOrder body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateLogsIndexOrder request
     * @return LogsIndexesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsIndexOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexesOrder> executeWithHttpInfo() throws ApiException {
      return updateLogsIndexOrderWithHttpInfo(body);
    }
  }

  /**
   * Update indexes order
   * This endpoint updates the index order of your organization. It returns the index order object passed in the request body when the request is successful.
   * @return updateLogsIndexOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateLogsIndexOrderRequest updateLogsIndexOrder() throws ApiException {
    String operationId = "updateLogsIndexOrder";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateLogsIndexOrderRequest();
  }
}
