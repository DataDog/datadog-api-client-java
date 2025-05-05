package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequest;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleCreateRequest;
import com.datadog.api.client.v2.model.ScheduleUpdateRequest;
import com.datadog.api.client.v2.model.TeamRoutingRules;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequest;
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

  /** Manage optional parameters to createOnCallEscalationPolicy. */
  public static class CreateOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return CreateOnCallEscalationPolicyOptionalParameters
     */
    public CreateOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create on-call escalation policy.
   *
   * <p>See {@link #createOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy createOnCallEscalationPolicy(EscalationPolicyCreateRequest body)
      throws ApiException {
    return createOnCallEscalationPolicyWithHttpInfo(
            body, new CreateOnCallEscalationPolicyOptionalParameters())
        .getData();
  }

  /**
   * Create on-call escalation policy.
   *
   * <p>See {@link #createOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> createOnCallEscalationPolicyAsync(
      EscalationPolicyCreateRequest body) {
    return createOnCallEscalationPolicyWithHttpInfoAsync(
            body, new CreateOnCallEscalationPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create on-call escalation policy.
   *
   * <p>See {@link #createOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy createOnCallEscalationPolicy(
      EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters)
      throws ApiException {
    return createOnCallEscalationPolicyWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create on-call escalation policy.
   *
   * <p>See {@link #createOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> createOnCallEscalationPolicyAsync(
      EscalationPolicyCreateRequest body,
      CreateOnCallEscalationPolicyOptionalParameters parameters) {
    return createOnCallEscalationPolicyWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new on-call escalation policy
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
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
  public ApiResponse<EscalationPolicy> createOnCallEscalationPolicyWithHttpInfo(
      EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.createOnCallEscalationPolicy",
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
        new GenericType<EscalationPolicy>() {});
  }

  /**
   * Create on-call escalation policy.
   *
   * <p>See {@link #createOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>>
      createOnCallEscalationPolicyWithHttpInfoAsync(
          EscalationPolicyCreateRequest body,
          CreateOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createOnCallEscalationPolicy"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.createOnCallEscalationPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
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
        new GenericType<EscalationPolicy>() {});
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
   * Delete on-call escalation policy.
   *
   * <p>See {@link #deleteOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOnCallEscalationPolicy(String policyId) throws ApiException {
    deleteOnCallEscalationPolicyWithHttpInfo(policyId);
  }

  /**
   * Delete on-call escalation policy.
   *
   * <p>See {@link #deleteOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOnCallEscalationPolicyAsync(String policyId) {
    return deleteOnCallEscalationPolicyWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an on-call escalation policy
   *
   * @param policyId The ID of the escalation policy (required)
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
  public ApiResponse<Void> deleteOnCallEscalationPolicyWithHttpInfo(String policyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'policyId' when calling deleteOnCallEscalationPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.deleteOnCallEscalationPolicy",
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
   * Delete on-call escalation policy.
   *
   * <p>See {@link #deleteOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOnCallEscalationPolicyWithHttpInfoAsync(
      String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling"
                  + " deleteOnCallEscalationPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.deleteOnCallEscalationPolicy",
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

  /** Manage optional parameters to getOnCallEscalationPolicy. */
  public static class GetOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return GetOnCallEscalationPolicyOptionalParameters
     */
    public GetOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get on-call escalation policy.
   *
   * <p>See {@link #getOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy getOnCallEscalationPolicy(String policyId) throws ApiException {
    return getOnCallEscalationPolicyWithHttpInfo(
            policyId, new GetOnCallEscalationPolicyOptionalParameters())
        .getData();
  }

  /**
   * Get on-call escalation policy.
   *
   * <p>See {@link #getOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> getOnCallEscalationPolicyAsync(String policyId) {
    return getOnCallEscalationPolicyWithHttpInfoAsync(
            policyId, new GetOnCallEscalationPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get on-call escalation policy.
   *
   * <p>See {@link #getOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy getOnCallEscalationPolicy(
      String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    return getOnCallEscalationPolicyWithHttpInfo(policyId, parameters).getData();
  }

  /**
   * Get on-call escalation policy.
   *
   * <p>See {@link #getOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> getOnCallEscalationPolicyAsync(
      String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) {
    return getOnCallEscalationPolicyWithHttpInfoAsync(policyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an on-call escalation policy
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
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
  public ApiResponse<EscalationPolicy> getOnCallEscalationPolicyWithHttpInfo(
      String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling getOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.getOnCallEscalationPolicy",
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
        new GenericType<EscalationPolicy>() {});
  }

  /**
   * Get on-call escalation policy.
   *
   * <p>See {@link #getOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>>
      getOnCallEscalationPolicyWithHttpInfoAsync(
          String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling getOnCallEscalationPolicy"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.getOnCallEscalationPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
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
        new GenericType<EscalationPolicy>() {});
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

  /** Manage optional parameters to getOnCallTeamRoutingRules. */
  public static class GetOnCallTeamRoutingRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>rules</code>, <code>rules.policy</code>. (optional)
     * @return GetOnCallTeamRoutingRulesOptionalParameters
     */
    public GetOnCallTeamRoutingRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get on-call team routing rules.
   *
   * <p>See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @return TeamRoutingRules
   * @throws ApiException if fails to make API call
   */
  public TeamRoutingRules getOnCallTeamRoutingRules(String teamId) throws ApiException {
    return getOnCallTeamRoutingRulesWithHttpInfo(
            teamId, new GetOnCallTeamRoutingRulesOptionalParameters())
        .getData();
  }

  /**
   * Get on-call team routing rules.
   *
   * <p>See {@link #getOnCallTeamRoutingRulesWithHttpInfoAsync}.
   *
   * @param teamId The team ID (required)
   * @return CompletableFuture&lt;TeamRoutingRules&gt;
   */
  public CompletableFuture<TeamRoutingRules> getOnCallTeamRoutingRulesAsync(String teamId) {
    return getOnCallTeamRoutingRulesWithHttpInfoAsync(
            teamId, new GetOnCallTeamRoutingRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get on-call team routing rules.
   *
   * <p>See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return TeamRoutingRules
   * @throws ApiException if fails to make API call
   */
  public TeamRoutingRules getOnCallTeamRoutingRules(
      String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    return getOnCallTeamRoutingRulesWithHttpInfo(teamId, parameters).getData();
  }

  /**
   * Get on-call team routing rules.
   *
   * <p>See {@link #getOnCallTeamRoutingRulesWithHttpInfoAsync}.
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamRoutingRules&gt;
   */
  public CompletableFuture<TeamRoutingRules> getOnCallTeamRoutingRulesAsync(
      String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) {
    return getOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a team's on-call routing rules
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamRoutingRules&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamRoutingRules> getOnCallTeamRoutingRulesWithHttpInfo(
      String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getOnCallTeamRoutingRules");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/teams/{team_id}/routing-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.getOnCallTeamRoutingRules",
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
        new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Get on-call team routing rules.
   *
   * <p>See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamRoutingRules&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamRoutingRules>>
      getOnCallTeamRoutingRulesWithHttpInfoAsync(
          String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling getOnCallTeamRoutingRules"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/teams/{team_id}/routing-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.getOnCallTeamRoutingRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
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
        new GenericType<TeamRoutingRules>() {});
  }

  /** Manage optional parameters to setOnCallTeamRoutingRules. */
  public static class SetOnCallTeamRoutingRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>rules</code>, <code>rules.policy</code>. (optional)
     * @return SetOnCallTeamRoutingRulesOptionalParameters
     */
    public SetOnCallTeamRoutingRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Set on-call team routing rules.
   *
   * <p>See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @return TeamRoutingRules
   * @throws ApiException if fails to make API call
   */
  public TeamRoutingRules setOnCallTeamRoutingRules(String teamId, TeamRoutingRulesRequest body)
      throws ApiException {
    return setOnCallTeamRoutingRulesWithHttpInfo(
            teamId, body, new SetOnCallTeamRoutingRulesOptionalParameters())
        .getData();
  }

  /**
   * Set on-call team routing rules.
   *
   * <p>See {@link #setOnCallTeamRoutingRulesWithHttpInfoAsync}.
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamRoutingRules&gt;
   */
  public CompletableFuture<TeamRoutingRules> setOnCallTeamRoutingRulesAsync(
      String teamId, TeamRoutingRulesRequest body) {
    return setOnCallTeamRoutingRulesWithHttpInfoAsync(
            teamId, body, new SetOnCallTeamRoutingRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Set on-call team routing rules.
   *
   * <p>See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return TeamRoutingRules
   * @throws ApiException if fails to make API call
   */
  public TeamRoutingRules setOnCallTeamRoutingRules(
      String teamId,
      TeamRoutingRulesRequest body,
      SetOnCallTeamRoutingRulesOptionalParameters parameters)
      throws ApiException {
    return setOnCallTeamRoutingRulesWithHttpInfo(teamId, body, parameters).getData();
  }

  /**
   * Set on-call team routing rules.
   *
   * <p>See {@link #setOnCallTeamRoutingRulesWithHttpInfoAsync}.
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamRoutingRules&gt;
   */
  public CompletableFuture<TeamRoutingRules> setOnCallTeamRoutingRulesAsync(
      String teamId,
      TeamRoutingRulesRequest body,
      SetOnCallTeamRoutingRulesOptionalParameters parameters) {
    return setOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Set a team's on-call routing rules
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamRoutingRules&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamRoutingRules> setOnCallTeamRoutingRulesWithHttpInfo(
      String teamId,
      TeamRoutingRulesRequest body,
      SetOnCallTeamRoutingRulesOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling setOnCallTeamRoutingRules");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling setOnCallTeamRoutingRules");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/teams/{team_id}/routing-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.setOnCallTeamRoutingRules",
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
        new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Set on-call team routing rules.
   *
   * <p>See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamRoutingRules&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamRoutingRules>>
      setOnCallTeamRoutingRulesWithHttpInfoAsync(
          String teamId,
          TeamRoutingRulesRequest body,
          SetOnCallTeamRoutingRulesOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling setOnCallTeamRoutingRules"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling setOnCallTeamRoutingRules"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/teams/{team_id}/routing-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.setOnCallTeamRoutingRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
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
        new GenericType<TeamRoutingRules>() {});
  }

  /** Manage optional parameters to updateOnCallEscalationPolicy. */
  public static class UpdateOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of included relationships to be returned. Allowed values:
     *     <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return UpdateOnCallEscalationPolicyOptionalParameters
     */
    public UpdateOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update on-call escalation policy.
   *
   * <p>See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy updateOnCallEscalationPolicy(
      String policyId, EscalationPolicyUpdateRequest body) throws ApiException {
    return updateOnCallEscalationPolicyWithHttpInfo(
            policyId, body, new UpdateOnCallEscalationPolicyOptionalParameters())
        .getData();
  }

  /**
   * Update on-call escalation policy.
   *
   * <p>See {@link #updateOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> updateOnCallEscalationPolicyAsync(
      String policyId, EscalationPolicyUpdateRequest body) {
    return updateOnCallEscalationPolicyWithHttpInfoAsync(
            policyId, body, new UpdateOnCallEscalationPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update on-call escalation policy.
   *
   * <p>See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return EscalationPolicy
   * @throws ApiException if fails to make API call
   */
  public EscalationPolicy updateOnCallEscalationPolicy(
      String policyId,
      EscalationPolicyUpdateRequest body,
      UpdateOnCallEscalationPolicyOptionalParameters parameters)
      throws ApiException {
    return updateOnCallEscalationPolicyWithHttpInfo(policyId, body, parameters).getData();
  }

  /**
   * Update on-call escalation policy.
   *
   * <p>See {@link #updateOnCallEscalationPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EscalationPolicy&gt;
   */
  public CompletableFuture<EscalationPolicy> updateOnCallEscalationPolicyAsync(
      String policyId,
      EscalationPolicyUpdateRequest body,
      UpdateOnCallEscalationPolicyOptionalParameters parameters) {
    return updateOnCallEscalationPolicyWithHttpInfoAsync(policyId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an on-call escalation policy
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
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
  public ApiResponse<EscalationPolicy> updateOnCallEscalationPolicyWithHttpInfo(
      String policyId,
      EscalationPolicyUpdateRequest body,
      UpdateOnCallEscalationPolicyOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'policyId' when calling updateOnCallEscalationPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallApi.updateOnCallEscalationPolicy",
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
        new GenericType<EscalationPolicy>() {});
  }

  /**
   * Update on-call escalation policy.
   *
   * <p>See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>>
      updateOnCallEscalationPolicyWithHttpInfoAsync(
          String policyId,
          EscalationPolicyUpdateRequest body,
          UpdateOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling"
                  + " updateOnCallEscalationPolicy"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateOnCallEscalationPolicy"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/escalation-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallApi.updateOnCallEscalationPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
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
        new GenericType<EscalationPolicy>() {});
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
