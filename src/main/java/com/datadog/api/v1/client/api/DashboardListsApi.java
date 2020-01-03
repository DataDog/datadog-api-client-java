package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v1.client.model.DashboardListDeleteResponse;
import com.datadog.api.v1.client.model.DashboardListListResponse;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error404;

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

private ApiResponse<DashboardList> createDashboardListWithHttpInfo(DashboardList dashboardList) throws ApiException {
    Object localVarPostBody = dashboardList;
    
    // verify the required parameter 'dashboardList' is set
    if (dashboardList == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardList' when calling createDashboardList");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

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

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateDashboardListRequest {
    private DashboardList dashboardList;

    private APIcreateDashboardListRequest(DashboardList dashboardList) {
      this.dashboardList = dashboardList;
    }
    

    /**
     * Execute createDashboardList request
     * @return DashboardList
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardList execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createDashboardList request with HTTP info returned
     * @return ApiResponse&lt;DashboardList&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardList> executeWithHttpInfo() throws ApiException {
      return createDashboardListWithHttpInfo(dashboardList);
    }
  }

  /**
   * Create a dashboard list
   * ### Overview Create an empty dashboard list. ### Arguments * **name** [*required*]: The name of the dashboard list.
   * @param dashboardList DashboardList request object (require)
   * @return createDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateDashboardListRequest createDashboardList(DashboardList dashboardList) throws ApiException {
    return new APIcreateDashboardListRequest(dashboardList);
  }

private ApiResponse<DashboardListDeleteResponse> deleteDashboardListWithHttpInfo(Long listId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(400, "Missing the required parameter 'listId' when calling deleteDashboardList");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual/{list_id}"
      .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

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

    GenericType<DashboardListDeleteResponse> localVarReturnType = new GenericType<DashboardListDeleteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteDashboardListRequest {
    private Long listId;

    private APIdeleteDashboardListRequest(Long listId) {
      this.listId = listId;
    }
    

    /**
     * Execute deleteDashboardList request
     * @return DashboardListDeleteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListDeleteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteDashboardList request with HTTP info returned
     * @return ApiResponse&lt;DashboardListDeleteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListDeleteResponse> executeWithHttpInfo() throws ApiException {
      return deleteDashboardListWithHttpInfo(listId);
    }
  }

  /**
   * Delete a dashboard list
   * ### Overview Delete a dashboard list. ### Arguments This endpoint takes no JSON arguments.
   * @param listId ID of the dashboard list to delete (required)
   
   * @return deleteDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteDashboardListRequest deleteDashboardList(Long listId) throws ApiException {
    return new APIdeleteDashboardListRequest(listId);
  }

private ApiResponse<DashboardListListResponse> getAllDashboardListsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

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

    GenericType<DashboardListListResponse> localVarReturnType = new GenericType<DashboardListListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllDashboardListsRequest {

    private APIgetAllDashboardListsRequest() {
    }
    

    /**
     * Execute getAllDashboardLists request
     * @return DashboardListListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllDashboardLists request with HTTP info returned
     * @return ApiResponse&lt;DashboardListListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListListResponse> executeWithHttpInfo() throws ApiException {
      return getAllDashboardListsWithHttpInfo();
    }
  }

  /**
   * Get all dashboard lists
   * ### Overview Fetch all of your existing dashboard list definitions. ### Arguments This endpoint takes no JSON arguments.
   
   * @return getAllDashboardListsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllDashboardListsRequest getAllDashboardLists() throws ApiException {
    return new APIgetAllDashboardListsRequest();
  }

private ApiResponse<DashboardList> getDashboardListWithHttpInfo(Long listId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(400, "Missing the required parameter 'listId' when calling getDashboardList");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual/{list_id}"
      .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

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

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetDashboardListRequest {
    private Long listId;

    private APIgetDashboardListRequest(Long listId) {
      this.listId = listId;
    }
    

    /**
     * Execute getDashboardList request
     * @return DashboardList
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardList execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDashboardList request with HTTP info returned
     * @return ApiResponse&lt;DashboardList&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardList> executeWithHttpInfo() throws ApiException {
      return getDashboardListWithHttpInfo(listId);
    }
  }

  /**
   * Get a dashboard list
   * ### Overview Fetch an existing dashboard list&#39;s definition. ### Arguments This endpoint takes no JSON arguments.
   * @param listId ID of the dashboard list to fetch (required)
   
   * @return getDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetDashboardListRequest getDashboardList(Long listId) throws ApiException {
    return new APIgetDashboardListRequest(listId);
  }

private ApiResponse<DashboardList> updateDashboardListWithHttpInfo(Long listId, DashboardList dashboardList) throws ApiException {
    Object localVarPostBody = dashboardList;
    
    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(400, "Missing the required parameter 'listId' when calling updateDashboardList");
    }
    
    // verify the required parameter 'dashboardList' is set
    if (dashboardList == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardList' when calling updateDashboardList");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual/{list_id}"
      .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

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

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateDashboardListRequest {
    private Long listId;
    private DashboardList dashboardList;

    private APIupdateDashboardListRequest(Long listId, DashboardList dashboardList) {
      this.listId = listId;
      this.dashboardList = dashboardList;
    }
    

    /**
     * Execute updateDashboardList request
     * @return DashboardList
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
    
    public DashboardList execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDashboardList request with HTTP info returned
     * @return ApiResponse&lt;DashboardList&gt;
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
    
    public ApiResponse<DashboardList> executeWithHttpInfo() throws ApiException {
      return updateDashboardListWithHttpInfo(listId, dashboardList);
    }
  }

  /**
   * Update a dashboard list
   * ### Overview Update the name of a dashboard list. ### Arguments * **name** [*required*]: The name of the dashboard list.
   * @param listId ID of the dashboard list to update (required)
   * @param dashboardList DashboardList request object (require)
   * @return updateDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateDashboardListRequest updateDashboardList(Long listId, DashboardList dashboardList) throws ApiException {
    return new APIupdateDashboardListRequest(listId, dashboardList);
  }
}
