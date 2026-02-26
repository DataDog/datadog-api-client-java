
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
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequest;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleCreateRequest;
import com.datadog.api.client.v2.model.ScheduleUpdateRequest;
import com.datadog.api.client.v2.model.Shift;
import com.datadog.api.client.v2.model.TeamOnCallResponders;
import com.datadog.api.client.v2.model.TeamRoutingRules;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequest;
import com.datadog.api.client.v2.model.ListNotificationChannelsResponse;
import com.datadog.api.client.v2.model.NotificationChannel;
import com.datadog.api.client.v2.model.CreateUserNotificationChannelRequest;
import com.datadog.api.client.v2.model.ListOnCallNotificationRulesResponse;
import com.datadog.api.client.v2.model.OnCallNotificationRule;
import com.datadog.api.client.v2.model.CreateOnCallNotificationRuleRequest;
import com.datadog.api.client.v2.model.UpdateOnCallNotificationRuleRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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

  /**
   * Manage optional parameters to createOnCallEscalationPolicy.
   */
  public static class CreateOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return CreateOnCallEscalationPolicyOptionalParameters
     */
    public CreateOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Create On-Call escalation policy.
 *
 * See {@link #createOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param body  (required)
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy createOnCallEscalationPolicy (EscalationPolicyCreateRequest body) throws ApiException {
    return createOnCallEscalationPolicyWithHttpInfo( body, new CreateOnCallEscalationPolicyOptionalParameters()).getData();
  }

  /**
 * Create On-Call escalation policy.
 *
 * See {@link #createOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>createOnCallEscalationPolicyAsync(EscalationPolicyCreateRequest body) {
    return createOnCallEscalationPolicyWithHttpInfoAsync(body, new CreateOnCallEscalationPolicyOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Create On-Call escalation policy.
 *
 * See {@link #createOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy createOnCallEscalationPolicy(EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    return createOnCallEscalationPolicyWithHttpInfo(body, parameters).getData();
  }

  /**
 * Create On-Call escalation policy.
 *
 * See {@link #createOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>createOnCallEscalationPolicyAsync( EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters) {
    return createOnCallEscalationPolicyWithHttpInfoAsync(body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new On-Call escalation policy</p>
   *
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EscalationPolicy> createOnCallEscalationPolicyWithHttpInfo(EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.createOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Create On-Call escalation policy.
   *
   * See {@link #createOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>> createOnCallEscalationPolicyWithHttpInfoAsync(EscalationPolicyCreateRequest body, CreateOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createOnCallEscalationPolicy"));
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
      builder = apiClient.createBuilder("v2.OnCallApi.createOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Manage optional parameters to createOnCallSchedule.
   */
  public static class CreateOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>layers.members.user</code>. (optional)
     * @return CreateOnCallScheduleOptionalParameters
     */
    public CreateOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Create On-Call schedule.
 *
 * See {@link #createOnCallScheduleWithHttpInfo}.
 *
 * @param body  (required)
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule createOnCallSchedule (ScheduleCreateRequest body) throws ApiException {
    return createOnCallScheduleWithHttpInfo( body, new CreateOnCallScheduleOptionalParameters()).getData();
  }

  /**
 * Create On-Call schedule.
 *
 * See {@link #createOnCallScheduleWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>createOnCallScheduleAsync(ScheduleCreateRequest body) {
    return createOnCallScheduleWithHttpInfoAsync(body, new CreateOnCallScheduleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Create On-Call schedule.
 *
 * See {@link #createOnCallScheduleWithHttpInfo}.
 *
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule createOnCallSchedule(ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) throws ApiException {
    return createOnCallScheduleWithHttpInfo(body, parameters).getData();
  }

  /**
 * Create On-Call schedule.
 *
 * See {@link #createOnCallScheduleWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>createOnCallScheduleAsync( ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) {
    return createOnCallScheduleWithHttpInfoAsync(body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new On-Call schedule</p>
   *
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Schedule> createOnCallScheduleWithHttpInfo(ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.createOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
   * Create On-Call schedule.
   *
   * See {@link #createOnCallScheduleWithHttpInfo}.
   *
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> createOnCallScheduleWithHttpInfoAsync(ScheduleCreateRequest body, CreateOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createOnCallSchedule"));
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
      builder = apiClient.createBuilder("v2.OnCallApi.createOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
 * Create an On-Call notification channel for a user.
 *
 * See {@link #createUserNotificationChannelWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param body  (required)
 * @return NotificationChannel
 * @throws ApiException if fails to make API call
 */
  public NotificationChannel  createUserNotificationChannel(String userId, CreateUserNotificationChannelRequest body) throws ApiException {
    return createUserNotificationChannelWithHttpInfo(userId, body).getData();
  }

  /**
 * Create an On-Call notification channel for a user.
 *
 * See {@link #createUserNotificationChannelWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param body  (required)
 * @return CompletableFuture&lt;NotificationChannel&gt;
 */
  public CompletableFuture<NotificationChannel>createUserNotificationChannelAsync(String userId, CreateUserNotificationChannelRequest body) {
    return createUserNotificationChannelWithHttpInfoAsync(userId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new notification channel for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param body  (required)
   * @return ApiResponse&lt;NotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationChannel> createUserNotificationChannelWithHttpInfo(String userId, CreateUserNotificationChannelRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createUserNotificationChannel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUserNotificationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.createUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotificationChannel>() {});
  }

  /**
   * Create an On-Call notification channel for a user.
   *
   * See {@link #createUserNotificationChannelWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationChannel>> createUserNotificationChannelWithHttpInfoAsync(String userId, CreateUserNotificationChannelRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling createUserNotificationChannel"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createUserNotificationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.createUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotificationChannel>() {});
  }

  /**
 * Create an On-Call notification rule for a user.
 *
 * See {@link #createUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param body  (required)
 * @return OnCallNotificationRule
 * @throws ApiException if fails to make API call
 */
  public OnCallNotificationRule  createUserNotificationRule(String userId, CreateOnCallNotificationRuleRequest body) throws ApiException {
    return createUserNotificationRuleWithHttpInfo(userId, body).getData();
  }

  /**
 * Create an On-Call notification rule for a user.
 *
 * See {@link #createUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param body  (required)
 * @return CompletableFuture&lt;OnCallNotificationRule&gt;
 */
  public CompletableFuture<OnCallNotificationRule>createUserNotificationRuleAsync(String userId, CreateOnCallNotificationRuleRequest body) {
    return createUserNotificationRuleWithHttpInfoAsync(userId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new notification rule for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param body  (required)
   * @return ApiResponse&lt;OnCallNotificationRule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnCallNotificationRule> createUserNotificationRuleWithHttpInfo(String userId, CreateOnCallNotificationRuleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createUserNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUserNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.createUserNotificationRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }

  /**
   * Create an On-Call notification rule for a user.
   *
   * See {@link #createUserNotificationRuleWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OnCallNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnCallNotificationRule>> createUserNotificationRuleWithHttpInfoAsync(String userId, CreateOnCallNotificationRuleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling createUserNotificationRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createUserNotificationRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.createUserNotificationRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }

  /**
 * Delete On-Call escalation policy.
 *
 * See {@link #deleteOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteOnCallEscalationPolicy(String policyId) throws ApiException {
    deleteOnCallEscalationPolicyWithHttpInfo(policyId);
  }

  /**
 * Delete On-Call escalation policy.
 *
 * See {@link #deleteOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteOnCallEscalationPolicyAsync(String policyId) {
    return deleteOnCallEscalationPolicyWithHttpInfoAsync(policyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an On-Call escalation policy</p>
   *
   * @param policyId The ID of the escalation policy (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOnCallEscalationPolicyWithHttpInfo(String policyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling deleteOnCallEscalationPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.deleteOnCallEscalationPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete On-Call escalation policy.
   *
   * See {@link #deleteOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOnCallEscalationPolicyWithHttpInfoAsync(String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling deleteOnCallEscalationPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.deleteOnCallEscalationPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete On-Call schedule.
 *
 * See {@link #deleteOnCallScheduleWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteOnCallSchedule(String scheduleId) throws ApiException {
    deleteOnCallScheduleWithHttpInfo(scheduleId);
  }

  /**
 * Delete On-Call schedule.
 *
 * See {@link #deleteOnCallScheduleWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteOnCallScheduleAsync(String scheduleId) {
    return deleteOnCallScheduleWithHttpInfoAsync(scheduleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an On-Call schedule</p>
   *
   * @param scheduleId The ID of the schedule (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling deleteOnCallSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.deleteOnCallSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete On-Call schedule.
   *
   * See {@link #deleteOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOnCallScheduleWithHttpInfoAsync(String scheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'scheduleId' when calling deleteOnCallSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.deleteOnCallSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete an On-Call notification channel for a user.
 *
 * See {@link #deleteUserNotificationChannelWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param channelId The channel ID (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteUserNotificationChannel(String userId, String channelId) throws ApiException {
    deleteUserNotificationChannelWithHttpInfo(userId, channelId);
  }

  /**
 * Delete an On-Call notification channel for a user.
 *
 * See {@link #deleteUserNotificationChannelWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param channelId The channel ID (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteUserNotificationChannelAsync(String userId, String channelId) {
    return deleteUserNotificationChannelWithHttpInfoAsync(userId, channelId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a notification channel for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param channelId The channel ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteUserNotificationChannelWithHttpInfo(String userId, String channelId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserNotificationChannel");
    }

    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling deleteUserNotificationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels/{channel_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_id" + "\\}", apiClient.escapeString(channelId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.deleteUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an On-Call notification channel for a user.
   *
   * See {@link #deleteUserNotificationChannelWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param channelId The channel ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteUserNotificationChannelWithHttpInfoAsync(String userId, String channelId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserNotificationChannel"));
        return result;
    }

    // verify the required parameter 'channelId' is set
    if (channelId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelId' when calling deleteUserNotificationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels/{channel_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_id" + "\\}", apiClient.escapeString(channelId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.deleteUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete an On-Call notification rule for a user.
 *
 * See {@link #deleteUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteUserNotificationRule(String userId, String ruleId) throws ApiException {
    deleteUserNotificationRuleWithHttpInfo(userId, ruleId);
  }

  /**
 * Delete an On-Call notification rule for a user.
 *
 * See {@link #deleteUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteUserNotificationRuleAsync(String userId, String ruleId) {
    return deleteUserNotificationRuleWithHttpInfoAsync(userId, ruleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a notification rule for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteUserNotificationRuleWithHttpInfo(String userId, String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteUserNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.deleteUserNotificationRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an On-Call notification rule for a user.
   *
   * See {@link #deleteUserNotificationRuleWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteUserNotificationRuleWithHttpInfoAsync(String userId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserNotificationRule"));
        return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteUserNotificationRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.deleteUserNotificationRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Manage optional parameters to getOnCallEscalationPolicy.
   */
  public static class GetOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return GetOnCallEscalationPolicyOptionalParameters
     */
    public GetOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get On-Call escalation policy.
 *
 * See {@link #getOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy getOnCallEscalationPolicy (String policyId) throws ApiException {
    return getOnCallEscalationPolicyWithHttpInfo( policyId, new GetOnCallEscalationPolicyOptionalParameters()).getData();
  }

  /**
 * Get On-Call escalation policy.
 *
 * See {@link #getOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>getOnCallEscalationPolicyAsync(String policyId) {
    return getOnCallEscalationPolicyWithHttpInfoAsync(policyId, new GetOnCallEscalationPolicyOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get On-Call escalation policy.
 *
 * See {@link #getOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param parameters Optional parameters for the request.
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy getOnCallEscalationPolicy(String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    return getOnCallEscalationPolicyWithHttpInfo(policyId, parameters).getData();
  }

  /**
 * Get On-Call escalation policy.
 *
 * See {@link #getOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>getOnCallEscalationPolicyAsync( String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) {
    return getOnCallEscalationPolicyWithHttpInfoAsync(policyId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an On-Call escalation policy</p>
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<EscalationPolicy> getOnCallEscalationPolicyWithHttpInfo(String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling getOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Get On-Call escalation policy.
   *
   * See {@link #getOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>> getOnCallEscalationPolicyWithHttpInfoAsync(String policyId, GetOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling getOnCallEscalationPolicy"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Manage optional parameters to getOnCallSchedule.
   */
  public static class GetOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>layers.members.user</code>. (optional)
     * @return GetOnCallScheduleOptionalParameters
     */
    public GetOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get On-Call schedule.
 *
 * See {@link #getOnCallScheduleWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule getOnCallSchedule (String scheduleId) throws ApiException {
    return getOnCallScheduleWithHttpInfo( scheduleId, new GetOnCallScheduleOptionalParameters()).getData();
  }

  /**
 * Get On-Call schedule.
 *
 * See {@link #getOnCallScheduleWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>getOnCallScheduleAsync(String scheduleId) {
    return getOnCallScheduleWithHttpInfoAsync(scheduleId, new GetOnCallScheduleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get On-Call schedule.
 *
 * See {@link #getOnCallScheduleWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param parameters Optional parameters for the request.
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule getOnCallSchedule(String scheduleId, GetOnCallScheduleOptionalParameters parameters) throws ApiException {
    return getOnCallScheduleWithHttpInfo(scheduleId, parameters).getData();
  }

  /**
 * Get On-Call schedule.
 *
 * See {@link #getOnCallScheduleWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>getOnCallScheduleAsync( String scheduleId, GetOnCallScheduleOptionalParameters parameters) {
    return getOnCallScheduleWithHttpInfoAsync(scheduleId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an On-Call schedule</p>
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Schedule> getOnCallScheduleWithHttpInfo(String scheduleId, GetOnCallScheduleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling getOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
   * Get On-Call schedule.
   *
   * See {@link #getOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> getOnCallScheduleWithHttpInfoAsync(String scheduleId, GetOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
        CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'scheduleId' when calling getOnCallSchedule"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
   * Manage optional parameters to getOnCallTeamRoutingRules.
   */
  public static class GetOnCallTeamRoutingRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>rules</code>, <code>rules.policy</code>. (optional)
     * @return GetOnCallTeamRoutingRulesOptionalParameters
     */
    public GetOnCallTeamRoutingRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get On-Call team routing rules.
 *
 * See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @return TeamRoutingRules
 * @throws ApiException if fails to make API call
 */
  public TeamRoutingRules getOnCallTeamRoutingRules (String teamId) throws ApiException {
    return getOnCallTeamRoutingRulesWithHttpInfo( teamId, new GetOnCallTeamRoutingRulesOptionalParameters()).getData();
  }

  /**
 * Get On-Call team routing rules.
 *
 * See {@link #getOnCallTeamRoutingRulesWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @return CompletableFuture&lt;TeamRoutingRules&gt;
 */
  public CompletableFuture<TeamRoutingRules>getOnCallTeamRoutingRulesAsync(String teamId) {
    return getOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, new GetOnCallTeamRoutingRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get On-Call team routing rules.
 *
 * See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @param parameters Optional parameters for the request.
 * @return TeamRoutingRules
 * @throws ApiException if fails to make API call
 */
  public TeamRoutingRules getOnCallTeamRoutingRules(String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    return getOnCallTeamRoutingRulesWithHttpInfo(teamId, parameters).getData();
  }

  /**
 * Get On-Call team routing rules.
 *
 * See {@link #getOnCallTeamRoutingRulesWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;TeamRoutingRules&gt;
 */
  public CompletableFuture<TeamRoutingRules>getOnCallTeamRoutingRulesAsync( String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) {
    return getOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a team's On-Call routing rules</p>
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamRoutingRules&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamRoutingRules> getOnCallTeamRoutingRulesWithHttpInfo(String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getOnCallTeamRoutingRules");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/routing-rules"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getOnCallTeamRoutingRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Get On-Call team routing rules.
   *
   * See {@link #getOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamRoutingRules&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamRoutingRules>> getOnCallTeamRoutingRulesWithHttpInfoAsync(String teamId, GetOnCallTeamRoutingRulesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
        CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'teamId' when calling getOnCallTeamRoutingRules"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/routing-rules"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getOnCallTeamRoutingRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Manage optional parameters to getScheduleOnCallUser.
   */
  public static class GetScheduleOnCallUserOptionalParameters {
    private String include;
    private String filterAtTs;

    /**
     * Set include.
     * @param include Specifies related resources to include in the response as a comma-separated list. Allowed value: <code>user</code>. (optional)
     * @return GetScheduleOnCallUserOptionalParameters
     */
    public GetScheduleOnCallUserOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterAtTs.
     * @param filterAtTs Retrieves the on-call user at the given timestamp in RFC3339 format (for example, <code>2025-05-07T02:53:01Z</code> or <code>2025-05-07T02:53:01+00:00</code>). When using timezone offsets with <code>+</code> or <code>-</code>, ensure proper URL encoding (<code>+</code> should be encoded as <code>%2B</code>). Defaults to the current time if omitted. (optional)
     * @return GetScheduleOnCallUserOptionalParameters
     */
    public GetScheduleOnCallUserOptionalParameters filterAtTs(String filterAtTs) {
      this.filterAtTs = filterAtTs;
      return this;
    }
  }

  /**
 * Get scheduled on-call user.
 *
 * See {@link #getScheduleOnCallUserWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule. (required)
 * @return Shift
 * @throws ApiException if fails to make API call
 */
  public Shift getScheduleOnCallUser (String scheduleId) throws ApiException {
    return getScheduleOnCallUserWithHttpInfo( scheduleId, new GetScheduleOnCallUserOptionalParameters()).getData();
  }

  /**
 * Get scheduled on-call user.
 *
 * See {@link #getScheduleOnCallUserWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule. (required)
 * @return CompletableFuture&lt;Shift&gt;
 */
  public CompletableFuture<Shift>getScheduleOnCallUserAsync(String scheduleId) {
    return getScheduleOnCallUserWithHttpInfoAsync(scheduleId, new GetScheduleOnCallUserOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get scheduled on-call user.
 *
 * See {@link #getScheduleOnCallUserWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule. (required)
 * @param parameters Optional parameters for the request.
 * @return Shift
 * @throws ApiException if fails to make API call
 */
  public Shift getScheduleOnCallUser(String scheduleId, GetScheduleOnCallUserOptionalParameters parameters) throws ApiException {
    return getScheduleOnCallUserWithHttpInfo(scheduleId, parameters).getData();
  }

  /**
 * Get scheduled on-call user.
 *
 * See {@link #getScheduleOnCallUserWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;Shift&gt;
 */
  public CompletableFuture<Shift>getScheduleOnCallUserAsync( String scheduleId, GetScheduleOnCallUserOptionalParameters parameters) {
    return getScheduleOnCallUserWithHttpInfoAsync(scheduleId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieves the user who is on-call for the specified schedule at a given time.</p>
   *
   * @param scheduleId The ID of the schedule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Shift&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<Shift> getScheduleOnCallUserWithHttpInfo(String scheduleId, GetScheduleOnCallUserOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling getScheduleOnCallUser");
    }
    String include = parameters.include;
    String filterAtTs = parameters.filterAtTs;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}/on-call"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[at_ts]", filterAtTs));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getScheduleOnCallUser", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Shift>() {});
  }

  /**
   * Get scheduled on-call user.
   *
   * See {@link #getScheduleOnCallUserWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Shift&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Shift>> getScheduleOnCallUserWithHttpInfoAsync(String scheduleId, GetScheduleOnCallUserOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
        CompletableFuture<ApiResponse<Shift>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'scheduleId' when calling getScheduleOnCallUser"));
        return result;
    }
    String include = parameters.include;
    String filterAtTs = parameters.filterAtTs;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}/on-call"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[at_ts]", filterAtTs));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getScheduleOnCallUser", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Shift>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Shift>() {});
  }

  /**
   * Manage optional parameters to getTeamOnCallUsers.
   */
  public static class GetTeamOnCallUsersOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>responders</code>, <code>escalations</code>, <code>escalations.responders</code>. (optional)
     * @return GetTeamOnCallUsersOptionalParameters
     */
    public GetTeamOnCallUsersOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get team on-call users.
 *
 * See {@link #getTeamOnCallUsersWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @return TeamOnCallResponders
 * @throws ApiException if fails to make API call
 */
  public TeamOnCallResponders getTeamOnCallUsers (String teamId) throws ApiException {
    return getTeamOnCallUsersWithHttpInfo( teamId, new GetTeamOnCallUsersOptionalParameters()).getData();
  }

  /**
 * Get team on-call users.
 *
 * See {@link #getTeamOnCallUsersWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @return CompletableFuture&lt;TeamOnCallResponders&gt;
 */
  public CompletableFuture<TeamOnCallResponders>getTeamOnCallUsersAsync(String teamId) {
    return getTeamOnCallUsersWithHttpInfoAsync(teamId, new GetTeamOnCallUsersOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get team on-call users.
 *
 * See {@link #getTeamOnCallUsersWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @param parameters Optional parameters for the request.
 * @return TeamOnCallResponders
 * @throws ApiException if fails to make API call
 */
  public TeamOnCallResponders getTeamOnCallUsers(String teamId, GetTeamOnCallUsersOptionalParameters parameters) throws ApiException {
    return getTeamOnCallUsersWithHttpInfo(teamId, parameters).getData();
  }

  /**
 * Get team on-call users.
 *
 * See {@link #getTeamOnCallUsersWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;TeamOnCallResponders&gt;
 */
  public CompletableFuture<TeamOnCallResponders>getTeamOnCallUsersAsync( String teamId, GetTeamOnCallUsersOptionalParameters parameters) {
    return getTeamOnCallUsersWithHttpInfoAsync(teamId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a team's on-call users at a given time</p>
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamOnCallResponders&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<TeamOnCallResponders> getTeamOnCallUsersWithHttpInfo(String teamId, GetTeamOnCallUsersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getTeamOnCallUsers");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/on-call"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getTeamOnCallUsers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamOnCallResponders>() {});
  }

  /**
   * Get team on-call users.
   *
   * See {@link #getTeamOnCallUsersWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamOnCallResponders&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamOnCallResponders>> getTeamOnCallUsersWithHttpInfoAsync(String teamId, GetTeamOnCallUsersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
        CompletableFuture<ApiResponse<TeamOnCallResponders>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'teamId' when calling getTeamOnCallUsers"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/on-call"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getTeamOnCallUsers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamOnCallResponders>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamOnCallResponders>() {});
  }

  /**
 * Get an On-Call notification channel for a user.
 *
 * See {@link #getUserNotificationChannelWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param channelId The channel ID (required)
 * @return NotificationChannel
 * @throws ApiException if fails to make API call
 */
  public NotificationChannel  getUserNotificationChannel(String userId, String channelId) throws ApiException {
    return getUserNotificationChannelWithHttpInfo(userId, channelId).getData();
  }

  /**
 * Get an On-Call notification channel for a user.
 *
 * See {@link #getUserNotificationChannelWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param channelId The channel ID (required)
 * @return CompletableFuture&lt;NotificationChannel&gt;
 */
  public CompletableFuture<NotificationChannel>getUserNotificationChannelAsync(String userId, String channelId) {
    return getUserNotificationChannelWithHttpInfoAsync(userId, channelId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a notification channel for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param channelId The channel ID (required)
   * @return ApiResponse&lt;NotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<NotificationChannel> getUserNotificationChannelWithHttpInfo(String userId, String channelId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserNotificationChannel");
    }

    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling getUserNotificationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels/{channel_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_id" + "\\}", apiClient.escapeString(channelId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotificationChannel>() {});
  }

  /**
   * Get an On-Call notification channel for a user.
   *
   * See {@link #getUserNotificationChannelWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param channelId The channel ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationChannel>> getUserNotificationChannelWithHttpInfoAsync(String userId, String channelId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling getUserNotificationChannel"));
        return result;
    }

    // verify the required parameter 'channelId' is set
    if (channelId == null) {
        CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelId' when calling getUserNotificationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels/{channel_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_id" + "\\}", apiClient.escapeString(channelId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getUserNotificationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotificationChannel>() {});
  }

  /**
   * Manage optional parameters to getUserNotificationRule.
   */
  public static class GetUserNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>channel</code>. (optional)
     * @return GetUserNotificationRuleOptionalParameters
     */
    public GetUserNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get an On-Call notification rule for a user.
 *
 * See {@link #getUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @return OnCallNotificationRule
 * @throws ApiException if fails to make API call
 */
  public OnCallNotificationRule getUserNotificationRule (String userId, String ruleId) throws ApiException {
    return getUserNotificationRuleWithHttpInfo( userId,  ruleId, new GetUserNotificationRuleOptionalParameters()).getData();
  }

  /**
 * Get an On-Call notification rule for a user.
 *
 * See {@link #getUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @return CompletableFuture&lt;OnCallNotificationRule&gt;
 */
  public CompletableFuture<OnCallNotificationRule>getUserNotificationRuleAsync(String userId, String ruleId) {
    return getUserNotificationRuleWithHttpInfoAsync(userId, ruleId, new GetUserNotificationRuleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get an On-Call notification rule for a user.
 *
 * See {@link #getUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param parameters Optional parameters for the request.
 * @return OnCallNotificationRule
 * @throws ApiException if fails to make API call
 */
  public OnCallNotificationRule getUserNotificationRule(String userId, String ruleId, GetUserNotificationRuleOptionalParameters parameters) throws ApiException {
    return getUserNotificationRuleWithHttpInfo(userId, ruleId, parameters).getData();
  }

  /**
 * Get an On-Call notification rule for a user.
 *
 * See {@link #getUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;OnCallNotificationRule&gt;
 */
  public CompletableFuture<OnCallNotificationRule>getUserNotificationRuleAsync( String userId,  String ruleId, GetUserNotificationRuleOptionalParameters parameters) {
    return getUserNotificationRuleWithHttpInfoAsync(userId, ruleId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a notification rule for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OnCallNotificationRule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<OnCallNotificationRule> getUserNotificationRuleWithHttpInfo(String userId, String ruleId, GetUserNotificationRuleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getUserNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.getUserNotificationRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }

  /**
   * Get an On-Call notification rule for a user.
   *
   * See {@link #getUserNotificationRuleWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OnCallNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnCallNotificationRule>> getUserNotificationRuleWithHttpInfoAsync(String userId, String ruleId, GetUserNotificationRuleOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling getUserNotificationRule"));
        return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling getUserNotificationRule"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.getUserNotificationRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }

  /**
 * List On-Call notification channels for a user.
 *
 * See {@link #listUserNotificationChannelsWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @return ListNotificationChannelsResponse
 * @throws ApiException if fails to make API call
 */
  public ListNotificationChannelsResponse  listUserNotificationChannels(String userId) throws ApiException {
    return listUserNotificationChannelsWithHttpInfo(userId).getData();
  }

  /**
 * List On-Call notification channels for a user.
 *
 * See {@link #listUserNotificationChannelsWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @return CompletableFuture&lt;ListNotificationChannelsResponse&gt;
 */
  public CompletableFuture<ListNotificationChannelsResponse>listUserNotificationChannelsAsync(String userId) {
    return listUserNotificationChannelsWithHttpInfoAsync(userId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List the notification channels for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @return ApiResponse&lt;ListNotificationChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<ListNotificationChannelsResponse> listUserNotificationChannelsWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listUserNotificationChannels");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.listUserNotificationChannels", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListNotificationChannelsResponse>() {});
  }

  /**
   * List On-Call notification channels for a user.
   *
   * See {@link #listUserNotificationChannelsWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListNotificationChannelsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListNotificationChannelsResponse>> listUserNotificationChannelsWithHttpInfoAsync(String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<ListNotificationChannelsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling listUserNotificationChannels"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-channels"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.listUserNotificationChannels", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListNotificationChannelsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListNotificationChannelsResponse>() {});
  }

  /**
   * Manage optional parameters to listUserNotificationRules.
   */
  public static class ListUserNotificationRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>channel</code>. (optional)
     * @return ListUserNotificationRulesOptionalParameters
     */
    public ListUserNotificationRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * List On-Call notification rules for a user.
 *
 * See {@link #listUserNotificationRulesWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @return ListOnCallNotificationRulesResponse
 * @throws ApiException if fails to make API call
 */
  public ListOnCallNotificationRulesResponse listUserNotificationRules (String userId) throws ApiException {
    return listUserNotificationRulesWithHttpInfo( userId, new ListUserNotificationRulesOptionalParameters()).getData();
  }

  /**
 * List On-Call notification rules for a user.
 *
 * See {@link #listUserNotificationRulesWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @return CompletableFuture&lt;ListOnCallNotificationRulesResponse&gt;
 */
  public CompletableFuture<ListOnCallNotificationRulesResponse>listUserNotificationRulesAsync(String userId) {
    return listUserNotificationRulesWithHttpInfoAsync(userId, new ListUserNotificationRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List On-Call notification rules for a user.
 *
 * See {@link #listUserNotificationRulesWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param parameters Optional parameters for the request.
 * @return ListOnCallNotificationRulesResponse
 * @throws ApiException if fails to make API call
 */
  public ListOnCallNotificationRulesResponse listUserNotificationRules(String userId, ListUserNotificationRulesOptionalParameters parameters) throws ApiException {
    return listUserNotificationRulesWithHttpInfo(userId, parameters).getData();
  }

  /**
 * List On-Call notification rules for a user.
 *
 * See {@link #listUserNotificationRulesWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListOnCallNotificationRulesResponse&gt;
 */
  public CompletableFuture<ListOnCallNotificationRulesResponse>listUserNotificationRulesAsync( String userId, ListUserNotificationRulesOptionalParameters parameters) {
    return listUserNotificationRulesWithHttpInfoAsync(userId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List the notification rules for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListOnCallNotificationRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<ListOnCallNotificationRulesResponse> listUserNotificationRulesWithHttpInfo(String userId, ListUserNotificationRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listUserNotificationRules");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.listUserNotificationRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListOnCallNotificationRulesResponse>() {});
  }

  /**
   * List On-Call notification rules for a user.
   *
   * See {@link #listUserNotificationRulesWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListOnCallNotificationRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListOnCallNotificationRulesResponse>> listUserNotificationRulesWithHttpInfoAsync(String userId, ListUserNotificationRulesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<ListOnCallNotificationRulesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling listUserNotificationRules"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.listUserNotificationRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListOnCallNotificationRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListOnCallNotificationRulesResponse>() {});
  }

  /**
   * Manage optional parameters to setOnCallTeamRoutingRules.
   */
  public static class SetOnCallTeamRoutingRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>rules</code>, <code>rules.policy</code>. (optional)
     * @return SetOnCallTeamRoutingRulesOptionalParameters
     */
    public SetOnCallTeamRoutingRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Set On-Call team routing rules.
 *
 * See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @param body  (required)
 * @return TeamRoutingRules
 * @throws ApiException if fails to make API call
 */
  public TeamRoutingRules setOnCallTeamRoutingRules (String teamId, TeamRoutingRulesRequest body) throws ApiException {
    return setOnCallTeamRoutingRulesWithHttpInfo( teamId,  body, new SetOnCallTeamRoutingRulesOptionalParameters()).getData();
  }

  /**
 * Set On-Call team routing rules.
 *
 * See {@link #setOnCallTeamRoutingRulesWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @param body  (required)
 * @return CompletableFuture&lt;TeamRoutingRules&gt;
 */
  public CompletableFuture<TeamRoutingRules>setOnCallTeamRoutingRulesAsync(String teamId, TeamRoutingRulesRequest body) {
    return setOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, body, new SetOnCallTeamRoutingRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Set On-Call team routing rules.
 *
 * See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
 *
 * @param teamId The team ID (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return TeamRoutingRules
 * @throws ApiException if fails to make API call
 */
  public TeamRoutingRules setOnCallTeamRoutingRules(String teamId, TeamRoutingRulesRequest body, SetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    return setOnCallTeamRoutingRulesWithHttpInfo(teamId, body, parameters).getData();
  }

  /**
 * Set On-Call team routing rules.
 *
 * See {@link #setOnCallTeamRoutingRulesWithHttpInfoAsync}.
 *
 * @param teamId The team ID (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;TeamRoutingRules&gt;
 */
  public CompletableFuture<TeamRoutingRules>setOnCallTeamRoutingRulesAsync( String teamId,  TeamRoutingRulesRequest body, SetOnCallTeamRoutingRulesOptionalParameters parameters) {
    return setOnCallTeamRoutingRulesWithHttpInfoAsync(teamId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Set a team's On-Call routing rules</p>
   *
   * @param teamId The team ID (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamRoutingRules&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamRoutingRules> setOnCallTeamRoutingRulesWithHttpInfo(String teamId, TeamRoutingRulesRequest body, SetOnCallTeamRoutingRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling setOnCallTeamRoutingRules");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setOnCallTeamRoutingRules");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/routing-rules"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.setOnCallTeamRoutingRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Set On-Call team routing rules.
   *
   * See {@link #setOnCallTeamRoutingRulesWithHttpInfo}.
   *
   * @param teamId The team ID (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamRoutingRules&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamRoutingRules>> setOnCallTeamRoutingRulesWithHttpInfoAsync(String teamId, TeamRoutingRulesRequest body, SetOnCallTeamRoutingRulesOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
        CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'teamId' when calling setOnCallTeamRoutingRules"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling setOnCallTeamRoutingRules"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/teams/{team_id}/routing-rules"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.setOnCallTeamRoutingRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamRoutingRules>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamRoutingRules>() {});
  }

  /**
   * Manage optional parameters to updateOnCallEscalationPolicy.
   */
  public static class UpdateOnCallEscalationPolicyOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>steps</code>, <code>steps.targets</code>. (optional)
     * @return UpdateOnCallEscalationPolicyOptionalParameters
     */
    public UpdateOnCallEscalationPolicyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Update On-Call escalation policy.
 *
 * See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param body  (required)
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy updateOnCallEscalationPolicy (String policyId, EscalationPolicyUpdateRequest body) throws ApiException {
    return updateOnCallEscalationPolicyWithHttpInfo( policyId,  body, new UpdateOnCallEscalationPolicyOptionalParameters()).getData();
  }

  /**
 * Update On-Call escalation policy.
 *
 * See {@link #updateOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param body  (required)
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>updateOnCallEscalationPolicyAsync(String policyId, EscalationPolicyUpdateRequest body) {
    return updateOnCallEscalationPolicyWithHttpInfoAsync(policyId, body, new UpdateOnCallEscalationPolicyOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Update On-Call escalation policy.
 *
 * See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return EscalationPolicy
 * @throws ApiException if fails to make API call
 */
  public EscalationPolicy updateOnCallEscalationPolicy(String policyId, EscalationPolicyUpdateRequest body, UpdateOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    return updateOnCallEscalationPolicyWithHttpInfo(policyId, body, parameters).getData();
  }

  /**
 * Update On-Call escalation policy.
 *
 * See {@link #updateOnCallEscalationPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the escalation policy (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;EscalationPolicy&gt;
 */
  public CompletableFuture<EscalationPolicy>updateOnCallEscalationPolicyAsync( String policyId,  EscalationPolicyUpdateRequest body, UpdateOnCallEscalationPolicyOptionalParameters parameters) {
    return updateOnCallEscalationPolicyWithHttpInfoAsync(policyId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an On-Call escalation policy</p>
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EscalationPolicy&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<EscalationPolicy> updateOnCallEscalationPolicyWithHttpInfo(String policyId, EscalationPolicyUpdateRequest body, UpdateOnCallEscalationPolicyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling updateOnCallEscalationPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOnCallEscalationPolicy");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.updateOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Update On-Call escalation policy.
   *
   * See {@link #updateOnCallEscalationPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the escalation policy (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EscalationPolicy&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EscalationPolicy>> updateOnCallEscalationPolicyWithHttpInfoAsync(String policyId, EscalationPolicyUpdateRequest body, UpdateOnCallEscalationPolicyOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling updateOnCallEscalationPolicy"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateOnCallEscalationPolicy"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/escalation-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.updateOnCallEscalationPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EscalationPolicy>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EscalationPolicy>() {});
  }

  /**
   * Manage optional parameters to updateOnCallSchedule.
   */
  public static class UpdateOnCallScheduleOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>teams</code>, <code>layers</code>, <code>layers.members</code>, <code>layers.members.user</code>. (optional)
     * @return UpdateOnCallScheduleOptionalParameters
     */
    public UpdateOnCallScheduleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Update On-Call schedule.
 *
 * See {@link #updateOnCallScheduleWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param body  (required)
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule updateOnCallSchedule (String scheduleId, ScheduleUpdateRequest body) throws ApiException {
    return updateOnCallScheduleWithHttpInfo( scheduleId,  body, new UpdateOnCallScheduleOptionalParameters()).getData();
  }

  /**
 * Update On-Call schedule.
 *
 * See {@link #updateOnCallScheduleWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param body  (required)
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>updateOnCallScheduleAsync(String scheduleId, ScheduleUpdateRequest body) {
    return updateOnCallScheduleWithHttpInfoAsync(scheduleId, body, new UpdateOnCallScheduleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Update On-Call schedule.
 *
 * See {@link #updateOnCallScheduleWithHttpInfo}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return Schedule
 * @throws ApiException if fails to make API call
 */
  public Schedule updateOnCallSchedule(String scheduleId, ScheduleUpdateRequest body, UpdateOnCallScheduleOptionalParameters parameters) throws ApiException {
    return updateOnCallScheduleWithHttpInfo(scheduleId, body, parameters).getData();
  }

  /**
 * Update On-Call schedule.
 *
 * See {@link #updateOnCallScheduleWithHttpInfoAsync}.
 *
 * @param scheduleId The ID of the schedule (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;Schedule&gt;
 */
  public CompletableFuture<Schedule>updateOnCallScheduleAsync( String scheduleId,  ScheduleUpdateRequest body, UpdateOnCallScheduleOptionalParameters parameters) {
    return updateOnCallScheduleWithHttpInfoAsync(scheduleId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a new On-Call schedule</p>
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Schedule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<Schedule> updateOnCallScheduleWithHttpInfo(String scheduleId, ScheduleUpdateRequest body, UpdateOnCallScheduleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling updateOnCallSchedule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOnCallSchedule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.updateOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
   * Update On-Call schedule.
   *
   * See {@link #updateOnCallScheduleWithHttpInfo}.
   *
   * @param scheduleId The ID of the schedule (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Schedule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Schedule>> updateOnCallScheduleWithHttpInfoAsync(String scheduleId, ScheduleUpdateRequest body, UpdateOnCallScheduleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
        CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'scheduleId' when calling updateOnCallSchedule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateOnCallSchedule"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/schedules/{schedule_id}"
      .replaceAll("\\{" + "schedule_id" + "\\}", apiClient.escapeString(scheduleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.updateOnCallSchedule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Schedule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Schedule>() {});
  }

  /**
   * Manage optional parameters to updateUserNotificationRule.
   */
  public static class UpdateUserNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of included relationships to be returned. Allowed values: <code>channel</code>. (optional)
     * @return UpdateUserNotificationRuleOptionalParameters
     */
    public UpdateUserNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Update an On-Call notification rule for a user.
 *
 * See {@link #updateUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param body  (required)
 * @return OnCallNotificationRule
 * @throws ApiException if fails to make API call
 */
  public OnCallNotificationRule updateUserNotificationRule (String userId, String ruleId, UpdateOnCallNotificationRuleRequest body) throws ApiException {
    return updateUserNotificationRuleWithHttpInfo( userId,  ruleId,  body, new UpdateUserNotificationRuleOptionalParameters()).getData();
  }

  /**
 * Update an On-Call notification rule for a user.
 *
 * See {@link #updateUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param body  (required)
 * @return CompletableFuture&lt;OnCallNotificationRule&gt;
 */
  public CompletableFuture<OnCallNotificationRule>updateUserNotificationRuleAsync(String userId, String ruleId, UpdateOnCallNotificationRuleRequest body) {
    return updateUserNotificationRuleWithHttpInfoAsync(userId, ruleId, body, new UpdateUserNotificationRuleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Update an On-Call notification rule for a user.
 *
 * See {@link #updateUserNotificationRuleWithHttpInfo}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return OnCallNotificationRule
 * @throws ApiException if fails to make API call
 */
  public OnCallNotificationRule updateUserNotificationRule(String userId, String ruleId, UpdateOnCallNotificationRuleRequest body, UpdateUserNotificationRuleOptionalParameters parameters) throws ApiException {
    return updateUserNotificationRuleWithHttpInfo(userId, ruleId, body, parameters).getData();
  }

  /**
 * Update an On-Call notification rule for a user.
 *
 * See {@link #updateUserNotificationRuleWithHttpInfoAsync}.
 *
 * @param userId The user ID (required)
 * @param ruleId The rule ID (required)
 * @param body  (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;OnCallNotificationRule&gt;
 */
  public CompletableFuture<OnCallNotificationRule>updateUserNotificationRuleAsync( String userId,  String ruleId,  UpdateOnCallNotificationRuleRequest body, UpdateUserNotificationRuleOptionalParameters parameters) {
    return updateUserNotificationRuleWithHttpInfoAsync(userId, ruleId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a notification rule for a user. The authenticated user must be the target user or have the <code>on_call_admin</code> permission</p>
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OnCallNotificationRule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<OnCallNotificationRule> updateUserNotificationRuleWithHttpInfo(String userId, String ruleId, UpdateOnCallNotificationRuleRequest body, UpdateUserNotificationRuleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling updateUserNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUserNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.OnCallApi.updateUserNotificationRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }

  /**
   * Update an On-Call notification rule for a user.
   *
   * See {@link #updateUserNotificationRuleWithHttpInfo}.
   *
   * @param userId The user ID (required)
   * @param ruleId The rule ID (required)
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OnCallNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnCallNotificationRule>> updateUserNotificationRuleWithHttpInfoAsync(String userId, String ruleId, UpdateOnCallNotificationRuleRequest body, UpdateUserNotificationRuleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling updateUserNotificationRule"));
        return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling updateUserNotificationRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateUserNotificationRule"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/on-call/users/{user_id}/notification-rules/{rule_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OnCallApi.updateUserNotificationRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnCallNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OnCallNotificationRule>() {});
  }
}