package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DashboardUsage;
import com.datadog.api.client.v2.model.DashboardUsageResponse;
import com.datadog.api.client.v2.model.ListDashboardsUsageResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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
   * Get usage stats for a dashboard.
   *
   * <p>See {@link #getDashboardUsageWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return DashboardUsageResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardUsageResponse getDashboardUsage(String dashboardId) throws ApiException {
    return getDashboardUsageWithHttpInfo(dashboardId).getData();
  }

  /**
   * Get usage stats for a dashboard.
   *
   * <p>See {@link #getDashboardUsageWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;DashboardUsageResponse&gt;
   */
  public CompletableFuture<DashboardUsageResponse> getDashboardUsageAsync(String dashboardId) {
    return getDashboardUsageWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get usage statistics for a single dashboard. The response includes view counts, the most recent
   * view and edit times, widget counts, and the dashboard quality score. View-count fields depend
   * on Real User Monitoring (RUM) and are <code>null</code> or <code>0</code> in orgs without RUM.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardUsageResponse&gt;
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
  public ApiResponse<DashboardUsageResponse> getDashboardUsageWithHttpInfo(String dashboardId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDashboardUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling getDashboardUsage");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/usage"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardsApi.getDashboardUsage",
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
        new GenericType<DashboardUsageResponse>() {});
  }

  /**
   * Get usage stats for a dashboard.
   *
   * <p>See {@link #getDashboardUsageWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardUsageResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardUsageResponse>> getDashboardUsageWithHttpInfoAsync(
      String dashboardId) {
    // Check if unstable operation is enabled
    String operationId = "getDashboardUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DashboardUsageResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardUsageResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling getDashboardUsage"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/usage"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardsApi.getDashboardUsage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardUsageResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardUsageResponse>() {});
  }

  /** Manage optional parameters to listDashboardsUsage. */
  public static class ListDashboardsUsageOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;
    private String filterEditedBefore;
    private String filterViewedBefore;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of dashboards to return per page. Server-side maximum is 500;
     *     values above 500 return a 400 Bad Request. (optional, default to 250)
     * @return ListDashboardsUsageOptionalParameters
     */
    public ListDashboardsUsageOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Zero-based offset into the result set. (optional, default to 0)
     * @return ListDashboardsUsageOptionalParameters
     */
    public ListDashboardsUsageOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filterEditedBefore.
     *
     * @param filterEditedBefore Return only dashboards whose last edit (<code>edited_at</code>) is
     *     strictly before this ISO 8601 timestamp (<code>edited_at &lt; value</code>; boundary
     *     matches are excluded). Must include a timezone offset (for example, <code>Z</code> or
     *     <code>+00:00</code>); naive timestamps return HTTP 400. (optional)
     * @return ListDashboardsUsageOptionalParameters
     */
    public ListDashboardsUsageOptionalParameters filterEditedBefore(String filterEditedBefore) {
      this.filterEditedBefore = filterEditedBefore;
      return this;
    }

    /**
     * Set filterViewedBefore.
     *
     * @param filterViewedBefore Return only dashboards whose most recent view (<code>viewed_at
     *     </code>) is strictly before this ISO 8601 timestamp, including dashboards that have never
     *     been viewed. Must include a timezone offset; naive timestamps return HTTP 400. Orgs
     *     without Real User Monitoring (RUM) will see all dashboards returned by this filter.
     *     (optional)
     * @return ListDashboardsUsageOptionalParameters
     */
    public ListDashboardsUsageOptionalParameters filterViewedBefore(String filterViewedBefore) {
      this.filterViewedBefore = filterViewedBefore;
      return this;
    }
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfo}.
   *
   * @return ListDashboardsUsageResponse
   * @throws ApiException if fails to make API call
   */
  public ListDashboardsUsageResponse listDashboardsUsage() throws ApiException {
    return listDashboardsUsageWithHttpInfo(new ListDashboardsUsageOptionalParameters()).getData();
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListDashboardsUsageResponse&gt;
   */
  public CompletableFuture<ListDashboardsUsageResponse> listDashboardsUsageAsync() {
    return listDashboardsUsageWithHttpInfoAsync(new ListDashboardsUsageOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListDashboardsUsageResponse
   * @throws ApiException if fails to make API call
   */
  public ListDashboardsUsageResponse listDashboardsUsage(
      ListDashboardsUsageOptionalParameters parameters) throws ApiException {
    return listDashboardsUsageWithHttpInfo(parameters).getData();
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListDashboardsUsageResponse&gt;
   */
  public CompletableFuture<ListDashboardsUsageResponse> listDashboardsUsageAsync(
      ListDashboardsUsageOptionalParameters parameters) {
    return listDashboardsUsageWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DashboardUsage&gt;
   */
  public PaginationIterable<DashboardUsage> listDashboardsUsageWithPagination() {
    ListDashboardsUsageOptionalParameters parameters = new ListDashboardsUsageOptionalParameters();
    return listDashboardsUsageWithPagination(parameters);
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfo}.
   *
   * @return ListDashboardsUsageResponse
   */
  public PaginationIterable<DashboardUsage> listDashboardsUsageWithPagination(
      ListDashboardsUsageOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 250l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDashboardsUsage",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get paginated usage statistics for every dashboard in the caller's organization. Use <code>
   * page[limit]</code> and <code>page[offset]</code> to walk the result set. Use <code>
   * filter[edited_before]</code> or <code>filter[viewed_before]</code> to narrow results by
   * recency. View-count fields depend on Real User Monitoring (RUM) and are <code>null</code> or
   * <code>0</code> in orgs without RUM.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListDashboardsUsageResponse&gt;
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
  public ApiResponse<ListDashboardsUsageResponse> listDashboardsUsageWithHttpInfo(
      ListDashboardsUsageOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDashboardsUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterEditedBefore = parameters.filterEditedBefore;
    String filterViewedBefore = parameters.filterViewedBefore;
    // create path and map variables
    String localVarPath = "/api/v2/dashboards/usage";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[edited_before]", filterEditedBefore));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[viewed_before]", filterViewedBefore));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardsApi.listDashboardsUsage",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListDashboardsUsageResponse>() {});
  }

  /**
   * Get usage stats for all dashboards.
   *
   * <p>See {@link #listDashboardsUsageWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListDashboardsUsageResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListDashboardsUsageResponse>>
      listDashboardsUsageWithHttpInfoAsync(ListDashboardsUsageOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listDashboardsUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListDashboardsUsageResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterEditedBefore = parameters.filterEditedBefore;
    String filterViewedBefore = parameters.filterViewedBefore;
    // create path and map variables
    String localVarPath = "/api/v2/dashboards/usage";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[edited_before]", filterEditedBefore));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[viewed_before]", filterViewedBefore));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DashboardsApi.listDashboardsUsage",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListDashboardsUsageResponse>> result =
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
        new GenericType<ListDashboardsUsageResponse>() {});
  }
}
