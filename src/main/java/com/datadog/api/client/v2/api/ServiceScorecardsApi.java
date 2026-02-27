package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CampaignResponse;
import com.datadog.api.client.v2.model.CreateCampaignRequest;
import com.datadog.api.client.v2.model.CreateRuleRequest;
import com.datadog.api.client.v2.model.CreateRuleResponse;
import com.datadog.api.client.v2.model.GenerateCampaignReportRequest;
import com.datadog.api.client.v2.model.GenerateCampaignTeamReportsRequest;
import com.datadog.api.client.v2.model.ListCampaignsResponse;
import com.datadog.api.client.v2.model.ListDefaultRulesResponse;
import com.datadog.api.client.v2.model.ListFacetsResponse;
import com.datadog.api.client.v2.model.ListRulesResponse;
import com.datadog.api.client.v2.model.ListRulesResponseDataItem;
import com.datadog.api.client.v2.model.ListScorecardsResponse;
import com.datadog.api.client.v2.model.ListScoresResponse;
import com.datadog.api.client.v2.model.OutcomesBatchRequest;
import com.datadog.api.client.v2.model.OutcomesBatchResponse;
import com.datadog.api.client.v2.model.OutcomesResponse;
import com.datadog.api.client.v2.model.OutcomesResponseDataItem;
import com.datadog.api.client.v2.model.SetupRulesRequest;
import com.datadog.api.client.v2.model.UpdateCampaignRequest;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncRequest;
import com.datadog.api.client.v2.model.UpdateRuleRequest;
import com.datadog.api.client.v2.model.UpdateRuleResponse;
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
   * Create a new campaign.
   *
   * <p>See {@link #createScorecardCampaignWithHttpInfo}.
   *
   * @param body Campaign data. (required)
   * @return CampaignResponse
   * @throws ApiException if fails to make API call
   */
  public CampaignResponse createScorecardCampaign(CreateCampaignRequest body) throws ApiException {
    return createScorecardCampaignWithHttpInfo(body).getData();
  }

  /**
   * Create a new campaign.
   *
   * <p>See {@link #createScorecardCampaignWithHttpInfoAsync}.
   *
   * @param body Campaign data. (required)
   * @return CompletableFuture&lt;CampaignResponse&gt;
   */
  public CompletableFuture<CampaignResponse> createScorecardCampaignAsync(
      CreateCampaignRequest body) {
    return createScorecardCampaignWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new scorecard campaign.
   *
   * @param body Campaign data. (required)
   * @return ApiResponse&lt;CampaignResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CampaignResponse> createScorecardCampaignWithHttpInfo(
      CreateCampaignRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createScorecardCampaign");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/campaigns";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.createScorecardCampaign",
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
        new GenericType<CampaignResponse>() {});
  }

  /**
   * Create a new campaign.
   *
   * <p>See {@link #createScorecardCampaignWithHttpInfo}.
   *
   * @param body Campaign data. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CampaignResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CampaignResponse>> createScorecardCampaignWithHttpInfoAsync(
      CreateCampaignRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createScorecardCampaign"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/campaigns";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.createScorecardCampaign",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
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
        new GenericType<CampaignResponse>() {});
  }

  /**
   * Create outcomes batch.
   *
   * <p>See {@link #createScorecardOutcomesBatchWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return OutcomesBatchResponse
   * @throws ApiException if fails to make API call
   */
  public OutcomesBatchResponse createScorecardOutcomesBatch(OutcomesBatchRequest body)
      throws ApiException {
    return createScorecardOutcomesBatchWithHttpInfo(body).getData();
  }

  /**
   * Create outcomes batch.
   *
   * <p>See {@link #createScorecardOutcomesBatchWithHttpInfoAsync}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture&lt;OutcomesBatchResponse&gt;
   */
  public CompletableFuture<OutcomesBatchResponse> createScorecardOutcomesBatchAsync(
      OutcomesBatchRequest body) {
    return createScorecardOutcomesBatchWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Sets multiple service-rule outcomes in a single batched request.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return ApiResponse&lt;OutcomesBatchResponse&gt;
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
  public ApiResponse<OutcomesBatchResponse> createScorecardOutcomesBatchWithHttpInfo(
      OutcomesBatchRequest body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createScorecardOutcomesBatch");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes/batch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.createScorecardOutcomesBatch",
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
        new GenericType<OutcomesBatchResponse>() {});
  }

  /**
   * Create outcomes batch.
   *
   * <p>See {@link #createScorecardOutcomesBatchWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OutcomesBatchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OutcomesBatchResponse>>
      createScorecardOutcomesBatchWithHttpInfoAsync(OutcomesBatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createScorecardOutcomesBatch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createScorecardOutcomesBatch"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes/batch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.createScorecardOutcomesBatch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OutcomesBatchResponse>> result = new CompletableFuture<>();
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
        new GenericType<OutcomesBatchResponse>() {});
  }

  /**
   * Create a new rule.
   *
   * <p>See {@link #createScorecardRuleWithHttpInfo}.
   *
   * @param body Rule attributes. (required)
   * @return CreateRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CreateRuleResponse createScorecardRule(CreateRuleRequest body) throws ApiException {
    return createScorecardRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a new rule.
   *
   * <p>See {@link #createScorecardRuleWithHttpInfoAsync}.
   *
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;CreateRuleResponse&gt;
   */
  public CompletableFuture<CreateRuleResponse> createScorecardRuleAsync(CreateRuleRequest body) {
    return createScorecardRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new rule.
   *
   * @param body Rule attributes. (required)
   * @return ApiResponse&lt;CreateRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateRuleResponse> createScorecardRuleWithHttpInfo(CreateRuleRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createScorecardRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.createScorecardRule",
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
        new GenericType<CreateRuleResponse>() {});
  }

  /**
   * Create a new rule.
   *
   * <p>See {@link #createScorecardRuleWithHttpInfo}.
   *
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateRuleResponse>> createScorecardRuleWithHttpInfoAsync(
      CreateRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createScorecardRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.createScorecardRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<CreateRuleResponse>() {});
  }

  /**
   * Delete a campaign.
   *
   * <p>See {@link #deleteScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScorecardCampaign(String campaignId) throws ApiException {
    deleteScorecardCampaignWithHttpInfo(campaignId);
  }

  /**
   * Delete a campaign.
   *
   * <p>See {@link #deleteScorecardCampaignWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteScorecardCampaignAsync(String campaignId) {
    return deleteScorecardCampaignWithHttpInfoAsync(campaignId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a single campaign by ID or key.
   *
   * @param campaignId Campaign ID or key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteScorecardCampaignWithHttpInfo(String campaignId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'campaignId' when calling deleteScorecardCampaign");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.deleteScorecardCampaign",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete a campaign.
   *
   * <p>See {@link #deleteScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteScorecardCampaignWithHttpInfoAsync(
      String campaignId) {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'campaignId' when calling deleteScorecardCampaign"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.deleteScorecardCampaign",
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
   * Delete a rule.
   *
   * <p>See {@link #deleteScorecardRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScorecardRule(String ruleId) throws ApiException {
    deleteScorecardRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete a rule.
   *
   * <p>See {@link #deleteScorecardRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteScorecardRuleAsync(String ruleId) {
    return deleteScorecardRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a single rule.
   *
   * @param ruleId The ID of the rule. (required)
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
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteScorecardRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.deleteScorecardRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete a rule.
   *
   * <p>See {@link #deleteScorecardRuleWithHttpInfo}.
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
              400, "Missing the required parameter 'ruleId' when calling deleteScorecardRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.deleteScorecardRule",
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
   * Delete rule workflow.
   *
   * <p>See {@link #deleteScorecardRuleWorkflowWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScorecardRuleWorkflow(String ruleId) throws ApiException {
    deleteScorecardRuleWorkflowWithHttpInfo(ruleId);
  }

  /**
   * Delete rule workflow.
   *
   * <p>See {@link #deleteScorecardRuleWorkflowWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteScorecardRuleWorkflowAsync(String ruleId) {
    return deleteScorecardRuleWorkflowWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes workflow association from a scorecard rule.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteScorecardRuleWorkflowWithHttpInfo(String ruleId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardRuleWorkflow";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteScorecardRuleWorkflow");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}/workflow"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.deleteScorecardRuleWorkflow",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete rule workflow.
   *
   * <p>See {@link #deleteScorecardRuleWorkflowWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteScorecardRuleWorkflowWithHttpInfoAsync(
      String ruleId) {
    // Check if unstable operation is enabled
    String operationId = "deleteScorecardRuleWorkflow";
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
              "Missing the required parameter 'ruleId' when calling deleteScorecardRuleWorkflow"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}/workflow"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.deleteScorecardRuleWorkflow",
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
   * Generate campaign report.
   *
   * <p>See {@link #generateScorecardCampaignReportWithHttpInfo}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Report generation request. (required)
   * @throws ApiException if fails to make API call
   */
  public void generateScorecardCampaignReport(String campaignId, GenerateCampaignReportRequest body)
      throws ApiException {
    generateScorecardCampaignReportWithHttpInfo(campaignId, body);
  }

  /**
   * Generate campaign report.
   *
   * <p>See {@link #generateScorecardCampaignReportWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Report generation request. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> generateScorecardCampaignReportAsync(
      String campaignId, GenerateCampaignReportRequest body) {
    return generateScorecardCampaignReportWithHttpInfoAsync(campaignId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generates and sends a campaign report to Slack.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Report generation request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> generateScorecardCampaignReportWithHttpInfo(
      String campaignId, GenerateCampaignReportRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "generateScorecardCampaignReport";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'campaignId' when calling"
              + " generateScorecardCampaignReport");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling generateScorecardCampaignReport");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}/report"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.generateScorecardCampaignReport",
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
   * Generate campaign report.
   *
   * <p>See {@link #generateScorecardCampaignReportWithHttpInfo}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Report generation request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> generateScorecardCampaignReportWithHttpInfoAsync(
      String campaignId, GenerateCampaignReportRequest body) {
    // Check if unstable operation is enabled
    String operationId = "generateScorecardCampaignReport";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'campaignId' when calling"
                  + " generateScorecardCampaignReport"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " generateScorecardCampaignReport"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}/report"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.generateScorecardCampaignReport",
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
   * Generate team-specific campaign reports.
   *
   * <p>See {@link #generateScorecardCampaignTeamReportsWithHttpInfo}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Team report generation request. (required)
   * @throws ApiException if fails to make API call
   */
  public void generateScorecardCampaignTeamReports(
      String campaignId, GenerateCampaignTeamReportsRequest body) throws ApiException {
    generateScorecardCampaignTeamReportsWithHttpInfo(campaignId, body);
  }

  /**
   * Generate team-specific campaign reports.
   *
   * <p>See {@link #generateScorecardCampaignTeamReportsWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Team report generation request. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> generateScorecardCampaignTeamReportsAsync(
      String campaignId, GenerateCampaignTeamReportsRequest body) {
    return generateScorecardCampaignTeamReportsWithHttpInfoAsync(campaignId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generates and sends team-specific campaign reports to Slack.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Team report generation request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> generateScorecardCampaignTeamReportsWithHttpInfo(
      String campaignId, GenerateCampaignTeamReportsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "generateScorecardCampaignTeamReports";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'campaignId' when calling"
              + " generateScorecardCampaignTeamReports");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " generateScorecardCampaignTeamReports");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}/entity-owner-report"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.generateScorecardCampaignTeamReports",
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
   * Generate team-specific campaign reports.
   *
   * <p>See {@link #generateScorecardCampaignTeamReportsWithHttpInfo}.
   *
   * @param campaignId Campaign ID. (required)
   * @param body Team report generation request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> generateScorecardCampaignTeamReportsWithHttpInfoAsync(
      String campaignId, GenerateCampaignTeamReportsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "generateScorecardCampaignTeamReports";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'campaignId' when calling"
                  + " generateScorecardCampaignTeamReports"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " generateScorecardCampaignTeamReports"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}/entity-owner-report"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.generateScorecardCampaignTeamReports",
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

  /** Manage optional parameters to getScorecardCampaign. */
  public static class GetScorecardCampaignOptionalParameters {
    private String include;
    private Boolean includeMeta;

    /**
     * Set include.
     *
     * @param include Include related data (for example, scores). (optional)
     * @return GetScorecardCampaignOptionalParameters
     */
    public GetScorecardCampaignOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set includeMeta.
     *
     * @param includeMeta Include metadata (entity and rule counts). (optional)
     * @return GetScorecardCampaignOptionalParameters
     */
    public GetScorecardCampaignOptionalParameters includeMeta(Boolean includeMeta) {
      this.includeMeta = includeMeta;
      return this;
    }
  }

  /**
   * Get a campaign.
   *
   * <p>See {@link #getScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @return CampaignResponse
   * @throws ApiException if fails to make API call
   */
  public CampaignResponse getScorecardCampaign(String campaignId) throws ApiException {
    return getScorecardCampaignWithHttpInfo(
            campaignId, new GetScorecardCampaignOptionalParameters())
        .getData();
  }

  /**
   * Get a campaign.
   *
   * <p>See {@link #getScorecardCampaignWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @return CompletableFuture&lt;CampaignResponse&gt;
   */
  public CompletableFuture<CampaignResponse> getScorecardCampaignAsync(String campaignId) {
    return getScorecardCampaignWithHttpInfoAsync(
            campaignId, new GetScorecardCampaignOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a campaign.
   *
   * <p>See {@link #getScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param parameters Optional parameters for the request.
   * @return CampaignResponse
   * @throws ApiException if fails to make API call
   */
  public CampaignResponse getScorecardCampaign(
      String campaignId, GetScorecardCampaignOptionalParameters parameters) throws ApiException {
    return getScorecardCampaignWithHttpInfo(campaignId, parameters).getData();
  }

  /**
   * Get a campaign.
   *
   * <p>See {@link #getScorecardCampaignWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CampaignResponse&gt;
   */
  public CompletableFuture<CampaignResponse> getScorecardCampaignAsync(
      String campaignId, GetScorecardCampaignOptionalParameters parameters) {
    return getScorecardCampaignWithHttpInfoAsync(campaignId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches a single campaign by ID or key.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CampaignResponse&gt;
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
  public ApiResponse<CampaignResponse> getScorecardCampaignWithHttpInfo(
      String campaignId, GetScorecardCampaignOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'campaignId' when calling getScorecardCampaign");
    }
    String include = parameters.include;
    Boolean includeMeta = parameters.includeMeta;
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_meta", includeMeta));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.getScorecardCampaign",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<CampaignResponse>() {});
  }

  /**
   * Get a campaign.
   *
   * <p>See {@link #getScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CampaignResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CampaignResponse>> getScorecardCampaignWithHttpInfoAsync(
      String campaignId, GetScorecardCampaignOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'campaignId' when calling getScorecardCampaign"));
      return result;
    }
    String include = parameters.include;
    Boolean includeMeta = parameters.includeMeta;
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_meta", includeMeta));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.getScorecardCampaign",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
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
        new GenericType<CampaignResponse>() {});
  }

  /** Manage optional parameters to listScorecardCampaigns. */
  public static class ListScorecardCampaignsOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;
    private String filterCampaignName;
    private String filterCampaignStatus;
    private String filterCampaignOwner;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of campaigns to return. (optional, default to 10)
     * @return ListScorecardCampaignsOptionalParameters
     */
    public ListScorecardCampaignsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListScorecardCampaignsOptionalParameters
     */
    public ListScorecardCampaignsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filterCampaignName.
     *
     * @param filterCampaignName Filter campaigns by name (full-text search). (optional)
     * @return ListScorecardCampaignsOptionalParameters
     */
    public ListScorecardCampaignsOptionalParameters filterCampaignName(String filterCampaignName) {
      this.filterCampaignName = filterCampaignName;
      return this;
    }

    /**
     * Set filterCampaignStatus.
     *
     * @param filterCampaignStatus Filter campaigns by status. (optional)
     * @return ListScorecardCampaignsOptionalParameters
     */
    public ListScorecardCampaignsOptionalParameters filterCampaignStatus(
        String filterCampaignStatus) {
      this.filterCampaignStatus = filterCampaignStatus;
      return this;
    }

    /**
     * Set filterCampaignOwner.
     *
     * @param filterCampaignOwner Filter campaigns by owner UUID. (optional)
     * @return ListScorecardCampaignsOptionalParameters
     */
    public ListScorecardCampaignsOptionalParameters filterCampaignOwner(
        String filterCampaignOwner) {
      this.filterCampaignOwner = filterCampaignOwner;
      return this;
    }
  }

  /**
   * List all campaigns.
   *
   * <p>See {@link #listScorecardCampaignsWithHttpInfo}.
   *
   * @return ListCampaignsResponse
   * @throws ApiException if fails to make API call
   */
  public ListCampaignsResponse listScorecardCampaigns() throws ApiException {
    return listScorecardCampaignsWithHttpInfo(new ListScorecardCampaignsOptionalParameters())
        .getData();
  }

  /**
   * List all campaigns.
   *
   * <p>See {@link #listScorecardCampaignsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListCampaignsResponse&gt;
   */
  public CompletableFuture<ListCampaignsResponse> listScorecardCampaignsAsync() {
    return listScorecardCampaignsWithHttpInfoAsync(new ListScorecardCampaignsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all campaigns.
   *
   * <p>See {@link #listScorecardCampaignsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListCampaignsResponse
   * @throws ApiException if fails to make API call
   */
  public ListCampaignsResponse listScorecardCampaigns(
      ListScorecardCampaignsOptionalParameters parameters) throws ApiException {
    return listScorecardCampaignsWithHttpInfo(parameters).getData();
  }

  /**
   * List all campaigns.
   *
   * <p>See {@link #listScorecardCampaignsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListCampaignsResponse&gt;
   */
  public CompletableFuture<ListCampaignsResponse> listScorecardCampaignsAsync(
      ListScorecardCampaignsOptionalParameters parameters) {
    return listScorecardCampaignsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches all scorecard campaigns.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListCampaignsResponse&gt;
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
  public ApiResponse<ListCampaignsResponse> listScorecardCampaignsWithHttpInfo(
      ListScorecardCampaignsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardCampaigns";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterCampaignName = parameters.filterCampaignName;
    String filterCampaignStatus = parameters.filterCampaignStatus;
    String filterCampaignOwner = parameters.filterCampaignOwner;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/campaigns";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][name]", filterCampaignName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][status]", filterCampaignStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][owner]", filterCampaignOwner));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardCampaigns",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListCampaignsResponse>() {});
  }

  /**
   * List all campaigns.
   *
   * <p>See {@link #listScorecardCampaignsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListCampaignsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListCampaignsResponse>>
      listScorecardCampaignsWithHttpInfoAsync(ListScorecardCampaignsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardCampaigns";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListCampaignsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterCampaignName = parameters.filterCampaignName;
    String filterCampaignStatus = parameters.filterCampaignStatus;
    String filterCampaignOwner = parameters.filterCampaignOwner;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/campaigns";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][name]", filterCampaignName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][status]", filterCampaignStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[campaign][owner]", filterCampaignOwner));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardCampaigns",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListCampaignsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListCampaignsResponse>() {});
  }

  /**
   * List default rules.
   *
   * <p>See {@link #listScorecardDefaultRulesWithHttpInfo}.
   *
   * @return ListDefaultRulesResponse
   * @throws ApiException if fails to make API call
   */
  public ListDefaultRulesResponse listScorecardDefaultRules() throws ApiException {
    return listScorecardDefaultRulesWithHttpInfo().getData();
  }

  /**
   * List default rules.
   *
   * <p>See {@link #listScorecardDefaultRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListDefaultRulesResponse&gt;
   */
  public CompletableFuture<ListDefaultRulesResponse> listScorecardDefaultRulesAsync() {
    return listScorecardDefaultRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches all default scorecard rules available for the organization.
   *
   * @return ApiResponse&lt;ListDefaultRulesResponse&gt;
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
  public ApiResponse<ListDefaultRulesResponse> listScorecardDefaultRulesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardDefaultRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/default-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardDefaultRules",
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
        new GenericType<ListDefaultRulesResponse>() {});
  }

  /**
   * List default rules.
   *
   * <p>See {@link #listScorecardDefaultRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ListDefaultRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListDefaultRulesResponse>>
      listScorecardDefaultRulesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listScorecardDefaultRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListDefaultRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/default-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardDefaultRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListDefaultRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListDefaultRulesResponse>() {});
  }

  /** Manage optional parameters to listScorecardFacets. */
  public static class ListScorecardFacetsOptionalParameters {
    private String filterEntityQuery;

    /**
     * Set filterEntityQuery.
     *
     * @param filterEntityQuery Entity query filter. (optional)
     * @return ListScorecardFacetsOptionalParameters
     */
    public ListScorecardFacetsOptionalParameters filterEntityQuery(String filterEntityQuery) {
      this.filterEntityQuery = filterEntityQuery;
      return this;
    }
  }

  /**
   * List entity facets.
   *
   * <p>See {@link #listScorecardFacetsWithHttpInfo}.
   *
   * @return ListFacetsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFacetsResponse listScorecardFacets() throws ApiException {
    return listScorecardFacetsWithHttpInfo(new ListScorecardFacetsOptionalParameters()).getData();
  }

  /**
   * List entity facets.
   *
   * <p>See {@link #listScorecardFacetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListFacetsResponse&gt;
   */
  public CompletableFuture<ListFacetsResponse> listScorecardFacetsAsync() {
    return listScorecardFacetsWithHttpInfoAsync(new ListScorecardFacetsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List entity facets.
   *
   * <p>See {@link #listScorecardFacetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListFacetsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFacetsResponse listScorecardFacets(ListScorecardFacetsOptionalParameters parameters)
      throws ApiException {
    return listScorecardFacetsWithHttpInfo(parameters).getData();
  }

  /**
   * List entity facets.
   *
   * <p>See {@link #listScorecardFacetsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListFacetsResponse&gt;
   */
  public CompletableFuture<ListFacetsResponse> listScorecardFacetsAsync(
      ListScorecardFacetsOptionalParameters parameters) {
    return listScorecardFacetsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches facets for scorecard entities with counts.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListFacetsResponse&gt;
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
  public ApiResponse<ListFacetsResponse> listScorecardFacetsWithHttpInfo(
      ListScorecardFacetsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterEntityQuery = parameters.filterEntityQuery;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/facets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[entity][query]", filterEntityQuery));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardFacets",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListFacetsResponse>() {});
  }

  /**
   * List entity facets.
   *
   * <p>See {@link #listScorecardFacetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListFacetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListFacetsResponse>> listScorecardFacetsWithHttpInfoAsync(
      ListScorecardFacetsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListFacetsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterEntityQuery = parameters.filterEntityQuery;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/facets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[entity][query]", filterEntityQuery));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardFacets",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListFacetsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListFacetsResponse>() {});
  }

  /** Manage optional parameters to listScorecardOutcomes. */
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
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Include related rule details in the response. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set fieldsOutcome.
     *
     * @param fieldsOutcome Return only specified values in the outcome attributes. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters fieldsOutcome(String fieldsOutcome) {
      this.fieldsOutcome = fieldsOutcome;
      return this;
    }

    /**
     * Set fieldsRule.
     *
     * @param fieldsRule Return only specified values in the included rule details. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters fieldsRule(String fieldsRule) {
      this.fieldsRule = fieldsRule;
      return this;
    }

    /**
     * Set filterOutcomeServiceName.
     *
     * @param filterOutcomeServiceName Filter outcomes on a specific service name. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterOutcomeServiceName(
        String filterOutcomeServiceName) {
      this.filterOutcomeServiceName = filterOutcomeServiceName;
      return this;
    }

    /**
     * Set filterOutcomeState.
     *
     * @param filterOutcomeState Filter outcomes by a specific state. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterOutcomeState(String filterOutcomeState) {
      this.filterOutcomeState = filterOutcomeState;
      return this;
    }

    /**
     * Set filterRuleEnabled.
     *
     * @param filterRuleEnabled Filter outcomes based on whether a rule is enabled or disabled.
     *     (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterRuleEnabled(Boolean filterRuleEnabled) {
      this.filterRuleEnabled = filterRuleEnabled;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Filter outcomes based on rule ID. (optional)
     * @return ListScorecardOutcomesOptionalParameters
     */
    public ListScorecardOutcomesOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleName.
     *
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
   * <p>See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @return OutcomesResponse
   * @throws ApiException if fails to make API call
   */
  public OutcomesResponse listScorecardOutcomes() throws ApiException {
    return listScorecardOutcomesWithHttpInfo(new ListScorecardOutcomesOptionalParameters())
        .getData();
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OutcomesResponse&gt;
   */
  public CompletableFuture<OutcomesResponse> listScorecardOutcomesAsync() {
    return listScorecardOutcomesWithHttpInfoAsync(new ListScorecardOutcomesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return OutcomesResponse
   * @throws ApiException if fails to make API call
   */
  public OutcomesResponse listScorecardOutcomes(ListScorecardOutcomesOptionalParameters parameters)
      throws ApiException {
    return listScorecardOutcomesWithHttpInfo(parameters).getData();
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OutcomesResponse&gt;
   */
  public CompletableFuture<OutcomesResponse> listScorecardOutcomesAsync(
      ListScorecardOutcomesOptionalParameters parameters) {
    return listScorecardOutcomesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;OutcomesResponseDataItem&gt;
   */
  public PaginationIterable<OutcomesResponseDataItem> listScorecardOutcomesWithPagination() {
    ListScorecardOutcomesOptionalParameters parameters =
        new ListScorecardOutcomesOptionalParameters();
    return listScorecardOutcomesWithPagination(parameters);
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @return OutcomesResponse
   */
  public PaginationIterable<OutcomesResponseDataItem> listScorecardOutcomesWithPagination(
      ListScorecardOutcomesOptionalParameters parameters) {
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

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listScorecardOutcomes",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Fetches all rule outcomes.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OutcomesResponse&gt;
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
  public ApiResponse<OutcomesResponse> listScorecardOutcomesWithHttpInfo(
      ListScorecardOutcomesOptionalParameters parameters) throws ApiException {
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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[outcome][service_name]", filterOutcomeServiceName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[outcome][state]", filterOutcomeState));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardOutcomes",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<OutcomesResponse>() {});
  }

  /**
   * List all rule outcomes.
   *
   * <p>See {@link #listScorecardOutcomesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OutcomesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OutcomesResponse>> listScorecardOutcomesWithHttpInfoAsync(
      ListScorecardOutcomesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardOutcomes";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OutcomesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[outcome][service_name]", filterOutcomeServiceName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[outcome][state]", filterOutcomeState));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardOutcomes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OutcomesResponse>> result = new CompletableFuture<>();
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
        new GenericType<OutcomesResponse>() {});
  }

  /** Manage optional parameters to listScorecardRules. */
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
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Include related scorecard details in the response. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Filter the rules on a rule ID. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleEnabled.
     *
     * @param filterRuleEnabled Filter for enabled rules only. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleEnabled(Boolean filterRuleEnabled) {
      this.filterRuleEnabled = filterRuleEnabled;
      return this;
    }

    /**
     * Set filterRuleCustom.
     *
     * @param filterRuleCustom Filter for custom rules only. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleCustom(Boolean filterRuleCustom) {
      this.filterRuleCustom = filterRuleCustom;
      return this;
    }

    /**
     * Set filterRuleName.
     *
     * @param filterRuleName Filter rules on the rule name. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleName(String filterRuleName) {
      this.filterRuleName = filterRuleName;
      return this;
    }

    /**
     * Set filterRuleDescription.
     *
     * @param filterRuleDescription Filter rules on the rule description. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters filterRuleDescription(
        String filterRuleDescription) {
      this.filterRuleDescription = filterRuleDescription;
      return this;
    }

    /**
     * Set fieldsRule.
     *
     * @param fieldsRule Return only specific fields in the response for rule attributes. (optional)
     * @return ListScorecardRulesOptionalParameters
     */
    public ListScorecardRulesOptionalParameters fieldsRule(String fieldsRule) {
      this.fieldsRule = fieldsRule;
      return this;
    }

    /**
     * Set fieldsScorecard.
     *
     * @param fieldsScorecard Return only specific fields in the included response for scorecard
     *     attributes. (optional)
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
   * <p>See {@link #listScorecardRulesWithHttpInfo}.
   *
   * @return ListRulesResponse
   * @throws ApiException if fails to make API call
   */
  public ListRulesResponse listScorecardRules() throws ApiException {
    return listScorecardRulesWithHttpInfo(new ListScorecardRulesOptionalParameters()).getData();
  }

  /**
   * List all rules.
   *
   * <p>See {@link #listScorecardRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListRulesResponse&gt;
   */
  public CompletableFuture<ListRulesResponse> listScorecardRulesAsync() {
    return listScorecardRulesWithHttpInfoAsync(new ListScorecardRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all rules.
   *
   * <p>See {@link #listScorecardRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListRulesResponse
   * @throws ApiException if fails to make API call
   */
  public ListRulesResponse listScorecardRules(ListScorecardRulesOptionalParameters parameters)
      throws ApiException {
    return listScorecardRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List all rules.
   *
   * <p>See {@link #listScorecardRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListRulesResponse&gt;
   */
  public CompletableFuture<ListRulesResponse> listScorecardRulesAsync(
      ListScorecardRulesOptionalParameters parameters) {
    return listScorecardRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all rules.
   *
   * <p>See {@link #listScorecardRulesWithHttpInfo}.
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
   * <p>See {@link #listScorecardRulesWithHttpInfo}.
   *
   * @return ListRulesResponse
   */
  public PaginationIterable<ListRulesResponseDataItem> listScorecardRulesWithPagination(
      ListScorecardRulesOptionalParameters parameters) {
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

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listScorecardRules",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Fetch all rules.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListRulesResponse&gt;
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
  public ApiResponse<ListRulesResponse> listScorecardRulesWithHttpInfo(
      ListScorecardRulesOptionalParameters parameters) throws ApiException {
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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][description]", filterRuleDescription));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fields[scorecard]", fieldsScorecard));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardRules",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListRulesResponse>() {});
  }

  /**
   * List all rules.
   *
   * <p>See {@link #listScorecardRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListRulesResponse>> listScorecardRulesWithHttpInfoAsync(
      ListScorecardRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][name]", filterRuleName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][description]", filterRuleDescription));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields[rule]", fieldsRule));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fields[scorecard]", fieldsScorecard));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListRulesResponse>() {});
  }

  /** Manage optional parameters to listScorecards. */
  public static class ListScorecardsOptionalParameters {
    private Long pageOffset;
    private Long pageSize;
    private String filterScorecardId;
    private String filterScorecardName;
    private String filterScorecardDescription;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListScorecardsOptionalParameters
     */
    public ListScorecardsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of scorecards to return. (optional, default to 100)
     * @return ListScorecardsOptionalParameters
     */
    public ListScorecardsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterScorecardId.
     *
     * @param filterScorecardId Filter by scorecard ID. (optional)
     * @return ListScorecardsOptionalParameters
     */
    public ListScorecardsOptionalParameters filterScorecardId(String filterScorecardId) {
      this.filterScorecardId = filterScorecardId;
      return this;
    }

    /**
     * Set filterScorecardName.
     *
     * @param filterScorecardName Filter by scorecard name (partial match). (optional)
     * @return ListScorecardsOptionalParameters
     */
    public ListScorecardsOptionalParameters filterScorecardName(String filterScorecardName) {
      this.filterScorecardName = filterScorecardName;
      return this;
    }

    /**
     * Set filterScorecardDescription.
     *
     * @param filterScorecardDescription Filter by scorecard description (partial match). (optional)
     * @return ListScorecardsOptionalParameters
     */
    public ListScorecardsOptionalParameters filterScorecardDescription(
        String filterScorecardDescription) {
      this.filterScorecardDescription = filterScorecardDescription;
      return this;
    }
  }

  /**
   * List all scorecards.
   *
   * <p>See {@link #listScorecardsWithHttpInfo}.
   *
   * @return ListScorecardsResponse
   * @throws ApiException if fails to make API call
   */
  public ListScorecardsResponse listScorecards() throws ApiException {
    return listScorecardsWithHttpInfo(new ListScorecardsOptionalParameters()).getData();
  }

  /**
   * List all scorecards.
   *
   * <p>See {@link #listScorecardsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListScorecardsResponse&gt;
   */
  public CompletableFuture<ListScorecardsResponse> listScorecardsAsync() {
    return listScorecardsWithHttpInfoAsync(new ListScorecardsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all scorecards.
   *
   * <p>See {@link #listScorecardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListScorecardsResponse
   * @throws ApiException if fails to make API call
   */
  public ListScorecardsResponse listScorecards(ListScorecardsOptionalParameters parameters)
      throws ApiException {
    return listScorecardsWithHttpInfo(parameters).getData();
  }

  /**
   * List all scorecards.
   *
   * <p>See {@link #listScorecardsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListScorecardsResponse&gt;
   */
  public CompletableFuture<ListScorecardsResponse> listScorecardsAsync(
      ListScorecardsOptionalParameters parameters) {
    return listScorecardsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches all scorecards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListScorecardsResponse&gt;
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
  public ApiResponse<ListScorecardsResponse> listScorecardsWithHttpInfo(
      ListScorecardsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecards";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageSize = parameters.pageSize;
    String filterScorecardId = parameters.filterScorecardId;
    String filterScorecardName = parameters.filterScorecardName;
    String filterScorecardDescription = parameters.filterScorecardDescription;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/scorecards";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[scorecard][id]", filterScorecardId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[scorecard][name]", filterScorecardName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[scorecard][description]", filterScorecardDescription));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecards",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListScorecardsResponse>() {});
  }

  /**
   * List all scorecards.
   *
   * <p>See {@link #listScorecardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListScorecardsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListScorecardsResponse>> listScorecardsWithHttpInfoAsync(
      ListScorecardsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecards";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListScorecardsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageSize = parameters.pageSize;
    String filterScorecardId = parameters.filterScorecardId;
    String filterScorecardName = parameters.filterScorecardName;
    String filterScorecardDescription = parameters.filterScorecardDescription;
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/scorecards";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[scorecard][id]", filterScorecardId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[scorecard][name]", filterScorecardName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[scorecard][description]", filterScorecardDescription));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecards",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListScorecardsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListScorecardsResponse>() {});
  }

  /** Manage optional parameters to listScorecardScores. */
  public static class ListScorecardScoresOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;
    private String filterEntityQuery;
    private String filterRuleId;
    private Boolean filterRuleEnabled;
    private Boolean filterRuleCustom;
    private String sort;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of scores to return. (optional, default to 100)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filterEntityQuery.
     *
     * @param filterEntityQuery Entity query filter. (optional)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters filterEntityQuery(String filterEntityQuery) {
      this.filterEntityQuery = filterEntityQuery;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Filter by rule IDs (comma-separated). (optional)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleEnabled.
     *
     * @param filterRuleEnabled Filter by rule enabled status. (optional)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters filterRuleEnabled(Boolean filterRuleEnabled) {
      this.filterRuleEnabled = filterRuleEnabled;
      return this;
    }

    /**
     * Set filterRuleCustom.
     *
     * @param filterRuleCustom Filter by custom rules. (optional)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters filterRuleCustom(Boolean filterRuleCustom) {
      this.filterRuleCustom = filterRuleCustom;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort order (comma-separated list of fields; prefix a field with - for descending
     *     order). (optional)
     * @return ListScorecardScoresOptionalParameters
     */
    public ListScorecardScoresOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List scores by aggregation.
   *
   * <p>See {@link #listScorecardScoresWithHttpInfo}.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @return ListScoresResponse
   * @throws ApiException if fails to make API call
   */
  public ListScoresResponse listScorecardScores(String aggregation) throws ApiException {
    return listScorecardScoresWithHttpInfo(aggregation, new ListScorecardScoresOptionalParameters())
        .getData();
  }

  /**
   * List scores by aggregation.
   *
   * <p>See {@link #listScorecardScoresWithHttpInfoAsync}.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @return CompletableFuture&lt;ListScoresResponse&gt;
   */
  public CompletableFuture<ListScoresResponse> listScorecardScoresAsync(String aggregation) {
    return listScorecardScoresWithHttpInfoAsync(
            aggregation, new ListScorecardScoresOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List scores by aggregation.
   *
   * <p>See {@link #listScorecardScoresWithHttpInfo}.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return ListScoresResponse
   * @throws ApiException if fails to make API call
   */
  public ListScoresResponse listScorecardScores(
      String aggregation, ListScorecardScoresOptionalParameters parameters) throws ApiException {
    return listScorecardScoresWithHttpInfo(aggregation, parameters).getData();
  }

  /**
   * List scores by aggregation.
   *
   * <p>See {@link #listScorecardScoresWithHttpInfoAsync}.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListScoresResponse&gt;
   */
  public CompletableFuture<ListScoresResponse> listScorecardScoresAsync(
      String aggregation, ListScorecardScoresOptionalParameters parameters) {
    return listScorecardScoresWithHttpInfoAsync(aggregation, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches scorecard scores aggregated by entity, rule, scorecard, service, or team.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListScoresResponse&gt;
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
  public ApiResponse<ListScoresResponse> listScorecardScoresWithHttpInfo(
      String aggregation, ListScorecardScoresOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listScorecardScores";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'aggregation' is set
    if (aggregation == null) {
      throw new ApiException(
          400, "Missing the required parameter 'aggregation' when calling listScorecardScores");
    }
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterEntityQuery = parameters.filterEntityQuery;
    String filterRuleId = parameters.filterRuleId;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    Boolean filterRuleCustom = parameters.filterRuleCustom;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/scores/{aggregation}"
            .replaceAll(
                "\\{" + "aggregation" + "\\}", apiClient.escapeString(aggregation.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[entity][query]", filterEntityQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.listScorecardScores",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListScoresResponse>() {});
  }

  /**
   * List scores by aggregation.
   *
   * <p>See {@link #listScorecardScoresWithHttpInfo}.
   *
   * @param aggregation Aggregation type (by-entity, by-rule, by-scorecard, by-service, by-team).
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListScoresResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListScoresResponse>> listScorecardScoresWithHttpInfoAsync(
      String aggregation, ListScorecardScoresOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listScorecardScores";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListScoresResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'aggregation' is set
    if (aggregation == null) {
      CompletableFuture<ApiResponse<ListScoresResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'aggregation' when calling listScorecardScores"));
      return result;
    }
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String filterEntityQuery = parameters.filterEntityQuery;
    String filterRuleId = parameters.filterRuleId;
    Boolean filterRuleEnabled = parameters.filterRuleEnabled;
    Boolean filterRuleCustom = parameters.filterRuleCustom;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/scores/{aggregation}"
            .replaceAll(
                "\\{" + "aggregation" + "\\}", apiClient.escapeString(aggregation.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[entity][query]", filterEntityQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule][id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][enabled]", filterRuleEnabled));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[rule][custom]", filterRuleCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.listScorecardScores",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListScoresResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListScoresResponse>() {});
  }

  /**
   * Set up rules for organization.
   *
   * <p>See {@link #setupScorecardRulesWithHttpInfo}.
   *
   * @param body Setup rules request. (required)
   * @throws ApiException if fails to make API call
   */
  public void setupScorecardRules(SetupRulesRequest body) throws ApiException {
    setupScorecardRulesWithHttpInfo(body);
  }

  /**
   * Set up rules for organization.
   *
   * <p>See {@link #setupScorecardRulesWithHttpInfoAsync}.
   *
   * @param body Setup rules request. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> setupScorecardRulesAsync(SetupRulesRequest body) {
    return setupScorecardRulesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Sets up default scorecard rules for the organization.
   *
   * @param body Setup rules request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> setupScorecardRulesWithHttpInfo(SetupRulesRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "setupScorecardRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling setupScorecardRules");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/setup";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.setupScorecardRules",
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
   * Set up rules for organization.
   *
   * <p>See {@link #setupScorecardRulesWithHttpInfo}.
   *
   * @param body Setup rules request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> setupScorecardRulesWithHttpInfoAsync(
      SetupRulesRequest body) {
    // Check if unstable operation is enabled
    String operationId = "setupScorecardRules";
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
              400, "Missing the required parameter 'body' when calling setupScorecardRules"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/setup";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.setupScorecardRules",
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
   * Update a campaign.
   *
   * <p>See {@link #updateScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param body Campaign data. (required)
   * @return CampaignResponse
   * @throws ApiException if fails to make API call
   */
  public CampaignResponse updateScorecardCampaign(String campaignId, UpdateCampaignRequest body)
      throws ApiException {
    return updateScorecardCampaignWithHttpInfo(campaignId, body).getData();
  }

  /**
   * Update a campaign.
   *
   * <p>See {@link #updateScorecardCampaignWithHttpInfoAsync}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param body Campaign data. (required)
   * @return CompletableFuture&lt;CampaignResponse&gt;
   */
  public CompletableFuture<CampaignResponse> updateScorecardCampaignAsync(
      String campaignId, UpdateCampaignRequest body) {
    return updateScorecardCampaignWithHttpInfoAsync(campaignId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing campaign.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param body Campaign data. (required)
   * @return ApiResponse&lt;CampaignResponse&gt;
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
  public ApiResponse<CampaignResponse> updateScorecardCampaignWithHttpInfo(
      String campaignId, UpdateCampaignRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'campaignId' when calling updateScorecardCampaign");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateScorecardCampaign");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.updateScorecardCampaign",
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
        new GenericType<CampaignResponse>() {});
  }

  /**
   * Update a campaign.
   *
   * <p>See {@link #updateScorecardCampaignWithHttpInfo}.
   *
   * @param campaignId Campaign ID or key. (required)
   * @param body Campaign data. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CampaignResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CampaignResponse>> updateScorecardCampaignWithHttpInfoAsync(
      String campaignId, UpdateCampaignRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardCampaign";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'campaignId' when calling updateScorecardCampaign"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateScorecardCampaign"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/campaigns/{campaign_id}"
            .replaceAll(
                "\\{" + "campaign_id" + "\\}", apiClient.escapeString(campaignId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.updateScorecardCampaign",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CampaignResponse>> result = new CompletableFuture<>();
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
        new GenericType<CampaignResponse>() {});
  }

  /**
   * Update Scorecard outcomes asynchronously.
   *
   * <p>See {@link #updateScorecardOutcomesAsyncWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateScorecardOutcomesAsync(UpdateOutcomesAsyncRequest body) throws ApiException {
    updateScorecardOutcomesAsyncWithHttpInfo(body);
  }

  /**
   * Update Scorecard outcomes asynchronously.
   *
   * <p>See {@link #updateScorecardOutcomesAsyncWithHttpInfoAsync}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateScorecardOutcomesAsyncAsync(
      UpdateOutcomesAsyncRequest body) {
    return updateScorecardOutcomesAsyncWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates multiple scorecard rule outcomes in a single batched request.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateScorecardOutcomesAsyncWithHttpInfo(UpdateOutcomesAsyncRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateScorecardOutcomesAsync");
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.updateScorecardOutcomesAsync",
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
   * Update Scorecard outcomes asynchronously.
   *
   * <p>See {@link #updateScorecardOutcomesAsyncWithHttpInfo}.
   *
   * @param body Set of scorecard outcomes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateScorecardOutcomesAsyncWithHttpInfoAsync(
      UpdateOutcomesAsyncRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardOutcomesAsync";
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
              "Missing the required parameter 'body' when calling updateScorecardOutcomesAsync"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/scorecard/outcomes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.updateScorecardOutcomesAsync",
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
   * Update an existing rule.
   *
   * <p>See {@link #updateScorecardRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return UpdateRuleResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateRuleResponse updateScorecardRule(String ruleId, UpdateRuleRequest body)
      throws ApiException {
    return updateScorecardRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update an existing rule.
   *
   * <p>See {@link #updateScorecardRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;UpdateRuleResponse&gt;
   */
  public CompletableFuture<UpdateRuleResponse> updateScorecardRuleAsync(
      String ruleId, UpdateRuleRequest body) {
    return updateScorecardRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing rule.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return ApiResponse&lt;UpdateRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Rule updated successfully </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateRuleResponse> updateScorecardRuleWithHttpInfo(
      String ruleId, UpdateRuleRequest body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateScorecardRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateScorecardRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.updateScorecardRule",
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
        new GenericType<UpdateRuleResponse>() {});
  }

  /**
   * Update an existing rule.
   *
   * <p>See {@link #updateScorecardRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body Rule attributes. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateRuleResponse>> updateScorecardRuleWithHttpInfoAsync(
      String ruleId, UpdateRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling updateScorecardRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateScorecardRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.updateScorecardRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<UpdateRuleResponse>() {});
  }

  /**
   * Associate workflow with rule.
   *
   * <p>See {@link #updateScorecardRuleWorkflowWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param workflowId Workflow ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateScorecardRuleWorkflow(String ruleId, String workflowId) throws ApiException {
    updateScorecardRuleWorkflowWithHttpInfo(ruleId, workflowId);
  }

  /**
   * Associate workflow with rule.
   *
   * <p>See {@link #updateScorecardRuleWorkflowWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param workflowId Workflow ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateScorecardRuleWorkflowAsync(
      String ruleId, String workflowId) {
    return updateScorecardRuleWorkflowWithHttpInfoAsync(ruleId, workflowId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Associates a workflow with a scorecard rule.
   *
   * @param ruleId The ID of the rule. (required)
   * @param workflowId Workflow ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateScorecardRuleWorkflowWithHttpInfo(String ruleId, String workflowId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardRuleWorkflow";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateScorecardRuleWorkflow");
    }

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'workflowId' when calling updateScorecardRuleWorkflow");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}/workflow/{workflow_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()))
            .replaceAll(
                "\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceScorecardsApi.updateScorecardRuleWorkflow",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Associate workflow with rule.
   *
   * <p>See {@link #updateScorecardRuleWorkflowWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param workflowId Workflow ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateScorecardRuleWorkflowWithHttpInfoAsync(
      String ruleId, String workflowId) {
    // Check if unstable operation is enabled
    String operationId = "updateScorecardRuleWorkflow";
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
              "Missing the required parameter 'ruleId' when calling updateScorecardRuleWorkflow"));
      return result;
    }

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'workflowId' when calling"
                  + " updateScorecardRuleWorkflow"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/scorecard/rules/{rule_id}/workflow/{workflow_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()))
            .replaceAll(
                "\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceScorecardsApi.updateScorecardRuleWorkflow",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
