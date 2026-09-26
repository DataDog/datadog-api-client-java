package com.datadog.api.client.v1_20270101.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1_20270101.model.DashboardSummary;
import com.datadog.api.client.v1_20270101.model.DashboardSummaryDefinition;
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

  /** Manage optional parameters to listDashboards. */
  public static class ListDashboardsOptionalParameters {
    private Boolean filterShared;
    private Boolean filterDeleted;
    private Long count;
    private Long start;

    /**
     * Set filterShared.
     *
     * @param filterShared When <code>true</code>, this query only returns shared custom created or
     *     cloned dashboards. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterShared(Boolean filterShared) {
      this.filterShared = filterShared;
      return this;
    }

    /**
     * Set filterDeleted.
     *
     * @param filterDeleted When <code>true</code>, this query returns only deleted custom-created
     *     or cloned dashboards. This parameter is incompatible with <code>filter[shared]</code>.
     *     (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterDeleted(Boolean filterDeleted) {
      this.filterDeleted = filterDeleted;
      return this;
    }

    /**
     * Set count.
     *
     * @param count The maximum number of dashboards returned in the list. (optional, default to
     *     100)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set start.
     *
     * @param start The specific offset to use as the beginning of the returned response. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }
  }

  /**
   * Get all dashboards.
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
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
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
   * Get all dashboards.
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
   * Get all dashboards.
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
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DashboardSummaryDefinition&gt;
   */
  public PaginationIterable<DashboardSummaryDefinition> listDashboardsWithPagination() {
    ListDashboardsOptionalParameters parameters = new ListDashboardsOptionalParameters();
    return listDashboardsWithPagination(parameters);
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return DashboardSummary
   */
  public PaginationIterable<DashboardSummaryDefinition> listDashboardsWithPagination(
      ListDashboardsOptionalParameters parameters) {
    String resultsPath = "getDashboards";
    String valueGetterPath = "";
    String valueSetterPath = "start";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.count == null) {
      limit = 100l;
      parameters.count(limit);
    } else {
      limit = parameters.count;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDashboards",
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
   * Get all dashboards.
   *
   * <p><strong>Note</strong>: This query will only return custom created or cloned dashboards. This
   * query will not return preset dashboards.
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
    Long count = parameters.count;
    Long start = parameters.start;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1_20270101.DashboardsApi.listDashboards",
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
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Get all dashboards.
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
    Long count = parameters.count;
    Long start = parameters.start;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    localVarHeaderParams.put("DD-API-Version", "2027-01-01");

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1_20270101.DashboardsApi.listDashboards",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
}
