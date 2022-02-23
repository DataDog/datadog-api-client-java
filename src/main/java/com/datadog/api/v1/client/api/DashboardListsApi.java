package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v1.client.model.DashboardListDeleteResponse;
import com.datadog.api.v1.client.model.DashboardListListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

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
   *
   * <p>See {@link #createDashboardListWithHttpInfo}.
   *
   * @param body Create a dashboard list request body. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   */
  public DashboardList createDashboardList(DashboardList body) throws ApiException {
    return createDashboardListWithHttpInfo(body).getData();
  }

  /**
   * Create a dashboard list
   *
   * <p>See {@link #createDashboardListWithHttpInfoAsync}.
   *
   * @param body Create a dashboard list request body. (required)
   * @return CompletableFuture&lt;DashboardList&gt;
   */
  public CompletableFuture<DashboardList> createDashboardListAsync(DashboardList body) {
    return createDashboardListWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a dashboard list
   *
   * <p>Create an empty dashboard list.
   *
   * @param body Create a dashboard list request body. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardList> createDashboardListWithHttpInfo(DashboardList body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboardList");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardListsApi.createDashboardList",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }

  /**
   * Create a dashboard list
   *
   * <p>See {@link #createDashboardListWithHttpInfo}.
   *
   * @param body Create a dashboard list request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardList>> createDashboardListWithHttpInfoAsync(
      DashboardList body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDashboardList"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboardList");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardListsApi.createDashboardList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }

  /**
   * Delete a dashboard list
   *
   * <p>See {@link #deleteDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to delete. (required)
   * @return DashboardListDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardListDeleteResponse deleteDashboardList(Long listId) throws ApiException {
    return deleteDashboardListWithHttpInfo(listId).getData();
  }

  /**
   * Delete a dashboard list
   *
   * <p>See {@link #deleteDashboardListWithHttpInfoAsync}.
   *
   * @param listId ID of the dashboard list to delete. (required)
   * @return CompletableFuture&lt;DashboardListDeleteResponse&gt;
   */
  public CompletableFuture<DashboardListDeleteResponse> deleteDashboardListAsync(Long listId) {
    return deleteDashboardListWithHttpInfoAsync(listId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard list
   *
   * <p>Delete a dashboard list.
   *
   * @param listId ID of the dashboard list to delete. (required)
   * @return ApiResponse&lt;DashboardListDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListDeleteResponse> deleteDashboardListWithHttpInfo(Long listId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'listId' when calling deleteDashboardList");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardListsApi.deleteDashboardList",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardListDeleteResponse>() {});
  }

  /**
   * Delete a dashboard list
   *
   * <p>See {@link #deleteDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListDeleteResponse>>
      deleteDashboardListWithHttpInfoAsync(Long listId) {
    Object localVarPostBody = null;

    // verify the required parameter 'listId' is set
    if (listId == null) {
      CompletableFuture<ApiResponse<DashboardListDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'listId' when calling deleteDashboardList"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboardList");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardListsApi.deleteDashboardList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardListDeleteResponse>() {});
  }

  /**
   * Get a dashboard list
   *
   * <p>See {@link #getDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to fetch. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   */
  public DashboardList getDashboardList(Long listId) throws ApiException {
    return getDashboardListWithHttpInfo(listId).getData();
  }

  /**
   * Get a dashboard list
   *
   * <p>See {@link #getDashboardListWithHttpInfoAsync}.
   *
   * @param listId ID of the dashboard list to fetch. (required)
   * @return CompletableFuture&lt;DashboardList&gt;
   */
  public CompletableFuture<DashboardList> getDashboardListAsync(Long listId) {
    return getDashboardListWithHttpInfoAsync(listId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a dashboard list
   *
   * <p>Fetch an existing dashboard list&#39;s definition.
   *
   * @param listId ID of the dashboard list to fetch. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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
      throw new ApiException(
          400, "Missing the required parameter 'listId' when calling getDashboardList");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardListsApi.getDashboardList",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }

  /**
   * Get a dashboard list
   *
   * <p>See {@link #getDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to fetch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardList>> getDashboardListWithHttpInfoAsync(
      Long listId) {
    Object localVarPostBody = null;

    // verify the required parameter 'listId' is set
    if (listId == null) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'listId' when calling getDashboardList"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboardList");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardListsApi.getDashboardList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }

  /**
   * Get all dashboard lists
   *
   * <p>See {@link #listDashboardListsWithHttpInfo}.
   *
   * @return DashboardListListResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardListListResponse listDashboardLists() throws ApiException {
    return listDashboardListsWithHttpInfo().getData();
  }

  /**
   * Get all dashboard lists
   *
   * <p>See {@link #listDashboardListsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DashboardListListResponse&gt;
   */
  public CompletableFuture<DashboardListListResponse> listDashboardListsAsync() {
    return listDashboardListsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboard lists
   *
   * <p>Fetch all of your existing dashboard list definitions.
   *
   * @return ApiResponse&lt;DashboardListListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardListListResponse> listDashboardListsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardListsApi.listDashboardLists",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardListListResponse>() {});
  }

  /**
   * Get all dashboard lists
   *
   * <p>See {@link #listDashboardListsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardListListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardListListResponse>>
      listDashboardListsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/lists/manual";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDashboardLists");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardListsApi.listDashboardLists",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardListListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardListListResponse>() {});
  }

  /**
   * Update a dashboard list
   *
   * <p>See {@link #updateDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return DashboardList
   * @throws ApiException if fails to make API call
   */
  public DashboardList updateDashboardList(Long listId, DashboardList body) throws ApiException {
    return updateDashboardListWithHttpInfo(listId, body).getData();
  }

  /**
   * Update a dashboard list
   *
   * <p>See {@link #updateDashboardListWithHttpInfoAsync}.
   *
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return CompletableFuture&lt;DashboardList&gt;
   */
  public CompletableFuture<DashboardList> updateDashboardListAsync(
      Long listId, DashboardList body) {
    return updateDashboardListWithHttpInfoAsync(listId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a dashboard list
   *
   * <p>Update the name of a dashboard list.
   *
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return ApiResponse&lt;DashboardList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardList> updateDashboardListWithHttpInfo(Long listId, DashboardList body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'listId' is set
    if (listId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'listId' when calling updateDashboardList");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboardList");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardListsApi.updateDashboardList",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }

  /**
   * Update a dashboard list
   *
   * <p>See {@link #updateDashboardListWithHttpInfo}.
   *
   * @param listId ID of the dashboard list to update. (required)
   * @param body Update a dashboard list request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardList>> updateDashboardListWithHttpInfoAsync(
      Long listId, DashboardList body) {
    Object localVarPostBody = body;

    // verify the required parameter 'listId' is set
    if (listId == null) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'listId' when calling updateDashboardList"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDashboardList"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/lists/manual/{list_id}"
            .replaceAll("\\{" + "list_id" + "\\}", apiClient.escapeString(listId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboardList");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardListsApi.updateDashboardList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardList>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardList>() {});
  }
}
