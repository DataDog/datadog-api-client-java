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
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }



  /**
   * Create a dashboard list
   * Create an empty dashboard list.
   * @param body Create a dashboard list request body. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardList createDashboardList(DashboardList body) throws ApiException {
    return createDashboardListWithHttpInfo(body).getData();
  }

  /**
   * Create a dashboard list
   * Create an empty dashboard list.
   * @param body Create a dashboard list request body. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardList> createDashboardListWithHttpInfo(DashboardList body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboardList");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};

    return apiClient.invokeAPI("DashboardListsApi.createDashboardList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Delete a dashboard list
   * Delete a dashboard list.
   * @param listId ID of the dashboard list to delete. (required)
   * @return DashboardListDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardListDeleteResponse deleteDashboardList(Long listId) throws ApiException {
    return deleteDashboardListWithHttpInfo(listId).getData();
  }

  /**
   * Delete a dashboard list
   * Delete a dashboard list.
   * @param listId ID of the dashboard list to delete. (required)
   * @return ApiResponse&lt;DashboardListDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListDeleteResponse> deleteDashboardListWithHttpInfo(Long listId) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboardList");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardListDeleteResponse> localVarReturnType = new GenericType<DashboardListDeleteResponse>() {};

    return apiClient.invokeAPI("DashboardListsApi.deleteDashboardList", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get a dashboard list
   * Fetch an existing dashboard list&#39;s definition.
   * @param listId ID of the dashboard list to fetch. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardList getDashboardList(Long listId) throws ApiException {
    return getDashboardListWithHttpInfo(listId).getData();
  }

  /**
   * Get a dashboard list
   * Fetch an existing dashboard list&#39;s definition.
   * @param listId ID of the dashboard list to fetch. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardList> getDashboardListWithHttpInfo(Long listId) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboardList");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};

    return apiClient.invokeAPI("DashboardListsApi.getDashboardList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get all dashboard lists
   * Fetch all of your existing dashboard list definitions.
   * @return DashboardListListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardListListResponse listDashboardLists() throws ApiException {
    return listDashboardListsWithHttpInfo().getData();
  }

  /**
   * Get all dashboard lists
   * Fetch all of your existing dashboard list definitions.
   * @return ApiResponse&lt;DashboardListListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListListResponse> listDashboardListsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
        // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDashboardLists");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardListListResponse> localVarReturnType = new GenericType<DashboardListListResponse>() {};

    return apiClient.invokeAPI("DashboardListsApi.listDashboardLists", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Update a dashboard list
   * Update the name of a dashboard list.
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardList updateDashboardList(Long listId, DashboardList body) throws ApiException {
    return updateDashboardListWithHttpInfo(listId, body).getData();
  }

  /**
   * Update a dashboard list
   * Update the name of a dashboard list.
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardList> updateDashboardListWithHttpInfo(Long listId, DashboardList body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboardList");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<DashboardList> localVarReturnType = new GenericType<DashboardList>() {};

    return apiClient.invokeAPI("DashboardListsApi.updateDashboardList", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
