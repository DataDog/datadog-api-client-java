
package com.datadog.api.client.v1.api;

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
import com.datadog.api.client.v1.model.UsageCustomReportsResponse;
import com.datadog.api.client.v1.model.UsageSortDirection;
import com.datadog.api.client.v1.model.UsageSort;
import com.datadog.api.client.v1.model.UsageSpecifiedCustomReportsResponse;
import com.datadog.api.client.v1.model.UsageAnalyzedLogsResponse;
import com.datadog.api.client.v1.model.UsageAuditLogsResponse;
import com.datadog.api.client.v1.model.UsageLambdaResponse;
import com.datadog.api.client.v1.model.UsageBillableSummaryResponse;
import com.datadog.api.client.v1.model.UsageCIVisibilityResponse;
import com.datadog.api.client.v1.model.UsageCloudSecurityPostureManagementResponse;
import com.datadog.api.client.v1.model.UsageCWSResponse;
import com.datadog.api.client.v1.model.UsageDBMResponse;
import com.datadog.api.client.v1.model.UsageFargateResponse;
import com.datadog.api.client.v1.model.UsageHostsResponse;
import com.datadog.api.client.v1.model.HourlyUsageAttributionResponse;
import com.datadog.api.client.v1.model.HourlyUsageAttributionUsageType;
import com.datadog.api.client.v1.model.UsageIncidentManagementResponse;
import com.datadog.api.client.v1.model.UsageIndexedSpansResponse;
import com.datadog.api.client.v1.model.UsageIngestedSpansResponse;
import com.datadog.api.client.v1.model.UsageIoTResponse;
import com.datadog.api.client.v1.model.UsageLogsResponse;
import com.datadog.api.client.v1.model.UsageLogsByRetentionResponse;
import com.datadog.api.client.v1.model.UsageLogsByIndexResponse;
import com.datadog.api.client.v1.model.MonthlyUsageAttributionResponse;
import com.datadog.api.client.v1.model.MonthlyUsageAttributionSupportedMetrics;
import com.datadog.api.client.v1.model.UsageNetworkFlowsResponse;
import com.datadog.api.client.v1.model.UsageNetworkHostsResponse;
import com.datadog.api.client.v1.model.UsageOnlineArchiveResponse;
import com.datadog.api.client.v1.model.UsageProfilingResponse;
import com.datadog.api.client.v1.model.UsageRumUnitsResponse;
import com.datadog.api.client.v1.model.UsageRumSessionsResponse;
import com.datadog.api.client.v1.model.UsageSDSResponse;
import com.datadog.api.client.v1.model.UsageSNMPResponse;
import com.datadog.api.client.v1.model.UsageSummaryResponse;
import com.datadog.api.client.v1.model.UsageSyntheticsResponse;
import com.datadog.api.client.v1.model.UsageSyntheticsAPIResponse;
import com.datadog.api.client.v1.model.UsageSyntheticsBrowserResponse;
import com.datadog.api.client.v1.model.UsageTimeseriesResponse;
import com.datadog.api.client.v1.model.UsageTopAvgMetricsResponse;


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
   * Manage optional parameters to getDailyCustomReports.
   */
  public static class GetDailyCustomReportsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    /**
     * Set pageSize.
     * @param pageSize The number of files to return in the response. <code>[default=60]</code>. (optional)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber The identifier of the first page to return. This parameter is used for the pagination feature <code>[default=0]</code>. (optional)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir.
     * @param sortDir The direction to sort by: <code>[desc, asc]</code>. (optional, default to "desc")
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort.
     * @param sort The field to sort by: <code>[computed_on, size, start_date, end_date]</code>. (optional, default to "start_date")
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
 * Get the list of available daily custom reports.
 *
 * See {@link #getDailyCustomReportsWithHttpInfo}.
 *
 * @return UsageCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCustomReportsResponse getDailyCustomReports () throws ApiException {
    return getDailyCustomReportsWithHttpInfo(new GetDailyCustomReportsOptionalParameters()).getData();
  }

  /**
 * Get the list of available daily custom reports.
 *
 * See {@link #getDailyCustomReportsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCustomReportsResponse>getDailyCustomReportsAsync() {
    return getDailyCustomReportsWithHttpInfoAsync(new GetDailyCustomReportsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get the list of available daily custom reports.
 *
 * See {@link #getDailyCustomReportsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return UsageCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCustomReportsResponse getDailyCustomReports(GetDailyCustomReportsOptionalParameters parameters) throws ApiException {
    return getDailyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
 * Get the list of available daily custom reports.
 *
 * See {@link #getDailyCustomReportsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCustomReportsResponse>getDailyCustomReportsAsync(GetDailyCustomReportsOptionalParameters parameters) {
    return getDailyCustomReportsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get daily custom reports.
   * <strong>Note:</strong> This endpoint will be fully deprecated on December 1, 2022.
   * Refer to <a href="https://docs.datadoghq.com/account_management/guide/usage-attribution-migration/">Migrating from v1 to v2 of the Usage Attribution API</a> for the associated migration guide.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageCustomReportsResponse> getDailyCustomReportsWithHttpInfo(GetDailyCustomReportsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getDailyCustomReports", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCustomReportsResponse>() {});
  }

  /**
   * Get the list of available daily custom reports.
   *
   * See {@link #getDailyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCustomReportsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageCustomReportsResponse>> getDailyCustomReportsWithHttpInfoAsync(GetDailyCustomReportsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getDailyCustomReports", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageCustomReportsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCustomReportsResponse>() {});
  }

  /**
   * Manage optional parameters to getHourlyUsageAttribution.
   */
  public static class GetHourlyUsageAttributionOptionalParameters {
    private OffsetDateTime endHr;
    private String nextRecordId;
    private String tagBreakdownKeys;
    private Boolean includeDescendants;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set nextRecordId.
     * @param nextRecordId List following results with a next_record_id provided in the previous query. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }

    /**
     * Set tagBreakdownKeys.
     * @param tagBreakdownKeys Comma separated list of tags used to group usage. If no value is provided the usage will not be broken down by tags. To see which tags are available, look for the value of <code>tag_config_source</code> in the API response. (optional)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters tagBreakdownKeys(String tagBreakdownKeys) {
      this.tagBreakdownKeys = tagBreakdownKeys;
      return this;
    }

    /**
     * Set includeDescendants.
     * @param includeDescendants Include child org usage in the response. Defaults to <code>true</code>. (optional, default to true)
     * @return GetHourlyUsageAttributionOptionalParameters
     */
    public GetHourlyUsageAttributionOptionalParameters includeDescendants(Boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }
  }

  /**
 * Get hourly usage attribution.
 *
 * See {@link #getHourlyUsageAttributionWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
 * @return HourlyUsageAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public HourlyUsageAttributionResponse getHourlyUsageAttribution (OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType) throws ApiException {
    return getHourlyUsageAttributionWithHttpInfo( startHr,  usageType, new GetHourlyUsageAttributionOptionalParameters()).getData();
  }

  /**
 * Get hourly usage attribution.
 *
 * See {@link #getHourlyUsageAttributionWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
 * @return CompletableFuture&lt;HourlyUsageAttributionResponse&gt;
 */
  public CompletableFuture<HourlyUsageAttributionResponse>getHourlyUsageAttributionAsync(OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType) {
    return getHourlyUsageAttributionWithHttpInfoAsync(startHr, usageType, new GetHourlyUsageAttributionOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage attribution.
 *
 * See {@link #getHourlyUsageAttributionWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return HourlyUsageAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public HourlyUsageAttributionResponse getHourlyUsageAttribution(OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType, GetHourlyUsageAttributionOptionalParameters parameters) throws ApiException {
    return getHourlyUsageAttributionWithHttpInfo(startHr, usageType, parameters).getData();
  }

  /**
 * Get hourly usage attribution.
 *
 * See {@link #getHourlyUsageAttributionWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;HourlyUsageAttributionResponse&gt;
 */
  public CompletableFuture<HourlyUsageAttributionResponse>getHourlyUsageAttributionAsync( OffsetDateTime startHr,  HourlyUsageAttributionUsageType usageType, GetHourlyUsageAttributionOptionalParameters parameters) {
    return getHourlyUsageAttributionWithHttpInfoAsync(startHr, usageType, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage attribution. Multi-region data is available starting March 1, 2023.</p>
   * <p>This API endpoint is paginated. To make sure you receive all records, check if the value of <code>next_record_id</code> is
   * set in the response. If it is, make another request and pass <code>next_record_id</code> as a parameter.
   * Pseudo code example:</p>
   * <p><code>response := GetHourlyUsageAttribution(start_month)
   * cursor := response.metadata.pagination.next_record_id
   * WHILE cursor != null BEGIN
   *   sleep(5 seconds)  # Avoid running into rate limit
   *   response := GetHourlyUsageAttribution(start_month, next_record_id=cursor)
   *   cursor := response.metadata.pagination.next_record_id
   * END</code>
   * The following values have been <strong>deprecated</strong>:
   *     <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HourlyUsageAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HourlyUsageAttributionResponse> getHourlyUsageAttributionWithHttpInfo(OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType, GetHourlyUsageAttributionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getHourlyUsageAttribution");
    }

    // verify the required parameter 'usageType' is set
    if (usageType == null) {
      throw new ApiException(400, "Missing the required parameter 'usageType' when calling getHourlyUsageAttribution");
    }
    OffsetDateTime endHr = parameters.endHr;
    String nextRecordId = parameters.nextRecordId;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hourly-attribution";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usage_type", usageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_descendants", includeDescendants));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getHourlyUsageAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<HourlyUsageAttributionResponse>() {});
  }

  /**
   * Get hourly usage attribution.
   *
   * See {@link #getHourlyUsageAttributionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param usageType Usage type to retrieve. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_ingested_spans_usage</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HourlyUsageAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> getHourlyUsageAttributionWithHttpInfoAsync(OffsetDateTime startHr, HourlyUsageAttributionUsageType usageType, GetHourlyUsageAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getHourlyUsageAttribution"));
        return result;
    }

    // verify the required parameter 'usageType' is set
    if (usageType == null) {
        CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'usageType' when calling getHourlyUsageAttribution"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    String nextRecordId = parameters.nextRecordId;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hourly-attribution";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usage_type", usageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_breakdown_keys", tagBreakdownKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_descendants", includeDescendants));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getHourlyUsageAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HourlyUsageAttributionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<HourlyUsageAttributionResponse>() {});
  }

  /**
   * Manage optional parameters to getIncidentManagement.
   */
  public static class GetIncidentManagementOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetIncidentManagementOptionalParameters
     */
    public GetIncidentManagementOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for incident management.
 *
 * See {@link #getIncidentManagementWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageIncidentManagementResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIncidentManagementResponse getIncidentManagement (OffsetDateTime startHr) throws ApiException {
    return getIncidentManagementWithHttpInfo( startHr, new GetIncidentManagementOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for incident management.
 *
 * See {@link #getIncidentManagementWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageIncidentManagementResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIncidentManagementResponse>getIncidentManagementAsync(OffsetDateTime startHr) {
    return getIncidentManagementWithHttpInfoAsync(startHr, new GetIncidentManagementOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for incident management.
 *
 * See {@link #getIncidentManagementWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageIncidentManagementResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIncidentManagementResponse getIncidentManagement(OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) throws ApiException {
    return getIncidentManagementWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for incident management.
 *
 * See {@link #getIncidentManagementWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageIncidentManagementResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIncidentManagementResponse>getIncidentManagementAsync( OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) {
    return getIncidentManagementWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for incident management.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIncidentManagementResponse&gt;
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
  public ApiResponse<UsageIncidentManagementResponse> getIncidentManagementWithHttpInfo(OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getIncidentManagement");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/incident-management";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getIncidentManagement", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIncidentManagementResponse>() {});
  }

  /**
   * Get hourly usage for incident management.
   *
   * See {@link #getIncidentManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIncidentManagementResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageIncidentManagementResponse>> getIncidentManagementWithHttpInfoAsync(OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageIncidentManagementResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getIncidentManagement"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/incident-management";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getIncidentManagement", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageIncidentManagementResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIncidentManagementResponse>() {});
  }

  /**
   * Manage optional parameters to getIngestedSpans.
   */
  public static class GetIngestedSpansOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetIngestedSpansOptionalParameters
     */
    public GetIngestedSpansOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for ingested spans.
 *
 * See {@link #getIngestedSpansWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageIngestedSpansResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIngestedSpansResponse getIngestedSpans (OffsetDateTime startHr) throws ApiException {
    return getIngestedSpansWithHttpInfo( startHr, new GetIngestedSpansOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for ingested spans.
 *
 * See {@link #getIngestedSpansWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageIngestedSpansResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIngestedSpansResponse>getIngestedSpansAsync(OffsetDateTime startHr) {
    return getIngestedSpansWithHttpInfoAsync(startHr, new GetIngestedSpansOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for ingested spans.
 *
 * See {@link #getIngestedSpansWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageIngestedSpansResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIngestedSpansResponse getIngestedSpans(OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) throws ApiException {
    return getIngestedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for ingested spans.
 *
 * See {@link #getIngestedSpansWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageIngestedSpansResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIngestedSpansResponse>getIngestedSpansAsync( OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) {
    return getIngestedSpansWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for ingested spans.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIngestedSpansResponse&gt;
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
  public ApiResponse<UsageIngestedSpansResponse> getIngestedSpansWithHttpInfo(OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getIngestedSpans");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ingested-spans";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getIngestedSpans", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIngestedSpansResponse>() {});
  }

  /**
   * Get hourly usage for ingested spans.
   *
   * See {@link #getIngestedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIngestedSpansResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageIngestedSpansResponse>> getIngestedSpansWithHttpInfoAsync(OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageIngestedSpansResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getIngestedSpans"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ingested-spans";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getIngestedSpans", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageIngestedSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIngestedSpansResponse>() {});
  }

  /**
   * Manage optional parameters to getMonthlyCustomReports.
   */
  public static class GetMonthlyCustomReportsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    /**
     * Set pageSize.
     * @param pageSize The number of files to return in the response <code>[default=60].</code> (optional)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber The identifier of the first page to return. This parameter is used for the pagination feature <code>[default=0]</code>. (optional)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir.
     * @param sortDir The direction to sort by: <code>[desc, asc]</code>. (optional, default to "desc")
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort.
     * @param sort The field to sort by: <code>[computed_on, size, start_date, end_date]</code>. (optional, default to "start_date")
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
 * Get the list of available monthly custom reports.
 *
 * See {@link #getMonthlyCustomReportsWithHttpInfo}.
 *
 * @return UsageCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCustomReportsResponse getMonthlyCustomReports () throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(new GetMonthlyCustomReportsOptionalParameters()).getData();
  }

  /**
 * Get the list of available monthly custom reports.
 *
 * See {@link #getMonthlyCustomReportsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCustomReportsResponse>getMonthlyCustomReportsAsync() {
    return getMonthlyCustomReportsWithHttpInfoAsync(new GetMonthlyCustomReportsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get the list of available monthly custom reports.
 *
 * See {@link #getMonthlyCustomReportsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return UsageCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCustomReportsResponse getMonthlyCustomReports(GetMonthlyCustomReportsOptionalParameters parameters) throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
 * Get the list of available monthly custom reports.
 *
 * See {@link #getMonthlyCustomReportsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCustomReportsResponse>getMonthlyCustomReportsAsync(GetMonthlyCustomReportsOptionalParameters parameters) {
    return getMonthlyCustomReportsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get monthly custom reports.
   * <strong>Note:</strong> This endpoint will be fully deprecated on December 1, 2022.
   * Refer to <a href="https://docs.datadoghq.com/account_management/guide/usage-attribution-migration/">Migrating from v1 to v2 of the Usage Attribution API</a> for the associated migration guide.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageCustomReportsResponse> getMonthlyCustomReportsWithHttpInfo(GetMonthlyCustomReportsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getMonthlyCustomReports", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCustomReportsResponse>() {});
  }

  /**
   * Get the list of available monthly custom reports.
   *
   * See {@link #getMonthlyCustomReportsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCustomReportsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageCustomReportsResponse>> getMonthlyCustomReportsWithHttpInfoAsync(GetMonthlyCustomReportsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    UsageSortDirection sortDir = parameters.sortDir;
    UsageSort sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getMonthlyCustomReports", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageCustomReportsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCustomReportsResponse>() {});
  }

  /**
   * Manage optional parameters to getMonthlyUsageAttribution.
   */
  public static class GetMonthlyUsageAttributionOptionalParameters {
    private OffsetDateTime endMonth;
    private UsageSortDirection sortDirection;
    private MonthlyUsageAttributionSupportedMetrics sortName;
    private String tagBreakdownKeys;
    private String nextRecordId;
    private Boolean includeDescendants;

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage ending this month. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set sortDirection.
     * @param sortDirection The direction to sort by: <code>[desc, asc]</code>. (optional, default to "desc")
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters sortDirection(UsageSortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName.
     * @param sortName The field to sort by. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters sortName(MonthlyUsageAttributionSupportedMetrics sortName) {
      this.sortName = sortName;
      return this;
    }

    /**
     * Set tagBreakdownKeys.
     * @param tagBreakdownKeys Comma separated list of tag keys used to group usage. If no value is provided the usage will not be broken down by tags. To see which tags are available, look for the value of <code>tag_config_source</code> in the API response. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters tagBreakdownKeys(String tagBreakdownKeys) {
      this.tagBreakdownKeys = tagBreakdownKeys;
      return this;
    }

    /**
     * Set nextRecordId.
     * @param nextRecordId List following results with a next_record_id provided in the previous query. (optional)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }

    /**
     * Set includeDescendants.
     * @param includeDescendants Include child org usage in the response. Defaults to <code>true</code>. (optional, default to true)
     * @return GetMonthlyUsageAttributionOptionalParameters
     */
    public GetMonthlyUsageAttributionOptionalParameters includeDescendants(Boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }
  }

  /**
 * Get monthly usage attribution.
 *
 * See {@link #getMonthlyUsageAttributionWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
 * @return MonthlyUsageAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public MonthlyUsageAttributionResponse getMonthlyUsageAttribution (OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields) throws ApiException {
    return getMonthlyUsageAttributionWithHttpInfo( startMonth,  fields, new GetMonthlyUsageAttributionOptionalParameters()).getData();
  }

  /**
 * Get monthly usage attribution.
 *
 * See {@link #getMonthlyUsageAttributionWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
 * @return CompletableFuture&lt;MonthlyUsageAttributionResponse&gt;
 */
  public CompletableFuture<MonthlyUsageAttributionResponse>getMonthlyUsageAttributionAsync(OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields) {
    return getMonthlyUsageAttributionWithHttpInfoAsync(startMonth, fields, new GetMonthlyUsageAttributionOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get monthly usage attribution.
 *
 * See {@link #getMonthlyUsageAttributionWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return MonthlyUsageAttributionResponse
 * @throws ApiException if fails to make API call
 */
  public MonthlyUsageAttributionResponse getMonthlyUsageAttribution(OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields, GetMonthlyUsageAttributionOptionalParameters parameters) throws ApiException {
    return getMonthlyUsageAttributionWithHttpInfo(startMonth, fields, parameters).getData();
  }

  /**
 * Get monthly usage attribution.
 *
 * See {@link #getMonthlyUsageAttributionWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;MonthlyUsageAttributionResponse&gt;
 */
  public CompletableFuture<MonthlyUsageAttributionResponse>getMonthlyUsageAttributionAsync( OffsetDateTime startMonth,  MonthlyUsageAttributionSupportedMetrics fields, GetMonthlyUsageAttributionOptionalParameters parameters) {
    return getMonthlyUsageAttributionWithHttpInfoAsync(startMonth, fields, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get monthly usage attribution. Multi-region data is available starting March 1, 2023.</p>
   * <p>This API endpoint is paginated. To make sure you receive all records, check if the value of <code>next_record_id</code> is
   * set in the response. If it is, make another request and pass <code>next_record_id</code> as a parameter.
   * Pseudo code example:</p>
   * <p><code>response := GetMonthlyUsageAttribution(start_month)
   * cursor := response.metadata.pagination.next_record_id
   * WHILE cursor != null BEGIN
   *   sleep(5 seconds)  # Avoid running into rate limit
   *   response := GetMonthlyUsageAttribution(start_month, next_record_id=cursor)
   *   cursor := response.metadata.pagination.next_record_id
   * END</code></p>
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonthlyUsageAttributionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonthlyUsageAttributionResponse> getMonthlyUsageAttributionWithHttpInfo(OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields, GetMonthlyUsageAttributionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getMonthlyUsageAttribution");
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(400, "Missing the required parameter 'fields' when calling getMonthlyUsageAttribution");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    MonthlyUsageAttributionSupportedMetrics sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v1/usage/monthly-attribution";

    
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

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getMonthlyUsageAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MonthlyUsageAttributionResponse>() {});
  }

  /**
   * Get monthly usage attribution.
   *
   * See {@link #getMonthlyUsageAttributionWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or <code>*</code> for all usage types. The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>, <code>llm_observability_usage</code>, <code>llm_observability_percentage</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonthlyUsageAttributionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> getMonthlyUsageAttributionWithHttpInfoAsync(OffsetDateTime startMonth, MonthlyUsageAttributionSupportedMetrics fields, GetMonthlyUsageAttributionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
        CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startMonth' when calling getMonthlyUsageAttribution"));
        return result;
    }

    // verify the required parameter 'fields' is set
    if (fields == null) {
        CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'fields' when calling getMonthlyUsageAttribution"));
        return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    UsageSortDirection sortDirection = parameters.sortDirection;
    MonthlyUsageAttributionSupportedMetrics sortName = parameters.sortName;
    String tagBreakdownKeys = parameters.tagBreakdownKeys;
    String nextRecordId = parameters.nextRecordId;
    Boolean includeDescendants = parameters.includeDescendants;
    // create path and map variables
    String localVarPath = "/api/v1/usage/monthly-attribution";

    
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
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getMonthlyUsageAttribution", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonthlyUsageAttributionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MonthlyUsageAttributionResponse>() {});
  }

  /**
 * Get specified daily custom reports.
 *
 * See {@link #getSpecifiedDailyCustomReportsWithHttpInfo}.
 *
 * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
 * @return UsageSpecifiedCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSpecifiedCustomReportsResponse  getSpecifiedDailyCustomReports(String reportId) throws ApiException {
    return getSpecifiedDailyCustomReportsWithHttpInfo(reportId).getData();
  }

  /**
 * Get specified daily custom reports.
 *
 * See {@link #getSpecifiedDailyCustomReportsWithHttpInfoAsync}.
 *
 * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
 * @return CompletableFuture&lt;UsageSpecifiedCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSpecifiedCustomReportsResponse>getSpecifiedDailyCustomReportsAsync(String reportId) {
    return getSpecifiedDailyCustomReportsWithHttpInfoAsync(reportId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get specified daily custom reports.
   * <strong>Note:</strong> This endpoint will be fully deprecated on December 1, 2022.
   * Refer to <a href="https://docs.datadoghq.com/account_management/guide/usage-attribution-migration/">Migrating from v1 to v2 of the Usage Attribution API</a> for the associated migration guide.</p>
   *
   * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageSpecifiedCustomReportsResponse> getSpecifiedDailyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedDailyCustomReports");
    }
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getSpecifiedDailyCustomReports", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSpecifiedCustomReportsResponse>() {});
  }

  /**
   * Get specified daily custom reports.
   *
   * See {@link #getSpecifiedDailyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> getSpecifiedDailyCustomReportsWithHttpInfoAsync(String reportId) {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
        CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedDailyCustomReports"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getSpecifiedDailyCustomReports", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSpecifiedCustomReportsResponse>() {});
  }

  /**
 * Get specified monthly custom reports.
 *
 * See {@link #getSpecifiedMonthlyCustomReportsWithHttpInfo}.
 *
 * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
 * @return UsageSpecifiedCustomReportsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSpecifiedCustomReportsResponse  getSpecifiedMonthlyCustomReports(String reportId) throws ApiException {
    return getSpecifiedMonthlyCustomReportsWithHttpInfo(reportId).getData();
  }

  /**
 * Get specified monthly custom reports.
 *
 * See {@link #getSpecifiedMonthlyCustomReportsWithHttpInfoAsync}.
 *
 * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
 * @return CompletableFuture&lt;UsageSpecifiedCustomReportsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSpecifiedCustomReportsResponse>getSpecifiedMonthlyCustomReportsAsync(String reportId) {
    return getSpecifiedMonthlyCustomReportsWithHttpInfoAsync(reportId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get specified monthly custom reports.
   * <strong>Note:</strong> This endpoint will be fully deprecated on December 1, 2022.
   * Refer to <a href="https://docs.datadoghq.com/account_management/guide/usage-attribution-migration/">Migrating from v1 to v2 of the Usage Attribution API</a> for the associated migration guide.</p>
   *
   * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageSpecifiedCustomReportsResponse> getSpecifiedMonthlyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedMonthlyCustomReports");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getSpecifiedMonthlyCustomReports", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSpecifiedCustomReportsResponse>() {});
  }

  /**
   * Get specified monthly custom reports.
   *
   * See {@link #getSpecifiedMonthlyCustomReportsWithHttpInfo}.
   *
   * @param reportId Date of the report in the format <code>YYYY-MM-DD</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> getSpecifiedMonthlyCustomReportsWithHttpInfoAsync(String reportId) {
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
        CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedMonthlyCustomReports"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getSpecifiedMonthlyCustomReports", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSpecifiedCustomReportsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSpecifiedCustomReportsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageAnalyzedLogs.
   */
  public static class GetUsageAnalyzedLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageAnalyzedLogsOptionalParameters
     */
    public GetUsageAnalyzedLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for analyzed logs.
 *
 * See {@link #getUsageAnalyzedLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageAnalyzedLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs (OffsetDateTime startHr) throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo( startHr, new GetUsageAnalyzedLogsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for analyzed logs.
 *
 * See {@link #getUsageAnalyzedLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageAnalyzedLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageAnalyzedLogsResponse>getUsageAnalyzedLogsAsync(OffsetDateTime startHr) {
    return getUsageAnalyzedLogsWithHttpInfoAsync(startHr, new GetUsageAnalyzedLogsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for analyzed logs.
 *
 * See {@link #getUsageAnalyzedLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageAnalyzedLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs(OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for analyzed logs.
 *
 * See {@link #getUsageAnalyzedLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageAnalyzedLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageAnalyzedLogsResponse>getUsageAnalyzedLogsAsync( OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) {
    return getUsageAnalyzedLogsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for analyzed logs (Security Monitoring).
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageAnalyzedLogsResponse&gt;
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
  public ApiResponse<UsageAnalyzedLogsResponse> getUsageAnalyzedLogsWithHttpInfo(OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageAnalyzedLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/analyzed_logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageAnalyzedLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageAnalyzedLogsResponse>() {});
  }

  /**
   * Get hourly usage for analyzed logs.
   *
   * See {@link #getUsageAnalyzedLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageAnalyzedLogsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageAnalyzedLogsResponse>> getUsageAnalyzedLogsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageAnalyzedLogsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageAnalyzedLogs"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/analyzed_logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageAnalyzedLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageAnalyzedLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageAnalyzedLogsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageAuditLogs.
   */
  public static class GetUsageAuditLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageAuditLogsOptionalParameters
     */
    public GetUsageAuditLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for audit logs.
 *
 * See {@link #getUsageAuditLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageAuditLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageAuditLogsResponse getUsageAuditLogs (OffsetDateTime startHr) throws ApiException {
    return getUsageAuditLogsWithHttpInfo( startHr, new GetUsageAuditLogsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for audit logs.
 *
 * See {@link #getUsageAuditLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageAuditLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageAuditLogsResponse>getUsageAuditLogsAsync(OffsetDateTime startHr) {
    return getUsageAuditLogsWithHttpInfoAsync(startHr, new GetUsageAuditLogsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for audit logs.
 *
 * See {@link #getUsageAuditLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageAuditLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageAuditLogsResponse getUsageAuditLogs(OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) throws ApiException {
    return getUsageAuditLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for audit logs.
 *
 * See {@link #getUsageAuditLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageAuditLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageAuditLogsResponse>getUsageAuditLogsAsync( OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) {
    return getUsageAuditLogsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for audit logs.
   * <strong>Note:</strong> This endpoint has been deprecated.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageAuditLogsResponse&gt;
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
  public ApiResponse<UsageAuditLogsResponse> getUsageAuditLogsWithHttpInfo(OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageAuditLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/audit_logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageAuditLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageAuditLogsResponse>() {});
  }

  /**
   * Get hourly usage for audit logs.
   *
   * See {@link #getUsageAuditLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageAuditLogsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageAuditLogsResponse>> getUsageAuditLogsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageAuditLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageAuditLogsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageAuditLogs"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/audit_logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageAuditLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageAuditLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageAuditLogsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageBillableSummary.
   */
  public static class GetUsageBillableSummaryOptionalParameters {
    private OffsetDateTime month;
    private Boolean includeConnectedAccounts;

    /**
     * Set month.
     * @param month Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage starting this month. (optional)
     * @return GetUsageBillableSummaryOptionalParameters
     */
    public GetUsageBillableSummaryOptionalParameters month(OffsetDateTime month) {
      this.month = month;
      return this;
    }

    /**
     * Set includeConnectedAccounts.
     * @param includeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to <code>false</code>.  (optional, default to false)
     * @return GetUsageBillableSummaryOptionalParameters
     */
    public GetUsageBillableSummaryOptionalParameters includeConnectedAccounts(Boolean includeConnectedAccounts) {
      this.includeConnectedAccounts = includeConnectedAccounts;
      return this;
    }
  }

  /**
 * Get billable usage across your account.
 *
 * See {@link #getUsageBillableSummaryWithHttpInfo}.
 *
 * @return UsageBillableSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public UsageBillableSummaryResponse getUsageBillableSummary () throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(new GetUsageBillableSummaryOptionalParameters()).getData();
  }

  /**
 * Get billable usage across your account.
 *
 * See {@link #getUsageBillableSummaryWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;UsageBillableSummaryResponse&gt;
 */
  public CompletableFuture<UsageBillableSummaryResponse>getUsageBillableSummaryAsync() {
    return getUsageBillableSummaryWithHttpInfoAsync(new GetUsageBillableSummaryOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get billable usage across your account.
 *
 * See {@link #getUsageBillableSummaryWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return UsageBillableSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public UsageBillableSummaryResponse getUsageBillableSummary(GetUsageBillableSummaryOptionalParameters parameters) throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(parameters).getData();
  }

  /**
 * Get billable usage across your account.
 *
 * See {@link #getUsageBillableSummaryWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageBillableSummaryResponse&gt;
 */
  public CompletableFuture<UsageBillableSummaryResponse>getUsageBillableSummaryAsync(GetUsageBillableSummaryOptionalParameters parameters) {
    return getUsageBillableSummaryWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get billable usage across your account.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageBillableSummaryResponse&gt;
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
  public ApiResponse<UsageBillableSummaryResponse> getUsageBillableSummaryWithHttpInfo(GetUsageBillableSummaryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v1/usage/billable-summary";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageBillableSummary", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageBillableSummaryResponse>() {});
  }

  /**
   * Get billable usage across your account.
   *
   * See {@link #getUsageBillableSummaryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageBillableSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageBillableSummaryResponse>> getUsageBillableSummaryWithHttpInfoAsync(GetUsageBillableSummaryOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v1/usage/billable-summary";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageBillableSummary", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageBillableSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageBillableSummaryResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageCIApp.
   */
  public static class GetUsageCIAppOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageCIAppOptionalParameters
     */
    public GetUsageCIAppOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for CI visibility.
 *
 * See {@link #getUsageCIAppWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageCIVisibilityResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCIVisibilityResponse getUsageCIApp (OffsetDateTime startHr) throws ApiException {
    return getUsageCIAppWithHttpInfo( startHr, new GetUsageCIAppOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for CI visibility.
 *
 * See {@link #getUsageCIAppWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageCIVisibilityResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCIVisibilityResponse>getUsageCIAppAsync(OffsetDateTime startHr) {
    return getUsageCIAppWithHttpInfoAsync(startHr, new GetUsageCIAppOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for CI visibility.
 *
 * See {@link #getUsageCIAppWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageCIVisibilityResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCIVisibilityResponse getUsageCIApp(OffsetDateTime startHr, GetUsageCIAppOptionalParameters parameters) throws ApiException {
    return getUsageCIAppWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for CI visibility.
 *
 * See {@link #getUsageCIAppWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageCIVisibilityResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCIVisibilityResponse>getUsageCIAppAsync( OffsetDateTime startHr, GetUsageCIAppOptionalParameters parameters) {
    return getUsageCIAppWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for CI visibility (tests, pipeline, and spans).
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCIVisibilityResponse&gt;
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
  public ApiResponse<UsageCIVisibilityResponse> getUsageCIAppWithHttpInfo(OffsetDateTime startHr, GetUsageCIAppOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCIApp");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ci-app";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCIApp", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCIVisibilityResponse>() {});
  }

  /**
   * Get hourly usage for CI visibility.
   *
   * See {@link #getUsageCIAppWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCIVisibilityResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageCIVisibilityResponse>> getUsageCIAppWithHttpInfoAsync(OffsetDateTime startHr, GetUsageCIAppOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageCIVisibilityResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCIApp"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/ci-app";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCIApp", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageCIVisibilityResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCIVisibilityResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageCloudSecurityPostureManagement.
   */
  public static class GetUsageCloudSecurityPostureManagementOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageCloudSecurityPostureManagementOptionalParameters
     */
    public GetUsageCloudSecurityPostureManagementOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for CSM Pro.
 *
 * See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageCloudSecurityPostureManagementResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCloudSecurityPostureManagementResponse getUsageCloudSecurityPostureManagement (OffsetDateTime startHr) throws ApiException {
    return getUsageCloudSecurityPostureManagementWithHttpInfo( startHr, new GetUsageCloudSecurityPostureManagementOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for CSM Pro.
 *
 * See {@link #getUsageCloudSecurityPostureManagementWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageCloudSecurityPostureManagementResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCloudSecurityPostureManagementResponse>getUsageCloudSecurityPostureManagementAsync(OffsetDateTime startHr) {
    return getUsageCloudSecurityPostureManagementWithHttpInfoAsync(startHr, new GetUsageCloudSecurityPostureManagementOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for CSM Pro.
 *
 * See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageCloudSecurityPostureManagementResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCloudSecurityPostureManagementResponse getUsageCloudSecurityPostureManagement(OffsetDateTime startHr, GetUsageCloudSecurityPostureManagementOptionalParameters parameters) throws ApiException {
    return getUsageCloudSecurityPostureManagementWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for CSM Pro.
 *
 * See {@link #getUsageCloudSecurityPostureManagementWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageCloudSecurityPostureManagementResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCloudSecurityPostureManagementResponse>getUsageCloudSecurityPostureManagementAsync( OffsetDateTime startHr, GetUsageCloudSecurityPostureManagementOptionalParameters parameters) {
    return getUsageCloudSecurityPostureManagementWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for cloud security management (CSM) pro.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCloudSecurityPostureManagementResponse&gt;
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
  public ApiResponse<UsageCloudSecurityPostureManagementResponse> getUsageCloudSecurityPostureManagementWithHttpInfo(OffsetDateTime startHr, GetUsageCloudSecurityPostureManagementOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCloudSecurityPostureManagement");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cspm";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCloudSecurityPostureManagement", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCloudSecurityPostureManagementResponse>() {});
  }

  /**
   * Get hourly usage for CSM Pro.
   *
   * See {@link #getUsageCloudSecurityPostureManagementWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCloudSecurityPostureManagementResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageCloudSecurityPostureManagementResponse>> getUsageCloudSecurityPostureManagementWithHttpInfoAsync(OffsetDateTime startHr, GetUsageCloudSecurityPostureManagementOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageCloudSecurityPostureManagementResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCloudSecurityPostureManagement"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cspm";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCloudSecurityPostureManagement", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageCloudSecurityPostureManagementResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCloudSecurityPostureManagementResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageCWS.
   */
  public static class GetUsageCWSOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageCWSOptionalParameters
     */
    public GetUsageCWSOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for cloud workload security.
 *
 * See {@link #getUsageCWSWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageCWSResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCWSResponse getUsageCWS (OffsetDateTime startHr) throws ApiException {
    return getUsageCWSWithHttpInfo( startHr, new GetUsageCWSOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for cloud workload security.
 *
 * See {@link #getUsageCWSWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageCWSResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCWSResponse>getUsageCWSAsync(OffsetDateTime startHr) {
    return getUsageCWSWithHttpInfoAsync(startHr, new GetUsageCWSOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for cloud workload security.
 *
 * See {@link #getUsageCWSWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageCWSResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageCWSResponse getUsageCWS(OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) throws ApiException {
    return getUsageCWSWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for cloud workload security.
 *
 * See {@link #getUsageCWSWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageCWSResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageCWSResponse>getUsageCWSAsync( OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) {
    return getUsageCWSWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for cloud workload security.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCWSResponse&gt;
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
  public ApiResponse<UsageCWSResponse> getUsageCWSWithHttpInfo(OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCWS");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cws";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCWS", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCWSResponse>() {});
  }

  /**
   * Get hourly usage for cloud workload security.
   *
   * See {@link #getUsageCWSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageCWSResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageCWSResponse>> getUsageCWSWithHttpInfoAsync(OffsetDateTime startHr, GetUsageCWSOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageCWSResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageCWS"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/cws";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageCWS", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageCWSResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageCWSResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageDBM.
   */
  public static class GetUsageDBMOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageDBMOptionalParameters
     */
    public GetUsageDBMOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for database monitoring.
 *
 * See {@link #getUsageDBMWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageDBMResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageDBMResponse getUsageDBM (OffsetDateTime startHr) throws ApiException {
    return getUsageDBMWithHttpInfo( startHr, new GetUsageDBMOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for database monitoring.
 *
 * See {@link #getUsageDBMWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageDBMResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageDBMResponse>getUsageDBMAsync(OffsetDateTime startHr) {
    return getUsageDBMWithHttpInfoAsync(startHr, new GetUsageDBMOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for database monitoring.
 *
 * See {@link #getUsageDBMWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageDBMResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageDBMResponse getUsageDBM(OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) throws ApiException {
    return getUsageDBMWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for database monitoring.
 *
 * See {@link #getUsageDBMWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageDBMResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageDBMResponse>getUsageDBMAsync( OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) {
    return getUsageDBMWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for database monitoring
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageDBMResponse&gt;
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
  public ApiResponse<UsageDBMResponse> getUsageDBMWithHttpInfo(OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageDBM");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/dbm";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageDBM", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageDBMResponse>() {});
  }

  /**
   * Get hourly usage for database monitoring.
   *
   * See {@link #getUsageDBMWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageDBMResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageDBMResponse>> getUsageDBMWithHttpInfoAsync(OffsetDateTime startHr, GetUsageDBMOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageDBMResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageDBM"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/dbm";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageDBM", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageDBMResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageDBMResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageFargate.
   */
  public static class GetUsageFargateOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageFargateOptionalParameters
     */
    public GetUsageFargateOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for Fargate.
 *
 * See {@link #getUsageFargateWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageFargateResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageFargateResponse getUsageFargate (OffsetDateTime startHr) throws ApiException {
    return getUsageFargateWithHttpInfo( startHr, new GetUsageFargateOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for Fargate.
 *
 * See {@link #getUsageFargateWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageFargateResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageFargateResponse>getUsageFargateAsync(OffsetDateTime startHr) {
    return getUsageFargateWithHttpInfoAsync(startHr, new GetUsageFargateOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for Fargate.
 *
 * See {@link #getUsageFargateWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageFargateResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageFargateResponse getUsageFargate(OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) throws ApiException {
    return getUsageFargateWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for Fargate.
 *
 * See {@link #getUsageFargateWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageFargateResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageFargateResponse>getUsageFargateAsync( OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) {
    return getUsageFargateWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/integrations/ecs_fargate/">Fargate</a>.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageFargateResponse&gt;
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
  public ApiResponse<UsageFargateResponse> getUsageFargateWithHttpInfo(OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageFargate");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageFargate", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageFargateResponse>() {});
  }

  /**
   * Get hourly usage for Fargate.
   *
   * See {@link #getUsageFargateWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageFargateResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageFargateResponse>> getUsageFargateWithHttpInfoAsync(OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageFargateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageFargate"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageFargate", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageFargateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageFargateResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageHosts.
   */
  public static class GetUsageHostsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageHostsOptionalParameters
     */
    public GetUsageHostsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for hosts and containers.
 *
 * See {@link #getUsageHostsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageHostsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageHostsResponse getUsageHosts (OffsetDateTime startHr) throws ApiException {
    return getUsageHostsWithHttpInfo( startHr, new GetUsageHostsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for hosts and containers.
 *
 * See {@link #getUsageHostsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageHostsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageHostsResponse>getUsageHostsAsync(OffsetDateTime startHr) {
    return getUsageHostsWithHttpInfoAsync(startHr, new GetUsageHostsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for hosts and containers.
 *
 * See {@link #getUsageHostsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageHostsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageHostsResponse getUsageHosts(OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) throws ApiException {
    return getUsageHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for hosts and containers.
 *
 * See {@link #getUsageHostsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageHostsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageHostsResponse>getUsageHostsAsync( OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) {
    return getUsageHostsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for hosts and containers.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageHostsResponse&gt;
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
  public ApiResponse<UsageHostsResponse> getUsageHostsWithHttpInfo(OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageHosts");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageHosts", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageHostsResponse>() {});
  }

  /**
   * Get hourly usage for hosts and containers.
   *
   * See {@link #getUsageHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageHostsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageHostsResponse>> getUsageHostsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageHostsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageHosts"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageHosts", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageHostsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageIndexedSpans.
   */
  public static class GetUsageIndexedSpansOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageIndexedSpansOptionalParameters
     */
    public GetUsageIndexedSpansOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for indexed spans.
 *
 * See {@link #getUsageIndexedSpansWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageIndexedSpansResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIndexedSpansResponse getUsageIndexedSpans (OffsetDateTime startHr) throws ApiException {
    return getUsageIndexedSpansWithHttpInfo( startHr, new GetUsageIndexedSpansOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for indexed spans.
 *
 * See {@link #getUsageIndexedSpansWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageIndexedSpansResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIndexedSpansResponse>getUsageIndexedSpansAsync(OffsetDateTime startHr) {
    return getUsageIndexedSpansWithHttpInfoAsync(startHr, new GetUsageIndexedSpansOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for indexed spans.
 *
 * See {@link #getUsageIndexedSpansWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageIndexedSpansResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIndexedSpansResponse getUsageIndexedSpans(OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) throws ApiException {
    return getUsageIndexedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for indexed spans.
 *
 * See {@link #getUsageIndexedSpansWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageIndexedSpansResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIndexedSpansResponse>getUsageIndexedSpansAsync( OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) {
    return getUsageIndexedSpansWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for indexed spans.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIndexedSpansResponse&gt;
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
  public ApiResponse<UsageIndexedSpansResponse> getUsageIndexedSpansWithHttpInfo(OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageIndexedSpans");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/indexed-spans";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageIndexedSpans", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIndexedSpansResponse>() {});
  }

  /**
   * Get hourly usage for indexed spans.
   *
   * See {@link #getUsageIndexedSpansWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIndexedSpansResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageIndexedSpansResponse>> getUsageIndexedSpansWithHttpInfoAsync(OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageIndexedSpansResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageIndexedSpans"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/indexed-spans";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageIndexedSpans", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageIndexedSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIndexedSpansResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageInternetOfThings.
   */
  public static class GetUsageInternetOfThingsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageInternetOfThingsOptionalParameters
     */
    public GetUsageInternetOfThingsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for IoT.
 *
 * See {@link #getUsageInternetOfThingsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageIoTResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIoTResponse getUsageInternetOfThings (OffsetDateTime startHr) throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo( startHr, new GetUsageInternetOfThingsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for IoT.
 *
 * See {@link #getUsageInternetOfThingsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageIoTResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIoTResponse>getUsageInternetOfThingsAsync(OffsetDateTime startHr) {
    return getUsageInternetOfThingsWithHttpInfoAsync(startHr, new GetUsageInternetOfThingsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for IoT.
 *
 * See {@link #getUsageInternetOfThingsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageIoTResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageIoTResponse getUsageInternetOfThings(OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for IoT.
 *
 * See {@link #getUsageInternetOfThingsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageIoTResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageIoTResponse>getUsageInternetOfThingsAsync( OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) {
    return getUsageInternetOfThingsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for IoT.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageIoTResponse&gt;
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
  public ApiResponse<UsageIoTResponse> getUsageInternetOfThingsWithHttpInfo(OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageInternetOfThings");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/iot";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageInternetOfThings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIoTResponse>() {});
  }

  /**
   * Get hourly usage for IoT.
   *
   * See {@link #getUsageInternetOfThingsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageIoTResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageIoTResponse>> getUsageInternetOfThingsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageIoTResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageInternetOfThings"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/iot";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageInternetOfThings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageIoTResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageIoTResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageLambda.
   */
  public static class GetUsageLambdaOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLambdaOptionalParameters
     */
    public GetUsageLambdaOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for Lambda.
 *
 * See {@link #getUsageLambdaWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageLambdaResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLambdaResponse getUsageLambda (OffsetDateTime startHr) throws ApiException {
    return getUsageLambdaWithHttpInfo( startHr, new GetUsageLambdaOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for Lambda.
 *
 * See {@link #getUsageLambdaWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageLambdaResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLambdaResponse>getUsageLambdaAsync(OffsetDateTime startHr) {
    return getUsageLambdaWithHttpInfoAsync(startHr, new GetUsageLambdaOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for Lambda.
 *
 * See {@link #getUsageLambdaWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageLambdaResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLambdaResponse getUsageLambda(OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) throws ApiException {
    return getUsageLambdaWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for Lambda.
 *
 * See {@link #getUsageLambdaWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageLambdaResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLambdaResponse>getUsageLambdaAsync( OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) {
    return getUsageLambdaWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for Lambda.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLambdaResponse&gt;
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
  public ApiResponse<UsageLambdaResponse> getUsageLambdaWithHttpInfo(OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambda");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLambda", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLambdaResponse>() {});
  }

  /**
   * Get hourly usage for Lambda.
   *
   * See {@link #getUsageLambdaWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLambdaResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageLambdaResponse>> getUsageLambdaWithHttpInfoAsync(OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageLambdaResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambda"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLambda", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLambdaResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLambdaResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageLogs.
   */
  public static class GetUsageLogsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLogsOptionalParameters
     */
    public GetUsageLogsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for logs.
 *
 * See {@link #getUsageLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLogsResponse getUsageLogs (OffsetDateTime startHr) throws ApiException {
    return getUsageLogsWithHttpInfo( startHr, new GetUsageLogsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for logs.
 *
 * See {@link #getUsageLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLogsResponse>getUsageLogsAsync(OffsetDateTime startHr) {
    return getUsageLogsWithHttpInfoAsync(startHr, new GetUsageLogsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for logs.
 *
 * See {@link #getUsageLogsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageLogsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLogsResponse getUsageLogs(OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) throws ApiException {
    return getUsageLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for logs.
 *
 * See {@link #getUsageLogsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageLogsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLogsResponse>getUsageLogsAsync( OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) {
    return getUsageLogsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for logs.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsResponse&gt;
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
  public ApiResponse<UsageLogsResponse> getUsageLogsWithHttpInfo(OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogs");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsResponse>() {});
  }

  /**
   * Get hourly usage for logs.
   *
   * See {@link #getUsageLogsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageLogsResponse>> getUsageLogsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageLogsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogs"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogs", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLogsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageLogsByIndex.
   */
  public static class GetUsageLogsByIndexOptionalParameters {
    private OffsetDateTime endHr;
    private List<String> indexName;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLogsByIndexOptionalParameters
     */
    public GetUsageLogsByIndexOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set indexName.
     * @param indexName Comma-separated list of log index names. (optional)
     * @return GetUsageLogsByIndexOptionalParameters
     */
    public GetUsageLogsByIndexOptionalParameters indexName(List<String> indexName) {
      this.indexName = indexName;
      return this;
    }
  }

  /**
 * Get hourly usage for logs by index.
 *
 * See {@link #getUsageLogsByIndexWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageLogsByIndexResponse
 * @throws ApiException if fails to make API call
 */
  public UsageLogsByIndexResponse getUsageLogsByIndex (OffsetDateTime startHr) throws ApiException {
    return getUsageLogsByIndexWithHttpInfo( startHr, new GetUsageLogsByIndexOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for logs by index.
 *
 * See {@link #getUsageLogsByIndexWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageLogsByIndexResponse&gt;
 */
  public CompletableFuture<UsageLogsByIndexResponse>getUsageLogsByIndexAsync(OffsetDateTime startHr) {
    return getUsageLogsByIndexWithHttpInfoAsync(startHr, new GetUsageLogsByIndexOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for logs by index.
 *
 * See {@link #getUsageLogsByIndexWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageLogsByIndexResponse
 * @throws ApiException if fails to make API call
 */
  public UsageLogsByIndexResponse getUsageLogsByIndex(OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) throws ApiException {
    return getUsageLogsByIndexWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for logs by index.
 *
 * See {@link #getUsageLogsByIndexWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageLogsByIndexResponse&gt;
 */
  public CompletableFuture<UsageLogsByIndexResponse>getUsageLogsByIndexAsync( OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) {
    return getUsageLogsByIndexWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for logs by index.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsByIndexResponse&gt;
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
  public ApiResponse<UsageLogsByIndexResponse> getUsageLogsByIndexWithHttpInfo(OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex");
    }
    OffsetDateTime endHr = parameters.endHr;
    List<String> indexName = parameters.indexName;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogsByIndex", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsByIndexResponse>() {});
  }

  /**
   * Get hourly usage for logs by index.
   *
   * See {@link #getUsageLogsByIndexWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsByIndexResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageLogsByIndexResponse>> getUsageLogsByIndexWithHttpInfoAsync(OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageLogsByIndexResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    List<String> indexName = parameters.indexName;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogsByIndex", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLogsByIndexResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsByIndexResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageLogsByRetention.
   */
  public static class GetUsageLogsByRetentionOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageLogsByRetentionOptionalParameters
     */
    public GetUsageLogsByRetentionOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly logs usage by retention.
 *
 * See {@link #getUsageLogsByRetentionWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageLogsByRetentionResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLogsByRetentionResponse getUsageLogsByRetention (OffsetDateTime startHr) throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo( startHr, new GetUsageLogsByRetentionOptionalParameters()).getData();
  }

  /**
 * Get hourly logs usage by retention.
 *
 * See {@link #getUsageLogsByRetentionWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageLogsByRetentionResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLogsByRetentionResponse>getUsageLogsByRetentionAsync(OffsetDateTime startHr) {
    return getUsageLogsByRetentionWithHttpInfoAsync(startHr, new GetUsageLogsByRetentionOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly logs usage by retention.
 *
 * See {@link #getUsageLogsByRetentionWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageLogsByRetentionResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageLogsByRetentionResponse getUsageLogsByRetention(OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly logs usage by retention.
 *
 * See {@link #getUsageLogsByRetentionWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageLogsByRetentionResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageLogsByRetentionResponse>getUsageLogsByRetentionAsync( OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) {
    return getUsageLogsByRetentionWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for indexed logs by retention period.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageLogsByRetentionResponse&gt;
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
  public ApiResponse<UsageLogsByRetentionResponse> getUsageLogsByRetentionWithHttpInfo(OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByRetention");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs-by-retention";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogsByRetention", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsByRetentionResponse>() {});
  }

  /**
   * Get hourly logs usage by retention.
   *
   * See {@link #getUsageLogsByRetentionWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageLogsByRetentionResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageLogsByRetentionResponse>> getUsageLogsByRetentionWithHttpInfoAsync(OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageLogsByRetentionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByRetention"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs-by-retention";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageLogsByRetention", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageLogsByRetentionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageLogsByRetentionResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageNetworkFlows.
   */
  public static class GetUsageNetworkFlowsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageNetworkFlowsOptionalParameters
     */
    public GetUsageNetworkFlowsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * get hourly usage for network flows.
 *
 * See {@link #getUsageNetworkFlowsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageNetworkFlowsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageNetworkFlowsResponse getUsageNetworkFlows (OffsetDateTime startHr) throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo( startHr, new GetUsageNetworkFlowsOptionalParameters()).getData();
  }

  /**
 * get hourly usage for network flows.
 *
 * See {@link #getUsageNetworkFlowsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageNetworkFlowsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageNetworkFlowsResponse>getUsageNetworkFlowsAsync(OffsetDateTime startHr) {
    return getUsageNetworkFlowsWithHttpInfoAsync(startHr, new GetUsageNetworkFlowsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * get hourly usage for network flows.
 *
 * See {@link #getUsageNetworkFlowsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageNetworkFlowsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageNetworkFlowsResponse getUsageNetworkFlows(OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * get hourly usage for network flows.
 *
 * See {@link #getUsageNetworkFlowsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageNetworkFlowsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageNetworkFlowsResponse>getUsageNetworkFlowsAsync( OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) {
    return getUsageNetworkFlowsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for network flows.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageNetworkFlowsResponse&gt;
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
  public ApiResponse<UsageNetworkFlowsResponse> getUsageNetworkFlowsWithHttpInfo(OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageNetworkFlows", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageNetworkFlowsResponse>() {});
  }

  /**
   * get hourly usage for network flows.
   *
   * See {@link #getUsageNetworkFlowsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageNetworkFlowsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageNetworkFlowsResponse>> getUsageNetworkFlowsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageNetworkFlowsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageNetworkFlows", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageNetworkFlowsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageNetworkFlowsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageNetworkHosts.
   */
  public static class GetUsageNetworkHostsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageNetworkHostsOptionalParameters
     */
    public GetUsageNetworkHostsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for network hosts.
 *
 * See {@link #getUsageNetworkHostsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageNetworkHostsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageNetworkHostsResponse getUsageNetworkHosts (OffsetDateTime startHr) throws ApiException {
    return getUsageNetworkHostsWithHttpInfo( startHr, new GetUsageNetworkHostsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for network hosts.
 *
 * See {@link #getUsageNetworkHostsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageNetworkHostsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageNetworkHostsResponse>getUsageNetworkHostsAsync(OffsetDateTime startHr) {
    return getUsageNetworkHostsWithHttpInfoAsync(startHr, new GetUsageNetworkHostsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for network hosts.
 *
 * See {@link #getUsageNetworkHostsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageNetworkHostsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageNetworkHostsResponse getUsageNetworkHosts(OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) throws ApiException {
    return getUsageNetworkHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for network hosts.
 *
 * See {@link #getUsageNetworkHostsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageNetworkHostsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageNetworkHostsResponse>getUsageNetworkHostsAsync( OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) {
    return getUsageNetworkHostsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for network hosts.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageNetworkHostsResponse&gt;
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
  public ApiResponse<UsageNetworkHostsResponse> getUsageNetworkHostsWithHttpInfo(OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageNetworkHosts", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageNetworkHostsResponse>() {});
  }

  /**
   * Get hourly usage for network hosts.
   *
   * See {@link #getUsageNetworkHostsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageNetworkHostsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageNetworkHostsResponse>> getUsageNetworkHostsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageNetworkHostsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageNetworkHosts", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageNetworkHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageNetworkHostsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageOnlineArchive.
   */
  public static class GetUsageOnlineArchiveOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageOnlineArchiveOptionalParameters
     */
    public GetUsageOnlineArchiveOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for online archive.
 *
 * See {@link #getUsageOnlineArchiveWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageOnlineArchiveResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageOnlineArchiveResponse getUsageOnlineArchive (OffsetDateTime startHr) throws ApiException {
    return getUsageOnlineArchiveWithHttpInfo( startHr, new GetUsageOnlineArchiveOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for online archive.
 *
 * See {@link #getUsageOnlineArchiveWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageOnlineArchiveResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageOnlineArchiveResponse>getUsageOnlineArchiveAsync(OffsetDateTime startHr) {
    return getUsageOnlineArchiveWithHttpInfoAsync(startHr, new GetUsageOnlineArchiveOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for online archive.
 *
 * See {@link #getUsageOnlineArchiveWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageOnlineArchiveResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageOnlineArchiveResponse getUsageOnlineArchive(OffsetDateTime startHr, GetUsageOnlineArchiveOptionalParameters parameters) throws ApiException {
    return getUsageOnlineArchiveWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for online archive.
 *
 * See {@link #getUsageOnlineArchiveWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageOnlineArchiveResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageOnlineArchiveResponse>getUsageOnlineArchiveAsync( OffsetDateTime startHr, GetUsageOnlineArchiveOptionalParameters parameters) {
    return getUsageOnlineArchiveWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for online archive.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageOnlineArchiveResponse&gt;
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
  public ApiResponse<UsageOnlineArchiveResponse> getUsageOnlineArchiveWithHttpInfo(OffsetDateTime startHr, GetUsageOnlineArchiveOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageOnlineArchive");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/online-archive";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageOnlineArchive", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageOnlineArchiveResponse>() {});
  }

  /**
   * Get hourly usage for online archive.
   *
   * See {@link #getUsageOnlineArchiveWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageOnlineArchiveResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageOnlineArchiveResponse>> getUsageOnlineArchiveWithHttpInfoAsync(OffsetDateTime startHr, GetUsageOnlineArchiveOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageOnlineArchiveResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageOnlineArchive"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/online-archive";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageOnlineArchive", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageOnlineArchiveResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageOnlineArchiveResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageProfiling.
   */
  public static class GetUsageProfilingOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageProfilingOptionalParameters
     */
    public GetUsageProfilingOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for profiled hosts.
 *
 * See {@link #getUsageProfilingWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageProfilingResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageProfilingResponse getUsageProfiling (OffsetDateTime startHr) throws ApiException {
    return getUsageProfilingWithHttpInfo( startHr, new GetUsageProfilingOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for profiled hosts.
 *
 * See {@link #getUsageProfilingWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageProfilingResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageProfilingResponse>getUsageProfilingAsync(OffsetDateTime startHr) {
    return getUsageProfilingWithHttpInfoAsync(startHr, new GetUsageProfilingOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for profiled hosts.
 *
 * See {@link #getUsageProfilingWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageProfilingResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageProfilingResponse getUsageProfiling(OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) throws ApiException {
    return getUsageProfilingWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for profiled hosts.
 *
 * See {@link #getUsageProfilingWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageProfilingResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageProfilingResponse>getUsageProfilingAsync( OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) {
    return getUsageProfilingWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for profiled hosts.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageProfilingResponse&gt;
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
  public ApiResponse<UsageProfilingResponse> getUsageProfilingWithHttpInfo(OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageProfiling");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/profiling";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageProfiling", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageProfilingResponse>() {});
  }

  /**
   * Get hourly usage for profiled hosts.
   *
   * See {@link #getUsageProfilingWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageProfilingResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageProfilingResponse>> getUsageProfilingWithHttpInfoAsync(OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageProfilingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageProfiling"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/profiling";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageProfiling", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageProfilingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageProfilingResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageRumSessions.
   */
  public static class GetUsageRumSessionsOptionalParameters {
    private OffsetDateTime endHr;
    private String type;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageRumSessionsOptionalParameters
     */
    public GetUsageRumSessionsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set type.
     * @param type RUM type: <code>[browser, mobile]</code>. Defaults to <code>browser</code>. (optional)
     * @return GetUsageRumSessionsOptionalParameters
     */
    public GetUsageRumSessionsOptionalParameters type(String type) {
      this.type = type;
      return this;
    }
  }

  /**
 * Get hourly usage for RUM sessions.
 *
 * See {@link #getUsageRumSessionsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageRumSessionsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageRumSessionsResponse getUsageRumSessions (OffsetDateTime startHr) throws ApiException {
    return getUsageRumSessionsWithHttpInfo( startHr, new GetUsageRumSessionsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for RUM sessions.
 *
 * See {@link #getUsageRumSessionsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageRumSessionsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageRumSessionsResponse>getUsageRumSessionsAsync(OffsetDateTime startHr) {
    return getUsageRumSessionsWithHttpInfoAsync(startHr, new GetUsageRumSessionsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for RUM sessions.
 *
 * See {@link #getUsageRumSessionsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageRumSessionsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageRumSessionsResponse getUsageRumSessions(OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) throws ApiException {
    return getUsageRumSessionsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for RUM sessions.
 *
 * See {@link #getUsageRumSessionsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageRumSessionsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageRumSessionsResponse>getUsageRumSessionsAsync( OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) {
    return getUsageRumSessionsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/real_user_monitoring/">RUM</a> Sessions.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageRumSessionsResponse&gt;
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
  public ApiResponse<UsageRumSessionsResponse> getUsageRumSessionsWithHttpInfo(OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumSessions");
    }
    OffsetDateTime endHr = parameters.endHr;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageRumSessions", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageRumSessionsResponse>() {});
  }

  /**
   * Get hourly usage for RUM sessions.
   *
   * See {@link #getUsageRumSessionsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageRumSessionsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageRumSessionsResponse>> getUsageRumSessionsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageRumSessionsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumSessions"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageRumSessions", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageRumSessionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageRumSessionsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageRumUnits.
   */
  public static class GetUsageRumUnitsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageRumUnitsOptionalParameters
     */
    public GetUsageRumUnitsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for RUM units.
 *
 * See {@link #getUsageRumUnitsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageRumUnitsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageRumUnitsResponse getUsageRumUnits (OffsetDateTime startHr) throws ApiException {
    return getUsageRumUnitsWithHttpInfo( startHr, new GetUsageRumUnitsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for RUM units.
 *
 * See {@link #getUsageRumUnitsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageRumUnitsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageRumUnitsResponse>getUsageRumUnitsAsync(OffsetDateTime startHr) {
    return getUsageRumUnitsWithHttpInfoAsync(startHr, new GetUsageRumUnitsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for RUM units.
 *
 * See {@link #getUsageRumUnitsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageRumUnitsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageRumUnitsResponse getUsageRumUnits(OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) throws ApiException {
    return getUsageRumUnitsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for RUM units.
 *
 * See {@link #getUsageRumUnitsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageRumUnitsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageRumUnitsResponse>getUsageRumUnitsAsync( OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) {
    return getUsageRumUnitsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/real_user_monitoring/">RUM</a> Units.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageRumUnitsResponse&gt;
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
  public ApiResponse<UsageRumUnitsResponse> getUsageRumUnitsWithHttpInfo(OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumUnits");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageRumUnits", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageRumUnitsResponse>() {});
  }

  /**
   * Get hourly usage for RUM units.
   *
   * See {@link #getUsageRumUnitsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageRumUnitsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageRumUnitsResponse>> getUsageRumUnitsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageRumUnitsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageRumUnitsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumUnits"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageRumUnits", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageRumUnitsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageRumUnitsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSDS.
   */
  public static class GetUsageSDSOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageSDSOptionalParameters
     */
    public GetUsageSDSOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for sensitive data scanner.
 *
 * See {@link #getUsageSDSWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageSDSResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSDSResponse getUsageSDS (OffsetDateTime startHr) throws ApiException {
    return getUsageSDSWithHttpInfo( startHr, new GetUsageSDSOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for sensitive data scanner.
 *
 * See {@link #getUsageSDSWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageSDSResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSDSResponse>getUsageSDSAsync(OffsetDateTime startHr) {
    return getUsageSDSWithHttpInfoAsync(startHr, new GetUsageSDSOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for sensitive data scanner.
 *
 * See {@link #getUsageSDSWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSDSResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSDSResponse getUsageSDS(OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) throws ApiException {
    return getUsageSDSWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for sensitive data scanner.
 *
 * See {@link #getUsageSDSWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSDSResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSDSResponse>getUsageSDSAsync( OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) {
    return getUsageSDSWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for sensitive data scanner.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSDSResponse&gt;
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
  public ApiResponse<UsageSDSResponse> getUsageSDSWithHttpInfo(OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSDS");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/sds";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSDS", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSDSResponse>() {});
  }

  /**
   * Get hourly usage for sensitive data scanner.
   *
   * See {@link #getUsageSDSWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSDSResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSDSResponse>> getUsageSDSWithHttpInfoAsync(OffsetDateTime startHr, GetUsageSDSOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageSDSResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSDS"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/sds";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSDS", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSDSResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSDSResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSNMP.
   */
  public static class GetUsageSNMPOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageSNMPOptionalParameters
     */
    public GetUsageSNMPOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for SNMP devices.
 *
 * See {@link #getUsageSNMPWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return UsageSNMPResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSNMPResponse getUsageSNMP (OffsetDateTime startHr) throws ApiException {
    return getUsageSNMPWithHttpInfo( startHr, new GetUsageSNMPOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for SNMP devices.
 *
 * See {@link #getUsageSNMPWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageSNMPResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSNMPResponse>getUsageSNMPAsync(OffsetDateTime startHr) {
    return getUsageSNMPWithHttpInfoAsync(startHr, new GetUsageSNMPOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for SNMP devices.
 *
 * See {@link #getUsageSNMPWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSNMPResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSNMPResponse getUsageSNMP(OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) throws ApiException {
    return getUsageSNMPWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for SNMP devices.
 *
 * See {@link #getUsageSNMPWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSNMPResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSNMPResponse>getUsageSNMPAsync( OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) {
    return getUsageSNMPWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for SNMP devices.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSNMPResponse&gt;
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
  public ApiResponse<UsageSNMPResponse> getUsageSNMPWithHttpInfo(OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSNMP");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/snmp";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSNMP", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSNMPResponse>() {});
  }

  /**
   * Get hourly usage for SNMP devices.
   *
   * See {@link #getUsageSNMPWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code> for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSNMPResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSNMPResponse>> getUsageSNMPWithHttpInfoAsync(OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageSNMPResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSNMP"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/snmp";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSNMP", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSNMPResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSNMPResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSummary.
   */
  public static class GetUsageSummaryOptionalParameters {
    private OffsetDateTime endMonth;
    private Boolean includeOrgDetails;
    private Boolean includeConnectedAccounts;

    /**
     * Set endMonth.
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage ending this month. (optional)
     * @return GetUsageSummaryOptionalParameters
     */
    public GetUsageSummaryOptionalParameters endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set includeOrgDetails.
     * @param includeOrgDetails Include usage summaries for each sub-org. (optional)
     * @return GetUsageSummaryOptionalParameters
     */
    public GetUsageSummaryOptionalParameters includeOrgDetails(Boolean includeOrgDetails) {
      this.includeOrgDetails = includeOrgDetails;
      return this;
    }

    /**
     * Set includeConnectedAccounts.
     * @param includeConnectedAccounts Boolean to specify whether to include accounts connected to the current account as partner customers in the Datadog partner network program. Defaults to <code>false</code>.  (optional, default to false)
     * @return GetUsageSummaryOptionalParameters
     */
    public GetUsageSummaryOptionalParameters includeConnectedAccounts(Boolean includeConnectedAccounts) {
      this.includeConnectedAccounts = includeConnectedAccounts;
      return this;
    }
  }

  /**
 * Get usage across your account.
 *
 * See {@link #getUsageSummaryWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @return UsageSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public UsageSummaryResponse getUsageSummary (OffsetDateTime startMonth) throws ApiException {
    return getUsageSummaryWithHttpInfo( startMonth, new GetUsageSummaryOptionalParameters()).getData();
  }

  /**
 * Get usage across your account.
 *
 * See {@link #getUsageSummaryWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @return CompletableFuture&lt;UsageSummaryResponse&gt;
 */
  public CompletableFuture<UsageSummaryResponse>getUsageSummaryAsync(OffsetDateTime startMonth) {
    return getUsageSummaryWithHttpInfoAsync(startMonth, new GetUsageSummaryOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get usage across your account.
 *
 * See {@link #getUsageSummaryWithHttpInfo}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public UsageSummaryResponse getUsageSummary(OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) throws ApiException {
    return getUsageSummaryWithHttpInfo(startMonth, parameters).getData();
  }

  /**
 * Get usage across your account.
 *
 * See {@link #getUsageSummaryWithHttpInfoAsync}.
 *
 * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSummaryResponse&gt;
 */
  public CompletableFuture<UsageSummaryResponse>getUsageSummaryAsync( OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) {
    return getUsageSummaryWithHttpInfoAsync(startMonth, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all usage across your account.</p>
   * <p>This endpoint is only accessible for <a href="https://docs.datadoghq.com/account_management/multi_organization/">parent-level organizations</a>.</p>
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSummaryResponse&gt;
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
  public ApiResponse<UsageSummaryResponse> getUsageSummaryWithHttpInfo(OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getUsageSummary");
    }
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeOrgDetails = parameters.includeOrgDetails;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSummary", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSummaryResponse>() {});
  }

  /**
   * Get usage across your account.
   *
   * See {@link #getUsageSummaryWithHttpInfo}.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: <code>[YYYY-MM]</code> for usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageSummaryResponse>> getUsageSummaryWithHttpInfoAsync(OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
        CompletableFuture<ApiResponse<UsageSummaryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startMonth' when calling getUsageSummary"));
        return result;
    }
    OffsetDateTime endMonth = parameters.endMonth;
    Boolean includeOrgDetails = parameters.includeOrgDetails;
    Boolean includeConnectedAccounts = parameters.includeConnectedAccounts;
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connected_accounts", includeConnectedAccounts));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSummary", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSummaryResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSynthetics.
   */
  public static class GetUsageSyntheticsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageSyntheticsOptionalParameters
     */
    public GetUsageSyntheticsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for synthetics checks.
 *
 * See {@link #getUsageSyntheticsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageSyntheticsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsResponse getUsageSynthetics (OffsetDateTime startHr) throws ApiException {
    return getUsageSyntheticsWithHttpInfo( startHr, new GetUsageSyntheticsOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for synthetics checks.
 *
 * See {@link #getUsageSyntheticsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageSyntheticsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsResponse>getUsageSyntheticsAsync(OffsetDateTime startHr) {
    return getUsageSyntheticsWithHttpInfoAsync(startHr, new GetUsageSyntheticsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for synthetics checks.
 *
 * See {@link #getUsageSyntheticsWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSyntheticsResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsResponse getUsageSynthetics(OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) throws ApiException {
    return getUsageSyntheticsWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for synthetics checks.
 *
 * See {@link #getUsageSyntheticsWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSyntheticsResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsResponse>getUsageSyntheticsAsync( OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) {
    return getUsageSyntheticsWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/synthetics/">synthetics checks</a>.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsResponse&gt;
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
  public ApiResponse<UsageSyntheticsResponse> getUsageSyntheticsWithHttpInfo(OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSynthetics");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSynthetics", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsResponse>() {});
  }

  /**
   * Get hourly usage for synthetics checks.
   *
   * See {@link #getUsageSyntheticsWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSyntheticsResponse>> getUsageSyntheticsWithHttpInfoAsync(OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageSyntheticsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSynthetics"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSynthetics", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSyntheticsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSyntheticsAPI.
   */
  public static class GetUsageSyntheticsAPIOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageSyntheticsAPIOptionalParameters
     */
    public GetUsageSyntheticsAPIOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for synthetics API checks.
 *
 * See {@link #getUsageSyntheticsAPIWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageSyntheticsAPIResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI (OffsetDateTime startHr) throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo( startHr, new GetUsageSyntheticsAPIOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for synthetics API checks.
 *
 * See {@link #getUsageSyntheticsAPIWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageSyntheticsAPIResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsAPIResponse>getUsageSyntheticsAPIAsync(OffsetDateTime startHr) {
    return getUsageSyntheticsAPIWithHttpInfoAsync(startHr, new GetUsageSyntheticsAPIOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for synthetics API checks.
 *
 * See {@link #getUsageSyntheticsAPIWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSyntheticsAPIResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI(OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for synthetics API checks.
 *
 * See {@link #getUsageSyntheticsAPIWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSyntheticsAPIResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsAPIResponse>getUsageSyntheticsAPIAsync( OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) {
    return getUsageSyntheticsAPIWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/synthetics/">synthetics API checks</a>.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsAPIResponse&gt;
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
  public ApiResponse<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIWithHttpInfo(OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSyntheticsAPI", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsAPIResponse>() {});
  }

  /**
   * Get hourly usage for synthetics API checks.
   *
   * See {@link #getUsageSyntheticsAPIWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsAPIResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSyntheticsAPIResponse>> getUsageSyntheticsAPIWithHttpInfoAsync(OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageSyntheticsAPIResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSyntheticsAPI", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSyntheticsAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsAPIResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageSyntheticsBrowser.
   */
  public static class GetUsageSyntheticsBrowserOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageSyntheticsBrowserOptionalParameters
     */
    public GetUsageSyntheticsBrowserOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for synthetics browser checks.
 *
 * See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageSyntheticsBrowserResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser (OffsetDateTime startHr) throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo( startHr, new GetUsageSyntheticsBrowserOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for synthetics browser checks.
 *
 * See {@link #getUsageSyntheticsBrowserWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageSyntheticsBrowserResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsBrowserResponse>getUsageSyntheticsBrowserAsync(OffsetDateTime startHr) {
    return getUsageSyntheticsBrowserWithHttpInfoAsync(startHr, new GetUsageSyntheticsBrowserOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for synthetics browser checks.
 *
 * See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageSyntheticsBrowserResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for synthetics browser checks.
 *
 * See {@link #getUsageSyntheticsBrowserWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageSyntheticsBrowserResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageSyntheticsBrowserResponse>getUsageSyntheticsBrowserAsync( OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) {
    return getUsageSyntheticsBrowserWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for synthetics browser checks.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;
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
  public ApiResponse<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserWithHttpInfo(OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSyntheticsBrowser", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsBrowserResponse>() {});
  }

  /**
   * Get hourly usage for synthetics browser checks.
   *
   * See {@link #getUsageSyntheticsBrowserWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageSyntheticsBrowserResponse>> getUsageSyntheticsBrowserWithHttpInfoAsync(OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageSyntheticsBrowserResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageSyntheticsBrowser", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageSyntheticsBrowserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageSyntheticsBrowserResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageTimeseries.
   */
  public static class GetUsageTimeseriesOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr.
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending <strong>before</strong> this hour. (optional)
     * @return GetUsageTimeseriesOptionalParameters
     */
    public GetUsageTimeseriesOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
 * Get hourly usage for custom metrics.
 *
 * See {@link #getUsageTimeseriesWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return UsageTimeseriesResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageTimeseriesResponse getUsageTimeseries (OffsetDateTime startHr) throws ApiException {
    return getUsageTimeseriesWithHttpInfo( startHr, new GetUsageTimeseriesOptionalParameters()).getData();
  }

  /**
 * Get hourly usage for custom metrics.
 *
 * See {@link #getUsageTimeseriesWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @return CompletableFuture&lt;UsageTimeseriesResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageTimeseriesResponse>getUsageTimeseriesAsync(OffsetDateTime startHr) {
    return getUsageTimeseriesWithHttpInfoAsync(startHr, new GetUsageTimeseriesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get hourly usage for custom metrics.
 *
 * See {@link #getUsageTimeseriesWithHttpInfo}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return UsageTimeseriesResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public UsageTimeseriesResponse getUsageTimeseries(OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) throws ApiException {
    return getUsageTimeseriesWithHttpInfo(startHr, parameters).getData();
  }

  /**
 * Get hourly usage for custom metrics.
 *
 * See {@link #getUsageTimeseriesWithHttpInfoAsync}.
 *
 * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageTimeseriesResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<UsageTimeseriesResponse>getUsageTimeseriesAsync( OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) {
    return getUsageTimeseriesWithHttpInfoAsync(startHr, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get hourly usage for <a href="https://docs.datadoghq.com/developers/metrics/custom_metrics/">custom metrics</a>.
   * <strong>Note:</strong> This endpoint has been deprecated. Hourly usage data for all products is now available in the <a href="https://docs.datadoghq.com/api/latest/usage-metering/#get-hourly-usage-by-product-family">Get hourly usage by product family API</a>. Refer to <a href="https://docs.datadoghq.com/account_management/guide/hourly-usage-migration/">Migrating from the V1 Hourly Usage APIs to V2</a> for the associated migration guide.</p>
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTimeseriesResponse&gt;
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
  public ApiResponse<UsageTimeseriesResponse> getUsageTimeseriesWithHttpInfo(OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTimeseries");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageTimeseries", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageTimeseriesResponse>() {});
  }

  /**
   * Get hourly usage for custom metrics.
   *
   * See {@link #getUsageTimeseriesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageTimeseriesResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UsageTimeseriesResponse>> getUsageTimeseriesWithHttpInfoAsync(OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
        CompletableFuture<ApiResponse<UsageTimeseriesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTimeseries"));
        return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageTimeseries", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageTimeseriesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageTimeseriesResponse>() {});
  }

  /**
   * Manage optional parameters to getUsageTopAvgMetrics.
   */
  public static class GetUsageTopAvgMetricsOptionalParameters {
    private OffsetDateTime month;
    private OffsetDateTime day;
    private List<String> names;
    private Integer limit;
    private String nextRecordId;

    /**
     * Set month.
     * @param month Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (Either month or day should be specified, but not both) (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters month(OffsetDateTime month) {
      this.month = month;
      return this;
    }

    /**
     * Set day.
     * @param day Datetime in ISO-8601 format, UTC, precise to day: [YYYY-MM-DD] for usage beginning at this hour. (Either month or day should be specified, but not both) (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters day(OffsetDateTime day) {
      this.day = day;
      return this;
    }

    /**
     * Set names.
     * @param names Comma-separated list of metric names. (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters names(List<String> names) {
      this.names = names;
      return this;
    }

    /**
     * Set limit.
     * @param limit Maximum number of results to return (between 1 and 5000) - defaults to 500 results if limit not specified. (optional, default to 500)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set nextRecordId.
     * @param nextRecordId List following results with a next_record_id provided in the previous query. (optional)
     * @return GetUsageTopAvgMetricsOptionalParameters
     */
    public GetUsageTopAvgMetricsOptionalParameters nextRecordId(String nextRecordId) {
      this.nextRecordId = nextRecordId;
      return this;
    }
  }

  /**
 * Get all custom metrics by hourly average.
 *
 * See {@link #getUsageTopAvgMetricsWithHttpInfo}.
 *
 * @return UsageTopAvgMetricsResponse
 * @throws ApiException if fails to make API call
 */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics () throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(new GetUsageTopAvgMetricsOptionalParameters()).getData();
  }

  /**
 * Get all custom metrics by hourly average.
 *
 * See {@link #getUsageTopAvgMetricsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;UsageTopAvgMetricsResponse&gt;
 */
  public CompletableFuture<UsageTopAvgMetricsResponse>getUsageTopAvgMetricsAsync() {
    return getUsageTopAvgMetricsWithHttpInfoAsync(new GetUsageTopAvgMetricsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all custom metrics by hourly average.
 *
 * See {@link #getUsageTopAvgMetricsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return UsageTopAvgMetricsResponse
 * @throws ApiException if fails to make API call
 */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics(GetUsageTopAvgMetricsOptionalParameters parameters) throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(parameters).getData();
  }

  /**
 * Get all custom metrics by hourly average.
 *
 * See {@link #getUsageTopAvgMetricsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;UsageTopAvgMetricsResponse&gt;
 */
  public CompletableFuture<UsageTopAvgMetricsResponse>getUsageTopAvgMetricsAsync(GetUsageTopAvgMetricsOptionalParameters parameters) {
    return getUsageTopAvgMetricsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all <a href="https://docs.datadoghq.com/developers/metrics/custom_metrics/">custom metrics</a> by hourly average. Use the month parameter to get a month-to-date data resolution or use the day parameter to get a daily resolution. One of the two is required, and only one of the two is allowed.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTopAvgMetricsResponse&gt;
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
  public ApiResponse<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsWithHttpInfo(GetUsageTopAvgMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    OffsetDateTime day = parameters.day;
    List<String> names = parameters.names;
    Integer limit = parameters.limit;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    Invocation.Builder builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageTopAvgMetrics", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageTopAvgMetricsResponse>() {});
  }

  /**
   * Get all custom metrics by hourly average.
   *
   * See {@link #getUsageTopAvgMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageTopAvgMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageTopAvgMetricsResponse>> getUsageTopAvgMetricsWithHttpInfoAsync(GetUsageTopAvgMetricsOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime month = parameters.month;
    OffsetDateTime day = parameters.day;
    List<String> names = parameters.names;
    Integer limit = parameters.limit;
    String nextRecordId = parameters.nextRecordId;
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_record_id", nextRecordId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.UsageMeteringApi.getUsageTopAvgMetrics", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json;datetime-format=rfc3339" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageTopAvgMetricsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UsageTopAvgMetricsResponse>() {});
  }
}