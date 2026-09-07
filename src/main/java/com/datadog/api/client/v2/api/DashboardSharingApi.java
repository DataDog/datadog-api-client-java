package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ListSharedDashboardsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSharingApi {
  private ApiClient apiClient;

  public DashboardSharingApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardSharingApi(ApiClient apiClient) {
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
   * List shared dashboards for a dashboard.
   *
   * <p>See {@link #listSharedDashboardsByDashboardIdWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard. (required)
   * @return ListSharedDashboardsResponse
   * @throws ApiException if fails to make API call
   */
  public ListSharedDashboardsResponse listSharedDashboardsByDashboardId(String dashboardId)
      throws ApiException {
    return listSharedDashboardsByDashboardIdWithHttpInfo(dashboardId).getData();
  }

  /**
   * List shared dashboards for a dashboard.
   *
   * <p>See {@link #listSharedDashboardsByDashboardIdWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the dashboard. (required)
   * @return CompletableFuture&lt;ListSharedDashboardsResponse&gt;
   */
  public CompletableFuture<ListSharedDashboardsResponse> listSharedDashboardsByDashboardIdAsync(
      String dashboardId) {
    return listSharedDashboardsByDashboardIdWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve shared dashboards associated with the specified dashboard.
   *
   * @param dashboardId ID of the dashboard. (required)
   * @return ApiResponse&lt;ListSharedDashboardsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboard Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListSharedDashboardsResponse> listSharedDashboardsByDashboardIdWithHttpInfo(
      String dashboardId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listSharedDashboardsByDashboardId";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling"
              + " listSharedDashboardsByDashboardId");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardSharingApi.listSharedDashboardsByDashboardId",
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
        new GenericType<ListSharedDashboardsResponse>() {});
  }

  /**
   * List shared dashboards for a dashboard.
   *
   * <p>See {@link #listSharedDashboardsByDashboardIdWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListSharedDashboardsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListSharedDashboardsResponse>>
      listSharedDashboardsByDashboardIdWithHttpInfoAsync(String dashboardId) {
    // Check if unstable operation is enabled
    String operationId = "listSharedDashboardsByDashboardId";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListSharedDashboardsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<ListSharedDashboardsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " listSharedDashboardsByDashboardId"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboard/{dashboard_id}/shared"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardSharingApi.listSharedDashboardsByDashboardId",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListSharedDashboardsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListSharedDashboardsResponse>() {});
  }
}
