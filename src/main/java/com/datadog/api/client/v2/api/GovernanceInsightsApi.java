package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GovernanceInsightsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceInsightsApi {
  private ApiClient apiClient;

  public GovernanceInsightsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GovernanceInsightsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listGovernanceInsights. */
  public static class ListGovernanceInsightsOptionalParameters {
    private Boolean withValues;
    private String orgUuid;
    private List<String> filterProduct;

    /**
     * Set withValues.
     *
     * @param withValues Whether to compute and include the current and previous value of each
     *     insight. Defaults to <code>false</code>, in which case only insight metadata is returned.
     *     (optional)
     * @return ListGovernanceInsightsOptionalParameters
     */
    public ListGovernanceInsightsOptionalParameters withValues(Boolean withValues) {
      this.withValues = withValues;
      return this;
    }

    /**
     * Set orgUuid.
     *
     * @param orgUuid The UUID of the organization to compute insights for. Defaults to the
     *     organization of the authenticated user. Used to retrieve insights for a child
     *     organization from a parent organization. (optional)
     * @return ListGovernanceInsightsOptionalParameters
     */
    public ListGovernanceInsightsOptionalParameters orgUuid(String orgUuid) {
      this.orgUuid = orgUuid;
      return this;
    }

    /**
     * Set filterProduct.
     *
     * @param filterProduct Restrict the results to insights belonging to the given products. May be
     *     repeated to filter by multiple products. Matching is case-insensitive. (optional)
     * @return ListGovernanceInsightsOptionalParameters
     */
    public ListGovernanceInsightsOptionalParameters filterProduct(List<String> filterProduct) {
      this.filterProduct = filterProduct;
      return this;
    }
  }

  /**
   * List governance insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @return GovernanceInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceInsightsResponse listGovernanceInsights() throws ApiException {
    return listGovernanceInsightsWithHttpInfo(new ListGovernanceInsightsOptionalParameters())
        .getData();
  }

  /**
   * List governance insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceInsightsResponse&gt;
   */
  public CompletableFuture<GovernanceInsightsResponse> listGovernanceInsightsAsync() {
    return listGovernanceInsightsWithHttpInfoAsync(new ListGovernanceInsightsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List governance insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return GovernanceInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceInsightsResponse listGovernanceInsights(
      ListGovernanceInsightsOptionalParameters parameters) throws ApiException {
    return listGovernanceInsightsWithHttpInfo(parameters).getData();
  }

  /**
   * List governance insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GovernanceInsightsResponse&gt;
   */
  public CompletableFuture<GovernanceInsightsResponse> listGovernanceInsightsAsync(
      ListGovernanceInsightsOptionalParameters parameters) {
    return listGovernanceInsightsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of governance insights available to the organization. By default, only
   * insight metadata is returned; pass <code>withValues=true</code> to also compute and include
   * each insight's current and previous values. Insights can be filtered by product.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GovernanceInsightsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GovernanceInsightsResponse> listGovernanceInsightsWithHttpInfo(
      ListGovernanceInsightsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean withValues = parameters.withValues;
    String orgUuid = parameters.orgUuid;
    List<String> filterProduct = parameters.filterProduct;
    // create path and map variables
    String localVarPath = "/api/v2/governance/insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withValues", withValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orgUuid", orgUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[product]", filterProduct));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceInsightsApi.listGovernanceInsights",
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
        new GenericType<GovernanceInsightsResponse>() {});
  }

  /**
   * List governance insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceInsightsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceInsightsResponse>>
      listGovernanceInsightsWithHttpInfoAsync(ListGovernanceInsightsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceInsightsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean withValues = parameters.withValues;
    String orgUuid = parameters.orgUuid;
    List<String> filterProduct = parameters.filterProduct;
    // create path and map variables
    String localVarPath = "/api/v2/governance/insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withValues", withValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orgUuid", orgUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[product]", filterProduct));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceInsightsApi.listGovernanceInsights",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceInsightsResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceInsightsResponse>() {});
  }
}
