package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.HourlyUsageAttributionResponse;
import com.datadog.api.v1.client.model.HourlyUsageAttributionUsageType;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionResponse;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionSupportedMetrics;
import com.datadog.api.v1.client.model.UsageAnalyzedLogsResponse;
import com.datadog.api.v1.client.model.UsageAttributionResponse;
import com.datadog.api.v1.client.model.UsageAttributionSort;
import com.datadog.api.v1.client.model.UsageAttributionSupportedMetrics;
import com.datadog.api.v1.client.model.UsageAuditLogsResponse;
import com.datadog.api.v1.client.model.UsageBillableSummaryResponse;
import com.datadog.api.v1.client.model.UsageCWSResponse;
import com.datadog.api.v1.client.model.UsageCloudSecurityPostureManagementResponse;
import com.datadog.api.v1.client.model.UsageCustomReportsResponse;
import com.datadog.api.v1.client.model.UsageDBMResponse;
import com.datadog.api.v1.client.model.UsageFargateResponse;
import com.datadog.api.v1.client.model.UsageHostsResponse;
import com.datadog.api.v1.client.model.UsageIncidentManagementResponse;
import com.datadog.api.v1.client.model.UsageIndexedSpansResponse;
import com.datadog.api.v1.client.model.UsageIngestedSpansResponse;
import com.datadog.api.v1.client.model.UsageIoTResponse;
import com.datadog.api.v1.client.model.UsageLambdaResponse;
import com.datadog.api.v1.client.model.UsageLogsByIndexResponse;
import com.datadog.api.v1.client.model.UsageLogsByRetentionResponse;
import com.datadog.api.v1.client.model.UsageLogsResponse;
import com.datadog.api.v1.client.model.UsageNetworkFlowsResponse;
import com.datadog.api.v1.client.model.UsageNetworkHostsResponse;
import com.datadog.api.v1.client.model.UsageProfilingResponse;
import com.datadog.api.v1.client.model.UsageRumSessionsResponse;
import com.datadog.api.v1.client.model.UsageRumUnitsResponse;
import com.datadog.api.v1.client.model.UsageSDSResponse;
import com.datadog.api.v1.client.model.UsageSNMPResponse;
import com.datadog.api.v1.client.model.UsageSort;
import com.datadog.api.v1.client.model.UsageSortDirection;
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsResponse;
import com.datadog.api.v1.client.model.UsageSummaryResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsAPIResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsBrowserResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsResponse;
import com.datadog.api.v1.client.model.UsageTimeseriesResponse;
import com.datadog.api.v1.client.model.UsageTopAvgMetricsResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageMeteringApi {
  private ApiClient apiClient;

  public UsageMeteringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageMeteringApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getDailyCustomReports. */
  public static class GetDailyCustomReportsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    /**
     * Set pageSize
     *
     * @param pageSize The number of files to return in the response. &#x60;[default&#x3D;60]&#x60;.
     *     (optional)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber The identifier of the first page to return. This parameter is used for the
     *     pagination feature &#x60;[default&#x3D;0]&#x60;. (optional)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir
     *
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to desc)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;.
     *     (optional, default to start_date)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Get the list of available daily custom reports
   *
   * <p>See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCustomReportsResponse getDailyCustomReports() throws ApiException {
    return getDailyCustomReportsWithHttpInfo(new GetDailyCustomReportsOptionalParameters())
        .getData();
  }

  /**
   * Get the list of available daily custom reports
   *
   * <p>See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
   */
  public CompletableFuture<UsageCustomReportsResponse> getDailyCustomReportsAsync() {
    return getDailyCustomReportsWithHttpInfoAsync(new GetDailyCustomReportsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available daily custom reports
   *
   * <p>See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCustomReportsResponse getDailyCustomReports(
      GetDailyCustomReportsOptionalParameters parameters) throws ApiException {
    return getDailyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of available daily custom reports
   *
   * <p>See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
   */
  public CompletableFuture<UsageCustomReportsResponse> getDailyCustomReportsAsync(
      GetDailyCustomReportsOptionalParameters parameters) {
    return getDailyCustomReportsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available daily custom reports
   *
   * <p>Get daily custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageCustomReportsResponse> getDailyCustomReportsWithHttpInfo(
      GetDailyCustomReportsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDailyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCustomReportsResponse> localVarReturnType =
        new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getDailyCustomReports",
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
   * Get the list of available daily custom reports
   *
   * <p>See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCustomReportsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageCustomReportsResponse>>
      getDailyCustomReportsWithHttpInfoAsync(GetDailyCustomReportsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDailyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCustomReportsResponse> localVarReturnType =
        new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getDailyCustomReports",
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

  /** Manage optional parameters to getHourlyUsageAttribution. */
  public static class GetHourlyUsageAttributionOptionalParameters {
    private OffsetDateTime endHr;
    private String nextRecordId;
    private String tagBreakdownKeys;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set nextRecordId
     *
     * @param nextRecordId List following results with a next_record_id provided in the previous
     *     query. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }

    /**
     * Set tagBreakdownKeys
     *
     * @param tagBreakdownKeys Comma separated list of tags used to group usage. If no value is
     *     provided the usage will not be broken down by tags. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters tagBreakdownKeys(String tagBreakdownKeys) {
      this.tagBreakdownKeys = tagBreakdownKeys;
      return this;
    }
  }

  /**
   * Get Hourly Usage Attribution
   *
   * <p>See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @return HourlyUsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public HourlyUsageAttributionResponse getHourlyUsageAttribution(
      OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType) throws ApiException {
    return getHourlyUsageAttributionWithHttpInfo(
            startHr, usageType, new GetHourlyUsageAttributionOptionalParameters())
        .getData();
  }

  /**
   * Get Hourly Usage Attribution
   *
   * <p>See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @return CompletableFuture&lt;HourlyUsageAttributionResponse&gt;
   */
  public CompletableFuture<HourlyUsageAttributionResponse> getHourlyUsageAttributionAsync(
      OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType) {
    return getHourlyUsageAttributionWithHttpInfoAsync(
            startHr, usageType, new GetHourlyUsageAttributionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Hourly Usage Attribution
   *
   * <p>See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return HourlyUsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public HourlyUsageAttributionResponse getHourlyUsageAttribution(
      OffsetDateTime startHr,
      HourlyUsageAttributionUsageType usageType,
      GetHourlyUsageAttributionOptionalParameters parameters)
      throws ApiException {
    return getHourlyUsageAttributionWithHttpInfo(startHr, usageType, parameters).getData();
  }

  /**
   * Get Hourly Usage Attribution
   *
   * <p>See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HourlyUsageAttributionResponse&gt;
   */
  public CompletableFuture<HourlyUsageAttributionResponse> getHourlyUsageAttributionAsync(
      OffsetDateTime startHr,
      HourlyUsageAttributionUsageType usageType,
      GetHourlyUsageAttributionOptionalParameters parameters) {
    return getHourlyUsageAttributionWithHttpInfoAsync(startHr, usageType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Hourly Usage Attribution
   *
   * <p>Get Hourly Usage Attribution.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HourlyUsageAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HourlyUsageAttributionResponse> getHourlyUsageAttributionWithHttpInfo(
      OffsetDateTime startHr,
      HourlyUsageAttributionUsageType usageType,
      GetHourlyUsageAttributionOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getHourlyUsageAttribution");
    }

    // verify the required parameter 'usageType' is set
    if (usageType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'usageType' when calling getHourlyUsageAttribution");
    }
    OffsetDateTime endHr = parameters.endHr;
    String nextRecordId = parameters.nextRecordId;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hourly-attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usage_type", usageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHourlyUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<HourlyUsageAttributionResponse> localVarReturnType =
        new GenericType<HourlyUsageAttributionResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getHourlyUsageAttribution",
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
   * Get Hourly Usage Attribution
   *
   * <p>See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HourlyUsageAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>>
      getHourlyUsageAttributionWithHttpInfoAsync(
          OffsetDateTime startHr,
          HourlyUsageAttributionUsageType usageType,
          GetHourlyUsageAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling getHourlyUsageAttribution"));
      return result;
    }

    // verify the required parameter 'usageType' is set
    if (usageType == null) {
      CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'usageType' when calling getHourlyUsageAttribution"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    String nextRecordId = parameters.nextRecordId;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hourly-attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usage_type", usageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHourlyUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<HourlyUsageAttributionResponse> localVarReturnType =
        new GenericType<HourlyUsageAttributionResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getHourlyUsageAttribution",
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

  /** Manage optional parameters to getIncidentManagement. */
  public static class GetIncidentManagementOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetIncidentManagementOptionalParameters
     */
    public GetIncidentManagementOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for incident management
   *
   * <p>See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIncidentManagementResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIncidentManagementResponse getIncidentManagement(OffsetDateTime startHr)
      throws ApiException {
    return getIncidentManagementWithHttpInfo(startHr, new GetIncidentManagementOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for incident management
   *
   * <p>See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageIncidentManagementResponse&gt;
   */
  public CompletableFuture<UsageIncidentManagementResponse> getIncidentManagementAsync(
      OffsetDateTime startHr) {
    return getIncidentManagementWithHttpInfoAsync(
            startHr, new GetIncidentManagementOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for incident management
   *
   * <p>See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIncidentManagementResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIncidentManagementResponse getIncidentManagement(
      OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters)
      throws ApiException {
    return getIncidentManagementWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for incident management
   *
   * <p>See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageIncidentManagementResponse&gt;
   */
  public CompletableFuture<UsageIncidentManagementResponse> getIncidentManagementAsync(
      OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) {
    return getIncidentManagementWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for incident management
   *
   * <p>Get hourly usage for incident management.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIncidentManagementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageIncidentManagementResponse> getIncidentManagementWithHttpInfo(
      OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getIncidentManagement");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/incident-management";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentManagement");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIncidentManagementResponse> localVarReturnType =
        new GenericType<UsageIncidentManagementResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getIncidentManagement",
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
   * Get hourly usage for incident management
   *
   * <p>See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIncidentManagementResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageIncidentManagementResponse>>
      getIncidentManagementWithHttpInfoAsync(
          OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageIncidentManagementResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getIncidentManagement"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/incident-management";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentManagement");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIncidentManagementResponse> localVarReturnType =
        new GenericType<UsageIncidentManagementResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getIncidentManagement",
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

  /** Manage optional parameters to getIngestedSpans. */
  public static class GetIngestedSpansOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetIngestedSpansOptionalParameters
     */
    public GetIngestedSpansOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for ingested spans
   *
   * <p>See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIngestedSpansResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIngestedSpansResponse getIngestedSpans(OffsetDateTime startHr) throws ApiException {
    return getIngestedSpansWithHttpInfo(startHr, new GetIngestedSpansOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for ingested spans
   *
   * <p>See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageIngestedSpansResponse&gt;
   */
  public CompletableFuture<UsageIngestedSpansResponse> getIngestedSpansAsync(
      OffsetDateTime startHr) {
    return getIngestedSpansWithHttpInfoAsync(startHr, new GetIngestedSpansOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for ingested spans
   *
   * <p>See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIngestedSpansResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIngestedSpansResponse getIngestedSpans(
      OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) throws ApiException {
    return getIngestedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for ingested spans
   *
   * <p>See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageIngestedSpansResponse&gt;
   */
  public CompletableFuture<UsageIngestedSpansResponse> getIngestedSpansAsync(
      OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) {
    return getIngestedSpansWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for ingested spans
   *
   * <p>Get hourly usage for ingested spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIngestedSpansResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageIngestedSpansResponse> getIngestedSpansWithHttpInfo(
      OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getIngestedSpans");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ingested-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIngestedSpans");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIngestedSpansResponse> localVarReturnType =
        new GenericType<UsageIngestedSpansResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getIngestedSpans",
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
   * Get hourly usage for ingested spans
   *
   * <p>See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIngestedSpansResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageIngestedSpansResponse>>
      getIngestedSpansWithHttpInfoAsync(
          OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageIngestedSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getIngestedSpans"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ingested-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIngestedSpans");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIngestedSpansResponse> localVarReturnType =
        new GenericType<UsageIngestedSpansResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getIngestedSpans",
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

  /** Manage optional parameters to getMonthlyCustomReports. */
  public static class GetMonthlyCustomReportsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    /**
     * Set pageSize
     *
     * @param pageSize The number of files to return in the response &#x60;[default&#x3D;60].&#x60;
     *     (optional)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber The identifier of the first page to return. This parameter is used for the
     *     pagination feature &#x60;[default&#x3D;0]&#x60;. (optional)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir
     *
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to desc)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;.
     *     (optional, default to start_date)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Get the list of available monthly custom reports
   *
   * <p>See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCustomReportsResponse getMonthlyCustomReports() throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(new GetMonthlyCustomReportsOptionalParameters())
        .getData();
  }

  /**
   * Get the list of available monthly custom reports
   *
   * <p>See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
   */
  public CompletableFuture<UsageCustomReportsResponse> getMonthlyCustomReportsAsync() {
    return getMonthlyCustomReportsWithHttpInfoAsync(new GetMonthlyCustomReportsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available monthly custom reports
   *
   * <p>See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCustomReportsResponse getMonthlyCustomReports(
      GetMonthlyCustomReportsOptionalParameters parameters) throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of available monthly custom reports
   *
   * <p>See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
   */
  public CompletableFuture<UsageCustomReportsResponse> getMonthlyCustomReportsAsync(
      GetMonthlyCustomReportsOptionalParameters parameters) {
    return getMonthlyCustomReportsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available monthly custom reports
   *
   * <p>Get monthly custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageCustomReportsResponse> getMonthlyCustomReportsWithHttpInfo(
      GetMonthlyCustomReportsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonthlyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCustomReportsResponse> localVarReturnType =
        new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getMonthlyCustomReports",
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
   * Get the list of available monthly custom reports
   *
   * <p>See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCustomReportsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageCustomReportsResponse>>
      getMonthlyCustomReportsWithHttpInfoAsync(
          GetMonthlyCustomReportsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonthlyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCustomReportsResponse> localVarReturnType =
        new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getMonthlyCustomReports",
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

  /** Manage optional parameters to getMonthlyUsageAttribution. */
  public static class GetMonthlyUsageAttributionOptionalParameters {
    private OffsetDateTime endMonth;
    private UsageSortDirection sortDirection;
    private MonthlyUsageAttributionSupportedMetrics sortName;
    private String tagBreakdownKeys;
    private String nextRecordId;

    /**
     * Set endMonth
     *
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
     *     usage ending this month. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set sortDirection
     *
     * @param sortDirection The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to
     *     desc)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters sortDirection(
        UsageSortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName
     *
     * @param sortName The field to sort by. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters sortName(
        MonthlyUsageAttributionSupportedMetrics sortName) {
      this.sortName = sortName;
      return this;
    }

    /**
     * Set tagBreakdownKeys
     *
     * @param tagBreakdownKeys Comma separated list of tags used to group usage. If no value is
     *     provided the usage will not be broken down by tags. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters tagBreakdownKeys(String tagBreakdownKeys) {
      this.tagBreakdownKeys = tagBreakdownKeys;
      return this;
    }

    /**
     * Set nextRecordId
     *
     * @param nextRecordId List following results with a next_record_id provided in the previous
     *     query. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }
  }

  /**
   * Get Monthly Usage Attribution
   *
   * <p>See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @return MonthlyUsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public MonthlyUsageAttributionResponse getMonthlyUsageAttribution(
      OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields)
      throws ApiException {
    return getMonthlyUsageAttributionWithHttpInfo(
            startMonth, fields, new GetMonthlyUsageAttributionOptionalParameters())
        .getData();
  }

  /**
   * Get Monthly Usage Attribution
   *
   * <p>See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @return CompletableFuture&lt;MonthlyUsageAttributionResponse&gt;
   */
  public CompletableFuture<MonthlyUsageAttributionResponse> getMonthlyUsageAttributionAsync(
      OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields) {
    return getMonthlyUsageAttributionWithHttpInfoAsync(
            startMonth, fields, new GetMonthlyUsageAttributionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Monthly Usage Attribution
   *
   * <p>See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return MonthlyUsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public MonthlyUsageAttributionResponse getMonthlyUsageAttribution(
      OffsetDateTime startMonth,
      MonthlyUsageAttributionSupportedMetrics fields,
      GetMonthlyUsageAttributionOptionalParameters parameters)
      throws ApiException {
    return getMonthlyUsageAttributionWithHttpInfo(startMonth, fields, parameters).getData();
  }

  /**
   * Get Monthly Usage Attribution
   *
   * <p>See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonthlyUsageAttributionResponse&gt;
   */
  public CompletableFuture<MonthlyUsageAttributionResponse> getMonthlyUsageAttributionAsync(
      OffsetDateTime startMonth,
      MonthlyUsageAttributionSupportedMetrics fields,
      GetMonthlyUsageAttributionOptionalParameters parameters) {
    return getMonthlyUsageAttributionWithHttpInfoAsync(startMonth, fields, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Monthly Usage Attribution
   *
   * <p>Get Monthly Usage Attribution.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonthlyUsageAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonthlyUsageAttributionResponse> getMonthlyUsageAttributionWithHttpInfo(
      OffsetDateTime startMonth,
      MonthlyUsageAttributionSupportedMetrics fields,
      GetMonthlyUsageAttributionOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startMonth' when calling getMonthlyUsageAttribution");
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fields' when calling getMonthlyUsageAttribution");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    MonthlyUsageAttributionSupportedMetrics sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/monthly-attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonthlyUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MonthlyUsageAttributionResponse> localVarReturnType =
        new GenericType<MonthlyUsageAttributionResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getMonthlyUsageAttribution",
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
   * Get Monthly Usage Attribution
   *
   * <p>See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonthlyUsageAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>>
      getMonthlyUsageAttributionWithHttpInfoAsync(
          OffsetDateTime startMonth,
          MonthlyUsageAttributionSupportedMetrics fields,
          GetMonthlyUsageAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startMonth' when calling"
                  + " getMonthlyUsageAttribution"));
      return result;
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fields' when calling getMonthlyUsageAttribution"));
      return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    MonthlyUsageAttributionSupportedMetrics sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/monthly-attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonthlyUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<MonthlyUsageAttributionResponse> localVarReturnType =
        new GenericType<MonthlyUsageAttributionResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getMonthlyUsageAttribution",
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
   * Get specified daily custom reports
   *
   * <p>See {@link #getSpecifiedDailyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return UsageSpecifiedCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSpecifiedCustomReportsResponse getSpecifiedDailyCustomReports(String reportId)
      throws ApiException {
    return getSpecifiedDailyCustomReportsWithHttpInfo(reportId).getData();
  }

  public CompletableFuture<UsageSpecifiedCustomReportsResponse> getSpecifiedDailyCustomReportsAsync(
      String reportId) {
    return getSpecifiedDailyCustomReportsWithHttpInfoAsync(reportId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get specified daily custom reports
   *
   * <p>Get specified daily custom reports.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSpecifiedCustomReportsResponse>
      getSpecifiedDailyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'reportId' when calling getSpecifiedDailyCustomReports");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/daily_custom_reports/{report_id}"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedDailyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType =
        new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getSpecifiedDailyCustomReports",
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
   * Get specified daily custom reports
   *
   * <p>See {@link #getSpecifiedDailyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>>
      getSpecifiedDailyCustomReportsWithHttpInfoAsync(String reportId) {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'reportId' when calling"
                  + " getSpecifiedDailyCustomReports"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/daily_custom_reports/{report_id}"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedDailyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType =
        new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getSpecifiedDailyCustomReports",
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
   * Get specified monthly custom reports
   *
   * <p>See {@link #getSpecifiedMonthlyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return UsageSpecifiedCustomReportsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSpecifiedCustomReportsResponse getSpecifiedMonthlyCustomReports(String reportId)
      throws ApiException {
    return getSpecifiedMonthlyCustomReportsWithHttpInfo(reportId).getData();
  }

  public CompletableFuture<UsageSpecifiedCustomReportsResponse>
      getSpecifiedMonthlyCustomReportsAsync(String reportId) {
    return getSpecifiedMonthlyCustomReportsWithHttpInfoAsync(reportId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get specified monthly custom reports
   *
   * <p>Get specified monthly custom reports.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSpecifiedCustomReportsResponse>
      getSpecifiedMonthlyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'reportId' when calling"
              + " getSpecifiedMonthlyCustomReports");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monthly_custom_reports/{report_id}"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedMonthlyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType =
        new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getSpecifiedMonthlyCustomReports",
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
   * Get specified monthly custom reports
   *
   * <p>See {@link #getSpecifiedMonthlyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format &#x60;YYYY-MM-DD&#x60;. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>>
      getSpecifiedMonthlyCustomReportsWithHttpInfoAsync(String reportId) {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'reportId' when calling"
                  + " getSpecifiedMonthlyCustomReports"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monthly_custom_reports/{report_id}"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedMonthlyCustomReports");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType =
        new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getSpecifiedMonthlyCustomReports",
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

  /** Manage optional parameters to getUsageAnalyzedLogs. */
  public static class GetUsageAnalyzedLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageAnalyzedLogsOptionalParameters
     */
    public GetUsageAnalyzedLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for analyzed logs
   *
   * <p>See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageAnalyzedLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs(OffsetDateTime startHr)
      throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo(startHr, new GetUsageAnalyzedLogsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for analyzed logs
   *
   * <p>See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageAnalyzedLogsResponse&gt;
   */
  public CompletableFuture<UsageAnalyzedLogsResponse> getUsageAnalyzedLogsAsync(
      OffsetDateTime startHr) {
    return getUsageAnalyzedLogsWithHttpInfoAsync(
            startHr, new GetUsageAnalyzedLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for analyzed logs
   *
   * <p>See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageAnalyzedLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs(
      OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters)
      throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for analyzed logs
   *
   * <p>See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageAnalyzedLogsResponse&gt;
   */
  public CompletableFuture<UsageAnalyzedLogsResponse> getUsageAnalyzedLogsAsync(
      OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) {
    return getUsageAnalyzedLogsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for analyzed logs
   *
   * <p>Get hourly usage for analyzed logs (Security Monitoring).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageAnalyzedLogsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageAnalyzedLogsResponse> getUsageAnalyzedLogsWithHttpInfo(
      OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageAnalyzedLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/analyzed_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAnalyzedLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAnalyzedLogsResponse> localVarReturnType =
        new GenericType<UsageAnalyzedLogsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageAnalyzedLogs",
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
   * Get hourly usage for analyzed logs
   *
   * <p>See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageAnalyzedLogsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageAnalyzedLogsResponse>>
      getUsageAnalyzedLogsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageAnalyzedLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageAnalyzedLogs"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/analyzed_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAnalyzedLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAnalyzedLogsResponse> localVarReturnType =
        new GenericType<UsageAnalyzedLogsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageAnalyzedLogs",
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

  /** Manage optional parameters to getUsageAttribution. */
  public static class GetUsageAttributionOptionalParameters {
    private OffsetDateTime endMonth;
    private UsageSortDirection sortDirection;
    private UsageAttributionSort sortName;
    private Boolean includeDescendants;
    private Long offset;
    private Long limit;

    /**
     * Set endMonth
     *
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
     *     usage ending this month. (optional)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set sortDirection
     *
     * @param sortDirection The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to
     *     desc)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters sortDirection(UsageSortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName
     *
     * @param sortName The field to sort by. (optional, default to custom_timeseries_usage)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters sortName(UsageAttributionSort sortName) {
      this.sortName = sortName;
      return this;
    }

    /**
     * Set includeDescendants
     *
     * @param includeDescendants Include child org usage in the response. Defaults to false.
     *     (optional, default to false)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters includeDescendants(Boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }

    /**
     * Set offset
     *
     * @param offset Number of records to skip before beginning to return. (optional, default to 0)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set limit
     *
     * @param limit Maximum number of records to be returned. (optional, default to 5000)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Get Usage Attribution
   *
   * <p>See {@link #getUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @return UsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAttributionResponse getUsageAttribution(
      OffsetDateTime startMonth, UsageAttributionSupportedMetrics fields) throws ApiException {
    return getUsageAttributionWithHttpInfo(
            startMonth, fields, new GetUsageAttributionOptionalParameters())
        .getData();
  }

  /**
   * Get Usage Attribution
   *
   * <p>See {@link #getUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @return CompletableFuture&lt;UsageAttributionResponse&gt;
   */
  public CompletableFuture<UsageAttributionResponse> getUsageAttributionAsync(
      OffsetDateTime startMonth, UsageAttributionSupportedMetrics fields) {
    return getUsageAttributionWithHttpInfoAsync(
            startMonth, fields, new GetUsageAttributionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Usage Attribution
   *
   * <p>See {@link #getUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageAttributionResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAttributionResponse getUsageAttribution(
      OffsetDateTime startMonth,
      UsageAttributionSupportedMetrics fields,
      GetUsageAttributionOptionalParameters parameters)
      throws ApiException {
    return getUsageAttributionWithHttpInfo(startMonth, fields, parameters).getData();
  }

  /**
   * Get Usage Attribution
   *
   * <p>See {@link #getUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageAttributionResponse&gt;
   */
  public CompletableFuture<UsageAttributionResponse> getUsageAttributionAsync(
      OffsetDateTime startMonth,
      UsageAttributionSupportedMetrics fields,
      GetUsageAttributionOptionalParameters parameters) {
    return getUsageAttributionWithHttpInfoAsync(startMonth, fields, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Usage Attribution
   *
   * <p>Get Usage Attribution.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageAttributionResponse> getUsageAttributionWithHttpInfo(
      OffsetDateTime startMonth,
      UsageAttributionSupportedMetrics fields,
      GetUsageAttributionOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startMonth' when calling getUsageAttribution");
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fields' when calling getUsageAttribution");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    UsageAttributionSort sortName = parameters.sortName;
    Boolean includeDescendants = parameters.includeDescendants;
    Long offset = parameters.offset;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v1/usage/attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_descendants", includeDescendants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAttributionResponse> localVarReturnType =
        new GenericType<UsageAttributionResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageAttribution",
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
   * Get Usage Attribution
   *
   * <p>See {@link #getUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageAttributionResponse>>
      getUsageAttributionWithHttpInfoAsync(
          OffsetDateTime startMonth,
          UsageAttributionSupportedMetrics fields,
          GetUsageAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      CompletableFuture<ApiResponse<UsageAttributionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startMonth' when calling getUsageAttribution"));
      return result;
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      CompletableFuture<ApiResponse<UsageAttributionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fields' when calling getUsageAttribution"));
      return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    UsageAttributionSort sortName = parameters.sortName;
    Boolean includeDescendants = parameters.includeDescendants;
    Long offset = parameters.offset;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v1/usage/attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_descendants", includeDescendants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAttributionResponse> localVarReturnType =
        new GenericType<UsageAttributionResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageAttribution",
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

  /** Manage optional parameters to getUsageAuditLogs. */
  public static class GetUsageAuditLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageAuditLogsOptionalParameters
     */
    public GetUsageAuditLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for audit logs
   *
   * <p>See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageAuditLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAuditLogsResponse getUsageAuditLogs(OffsetDateTime startHr) throws ApiException {
    return getUsageAuditLogsWithHttpInfo(startHr, new GetUsageAuditLogsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for audit logs
   *
   * <p>See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageAuditLogsResponse&gt;
   */
  public CompletableFuture<UsageAuditLogsResponse> getUsageAuditLogsAsync(OffsetDateTime startHr) {
    return getUsageAuditLogsWithHttpInfoAsync(startHr, new GetUsageAuditLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for audit logs
   *
   * <p>See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageAuditLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageAuditLogsResponse getUsageAuditLogs(
      OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) throws ApiException {
    return getUsageAuditLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for audit logs
   *
   * <p>See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageAuditLogsResponse&gt;
   */
  public CompletableFuture<UsageAuditLogsResponse> getUsageAuditLogsAsync(
      OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) {
    return getUsageAuditLogsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for audit logs
   *
   * <p>Get hourly usage for audit logs.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageAuditLogsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageAuditLogsResponse> getUsageAuditLogsWithHttpInfo(
      OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageAuditLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/audit_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAuditLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAuditLogsResponse> localVarReturnType =
        new GenericType<UsageAuditLogsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageAuditLogs",
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
   * Get hourly usage for audit logs
   *
   * <p>See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageAuditLogsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageAuditLogsResponse>> getUsageAuditLogsWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageAuditLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageAuditLogs"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/audit_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAuditLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageAuditLogsResponse> localVarReturnType =
        new GenericType<UsageAuditLogsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageAuditLogs",
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

  /** Manage optional parameters to getUsageBillableSummary. */
  public static class GetUsageBillableSummaryOptionalParameters {
    private OffsetDateTime month;

    /**
     * Set month
     *
     * @param month Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
     *     usage starting this month. (optional)
     * @return GetUsageBillableSummaryOptionalParameters
     */
    public GetUsageBillableSummaryOptionalParameters month(OffsetDateTime month) {
      this.month = month;
      return this;
    }
  }

  /**
   * Get billable usage across your account
   *
   * <p>See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @return UsageBillableSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public UsageBillableSummaryResponse getUsageBillableSummary() throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(new GetUsageBillableSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get billable usage across your account
   *
   * <p>See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @return CompletableFuture&lt;UsageBillableSummaryResponse&gt;
   */
  public CompletableFuture<UsageBillableSummaryResponse> getUsageBillableSummaryAsync() {
    return getUsageBillableSummaryWithHttpInfoAsync(new GetUsageBillableSummaryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get billable usage across your account
   *
   * <p>See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageBillableSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public UsageBillableSummaryResponse getUsageBillableSummary(
      GetUsageBillableSummaryOptionalParameters parameters) throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(parameters).getData();
  }

  /**
   * Get billable usage across your account
   *
   * <p>See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageBillableSummaryResponse&gt;
   */
  public CompletableFuture<UsageBillableSummaryResponse> getUsageBillableSummaryAsync(
      GetUsageBillableSummaryOptionalParameters parameters) {
    return getUsageBillableSummaryWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get billable usage across your account
   *
   * <p>Get billable usage across your account.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageBillableSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageBillableSummaryResponse> getUsageBillableSummaryWithHttpInfo(
      GetUsageBillableSummaryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    // create path and map variables
    String localVarPath = "/api/v1/usage/billable-summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageBillableSummary");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageBillableSummaryResponse> localVarReturnType =
        new GenericType<UsageBillableSummaryResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageBillableSummary",
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
   * Get billable usage across your account
   *
   * <p>See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageBillableSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageBillableSummaryResponse>>
      getUsageBillableSummaryWithHttpInfoAsync(
          GetUsageBillableSummaryOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    // create path and map variables
    String localVarPath = "/api/v1/usage/billable-summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageBillableSummary");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageBillableSummaryResponse> localVarReturnType =
        new GenericType<UsageBillableSummaryResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageBillableSummary",
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

  /** Manage optional parameters to getUsageCWS. */
  public static class GetUsageCWSOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageCWSOptionalParameters
     */
    public GetUsageCWSOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Cloud Workload Security
   *
   * <p>See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageCWSResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCWSResponse getUsageCWS(OffsetDateTime startHr) throws ApiException {
    return getUsageCWSWithHttpInfo(startHr, new GetUsageCWSOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Cloud Workload Security
   *
   * <p>See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageCWSResponse&gt;
   */
  public CompletableFuture<UsageCWSResponse> getUsageCWSAsync(OffsetDateTime startHr) {
    return getUsageCWSWithHttpInfoAsync(startHr, new GetUsageCWSOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Cloud Workload Security
   *
   * <p>See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageCWSResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCWSResponse getUsageCWS(
      OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) throws ApiException {
    return getUsageCWSWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Cloud Workload Security
   *
   * <p>See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageCWSResponse&gt;
   */
  public CompletableFuture<UsageCWSResponse> getUsageCWSAsync(
      OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) {
    return getUsageCWSWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Cloud Workload Security
   *
   * <p>Get hourly usage for Cloud Workload Security.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCWSResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageCWSResponse> getUsageCWSWithHttpInfo(
      OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageCWS");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageCWS");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCWSResponse> localVarReturnType = new GenericType<UsageCWSResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageCWS",
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
   * Get hourly usage for Cloud Workload Security
   *
   * <p>See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCWSResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageCWSResponse>> getUsageCWSWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageCWSResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageCWS"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageCWS");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCWSResponse> localVarReturnType = new GenericType<UsageCWSResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageCWS",
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

  /** Manage optional parameters to getUsageCloudSecurityPostureManagement. */
  public static class GetUsageCloudSecurityPostureManagementOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageCloudSecurityPostureManagementOptionalParameters
     */
    public GetUsageCloudSecurityPostureManagementOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for CSPM
   *
   * <p>See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageCloudSecurityPostureManagementResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCloudSecurityPostureManagementResponse getUsageCloudSecurityPostureManagement(
      OffsetDateTime startHr) throws ApiException {
    return getUsageCloudSecurityPostureManagementWithHttpInfo(
            startHr, new GetUsageCloudSecurityPostureManagementOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for CSPM
   *
   * <p>See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageCloudSecurityPostureManagementResponse&gt;
   */
  public CompletableFuture<UsageCloudSecurityPostureManagementResponse>
      getUsageCloudSecurityPostureManagementAsync(OffsetDateTime startHr) {
    return getUsageCloudSecurityPostureManagementWithHttpInfoAsync(
            startHr, new GetUsageCloudSecurityPostureManagementOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for CSPM
   *
   * <p>See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageCloudSecurityPostureManagementResponse
   * @throws ApiException if fails to make API call
   */
  public UsageCloudSecurityPostureManagementResponse getUsageCloudSecurityPostureManagement(
      OffsetDateTime startHr, GetUsageCloudSecurityPostureManagementOptionalParameters parameters)
      throws ApiException {
    return getUsageCloudSecurityPostureManagementWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for CSPM
   *
   * <p>See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageCloudSecurityPostureManagementResponse&gt;
   */
  public CompletableFuture<UsageCloudSecurityPostureManagementResponse>
      getUsageCloudSecurityPostureManagementAsync(
          OffsetDateTime startHr,
          GetUsageCloudSecurityPostureManagementOptionalParameters parameters) {
    return getUsageCloudSecurityPostureManagementWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for CSPM
   *
   * <p>Get hourly usage for Cloud Security Posture Management (CSPM).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCloudSecurityPostureManagementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageCloudSecurityPostureManagementResponse>
      getUsageCloudSecurityPostureManagementWithHttpInfo(
          OffsetDateTime startHr,
          GetUsageCloudSecurityPostureManagementOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling"
              + " getUsageCloudSecurityPostureManagement");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cspm";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageCloudSecurityPostureManagement");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCloudSecurityPostureManagementResponse> localVarReturnType =
        new GenericType<UsageCloudSecurityPostureManagementResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageCloudSecurityPostureManagement",
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
   * Get hourly usage for CSPM
   *
   * <p>See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCloudSecurityPostureManagementResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageCloudSecurityPostureManagementResponse>>
      getUsageCloudSecurityPostureManagementWithHttpInfoAsync(
          OffsetDateTime startHr,
          GetUsageCloudSecurityPostureManagementOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageCloudSecurityPostureManagementResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling"
                  + " getUsageCloudSecurityPostureManagement"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cspm";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageCloudSecurityPostureManagement");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageCloudSecurityPostureManagementResponse> localVarReturnType =
        new GenericType<UsageCloudSecurityPostureManagementResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageCloudSecurityPostureManagement",
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

  /** Manage optional parameters to getUsageDBM. */
  public static class GetUsageDBMOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageDBMOptionalParameters
     */
    public GetUsageDBMOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Database Monitoring
   *
   * <p>See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageDBMResponse
   * @throws ApiException if fails to make API call
   */
  public UsageDBMResponse getUsageDBM(OffsetDateTime startHr) throws ApiException {
    return getUsageDBMWithHttpInfo(startHr, new GetUsageDBMOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Database Monitoring
   *
   * <p>See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageDBMResponse&gt;
   */
  public CompletableFuture<UsageDBMResponse> getUsageDBMAsync(OffsetDateTime startHr) {
    return getUsageDBMWithHttpInfoAsync(startHr, new GetUsageDBMOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Database Monitoring
   *
   * <p>See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageDBMResponse
   * @throws ApiException if fails to make API call
   */
  public UsageDBMResponse getUsageDBM(
      OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) throws ApiException {
    return getUsageDBMWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Database Monitoring
   *
   * <p>See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageDBMResponse&gt;
   */
  public CompletableFuture<UsageDBMResponse> getUsageDBMAsync(
      OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) {
    return getUsageDBMWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Database Monitoring
   *
   * <p>Get hourly usage for Database Monitoring
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageDBMResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageDBMResponse> getUsageDBMWithHttpInfo(
      OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageDBM");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/dbm";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageDBM");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageDBMResponse> localVarReturnType = new GenericType<UsageDBMResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageDBM",
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
   * Get hourly usage for Database Monitoring
   *
   * <p>See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageDBMResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageDBMResponse>> getUsageDBMWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageDBMResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageDBM"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/dbm";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageDBM");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageDBMResponse> localVarReturnType = new GenericType<UsageDBMResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageDBM",
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

  /** Manage optional parameters to getUsageFargate. */
  public static class GetUsageFargateOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageFargateOptionalParameters
     */
    public GetUsageFargateOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Fargate
   *
   * <p>See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageFargateResponse
   * @throws ApiException if fails to make API call
   */
  public UsageFargateResponse getUsageFargate(OffsetDateTime startHr) throws ApiException {
    return getUsageFargateWithHttpInfo(startHr, new GetUsageFargateOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Fargate
   *
   * <p>See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageFargateResponse&gt;
   */
  public CompletableFuture<UsageFargateResponse> getUsageFargateAsync(OffsetDateTime startHr) {
    return getUsageFargateWithHttpInfoAsync(startHr, new GetUsageFargateOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Fargate
   *
   * <p>See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageFargateResponse
   * @throws ApiException if fails to make API call
   */
  public UsageFargateResponse getUsageFargate(
      OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) throws ApiException {
    return getUsageFargateWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Fargate
   *
   * <p>See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageFargateResponse&gt;
   */
  public CompletableFuture<UsageFargateResponse> getUsageFargateAsync(
      OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) {
    return getUsageFargateWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Fargate
   *
   * <p>Get hourly usage for [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageFargateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageFargateResponse> getUsageFargateWithHttpInfo(
      OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageFargate");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageFargate");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageFargateResponse> localVarReturnType =
        new GenericType<UsageFargateResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageFargate",
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
   * Get hourly usage for Fargate
   *
   * <p>See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageFargateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageFargateResponse>> getUsageFargateWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageFargateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageFargate"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageFargate");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageFargateResponse> localVarReturnType =
        new GenericType<UsageFargateResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageFargate",
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

  /** Manage optional parameters to getUsageHosts. */
  public static class GetUsageHostsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageHostsOptionalParameters
     */
    public GetUsageHostsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for hosts and containers
   *
   * <p>See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageHostsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageHostsResponse getUsageHosts(OffsetDateTime startHr) throws ApiException {
    return getUsageHostsWithHttpInfo(startHr, new GetUsageHostsOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for hosts and containers
   *
   * <p>See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageHostsResponse&gt;
   */
  public CompletableFuture<UsageHostsResponse> getUsageHostsAsync(OffsetDateTime startHr) {
    return getUsageHostsWithHttpInfoAsync(startHr, new GetUsageHostsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for hosts and containers
   *
   * <p>See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageHostsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageHostsResponse getUsageHosts(
      OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) throws ApiException {
    return getUsageHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for hosts and containers
   *
   * <p>See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageHostsResponse&gt;
   */
  public CompletableFuture<UsageHostsResponse> getUsageHostsAsync(
      OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) {
    return getUsageHostsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for hosts and containers
   *
   * <p>Get hourly usage for hosts and containers.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageHostsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageHostsResponse> getUsageHostsWithHttpInfo(
      OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageHosts");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageHosts");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageHostsResponse> localVarReturnType = new GenericType<UsageHostsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageHosts",
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
   * Get hourly usage for hosts and containers
   *
   * <p>See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageHostsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageHostsResponse>> getUsageHostsWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageHosts"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageHosts");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageHostsResponse> localVarReturnType = new GenericType<UsageHostsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageHosts",
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

  /** Manage optional parameters to getUsageIndexedSpans. */
  public static class GetUsageIndexedSpansOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageIndexedSpansOptionalParameters
     */
    public GetUsageIndexedSpansOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for indexed spans
   *
   * <p>See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIndexedSpansResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIndexedSpansResponse getUsageIndexedSpans(OffsetDateTime startHr)
      throws ApiException {
    return getUsageIndexedSpansWithHttpInfo(startHr, new GetUsageIndexedSpansOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for indexed spans
   *
   * <p>See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageIndexedSpansResponse&gt;
   */
  public CompletableFuture<UsageIndexedSpansResponse> getUsageIndexedSpansAsync(
      OffsetDateTime startHr) {
    return getUsageIndexedSpansWithHttpInfoAsync(
            startHr, new GetUsageIndexedSpansOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for indexed spans
   *
   * <p>See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIndexedSpansResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIndexedSpansResponse getUsageIndexedSpans(
      OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters)
      throws ApiException {
    return getUsageIndexedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for indexed spans
   *
   * <p>See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageIndexedSpansResponse&gt;
   */
  public CompletableFuture<UsageIndexedSpansResponse> getUsageIndexedSpansAsync(
      OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) {
    return getUsageIndexedSpansWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for indexed spans
   *
   * <p>Get hourly usage for indexed spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIndexedSpansResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageIndexedSpansResponse> getUsageIndexedSpansWithHttpInfo(
      OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageIndexedSpans");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/indexed-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageIndexedSpans");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIndexedSpansResponse> localVarReturnType =
        new GenericType<UsageIndexedSpansResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageIndexedSpans",
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
   * Get hourly usage for indexed spans
   *
   * <p>See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIndexedSpansResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageIndexedSpansResponse>>
      getUsageIndexedSpansWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageIndexedSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageIndexedSpans"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/indexed-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageIndexedSpans");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIndexedSpansResponse> localVarReturnType =
        new GenericType<UsageIndexedSpansResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageIndexedSpans",
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

  /** Manage optional parameters to getUsageInternetOfThings. */
  public static class GetUsageInternetOfThingsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageInternetOfThingsOptionalParameters
     */
    public GetUsageInternetOfThingsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for IoT
   *
   * <p>See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIoTResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIoTResponse getUsageInternetOfThings(OffsetDateTime startHr) throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo(
            startHr, new GetUsageInternetOfThingsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for IoT
   *
   * <p>See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageIoTResponse&gt;
   */
  public CompletableFuture<UsageIoTResponse> getUsageInternetOfThingsAsync(OffsetDateTime startHr) {
    return getUsageInternetOfThingsWithHttpInfoAsync(
            startHr, new GetUsageInternetOfThingsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for IoT
   *
   * <p>See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIoTResponse
   * @throws ApiException if fails to make API call
   */
  public UsageIoTResponse getUsageInternetOfThings(
      OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters)
      throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for IoT
   *
   * <p>See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageIoTResponse&gt;
   */
  public CompletableFuture<UsageIoTResponse> getUsageInternetOfThingsAsync(
      OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) {
    return getUsageInternetOfThingsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for IoT
   *
   * <p>Get hourly usage for IoT.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIoTResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageIoTResponse> getUsageInternetOfThingsWithHttpInfo(
      OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageInternetOfThings");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/iot";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageInternetOfThings");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIoTResponse> localVarReturnType = new GenericType<UsageIoTResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageInternetOfThings",
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
   * Get hourly usage for IoT
   *
   * <p>See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIoTResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageIoTResponse>> getUsageInternetOfThingsWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageIoTResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling getUsageInternetOfThings"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/iot";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageInternetOfThings");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageIoTResponse> localVarReturnType = new GenericType<UsageIoTResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageInternetOfThings",
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

  /** Manage optional parameters to getUsageLambda. */
  public static class GetUsageLambdaOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageLambdaOptionalParameters
     */
    public GetUsageLambdaOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Lambda
   *
   * <p>See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLambdaResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLambdaResponse getUsageLambda(OffsetDateTime startHr) throws ApiException {
    return getUsageLambdaWithHttpInfo(startHr, new GetUsageLambdaOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Lambda
   *
   * <p>See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageLambdaResponse&gt;
   */
  public CompletableFuture<UsageLambdaResponse> getUsageLambdaAsync(OffsetDateTime startHr) {
    return getUsageLambdaWithHttpInfoAsync(startHr, new GetUsageLambdaOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Lambda
   *
   * <p>See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLambdaResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLambdaResponse getUsageLambda(
      OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) throws ApiException {
    return getUsageLambdaWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Lambda
   *
   * <p>See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageLambdaResponse&gt;
   */
  public CompletableFuture<UsageLambdaResponse> getUsageLambdaAsync(
      OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) {
    return getUsageLambdaWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Lambda
   *
   * <p>Get hourly usage for lambda.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLambdaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageLambdaResponse> getUsageLambdaWithHttpInfo(
      OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageLambda");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLambda");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLambdaResponse> localVarReturnType = new GenericType<UsageLambdaResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageLambda",
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
   * Get hourly usage for Lambda
   *
   * <p>See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLambdaResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLambdaResponse>> getUsageLambdaWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageLambdaResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageLambda"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLambda");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLambdaResponse> localVarReturnType = new GenericType<UsageLambdaResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageLambda",
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

  /** Manage optional parameters to getUsageLogs. */
  public static class GetUsageLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageLogsOptionalParameters
     */
    public GetUsageLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Logs
   *
   * <p>See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsResponse getUsageLogs(OffsetDateTime startHr) throws ApiException {
    return getUsageLogsWithHttpInfo(startHr, new GetUsageLogsOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Logs
   *
   * <p>See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageLogsResponse&gt;
   */
  public CompletableFuture<UsageLogsResponse> getUsageLogsAsync(OffsetDateTime startHr) {
    return getUsageLogsWithHttpInfoAsync(startHr, new GetUsageLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Logs
   *
   * <p>See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsResponse getUsageLogs(
      OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) throws ApiException {
    return getUsageLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Logs
   *
   * <p>See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageLogsResponse&gt;
   */
  public CompletableFuture<UsageLogsResponse> getUsageLogsAsync(
      OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) {
    return getUsageLogsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Logs
   *
   * <p>Get hourly usage for logs.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageLogsResponse> getUsageLogsWithHttpInfo(
      OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsResponse> localVarReturnType = new GenericType<UsageLogsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageLogs",
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
   * Get hourly usage for Logs
   *
   * <p>See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLogsResponse>> getUsageLogsWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageLogs"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogs");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsResponse> localVarReturnType = new GenericType<UsageLogsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageLogs",
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

  /** Manage optional parameters to getUsageLogsByIndex. */
  public static class GetUsageLogsByIndexOptionalParameters {
    private OffsetDateTime endHr;
    private List<String> indexName;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageLogsByIndexOptionalParameters
     */
    public GetUsageLogsByIndexOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set indexName
     *
     * @param indexName Comma-separated list of log index names. (optional)
     * @return GetUsageLogsByIndexOptionalParameters
     */
    public GetUsageLogsByIndexOptionalParameters indexName(List<String> indexName) {
      this.indexName = indexName;
      return this;
    }
  }

  /**
   * Get hourly usage for Logs by Index
   *
   * <p>See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLogsByIndexResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsByIndexResponse getUsageLogsByIndex(OffsetDateTime startHr) throws ApiException {
    return getUsageLogsByIndexWithHttpInfo(startHr, new GetUsageLogsByIndexOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Logs by Index
   *
   * <p>See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageLogsByIndexResponse&gt;
   */
  public CompletableFuture<UsageLogsByIndexResponse> getUsageLogsByIndexAsync(
      OffsetDateTime startHr) {
    return getUsageLogsByIndexWithHttpInfoAsync(
            startHr, new GetUsageLogsByIndexOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Logs by Index
   *
   * <p>See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsByIndexResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsByIndexResponse getUsageLogsByIndex(
      OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters)
      throws ApiException {
    return getUsageLogsByIndexWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Logs by Index
   *
   * <p>See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageLogsByIndexResponse&gt;
   */
  public CompletableFuture<UsageLogsByIndexResponse> getUsageLogsByIndexAsync(
      OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) {
    return getUsageLogsByIndexWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Logs by Index
   *
   * <p>Get hourly usage for logs by index.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsByIndexResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageLogsByIndexResponse> getUsageLogsByIndexWithHttpInfo(
      OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex");
    }
    OffsetDateTime endHr = parameters.endHr;
    List<String> indexName = parameters.indexName;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByIndex");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsByIndexResponse> localVarReturnType =
        new GenericType<UsageLogsByIndexResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageLogsByIndex",
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
   * Get hourly usage for Logs by Index
   *
   * <p>See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsByIndexResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLogsByIndexResponse>>
      getUsageLogsByIndexWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageLogsByIndexResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    List<String> indexName = parameters.indexName;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByIndex");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsByIndexResponse> localVarReturnType =
        new GenericType<UsageLogsByIndexResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageLogsByIndex",
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

  /** Manage optional parameters to getUsageLogsByRetention. */
  public static class GetUsageLogsByRetentionOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageLogsByRetentionOptionalParameters
     */
    public GetUsageLogsByRetentionOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly logs usage by retention
   *
   * <p>See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageLogsByRetentionResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsByRetentionResponse getUsageLogsByRetention(OffsetDateTime startHr)
      throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo(
            startHr, new GetUsageLogsByRetentionOptionalParameters())
        .getData();
  }

  /**
   * Get hourly logs usage by retention
   *
   * <p>See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageLogsByRetentionResponse&gt;
   */
  public CompletableFuture<UsageLogsByRetentionResponse> getUsageLogsByRetentionAsync(
      OffsetDateTime startHr) {
    return getUsageLogsByRetentionWithHttpInfoAsync(
            startHr, new GetUsageLogsByRetentionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly logs usage by retention
   *
   * <p>See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsByRetentionResponse
   * @throws ApiException if fails to make API call
   */
  public UsageLogsByRetentionResponse getUsageLogsByRetention(
      OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters)
      throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly logs usage by retention
   *
   * <p>See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageLogsByRetentionResponse&gt;
   */
  public CompletableFuture<UsageLogsByRetentionResponse> getUsageLogsByRetentionAsync(
      OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) {
    return getUsageLogsByRetentionWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly logs usage by retention
   *
   * <p>Get hourly usage for indexed logs by retention period.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsByRetentionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageLogsByRetentionResponse> getUsageLogsByRetentionWithHttpInfo(
      OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageLogsByRetention");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs-by-retention";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByRetention");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsByRetentionResponse> localVarReturnType =
        new GenericType<UsageLogsByRetentionResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageLogsByRetention",
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
   * Get hourly logs usage by retention
   *
   * <p>See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsByRetentionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLogsByRetentionResponse>>
      getUsageLogsByRetentionWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageLogsByRetentionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling getUsageLogsByRetention"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs-by-retention";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByRetention");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageLogsByRetentionResponse> localVarReturnType =
        new GenericType<UsageLogsByRetentionResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageLogsByRetention",
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

  /** Manage optional parameters to getUsageNetworkFlows. */
  public static class GetUsageNetworkFlowsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageNetworkFlowsOptionalParameters
     */
    public GetUsageNetworkFlowsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Network Flows
   *
   * <p>See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageNetworkFlowsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageNetworkFlowsResponse getUsageNetworkFlows(OffsetDateTime startHr)
      throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo(startHr, new GetUsageNetworkFlowsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Network Flows
   *
   * <p>See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageNetworkFlowsResponse&gt;
   */
  public CompletableFuture<UsageNetworkFlowsResponse> getUsageNetworkFlowsAsync(
      OffsetDateTime startHr) {
    return getUsageNetworkFlowsWithHttpInfoAsync(
            startHr, new GetUsageNetworkFlowsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Network Flows
   *
   * <p>See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageNetworkFlowsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageNetworkFlowsResponse getUsageNetworkFlows(
      OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters)
      throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Network Flows
   *
   * <p>See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageNetworkFlowsResponse&gt;
   */
  public CompletableFuture<UsageNetworkFlowsResponse> getUsageNetworkFlowsAsync(
      OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) {
    return getUsageNetworkFlowsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Network Flows
   *
   * <p>Get hourly usage for network flows.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageNetworkFlowsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageNetworkFlowsResponse> getUsageNetworkFlowsWithHttpInfo(
      OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkFlows");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageNetworkFlowsResponse> localVarReturnType =
        new GenericType<UsageNetworkFlowsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageNetworkFlows",
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
   * Get hourly usage for Network Flows
   *
   * <p>See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageNetworkFlowsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageNetworkFlowsResponse>>
      getUsageNetworkFlowsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageNetworkFlowsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkFlows");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageNetworkFlowsResponse> localVarReturnType =
        new GenericType<UsageNetworkFlowsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageNetworkFlows",
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

  /** Manage optional parameters to getUsageNetworkHosts. */
  public static class GetUsageNetworkHostsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageNetworkHostsOptionalParameters
     */
    public GetUsageNetworkHostsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Network Hosts
   *
   * <p>See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageNetworkHostsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageNetworkHostsResponse getUsageNetworkHosts(OffsetDateTime startHr)
      throws ApiException {
    return getUsageNetworkHostsWithHttpInfo(startHr, new GetUsageNetworkHostsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Network Hosts
   *
   * <p>See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageNetworkHostsResponse&gt;
   */
  public CompletableFuture<UsageNetworkHostsResponse> getUsageNetworkHostsAsync(
      OffsetDateTime startHr) {
    return getUsageNetworkHostsWithHttpInfoAsync(
            startHr, new GetUsageNetworkHostsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Network Hosts
   *
   * <p>See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageNetworkHostsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageNetworkHostsResponse getUsageNetworkHosts(
      OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters)
      throws ApiException {
    return getUsageNetworkHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Network Hosts
   *
   * <p>See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageNetworkHostsResponse&gt;
   */
  public CompletableFuture<UsageNetworkHostsResponse> getUsageNetworkHostsAsync(
      OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) {
    return getUsageNetworkHostsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Network Hosts
   *
   * <p>Get hourly usage for network hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageNetworkHostsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageNetworkHostsResponse> getUsageNetworkHostsWithHttpInfo(
      OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkHosts");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageNetworkHostsResponse> localVarReturnType =
        new GenericType<UsageNetworkHostsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageNetworkHosts",
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
   * Get hourly usage for Network Hosts
   *
   * <p>See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageNetworkHostsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageNetworkHostsResponse>>
      getUsageNetworkHostsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageNetworkHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkHosts");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageNetworkHostsResponse> localVarReturnType =
        new GenericType<UsageNetworkHostsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageNetworkHosts",
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

  /** Manage optional parameters to getUsageProfiling. */
  public static class GetUsageProfilingOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageProfilingOptionalParameters
     */
    public GetUsageProfilingOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for profiled hosts
   *
   * <p>See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageProfilingResponse
   * @throws ApiException if fails to make API call
   */
  public UsageProfilingResponse getUsageProfiling(OffsetDateTime startHr) throws ApiException {
    return getUsageProfilingWithHttpInfo(startHr, new GetUsageProfilingOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for profiled hosts
   *
   * <p>See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageProfilingResponse&gt;
   */
  public CompletableFuture<UsageProfilingResponse> getUsageProfilingAsync(OffsetDateTime startHr) {
    return getUsageProfilingWithHttpInfoAsync(startHr, new GetUsageProfilingOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for profiled hosts
   *
   * <p>See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageProfilingResponse
   * @throws ApiException if fails to make API call
   */
  public UsageProfilingResponse getUsageProfiling(
      OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) throws ApiException {
    return getUsageProfilingWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for profiled hosts
   *
   * <p>See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageProfilingResponse&gt;
   */
  public CompletableFuture<UsageProfilingResponse> getUsageProfilingAsync(
      OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) {
    return getUsageProfilingWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for profiled hosts
   *
   * <p>Get hourly usage for profiled hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageProfilingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageProfilingResponse> getUsageProfilingWithHttpInfo(
      OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageProfiling");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/profiling";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageProfiling");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageProfilingResponse> localVarReturnType =
        new GenericType<UsageProfilingResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageProfiling",
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
   * Get hourly usage for profiled hosts
   *
   * <p>See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageProfilingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageProfilingResponse>> getUsageProfilingWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageProfilingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageProfiling"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/profiling";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageProfiling");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageProfilingResponse> localVarReturnType =
        new GenericType<UsageProfilingResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageProfiling",
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

  /** Manage optional parameters to getUsageRumSessions. */
  public static class GetUsageRumSessionsOptionalParameters {
    private OffsetDateTime endHr;
    private String type;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageRumSessionsOptionalParameters
     */
    public GetUsageRumSessionsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set type
     *
     * @param type RUM type: &#x60;[browser, mobile]&#x60;. Defaults to &#x60;browser&#x60;.
     *     (optional)
     * @return GetUsageRumSessionsOptionalParameters
     */
    public GetUsageRumSessionsOptionalParameters type(String type) {
      this.type = type;
      return this;
    }
  }

  /**
   * Get hourly usage for RUM Sessions
   *
   * <p>See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageRumSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageRumSessionsResponse getUsageRumSessions(OffsetDateTime startHr) throws ApiException {
    return getUsageRumSessionsWithHttpInfo(startHr, new GetUsageRumSessionsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for RUM Sessions
   *
   * <p>See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageRumSessionsResponse&gt;
   */
  public CompletableFuture<UsageRumSessionsResponse> getUsageRumSessionsAsync(
      OffsetDateTime startHr) {
    return getUsageRumSessionsWithHttpInfoAsync(
            startHr, new GetUsageRumSessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for RUM Sessions
   *
   * <p>See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageRumSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageRumSessionsResponse getUsageRumSessions(
      OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters)
      throws ApiException {
    return getUsageRumSessionsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for RUM Sessions
   *
   * <p>See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageRumSessionsResponse&gt;
   */
  public CompletableFuture<UsageRumSessionsResponse> getUsageRumSessionsAsync(
      OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) {
    return getUsageRumSessionsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for RUM Sessions
   *
   * <p>Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageRumSessionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageRumSessionsResponse> getUsageRumSessionsWithHttpInfo(
      OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageRumSessions");
    }
    OffsetDateTime endHr = parameters.endHr;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumSessions");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageRumSessionsResponse> localVarReturnType =
        new GenericType<UsageRumSessionsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageRumSessions",
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
   * Get hourly usage for RUM Sessions
   *
   * <p>See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageRumSessionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageRumSessionsResponse>>
      getUsageRumSessionsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageRumSessionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageRumSessions"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumSessions");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageRumSessionsResponse> localVarReturnType =
        new GenericType<UsageRumSessionsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageRumSessions",
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

  /** Manage optional parameters to getUsageRumUnits. */
  public static class GetUsageRumUnitsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageRumUnitsOptionalParameters
     */
    public GetUsageRumUnitsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for RUM Units
   *
   * <p>See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageRumUnitsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageRumUnitsResponse getUsageRumUnits(OffsetDateTime startHr) throws ApiException {
    return getUsageRumUnitsWithHttpInfo(startHr, new GetUsageRumUnitsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for RUM Units
   *
   * <p>See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageRumUnitsResponse&gt;
   */
  public CompletableFuture<UsageRumUnitsResponse> getUsageRumUnitsAsync(OffsetDateTime startHr) {
    return getUsageRumUnitsWithHttpInfoAsync(startHr, new GetUsageRumUnitsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for RUM Units
   *
   * <p>See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageRumUnitsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageRumUnitsResponse getUsageRumUnits(
      OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) throws ApiException {
    return getUsageRumUnitsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for RUM Units
   *
   * <p>See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageRumUnitsResponse&gt;
   */
  public CompletableFuture<UsageRumUnitsResponse> getUsageRumUnitsAsync(
      OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) {
    return getUsageRumUnitsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for RUM Units
   *
   * <p>Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Units.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageRumUnitsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageRumUnitsResponse> getUsageRumUnitsWithHttpInfo(
      OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageRumUnits");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumUnits");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageRumUnitsResponse> localVarReturnType =
        new GenericType<UsageRumUnitsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageRumUnits",
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
   * Get hourly usage for RUM Units
   *
   * <p>See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageRumUnitsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageRumUnitsResponse>> getUsageRumUnitsWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageRumUnitsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageRumUnits"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumUnits");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageRumUnitsResponse> localVarReturnType =
        new GenericType<UsageRumUnitsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageRumUnits",
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

  /** Manage optional parameters to getUsageSDS. */
  public static class GetUsageSDSOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageSDSOptionalParameters
     */
    public GetUsageSDSOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageSDSResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSDSResponse getUsageSDS(OffsetDateTime startHr) throws ApiException {
    return getUsageSDSWithHttpInfo(startHr, new GetUsageSDSOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageSDSResponse&gt;
   */
  public CompletableFuture<UsageSDSResponse> getUsageSDSAsync(OffsetDateTime startHr) {
    return getUsageSDSWithHttpInfoAsync(startHr, new GetUsageSDSOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSDSResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSDSResponse getUsageSDS(
      OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) throws ApiException {
    return getUsageSDSWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSDSResponse&gt;
   */
  public CompletableFuture<UsageSDSResponse> getUsageSDSAsync(
      OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) {
    return getUsageSDSWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>Get hourly usage for Sensitive Data Scanner.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSDSResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSDSResponse> getUsageSDSWithHttpInfo(
      OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageSDS");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/sds";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSDS");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSDSResponse> localVarReturnType = new GenericType<UsageSDSResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSDS",
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
   * Get hourly usage for Sensitive Data Scanner
   *
   * <p>See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSDSResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSDSResponse>> getUsageSDSWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageSDSResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageSDS"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/sds";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSDS");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSDSResponse> localVarReturnType = new GenericType<UsageSDSResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSDS",
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

  /** Manage optional parameters to getUsageSNMP. */
  public static class GetUsageSNMPOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageSNMPOptionalParameters
     */
    public GetUsageSNMPOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for SNMP devices
   *
   * <p>See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageSNMPResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSNMPResponse getUsageSNMP(OffsetDateTime startHr) throws ApiException {
    return getUsageSNMPWithHttpInfo(startHr, new GetUsageSNMPOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for SNMP devices
   *
   * <p>See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageSNMPResponse&gt;
   */
  public CompletableFuture<UsageSNMPResponse> getUsageSNMPAsync(OffsetDateTime startHr) {
    return getUsageSNMPWithHttpInfoAsync(startHr, new GetUsageSNMPOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for SNMP devices
   *
   * <p>See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSNMPResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSNMPResponse getUsageSNMP(
      OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) throws ApiException {
    return getUsageSNMPWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for SNMP devices
   *
   * <p>See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSNMPResponse&gt;
   */
  public CompletableFuture<UsageSNMPResponse> getUsageSNMPAsync(
      OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) {
    return getUsageSNMPWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for SNMP devices
   *
   * <p>Get hourly usage for SNMP devices.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSNMPResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSNMPResponse> getUsageSNMPWithHttpInfo(
      OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageSNMP");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/snmp";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSNMP");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSNMPResponse> localVarReturnType = new GenericType<UsageSNMPResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSNMP",
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
   * Get hourly usage for SNMP devices
   *
   * <p>See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSNMPResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSNMPResponse>> getUsageSNMPWithHttpInfoAsync(
      OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageSNMPResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageSNMP"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/snmp";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSNMP");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSNMPResponse> localVarReturnType = new GenericType<UsageSNMPResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSNMP",
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

  /** Manage optional parameters to getUsageSummary. */
  public static class GetUsageSummaryOptionalParameters {
    private OffsetDateTime endMonth;
    private Boolean includeOrgDetails;

    /**
     * Set endMonth
     *
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
     *     usage ending this month. (optional)
     * @return GetUsageSummaryOptionalParameters
     */
    public GetUsageSummaryOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set includeOrgDetails
     *
     * @param includeOrgDetails Include usage summaries for each sub-org. (optional)
     * @return GetUsageSummaryOptionalParameters
     */
    public GetUsageSummaryOptionalParameters includeOrgDetails(Boolean includeOrgDetails) {
      this.includeOrgDetails = includeOrgDetails;
      return this;
    }
  }

  /**
   * Get usage across your multi-org account
   *
   * <p>See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @return UsageSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSummaryResponse getUsageSummary(OffsetDateTime startMonth) throws ApiException {
    return getUsageSummaryWithHttpInfo(startMonth, new GetUsageSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get usage across your multi-org account
   *
   * <p>See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @return CompletableFuture&lt;UsageSummaryResponse&gt;
   */
  public CompletableFuture<UsageSummaryResponse> getUsageSummaryAsync(OffsetDateTime startMonth) {
    return getUsageSummaryWithHttpInfoAsync(startMonth, new GetUsageSummaryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get usage across your multi-org account
   *
   * <p>See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSummaryResponse getUsageSummary(
      OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) throws ApiException {
    return getUsageSummaryWithHttpInfo(startMonth, parameters).getData();
  }

  /**
   * Get usage across your multi-org account
   *
   * <p>See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSummaryResponse&gt;
   */
  public CompletableFuture<UsageSummaryResponse> getUsageSummaryAsync(
      OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) {
    return getUsageSummaryWithHttpInfoAsync(startMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get usage across your multi-org account
   *
   * <p>Get usage across your multi-org account. You must have the multi-org feature enabled.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSummaryResponse> getUsageSummaryWithHttpInfo(
      OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startMonth' when calling getUsageSummary");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeOrgDetails = parameters.includeOrgDetails;
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSummary");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSummaryResponse> localVarReturnType =
        new GenericType<UsageSummaryResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSummary",
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
   * Get usage across your multi-org account
   *
   * <p>See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSummaryResponse>> getUsageSummaryWithHttpInfoAsync(
      OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      CompletableFuture<ApiResponse<UsageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startMonth' when calling getUsageSummary"));
      return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeOrgDetails = parameters.includeOrgDetails;
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSummary");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSummaryResponse> localVarReturnType =
        new GenericType<UsageSummaryResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSummary",
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

  /** Manage optional parameters to getUsageSynthetics. */
  public static class GetUsageSyntheticsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageSyntheticsOptionalParameters
     */
    public GetUsageSyntheticsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Synthetics Checks
   *
   * <p>See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UsageSyntheticsResponse getUsageSynthetics(OffsetDateTime startHr) throws ApiException {
    return getUsageSyntheticsWithHttpInfo(startHr, new GetUsageSyntheticsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics Checks
   *
   * <p>See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageSyntheticsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<UsageSyntheticsResponse> getUsageSyntheticsAsync(
      OffsetDateTime startHr) {
    return getUsageSyntheticsWithHttpInfoAsync(startHr, new GetUsageSyntheticsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics Checks
   *
   * <p>See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UsageSyntheticsResponse getUsageSynthetics(
      OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) throws ApiException {
    return getUsageSyntheticsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics Checks
   *
   * <p>See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSyntheticsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<UsageSyntheticsResponse> getUsageSyntheticsAsync(
      OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) {
    return getUsageSyntheticsWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics Checks
   *
   * <p>Get hourly usage for [Synthetics checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageSyntheticsResponse> getUsageSyntheticsWithHttpInfo(
      OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageSynthetics");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSynthetics");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsResponse> localVarReturnType =
        new GenericType<UsageSyntheticsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSynthetics",
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
   * Get hourly usage for Synthetics Checks
   *
   * <p>See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSyntheticsResponse>>
      getUsageSyntheticsWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageSyntheticsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageSynthetics"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSynthetics");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsResponse> localVarReturnType =
        new GenericType<UsageSyntheticsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSynthetics",
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

  /** Manage optional parameters to getUsageSyntheticsAPI. */
  public static class GetUsageSyntheticsAPIOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageSyntheticsAPIOptionalParameters
     */
    public GetUsageSyntheticsAPIOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Synthetics API Checks
   *
   * <p>See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsAPIResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI(OffsetDateTime startHr)
      throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo(startHr, new GetUsageSyntheticsAPIOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics API Checks
   *
   * <p>See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageSyntheticsAPIResponse&gt;
   */
  public CompletableFuture<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIAsync(
      OffsetDateTime startHr) {
    return getUsageSyntheticsAPIWithHttpInfoAsync(
            startHr, new GetUsageSyntheticsAPIOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics API Checks
   *
   * <p>See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsAPIResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI(
      OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters)
      throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics API Checks
   *
   * <p>See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSyntheticsAPIResponse&gt;
   */
  public CompletableFuture<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIAsync(
      OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) {
    return getUsageSyntheticsAPIWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics API Checks
   *
   * <p>Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsAPIResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIWithHttpInfo(
      OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsAPI");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsAPIResponse> localVarReturnType =
        new GenericType<UsageSyntheticsAPIResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSyntheticsAPI",
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
   * Get hourly usage for Synthetics API Checks
   *
   * <p>See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsAPIResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSyntheticsAPIResponse>>
      getUsageSyntheticsAPIWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageSyntheticsAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsAPI");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsAPIResponse> localVarReturnType =
        new GenericType<UsageSyntheticsAPIResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSyntheticsAPI",
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

  /** Manage optional parameters to getUsageSyntheticsBrowser. */
  public static class GetUsageSyntheticsBrowserOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageSyntheticsBrowserOptionalParameters
     */
    public GetUsageSyntheticsBrowserOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsBrowserResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(OffsetDateTime startHr)
      throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo(
            startHr, new GetUsageSyntheticsBrowserOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageSyntheticsBrowserResponse&gt;
   */
  public CompletableFuture<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserAsync(
      OffsetDateTime startHr) {
    return getUsageSyntheticsBrowserWithHttpInfoAsync(
            startHr, new GetUsageSyntheticsBrowserOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsBrowserResponse
   * @throws ApiException if fails to make API call
   */
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(
      OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters)
      throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageSyntheticsBrowserResponse&gt;
   */
  public CompletableFuture<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserAsync(
      OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) {
    return getUsageSyntheticsBrowserWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>Get hourly usage for synthetics browser checks.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserWithHttpInfo(
      OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsBrowser");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsBrowserResponse> localVarReturnType =
        new GenericType<UsageSyntheticsBrowserResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageSyntheticsBrowser",
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
   * Get hourly usage for Synthetics Browser Checks
   *
   * <p>See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSyntheticsBrowserResponse>>
      getUsageSyntheticsBrowserWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageSyntheticsBrowserResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsBrowser");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageSyntheticsBrowserResponse> localVarReturnType =
        new GenericType<UsageSyntheticsBrowserResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageSyntheticsBrowser",
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

  /** Manage optional parameters to getUsageTimeseries. */
  public static class GetUsageTimeseriesOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageTimeseriesOptionalParameters
     */
    public GetUsageTimeseriesOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for custom metrics
   *
   * <p>See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageTimeseriesResponse getUsageTimeseries(OffsetDateTime startHr) throws ApiException {
    return getUsageTimeseriesWithHttpInfo(startHr, new GetUsageTimeseriesOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for custom metrics
   *
   * <p>See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageTimeseriesResponse&gt;
   */
  public CompletableFuture<UsageTimeseriesResponse> getUsageTimeseriesAsync(
      OffsetDateTime startHr) {
    return getUsageTimeseriesWithHttpInfoAsync(startHr, new GetUsageTimeseriesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for custom metrics
   *
   * <p>See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageTimeseriesResponse getUsageTimeseries(
      OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) throws ApiException {
    return getUsageTimeseriesWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for custom metrics
   *
   * <p>See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageTimeseriesResponse&gt;
   */
  public CompletableFuture<UsageTimeseriesResponse> getUsageTimeseriesAsync(
      OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) {
    return getUsageTimeseriesWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for custom metrics
   *
   * <p>Get hourly usage for [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTimeseriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageTimeseriesResponse> getUsageTimeseriesWithHttpInfo(
      OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageTimeseries");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTimeseries");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTimeseriesResponse> localVarReturnType =
        new GenericType<UsageTimeseriesResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageTimeseries",
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
   * Get hourly usage for custom metrics
   *
   * <p>See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageTimeseriesResponse>>
      getUsageTimeseriesWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageTimeseriesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startHr' when calling getUsageTimeseries"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTimeseries");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTimeseriesResponse> localVarReturnType =
        new GenericType<UsageTimeseriesResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageTimeseries",
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

  /** Manage optional parameters to getUsageTopAvgMetrics. */
  public static class GetUsageTopAvgMetricsOptionalParameters {
    private OffsetDateTime month;
    private OffsetDateTime day;
    private List<String> names;
    private Integer limit;
    private String nextRecordId;

    /**
     * Set month
     *
     * @param month Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage
     *     beginning at this hour. (Either month or day should be specified, but not both)
     *     (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters month(OffsetDateTime month) {
      this.month = month;
      return this;
    }

    /**
     * Set day
     *
     * @param day Datetime in ISO-8601 format, UTC, precise to day: [YYYY-MM-DD] for usage beginning
     *     at this hour. (Either month or day should be specified, but not both) (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters day(OffsetDateTime day) {
      this.day = day;
      return this;
    }

    /**
     * Set names
     *
     * @param names Comma-separated list of metric names. (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters names(List<String> names) {
      this.names = names;
      return this;
    }

    /**
     * Set limit
     *
     * @param limit Maximum number of results to return (between 1 and 5000) - defaults to 500
     *     results if limit not specified. (optional, default to 500)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set nextRecordId
     *
     * @param nextRecordId List following results with a next_record_id provided in the previous
     *     query. (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }
  }

  /**
   * Get all custom metrics by hourly average
   *
   * <p>See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @return UsageTopAvgMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics() throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(new GetUsageTopAvgMetricsOptionalParameters())
        .getData();
  }

  /**
   * Get all custom metrics by hourly average
   *
   * <p>See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;UsageTopAvgMetricsResponse&gt;
   */
  public CompletableFuture<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsAsync() {
    return getUsageTopAvgMetricsWithHttpInfoAsync(new GetUsageTopAvgMetricsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all custom metrics by hourly average
   *
   * <p>See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageTopAvgMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics(
      GetUsageTopAvgMetricsOptionalParameters parameters) throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all custom metrics by hourly average
   *
   * <p>See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageTopAvgMetricsResponse&gt;
   */
  public CompletableFuture<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsAsync(
      GetUsageTopAvgMetricsOptionalParameters parameters) {
    return getUsageTopAvgMetricsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all custom metrics by hourly average
   *
   * <p>Get all [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by
   * hourly average. Use the month parameter to get a month-to-date data resolution or use the day
   * parameter to get a daily resolution. One of the two is required, and only one of the two is
   * allowed.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTopAvgMetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsWithHttpInfo(
      GetUsageTopAvgMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    OffsetDateTime day = parameters.day;
    List<String> names = parameters.names;
    Integer limit = parameters.limit;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTopAvgMetrics");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTopAvgMetricsResponse> localVarReturnType =
        new GenericType<UsageTopAvgMetricsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageTopAvgMetrics",
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
   * Get all custom metrics by hourly average
   *
   * <p>See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageTopAvgMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageTopAvgMetricsResponse>>
      getUsageTopAvgMetricsWithHttpInfoAsync(GetUsageTopAvgMetricsOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    OffsetDateTime day = parameters.day;
    List<String> names = parameters.names;
    Integer limit = parameters.limit;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTopAvgMetrics");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTopAvgMetricsResponse> localVarReturnType =
        new GenericType<UsageTopAvgMetricsResponse>() {};

    return apiClient.invokeAPIAsync(
        "UsageMeteringApi.getUsageTopAvgMetrics",
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
}
