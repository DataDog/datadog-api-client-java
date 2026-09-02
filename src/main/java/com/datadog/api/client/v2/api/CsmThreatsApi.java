
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
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRulesListResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleCreateRequest;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateRequest;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPoliciesListResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyCreateRequest;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmThreatsApi {
  private ApiClient apiClient;
  public CsmThreatsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CsmThreatsApi(ApiClient apiClient) {
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
 * Create a Workload Protection agent rule (US1-FED).
 *
 * See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfo}.
 *
 * @param body The definition of the new agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse  createCloudWorkloadSecurityAgentRule(CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfo(body).getData();
  }

  /**
 * Create a Workload Protection agent rule (US1-FED).
 *
 * See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
 *
 * @param body The definition of the new agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>createCloudWorkloadSecurityAgentRuleAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new agent rule with the given parameters.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @param body The definition of the new agent rule (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> createCloudWorkloadSecurityAgentRuleWithHttpInfo(CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.createCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Create a Workload Protection agent rule (US1-FED).
   *
   * See {@link #createCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param body The definition of the new agent rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCloudWorkloadSecurityAgentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.createCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
 * Create a Workload Protection policy.
 *
 * See {@link #createCSMThreatsAgentPolicyWithHttpInfo}.
 *
 * @param body The definition of the new Agent policy (required)
 * @return CloudWorkloadSecurityAgentPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentPolicyResponse  createCSMThreatsAgentPolicy(CloudWorkloadSecurityAgentPolicyCreateRequest body) throws ApiException {
    return createCSMThreatsAgentPolicyWithHttpInfo(body).getData();
  }

  /**
 * Create a Workload Protection policy.
 *
 * See {@link #createCSMThreatsAgentPolicyWithHttpInfoAsync}.
 *
 * @param body The definition of the new Agent policy (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentPolicyResponse>createCSMThreatsAgentPolicyAsync(CloudWorkloadSecurityAgentPolicyCreateRequest body) {
    return createCSMThreatsAgentPolicyWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new Workload Protection policy with the given parameters.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param body The definition of the new Agent policy (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentPolicyResponse> createCSMThreatsAgentPolicyWithHttpInfo(CloudWorkloadSecurityAgentPolicyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCSMThreatsAgentPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.createCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
   * Create a Workload Protection policy.
   *
   * See {@link #createCSMThreatsAgentPolicyWithHttpInfo}.
   *
   * @param body The definition of the new Agent policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> createCSMThreatsAgentPolicyWithHttpInfoAsync(CloudWorkloadSecurityAgentPolicyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCSMThreatsAgentPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.createCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
 * Create a Workload Protection agent rule.
 *
 * See {@link #createCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param body The definition of the new agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse  createCSMThreatsAgentRule(CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    return createCSMThreatsAgentRuleWithHttpInfo(body).getData();
  }

  /**
 * Create a Workload Protection agent rule.
 *
 * See {@link #createCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param body The definition of the new agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>createCSMThreatsAgentRuleAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    return createCSMThreatsAgentRuleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new Workload Protection agent rule with the given parameters.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param body The definition of the new agent rule (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> createCSMThreatsAgentRuleWithHttpInfo(CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCSMThreatsAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.createCSMThreatsAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Create a Workload Protection agent rule.
   *
   * See {@link #createCSMThreatsAgentRuleWithHttpInfo}.
   *
   * @param body The definition of the new agent rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> createCSMThreatsAgentRuleWithHttpInfoAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCSMThreatsAgentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.createCSMThreatsAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
 * Delete a Workload Protection agent rule (US1-FED).
 *
 * See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCloudWorkloadSecurityAgentRule(String agentRuleId) throws ApiException {
    deleteCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId);
  }

  /**
 * Delete a Workload Protection agent rule (US1-FED).
 *
 * See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific agent rule.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCloudWorkloadSecurityAgentRuleWithHttpInfo(String agentRuleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling deleteCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a Workload Protection agent rule (US1-FED).
   *
   * See {@link #deleteCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(String agentRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling deleteCloudWorkloadSecurityAgentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete a Workload Protection policy.
 *
 * See {@link #deleteCSMThreatsAgentPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCSMThreatsAgentPolicy(String policyId) throws ApiException {
    deleteCSMThreatsAgentPolicyWithHttpInfo(policyId);
  }

  /**
 * Delete a Workload Protection policy.
 *
 * See {@link #deleteCSMThreatsAgentPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCSMThreatsAgentPolicyAsync(String policyId) {
    return deleteCSMThreatsAgentPolicyWithHttpInfoAsync(policyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific Workload Protection policy.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param policyId The ID of the Agent policy (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCSMThreatsAgentPolicyWithHttpInfo(String policyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling deleteCSMThreatsAgentPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a Workload Protection policy.
   *
   * See {@link #deleteCSMThreatsAgentPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the Agent policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCSMThreatsAgentPolicyWithHttpInfoAsync(String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling deleteCSMThreatsAgentPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Manage optional parameters to deleteCSMThreatsAgentRule.
   */
  public static class DeleteCSMThreatsAgentRuleOptionalParameters {
    private String policyId;

    /**
     * Set policyId.
     * @param policyId The ID of the Agent policy (optional)
     * @return DeleteCSMThreatsAgentRuleOptionalParameters
     */
    public DeleteCSMThreatsAgentRuleOptionalParameters policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  /**
 * Delete a Workload Protection agent rule.
 *
 * See {@link #deleteCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @throws ApiException if fails to make API call
 */
  public void deleteCSMThreatsAgentRule (String agentRuleId) throws ApiException {
     deleteCSMThreatsAgentRuleWithHttpInfo( agentRuleId, new DeleteCSMThreatsAgentRuleOptionalParameters());
  }

  /**
 * Delete a Workload Protection agent rule.
 *
 * See {@link #deleteCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCSMThreatsAgentRuleAsync(String agentRuleId) {
    return deleteCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, new DeleteCSMThreatsAgentRuleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Delete a Workload Protection agent rule.
 *
 * See {@link #deleteCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param parameters Optional parameters for the request.
 * @throws ApiException if fails to make API call
 */
  public  void deleteCSMThreatsAgentRule(String agentRuleId, DeleteCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
     deleteCSMThreatsAgentRuleWithHttpInfo(agentRuleId, parameters);
  }

  /**
 * Delete a Workload Protection agent rule.
 *
 * See {@link #deleteCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCSMThreatsAgentRuleAsync( String agentRuleId, DeleteCSMThreatsAgentRuleOptionalParameters parameters) {
    return deleteCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific Workload Protection agent rule.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCSMThreatsAgentRuleWithHttpInfo(String agentRuleId, DeleteCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling deleteCSMThreatsAgentRule");
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a Workload Protection agent rule.
   *
   * See {@link #deleteCSMThreatsAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCSMThreatsAgentRuleWithHttpInfoAsync(String agentRuleId, DeleteCSMThreatsAgentRuleOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling deleteCSMThreatsAgentRule"));
        return result;
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.deleteCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Download the Workload Protection policy (US1-FED).
 *
 * See {@link #downloadCloudWorkloadPolicyFileWithHttpInfo}.
 *
 * @return File
 * @throws ApiException if fails to make API call
 */
  public File  downloadCloudWorkloadPolicyFile() throws ApiException {
    return downloadCloudWorkloadPolicyFileWithHttpInfo().getData();
  }

  /**
 * Download the Workload Protection policy (US1-FED).
 *
 * See {@link #downloadCloudWorkloadPolicyFileWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;File&gt;
 */
  public CompletableFuture<File>downloadCloudWorkloadPolicyFileAsync() {
    return downloadCloudWorkloadPolicyFileWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>The download endpoint generates a Workload Protection policy file from your currently active
   * Workload Protection agent rules, and downloads them as a <code>.policy</code> file. This file can then be deployed to
   * your agents to update the policy running in your environment.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.downloadCloudWorkloadPolicyFile", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/yaml", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<File>() {});
  }

  /**
   * Download the Workload Protection policy (US1-FED).
   *
   * See {@link #downloadCloudWorkloadPolicyFileWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   */
  public CompletableFuture<ApiResponse<File>> downloadCloudWorkloadPolicyFileWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/cloud_workload/policy/download";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.downloadCloudWorkloadPolicyFile", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/yaml", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<File>() {});
  }

  /**
 * Download the Workload Protection policy.
 *
 * See {@link #downloadCSMThreatsPolicyWithHttpInfo}.
 *
 * @return File
 * @throws ApiException if fails to make API call
 */
  public File  downloadCSMThreatsPolicy() throws ApiException {
    return downloadCSMThreatsPolicyWithHttpInfo().getData();
  }

  /**
 * Download the Workload Protection policy.
 *
 * See {@link #downloadCSMThreatsPolicyWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;File&gt;
 */
  public CompletableFuture<File>downloadCSMThreatsPolicyAsync() {
    return downloadCSMThreatsPolicyWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>The download endpoint generates a Workload Protection policy file from your currently active
   * Workload Protection agent rules, and downloads them as a <code>.policy</code> file. This file can then be deployed to
   * your agents to update the policy running in your environment.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<File> downloadCSMThreatsPolicyWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/download";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.downloadCSMThreatsPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/zip", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<File>() {});
  }

  /**
   * Download the Workload Protection policy.
   *
   * See {@link #downloadCSMThreatsPolicyWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   */
  public CompletableFuture<ApiResponse<File>> downloadCSMThreatsPolicyWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/download";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.downloadCSMThreatsPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/zip", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<File>() {});
  }

  /**
 * Get a Workload Protection agent rule (US1-FED).
 *
 * See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse  getCloudWorkloadSecurityAgentRule(String agentRuleId) throws ApiException {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId).getData();
  }

  /**
 * Get a Workload Protection agent rule (US1-FED).
 *
 * See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>getCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the details of a specific agent rule.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> getCloudWorkloadSecurityAgentRuleWithHttpInfo(String agentRuleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling getCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.getCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Get a Workload Protection agent rule (US1-FED).
   *
   * See {@link #getCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(String agentRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling getCloudWorkloadSecurityAgentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.getCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
 * Get a Workload Protection policy.
 *
 * See {@link #getCSMThreatsAgentPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @return CloudWorkloadSecurityAgentPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentPolicyResponse  getCSMThreatsAgentPolicy(String policyId) throws ApiException {
    return getCSMThreatsAgentPolicyWithHttpInfo(policyId).getData();
  }

  /**
 * Get a Workload Protection policy.
 *
 * See {@link #getCSMThreatsAgentPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentPolicyResponse>getCSMThreatsAgentPolicyAsync(String policyId) {
    return getCSMThreatsAgentPolicyWithHttpInfoAsync(policyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the details of a specific Workload Protection policy.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param policyId The ID of the Agent policy (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentPolicyResponse> getCSMThreatsAgentPolicyWithHttpInfo(String policyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling getCSMThreatsAgentPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.getCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
   * Get a Workload Protection policy.
   *
   * See {@link #getCSMThreatsAgentPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the Agent policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> getCSMThreatsAgentPolicyWithHttpInfoAsync(String policyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling getCSMThreatsAgentPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.getCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
   * Manage optional parameters to getCSMThreatsAgentRule.
   */
  public static class GetCSMThreatsAgentRuleOptionalParameters {
    private String policyId;

    /**
     * Set policyId.
     * @param policyId The ID of the Agent policy (optional)
     * @return GetCSMThreatsAgentRuleOptionalParameters
     */
    public GetCSMThreatsAgentRuleOptionalParameters policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  /**
 * Get a Workload Protection agent rule.
 *
 * See {@link #getCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse getCSMThreatsAgentRule (String agentRuleId) throws ApiException {
    return getCSMThreatsAgentRuleWithHttpInfo( agentRuleId, new GetCSMThreatsAgentRuleOptionalParameters()).getData();
  }

  /**
 * Get a Workload Protection agent rule.
 *
 * See {@link #getCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>getCSMThreatsAgentRuleAsync(String agentRuleId) {
    return getCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, new GetCSMThreatsAgentRuleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a Workload Protection agent rule.
 *
 * See {@link #getCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param parameters Optional parameters for the request.
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse getCSMThreatsAgentRule(String agentRuleId, GetCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
    return getCSMThreatsAgentRuleWithHttpInfo(agentRuleId, parameters).getData();
  }

  /**
 * Get a Workload Protection agent rule.
 *
 * See {@link #getCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>getCSMThreatsAgentRuleAsync( String agentRuleId, GetCSMThreatsAgentRuleOptionalParameters parameters) {
    return getCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the details of a specific Workload Protection agent rule.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> getCSMThreatsAgentRuleWithHttpInfo(String agentRuleId, GetCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling getCSMThreatsAgentRule");
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.getCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Get a Workload Protection agent rule.
   *
   * See {@link #getCSMThreatsAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> getCSMThreatsAgentRuleWithHttpInfoAsync(String agentRuleId, GetCSMThreatsAgentRuleOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling getCSMThreatsAgentRule"));
        return result;
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.getCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
 * Get all Workload Protection agent rules (US1-FED).
 *
 * See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfo}.
 *
 * @return CloudWorkloadSecurityAgentRulesListResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRulesListResponse  listCloudWorkloadSecurityAgentRules() throws ApiException {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfo().getData();
  }

  /**
 * Get all Workload Protection agent rules (US1-FED).
 *
 * See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRulesListResponse>listCloudWorkloadSecurityAgentRulesAsync() {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of agent rules.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRulesListResponse> listCloudWorkloadSecurityAgentRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.listCloudWorkloadSecurityAgentRules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
   * Get all Workload Protection agent rules (US1-FED).
   *
   * See {@link #listCloudWorkloadSecurityAgentRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>> listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.listCloudWorkloadSecurityAgentRules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
 * Get all Workload Protection policies.
 *
 * See {@link #listCSMThreatsAgentPoliciesWithHttpInfo}.
 *
 * @return CloudWorkloadSecurityAgentPoliciesListResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentPoliciesListResponse  listCSMThreatsAgentPolicies() throws ApiException {
    return listCSMThreatsAgentPoliciesWithHttpInfo().getData();
  }

  /**
 * Get all Workload Protection policies.
 *
 * See {@link #listCSMThreatsAgentPoliciesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentPoliciesListResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentPoliciesListResponse>listCSMThreatsAgentPoliciesAsync() {
    return listCSMThreatsAgentPoliciesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of Workload Protection policies.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentPoliciesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentPoliciesListResponse> listCSMThreatsAgentPoliciesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.listCSMThreatsAgentPolicies", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPoliciesListResponse>() {});
  }

  /**
   * Get all Workload Protection policies.
   *
   * See {@link #listCSMThreatsAgentPoliciesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentPoliciesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPoliciesListResponse>> listCSMThreatsAgentPoliciesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.listCSMThreatsAgentPolicies", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPoliciesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPoliciesListResponse>() {});
  }

  /**
   * Manage optional parameters to listCSMThreatsAgentRules.
   */
  public static class ListCSMThreatsAgentRulesOptionalParameters {
    private String policyId;

    /**
     * Set policyId.
     * @param policyId The ID of the Agent policy (optional)
     * @return ListCSMThreatsAgentRulesOptionalParameters
     */
    public ListCSMThreatsAgentRulesOptionalParameters policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  /**
 * Get all Workload Protection agent rules.
 *
 * See {@link #listCSMThreatsAgentRulesWithHttpInfo}.
 *
 * @return CloudWorkloadSecurityAgentRulesListResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRulesListResponse listCSMThreatsAgentRules () throws ApiException {
    return listCSMThreatsAgentRulesWithHttpInfo(new ListCSMThreatsAgentRulesOptionalParameters()).getData();
  }

  /**
 * Get all Workload Protection agent rules.
 *
 * See {@link #listCSMThreatsAgentRulesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRulesListResponse>listCSMThreatsAgentRulesAsync() {
    return listCSMThreatsAgentRulesWithHttpInfoAsync(new ListCSMThreatsAgentRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all Workload Protection agent rules.
 *
 * See {@link #listCSMThreatsAgentRulesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CloudWorkloadSecurityAgentRulesListResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRulesListResponse listCSMThreatsAgentRules(ListCSMThreatsAgentRulesOptionalParameters parameters) throws ApiException {
    return listCSMThreatsAgentRulesWithHttpInfo(parameters).getData();
  }

  /**
 * Get all Workload Protection agent rules.
 *
 * See {@link #listCSMThreatsAgentRulesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRulesListResponse>listCSMThreatsAgentRulesAsync(ListCSMThreatsAgentRulesOptionalParameters parameters) {
    return listCSMThreatsAgentRulesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of Workload Protection agent rules.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudWorkloadSecurityAgentRulesListResponse> listCSMThreatsAgentRulesWithHttpInfo(ListCSMThreatsAgentRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.listCSMThreatsAgentRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
   * Get all Workload Protection agent rules.
   *
   * See {@link #listCSMThreatsAgentRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>> listCSMThreatsAgentRulesWithHttpInfoAsync(ListCSMThreatsAgentRulesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.listCSMThreatsAgentRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {});
  }

  /**
 * Update a Workload Protection agent rule (US1-FED).
 *
 * See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse  updateCloudWorkloadSecurityAgentRule(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) throws ApiException {
    return updateCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId, body).getData();
  }

  /**
 * Update a Workload Protection agent rule (US1-FED).
 *
 * See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>updateCloudWorkloadSecurityAgentRuleAsync(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) {
    return updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a specific agent rule.
   * Returns the agent rule object when the request is successful.</p>
   * <p><strong>Note</strong>: This endpoint should only be used for the Government (US1-FED) site.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param body New definition of the agent rule (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> updateCloudWorkloadSecurityAgentRuleWithHttpInfo(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling updateCloudWorkloadSecurityAgentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCloudWorkloadSecurityAgentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Update a Workload Protection agent rule (US1-FED).
   *
   * See {@link #updateCloudWorkloadSecurityAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param body New definition of the agent rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> updateCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling updateCloudWorkloadSecurityAgentRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCloudWorkloadSecurityAgentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCloudWorkloadSecurityAgentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
 * Update a Workload Protection policy.
 *
 * See {@link #updateCSMThreatsAgentPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @param body New definition of the Agent policy (required)
 * @return CloudWorkloadSecurityAgentPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentPolicyResponse  updateCSMThreatsAgentPolicy(String policyId, CloudWorkloadSecurityAgentPolicyUpdateRequest body) throws ApiException {
    return updateCSMThreatsAgentPolicyWithHttpInfo(policyId, body).getData();
  }

  /**
 * Update a Workload Protection policy.
 *
 * See {@link #updateCSMThreatsAgentPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the Agent policy (required)
 * @param body New definition of the Agent policy (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentPolicyResponse>updateCSMThreatsAgentPolicyAsync(String policyId, CloudWorkloadSecurityAgentPolicyUpdateRequest body) {
    return updateCSMThreatsAgentPolicyWithHttpInfoAsync(policyId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a specific Workload Protection policy.
   * Returns the policy object when the request is successful.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param policyId The ID of the Agent policy (required)
   * @param body New definition of the Agent policy (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<CloudWorkloadSecurityAgentPolicyResponse> updateCSMThreatsAgentPolicyWithHttpInfo(String policyId, CloudWorkloadSecurityAgentPolicyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling updateCSMThreatsAgentPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCSMThreatsAgentPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
   * Update a Workload Protection policy.
   *
   * See {@link #updateCSMThreatsAgentPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the Agent policy (required)
   * @param body New definition of the Agent policy (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> updateCSMThreatsAgentPolicyWithHttpInfoAsync(String policyId, CloudWorkloadSecurityAgentPolicyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling updateCSMThreatsAgentPolicy"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCSMThreatsAgentPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/policy/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCSMThreatsAgentPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentPolicyResponse>() {});
  }

  /**
   * Manage optional parameters to updateCSMThreatsAgentRule.
   */
  public static class UpdateCSMThreatsAgentRuleOptionalParameters {
    private String policyId;

    /**
     * Set policyId.
     * @param policyId The ID of the Agent policy (optional)
     * @return UpdateCSMThreatsAgentRuleOptionalParameters
     */
    public UpdateCSMThreatsAgentRuleOptionalParameters policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  /**
 * Update a Workload Protection agent rule.
 *
 * See {@link #updateCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse updateCSMThreatsAgentRule (String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) throws ApiException {
    return updateCSMThreatsAgentRuleWithHttpInfo( agentRuleId,  body, new UpdateCSMThreatsAgentRuleOptionalParameters()).getData();
  }

  /**
 * Update a Workload Protection agent rule.
 *
 * See {@link #updateCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>updateCSMThreatsAgentRuleAsync(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) {
    return updateCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, body, new UpdateCSMThreatsAgentRuleOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Update a Workload Protection agent rule.
 *
 * See {@link #updateCSMThreatsAgentRuleWithHttpInfo}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @param parameters Optional parameters for the request.
 * @return CloudWorkloadSecurityAgentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CloudWorkloadSecurityAgentRuleResponse updateCSMThreatsAgentRule(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body, UpdateCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
    return updateCSMThreatsAgentRuleWithHttpInfo(agentRuleId, body, parameters).getData();
  }

  /**
 * Update a Workload Protection agent rule.
 *
 * See {@link #updateCSMThreatsAgentRuleWithHttpInfoAsync}.
 *
 * @param agentRuleId The ID of the Agent rule (required)
 * @param body New definition of the agent rule (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
 */
  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>updateCSMThreatsAgentRuleAsync( String agentRuleId,  CloudWorkloadSecurityAgentRuleUpdateRequest body, UpdateCSMThreatsAgentRuleOptionalParameters parameters) {
    return updateCSMThreatsAgentRuleWithHttpInfoAsync(agentRuleId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a specific Workload Protection Agent rule.
   * Returns the agent rule object when the request is successful.</p>
   * <p><strong>Note</strong>: This endpoint is not available for the Government (US1-FED) site. Please reference the (US1-FED) specific resource below.</p>
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param body New definition of the agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<CloudWorkloadSecurityAgentRuleResponse> updateCSMThreatsAgentRuleWithHttpInfo(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body, UpdateCSMThreatsAgentRuleOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentRuleId' when calling updateCSMThreatsAgentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCSMThreatsAgentRule");
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }

  /**
   * Update a Workload Protection agent rule.
   *
   * See {@link #updateCSMThreatsAgentRuleWithHttpInfo}.
   *
   * @param agentRuleId The ID of the Agent rule (required)
   * @param body New definition of the agent rule (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> updateCSMThreatsAgentRuleWithHttpInfoAsync(String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body, UpdateCSMThreatsAgentRuleOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'agentRuleId' is set
    if (agentRuleId == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentRuleId' when calling updateCSMThreatsAgentRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCSMThreatsAgentRule"));
        return result;
    }
    String policyId = parameters.policyId;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/cws/agent_rules/{agent_rule_id}"
      .replaceAll("\\{" + "agent_rule_id" + "\\}", apiClient.escapeString(agentRuleId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policy_id", policyId));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmThreatsApi.updateCSMThreatsAgentRule", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {});
  }
}