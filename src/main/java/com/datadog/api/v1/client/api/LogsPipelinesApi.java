package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsPipeline;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogsPipelinesApi {
  private ApiClient apiClient;

  public LogsPipelinesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsPipelinesApi(ApiClient apiClient) {
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


private ApiResponse<LogsPipeline> createLogsPipelineWithHttpInfo(LogsPipeline body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createLogsPipeline");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.createLogsPipeline", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcreateLogsPipelineRequest {
    private LogsPipeline body;

    private APIcreateLogsPipelineRequest() {
    }

    /**
     * Set body
     * @param body Definition of the new pipeline. (required)
     * @return APIcreateLogsPipelineRequest
     */
    public APIcreateLogsPipelineRequest body(LogsPipeline body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createLogsPipeline request
     * @return LogsPipeline
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsPipeline execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createLogsPipeline request with HTTP info returned
     * @return ApiResponse&lt;LogsPipeline&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsPipeline> executeWithHttpInfo() throws ApiException {
      return createLogsPipelineWithHttpInfo(body);
    }
  }

  /**
   * Create a pipeline
   * Create a pipeline in your organization.
   * @return createLogsPipelineRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateLogsPipelineRequest createLogsPipeline() throws ApiException {
    return new APIcreateLogsPipelineRequest();
  }

private ApiResponse<Void> deleteLogsPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling deleteLogsPipeline");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsPipelinesApi.deleteLogsPipeline", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null);
  }

  public class APIdeleteLogsPipelineRequest {
    private String pipelineId;

    private APIdeleteLogsPipelineRequest(String pipelineId) {
      this.pipelineId = pipelineId;
    }

    /**
     * Execute deleteLogsPipeline request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteLogsPipeline request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteLogsPipelineWithHttpInfo(pipelineId);
    }
  }

  /**
   * Delete a pipeline
   * Delete a given pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return deleteLogsPipelineRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteLogsPipelineRequest deleteLogsPipeline(String pipelineId) throws ApiException {
    return new APIdeleteLogsPipelineRequest(pipelineId);
  }

private ApiResponse<LogsPipeline> getLogsPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling getLogsPipeline");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.getLogsPipeline", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsPipelineRequest {
    private String pipelineId;

    private APIgetLogsPipelineRequest(String pipelineId) {
      this.pipelineId = pipelineId;
    }

    /**
     * Execute getLogsPipeline request
     * @return LogsPipeline
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsPipeline execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsPipeline request with HTTP info returned
     * @return ApiResponse&lt;LogsPipeline&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsPipeline> executeWithHttpInfo() throws ApiException {
      return getLogsPipelineWithHttpInfo(pipelineId);
    }
  }

  /**
   * Get a pipeline
   * Get a specific pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to get. (required)
   * @return getLogsPipelineRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetLogsPipelineRequest getLogsPipeline(String pipelineId) throws ApiException {
    return new APIgetLogsPipelineRequest(pipelineId);
  }

private ApiResponse<LogsPipelinesOrder> getLogsPipelineOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsPipelineOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipelinesOrder> localVarReturnType = new GenericType<LogsPipelinesOrder>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.getLogsPipelineOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsPipelineOrderRequest {

    private APIgetLogsPipelineOrderRequest() {
    }

    /**
     * Execute getLogsPipelineOrder request
     * @return LogsPipelinesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsPipelinesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsPipelineOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsPipelinesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsPipelinesOrder> executeWithHttpInfo() throws ApiException {
      return getLogsPipelineOrderWithHttpInfo();
    }
  }

  /**
   * Get pipeline order
   * Get the current order of your pipelines. This endpoint takes no JSON arguments.
   * @return getLogsPipelineOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetLogsPipelineOrderRequest getLogsPipelineOrder() throws ApiException {
    return new APIgetLogsPipelineOrderRequest();
  }

private ApiResponse<List<LogsPipeline>> listLogsPipelinesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsPipelines");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<LogsPipeline>> localVarReturnType = new GenericType<List<LogsPipeline>>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.listLogsPipelines", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistLogsPipelinesRequest {

    private APIlistLogsPipelinesRequest() {
    }

    /**
     * Execute listLogsPipelines request
     * @return List&lt;LogsPipeline&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<LogsPipeline> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogsPipelines request with HTTP info returned
     * @return ApiResponse&lt;List&lt;LogsPipeline&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<LogsPipeline>> executeWithHttpInfo() throws ApiException {
      return listLogsPipelinesWithHttpInfo();
    }
  }

  /**
   * Get all pipelines
   * Get all pipelines from your organization. This endpoint takes no JSON arguments.
   * @return listLogsPipelinesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsPipelinesRequest listLogsPipelines() throws ApiException {
    return new APIlistLogsPipelinesRequest();
  }

private ApiResponse<LogsPipeline> updateLogsPipelineWithHttpInfo(String pipelineId, LogsPipeline body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling updateLogsPipeline");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsPipeline");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.updateLogsPipeline", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsPipelineRequest {
    private String pipelineId;
    private LogsPipeline body;

    private APIupdateLogsPipelineRequest(String pipelineId) {
      this.pipelineId = pipelineId;
    }

    /**
     * Set body
     * @param body New definition of the pipeline. (required)
     * @return APIupdateLogsPipelineRequest
     */
    public APIupdateLogsPipelineRequest body(LogsPipeline body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateLogsPipeline request
     * @return LogsPipeline
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsPipeline execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsPipeline request with HTTP info returned
     * @return ApiResponse&lt;LogsPipeline&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsPipeline> executeWithHttpInfo() throws ApiException {
      return updateLogsPipelineWithHttpInfo(pipelineId, body);
    }
  }

  /**
   * Update a pipeline
   * Update a given pipeline configuration to change it’s processors or their order.  **Note**: Using this method updates your pipeline configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return updateLogsPipelineRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateLogsPipelineRequest updateLogsPipeline(String pipelineId) throws ApiException {
    return new APIupdateLogsPipelineRequest(pipelineId);
  }

private ApiResponse<LogsPipelinesOrder> updateLogsPipelineOrderWithHttpInfo(LogsPipelinesOrder body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsPipelineOrder");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsPipelineOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipelinesOrder> localVarReturnType = new GenericType<LogsPipelinesOrder>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.updateLogsPipelineOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsPipelineOrderRequest {
    private LogsPipelinesOrder body;

    private APIupdateLogsPipelineOrderRequest() {
    }

    /**
     * Set body
     * @param body Object containing the new ordered list of pipeline IDs. (required)
     * @return APIupdateLogsPipelineOrderRequest
     */
    public APIupdateLogsPipelineOrderRequest body(LogsPipelinesOrder body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateLogsPipelineOrder request
     * @return LogsPipelinesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsPipelinesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsPipelineOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsPipelinesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsPipelinesOrder> executeWithHttpInfo() throws ApiException {
      return updateLogsPipelineOrderWithHttpInfo(body);
    }
  }

  /**
   * Update pipeline order
   * Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change the structure and content of the data processed by other pipelines and their processors.  **Note**: Using the &#x60;PUT&#x60; method updates your pipeline order by replacing your current order with the new one sent to your Datadog organization.
   * @return updateLogsPipelineOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateLogsPipelineOrderRequest updateLogsPipelineOrder() throws ApiException {
    return new APIupdateLogsPipelineOrderRequest();
  }
}
