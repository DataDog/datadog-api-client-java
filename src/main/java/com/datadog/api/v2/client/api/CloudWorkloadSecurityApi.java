package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleCreateRequest;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleUpdateRequest;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRulesListResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudWorkloadSecurityApi {
  private ApiClient apiClient;

  public CloudWorkloadSecurityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CloudWorkloadSecurityApi(ApiClient apiClient) {
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

  /**
   * Create a Cloud Workload Security Agent rule
   *
   * <p>See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CloudWorkloadSecurityAgentRuleResponse createCloudWorkloadSecurityAgentRule(
      CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a Cloud Workload Security Agent rule
   *
   * <p>See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>
      createCloudWorkloadSecurityAgentRuleAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Workload Security Agent rule
   *
   * <p>Create a new Agent rule with the given parameters.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse>
      createCloudWorkloadSecurityAgentRuleWithHttpInfo(
          CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.createCloudWorkloadSecurityAgentRule",
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Create a Cloud Workload Security Agent rule
   *
   * <p>See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>>
      createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(
          CloudWorkloadSecurityAgentRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createCloudWorkloadSecurityAgentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createCloudWorkloadSecurityAgentRule");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.createCloudWorkloadSecurityAgentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Delete a Cloud Workload Security Agent rule
   *
   * <p>See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCloudWorkloadSecurityAgentRule(String agentRuleId) throws ApiException {
    deleteCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId);
  }

  /**
   * Delete a Cloud Workload Security Agent rule
   *
   * <p>See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   */
  public CompletableFuture<Void> deleteCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Cloud Workload Security Agent rule
   *
   * <p>Delete a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCloudWorkloadSecurityAgentRuleWithHttpInfo(String agentRuleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'agentRuleId' when calling"
              + " deleteCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.deleteCloudWorkloadSecurityAgentRule",
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
        null);
  }

  /**
   * Delete a Cloud Workload Security Agent rule
   *
   * <p>See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(
      String agentRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'agentRuleId' when calling"
                  + " deleteCloudWorkloadSecurityAgentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteCloudWorkloadSecurityAgentRule");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.deleteCloudWorkloadSecurityAgentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
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
   * Get the latest Cloud Workload Security policy
   *
   * <p>See {@link #downloadCloudWorkloadPolicyFileWithHttpInfo}.
   *
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File downloadCloudWorkloadPolicyFile() throws ApiException {
    return downloadCloudWorkloadPolicyFileWithHttpInfo().getData();
  }

  /**
   * Get the latest Cloud Workload Security policy
   *
   * <p>See {@link #downloadCloudWorkloadPolicyFileWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;File&gt;
   */
  public CompletableFuture<File> downloadCloudWorkloadPolicyFileAsync() {
    return downloadCloudWorkloadPolicyFileWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the latest Cloud Workload Security policy
   *
   * <p>The download endpoint generates a Cloud Workload Security policy file from your currently
   * active Cloud Workload Security rules, and downloads them as a .policy file. This file can then
   * be deployed to your agents to update the policy running in your environment.
   *
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<File> downloadCloudWorkloadPolicyFileWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/cloud_workload/policy/download";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.downloadCloudWorkloadPolicyFile",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/yaml", "application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<File>() {});
  }

  /**
   * Get the latest Cloud Workload Security policy
   *
   * <p>See {@link #downloadCloudWorkloadPolicyFileWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   */
  public CompletableFuture<ApiResponse<File>> downloadCloudWorkloadPolicyFileWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/cloud_workload/policy/download";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "downloadCloudWorkloadPolicyFile");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.downloadCloudWorkloadPolicyFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/yaml", "application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
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
        new GenericType<File>() {});
  }

  /**
   * Get a Cloud Workload Security Agent rule
   *
   * <p>See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CloudWorkloadSecurityAgentRuleResponse getCloudWorkloadSecurityAgentRule(
      String agentRuleId) throws ApiException {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId).getData();
  }

  /**
   * Get a Cloud Workload Security Agent rule
   *
   * <p>See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>
      getCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Cloud Workload Security Agent rule
   *
   * <p>Get the details of a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse>
      getCloudWorkloadSecurityAgentRuleWithHttpInfo(String agentRuleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'agentRuleId' when calling"
              + " getCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.getCloudWorkloadSecurityAgentRule",
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Get a Cloud Workload Security Agent rule
   *
   * <p>See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>>
      getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(String agentRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'agentRuleId' when calling"
                  + " getCloudWorkloadSecurityAgentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getCloudWorkloadSecurityAgentRule");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.getCloudWorkloadSecurityAgentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Get all Cloud Workload Security Agent rules
   *
   * <p>See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfo}.
   *
   * @return CloudWorkloadSecurityAgentRulesListResponse
   * @throws ApiException if fails to make API call
   */
  public CloudWorkloadSecurityAgentRulesListResponse listCloudWorkloadSecurityAgentRules()
      throws ApiException {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfo().getData();
  }

  /**
   * Get all Cloud Workload Security Agent rules
   *
   * <p>See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   */
  public CompletableFuture<CloudWorkloadSecurityAgentRulesListResponse>
      listCloudWorkloadSecurityAgentRulesAsync() {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Cloud Workload Security Agent rules
   *
   * <p>Get the list of Agent rules.
   *
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>
      listCloudWorkloadSecurityAgentRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.listCloudWorkloadSecurityAgentRules",
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
        new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
   * Get all Cloud Workload Security Agent rules
   *
   * <p>See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>>
      listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listCloudWorkloadSecurityAgentRules");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.listCloudWorkloadSecurityAgentRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>> result =
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
        new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
   * Update a Cloud Workload Security Agent rule
   *
   * <p>See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CloudWorkloadSecurityAgentRuleResponse updateCloudWorkloadSecurityAgentRule(
      String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) throws ApiException {
    return updateCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId, body).getData();
  }

  /**
   * Update a Cloud Workload Security Agent rule
   *
   * <p>See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>
      updateCloudWorkloadSecurityAgentRuleAsync(
          String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) {
    return updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Cloud Workload Security Agent rule
   *
   * <p>Update a specific Agent rule. Returns the Agent rule object when the request is successful.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse>
      updateCloudWorkloadSecurityAgentRuleWithHttpInfo(
          String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'agentRuleId' when calling"
              + " updateCloudWorkloadSecurityAgentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "CloudWorkloadSecurityApi.updateCloudWorkloadSecurityAgentRule",
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Update a Cloud Workload Security Agent rule
   *
   * <p>See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>>
      updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(
          String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'agentRuleId' when calling"
                  + " updateCloudWorkloadSecurityAgentRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateCloudWorkloadSecurityAgentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
            .replaceAll(
                "\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateCloudWorkloadSecurityAgentRule");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CloudWorkloadSecurityApi.updateCloudWorkloadSecurityAgentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result =
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
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }
}
