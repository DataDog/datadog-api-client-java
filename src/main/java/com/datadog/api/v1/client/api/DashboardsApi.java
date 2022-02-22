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
import javax.ws.rs.client.Invocation;
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
   * Create a new dashboard
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard createDashboard(Dashboard body) throws ApiException {
    return createDashboardWithHttpInfo(body).getData();
  }

  /**
   * Create a new dashboard
   *
   * <p>See {@link #createDashboardWithHttpInfoAsync}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> createDashboardAsync(Dashboard body) {
    return createDashboardWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new dashboard
   *
   * <p>Create a dashboard using the specified options. When defining queries in your widgets, take
   * note of which queries should have the &#x60;as_count()&#x60; or &#x60;as_rate()&#x60; modifiers
   * appended. Refer to the following
   * [documentation](https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab&#x3D;count#in-application-modifiers)
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.createDashboard",
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Create a new dashboard
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDashboard");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.createDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Delete a dashboard
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return DashboardDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardDeleteResponse deleteDashboard(String dashboardId) throws ApiException {
    return deleteDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Delete a dashboard
   *
   * <p>See {@link #deleteDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;DashboardDeleteResponse&gt;
   */
  public CompletableFuture<DashboardDeleteResponse> deleteDashboardAsync(String dashboardId) {
    return deleteDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard
   *
   * <p>Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.deleteDashboard",
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
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete a dashboard
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardDeleteResponse&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboard");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.deleteDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete dashboards
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboards(DashboardBulkDeleteRequest body) throws ApiException {
    deleteDashboardsWithHttpInfo(body);
  }

  /**
   * Delete dashboards
   *
   * <p>See {@link #deleteDashboardsWithHttpInfoAsync}.
   *
   * @param body Delete dashboards request body. (required)
   */
  public CompletableFuture<Void> deleteDashboardsAsync(DashboardBulkDeleteRequest body) {
    return deleteDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete dashboards
   *
   * <p>Delete dashboards using the specified IDs. If there are any failures, no dashboards will be
   * deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.deleteDashboards",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete dashboards
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteDashboards");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.deleteDashboards",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a dashboard
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard getDashboard(String dashboardId) throws ApiException {
    return getDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Get a dashboard
   *
   * <p>See {@link #getDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> getDashboardAsync(String dashboardId) {
    return getDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a dashboard
   *
   * <p>Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.getDashboard",
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Get a dashboard
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDashboard");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.getDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
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
   * Get all dashboards
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards() throws ApiException {
    return listDashboardsWithHttpInfo(new ListDashboardsOptionalParameters()).getData();
  }

  /**
   * Get all dashboards
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;DashboardSummary&gt;
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync() {
    return listDashboardsWithHttpInfoAsync(new ListDashboardsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards(ListDashboardsOptionalParameters parameters)
      throws ApiException {
    return listDashboardsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all dashboards
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DashboardSummary&gt;
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
   * Get all dashboards
   *
   * <p>Get all dashboards. **Note**: This query will only return custom created or cloned
   * dashboards. This query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DashboardSummary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.listDashboards",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Get all dashboards
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardSummary&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardSummary>> listDashboardsWithHttpInfoAsync(
      ListDashboardsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDashboards");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.listDashboards",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardSummary>> result = new CompletableFuture<>();
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
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Restore deleted dashboards
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreDashboards(DashboardRestoreRequest body) throws ApiException {
    restoreDashboardsWithHttpInfo(body);
  }

  /**
   * Restore deleted dashboards
   *
   * <p>See {@link #restoreDashboardsWithHttpInfoAsync}.
   *
   * @param body Restore dashboards request body. (required)
   */
  public CompletableFuture<Void> restoreDashboardsAsync(DashboardRestoreRequest body) {
    return restoreDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore deleted dashboards
   *
   * <p>Restore dashboards using the specified IDs. If there are any failures, no dashboards will be
   * restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.restoreDashboards",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Restore deleted dashboards
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "restoreDashboards");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.restoreDashboards",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a dashboard
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard updateDashboard(String dashboardId, Dashboard body) throws ApiException {
    return updateDashboardWithHttpInfo(dashboardId, body).getData();
  }

  /**
   * Update a dashboard
   *
   * <p>See {@link #updateDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> updateDashboardAsync(String dashboardId, Dashboard body) {
    return updateDashboardWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a dashboard
   *
   * <p>Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "DashboardsApi.updateDashboard",
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Update a dashboard
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDashboard");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardsApi.updateDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
  }
}
