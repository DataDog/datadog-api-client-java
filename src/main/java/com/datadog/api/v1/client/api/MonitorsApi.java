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

  // CreateMonitorParams Parameters for the method 'createMonitor'
  public static class CreateMonitorParams {
    

    
  }

  /**
   * Create a new Monitor
   * ### Overview Create a monitor using the specified options ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to create
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param monitor Monitor request object (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public Monitor createMonitor(Monitor monitor, CreateMonitorParams localVarParams) throws ApiException {
    return createMonitorWithHttpInfo(monitor, localVarParams).getData();
  }

  /**
   * Create a new Monitor
   * ### Overview Create a monitor using the specified options ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to create
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param monitor Monitor request object (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Monitor> createMonitorWithHttpInfo(Monitor monitor, CreateMonitorParams localVarParams) throws ApiException {
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
  // DeleteMonitorParams Parameters for the method 'deleteMonitor'
  public static class DeleteMonitorParams {
    

    
  }

  /**
   * Delete the specified monitor.
   * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
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
  public Map<String, Long> deleteMonitor(Long monitorId, DeleteMonitorParams localVarParams) throws ApiException {
    return deleteMonitorWithHttpInfo(monitorId, localVarParams).getData();
  }

  /**
   * Delete the specified monitor.
   * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
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
  public ApiResponse<Map<String, Long>> deleteMonitorWithHttpInfo(Long monitorId, DeleteMonitorParams localVarParams) throws ApiException {
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
  // EditMonitorParams Parameters for the method 'editMonitor'
  public static class EditMonitorParams {
    

    
  }

  /**
   * Edit the specified monitor
   * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
   
   * @param monitor Monitor request object (required)
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
  public Monitor editMonitor(Long monitorId, Monitor monitor, EditMonitorParams localVarParams) throws ApiException {
    return editMonitorWithHttpInfo(monitorId, monitor, localVarParams).getData();
  }

  /**
   * Edit the specified monitor
   * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
   
   * @param monitor Monitor request object (required)
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
  public ApiResponse<Monitor> editMonitorWithHttpInfo(Long monitorId, Monitor monitor, EditMonitorParams localVarParams) throws ApiException {
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
  // GetAllMonitorsParams Parameters for the method 'getAllMonitors'
  public static class GetAllMonitorsParams {
    
    public String groupStates;
    
    public String name;
    
    public String tags;
    
    public String monitorTags;
    
    public Boolean withDowntimes;
    

    
    public GetAllMonitorsParams groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
    
    public GetAllMonitorsParams name(String name) {
      this.name = name;
      return this;
    }
    
    public GetAllMonitorsParams tags(String tags) {
      this.tags = tags;
      return this;
    }
    
    public GetAllMonitorsParams monitorTags(String monitorTags) {
      this.monitorTags = monitorTags;
      return this;
    }
    
    public GetAllMonitorsParams withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }
    
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39; * **&#x60;name&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A string to filter monitors by name * **&#x60;tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0 * **&#x60;monitor_tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended (e.g. service:my-app) * **&#x60;with_downtimes&#x60;** [*optional* *default*&#x3D;&#x3D;**true**] If this argument is set to true, then the returned data includes all current downtimes for each monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   
   
   
   
   
   
   
   
   
   * @return List&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<Monitor> getAllMonitors(GetAllMonitorsParams localVarParams) throws ApiException {
    return getAllMonitorsWithHttpInfo(localVarParams).getData();
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39; * **&#x60;name&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A string to filter monitors by name * **&#x60;tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0 * **&#x60;monitor_tags&#x60;** [*optional* *default*&#x3D;&#x3D;**None**] A comma separated list indicating what service and/or custom tags, if any, should be used to filter the list of monitors. Tags created in the Datadog UI automatically have the service key prepended (e.g. service:my-app) * **&#x60;with_downtimes&#x60;** [*optional* *default*&#x3D;&#x3D;**true**] If this argument is set to true, then the returned data includes all current downtimes for each monitor.
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   
   
   
   
   
   
   
   
   
   * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Monitor>> getAllMonitorsWithHttpInfo(GetAllMonitorsParams localVarParams) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", localVarParams.groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", localVarParams.name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", localVarParams.tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tags", localVarParams.monitorTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", localVarParams.withDowntimes));

    
    
     
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
  // GetMonitorParams Parameters for the method 'getMonitor'
  public static class GetMonitorParams {
    
    public String groupStates;
    

    
    public GetMonitorParams groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
    
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
   
   
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
  public Monitor getMonitor(Long monitorId, GetMonitorParams localVarParams) throws ApiException {
    return getMonitorWithHttpInfo(monitorId, localVarParams).getData();
  }

  /**
   * Get details about the specified monitor.
   * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param monitorId The id of the monitor (required)
   
   
   
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
  public ApiResponse<Monitor> getMonitorWithHttpInfo(Long monitorId, GetMonitorParams localVarParams) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", localVarParams.groupStates));

    
    
     
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
  // ValidateMonitorParams Parameters for the method 'validateMonitor'
  public static class ValidateMonitorParams {
    

    
  }

  /**
   * 
   * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param monitor Monitor request object (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
   */
  public Monitor validateMonitor(Monitor monitor, ValidateMonitorParams localVarParams) throws ApiException {
    return validateMonitorWithHttpInfo(monitor, localVarParams).getData();
  }

  /**
   * 
   * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param monitor Monitor request object (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Monitor> validateMonitorWithHttpInfo(Monitor monitor, ValidateMonitorParams localVarParams) throws ApiException {
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
}
