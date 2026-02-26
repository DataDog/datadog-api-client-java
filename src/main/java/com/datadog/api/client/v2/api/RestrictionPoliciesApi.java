
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
import com.datadog.api.client.v2.model.RestrictionPolicyResponse;
import com.datadog.api.client.v2.model.RestrictionPolicyUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionPoliciesApi {
  private ApiClient apiClient;
  public RestrictionPoliciesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RestrictionPoliciesApi(ApiClient apiClient) {
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
 * Delete a restriction policy.
 *
 * See {@link #deleteRestrictionPolicyWithHttpInfo}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteRestrictionPolicy(String resourceId) throws ApiException {
    deleteRestrictionPolicyWithHttpInfo(resourceId);
  }

  /**
 * Delete a restriction policy.
 *
 * See {@link #deleteRestrictionPolicyWithHttpInfoAsync}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteRestrictionPolicyAsync(String resourceId) {
    return deleteRestrictionPolicyWithHttpInfoAsync(resourceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Deletes the restriction policy associated with a specified resource.</p>
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRestrictionPolicyWithHttpInfo(String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling deleteRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.deleteRestrictionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a restriction policy.
   *
   * See {@link #deleteRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRestrictionPolicyWithHttpInfoAsync(String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling deleteRestrictionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.deleteRestrictionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a restriction policy.
 *
 * See {@link #getRestrictionPolicyWithHttpInfo}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @return RestrictionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionPolicyResponse  getRestrictionPolicy(String resourceId) throws ApiException {
    return getRestrictionPolicyWithHttpInfo(resourceId).getData();
  }

  /**
 * Get a restriction policy.
 *
 * See {@link #getRestrictionPolicyWithHttpInfoAsync}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @return CompletableFuture&lt;RestrictionPolicyResponse&gt;
 */
  public CompletableFuture<RestrictionPolicyResponse>getRestrictionPolicyAsync(String resourceId) {
    return getRestrictionPolicyWithHttpInfoAsync(resourceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieves the restriction policy associated with a specified resource.</p>
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @return ApiResponse&lt;RestrictionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionPolicyResponse> getRestrictionPolicyWithHttpInfo(String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling getRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.getRestrictionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Get a restriction policy.
   *
   * See {@link #getRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionPolicyResponse>> getRestrictionPolicyWithHttpInfoAsync(String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling getRestrictionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.getRestrictionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Manage optional parameters to updateRestrictionPolicy.
   */
  public static class UpdateRestrictionPolicyOptionalParameters {
    private Boolean allowSelfLockout;

    /**
     * Set allowSelfLockout.
     * @param allowSelfLockout Allows admins (users with the <code>user_access_manage</code> permission) to remove their own access from the resource if set to <code>true</code>. By default, this is set to <code>false</code>, preventing admins from locking themselves out. (optional)
     * @return UpdateRestrictionPolicyOptionalParameters
     */
    public UpdateRestrictionPolicyOptionalParameters allowSelfLockout(Boolean allowSelfLockout) {
      this.allowSelfLockout = allowSelfLockout;
      return this;
    }
  }

  /**
 * Update a restriction policy.
 *
 * See {@link #updateRestrictionPolicyWithHttpInfo}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @param body Restriction policy payload (required)
 * @return RestrictionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionPolicyResponse updateRestrictionPolicy (String resourceId, RestrictionPolicyUpdateRequest body) throws ApiException {
    return updateRestrictionPolicyWithHttpInfo( resourceId,  body, new UpdateRestrictionPolicyOptionalParameters()).getData();
  }

  /**
 * Update a restriction policy.
 *
 * See {@link #updateRestrictionPolicyWithHttpInfoAsync}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @param body Restriction policy payload (required)
 * @return CompletableFuture&lt;RestrictionPolicyResponse&gt;
 */
  public CompletableFuture<RestrictionPolicyResponse>updateRestrictionPolicyAsync(String resourceId, RestrictionPolicyUpdateRequest body) {
    return updateRestrictionPolicyWithHttpInfoAsync(resourceId, body, new UpdateRestrictionPolicyOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Update a restriction policy.
 *
 * See {@link #updateRestrictionPolicyWithHttpInfo}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @param body Restriction policy payload (required)
 * @param parameters Optional parameters for the request.
 * @return RestrictionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionPolicyResponse updateRestrictionPolicy(String resourceId, RestrictionPolicyUpdateRequest body, UpdateRestrictionPolicyOptionalParameters parameters) throws ApiException {
    return updateRestrictionPolicyWithHttpInfo(resourceId, body, parameters).getData();
  }

  /**
 * Update a restriction policy.
 *
 * See {@link #updateRestrictionPolicyWithHttpInfoAsync}.
 *
 * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
 * @param body Restriction policy payload (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;RestrictionPolicyResponse&gt;
 */
  public CompletableFuture<RestrictionPolicyResponse>updateRestrictionPolicyAsync( String resourceId,  RestrictionPolicyUpdateRequest body, UpdateRestrictionPolicyOptionalParameters parameters) {
    return updateRestrictionPolicyWithHttpInfoAsync(resourceId, body, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Updates the restriction policy associated with a resource.</p>
   * <h3>Supported resources</h3>
   * <p>Restriction policies can be applied to the following resources:
   * - Dashboards: <code>dashboard</code>
   * - Integration Services: <code>integration-service</code>
   * - Integration Webhooks: <code>integration-webhook</code>
   * - Notebooks: <code>notebook</code>
   * - Powerpacks: <code>powerpack</code>
   * - Reference Tables: <code>reference-table</code>
   * - Security Rules: <code>security-rule</code>
   * - Service Level Objectives: <code>slo</code>
   * - Synthetic Global Variables: <code>synthetics-global-variable</code>
   * - Synthetic Tests: <code>synthetics-test</code>
   * - Synthetic Private Locations: <code>synthetics-private-location</code>
   * - Monitors: <code>monitor</code>
   * - Workflows: <code>workflow</code>
   * - App Builder Apps: <code>app-builder-app</code>
   * - Connections: <code>connection</code>
   * - Connection Groups: <code>connection-group</code>
   * - RUM Applications: <code>rum-application</code>
   * - Cross Org Connections: <code>cross-org-connection</code>
   * - Spreadsheets: <code>spreadsheet</code>
   * - On-Call Schedules: <code>on-call-schedule</code>
   * - On-Call Escalation Policies: <code>on-call-escalation-policy</code>
   * - On-Call Team Routing Rules: <code>on-call-team-routing-rules</code>
   * - Logs Pipelines: <code>logs-pipeline</code>
   * - Case Management Projects: <code>case-management-project</code></p>
   * <h3>Supported relations for resources</h3>
   * <p>Resource Type               | Supported Relations
   * ----------------------------|--------------------------
   * Dashboards                  | <code>viewer</code>, <code>editor</code>
   * Integration Services        | <code>viewer</code>, <code>editor</code>
   * Integration Webhooks        | <code>viewer</code>, <code>editor</code>
   * Notebooks                   | <code>viewer</code>, <code>editor</code>
   * Powerpacks                  | <code>viewer</code>, <code>editor</code>
   * Security Rules              | <code>viewer</code>, <code>editor</code>
   * Service Level Objectives    | <code>viewer</code>, <code>editor</code>
   * Synthetic Global Variables  | <code>viewer</code>, <code>editor</code>
   * Synthetic Tests             | <code>viewer</code>, <code>editor</code>
   * Synthetic Private Locations | <code>viewer</code>, <code>editor</code>
   * Monitors                    | <code>viewer</code>, <code>editor</code>
   * Reference Tables            | <code>viewer</code>, <code>editor</code>
   * Workflows                   | <code>viewer</code>, <code>runner</code>, <code>editor</code>
   * App Builder Apps            | <code>viewer</code>, <code>editor</code>
   * Connections                 | <code>viewer</code>, <code>resolver</code>, <code>editor</code>
   * Connection Groups           | <code>viewer</code>, <code>editor</code>
   * RUM Application             | <code>viewer</code>, <code>editor</code>
   * Cross Org Connections       | <code>viewer</code>, <code>editor</code>
   * Spreadsheets                | <code>viewer</code>, <code>editor</code>
   * On-Call Schedules           | <code>viewer</code>, <code>overrider</code>, <code>editor</code>
   * On-Call Escalation Policies | <code>viewer</code>, <code>editor</code>
   * On-Call Team Routing Rules  | <code>viewer</code>, <code>editor</code>
   * Logs Pipelines              | <code>viewer</code>, <code>processors_editor</code>, <code>editor</code>
   * Case Management Projects    | <code>viewer</code>, <code>contributor</code>, <code>manager</code></p>
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @param body Restriction policy payload (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RestrictionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionPolicyResponse> updateRestrictionPolicyWithHttpInfo(String resourceId, RestrictionPolicyUpdateRequest body, UpdateRestrictionPolicyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling updateRestrictionPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRestrictionPolicy");
    }
    Boolean allowSelfLockout = parameters.allowSelfLockout;
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allow_self_lockout", allowSelfLockout));

    Invocation.Builder builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.updateRestrictionPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Update a restriction policy.
   *
   * See {@link #updateRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>dashboard</code>, <code>integration-service</code>, <code>integration-webhook</code>, <code>notebook</code>, <code>reference-table</code>, <code>security-rule</code>, <code>slo</code>, <code>workflow</code>, <code>app-builder-app</code>, <code>connection</code>, <code>connection-group</code>, <code>rum-application</code>, <code>cross-org-connection</code>, <code>spreadsheet</code>, <code>on-call-schedule</code>, <code>on-call-escalation-policy</code>, <code>on-call-team-routing-rules</code>, <code>logs-pipeline</code>. (required)
   * @param body Restriction policy payload (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionPolicyResponse>> updateRestrictionPolicyWithHttpInfoAsync(String resourceId, RestrictionPolicyUpdateRequest body, UpdateRestrictionPolicyOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling updateRestrictionPolicy"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateRestrictionPolicy"));
        return result;
    }
    Boolean allowSelfLockout = parameters.allowSelfLockout;
    // create path and map variables
    String localVarPath = "/api/v2/restriction_policy/{resource_id}"
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allow_self_lockout", allowSelfLockout));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RestrictionPoliciesApi.updateRestrictionPolicy", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionPolicyResponse>() {});
  }
}