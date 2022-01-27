package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardBulkDeleteRequest;
import com.datadog.api.v1.client.model.DashboardDeleteResponse;
import com.datadog.api.v1.client.model.DashboardRestoreRequest;
import com.datadog.api.v1.client.model.DashboardSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
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
   * Create a new dashboard Create a dashboard using the specified options. When defining queries in
   * your widgets, take note of which queries should have the &#x60;as_count()&#x60; or
   * &#x60;as_rate()&#x60; modifiers appended. Refer to the following
   * [documentation](https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab&#x3D;count#in-application-modifiers)
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public Dashboard createDashboard(Dashboard body) throws ApiException {
    return createDashboardWithHttpInfo(body).getData();
  }

  public CompletableFuture<Dashboard> createDashboardAsync(Dashboard body) {
    return createDashboardWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new dashboard Create a dashboard using the specified options. When defining queries in
   * your widgets, take note of which queries should have the &#x60;as_count()&#x60; or
   * &#x60;as_rate()&#x60; modifiers appended. Refer to the following
   * [documentation](https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab&#x3D;count#in-application-modifiers)
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> createDashboardWithHttpInfo(Dashboard body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboard");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPI(
        "DashboardsApi.createDashboard",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create a new dashboard Create a dashboard using the specified options. When defining queries in
   * your widgets, take note of which queries should have the &#x60;as_count()&#x60; or
   * &#x60;as_rate()&#x60; modifiers appended. Refer to the following
   * [documentation](https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab&#x3D;count#in-application-modifiers)
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<Dashboard>> createDashboardWithHttpInfoAsync(
      Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.createDashboard",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete a dashboard Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return DashboardDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardDeleteResponse deleteDashboard(String dashboardId) throws ApiException {
    return deleteDashboardWithHttpInfo(dashboardId).getData();
  }

  public CompletableFuture<DashboardDeleteResponse> deleteDashboardAsync(String dashboardId) {
    return deleteDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardDeleteResponse> deleteDashboardWithHttpInfo(String dashboardId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<DashboardDeleteResponse> localVarReturnType =
        new GenericType<DashboardDeleteResponse>() {};

    return apiClient.invokeAPI(
        "DashboardsApi.deleteDashboard",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete a dashboard Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<DashboardDeleteResponse>> deleteDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling deleteDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<DashboardDeleteResponse> localVarReturnType =
        new GenericType<DashboardDeleteResponse>() {};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.deleteDashboard",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete dashboards Delete dashboards using the specified IDs. If there are any failures, no
   * dashboards will be deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteDashboards(DashboardBulkDeleteRequest body) throws ApiException {
    deleteDashboardsWithHttpInfo(body);
  }

  public CompletableFuture<Void> deleteDashboardsAsync(DashboardBulkDeleteRequest body) {
    return deleteDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete dashboards Delete dashboards using the specified IDs. If there are any failures, no
   * dashboards will be deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDashboardsWithHttpInfo(DashboardBulkDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "DashboardsApi.deleteDashboards",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Delete dashboards Delete dashboards using the specified IDs. If there are any failures, no
   * dashboards will be deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<Void>> deleteDashboardsWithHttpInfoAsync(
      DashboardBulkDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.deleteDashboards",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Get a dashboard Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public Dashboard getDashboard(String dashboardId) throws ApiException {
    return getDashboardWithHttpInfo(dashboardId).getData();
  }

  public CompletableFuture<Dashboard> getDashboardAsync(String dashboardId) {
    return getDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a dashboard Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling getDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPI(
        "DashboardsApi.getDashboard",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get a dashboard Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<Dashboard>> getDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling getDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.getDashboard",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listDashboards. */
  public static class ListDashboardsOptionalParameters {
    private Boolean filterShared;
    private Boolean filterDeleted;

    /**
     * Set filterShared
     *
     * @param filterShared When &#x60;true&#x60;, this query only returns shared custom created or
     *     cloned dashboards. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterShared(Boolean filterShared) {
      this.filterShared = filterShared;
      return this;
    }

    /**
     * Set filterDeleted
     *
     * @param filterDeleted When &#x60;true&#x60;, this query returns only deleted custom-created or
     *     cloned dashboards. This parameter is incompatible with &#x60;filter[shared]&#x60;.
     *     (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterDeleted(Boolean filterDeleted) {
      this.filterDeleted = filterDeleted;
      return this;
    }
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardSummary listDashboards() throws ApiException {
    return listDashboardsWithHttpInfo(new ListDashboardsOptionalParameters()).getData();
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @return CompletableFuture<DashboardSummary>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync() {
    return listDashboardsWithHttpInfoAsync(new ListDashboardsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public DashboardSummary listDashboards(ListDashboardsOptionalParameters parameters)
      throws ApiException {
    return listDashboardsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture<DashboardSummary>
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync(
      ListDashboardsOptionalParameters parameters) {
    return listDashboardsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DashboardSummary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardSummary> listDashboardsWithHttpInfo(
      ListDashboardsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<DashboardSummary> localVarReturnType = new GenericType<DashboardSummary>() {};

    return apiClient.invokeAPI(
        "DashboardsApi.listDashboards",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get all dashboards Get all dashboards. **Note**: This query will only return custom created or
   * cloned dashboards. This query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DashboardSummary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<DashboardSummary>> listDashboardsWithHttpInfoAsync(
      ListDashboardsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<DashboardSummary> localVarReturnType = new GenericType<DashboardSummary>() {};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.listDashboards",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Restore deleted dashboards Restore dashboards using the specified IDs. If there are any
   * failures, no dashboards will be restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void restoreDashboards(DashboardRestoreRequest body) throws ApiException {
    restoreDashboardsWithHttpInfo(body);
  }

  public CompletableFuture<Void> restoreDashboardsAsync(DashboardRestoreRequest body) {
    return restoreDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore deleted dashboards Restore dashboards using the specified IDs. If there are any
   * failures, no dashboards will be restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> restoreDashboardsWithHttpInfo(DashboardRestoreRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling restoreDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "restoreDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "DashboardsApi.restoreDashboards",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Restore deleted dashboards Restore dashboards using the specified IDs. If there are any
   * failures, no dashboards will be restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<Void>> restoreDashboardsWithHttpInfoAsync(
      DashboardRestoreRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling restoreDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "restoreDashboards");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.restoreDashboards",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Update a dashboard Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public Dashboard updateDashboard(String dashboardId, Dashboard body) throws ApiException {
    return updateDashboardWithHttpInfo(dashboardId, body).getData();
  }

  public CompletableFuture<Dashboard> updateDashboardAsync(String dashboardId, Dashboard body) {
    return updateDashboardWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a dashboard Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> updateDashboardWithHttpInfo(String dashboardId, Dashboard body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPI(
        "DashboardsApi.updateDashboard",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update a dashboard Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<Dashboard>> updateDashboardWithHttpInfoAsync(
      String dashboardId, Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling updateDashboard"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboard");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};

    return apiClient.invokeAPIAsync(
        "DashboardsApi.updateDashboard",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
