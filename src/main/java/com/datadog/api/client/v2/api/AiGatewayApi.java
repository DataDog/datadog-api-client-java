package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AiGatewayBudgetCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceCapacityOverrideRequest;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceDimensionListResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceListResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceResetRequest;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceSort;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstancesSummaryResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetListResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetPeriodResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureConfigurationResponse;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureOverrideResponse;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayDiscoveredModelListResponse;
import com.datadog.api.client.v2.model.AiGatewayGovernanceReplaceRequest;
import com.datadog.api.client.v2.model.AiGatewayGovernanceResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryListResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelGroupCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelGroupListResponse;
import com.datadog.api.client.v2.model.AiGatewayModelGroupResponse;
import com.datadog.api.client.v2.model.AiGatewayModelGroupUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequest;
import com.datadog.api.client.v2.model.AiGatewayModelPricingResponse;
import com.datadog.api.client.v2.model.AiGatewayModelUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelsBulkCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelsByCanonicalListResponse;
import com.datadog.api.client.v2.model.AiGatewayPolicyListResponse;
import com.datadog.api.client.v2.model.AiGatewayPolicyRequest;
import com.datadog.api.client.v2.model.AiGatewayPolicyResponse;
import com.datadog.api.client.v2.model.AiGatewayProviderCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayProviderListResponse;
import com.datadog.api.client.v2.model.AiGatewayProviderResponse;
import com.datadog.api.client.v2.model.AiGatewayProviderUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayRateLimitCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayRateLimitInstanceListResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitInstanceSort;
import com.datadog.api.client.v2.model.AiGatewayRateLimitInstancesSummaryResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitListResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayRateLimitUsageListResponse;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleListResponse;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleReplaceRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayApi {
  private ApiClient apiClient;

  public AiGatewayApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AiGatewayApi(ApiClient apiClient) {
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
   * Add multiple models to an AI Gateway provider.
   *
   * <p>See {@link #bulkCreateAiGatewayModelsWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return AiGatewayModelCatalogEntryListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelCatalogEntryListResponse bulkCreateAiGatewayModels(
      Long providerId, AiGatewayModelsBulkCreateRequest body) throws ApiException {
    return bulkCreateAiGatewayModelsWithHttpInfo(providerId, body).getData();
  }

  /**
   * Add multiple models to an AI Gateway provider.
   *
   * <p>See {@link #bulkCreateAiGatewayModelsWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelCatalogEntryListResponse&gt;
   */
  public CompletableFuture<AiGatewayModelCatalogEntryListResponse> bulkCreateAiGatewayModelsAsync(
      Long providerId, AiGatewayModelsBulkCreateRequest body) {
    return bulkCreateAiGatewayModelsWithHttpInfoAsync(providerId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Requires <code>ai_gateway_config_write</code> and provider Edit. Models and pricing inherit
   * provider access. Add multiple manually managed model catalog entries to a provider in a single
   * request. Manually managed entries are not modified by automatic catalog synchronization.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelCatalogEntryListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelCatalogEntryListResponse> bulkCreateAiGatewayModelsWithHttpInfo(
      Long providerId, AiGatewayModelsBulkCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "bulkCreateAiGatewayModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'providerId' when calling bulkCreateAiGatewayModels");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkCreateAiGatewayModels");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/bulk"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.bulkCreateAiGatewayModels",
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
        new GenericType<AiGatewayModelCatalogEntryListResponse>() {});
  }

  /**
   * Add multiple models to an AI Gateway provider.
   *
   * <p>See {@link #bulkCreateAiGatewayModelsWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelCatalogEntryListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>>
      bulkCreateAiGatewayModelsWithHttpInfoAsync(
          Long providerId, AiGatewayModelsBulkCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "bulkCreateAiGatewayModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling"
                  + " bulkCreateAiGatewayModels"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling bulkCreateAiGatewayModels"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/bulk"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.bulkCreateAiGatewayModels",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
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
        new GenericType<AiGatewayModelCatalogEntryListResponse>() {});
  }

  /**
   * Create an AI Gateway budget.
   *
   * <p>See {@link #createAiGatewayBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayBudgetResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetResponse createAiGatewayBudget(AiGatewayBudgetCreateRequest body)
      throws ApiException {
    return createAiGatewayBudgetWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway budget.
   *
   * <p>See {@link #createAiGatewayBudgetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayBudgetResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetResponse> createAiGatewayBudgetAsync(
      AiGatewayBudgetCreateRequest body) {
    return createAiGatewayBudgetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a spend budget. Scope tags may include provider, model, and custom dimensions. Reserved
   * metadata keys are rejected.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayBudgetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetResponse> createAiGatewayBudgetWithHttpInfo(
      AiGatewayBudgetCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayBudget");
    }
    // create path and map variables
    String localVarPath = "/api/v2/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayBudget",
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
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Create an AI Gateway budget.
   *
   * <p>See {@link #createAiGatewayBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetResponse>>
      createAiGatewayBudgetWithHttpInfoAsync(AiGatewayBudgetCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiGatewayBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Create an AI Gateway data capture override.
   *
   * <p>See {@link #createAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayCaptureOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayCaptureOverrideResponse createAiGatewayDataCaptureOverride(
      AiGatewayCaptureCreateRequest body) throws ApiException {
    return createAiGatewayDataCaptureOverrideWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway data capture override.
   *
   * <p>See {@link #createAiGatewayDataCaptureOverrideWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayCaptureOverrideResponse&gt;
   */
  public CompletableFuture<AiGatewayCaptureOverrideResponse>
      createAiGatewayDataCaptureOverrideAsync(AiGatewayCaptureCreateRequest body) {
    return createAiGatewayDataCaptureOverrideWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a scoped override with a client-generated UUID and the current <code>
   * configuration_revision</code>. If the override can enable full capture for more traffic, set
   * <code>confirm_full_capture</code> to <code>true</code>. Returns HTTP 409 when <code>
   * configuration_revision</code> is stale, the UUID already exists, or the organization has 100
   * overrides. Missing <code>configuration_revision</code> or required full-capture confirmation
   * returns HTTP 400. Retrying an accepted create with the same UUID returns HTTP 409. To undo a
   * create, read the current configuration revision and delete the override using its returned
   * override revision.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayCaptureOverrideResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayCaptureOverrideResponse>
      createAiGatewayDataCaptureOverrideWithHttpInfo(AiGatewayCaptureCreateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayDataCaptureOverride";
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
          "Missing the required parameter 'body' when calling createAiGatewayDataCaptureOverride");
    }
    // create path and map variables
    String localVarPath = "/api/v2/data-capture/overrides";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayDataCaptureOverride",
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
        new GenericType<AiGatewayCaptureOverrideResponse>() {});
  }

  /**
   * Create an AI Gateway data capture override.
   *
   * <p>See {@link #createAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayCaptureOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>>
      createAiGatewayDataCaptureOverrideWithHttpInfoAsync(AiGatewayCaptureCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayDataCaptureOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createAiGatewayDataCaptureOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/data-capture/overrides";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayDataCaptureOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
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
        new GenericType<AiGatewayCaptureOverrideResponse>() {});
  }

  /**
   * Add a model to an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return AiGatewayModelCatalogEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelCatalogEntryResponse createAiGatewayModel(
      Long providerId, AiGatewayModelCreateRequest body) throws ApiException {
    return createAiGatewayModelWithHttpInfo(providerId, body).getData();
  }

  /**
   * Add a model to an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayModelWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelCatalogEntryResponse&gt;
   */
  public CompletableFuture<AiGatewayModelCatalogEntryResponse> createAiGatewayModelAsync(
      Long providerId, AiGatewayModelCreateRequest body) {
    return createAiGatewayModelWithHttpInfoAsync(providerId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Requires <code>ai_gateway_config_write</code> and provider Edit. Models and pricing inherit
   * provider access. Add a manually managed model catalog entry to a provider. Manually managed
   * entries are not modified by automatic catalog synchronization.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelCatalogEntryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelCatalogEntryResponse> createAiGatewayModelWithHttpInfo(
      Long providerId, AiGatewayModelCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'providerId' when calling createAiGatewayModel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayModel",
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
        new GenericType<AiGatewayModelCatalogEntryResponse>() {});
  }

  /**
   * Add a model to an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelCatalogEntryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>>
      createAiGatewayModelWithHttpInfoAsync(Long providerId, AiGatewayModelCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling createAiGatewayModel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiGatewayModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayModel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
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
        new GenericType<AiGatewayModelCatalogEntryResponse>() {});
  }

  /**
   * Create an AI Gateway model group.
   *
   * <p>See {@link #createAiGatewayModelGroupWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayModelGroupResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelGroupResponse createAiGatewayModelGroup(
      AiGatewayModelGroupCreateRequest body) throws ApiException {
    return createAiGatewayModelGroupWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway model group.
   *
   * <p>See {@link #createAiGatewayModelGroupWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelGroupResponse&gt;
   */
  public CompletableFuture<AiGatewayModelGroupResponse> createAiGatewayModelGroupAsync(
      AiGatewayModelGroupCreateRequest body) {
    return createAiGatewayModelGroupWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an AI Gateway model group from a name and any combination of model catalog entries and
   * routing rules, with optional fast-mode and reasoning limits and initial access bindings.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelGroupResponse> createAiGatewayModelGroupWithHttpInfo(
      AiGatewayModelGroupCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayModelGroup");
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayModelGroup",
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
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Create an AI Gateway model group.
   *
   * <p>See {@link #createAiGatewayModelGroupWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>>
      createAiGatewayModelGroupWithHttpInfoAsync(AiGatewayModelGroupCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiGatewayModelGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayModelGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
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
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Create an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayProviderWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayProviderResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayProviderResponse createAiGatewayProvider(AiGatewayProviderCreateRequest body)
      throws ApiException {
    return createAiGatewayProviderWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayProviderWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayProviderResponse&gt;
   */
  public CompletableFuture<AiGatewayProviderResponse> createAiGatewayProviderAsync(
      AiGatewayProviderCreateRequest body) {
    return createAiGatewayProviderWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creating a provider requires <code>ai_gateway_config_write</code>. No provider View check
   * applies before creation. Create a provider and its initial model catalog. All discovered models
   * are enabled; optional models are added as manually managed entries. The slug is the immutable
   * routing identifier. Provider and initial catalog rows are saved in one transaction. Initial
   * sharing is unavailable: supplying initial_bindings returns 503 with stage initial_permissions
   * and outcome not_saved. A failed database commit can return 503 with stage database_commit and
   * outcome unknown; check the provider list before retrying. Creation without initial_bindings
   * keeps normal unrestricted defaults.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayProviderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayProviderResponse> createAiGatewayProviderWithHttpInfo(
      AiGatewayProviderCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayProvider");
    }
    // create path and map variables
    String localVarPath = "/api/v2/providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayProvider",
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
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Create an AI Gateway provider.
   *
   * <p>See {@link #createAiGatewayProviderWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayProviderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayProviderResponse>>
      createAiGatewayProviderWithHttpInfoAsync(AiGatewayProviderCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiGatewayProvider"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayProvider",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Create an AI Gateway rate limit.
   *
   * <p>See {@link #createAiGatewayRateLimitWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayRateLimitResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitResponse createAiGatewayRateLimit(AiGatewayRateLimitCreateRequest body)
      throws ApiException {
    return createAiGatewayRateLimitWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway rate limit.
   *
   * <p>See {@link #createAiGatewayRateLimitWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayRateLimitResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitResponse> createAiGatewayRateLimitAsync(
      AiGatewayRateLimitCreateRequest body) {
    return createAiGatewayRateLimitWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a rate limit. All requests matching its scope share one allowance, unless a selector
   * makes it a template, which gives each matched user, Team, or value its own allowance. Every
   * matching rate limit applies. Returns 409 when another active rate limit has the same user,
   * Team, tags, and selector, or when the organization already has the maximum number of rate
   * limits.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayRateLimitResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitResponse> createAiGatewayRateLimitWithHttpInfo(
      AiGatewayRateLimitCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayRateLimit");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayRateLimit",
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
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /**
   * Create an AI Gateway rate limit.
   *
   * <p>See {@link #createAiGatewayRateLimitWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>>
      createAiGatewayRateLimitWithHttpInfoAsync(AiGatewayRateLimitCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAiGatewayRateLimit"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayRateLimit",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /**
   * Create an AI Gateway routing rule.
   *
   * <p>See {@link #createAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayRoutingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRoutingRuleResponse createAiGatewayRoutingRule(
      AiGatewayRoutingRuleCreateRequest body) throws ApiException {
    return createAiGatewayRoutingRuleWithHttpInfo(body).getData();
  }

  /**
   * Create an AI Gateway routing rule.
   *
   * <p>See {@link #createAiGatewayRoutingRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayRoutingRuleResponse&gt;
   */
  public CompletableFuture<AiGatewayRoutingRuleResponse> createAiGatewayRoutingRuleAsync(
      AiGatewayRoutingRuleCreateRequest body) {
    return createAiGatewayRoutingRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an organization-owned routing rule. Data capture overrides are managed independently.
   * Each tier has an ordering, which defaults to configured. A weighted_affinity tier distributes
   * first-choice assignments by relative target weights (1 to 10000, default 1) and accepts only
   * distinct model targets with an explicit provider. Weights need not total 100. Configured tiers
   * must omit weights or set them to null.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRoutingRuleResponse> createAiGatewayRoutingRuleWithHttpInfo(
      AiGatewayRoutingRuleCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAiGatewayRoutingRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.createAiGatewayRoutingRule",
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /**
   * Create an AI Gateway routing rule.
   *
   * <p>See {@link #createAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>>
      createAiGatewayRoutingRuleWithHttpInfoAsync(AiGatewayRoutingRuleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAiGatewayRoutingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.createAiGatewayRoutingRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /**
   * Archive an AI Gateway budget.
   *
   * <p>See {@link #deleteAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayBudget(UUID id) throws ApiException {
    deleteAiGatewayBudgetWithHttpInfo(id);
  }

  /**
   * Archive an AI Gateway budget.
   *
   * <p>See {@link #deleteAiGatewayBudgetWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayBudgetAsync(UUID id) {
    return deleteAiGatewayBudgetWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a spend budget by ID while retaining its accounting history.
   *
   * @param id Budget UUID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayBudgetWithHttpInfo(UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteAiGatewayBudget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayBudget",
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
   * Archive an AI Gateway budget.
   *
   * <p>See {@link #deleteAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayBudgetWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayBudget";
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
              400, "Missing the required parameter 'id' when calling deleteAiGatewayBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayBudget",
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
   * Delete an AI Gateway data capture override.
   *
   * <p>See {@link #deleteAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayDataCaptureOverride(UUID id, AiGatewayCaptureDeleteRequest body)
      throws ApiException {
    deleteAiGatewayDataCaptureOverrideWithHttpInfo(id, body);
  }

  /**
   * Delete an AI Gateway data capture override.
   *
   * <p>See {@link #deleteAiGatewayDataCaptureOverrideWithHttpInfoAsync}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayDataCaptureOverrideAsync(
      UUID id, AiGatewayCaptureDeleteRequest body) {
    return deleteAiGatewayDataCaptureOverrideWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an override using its <code>revision</code> and the current <code>configuration_revision
   * </code>. If deleting the override can enable full capture for affected traffic, set <code>
   * confirm_full_capture</code> to <code>true</code>. Returns HTTP 409 when <code>
   * configuration_revision</code> or the override <code>revision</code> is stale, including a
   * concurrent change during deletion. Missing revisions or required full-capture confirmation
   * returns HTTP 400.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
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
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayDataCaptureOverrideWithHttpInfo(
      UUID id, AiGatewayCaptureDeleteRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayDataCaptureOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling deleteAiGatewayDataCaptureOverride");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling deleteAiGatewayDataCaptureOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-capture/overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayDataCaptureOverride",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete an AI Gateway data capture override.
   *
   * <p>See {@link #deleteAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayDataCaptureOverrideWithHttpInfoAsync(
      UUID id, AiGatewayCaptureDeleteRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayDataCaptureOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " deleteAiGatewayDataCaptureOverride"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " deleteAiGatewayDataCaptureOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-capture/overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayDataCaptureOverride",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a model from an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayModel(Long providerId, String canonical) throws ApiException {
    deleteAiGatewayModelWithHttpInfo(providerId, canonical);
  }

  /**
   * Delete a model from an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayModelWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayModelAsync(Long providerId, String canonical) {
    return deleteAiGatewayModelWithHttpInfoAsync(providerId, canonical)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Requires <code>ai_gateway_config_write</code> and provider Edit. Models and pricing inherit
   * provider access. Delete a manually managed model catalog entry by its canonical model ID.
   * Discovered entries are read-only.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayModelWithHttpInfo(Long providerId, String canonical)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'providerId' when calling deleteAiGatewayModel");
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      throw new ApiException(
          400, "Missing the required parameter 'canonical' when calling deleteAiGatewayModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayModel",
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
   * Delete a model from an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayModelWithHttpInfoAsync(
      Long providerId, String canonical) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling deleteAiGatewayModel"));
      return result;
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'canonical' when calling deleteAiGatewayModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayModel",
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
   * Delete an AI Gateway model group.
   *
   * <p>See {@link #deleteAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayModelGroup(String id) throws ApiException {
    deleteAiGatewayModelGroupWithHttpInfo(id);
  }

  /**
   * Delete an AI Gateway model group.
   *
   * <p>See {@link #deleteAiGatewayModelGroupWithHttpInfoAsync}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayModelGroupAsync(String id) {
    return deleteAiGatewayModelGroupWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a named model group. The organization-wide policy cannot be deleted. Requires
   * configuration write permission and edit access to the group.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
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
  public ApiResponse<Void> deleteAiGatewayModelGroupWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteAiGatewayModelGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayModelGroup",
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
   * Delete an AI Gateway model group.
   *
   * <p>See {@link #deleteAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayModelGroupWithHttpInfoAsync(
      String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModelGroup";
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
              400, "Missing the required parameter 'id' when calling deleteAiGatewayModelGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayModelGroup",
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
   * Delete a model pricing override.
   *
   * <p>See {@link #deleteAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayModelPricing(Long providerId, String canonical) throws ApiException {
    deleteAiGatewayModelPricingWithHttpInfo(providerId, canonical);
  }

  /**
   * Delete a model pricing override.
   *
   * <p>See {@link #deleteAiGatewayModelPricingWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayModelPricingAsync(
      Long providerId, String canonical) {
    return deleteAiGatewayModelPricingWithHttpInfoAsync(providerId, canonical)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Clear a custom provider model's pricing override. Requires <code>ai_gateway_config_write</code>
   * and provider Edit. Models and pricing inherit provider access.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
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
  public ApiResponse<Void> deleteAiGatewayModelPricingWithHttpInfo(
      Long providerId, String canonical) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'providerId' when calling deleteAiGatewayModelPricing");
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'canonical' when calling deleteAiGatewayModelPricing");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayModelPricing",
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
   * Delete a model pricing override.
   *
   * <p>See {@link #deleteAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayModelPricingWithHttpInfoAsync(
      Long providerId, String canonical) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling"
                  + " deleteAiGatewayModelPricing"));
      return result;
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'canonical' when calling"
                  + " deleteAiGatewayModelPricing"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayModelPricing",
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

  /** Manage optional parameters to deleteAiGatewayPolicy. */
  public static class DeleteAiGatewayPolicyOptionalParameters {
    private UUID userId;

    /**
     * Set userId.
     *
     * @param userId Filter or scope policies to a specific user. Omit for organization-wide
     *     policies. (optional)
     * @return DeleteAiGatewayPolicyOptionalParameters
     */
    public DeleteAiGatewayPolicyOptionalParameters userId(UUID userId) {
      this.userId = userId;
      return this;
    }
  }

  /**
   * Delete an AI Gateway routing policy.
   *
   * <p>See {@link #deleteAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayPolicy(String inbound) throws ApiException {
    deleteAiGatewayPolicyWithHttpInfo(inbound, new DeleteAiGatewayPolicyOptionalParameters());
  }

  /**
   * Delete an AI Gateway routing policy.
   *
   * <p>See {@link #deleteAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayPolicyAsync(String inbound) {
    return deleteAiGatewayPolicyWithHttpInfoAsync(
            inbound, new DeleteAiGatewayPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI Gateway routing policy.
   *
   * <p>See {@link #deleteAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayPolicy(
      String inbound, DeleteAiGatewayPolicyOptionalParameters parameters) throws ApiException {
    deleteAiGatewayPolicyWithHttpInfo(inbound, parameters);
  }

  /**
   * Delete an AI Gateway routing policy.
   *
   * <p>See {@link #deleteAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayPolicyAsync(
      String inbound, DeleteAiGatewayPolicyOptionalParameters parameters) {
    return deleteAiGatewayPolicyWithHttpInfoAsync(inbound, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the routing policy document for a specific inbound pattern.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayPolicyWithHttpInfo(
      String inbound, DeleteAiGatewayPolicyOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'inbound' is set
    if (inbound == null) {
      throw new ApiException(
          400, "Missing the required parameter 'inbound' when calling deleteAiGatewayPolicy");
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath =
        "/api/v2/policies/{inbound}"
            .replaceAll("\\{" + "inbound" + "\\}", apiClient.escapeString(inbound.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayPolicy",
            localVarPath,
            localVarQueryParams,
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
   * Delete an AI Gateway routing policy.
   *
   * <p>See {@link #deleteAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayPolicyWithHttpInfoAsync(
      String inbound, DeleteAiGatewayPolicyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'inbound' is set
    if (inbound == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'inbound' when calling deleteAiGatewayPolicy"));
      return result;
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath =
        "/api/v2/policies/{inbound}"
            .replaceAll("\\{" + "inbound" + "\\}", apiClient.escapeString(inbound.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayPolicy",
              localVarPath,
              localVarQueryParams,
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

  /** Manage optional parameters to deleteAiGatewayProvider. */
  public static class DeleteAiGatewayProviderOptionalParameters {
    private Boolean force;

    /**
     * Set force.
     *
     * @param force Apply the routing rule changes returned by provider_in_use. Defaults to false.
     *     (optional, default to false)
     * @return DeleteAiGatewayProviderOptionalParameters
     */
    public DeleteAiGatewayProviderOptionalParameters force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayProvider(Long id) throws ApiException {
    deleteAiGatewayProviderWithHttpInfo(id, new DeleteAiGatewayProviderOptionalParameters());
  }

  /**
   * Delete an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayProviderWithHttpInfoAsync}.
   *
   * @param id Provider ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayProviderAsync(Long id) {
    return deleteAiGatewayProviderWithHttpInfoAsync(
            id, new DeleteAiGatewayProviderOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayProvider(Long id, DeleteAiGatewayProviderOptionalParameters parameters)
      throws ApiException {
    deleteAiGatewayProviderWithHttpInfo(id, parameters);
  }

  /**
   * Delete an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayProviderWithHttpInfoAsync}.
   *
   * @param id Provider ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayProviderAsync(
      Long id, DeleteAiGatewayProviderOptionalParameters parameters) {
    return deleteAiGatewayProviderWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Requires <code>ai_gateway_config_write</code> and provider Edit. Models and pricing inherit
   * provider access. This also applies when force=true. Existing cascades remain and can affect
   * policies the caller cannot edit. Delete a provider by ID. Providers used by routing rules
   * return provider_in_use with HTTP 409 and the affected rules in error metadata. Retry with
   * force=true to remove provider targets and delete rules left without targets. Surviving tiers
   * keep their ordering and weights. A deletion that would rewrite a surviving tier with an unknown
   * ordering_issue fails with HTTP 409 and code routing_rule_unknown_ordering until that rule is
   * replaced or deleted.
   *
   * @param id Provider ID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayProviderWithHttpInfo(
      Long id, DeleteAiGatewayProviderOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteAiGatewayProvider");
    }
    Boolean force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayProvider",
            localVarPath,
            localVarQueryParams,
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
   * Delete an AI Gateway provider.
   *
   * <p>See {@link #deleteAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayProviderWithHttpInfoAsync(
      Long id, DeleteAiGatewayProviderOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayProvider";
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
              400, "Missing the required parameter 'id' when calling deleteAiGatewayProvider"));
      return result;
    }
    Boolean force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayProvider",
              localVarPath,
              localVarQueryParams,
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
   * Archive an AI Gateway rate limit.
   *
   * <p>See {@link #deleteAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayRateLimit(UUID id) throws ApiException {
    deleteAiGatewayRateLimitWithHttpInfo(id);
  }

  /**
   * Archive an AI Gateway rate limit.
   *
   * <p>See {@link #deleteAiGatewayRateLimitWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayRateLimitAsync(UUID id) {
    return deleteAiGatewayRateLimitWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a rate limit by ID. An archived rate limit no longer appears in lists or lookups, and
   * its alert monitor is deleted.
   *
   * @param id Rate limit UUID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayRateLimitWithHttpInfo(UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteAiGatewayRateLimit");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayRateLimit",
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
   * Archive an AI Gateway rate limit.
   *
   * <p>See {@link #deleteAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayRateLimitWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayRateLimit";
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
              400, "Missing the required parameter 'id' when calling deleteAiGatewayRateLimit"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayRateLimit",
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

  /** Manage optional parameters to deleteAiGatewayRoutingRule. */
  public static class DeleteAiGatewayRoutingRuleOptionalParameters {
    private Boolean force;

    /**
     * Set force.
     *
     * @param force Delete referencing tiers and recursively delete parent rules left without tiers.
     *     (optional, default to false)
     * @return DeleteAiGatewayRoutingRuleOptionalParameters
     */
    public DeleteAiGatewayRoutingRuleOptionalParameters force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete an AI Gateway routing rule.
   *
   * <p>See {@link #deleteAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayRoutingRule(String slug) throws ApiException {
    deleteAiGatewayRoutingRuleWithHttpInfo(
        slug, new DeleteAiGatewayRoutingRuleOptionalParameters());
  }

  /**
   * Delete an AI Gateway routing rule.
   *
   * <p>See {@link #deleteAiGatewayRoutingRuleWithHttpInfoAsync}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayRoutingRuleAsync(String slug) {
    return deleteAiGatewayRoutingRuleWithHttpInfoAsync(
            slug, new DeleteAiGatewayRoutingRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AI Gateway routing rule.
   *
   * <p>See {@link #deleteAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteAiGatewayRoutingRule(
      String slug, DeleteAiGatewayRoutingRuleOptionalParameters parameters) throws ApiException {
    deleteAiGatewayRoutingRuleWithHttpInfo(slug, parameters);
  }

  /**
   * Delete an AI Gateway routing rule.
   *
   * <p>See {@link #deleteAiGatewayRoutingRuleWithHttpInfoAsync}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAiGatewayRoutingRuleAsync(
      String slug, DeleteAiGatewayRoutingRuleOptionalParameters parameters) {
    return deleteAiGatewayRoutingRuleWithHttpInfoAsync(slug, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a routing rule. Referenced rules require force=true. Surviving tiers keep their ordering
   * and weights. A deletion that would rewrite a surviving tier with an unknown ordering_issue
   * fails with HTTP 409 and code routing_rule_unknown_ordering until that rule is replaced or
   * deleted.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAiGatewayRoutingRuleWithHttpInfo(
      String slug, DeleteAiGatewayRoutingRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      throw new ApiException(
          400, "Missing the required parameter 'slug' when calling deleteAiGatewayRoutingRule");
    }
    Boolean force = parameters.force;
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.deleteAiGatewayRoutingRule",
            localVarPath,
            localVarQueryParams,
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
   * Delete an AI Gateway routing rule.
   *
   * <p>See {@link #deleteAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAiGatewayRoutingRuleWithHttpInfoAsync(
      String slug, DeleteAiGatewayRoutingRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'slug' when calling deleteAiGatewayRoutingRule"));
      return result;
    }
    Boolean force = parameters.force;
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.deleteAiGatewayRoutingRule",
              localVarPath,
              localVarQueryParams,
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
   * Get an AI Gateway budget.
   *
   * <p>See {@link #getAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return AiGatewayBudgetResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetResponse getAiGatewayBudget(UUID id) throws ApiException {
    return getAiGatewayBudgetWithHttpInfo(id).getData();
  }

  /**
   * Get an AI Gateway budget.
   *
   * <p>See {@link #getAiGatewayBudgetWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;AiGatewayBudgetResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetResponse> getAiGatewayBudgetAsync(UUID id) {
    return getAiGatewayBudgetWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a spend budget by ID, including its capacity, scope, reset window, warning threshold, and
   * enforcement mode.
   *
   * @param id Budget UUID. (required)
   * @return ApiResponse&lt;AiGatewayBudgetResponse&gt;
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
  public ApiResponse<AiGatewayBudgetResponse> getAiGatewayBudgetWithHttpInfo(UUID id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiGatewayBudget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayBudget",
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
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Get an AI Gateway budget.
   *
   * <p>See {@link #getAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetResponse>>
      getAiGatewayBudgetWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getAiGatewayBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Get an AI Gateway budget&#39;s current period.
   *
   * <p>See {@link #getAiGatewayBudgetCurrentPeriodWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return AiGatewayBudgetPeriodResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetPeriodResponse getAiGatewayBudgetCurrentPeriod(UUID id)
      throws ApiException {
    return getAiGatewayBudgetCurrentPeriodWithHttpInfo(id).getData();
  }

  /**
   * Get an AI Gateway budget&#39;s current period.
   *
   * <p>See {@link #getAiGatewayBudgetCurrentPeriodWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;AiGatewayBudgetPeriodResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetPeriodResponse> getAiGatewayBudgetCurrentPeriodAsync(
      UUID id) {
    return getAiGatewayBudgetCurrentPeriodWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the active accounting window, enforced capacity, and current spend.
   *
   * @param id Budget UUID. (required)
   * @return ApiResponse&lt;AiGatewayBudgetPeriodResponse&gt;
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
  public ApiResponse<AiGatewayBudgetPeriodResponse> getAiGatewayBudgetCurrentPeriodWithHttpInfo(
      UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudgetCurrentPeriod";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiGatewayBudgetCurrentPeriod");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/current-period"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayBudgetCurrentPeriod",
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
        new GenericType<AiGatewayBudgetPeriodResponse>() {});
  }

  /**
   * Get an AI Gateway budget&#39;s current period.
   *
   * <p>See {@link #getAiGatewayBudgetCurrentPeriodWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetPeriodResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetPeriodResponse>>
      getAiGatewayBudgetCurrentPeriodWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudgetCurrentPeriod";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetPeriodResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetPeriodResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling getAiGatewayBudgetCurrentPeriod"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/current-period"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayBudgetCurrentPeriod",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetPeriodResponse>> result =
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
        new GenericType<AiGatewayBudgetPeriodResponse>() {});
  }

  /** Manage optional parameters to getAiGatewayBudgetInstancesSummary. */
  public static class GetAiGatewayBudgetInstancesSummaryOptionalParameters {
    private OffsetDateTime window;
    private List<String> splitDim;

    /**
     * Set window.
     *
     * @param window RFC3339 timestamp inside the desired accounting window. Omit to use the current
     *     window. (optional)
     * @return GetAiGatewayBudgetInstancesSummaryOptionalParameters
     */
    public GetAiGatewayBudgetInstancesSummaryOptionalParameters window(OffsetDateTime window) {
      this.window = window;
      return this;
    }

    /**
     * Set splitDim.
     *
     * @param splitDim Keep only instance counters whose split dimension equals a value, written as
     *     <code>&lt;dim&gt;=&lt;value&gt;</code>, such as <code>
     *     split_dim=user_id=&lt;uuid&gt;&amp;split_dim=tag:env=prod</code>. Dimensions use the
     *     <code>split_dims</code> names <code>user_id</code>, <code>team_id</code>, <code>model
     *     </code>, <code>provider</code>, and <code>tag:&lt;key&gt;</code>. Repeat the parameter to
     *     filter on several dimensions; a counter must match all of them. Each dimension may appear
     *     once and must be a per-value dimension of the budget. (optional)
     * @return GetAiGatewayBudgetInstancesSummaryOptionalParameters
     */
    public GetAiGatewayBudgetInstancesSummaryOptionalParameters splitDim(List<String> splitDim) {
      this.splitDim = splitDim;
      return this;
    }
  }

  /**
   * Get an AI Gateway budget instance summary.
   *
   * <p>See {@link #getAiGatewayBudgetInstancesSummaryWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return AiGatewayBudgetInstancesSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstancesSummaryResponse getAiGatewayBudgetInstancesSummary(UUID id)
      throws ApiException {
    return getAiGatewayBudgetInstancesSummaryWithHttpInfo(
            id, new GetAiGatewayBudgetInstancesSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get an AI Gateway budget instance summary.
   *
   * <p>See {@link #getAiGatewayBudgetInstancesSummaryWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;AiGatewayBudgetInstancesSummaryResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstancesSummaryResponse>
      getAiGatewayBudgetInstancesSummaryAsync(UUID id) {
    return getAiGatewayBudgetInstancesSummaryWithHttpInfoAsync(
            id, new GetAiGatewayBudgetInstancesSummaryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI Gateway budget instance summary.
   *
   * <p>See {@link #getAiGatewayBudgetInstancesSummaryWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayBudgetInstancesSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstancesSummaryResponse getAiGatewayBudgetInstancesSummary(
      UUID id, GetAiGatewayBudgetInstancesSummaryOptionalParameters parameters)
      throws ApiException {
    return getAiGatewayBudgetInstancesSummaryWithHttpInfo(id, parameters).getData();
  }

  /**
   * Get an AI Gateway budget instance summary.
   *
   * <p>See {@link #getAiGatewayBudgetInstancesSummaryWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayBudgetInstancesSummaryResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstancesSummaryResponse>
      getAiGatewayBudgetInstancesSummaryAsync(
          UUID id, GetAiGatewayBudgetInstancesSummaryOptionalParameters parameters) {
    return getAiGatewayBudgetInstancesSummaryWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Aggregate counters for an accounting window, including total spend and the numbers of instances
   * at or above the warning threshold and capacity. Use split_dim to aggregate only counters that
   * match every given dimension value.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayBudgetInstancesSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetInstancesSummaryResponse>
      getAiGatewayBudgetInstancesSummaryWithHttpInfo(
          UUID id, GetAiGatewayBudgetInstancesSummaryOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudgetInstancesSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling getAiGatewayBudgetInstancesSummary");
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/summary"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayBudgetInstancesSummary",
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
        new GenericType<AiGatewayBudgetInstancesSummaryResponse>() {});
  }

  /**
   * Get an AI Gateway budget instance summary.
   *
   * <p>See {@link #getAiGatewayBudgetInstancesSummaryWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetInstancesSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetInstancesSummaryResponse>>
      getAiGatewayBudgetInstancesSummaryWithHttpInfoAsync(
          UUID id, GetAiGatewayBudgetInstancesSummaryOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayBudgetInstancesSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstancesSummaryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstancesSummaryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " getAiGatewayBudgetInstancesSummary"));
      return result;
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/summary"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayBudgetInstancesSummary",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstancesSummaryResponse>> result =
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
        new GenericType<AiGatewayBudgetInstancesSummaryResponse>() {});
  }

  /**
   * Get the AI Gateway data capture configuration.
   *
   * <p>See {@link #getAiGatewayDataCaptureConfigurationWithHttpInfo}.
   *
   * @return AiGatewayCaptureConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayCaptureConfigurationResponse getAiGatewayDataCaptureConfiguration()
      throws ApiException {
    return getAiGatewayDataCaptureConfigurationWithHttpInfo().getData();
  }

  /**
   * Get the AI Gateway data capture configuration.
   *
   * <p>See {@link #getAiGatewayDataCaptureConfigurationWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayCaptureConfigurationResponse&gt;
   */
  public CompletableFuture<AiGatewayCaptureConfigurationResponse>
      getAiGatewayDataCaptureConfigurationAsync() {
    return getAiGatewayDataCaptureConfigurationWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the organization default mode, scoped capture overrides, and configuration revision.
   *
   * @return ApiResponse&lt;AiGatewayCaptureConfigurationResponse&gt;
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
  public ApiResponse<AiGatewayCaptureConfigurationResponse>
      getAiGatewayDataCaptureConfigurationWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayDataCaptureConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/data-capture/configuration";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayDataCaptureConfiguration",
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
        new GenericType<AiGatewayCaptureConfigurationResponse>() {});
  }

  /**
   * Get the AI Gateway data capture configuration.
   *
   * <p>See {@link #getAiGatewayDataCaptureConfigurationWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayCaptureConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayCaptureConfigurationResponse>>
      getAiGatewayDataCaptureConfigurationWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayDataCaptureConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayCaptureConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/data-capture/configuration";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayDataCaptureConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayCaptureConfigurationResponse>> result =
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
        new GenericType<AiGatewayCaptureConfigurationResponse>() {});
  }

  /**
   * Get AI Gateway governance controls.
   *
   * <p>See {@link #getAiGatewayGovernanceWithHttpInfo}.
   *
   * @return AiGatewayGovernanceResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayGovernanceResponse getAiGatewayGovernance() throws ApiException {
    return getAiGatewayGovernanceWithHttpInfo().getData();
  }

  /**
   * Get AI Gateway governance controls.
   *
   * <p>See {@link #getAiGatewayGovernanceWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayGovernanceResponse&gt;
   */
  public CompletableFuture<AiGatewayGovernanceResponse> getAiGatewayGovernanceAsync() {
    return getAiGatewayGovernanceWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the organization-wide AI Gateway governance settings, which are the default data capture
   * mode and whether requests must reach providers covered by a zero data retention agreement.
   *
   * @return ApiResponse&lt;AiGatewayGovernanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayGovernanceResponse> getAiGatewayGovernanceWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayGovernance";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayGovernance",
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
        new GenericType<AiGatewayGovernanceResponse>() {});
  }

  /**
   * Get AI Gateway governance controls.
   *
   * <p>See {@link #getAiGatewayGovernanceWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayGovernanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>>
      getAiGatewayGovernanceWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayGovernance";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayGovernance",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>> result =
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
        new GenericType<AiGatewayGovernanceResponse>() {});
  }

  /**
   * Get an AI Gateway model group.
   *
   * <p>See {@link #getAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return AiGatewayModelGroupResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelGroupResponse getAiGatewayModelGroup(String id) throws ApiException {
    return getAiGatewayModelGroupWithHttpInfo(id).getData();
  }

  /**
   * Get an AI Gateway model group.
   *
   * <p>See {@link #getAiGatewayModelGroupWithHttpInfoAsync}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return CompletableFuture&lt;AiGatewayModelGroupResponse&gt;
   */
  public CompletableFuture<AiGatewayModelGroupResponse> getAiGatewayModelGroupAsync(String id) {
    return getAiGatewayModelGroupWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a named policy or the explicit organization-wide policy by id "default". Requires
   * configuration read permission; named policies also require view access. Provider selections
   * cover current and future models and are returned separately from individual model selections.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return ApiResponse&lt;AiGatewayModelGroupResponse&gt;
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
  public ApiResponse<AiGatewayModelGroupResponse> getAiGatewayModelGroupWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiGatewayModelGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayModelGroup",
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
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Get an AI Gateway model group.
   *
   * <p>See {@link #getAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>>
      getAiGatewayModelGroupWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getAiGatewayModelGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayModelGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
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
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Get a model pricing override.
   *
   * <p>See {@link #getAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return AiGatewayModelPricingResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelPricingResponse getAiGatewayModelPricing(Long providerId, String canonical)
      throws ApiException {
    return getAiGatewayModelPricingWithHttpInfo(providerId, canonical).getData();
  }

  /**
   * Get a model pricing override.
   *
   * <p>See {@link #getAiGatewayModelPricingWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture&lt;AiGatewayModelPricingResponse&gt;
   */
  public CompletableFuture<AiGatewayModelPricingResponse> getAiGatewayModelPricingAsync(
      Long providerId, String canonical) {
    return getAiGatewayModelPricingWithHttpInfoAsync(providerId, canonical)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a custom provider model's pricing override and effective pricing source. Requires <code>
   * ai_gateway_config_read</code> and provider View. Catalog and pricing metadata inherit provider
   * access. Lists omit hidden entries; direct reads of hidden resources return 404.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return ApiResponse&lt;AiGatewayModelPricingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelPricingResponse> getAiGatewayModelPricingWithHttpInfo(
      Long providerId, String canonical) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'providerId' when calling getAiGatewayModelPricing");
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      throw new ApiException(
          400, "Missing the required parameter 'canonical' when calling getAiGatewayModelPricing");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayModelPricing",
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
        new GenericType<AiGatewayModelPricingResponse>() {});
  }

  /**
   * Get a model pricing override.
   *
   * <p>See {@link #getAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelPricingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>>
      getAiGatewayModelPricingWithHttpInfoAsync(Long providerId, String canonical) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling getAiGatewayModelPricing"));
      return result;
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'canonical' when calling getAiGatewayModelPricing"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayModelPricing",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
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
        new GenericType<AiGatewayModelPricingResponse>() {});
  }

  /** Manage optional parameters to getAiGatewayPolicy. */
  public static class GetAiGatewayPolicyOptionalParameters {
    private UUID userId;

    /**
     * Set userId.
     *
     * @param userId Filter or scope policies to a specific user. Omit for organization-wide
     *     policies. (optional)
     * @return GetAiGatewayPolicyOptionalParameters
     */
    public GetAiGatewayPolicyOptionalParameters userId(UUID userId) {
      this.userId = userId;
      return this;
    }
  }

  /**
   * Get an AI Gateway routing policy.
   *
   * <p>See {@link #getAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @return AiGatewayPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyResponse getAiGatewayPolicy(String inbound) throws ApiException {
    return getAiGatewayPolicyWithHttpInfo(inbound, new GetAiGatewayPolicyOptionalParameters())
        .getData();
  }

  /**
   * Get an AI Gateway routing policy.
   *
   * <p>See {@link #getAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @return CompletableFuture&lt;AiGatewayPolicyResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyResponse> getAiGatewayPolicyAsync(String inbound) {
    return getAiGatewayPolicyWithHttpInfoAsync(inbound, new GetAiGatewayPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI Gateway routing policy.
   *
   * <p>See {@link #getAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyResponse getAiGatewayPolicy(
      String inbound, GetAiGatewayPolicyOptionalParameters parameters) throws ApiException {
    return getAiGatewayPolicyWithHttpInfo(inbound, parameters).getData();
  }

  /**
   * Get an AI Gateway routing policy.
   *
   * <p>See {@link #getAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayPolicyResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyResponse> getAiGatewayPolicyAsync(
      String inbound, GetAiGatewayPolicyOptionalParameters parameters) {
    return getAiGatewayPolicyWithHttpInfoAsync(inbound, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the routing policy document for a specific inbound pattern.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayPolicyResponse&gt;
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
  public ApiResponse<AiGatewayPolicyResponse> getAiGatewayPolicyWithHttpInfo(
      String inbound, GetAiGatewayPolicyOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'inbound' is set
    if (inbound == null) {
      throw new ApiException(
          400, "Missing the required parameter 'inbound' when calling getAiGatewayPolicy");
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath =
        "/api/v2/policies/{inbound}"
            .replaceAll("\\{" + "inbound" + "\\}", apiClient.escapeString(inbound.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayPolicy",
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
        new GenericType<AiGatewayPolicyResponse>() {});
  }

  /**
   * Get an AI Gateway routing policy.
   *
   * <p>See {@link #getAiGatewayPolicyWithHttpInfo}.
   *
   * @param inbound Inbound routing pattern. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayPolicyResponse>>
      getAiGatewayPolicyWithHttpInfoAsync(
          String inbound, GetAiGatewayPolicyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'inbound' is set
    if (inbound == null) {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'inbound' when calling getAiGatewayPolicy"));
      return result;
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath =
        "/api/v2/policies/{inbound}"
            .replaceAll("\\{" + "inbound" + "\\}", apiClient.escapeString(inbound.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayPolicyResponse>() {});
  }

  /**
   * Get an AI Gateway provider.
   *
   * <p>See {@link #getAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @return AiGatewayProviderResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayProviderResponse getAiGatewayProvider(Long id) throws ApiException {
    return getAiGatewayProviderWithHttpInfo(id).getData();
  }

  /**
   * Get an AI Gateway provider.
   *
   * <p>See {@link #getAiGatewayProviderWithHttpInfoAsync}.
   *
   * @param id Provider ID. (required)
   * @return CompletableFuture&lt;AiGatewayProviderResponse&gt;
   */
  public CompletableFuture<AiGatewayProviderResponse> getAiGatewayProviderAsync(Long id) {
    return getAiGatewayProviderWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a provider by ID, including its routing slug, integration account, and cost multiplier.
   * Credentials stay in the integration account and are never returned. Requires <code>
   * ai_gateway_config_read</code> and provider View. Catalog and pricing metadata inherit provider
   * access. Lists omit hidden entries; direct reads of hidden resources return 404.
   *
   * @param id Provider ID. (required)
   * @return ApiResponse&lt;AiGatewayProviderResponse&gt;
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
  public ApiResponse<AiGatewayProviderResponse> getAiGatewayProviderWithHttpInfo(Long id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiGatewayProvider");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayProvider",
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
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Get an AI Gateway provider.
   *
   * <p>See {@link #getAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayProviderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayProviderResponse>>
      getAiGatewayProviderWithHttpInfoAsync(Long id) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getAiGatewayProvider"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayProvider",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Get an AI Gateway rate limit.
   *
   * <p>See {@link #getAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @return AiGatewayRateLimitResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitResponse getAiGatewayRateLimit(UUID id) throws ApiException {
    return getAiGatewayRateLimitWithHttpInfo(id).getData();
  }

  /**
   * Get an AI Gateway rate limit.
   *
   * <p>See {@link #getAiGatewayRateLimitWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture&lt;AiGatewayRateLimitResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitResponse> getAiGatewayRateLimitAsync(UUID id) {
    return getAiGatewayRateLimitWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a rate limit by ID, including its scope, per-minute request and token limits, and whether
   * it is enabled.
   *
   * @param id Rate limit UUID. (required)
   * @return ApiResponse&lt;AiGatewayRateLimitResponse&gt;
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
  public ApiResponse<AiGatewayRateLimitResponse> getAiGatewayRateLimitWithHttpInfo(UUID id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getAiGatewayRateLimit");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayRateLimit",
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
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /**
   * Get an AI Gateway rate limit.
   *
   * <p>See {@link #getAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>>
      getAiGatewayRateLimitWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getAiGatewayRateLimit"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayRateLimit",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /** Manage optional parameters to getAiGatewayRateLimitInstancesSummary. */
  public static class GetAiGatewayRateLimitInstancesSummaryOptionalParameters {
    private List<String> splitDim;

    /**
     * Set splitDim.
     *
     * @param splitDim Keep only counters whose split dimension equals a value, written as <code>
     *     &lt;dim&gt;=&lt;value&gt;</code>, such as <code>
     *     split_dim=user_id=&lt;uuid&gt;&amp;split_dim=model=gpt-4o</code>. Dimensions use the
     *     <code>split_dims</code> names <code>user_id</code>, <code>team_id</code>, <code>model
     *     </code>, <code>provider</code>, and <code>tag:&lt;key&gt;</code>. Repeat the parameter to
     *     filter on several dimensions; a counter must match all of them. Each dimension may appear
     *     once and must be a per-value dimension of the rate limit. (optional)
     * @return GetAiGatewayRateLimitInstancesSummaryOptionalParameters
     */
    public GetAiGatewayRateLimitInstancesSummaryOptionalParameters splitDim(List<String> splitDim) {
      this.splitDim = splitDim;
      return this;
    }
  }

  /**
   * Get an AI Gateway rate limit counter summary.
   *
   * <p>See {@link #getAiGatewayRateLimitInstancesSummaryWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @return AiGatewayRateLimitInstancesSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitInstancesSummaryResponse getAiGatewayRateLimitInstancesSummary(UUID id)
      throws ApiException {
    return getAiGatewayRateLimitInstancesSummaryWithHttpInfo(
            id, new GetAiGatewayRateLimitInstancesSummaryOptionalParameters())
        .getData();
  }

  /**
   * Get an AI Gateway rate limit counter summary.
   *
   * <p>See {@link #getAiGatewayRateLimitInstancesSummaryWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture&lt;AiGatewayRateLimitInstancesSummaryResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitInstancesSummaryResponse>
      getAiGatewayRateLimitInstancesSummaryAsync(UUID id) {
    return getAiGatewayRateLimitInstancesSummaryWithHttpInfoAsync(
            id, new GetAiGatewayRateLimitInstancesSummaryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI Gateway rate limit counter summary.
   *
   * <p>See {@link #getAiGatewayRateLimitInstancesSummaryWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayRateLimitInstancesSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitInstancesSummaryResponse getAiGatewayRateLimitInstancesSummary(
      UUID id, GetAiGatewayRateLimitInstancesSummaryOptionalParameters parameters)
      throws ApiException {
    return getAiGatewayRateLimitInstancesSummaryWithHttpInfo(id, parameters).getData();
  }

  /**
   * Get an AI Gateway rate limit counter summary.
   *
   * <p>See {@link #getAiGatewayRateLimitInstancesSummaryWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayRateLimitInstancesSummaryResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitInstancesSummaryResponse>
      getAiGatewayRateLimitInstancesSummaryAsync(
          UUID id, GetAiGatewayRateLimitInstancesSummaryOptionalParameters parameters) {
    return getAiGatewayRateLimitInstancesSummaryWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Aggregate a template rate limit's counters, including how many there are, how many are near or
   * at their limit, and the fullest counter's utilization. Use split_dim to aggregate only counters
   * that match every given dimension value.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayRateLimitInstancesSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitInstancesSummaryResponse>
      getAiGatewayRateLimitInstancesSummaryWithHttpInfo(
          UUID id, GetAiGatewayRateLimitInstancesSummaryOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimitInstancesSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling getAiGatewayRateLimitInstancesSummary");
    }
    List<String> splitDim = parameters.splitDim;
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}/instances/summary"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayRateLimitInstancesSummary",
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
        new GenericType<AiGatewayRateLimitInstancesSummaryResponse>() {});
  }

  /**
   * Get an AI Gateway rate limit counter summary.
   *
   * <p>See {@link #getAiGatewayRateLimitInstancesSummaryWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitInstancesSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitInstancesSummaryResponse>>
      getAiGatewayRateLimitInstancesSummaryWithHttpInfoAsync(
          UUID id, GetAiGatewayRateLimitInstancesSummaryOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimitInstancesSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstancesSummaryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstancesSummaryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " getAiGatewayRateLimitInstancesSummary"));
      return result;
    }
    List<String> splitDim = parameters.splitDim;
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}/instances/summary"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayRateLimitInstancesSummary",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstancesSummaryResponse>> result =
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
        new GenericType<AiGatewayRateLimitInstancesSummaryResponse>() {});
  }

  /**
   * Get AI Gateway rate limit usage.
   *
   * <p>See {@link #getAiGatewayRateLimitUsageWithHttpInfo}.
   *
   * @return AiGatewayRateLimitUsageListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitUsageListResponse getAiGatewayRateLimitUsage() throws ApiException {
    return getAiGatewayRateLimitUsageWithHttpInfo().getData();
  }

  /**
   * Get AI Gateway rate limit usage.
   *
   * <p>See {@link #getAiGatewayRateLimitUsageWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayRateLimitUsageListResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitUsageListResponse> getAiGatewayRateLimitUsageAsync() {
    return getAiGatewayRateLimitUsageWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get live usage for the organization's rate limits. Returns requests and tokens counted in the
   * rolling one-minute window and requests limited in the last 15 minutes for each enabled rate
   * limit, plus <code>untracked</code> (traffic no enforced rate limit covers) and <code>total
   * </code> (all gateway traffic).
   *
   * @return ApiResponse&lt;AiGatewayRateLimitUsageListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitUsageListResponse> getAiGatewayRateLimitUsageWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimitUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits/usage";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayRateLimitUsage",
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
        new GenericType<AiGatewayRateLimitUsageListResponse>() {});
  }

  /**
   * Get AI Gateway rate limit usage.
   *
   * <p>See {@link #getAiGatewayRateLimitUsageWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitUsageListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitUsageListResponse>>
      getAiGatewayRateLimitUsageWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRateLimitUsage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitUsageListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits/usage";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayRateLimitUsage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitUsageListResponse>> result =
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
        new GenericType<AiGatewayRateLimitUsageListResponse>() {});
  }

  /**
   * Get an AI Gateway routing rule.
   *
   * <p>See {@link #getAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @return AiGatewayRoutingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRoutingRuleResponse getAiGatewayRoutingRule(String slug) throws ApiException {
    return getAiGatewayRoutingRuleWithHttpInfo(slug).getData();
  }

  /**
   * Get an AI Gateway routing rule.
   *
   * <p>See {@link #getAiGatewayRoutingRuleWithHttpInfoAsync}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @return CompletableFuture&lt;AiGatewayRoutingRuleResponse&gt;
   */
  public CompletableFuture<AiGatewayRoutingRuleResponse> getAiGatewayRoutingRuleAsync(String slug) {
    return getAiGatewayRoutingRuleWithHttpInfoAsync(slug)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a routing rule by its organization-unique slug.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @return ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;
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
  public ApiResponse<AiGatewayRoutingRuleResponse> getAiGatewayRoutingRuleWithHttpInfo(String slug)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      throw new ApiException(
          400, "Missing the required parameter 'slug' when calling getAiGatewayRoutingRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.getAiGatewayRoutingRule",
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /**
   * Get an AI Gateway routing rule.
   *
   * <p>See {@link #getAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>>
      getAiGatewayRoutingRuleWithHttpInfoAsync(String slug) {
    // Check if unstable operation is enabled
    String operationId = "getAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'slug' when calling getAiGatewayRoutingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.getAiGatewayRoutingRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /** Manage optional parameters to listAiGatewayBudgetInstanceDimensions. */
  public static class ListAiGatewayBudgetInstanceDimensionsOptionalParameters {
    private OffsetDateTime window;
    private List<String> splitDim;
    private List<String> dim;
    private String query;
    private List<String> value;
    private Long limit;

    /**
     * Set window.
     *
     * @param window RFC3339 timestamp inside the desired accounting window. Omit to use the current
     *     window. (optional)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters window(OffsetDateTime window) {
      this.window = window;
      return this;
    }

    /**
     * Set splitDim.
     *
     * @param splitDim Keep only instance counters whose split dimension equals a value, written as
     *     <code>&lt;dim&gt;=&lt;value&gt;</code>, such as <code>
     *     split_dim=user_id=&lt;uuid&gt;&amp;split_dim=tag:env=prod</code>. Dimensions use the
     *     <code>split_dims</code> names <code>user_id</code>, <code>team_id</code>, <code>model
     *     </code>, <code>provider</code>, and <code>tag:&lt;key&gt;</code>. Repeat the parameter to
     *     filter on several dimensions; a counter must match all of them. Each dimension may appear
     *     once and must be a per-value dimension of the budget. (optional)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters splitDim(List<String> splitDim) {
      this.splitDim = splitDim;
      return this;
    }

    /**
     * Set dim.
     *
     * @param dim Return only these split dimensions, such as <code>dim=user_id</code>. Repeat the
     *     parameter for several dimensions. Omit it to return every split dimension of the budget.
     *     (optional)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters dim(List<String> dim) {
      this.dim = dim;
      return this;
    }

    /**
     * Set query.
     *
     * @param query Keep only values that contain this text, case-insensitively. It matches raw
     *     values, so User and Team values match their UUIDs; search their names elsewhere and pass
     *     the IDs as <code>value</code>. (optional)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set value.
     *
     * @param value Keep only these values. Repeat the parameter to check several candidates, such
     *     as User IDs found by name, and learn which of them have instance counters. (optional)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters value(List<String> value) {
      this.value = value;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of values to return per dimension. (optional, default to 50)
     * @return ListAiGatewayBudgetInstanceDimensionsOptionalParameters
     */
    public ListAiGatewayBudgetInstanceDimensionsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * List AI Gateway budget instance dimension values.
   *
   * <p>See {@link #listAiGatewayBudgetInstanceDimensionsWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return AiGatewayBudgetInstanceDimensionListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceDimensionListResponse listAiGatewayBudgetInstanceDimensions(UUID id)
      throws ApiException {
    return listAiGatewayBudgetInstanceDimensionsWithHttpInfo(
            id, new ListAiGatewayBudgetInstanceDimensionsOptionalParameters())
        .getData();
  }

  /**
   * List AI Gateway budget instance dimension values.
   *
   * <p>See {@link #listAiGatewayBudgetInstanceDimensionsWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceDimensionListResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceDimensionListResponse>
      listAiGatewayBudgetInstanceDimensionsAsync(UUID id) {
    return listAiGatewayBudgetInstanceDimensionsWithHttpInfoAsync(
            id, new ListAiGatewayBudgetInstanceDimensionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI Gateway budget instance dimension values.
   *
   * <p>See {@link #listAiGatewayBudgetInstanceDimensionsWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayBudgetInstanceDimensionListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceDimensionListResponse listAiGatewayBudgetInstanceDimensions(
      UUID id, ListAiGatewayBudgetInstanceDimensionsOptionalParameters parameters)
      throws ApiException {
    return listAiGatewayBudgetInstanceDimensionsWithHttpInfo(id, parameters).getData();
  }

  /**
   * List AI Gateway budget instance dimension values.
   *
   * <p>See {@link #listAiGatewayBudgetInstanceDimensionsWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceDimensionListResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceDimensionListResponse>
      listAiGatewayBudgetInstanceDimensionsAsync(
          UUID id, ListAiGatewayBudgetInstanceDimensionsOptionalParameters parameters) {
    return listAiGatewayBudgetInstanceDimensionsWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search the values that a template budget's split dimensions take across its instance counters
   * in an accounting window. Each dimension returns its top values by spend, with counter counts.
   * Use query or value to narrow results and limit to cap them. The truncated field reports whether
   * more values matched. Each dimension's values are counted under the other dimensions' split_dim
   * filters, so a dimension's own filter does not hide its alternatives. Legacy fixed-scope budgets
   * return an empty list.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayBudgetInstanceDimensionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetInstanceDimensionListResponse>
      listAiGatewayBudgetInstanceDimensionsWithHttpInfo(
          UUID id, ListAiGatewayBudgetInstanceDimensionsOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgetInstanceDimensions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling listAiGatewayBudgetInstanceDimensions");
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    List<String> dim = parameters.dim;
    String query = parameters.query;
    List<String> value = parameters.value;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/dimensions"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dim", dim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayBudgetInstanceDimensions",
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
        new GenericType<AiGatewayBudgetInstanceDimensionListResponse>() {});
  }

  /**
   * List AI Gateway budget instance dimension values.
   *
   * <p>See {@link #listAiGatewayBudgetInstanceDimensionsWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetInstanceDimensionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetInstanceDimensionListResponse>>
      listAiGatewayBudgetInstanceDimensionsWithHttpInfoAsync(
          UUID id, ListAiGatewayBudgetInstanceDimensionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgetInstanceDimensions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceDimensionListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceDimensionListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " listAiGatewayBudgetInstanceDimensions"));
      return result;
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    List<String> dim = parameters.dim;
    String query = parameters.query;
    List<String> value = parameters.value;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/dimensions"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dim", dim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayBudgetInstanceDimensions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceDimensionListResponse>> result =
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
        new GenericType<AiGatewayBudgetInstanceDimensionListResponse>() {});
  }

  /** Manage optional parameters to listAiGatewayBudgetInstances. */
  public static class ListAiGatewayBudgetInstancesOptionalParameters {
    private OffsetDateTime window;
    private List<String> splitDim;
    private AiGatewayBudgetInstanceSort sort;
    private Long limit;
    private Long offset;

    /**
     * Set window.
     *
     * @param window RFC3339 timestamp inside the desired accounting window. Omit to use the current
     *     window. (optional)
     * @return ListAiGatewayBudgetInstancesOptionalParameters
     */
    public ListAiGatewayBudgetInstancesOptionalParameters window(OffsetDateTime window) {
      this.window = window;
      return this;
    }

    /**
     * Set splitDim.
     *
     * @param splitDim Keep only instance counters whose split dimension equals a value, written as
     *     <code>&lt;dim&gt;=&lt;value&gt;</code>, such as <code>
     *     split_dim=user_id=&lt;uuid&gt;&amp;split_dim=tag:env=prod</code>. Dimensions use the
     *     <code>split_dims</code> names <code>user_id</code>, <code>team_id</code>, <code>model
     *     </code>, <code>provider</code>, and <code>tag:&lt;key&gt;</code>. Repeat the parameter to
     *     filter on several dimensions; a counter must match all of them. Each dimension may appear
     *     once and must be a per-value dimension of the budget. (optional)
     * @return ListAiGatewayBudgetInstancesOptionalParameters
     */
    public ListAiGatewayBudgetInstancesOptionalParameters splitDim(List<String> splitDim) {
      this.splitDim = splitDim;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort order for budget instance counters. (optional, default to "spend_desc")
     * @return ListAiGatewayBudgetInstancesOptionalParameters
     */
    public ListAiGatewayBudgetInstancesOptionalParameters sort(AiGatewayBudgetInstanceSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of budget instance counters to return. (optional, default to 50)
     * @return ListAiGatewayBudgetInstancesOptionalParameters
     */
    public ListAiGatewayBudgetInstancesOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Number of budget instance counters to skip. (optional, default to 0)
     * @return ListAiGatewayBudgetInstancesOptionalParameters
     */
    public ListAiGatewayBudgetInstancesOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * List AI Gateway budget instances.
   *
   * <p>See {@link #listAiGatewayBudgetInstancesWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @return AiGatewayBudgetInstanceListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceListResponse listAiGatewayBudgetInstances(UUID id)
      throws ApiException {
    return listAiGatewayBudgetInstancesWithHttpInfo(
            id, new ListAiGatewayBudgetInstancesOptionalParameters())
        .getData();
  }

  /**
   * List AI Gateway budget instances.
   *
   * <p>See {@link #listAiGatewayBudgetInstancesWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceListResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceListResponse> listAiGatewayBudgetInstancesAsync(
      UUID id) {
    return listAiGatewayBudgetInstancesWithHttpInfoAsync(
            id, new ListAiGatewayBudgetInstancesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI Gateway budget instances.
   *
   * <p>See {@link #listAiGatewayBudgetInstancesWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayBudgetInstanceListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceListResponse listAiGatewayBudgetInstances(
      UUID id, ListAiGatewayBudgetInstancesOptionalParameters parameters) throws ApiException {
    return listAiGatewayBudgetInstancesWithHttpInfo(id, parameters).getData();
  }

  /**
   * List AI Gateway budget instances.
   *
   * <p>See {@link #listAiGatewayBudgetInstancesWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceListResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceListResponse> listAiGatewayBudgetInstancesAsync(
      UUID id, ListAiGatewayBudgetInstancesOptionalParameters parameters) {
    return listAiGatewayBudgetInstancesWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List instance counters for an accounting window. Legacy fixed-scope budgets return one pooled
   * row with an empty instance_key. Omit window to use the current window. Use split_dim to keep
   * only counters that match every given dimension value.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayBudgetInstanceListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetInstanceListResponse> listAiGatewayBudgetInstancesWithHttpInfo(
      UUID id, ListAiGatewayBudgetInstancesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgetInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling listAiGatewayBudgetInstances");
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    AiGatewayBudgetInstanceSort sort = parameters.sort;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayBudgetInstances",
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
        new GenericType<AiGatewayBudgetInstanceListResponse>() {});
  }

  /**
   * List AI Gateway budget instances.
   *
   * <p>See {@link #listAiGatewayBudgetInstancesWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetInstanceListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetInstanceListResponse>>
      listAiGatewayBudgetInstancesWithHttpInfoAsync(
          UUID id, ListAiGatewayBudgetInstancesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgetInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling listAiGatewayBudgetInstances"));
      return result;
    }
    OffsetDateTime window = parameters.window;
    List<String> splitDim = parameters.splitDim;
    AiGatewayBudgetInstanceSort sort = parameters.sort;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "window", window));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayBudgetInstances",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceListResponse>> result =
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
        new GenericType<AiGatewayBudgetInstanceListResponse>() {});
  }

  /**
   * List AI Gateway budgets.
   *
   * <p>See {@link #listAiGatewayBudgetsWithHttpInfo}.
   *
   * @return AiGatewayBudgetListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetListResponse listAiGatewayBudgets() throws ApiException {
    return listAiGatewayBudgetsWithHttpInfo().getData();
  }

  /**
   * List AI Gateway budgets.
   *
   * <p>See {@link #listAiGatewayBudgetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayBudgetListResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetListResponse> listAiGatewayBudgetsAsync() {
    return listAiGatewayBudgetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List spend budgets for the organization, including active-window spend and effective capacity.
   *
   * @return ApiResponse&lt;AiGatewayBudgetListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetListResponse> listAiGatewayBudgetsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayBudgets",
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
        new GenericType<AiGatewayBudgetListResponse>() {});
  }

  /**
   * List AI Gateway budgets.
   *
   * <p>See {@link #listAiGatewayBudgetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetListResponse>>
      listAiGatewayBudgetsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayBudgets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayBudgets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetListResponse>> result =
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
        new GenericType<AiGatewayBudgetListResponse>() {});
  }

  /**
   * List AI Gateway model groups.
   *
   * <p>See {@link #listAiGatewayModelGroupsWithHttpInfo}.
   *
   * @return AiGatewayModelGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelGroupListResponse listAiGatewayModelGroups() throws ApiException {
    return listAiGatewayModelGroupsWithHttpInfo().getData();
  }

  /**
   * List AI Gateway model groups.
   *
   * <p>See {@link #listAiGatewayModelGroupsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayModelGroupListResponse&gt;
   */
  public CompletableFuture<AiGatewayModelGroupListResponse> listAiGatewayModelGroupsAsync() {
    return listAiGatewayModelGroupsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List model groups the user can view. The organization-wide policy has id "default" and explicit
   * model, provider, and route selections. Missing or empty selections grant no organization-wide
   * access. Its audience is fixed to the organization; it cannot be renamed or deleted. Named
   * policies retain their access bindings. Requires configuration read permission; named policies
   * also require view access.
   *
   * @return ApiResponse&lt;AiGatewayModelGroupListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelGroupListResponse> listAiGatewayModelGroupsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModelGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/model-groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayModelGroups",
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
        new GenericType<AiGatewayModelGroupListResponse>() {});
  }

  /**
   * List AI Gateway model groups.
   *
   * <p>See {@link #listAiGatewayModelGroupsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelGroupListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelGroupListResponse>>
      listAiGatewayModelGroupsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModelGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelGroupListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/model-groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayModelGroups",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupListResponse>> result =
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
        new GenericType<AiGatewayModelGroupListResponse>() {});
  }

  /**
   * List models for an AI Gateway provider.
   *
   * <p>See {@link #listAiGatewayModelsWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @return AiGatewayModelCatalogEntryListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelCatalogEntryListResponse listAiGatewayModels(Long providerId)
      throws ApiException {
    return listAiGatewayModelsWithHttpInfo(providerId).getData();
  }

  /**
   * List models for an AI Gateway provider.
   *
   * <p>See {@link #listAiGatewayModelsWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @return CompletableFuture&lt;AiGatewayModelCatalogEntryListResponse&gt;
   */
  public CompletableFuture<AiGatewayModelCatalogEntryListResponse> listAiGatewayModelsAsync(
      Long providerId) {
    return listAiGatewayModelsWithHttpInfoAsync(providerId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all model catalog entries for a provider. Requires <code>ai_gateway_config_read</code> and
   * provider View. Catalog and pricing metadata inherit provider access. Lists omit hidden entries;
   * direct reads of hidden resources return 404.
   *
   * @param providerId Provider ID. (required)
   * @return ApiResponse&lt;AiGatewayModelCatalogEntryListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelCatalogEntryListResponse> listAiGatewayModelsWithHttpInfo(
      Long providerId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'providerId' when calling listAiGatewayModels");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayModels",
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
        new GenericType<AiGatewayModelCatalogEntryListResponse>() {});
  }

  /**
   * List models for an AI Gateway provider.
   *
   * <p>See {@link #listAiGatewayModelsWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelCatalogEntryListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>>
      listAiGatewayModelsWithHttpInfoAsync(Long providerId) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'providerId' when calling listAiGatewayModels"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayModels",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryListResponse>> result =
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
        new GenericType<AiGatewayModelCatalogEntryListResponse>() {});
  }

  /**
   * List AI Gateway models by canonical ID.
   *
   * <p>See {@link #listAiGatewayModelsByCanonicalWithHttpInfo}.
   *
   * @return AiGatewayModelsByCanonicalListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelsByCanonicalListResponse listAiGatewayModelsByCanonical()
      throws ApiException {
    return listAiGatewayModelsByCanonicalWithHttpInfo().getData();
  }

  /**
   * List AI Gateway models by canonical ID.
   *
   * <p>See {@link #listAiGatewayModelsByCanonicalWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayModelsByCanonicalListResponse&gt;
   */
  public CompletableFuture<AiGatewayModelsByCanonicalListResponse>
      listAiGatewayModelsByCanonicalAsync() {
    return listAiGatewayModelsByCanonicalWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all model catalog entries grouped by canonical model ID. Requires <code>
   * ai_gateway_config_read</code> and provider View. Catalog and pricing metadata inherit provider
   * access. Lists omit hidden entries; direct reads of hidden resources return 404.
   *
   * @return ApiResponse&lt;AiGatewayModelsByCanonicalListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelsByCanonicalListResponse>
      listAiGatewayModelsByCanonicalWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModelsByCanonical";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayModelsByCanonical",
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
        new GenericType<AiGatewayModelsByCanonicalListResponse>() {});
  }

  /**
   * List AI Gateway models by canonical ID.
   *
   * <p>See {@link #listAiGatewayModelsByCanonicalWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelsByCanonicalListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelsByCanonicalListResponse>>
      listAiGatewayModelsByCanonicalWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayModelsByCanonical";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelsByCanonicalListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayModelsByCanonical",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelsByCanonicalListResponse>> result =
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
        new GenericType<AiGatewayModelsByCanonicalListResponse>() {});
  }

  /** Manage optional parameters to listAiGatewayPolicies. */
  public static class ListAiGatewayPoliciesOptionalParameters {
    private UUID userId;

    /**
     * Set userId.
     *
     * @param userId Filter or scope policies to a specific user. Omit for organization-wide
     *     policies. (optional)
     * @return ListAiGatewayPoliciesOptionalParameters
     */
    public ListAiGatewayPoliciesOptionalParameters userId(UUID userId) {
      this.userId = userId;
      return this;
    }
  }

  /**
   * List AI Gateway routing policies.
   *
   * <p>See {@link #listAiGatewayPoliciesWithHttpInfo}.
   *
   * @return AiGatewayPolicyListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyListResponse listAiGatewayPolicies() throws ApiException {
    return listAiGatewayPoliciesWithHttpInfo(new ListAiGatewayPoliciesOptionalParameters())
        .getData();
  }

  /**
   * List AI Gateway routing policies.
   *
   * <p>See {@link #listAiGatewayPoliciesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayPolicyListResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyListResponse> listAiGatewayPoliciesAsync() {
    return listAiGatewayPoliciesWithHttpInfoAsync(new ListAiGatewayPoliciesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI Gateway routing policies.
   *
   * <p>See {@link #listAiGatewayPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AiGatewayPolicyListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyListResponse listAiGatewayPolicies(
      ListAiGatewayPoliciesOptionalParameters parameters) throws ApiException {
    return listAiGatewayPoliciesWithHttpInfo(parameters).getData();
  }

  /**
   * List AI Gateway routing policies.
   *
   * <p>See {@link #listAiGatewayPoliciesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayPolicyListResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyListResponse> listAiGatewayPoliciesAsync(
      ListAiGatewayPoliciesOptionalParameters parameters) {
    return listAiGatewayPoliciesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all routing policy documents for the organization. Pass user_id to filter by user scope.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayPolicyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayPolicyListResponse> listAiGatewayPoliciesWithHttpInfo(
      ListAiGatewayPoliciesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath = "/api/v2/policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayPolicies",
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
        new GenericType<AiGatewayPolicyListResponse>() {});
  }

  /**
   * List AI Gateway routing policies.
   *
   * <p>See {@link #listAiGatewayPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayPolicyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayPolicyListResponse>>
      listAiGatewayPoliciesWithHttpInfoAsync(ListAiGatewayPoliciesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayPolicyListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath = "/api/v2/policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayPolicies",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayPolicyListResponse>> result =
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
        new GenericType<AiGatewayPolicyListResponse>() {});
  }

  /** Manage optional parameters to listAiGatewayProviderModels. */
  public static class ListAiGatewayProviderModelsOptionalParameters {
    private String projectId;
    private String location;
    private String bedrockRegion;
    private String foundryResourceId;

    /**
     * Set projectId.
     *
     * @param projectId GCP project ID used for Gemini model discovery. Required for Gemini
     *     integrations. (optional)
     * @return ListAiGatewayProviderModelsOptionalParameters
     */
    public ListAiGatewayProviderModelsOptionalParameters projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set location.
     *
     * @param location Optional GCP location used for Gemini model discovery. Defaults to global.
     *     (optional)
     * @return ListAiGatewayProviderModelsOptionalParameters
     */
    public ListAiGatewayProviderModelsOptionalParameters location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set bedrockRegion.
     *
     * @param bedrockRegion AWS region used for Bedrock model discovery. Required for Amazon Bedrock
     *     integrations. (optional)
     * @return ListAiGatewayProviderModelsOptionalParameters
     */
    public ListAiGatewayProviderModelsOptionalParameters bedrockRegion(String bedrockRegion) {
      this.bedrockRegion = bedrockRegion;
      return this;
    }

    /**
     * Set foundryResourceId.
     *
     * @param foundryResourceId ARM resource ID of the Azure AI Foundry resource used for model
     *     discovery. Required for Azure AI Foundry integrations. (optional)
     * @return ListAiGatewayProviderModelsOptionalParameters
     */
    public ListAiGatewayProviderModelsOptionalParameters foundryResourceId(
        String foundryResourceId) {
      this.foundryResourceId = foundryResourceId;
      return this;
    }
  }

  /**
   * List models available from a provider integration.
   *
   * <p>See {@link #listAiGatewayProviderModelsWithHttpInfo}.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @return AiGatewayDiscoveredModelListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayDiscoveredModelListResponse listAiGatewayProviderModels(
      String integrationType, String integrationAccountId) throws ApiException {
    return listAiGatewayProviderModelsWithHttpInfo(
            integrationType,
            integrationAccountId,
            new ListAiGatewayProviderModelsOptionalParameters())
        .getData();
  }

  /**
   * List models available from a provider integration.
   *
   * <p>See {@link #listAiGatewayProviderModelsWithHttpInfoAsync}.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @return CompletableFuture&lt;AiGatewayDiscoveredModelListResponse&gt;
   */
  public CompletableFuture<AiGatewayDiscoveredModelListResponse> listAiGatewayProviderModelsAsync(
      String integrationType, String integrationAccountId) {
    return listAiGatewayProviderModelsWithHttpInfoAsync(
            integrationType,
            integrationAccountId,
            new ListAiGatewayProviderModelsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List models available from a provider integration.
   *
   * <p>See {@link #listAiGatewayProviderModelsWithHttpInfo}.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayDiscoveredModelListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayDiscoveredModelListResponse listAiGatewayProviderModels(
      String integrationType,
      String integrationAccountId,
      ListAiGatewayProviderModelsOptionalParameters parameters)
      throws ApiException {
    return listAiGatewayProviderModelsWithHttpInfo(
            integrationType, integrationAccountId, parameters)
        .getData();
  }

  /**
   * List models available from a provider integration.
   *
   * <p>See {@link #listAiGatewayProviderModelsWithHttpInfoAsync}.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayDiscoveredModelListResponse&gt;
   */
  public CompletableFuture<AiGatewayDiscoveredModelListResponse> listAiGatewayProviderModelsAsync(
      String integrationType,
      String integrationAccountId,
      ListAiGatewayProviderModelsOptionalParameters parameters) {
    return listAiGatewayProviderModelsWithHttpInfoAsync(
            integrationType, integrationAccountId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List live models available to a provider integration account that supports model discovery.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayDiscoveredModelListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayDiscoveredModelListResponse> listAiGatewayProviderModelsWithHttpInfo(
      String integrationType,
      String integrationAccountId,
      ListAiGatewayProviderModelsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayProviderModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationType' is set
    if (integrationType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationType' when calling"
              + " listAiGatewayProviderModels");
    }

    // verify the required parameter 'integrationAccountId' is set
    if (integrationAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationAccountId' when calling"
              + " listAiGatewayProviderModels");
    }
    String projectId = parameters.projectId;
    String location = parameters.location;
    String bedrockRegion = parameters.bedrockRegion;
    String foundryResourceId = parameters.foundryResourceId;
    // create path and map variables
    String localVarPath = "/api/v2/provider-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "integration_type", integrationType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "integration_account_id", integrationAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bedrock_region", bedrockRegion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "foundry_resource_id", foundryResourceId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayProviderModels",
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
        new GenericType<AiGatewayDiscoveredModelListResponse>() {});
  }

  /**
   * List models available from a provider integration.
   *
   * <p>See {@link #listAiGatewayProviderModelsWithHttpInfo}.
   *
   * @param integrationType Provider integration type. (required)
   * @param integrationAccountId Provider integration account ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayDiscoveredModelListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayDiscoveredModelListResponse>>
      listAiGatewayProviderModelsWithHttpInfoAsync(
          String integrationType,
          String integrationAccountId,
          ListAiGatewayProviderModelsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayProviderModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayDiscoveredModelListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationType' is set
    if (integrationType == null) {
      CompletableFuture<ApiResponse<AiGatewayDiscoveredModelListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationType' when calling"
                  + " listAiGatewayProviderModels"));
      return result;
    }

    // verify the required parameter 'integrationAccountId' is set
    if (integrationAccountId == null) {
      CompletableFuture<ApiResponse<AiGatewayDiscoveredModelListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationAccountId' when calling"
                  + " listAiGatewayProviderModels"));
      return result;
    }
    String projectId = parameters.projectId;
    String location = parameters.location;
    String bedrockRegion = parameters.bedrockRegion;
    String foundryResourceId = parameters.foundryResourceId;
    // create path and map variables
    String localVarPath = "/api/v2/provider-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "integration_type", integrationType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "integration_account_id", integrationAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bedrock_region", bedrockRegion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "foundry_resource_id", foundryResourceId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayProviderModels",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayDiscoveredModelListResponse>> result =
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
        new GenericType<AiGatewayDiscoveredModelListResponse>() {});
  }

  /**
   * List AI Gateway providers.
   *
   * <p>See {@link #listAiGatewayProvidersWithHttpInfo}.
   *
   * @return AiGatewayProviderListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayProviderListResponse listAiGatewayProviders() throws ApiException {
    return listAiGatewayProvidersWithHttpInfo().getData();
  }

  /**
   * List AI Gateway providers.
   *
   * <p>See {@link #listAiGatewayProvidersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayProviderListResponse&gt;
   */
  public CompletableFuture<AiGatewayProviderListResponse> listAiGatewayProvidersAsync() {
    return listAiGatewayProvidersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the model providers connected to the organization. Credentials stay in each provider's
   * integration account and are never returned. Requires <code>ai_gateway_config_read</code> and
   * provider View. Catalog and pricing metadata inherit provider access. Lists omit hidden entries;
   * direct reads of hidden resources return 404.
   *
   * @return ApiResponse&lt;AiGatewayProviderListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayProviderListResponse> listAiGatewayProvidersWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayProviders";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayProviders",
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
        new GenericType<AiGatewayProviderListResponse>() {});
  }

  /**
   * List AI Gateway providers.
   *
   * <p>See {@link #listAiGatewayProvidersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayProviderListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayProviderListResponse>>
      listAiGatewayProvidersWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayProviders";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayProviderListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayProviders",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayProviderListResponse>> result =
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
        new GenericType<AiGatewayProviderListResponse>() {});
  }

  /** Manage optional parameters to listAiGatewayRateLimitInstances. */
  public static class ListAiGatewayRateLimitInstancesOptionalParameters {
    private List<String> splitDim;
    private AiGatewayRateLimitInstanceSort sort;
    private Long limit;
    private Long offset;

    /**
     * Set splitDim.
     *
     * @param splitDim Keep only counters whose split dimension equals a value, written as <code>
     *     &lt;dim&gt;=&lt;value&gt;</code>, such as <code>
     *     split_dim=user_id=&lt;uuid&gt;&amp;split_dim=model=gpt-4o</code>. Dimensions use the
     *     <code>split_dims</code> names <code>user_id</code>, <code>team_id</code>, <code>model
     *     </code>, <code>provider</code>, and <code>tag:&lt;key&gt;</code>. Repeat the parameter to
     *     filter on several dimensions; a counter must match all of them. Each dimension may appear
     *     once and must be a per-value dimension of the rate limit. (optional)
     * @return ListAiGatewayRateLimitInstancesOptionalParameters
     */
    public ListAiGatewayRateLimitInstancesOptionalParameters splitDim(List<String> splitDim) {
      this.splitDim = splitDim;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort order for rate limit counters. (optional, default to "utilization_desc")
     * @return ListAiGatewayRateLimitInstancesOptionalParameters
     */
    public ListAiGatewayRateLimitInstancesOptionalParameters sort(
        AiGatewayRateLimitInstanceSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of rate limit counters to return. (optional, default to 50)
     * @return ListAiGatewayRateLimitInstancesOptionalParameters
     */
    public ListAiGatewayRateLimitInstancesOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Number of rate limit counters to skip. (optional, default to 0)
     * @return ListAiGatewayRateLimitInstancesOptionalParameters
     */
    public ListAiGatewayRateLimitInstancesOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * List AI Gateway rate limit counters.
   *
   * <p>See {@link #listAiGatewayRateLimitInstancesWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @return AiGatewayRateLimitInstanceListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitInstanceListResponse listAiGatewayRateLimitInstances(UUID id)
      throws ApiException {
    return listAiGatewayRateLimitInstancesWithHttpInfo(
            id, new ListAiGatewayRateLimitInstancesOptionalParameters())
        .getData();
  }

  /**
   * List AI Gateway rate limit counters.
   *
   * <p>See {@link #listAiGatewayRateLimitInstancesWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @return CompletableFuture&lt;AiGatewayRateLimitInstanceListResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitInstanceListResponse>
      listAiGatewayRateLimitInstancesAsync(UUID id) {
    return listAiGatewayRateLimitInstancesWithHttpInfoAsync(
            id, new ListAiGatewayRateLimitInstancesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List AI Gateway rate limit counters.
   *
   * <p>See {@link #listAiGatewayRateLimitInstancesWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayRateLimitInstanceListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitInstanceListResponse listAiGatewayRateLimitInstances(
      UUID id, ListAiGatewayRateLimitInstancesOptionalParameters parameters) throws ApiException {
    return listAiGatewayRateLimitInstancesWithHttpInfo(id, parameters).getData();
  }

  /**
   * List AI Gateway rate limit counters.
   *
   * <p>See {@link #listAiGatewayRateLimitInstancesWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayRateLimitInstanceListResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitInstanceListResponse>
      listAiGatewayRateLimitInstancesAsync(
          UUID id, ListAiGatewayRateLimitInstancesOptionalParameters parameters) {
    return listAiGatewayRateLimitInstancesWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the counters of a template rate limit, one per matched user, Team, or value, with their
   * live usage. Counters appear within a few minutes of their first request and are dropped after
   * 30 days without one. Usage is read for counters seen in the last 20 minutes, at most 200 per
   * request; past that, rows carry usage_known false. A rate limit with one shared allowance
   * returns an empty list.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayRateLimitInstanceListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitInstanceListResponse>
      listAiGatewayRateLimitInstancesWithHttpInfo(
          UUID id, ListAiGatewayRateLimitInstancesOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRateLimitInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling listAiGatewayRateLimitInstances");
    }
    List<String> splitDim = parameters.splitDim;
    AiGatewayRateLimitInstanceSort sort = parameters.sort;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}/instances"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayRateLimitInstances",
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
        new GenericType<AiGatewayRateLimitInstanceListResponse>() {});
  }

  /**
   * List AI Gateway rate limit counters.
   *
   * <p>See {@link #listAiGatewayRateLimitInstancesWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitInstanceListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitInstanceListResponse>>
      listAiGatewayRateLimitInstancesWithHttpInfoAsync(
          UUID id, ListAiGatewayRateLimitInstancesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRateLimitInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstanceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstanceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling listAiGatewayRateLimitInstances"));
      return result;
    }
    List<String> splitDim = parameters.splitDim;
    AiGatewayRateLimitInstanceSort sort = parameters.sort;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}/instances"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "split_dim", splitDim));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayRateLimitInstances",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitInstanceListResponse>> result =
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
        new GenericType<AiGatewayRateLimitInstanceListResponse>() {});
  }

  /**
   * List AI Gateway rate limits.
   *
   * <p>See {@link #listAiGatewayRateLimitsWithHttpInfo}.
   *
   * @return AiGatewayRateLimitListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitListResponse listAiGatewayRateLimits() throws ApiException {
    return listAiGatewayRateLimitsWithHttpInfo().getData();
  }

  /**
   * List AI Gateway rate limits.
   *
   * <p>See {@link #listAiGatewayRateLimitsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayRateLimitListResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitListResponse> listAiGatewayRateLimitsAsync() {
    return listAiGatewayRateLimitsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the organization's AI Gateway rate limits.
   *
   * @return ApiResponse&lt;AiGatewayRateLimitListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitListResponse> listAiGatewayRateLimitsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRateLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayRateLimits",
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
        new GenericType<AiGatewayRateLimitListResponse>() {});
  }

  /**
   * List AI Gateway rate limits.
   *
   * <p>See {@link #listAiGatewayRateLimitsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitListResponse>>
      listAiGatewayRateLimitsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRateLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rate-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayRateLimits",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitListResponse>> result =
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
        new GenericType<AiGatewayRateLimitListResponse>() {});
  }

  /**
   * List AI Gateway routing rules.
   *
   * <p>See {@link #listAiGatewayRoutingRulesWithHttpInfo}.
   *
   * @return AiGatewayRoutingRuleListResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRoutingRuleListResponse listAiGatewayRoutingRules() throws ApiException {
    return listAiGatewayRoutingRulesWithHttpInfo().getData();
  }

  /**
   * List AI Gateway routing rules.
   *
   * <p>See {@link #listAiGatewayRoutingRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AiGatewayRoutingRuleListResponse&gt;
   */
  public CompletableFuture<AiGatewayRoutingRuleListResponse> listAiGatewayRoutingRulesAsync() {
    return listAiGatewayRoutingRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all routing rules for the organization.
   *
   * @return ApiResponse&lt;AiGatewayRoutingRuleListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRoutingRuleListResponse> listAiGatewayRoutingRulesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRoutingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.listAiGatewayRoutingRules",
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
        new GenericType<AiGatewayRoutingRuleListResponse>() {});
  }

  /**
   * List AI Gateway routing rules.
   *
   * <p>See {@link #listAiGatewayRoutingRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRoutingRuleListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRoutingRuleListResponse>>
      listAiGatewayRoutingRulesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAiGatewayRoutingRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.listAiGatewayRoutingRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleListResponse>> result =
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
        new GenericType<AiGatewayRoutingRuleListResponse>() {});
  }

  /**
   * Override a budget instance&#39;s capacity.
   *
   * <p>See {@link #overrideAiGatewayBudgetInstanceCapacityWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return AiGatewayBudgetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceResponse overrideAiGatewayBudgetInstanceCapacity(
      UUID id, AiGatewayBudgetInstanceCapacityOverrideRequest body) throws ApiException {
    return overrideAiGatewayBudgetInstanceCapacityWithHttpInfo(id, body).getData();
  }

  /**
   * Override a budget instance&#39;s capacity.
   *
   * <p>See {@link #overrideAiGatewayBudgetInstanceCapacityWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceResponse>
      overrideAiGatewayBudgetInstanceCapacityAsync(
          UUID id, AiGatewayBudgetInstanceCapacityOverrideRequest body) {
    return overrideAiGatewayBudgetInstanceCapacityWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Override active-period capacity for one instance of a template budget, identified by its
   * instance_key. Other instances and the budget's default capacity are unchanged. The override is
   * retained in the budget adjustment audit history. Returns 404 when the instance has no counter
   * in the active period. Not supported for legacy fixed-scope budgets.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayBudgetInstanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetInstanceResponse>
      overrideAiGatewayBudgetInstanceCapacityWithHttpInfo(
          UUID id, AiGatewayBudgetInstanceCapacityOverrideRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "overrideAiGatewayBudgetInstanceCapacity";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling"
              + " overrideAiGatewayBudgetInstanceCapacity");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " overrideAiGatewayBudgetInstanceCapacity");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/capacity"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.overrideAiGatewayBudgetInstanceCapacity",
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
        new GenericType<AiGatewayBudgetInstanceResponse>() {});
  }

  /**
   * Override a budget instance&#39;s capacity.
   *
   * <p>See {@link #overrideAiGatewayBudgetInstanceCapacityWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetInstanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>>
      overrideAiGatewayBudgetInstanceCapacityWithHttpInfoAsync(
          UUID id, AiGatewayBudgetInstanceCapacityOverrideRequest body) {
    // Check if unstable operation is enabled
    String operationId = "overrideAiGatewayBudgetInstanceCapacity";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " overrideAiGatewayBudgetInstanceCapacity"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " overrideAiGatewayBudgetInstanceCapacity"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/capacity"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.overrideAiGatewayBudgetInstanceCapacity",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
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
        new GenericType<AiGatewayBudgetInstanceResponse>() {});
  }

  /**
   * Reset a budget instance&#39;s spend.
   *
   * <p>See {@link #resetAiGatewayBudgetInstanceSpendWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return AiGatewayBudgetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetInstanceResponse resetAiGatewayBudgetInstanceSpend(
      UUID id, AiGatewayBudgetInstanceResetRequest body) throws ApiException {
    return resetAiGatewayBudgetInstanceSpendWithHttpInfo(id, body).getData();
  }

  /**
   * Reset a budget instance&#39;s spend.
   *
   * <p>See {@link #resetAiGatewayBudgetInstanceSpendWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayBudgetInstanceResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetInstanceResponse> resetAiGatewayBudgetInstanceSpendAsync(
      UUID id, AiGatewayBudgetInstanceResetRequest body) {
    return resetAiGatewayBudgetInstanceSpendWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Reset active-period spend for one instance of a template budget, identified by its
   * instance_key. The reset is retained in the budget adjustment audit history. Returns 404 when
   * the instance has no counter in the active period. Not supported for legacy fixed-scope budgets.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayBudgetInstanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetInstanceResponse> resetAiGatewayBudgetInstanceSpendWithHttpInfo(
      UUID id, AiGatewayBudgetInstanceResetRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "resetAiGatewayBudgetInstanceSpend";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling resetAiGatewayBudgetInstanceSpend");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling resetAiGatewayBudgetInstanceSpend");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/reset"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.resetAiGatewayBudgetInstanceSpend",
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
        new GenericType<AiGatewayBudgetInstanceResponse>() {});
  }

  /**
   * Reset a budget instance&#39;s spend.
   *
   * <p>See {@link #resetAiGatewayBudgetInstanceSpendWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetInstanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>>
      resetAiGatewayBudgetInstanceSpendWithHttpInfoAsync(
          UUID id, AiGatewayBudgetInstanceResetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "resetAiGatewayBudgetInstanceSpend";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " resetAiGatewayBudgetInstanceSpend"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " resetAiGatewayBudgetInstanceSpend"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}/instances/reset"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.resetAiGatewayBudgetInstanceSpend",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetInstanceResponse>> result =
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
        new GenericType<AiGatewayBudgetInstanceResponse>() {});
  }

  /**
   * Update an AI Gateway budget.
   *
   * <p>See {@link #updateAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return AiGatewayBudgetResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayBudgetResponse updateAiGatewayBudget(UUID id, AiGatewayBudgetUpdateRequest body)
      throws ApiException {
    return updateAiGatewayBudgetWithHttpInfo(id, body).getData();
  }

  /**
   * Update an AI Gateway budget.
   *
   * <p>See {@link #updateAiGatewayBudgetWithHttpInfoAsync}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayBudgetResponse&gt;
   */
  public CompletableFuture<AiGatewayBudgetResponse> updateAiGatewayBudgetAsync(
      UUID id, AiGatewayBudgetUpdateRequest body) {
    return updateAiGatewayBudgetWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a budget's mutable definition. Capacity changes apply to future accounting periods
   * unless <code>apply_to_current_period</code> is true.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayBudgetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayBudgetResponse> updateAiGatewayBudgetWithHttpInfo(
      UUID id, AiGatewayBudgetUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateAiGatewayBudget");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayBudget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayBudget",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Update an AI Gateway budget.
   *
   * <p>See {@link #updateAiGatewayBudgetWithHttpInfo}.
   *
   * @param id Budget UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayBudgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayBudgetResponse>>
      updateAiGatewayBudgetWithHttpInfoAsync(UUID id, AiGatewayBudgetUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayBudget";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateAiGatewayBudget"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/budgets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayBudgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayBudgetResponse>() {});
  }

  /**
   * Replace an AI Gateway data capture override.
   *
   * <p>See {@link #updateAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return AiGatewayCaptureOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayCaptureOverrideResponse updateAiGatewayDataCaptureOverride(
      UUID id, AiGatewayCaptureUpdateRequest body) throws ApiException {
    return updateAiGatewayDataCaptureOverrideWithHttpInfo(id, body).getData();
  }

  /**
   * Replace an AI Gateway data capture override.
   *
   * <p>See {@link #updateAiGatewayDataCaptureOverrideWithHttpInfoAsync}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayCaptureOverrideResponse&gt;
   */
  public CompletableFuture<AiGatewayCaptureOverrideResponse>
      updateAiGatewayDataCaptureOverrideAsync(UUID id, AiGatewayCaptureUpdateRequest body) {
    return updateAiGatewayDataCaptureOverrideWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace an override using its <code>revision</code> and the current <code>
   * configuration_revision</code>. Changes to capture overrides don't affect routing rules. Returns
   * HTTP 409 when <code>configuration_revision</code> or the override <code>revision</code> is
   * stale, including a concurrent change during replacement. Missing revisions or required
   * full-capture confirmation returns HTTP 400.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayCaptureOverrideResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayCaptureOverrideResponse>
      updateAiGatewayDataCaptureOverrideWithHttpInfo(UUID id, AiGatewayCaptureUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayDataCaptureOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling updateAiGatewayDataCaptureOverride");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateAiGatewayDataCaptureOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-capture/overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayDataCaptureOverride",
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
        new GenericType<AiGatewayCaptureOverrideResponse>() {});
  }

  /**
   * Replace an AI Gateway data capture override.
   *
   * <p>See {@link #updateAiGatewayDataCaptureOverrideWithHttpInfo}.
   *
   * @param id Data capture override ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayCaptureOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>>
      updateAiGatewayDataCaptureOverrideWithHttpInfoAsync(
          UUID id, AiGatewayCaptureUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayDataCaptureOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " updateAiGatewayDataCaptureOverride"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateAiGatewayDataCaptureOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/data-capture/overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayDataCaptureOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayCaptureOverrideResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AiGatewayCaptureOverrideResponse>() {});
  }

  /**
   * Replace AI Gateway governance controls.
   *
   * <p>See {@link #updateAiGatewayGovernanceWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayGovernanceResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayGovernanceResponse updateAiGatewayGovernance(
      AiGatewayGovernanceReplaceRequest body) throws ApiException {
    return updateAiGatewayGovernanceWithHttpInfo(body).getData();
  }

  /**
   * Replace AI Gateway governance controls.
   *
   * <p>See {@link #updateAiGatewayGovernanceWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayGovernanceResponse&gt;
   */
  public CompletableFuture<AiGatewayGovernanceResponse> updateAiGatewayGovernanceAsync(
      AiGatewayGovernanceReplaceRequest body) {
    return updateAiGatewayGovernanceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace the organization-wide AI Gateway governance settings, which are the default data
   * capture mode and whether requests must reach providers covered by a zero data retention
   * agreement.
   *
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayGovernanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayGovernanceResponse> updateAiGatewayGovernanceWithHttpInfo(
      AiGatewayGovernanceReplaceRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayGovernance";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayGovernance");
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayGovernance",
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
        new GenericType<AiGatewayGovernanceResponse>() {});
  }

  /**
   * Replace AI Gateway governance controls.
   *
   * <p>See {@link #updateAiGatewayGovernanceWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayGovernanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>>
      updateAiGatewayGovernanceWithHttpInfoAsync(AiGatewayGovernanceReplaceRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayGovernance";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayGovernance"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayGovernance",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayGovernanceResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AiGatewayGovernanceResponse>() {});
  }

  /**
   * Update a model for an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return AiGatewayModelCatalogEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelCatalogEntryResponse updateAiGatewayModel(
      Long providerId, String canonical, AiGatewayModelUpdateRequest body) throws ApiException {
    return updateAiGatewayModelWithHttpInfo(providerId, canonical, body).getData();
  }

  /**
   * Update a model for an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayModelWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelCatalogEntryResponse&gt;
   */
  public CompletableFuture<AiGatewayModelCatalogEntryResponse> updateAiGatewayModelAsync(
      Long providerId, String canonical, AiGatewayModelUpdateRequest body) {
    return updateAiGatewayModelWithHttpInfoAsync(providerId, canonical, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a manually managed model catalog entry. Discovered entries are read-only. Requires
   * <code>ai_gateway_config_write</code> and provider Edit. Models and pricing inherit provider
   * access.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelCatalogEntryResponse&gt;
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
  public ApiResponse<AiGatewayModelCatalogEntryResponse> updateAiGatewayModelWithHttpInfo(
      Long providerId, String canonical, AiGatewayModelUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'providerId' when calling updateAiGatewayModel");
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      throw new ApiException(
          400, "Missing the required parameter 'canonical' when calling updateAiGatewayModel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayModel",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AiGatewayModelCatalogEntryResponse>() {});
  }

  /**
   * Update a model for an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayModelWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelCatalogEntryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>>
      updateAiGatewayModelWithHttpInfoAsync(
          Long providerId, String canonical, AiGatewayModelUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling updateAiGatewayModel"));
      return result;
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'canonical' when calling updateAiGatewayModel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayModel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelCatalogEntryResponse>> result =
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
        new GenericType<AiGatewayModelCatalogEntryResponse>() {});
  }

  /**
   * Update an AI Gateway model group.
   *
   * <p>See {@link #updateAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @param body (required)
   * @return AiGatewayModelGroupResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelGroupResponse updateAiGatewayModelGroup(
      String id, AiGatewayModelGroupUpdateRequest body) throws ApiException {
    return updateAiGatewayModelGroupWithHttpInfo(id, body).getData();
  }

  /**
   * Update an AI Gateway model group.
   *
   * <p>See {@link #updateAiGatewayModelGroupWithHttpInfoAsync}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelGroupResponse&gt;
   */
  public CompletableFuture<AiGatewayModelGroupResponse> updateAiGatewayModelGroupAsync(
      String id, AiGatewayModelGroupUpdateRequest body) {
    return updateAiGatewayModelGroupWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a model group. For id "default", save membership and request options atomically with
   * expected_revision. Empty selections grant no organization-wide access. Applicable authorized
   * named policies override organization-wide request options; a rejected named-policy request
   * cannot fall back to organization-wide options. The organization-wide audience is fixed and
   * grants resource use only. Requires configuration write permission; named policies also require
   * edit access.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayModelGroupResponse> updateAiGatewayModelGroupWithHttpInfo(
      String id, AiGatewayModelGroupUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateAiGatewayModelGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayModelGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayModelGroup",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Update an AI Gateway model group.
   *
   * <p>See {@link #updateAiGatewayModelGroupWithHttpInfo}.
   *
   * @param id Model group ID, or "default" for the explicit organization-wide access policy.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>>
      updateAiGatewayModelGroupWithHttpInfoAsync(String id, AiGatewayModelGroupUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModelGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateAiGatewayModelGroup"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayModelGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-groups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayModelGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelGroupResponse>> result =
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
        new GenericType<AiGatewayModelGroupResponse>() {});
  }

  /**
   * Set a model pricing override.
   *
   * <p>See {@link #updateAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return AiGatewayModelPricingResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayModelPricingResponse updateAiGatewayModelPricing(
      Long providerId, String canonical, AiGatewayModelPricingRequest body) throws ApiException {
    return updateAiGatewayModelPricingWithHttpInfo(providerId, canonical, body).getData();
  }

  /**
   * Set a model pricing override.
   *
   * <p>See {@link #updateAiGatewayModelPricingWithHttpInfoAsync}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayModelPricingResponse&gt;
   */
  public CompletableFuture<AiGatewayModelPricingResponse> updateAiGatewayModelPricingAsync(
      Long providerId, String canonical, AiGatewayModelPricingRequest body) {
    return updateAiGatewayModelPricingWithHttpInfoAsync(providerId, canonical, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Set a custom provider model's pricing override. Requires <code>ai_gateway_config_write</code>
   * and provider Edit. Models and pricing inherit provider access.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayModelPricingResponse&gt;
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
  public ApiResponse<AiGatewayModelPricingResponse> updateAiGatewayModelPricingWithHttpInfo(
      Long providerId, String canonical, AiGatewayModelPricingRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'providerId' when calling updateAiGatewayModelPricing");
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'canonical' when calling updateAiGatewayModelPricing");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayModelPricing");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayModelPricing",
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
        new GenericType<AiGatewayModelPricingResponse>() {});
  }

  /**
   * Set a model pricing override.
   *
   * <p>See {@link #updateAiGatewayModelPricingWithHttpInfo}.
   *
   * @param providerId Provider ID. (required)
   * @param canonical Canonical model identifier. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayModelPricingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>>
      updateAiGatewayModelPricingWithHttpInfoAsync(
          Long providerId, String canonical, AiGatewayModelPricingRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayModelPricing";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'providerId' when calling"
                  + " updateAiGatewayModelPricing"));
      return result;
    }

    // verify the required parameter 'canonical' is set
    if (canonical == null) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'canonical' when calling"
                  + " updateAiGatewayModelPricing"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateAiGatewayModelPricing"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{provider_id}/models/{canonical}/pricing"
            .replaceAll(
                "\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()))
            .replaceAll("\\{" + "canonical" + "\\}", apiClient.escapeString(canonical.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayModelPricing",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayModelPricingResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AiGatewayModelPricingResponse>() {});
  }

  /**
   * Update an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @param body (required)
   * @return AiGatewayProviderResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayProviderResponse updateAiGatewayProvider(
      Long id, AiGatewayProviderUpdateRequest body) throws ApiException {
    return updateAiGatewayProviderWithHttpInfo(id, body).getData();
  }

  /**
   * Update an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayProviderWithHttpInfoAsync}.
   *
   * @param id Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayProviderResponse&gt;
   */
  public CompletableFuture<AiGatewayProviderResponse> updateAiGatewayProviderAsync(
      Long id, AiGatewayProviderUpdateRequest body) {
    return updateAiGatewayProviderWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a provider's display name or cost multiplier. Provider type, integration settings, and
   * slug are immutable. Requires <code>ai_gateway_config_write</code> and provider Edit. Models and
   * pricing inherit provider access.
   *
   * @param id Provider ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayProviderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayProviderResponse> updateAiGatewayProviderWithHttpInfo(
      Long id, AiGatewayProviderUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateAiGatewayProvider");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayProvider");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayProvider",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Update an AI Gateway provider.
   *
   * <p>See {@link #updateAiGatewayProviderWithHttpInfo}.
   *
   * @param id Provider ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayProviderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayProviderResponse>>
      updateAiGatewayProviderWithHttpInfoAsync(Long id, AiGatewayProviderUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayProvider";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateAiGatewayProvider"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayProvider"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/providers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayProvider",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayProviderResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayProviderResponse>() {});
  }

  /**
   * Update an AI Gateway rate limit.
   *
   * <p>See {@link #updateAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param body (required)
   * @return AiGatewayRateLimitResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRateLimitResponse updateAiGatewayRateLimit(
      UUID id, AiGatewayRateLimitUpdateRequest body) throws ApiException {
    return updateAiGatewayRateLimitWithHttpInfo(id, body).getData();
  }

  /**
   * Update an AI Gateway rate limit.
   *
   * <p>See {@link #updateAiGatewayRateLimitWithHttpInfoAsync}.
   *
   * @param id Rate limit UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayRateLimitResponse&gt;
   */
  public CompletableFuture<AiGatewayRateLimitResponse> updateAiGatewayRateLimitAsync(
      UUID id, AiGatewayRateLimitUpdateRequest body) {
    return updateAiGatewayRateLimitWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a rate limit. Only the attributes sent are changed, and changes never reset current
   * usage. Scope stays editable, except on a template rate limit, whose user_id, team_id, and tags
   * are rejected with 400. Returns 409 when the rule was changed concurrently or the new scope
   * duplicates another rule.
   *
   * @param id Rate limit UUID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayRateLimitResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRateLimitResponse> updateAiGatewayRateLimitWithHttpInfo(
      UUID id, AiGatewayRateLimitUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateAiGatewayRateLimit");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayRateLimit");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayRateLimit",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /**
   * Update an AI Gateway rate limit.
   *
   * <p>See {@link #updateAiGatewayRateLimitWithHttpInfo}.
   *
   * @param id Rate limit UUID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRateLimitResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>>
      updateAiGatewayRateLimitWithHttpInfoAsync(UUID id, AiGatewayRateLimitUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayRateLimit";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateAiGatewayRateLimit"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAiGatewayRateLimit"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rate-limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayRateLimit",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRateLimitResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayRateLimitResponse>() {});
  }

  /**
   * Replace an AI Gateway routing rule.
   *
   * <p>See {@link #updateAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param body (required)
   * @return AiGatewayRoutingRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayRoutingRuleResponse updateAiGatewayRoutingRule(
      String slug, AiGatewayRoutingRuleReplaceRequest body) throws ApiException {
    return updateAiGatewayRoutingRuleWithHttpInfo(slug, body).getData();
  }

  /**
   * Replace an AI Gateway routing rule.
   *
   * <p>See {@link #updateAiGatewayRoutingRuleWithHttpInfoAsync}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayRoutingRuleResponse&gt;
   */
  public CompletableFuture<AiGatewayRoutingRuleResponse> updateAiGatewayRoutingRuleAsync(
      String slug, AiGatewayRoutingRuleReplaceRequest body) {
    return updateAiGatewayRoutingRuleWithHttpInfoAsync(slug, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace a routing rule's tiers. The slug is immutable; data capture is managed independently.
   * This is a full replacement: omitted or null ordering resets the tier to configured, and omitted
   * or null weights in a weighted_affinity tier reset to 1. Omitted or null reasoning_level clears
   * a model destination's reasoning override. Replacing a rule repairs tiers reported with an
   * ordering_issue.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param body (required)
   * @return ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayRoutingRuleResponse> updateAiGatewayRoutingRuleWithHttpInfo(
      String slug, AiGatewayRoutingRuleReplaceRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      throw new ApiException(
          400, "Missing the required parameter 'slug' when calling updateAiGatewayRoutingRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAiGatewayRoutingRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.updateAiGatewayRoutingRule",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /**
   * Replace an AI Gateway routing rule.
   *
   * <p>See {@link #updateAiGatewayRoutingRuleWithHttpInfo}.
   *
   * @param slug Organization-unique routing rule slug. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayRoutingRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>>
      updateAiGatewayRoutingRuleWithHttpInfoAsync(
          String slug, AiGatewayRoutingRuleReplaceRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAiGatewayRoutingRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'slug' is set
    if (slug == null) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'slug' when calling updateAiGatewayRoutingRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateAiGatewayRoutingRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/routing-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.updateAiGatewayRoutingRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayRoutingRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AiGatewayRoutingRuleResponse>() {});
  }

  /** Manage optional parameters to upsertAiGatewayPolicy. */
  public static class UpsertAiGatewayPolicyOptionalParameters {
    private UUID userId;

    /**
     * Set userId.
     *
     * @param userId Filter or scope policies to a specific user. Omit for organization-wide
     *     policies. (optional)
     * @return UpsertAiGatewayPolicyOptionalParameters
     */
    public UpsertAiGatewayPolicyOptionalParameters userId(UUID userId) {
      this.userId = userId;
      return this;
    }
  }

  /**
   * Create or replace an AI Gateway routing policy.
   *
   * <p>See {@link #upsertAiGatewayPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return AiGatewayPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyResponse upsertAiGatewayPolicy(AiGatewayPolicyRequest body)
      throws ApiException {
    return upsertAiGatewayPolicyWithHttpInfo(body, new UpsertAiGatewayPolicyOptionalParameters())
        .getData();
  }

  /**
   * Create or replace an AI Gateway routing policy.
   *
   * <p>See {@link #upsertAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AiGatewayPolicyResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyResponse> upsertAiGatewayPolicyAsync(
      AiGatewayPolicyRequest body) {
    return upsertAiGatewayPolicyWithHttpInfoAsync(
            body, new UpsertAiGatewayPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or replace an AI Gateway routing policy.
   *
   * <p>See {@link #upsertAiGatewayPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return AiGatewayPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public AiGatewayPolicyResponse upsertAiGatewayPolicy(
      AiGatewayPolicyRequest body, UpsertAiGatewayPolicyOptionalParameters parameters)
      throws ApiException {
    return upsertAiGatewayPolicyWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create or replace an AI Gateway routing policy.
   *
   * <p>See {@link #upsertAiGatewayPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AiGatewayPolicyResponse&gt;
   */
  public CompletableFuture<AiGatewayPolicyResponse> upsertAiGatewayPolicyAsync(
      AiGatewayPolicyRequest body, UpsertAiGatewayPolicyOptionalParameters parameters) {
    return upsertAiGatewayPolicyWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or replace the routing policy document for an inbound pattern. Pass user_id to scope the
   * policy to a user.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AiGatewayPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AiGatewayPolicyResponse> upsertAiGatewayPolicyWithHttpInfo(
      AiGatewayPolicyRequest body, UpsertAiGatewayPolicyOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertAiGatewayPolicy");
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath = "/api/v2/policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGatewayApi.upsertAiGatewayPolicy",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<AiGatewayPolicyResponse>() {});
  }

  /**
   * Create or replace an AI Gateway routing policy.
   *
   * <p>See {@link #upsertAiGatewayPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AiGatewayPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AiGatewayPolicyResponse>>
      upsertAiGatewayPolicyWithHttpInfoAsync(
          AiGatewayPolicyRequest body, UpsertAiGatewayPolicyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "upsertAiGatewayPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertAiGatewayPolicy"));
      return result;
    }
    UUID userId = parameters.userId;
    // create path and map variables
    String localVarPath = "/api/v2/policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGatewayApi.upsertAiGatewayPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AiGatewayPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<AiGatewayPolicyResponse>() {});
  }
}
