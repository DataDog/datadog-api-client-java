package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.DashboardListAddItemsRequest;
import com.datadog.api.v2.client.model.DashboardListAddItemsResponse;
import com.datadog.api.v2.client.model.DashboardListDeleteItemsRequest;
import com.datadog.api.v2.client.model.DashboardListDeleteItemsResponse;
import com.datadog.api.v2.client.model.DashboardListItems;
import com.datadog.api.v2.client.model.DashboardListUpdateItemsRequest;
import com.datadog.api.v2.client.model.DashboardListUpdateItemsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardListsApi {
  private ApiClient apiClient;

  public DashboardListsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardListsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<DashboardListAddItemsResponse> createDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListAddItemsRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling createDashboardListItems");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDashboardListItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboardListItems");

    
    
    
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

    return apiClient.invokeAPI("DashboardListsApi.createDashboardListItems", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListAddItemsRequest body;

    private APIcreateDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }

    /**
     * Set body
     * @param body Dashboards to add to the dashboard list. (required)
     * @return APIcreateDashboardListItemsRequest
     */
    public APIcreateDashboardListItemsRequest body(DashboardListAddItemsRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createDashboardListItems request
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
     * Execute createDashboardListItems request with HTTP info returned
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
      return createDashboardListItemsWithHttpInfo(dashboardListId, body);
    }
  }

  /**
   * Add Items to a Dashboard List
   * Add dashboards to an existing dashboard list.
   * @param dashboardListId ID of the dashboard list to add items to. (required)
   * @return createDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateDashboardListItemsRequest createDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIcreateDashboardListItemsRequest(dashboardListId);
  }

private ApiResponse<DashboardListDeleteItemsResponse> deleteDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListDeleteItemsRequest body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboardListItems");

    
    
    
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

    return apiClient.invokeAPI("DashboardListsApi.deleteDashboardListItems", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListDeleteItemsRequest body;

    private APIdeleteDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }

    /**
     * Set body
     * @param body Dashboards to delete from the dashboard list. (required)
     * @return APIdeleteDashboardListItemsRequest
     */
    public APIdeleteDashboardListItemsRequest body(DashboardListDeleteItemsRequest body) {
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
   * Delete items from a dashboard list
   * Delete dashboards from an existing dashboard list.
   * @param dashboardListId ID of the dashboard list to delete items from. (required)
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboardListItems");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardListItems> localVarReturnType = new GenericType<DashboardListItems>() {};

    return apiClient.invokeAPI("DashboardListsApi.getDashboardListItems", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
   * Get items of a Dashboard List
   * Fetch the dashboard list’s dashboard definitions.
   * @param dashboardListId ID of the dashboard list to get items from. (required)
   * @return getDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDashboardListItemsRequest getDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIgetDashboardListItemsRequest(dashboardListId);
  }

private ApiResponse<DashboardListUpdateItemsResponse> updateDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListUpdateItemsRequest body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboardListItems");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardListUpdateItemsResponse> localVarReturnType = new GenericType<DashboardListUpdateItemsResponse>() {};

    return apiClient.invokeAPI("DashboardListsApi.updateDashboardListItems", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateDashboardListItemsRequest {
    private Long dashboardListId;
    private DashboardListUpdateItemsRequest body;

    private APIupdateDashboardListItemsRequest(Long dashboardListId) {
      this.dashboardListId = dashboardListId;
    }

    /**
     * Set body
     * @param body New dashboards of the dashboard list. (required)
     * @return APIupdateDashboardListItemsRequest
     */
    public APIupdateDashboardListItemsRequest body(DashboardListUpdateItemsRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateDashboardListItems request
     * @return DashboardListUpdateItemsResponse
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
    
    public DashboardListUpdateItemsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDashboardListItems request with HTTP info returned
     * @return ApiResponse&lt;DashboardListUpdateItemsResponse&gt;
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
    public ApiResponse<DashboardListUpdateItemsResponse> executeWithHttpInfo() throws ApiException {
      return updateDashboardListItemsWithHttpInfo(dashboardListId, body);
    }
  }

  /**
   * Update items of a dashboard list
   * Update dashboards of an existing dashboard list.
   * @param dashboardListId ID of the dashboard list to update items from. (required)
   * @return updateDashboardListItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateDashboardListItemsRequest updateDashboardListItems(Long dashboardListId) throws ApiException {
    return new APIupdateDashboardListItemsRequest(dashboardListId);
  }
}
