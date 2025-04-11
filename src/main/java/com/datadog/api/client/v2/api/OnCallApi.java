package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleCreateRequest;
import com.datadog.api.client.v2.model.ScheduleUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallApi {
  private ApiClient apiClient;

  public OnCallApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OnCallApi(ApiClient apiClient) {
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

  /** Manage optional parameters to createOnCallSchedule. */
  public static class CreateOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>
     *     layers.members.user</code>. (optional)
     * @return CreateOnCallScheduleOptionalParameters
     */
    public CreateOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create on-call schedule.
   *
   * <p>See {@link #createOnCallScheduleWithHttpInfo}.
   *
   * @param body (required)
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule createOnCallSchedule(ScheduleCreateRequest body) throws ApiException {
    return createOnCallScheduleWithHttpInfo(body, new CreateOnCallScheduleOptionalParameters())
        .getData();
  }

  /**
   * Create on-call schedule.
   *
   * <p>See {@link #createOnCallScheduleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> createOnCallScheduleAsync(ScheduleCreateRequest body) {
    return createOnCallScheduleWithHttpInfoAsync(body, new CreateOnCallScheduleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create on-call schedule.
   *
   * <p>See {@link #createOnCallScheduleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule createOnCallSchedule(
      ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters)
      throws ApiException {
    return createOnCallScheduleWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create on-call schedule.
   *
   * <p>See {@link #createOnCallScheduleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> createOnCallScheduleAsync(
      ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) {
    return createOnCallScheduleWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new on-call schedule
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Schedule> createOnCallScheduleWithHttpInfo(
      ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.createOnCallSchedule",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<Schedule>() {});
  }

  /**
   * Create on-call schedule.
   *
   * <p>See {@link #createOnCallScheduleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> createOnCallScheduleWithHttpInfoAsync(
      ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOnCallSchedule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.createOnCallSchedule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
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
        new GenericType<Schedule>() {});
  }

  /**
   * Delete on-call schedule.
   *
   * <p>See {@link #deleteOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOnCallSchedule(String scheduleId) throws ApiException {
    deleteOnCallScheduleWithHttpInfo(scheduleId);
  }

  /**
   * Delete on-call schedule.
   *
   * <p>See {@link #deleteOnCallScheduleWithHttpInfoAsync}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOnCallScheduleAsync(String scheduleId) {
    return deleteOnCallScheduleWithHttpInfoAsync(scheduleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an on-call schedule
   *
   * @param scheduleId The ID of the schedule (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOnCallScheduleWithHttpInfo(String scheduleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleId' when calling deleteOnCallSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.deleteOnCallSchedule",
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
   * Delete on-call schedule.
   *
   * <p>See {@link #deleteOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOnCallScheduleWithHttpInfoAsync(
      String scheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scheduleId' when calling deleteOnCallSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.deleteOnCallSchedule",
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

  /** Manage optional parameters to getOnCallSchedule. */
  public static class GetOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>
     *     layers.members.user</code>. (optional)
     * @return GetOnCallScheduleOptionalParameters
     */
    public GetOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get on-call schedule.
   *
   * <p>See {@link #getOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule getOnCallSchedule(String scheduleId) throws ApiException {
    return getOnCallScheduleWithHttpInfo(scheduleId, new GetOnCallScheduleOptionalParameters())
        .getData();
  }

  /**
   * Get on-call schedule.
   *
   * <p>See {@link #getOnCallScheduleWithHttpInfoAsync}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> getOnCallScheduleAsync(String scheduleId) {
    return getOnCallScheduleWithHttpInfoAsync(scheduleId, new GetOnCallScheduleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get on-call schedule.
   *
   * <p>See {@link #getOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule getOnCallSchedule(
      String scheduleId, GetOnCallScheduleOptionalParameters parameters) throws ApiException {
    return getOnCallScheduleWithHttpInfo(scheduleId, parameters).getData();
  }

  /**
   * Get on-call schedule.
   *
   * <p>See {@link #getOnCallScheduleWithHttpInfoAsync}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> getOnCallScheduleAsync(
      String scheduleId, GetOnCallScheduleOptionalParameters parameters) {
    return getOnCallScheduleWithHttpInfoAsync(scheduleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an on-call schedule
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Schedule> getOnCallScheduleWithHttpInfo(
      String scheduleId, GetOnCallScheduleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleId' when calling getOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.getOnCallSchedule",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<Schedule>() {});
  }

  /**
   * Get on-call schedule.
   *
   * <p>See {@link #getOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> getOnCallScheduleWithHttpInfoAsync(
      String scheduleId, GetOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'scheduleId' when calling getOnCallSchedule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.getOnCallSchedule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
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
        new GenericType<Schedule>() {});
  }

  /** Manage optional parameters to updateOnCallSchedule. */
  public static class UpdateOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>
     *     layers.members.user</code>. (optional)
     * @return UpdateOnCallScheduleOptionalParameters
     */
    public UpdateOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update on-call schedule.
   *
   * <p>See {@link #updateOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule updateOnCallSchedule(String scheduleId, ScheduleUpdateRequest body)
      throws ApiException {
    return updateOnCallScheduleWithHttpInfo(
            scheduleId, body, new UpdateOnCallScheduleOptionalParameters())
        .getData();
  }

  /**
   * Update on-call schedule.
   *
   * <p>See {@link #updateOnCallScheduleWithHttpInfoAsync}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> updateOnCallScheduleAsync(
      String scheduleId, ScheduleUpdateRequest body) {
    return updateOnCallScheduleWithHttpInfoAsync(
            scheduleId, body, new UpdateOnCallScheduleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update on-call schedule.
   *
   * <p>See {@link #updateOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Schedule
   * @throws ApiException if fails to make API call
   */
  public Schedule updateOnCallSchedule(
      String scheduleId,
      ScheduleUpdateRequest body,
      UpdateOnCallScheduleOptionalParameters parameters)
      throws ApiException {
    return updateOnCallScheduleWithHttpInfo(scheduleId, body, parameters).getData();
  }

  /**
   * Update on-call schedule.
   *
   * <p>See {@link #updateOnCallScheduleWithHttpInfoAsync}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Schedule&gt;
   */
  public CompletableFuture<Schedule> updateOnCallScheduleAsync(
      String scheduleId,
      ScheduleUpdateRequest body,
      UpdateOnCallScheduleOptionalParameters parameters) {
    return updateOnCallScheduleWithHttpInfoAsync(scheduleId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a new on-call schedule
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Schedule> updateOnCallScheduleWithHttpInfo(
      String scheduleId,
      ScheduleUpdateRequest body,
      UpdateOnCallScheduleOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'scheduleId' when calling updateOnCallSchedule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.updateOnCallSchedule",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Schedule>() {});
  }

  /**
   * Update on-call schedule.
   *
   * <p>See {@link #updateOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> updateOnCallScheduleWithHttpInfoAsync(
      String scheduleId,
      ScheduleUpdateRequest body,
      UpdateOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'scheduleId' when calling updateOnCallSchedule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOnCallSchedule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/schedules/{schedule_id}"
            .replaceAll(
                "\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.updateOnCallSchedule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Schedule>() {});
  }
}
