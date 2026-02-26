
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
import com.datadog.api.client.v2.model.ScaRequest;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsResponse;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequest;
import com.datadog.api.client.v2.model.CustomRulesetResponse;
import com.datadog.api.client.v2.model.CustomRulesetRequest;
import com.datadog.api.client.v2.model.CustomRuleResponse;
import com.datadog.api.client.v2.model.CustomRuleRequest;
import com.datadog.api.client.v2.model.CustomRuleRevisionsResponse;
import com.datadog.api.client.v2.model.CustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.CustomRuleRevisionResponse;
import com.datadog.api.client.v2.model.CustomRuleRevision;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StaticAnalysisApi {
  private ApiClient apiClient;
  public StaticAnalysisApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StaticAnalysisApi(ApiClient apiClient) {
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
 * Create Custom Rule.
 *
 * See {@link #createCustomRuleWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param body  (required)
 * @return CustomRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRuleResponse  createCustomRule(String rulesetName, CustomRuleRequest body) throws ApiException {
    return createCustomRuleWithHttpInfo(rulesetName, body).getData();
  }

  /**
 * Create Custom Rule.
 *
 * See {@link #createCustomRuleWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param body  (required)
 * @return CompletableFuture&lt;CustomRuleResponse&gt;
 */
  public CompletableFuture<CustomRuleResponse>createCustomRuleAsync(String rulesetName, CustomRuleRequest body) {
    return createCustomRuleWithHttpInfoAsync(rulesetName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new custom rule within a ruleset</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param body  (required)
   * @return ApiResponse&lt;CustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - rule already exists </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition failed - validation error or ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleResponse> createCustomRuleWithHttpInfo(String rulesetName, CustomRuleRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling createCustomRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.createCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Create Custom Rule.
   *
   * See {@link #createCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleResponse>> createCustomRuleWithHttpInfoAsync(String rulesetName, CustomRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling createCustomRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCustomRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.createCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleResponse>() {});
  }

  /**
 * Create Custom Rule Revision.
 *
 * See {@link #createCustomRuleRevisionWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  createCustomRuleRevision(String rulesetName, String ruleName, CustomRuleRevisionRequest body) throws ApiException {
    createCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, body);
  }

  /**
 * Create Custom Rule Revision.
 *
 * See {@link #createCustomRuleRevisionWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>createCustomRuleRevisionAsync(String rulesetName, String ruleName, CustomRuleRevisionRequest body) {
    return createCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new revision for a custom rule</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createCustomRuleRevisionWithHttpInfo(String rulesetName, String ruleName, CustomRuleRevisionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling createCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling createCustomRuleRevision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.createCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Create Custom Rule Revision.
   *
   * See {@link #createCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createCustomRuleRevisionWithHttpInfoAsync(String rulesetName, String ruleName, CustomRuleRevisionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling createCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling createCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCustomRuleRevision"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.createCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * POST request to resolve vulnerable symbols.
 *
 * See {@link #createSCAResolveVulnerableSymbolsWithHttpInfo}.
 *
 * @param body  (required)
 * @return ResolveVulnerableSymbolsResponse
 * @throws ApiException if fails to make API call
 */
  public ResolveVulnerableSymbolsResponse  createSCAResolveVulnerableSymbols(ResolveVulnerableSymbolsRequest body) throws ApiException {
    return createSCAResolveVulnerableSymbolsWithHttpInfo(body).getData();
  }

  /**
 * POST request to resolve vulnerable symbols.
 *
 * See {@link #createSCAResolveVulnerableSymbolsWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;ResolveVulnerableSymbolsResponse&gt;
 */
  public CompletableFuture<ResolveVulnerableSymbolsResponse>createSCAResolveVulnerableSymbolsAsync(ResolveVulnerableSymbolsRequest body) {
    return createSCAResolveVulnerableSymbolsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**

   *
   * @param body  (required)
   * @return ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ResolveVulnerableSymbolsResponse> createSCAResolveVulnerableSymbolsWithHttpInfo(ResolveVulnerableSymbolsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSCAResolveVulnerableSymbols";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSCAResolveVulnerableSymbols");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.createSCAResolveVulnerableSymbols", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
   * POST request to resolve vulnerable symbols.
   *
   * See {@link #createSCAResolveVulnerableSymbolsWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> createSCAResolveVulnerableSymbolsWithHttpInfoAsync(ResolveVulnerableSymbolsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSCAResolveVulnerableSymbols";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSCAResolveVulnerableSymbols"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.createSCAResolveVulnerableSymbols", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
 * Post dependencies for analysis.
 *
 * See {@link #createSCAResultWithHttpInfo}.
 *
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  createSCAResult(ScaRequest body) throws ApiException {
    createSCAResultWithHttpInfo(body);
  }

  /**
 * Post dependencies for analysis.
 *
 * See {@link #createSCAResultWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>createSCAResultAsync(ScaRequest body) {
    return createSCAResultWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**

   *
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createSCAResultWithHttpInfo(ScaRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSCAResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSCAResult");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.createSCAResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Post dependencies for analysis.
   *
   * See {@link #createSCAResultWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createSCAResultWithHttpInfoAsync(ScaRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSCAResult";
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
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSCAResult"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.createSCAResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete Custom Rule.
 *
 * See {@link #deleteCustomRuleWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCustomRule(String rulesetName, String ruleName) throws ApiException {
    deleteCustomRuleWithHttpInfo(rulesetName, ruleName);
  }

  /**
 * Delete Custom Rule.
 *
 * See {@link #deleteCustomRuleWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCustomRuleAsync(String rulesetName, String ruleName) {
    return deleteCustomRuleWithHttpInfoAsync(rulesetName, ruleName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a custom rule</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomRuleWithHttpInfo(String rulesetName, String ruleName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling deleteCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling deleteCustomRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.deleteCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Custom Rule.
   *
   * See {@link #deleteCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomRuleWithHttpInfoAsync(String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling deleteCustomRule"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling deleteCustomRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.deleteCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete Custom Ruleset.
 *
 * See {@link #deleteCustomRulesetWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCustomRuleset(String rulesetName) throws ApiException {
    deleteCustomRulesetWithHttpInfo(rulesetName);
  }

  /**
 * Delete Custom Ruleset.
 *
 * See {@link #deleteCustomRulesetWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCustomRulesetAsync(String rulesetName) {
    return deleteCustomRulesetWithHttpInfoAsync(rulesetName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a custom ruleset</p>
   *
   * @param rulesetName The ruleset name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomRulesetWithHttpInfo(String rulesetName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling deleteCustomRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.deleteCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Custom Ruleset.
   *
   * See {@link #deleteCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomRulesetWithHttpInfoAsync(String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling deleteCustomRuleset"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.deleteCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Show Custom Rule.
 *
 * See {@link #getCustomRuleWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CustomRuleResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRuleResponse  getCustomRule(String rulesetName, String ruleName) throws ApiException {
    return getCustomRuleWithHttpInfo(rulesetName, ruleName).getData();
  }

  /**
 * Show Custom Rule.
 *
 * See {@link #getCustomRuleWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CompletableFuture&lt;CustomRuleResponse&gt;
 */
  public CompletableFuture<CustomRuleResponse>getCustomRuleAsync(String rulesetName, String ruleName) {
    return getCustomRuleWithHttpInfoAsync(rulesetName, ruleName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a custom rule by name</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return ApiResponse&lt;CustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleResponse> getCustomRuleWithHttpInfo(String rulesetName, String ruleName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling getCustomRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Show Custom Rule.
   *
   * See {@link #getCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleResponse>> getCustomRuleWithHttpInfoAsync(String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRule"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling getCustomRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleResponse>() {});
  }

  /**
 * Show Custom Rule Revision.
 *
 * See {@link #getCustomRuleRevisionWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param id The revision ID (required)
 * @return CustomRuleRevisionResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRuleRevisionResponse  getCustomRuleRevision(String rulesetName, String ruleName, String id) throws ApiException {
    return getCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, id).getData();
  }

  /**
 * Show Custom Rule Revision.
 *
 * See {@link #getCustomRuleRevisionWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param id The revision ID (required)
 * @return CompletableFuture&lt;CustomRuleRevisionResponse&gt;
 */
  public CompletableFuture<CustomRuleRevisionResponse>getCustomRuleRevisionAsync(String rulesetName, String ruleName, String id) {
    return getCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific revision of a custom rule</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return ApiResponse&lt;CustomRuleRevisionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Revision not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleRevisionResponse> getCustomRuleRevisionWithHttpInfo(String rulesetName, String ruleName, String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling getCustomRuleRevision");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleRevisionResponse>() {});
  }

  /**
   * Show Custom Rule Revision.
   *
   * See {@link #getCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleRevisionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> getCustomRuleRevisionWithHttpInfoAsync(String rulesetName, String ruleName, String id) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling getCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getCustomRuleRevision"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleRevisionResponse>() {});
  }

  /**
 * Show Custom Ruleset.
 *
 * See {@link #getCustomRulesetWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @return CustomRulesetResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRulesetResponse  getCustomRuleset(String rulesetName) throws ApiException {
    return getCustomRulesetWithHttpInfo(rulesetName).getData();
  }

  /**
 * Show Custom Ruleset.
 *
 * See {@link #getCustomRulesetWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @return CompletableFuture&lt;CustomRulesetResponse&gt;
 */
  public CompletableFuture<CustomRulesetResponse>getCustomRulesetAsync(String rulesetName) {
    return getCustomRulesetWithHttpInfoAsync(rulesetName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a custom ruleset by name</p>
   *
   * @param rulesetName The ruleset name (required)
   * @return ApiResponse&lt;CustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetResponse> getCustomRulesetWithHttpInfo(String rulesetName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Show Custom Ruleset.
   *
   * See {@link #getCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetResponse>> getCustomRulesetWithHttpInfoAsync(String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling getCustomRuleset"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.getCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Manage optional parameters to listCustomRuleRevisions.
   */
  public static class ListCustomRuleRevisionsOptionalParameters {
    private Integer pageOffset;
    private Integer pageLimit;

    /**
     * Set pageOffset.
     * @param pageOffset Pagination offset (optional, default to 0)
     * @return ListCustomRuleRevisionsOptionalParameters
     */
    public ListCustomRuleRevisionsOptionalParameters pageOffset(Integer pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Pagination limit (optional, default to 10)
     * @return ListCustomRuleRevisionsOptionalParameters
     */
    public ListCustomRuleRevisionsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CustomRuleRevisionsResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRuleRevisionsResponse listCustomRuleRevisions (String rulesetName, String ruleName) throws ApiException {
    return listCustomRuleRevisionsWithHttpInfo( rulesetName,  ruleName, new ListCustomRuleRevisionsOptionalParameters()).getData();
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CompletableFuture&lt;CustomRuleRevisionsResponse&gt;
 */
  public CompletableFuture<CustomRuleRevisionsResponse>listCustomRuleRevisionsAsync(String rulesetName, String ruleName) {
    return listCustomRuleRevisionsWithHttpInfoAsync(rulesetName, ruleName, new ListCustomRuleRevisionsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param parameters Optional parameters for the request.
 * @return CustomRuleRevisionsResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRuleRevisionsResponse listCustomRuleRevisions(String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) throws ApiException {
    return listCustomRuleRevisionsWithHttpInfo(rulesetName, ruleName, parameters).getData();
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CustomRuleRevisionsResponse&gt;
 */
  public CompletableFuture<CustomRuleRevisionsResponse>listCustomRuleRevisionsAsync( String rulesetName,  String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) {
    return listCustomRuleRevisionsWithHttpInfoAsync(rulesetName, ruleName, parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return PaginationIterable&lt;CustomRuleRevision&gt;
 */
  public PaginationIterable<CustomRuleRevision> listCustomRuleRevisionsWithPagination(String rulesetName, String ruleName) {
    ListCustomRuleRevisionsOptionalParameters parameters = new ListCustomRuleRevisionsOptionalParameters();
    return listCustomRuleRevisionsWithPagination(rulesetName, ruleName, parameters);
  }

  /**
 * List Custom Rule Revisions.
 *
 * See {@link #listCustomRuleRevisionsWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @return CustomRuleRevisionsResponse
 */
  public PaginationIterable<CustomRuleRevision> listCustomRuleRevisionsWithPagination(String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Integer limit;

  
  if (parameters.pageLimit == null) {
      limit = 10;
      parameters.pageLimit(limit);
  } else {
      limit = parameters.pageLimit;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("rulesetName", rulesetName);
  args.put("ruleName", ruleName);
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listCustomRuleRevisions", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get all revisions for a custom rule</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CustomRuleRevisionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleRevisionsResponse> listCustomRuleRevisionsWithHttpInfo(String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCustomRuleRevisions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling listCustomRuleRevisions");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling listCustomRuleRevisions");
    }
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.listCustomRuleRevisions", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleRevisionsResponse>() {});
  }

  /**
   * List Custom Rule Revisions.
   *
   * See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleRevisionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> listCustomRuleRevisionsWithHttpInfoAsync(String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCustomRuleRevisions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling listCustomRuleRevisions"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling listCustomRuleRevisions"));
        return result;
    }
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.listCustomRuleRevisions", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRuleRevisionsResponse>() {});
  }

  /**
 * Revert Custom Rule Revision.
 *
 * See {@link #revertCustomRuleRevisionWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  revertCustomRuleRevision(String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) throws ApiException {
    revertCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, body);
  }

  /**
 * Revert Custom Rule Revision.
 *
 * See {@link #revertCustomRuleRevisionWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param ruleName The rule name (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>revertCustomRuleRevisionAsync(String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) {
    return revertCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Revert a custom rule to a previous revision</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully reverted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> revertCustomRuleRevisionWithHttpInfo(String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "revertCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling revertCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleName' when calling revertCustomRuleRevision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling revertCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/revert"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.revertCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Revert Custom Rule Revision.
   *
   * See {@link #revertCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> revertCustomRuleRevisionWithHttpInfoAsync(String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "revertCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling revertCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleName' when calling revertCustomRuleRevision"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling revertCustomRuleRevision"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/revert"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
      .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.revertCustomRuleRevision", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Update Custom Ruleset.
 *
 * See {@link #updateCustomRulesetWithHttpInfo}.
 *
 * @param rulesetName The ruleset name (required)
 * @param body  (required)
 * @return CustomRulesetResponse
 * @throws ApiException if fails to make API call
 */
  public CustomRulesetResponse  updateCustomRuleset(String rulesetName, CustomRulesetRequest body) throws ApiException {
    return updateCustomRulesetWithHttpInfo(rulesetName, body).getData();
  }

  /**
 * Update Custom Ruleset.
 *
 * See {@link #updateCustomRulesetWithHttpInfoAsync}.
 *
 * @param rulesetName The ruleset name (required)
 * @param body  (required)
 * @return CompletableFuture&lt;CustomRulesetResponse&gt;
 */
  public CompletableFuture<CustomRulesetResponse>updateCustomRulesetAsync(String rulesetName, CustomRulesetRequest body) {
    return updateCustomRulesetWithHttpInfoAsync(rulesetName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an existing custom ruleset</p>
   *
   * @param rulesetName The ruleset name (required)
   * @param body  (required)
   * @return ApiResponse&lt;CustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition failed - validation error or ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetResponse> updateCustomRulesetWithHttpInfo(String rulesetName, CustomRulesetRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(400, "Missing the required parameter 'rulesetName' when calling updateCustomRuleset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.StaticAnalysisApi.updateCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Update Custom Ruleset.
   *
   * See {@link #updateCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetResponse>> updateCustomRulesetWithHttpInfoAsync(String rulesetName, CustomRulesetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
        CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'rulesetName' when calling updateCustomRuleset"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCustomRuleset"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
      .replaceAll("\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.StaticAnalysisApi.updateCustomRuleset", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomRulesetResponse>() {});
  }
}