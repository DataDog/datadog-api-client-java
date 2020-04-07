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
     * @param from Number of seconds from which you want to get total number of active hosts. (optional)
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
   * Get the total number of active hosts
   * This endpoint returns the total number of active and up hosts in your Datadog account. Active means the host has reported in the past hour, and up means it has reported in the past two hours.
   * @return getHostTotalsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetHostTotalsRequest getHostTotals() throws ApiException {
    return new APIgetHostTotalsRequest();
  }

private ApiResponse<HostListResponse> listHostsWithHttpInfo(String filter, String sortField, String sortDir, Long start, Long count, Long from) throws ApiException {
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
    return apiClient.invokeAPI("HostsApi.listHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistHostsRequest {
    private String filter;
    private String sortField;
    private String sortDir;
    private Long start;
    private Long count;
    private Long from;

    private APIlistHostsRequest() {
    }
    

    /**
     * Set filter
     * @param filter String to filter search results. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest filter(String filter) {
      this.filter = filter;
      return this;
    }
    

    /**
     * Set sortField
     * @param sortField Sort hosts by this field. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }
    

    /**
     * Set sortDir
     * @param sortDir Direction of sort. Options include &#x60;asc&#x60; and &#x60;desc&#x60;. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }
    

    /**
     * Set start
     * @param start Host result to start search from. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest start(Long start) {
      this.start = start;
      return this;
    }
    

    /**
     * Set count
     * @param count Number of hosts to return. Max 1000. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest count(Long count) {
      this.count = count;
      return this;
    }
    

    /**
     * Set from
     * @param from Number of seconds since UNIX epoch from which you want to search your hosts. (optional)
     * @return APIlistHostsRequest
     */
    public APIlistHostsRequest from(Long from) {
      this.from = from;
      return this;
    }
    

    /**
     * Execute listHosts request
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
     * Execute listHosts request with HTTP info returned
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
      return listHostsWithHttpInfo(filter, sortField, sortDir, start, count, from);
    }
  }

  /**
   * Get all hosts for your organization
   * This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past 3 hours are included. Results are paginated with a max of 1000 results at a time.
   * @return listHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistHostsRequest listHosts() throws ApiException {
    return new APIlistHostsRequest();
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
     * @param body Mute a host. (optional)
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
   * Mute a host
   * Mute a host.
   * @param hostName Name of the host to mute. (required)
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
   * Unmute a host
   * Unmutes a host. This endpoint takes no JSON arguments.
   * @param hostName Name of the host to unmute. (required)
   * @return unmuteHostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIunmuteHostRequest unmuteHost(String hostName) throws ApiException {
    return new APIunmuteHostRequest(hostName);
  }
}
