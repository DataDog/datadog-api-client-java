package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardDeleteResponse;
import com.datadog.api.v1.client.model.DashboardSummary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<Dashboard> createDashboardWithHttpInfo(Dashboard body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI("DashboardsApi.createDashboard", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateDashboardRequest {
    private Dashboard body;

    private APIcreateDashboardRequest() {
    }
    

    /**
     * Set body
     * @param body Dashboard request object (required)
     * @return APIcreateDashboardRequest
     */
    public APIcreateDashboardRequest body(Dashboard body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createDashboard request
     * @return Dashboard
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Dashboard execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createDashboard request with HTTP info returned
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Dashboard> executeWithHttpInfo() throws ApiException {
      return createDashboardWithHttpInfo(body);
    }
  }

  /**
   * Create a new Dashboard
   * ### Overview Create a dashboard using the specified options ### Arguments * **&#x60;Dashboard&#x60;** [*required*] The Dashboard Object to create
   * @return createDashboardRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateDashboardRequest createDashboard() throws ApiException {
    return new APIcreateDashboardRequest();
  }

private ApiResponse<DashboardDeleteResponse> deleteDashboardWithHttpInfo(String dashboardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/{dashboard_id}"
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    GenericType<DashboardDeleteResponse> localVarReturnType = new GenericType<DashboardDeleteResponse>() {};
    return apiClient.invokeAPI("DashboardsApi.deleteDashboard", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteDashboardRequest {
    private String dashboardId;

    private APIdeleteDashboardRequest(String dashboardId) {
      this.dashboardId = dashboardId;
    }
    

    /**
     * Execute deleteDashboard request
     * @return DashboardDeleteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> No dasbhoards found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardDeleteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteDashboard request with HTTP info returned
     * @return ApiResponse&lt;DashboardDeleteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> No dasbhoards found error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardDeleteResponse> executeWithHttpInfo() throws ApiException {
      return deleteDashboardWithHttpInfo(dashboardId);
    }
  }

  /**
   * Delete a Dashboard
   * ### Overview Delete a dashboard using the specified ID ### Arguments * **&#x60;id&#x60;** [*required*] The Dashboard id to delete
   * @param dashboardId The id of the dashboard (required)
   * @return deleteDashboardRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteDashboardRequest deleteDashboard(String dashboardId) throws ApiException {
    return new APIdeleteDashboardRequest(dashboardId);
  }

private ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling getDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/{dashboard_id}"
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI("DashboardsApi.getDashboard", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetDashboardRequest {
    private String dashboardId;

    private APIgetDashboardRequest(String dashboardId) {
      this.dashboardId = dashboardId;
    }
    

    /**
     * Execute getDashboard request
     * @return Dashboard
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Dashboard execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDashboard request with HTTP info returned
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Dashboard> executeWithHttpInfo() throws ApiException {
      return getDashboardWithHttpInfo(dashboardId);
    }
  }

  /**
   * Get a Dashboard
   * ### Overview Get a dashboard using the specified ID ### Arguments * **&#x60;id&#x60;** [*required*] The Dashboard id to Update
   * @param dashboardId The id of the dashboard (required)
   * @return getDashboardRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetDashboardRequest getDashboard(String dashboardId) throws ApiException {
    return new APIgetDashboardRequest(dashboardId);
  }

private ApiResponse<DashboardSummary> listDashboardsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

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

    GenericType<DashboardSummary> localVarReturnType = new GenericType<DashboardSummary>() {};
    return apiClient.invokeAPI("DashboardsApi.listDashboards", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistDashboardsRequest {

    private APIlistDashboardsRequest() {
    }
    

    /**
     * Execute listDashboards request
     * @return DashboardSummary
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DashboardSummary execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listDashboards request with HTTP info returned
     * @return ApiResponse&lt;DashboardSummary&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<DashboardSummary> executeWithHttpInfo() throws ApiException {
      return listDashboardsWithHttpInfo();
    }
  }

  /**
   * Get all Dashboards
   * ### Overview Get all dashboards
   * @return listDashboardsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistDashboardsRequest listDashboards() throws ApiException {
    return new APIlistDashboardsRequest();
  }

private ApiResponse<Dashboard> updateDashboardWithHttpInfo(String dashboardId, Dashboard body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDashboard");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/{dashboard_id}"
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI("DashboardsApi.updateDashboard", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateDashboardRequest {
    private String dashboardId;
    private Dashboard body;

    private APIupdateDashboardRequest(String dashboardId) {
      this.dashboardId = dashboardId;
    }
    

    /**
     * Set body
     * @param body Update Dashboard request body. (required)
     * @return APIupdateDashboardRequest
     */
    public APIupdateDashboardRequest body(Dashboard body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateDashboard request
     * @return Dashboard
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Dashboard execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDashboard request with HTTP info returned
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Dashboard> executeWithHttpInfo() throws ApiException {
      return updateDashboardWithHttpInfo(dashboardId, body);
    }
  }

  /**
   * Update a Dashboard
   * ### Overview Update a dashboard using the specified ID ### Arguments * **&#x60;id&#x60;** [*required*] The Dashboard id to Update * **&#x60;dashboard&#x60;** [*required*] The dashboard payload
   * @param dashboardId The id of the dashboard (required)
   * @return updateDashboardRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateDashboardRequest updateDashboard(String dashboardId) throws ApiException {
    return new APIupdateDashboardRequest(dashboardId);
  }
}
