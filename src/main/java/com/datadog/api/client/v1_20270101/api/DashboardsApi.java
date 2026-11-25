package com.datadog.api.client.v1_20270101.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1_20270101.model.Dashboard;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
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
   * Create a new dashboard.
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
   * Create a new dashboard.
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
   * Create a dashboard using the specified options. When defining queries in your widgets, take
   * note of which queries should have the <code>as_count()</code> or <code>as_rate()</code>
   * modifiers appended. Refer to the following <a
   * href="https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab=count#in-application-modifiers">documentation</a>
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1_20270101.DashboardsApi.createDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Create a new dashboard.
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1_20270101.DashboardsApi.createDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Get a dashboard.
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
   * Get a dashboard.
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
   * Get a dashboard using the specified ID.
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1_20270101.DashboardsApi.getDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Get a dashboard.
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1_20270101.DashboardsApi.getDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /**
   * Update a dashboard.
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
   * Update a dashboard.
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
   * Update a dashboard using the specified ID.
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1_20270101.DashboardsApi.updateDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Update a dashboard.
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
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1_20270101.DashboardsApi.updateDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
