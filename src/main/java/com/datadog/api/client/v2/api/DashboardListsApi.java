
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.DashboardListDeleteItemsResponse;
import com.datadog.api.client.v2.model.DashboardListDeleteItemsRequest;
import com.datadog.api.client.v2.model.DashboardListItems;
import com.datadog.api.client.v2.model.DashboardListAddItemsResponse;
import com.datadog.api.client.v2.model.DashboardListAddItemsRequest;
import com.datadog.api.client.v2.model.DashboardListUpdateItemsResponse;
import com.datadog.api.client.v2.model.DashboardListUpdateItemsRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListsApi {
  private ApiClient apiClient;
  public DashboardListsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardListsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
 * Add Items to a Dashboard List.
 *
 * See {@link #createDashboardListItemsWithHttpInfo}.
 *
 * @param dashboardListId ID of the dashboard list to add items to. (required)
 * @param body Dashboards to add to the dashboard list. (required)
 * @return DashboardListAddItemsResponse
 * @throws ApiException if fails to make API call
 */
  public DashboardListAddItemsResponse  createDashboardListItems(Long dashboardListId, DashboardListAddItemsRequest body) throws ApiException {
    return createDashboardListItemsWithHttpInfo(dashboardListId, body).getData();
  }

  /**
 * Add Items to a Dashboard List.
 *
 * See {@link #createDashboardListItemsWithHttpInfoAsync}.
 *
 * @param dashboardListId ID of the dashboard list to add items to. (required)
 * @param body Dashboards to add to the dashboard list. (required)
 * @return CompletableFuture&lt;DashboardListAddItemsResponse&gt;
 */
  public CompletableFuture<DashboardListAddItemsResponse>createDashboardListItemsAsync(Long dashboardListId, DashboardListAddItemsRequest body) {
    return createDashboardListItemsWithHttpInfoAsync(dashboardListId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Add dashboards to an existing dashboard list.</p>
   *
   * @param dashboardListId ID of the dashboard list to add items to. (required)
   * @param body Dashboards to add to the dashboard list. (required)
   * @return ApiResponse&lt;DashboardListAddItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListAddItemsResponse> createDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListAddItemsRequest body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DashboardListsApi.createDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListAddItemsResponse>() {});
  }

  /**
   * Add Items to a Dashboard List.
   *
   * See {@link #createDashboardListItemsWithHttpInfo}.
   *
   * @param dashboardListId ID of the dashboard list to add items to. (required)
   * @param body Dashboards to add to the dashboard list. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListAddItemsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListAddItemsResponse>> createDashboardListItemsWithHttpInfoAsync(Long dashboardListId, DashboardListAddItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
        CompletableFuture<ApiResponse<DashboardListAddItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'dashboardListId' when calling createDashboardListItems"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DashboardListAddItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createDashboardListItems"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DashboardListsApi.createDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListAddItemsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListAddItemsResponse>() {});
  }

  /**
 * Delete items from a dashboard list.
 *
 * See {@link #deleteDashboardListItemsWithHttpInfo}.
 *
 * @param dashboardListId ID of the dashboard list to delete items from. (required)
 * @param body Dashboards to delete from the dashboard list. (required)
 * @return DashboardListDeleteItemsResponse
 * @throws ApiException if fails to make API call
 */
  public DashboardListDeleteItemsResponse  deleteDashboardListItems(Long dashboardListId, DashboardListDeleteItemsRequest body) throws ApiException {
    return deleteDashboardListItemsWithHttpInfo(dashboardListId, body).getData();
  }

  /**
 * Delete items from a dashboard list.
 *
 * See {@link #deleteDashboardListItemsWithHttpInfoAsync}.
 *
 * @param dashboardListId ID of the dashboard list to delete items from. (required)
 * @param body Dashboards to delete from the dashboard list. (required)
 * @return CompletableFuture&lt;DashboardListDeleteItemsResponse&gt;
 */
  public CompletableFuture<DashboardListDeleteItemsResponse>deleteDashboardListItemsAsync(Long dashboardListId, DashboardListDeleteItemsRequest body) {
    return deleteDashboardListItemsWithHttpInfoAsync(dashboardListId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete dashboards from an existing dashboard list.</p>
   *
   * @param dashboardListId ID of the dashboard list to delete items from. (required)
   * @param body Dashboards to delete from the dashboard list. (required)
   * @return ApiResponse&lt;DashboardListDeleteItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListDeleteItemsResponse> deleteDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListDeleteItemsRequest body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DashboardListsApi.deleteDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListDeleteItemsResponse>() {});
  }

  /**
   * Delete items from a dashboard list.
   *
   * See {@link #deleteDashboardListItemsWithHttpInfo}.
   *
   * @param dashboardListId ID of the dashboard list to delete items from. (required)
   * @param body Dashboards to delete from the dashboard list. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListDeleteItemsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListDeleteItemsResponse>> deleteDashboardListItemsWithHttpInfoAsync(Long dashboardListId, DashboardListDeleteItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
        CompletableFuture<ApiResponse<DashboardListDeleteItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'dashboardListId' when calling deleteDashboardListItems"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DashboardListDeleteItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling deleteDashboardListItems"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DashboardListsApi.deleteDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListDeleteItemsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListDeleteItemsResponse>() {});
  }

  /**
 * Get items of a Dashboard List.
 *
 * See {@link #getDashboardListItemsWithHttpInfo}.
 *
 * @param dashboardListId ID of the dashboard list to get items from. (required)
 * @return DashboardListItems
 * @throws ApiException if fails to make API call
 */
  public DashboardListItems  getDashboardListItems(Long dashboardListId) throws ApiException {
    return getDashboardListItemsWithHttpInfo(dashboardListId).getData();
  }

  /**
 * Get items of a Dashboard List.
 *
 * See {@link #getDashboardListItemsWithHttpInfoAsync}.
 *
 * @param dashboardListId ID of the dashboard list to get items from. (required)
 * @return CompletableFuture&lt;DashboardListItems&gt;
 */
  public CompletableFuture<DashboardListItems>getDashboardListItemsAsync(Long dashboardListId) {
    return getDashboardListItemsWithHttpInfoAsync(dashboardListId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Fetch the dashboard list’s dashboard definitions.</p>
   *
   * @param dashboardListId ID of the dashboard list to get items from. (required)
   * @return ApiResponse&lt;DashboardListItems&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListItems> getDashboardListItemsWithHttpInfo(Long dashboardListId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardListId' when calling getDashboardListItems");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DashboardListsApi.getDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListItems>() {});
  }

  /**
   * Get items of a Dashboard List.
   *
   * See {@link #getDashboardListItemsWithHttpInfo}.
   *
   * @param dashboardListId ID of the dashboard list to get items from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListItems&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListItems>> getDashboardListItemsWithHttpInfoAsync(Long dashboardListId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
        CompletableFuture<ApiResponse<DashboardListItems>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'dashboardListId' when calling getDashboardListItems"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DashboardListsApi.getDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListItems>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListItems>() {});
  }

  /**
 * Update items of a dashboard list.
 *
 * See {@link #updateDashboardListItemsWithHttpInfo}.
 *
 * @param dashboardListId ID of the dashboard list to update items from. (required)
 * @param body New dashboards of the dashboard list. (required)
 * @return DashboardListUpdateItemsResponse
 * @throws ApiException if fails to make API call
 */
  public DashboardListUpdateItemsResponse  updateDashboardListItems(Long dashboardListId, DashboardListUpdateItemsRequest body) throws ApiException {
    return updateDashboardListItemsWithHttpInfo(dashboardListId, body).getData();
  }

  /**
 * Update items of a dashboard list.
 *
 * See {@link #updateDashboardListItemsWithHttpInfoAsync}.
 *
 * @param dashboardListId ID of the dashboard list to update items from. (required)
 * @param body New dashboards of the dashboard list. (required)
 * @return CompletableFuture&lt;DashboardListUpdateItemsResponse&gt;
 */
  public CompletableFuture<DashboardListUpdateItemsResponse>updateDashboardListItemsAsync(Long dashboardListId, DashboardListUpdateItemsRequest body) {
    return updateDashboardListItemsWithHttpInfoAsync(dashboardListId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update dashboards of an existing dashboard list.</p>
   *
   * @param dashboardListId ID of the dashboard list to update items from. (required)
   * @param body New dashboards of the dashboard list. (required)
   * @return ApiResponse&lt;DashboardListUpdateItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListUpdateItemsResponse> updateDashboardListItemsWithHttpInfo(Long dashboardListId, DashboardListUpdateItemsRequest body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DashboardListsApi.updateDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListUpdateItemsResponse>() {});
  }

  /**
   * Update items of a dashboard list.
   *
   * See {@link #updateDashboardListItemsWithHttpInfo}.
   *
   * @param dashboardListId ID of the dashboard list to update items from. (required)
   * @param body New dashboards of the dashboard list. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListUpdateItemsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListUpdateItemsResponse>> updateDashboardListItemsWithHttpInfoAsync(Long dashboardListId, DashboardListUpdateItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardListId' is set
    if (dashboardListId == null) {
        CompletableFuture<ApiResponse<DashboardListUpdateItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'dashboardListId' when calling updateDashboardListItems"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DashboardListUpdateItemsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateDashboardListItems"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards"
      .replaceAll("\\{" + "dashboard_list_id" + "\\}", apiClient.escapeString(dashboardListId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DashboardListsApi.updateDashboardListItems", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListUpdateItemsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DashboardListUpdateItemsResponse>() {});
  }
}