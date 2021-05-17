package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.UsageAnalyzedLogsResponse;
import com.datadog.api.v1.client.model.UsageAttributionResponse;
import com.datadog.api.v1.client.model.UsageAttributionSort;
import com.datadog.api.v1.client.model.UsageAttributionSupportedMetrics;
import com.datadog.api.v1.client.model.UsageBillableSummaryResponse;
import com.datadog.api.v1.client.model.UsageComplianceResponse;
import com.datadog.api.v1.client.model.UsageCustomReportsResponse;
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
import com.datadog.api.v1.client.model.UsageTraceResponse;
import com.datadog.api.v1.client.model.UsageTracingWithoutLimitsResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
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
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional)
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
     *     (optional)
     * @return GetDailyCustomReportsOptionalParameters
     */
    public GetDailyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Get the list of available daily custom reports Get daily custom reports.
   *
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageCustomReportsResponse getDailyCustomReports() throws ApiException {
    return getDailyCustomReportsWithHttpInfo(new GetDailyCustomReportsOptionalParameters())
        .getData();
  }

  /**
   * Get the list of available daily custom reports Get daily custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageCustomReportsResponse getDailyCustomReports(
      GetDailyCustomReportsOptionalParameters parameters) throws ApiException {
    return getDailyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of available daily custom reports Get daily custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for incident management Get hourly usage for incident management.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIncidentManagementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIncidentManagementResponse getIncidentManagement(OffsetDateTime startHr)
      throws ApiException {
    return getIncidentManagementWithHttpInfo(startHr, new GetIncidentManagementOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for incident management Get hourly usage for incident management.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIncidentManagementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIncidentManagementResponse getIncidentManagement(
      OffsetDateTime startHr, GetIncidentManagementOptionalParameters parameters)
      throws ApiException {
    return getIncidentManagementWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for incident management Get hourly usage for incident management.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for ingested spans Get hourly usage for ingested spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIngestedSpansResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIngestedSpansResponse getIngestedSpans(OffsetDateTime startHr) throws ApiException {
    return getIngestedSpansWithHttpInfo(startHr, new GetIngestedSpansOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for ingested spans Get hourly usage for ingested spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIngestedSpansResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIngestedSpansResponse getIngestedSpans(
      OffsetDateTime startHr, GetIngestedSpansOptionalParameters parameters) throws ApiException {
    return getIngestedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for ingested spans Get hourly usage for ingested spans.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional)
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
     *     (optional)
     * @return GetMonthlyCustomReportsOptionalParameters
     */
    public GetMonthlyCustomReportsOptionalParameters sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Get the list of available monthly custom reports Get monthly custom reports.
   *
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageCustomReportsResponse getMonthlyCustomReports() throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(new GetMonthlyCustomReportsOptionalParameters())
        .getData();
  }

  /**
   * Get the list of available monthly custom reports Get monthly custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageCustomReportsResponse getMonthlyCustomReports(
      GetMonthlyCustomReportsOptionalParameters parameters) throws ApiException {
    return getMonthlyCustomReportsWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of available monthly custom reports Get monthly custom reports.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get specified daily custom reports Get specified daily custom reports.
   *
   * @param reportId The specified ID to search results for. (required)
   * @return UsageSpecifiedCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSpecifiedCustomReportsResponse getSpecifiedDailyCustomReports(String reportId)
      throws ApiException {
    return getSpecifiedDailyCustomReportsWithHttpInfo(reportId).getData();
  }

  /**
   * Get specified daily custom reports Get specified daily custom reports.
   *
   * @param reportId The specified ID to search results for. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get specified monthly custom reports Get specified monthly custom reports.
   *
   * @param reportId The specified ID to search results for. (required)
   * @return UsageSpecifiedCustomReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSpecifiedCustomReportsResponse getSpecifiedMonthlyCustomReports(String reportId)
      throws ApiException {
    return getSpecifiedMonthlyCustomReportsWithHttpInfo(reportId).getData();
  }

  /**
   * Get specified monthly custom reports Get specified monthly custom reports.
   *
   * @param reportId The specified ID to search results for. (required)
   * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  /** Manage optional parameters to getTracingWithoutLimits. */
  public static class GetTracingWithoutLimitsOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetTracingWithoutLimitsOptionalParameters
     */
    public GetTracingWithoutLimitsOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for tracing without limits Get hourly usage for tracing without limits.
   * **Note** This endpoint has been renamed to &#x60;/api/v1/usage/ingested-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageTracingWithoutLimitsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageTracingWithoutLimitsResponse getTracingWithoutLimits(OffsetDateTime startHr)
      throws ApiException {
    return getTracingWithoutLimitsWithHttpInfo(
            startHr, new GetTracingWithoutLimitsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for tracing without limits Get hourly usage for tracing without limits.
   * **Note** This endpoint has been renamed to &#x60;/api/v1/usage/ingested-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageTracingWithoutLimitsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageTracingWithoutLimitsResponse getTracingWithoutLimits(
      OffsetDateTime startHr, GetTracingWithoutLimitsOptionalParameters parameters)
      throws ApiException {
    return getTracingWithoutLimitsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for tracing without limits Get hourly usage for tracing without limits.
   * **Note** This endpoint has been renamed to &#x60;/api/v1/usage/ingested-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTracingWithoutLimitsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageTracingWithoutLimitsResponse> getTracingWithoutLimitsWithHttpInfo(
      OffsetDateTime startHr, GetTracingWithoutLimitsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getTracingWithoutLimits");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/tracing-without-limits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getTracingWithoutLimits");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTracingWithoutLimitsResponse> localVarReturnType =
        new GenericType<UsageTracingWithoutLimitsResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getTracingWithoutLimits",
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
   * Get hourly usage for analyzed logs Get hourly usage for analyzed logs (Security Monitoring).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageAnalyzedLogsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs(OffsetDateTime startHr)
      throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo(startHr, new GetUsageAnalyzedLogsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for analyzed logs Get hourly usage for analyzed logs (Security Monitoring).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageAnalyzedLogsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageAnalyzedLogsResponse getUsageAnalyzedLogs(
      OffsetDateTime startHr, GetUsageAnalyzedLogsOptionalParameters parameters)
      throws ApiException {
    return getUsageAnalyzedLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for analyzed logs Get hourly usage for analyzed logs (Security Monitoring).
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  /** Manage optional parameters to getUsageAttribution. */
  public static class GetUsageAttributionOptionalParameters {
    private OffsetDateTime endMonth;
    private UsageSortDirection sortDirection;
    private UsageAttributionSort sortName;

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
     * @param sortDirection The direction to sort by: &#x60;[desc, asc]&#x60;. (optional)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters sortDirection(UsageSortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName
     *
     * @param sortName The field to sort by. (optional)
     * @return GetUsageAttributionOptionalParameters
     */
    public GetUsageAttributionOptionalParameters sortName(UsageAttributionSort sortName) {
      this.sortName = sortName;
      return this;
    }
  }

  /**
   * Get Usage Attribution Get Usage Attribution.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @return UsageAttributionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageAttributionResponse getUsageAttribution(
      OffsetDateTime startMonth, UsageAttributionSupportedMetrics fields) throws ApiException {
    return getUsageAttributionWithHttpInfo(
            startMonth, fields, new GetUsageAttributionOptionalParameters())
        .getData();
  }

  /**
   * Get Usage Attribution Get Usage Attribution.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param fields Comma-separated list of usage types to return, or &#x60;*&#x60; for all usage
   *     types. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageAttributionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageAttributionResponse getUsageAttribution(
      OffsetDateTime startMonth,
      UsageAttributionSupportedMetrics fields,
      GetUsageAttributionOptionalParameters parameters)
      throws ApiException {
    return getUsageAttributionWithHttpInfo(startMonth, fields, parameters).getData();
  }

  /**
   * Get Usage Attribution Get Usage Attribution.
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAttribution");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get billable usage across your account Get billable usage across your account.
   *
   * @return UsageBillableSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageBillableSummaryResponse getUsageBillableSummary() throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(new GetUsageBillableSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get billable usage across your account Get billable usage across your account.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageBillableSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageBillableSummaryResponse getUsageBillableSummary(
      GetUsageBillableSummaryOptionalParameters parameters) throws ApiException {
    return getUsageBillableSummaryWithHttpInfo(parameters).getData();
  }

  /**
   * Get billable usage across your account Get billable usage across your account.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  /** Manage optional parameters to getUsageComplianceMonitoring. */
  public static class GetUsageComplianceMonitoringOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageComplianceMonitoringOptionalParameters
     */
    public GetUsageComplianceMonitoringOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Compliance Monitoring Get hourly usage for Compliance Monitoring.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageComplianceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageComplianceResponse getUsageComplianceMonitoring(OffsetDateTime startHr)
      throws ApiException {
    return getUsageComplianceMonitoringWithHttpInfo(
            startHr, new GetUsageComplianceMonitoringOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Compliance Monitoring Get hourly usage for Compliance Monitoring.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageComplianceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageComplianceResponse getUsageComplianceMonitoring(
      OffsetDateTime startHr, GetUsageComplianceMonitoringOptionalParameters parameters)
      throws ApiException {
    return getUsageComplianceMonitoringWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Compliance Monitoring Get hourly usage for Compliance Monitoring.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageComplianceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageComplianceResponse> getUsageComplianceMonitoringWithHttpInfo(
      OffsetDateTime startHr, GetUsageComplianceMonitoringOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling getUsageComplianceMonitoring");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/compliance-monitoring";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageComplianceMonitoring");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageComplianceResponse> localVarReturnType =
        new GenericType<UsageComplianceResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageComplianceMonitoring",
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
   * Get hourly usage for Fargate Get hourly usage for
   * [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageFargateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageFargateResponse getUsageFargate(OffsetDateTime startHr) throws ApiException {
    return getUsageFargateWithHttpInfo(startHr, new GetUsageFargateOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Fargate Get hourly usage for
   * [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageFargateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageFargateResponse getUsageFargate(
      OffsetDateTime startHr, GetUsageFargateOptionalParameters parameters) throws ApiException {
    return getUsageFargateWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Fargate Get hourly usage for
   * [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for hosts and containers Get hourly usage for hosts and containers.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageHostsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageHostsResponse getUsageHosts(OffsetDateTime startHr) throws ApiException {
    return getUsageHostsWithHttpInfo(startHr, new GetUsageHostsOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for hosts and containers Get hourly usage for hosts and containers.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageHostsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageHostsResponse getUsageHosts(
      OffsetDateTime startHr, GetUsageHostsOptionalParameters parameters) throws ApiException {
    return getUsageHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for hosts and containers Get hourly usage for hosts and containers.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for indexed spans Get hourly usage for indexed spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIndexedSpansResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIndexedSpansResponse getUsageIndexedSpans(OffsetDateTime startHr)
      throws ApiException {
    return getUsageIndexedSpansWithHttpInfo(startHr, new GetUsageIndexedSpansOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for indexed spans Get hourly usage for indexed spans.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIndexedSpansResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIndexedSpansResponse getUsageIndexedSpans(
      OffsetDateTime startHr, GetUsageIndexedSpansOptionalParameters parameters)
      throws ApiException {
    return getUsageIndexedSpansWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for indexed spans Get hourly usage for indexed spans.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for IoT Get hourly usage for IoT.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageIoTResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIoTResponse getUsageInternetOfThings(OffsetDateTime startHr) throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo(
            startHr, new GetUsageInternetOfThingsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for IoT Get hourly usage for IoT.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageIoTResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageIoTResponse getUsageInternetOfThings(
      OffsetDateTime startHr, GetUsageInternetOfThingsOptionalParameters parameters)
      throws ApiException {
    return getUsageInternetOfThingsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for IoT Get hourly usage for IoT.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Lambda Get hourly usage for lambda.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLambdaResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLambdaResponse getUsageLambda(OffsetDateTime startHr) throws ApiException {
    return getUsageLambdaWithHttpInfo(startHr, new GetUsageLambdaOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Lambda Get hourly usage for lambda.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLambdaResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLambdaResponse getUsageLambda(
      OffsetDateTime startHr, GetUsageLambdaOptionalParameters parameters) throws ApiException {
    return getUsageLambdaWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Lambda Get hourly usage for lambda.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Logs Get hourly usage for logs.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLogsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsResponse getUsageLogs(OffsetDateTime startHr) throws ApiException {
    return getUsageLogsWithHttpInfo(startHr, new GetUsageLogsOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Logs Get hourly usage for logs.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsResponse getUsageLogs(
      OffsetDateTime startHr, GetUsageLogsOptionalParameters parameters) throws ApiException {
    return getUsageLogsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Logs Get hourly usage for logs.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Logs by Index Get hourly usage for logs by index.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageLogsByIndexResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsByIndexResponse getUsageLogsByIndex(OffsetDateTime startHr) throws ApiException {
    return getUsageLogsByIndexWithHttpInfo(startHr, new GetUsageLogsByIndexOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Logs by Index Get hourly usage for logs by index.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsByIndexResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsByIndexResponse getUsageLogsByIndex(
      OffsetDateTime startHr, GetUsageLogsByIndexOptionalParameters parameters)
      throws ApiException {
    return getUsageLogsByIndexWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Logs by Index Get hourly usage for logs by index.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly logs usage by retention Get hourly usage for indexed logs by retention period.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageLogsByRetentionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsByRetentionResponse getUsageLogsByRetention(OffsetDateTime startHr)
      throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo(
            startHr, new GetUsageLogsByRetentionOptionalParameters())
        .getData();
  }

  /**
   * Get hourly logs usage by retention Get hourly usage for indexed logs by retention period.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageLogsByRetentionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageLogsByRetentionResponse getUsageLogsByRetention(
      OffsetDateTime startHr, GetUsageLogsByRetentionOptionalParameters parameters)
      throws ApiException {
    return getUsageLogsByRetentionWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly logs usage by retention Get hourly usage for indexed logs by retention period.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Network Flows Get hourly usage for network flows.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageNetworkFlowsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageNetworkFlowsResponse getUsageNetworkFlows(OffsetDateTime startHr)
      throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo(startHr, new GetUsageNetworkFlowsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Network Flows Get hourly usage for network flows.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageNetworkFlowsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageNetworkFlowsResponse getUsageNetworkFlows(
      OffsetDateTime startHr, GetUsageNetworkFlowsOptionalParameters parameters)
      throws ApiException {
    return getUsageNetworkFlowsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Network Flows Get hourly usage for network flows.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Network Hosts Get hourly usage for network hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageNetworkHostsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageNetworkHostsResponse getUsageNetworkHosts(OffsetDateTime startHr)
      throws ApiException {
    return getUsageNetworkHostsWithHttpInfo(startHr, new GetUsageNetworkHostsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Network Hosts Get hourly usage for network hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageNetworkHostsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageNetworkHostsResponse getUsageNetworkHosts(
      OffsetDateTime startHr, GetUsageNetworkHostsOptionalParameters parameters)
      throws ApiException {
    return getUsageNetworkHostsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Network Hosts Get hourly usage for network hosts.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for profiled hosts Get hourly usage for profiled hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageProfilingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageProfilingResponse getUsageProfiling(OffsetDateTime startHr) throws ApiException {
    return getUsageProfilingWithHttpInfo(startHr, new GetUsageProfilingOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for profiled hosts Get hourly usage for profiled hosts.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageProfilingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageProfilingResponse getUsageProfiling(
      OffsetDateTime startHr, GetUsageProfilingOptionalParameters parameters) throws ApiException {
    return getUsageProfilingWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for profiled hosts Get hourly usage for profiled hosts.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for RUM Sessions Get hourly usage for
   * [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageRumSessionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageRumSessionsResponse getUsageRumSessions(OffsetDateTime startHr) throws ApiException {
    return getUsageRumSessionsWithHttpInfo(startHr, new GetUsageRumSessionsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for RUM Sessions Get hourly usage for
   * [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageRumSessionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageRumSessionsResponse getUsageRumSessions(
      OffsetDateTime startHr, GetUsageRumSessionsOptionalParameters parameters)
      throws ApiException {
    return getUsageRumSessionsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for RUM Sessions Get hourly usage for
   * [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for SNMP devices Get hourly usage for SNMP devices.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageSNMPResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSNMPResponse getUsageSNMP(OffsetDateTime startHr) throws ApiException {
    return getUsageSNMPWithHttpInfo(startHr, new GetUsageSNMPOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for SNMP devices Get hourly usage for SNMP devices.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSNMPResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSNMPResponse getUsageSNMP(
      OffsetDateTime startHr, GetUsageSNMPOptionalParameters parameters) throws ApiException {
    return getUsageSNMPWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for SNMP devices Get hourly usage for SNMP devices.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get usage across your multi-org account Get usage across your multi-org account. You must have
   * the multi-org feature enabled.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @return UsageSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSummaryResponse getUsageSummary(OffsetDateTime startMonth) throws ApiException {
    return getUsageSummaryWithHttpInfo(startMonth, new GetUsageSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get usage across your multi-org account Get usage across your multi-org account. You must have
   * the multi-org feature enabled.
   *
   * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for
   *     usage beginning in this month. Maximum of 15 months ago. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSummaryResponse getUsageSummary(
      OffsetDateTime startMonth, GetUsageSummaryOptionalParameters parameters) throws ApiException {
    return getUsageSummaryWithHttpInfo(startMonth, parameters).getData();
  }

  /**
   * Get usage across your multi-org account Get usage across your multi-org account. You must have
   * the multi-org feature enabled.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Synthetics Checks Get hourly usage for [Synthetics
   * checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageSyntheticsResponse getUsageSynthetics(OffsetDateTime startHr) throws ApiException {
    return getUsageSyntheticsWithHttpInfo(startHr, new GetUsageSyntheticsOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics Checks Get hourly usage for [Synthetics
   * checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageSyntheticsResponse getUsageSynthetics(
      OffsetDateTime startHr, GetUsageSyntheticsOptionalParameters parameters) throws ApiException {
    return getUsageSyntheticsWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics Checks Get hourly usage for [Synthetics
   * checks](https://docs.datadoghq.com/synthetics/).
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Synthetics API Checks Get hourly usage for [synthetics API
   * checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsAPIResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI(OffsetDateTime startHr)
      throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo(startHr, new GetUsageSyntheticsAPIOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics API Checks Get hourly usage for [synthetics API
   * checks](https://docs.datadoghq.com/synthetics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsAPIResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSyntheticsAPIResponse getUsageSyntheticsAPI(
      OffsetDateTime startHr, GetUsageSyntheticsAPIOptionalParameters parameters)
      throws ApiException {
    return getUsageSyntheticsAPIWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics API Checks Get hourly usage for [synthetics API
   * checks](https://docs.datadoghq.com/synthetics/).
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for Synthetics Browser Checks Get hourly usage for synthetics browser checks.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageSyntheticsBrowserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(OffsetDateTime startHr)
      throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo(
            startHr, new GetUsageSyntheticsBrowserOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Synthetics Browser Checks Get hourly usage for synthetics browser checks.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageSyntheticsBrowserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageSyntheticsBrowserResponse getUsageSyntheticsBrowser(
      OffsetDateTime startHr, GetUsageSyntheticsBrowserOptionalParameters parameters)
      throws ApiException {
    return getUsageSyntheticsBrowserWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Synthetics Browser Checks Get hourly usage for synthetics browser checks.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get hourly usage for custom metrics Get hourly usage for [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageTimeseriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageTimeseriesResponse getUsageTimeseries(OffsetDateTime startHr) throws ApiException {
    return getUsageTimeseriesWithHttpInfo(startHr, new GetUsageTimeseriesOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for custom metrics Get hourly usage for [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageTimeseriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageTimeseriesResponse getUsageTimeseries(
      OffsetDateTime startHr, GetUsageTimeseriesOptionalParameters parameters) throws ApiException {
    return getUsageTimeseriesWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for custom metrics Get hourly usage for [custom
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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
   * Get all custom metrics by hourly average Get all [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. Use
   * the month parameter to get a month-to-date data resolution or use the day parameter to get a
   * daily resolution. One of the two is required, and only one of the two is allowed.
   *
   * @return UsageTopAvgMetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics() throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(new GetUsageTopAvgMetricsOptionalParameters())
        .getData();
  }

  /**
   * Get all custom metrics by hourly average Get all [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. Use
   * the month parameter to get a month-to-date data resolution or use the day parameter to get a
   * daily resolution. One of the two is required, and only one of the two is allowed.
   *
   * @param parameters Optional parameters for the request.
   * @return UsageTopAvgMetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   */
  public UsageTopAvgMetricsResponse getUsageTopAvgMetrics(
      GetUsageTopAvgMetricsOptionalParameters parameters) throws ApiException {
    return getUsageTopAvgMetricsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all custom metrics by hourly average Get all [custom
   * metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. Use
   * the month parameter to get a month-to-date data resolution or use the day parameter to get a
   * daily resolution. One of the two is required, and only one of the two is allowed.
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

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

  /** Manage optional parameters to getUsageTrace. */
  public static class GetUsageTraceOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
     *     ending **before** this hour. (optional)
     * @return GetUsageTraceOptionalParameters
     */
    public GetUsageTraceOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Trace Search Get hourly usage for trace search. **Note** This endpoint has
   * been renamed to &#x60;/api/v1/usage/indexed-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @return UsageTraceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageTraceResponse getUsageTrace(OffsetDateTime startHr) throws ApiException {
    return getUsageTraceWithHttpInfo(startHr, new GetUsageTraceOptionalParameters()).getData();
  }

  /**
   * Get hourly usage for Trace Search Get hourly usage for trace search. **Note** This endpoint has
   * been renamed to &#x60;/api/v1/usage/indexed-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageTraceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public UsageTraceResponse getUsageTrace(
      OffsetDateTime startHr, GetUsageTraceOptionalParameters parameters) throws ApiException {
    return getUsageTraceWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Trace Search Get hourly usage for trace search. **Note** This endpoint has
   * been renamed to &#x60;/api/v1/usage/indexed-spans&#x60;.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage
   *     beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageTraceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UsageTraceResponse> getUsageTraceWithHttpInfo(
      OffsetDateTime startHr, GetUsageTraceOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startHr' when calling getUsageTrace");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v1/usage/traces";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTrace");

    final String[] localVarAccepts = {"application/json;datetime-format=rfc3339"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<UsageTraceResponse> localVarReturnType = new GenericType<UsageTraceResponse>() {};

    return apiClient.invokeAPI(
        "UsageMeteringApi.getUsageTrace",
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
