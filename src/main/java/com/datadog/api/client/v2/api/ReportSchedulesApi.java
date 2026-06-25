package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ReportScheduleCreateRequest;
import com.datadog.api.client.v2.model.ReportScheduleListResponse;
import com.datadog.api.client.v2.model.ReportSchedulePatchRequest;
import com.datadog.api.client.v2.model.ReportScheduleResourceType;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import com.datadog.api.client.v2.model.ReportScheduleToggleRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
   * Delete a report schedule.
   *
   * <p>See {@link #deleteReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to delete. (required)
   * @return ReportScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleResponse deleteReportSchedule(UUID scheduleUuid) throws ApiException {
    return deleteReportScheduleWithHttpInfo(scheduleUuid).getData();
  }

  /**
   * Delete a report schedule.
   *
   * <p>See {@link #deleteReportScheduleWithHttpInfoAsync}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to delete. (required)
   * @return CompletableFuture&lt;ReportScheduleResponse&gt;
   */
  public CompletableFuture<ReportScheduleResponse> deleteReportScheduleAsync(UUID scheduleUuid) {
    return deleteReportScheduleWithHttpInfoAsync(scheduleUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a report schedule by its unique identifier. The response returns the deleted schedule.
   * Requires a reporting write permission appropriate to the targeted resource type and schedule
   * ownership.
   *
   * @param scheduleUuid The unique identifier of the report schedule to delete. (required)
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
  public ApiResponse<ReportScheduleResponse> deleteReportScheduleWithHttpInfo(UUID scheduleUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleUuid' when calling deleteReportSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.deleteReportSchedule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Delete a report schedule.
   *
   * <p>See {@link #deleteReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleResponse>>
      deleteReportScheduleWithHttpInfoAsync(UUID scheduleUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scheduleUuid' when calling deleteReportSchedule"));
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
              "v2.ReportSchedulesApi.deleteReportSchedule",
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
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Get a report schedule.
   *
   * <p>See {@link #getReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to fetch. (required)
   * @return ReportScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleResponse getReportSchedule(UUID scheduleUuid) throws ApiException {
    return getReportScheduleWithHttpInfo(scheduleUuid).getData();
  }

  /**
   * Get a report schedule.
   *
   * <p>See {@link #getReportScheduleWithHttpInfoAsync}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to fetch. (required)
   * @return CompletableFuture&lt;ReportScheduleResponse&gt;
   */
  public CompletableFuture<ReportScheduleResponse> getReportScheduleAsync(UUID scheduleUuid) {
    return getReportScheduleWithHttpInfoAsync(scheduleUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a report schedule by its unique identifier. Requires a reporting read permission
   * appropriate to the targeted resource type.
   *
   * @param scheduleUuid The unique identifier of the report schedule to fetch. (required)
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
  public ApiResponse<ReportScheduleResponse> getReportScheduleWithHttpInfo(UUID scheduleUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleUuid' when calling getReportSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.getReportSchedule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Get a report schedule.
   *
   * <p>See {@link #getReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to fetch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleResponse>> getReportScheduleWithHttpInfoAsync(
      UUID scheduleUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scheduleUuid' when calling getReportSchedule"));
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
              "v2.ReportSchedulesApi.getReportSchedule",
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
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleResponse>() {});
  }

  /**
   * Get report schedules for a resource.
   *
   * <p>See {@link #getReportSchedulesForResourceWithHttpInfo}.
   *
   * @param resourceType The type of resource to fetch report schedules for. (required)
   * @param resourceId The identifier of the resource to fetch report schedules for. (required)
   * @return ReportScheduleListResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleListResponse getReportSchedulesForResource(
      ReportScheduleResourceType resourceType, String resourceId) throws ApiException {
    return getReportSchedulesForResourceWithHttpInfo(resourceType, resourceId).getData();
  }

  /**
   * Get report schedules for a resource.
   *
   * <p>See {@link #getReportSchedulesForResourceWithHttpInfoAsync}.
   *
   * @param resourceType The type of resource to fetch report schedules for. (required)
   * @param resourceId The identifier of the resource to fetch report schedules for. (required)
   * @return CompletableFuture&lt;ReportScheduleListResponse&gt;
   */
  public CompletableFuture<ReportScheduleListResponse> getReportSchedulesForResourceAsync(
      ReportScheduleResourceType resourceType, String resourceId) {
    return getReportSchedulesForResourceWithHttpInfoAsync(resourceType, resourceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all report schedules that target a dashboard or integration dashboard resource. Requires a
   * reporting read permission appropriate to the targeted resource type.
   *
   * @param resourceType The type of resource to fetch report schedules for. (required)
   * @param resourceId The identifier of the resource to fetch report schedules for. (required)
   * @return ApiResponse&lt;ReportScheduleListResponse&gt;
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
  public ApiResponse<ReportScheduleListResponse> getReportSchedulesForResourceWithHttpInfo(
      ReportScheduleResourceType resourceType, String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceType' is set
    if (resourceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'resourceType' when calling"
              + " getReportSchedulesForResource");
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'resourceId' when calling getReportSchedulesForResource");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{resource_type}/{resource_id}"
            .replaceAll(
                "\\{" + "resource_type" + "\\}", apiClient.escapeString(resourceType.toString()))
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.getReportSchedulesForResource",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleListResponse>() {});
  }

  /**
   * Get report schedules for a resource.
   *
   * <p>See {@link #getReportSchedulesForResourceWithHttpInfo}.
   *
   * @param resourceType The type of resource to fetch report schedules for. (required)
   * @param resourceId The identifier of the resource to fetch report schedules for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleListResponse>>
      getReportSchedulesForResourceWithHttpInfoAsync(
          ReportScheduleResourceType resourceType, String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceType' is set
    if (resourceType == null) {
      CompletableFuture<ApiResponse<ReportScheduleListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceType' when calling"
                  + " getReportSchedulesForResource"));
      return result;
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<ReportScheduleListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling"
                  + " getReportSchedulesForResource"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{resource_type}/{resource_id}"
            .replaceAll(
                "\\{" + "resource_type" + "\\}", apiClient.escapeString(resourceType.toString()))
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportSchedulesApi.getReportSchedulesForResource",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReportScheduleListResponse>> result = new CompletableFuture<>();
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
        new GenericType<ReportScheduleListResponse>() {});
  }

  /** Manage optional parameters to listReportSchedules. */
  public static class ListReportSchedulesOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;
    private String filterTitle;
    private UUID filterAuthorUuid;
    private String filterRecipients;

    /**
     * Set pageLimit.
     *
     * @param pageLimit The maximum number of schedules to return. The maximum value is 50.
     *     (optional, default to 25)
     * @return ListReportSchedulesOptionalParameters
     */
    public ListReportSchedulesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset The offset from which to start returning schedules. (optional, default to
     *     0)
     * @return ListReportSchedulesOptionalParameters
     */
    public ListReportSchedulesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filterTitle.
     *
     * @param filterTitle Filter schedules by report title. (optional)
     * @return ListReportSchedulesOptionalParameters
     */
    public ListReportSchedulesOptionalParameters filterTitle(String filterTitle) {
      this.filterTitle = filterTitle;
      return this;
    }

    /**
     * Set filterAuthorUuid.
     *
     * @param filterAuthorUuid Filter schedules by author UUID. (optional)
     * @return ListReportSchedulesOptionalParameters
     */
    public ListReportSchedulesOptionalParameters filterAuthorUuid(UUID filterAuthorUuid) {
      this.filterAuthorUuid = filterAuthorUuid;
      return this;
    }

    /**
     * Set filterRecipients.
     *
     * @param filterRecipients Filter schedules by a comma-separated list of recipients. (optional)
     * @return ListReportSchedulesOptionalParameters
     */
    public ListReportSchedulesOptionalParameters filterRecipients(String filterRecipients) {
      this.filterRecipients = filterRecipients;
      return this;
    }
  }

  /**
   * List report schedules.
   *
   * <p>See {@link #listReportSchedulesWithHttpInfo}.
   *
   * @return ReportScheduleListResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleListResponse listReportSchedules() throws ApiException {
    return listReportSchedulesWithHttpInfo(new ListReportSchedulesOptionalParameters()).getData();
  }

  /**
   * List report schedules.
   *
   * <p>See {@link #listReportSchedulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ReportScheduleListResponse&gt;
   */
  public CompletableFuture<ReportScheduleListResponse> listReportSchedulesAsync() {
    return listReportSchedulesWithHttpInfoAsync(new ListReportSchedulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List report schedules.
   *
   * <p>See {@link #listReportSchedulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ReportScheduleListResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleListResponse listReportSchedules(
      ListReportSchedulesOptionalParameters parameters) throws ApiException {
    return listReportSchedulesWithHttpInfo(parameters).getData();
  }

  /**
   * List report schedules.
   *
   * <p>See {@link #listReportSchedulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ReportScheduleListResponse&gt;
   */
  public CompletableFuture<ReportScheduleListResponse> listReportSchedulesAsync(
      ListReportSchedulesOptionalParameters parameters) {
    return listReportSchedulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List dashboard and integration dashboard report schedules for the organization. The response is
   * paginated and can be filtered by title, author UUID, or recipients. Requires the <code>
   * generate_dashboard_reports</code> permission.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ReportScheduleListResponse&gt;
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
  public ApiResponse<ReportScheduleListResponse> listReportSchedulesWithHttpInfo(
      ListReportSchedulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterTitle = parameters.filterTitle;
    UUID filterAuthorUuid = parameters.filterAuthorUuid;
    String filterRecipients = parameters.filterRecipients;
    // create path and map variables
    String localVarPath = "/api/v2/reporting/schedule/list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[author_uuid]", filterAuthorUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[recipients]", filterRecipients));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.listReportSchedules",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ReportScheduleListResponse>() {});
  }

  /**
   * List report schedules.
   *
   * <p>See {@link #listReportSchedulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleListResponse>>
      listReportSchedulesWithHttpInfoAsync(ListReportSchedulesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterTitle = parameters.filterTitle;
    UUID filterAuthorUuid = parameters.filterAuthorUuid;
    String filterRecipients = parameters.filterRecipients;
    // create path and map variables
    String localVarPath = "/api/v2/reporting/schedule/list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[author_uuid]", filterAuthorUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[recipients]", filterRecipients));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportSchedulesApi.listReportSchedules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReportScheduleListResponse>> result = new CompletableFuture<>();
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
        new GenericType<ReportScheduleListResponse>() {});
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

  /**
   * Toggle a report schedule.
   *
   * <p>See {@link #toggleReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to toggle. (required)
   * @param body (required)
   * @return ReportScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleResponse toggleReportSchedule(
      UUID scheduleUuid, ReportScheduleToggleRequest body) throws ApiException {
    return toggleReportScheduleWithHttpInfo(scheduleUuid, body).getData();
  }

  /**
   * Toggle a report schedule.
   *
   * <p>See {@link #toggleReportScheduleWithHttpInfoAsync}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to toggle. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ReportScheduleResponse&gt;
   */
  public CompletableFuture<ReportScheduleResponse> toggleReportScheduleAsync(
      UUID scheduleUuid, ReportScheduleToggleRequest body) {
    return toggleReportScheduleWithHttpInfoAsync(scheduleUuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Activate or pause a report schedule by setting its status to <code>active</code> or <code>
   * inactive</code>. Requires a reporting write permission appropriate to the targeted resource
   * type and schedule ownership.
   *
   * @param scheduleUuid The unique identifier of the report schedule to toggle. (required)
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
  public ApiResponse<ReportScheduleResponse> toggleReportScheduleWithHttpInfo(
      UUID scheduleUuid, ReportScheduleToggleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleUuid' when calling toggleReportSchedule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling toggleReportSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}/toggle"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReportSchedulesApi.toggleReportSchedule",
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
   * Toggle a report schedule.
   *
   * <p>See {@link #toggleReportScheduleWithHttpInfo}.
   *
   * @param scheduleUuid The unique identifier of the report schedule to toggle. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReportScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReportScheduleResponse>>
      toggleReportScheduleWithHttpInfoAsync(UUID scheduleUuid, ReportScheduleToggleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleUuid' is set
    if (scheduleUuid == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scheduleUuid' when calling toggleReportSchedule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ReportScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling toggleReportSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reporting/schedule/{schedule_uuid}/toggle"
            .replaceAll(
                "\\{" + "schedule_uuid" + "\\}", apiClient.escapeString(scheduleUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReportSchedulesApi.toggleReportSchedule",
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
