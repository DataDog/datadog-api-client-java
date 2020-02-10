package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.HostListResponse;
import com.datadog.api.v1.client.model.HostMuteResponse;
import com.datadog.api.v1.client.model.HostMuteSettings;
import com.datadog.api.v1.client.model.HostTotals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HostsApi {
  private ApiClient apiClient;

  public HostsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HostsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<HostListResponse> getAllHostsWithHttpInfo(String filter, String sortField, String sortDir, Long start, Long count, Long from) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostListResponse> localVarReturnType = new GenericType<HostListResponse>() {};
    return apiClient.invokeAPI("HostsApi.getAllHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllHostsRequest {
    private String filter;
    private String sortField;
    private String sortDir;
    private Long start;
    private Long count;
    private Long from;

    private APIgetAllHostsRequest() {
    }
    

    /**
     * Set filter
     * @param filter String to filter search results (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest filter(String filter) {
      this.filter = filter;
      return this;
    }
    

    /**
     * Set sortField
     * @param sortField Sort hosts by this field (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }
    

    /**
     * Set sortDir
     * @param sortDir Direction of sort (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }
    

    /**
     * Set start
     * @param start Host result to start search from (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest start(Long start) {
      this.start = start;
      return this;
    }
    

    /**
     * Set count
     * @param count Number of hosts to return (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest count(Long count) {
      this.count = count;
      return this;
    }
    

    /**
     * Set from
     * @param from Number of seconds from which you want to search your hosts (optional)
     * @return APIgetAllHostsRequest
     */
    public APIgetAllHostsRequest from(Long from) {
      this.from = from;
      return this;
    }
    

    /**
     * Execute getAllHosts request
     * @return HostListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Host Not Found Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllHosts request with HTTP info returned
     * @return ApiResponse&lt;HostListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Host Not Found Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HostListResponse> executeWithHttpInfo() throws ApiException {
      return getAllHostsWithHttpInfo(filter, sortField, sortDir, start, count, from);
    }
  }

  /**
   * Get all hosts for your organization
   * ## Search Hosts This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past 3 hours are included. Results are paginated with a max of 1000 results at a time. ### Arguments: * **&#x60;filter&#x60;** [*optional*, *default* &#x3D; **None**]: Query string to filter search results. * **&#x60;sort_field&#x60;** [*optional*, *default* &#x3D; **cpu**]: Sort hosts by the given field. Options: **status, apps, cpu, iowait, load** * **&#x60;sort_dir&#x60;** [*optional*, *default* &#x3D; **desc**]: Direction of sort. Options: **asc, desc** * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **0**]: Host result to start search from. * **&#x60;count&#x60;** [*optional*, *default* &#x3D; **100**]: Number of host results to return. Max 1000. * **&#x60;from&#x60;** [*optional*, *default* &#x3D; **now - 2 hours**]: Number of seconds since UNIX epoch from which you want to search your hosts.
   * @return getAllHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllHostsRequest getAllHosts() throws ApiException {
    return new APIgetAllHostsRequest();
  }

private ApiResponse<HostTotals> getHostTotalsWithHttpInfo(Long from) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/hosts/totals";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostTotals> localVarReturnType = new GenericType<HostTotals>() {};
    return apiClient.invokeAPI("HostsApi.getHostTotals", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetHostTotalsRequest {
    private Long from;

    private APIgetHostTotalsRequest() {
    }
    

    /**
     * Set from
     * @param from Number of seconds from which you want to get total number of active hosts (optional)
     * @return APIgetHostTotalsRequest
     */
    public APIgetHostTotalsRequest from(Long from) {
      this.from = from;
      return this;
    }
    

    /**
     * Execute getHostTotals request
     * @return HostTotals
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostTotals execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getHostTotals request with HTTP info returned
     * @return ApiResponse&lt;HostTotals&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HostTotals> executeWithHttpInfo() throws ApiException {
      return getHostTotalsWithHttpInfo(from);
    }
  }

  /**
   * Get total number of active hosts in your Datadog Account
   * ## Get Host totals This endpoint returns the total number of active and up hosts in your Datadog account. Active means the host has reported in the past hour, and up means it has reported in the past two hours. ### Arguments: * **&#x60;from&#x60;** [*optional*, *default*&#x3D; **now - 2 hours**]:  Number of seconds since UNIX epoch from which you want to get the total number of active and up hosts.
   * @return getHostTotalsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetHostTotalsRequest getHostTotals() throws ApiException {
    return new APIgetHostTotalsRequest();
  }

private ApiResponse<HostMuteResponse> muteHostWithHttpInfo(String hostName, HostMuteSettings body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling muteHost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/host/{host_name}/mute"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

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

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};
    return apiClient.invokeAPI("HostsApi.muteHost", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APImuteHostRequest {
    private String hostName;
    private HostMuteSettings body;

    private APImuteHostRequest(String hostName) {
      this.hostName = hostName;
    }
    

    /**
     * Set body
     * @param body Mute a host (optional)
     * @return APImuteHostRequest
     */
    public APImuteHostRequest body(HostMuteSettings body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute muteHost request
     * @return HostMuteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostMuteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute muteHost request with HTTP info returned
     * @return ApiResponse&lt;HostMuteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HostMuteResponse> executeWithHttpInfo() throws ApiException {
      return muteHostWithHttpInfo(hostName, body);
    }
  }

  /**
   * Mute a Host
   * ## Mute a Host ### Arguments: * **&#x60;end&#x60;** [*optional*, *default*&#x3D; *None*]: POSIX timestamp when the host is unmuted. If omitted, the host remains muted until explicitly unmuted. * **&#x60;message&#x60;** [*optional*, *default*&#x3D; *None*]: Message to associate with the muting of this host. * **&#x60;override&#x60;** [*optional*, *default*&#x3D; *False*]: If true and the host is already muted, replaces existing host mute settings.
   * @param hostName Name of the host to mute (required)
   * @return muteHostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APImuteHostRequest muteHost(String hostName) throws ApiException {
    return new APImuteHostRequest(hostName);
  }

private ApiResponse<HostMuteResponse> unmuteHostWithHttpInfo(String hostName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling unmuteHost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/host/{host_name}/unmute"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

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

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};
    return apiClient.invokeAPI("HostsApi.unmuteHost", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIunmuteHostRequest {
    private String hostName;

    private APIunmuteHostRequest(String hostName) {
      this.hostName = hostName;
    }
    

    /**
     * Execute unmuteHost request
     * @return HostMuteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostMuteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute unmuteHost request with HTTP info returned
     * @return ApiResponse&lt;HostMuteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HostMuteResponse> executeWithHttpInfo() throws ApiException {
      return unmuteHostWithHttpInfo(hostName);
    }
  }

  /**
   * Unmute a Host
   * ### Unmute a Host This endpoint takes no JSON arguments.
   * @param hostName Name of the host to unmute (required)
   * @return unmuteHostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIunmuteHostRequest unmuteHost(String hostName) throws ApiException {
    return new APIunmuteHostRequest(hostName);
  }
}
