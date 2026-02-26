
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
import com.datadog.api.client.v2.model.OutcomesResponse;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncRequest;
import com.datadog.api.client.v2.model.OutcomesBatchResponse;
import com.datadog.api.client.v2.model.OutcomesBatchRequest;
import com.datadog.api.client.v2.model.ListRulesResponse;
import com.datadog.api.client.v2.model.CreateRuleResponse;
import com.datadog.api.client.v2.model.CreateRuleRequest;
import com.datadog.api.client.v2.model.UpdateRuleResponse;
import com.datadog.api.client.v2.model.UpdateRuleRequest;
import com.datadog.api.client.v2.model.OutcomesResponseDataItem;
import com.datadog.api.client.v2.model.ListRulesResponseDataItem;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceScorecardsApi {
  private ApiClient apiClient;
  public ServiceScorecardsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceScorecardsApi(ApiClient apiClient) {
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
 * Create outcomes batch.
 *
 * See {@link #createScorecardOutcomesBatchWithHttpInfo}.
 *
 * @param body Set of scorecard outcomes. (required)
 * @return OutcomesBatchResponse
 * @throws ApiException if fails to make API call
 */
  public OutcomesBatchResponse  createScorecardOutcomesBatch(OutcomesBatchRequest body) throws ApiException {
    return createScorecardOutcomesBatchWithHttpInfo(body).getData();
  }

  /**
 * Create outcomes batch.
 *
 * See {@link #createScorecardOutcomesBatchWithHttpInfoAsync}.
 *
 * @param body Set of scorecard outcomes. (required)
 * @return CompletableFuture&lt;OutcomesBatchResponse&gt;
 */
  public CompletableFuture<OutcomesBatchResponse>createScorecardOutcomesBatchAsync(OutcomesBatchRequest body) {
    return createScorecardOutcomesBatchWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Sets multiple service-rule outcomes in a single batched request.</p>
   *
   * @param body Set of scorecard outcomes. (required)
   * @return ApiResponse&lt;OutcomesBatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OutcomesBatchResponse> createScorecardOutcomesBatchWithHttpInfo(OutcomesBatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createScorecardOutcomesBatch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScorecardOutcomesBatch");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes/batch";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.createScorecardOutcomesBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OutcomesBatchResponse>() {});
  }

  /**
   * Create outcomes batch.
   *
   * See {@link #createScorecardOutcomesBatchWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OutcomesBatchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OutcomesBatchResponse>> createScorecardOutcomesBatchWithHttpInfoAsync(OutcomesBatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createScorecardOutcomesBatch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createScorecardOutcomesBatch"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes/batch";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.createScorecardOutcomesBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OutcomesBatchResponse>() {});
  }

  /**
 * Create a new rule.
 *
 * See {@link #createScorecardRuleWithHttpInfo}.
 *
 * @param body Rule attributes. (required)
 * @return CreateRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CreateRuleResponse  createScorecardRule(CreateRuleRequest body) throws ApiException {
    return createScorecardRuleWithHttpInfo(body).getData();
  }

  /**
 * Create a new rule.
 *
 * See {@link #createScorecardRuleWithHttpInfoAsync}.
 *
 * @param body Rule attributes. (required)
 * @return CompletableFuture&lt;CreateRuleResponse&gt;
 */
  public CompletableFuture<CreateRuleResponse>createScorecardRuleAsync(CreateRuleRequest body) {
    return createScorecardRuleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Creates a new rule.</p>
   *
   * @param body Rule attributes. (required)
   * @return ApiResponse&lt;CreateRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateRuleResponse> createScorecardRuleWithHttpInfo(CreateRuleRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScorecardRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.createScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateRuleResponse>() {});
  }

  /**
   * Create a new rule.
   *
   * See {@link #createScorecardRuleWithHttpInfo}.
   *
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateRuleResponse>> createScorecardRuleWithHttpInfoAsync(CreateRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createScorecardRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.createScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateRuleResponse>() {});
  }

  /**
 * Delete a rule.
 *
 * See {@link #deleteScorecardRuleWithHttpInfo}.
 *
 * @param ruleId The ID of the rule. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteScorecardRule(String ruleId) throws ApiException {
    deleteScorecardRuleWithHttpInfo(ruleId);
  }

  /**
 * Delete a rule.
 *
 * See {@link #deleteScorecardRuleWithHttpInfoAsync}.
 *
 * @param ruleId The ID of the rule. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteScorecardRuleAsync(String ruleId) {
    return deleteScorecardRuleWithHttpInfoAsync(ruleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Deletes a single rule.</p>
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteScorecardRuleWithHttpInfo(String ruleId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteScorecardRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.deleteScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a rule.
   *
   * See {@link #deleteScorecardRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteScorecardRuleWithHttpInfoAsync(String ruleId) {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteScorecardRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.deleteScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Manage optional parameters to listScorecardOutcomes.
   */
  public static class ListScorecardOutcomesOptionalParameters {
    private Long pageSize;
    private Long pageOffset;
    private String include;
    private String fieldsOutcome;
    private String fieldsRule;
    private String filterOutcomeServiceName;
    private String filterOutcomeState;
    private Boolean filterRuleEnabled;
    private String filterRuleId;
    private String filterRuleName;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set include.
     * @param include Include related rule details in the response. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set fieldsOutcome.
     * @param fieldsOutcome Return only specified values in the outcome attributes. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters fieldsOutcome(String fieldsOutcome) {
      this.fieldsOutcome = fieldsOutcome;
      return this;
    }

    /**
     * Set fieldsRule.
     * @param fieldsRule Return only specified values in the included rule details. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters fieldsRule(String fieldsRule) {
      this.fieldsRule = fieldsRule;
      return this;
    }

    /**
     * Set filterOutcomeServiceName.
     * @param filterOutcomeServiceName Filter the outcomes on a specific service name. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterOutcomeServiceName(String filterOutcomeServiceName) {
      this.filterOutcomeServiceName = filterOutcomeServiceName;
      return this;
    }

    /**
     * Set filterOutcomeState.
     * @param filterOutcomeState Filter the outcomes by a specific state. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterOutcomeState(String filterOutcomeState) {
      this.filterOutcomeState = filterOutcomeState;
      return this;
    }

    /**
     * Set filterRuleEnabled.
     * @param filterRuleEnabled Filter outcomes on whether a rule is enabled/disabled. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterRuleEnabled(Boolean filterRuleEnabled) {
      this.filterRuleEnabled = filterRuleEnabled;
      return this;
    }

    /**
     * Set filterRuleId.
     * @param filterRuleId Filter outcomes based on rule ID. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleName.
     * @param filterRuleName Filter outcomes based on rule name. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterRuleName(String filterRuleName) {
      this.filterRuleName = filterRuleName;
      return this;
    }
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfo}.
 *
 * @return OutcomesResponse
 * @throws ApiException if fails to make API call
 */
  public OutcomesResponse listScorecardOutcomes () throws ApiException {
    return listScorecardOutcomesWithHttpInfo(new ListScorecardOutcomesOptionalParameters()).getData();
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;OutcomesResponse&gt;
 */
  public CompletableFuture<OutcomesResponse>listScorecardOutcomesAsync() {
    return listScorecardOutcomesWithHttpInfoAsync(new ListScorecardOutcomesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return OutcomesResponse
 * @throws ApiException if fails to make API call
 */
  public OutcomesResponse listScorecardOutcomes(ListScorecardOutcomesOptionalParameters parameters) throws ApiException {
    return listScorecardOutcomesWithHttpInfo(parameters).getData();
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;OutcomesResponse&gt;
 */
  public CompletableFuture<OutcomesResponse>listScorecardOutcomesAsync(ListScorecardOutcomesOptionalParameters parameters) {
    return listScorecardOutcomesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfo}.
 *
 * @return PaginationIterable&lt;OutcomesResponseDataItem&gt;
 */
  public PaginationIterable<OutcomesResponseDataItem> listScorecardOutcomesWithPagination() {
    ListScorecardOutcomesOptionalParameters parameters = new ListScorecardOutcomesOptionalParameters();
    return listScorecardOutcomesWithPagination(parameters);
  }

  /**
 * List all rule outcomes.
 *
 * See {@link #listScorecardOutcomesWithHttpInfo}.
 *
 * @return OutcomesResponse
 */
  public PaginationIterable<OutcomesResponseDataItem> listScorecardOutcomesWithPagination(ListScorecardOutcomesOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
  } else {
      limit = parameters.pageSize;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listScorecardOutcomes", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Fetches all rule outcomes.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OutcomesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OutcomesResponse> listScorecardOutcomesWithHttpInfo(ListScorecardOutcomesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardOutcomes";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String include = parameters.include;
    String fieldsOutcome = parameters.fieldsOutcome;
    String fieldsRule = parameters.fieldsRule;
    String filterOutcomeServiceName = parameters.filterOutcomeServiceName;
    String filterOutcomeState = parameters.filterOutcomeState;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleName = parameters.filterRuleName;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[outcome]", fieldsOutcome));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outcome][service_name]", filterOutcomeServiceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outcome][state]", filterOutcomeState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));

    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.listScorecardOutcomes", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OutcomesResponse>() {});
  }

  /**
   * List all rule outcomes.
   *
   * See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OutcomesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OutcomesResponse>> listScorecardOutcomesWithHttpInfoAsync(ListScorecardOutcomesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardOutcomes";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OutcomesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String include = parameters.include;
    String fieldsOutcome = parameters.fieldsOutcome;
    String fieldsRule = parameters.fieldsRule;
    String filterOutcomeServiceName = parameters.filterOutcomeServiceName;
    String filterOutcomeState = parameters.filterOutcomeState;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleName = parameters.filterRuleName;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[outcome]", fieldsOutcome));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outcome][service_name]", filterOutcomeServiceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outcome][state]", filterOutcomeState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.listScorecardOutcomes", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OutcomesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OutcomesResponse>() {});
  }

  /**
   * Manage optional parameters to listScorecardRules.
   */
  public static class ListScorecardRulesOptionalParameters {
    private Long pageSize;
    private Long pageOffset;
    private String include;
    private String filterRuleId;
    private Boolean filterRuleEnabled;
    private Boolean filterRuleCustom;
    private String filterRuleName;
    private String filterRuleDescription;
    private String fieldsRule;
    private String fieldsScorecard;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set include.
     * @param include Include related scorecard details in the response. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterRuleId.
     * @param filterRuleId Filter the rules on a rule ID. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleEnabled.
     * @param filterRuleEnabled Filter for enabled rules only. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleEnabled(Boolean filterRuleEnabled) {
      this.filterRuleEnabled = filterRuleEnabled;
      return this;
    }

    /**
     * Set filterRuleCustom.
     * @param filterRuleCustom Filter for custom rules only. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleCustom(Boolean filterRuleCustom) {
      this.filterRuleCustom = filterRuleCustom;
      return this;
    }

    /**
     * Set filterRuleName.
     * @param filterRuleName Filter rules on the rule name. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleName(String filterRuleName) {
      this.filterRuleName = filterRuleName;
      return this;
    }

    /**
     * Set filterRuleDescription.
     * @param filterRuleDescription Filter rules on the rule description. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleDescription(String filterRuleDescription) {
      this.filterRuleDescription = filterRuleDescription;
      return this;
    }

    /**
     * Set fieldsRule.
     * @param fieldsRule Return only specific fields in the response for rule attributes. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters fieldsRule(String fieldsRule) {
      this.fieldsRule = fieldsRule;
      return this;
    }

    /**
     * Set fieldsScorecard.
     * @param fieldsScorecard Return only specific fields in the included response for scorecard attributes. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters fieldsScorecard(String fieldsScorecard) {
      this.fieldsScorecard = fieldsScorecard;
      return this;
    }
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfo}.
 *
 * @return ListRulesResponse
 * @throws ApiException if fails to make API call
 */
  public ListRulesResponse listScorecardRules () throws ApiException {
    return listScorecardRulesWithHttpInfo(new ListScorecardRulesOptionalParameters()).getData();
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListRulesResponse&gt;
 */
  public CompletableFuture<ListRulesResponse>listScorecardRulesAsync() {
    return listScorecardRulesWithHttpInfoAsync(new ListScorecardRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListRulesResponse
 * @throws ApiException if fails to make API call
 */
  public ListRulesResponse listScorecardRules(ListScorecardRulesOptionalParameters parameters) throws ApiException {
    return listScorecardRulesWithHttpInfo(parameters).getData();
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListRulesResponse&gt;
 */
  public CompletableFuture<ListRulesResponse>listScorecardRulesAsync(ListScorecardRulesOptionalParameters parameters) {
    return listScorecardRulesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfo}.
 *
 * @return PaginationIterable&lt;ListRulesResponseDataItem&gt;
 */
  public PaginationIterable<ListRulesResponseDataItem> listScorecardRulesWithPagination() {
    ListScorecardRulesOptionalParameters parameters = new ListScorecardRulesOptionalParameters();
    return listScorecardRulesWithPagination(parameters);
  }

  /**
 * List all rules.
 *
 * See {@link #listScorecardRulesWithHttpInfo}.
 *
 * @return ListRulesResponse
 */
  public PaginationIterable<ListRulesResponseDataItem> listScorecardRulesWithPagination(ListScorecardRulesOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
  } else {
      limit = parameters.pageSize;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listScorecardRules", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Fetch all rules.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListRulesResponse> listScorecardRulesWithHttpInfo(ListScorecardRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String include = parameters.include;
    String filterRuleId = parameters.filterRuleId;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    Boolean filterRuleCustom = parameters.filterRuleCustom;
    String filterRuleName = parameters.filterRuleName;
    String filterRuleDescription = parameters.filterRuleDescription;
    String fieldsRule = parameters.fieldsRule;
    String fieldsScorecard = parameters.fieldsScorecard;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][description]", filterRuleDescription));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[scorecard]", fieldsScorecard));

    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.listScorecardRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListRulesResponse>() {});
  }

  /**
   * List all rules.
   *
   * See {@link #listScorecardRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListRulesResponse>> listScorecardRulesWithHttpInfoAsync(ListScorecardRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String include = parameters.include;
    String filterRuleId = parameters.filterRuleId;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    Boolean filterRuleCustom = parameters.filterRuleCustom;
    String filterRuleName = parameters.filterRuleName;
    String filterRuleDescription = parameters.filterRuleDescription;
    String fieldsRule = parameters.fieldsRule;
    String fieldsScorecard = parameters.fieldsScorecard;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][description]", filterRuleDescription));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[scorecard]", fieldsScorecard));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.listScorecardRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListRulesResponse>() {});
  }

  /**
 * Update Scorecard outcomes asynchronously.
 *
 * See {@link #updateScorecardOutcomesAsyncWithHttpInfo}.
 *
 * @param body Set of scorecard outcomes. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  updateScorecardOutcomesAsync(UpdateOutcomesAsyncRequest body) throws ApiException {
    updateScorecardOutcomesAsyncWithHttpInfo(body);
  }

  /**
 * Update Scorecard outcomes asynchronously.
 *
 * See {@link #updateScorecardOutcomesAsyncWithHttpInfoAsync}.
 *
 * @param body Set of scorecard outcomes. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>updateScorecardOutcomesAsyncAsync(UpdateOutcomesAsyncRequest body) {
    return updateScorecardOutcomesAsyncWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Updates multiple scorecard rule outcomes in a single batched request.</p>
   *
   * @param body Set of scorecard outcomes. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateScorecardOutcomesAsyncWithHttpInfo(UpdateOutcomesAsyncRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardOutcomesAsync";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScorecardOutcomesAsync");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.updateScorecardOutcomesAsync", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Update Scorecard outcomes asynchronously.
   *
   * See {@link #updateScorecardOutcomesAsyncWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateScorecardOutcomesAsyncWithHttpInfoAsync(UpdateOutcomesAsyncRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardOutcomesAsync";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateScorecardOutcomesAsync"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.updateScorecardOutcomesAsync", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Update an existing rule.
 *
 * See {@link #updateScorecardRuleWithHttpInfo}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body Rule attributes. (required)
 * @return UpdateRuleResponse
 * @throws ApiException if fails to make API call
 */
  public UpdateRuleResponse  updateScorecardRule(String ruleId, UpdateRuleRequest body) throws ApiException {
    return updateScorecardRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
 * Update an existing rule.
 *
 * See {@link #updateScorecardRuleWithHttpInfoAsync}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body Rule attributes. (required)
 * @return CompletableFuture&lt;UpdateRuleResponse&gt;
 */
  public CompletableFuture<UpdateRuleResponse>updateScorecardRuleAsync(String ruleId, UpdateRuleRequest body) {
    return updateScorecardRuleWithHttpInfoAsync(ruleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Updates an existing rule.</p>
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return ApiResponse&lt;UpdateRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Rule updated successfully </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateRuleResponse> updateScorecardRuleWithHttpInfo(String ruleId, UpdateRuleRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling updateScorecardRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScorecardRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceScorecardsApi.updateScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateRuleResponse>() {});
  }

  /**
   * Update an existing rule.
   *
   * See {@link #updateScorecardRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateRuleResponse>> updateScorecardRuleWithHttpInfoAsync(String ruleId, UpdateRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling updateScorecardRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateScorecardRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceScorecardsApi.updateScorecardRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateRuleResponse>() {});
  }
}