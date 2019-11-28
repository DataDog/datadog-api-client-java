package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.CanceledDowntimesIds;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DowntimesApi {
  private ApiClient apiClient;

  public DowntimesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DowntimesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  // CancelDowntimeParams Parameters for the method 'cancelDowntime'
  public static class CancelDowntimeParams {
    

    
  }

  /**
   * Cancel a downtime
   * Cancel a Downtime
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to cancel (required)
   
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public void cancelDowntime(Long downtimeId, CancelDowntimeParams localVarParams) throws ApiException {
    cancelDowntimeWithHttpInfo(downtimeId, localVarParams).getData();
  }

  /**
   * Cancel a downtime
   * Cancel a Downtime
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to cancel (required)
   
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelDowntimeWithHttpInfo(Long downtimeId, CancelDowntimeParams localVarParams) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling cancelDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

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

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  // CancelDowntimesByScopeParams Parameters for the method 'cancelDowntimesByScope'
  public static class CancelDowntimesByScopeParams {
    

    
  }

  /**
   * Cancel downtimes by scope
   * ### Overview DELETE all Downtimes that match the scope of X ### Arguments * **&#x60;scope&#x60;** [*required*]: Cancel all downtimes with the given scope(s),   e.g.: &#x60;env:prod&#x60;, &#x60;role:db,role:db-slave&#x60;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param cancelDowntimesByScopeRequest Scope to cancel downtimes for (required)
   * @return CanceledDowntimesIds
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No downtimes found error </td><td>  -  </td></tr>
     </table>
   */
  public CanceledDowntimesIds cancelDowntimesByScope(CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest, CancelDowntimesByScopeParams localVarParams) throws ApiException {
    return cancelDowntimesByScopeWithHttpInfo(cancelDowntimesByScopeRequest, localVarParams).getData();
  }

  /**
   * Cancel downtimes by scope
   * ### Overview DELETE all Downtimes that match the scope of X ### Arguments * **&#x60;scope&#x60;** [*required*]: Cancel all downtimes with the given scope(s),   e.g.: &#x60;env:prod&#x60;, &#x60;role:db,role:db-slave&#x60;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param cancelDowntimesByScopeRequest Scope to cancel downtimes for (required)
   * @return ApiResponse&lt;CanceledDowntimesIds&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No downtimes found error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CanceledDowntimesIds> cancelDowntimesByScopeWithHttpInfo(CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest, CancelDowntimesByScopeParams localVarParams) throws ApiException {
    Object localVarPostBody = cancelDowntimesByScopeRequest;
    // verify the required parameter 'cancelDowntimesByScopeRequest' is set
    if (cancelDowntimesByScopeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'cancelDowntimesByScopeRequest' when calling cancelDowntimesByScope");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/cancel/by_scope";

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

    GenericType<CanceledDowntimesIds> localVarReturnType = new GenericType<CanceledDowntimesIds>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  // CreateDowntimeParams Parameters for the method 'createDowntime'
  public static class CreateDowntimeParams {
    

    
  }

  /**
   * Schedule a downtime
   * * **&#x60;scope&#x60;** [*required*]: The scope(s) to which the downtime applies, e.g. &#x60;host:app2&#x60;.   Provide multiple scopes as a comma-separated list, e.g. &#x60;env:dev,env:prod&#x60;. The   resulting downtime applies to sources that matches ALL provided scopes (i.e.   &#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags   that are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to   which the downtime applies. The resulting downtime applies to monitors that match   ALL provided monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to start the downtime.   If not provided, the downtime starts the moment it is created.  * **&#x60;end&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*optional*, *default*&#x3D;**None**]: A message to include with notifications   for this downtime. Email notifications can be sent to specific users by using    the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, *default* &#x3D; **UTC**]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default*&#x3D;**None**]: An object defining the recurrence of the   downtime with a variety of parameters:    * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.    * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,     select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.    * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;,     &#x60;Tue&#x60;, &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.     **First letter must be capitalized.**   * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.     **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive    * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end     as a POSIX timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param downtime Downtime request object (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public Downtime createDowntime(Downtime downtime, CreateDowntimeParams localVarParams) throws ApiException {
    return createDowntimeWithHttpInfo(downtime, localVarParams).getData();
  }

  /**
   * Schedule a downtime
   * * **&#x60;scope&#x60;** [*required*]: The scope(s) to which the downtime applies, e.g. &#x60;host:app2&#x60;.   Provide multiple scopes as a comma-separated list, e.g. &#x60;env:dev,env:prod&#x60;. The   resulting downtime applies to sources that matches ALL provided scopes (i.e.   &#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags   that are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to   which the downtime applies. The resulting downtime applies to monitors that match   ALL provided monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to start the downtime.   If not provided, the downtime starts the moment it is created.  * **&#x60;end&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*optional*, *default*&#x3D;**None**]: A message to include with notifications   for this downtime. Email notifications can be sent to specific users by using    the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, *default* &#x3D; **UTC**]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default*&#x3D;**None**]: An object defining the recurrence of the   downtime with a variety of parameters:    * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.    * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,     select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.    * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;,     &#x60;Tue&#x60;, &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.     **First letter must be capitalized.**   * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.     **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive    * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end     as a POSIX timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   * @param downtime Downtime request object (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Downtime> createDowntimeWithHttpInfo(Downtime downtime, CreateDowntimeParams localVarParams) throws ApiException {
    Object localVarPostBody = downtime;
    // verify the required parameter 'downtime' is set
    if (downtime == null) {
      throw new ApiException(400, "Missing the required parameter 'downtime' when calling createDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

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

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  // GetAllDowntimesParams Parameters for the method 'getAllDowntimes'
  public static class GetAllDowntimesParams {
    
    public Boolean currentOnly;
    

    
    public GetAllDowntimesParams currentOnly(Boolean currentOnly) {
      this.currentOnly = currentOnly;
      return this;
    }
    
  }

  /**
   * Get all downtimes
   * ### Overview Get All Scheduled Downtimes ### Arguments * **&#x60;current_only&#x60;** [*optional*, *default* &#x3D; **False**]: Only return downtimes   that are active when the request is made.&#39;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<Downtime> getAllDowntimes(GetAllDowntimesParams localVarParams) throws ApiException {
    return getAllDowntimesWithHttpInfo(localVarParams).getData();
  }

  /**
   * Get all downtimes
   * ### Overview Get All Scheduled Downtimes ### Arguments * **&#x60;current_only&#x60;** [*optional*, *default* &#x3D; **False**]: Only return downtimes   that are active when the request is made.&#39;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   
   
   * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Downtime>> getAllDowntimesWithHttpInfo(GetAllDowntimesParams localVarParams) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", localVarParams.currentOnly));

    
    
     
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Downtime>> localVarReturnType = new GenericType<List<Downtime>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  // GetDowntimeParams Parameters for the method 'getDowntime'
  public static class GetDowntimeParams {
    

    
  }

  /**
   * Get a downtime
   * ### Overview Get Downtime Detail by downtime_id ### Arguments This endpoint takes no JSON arguments.\&quot;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to fetch (required)
   
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public Downtime getDowntime(Long downtimeId, GetDowntimeParams localVarParams) throws ApiException {
    return getDowntimeWithHttpInfo(downtimeId, localVarParams).getData();
  }

  /**
   * Get a downtime
   * ### Overview Get Downtime Detail by downtime_id ### Arguments This endpoint takes no JSON arguments.\&quot;
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to fetch (required)
   
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Downtime> getDowntimeWithHttpInfo(Long downtimeId, GetDowntimeParams localVarParams) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling getDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

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

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  // UpdateDowntimeParams Parameters for the method 'updateDowntime'
  public static class UpdateDowntimeParams {
    

    
  }

  /**
   * Update a downtime
   * ### Overview Update a single Downtime by downtime_id. ### Arguments * **&#x60;id&#x60;** [*required*]: The integer id of the downtime to be updated * **&#x60;scope&#x60;** [*required*]: The scope to which the downtime applies, e.g. &#39;host:app2&#39;.   Provide multiple scopes as a comma-separated list, e.g. &#39;env:dev,env:prod&#39;.   The resulting downtime applies to sources that matches ALL provided scopes   (i.e. env:dev AND env:prod), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags that   are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to which   the downtime applies. The resulting downtime applies to monitors that match ALL provided   monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **original start**]: POSIX timestamp to start   the downtime.  * **&#x60;end&#x60;** [*optional*, *default* &#x3D; **original end**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*required*, *default* &#x3D; **original message**]: A message to include with   notifications for this downtime. Email notifications can be sent to specific users by   using the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, default &#x3D; **original timezone** ]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default* &#x3D; **original recurrence**]: An object defining the   recurrence of the downtime with a variety of parameters:      * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.      * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,       select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.      * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;, &#x60;Tue&#x60;,       &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.       **First letter must be capitalized.**      * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.       **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive      * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end as a POSIX       timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to update (required)
   
   
   * @param downtime Downtime request object (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public Downtime updateDowntime(Long downtimeId, Downtime downtime, UpdateDowntimeParams localVarParams) throws ApiException {
    return updateDowntimeWithHttpInfo(downtimeId, downtime, localVarParams).getData();
  }

  /**
   * Update a downtime
   * ### Overview Update a single Downtime by downtime_id. ### Arguments * **&#x60;id&#x60;** [*required*]: The integer id of the downtime to be updated * **&#x60;scope&#x60;** [*required*]: The scope to which the downtime applies, e.g. &#39;host:app2&#39;.   Provide multiple scopes as a comma-separated list, e.g. &#39;env:dev,env:prod&#39;.   The resulting downtime applies to sources that matches ALL provided scopes   (i.e. env:dev AND env:prod), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags that   are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to which   the downtime applies. The resulting downtime applies to monitors that match ALL provided   monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **original start**]: POSIX timestamp to start   the downtime.  * **&#x60;end&#x60;** [*optional*, *default* &#x3D; **original end**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*required*, *default* &#x3D; **original message**]: A message to include with   notifications for this downtime. Email notifications can be sent to specific users by   using the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, default &#x3D; **original timezone** ]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default* &#x3D; **original recurrence**]: An object defining the   recurrence of the downtime with a variety of parameters:      * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.      * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,       select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.      * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;, &#x60;Tue&#x60;,       &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.       **First letter must be capitalized.**      * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.       **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive      * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end as a POSIX       timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
   * @param localVarParams The Object encapsulating the parameters to be passed to the API endpoint
   * @param downtimeId ID of the downtime to update (required)
   
   
   * @param downtime Downtime request object (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Downtime not found error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Downtime> updateDowntimeWithHttpInfo(Long downtimeId, Downtime downtime, UpdateDowntimeParams localVarParams) throws ApiException {
    Object localVarPostBody = downtime;
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling updateDowntime");
    }
    // verify the required parameter 'downtime' is set
    if (downtime == null) {
      throw new ApiException(400, "Missing the required parameter 'downtime' when calling updateDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

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

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
