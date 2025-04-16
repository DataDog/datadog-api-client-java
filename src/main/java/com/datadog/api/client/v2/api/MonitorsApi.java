package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.MonitorConfigPolicyCreateRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyEditRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyListResponse;
import com.datadog.api.client.v2.model.MonitorConfigPolicyResponse;
import com.datadog.api.client.v2.model.MonitorNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.MonitorNotificationRuleListResponse;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResponse;
import com.datadog.api.client.v2.model.MonitorNotificationRuleUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorsApi {
  private ApiClient apiClient;

  public MonitorsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public MonitorsApi(ApiClient apiClient) {
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
   * Create a monitor configuration policy.
   *
   * <p>See {@link #createMonitorConfigPolicyWithHttpInfo}.
   *
   * @param body Create a monitor configuration policy request body. (required)
   * @return MonitorConfigPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorConfigPolicyResponse createMonitorConfigPolicy(
      MonitorConfigPolicyCreateRequest body) throws ApiException {
    return createMonitorConfigPolicyWithHttpInfo(body).getData();
  }

  /**
   * Create a monitor configuration policy.
   *
   * <p>See {@link #createMonitorConfigPolicyWithHttpInfoAsync}.
   *
   * @param body Create a monitor configuration policy request body. (required)
   * @return CompletableFuture&lt;MonitorConfigPolicyResponse&gt;
   */
  public CompletableFuture<MonitorConfigPolicyResponse> createMonitorConfigPolicyAsync(
      MonitorConfigPolicyCreateRequest body) {
    return createMonitorConfigPolicyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a monitor configuration policy.
   *
   * @param body Create a monitor configuration policy request body. (required)
   * @return ApiResponse&lt;MonitorConfigPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorConfigPolicyResponse> createMonitorConfigPolicyWithHttpInfo(
      MonitorConfigPolicyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMonitorConfigPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/monitor/policy";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.createMonitorConfigPolicy",
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /**
   * Create a monitor configuration policy.
   *
   * <p>See {@link #createMonitorConfigPolicyWithHttpInfo}.
   *
   * @param body Create a monitor configuration policy request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorConfigPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>>
      createMonitorConfigPolicyWithHttpInfoAsync(MonitorConfigPolicyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createMonitorConfigPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/monitor/policy";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.createMonitorConfigPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /**
   * Create a monitor notification rule.
   *
   * <p>See {@link #createMonitorNotificationRuleWithHttpInfo}.
   *
   * @param body Request body to create a monitor notification rule. (required)
   * @return MonitorNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleResponse createMonitorNotificationRule(
      MonitorNotificationRuleCreateRequest body) throws ApiException {
    return createMonitorNotificationRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a monitor notification rule.
   *
   * <p>See {@link #createMonitorNotificationRuleWithHttpInfoAsync}.
   *
   * @param body Request body to create a monitor notification rule. (required)
   * @return CompletableFuture&lt;MonitorNotificationRuleResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleResponse> createMonitorNotificationRuleAsync(
      MonitorNotificationRuleCreateRequest body) {
    return createMonitorNotificationRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a monitor notification rule.
   *
   * @param body Request body to create a monitor notification rule. (required)
   * @return ApiResponse&lt;MonitorNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorNotificationRuleResponse> createMonitorNotificationRuleWithHttpInfo(
      MonitorNotificationRuleCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMonitorNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/monitor/notification_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.createMonitorNotificationRule",
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }

  /**
   * Create a monitor notification rule.
   *
   * <p>See {@link #createMonitorNotificationRuleWithHttpInfo}.
   *
   * @param body Request body to create a monitor notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>>
      createMonitorNotificationRuleWithHttpInfoAsync(MonitorNotificationRuleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createMonitorNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/monitor/notification_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.createMonitorNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }

  /**
   * Delete a monitor configuration policy.
   *
   * <p>See {@link #deleteMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMonitorConfigPolicy(String policyId) throws ApiException {
    deleteMonitorConfigPolicyWithHttpInfo(policyId);
  }

  /**
   * Delete a monitor configuration policy.
   *
   * <p>See {@link #deleteMonitorConfigPolicyWithHttpInfoAsync}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteMonitorConfigPolicyAsync(String policyId) {
    return deleteMonitorConfigPolicyWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a monitor configuration policy.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteMonitorConfigPolicyWithHttpInfo(String policyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling deleteMonitorConfigPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.deleteMonitorConfigPolicy",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a monitor configuration policy.
   *
   * <p>See {@link #deleteMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteMonitorConfigPolicyWithHttpInfoAsync(
      String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling deleteMonitorConfigPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.deleteMonitorConfigPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a monitor notification rule.
   *
   * <p>See {@link #deleteMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMonitorNotificationRule(String ruleId) throws ApiException {
    deleteMonitorNotificationRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete a monitor notification rule.
   *
   * <p>See {@link #deleteMonitorNotificationRuleWithHttpInfoAsync}.
   *
   * @param ruleId ID of the monitor notification rule to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteMonitorNotificationRuleAsync(String ruleId) {
    return deleteMonitorNotificationRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a monitor notification rule by <code>rule_id</code>.
   *
   * @param ruleId ID of the monitor notification rule to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteMonitorNotificationRuleWithHttpInfo(String ruleId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ruleId' when calling deleteMonitorNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.deleteMonitorNotificationRule",
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
   * Delete a monitor notification rule.
   *
   * <p>See {@link #deleteMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteMonitorNotificationRuleWithHttpInfoAsync(
      String ruleId) {
    // Check if unstable operation is enabled
    String operationId = "deleteMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling"
                  + " deleteMonitorNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.deleteMonitorNotificationRule",
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
   * Get a monitor configuration policy.
   *
   * <p>See {@link #getMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return MonitorConfigPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorConfigPolicyResponse getMonitorConfigPolicy(String policyId) throws ApiException {
    return getMonitorConfigPolicyWithHttpInfo(policyId).getData();
  }

  /**
   * Get a monitor configuration policy.
   *
   * <p>See {@link #getMonitorConfigPolicyWithHttpInfoAsync}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return CompletableFuture&lt;MonitorConfigPolicyResponse&gt;
   */
  public CompletableFuture<MonitorConfigPolicyResponse> getMonitorConfigPolicyAsync(
      String policyId) {
    return getMonitorConfigPolicyWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a monitor configuration policy by <code>policy_id</code>.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return ApiResponse&lt;MonitorConfigPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorConfigPolicyResponse> getMonitorConfigPolicyWithHttpInfo(
      String policyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling getMonitorConfigPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.getMonitorConfigPolicy",
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /**
   * Get a monitor configuration policy.
   *
   * <p>See {@link #getMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorConfigPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>>
      getMonitorConfigPolicyWithHttpInfoAsync(String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling getMonitorConfigPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.getMonitorConfigPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /** Manage optional parameters to getMonitorNotificationRule. */
  public static class GetMonitorNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resource paths for related resources to include in the
     *     response. Supported resource path is <code>created_by</code>. (optional)
     * @return GetMonitorNotificationRuleOptionalParameters
     */
    public GetMonitorNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get a monitor notification rule.
   *
   * <p>See {@link #getMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @return MonitorNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleResponse getMonitorNotificationRule(String ruleId)
      throws ApiException {
    return getMonitorNotificationRuleWithHttpInfo(
            ruleId, new GetMonitorNotificationRuleOptionalParameters())
        .getData();
  }

  /**
   * Get a monitor notification rule.
   *
   * <p>See {@link #getMonitorNotificationRuleWithHttpInfoAsync}.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @return CompletableFuture&lt;MonitorNotificationRuleResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleResponse> getMonitorNotificationRuleAsync(
      String ruleId) {
    return getMonitorNotificationRuleWithHttpInfoAsync(
            ruleId, new GetMonitorNotificationRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a monitor notification rule.
   *
   * <p>See {@link #getMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return MonitorNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleResponse getMonitorNotificationRule(
      String ruleId, GetMonitorNotificationRuleOptionalParameters parameters) throws ApiException {
    return getMonitorNotificationRuleWithHttpInfo(ruleId, parameters).getData();
  }

  /**
   * Get a monitor notification rule.
   *
   * <p>See {@link #getMonitorNotificationRuleWithHttpInfoAsync}.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonitorNotificationRuleResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleResponse> getMonitorNotificationRuleAsync(
      String ruleId, GetMonitorNotificationRuleOptionalParameters parameters) {
    return getMonitorNotificationRuleWithHttpInfoAsync(ruleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a monitor notification rule by <code>rule_id</code>.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonitorNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorNotificationRuleResponse> getMonitorNotificationRuleWithHttpInfo(
      String ruleId, GetMonitorNotificationRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getMonitorNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.getMonitorNotificationRule",
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }

  /**
   * Get a monitor notification rule.
   *
   * <p>See {@link #getMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>>
      getMonitorNotificationRuleWithHttpInfoAsync(
          String ruleId, GetMonitorNotificationRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling getMonitorNotificationRule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.getMonitorNotificationRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }

  /** Manage optional parameters to getMonitorNotificationRules. */
  public static class GetMonitorNotificationRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resource paths for related resources to include in the
     *     response. Supported resource path is <code>created_by</code>. (optional)
     * @return GetMonitorNotificationRulesOptionalParameters
     */
    public GetMonitorNotificationRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get all monitor notification rules.
   *
   * <p>See {@link #getMonitorNotificationRulesWithHttpInfo}.
   *
   * @return MonitorNotificationRuleListResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleListResponse getMonitorNotificationRules() throws ApiException {
    return getMonitorNotificationRulesWithHttpInfo(
            new GetMonitorNotificationRulesOptionalParameters())
        .getData();
  }

  /**
   * Get all monitor notification rules.
   *
   * <p>See {@link #getMonitorNotificationRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;MonitorNotificationRuleListResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleListResponse> getMonitorNotificationRulesAsync() {
    return getMonitorNotificationRulesWithHttpInfoAsync(
            new GetMonitorNotificationRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all monitor notification rules.
   *
   * <p>See {@link #getMonitorNotificationRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return MonitorNotificationRuleListResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleListResponse getMonitorNotificationRules(
      GetMonitorNotificationRulesOptionalParameters parameters) throws ApiException {
    return getMonitorNotificationRulesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all monitor notification rules.
   *
   * <p>See {@link #getMonitorNotificationRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonitorNotificationRuleListResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleListResponse> getMonitorNotificationRulesAsync(
      GetMonitorNotificationRulesOptionalParameters parameters) {
    return getMonitorNotificationRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a list of all monitor notification rules.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonitorNotificationRuleListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorNotificationRuleListResponse> getMonitorNotificationRulesWithHttpInfo(
      GetMonitorNotificationRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getMonitorNotificationRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/monitor/notification_rule";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.getMonitorNotificationRules",
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
        new GenericType<MonitorNotificationRuleListResponse>() {});
  }

  /**
   * Get all monitor notification rules.
   *
   * <p>See {@link #getMonitorNotificationRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorNotificationRuleListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorNotificationRuleListResponse>>
      getMonitorNotificationRulesWithHttpInfoAsync(
          GetMonitorNotificationRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getMonitorNotificationRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<MonitorNotificationRuleListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/monitor/notification_rule";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.getMonitorNotificationRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleListResponse>> result =
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
        new GenericType<MonitorNotificationRuleListResponse>() {});
  }

  /**
   * Get all monitor configuration policies.
   *
   * <p>See {@link #listMonitorConfigPoliciesWithHttpInfo}.
   *
   * @return MonitorConfigPolicyListResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorConfigPolicyListResponse listMonitorConfigPolicies() throws ApiException {
    return listMonitorConfigPoliciesWithHttpInfo().getData();
  }

  /**
   * Get all monitor configuration policies.
   *
   * <p>See {@link #listMonitorConfigPoliciesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;MonitorConfigPolicyListResponse&gt;
   */
  public CompletableFuture<MonitorConfigPolicyListResponse> listMonitorConfigPoliciesAsync() {
    return listMonitorConfigPoliciesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all monitor configuration policies.
   *
   * @return ApiResponse&lt;MonitorConfigPolicyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorConfigPolicyListResponse> listMonitorConfigPoliciesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/monitor/policy";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.listMonitorConfigPolicies",
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
        new GenericType<MonitorConfigPolicyListResponse>() {});
  }

  /**
   * Get all monitor configuration policies.
   *
   * <p>See {@link #listMonitorConfigPoliciesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorConfigPolicyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorConfigPolicyListResponse>>
      listMonitorConfigPoliciesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/monitor/policy";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.listMonitorConfigPolicies",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyListResponse>> result =
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
        new GenericType<MonitorConfigPolicyListResponse>() {});
  }

  /**
   * Edit a monitor configuration policy.
   *
   * <p>See {@link #updateMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @param body Description of the update. (required)
   * @return MonitorConfigPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorConfigPolicyResponse updateMonitorConfigPolicy(
      String policyId, MonitorConfigPolicyEditRequest body) throws ApiException {
    return updateMonitorConfigPolicyWithHttpInfo(policyId, body).getData();
  }

  /**
   * Edit a monitor configuration policy.
   *
   * <p>See {@link #updateMonitorConfigPolicyWithHttpInfoAsync}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @param body Description of the update. (required)
   * @return CompletableFuture&lt;MonitorConfigPolicyResponse&gt;
   */
  public CompletableFuture<MonitorConfigPolicyResponse> updateMonitorConfigPolicyAsync(
      String policyId, MonitorConfigPolicyEditRequest body) {
    return updateMonitorConfigPolicyWithHttpInfoAsync(policyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a monitor configuration policy.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @param body Description of the update. (required)
   * @return ApiResponse&lt;MonitorConfigPolicyResponse&gt;
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
  public ApiResponse<MonitorConfigPolicyResponse> updateMonitorConfigPolicyWithHttpInfo(
      String policyId, MonitorConfigPolicyEditRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling updateMonitorConfigPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMonitorConfigPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.updateMonitorConfigPolicy",
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /**
   * Edit a monitor configuration policy.
   *
   * <p>See {@link #updateMonitorConfigPolicyWithHttpInfo}.
   *
   * @param policyId ID of the monitor configuration policy. (required)
   * @param body Description of the update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorConfigPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>>
      updateMonitorConfigPolicyWithHttpInfoAsync(
          String policyId, MonitorConfigPolicyEditRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyId' when calling updateMonitorConfigPolicy"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMonitorConfigPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/policy/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.updateMonitorConfigPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorConfigPolicyResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<MonitorConfigPolicyResponse>() {});
  }

  /**
   * Update a monitor notification rule.
   *
   * <p>See {@link #updateMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to update. (required)
   * @param body Request body to update the monitor notification rule. (required)
   * @return MonitorNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorNotificationRuleResponse updateMonitorNotificationRule(
      String ruleId, MonitorNotificationRuleUpdateRequest body) throws ApiException {
    return updateMonitorNotificationRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update a monitor notification rule.
   *
   * <p>See {@link #updateMonitorNotificationRuleWithHttpInfoAsync}.
   *
   * @param ruleId ID of the monitor notification rule to update. (required)
   * @param body Request body to update the monitor notification rule. (required)
   * @return CompletableFuture&lt;MonitorNotificationRuleResponse&gt;
   */
  public CompletableFuture<MonitorNotificationRuleResponse> updateMonitorNotificationRuleAsync(
      String ruleId, MonitorNotificationRuleUpdateRequest body) {
    return updateMonitorNotificationRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates a monitor notification rule by <code>rule_id</code>.
   *
   * @param ruleId ID of the monitor notification rule to update. (required)
   * @param body Request body to update the monitor notification rule. (required)
   * @return ApiResponse&lt;MonitorNotificationRuleResponse&gt;
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
  public ApiResponse<MonitorNotificationRuleResponse> updateMonitorNotificationRuleWithHttpInfo(
      String ruleId, MonitorNotificationRuleUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ruleId' when calling updateMonitorNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMonitorNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MonitorsApi.updateMonitorNotificationRule",
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }

  /**
   * Update a monitor notification rule.
   *
   * <p>See {@link #updateMonitorNotificationRuleWithHttpInfo}.
   *
   * @param ruleId ID of the monitor notification rule to update. (required)
   * @param body Request body to update the monitor notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>>
      updateMonitorNotificationRuleWithHttpInfoAsync(
          String ruleId, MonitorNotificationRuleUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateMonitorNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling"
                  + " updateMonitorNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateMonitorNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/notification_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MonitorsApi.updateMonitorNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorNotificationRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<MonitorNotificationRuleResponse>() {});
  }
}
