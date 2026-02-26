
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
import com.datadog.api.client.v2.model.ActiveBillingDimensionsResponse;
import com.datadog.api.client.v2.model.MonthlyCostAttributionResponse;
import com.datadog.api.client.v2.model.SortDirection;
import com.datadog.api.client.v2.model.UsageApplicationSecurityMonitoringResponse;
import com.datadog.api.client.v2.model.BillingDimensionsMappingResponse;
import com.datadog.api.client.v2.model.CostByOrgResponse;
import com.datadog.api.client.v2.model.HourlyUsageResponse;
import com.datadog.api.client.v2.model.UsageLambdaTracedInvocationsResponse;
import com.datadog.api.client.v2.model.UsageObservabilityPipelinesResponse;
import com.datadog.api.client.v2.model.ProjectedCostResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageMeteringApi {
  private ApiClient apiClient;
  public UsageMeteringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public UsageMeteringApi(ApiClient apiClient) {
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
 * Get active billing dimensions for cost attribution.
 *
 * See {@link #getActiveBillingDimensionsWithHttpInfo}.
 *
 * @return ActiveBillingDimensionsResponse
 * @throws ApiException if fails to make API call
 */
  public ActiveBillingDimensionsResponse  getActiveBillingDimensions() throws ApiException {
    return getActiveBillingDimensionsWithHttpInfo().getData();
  }

  /**
 * Get active billing dimensions for cost attribution.
 *
 * See {@link #getActiveBillingDimensionsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ActiveBillingDimensionsResponse&gt;
 */
  public CompletableFuture<ActiveBillingDimensionsResponse>getActiveBillingDimensionsAsync() {
    return getActiveBillingDimensionsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get active billing dimensions for cost attribution. Cost data for a given month becomes available no later than the 19th of the following month.</p>
   *
   * @return ApiResponse&lt;ActiveBillingDimensionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ActiveBillingDimensionsResponse> getActiveBillingDimensionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost_by_tag/active_billing_dimensions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getActiveBillingDimensions", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ActiveBillingDimensionsResponse>() {});
  }

  /**
   * Get active billing dimensions for cost attribution.
   *
   * See {@link #getActiveBillingDimensionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ActiveBillingDimensionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ActiveBillingDimensionsResponse>> getActiveBillingDimensionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost_by_tag/active_billing_dimensions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getActiveBillingDimensions", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ActiveBillingDimensionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ActiveBillingDimensionsResponse>() {});
  }

  /**
   * Manage optional parameters to getBillingDimensionMapping.
   */
  public static class GetBillingDimensionMappingOptionalParameters {
    private OffsetDateTime filterMonth;
    private String filterView;

    /**
     * Set filterMonth.
     * @param filterMonth Datetime in ISO-8601 format, UTC, and for mappings beginning this month. Defaults to the current month. (optional)
     * @return GetBillingDimensionMappingOptionalParameters
     */
    public GetBillingDimensionMappingOptionalParameters filterMonth(OffsetDateTime filterMonth) {
      this.filterMonth = filterMonth;
      return this;
    }

    /**
     * Set filterView.
     * @param filterView String to specify whether to retrieve active billing dimension mappings for the contract or for all available mappings. Allowed views have the string <code>active</code> or <code>all</code>. Defaults to <code>active</code>. (optional, default to "active")
     * @return GetBillingDimensionMappingOptionalParameters
     */
    public GetBillingDimensionMappingOptionalParameters filterView(String filterView) {
      this.filterView = filterView;
      return this;
    }
  }

  /**
 * Get billing dimension mapping for usage endpoints.
 *
 * See {@link #getBillingDimensionMappingWithHttpInfo}.
 *
 * @return BillingDimensionsMappingResponse
 * @throws ApiException if fails to make API call
 */
  public BillingDimensionsMappingResponse getBillingDimensionMapping () throws ApiException {
    return getBillingDimensionMappingWithHttpInfo(new GetBillingDimensionMappingOptionalParameters()).getData();
  }

  /**
 * Get billing dimension mapping for usage endpoints.
 *
 * See {@link #getBillingDimensionMappingWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;BillingDimensionsMappingResponse&gt;
 */
  public CompletableFuture<BillingDimensionsMappingResponse>getBillingDimensionMappingAsync() {
    return getBillingDimensionMappingWithHttpInfoAsync(new GetBillingDimensionMappingOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get billing dimension mapping for usage endpoints.
 *
 * See {@link #getBillingDimensionMappingWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return BillingDimensionsMappingResponse
 * @throws ApiException if fails to make API call
 */
  public BillingDimensionsMappingResponse getBillingDimensionMapping(GetBillingDimensionMappingOptionalParameters parameters) throws ApiException {
    return getBillingDimensionMappingWithHttpInfo(parameters).getData();
  }

  /**
 * Get billing dimension mapping for usage endpoints.
 *
 * See {@link #getBillingDimensionMappingWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;BillingDimensionsMappingResponse&gt;
 */
  public CompletableFuture<BillingDimensionsMappingResponse>getBillingDimensionMappingAsync(GetBillingDimensionMappingOptionalParameters parameters) {
    return getBillingDimensionMappingWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a mapping of billing dimensions to the corresponding keys for the supported usage metering public API endpoints.
   * Mapping data is updated on a monthly cadence.</p>
   * <p>This endpoint is only accessible to <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;BillingDimensionsMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BillingDimensionsMappingResponse> getBillingDimensionMappingWithHttpInfo(GetBillingDimensionMappingOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime filterMonth = parameters.filterMonth;
    String filterView = parameters.filterView;
    // create path and map variables
    String localVarPath = "/api/v2/usage/billing_dimension_mapping";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view]", filterView));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getBillingDimensionMapping", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<BillingDimensionsMappingResponse>() {});
  }

  /**
   * Get billing dimension mapping for usage endpoints.
   *
   * See {@link #getBillingDimensionMappingWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;BillingDimensionsMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BillingDimensionsMappingResponse>> getBillingDimensionMappingWithHttpInfoAsync(GetBillingDimensionMappingOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime filterMonth = parameters.filterMonth;
    String filterView = parameters.filterView;
    // create path and map variables
    String localVarPath = "/api/v2/usage/billing_dimension_mapping";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view]", filterView));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getBillingDimensionMapping", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BillingDimensionsMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<BillingDimensionsMappingResponse>() {});
  }

  /**
   * Manage optional parameters to getCostByOrg.
   */
  public static class GetCostByOrgOptionalParameters {
    private OffsetDateTime endMonth;

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost ending this month. (optional)
     * @return GetCostByOrgOptionalParameters
     */
    public GetCostByOrgOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }
  }

  /**
 * Get cost across multi-org account.
 *
 * See {@link #getCostByOrgWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public CostByOrgResponse getCostByOrg (OffsetDateTime startMonth) throws ApiException {
    return getCostByOrgWithHttpInfo( startMonth, new GetCostByOrgOptionalParameters()).getData();
  }

  /**
 * Get cost across multi-org account.
 *
 * See {@link #getCostByOrgWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<CostByOrgResponse>getCostByOrgAsync(OffsetDateTime startMonth) {
    return getCostByOrgWithHttpInfoAsync(startMonth, new GetCostByOrgOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get cost across multi-org account.
 *
 * See {@link #getCostByOrgWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @param parameters Optional parameters for the request.
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public CostByOrgResponse getCostByOrg(OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) throws ApiException {
    return getCostByOrgWithHttpInfo(startMonth, parameters).getData();
  }

  /**
 * Get cost across multi-org account.
 *
 * See {@link #getCostByOrgWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<CostByOrgResponse>getCostByOrgAsync( OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) {
    return getCostByOrgWithHttpInfoAsync(startMonth, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get cost across multi-org account.
   * Cost by org data for a given month becomes available no later than the 16th of the following month.
   * <strong>Note:</strong> This endpoint has been deprecated. Please use the new endpoint
   * <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-historical-cost-across-your-account"><code>/historical_cost</code></a>
   * instead.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostByOrgResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CostByOrgResponse> getCostByOrgWithHttpInfo(OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getCostByOrg");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    // create path and map variables
    String localVarPath = "/api/v2/usage/cost_by_org";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Get cost across multi-org account.
   *
   * See {@link #getCostByOrgWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostByOrgResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<CostByOrgResponse>> getCostByOrgWithHttpInfoAsync(OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
        CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startMonth' when calling getCostByOrg"));
        return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    // create path and map variables
    String localVarPath = "/api/v2/usage/cost_by_org";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Manage optional parameters to getEstimatedCostByOrg.
   */
  public static class GetEstimatedCostByOrgOptionalParameters {
    private String view;
    private OffsetDateTime startMonth;
    private OffsetDateTime endMonth;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private Boolean includeConnectedAccounts;

    /**
     * Set view.
     * @param view String to specify whether cost is broken down at a parent-org level or at the sub-org level. Available views are <code>summary</code> and <code>sub-org</code>. Defaults to <code>summary</code>. (optional)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters view(String view) {
      this.view = view;
      return this;
    }

    /**
     * Set startMonth.
     * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. <strong>Either start_month or start_date should be specified, but not both.</strong> (start_month cannot go beyond two months in the past). Provide an <code>end_month</code> to view month-over-month cost. (optional)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters startMonth(OffsetDateTime startMonth) {
      this.startMonth = startMonth;
      return this;
    }

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost ending this month. (optional)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set startDate.
     * @param startDate Datetime in ISO-8601 format, UTC, precise to day: <code>[YYYY-MM-DD]</code> for cost beginning this day. <strong>Either start_month or start_date should be specified, but not both.</strong> (start_date cannot go beyond two months in the past). Provide an <code>end_date</code> to view day-over-day cumulative cost. (optional)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters startDate(OffsetDateTime startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Set endDate.
     * @param endDate Datetime in ISO-8601 format, UTC, precise to day: <code>[YYYY-MM-DD]</code> for cost ending this day. (optional)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters endDate(OffsetDateTime endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * Set includeConnectedAccounts.
     * @param includeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to <code>false</code>.  (optional, default to false)
     * @return GetEstimatedCostByOrgOptionalParameters
     */
    public GetEstimatedCostByOrgOptionalParameters includeConnectedAccounts(Boolean includeConnectedAccounts) {
      this.includeConnectedAccounts = includeConnectedAccounts;
      return this;
    }
  }

  /**
 * Get estimated cost across your account.
 *
 * See {@link #getEstimatedCostByOrgWithHttpInfo}.
 *
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 */
  public CostByOrgResponse getEstimatedCostByOrg () throws ApiException {
    return getEstimatedCostByOrgWithHttpInfo(new GetEstimatedCostByOrgOptionalParameters()).getData();
  }

  /**
 * Get estimated cost across your account.
 *
 * See {@link #getEstimatedCostByOrgWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 */
  public CompletableFuture<CostByOrgResponse>getEstimatedCostByOrgAsync() {
    return getEstimatedCostByOrgWithHttpInfoAsync(new GetEstimatedCostByOrgOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get estimated cost across your account.
 *
 * See {@link #getEstimatedCostByOrgWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 */
  public CostByOrgResponse getEstimatedCostByOrg(GetEstimatedCostByOrgOptionalParameters parameters) throws ApiException {
    return getEstimatedCostByOrgWithHttpInfo(parameters).getData();
  }

  /**
 * Get estimated cost across your account.
 *
 * See {@link #getEstimatedCostByOrgWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 */
  public CompletableFuture<CostByOrgResponse>getEstimatedCostByOrgAsync(GetEstimatedCostByOrgOptionalParameters parameters) {
    return getEstimatedCostByOrgWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get estimated cost across multi-org and single root-org accounts.
   * Estimated cost data is only available for the current month and previous month
   * and is delayed by up to 72 hours from when it was incurred.
   * To access historical costs prior to this, use the <code>/historical_cost</code> endpoint.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostByOrgResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CostByOrgResponse> getEstimatedCostByOrgWithHttpInfo(GetEstimatedCostByOrgOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String view = parameters.view;
    OffsetDateTime startMonth = parameters.startMonth;
    OffsetDateTime endMonth = parameters.endMonth;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/estimated_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getEstimatedCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Get estimated cost across your account.
   *
   * See {@link #getEstimatedCostByOrgWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostByOrgResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostByOrgResponse>> getEstimatedCostByOrgWithHttpInfoAsync(GetEstimatedCostByOrgOptionalParameters parameters) {
    Object localVarPostBody = null;
    String view = parameters.view;
    OffsetDateTime startMonth = parameters.startMonth;
    OffsetDateTime endMonth = parameters.endMonth;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/estimated_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getEstimatedCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Manage optional parameters to getHistoricalCostByOrg.
   */
  public static class GetHistoricalCostByOrgOptionalParameters {
    private String view;
    private OffsetDateTime endMonth;
    private Boolean includeConnectedAccounts;

    /**
     * Set view.
     * @param view String to specify whether cost is broken down at a parent-org level or at the sub-org level. Available views are <code>summary</code> and <code>sub-org</code>.  Defaults to <code>summary</code>. (optional)
     * @return GetHistoricalCostByOrgOptionalParameters
     */
    public GetHistoricalCostByOrgOptionalParameters view(String view) {
      this.view = view;
      return this;
    }

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost ending this month. (optional)
     * @return GetHistoricalCostByOrgOptionalParameters
     */
    public GetHistoricalCostByOrgOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set includeConnectedAccounts.
     * @param includeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to <code>false</code>.  (optional, default to false)
     * @return GetHistoricalCostByOrgOptionalParameters
     */
    public GetHistoricalCostByOrgOptionalParameters includeConnectedAccounts(Boolean includeConnectedAccounts) {
      this.includeConnectedAccounts = includeConnectedAccounts;
      return this;
    }
  }

  /**
 * Get historical cost across your account.
 *
 * See {@link #getHistoricalCostByOrgWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 */
  public CostByOrgResponse getHistoricalCostByOrg (OffsetDateTime startMonth) throws ApiException {
    return getHistoricalCostByOrgWithHttpInfo( startMonth, new GetHistoricalCostByOrgOptionalParameters()).getData();
  }

  /**
 * Get historical cost across your account.
 *
 * See {@link #getHistoricalCostByOrgWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 */
  public CompletableFuture<CostByOrgResponse>getHistoricalCostByOrgAsync(OffsetDateTime startMonth) {
    return getHistoricalCostByOrgWithHttpInfoAsync(startMonth, new GetHistoricalCostByOrgOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get historical cost across your account.
 *
 * See {@link #getHistoricalCostByOrgWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @param parameters Optional parameters for the request.
 * @return CostByOrgResponse
 * @throws ApiException if fails to make API call
 */
  public CostByOrgResponse getHistoricalCostByOrg(OffsetDateTime startMonth, GetHistoricalCostByOrgOptionalParameters parameters) throws ApiException {
    return getHistoricalCostByOrgWithHttpInfo(startMonth, parameters).getData();
  }

  /**
 * Get historical cost across your account.
 *
 * See {@link #getHistoricalCostByOrgWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CostByOrgResponse&gt;
 */
  public CompletableFuture<CostByOrgResponse>getHistoricalCostByOrgAsync( OffsetDateTime startMonth, GetHistoricalCostByOrgOptionalParameters parameters) {
    return getHistoricalCostByOrgWithHttpInfoAsync(startMonth, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get historical cost across multi-org and single root-org accounts.
   * Cost data for a given month becomes available no later than the 16th of the following month.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostByOrgResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CostByOrgResponse> getHistoricalCostByOrgWithHttpInfo(OffsetDateTime startMonth, GetHistoricalCostByOrgOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getHistoricalCostByOrg");
    }
    String view = parameters.view;
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/historical_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getHistoricalCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Get historical cost across your account.
   *
   * See {@link #getHistoricalCostByOrgWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostByOrgResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostByOrgResponse>> getHistoricalCostByOrgWithHttpInfoAsync(OffsetDateTime startMonth, GetHistoricalCostByOrgOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
        CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startMonth' when calling getHistoricalCostByOrg"));
        return result;
    }
    String view = parameters.view;
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/historical_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getHistoricalCostByOrg", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Manage optional parameters to getHourlyUsage.
   */
  public static class GetHourlyUsageOptionalParameters {
    private OffsetDateTime filterTimestampEnd;
    private Boolean filterIncludeDescendants;
    private Boolean filterIncludeConnectedAccounts;
    private Boolean filterIncludeBreakdown;
    private String filterVersions;
    private Integer pageLimit;
    private String pageNextRecordId;

    /**
     * Set filterTimestampEnd.
     * @param filterTimestampEnd Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters filterTimestampEnd(OffsetDateTime filterTimestampEnd) {
      this.filterTimestampEnd = filterTimestampEnd;
      return this;
    }

    /**
     * Set filterIncludeDescendants.
     * @param filterIncludeDescendants Include child org usage in the response. Defaults to false. (optional, default to false)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters filterIncludeDescendants(Boolean filterIncludeDescendants) {
      this.filterIncludeDescendants = filterIncludeDescendants;
      return this;
    }

    /**
     * Set filterIncludeConnectedAccounts.
     * @param filterIncludeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to false. (optional, default to false)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters filterIncludeConnectedAccounts(Boolean filterIncludeConnectedAccounts) {
      this.filterIncludeConnectedAccounts = filterIncludeConnectedAccounts;
      return this;
    }

    /**
     * Set filterIncludeBreakdown.
     * @param filterIncludeBreakdown Include breakdown of usage by subcategories where applicable (for product family logs only). Defaults to false. (optional, default to false)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters filterIncludeBreakdown(Boolean filterIncludeBreakdown) {
      this.filterIncludeBreakdown = filterIncludeBreakdown;
      return this;
    }

    /**
     * Set filterVersions.
     * @param filterVersions Comma separated list of product family versions to use in the format <code>product_family:version</code>. For example, <code>infra_hosts:1.0.0</code>. If this parameter is not used, the API will use the latest version of each requested product family. Currently all families have one version <code>1.0.0</code>. (optional)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters filterVersions(String filterVersions) {
      this.filterVersions = filterVersions;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of results to return (between 1 and 500) - defaults to 500 if limit not specified. (optional, default to 500)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageNextRecordId.
     * @param pageNextRecordId List following results with a next_record_id provided in the previous query. (optional)
     * @return GetHourlyUsageOptionalParameters
     */
    public GetHourlyUsageOptionalParameters pageNextRecordId(String pageNextRecordId) {
      this.pageNextRecordId = pageNextRecordId;
      return this;
    }
  }

  /**
 * Get hourly usage by product family.
 *
 * See {@link #getHourlyUsageWithHttpInfo}.
 *
 * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
 * @return HourlyUsageResponse
 * @throws ApiException if fails to make API call
 */
  public HourlyUsageResponse getHourlyUsage (OffsetDateTime filterTimestampStart, String filterProductFamilies) throws ApiException {
    return getHourlyUsageWithHttpInfo( filterTimestampStart,  filterProductFamilies, new GetHourlyUsageOptionalParameters()).getData();
  }

  /**
 * Get hourly usage by product family.
 *
 * See {@link #getHourlyUsageWithHttpInfoAsync}.
 *
 * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
 * @return CompletableFuture&lt;HourlyUsageResponse&gt;
 */
  public CompletableFuture<HourlyUsageResponse>getHourlyUsageAsync(OffsetDateTime filterTimestampStart, String filterProductFamilies) {
    return getHourlyUsageWithHttpInfoAsync(filterTimestampStart, filterProductFamilies, new GetHourlyUsageOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage by product family.
 *
 * See {@link #getHourlyUsageWithHttpInfo}.
 *
 * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return HourlyUsageResponse
 * @throws ApiException if fails to make API call
 */
  public HourlyUsageResponse getHourlyUsage(OffsetDateTime filterTimestampStart, String filterProductFamilies, GetHourlyUsageOptionalParameters parameters) throws ApiException {
    return getHourlyUsageWithHttpInfo(filterTimestampStart, filterProductFamilies, parameters).getData();
  }

  /**
 * Get hourly usage by product family.
 *
 * See {@link #getHourlyUsageWithHttpInfoAsync}.
 *
 * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;HourlyUsageResponse&gt;
 */
  public CompletableFuture<HourlyUsageResponse>getHourlyUsageAsync( OffsetDateTime filterTimestampStart,  String filterProductFamilies, GetHourlyUsageOptionalParameters parameters) {
    return getHourlyUsageWithHttpInfoAsync(filterTimestampStart, filterProductFamilies, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage by product family.</p>
   *
   * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HourlyUsageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HourlyUsageResponse> getHourlyUsageWithHttpInfo(OffsetDateTime filterTimestampStart, String filterProductFamilies, GetHourlyUsageOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'filterTimestampStart' is set
    if (filterTimestampStart == null) {
      throw new ApiException(400, "Missing the required parameter 'filterTimestampStart' when calling getHourlyUsage");
    }

    // verify the required parameter 'filterProductFamilies' is set
    if (filterProductFamilies == null) {
      throw new ApiException(400, "Missing the required parameter 'filterProductFamilies' when calling getHourlyUsage");
    }
    OffsetDateTime filterTimestampEnd = parameters.filterTimestampEnd;
    Boolean filterIncludeDescendants = parameters.filterIncludeDescendants;
    Boolean filterIncludeConnectedAccounts = parameters.filterIncludeConnectedAccounts;
    Boolean filterIncludeBreakdown = parameters.filterIncludeBreakdown;
    String filterVersions = parameters.filterVersions;
    Integer pageLimit = parameters.pageLimit;
    String pageNextRecordId = parameters.pageNextRecordId;
    // create path and map variables
    String localVarPath = "/api/v2/usage/hourly_usage";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][start]", filterTimestampStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[product_families]", filterProductFamilies));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][end]", filterTimestampEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_descendants]", filterIncludeDescendants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_connected_accounts]", filterIncludeConnectedAccounts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_breakdown]", filterIncludeBreakdown));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[versions]", filterVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[next_record_id]", pageNextRecordId));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getHourlyUsage", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<HourlyUsageResponse>() {});
  }

  /**
   * Get hourly usage by product family.
   *
   * See {@link #getHourlyUsageWithHttpInfo}.
   *
   * @param filterTimestampStart Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param filterProductFamilies Comma separated list of product families to retrieve. Available families are <code>all</code>, <code>analyzed_logs</code>, <code>application_security</code>, <code>audit_trail</code>, <code>bits_ai</code>, <code>serverless</code>, <code>ci_app</code>, <code>cloud_cost_management</code>, <code>cloud_siem</code>, <code>csm_container_enterprise</code>, <code>csm_host_enterprise</code>, <code>cspm</code>, <code>custom_events</code>, <code>cws</code>, <code>dbm</code>, <code>error_tracking</code>, <code>fargate</code>, <code>infra_hosts</code>, <code>incident_management</code>, <code>indexed_logs</code>, <code>indexed_spans</code>, <code>ingested_spans</code>, <code>iot</code>, <code>lambda_traced_invocations</code>, <code>llm_observability</code>, <code>logs</code>, <code>network_flows</code>, <code>network_hosts</code>, <code>network_monitoring</code>, <code>observability_pipelines</code>, <code>online_archive</code>, <code>profiling</code>, <code>product_analytics</code>, <code>rum</code>, <code>rum_browser_sessions</code>, <code>rum_mobile_sessions</code>, <code>sds</code>, <code>snmp</code>, <code>software_delivery</code>, <code>synthetics_api</code>, <code>synthetics_browser</code>, <code>synthetics_mobile</code>, <code>synthetics_parallel_testing</code>, <code>timeseries</code>, <code>vuln_management</code> and <code>workflow_executions</code>. The following product family has been <strong>deprecated</strong>: <code>audit_logs</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HourlyUsageResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HourlyUsageResponse>> getHourlyUsageWithHttpInfoAsync(OffsetDateTime filterTimestampStart, String filterProductFamilies, GetHourlyUsageOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'filterTimestampStart' is set
    if (filterTimestampStart == null) {
        CompletableFuture<ApiResponse<HourlyUsageResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'filterTimestampStart' when calling getHourlyUsage"));
        return result;
    }

    // verify the required parameter 'filterProductFamilies' is set
    if (filterProductFamilies == null) {
        CompletableFuture<ApiResponse<HourlyUsageResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'filterProductFamilies' when calling getHourlyUsage"));
        return result;
    }
    OffsetDateTime filterTimestampEnd = parameters.filterTimestampEnd;
    Boolean filterIncludeDescendants = parameters.filterIncludeDescendants;
    Boolean filterIncludeConnectedAccounts = parameters.filterIncludeConnectedAccounts;
    Boolean filterIncludeBreakdown = parameters.filterIncludeBreakdown;
    String filterVersions = parameters.filterVersions;
    Integer pageLimit = parameters.pageLimit;
    String pageNextRecordId = parameters.pageNextRecordId;
    // create path and map variables
    String localVarPath = "/api/v2/usage/hourly_usage";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][start]", filterTimestampStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[product_families]", filterProductFamilies));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][end]", filterTimestampEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_descendants]", filterIncludeDescendants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_connected_accounts]", filterIncludeConnectedAccounts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_breakdown]", filterIncludeBreakdown));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[versions]", filterVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[next_record_id]", pageNextRecordId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getHourlyUsage", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HourlyUsageResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<HourlyUsageResponse>() {});
  }

  /**
   * Manage optional parameters to getMonthlyCostAttribution.
   */
  public static class GetMonthlyCostAttributionOptionalParameters {
    private OffsetDateTime endMonth;
    private SortDirection sortDirection;
    private String sortName;
    private String tagBreakdownKeys;
    private String nextRecordId;
    private Boolean includeDescendants;

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost ending this month. (optional)
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set sortDirection.
     * @param sortDirection The direction to sort by: <code>[desc, asc]</code>. (optional, default to "desc")
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters sortDirection(SortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName.
     * @param sortName The billing dimension to sort by. Always sorted by total cost. Example: <code>infra_host</code>. (optional)
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters sortName(String sortName) {
      this.sortName = sortName;
      return this;
    }

    /**
     * Set tagBreakdownKeys.
     * @param tagBreakdownKeys Comma separated list of tag keys used to group cost. If no value is provided the cost will not be broken down by tags. To see which tags are available, look for the value of <code>tag_config_source</code> in the API response. (optional)
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters tagBreakdownKeys(String tagBreakdownKeys) {
      this.tagBreakdownKeys = tagBreakdownKeys;
      return this;
    }

    /**
     * Set nextRecordId.
     * @param nextRecordId List following results with a next_record_id provided in the previous query. (optional)
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }

    /**
     * Set includeDescendants.
     * @param includeDescendants Include child org cost in the response. Defaults to <code>true</code>. (optional, default to true)
     * @return GetMonthlyCostAttributionOptionalParameters
     */
    public GetMonthlyCostAttributionOptionalParameters includeDescendants(Boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }
  }

  /**
 * Get Monthly Cost Attribution.
 *
 * See {@link #getMonthlyCostAttributionWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
 * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
 * @return MonthlyCostAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public MonthlyCostAttributionResponse getMonthlyCostAttribution (OffsetDateTime startMonth, String fields) throws ApiException {
    return getMonthlyCostAttributionWithHttpInfo( startMonth,  fields, new GetMonthlyCostAttributionOptionalParameters()).getData();
  }

  /**
 * Get Monthly Cost Attribution.
 *
 * See {@link #getMonthlyCostAttributionWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
 * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
 * @return CompletableFuture&lt;MonthlyCostAttributionResponse&gt;
 */
  public CompletableFuture<MonthlyCostAttributionResponse>getMonthlyCostAttributionAsync(OffsetDateTime startMonth, String fields) {
    return getMonthlyCostAttributionWithHttpInfoAsync(startMonth, fields, new GetMonthlyCostAttributionOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get Monthly Cost Attribution.
 *
 * See {@link #getMonthlyCostAttributionWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
 * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
 * @param parameters Optional parameters for the request.
 * @return MonthlyCostAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public MonthlyCostAttributionResponse getMonthlyCostAttribution(OffsetDateTime startMonth, String fields, GetMonthlyCostAttributionOptionalParameters parameters) throws ApiException {
    return getMonthlyCostAttributionWithHttpInfo(startMonth, fields, parameters).getData();
  }

  /**
 * Get Monthly Cost Attribution.
 *
 * See {@link #getMonthlyCostAttributionWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
 * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;MonthlyCostAttributionResponse&gt;
 */
  public CompletableFuture<MonthlyCostAttributionResponse>getMonthlyCostAttributionAsync( OffsetDateTime startMonth,  String fields, GetMonthlyCostAttributionOptionalParameters parameters) {
    return getMonthlyCostAttributionWithHttpInfoAsync(startMonth, fields, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get monthly cost attribution by tag across multi-org and single root-org accounts.
   * Cost Attribution data for a given month becomes available no later than the 19th of the following month.
   * This API endpoint is paginated. To make sure you receive all records, check if the value of <code>next_record_id</code> is
   * set in the response. If it is, make another request and pass <code>next_record_id</code> as a parameter.
   * Pseudo code example:
   * <code>response := GetMonthlyCostAttribution(start_month, end_month)
   * cursor := response.metadata.pagination.next_record_id
   * WHILE cursor != null BEGIN
   *   sleep(5 seconds)  # Avoid running into rate limit
   *   response := GetMonthlyCostAttribution(start_month, end_month, next_record_id=cursor)
   *   cursor := response.metadata.pagination.next_record_id
   * END</code></p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>. This endpoint is not available in the Government (US1-FED) site.</p>
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
   * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonthlyCostAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonthlyCostAttributionResponse> getMonthlyCostAttributionWithHttpInfo(OffsetDateTime startMonth, String fields, GetMonthlyCostAttributionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getMonthlyCostAttribution");
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(400, "Missing the required parameter 'fields' when calling getMonthlyCostAttribution");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    SortDirection sortDirection = parameters.sortDirection;
    String sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v2/cost_by_tag/monthly_cost_attribution";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_descendants", includeDescendants));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getMonthlyCostAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MonthlyCostAttributionResponse>() {});
  }

  /**
   * Get Monthly Cost Attribution.
   *
   * See {@link #getMonthlyCostAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for cost beginning in this month. (required)
   * @param fields Comma-separated list specifying cost types (e.g., <code>&lt;billing_dimension&gt;_on_demand_cost</code>, <code>&lt;billing_dimension&gt;_committed_cost</code>, <code>&lt;billing_dimension&gt;_total_cost</code>) and the proportions (<code>&lt;billing_dimension&gt;_percentage_in_org</code>, <code>&lt;billing_dimension&gt;_percentage_in_account</code>). Use <code>*</code> to retrieve all fields. Example: <code>infra_host_on_demand_cost,infra_host_percentage_in_account</code> To obtain the complete list of active billing dimensions that can be used to replace <code>&lt;billing_dimension&gt;</code> in the field names, make a request to the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-active-billing-dimensions-for-cost-attribution">Get active billing dimensions API</a>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonthlyCostAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonthlyCostAttributionResponse>> getMonthlyCostAttributionWithHttpInfoAsync(OffsetDateTime startMonth, String fields, GetMonthlyCostAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
        CompletableFuture<ApiResponse<MonthlyCostAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startMonth' when calling getMonthlyCostAttribution"));
        return result;
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
        CompletableFuture<ApiResponse<MonthlyCostAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'fields' when calling getMonthlyCostAttribution"));
        return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    SortDirection sortDirection = parameters.sortDirection;
    String sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v2/cost_by_tag/monthly_cost_attribution";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_descendants", includeDescendants));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getMonthlyCostAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonthlyCostAttributionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MonthlyCostAttributionResponse>() {});
  }

  /**
   * Manage optional parameters to getProjectedCost.
   */
  public static class GetProjectedCostOptionalParameters {
    private String view;
    private Boolean includeConnectedAccounts;

    /**
     * Set view.
     * @param view String to specify whether cost is broken down at a parent-org level or at the sub-org level. Available views are <code>summary</code> and <code>sub-org</code>. Defaults to <code>summary</code>. (optional)
     * @return GetProjectedCostOptionalParameters
     */
    public GetProjectedCostOptionalParameters view(String view) {
      this.view = view;
      return this;
    }

    /**
     * Set includeConnectedAccounts.
     * @param includeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to <code>false</code>.  (optional, default to false)
     * @return GetProjectedCostOptionalParameters
     */
    public GetProjectedCostOptionalParameters includeConnectedAccounts(Boolean includeConnectedAccounts) {
      this.includeConnectedAccounts = includeConnectedAccounts;
      return this;
    }
  }

  /**
 * Get projected cost across your account.
 *
 * See {@link #getProjectedCostWithHttpInfo}.
 *
 * @return ProjectedCostResponse
 * @throws ApiException if fails to make API call
 */
  public ProjectedCostResponse getProjectedCost () throws ApiException {
    return getProjectedCostWithHttpInfo(new GetProjectedCostOptionalParameters()).getData();
  }

  /**
 * Get projected cost across your account.
 *
 * See {@link #getProjectedCostWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ProjectedCostResponse&gt;
 */
  public CompletableFuture<ProjectedCostResponse>getProjectedCostAsync() {
    return getProjectedCostWithHttpInfoAsync(new GetProjectedCostOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get projected cost across your account.
 *
 * See {@link #getProjectedCostWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ProjectedCostResponse
 * @throws ApiException if fails to make API call
 */
  public ProjectedCostResponse getProjectedCost(GetProjectedCostOptionalParameters parameters) throws ApiException {
    return getProjectedCostWithHttpInfo(parameters).getData();
  }

  /**
 * Get projected cost across your account.
 *
 * See {@link #getProjectedCostWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ProjectedCostResponse&gt;
 */
  public CompletableFuture<ProjectedCostResponse>getProjectedCostAsync(GetProjectedCostOptionalParameters parameters) {
    return getProjectedCostWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get projected cost across multi-org and single root-org accounts.
   * Projected cost data is only available for the current month and becomes available around the 12th of the month.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProjectedCostResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectedCostResponse> getProjectedCostWithHttpInfo(GetProjectedCostOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String view = parameters.view;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/projected_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getProjectedCost", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ProjectedCostResponse>() {});
  }

  /**
   * Get projected cost across your account.
   *
   * See {@link #getProjectedCostWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectedCostResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectedCostResponse>> getProjectedCostWithHttpInfoAsync(GetProjectedCostOptionalParameters parameters) {
    Object localVarPostBody = null;
    String view = parameters.view;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v2/usage/projected_cost";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "view", view));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getProjectedCost", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectedCostResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ProjectedCostResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageApplicationSecurityMonitoring.
   */
  public static class GetUsageApplicationSecurityMonitoringOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageApplicationSecurityMonitoringOptionalParameters
     */
    public GetUsageApplicationSecurityMonitoringOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for application security.
 *
 * See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageApplicationSecurityMonitoringResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageApplicationSecurityMonitoringResponse getUsageApplicationSecurityMonitoring (OffsetDateTime startHr) throws ApiException {
    return getUsageApplicationSecurityMonitoringWithHttpInfo( startHr, new GetUsageApplicationSecurityMonitoringOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for application security.
 *
 * See {@link #getUsageApplicationSecurityMonitoringWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageApplicationSecurityMonitoringResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageApplicationSecurityMonitoringResponse>getUsageApplicationSecurityMonitoringAsync(OffsetDateTime startHr) {
    return getUsageApplicationSecurityMonitoringWithHttpInfoAsync(startHr, new GetUsageApplicationSecurityMonitoringOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for application security.
 *
 * See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageApplicationSecurityMonitoringResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageApplicationSecurityMonitoringResponse getUsageApplicationSecurityMonitoring(OffsetDateTime startHr, GetUsageApplicationSecurityMonitoringOptionalParameters parameters) throws ApiException {
    return getUsageApplicationSecurityMonitoringWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for application security.
 *
 * See {@link #getUsageApplicationSecurityMonitoringWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageApplicationSecurityMonitoringResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageApplicationSecurityMonitoringResponse>getUsageApplicationSecurityMonitoringAsync( OffsetDateTime startHr, GetUsageApplicationSecurityMonitoringOptionalParameters parameters) {
    return getUsageApplicationSecurityMonitoringWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for application security .
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a></p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageApplicationSecurityMonitoringResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageApplicationSecurityMonitoringResponse> getUsageApplicationSecurityMonitoringWithHttpInfo(OffsetDateTime startHr, GetUsageApplicationSecurityMonitoringOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageApplicationSecurityMonitoring");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/application_security";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageApplicationSecurityMonitoring", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageApplicationSecurityMonitoringResponse>() {});
  }

  /**
   * Get hourly usage for application security.
   *
   * See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageApplicationSecurityMonitoringResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>> getUsageApplicationSecurityMonitoringWithHttpInfoAsync(OffsetDateTime startHr, GetUsageApplicationSecurityMonitoringOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageApplicationSecurityMonitoring"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/application_security";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageApplicationSecurityMonitoring", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageApplicationSecurityMonitoringResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageLambdaTracedInvocations.
   */
  public static class GetUsageLambdaTracedInvocationsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLambdaTracedInvocationsOptionalParameters
     */
    public GetUsageLambdaTracedInvocationsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for Lambda traced invocations.
 *
 * See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageLambdaTracedInvocationsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLambdaTracedInvocationsResponse getUsageLambdaTracedInvocations (OffsetDateTime startHr) throws ApiException {
    return getUsageLambdaTracedInvocationsWithHttpInfo( startHr, new GetUsageLambdaTracedInvocationsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for Lambda traced invocations.
 *
 * See {@link #getUsageLambdaTracedInvocationsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageLambdaTracedInvocationsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLambdaTracedInvocationsResponse>getUsageLambdaTracedInvocationsAsync(OffsetDateTime startHr) {
    return getUsageLambdaTracedInvocationsWithHttpInfoAsync(startHr, new GetUsageLambdaTracedInvocationsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for Lambda traced invocations.
 *
 * See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageLambdaTracedInvocationsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLambdaTracedInvocationsResponse getUsageLambdaTracedInvocations(OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) throws ApiException {
    return getUsageLambdaTracedInvocationsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for Lambda traced invocations.
 *
 * See {@link #getUsageLambdaTracedInvocationsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageLambdaTracedInvocationsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLambdaTracedInvocationsResponse>getUsageLambdaTracedInvocationsAsync( OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) {
    return getUsageLambdaTracedInvocationsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for Lambda traced invocations.
   * <strong>Note:</strong> This endpoint has been deprecated.. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a></p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLambdaTracedInvocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageLambdaTracedInvocationsResponse> getUsageLambdaTracedInvocationsWithHttpInfo(OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambdaTracedInvocations");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/lambda_traced_invocations";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageLambdaTracedInvocations", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLambdaTracedInvocationsResponse>() {});
  }

  /**
   * Get hourly usage for Lambda traced invocations.
   *
   * See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLambdaTracedInvocationsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>> getUsageLambdaTracedInvocationsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambdaTracedInvocations"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/lambda_traced_invocations";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageLambdaTracedInvocations", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLambdaTracedInvocationsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageObservabilityPipelines.
   */
  public static class GetUsageObservabilityPipelinesOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageObservabilityPipelinesOptionalParameters
     */
    public GetUsageObservabilityPipelinesOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for observability pipelines.
 *
 * See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageObservabilityPipelinesResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines (OffsetDateTime startHr) throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo( startHr, new GetUsageObservabilityPipelinesOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for observability pipelines.
 *
 * See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageObservabilityPipelinesResponse>getUsageObservabilityPipelinesAsync(OffsetDateTime startHr) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(startHr, new GetUsageObservabilityPipelinesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for observability pipelines.
 *
 * See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageObservabilityPipelinesResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines(OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for observability pipelines.
 *
 * See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageObservabilityPipelinesResponse>getUsageObservabilityPipelinesAsync( OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for observability pipelines.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a></p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageObservabilityPipelinesResponse> getUsageObservabilityPipelinesWithHttpInfo(OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageObservabilityPipelines");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/observability_pipelines";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageObservabilityPipelines", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageObservabilityPipelinesResponse>() {});
  }

  /**
   * Get hourly usage for observability pipelines.
   *
   * See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> getUsageObservabilityPipelinesWithHttpInfoAsync(OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageObservabilityPipelines"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/observability_pipelines";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.UsageMeteringApi.getUsageObservabilityPipelines", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageObservabilityPipelinesResponse>() {});
  }
}