package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ReportScheduleCreateRequest;
import com.datadog.api.client.v2.model.ReportSchedulePatchRequest;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportSchedulesApi {
  private ApiClient apiClient;

  public ReportSchedulesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ReportSchedulesApi(ApiClient apiClient) {
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
   * Create a report schedule.
   *
   * <p>See {@link #createReportScheduleWithHttpInfo}.
   *
   * @param body (required)
   * @return ReportScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleResponse createReportSchedule(ReportScheduleCreateRequest body)
      throws ApiException {
    return createReportScheduleWithHttpInfo(body).getData();
  }

  /**
   * Create a report schedule.
   *
   * <p>See {@link #createReportScheduleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ReportScheduleResponse&gt;
   */
  public CompletableFuture<ReportScheduleResponse> createReportScheduleAsync(
      ReportScheduleCreateRequest body) {
    return createReportScheduleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new scheduled report. A schedule renders a dashboard or integration dashboard on a
   * recurring cadence and delivers it to the configured recipients over email, Slack, or Microsoft
   * Teams. Requires the <code>generate_dashboard_reports</code> permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;ReportScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ReportScheduleResponse> createReportScheduleWithHttpInfo(
      ReportScheduleCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createReportSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createReportSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/reporting/schedule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.createReportSchedule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Create a report schedule.
   *
   * <p>See {@link #createReportScheduleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleResponse>>
      createReportScheduleWithHttpInfoAsync(ReportScheduleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createReportSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createReportSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/reporting/schedule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportSchedulesApi.createReportSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
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
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Update a report schedule.
   *
   * <p>See {@link #patchReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to update. (required)
   * @param body (required)
   * @return ReportScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleResponse patchReportSchedule(
      UUID scheduleUuid, ReportSchedulePatchRequest body) throws ApiException {
    return patchReportScheduleWithHttpInfo(scheduleUuid, body).getData();
  }

  /**
   * Update a report schedule.
   *
   * <p>See {@link #patchReportScheduleWithHttpInfoAsync}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ReportScheduleResponse&gt;
   */
  public CompletableFuture<ReportScheduleResponse> patchReportScheduleAsync(
      UUID scheduleUuid, ReportSchedulePatchRequest body) {
    return patchReportScheduleWithHttpInfoAsync(scheduleUuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing scheduled report by its identifier. The editable attributes are replaced
   * with the supplied values; the targeted resource (<code>resource_id</code> and <code>
   * resource_type</code>) cannot be changed after creation. Requires the <code>
   * generate_dashboard_reports</code> permission and schedule ownership.
   *
   * @param scheduleUuid The unique identifier of the report schedule to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;ReportScheduleResponse&gt;
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
  public ApiResponse<ReportScheduleResponse> patchReportScheduleWithHttpInfo(
      UUID scheduleUuid, ReportSchedulePatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "patchReportSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleUuid' when calling patchReportSchedule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchReportSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.patchReportSchedule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Update a report schedule.
   *
   * <p>See {@link #patchReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleResponse>>
      patchReportScheduleWithHttpInfoAsync(UUID scheduleUuid, ReportSchedulePatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "patchReportSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scheduleUuid' when calling patchReportSchedule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchReportSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportSchedulesApi.patchReportSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
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
        new GenericType<ReportScheduleResponse>() {});
  }
}
