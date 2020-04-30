package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CheckCanDeleteMonitorResponse;
import com.datadog.api.v1.client.model.DeletedMonitor;
import com.datadog.api.v1.client.model.Monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MonitorsApi {
  private ApiClient apiClient;

  public MonitorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MonitorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<CheckCanDeleteMonitorResponse> checkCanDeleteMonitorWithHttpInfo(List<Long> monitorIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'monitorIds' is set
    if (monitorIds == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorIds' when calling checkCanDeleteMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/can_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "monitor_ids", monitorIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<CheckCanDeleteMonitorResponse> localVarReturnType = new GenericType<CheckCanDeleteMonitorResponse>() {};
    return apiClient.invokeAPI("MonitorsApi.checkCanDeleteMonitor", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcheckCanDeleteMonitorRequest {
    private List<Long> monitorIds;

    private APIcheckCanDeleteMonitorRequest() {
    }
    

    /**
     * Set monitorIds
     * @param monitorIds The IDs of the monitor to check. (required)
     * @return APIcheckCanDeleteMonitorRequest
     */
    public APIcheckCanDeleteMonitorRequest monitorIds(List<Long> monitorIds) {
      this.monitorIds = monitorIds;
      return this;
    }
    

    /**
     * Execute checkCanDeleteMonitor request
     * @return CheckCanDeleteMonitorResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Deletion conflict error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CheckCanDeleteMonitorResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkCanDeleteMonitor request with HTTP info returned
     * @return ApiResponse&lt;CheckCanDeleteMonitorResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Deletion conflict error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<CheckCanDeleteMonitorResponse> executeWithHttpInfo() throws ApiException {
      return checkCanDeleteMonitorWithHttpInfo(monitorIds);
    }
  }

  /**
   * Check if a monitor can be deleted
   * Check if the given monitors can be deleted.
   * @return checkCanDeleteMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcheckCanDeleteMonitorRequest checkCanDeleteMonitor() throws ApiException {
    return new APIcheckCanDeleteMonitorRequest();
  }

private ApiResponse<Monitor> createMonitorWithHttpInfo(Monitor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI("MonitorsApi.createMonitor", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateMonitorRequest {
    private Monitor body;

    private APIcreateMonitorRequest() {
    }
    

    /**
     * Set body
     * @param body Create a monitor request body. (required)
     * @return APIcreateMonitorRequest
     */
    public APIcreateMonitorRequest body(Monitor body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createMonitor request
     * @return Monitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Monitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createMonitor request with HTTP info returned
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return createMonitorWithHttpInfo(body);
    }
  }

  /**
   * Create a monitor
   * Create a monitor using the specified options.
   * @return createMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateMonitorRequest createMonitor() throws ApiException {
    return new APIcreateMonitorRequest();
  }

private ApiResponse<DeletedMonitor> deleteMonitorWithHttpInfo(Long monitorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling deleteMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/{monitor_id}"
      .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<DeletedMonitor> localVarReturnType = new GenericType<DeletedMonitor>() {};
    return apiClient.invokeAPI("MonitorsApi.deleteMonitor", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteMonitorRequest {
    private Long monitorId;

    private APIdeleteMonitorRequest(Long monitorId) {
      this.monitorId = monitorId;
    }
    

    /**
     * Execute deleteMonitor request
     * @return DeletedMonitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DeletedMonitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteMonitor request with HTTP info returned
     * @return ApiResponse&lt;DeletedMonitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DeletedMonitor> executeWithHttpInfo() throws ApiException {
      return deleteMonitorWithHttpInfo(monitorId);
    }
  }

  /**
   * Delete a monitor
   * Delete the specified monitor
   * @param monitorId The ID of the monitor. (required)
   * @return deleteMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteMonitorRequest deleteMonitor(Long monitorId) throws ApiException {
    return new APIdeleteMonitorRequest(monitorId);
  }

private ApiResponse<Monitor> getMonitorWithHttpInfo(Long monitorId, String groupStates) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling getMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/{monitor_id}"
      .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI("MonitorsApi.getMonitor", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetMonitorRequest {
    private Long monitorId;
    private String groupStates;

    private APIgetMonitorRequest(Long monitorId) {
      this.monitorId = monitorId;
    }
    

    /**
     * Set groupStates
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @return APIgetMonitorRequest
     */
    public APIgetMonitorRequest groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
    

    /**
     * Execute getMonitor request
     * @return Monitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Monitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getMonitor request with HTTP info returned
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return getMonitorWithHttpInfo(monitorId, groupStates);
    }
  }

  /**
   * Get a monitor&#39;s details
   * Get details about the specified monitor from your organization.
   * @param monitorId The ID of the monitor (required)
   * @return getMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetMonitorRequest getMonitor(Long monitorId) throws ApiException {
    return new APIgetMonitorRequest(monitorId);
  }

private ApiResponse<List<Monitor>> listMonitorsWithHttpInfo(String groupStates, String name, String tags, String monitorTags, Boolean withDowntimes, Long idOffset, Long page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tags", monitorTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", withDowntimes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id_offset", idOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listMonitors");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Monitor>> localVarReturnType = new GenericType<List<Monitor>>() {};
    return apiClient.invokeAPI("MonitorsApi.listMonitors", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistMonitorsRequest {
    private String groupStates;
    private String name;
    private String tags;
    private String monitorTags;
    private Boolean withDowntimes;
    private Long idOffset;
    private Long page;
    private Integer pageSize;

    private APIlistMonitorsRequest() {
    }
    

    /**
     * Set groupStates
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
    

    /**
     * Set name
     * @param name A string to filter monitors by name. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest name(String name) {
      this.name = name;
      return this;
    }
    

    /**
     * Set tags
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope. For example, &#x60;host:host0&#x60;. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest tags(String tags) {
      this.tags = tags;
      return this;
    }
    

    /**
     * Set monitorTags
     * @param monitorTags A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended. For example, &#x60;service:my-app&#x60;. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest monitorTags(String monitorTags) {
      this.monitorTags = monitorTags;
      return this;
    }
    

    /**
     * Set withDowntimes
     * @param withDowntimes If this argument is set to true, then the returned data includes all current downtimes for each monitor. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }
    

    /**
     * Set idOffset
     * @param idOffset TODO. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest idOffset(Long idOffset) {
      this.idOffset = idOffset;
      return this;
    }
    

    /**
     * Set page
     * @param page The page to start paginating from. If this argument is not specified, the request returns all monitors without pagination. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest page(Long page) {
      this.page = page;
      return this;
    }
    

    /**
     * Set pageSize
     * @param pageSize The number of monitors to return per page. If the page argument is not specified, the default behavior returns all monitors without a &#x60;page_size&#x60; limit. However, if page is specified and &#x60;page_size&#x60; is not, the argument defaults to 100. (optional)
     * @return APIlistMonitorsRequest
     */
    public APIlistMonitorsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
    

    /**
     * Execute listMonitors request
     * @return List&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<Monitor> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMonitors request with HTTP info returned
     * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<Monitor>> executeWithHttpInfo() throws ApiException {
      return listMonitorsWithHttpInfo(groupStates, name, tags, monitorTags, withDowntimes, idOffset, page, pageSize);
    }
  }

  /**
   * Get all monitor details
   * Get details about the specified monitor from your organization.
   * @return listMonitorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistMonitorsRequest listMonitors() throws ApiException {
    return new APIlistMonitorsRequest();
  }

private ApiResponse<Monitor> updateMonitorWithHttpInfo(Long monitorId, Monitor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling updateMonitor");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/{monitor_id}"
      .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI("MonitorsApi.updateMonitor", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateMonitorRequest {
    private Long monitorId;
    private Monitor body;

    private APIupdateMonitorRequest(Long monitorId) {
      this.monitorId = monitorId;
    }
    

    /**
     * Set body
     * @param body Edit a monitor request body. (required)
     * @return APIupdateMonitorRequest
     */
    public APIupdateMonitorRequest body(Monitor body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateMonitor request
     * @return Monitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Monitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateMonitor request with HTTP info returned
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return updateMonitorWithHttpInfo(monitorId, body);
    }
  }

  /**
   * Edit a monitor
   * Edit the specified monitor.
   * @param monitorId The ID of the monitor. (required)
   * @return updateMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateMonitorRequest updateMonitor(Long monitorId) throws ApiException {
    return new APIupdateMonitorRequest(monitorId);
  }

private ApiResponse<Monitor> validateMonitorWithHttpInfo(Monitor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling validateMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/validate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "validateMonitor");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI("MonitorsApi.validateMonitor", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIvalidateMonitorRequest {
    private Monitor body;

    private APIvalidateMonitorRequest() {
    }
    

    /**
     * Set body
     * @param body Monitor request object (required)
     * @return APIvalidateMonitorRequest
     */
    public APIvalidateMonitorRequest body(Monitor body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute validateMonitor request
     * @return Monitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Monitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute validateMonitor request with HTTP info returned
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return validateMonitorWithHttpInfo(body);
    }
  }

  /**
   * Validate a monitor
   * Validate the monitor provided in the request.
   * @return validateMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIvalidateMonitorRequest validateMonitor() throws ApiException {
    return new APIvalidateMonitorRequest();
  }
}
