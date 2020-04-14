package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v1.client.model.DashboardListDeleteResponse;
import com.datadog.api.v1.client.model.DashboardListListResponse;

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

private ApiResponse<DashboardList> createDashboardListWithHttpInfo(DashboardList body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDashboardList");
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
    return apiClient.invokeAPI("DashboardListsApi.createDashboardList", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateDashboardListRequest {
    private DashboardList body;

    private APIcreateDashboardListRequest() {
    }
    

    /**
     * Set body
     * @param body DashboardList request object (required)
     * @return APIcreateDashboardListRequest
     */
    public APIcreateDashboardListRequest body(DashboardList body) {
      this.body = body;
      return this;
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
      return createDashboardListWithHttpInfo(body);
    }
  }

  /**
   * Create a dashboard list
   * Create an empty dashboard list.
   * @return createDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateDashboardListRequest createDashboardList() throws ApiException {
    return new APIcreateDashboardListRequest();
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
    return apiClient.invokeAPI("DashboardListsApi.deleteDashboardList", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Delete a dashboard list.
   * @param listId ID of the dashboard list to delete (required)
   * @return deleteDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteDashboardListRequest deleteDashboardList(Long listId) throws ApiException {
    return new APIdeleteDashboardListRequest(listId);
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
    return apiClient.invokeAPI("DashboardListsApi.getDashboardList", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Fetch an existing dashboard list&#39;s definition.
   * @param listId ID of the dashboard list to fetch (required)
   * @return getDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetDashboardListRequest getDashboardList(Long listId) throws ApiException {
    return new APIgetDashboardListRequest(listId);
  }

private ApiResponse<DashboardListListResponse> listDashboardListsWithHttpInfo() throws ApiException {
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
    return apiClient.invokeAPI("DashboardListsApi.listDashboardLists", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistDashboardListsRequest {

    private APIlistDashboardListsRequest() {
    }
    

    /**
     * Execute listDashboardLists request
     * @return DashboardListListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardListListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listDashboardLists request with HTTP info returned
     * @return ApiResponse&lt;DashboardListListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardListListResponse> executeWithHttpInfo() throws ApiException {
      return listDashboardListsWithHttpInfo();
    }
  }

  /**
   * Get all dashboard lists
   * Fetch all of your existing dashboard list definitions.
   * @return listDashboardListsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistDashboardListsRequest listDashboardLists() throws ApiException {
    return new APIlistDashboardListsRequest();
  }

private ApiResponse<DashboardList> updateDashboardListWithHttpInfo(Long listId, DashboardList body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(400, "Missing the required parameter 'listId' when calling updateDashboardList");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDashboardList");
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
    return apiClient.invokeAPI("DashboardListsApi.updateDashboardList", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateDashboardListRequest {
    private Long listId;
    private DashboardList body;

    private APIupdateDashboardListRequest(Long listId) {
      this.listId = listId;
    }
    

    /**
     * Set body
     * @param body DashboardList request object (required)
     * @return APIupdateDashboardListRequest
     */
    public APIupdateDashboardListRequest body(DashboardList body) {
      this.body = body;
      return this;
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
      return updateDashboardListWithHttpInfo(listId, body);
    }
  }

  /**
   * Update a dashboard list
   * Update the name of a dashboard list.
   * @param listId ID of the dashboard list to update (required)
   * @return updateDashboardListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateDashboardListRequest updateDashboardList(Long listId) throws ApiException {
    return new APIupdateDashboardListRequest(listId);
  }
}
