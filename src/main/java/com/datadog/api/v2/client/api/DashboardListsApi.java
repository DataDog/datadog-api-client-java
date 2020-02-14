package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.DashboardListAddItemsResponse;
import com.datadog.api.v2.client.model.DashboardListDeleteItemsResponse;
import com.datadog.api.v2.client.model.DashboardListItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DashboardListsApi {
  private ApiClient apiClient;

  public DashboardListsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardListsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<DashboardListAddItemsResponse> addDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListItems body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling addDashboardListItems");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addDashboardListItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

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

    GenericType<DashboardListAddItemsResponse> localVarReturnType = new GenericType<DashboardListAddItemsResponse>() {};
    return apiClient.invokeAPI("DashboardListsApi.addDashboardListItems", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaddDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListItems body;

    private APIaddDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }
    

    /**
     * Set body
     * @param body Dashboards to add to the dashboard list (required)
     * @return APIaddDashboardListItemsRequest
     */
    public APIaddDashboardListItemsRequest body(DashboardListItems body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute addDashboardListItems request
     * @return DashboardListAddItemsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListAddItemsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addDashboardListItems request with HTTP info returned
     * @return ApiResponse&lt;DashboardListAddItemsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListAddItemsResponse> executeWithHttpInfo() throws ApiException {
      return addDashboardListItemsWithHttpInfo(dashboardListId, body);
    }
  }

  /**
   * Add dashboards to an existing dashboard list.
   * ### Overview Add dashboards to an existing dashboard list. ### Arguments - **&#x60;dashboards&#x60;** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:    - **&#x60;type&#x60;** [*required*]: The type of the dashboard. The type must be one of:      - &#x60;\&quot;custom_timeboard\&quot;&#x60;      - &#x60;\&quot;custom_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_timeboard\&quot;&#x60;      - &#x60;\&quot;host_timeboard\&quot;&#x60;    - **&#x60;id&#x60;** [*required*]: The id of the dashboard.
   * @param dashboardListId ID of the dashboard list to add items to (required)
   * @return addDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaddDashboardListItemsRequest addDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIaddDashboardListItemsRequest(dashboardListId);
  }

private ApiResponse<DashboardListDeleteItemsResponse> deleteDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListItems body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling deleteDashboardListItems");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteDashboardListItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

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

    GenericType<DashboardListDeleteItemsResponse> localVarReturnType = new GenericType<DashboardListDeleteItemsResponse>() {};
    return apiClient.invokeAPI("DashboardListsApi.deleteDashboardListItems", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListItems body;

    private APIdeleteDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }
    

    /**
     * Set body
     * @param body Dashboards to delete from the dashboard list (required)
     * @return APIdeleteDashboardListItemsRequest
     */
    public APIdeleteDashboardListItemsRequest body(DashboardListItems body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute deleteDashboardListItems request
     * @return DashboardListDeleteItemsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListDeleteItemsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteDashboardListItems request with HTTP info returned
     * @return ApiResponse&lt;DashboardListDeleteItemsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListDeleteItemsResponse> executeWithHttpInfo() throws ApiException {
      return deleteDashboardListItemsWithHttpInfo(dashboardListId, body);
    }
  }

  /**
   * Delete dashboards from an existing dashboard list.
   * ### Overview Delete dashboards from an existing dashboard list. ### Arguments - **&#x60;dashboards&#x60;** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:    - **&#x60;type&#x60;** [*required*]: The type of the dashboard. The type must be one of:      - &#x60;\&quot;custom_timeboard\&quot;&#x60;      - &#x60;\&quot;custom_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_timeboard\&quot;&#x60;      - &#x60;\&quot;host_timeboard\&quot;&#x60;    - **&#x60;id&#x60;** [*required*]: The id of the dashboard.
   * @param dashboardListId ID of the dashboard list to delete items from (required)
   * @return deleteDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteDashboardListItemsRequest deleteDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIdeleteDashboardListItemsRequest(dashboardListId);
  }

private ApiResponse<DashboardListItems> getDashboardListItemsWithHttpInfo(Long dashboardListId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling getDashboardListItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

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

    GenericType<DashboardListItems> localVarReturnType = new GenericType<DashboardListItems>() {};
    return apiClient.invokeAPI("DashboardListsApi.getDashboardListItems", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetDashboardListItemsRequest {
    private Long dashboardListId;

    private APIgetDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }
    

    /**
     * Execute getDashboardListItems request
     * @return DashboardListItems
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListItems execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDashboardListItems request with HTTP info returned
     * @return ApiResponse&lt;DashboardListItems&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListItems> executeWithHttpInfo() throws ApiException {
      return getDashboardListItemsWithHttpInfo(dashboardListId);
    }
  }

  /**
   * Fetch the dashboard list&#39;s dashboard definitions.
   * ### Overview Fetch the dashboard list’s dashboard definitions. ### Arguments This endpoint takes no JSON arguments.
   * @param dashboardListId ID of the dashboard list to get items from (required)
   * @return getDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetDashboardListItemsRequest getDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIgetDashboardListItemsRequest(dashboardListId);
  }

private ApiResponse<DashboardListItems> updateDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListItems body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling updateDashboardListItems");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDashboardListItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

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

    GenericType<DashboardListItems> localVarReturnType = new GenericType<DashboardListItems>() {};
    return apiClient.invokeAPI("DashboardListsApi.updateDashboardListItems", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListItems body;

    private APIupdateDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }
    

    /**
     * Set body
     * @param body New dashboards of the dashboard list (required)
     * @return APIupdateDashboardListItemsRequest
     */
    public APIupdateDashboardListItemsRequest body(DashboardListItems body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateDashboardListItems request
     * @return DashboardListItems
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListItems execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDashboardListItems request with HTTP info returned
     * @return ApiResponse&lt;DashboardListItems&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListItems> executeWithHttpInfo() throws ApiException {
      return updateDashboardListItemsWithHttpInfo(dashboardListId, body);
    }
  }

  /**
   * Update dashboards of an existing dashboard list.
   * ### Overview Update dashboards of an existing dashboard list. ### Arguments - **&#x60;dashboards&#x60;** [*required*]: A list of dashboards to add to the list. Dashboard definitions follow this form:    - **&#x60;type&#x60;** [*required*]: The type of the dashboard. The type must be one of:      - &#x60;\&quot;custom_timeboard\&quot;&#x60;      - &#x60;\&quot;custom_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_screenboard\&quot;&#x60;      - &#x60;\&quot;integration_timeboard\&quot;&#x60;      - &#x60;\&quot;host_timeboard\&quot;&#x60;    - **&#x60;id&#x60;** [*required*]: The id of the dashboard.
   * @param dashboardListId ID of the dashboard list to update items from (required)
   * @return updateDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateDashboardListItemsRequest updateDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIupdateDashboardListItemsRequest(dashboardListId);
  }
}
