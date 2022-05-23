package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.CostByOrgResponse;
import com.datadog.api.v2.client.model.UsageApplicationSecurityMonitoringResponse;
import com.datadog.api.v2.client.model.UsageLambdaTracedInvocationsResponse;
import com.datadog.api.v2.client.model.UsageObservabilityPipelinesResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageMeteringApi {
  private ApiClient apiClient;

  public UsageMeteringApi() {
    this(Configuration.getDefaultApiClient());
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

  /** Manage optional parameters to getCostByOrg. */
  public static class GetCostByOrgOptionalParameters {
    private OffsetDateTime endMonth;

    /**
     * Set endMonth.
     *
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
     *     for cost ending this month. (optional)
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
   * <p>See {@link #getCostByOrgWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @return CostByOrgResponse
   * @throws ApiException if fails to make API call
   */
  public CostByOrgResponse getCostByOrg(OffsetDateTime startMonth) throws ApiException {
    return getCostByOrgWithHttpInfo(startMonth, new GetCostByOrgOptionalParameters()).getData();
  }

  /**
   * Get cost across multi-org account.
   *
   * <p>See {@link #getCostByOrgWithHttpInfoAsync}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @return CompletableFuture&lt;CostByOrgResponse&gt;
   */
  public CompletableFuture<CostByOrgResponse> getCostByOrgAsync(OffsetDateTime startMonth) {
    return getCostByOrgWithHttpInfoAsync(startMonth, new GetCostByOrgOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get cost across multi-org account.
   *
   * <p>See {@link #getCostByOrgWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return CostByOrgResponse
   * @throws ApiException if fails to make API call
   */
  public CostByOrgResponse getCostByOrg(
      OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) throws ApiException {
    return getCostByOrgWithHttpInfo(startMonth, parameters).getData();
  }

  /**
   * Get cost across multi-org account.
   *
   * <p>See {@link #getCostByOrgWithHttpInfoAsync}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostByOrgResponse&gt;
   */
  public CompletableFuture<CostByOrgResponse> getCostByOrgAsync(
      OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) {
    return getCostByOrgWithHttpInfoAsync(startMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get cost across multi-org account.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostByOrgResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CostByOrgResponse> getCostByOrgWithHttpInfo(
      OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startMonth' when calling getCostByOrg");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    // create path and map variables
    String localVarPath = "/api/v2/usage/cost_by_org";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "UsageMeteringApi.getCostByOrg",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json;datetime-format=rfc3339"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CostByOrgResponse>() {});
  }

  /**
   * Get cost across multi-org account.
   *
   * <p>See {@link #getCostByOrgWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code>
   *     for cost beginning this month. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostByOrgResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostByOrgResponse>> getCostByOrgWithHttpInfoAsync(
      OffsetDateTime startMonth, GetCostByOrgOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startMonth' when calling getCostByOrg"));
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
      builder =
          apiClient.createBuilder(
              "UsageMeteringApi.getCostByOrg",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json;datetime-format=rfc3339"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostByOrgResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostByOrgResponse>() {});
  }

  /** Manage optional parameters to getUsageApplicationSecurityMonitoring. */
  public static class GetUsageApplicationSecurityMonitoringOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
     *     for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageApplicationSecurityMonitoringOptionalParameters
     */
    public GetUsageApplicationSecurityMonitoringOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Application Security.
   *
   * <p>See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return UsageApplicationSecurityMonitoringResponse
   * @throws ApiException if fails to make API call
   */
  public UsageApplicationSecurityMonitoringResponse getUsageApplicationSecurityMonitoring(
      OffsetDateTime startHr) throws ApiException {
    return getUsageApplicationSecurityMonitoringWithHttpInfo(
            startHr, new GetUsageApplicationSecurityMonitoringOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Application Security.
   *
   * <p>See {@link #getUsageApplicationSecurityMonitoringWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageApplicationSecurityMonitoringResponse&gt;
   */
  public CompletableFuture<UsageApplicationSecurityMonitoringResponse>
      getUsageApplicationSecurityMonitoringAsync(OffsetDateTime startHr) {
    return getUsageApplicationSecurityMonitoringWithHttpInfoAsync(
            startHr, new GetUsageApplicationSecurityMonitoringOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Application Security.
   *
   * <p>See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageApplicationSecurityMonitoringResponse
   * @throws ApiException if fails to make API call
   */
  public UsageApplicationSecurityMonitoringResponse getUsageApplicationSecurityMonitoring(
      OffsetDateTime startHr, GetUsageApplicationSecurityMonitoringOptionalParameters parameters)
      throws ApiException {
    return getUsageApplicationSecurityMonitoringWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Application Security.
   *
   * <p>See {@link #getUsageApplicationSecurityMonitoringWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageApplicationSecurityMonitoringResponse&gt;
   */
  public CompletableFuture<UsageApplicationSecurityMonitoringResponse>
      getUsageApplicationSecurityMonitoringAsync(
          OffsetDateTime startHr,
          GetUsageApplicationSecurityMonitoringOptionalParameters parameters) {
    return getUsageApplicationSecurityMonitoringWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Application Security .
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageApplicationSecurityMonitoringResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageApplicationSecurityMonitoringResponse>
      getUsageApplicationSecurityMonitoringWithHttpInfo(
          OffsetDateTime startHr,
          GetUsageApplicationSecurityMonitoringOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling"
              + " getUsageApplicationSecurityMonitoring");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/application_security";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "UsageMeteringApi.getUsageApplicationSecurityMonitoring",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json;datetime-format=rfc3339"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsageApplicationSecurityMonitoringResponse>() {});
  }

  /**
   * Get hourly usage for Application Security.
   *
   * <p>See {@link #getUsageApplicationSecurityMonitoringWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageApplicationSecurityMonitoringResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>>
      getUsageApplicationSecurityMonitoringWithHttpInfoAsync(
          OffsetDateTime startHr,
          GetUsageApplicationSecurityMonitoringOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling"
                  + " getUsageApplicationSecurityMonitoring"));
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
      builder =
          apiClient.createBuilder(
              "UsageMeteringApi.getUsageApplicationSecurityMonitoring",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json;datetime-format=rfc3339"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageApplicationSecurityMonitoringResponse>> result =
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
        new GenericType<UsageApplicationSecurityMonitoringResponse>() {});
  }

  /** Manage optional parameters to getUsageLambdaTracedInvocations. */
  public static class GetUsageLambdaTracedInvocationsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
     *     for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLambdaTracedInvocationsOptionalParameters
     */
    public GetUsageLambdaTracedInvocationsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * <p>See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return UsageLambdaTracedInvocationsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLambdaTracedInvocationsResponse getUsageLambdaTracedInvocations(
      OffsetDateTime startHr) throws ApiException {
    return getUsageLambdaTracedInvocationsWithHttpInfo(
            startHr, new GetUsageLambdaTracedInvocationsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * <p>See {@link #getUsageLambdaTracedInvocationsWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageLambdaTracedInvocationsResponse&gt;
   */
  public CompletableFuture<UsageLambdaTracedInvocationsResponse>
      getUsageLambdaTracedInvocationsAsync(OffsetDateTime startHr) {
    return getUsageLambdaTracedInvocationsWithHttpInfoAsync(
            startHr, new GetUsageLambdaTracedInvocationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * <p>See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLambdaTracedInvocationsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLambdaTracedInvocationsResponse getUsageLambdaTracedInvocations(
      OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters)
      throws ApiException {
    return getUsageLambdaTracedInvocationsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * <p>See {@link #getUsageLambdaTracedInvocationsWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageLambdaTracedInvocationsResponse&gt;
   */
  public CompletableFuture<UsageLambdaTracedInvocationsResponse>
      getUsageLambdaTracedInvocationsAsync(
          OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) {
    return getUsageLambdaTracedInvocationsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLambdaTracedInvocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageLambdaTracedInvocationsResponse>
      getUsageLambdaTracedInvocationsWithHttpInfo(
          OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling getUsageLambdaTracedInvocations");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/lambda_traced_invocations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "UsageMeteringApi.getUsageLambdaTracedInvocations",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json;datetime-format=rfc3339"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsageLambdaTracedInvocationsResponse>() {});
  }

  /**
   * Get hourly usage for Lambda Traced Invocations.
   *
   * <p>See {@link #getUsageLambdaTracedInvocationsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLambdaTracedInvocationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>>
      getUsageLambdaTracedInvocationsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageLambdaTracedInvocationsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling"
                  + " getUsageLambdaTracedInvocations"));
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
      builder =
          apiClient.createBuilder(
              "UsageMeteringApi.getUsageLambdaTracedInvocations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json;datetime-format=rfc3339"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLambdaTracedInvocationsResponse>> result =
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
        new GenericType<UsageLambdaTracedInvocationsResponse>() {});
  }

  /** Manage optional parameters to getUsageObservabilityPipelines. */
  public static class GetUsageObservabilityPipelinesOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
     *     for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageObservabilityPipelinesOptionalParameters
     */
    public GetUsageObservabilityPipelinesOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return UsageObservabilityPipelinesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines(OffsetDateTime startHr)
      throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo(
            startHr, new GetUsageObservabilityPipelinesOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
   */
  public CompletableFuture<UsageObservabilityPipelinesResponse> getUsageObservabilityPipelinesAsync(
      OffsetDateTime startHr) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(
            startHr, new GetUsageObservabilityPipelinesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageObservabilityPipelinesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines(
      OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters)
      throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
   */
  public CompletableFuture<UsageObservabilityPipelinesResponse> getUsageObservabilityPipelinesAsync(
      OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageObservabilityPipelinesResponse>
      getUsageObservabilityPipelinesWithHttpInfo(
          OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling getUsageObservabilityPipelines");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/observability_pipelines";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "UsageMeteringApi.getUsageObservabilityPipelines",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json;datetime-format=rfc3339"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsageObservabilityPipelinesResponse>() {});
  }

  /**
   * Get hourly usage for Observability Pipelines.
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>>
      getUsageObservabilityPipelinesWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling"
                  + " getUsageObservabilityPipelines"));
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
      builder =
          apiClient.createBuilder(
              "UsageMeteringApi.getUsageObservabilityPipelines",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json;datetime-format=rfc3339"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result =
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
        new GenericType<UsageObservabilityPipelinesResponse>() {});
  }
}
