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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
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
   * Create a Cloud Workload Security Agent rule Create a new Agent rule with the given parameters.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CloudWorkloadSecurityAgentRuleResponse createCloudWorkloadSecurityAgentRule(
      CloudWorkloadSecurityAgentRuleCreateRequest body) throws ApiException {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfo(body).getData();
  }

  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>
      createCloudWorkloadSecurityAgentRuleAsync(CloudWorkloadSecurityAgentRuleCreateRequest body) {
    return createCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Workload Security Agent rule Create a new Agent rule with the given parameters.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.createCloudWorkloadSecurityAgentRule",
        localVarPath,
        "POST",
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
   * Create a Cloud Workload Security Agent rule Create a new Agent rule with the given parameters.
   *
   * @param body The definition of the new Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.createCloudWorkloadSecurityAgentRule",
        localVarPath,
        "POST",
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
   * Delete a Cloud Workload Security Agent rule Delete a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteCloudWorkloadSecurityAgentRule(String agentRuleId) throws ApiException {
    deleteCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId);
  }

  public CompletableFuture<Void> deleteCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return deleteCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Cloud Workload Security Agent rule Delete a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.deleteCloudWorkloadSecurityAgentRule",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Delete a Cloud Workload Security Agent rule Delete a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.deleteCloudWorkloadSecurityAgentRule",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Get the latest Cloud Workload Security policy The download endpoint generates a Cloud Workload
   * Security policy file from your currently active Cloud Workload Security rules, and downloads
   * them as a .policy file. This file can then be deployed to your agents to update the policy
   * running in your environment.
   *
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public File downloadCloudWorkloadPolicyFile() throws ApiException {
    return downloadCloudWorkloadPolicyFileWithHttpInfo().getData();
  }

  public CompletableFuture<File> downloadCloudWorkloadPolicyFileAsync() {
    return downloadCloudWorkloadPolicyFileWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the latest Cloud Workload Security policy The download endpoint generates a Cloud Workload
   * Security policy file from your currently active Cloud Workload Security rules, and downloads
   * them as a .policy file. This file can then be deployed to your agents to update the policy
   * running in your environment.
   *
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "downloadCloudWorkloadPolicyFile");

    final String[] localVarAccepts = {"application/yaml", "application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.downloadCloudWorkloadPolicyFile",
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
   * Get the latest Cloud Workload Security policy The download endpoint generates a Cloud Workload
   * Security policy file from your currently active Cloud Workload Security rules, and downloads
   * them as a .policy file. This file can then be deployed to your agents to update the policy
   * running in your environment.
   *
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<File>> downloadCloudWorkloadPolicyFileWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/cloud_workload/policy/download";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "downloadCloudWorkloadPolicyFile");

    final String[] localVarAccepts = {"application/yaml", "application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.downloadCloudWorkloadPolicyFile",
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
   * Get a Cloud Workload Security Agent rule Get the details of a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CloudWorkloadSecurityAgentRuleResponse getCloudWorkloadSecurityAgentRule(
      String agentRuleId) throws ApiException {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId).getData();
  }

  public CompletableFuture<CloudWorkloadSecurityAgentRuleResponse>
      getCloudWorkloadSecurityAgentRuleAsync(String agentRuleId) {
    return getCloudWorkloadSecurityAgentRuleWithHttpInfoAsync(agentRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Cloud Workload Security Agent rule Get the details of a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.getCloudWorkloadSecurityAgentRule",
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
   * Get a Cloud Workload Security Agent rule Get the details of a specific Agent rule.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.getCloudWorkloadSecurityAgentRule",
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
   * Get all Cloud Workload Security Agent rules Get the list of Agent rules.
   *
   * @return CloudWorkloadSecurityAgentRulesListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CloudWorkloadSecurityAgentRulesListResponse listCloudWorkloadSecurityAgentRules()
      throws ApiException {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfo().getData();
  }

  public CompletableFuture<CloudWorkloadSecurityAgentRulesListResponse>
      listCloudWorkloadSecurityAgentRulesAsync() {
    return listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Cloud Workload Security Agent rules Get the list of Agent rules.
   *
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listCloudWorkloadSecurityAgentRules");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRulesListResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.listCloudWorkloadSecurityAgentRules",
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
   * Get all Cloud Workload Security Agent rules Get the list of Agent rules.
   *
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CompletableFuture<ApiResponse<CloudWorkloadSecurityAgentRulesListResponse>>
      listCloudWorkloadSecurityAgentRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/cloud_workload_security/agent_rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listCloudWorkloadSecurityAgentRules");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRulesListResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRulesListResponse>() {};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.listCloudWorkloadSecurityAgentRules",
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
   * Update a Cloud Workload Security Agent rule Update a specific Agent rule. Returns the Agent
   * rule object when the request is successful.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return CloudWorkloadSecurityAgentRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public CloudWorkloadSecurityAgentRuleResponse updateCloudWorkloadSecurityAgentRule(
      String agentRuleId, CloudWorkloadSecurityAgentRuleUpdateRequest body) throws ApiException {
    return updateCloudWorkloadSecurityAgentRuleWithHttpInfo(agentRuleId, body).getData();
  }

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
   * Update a Cloud Workload Security Agent rule Update a specific Agent rule. Returns the Agent
   * rule object when the request is successful.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudWorkloadSecurityApi.updateCloudWorkloadSecurityAgentRule",
        localVarPath,
        "PATCH",
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
   * Update a Cloud Workload Security Agent rule Update a specific Agent rule. Returns the Agent
   * rule object when the request is successful.
   *
   * @param agentRuleId The ID of the Agent rule. (required)
   * @param body New definition of the Agent rule. (required)
   * @return ApiResponse&lt;CloudWorkloadSecurityAgentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateCloudWorkloadSecurityAgentRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<CloudWorkloadSecurityAgentRuleResponse> localVarReturnType =
        new GenericType<CloudWorkloadSecurityAgentRuleResponse>() {};

    return apiClient.invokeAPIAsync(
        "CloudWorkloadSecurityApi.updateCloudWorkloadSecurityAgentRule",
        localVarPath,
        "PATCH",
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
