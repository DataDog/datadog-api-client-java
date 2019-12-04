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
import com.datadog.api.v1.client.model.Error404;
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

private ApiResponse<Monitor> createMonitorWithHttpInfo(Monitor monitor) throws ApiException {
    Object localVarPostBody = monitor;
    
    // verify the required parameter 'monitor' is set
    if (monitor == null) {
      throw new ApiException(400, "Missing the required parameter 'monitor' when calling createMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

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

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateMonitorRequest {
    private Monitor monitor;

    private APIcreateMonitorRequest(Monitor monitor) {
      this.monitor = monitor;
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
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return createMonitorWithHttpInfo(monitor);
    }
  }

  /**
   * Create a new Monitor
   * ### Overview Create a monitor using the specified options ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to create
   * @param monitor Monitor request object (require)
   * @return createMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateMonitorRequest createMonitor(Monitor monitor) throws ApiException {
    return new APIcreateMonitorRequest(monitor);
  }

private ApiResponse<Map<String, Long>> deleteMonitorWithHttpInfo(Long monitorId) throws ApiException {
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


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Map<String, Long>> localVarReturnType = new GenericType<Map<String, Long>>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteMonitorRequest {
    private Long monitorId;

    private APIdeleteMonitorRequest(Long monitorId) {
      this.monitorId = monitorId;
    }
    

    /**
     * Execute deleteMonitor request
     * @return Map&lt;String, Long&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, Long> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteMonitor request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, Long&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Map<String, Long>> executeWithHttpInfo() throws ApiException {
      return deleteMonitorWithHttpInfo(monitorId);
    }
  }

  /**
   * Delete the specified monitor.
   * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param monitorId The id of the monitor (required)
   
   * @return deleteMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteMonitorRequest deleteMonitor(Long monitorId) throws ApiException {
    return new APIdeleteMonitorRequest(monitorId);
  }

private ApiResponse<Monitor> editMonitorWithHttpInfo(Long monitorId, Monitor monitor) throws ApiException {
    Object localVarPostBody = monitor;
    
    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling editMonitor");
    }
    
    // verify the required parameter 'monitor' is set
    if (monitor == null) {
      throw new ApiException(400, "Missing the required parameter 'monitor' when calling editMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/{monitor_id}"
      .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

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

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIeditMonitorRequest {
    private Long monitorId;
    private Monitor monitor;

    private APIeditMonitorRequest(Long monitorId, Monitor monitor) {
      this.monitorId = monitorId;
      this.monitor = monitor;
    }
    

    /**
     * Execute editMonitor request
     * @return Monitor
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Monitor execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute editMonitor request with HTTP info returned
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return editMonitorWithHttpInfo(monitorId, monitor);
    }
  }

  /**
   * Edit the specified monitor
   * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param monitorId The id of the monitor (required)
   * @param monitor Monitor request object (require)
   * @return editMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIeditMonitorRequest editMonitor(Long monitorId, Monitor monitor) throws ApiException {
    return new APIeditMonitorRequest(monitorId, monitor);
  }

private ApiResponse<List<Monitor>> getAllMonitorsWithHttpInfo(String groupStates, String name, String tags, String monitorTags, Boolean withDowntimes) throws ApiException {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Monitor>> localVarReturnType = new GenericType<List<Monitor>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllMonitorsRequest {
    private String groupStates;
    private String name;
    private String tags;
    private String monitorTags;
    private Boolean withDowntimes;

    private APIgetAllMonitorsRequest() {
    }
    

    /**
     * Set groupStates
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @return APIgetAllMonitorsRequest
     */
    public APIgetAllMonitorsRequest groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
    

    /**
     * Set name
     * @param name A string to filter monitors by name. (optional)
     * @return APIgetAllMonitorsRequest
     */
    public APIgetAllMonitorsRequest name(String name) {
      this.name = name;
      return this;
    }
    

    /**
     * Set tags
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0. (optional)
     * @return APIgetAllMonitorsRequest
     */
    public APIgetAllMonitorsRequest tags(String tags) {
      this.tags = tags;
      return this;
    }
    

    /**
     * Set monitorTags
     * @param monitorTags A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended (e.g. service:my-app). (optional)
     * @return APIgetAllMonitorsRequest
     */
    public APIgetAllMonitorsRequest monitorTags(String monitorTags) {
      this.monitorTags = monitorTags;
      return this;
    }
    

    /**
     * Set withDowntimes
     * @param withDowntimes If this argument is set to true, then the returned data includes all current downtimes for each monitor. (optional)
     * @return APIgetAllMonitorsRequest
     */
    public APIgetAllMonitorsRequest withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }
    

    /**
     * Execute getAllMonitors request
     * @return List&lt;Monitor&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<Monitor> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllMonitors request with HTTP info returned
     * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<Monitor>> executeWithHttpInfo() throws ApiException {
      return getAllMonitorsWithHttpInfo(groupStates, name, tags, monitorTags, withDowntimes);
    }
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39; * **&#x60;name&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A string to filter monitors by name * **&#x60;tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0 * **&#x60;monitor_tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended (e.g. service:my-app) * **&#x60;with_downtimes&#x60;** [*optional* *default*&#x3D;&#x3D;**true**] If this argument is set to true, then the returned data includes all current downtimes for each monitor.
   
   * @return getAllMonitorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllMonitorsRequest getAllMonitors() throws ApiException {
    return new APIgetAllMonitorsRequest();
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return getMonitorWithHttpInfo(monitorId, groupStates);
    }
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
   * @param monitorId The id of the monitor (required)
   
   * @return getMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetMonitorRequest getMonitor(Long monitorId) throws ApiException {
    return new APIgetMonitorRequest(monitorId);
  }

private ApiResponse<Monitor> validateMonitorWithHttpInfo(Monitor monitor) throws ApiException {
    Object localVarPostBody = monitor;
    
    // verify the required parameter 'monitor' is set
    if (monitor == null) {
      throw new ApiException(400, "Missing the required parameter 'monitor' when calling validateMonitor");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monitor/validate";

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

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIvalidateMonitorRequest {
    private Monitor monitor;

    private APIvalidateMonitorRequest(Monitor monitor) {
      this.monitor = monitor;
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
       </table>
     
     */
    
    public ApiResponse<Monitor> executeWithHttpInfo() throws ApiException {
      return validateMonitorWithHttpInfo(monitor);
    }
  }

  /**
   * 
   * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
   * @param monitor Monitor request object (require)
   * @return validateMonitorRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIvalidateMonitorRequest validateMonitor(Monitor monitor) throws ApiException {
    return new APIvalidateMonitorRequest(monitor);
  }
}
