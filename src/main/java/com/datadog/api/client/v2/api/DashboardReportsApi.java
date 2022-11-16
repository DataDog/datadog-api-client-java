package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DashboardReportCreateRequest;
import com.datadog.api.client.v2.model.DashboardReportResponse;
import com.datadog.api.client.v2.model.DashboardReportUpdateRequest;
import com.datadog.api.client.v2.model.DashboardReportsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportsApi {
  private ApiClient apiClient;

  public DashboardReportsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardReportsApi(ApiClient apiClient) {
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
   * Create a new Dashboard Report.
   *
   * <p>See {@link #createDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to create a dashboard report. (required)
   * @param body (required)
   * @return DashboardReportResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardReportResponse createDashboardReportConfig(
      String dashboardId, DashboardReportCreateRequest body) throws ApiException {
    return createDashboardReportConfigWithHttpInfo(dashboardId, body).getData();
  }

  /**
   * Create a new Dashboard Report.
   *
   * <p>See {@link #createDashboardReportConfigWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the dashboard for which to create a dashboard report. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DashboardReportResponse&gt;
   */
  public CompletableFuture<DashboardReportResponse> createDashboardReportConfigAsync(
      String dashboardId, DashboardReportCreateRequest body) {
    return createDashboardReportConfigWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * New dashboard report configuration for a given dashboard. This creates a new report email
   * schedule, frequency, timeframe, and more.
   *
   * @param dashboardId ID of the dashboard for which to create a dashboard report. (required)
   * @param body (required)
   * @return ApiResponse&lt;DashboardReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardReportResponse> createDashboardReportConfigWithHttpInfo(
      String dashboardId, DashboardReportCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling createDashboardReportConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboardReportConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardReportsApi.createDashboardReportConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardReportResponse>() {});
  }

  /**
   * Create a new Dashboard Report.
   *
   * <p>See {@link #createDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to create a dashboard report. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardReportResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardReportResponse>>
      createDashboardReportConfigWithHttpInfoAsync(
          String dashboardId, DashboardReportCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " createDashboardReportConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createDashboardReportConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardReportsApi.createDashboardReportConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardReportResponse>() {});
  }

  /**
   * Delete a Dashboard Report.
   *
   * <p>See {@link #deleteDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to delete the associated report. (required)
   * @param reportUuid ID of the dashboard report to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardReportConfig(String dashboardId, String reportUuid)
      throws ApiException {
    deleteDashboardReportConfigWithHttpInfo(dashboardId, reportUuid);
  }

  /**
   * Delete a Dashboard Report.
   *
   * <p>See {@link #deleteDashboardReportConfigWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the dashboard for which to delete the associated report. (required)
   * @param reportUuid ID of the dashboard report to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDashboardReportConfigAsync(
      String dashboardId, String reportUuid) {
    return deleteDashboardReportConfigWithHttpInfoAsync(dashboardId, reportUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard report configuration, disabling the sending of scheduled emails for this
   * report in the future. This operation cannot be undone. To pause the sending of emails for this
   * report without deleting it, deactivate the report with a <code>PATCH</code> request.
   *
   * @param dashboardId ID of the dashboard for which to delete the associated report. (required)
   * @param reportUuid ID of the dashboard report to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDashboardReportConfigWithHttpInfo(
      String dashboardId, String reportUuid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling deleteDashboardReportConfig");
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'reportUuid' when calling deleteDashboardReportConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardReportsApi.deleteDashboardReportConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a Dashboard Report.
   *
   * <p>See {@link #deleteDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to delete the associated report. (required)
   * @param reportUuid ID of the dashboard report to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDashboardReportConfigWithHttpInfoAsync(
      String dashboardId, String reportUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " deleteDashboardReportConfig"));
      return result;
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'reportUuid' when calling"
                  + " deleteDashboardReportConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardReportsApi.deleteDashboardReportConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a Dashboard Report.
   *
   * <p>See {@link #getDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to get the associated dashboard report.
   *     (required)
   * @param reportUuid ID of the dashboard report to get. (required)
   * @return DashboardReportResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardReportResponse getDashboardReportConfig(String dashboardId, String reportUuid)
      throws ApiException {
    return getDashboardReportConfigWithHttpInfo(dashboardId, reportUuid).getData();
  }

  /**
   * Get a Dashboard Report.
   *
   * <p>See {@link #getDashboardReportConfigWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the dashboard for which to get the associated dashboard report.
   *     (required)
   * @param reportUuid ID of the dashboard report to get. (required)
   * @return CompletableFuture&lt;DashboardReportResponse&gt;
   */
  public CompletableFuture<DashboardReportResponse> getDashboardReportConfigAsync(
      String dashboardId, String reportUuid) {
    return getDashboardReportConfigWithHttpInfoAsync(dashboardId, reportUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetch a single Dashboard Report configuration. This includes the same information provided when
   * fetching a dashboard's list of currently configured reports, but only for singular reports.
   *
   * @param dashboardId ID of the dashboard for which to get the associated dashboard report.
   *     (required)
   * @param reportUuid ID of the dashboard report to get. (required)
   * @return ApiResponse&lt;DashboardReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardReportResponse> getDashboardReportConfigWithHttpInfo(
      String dashboardId, String reportUuid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling getDashboardReportConfig");
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'reportUuid' when calling getDashboardReportConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardReportsApi.getDashboardReportConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardReportResponse>() {});
  }

  /**
   * Get a Dashboard Report.
   *
   * <p>See {@link #getDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to get the associated dashboard report.
   *     (required)
   * @param reportUuid ID of the dashboard report to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardReportResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardReportResponse>>
      getDashboardReportConfigWithHttpInfoAsync(String dashboardId, String reportUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " getDashboardReportConfig"));
      return result;
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'reportUuid' when calling getDashboardReportConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardReportsApi.getDashboardReportConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardReportResponse>() {});
  }

  /**
   * Get Dashboard Reports for a Dashboard.
   *
   * <p>See {@link #getDashboardReportConfigsListWithHttpInfo}.
   *
   * @param dashboardId ID of the Dashboard for which to get all dashboard reports. (required)
   * @return DashboardReportsResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardReportsResponse getDashboardReportConfigsList(String dashboardId)
      throws ApiException {
    return getDashboardReportConfigsListWithHttpInfo(dashboardId).getData();
  }

  /**
   * Get Dashboard Reports for a Dashboard.
   *
   * <p>See {@link #getDashboardReportConfigsListWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the Dashboard for which to get all dashboard reports. (required)
   * @return CompletableFuture&lt;DashboardReportsResponse&gt;
   */
  public CompletableFuture<DashboardReportsResponse> getDashboardReportConfigsListAsync(
      String dashboardId) {
    return getDashboardReportConfigsListWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List of the dashboard reports configured on a given dashboard. This list includes report
   * configurations that are both enabled and disabled, but does not include reports that have been
   * deleted for the given dashboard.
   *
   * @param dashboardId ID of the Dashboard for which to get all dashboard reports. (required)
   * @return ApiResponse&lt;DashboardReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardReportsResponse> getDashboardReportConfigsListWithHttpInfo(
      String dashboardId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling"
              + " getDashboardReportConfigsList");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardReportsApi.getDashboardReportConfigsList",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardReportsResponse>() {});
  }

  /**
   * Get Dashboard Reports for a Dashboard.
   *
   * <p>See {@link #getDashboardReportConfigsListWithHttpInfo}.
   *
   * @param dashboardId ID of the Dashboard for which to get all dashboard reports. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardReportsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardReportsResponse>>
      getDashboardReportConfigsListWithHttpInfoAsync(String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardReportsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " getDashboardReportConfigsList"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardReportsApi.getDashboardReportConfigsList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardReportsResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardReportsResponse>() {});
  }

  /**
   * Update Dashboard Report.
   *
   * <p>See {@link #updateDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to update the associated report. (required)
   * @param reportUuid ID of the dashboard report to update. (required)
   * @param body (required)
   * @return DashboardReportResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardReportResponse updateDashboardReportConfig(
      String dashboardId, String reportUuid, DashboardReportUpdateRequest body)
      throws ApiException {
    return updateDashboardReportConfigWithHttpInfo(dashboardId, reportUuid, body).getData();
  }

  /**
   * Update Dashboard Report.
   *
   * <p>See {@link #updateDashboardReportConfigWithHttpInfoAsync}.
   *
   * @param dashboardId ID of the dashboard for which to update the associated report. (required)
   * @param reportUuid ID of the dashboard report to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DashboardReportResponse&gt;
   */
  public CompletableFuture<DashboardReportResponse> updateDashboardReportConfigAsync(
      String dashboardId, String reportUuid, DashboardReportUpdateRequest body) {
    return updateDashboardReportConfigWithHttpInfoAsync(dashboardId, reportUuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Dashboard Report configuration, including the schedule and email settings. Changes to
   * the schedule happen immediately, but it may take up to five minutes for your report to be sent
   * if the scheduled time is close to the time of the update request.
   *
   * @param dashboardId ID of the dashboard for which to update the associated report. (required)
   * @param reportUuid ID of the dashboard report to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;DashboardReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardReportResponse> updateDashboardReportConfigWithHttpInfo(
      String dashboardId, String reportUuid, DashboardReportUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'dashboardId' when calling updateDashboardReportConfig");
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'reportUuid' when calling updateDashboardReportConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboardReportConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DashboardReportsApi.updateDashboardReportConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardReportResponse>() {});
  }

  /**
   * Update Dashboard Report.
   *
   * <p>See {@link #updateDashboardReportConfigWithHttpInfo}.
   *
   * @param dashboardId ID of the dashboard for which to update the associated report. (required)
   * @param reportUuid ID of the dashboard report to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardReportResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardReportResponse>>
      updateDashboardReportConfigWithHttpInfoAsync(
          String dashboardId, String reportUuid, DashboardReportUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dashboardId' when calling"
                  + " updateDashboardReportConfig"));
      return result;
    }

    // verify the required parameter 'reportUuid' is set
    if (reportUuid == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'reportUuid' when calling"
                  + " updateDashboardReportConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateDashboardReportConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dashboards/{dashboard_id}/reports/{report_uuid}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()))
            .replaceAll(
                "\\{" + "report_uuid" + "\\}", apiClient.escapeString(reportUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "DashboardReportsApi.updateDashboardReportConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardReportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardReportResponse>() {});
  }
}
