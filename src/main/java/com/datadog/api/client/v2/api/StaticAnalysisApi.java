package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AiCustomRuleRequest;
import com.datadog.api.client.v2.model.AiCustomRuleResponse;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionResponse;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionResponseData;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionsResponse;
import com.datadog.api.client.v2.model.AiCustomRulesetRequest;
import com.datadog.api.client.v2.model.AiCustomRulesetResponse;
import com.datadog.api.client.v2.model.AiCustomRulesetUpdateRequest;
import com.datadog.api.client.v2.model.AiCustomRulesetsResponse;
import com.datadog.api.client.v2.model.AiMemoryViolationResultRequest;
import com.datadog.api.client.v2.model.AiMemoryViolationResultsResponse;
import com.datadog.api.client.v2.model.AiPromptsResponse;
import com.datadog.api.client.v2.model.CustomRuleRequest;
import com.datadog.api.client.v2.model.CustomRuleResponse;
import com.datadog.api.client.v2.model.CustomRuleRevision;
import com.datadog.api.client.v2.model.CustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.CustomRuleRevisionResponse;
import com.datadog.api.client.v2.model.CustomRuleRevisionsResponse;
import com.datadog.api.client.v2.model.CustomRulesetListResponse;
import com.datadog.api.client.v2.model.CustomRulesetRequest;
import com.datadog.api.client.v2.model.CustomRulesetResponse;
import com.datadog.api.client.v2.model.LicensesListResponse;
import com.datadog.api.client.v2.model.McpScanRequest;
import com.datadog.api.client.v2.model.McpScanRequestResponse;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequest;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsResponse;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.ScaRequest;
import com.datadog.api.client.v2.model.ScanResultResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * Create an AI custom rule.
   *
   * <p>See {@link #createAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return AiCustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRuleResponse createAiCustomRule(String rulesetName, AiCustomRuleRequest body)
      throws ApiException {
    return createAiCustomRuleWithHttpInfo(rulesetName, body).getData();
  }

  /**
   * Create an AI custom rule.
   *
   * <p>See {@link #createAiCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiCustomRuleResponse&gt;
   */
  public CompletableFuture<AiCustomRuleResponse> createAiCustomRuleAsync(
      String rulesetName, AiCustomRuleRequest body) {
    return createAiCustomRuleWithHttpInfoAsync(rulesetName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new AI custom rule within a ruleset.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiCustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - rule already exists </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition Failed - validation error or ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRuleResponse> createAiCustomRuleWithHttpInfo(
      String rulesetName, AiCustomRuleRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling createAiCustomRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createAiCustomRule",
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
        new GenericType<AiCustomRuleResponse>() {});
  }

  /**
   * Create an AI custom rule.
   *
   * <p>See {@link #createAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRuleResponse>> createAiCustomRuleWithHttpInfoAsync(
      String rulesetName, AiCustomRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling createAiCustomRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createAiCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiCustomRuleResponse>() {});
  }

  /**
   * Create an AI custom rule revision.
   *
   * <p>See {@link #createAiCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createAiCustomRuleRevision(
      String rulesetName, String ruleName, AiCustomRuleRevisionRequest body) throws ApiException {
    createAiCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, body);
  }

  /**
   * Create an AI custom rule revision.
   *
   * <p>See {@link #createAiCustomRuleRevisionWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createAiCustomRuleRevisionAsync(
      String rulesetName, String ruleName, AiCustomRuleRevisionRequest body) {
    return createAiCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new revision for an AI custom rule.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createAiCustomRuleRevisionWithHttpInfo(
      String rulesetName, String ruleName, AiCustomRuleRevisionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'rulesetName' when calling createAiCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling createAiCustomRuleRevision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createAiCustomRuleRevision",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create an AI custom rule revision.
   *
   * <p>See {@link #createAiCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createAiCustomRuleRevisionWithHttpInfoAsync(
      String rulesetName, String ruleName, AiCustomRuleRevisionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling"
                  + " createAiCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling createAiCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAiCustomRuleRevision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createAiCustomRuleRevision",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create an AI custom ruleset.
   *
   * <p>See {@link #createAiCustomRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return AiCustomRulesetResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRulesetResponse createAiCustomRuleset(AiCustomRulesetRequest body)
      throws ApiException {
    return createAiCustomRulesetWithHttpInfo(body).getData();
  }

  /**
   * Create an AI custom ruleset.
   *
   * <p>See {@link #createAiCustomRulesetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiCustomRulesetResponse&gt;
   */
  public CompletableFuture<AiCustomRulesetResponse> createAiCustomRulesetAsync(
      AiCustomRulesetRequest body) {
    return createAiCustomRulesetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new AI custom ruleset for the authenticated organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiCustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - ruleset already exists </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition Failed - validation error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRulesetResponse> createAiCustomRulesetWithHttpInfo(
      AiCustomRulesetRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiCustomRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createAiCustomRuleset",
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
        new GenericType<AiCustomRulesetResponse>() {});
  }

  /**
   * Create an AI custom ruleset.
   *
   * <p>See {@link #createAiCustomRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRulesetResponse>>
      createAiCustomRulesetWithHttpInfoAsync(AiCustomRulesetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createAiCustomRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiCustomRulesetResponse>() {});
  }

  /**
   * Create an AI memory violation result.
   *
   * <p>See {@link #createAiMemoryViolationResultWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createAiMemoryViolationResult(AiMemoryViolationResultRequest body)
      throws ApiException {
    createAiMemoryViolationResultWithHttpInfo(body);
  }

  /**
   * Create an AI memory violation result.
   *
   * <p>See {@link #createAiMemoryViolationResultWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createAiMemoryViolationResultAsync(
      AiMemoryViolationResultRequest body) {
    return createAiMemoryViolationResultWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a new AI memory violation result for the authenticated organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createAiMemoryViolationResultWithHttpInfo(
      AiMemoryViolationResultRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiMemoryViolationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiMemoryViolationResult");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/memory";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createAiMemoryViolationResult",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create an AI memory violation result.
   *
   * <p>See {@link #createAiMemoryViolationResultWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createAiMemoryViolationResultWithHttpInfoAsync(
      AiMemoryViolationResultRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiMemoryViolationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAiMemoryViolationResult"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/memory";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createAiMemoryViolationResult",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create Custom Rule.
   *
   * <p>See {@link #createCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRuleResponse createCustomRule(String rulesetName, CustomRuleRequest body)
      throws ApiException {
    return createCustomRuleWithHttpInfo(rulesetName, body).getData();
  }

  /**
   * Create Custom Rule.
   *
   * <p>See {@link #createCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CompletableFuture&lt;CustomRuleResponse&gt;
   */
  public CompletableFuture<CustomRuleResponse> createCustomRuleAsync(
      String rulesetName, CustomRuleRequest body) {
    return createCustomRuleWithHttpInfoAsync(rulesetName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new custom rule within a ruleset
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return ApiResponse&lt;CustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<CustomRuleResponse> createCustomRuleWithHttpInfo(
      String rulesetName, CustomRuleRequest body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling createCustomRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createCustomRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Create Custom Rule.
   *
   * <p>See {@link #createCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleResponse>> createCustomRuleWithHttpInfoAsync(
      String rulesetName, CustomRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling createCustomRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Create Custom Rule Revision.
   *
   * <p>See {@link #createCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createCustomRuleRevision(
      String rulesetName, String ruleName, CustomRuleRevisionRequest body) throws ApiException {
    createCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, body);
  }

  /**
   * Create Custom Rule Revision.
   *
   * <p>See {@link #createCustomRuleRevisionWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createCustomRuleRevisionAsync(
      String rulesetName, String ruleName, CustomRuleRevisionRequest body) {
    return createCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new revision for a custom rule
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createCustomRuleRevisionWithHttpInfo(
      String rulesetName, String ruleName, CustomRuleRevisionRequest body) throws ApiException {
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
      throw new ApiException(
          400,
          "Missing the required parameter 'rulesetName' when calling createCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling createCustomRuleRevision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createCustomRuleRevision",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create Custom Rule Revision.
   *
   * <p>See {@link #createCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createCustomRuleRevisionWithHttpInfoAsync(
      String rulesetName, String ruleName, CustomRuleRevisionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling"
                  + " createCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling createCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCustomRuleRevision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createCustomRuleRevision",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create Custom Ruleset.
   *
   * <p>See {@link #createCustomRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return CustomRulesetResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRulesetResponse createCustomRuleset(CustomRulesetRequest body) throws ApiException {
    return createCustomRulesetWithHttpInfo(body).getData();
  }

  /**
   * Create Custom Ruleset.
   *
   * <p>See {@link #createCustomRulesetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CustomRulesetResponse&gt;
   */
  public CompletableFuture<CustomRulesetResponse> createCustomRulesetAsync(
      CustomRulesetRequest body) {
    return createCustomRulesetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new custom ruleset for the authenticated organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;CustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetResponse> createCustomRulesetWithHttpInfo(
      CustomRulesetRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCustomRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createCustomRuleset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Create Custom Ruleset.
   *
   * <p>See {@link #createCustomRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetResponse>> createCustomRulesetWithHttpInfoAsync(
      CustomRulesetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createCustomRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * POST request to resolve vulnerable symbols.
   *
   * <p>See {@link #createSCAResolveVulnerableSymbolsWithHttpInfo}.
   *
   * @param body (required)
   * @return ResolveVulnerableSymbolsResponse
   * @throws ApiException if fails to make API call
   */
  public ResolveVulnerableSymbolsResponse createSCAResolveVulnerableSymbols(
      ResolveVulnerableSymbolsRequest body) throws ApiException {
    return createSCAResolveVulnerableSymbolsWithHttpInfo(body).getData();
  }

  /**
   * POST request to resolve vulnerable symbols.
   *
   * <p>See {@link #createSCAResolveVulnerableSymbolsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ResolveVulnerableSymbolsResponse&gt;
   */
  public CompletableFuture<ResolveVulnerableSymbolsResponse> createSCAResolveVulnerableSymbolsAsync(
      ResolveVulnerableSymbolsRequest body) {
    return createSCAResolveVulnerableSymbolsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ResolveVulnerableSymbolsResponse>
      createSCAResolveVulnerableSymbolsWithHttpInfo(ResolveVulnerableSymbolsRequest body)
          throws ApiException {
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
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createSCAResolveVulnerableSymbols");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createSCAResolveVulnerableSymbols",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
   * POST request to resolve vulnerable symbols.
   *
   * <p>See {@link #createSCAResolveVulnerableSymbolsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>>
      createSCAResolveVulnerableSymbolsWithHttpInfoAsync(ResolveVulnerableSymbolsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSCAResolveVulnerableSymbols";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createSCAResolveVulnerableSymbols"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createSCAResolveVulnerableSymbols",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
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
        new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
   * Post dependencies for analysis.
   *
   * <p>See {@link #createSCAResultWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createSCAResult(ScaRequest body) throws ApiException {
    createSCAResultWithHttpInfo(body);
  }

  /**
   * Post dependencies for analysis.
   *
   * <p>See {@link #createSCAResultWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createSCAResultAsync(ScaRequest body) {
    return createSCAResultWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSCAResult");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createSCAResult",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Post dependencies for analysis.
   *
   * <p>See {@link #createSCAResultWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createSCAResultWithHttpInfoAsync(ScaRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSCAResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSCAResult"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createSCAResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Submit libraries for vulnerability scanning.
   *
   * <p>See {@link #createSCAScanWithHttpInfo}.
   *
   * @param body (required)
   * @return McpScanRequestResponse
   * @throws ApiException if fails to make API call
   */
  public McpScanRequestResponse createSCAScan(McpScanRequest body) throws ApiException {
    return createSCAScanWithHttpInfo(body).getData();
  }

  /**
   * Submit libraries for vulnerability scanning.
   *
   * <p>See {@link #createSCAScanWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;McpScanRequestResponse&gt;
   */
  public CompletableFuture<McpScanRequestResponse> createSCAScanAsync(McpScanRequest body) {
    return createSCAScanWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;McpScanRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<McpScanRequestResponse> createSCAScanWithHttpInfo(McpScanRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSCAScan";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSCAScan");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies/scan";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.createSCAScan",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<McpScanRequestResponse>() {});
  }

  /**
   * Submit libraries for vulnerability scanning.
   *
   * <p>See {@link #createSCAScanWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;McpScanRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<McpScanRequestResponse>> createSCAScanWithHttpInfoAsync(
      McpScanRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSCAScan";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<McpScanRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<McpScanRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSCAScan"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies/scan";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.createSCAScan",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<McpScanRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<McpScanRequestResponse>() {});
  }

  /**
   * Delete an AI custom rule.
   *
   * <p>See {@link #deleteAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiCustomRule(String rulesetName, String ruleName) throws ApiException {
    deleteAiCustomRuleWithHttpInfo(rulesetName, ruleName);
  }

  /**
   * Delete an AI custom rule.
   *
   * <p>See {@link #deleteAiCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiCustomRuleAsync(String rulesetName, String ruleName) {
    return deleteAiCustomRuleWithHttpInfoAsync(rulesetName, ruleName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI custom rule by name within a ruleset.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiCustomRuleWithHttpInfo(String rulesetName, String ruleName)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling deleteAiCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling deleteAiCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.deleteAiCustomRule",
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
   * Delete an AI custom rule.
   *
   * <p>See {@link #deleteAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiCustomRuleWithHttpInfoAsync(
      String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling deleteAiCustomRule"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleName' when calling deleteAiCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.deleteAiCustomRule",
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
   * Delete an AI custom ruleset.
   *
   * <p>See {@link #deleteAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiCustomRuleset(String rulesetName) throws ApiException {
    deleteAiCustomRulesetWithHttpInfo(rulesetName);
  }

  /**
   * Delete an AI custom ruleset.
   *
   * <p>See {@link #deleteAiCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiCustomRulesetAsync(String rulesetName) {
    return deleteAiCustomRulesetWithHttpInfoAsync(rulesetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI custom ruleset by name.
   *
   * @param rulesetName The ruleset name. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiCustomRulesetWithHttpInfo(String rulesetName)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling deleteAiCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.deleteAiCustomRuleset",
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
   * Delete an AI custom ruleset.
   *
   * <p>See {@link #deleteAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiCustomRulesetWithHttpInfoAsync(
      String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling deleteAiCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.deleteAiCustomRuleset",
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
   * Delete an AI memory violation result.
   *
   * <p>See {@link #deleteAiMemoryViolationResultWithHttpInfo}.
   *
   * @param id The numeric identifier of the memory violation result. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiMemoryViolationResult(String id) throws ApiException {
    deleteAiMemoryViolationResultWithHttpInfo(id);
  }

  /**
   * Delete an AI memory violation result.
   *
   * <p>See {@link #deleteAiMemoryViolationResultWithHttpInfoAsync}.
   *
   * @param id The numeric identifier of the memory violation result. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiMemoryViolationResultAsync(String id) {
    return deleteAiMemoryViolationResultWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI memory violation result by its numeric identifier.
   *
   * @param id The numeric identifier of the memory violation result. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Memory violation result not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiMemoryViolationResultWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiMemoryViolationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteAiMemoryViolationResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/memory/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.deleteAiMemoryViolationResult",
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
   * Delete an AI memory violation result.
   *
   * <p>See {@link #deleteAiMemoryViolationResultWithHttpInfo}.
   *
   * @param id The numeric identifier of the memory violation result. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiMemoryViolationResultWithHttpInfoAsync(
      String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiMemoryViolationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteAiMemoryViolationResult"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/memory/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.deleteAiMemoryViolationResult",
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
   * Delete Custom Rule.
   *
   * <p>See {@link #deleteCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomRule(String rulesetName, String ruleName) throws ApiException {
    deleteCustomRuleWithHttpInfo(rulesetName, ruleName);
  }

  /**
   * Delete Custom Rule.
   *
   * <p>See {@link #deleteCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCustomRuleAsync(String rulesetName, String ruleName) {
    return deleteCustomRuleWithHttpInfoAsync(rulesetName, ruleName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a custom rule
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully deleted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomRuleWithHttpInfo(String rulesetName, String ruleName)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling deleteCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling deleteCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.deleteCustomRule",
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
   * Delete Custom Rule.
   *
   * <p>See {@link #deleteCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomRuleWithHttpInfoAsync(
      String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling deleteCustomRule"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleName' when calling deleteCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.deleteCustomRule",
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
   * Delete Custom Ruleset.
   *
   * <p>See {@link #deleteCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomRuleset(String rulesetName) throws ApiException {
    deleteCustomRulesetWithHttpInfo(rulesetName);
  }

  /**
   * Delete Custom Ruleset.
   *
   * <p>See {@link #deleteCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCustomRulesetAsync(String rulesetName) {
    return deleteCustomRulesetWithHttpInfoAsync(rulesetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a custom ruleset
   *
   * @param rulesetName The ruleset name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling deleteCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.deleteCustomRuleset",
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
   * Delete Custom Ruleset.
   *
   * <p>See {@link #deleteCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomRulesetWithHttpInfoAsync(
      String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "deleteCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling deleteCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.deleteCustomRuleset",
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
   * Get an AI custom rule.
   *
   * <p>See {@link #getAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return AiCustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRuleResponse getAiCustomRule(String rulesetName, String ruleName)
      throws ApiException {
    return getAiCustomRuleWithHttpInfo(rulesetName, ruleName).getData();
  }

  /**
   * Get an AI custom rule.
   *
   * <p>See {@link #getAiCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return CompletableFuture&lt;AiCustomRuleResponse&gt;
   */
  public CompletableFuture<AiCustomRuleResponse> getAiCustomRuleAsync(
      String rulesetName, String ruleName) {
    return getAiCustomRuleWithHttpInfoAsync(rulesetName, ruleName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI custom rule by name within a ruleset.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return ApiResponse&lt;AiCustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRuleResponse> getAiCustomRuleWithHttpInfo(
      String rulesetName, String ruleName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getAiCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling getAiCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getAiCustomRule",
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
        new GenericType<AiCustomRuleResponse>() {});
  }

  /**
   * Get an AI custom rule.
   *
   * <p>See {@link #getAiCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRuleResponse>> getAiCustomRuleWithHttpInfoAsync(
      String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling getAiCustomRule"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleName' when calling getAiCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getAiCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiCustomRuleResponse>() {});
  }

  /**
   * Get an AI custom rule revision.
   *
   * <p>See {@link #getAiCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param id The revision identifier. (required)
   * @return AiCustomRuleRevisionResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRuleRevisionResponse getAiCustomRuleRevision(
      String rulesetName, String ruleName, String id) throws ApiException {
    return getAiCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, id).getData();
  }

  /**
   * Get an AI custom rule revision.
   *
   * <p>See {@link #getAiCustomRuleRevisionWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param id The revision identifier. (required)
   * @return CompletableFuture&lt;AiCustomRuleRevisionResponse&gt;
   */
  public CompletableFuture<AiCustomRuleRevisionResponse> getAiCustomRuleRevisionAsync(
      String rulesetName, String ruleName, String id) {
    return getAiCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific revision of an AI custom rule.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param id The revision identifier. (required)
   * @return ApiResponse&lt;AiCustomRuleRevisionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Revision not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRuleRevisionResponse> getAiCustomRuleRevisionWithHttpInfo(
      String rulesetName, String ruleName, String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getAiCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling getAiCustomRuleRevision");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getAiCustomRuleRevision",
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
        new GenericType<AiCustomRuleRevisionResponse>() {});
  }

  /**
   * Get an AI custom rule revision.
   *
   * <p>See {@link #getAiCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param id The revision identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRuleRevisionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>>
      getAiCustomRuleRevisionWithHttpInfoAsync(String rulesetName, String ruleName, String id) {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling getAiCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling getAiCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getAiCustomRuleRevision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getAiCustomRuleRevision",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionResponse>> result =
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
        new GenericType<AiCustomRuleRevisionResponse>() {});
  }

  /**
   * Get an AI custom ruleset.
   *
   * <p>See {@link #getAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @return AiCustomRulesetResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRulesetResponse getAiCustomRuleset(String rulesetName) throws ApiException {
    return getAiCustomRulesetWithHttpInfo(rulesetName).getData();
  }

  /**
   * Get an AI custom ruleset.
   *
   * <p>See {@link #getAiCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @return CompletableFuture&lt;AiCustomRulesetResponse&gt;
   */
  public CompletableFuture<AiCustomRulesetResponse> getAiCustomRulesetAsync(String rulesetName) {
    return getAiCustomRulesetWithHttpInfoAsync(rulesetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI custom ruleset by name.
   *
   * @param rulesetName The ruleset name. (required)
   * @return ApiResponse&lt;AiCustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRulesetResponse> getAiCustomRulesetWithHttpInfo(String rulesetName)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getAiCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getAiCustomRuleset",
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
        new GenericType<AiCustomRulesetResponse>() {});
  }

  /**
   * Get an AI custom ruleset.
   *
   * <p>See {@link #getAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRulesetResponse>>
      getAiCustomRulesetWithHttpInfoAsync(String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "getAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling getAiCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getAiCustomRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRulesetResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiCustomRulesetResponse>() {});
  }

  /**
   * Show Custom Rule.
   *
   * <p>See {@link #getCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRuleResponse getCustomRule(String rulesetName, String ruleName) throws ApiException {
    return getCustomRuleWithHttpInfo(rulesetName, ruleName).getData();
  }

  /**
   * Show Custom Rule.
   *
   * <p>See {@link #getCustomRuleWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;CustomRuleResponse&gt;
   */
  public CompletableFuture<CustomRuleResponse> getCustomRuleAsync(
      String rulesetName, String ruleName) {
    return getCustomRuleWithHttpInfoAsync(rulesetName, ruleName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a custom rule by name
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return ApiResponse&lt;CustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleResponse> getCustomRuleWithHttpInfo(
      String rulesetName, String ruleName) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getCustomRule");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling getCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getCustomRule",
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
        new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Show Custom Rule.
   *
   * <p>See {@link #getCustomRuleWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleResponse>> getCustomRuleWithHttpInfoAsync(
      String rulesetName, String ruleName) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling getCustomRule"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleName' when calling getCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRuleResponse>() {});
  }

  /**
   * Show Custom Rule Revision.
   *
   * <p>See {@link #getCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return CustomRuleRevisionResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRuleRevisionResponse getCustomRuleRevision(
      String rulesetName, String ruleName, String id) throws ApiException {
    return getCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, id).getData();
  }

  /**
   * Show Custom Rule Revision.
   *
   * <p>See {@link #getCustomRuleRevisionWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return CompletableFuture&lt;CustomRuleRevisionResponse&gt;
   */
  public CompletableFuture<CustomRuleRevisionResponse> getCustomRuleRevisionAsync(
      String rulesetName, String ruleName, String id) {
    return getCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific revision of a custom rule
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return ApiResponse&lt;CustomRuleRevisionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Revision not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleRevisionResponse> getCustomRuleRevisionWithHttpInfo(
      String rulesetName, String ruleName, String id) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling getCustomRuleRevision");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getCustomRuleRevision",
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
        new GenericType<CustomRuleRevisionResponse>() {});
  }

  /**
   * Show Custom Rule Revision.
   *
   * <p>See {@link #getCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param id The revision ID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleRevisionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleRevisionResponse>>
      getCustomRuleRevisionWithHttpInfoAsync(String rulesetName, String ruleName, String id) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling getCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleName' when calling getCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getCustomRuleRevision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/{id}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getCustomRuleRevision",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleRevisionResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRuleRevisionResponse>() {});
  }

  /**
   * Show Custom Ruleset.
   *
   * <p>See {@link #getCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CustomRulesetResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRulesetResponse getCustomRuleset(String rulesetName) throws ApiException {
    return getCustomRulesetWithHttpInfo(rulesetName).getData();
  }

  /**
   * Show Custom Ruleset.
   *
   * <p>See {@link #getCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture&lt;CustomRulesetResponse&gt;
   */
  public CompletableFuture<CustomRulesetResponse> getCustomRulesetAsync(String rulesetName) {
    return getCustomRulesetWithHttpInfoAsync(rulesetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a custom ruleset by name
   *
   * @param rulesetName The ruleset name (required)
   * @return ApiResponse&lt;CustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetResponse> getCustomRulesetWithHttpInfo(String rulesetName)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling getCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getCustomRuleset",
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
        new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Show Custom Ruleset.
   *
   * <p>See {@link #getCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetResponse>> getCustomRulesetWithHttpInfoAsync(
      String rulesetName) {
    // Check if unstable operation is enabled
    String operationId = "getCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rulesetName' when calling getCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getCustomRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Retrieve a dependency scan result.
   *
   * <p>See {@link #getSCAScanWithHttpInfo}.
   *
   * @param jobId The job identifier returned when the scan was submitted. (required)
   * @return ScanResultResponse
   * @throws ApiException if fails to make API call
   */
  public ScanResultResponse getSCAScan(String jobId) throws ApiException {
    return getSCAScanWithHttpInfo(jobId).getData();
  }

  /**
   * Retrieve a dependency scan result.
   *
   * <p>See {@link #getSCAScanWithHttpInfoAsync}.
   *
   * @param jobId The job identifier returned when the scan was submitted. (required)
   * @return CompletableFuture&lt;ScanResultResponse&gt;
   */
  public CompletableFuture<ScanResultResponse> getSCAScanAsync(String jobId) {
    return getSCAScanWithHttpInfoAsync(jobId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param jobId The job identifier returned when the scan was submitted. (required)
   * @return ApiResponse&lt;ScanResultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ScanResultResponse> getSCAScanWithHttpInfo(String jobId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSCAScan";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getSCAScan");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis-sca/dependencies/scan/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.getSCAScan",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ScanResultResponse>() {});
  }

  /**
   * Retrieve a dependency scan result.
   *
   * <p>See {@link #getSCAScanWithHttpInfo}.
   *
   * @param jobId The job identifier returned when the scan was submitted. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ScanResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ScanResultResponse>> getSCAScanWithHttpInfoAsync(
      String jobId) {
    // Check if unstable operation is enabled
    String operationId = "getSCAScan";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ScanResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      CompletableFuture<ApiResponse<ScanResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'jobId' when calling getSCAScan"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis-sca/dependencies/scan/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.getSCAScan",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ScanResultResponse>> result = new CompletableFuture<>();
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
        new GenericType<ScanResultResponse>() {});
  }

  /** Manage optional parameters to listAiCustomRuleRevisions. */
  public static class ListAiCustomRuleRevisionsOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;

    /**
     * Set pageOffset.
     *
     * @param pageOffset The offset for pagination. (optional, default to 0)
     * @return ListAiCustomRuleRevisionsOptionalParameters
     */
    public ListAiCustomRuleRevisionsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The maximum number of revisions to return. (optional, default to 100)
     * @return ListAiCustomRuleRevisionsOptionalParameters
     */
    public ListAiCustomRuleRevisionsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return AiCustomRuleRevisionsResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRuleRevisionsResponse listAiCustomRuleRevisions(
      String rulesetName, String ruleName) throws ApiException {
    return listAiCustomRuleRevisionsWithHttpInfo(
            rulesetName, ruleName, new ListAiCustomRuleRevisionsOptionalParameters())
        .getData();
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return CompletableFuture&lt;AiCustomRuleRevisionsResponse&gt;
   */
  public CompletableFuture<AiCustomRuleRevisionsResponse> listAiCustomRuleRevisionsAsync(
      String rulesetName, String ruleName) {
    return listAiCustomRuleRevisionsWithHttpInfoAsync(
            rulesetName, ruleName, new ListAiCustomRuleRevisionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param parameters Optional parameters for the request.
   * @return AiCustomRuleRevisionsResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRuleRevisionsResponse listAiCustomRuleRevisions(
      String rulesetName, String ruleName, ListAiCustomRuleRevisionsOptionalParameters parameters)
      throws ApiException {
    return listAiCustomRuleRevisionsWithHttpInfo(rulesetName, ruleName, parameters).getData();
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiCustomRuleRevisionsResponse&gt;
   */
  public CompletableFuture<AiCustomRuleRevisionsResponse> listAiCustomRuleRevisionsAsync(
      String rulesetName, String ruleName, ListAiCustomRuleRevisionsOptionalParameters parameters) {
    return listAiCustomRuleRevisionsWithHttpInfoAsync(rulesetName, ruleName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return PaginationIterable&lt;AiCustomRuleRevisionResponseData&gt;
   */
  public PaginationIterable<AiCustomRuleRevisionResponseData>
      listAiCustomRuleRevisionsWithPagination(String rulesetName, String ruleName) {
    ListAiCustomRuleRevisionsOptionalParameters parameters =
        new ListAiCustomRuleRevisionsOptionalParameters();
    return listAiCustomRuleRevisionsWithPagination(rulesetName, ruleName, parameters);
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @return AiCustomRuleRevisionsResponse
   */
  public PaginationIterable<AiCustomRuleRevisionResponseData>
      listAiCustomRuleRevisionsWithPagination(
          String rulesetName,
          String ruleName,
          ListAiCustomRuleRevisionsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("rulesetName", rulesetName);
    args.put("ruleName", ruleName);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listAiCustomRuleRevisions",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get all revisions for an AI custom rule.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiCustomRuleRevisionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRuleRevisionsResponse> listAiCustomRuleRevisionsWithHttpInfo(
      String rulesetName, String ruleName, ListAiCustomRuleRevisionsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiCustomRuleRevisions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'rulesetName' when calling listAiCustomRuleRevisions");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling listAiCustomRuleRevisions");
    }
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listAiCustomRuleRevisions",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<AiCustomRuleRevisionsResponse>() {});
  }

  /**
   * List AI custom rule revisions.
   *
   * <p>See {@link #listAiCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param ruleName The rule name. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRuleRevisionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRuleRevisionsResponse>>
      listAiCustomRuleRevisionsWithHttpInfoAsync(
          String rulesetName,
          String ruleName,
          ListAiCustomRuleRevisionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiCustomRuleRevisions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling"
                  + " listAiCustomRuleRevisions"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling listAiCustomRuleRevisions"));
      return result;
    }
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listAiCustomRuleRevisions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRuleRevisionsResponse>> result =
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
        new GenericType<AiCustomRuleRevisionsResponse>() {});
  }

  /** Manage optional parameters to listAiCustomRulesets. */
  public static class ListAiCustomRulesetsOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;

    /**
     * Set pageOffset.
     *
     * @param pageOffset The offset for pagination. (optional, default to 0)
     * @return ListAiCustomRulesetsOptionalParameters
     */
    public ListAiCustomRulesetsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The maximum number of rulesets to return. (optional, default to 100)
     * @return ListAiCustomRulesetsOptionalParameters
     */
    public ListAiCustomRulesetsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List AI custom rulesets.
   *
   * <p>See {@link #listAiCustomRulesetsWithHttpInfo}.
   *
   * @return AiCustomRulesetsResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRulesetsResponse listAiCustomRulesets() throws ApiException {
    return listAiCustomRulesetsWithHttpInfo(new ListAiCustomRulesetsOptionalParameters()).getData();
  }

  /**
   * List AI custom rulesets.
   *
   * <p>See {@link #listAiCustomRulesetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiCustomRulesetsResponse&gt;
   */
  public CompletableFuture<AiCustomRulesetsResponse> listAiCustomRulesetsAsync() {
    return listAiCustomRulesetsWithHttpInfoAsync(new ListAiCustomRulesetsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI custom rulesets.
   *
   * <p>See {@link #listAiCustomRulesetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AiCustomRulesetsResponse
   * @throws ApiException if fails to make API call
   */
  public AiCustomRulesetsResponse listAiCustomRulesets(
      ListAiCustomRulesetsOptionalParameters parameters) throws ApiException {
    return listAiCustomRulesetsWithHttpInfo(parameters).getData();
  }

  /**
   * List AI custom rulesets.
   *
   * <p>See {@link #listAiCustomRulesetsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiCustomRulesetsResponse&gt;
   */
  public CompletableFuture<AiCustomRulesetsResponse> listAiCustomRulesetsAsync(
      ListAiCustomRulesetsOptionalParameters parameters) {
    return listAiCustomRulesetsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AI custom rulesets for the authenticated organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiCustomRulesetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiCustomRulesetsResponse> listAiCustomRulesetsWithHttpInfo(
      ListAiCustomRulesetsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiCustomRulesets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/rulesets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listAiCustomRulesets",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<AiCustomRulesetsResponse>() {});
  }

  /**
   * List AI custom rulesets.
   *
   * <p>See {@link #listAiCustomRulesetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiCustomRulesetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiCustomRulesetsResponse>>
      listAiCustomRulesetsWithHttpInfoAsync(ListAiCustomRulesetsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiCustomRulesets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiCustomRulesetsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/rulesets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listAiCustomRulesets",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiCustomRulesetsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiCustomRulesetsResponse>() {});
  }

  /**
   * List AI memory violation results.
   *
   * <p>See {@link #listAiMemoryViolationResultsWithHttpInfo}.
   *
   * @return AiMemoryViolationResultsResponse
   * @throws ApiException if fails to make API call
   */
  public AiMemoryViolationResultsResponse listAiMemoryViolationResults() throws ApiException {
    return listAiMemoryViolationResultsWithHttpInfo().getData();
  }

  /**
   * List AI memory violation results.
   *
   * <p>See {@link #listAiMemoryViolationResultsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiMemoryViolationResultsResponse&gt;
   */
  public CompletableFuture<AiMemoryViolationResultsResponse> listAiMemoryViolationResultsAsync() {
    return listAiMemoryViolationResultsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AI memory violation results for the authenticated organization.
   *
   * @return ApiResponse&lt;AiMemoryViolationResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiMemoryViolationResultsResponse> listAiMemoryViolationResultsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiMemoryViolationResults";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/memory";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listAiMemoryViolationResults",
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
        new GenericType<AiMemoryViolationResultsResponse>() {});
  }

  /**
   * List AI memory violation results.
   *
   * <p>See {@link #listAiMemoryViolationResultsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiMemoryViolationResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiMemoryViolationResultsResponse>>
      listAiMemoryViolationResultsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiMemoryViolationResults";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiMemoryViolationResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/memory";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listAiMemoryViolationResults",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiMemoryViolationResultsResponse>> result =
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
        new GenericType<AiMemoryViolationResultsResponse>() {});
  }

  /**
   * List AI prompts.
   *
   * <p>See {@link #listAiPromptsWithHttpInfo}.
   *
   * @return AiPromptsResponse
   * @throws ApiException if fails to make API call
   */
  public AiPromptsResponse listAiPrompts() throws ApiException {
    return listAiPromptsWithHttpInfo().getData();
  }

  /**
   * List AI prompts.
   *
   * <p>See {@link #listAiPromptsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiPromptsResponse&gt;
   */
  public CompletableFuture<AiPromptsResponse> listAiPromptsAsync() {
    return listAiPromptsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AI prompts, including default prompts and custom AI rule prompts for the authenticated
   * organization.
   *
   * @return ApiResponse&lt;AiPromptsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiPromptsResponse> listAiPromptsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiPrompts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/prompts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listAiPrompts",
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
        new GenericType<AiPromptsResponse>() {});
  }

  /**
   * List AI prompts.
   *
   * <p>See {@link #listAiPromptsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiPromptsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiPromptsResponse>> listAiPromptsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiPrompts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiPromptsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/ai/prompts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listAiPrompts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiPromptsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiPromptsResponse>() {});
  }

  /** Manage optional parameters to listCustomRuleRevisions. */
  public static class ListCustomRuleRevisionsOptionalParameters {
    private Integer pageOffset;
    private Integer pageLimit;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Pagination offset (optional, default to 0)
     * @return ListCustomRuleRevisionsOptionalParameters
     */
    public ListCustomRuleRevisionsOptionalParameters pageOffset(Integer pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
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
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CustomRuleRevisionsResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRuleRevisionsResponse listCustomRuleRevisions(String rulesetName, String ruleName)
      throws ApiException {
    return listCustomRuleRevisionsWithHttpInfo(
            rulesetName, ruleName, new ListCustomRuleRevisionsOptionalParameters())
        .getData();
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CompletableFuture&lt;CustomRuleRevisionsResponse&gt;
   */
  public CompletableFuture<CustomRuleRevisionsResponse> listCustomRuleRevisionsAsync(
      String rulesetName, String ruleName) {
    return listCustomRuleRevisionsWithHttpInfoAsync(
            rulesetName, ruleName, new ListCustomRuleRevisionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return CustomRuleRevisionsResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRuleRevisionsResponse listCustomRuleRevisions(
      String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters)
      throws ApiException {
    return listCustomRuleRevisionsWithHttpInfo(rulesetName, ruleName, parameters).getData();
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CustomRuleRevisionsResponse&gt;
   */
  public CompletableFuture<CustomRuleRevisionsResponse> listCustomRuleRevisionsAsync(
      String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) {
    return listCustomRuleRevisionsWithHttpInfoAsync(rulesetName, ruleName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return PaginationIterable&lt;CustomRuleRevision&gt;
   */
  public PaginationIterable<CustomRuleRevision> listCustomRuleRevisionsWithPagination(
      String rulesetName, String ruleName) {
    ListCustomRuleRevisionsOptionalParameters parameters =
        new ListCustomRuleRevisionsOptionalParameters();
    return listCustomRuleRevisionsWithPagination(rulesetName, ruleName, parameters);
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @return CustomRuleRevisionsResponse
   */
  public PaginationIterable<CustomRuleRevision> listCustomRuleRevisionsWithPagination(
      String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters) {
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

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listCustomRuleRevisions",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get all revisions for a custom rule
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CustomRuleRevisionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Rule not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRuleRevisionsResponse> listCustomRuleRevisionsWithHttpInfo(
      String rulesetName, String ruleName, ListCustomRuleRevisionsOptionalParameters parameters)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling listCustomRuleRevisions");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling listCustomRuleRevisions");
    }
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listCustomRuleRevisions",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<CustomRuleRevisionsResponse>() {});
  }

  /**
   * List Custom Rule Revisions.
   *
   * <p>See {@link #listCustomRuleRevisionsWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRuleRevisionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>>
      listCustomRuleRevisionsWithHttpInfoAsync(
          String rulesetName,
          String ruleName,
          ListCustomRuleRevisionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCustomRuleRevisions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling listCustomRuleRevisions"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling listCustomRuleRevisions"));
      return result;
    }
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listCustomRuleRevisions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRuleRevisionsResponse>> result =
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
        new GenericType<CustomRuleRevisionsResponse>() {});
  }

  /**
   * List Custom Rulesets.
   *
   * <p>See {@link #listCustomRulesetsWithHttpInfo}.
   *
   * @return CustomRulesetListResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRulesetListResponse listCustomRulesets() throws ApiException {
    return listCustomRulesetsWithHttpInfo().getData();
  }

  /**
   * List Custom Rulesets.
   *
   * <p>See {@link #listCustomRulesetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CustomRulesetListResponse&gt;
   */
  public CompletableFuture<CustomRulesetListResponse> listCustomRulesetsAsync() {
    return listCustomRulesetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all custom rulesets for the authenticated organization.
   *
   * @return ApiResponse&lt;CustomRulesetListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetListResponse> listCustomRulesetsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCustomRulesets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listCustomRulesets",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomRulesetListResponse>() {});
  }

  /**
   * List Custom Rulesets.
   *
   * <p>See {@link #listCustomRulesetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetListResponse>>
      listCustomRulesetsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listCustomRulesets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis/custom/rulesets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listCustomRulesets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetListResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRulesetListResponse>() {});
  }

  /**
   * Get the list of SPDX licenses.
   *
   * <p>See {@link #listSCALicensesWithHttpInfo}.
   *
   * @return LicensesListResponse
   * @throws ApiException if fails to make API call
   */
  public LicensesListResponse listSCALicenses() throws ApiException {
    return listSCALicensesWithHttpInfo().getData();
  }

  /**
   * Get the list of SPDX licenses.
   *
   * <p>See {@link #listSCALicensesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LicensesListResponse&gt;
   */
  public CompletableFuture<LicensesListResponse> listSCALicensesAsync() {
    return listSCALicensesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;LicensesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LicensesListResponse> listSCALicensesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listSCALicenses";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/licenses/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.listSCALicenses",
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
        new GenericType<LicensesListResponse>() {});
  }

  /**
   * Get the list of SPDX licenses.
   *
   * <p>See {@link #listSCALicensesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LicensesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LicensesListResponse>> listSCALicensesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listSCALicenses";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LicensesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/licenses/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.listSCALicenses",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LicensesListResponse>> result = new CompletableFuture<>();
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
        new GenericType<LicensesListResponse>() {});
  }

  /**
   * Revert Custom Rule Revision.
   *
   * <p>See {@link #revertCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void revertCustomRuleRevision(
      String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body)
      throws ApiException {
    revertCustomRuleRevisionWithHttpInfo(rulesetName, ruleName, body);
  }

  /**
   * Revert Custom Rule Revision.
   *
   * <p>See {@link #revertCustomRuleRevisionWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> revertCustomRuleRevisionAsync(
      String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) {
    return revertCustomRuleRevisionWithHttpInfoAsync(rulesetName, ruleName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revert a custom rule to a previous revision
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully reverted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> revertCustomRuleRevisionWithHttpInfo(
      String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body)
      throws ApiException {
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
      throw new ApiException(
          400,
          "Missing the required parameter 'rulesetName' when calling revertCustomRuleRevision");
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleName' when calling revertCustomRuleRevision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling revertCustomRuleRevision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/revert"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.revertCustomRuleRevision",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Revert Custom Rule Revision.
   *
   * <p>See {@link #revertCustomRuleRevisionWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param ruleName The rule name (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> revertCustomRuleRevisionWithHttpInfoAsync(
      String rulesetName, String ruleName, RevertCustomRuleRevisionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "revertCustomRuleRevision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling"
                  + " revertCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'ruleName' is set
    if (ruleName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleName' when calling revertCustomRuleRevision"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling revertCustomRuleRevision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}/rules/{rule_name}/revisions/revert"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()))
            .replaceAll("\\{" + "rule_name" + "\\}", apiClient.escapeString(ruleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.revertCustomRuleRevision",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update an AI custom ruleset.
   *
   * <p>See {@link #updateAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAiCustomRuleset(String rulesetName, AiCustomRulesetUpdateRequest body)
      throws ApiException {
    updateAiCustomRulesetWithHttpInfo(rulesetName, body);
  }

  /**
   * Update an AI custom ruleset.
   *
   * <p>See {@link #updateAiCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAiCustomRulesetAsync(
      String rulesetName, AiCustomRulesetUpdateRequest body) {
    return updateAiCustomRulesetWithHttpInfoAsync(rulesetName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the description of an existing AI custom ruleset.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition Failed - validation error or ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateAiCustomRulesetWithHttpInfo(
      String rulesetName, AiCustomRulesetUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling updateAiCustomRuleset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.updateAiCustomRuleset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update an AI custom ruleset.
   *
   * <p>See {@link #updateAiCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAiCustomRulesetWithHttpInfoAsync(
      String rulesetName, AiCustomRulesetUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling updateAiCustomRuleset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/ai/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.updateAiCustomRuleset",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update Custom Ruleset.
   *
   * <p>See {@link #updateCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CustomRulesetResponse
   * @throws ApiException if fails to make API call
   */
  public CustomRulesetResponse updateCustomRuleset(String rulesetName, CustomRulesetRequest body)
      throws ApiException {
    return updateCustomRulesetWithHttpInfo(rulesetName, body).getData();
  }

  /**
   * Update Custom Ruleset.
   *
   * <p>See {@link #updateCustomRulesetWithHttpInfoAsync}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CompletableFuture&lt;CustomRulesetResponse&gt;
   */
  public CompletableFuture<CustomRulesetResponse> updateCustomRulesetAsync(
      String rulesetName, CustomRulesetRequest body) {
    return updateCustomRulesetWithHttpInfoAsync(rulesetName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing custom ruleset
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return ApiResponse&lt;CustomRulesetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized - custom rules not enabled </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition failed - validation error or ruleset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomRulesetResponse> updateCustomRulesetWithHttpInfo(
      String rulesetName, CustomRulesetRequest body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'rulesetName' when calling updateCustomRuleset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCustomRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.updateCustomRuleset",
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
        new GenericType<CustomRulesetResponse>() {});
  }

  /**
   * Update Custom Ruleset.
   *
   * <p>See {@link #updateCustomRulesetWithHttpInfo}.
   *
   * @param rulesetName The ruleset name (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomRulesetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomRulesetResponse>> updateCustomRulesetWithHttpInfoAsync(
      String rulesetName, CustomRulesetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateCustomRuleset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetName' is set
    if (rulesetName == null) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetName' when calling updateCustomRuleset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCustomRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/static-analysis/custom/rulesets/{ruleset_name}"
            .replaceAll(
                "\\{" + "ruleset_name" + "\\}", apiClient.escapeString(rulesetName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.updateCustomRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomRulesetResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomRulesetResponse>() {});
  }
}
