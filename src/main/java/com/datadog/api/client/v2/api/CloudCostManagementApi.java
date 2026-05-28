package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequest;
import com.datadog.api.client.v2.model.ArbitraryRuleResponse;
import com.datadog.api.client.v2.model.ArbitraryRuleResponseArray;
import com.datadog.api.client.v2.model.ArbitraryRuleStatusResponseArray;
import com.datadog.api.client.v2.model.AwsCURConfigPatchRequest;
import com.datadog.api.client.v2.model.AwsCURConfigPostRequest;
import com.datadog.api.client.v2.model.AwsCURConfigsResponse;
import com.datadog.api.client.v2.model.AwsCurConfigResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPairsResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPatchRequest;
import com.datadog.api.client.v2.model.AzureUCConfigPostRequest;
import com.datadog.api.client.v2.model.AzureUCConfigsResponse;
import com.datadog.api.client.v2.model.BudgetArray;
import com.datadog.api.client.v2.model.BudgetValidationRequest;
import com.datadog.api.client.v2.model.BudgetValidationResponse;
import com.datadog.api.client.v2.model.BudgetWithEntries;
import com.datadog.api.client.v2.model.CommitmentsCommitmentType;
import com.datadog.api.client.v2.model.CommitmentsCoverageScalarResponse;
import com.datadog.api.client.v2.model.CommitmentsCoverageTimeseriesResponse;
import com.datadog.api.client.v2.model.CommitmentsListResponse;
import com.datadog.api.client.v2.model.CommitmentsOnDemandHotspotsScalarResponse;
import com.datadog.api.client.v2.model.CommitmentsProvider;
import com.datadog.api.client.v2.model.CommitmentsSavingsScalarResponse;
import com.datadog.api.client.v2.model.CommitmentsSavingsTimeseriesResponse;
import com.datadog.api.client.v2.model.CommitmentsUtilizationScalarResponse;
import com.datadog.api.client.v2.model.CommitmentsUtilizationTimeseriesResponse;
import com.datadog.api.client.v2.model.CostAnomaliesResponse;
import com.datadog.api.client.v2.model.CostAnomalyResponse;
import com.datadog.api.client.v2.model.CostCurrencyResponse;
import com.datadog.api.client.v2.model.CostMetricsResponse;
import com.datadog.api.client.v2.model.CostOrchestratorsResponse;
import com.datadog.api.client.v2.model.CostRecommendationArray;
import com.datadog.api.client.v2.model.CostTagDescriptionResponse;
import com.datadog.api.client.v2.model.CostTagDescriptionUpsertRequest;
import com.datadog.api.client.v2.model.CostTagDescriptionsResponse;
import com.datadog.api.client.v2.model.CostTagKeyMetadataResponse;
import com.datadog.api.client.v2.model.CostTagKeyResponse;
import com.datadog.api.client.v2.model.CostTagKeySourcesResponse;
import com.datadog.api.client.v2.model.CostTagKeysResponse;
import com.datadog.api.client.v2.model.CostTagMetadataDailyFilter;
import com.datadog.api.client.v2.model.CostTagMetadataMonthsResponse;
import com.datadog.api.client.v2.model.CostTagsResponse;
import com.datadog.api.client.v2.model.CreateRulesetRequest;
import com.datadog.api.client.v2.model.CustomCostsFileGetResponse;
import com.datadog.api.client.v2.model.CustomCostsFileLineItem;
import com.datadog.api.client.v2.model.CustomCostsFileListResponse;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPatchRequest;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPostRequest;
import com.datadog.api.client.v2.model.GCPUsageCostConfigResponse;
import com.datadog.api.client.v2.model.GCPUsageCostConfigsResponse;
import com.datadog.api.client.v2.model.GcpUcConfigResponse;
import com.datadog.api.client.v2.model.GenerateCostTagDescriptionResponse;
import com.datadog.api.client.v2.model.OCIConfigsResponse;
import com.datadog.api.client.v2.model.RecommendationsFilterRequest;
import com.datadog.api.client.v2.model.ReorderRuleResourceArray;
import com.datadog.api.client.v2.model.ReorderRulesetResourceArray;
import com.datadog.api.client.v2.model.RulesValidateQueryRequest;
import com.datadog.api.client.v2.model.RulesValidateQueryResponse;
import com.datadog.api.client.v2.model.RulesetResp;
import com.datadog.api.client.v2.model.RulesetRespArray;
import com.datadog.api.client.v2.model.RulesetStatusRespArray;
import com.datadog.api.client.v2.model.UCConfigPair;
import com.datadog.api.client.v2.model.UpdateRulesetRequest;
import com.datadog.api.client.v2.model.ValidationResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudCostManagementApi {
  private ApiClient apiClient;

  public CloudCostManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudCostManagementApi(ApiClient apiClient) {
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
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return AwsCurConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCurConfigResponse createCostAWSCURConfig(AwsCURConfigPostRequest body)
      throws ApiException {
    return createCostAWSCURConfigWithHttpInfo(body).getData();
  }

  /**
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AwsCurConfigResponse&gt;
   */
  public CompletableFuture<AwsCurConfigResponse> createCostAWSCURConfigAsync(
      AwsCURConfigPostRequest body) {
    return createCostAWSCURConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Cost Management account for an AWS CUR config.
   *
   * @param body (required)
   * @return ApiResponse&lt;AwsCurConfigResponse&gt;
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
  public ApiResponse<AwsCurConfigResponse> createCostAWSCURConfigWithHttpInfo(
      AwsCURConfigPostRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCostAWSCURConfig",
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
        new GenericType<AwsCurConfigResponse>() {});
  }

  /**
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCurConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCurConfigResponse>>
      createCostAWSCURConfigWithHttpInfoAsync(AwsCURConfigPostRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsCurConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCurConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsCurConfigResponse>() {});
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfo}.
   *
   * @param body (required)
   * @return AzureUCConfigPairsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigPairsResponse createCostAzureUCConfigs(AzureUCConfigPostRequest body)
      throws ApiException {
    return createCostAzureUCConfigsWithHttpInfo(body).getData();
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AzureUCConfigPairsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigPairsResponse> createCostAzureUCConfigsAsync(
      AzureUCConfigPostRequest body) {
    return createCostAzureUCConfigsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Cost Management account for an Azure config.
   *
   * @param body (required)
   * @return ApiResponse&lt;AzureUCConfigPairsResponse&gt;
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
  public ApiResponse<AzureUCConfigPairsResponse> createCostAzureUCConfigsWithHttpInfo(
      AzureUCConfigPostRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCostAzureUCConfigs");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCostAzureUCConfigs",
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
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigPairsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>>
      createCostAzureUCConfigsWithHttpInfoAsync(AzureUCConfigPostRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCostAzureUCConfigs"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Create Google Cloud Usage Cost config.
   *
   * <p>See {@link #createCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return GCPUsageCostConfigResponse
   * @throws ApiException if fails to make API call
   */
  public GCPUsageCostConfigResponse createCostGCPUsageCostConfig(GCPUsageCostConfigPostRequest body)
      throws ApiException {
    return createCostGCPUsageCostConfigWithHttpInfo(body).getData();
  }

  /**
   * Create Google Cloud Usage Cost config.
   *
   * <p>See {@link #createCostGCPUsageCostConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GCPUsageCostConfigResponse&gt;
   */
  public CompletableFuture<GCPUsageCostConfigResponse> createCostGCPUsageCostConfigAsync(
      GCPUsageCostConfigPostRequest body) {
    return createCostGCPUsageCostConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Cost Management account for an Google Cloud Usage Cost config.
   *
   * @param body (required)
   * @return ApiResponse&lt;GCPUsageCostConfigResponse&gt;
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
  public ApiResponse<GCPUsageCostConfigResponse> createCostGCPUsageCostConfigWithHttpInfo(
      GCPUsageCostConfigPostRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCostGCPUsageCostConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/gcp_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCostGCPUsageCostConfig",
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
        new GenericType<GCPUsageCostConfigResponse>() {});
  }

  /**
   * Create Google Cloud Usage Cost config.
   *
   * <p>See {@link #createCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GCPUsageCostConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>>
      createCostGCPUsageCostConfigWithHttpInfoAsync(GCPUsageCostConfigPostRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createCostGCPUsageCostConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/gcp_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCostGCPUsageCostConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<GCPUsageCostConfigResponse>() {});
  }

  /**
   * Create custom allocation rule.
   *
   * <p>See {@link #createCustomAllocationRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return ArbitraryRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ArbitraryRuleResponse createCustomAllocationRule(ArbitraryCostUpsertRequest body)
      throws ApiException {
    return createCustomAllocationRuleWithHttpInfo(body).getData();
  }

  /**
   * Create custom allocation rule.
   *
   * <p>See {@link #createCustomAllocationRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ArbitraryRuleResponse&gt;
   */
  public CompletableFuture<ArbitraryRuleResponse> createCustomAllocationRuleAsync(
      ArbitraryCostUpsertRequest body) {
    return createCustomAllocationRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new custom allocation rule with the specified filters and allocation strategy.
   *
   * <p><strong>Strategy Methods:</strong> - <strong>PROPORTIONAL/EVEN</strong>: Allocates costs
   * proportionally/evenly based on existing costs. Requires: granularity, allocated_by_tag_keys.
   * Optional: based_on_costs, allocated_by_filters, evaluate_grouped_by_tag_keys,
   * evaluate_grouped_by_filters. - <strong>PROPORTIONAL_TIMESERIES/EVEN_TIMESERIES</strong>:
   * Allocates based on timeseries data. Requires: granularity, based_on_timeseries. Optional:
   * evaluate_grouped_by_tag_keys. - <strong>PERCENT</strong>: Allocates fixed percentages to
   * specific tags. Requires: allocated_by (array of percentage allocations).
   *
   * <p><strong>Filter Conditions:</strong> - Use <strong>value</strong> for single-value
   * conditions: "is", "is not", "contains", "=", "!=", "like", "not like" - Use
   * <strong>values</strong> for multi-value conditions: "in", "not in" - Cannot use both value and
   * values simultaneously.
   *
   * <p><strong>Supported operators</strong>: is, is not, contains, in, not in, =, !=, like, not
   * like
   *
   * @param body (required)
   * @return ApiResponse&lt;ArbitraryRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArbitraryRuleResponse> createCustomAllocationRuleWithHttpInfo(
      ArbitraryCostUpsertRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCustomAllocationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCustomAllocationRule",
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Create custom allocation rule.
   *
   * <p>See {@link #createCustomAllocationRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ArbitraryRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArbitraryRuleResponse>>
      createCustomAllocationRuleWithHttpInfoAsync(ArbitraryCostUpsertRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createCustomAllocationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCustomAllocationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Create tag pipeline ruleset.
   *
   * <p>See {@link #createTagPipelinesRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return RulesetResp
   * @throws ApiException if fails to make API call
   */
  public RulesetResp createTagPipelinesRuleset(CreateRulesetRequest body) throws ApiException {
    return createTagPipelinesRulesetWithHttpInfo(body).getData();
  }

  /**
   * Create tag pipeline ruleset.
   *
   * <p>See {@link #createTagPipelinesRulesetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RulesetResp&gt;
   */
  public CompletableFuture<RulesetResp> createTagPipelinesRulesetAsync(CreateRulesetRequest body) {
    return createTagPipelinesRulesetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new tag pipeline ruleset with the specified rules and configuration
   *
   * @param body (required)
   * @return ApiResponse&lt;RulesetResp&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesetResp> createTagPipelinesRulesetWithHttpInfo(CreateRulesetRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagPipelinesRuleset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createTagPipelinesRuleset",
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * Create tag pipeline ruleset.
   *
   * <p>See {@link #createTagPipelinesRulesetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RulesetResp&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesetResp>> createTagPipelinesRulesetWithHttpInfoAsync(
      CreateRulesetRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTagPipelinesRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createTagPipelinesRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * Delete budget.
   *
   * <p>See {@link #deleteBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBudget(String budgetId) throws ApiException {
    deleteBudgetWithHttpInfo(budgetId);
  }

  /**
   * Delete budget.
   *
   * <p>See {@link #deleteBudgetWithHttpInfoAsync}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteBudgetAsync(String budgetId) {
    return deleteBudgetWithHttpInfoAsync(budgetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a budget
   *
   * @param budgetId Budget id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteBudgetWithHttpInfo(String budgetId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'budgetId' is set
    if (budgetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'budgetId' when calling deleteBudget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/budget/{budget_id}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteBudget",
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
   * Delete budget.
   *
   * <p>See {@link #deleteBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteBudgetWithHttpInfoAsync(String budgetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'budgetId' is set
    if (budgetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'budgetId' when calling deleteBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/budget/{budget_id}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteBudget",
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
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostAWSCURConfig(Long cloudAccountId) throws ApiException {
    deleteCostAWSCURConfigWithHttpInfo(cloudAccountId);
  }

  /**
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostAWSCURConfigAsync(Long cloudAccountId) {
    return deleteCostAWSCURConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a Cloud Cost Management Account.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostAWSCURConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling deleteCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostAWSCURConfig",
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
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostAWSCURConfigWithHttpInfoAsync(
      Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " deleteCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostAWSCURConfig",
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
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostAzureUCConfig(Long cloudAccountId) throws ApiException {
    deleteCostAzureUCConfigWithHttpInfo(cloudAccountId);
  }

  /**
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostAzureUCConfigAsync(Long cloudAccountId) {
    return deleteCostAzureUCConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a Cloud Cost Management Account.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostAzureUCConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling deleteCostAzureUCConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostAzureUCConfig",
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
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostAzureUCConfigWithHttpInfoAsync(
      Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " deleteCostAzureUCConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostAzureUCConfig",
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
   * Delete Google Cloud Usage Cost config.
   *
   * <p>See {@link #deleteCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostGCPUsageCostConfig(Long cloudAccountId) throws ApiException {
    deleteCostGCPUsageCostConfigWithHttpInfo(cloudAccountId);
  }

  /**
   * Delete Google Cloud Usage Cost config.
   *
   * <p>See {@link #deleteCostGCPUsageCostConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostGCPUsageCostConfigAsync(Long cloudAccountId) {
    return deleteCostGCPUsageCostConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a Cloud Cost Management account.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostGCPUsageCostConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling"
              + " deleteCostGCPUsageCostConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostGCPUsageCostConfig",
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
   * Delete Google Cloud Usage Cost config.
   *
   * <p>See {@link #deleteCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostGCPUsageCostConfigWithHttpInfoAsync(
      Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " deleteCostGCPUsageCostConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostGCPUsageCostConfig",
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

  /** Manage optional parameters to deleteCostTagDescriptionByKey. */
  public static class DeleteCostTagDescriptionByKeyOptionalParameters {
    private String cloud;

    /**
     * Set cloud.
     *
     * @param cloud Cloud provider to scope the deletion to (for example, <code>aws</code>). Omit to
     *     delete every description for the tag key. (optional)
     * @return DeleteCostTagDescriptionByKeyOptionalParameters
     */
    public DeleteCostTagDescriptionByKeyOptionalParameters cloud(String cloud) {
      this.cloud = cloud;
      return this;
    }
  }

  /**
   * Delete a Cloud Cost Management tag description.
   *
   * <p>See {@link #deleteCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostTagDescriptionByKey(String tagKey) throws ApiException {
    deleteCostTagDescriptionByKeyWithHttpInfo(
        tagKey, new DeleteCostTagDescriptionByKeyOptionalParameters());
  }

  /**
   * Delete a Cloud Cost Management tag description.
   *
   * <p>See {@link #deleteCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostTagDescriptionByKeyAsync(String tagKey) {
    return deleteCostTagDescriptionByKeyWithHttpInfoAsync(
            tagKey, new DeleteCostTagDescriptionByKeyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Cloud Cost Management tag description.
   *
   * <p>See {@link #deleteCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteCostTagDescriptionByKey(
      String tagKey, DeleteCostTagDescriptionByKeyOptionalParameters parameters)
      throws ApiException {
    deleteCostTagDescriptionByKeyWithHttpInfo(tagKey, parameters);
  }

  /**
   * Delete a Cloud Cost Management tag description.
   *
   * <p>See {@link #deleteCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostTagDescriptionByKeyAsync(
      String tagKey, DeleteCostTagDescriptionByKeyOptionalParameters parameters) {
    return deleteCostTagDescriptionByKeyWithHttpInfoAsync(tagKey, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Cloud Cost Management tag key description. When <code>cloud</code> is omitted, deletes
   * every description for the tag key, falling back to Datadog's global default when available.
   * When <code>cloud</code> is provided, deletes only the description scoped to that cloud
   * provider.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostTagDescriptionByKeyWithHttpInfo(
      String tagKey, DeleteCostTagDescriptionByKeyOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'tagKey' when calling deleteCostTagDescriptionByKey");
    }
    String cloud = parameters.cloud;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud", cloud));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostTagDescriptionByKey",
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
   * Delete a Cloud Cost Management tag description.
   *
   * <p>See {@link #deleteCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being deleted. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostTagDescriptionByKeyWithHttpInfoAsync(
      String tagKey, DeleteCostTagDescriptionByKeyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tagKey' when calling"
                  + " deleteCostTagDescriptionByKey"));
      return result;
    }
    String cloud = parameters.cloud;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud", cloud));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostTagDescriptionByKey",
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
   * Delete custom allocation rule.
   *
   * <p>See {@link #deleteCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomAllocationRule(Long ruleId) throws ApiException {
    deleteCustomAllocationRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete custom allocation rule.
   *
   * <p>See {@link #deleteCustomAllocationRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCustomAllocationRuleAsync(Long ruleId) {
    return deleteCustomAllocationRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a custom allocation rule - Delete an existing custom allocation rule by its ID
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomAllocationRuleWithHttpInfo(Long ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteCustomAllocationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCustomAllocationRule",
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
   * Delete custom allocation rule.
   *
   * <p>See {@link #deleteCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomAllocationRuleWithHttpInfoAsync(
      Long ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling deleteCustomAllocationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCustomAllocationRule",
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
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomCostsFile(String fileId) throws ApiException {
    deleteCustomCostsFileWithHttpInfo(fileId);
  }

  /**
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfoAsync}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCustomCostsFileAsync(String fileId) {
    return deleteCustomCostsFileWithHttpInfoAsync(fileId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the specified Custom Costs file.
   *
   * @param fileId File ID. (required)
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
  public ApiResponse<Void> deleteCustomCostsFileWithHttpInfo(String fileId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fileId' when calling deleteCustomCostsFile");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCustomCostsFile",
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
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomCostsFileWithHttpInfoAsync(
      String fileId) {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fileId' when calling deleteCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCustomCostsFile",
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
   * Delete tag pipeline ruleset.
   *
   * <p>See {@link #deleteTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagPipelinesRuleset(String rulesetId) throws ApiException {
    deleteTagPipelinesRulesetWithHttpInfo(rulesetId);
  }

  /**
   * Delete tag pipeline ruleset.
   *
   * <p>See {@link #deleteTagPipelinesRulesetWithHttpInfoAsync}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagPipelinesRulesetAsync(String rulesetId) {
    return deleteTagPipelinesRulesetWithHttpInfoAsync(rulesetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag pipeline ruleset - Delete an existing tag pipeline ruleset by its ID
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTagPipelinesRulesetWithHttpInfo(String rulesetId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetId' when calling deleteTagPipelinesRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteTagPipelinesRuleset",
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
   * Delete tag pipeline ruleset.
   *
   * <p>See {@link #deleteTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagPipelinesRulesetWithHttpInfoAsync(
      String rulesetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetId' when calling deleteTagPipelinesRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteTagPipelinesRuleset",
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
   * Generate a Cloud Cost Management tag description.
   *
   * <p>See {@link #generateCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key to generate an AI description for. (required)
   * @return GenerateCostTagDescriptionResponse
   * @throws ApiException if fails to make API call
   */
  public GenerateCostTagDescriptionResponse generateCostTagDescriptionByKey(String tagKey)
      throws ApiException {
    return generateCostTagDescriptionByKeyWithHttpInfo(tagKey).getData();
  }

  /**
   * Generate a Cloud Cost Management tag description.
   *
   * <p>See {@link #generateCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key to generate an AI description for. (required)
   * @return CompletableFuture&lt;GenerateCostTagDescriptionResponse&gt;
   */
  public CompletableFuture<GenerateCostTagDescriptionResponse> generateCostTagDescriptionByKeyAsync(
      String tagKey) {
    return generateCostTagDescriptionByKeyWithHttpInfoAsync(tagKey)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use AI to draft a Cloud Cost Management tag key description based on associated cost data. The
   * generated description is returned in the response and is not persisted by this endpoint; follow
   * up with <code>UpsertCostTagDescriptionByKey</code> to save it.
   *
   * @param tagKey The tag key to generate an AI description for. (required)
   * @return ApiResponse&lt;GenerateCostTagDescriptionResponse&gt;
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
  public ApiResponse<GenerateCostTagDescriptionResponse>
      generateCostTagDescriptionByKeyWithHttpInfo(String tagKey) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'tagKey' when calling generateCostTagDescriptionByKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}/generate"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.generateCostTagDescriptionByKey",
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
        new GenericType<GenerateCostTagDescriptionResponse>() {});
  }

  /**
   * Generate a Cloud Cost Management tag description.
   *
   * <p>See {@link #generateCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key to generate an AI description for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GenerateCostTagDescriptionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GenerateCostTagDescriptionResponse>>
      generateCostTagDescriptionByKeyWithHttpInfoAsync(String tagKey) {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      CompletableFuture<ApiResponse<GenerateCostTagDescriptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tagKey' when calling"
                  + " generateCostTagDescriptionByKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}/generate"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.generateCostTagDescriptionByKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GenerateCostTagDescriptionResponse>> result =
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
        new GenericType<GenerateCostTagDescriptionResponse>() {});
  }

  /**
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @return BudgetWithEntries
   * @throws ApiException if fails to make API call
   */
  public BudgetWithEntries getBudget(String budgetId) throws ApiException {
    return getBudgetWithHttpInfo(budgetId).getData();
  }

  /**
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfoAsync}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture&lt;BudgetWithEntries&gt;
   */
  public CompletableFuture<BudgetWithEntries> getBudgetAsync(String budgetId) {
    return getBudgetWithHttpInfoAsync(budgetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a budget
   *
   * @param budgetId Budget id. (required)
   * @return ApiResponse&lt;BudgetWithEntries&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BudgetWithEntries> getBudgetWithHttpInfo(String budgetId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'budgetId' is set
    if (budgetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'budgetId' when calling getBudget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/budget/{budget_id}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getBudget",
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
        new GenericType<BudgetWithEntries>() {});
  }

  /**
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;BudgetWithEntries&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BudgetWithEntries>> getBudgetWithHttpInfoAsync(
      String budgetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'budgetId' is set
    if (budgetId == null) {
      CompletableFuture<ApiResponse<BudgetWithEntries>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'budgetId' when calling getBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/budget/{budget_id}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BudgetWithEntries>> result = new CompletableFuture<>();
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
        new GenericType<BudgetWithEntries>() {});
  }

  /** Manage optional parameters to getCommitmentsCommitmentList. */
  public static class GetCommitmentsCommitmentListOptionalParameters {
    private String filterBy;
    private CommitmentsCommitmentType commitmentType;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsCommitmentListOptionalParameters
     */
    public GetCommitmentsCommitmentListOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }

    /**
     * Set commitmentType.
     *
     * @param commitmentType Type of commitment to query. ri for Reserved Instances, sp for Savings
     *     Plans. Defaults to ri. (optional)
     * @return GetCommitmentsCommitmentListOptionalParameters
     */
    public GetCommitmentsCommitmentListOptionalParameters commitmentType(
        CommitmentsCommitmentType commitmentType) {
      this.commitmentType = commitmentType;
      return this;
    }
  }

  /**
   * Get commitments list.
   *
   * <p>See {@link #getCommitmentsCommitmentListWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsListResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsListResponse getCommitmentsCommitmentList(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsCommitmentListWithHttpInfo(
            provider, product, start, end, new GetCommitmentsCommitmentListOptionalParameters())
        .getData();
  }

  /**
   * Get commitments list.
   *
   * <p>See {@link #getCommitmentsCommitmentListWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsListResponse&gt;
   */
  public CompletableFuture<CommitmentsListResponse> getCommitmentsCommitmentListAsync(
      CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsCommitmentListWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsCommitmentListOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments list.
   *
   * <p>See {@link #getCommitmentsCommitmentListWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsListResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsListResponse getCommitmentsCommitmentList(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCommitmentListOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsCommitmentListWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments list.
   *
   * <p>See {@link #getCommitmentsCommitmentListWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsListResponse&gt;
   */
  public CompletableFuture<CommitmentsListResponse> getCommitmentsCommitmentListAsync(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCommitmentListOptionalParameters parameters) {
    return getCommitmentsCommitmentListWithHttpInfoAsync(provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of individual cloud commitments (Reserved Instances or Savings Plans) with their
   * utilization details. The response schema varies based on the provider, product, and commitment
   * type.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsListResponse&gt;
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
  public ApiResponse<CommitmentsListResponse> getCommitmentsCommitmentListWithHttpInfo(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCommitmentListOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCommitmentList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling getCommitmentsCommitmentList");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling getCommitmentsCommitmentList");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400, "Missing the required parameter 'start' when calling getCommitmentsCommitmentList");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400, "Missing the required parameter 'end' when calling getCommitmentsCommitmentList");
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/commitment-list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsCommitmentList",
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
        new GenericType<CommitmentsListResponse>() {});
  }

  /**
   * Get commitments list.
   *
   * <p>See {@link #getCommitmentsCommitmentListWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsListResponse>>
      getCommitmentsCommitmentListWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsCommitmentListOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCommitmentList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsCommitmentList"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsCommitmentList"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling getCommitmentsCommitmentList"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling getCommitmentsCommitmentList"));
      return result;
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/commitment-list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsCommitmentList",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<CommitmentsListResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsCoverageScalar. */
  public static class GetCommitmentsCoverageScalarOptionalParameters {
    private String filterBy;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsCoverageScalarOptionalParameters
     */
    public GetCommitmentsCoverageScalarOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }
  }

  /**
   * Get commitments coverage (scalar).
   *
   * <p>See {@link #getCommitmentsCoverageScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsCoverageScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsCoverageScalarResponse getCommitmentsCoverageScalar(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsCoverageScalarWithHttpInfo(
            provider, product, start, end, new GetCommitmentsCoverageScalarOptionalParameters())
        .getData();
  }

  /**
   * Get commitments coverage (scalar).
   *
   * <p>See {@link #getCommitmentsCoverageScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsCoverageScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsCoverageScalarResponse> getCommitmentsCoverageScalarAsync(
      CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsCoverageScalarWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsCoverageScalarOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments coverage (scalar).
   *
   * <p>See {@link #getCommitmentsCoverageScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsCoverageScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsCoverageScalarResponse getCommitmentsCoverageScalar(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCoverageScalarOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsCoverageScalarWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments coverage (scalar).
   *
   * <p>See {@link #getCommitmentsCoverageScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsCoverageScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsCoverageScalarResponse> getCommitmentsCoverageScalarAsync(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCoverageScalarOptionalParameters parameters) {
    return getCommitmentsCoverageScalarWithHttpInfoAsync(provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get scalar coverage metrics for cloud commitment programs, including hours and cost coverage
   * percentages.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsCoverageScalarResponse&gt;
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
  public ApiResponse<CommitmentsCoverageScalarResponse> getCommitmentsCoverageScalarWithHttpInfo(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCoverageScalarOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCoverageScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling getCommitmentsCoverageScalar");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling getCommitmentsCoverageScalar");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400, "Missing the required parameter 'start' when calling getCommitmentsCoverageScalar");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400, "Missing the required parameter 'end' when calling getCommitmentsCoverageScalar");
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/coverage/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsCoverageScalar",
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
        new GenericType<CommitmentsCoverageScalarResponse>() {});
  }

  /**
   * Get commitments coverage (scalar).
   *
   * <p>See {@link #getCommitmentsCoverageScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsCoverageScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>>
      getCommitmentsCoverageScalarWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsCoverageScalarOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCoverageScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsCoverageScalar"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsCoverageScalar"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling getCommitmentsCoverageScalar"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling getCommitmentsCoverageScalar"));
      return result;
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/coverage/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsCoverageScalar",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsCoverageScalarResponse>> result =
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
        new GenericType<CommitmentsCoverageScalarResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsCoverageTimeseries. */
  public static class GetCommitmentsCoverageTimeseriesOptionalParameters {
    private String filterBy;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsCoverageTimeseriesOptionalParameters
     */
    public GetCommitmentsCoverageTimeseriesOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }
  }

  /**
   * Get commitments coverage (timeseries).
   *
   * <p>See {@link #getCommitmentsCoverageTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsCoverageTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsCoverageTimeseriesResponse getCommitmentsCoverageTimeseries(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsCoverageTimeseriesWithHttpInfo(
            provider, product, start, end, new GetCommitmentsCoverageTimeseriesOptionalParameters())
        .getData();
  }

  /**
   * Get commitments coverage (timeseries).
   *
   * <p>See {@link #getCommitmentsCoverageTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsCoverageTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsCoverageTimeseriesResponse>
      getCommitmentsCoverageTimeseriesAsync(
          CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsCoverageTimeseriesWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsCoverageTimeseriesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments coverage (timeseries).
   *
   * <p>See {@link #getCommitmentsCoverageTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsCoverageTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsCoverageTimeseriesResponse getCommitmentsCoverageTimeseries(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsCoverageTimeseriesOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsCoverageTimeseriesWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments coverage (timeseries).
   *
   * <p>See {@link #getCommitmentsCoverageTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsCoverageTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsCoverageTimeseriesResponse>
      getCommitmentsCoverageTimeseriesAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsCoverageTimeseriesOptionalParameters parameters) {
    return getCommitmentsCoverageTimeseriesWithHttpInfoAsync(
            provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get timeseries coverage metrics for cloud commitment programs, broken down by coverage type
   * (Reserved Instances, Savings Plans, On-Demand, and Spot) for both hours and cost.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsCoverageTimeseriesResponse&gt;
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
  public ApiResponse<CommitmentsCoverageTimeseriesResponse>
      getCommitmentsCoverageTimeseriesWithHttpInfo(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsCoverageTimeseriesOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCoverageTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling"
              + " getCommitmentsCoverageTimeseries");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling getCommitmentsCoverageTimeseries");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'start' when calling getCommitmentsCoverageTimeseries");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'end' when calling getCommitmentsCoverageTimeseries");
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/coverage/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsCoverageTimeseries",
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
        new GenericType<CommitmentsCoverageTimeseriesResponse>() {});
  }

  /**
   * Get commitments coverage (timeseries).
   *
   * <p>See {@link #getCommitmentsCoverageTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsCoverageTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>>
      getCommitmentsCoverageTimeseriesWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsCoverageTimeseriesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsCoverageTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsCoverageTimeseries"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsCoverageTimeseries"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling"
                  + " getCommitmentsCoverageTimeseries"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling"
                  + " getCommitmentsCoverageTimeseries"));
      return result;
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/coverage/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsCoverageTimeseries",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsCoverageTimeseriesResponse>> result =
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
        new GenericType<CommitmentsCoverageTimeseriesResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsOnDemandHotspotsScalar. */
  public static class GetCommitmentsOnDemandHotspotsScalarOptionalParameters {
    private String filterBy;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsOnDemandHotspotsScalarOptionalParameters
     */
    public GetCommitmentsOnDemandHotspotsScalarOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }
  }

  /**
   * Get commitments on-demand hot spots (scalar).
   *
   * <p>See {@link #getCommitmentsOnDemandHotspotsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsOnDemandHotspotsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsOnDemandHotspotsScalarResponse getCommitmentsOnDemandHotspotsScalar(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsOnDemandHotspotsScalarWithHttpInfo(
            provider,
            product,
            start,
            end,
            new GetCommitmentsOnDemandHotspotsScalarOptionalParameters())
        .getData();
  }

  /**
   * Get commitments on-demand hot spots (scalar).
   *
   * <p>See {@link #getCommitmentsOnDemandHotspotsScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsOnDemandHotspotsScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsOnDemandHotspotsScalarResponse>
      getCommitmentsOnDemandHotspotsScalarAsync(
          CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsOnDemandHotspotsScalarWithHttpInfoAsync(
            provider,
            product,
            start,
            end,
            new GetCommitmentsOnDemandHotspotsScalarOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments on-demand hot spots (scalar).
   *
   * <p>See {@link #getCommitmentsOnDemandHotspotsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsOnDemandHotspotsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsOnDemandHotspotsScalarResponse getCommitmentsOnDemandHotspotsScalar(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsOnDemandHotspotsScalarOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsOnDemandHotspotsScalarWithHttpInfo(
            provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments on-demand hot spots (scalar).
   *
   * <p>See {@link #getCommitmentsOnDemandHotspotsScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsOnDemandHotspotsScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsOnDemandHotspotsScalarResponse>
      getCommitmentsOnDemandHotspotsScalarAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsOnDemandHotspotsScalarOptionalParameters parameters) {
    return getCommitmentsOnDemandHotspotsScalarWithHttpInfoAsync(
            provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get scalar on-demand hot-spots data for cloud commitment programs, showing per-dimension
   * breakdowns of on-demand spending with coverage metrics and potential savings.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsOnDemandHotspotsScalarResponse&gt;
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
  public ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>
      getCommitmentsOnDemandHotspotsScalarWithHttpInfo(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsOnDemandHotspotsScalarOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsOnDemandHotspotsScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling"
              + " getCommitmentsOnDemandHotspotsScalar");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling"
              + " getCommitmentsOnDemandHotspotsScalar");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'start' when calling"
              + " getCommitmentsOnDemandHotspotsScalar");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'end' when calling getCommitmentsOnDemandHotspotsScalar");
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/on-demand-hot-spots/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsOnDemandHotspotsScalar",
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
        new GenericType<CommitmentsOnDemandHotspotsScalarResponse>() {});
  }

  /**
   * Get commitments on-demand hot spots (scalar).
   *
   * <p>See {@link #getCommitmentsOnDemandHotspotsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsOnDemandHotspotsScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>>
      getCommitmentsOnDemandHotspotsScalarWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsOnDemandHotspotsScalarOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsOnDemandHotspotsScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsOnDemandHotspotsScalar"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsOnDemandHotspotsScalar"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling"
                  + " getCommitmentsOnDemandHotspotsScalar"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling"
                  + " getCommitmentsOnDemandHotspotsScalar"));
      return result;
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/on-demand-hot-spots/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsOnDemandHotspotsScalar",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsOnDemandHotspotsScalarResponse>> result =
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
        new GenericType<CommitmentsOnDemandHotspotsScalarResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsSavingsScalar. */
  public static class GetCommitmentsSavingsScalarOptionalParameters {
    private String filterBy;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsSavingsScalarOptionalParameters
     */
    public GetCommitmentsSavingsScalarOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }
  }

  /**
   * Get commitments savings (scalar).
   *
   * <p>See {@link #getCommitmentsSavingsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsSavingsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsSavingsScalarResponse getCommitmentsSavingsScalar(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsSavingsScalarWithHttpInfo(
            provider, product, start, end, new GetCommitmentsSavingsScalarOptionalParameters())
        .getData();
  }

  /**
   * Get commitments savings (scalar).
   *
   * <p>See {@link #getCommitmentsSavingsScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsSavingsScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsSavingsScalarResponse> getCommitmentsSavingsScalarAsync(
      CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsSavingsScalarWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsSavingsScalarOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments savings (scalar).
   *
   * <p>See {@link #getCommitmentsSavingsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsSavingsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsSavingsScalarResponse getCommitmentsSavingsScalar(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsSavingsScalarOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsSavingsScalarWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments savings (scalar).
   *
   * <p>See {@link #getCommitmentsSavingsScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsSavingsScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsSavingsScalarResponse> getCommitmentsSavingsScalarAsync(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsSavingsScalarOptionalParameters parameters) {
    return getCommitmentsSavingsScalarWithHttpInfoAsync(provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get scalar savings metrics for cloud commitment programs, including realized savings and
   * effective savings rate.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsSavingsScalarResponse&gt;
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
  public ApiResponse<CommitmentsSavingsScalarResponse> getCommitmentsSavingsScalarWithHttpInfo(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsSavingsScalarOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsSavingsScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling getCommitmentsSavingsScalar");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400, "Missing the required parameter 'product' when calling getCommitmentsSavingsScalar");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400, "Missing the required parameter 'start' when calling getCommitmentsSavingsScalar");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400, "Missing the required parameter 'end' when calling getCommitmentsSavingsScalar");
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/savings/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsSavingsScalar",
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
        new GenericType<CommitmentsSavingsScalarResponse>() {});
  }

  /**
   * Get commitments savings (scalar).
   *
   * <p>See {@link #getCommitmentsSavingsScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsSavingsScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>>
      getCommitmentsSavingsScalarWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsSavingsScalarOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsSavingsScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsSavingsScalar"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling getCommitmentsSavingsScalar"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling getCommitmentsSavingsScalar"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling getCommitmentsSavingsScalar"));
      return result;
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/savings/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsSavingsScalar",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsSavingsScalarResponse>> result =
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
        new GenericType<CommitmentsSavingsScalarResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsSavingsTimeseries. */
  public static class GetCommitmentsSavingsTimeseriesOptionalParameters {
    private String filterBy;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsSavingsTimeseriesOptionalParameters
     */
    public GetCommitmentsSavingsTimeseriesOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }
  }

  /**
   * Get commitments savings (timeseries).
   *
   * <p>See {@link #getCommitmentsSavingsTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsSavingsTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsSavingsTimeseriesResponse getCommitmentsSavingsTimeseries(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsSavingsTimeseriesWithHttpInfo(
            provider, product, start, end, new GetCommitmentsSavingsTimeseriesOptionalParameters())
        .getData();
  }

  /**
   * Get commitments savings (timeseries).
   *
   * <p>See {@link #getCommitmentsSavingsTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsSavingsTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsSavingsTimeseriesResponse>
      getCommitmentsSavingsTimeseriesAsync(
          CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsSavingsTimeseriesWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsSavingsTimeseriesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments savings (timeseries).
   *
   * <p>See {@link #getCommitmentsSavingsTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsSavingsTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsSavingsTimeseriesResponse getCommitmentsSavingsTimeseries(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsSavingsTimeseriesOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsSavingsTimeseriesWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments savings (timeseries).
   *
   * <p>See {@link #getCommitmentsSavingsTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsSavingsTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsSavingsTimeseriesResponse>
      getCommitmentsSavingsTimeseriesAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsSavingsTimeseriesOptionalParameters parameters) {
    return getCommitmentsSavingsTimeseriesWithHttpInfoAsync(
            provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get timeseries savings metrics for cloud commitment programs, including actual cost, on-demand
   * equivalent cost, realized savings, and effective savings rate over time.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsSavingsTimeseriesResponse&gt;
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
  public ApiResponse<CommitmentsSavingsTimeseriesResponse>
      getCommitmentsSavingsTimeseriesWithHttpInfo(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsSavingsTimeseriesOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsSavingsTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling getCommitmentsSavingsTimeseries");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling getCommitmentsSavingsTimeseries");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'start' when calling getCommitmentsSavingsTimeseries");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400, "Missing the required parameter 'end' when calling getCommitmentsSavingsTimeseries");
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/savings/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsSavingsTimeseries",
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
        new GenericType<CommitmentsSavingsTimeseriesResponse>() {});
  }

  /**
   * Get commitments savings (timeseries).
   *
   * <p>See {@link #getCommitmentsSavingsTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsSavingsTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>>
      getCommitmentsSavingsTimeseriesWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsSavingsTimeseriesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsSavingsTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsSavingsTimeseries"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsSavingsTimeseries"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling"
                  + " getCommitmentsSavingsTimeseries"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling getCommitmentsSavingsTimeseries"));
      return result;
    }
    String filterBy = parameters.filterBy;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/savings/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsSavingsTimeseries",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsSavingsTimeseriesResponse>> result =
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
        new GenericType<CommitmentsSavingsTimeseriesResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsUtilizationScalar. */
  public static class GetCommitmentsUtilizationScalarOptionalParameters {
    private String filterBy;
    private CommitmentsCommitmentType commitmentType;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsUtilizationScalarOptionalParameters
     */
    public GetCommitmentsUtilizationScalarOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }

    /**
     * Set commitmentType.
     *
     * @param commitmentType Type of commitment to query. ri for Reserved Instances, sp for Savings
     *     Plans. Defaults to ri. (optional)
     * @return GetCommitmentsUtilizationScalarOptionalParameters
     */
    public GetCommitmentsUtilizationScalarOptionalParameters commitmentType(
        CommitmentsCommitmentType commitmentType) {
      this.commitmentType = commitmentType;
      return this;
    }
  }

  /**
   * Get commitments utilization (scalar).
   *
   * <p>See {@link #getCommitmentsUtilizationScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsUtilizationScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsUtilizationScalarResponse getCommitmentsUtilizationScalar(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsUtilizationScalarWithHttpInfo(
            provider, product, start, end, new GetCommitmentsUtilizationScalarOptionalParameters())
        .getData();
  }

  /**
   * Get commitments utilization (scalar).
   *
   * <p>See {@link #getCommitmentsUtilizationScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsUtilizationScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsUtilizationScalarResponse>
      getCommitmentsUtilizationScalarAsync(
          CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsUtilizationScalarWithHttpInfoAsync(
            provider, product, start, end, new GetCommitmentsUtilizationScalarOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments utilization (scalar).
   *
   * <p>See {@link #getCommitmentsUtilizationScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsUtilizationScalarResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsUtilizationScalarResponse getCommitmentsUtilizationScalar(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsUtilizationScalarOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsUtilizationScalarWithHttpInfo(provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments utilization (scalar).
   *
   * <p>See {@link #getCommitmentsUtilizationScalarWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsUtilizationScalarResponse&gt;
   */
  public CompletableFuture<CommitmentsUtilizationScalarResponse>
      getCommitmentsUtilizationScalarAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationScalarOptionalParameters parameters) {
    return getCommitmentsUtilizationScalarWithHttpInfoAsync(
            provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get scalar utilization metrics for cloud commitment programs, including utilization percentage
   * and unused cost.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsUtilizationScalarResponse&gt;
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
  public ApiResponse<CommitmentsUtilizationScalarResponse>
      getCommitmentsUtilizationScalarWithHttpInfo(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationScalarOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsUtilizationScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling getCommitmentsUtilizationScalar");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling getCommitmentsUtilizationScalar");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'start' when calling getCommitmentsUtilizationScalar");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400, "Missing the required parameter 'end' when calling getCommitmentsUtilizationScalar");
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/utilization/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsUtilizationScalar",
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
        new GenericType<CommitmentsUtilizationScalarResponse>() {});
  }

  /**
   * Get commitments utilization (scalar).
   *
   * <p>See {@link #getCommitmentsUtilizationScalarWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsUtilizationScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>>
      getCommitmentsUtilizationScalarWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationScalarOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsUtilizationScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsUtilizationScalar"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsUtilizationScalar"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling"
                  + " getCommitmentsUtilizationScalar"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling getCommitmentsUtilizationScalar"));
      return result;
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/utilization/scalar";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsUtilizationScalar",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationScalarResponse>> result =
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
        new GenericType<CommitmentsUtilizationScalarResponse>() {});
  }

  /** Manage optional parameters to getCommitmentsUtilizationTimeseries. */
  public static class GetCommitmentsUtilizationTimeseriesOptionalParameters {
    private String filterBy;
    private CommitmentsCommitmentType commitmentType;

    /**
     * Set filterBy.
     *
     * @param filterBy Optional filter expression to narrow down results. (optional)
     * @return GetCommitmentsUtilizationTimeseriesOptionalParameters
     */
    public GetCommitmentsUtilizationTimeseriesOptionalParameters filterBy(String filterBy) {
      this.filterBy = filterBy;
      return this;
    }

    /**
     * Set commitmentType.
     *
     * @param commitmentType Type of commitment to query. ri for Reserved Instances, sp for Savings
     *     Plans. Defaults to ri. (optional)
     * @return GetCommitmentsUtilizationTimeseriesOptionalParameters
     */
    public GetCommitmentsUtilizationTimeseriesOptionalParameters commitmentType(
        CommitmentsCommitmentType commitmentType) {
      this.commitmentType = commitmentType;
      return this;
    }
  }

  /**
   * Get commitments utilization (timeseries).
   *
   * <p>See {@link #getCommitmentsUtilizationTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CommitmentsUtilizationTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsUtilizationTimeseriesResponse getCommitmentsUtilizationTimeseries(
      CommitmentsProvider provider, String product, Long start, Long end) throws ApiException {
    return getCommitmentsUtilizationTimeseriesWithHttpInfo(
            provider,
            product,
            start,
            end,
            new GetCommitmentsUtilizationTimeseriesOptionalParameters())
        .getData();
  }

  /**
   * Get commitments utilization (timeseries).
   *
   * <p>See {@link #getCommitmentsUtilizationTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @return CompletableFuture&lt;CommitmentsUtilizationTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsUtilizationTimeseriesResponse>
      getCommitmentsUtilizationTimeseriesAsync(
          CommitmentsProvider provider, String product, Long start, Long end) {
    return getCommitmentsUtilizationTimeseriesWithHttpInfoAsync(
            provider,
            product,
            start,
            end,
            new GetCommitmentsUtilizationTimeseriesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get commitments utilization (timeseries).
   *
   * <p>See {@link #getCommitmentsUtilizationTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CommitmentsUtilizationTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public CommitmentsUtilizationTimeseriesResponse getCommitmentsUtilizationTimeseries(
      CommitmentsProvider provider,
      String product,
      Long start,
      Long end,
      GetCommitmentsUtilizationTimeseriesOptionalParameters parameters)
      throws ApiException {
    return getCommitmentsUtilizationTimeseriesWithHttpInfo(
            provider, product, start, end, parameters)
        .getData();
  }

  /**
   * Get commitments utilization (timeseries).
   *
   * <p>See {@link #getCommitmentsUtilizationTimeseriesWithHttpInfoAsync}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CommitmentsUtilizationTimeseriesResponse&gt;
   */
  public CompletableFuture<CommitmentsUtilizationTimeseriesResponse>
      getCommitmentsUtilizationTimeseriesAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationTimeseriesOptionalParameters parameters) {
    return getCommitmentsUtilizationTimeseriesWithHttpInfoAsync(
            provider, product, start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get timeseries utilization metrics for cloud commitment programs, including used and unused
   * cost series over time.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CommitmentsUtilizationTimeseriesResponse&gt;
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
  public ApiResponse<CommitmentsUtilizationTimeseriesResponse>
      getCommitmentsUtilizationTimeseriesWithHttpInfo(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationTimeseriesOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsUtilizationTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'provider' when calling"
              + " getCommitmentsUtilizationTimeseries");
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'product' when calling"
              + " getCommitmentsUtilizationTimeseries");
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'start' when calling"
              + " getCommitmentsUtilizationTimeseries");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'end' when calling getCommitmentsUtilizationTimeseries");
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/utilization/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCommitmentsUtilizationTimeseries",
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
        new GenericType<CommitmentsUtilizationTimeseriesResponse>() {});
  }

  /**
   * Get commitments utilization (timeseries).
   *
   * <p>See {@link #getCommitmentsUtilizationTimeseriesWithHttpInfo}.
   *
   * @param provider Cloud provider for commitment programs (aws or azure). (required)
   * @param product Cloud product identifier (for example, ec2, rds, virtualmachines). (required)
   * @param start Start of the query time range in Unix milliseconds. (required)
   * @param end End of the query time range in Unix milliseconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CommitmentsUtilizationTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>>
      getCommitmentsUtilizationTimeseriesWithHttpInfoAsync(
          CommitmentsProvider provider,
          String product,
          Long start,
          Long end,
          GetCommitmentsUtilizationTimeseriesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCommitmentsUtilizationTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'provider' is set
    if (provider == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'provider' when calling"
                  + " getCommitmentsUtilizationTimeseries"));
      return result;
    }

    // verify the required parameter 'product' is set
    if (product == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'product' when calling"
                  + " getCommitmentsUtilizationTimeseries"));
      return result;
    }

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'start' when calling"
                  + " getCommitmentsUtilizationTimeseries"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'end' when calling"
                  + " getCommitmentsUtilizationTimeseries"));
      return result;
    }
    String filterBy = parameters.filterBy;
    CommitmentsCommitmentType commitmentType = parameters.commitmentType;
    // create path and map variables
    String localVarPath = "/api/v2/cost/commitments/utilization/timeseries";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitmentType", commitmentType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCommitmentsUtilizationTimeseries",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CommitmentsUtilizationTimeseriesResponse>> result =
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
        new GenericType<CommitmentsUtilizationTimeseriesResponse>() {});
  }

  /**
   * Get cost anomaly.
   *
   * <p>See {@link #getCostAnomalyWithHttpInfo}.
   *
   * @param anomalyId The UUID of the cost anomaly. (required)
   * @return CostAnomalyResponse
   * @throws ApiException if fails to make API call
   */
  public CostAnomalyResponse getCostAnomaly(String anomalyId) throws ApiException {
    return getCostAnomalyWithHttpInfo(anomalyId).getData();
  }

  /**
   * Get cost anomaly.
   *
   * <p>See {@link #getCostAnomalyWithHttpInfoAsync}.
   *
   * @param anomalyId The UUID of the cost anomaly. (required)
   * @return CompletableFuture&lt;CostAnomalyResponse&gt;
   */
  public CompletableFuture<CostAnomalyResponse> getCostAnomalyAsync(String anomalyId) {
    return getCostAnomalyWithHttpInfoAsync(anomalyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a detected Cloud Cost Management anomaly by UUID.
   *
   * @param anomalyId The UUID of the cost anomaly. (required)
   * @return ApiResponse&lt;CostAnomalyResponse&gt;
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
  public ApiResponse<CostAnomalyResponse> getCostAnomalyWithHttpInfo(String anomalyId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCostAnomaly";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'anomalyId' is set
    if (anomalyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'anomalyId' when calling getCostAnomaly");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/anomalies/{anomaly_id}"
            .replaceAll("\\{" + "anomaly_id" + "\\}", apiClient.escapeString(anomalyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostAnomaly",
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
        new GenericType<CostAnomalyResponse>() {});
  }

  /**
   * Get cost anomaly.
   *
   * <p>See {@link #getCostAnomalyWithHttpInfo}.
   *
   * @param anomalyId The UUID of the cost anomaly. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CostAnomalyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostAnomalyResponse>> getCostAnomalyWithHttpInfoAsync(
      String anomalyId) {
    // Check if unstable operation is enabled
    String operationId = "getCostAnomaly";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostAnomalyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'anomalyId' is set
    if (anomalyId == null) {
      CompletableFuture<ApiResponse<CostAnomalyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'anomalyId' when calling getCostAnomaly"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/anomalies/{anomaly_id}"
            .replaceAll("\\{" + "anomaly_id" + "\\}", apiClient.escapeString(anomalyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostAnomaly",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostAnomalyResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostAnomalyResponse>() {});
  }

  /**
   * Get cost AWS CUR config.
   *
   * <p>See {@link #getCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return AwsCurConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCurConfigResponse getCostAWSCURConfig(Long cloudAccountId) throws ApiException {
    return getCostAWSCURConfigWithHttpInfo(cloudAccountId).getData();
  }

  /**
   * Get cost AWS CUR config.
   *
   * <p>See {@link #getCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;AwsCurConfigResponse&gt;
   */
  public CompletableFuture<AwsCurConfigResponse> getCostAWSCURConfigAsync(Long cloudAccountId) {
    return getCostAWSCURConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific AWS CUR config.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return ApiResponse&lt;AwsCurConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsCurConfigResponse> getCostAWSCURConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'cloudAccountId' when calling getCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostAWSCURConfig",
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
        new GenericType<AwsCurConfigResponse>() {});
  }

  /**
   * Get cost AWS CUR config.
   *
   * <p>See {@link #getCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCurConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCurConfigResponse>> getCostAWSCURConfigWithHttpInfoAsync(
      Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<AwsCurConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling getCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCurConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsCurConfigResponse>() {});
  }

  /**
   * Get cost Azure UC config.
   *
   * <p>See {@link #getCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return UCConfigPair
   * @throws ApiException if fails to make API call
   */
  public UCConfigPair getCostAzureUCConfig(Long cloudAccountId) throws ApiException {
    return getCostAzureUCConfigWithHttpInfo(cloudAccountId).getData();
  }

  /**
   * Get cost Azure UC config.
   *
   * <p>See {@link #getCostAzureUCConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;UCConfigPair&gt;
   */
  public CompletableFuture<UCConfigPair> getCostAzureUCConfigAsync(Long cloudAccountId) {
    return getCostAzureUCConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific Azure config.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return ApiResponse&lt;UCConfigPair&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UCConfigPair> getCostAzureUCConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'cloudAccountId' when calling getCostAzureUCConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostAzureUCConfig",
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
        new GenericType<UCConfigPair>() {});
  }

  /**
   * Get cost Azure UC config.
   *
   * <p>See {@link #getCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UCConfigPair&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UCConfigPair>> getCostAzureUCConfigWithHttpInfoAsync(
      Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<UCConfigPair>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling getCostAzureUCConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostAzureUCConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UCConfigPair>> result = new CompletableFuture<>();
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
        new GenericType<UCConfigPair>() {});
  }

  /**
   * Get Google Cloud Usage Cost config.
   *
   * <p>See {@link #getCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return GcpUcConfigResponse
   * @throws ApiException if fails to make API call
   */
  public GcpUcConfigResponse getCostGCPUsageCostConfig(Long cloudAccountId) throws ApiException {
    return getCostGCPUsageCostConfigWithHttpInfo(cloudAccountId).getData();
  }

  /**
   * Get Google Cloud Usage Cost config.
   *
   * <p>See {@link #getCostGCPUsageCostConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;GcpUcConfigResponse&gt;
   */
  public CompletableFuture<GcpUcConfigResponse> getCostGCPUsageCostConfigAsync(
      Long cloudAccountId) {
    return getCostGCPUsageCostConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific Google Cloud Usage Cost config.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return ApiResponse&lt;GcpUcConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GcpUcConfigResponse> getCostGCPUsageCostConfigWithHttpInfo(Long cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling getCostGCPUsageCostConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostGCPUsageCostConfig",
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
        new GenericType<GcpUcConfigResponse>() {});
  }

  /**
   * Get Google Cloud Usage Cost config.
   *
   * <p>See {@link #getCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId The unique identifier of the cloud account (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GcpUcConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GcpUcConfigResponse>>
      getCostGCPUsageCostConfigWithHttpInfoAsync(Long cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<GcpUcConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " getCostGCPUsageCostConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostGCPUsageCostConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GcpUcConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<GcpUcConfigResponse>() {});
  }

  /** Manage optional parameters to getCostTagDescriptionByKey. */
  public static class GetCostTagDescriptionByKeyOptionalParameters {
    private String filterCloud;

    /**
     * Set filterCloud.
     *
     * @param filterCloud Cloud provider to scope the lookup to (for example, <code>aws</code>).
     *     Omit to use the resolved fallback. (optional)
     * @return GetCostTagDescriptionByKeyOptionalParameters
     */
    public GetCostTagDescriptionByKeyOptionalParameters filterCloud(String filterCloud) {
      this.filterCloud = filterCloud;
      return this;
    }
  }

  /**
   * Get a Cloud Cost Management tag description.
   *
   * <p>See {@link #getCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @return CostTagDescriptionResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagDescriptionResponse getCostTagDescriptionByKey(String tagKey) throws ApiException {
    return getCostTagDescriptionByKeyWithHttpInfo(
            tagKey, new GetCostTagDescriptionByKeyOptionalParameters())
        .getData();
  }

  /**
   * Get a Cloud Cost Management tag description.
   *
   * <p>See {@link #getCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @return CompletableFuture&lt;CostTagDescriptionResponse&gt;
   */
  public CompletableFuture<CostTagDescriptionResponse> getCostTagDescriptionByKeyAsync(
      String tagKey) {
    return getCostTagDescriptionByKeyWithHttpInfoAsync(
            tagKey, new GetCostTagDescriptionByKeyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Cloud Cost Management tag description.
   *
   * <p>See {@link #getCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @param parameters Optional parameters for the request.
   * @return CostTagDescriptionResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagDescriptionResponse getCostTagDescriptionByKey(
      String tagKey, GetCostTagDescriptionByKeyOptionalParameters parameters) throws ApiException {
    return getCostTagDescriptionByKeyWithHttpInfo(tagKey, parameters).getData();
  }

  /**
   * Get a Cloud Cost Management tag description.
   *
   * <p>See {@link #getCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagDescriptionResponse&gt;
   */
  public CompletableFuture<CostTagDescriptionResponse> getCostTagDescriptionByKeyAsync(
      String tagKey, GetCostTagDescriptionByKeyOptionalParameters parameters) {
    return getCostTagDescriptionByKeyWithHttpInfoAsync(tagKey, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the Cloud Cost Management description for a single tag key. Use <code>filter[cloud]</code>
   * to scope the lookup to a specific cloud provider; when omitted, the response resolves the
   * description in fallback order (cloud-specific organization override, then cloudless
   * organization default, then Datadog's global default).
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagDescriptionResponse&gt;
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
  public ApiResponse<CostTagDescriptionResponse> getCostTagDescriptionByKeyWithHttpInfo(
      String tagKey, GetCostTagDescriptionByKeyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tagKey' when calling getCostTagDescriptionByKey");
    }
    String filterCloud = parameters.filterCloud;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cloud]", filterCloud));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostTagDescriptionByKey",
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
        new GenericType<CostTagDescriptionResponse>() {});
  }

  /**
   * Get a Cloud Cost Management tag description.
   *
   * <p>See {@link #getCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being fetched. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagDescriptionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagDescriptionResponse>>
      getCostTagDescriptionByKeyWithHttpInfoAsync(
          String tagKey, GetCostTagDescriptionByKeyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      CompletableFuture<ApiResponse<CostTagDescriptionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tagKey' when calling getCostTagDescriptionByKey"));
      return result;
    }
    String filterCloud = parameters.filterCloud;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cloud]", filterCloud));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostTagDescriptionByKey",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagDescriptionResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagDescriptionResponse>() {});
  }

  /** Manage optional parameters to getCostTagKey. */
  public static class GetCostTagKeyOptionalParameters {
    private String filterMetric;
    private Integer pageSize;

    /**
     * Set filterMetric.
     *
     * @param filterMetric The Cloud Cost Management metric to scope the tag key details to. When
     *     omitted, returns details across all metrics. (optional)
     * @return GetCostTagKeyOptionalParameters
     */
    public GetCostTagKeyOptionalParameters filterMetric(String filterMetric) {
      this.filterMetric = filterMetric;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Controls the size of the internal tag value search scope. This does
     *     <strong>not</strong> restrict the number of example tag values returned in the response.
     *     Defaults to 50, maximum 10000. (optional, default to 50)
     * @return GetCostTagKeyOptionalParameters
     */
    public GetCostTagKeyOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * Get a Cloud Cost Management tag key.
   *
   * <p>See {@link #getCostTagKeyWithHttpInfo}.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @return CostTagKeyResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeyResponse getCostTagKey(String tagKey) throws ApiException {
    return getCostTagKeyWithHttpInfo(tagKey, new GetCostTagKeyOptionalParameters()).getData();
  }

  /**
   * Get a Cloud Cost Management tag key.
   *
   * <p>See {@link #getCostTagKeyWithHttpInfoAsync}.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @return CompletableFuture&lt;CostTagKeyResponse&gt;
   */
  public CompletableFuture<CostTagKeyResponse> getCostTagKeyAsync(String tagKey) {
    return getCostTagKeyWithHttpInfoAsync(tagKey, new GetCostTagKeyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Cloud Cost Management tag key.
   *
   * <p>See {@link #getCostTagKeyWithHttpInfo}.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @param parameters Optional parameters for the request.
   * @return CostTagKeyResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeyResponse getCostTagKey(String tagKey, GetCostTagKeyOptionalParameters parameters)
      throws ApiException {
    return getCostTagKeyWithHttpInfo(tagKey, parameters).getData();
  }

  /**
   * Get a Cloud Cost Management tag key.
   *
   * <p>See {@link #getCostTagKeyWithHttpInfoAsync}.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagKeyResponse&gt;
   */
  public CompletableFuture<CostTagKeyResponse> getCostTagKeyAsync(
      String tagKey, GetCostTagKeyOptionalParameters parameters) {
    return getCostTagKeyWithHttpInfoAsync(tagKey, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details for a specific Cloud Cost Management tag key, including example tag values and
   * description.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagKeyResponse&gt;
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
  public ApiResponse<CostTagKeyResponse> getCostTagKeyWithHttpInfo(
      String tagKey, GetCostTagKeyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tagKey' when calling getCostTagKey");
    }
    String filterMetric = parameters.filterMetric;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_keys/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostTagKey",
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
        new GenericType<CostTagKeyResponse>() {});
  }

  /**
   * Get a Cloud Cost Management tag key.
   *
   * <p>See {@link #getCostTagKeyWithHttpInfo}.
   *
   * @param tagKey The Cloud Cost Management tag key. Tag keys can contain forward slashes (for
   *     example, <code>kubernetes/instance</code>). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagKeyResponse>> getCostTagKeyWithHttpInfoAsync(
      String tagKey, GetCostTagKeyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      CompletableFuture<ApiResponse<CostTagKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'tagKey' when calling getCostTagKey"));
      return result;
    }
    String filterMetric = parameters.filterMetric;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_keys/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostTagKey",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagKeyResponse>() {});
  }

  /** Manage optional parameters to getCostTagMetadataCurrency. */
  public static class GetCostTagMetadataCurrencyOptionalParameters {
    private String filterProvider;

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter results to a specific provider. Common cloud values are <code>
     *     aws</code>, <code>azure</code>, <code>gcp</code>, <code>Oracle</code> (OCI), and <code>
     *     custom</code>. SaaS billing integrations (for example, <code>Snowflake</code>, <code>
     *     MongoDB</code>, <code>Databricks</code>) are also accepted using their display-name
     *     string. Values are case-sensitive. (optional)
     * @return GetCostTagMetadataCurrencyOptionalParameters
     */
    public GetCostTagMetadataCurrencyOptionalParameters filterProvider(String filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }
  }

  /**
   * Get the Cloud Cost Management billing currency.
   *
   * <p>See {@link #getCostTagMetadataCurrencyWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CostCurrencyResponse
   * @throws ApiException if fails to make API call
   */
  public CostCurrencyResponse getCostTagMetadataCurrency(String filterMonth) throws ApiException {
    return getCostTagMetadataCurrencyWithHttpInfo(
            filterMonth, new GetCostTagMetadataCurrencyOptionalParameters())
        .getData();
  }

  /**
   * Get the Cloud Cost Management billing currency.
   *
   * <p>See {@link #getCostTagMetadataCurrencyWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CompletableFuture&lt;CostCurrencyResponse&gt;
   */
  public CompletableFuture<CostCurrencyResponse> getCostTagMetadataCurrencyAsync(
      String filterMonth) {
    return getCostTagMetadataCurrencyWithHttpInfoAsync(
            filterMonth, new GetCostTagMetadataCurrencyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the Cloud Cost Management billing currency.
   *
   * <p>See {@link #getCostTagMetadataCurrencyWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CostCurrencyResponse
   * @throws ApiException if fails to make API call
   */
  public CostCurrencyResponse getCostTagMetadataCurrency(
      String filterMonth, GetCostTagMetadataCurrencyOptionalParameters parameters)
      throws ApiException {
    return getCostTagMetadataCurrencyWithHttpInfo(filterMonth, parameters).getData();
  }

  /**
   * Get the Cloud Cost Management billing currency.
   *
   * <p>See {@link #getCostTagMetadataCurrencyWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostCurrencyResponse&gt;
   */
  public CompletableFuture<CostCurrencyResponse> getCostTagMetadataCurrencyAsync(
      String filterMonth, GetCostTagMetadataCurrencyOptionalParameters parameters) {
    return getCostTagMetadataCurrencyWithHttpInfoAsync(filterMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the dominant billing currency observed in Cloud Cost Management data for the requested
   * period. The response wraps the currency in a JSON:API <code>data</code> array containing at
   * most one entry; the array is empty when no currency data is available.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostCurrencyResponse&gt;
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
  public ApiResponse<CostCurrencyResponse> getCostTagMetadataCurrencyWithHttpInfo(
      String filterMonth, GetCostTagMetadataCurrencyOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCostTagMetadataCurrency";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterMonth' when calling getCostTagMetadataCurrency");
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/currency";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCostTagMetadataCurrency",
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
        new GenericType<CostCurrencyResponse>() {});
  }

  /**
   * Get the Cloud Cost Management billing currency.
   *
   * <p>See {@link #getCostTagMetadataCurrencyWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostCurrencyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostCurrencyResponse>>
      getCostTagMetadataCurrencyWithHttpInfoAsync(
          String filterMonth, GetCostTagMetadataCurrencyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCostTagMetadataCurrency";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostCurrencyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      CompletableFuture<ApiResponse<CostCurrencyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterMonth' when calling"
                  + " getCostTagMetadataCurrency"));
      return result;
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/currency";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCostTagMetadataCurrency",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostCurrencyResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostCurrencyResponse>() {});
  }

  /**
   * Get custom allocation rule.
   *
   * <p>See {@link #getCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return ArbitraryRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ArbitraryRuleResponse getCustomAllocationRule(Long ruleId) throws ApiException {
    return getCustomAllocationRuleWithHttpInfo(ruleId).getData();
  }

  /**
   * Get custom allocation rule.
   *
   * <p>See {@link #getCustomAllocationRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return CompletableFuture&lt;ArbitraryRuleResponse&gt;
   */
  public CompletableFuture<ArbitraryRuleResponse> getCustomAllocationRuleAsync(Long ruleId) {
    return getCustomAllocationRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific custom allocation rule - Retrieve a specific custom allocation rule by its ID
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return ApiResponse&lt;ArbitraryRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArbitraryRuleResponse> getCustomAllocationRuleWithHttpInfo(Long ruleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getCustomAllocationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCustomAllocationRule",
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Get custom allocation rule.
   *
   * <p>See {@link #getCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ArbitraryRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArbitraryRuleResponse>>
      getCustomAllocationRuleWithHttpInfoAsync(Long ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getCustomAllocationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCustomAllocationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CustomCostsFileGetResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileGetResponse getCustomCostsFile(String fileId) throws ApiException {
    return getCustomCostsFileWithHttpInfo(fileId).getData();
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfoAsync}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;CustomCostsFileGetResponse&gt;
   */
  public CompletableFuture<CustomCostsFileGetResponse> getCustomCostsFileAsync(String fileId) {
    return getCustomCostsFileWithHttpInfoAsync(fileId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetch the specified Custom Costs file.
   *
   * @param fileId File ID. (required)
   * @return ApiResponse&lt;CustomCostsFileGetResponse&gt;
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
  public ApiResponse<CustomCostsFileGetResponse> getCustomCostsFileWithHttpInfo(String fileId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fileId' when calling getCustomCostsFile");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCustomCostsFile",
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
        new GenericType<CustomCostsFileGetResponse>() {});
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileGetResponse>>
      getCustomCostsFileWithHttpInfoAsync(String fileId) {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      CompletableFuture<ApiResponse<CustomCostsFileGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fileId' when calling getCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCustomCostsFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileGetResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomCostsFileGetResponse>() {});
  }

  /**
   * Get a tag pipeline ruleset.
   *
   * <p>See {@link #getTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return RulesetResp
   * @throws ApiException if fails to make API call
   */
  public RulesetResp getTagPipelinesRuleset(String rulesetId) throws ApiException {
    return getTagPipelinesRulesetWithHttpInfo(rulesetId).getData();
  }

  /**
   * Get a tag pipeline ruleset.
   *
   * <p>See {@link #getTagPipelinesRulesetWithHttpInfoAsync}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return CompletableFuture&lt;RulesetResp&gt;
   */
  public CompletableFuture<RulesetResp> getTagPipelinesRulesetAsync(String rulesetId) {
    return getTagPipelinesRulesetWithHttpInfoAsync(rulesetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific tag pipeline ruleset - Retrieve a specific tag pipeline ruleset by its ID
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return ApiResponse&lt;RulesetResp&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesetResp> getTagPipelinesRulesetWithHttpInfo(String rulesetId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetId' when calling getTagPipelinesRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getTagPipelinesRuleset",
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * Get a tag pipeline ruleset.
   *
   * <p>See {@link #getTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RulesetResp&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesetResp>> getTagPipelinesRulesetWithHttpInfoAsync(
      String rulesetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetId' when calling getTagPipelinesRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getTagPipelinesRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * List budgets.
   *
   * <p>See {@link #listBudgetsWithHttpInfo}.
   *
   * @return BudgetArray
   * @throws ApiException if fails to make API call
   */
  public BudgetArray listBudgets() throws ApiException {
    return listBudgetsWithHttpInfo().getData();
  }

  /**
   * List budgets.
   *
   * <p>See {@link #listBudgetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;BudgetArray&gt;
   */
  public CompletableFuture<BudgetArray> listBudgetsAsync() {
    return listBudgetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List budgets.
   *
   * @return ApiResponse&lt;BudgetArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BudgetArray> listBudgetsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listBudgets",
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
        new GenericType<BudgetArray>() {});
  }

  /**
   * List budgets.
   *
   * <p>See {@link #listBudgetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;BudgetArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BudgetArray>> listBudgetsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/budgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listBudgets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BudgetArray>> result = new CompletableFuture<>();
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
        new GenericType<BudgetArray>() {});
  }

  /** Manage optional parameters to listCostAnomalies. */
  public static class ListCostAnomaliesOptionalParameters {
    private Long start;
    private Long end;
    private String filter;
    private String minAnomalousThreshold;
    private String minCostThreshold;
    private String dismissalCause;
    private String orderBy;
    private String order;
    private Integer limit;
    private Integer offset;
    private List<String> providerIds;

    /**
     * Set start.
     *
     * @param start Start time as Unix milliseconds. Defaults to the start of the latest stable
     *     seven-day window. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set end.
     *
     * @param end End time as Unix milliseconds. Defaults to the end of the latest stable seven-day
     *     window. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters end(Long end) {
      this.end = end;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Optional JSON object mapping cost tag keys to allowed values, for example
     *     <code>{"team":["payments"],"env":["prod"]}</code>. Filters match anomaly dimensions or
     *     correlated tags. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set minAnomalousThreshold.
     *
     * @param minAnomalousThreshold Minimum absolute anomalous cost change to include. Numeric
     *     value; defaults to <code>1</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters minAnomalousThreshold(String minAnomalousThreshold) {
      this.minAnomalousThreshold = minAnomalousThreshold;
      return this;
    }

    /**
     * Set minCostThreshold.
     *
     * @param minCostThreshold Minimum absolute actual cost to include. Numeric value; defaults to
     *     <code>0</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters minCostThreshold(String minCostThreshold) {
      this.minCostThreshold = minCostThreshold;
      return this;
    }

    /**
     * Set dismissalCause.
     *
     * @param dismissalCause Filter by resolution state. Use <code>none</code> for unresolved
     *     anomalies, <code>all</code> or <code>*</code> for resolved anomalies, or a
     *     comma-separated list of causes. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters dismissalCause(String dismissalCause) {
      this.dismissalCause = dismissalCause;
      return this;
    }

    /**
     * Set orderBy.
     *
     * @param orderBy Sort field. One of <code>start_date</code>, <code>end_date</code>, <code>
     *     duration</code>, <code>max_cost</code>, <code>anomalous_cost</code>, or <code>
     *     dismissal_date</code>. Defaults to <code>anomalous_cost</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters orderBy(String orderBy) {
      this.orderBy = orderBy;
      return this;
    }

    /**
     * Set order.
     *
     * @param order Sort direction. One of <code>asc</code> or <code>desc</code>. Defaults to <code>
     *     desc</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of anomalies to return. Defaults to <code>200</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Pagination offset. Defaults to <code>0</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters offset(Integer offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set providerIds.
     *
     * @param providerIds Optional repeated cloud or SaaS provider filters, such as <code>aws</code>
     *     , <code>gcp</code>, <code>azure</code>, <code>Oracle</code>, <code>datadog</code>, <code>
     *     OpenAI</code>, or <code>Anthropic</code>. (optional)
     * @return ListCostAnomaliesOptionalParameters
     */
    public ListCostAnomaliesOptionalParameters providerIds(List<String> providerIds) {
      this.providerIds = providerIds;
      return this;
    }
  }

  /**
   * List cost anomalies.
   *
   * <p>See {@link #listCostAnomaliesWithHttpInfo}.
   *
   * @return CostAnomaliesResponse
   * @throws ApiException if fails to make API call
   */
  public CostAnomaliesResponse listCostAnomalies() throws ApiException {
    return listCostAnomaliesWithHttpInfo(new ListCostAnomaliesOptionalParameters()).getData();
  }

  /**
   * List cost anomalies.
   *
   * <p>See {@link #listCostAnomaliesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CostAnomaliesResponse&gt;
   */
  public CompletableFuture<CostAnomaliesResponse> listCostAnomaliesAsync() {
    return listCostAnomaliesWithHttpInfoAsync(new ListCostAnomaliesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List cost anomalies.
   *
   * <p>See {@link #listCostAnomaliesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CostAnomaliesResponse
   * @throws ApiException if fails to make API call
   */
  public CostAnomaliesResponse listCostAnomalies(ListCostAnomaliesOptionalParameters parameters)
      throws ApiException {
    return listCostAnomaliesWithHttpInfo(parameters).getData();
  }

  /**
   * List cost anomalies.
   *
   * <p>See {@link #listCostAnomaliesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostAnomaliesResponse&gt;
   */
  public CompletableFuture<CostAnomaliesResponse> listCostAnomaliesAsync(
      ListCostAnomaliesOptionalParameters parameters) {
    return listCostAnomaliesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List detected Cloud Cost Management anomalies for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostAnomaliesResponse&gt;
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
  public ApiResponse<CostAnomaliesResponse> listCostAnomaliesWithHttpInfo(
      ListCostAnomaliesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostAnomalies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long start = parameters.start;
    Long end = parameters.end;
    String filter = parameters.filter;
    String minAnomalousThreshold = parameters.minAnomalousThreshold;
    String minCostThreshold = parameters.minCostThreshold;
    String dismissalCause = parameters.dismissalCause;
    String orderBy = parameters.orderBy;
    String order = parameters.order;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    List<String> providerIds = parameters.providerIds;
    // create path and map variables
    String localVarPath = "/api/v2/cost/anomalies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "min_anomalous_threshold", minAnomalousThreshold));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "min_cost_threshold", minCostThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dismissal_cause", dismissalCause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "provider_ids", providerIds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostAnomalies",
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
        new GenericType<CostAnomaliesResponse>() {});
  }

  /**
   * List cost anomalies.
   *
   * <p>See {@link #listCostAnomaliesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostAnomaliesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostAnomaliesResponse>> listCostAnomaliesWithHttpInfoAsync(
      ListCostAnomaliesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCostAnomalies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostAnomaliesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long start = parameters.start;
    Long end = parameters.end;
    String filter = parameters.filter;
    String minAnomalousThreshold = parameters.minAnomalousThreshold;
    String minCostThreshold = parameters.minCostThreshold;
    String dismissalCause = parameters.dismissalCause;
    String orderBy = parameters.orderBy;
    String order = parameters.order;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    List<String> providerIds = parameters.providerIds;
    // create path and map variables
    String localVarPath = "/api/v2/cost/anomalies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "min_anomalous_threshold", minAnomalousThreshold));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "min_cost_threshold", minCostThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dismissal_cause", dismissalCause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "provider_ids", providerIds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostAnomalies",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostAnomaliesResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostAnomaliesResponse>() {});
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfo}.
   *
   * @return AwsCURConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCURConfigsResponse listCostAWSCURConfigs() throws ApiException {
    return listCostAWSCURConfigsWithHttpInfo().getData();
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsCURConfigsResponse&gt;
   */
  public CompletableFuture<AwsCURConfigsResponse> listCostAWSCURConfigsAsync() {
    return listCostAWSCURConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the AWS CUR configs.
   *
   * @return ApiResponse&lt;AwsCURConfigsResponse&gt;
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
  public ApiResponse<AwsCURConfigsResponse> listCostAWSCURConfigsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostAWSCURConfigs",
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
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCURConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCURConfigsResponse>>
      listCostAWSCURConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostAWSCURConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfo}.
   *
   * @return AzureUCConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigsResponse listCostAzureUCConfigs() throws ApiException {
    return listCostAzureUCConfigsWithHttpInfo().getData();
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AzureUCConfigsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigsResponse> listCostAzureUCConfigsAsync() {
    return listCostAzureUCConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Azure configs.
   *
   * @return ApiResponse&lt;AzureUCConfigsResponse&gt;
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
  public ApiResponse<AzureUCConfigsResponse> listCostAzureUCConfigsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostAzureUCConfigs",
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
        new GenericType<AzureUCConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigsResponse>>
      listCostAzureUCConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AzureUCConfigsResponse>() {});
  }

  /**
   * List Google Cloud Usage Cost configs.
   *
   * <p>See {@link #listCostGCPUsageCostConfigsWithHttpInfo}.
   *
   * @return GCPUsageCostConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public GCPUsageCostConfigsResponse listCostGCPUsageCostConfigs() throws ApiException {
    return listCostGCPUsageCostConfigsWithHttpInfo().getData();
  }

  /**
   * List Google Cloud Usage Cost configs.
   *
   * <p>See {@link #listCostGCPUsageCostConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GCPUsageCostConfigsResponse&gt;
   */
  public CompletableFuture<GCPUsageCostConfigsResponse> listCostGCPUsageCostConfigsAsync() {
    return listCostGCPUsageCostConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Google Cloud Usage Cost configs.
   *
   * @return ApiResponse&lt;GCPUsageCostConfigsResponse&gt;
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
  public ApiResponse<GCPUsageCostConfigsResponse> listCostGCPUsageCostConfigsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/gcp_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostGCPUsageCostConfigs",
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
        new GenericType<GCPUsageCostConfigsResponse>() {});
  }

  /**
   * List Google Cloud Usage Cost configs.
   *
   * <p>See {@link #listCostGCPUsageCostConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GCPUsageCostConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPUsageCostConfigsResponse>>
      listCostGCPUsageCostConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/gcp_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostGCPUsageCostConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigsResponse>> result =
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
        new GenericType<GCPUsageCostConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management OCI configs.
   *
   * <p>See {@link #listCostOCIConfigsWithHttpInfo}.
   *
   * @return OCIConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public OCIConfigsResponse listCostOCIConfigs() throws ApiException {
    return listCostOCIConfigsWithHttpInfo().getData();
  }

  /**
   * List Cloud Cost Management OCI configs.
   *
   * <p>See {@link #listCostOCIConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OCIConfigsResponse&gt;
   */
  public CompletableFuture<OCIConfigsResponse> listCostOCIConfigsAsync() {
    return listCostOCIConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the OCI configs.
   *
   * @return ApiResponse&lt;OCIConfigsResponse&gt;
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
  public ApiResponse<OCIConfigsResponse> listCostOCIConfigsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/oci_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostOCIConfigs",
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
        new GenericType<OCIConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management OCI configs.
   *
   * <p>See {@link #listCostOCIConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OCIConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OCIConfigsResponse>> listCostOCIConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/oci_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostOCIConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OCIConfigsResponse>> result = new CompletableFuture<>();
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
        new GenericType<OCIConfigsResponse>() {});
  }

  /** Manage optional parameters to listCostTagDescriptions. */
  public static class ListCostTagDescriptionsOptionalParameters {
    private String filterCloud;

    /**
     * Set filterCloud.
     *
     * @param filterCloud Filter descriptions to a specific cloud provider (for example, <code>aws
     *     </code>). Omit to return descriptions across all clouds. (optional)
     * @return ListCostTagDescriptionsOptionalParameters
     */
    public ListCostTagDescriptionsOptionalParameters filterCloud(String filterCloud) {
      this.filterCloud = filterCloud;
      return this;
    }
  }

  /**
   * List Cloud Cost Management tag descriptions.
   *
   * <p>See {@link #listCostTagDescriptionsWithHttpInfo}.
   *
   * @return CostTagDescriptionsResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagDescriptionsResponse listCostTagDescriptions() throws ApiException {
    return listCostTagDescriptionsWithHttpInfo(new ListCostTagDescriptionsOptionalParameters())
        .getData();
  }

  /**
   * List Cloud Cost Management tag descriptions.
   *
   * <p>See {@link #listCostTagDescriptionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CostTagDescriptionsResponse&gt;
   */
  public CompletableFuture<CostTagDescriptionsResponse> listCostTagDescriptionsAsync() {
    return listCostTagDescriptionsWithHttpInfoAsync(new ListCostTagDescriptionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag descriptions.
   *
   * <p>See {@link #listCostTagDescriptionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CostTagDescriptionsResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagDescriptionsResponse listCostTagDescriptions(
      ListCostTagDescriptionsOptionalParameters parameters) throws ApiException {
    return listCostTagDescriptionsWithHttpInfo(parameters).getData();
  }

  /**
   * List Cloud Cost Management tag descriptions.
   *
   * <p>See {@link #listCostTagDescriptionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagDescriptionsResponse&gt;
   */
  public CompletableFuture<CostTagDescriptionsResponse> listCostTagDescriptionsAsync(
      ListCostTagDescriptionsOptionalParameters parameters) {
    return listCostTagDescriptionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag key descriptions for the organization. Use <code>filter[cloud]
   * </code> to scope the result to a single cloud provider; when omitted, both cross-cloud defaults
   * and cloud-specific descriptions are returned.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagDescriptionsResponse&gt;
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
  public ApiResponse<CostTagDescriptionsResponse> listCostTagDescriptionsWithHttpInfo(
      ListCostTagDescriptionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterCloud = parameters.filterCloud;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_descriptions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cloud]", filterCloud));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagDescriptions",
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
        new GenericType<CostTagDescriptionsResponse>() {});
  }

  /**
   * List Cloud Cost Management tag descriptions.
   *
   * <p>See {@link #listCostTagDescriptionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagDescriptionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagDescriptionsResponse>>
      listCostTagDescriptionsWithHttpInfoAsync(
          ListCostTagDescriptionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterCloud = parameters.filterCloud;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_descriptions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cloud]", filterCloud));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagDescriptions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagDescriptionsResponse>> result =
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
        new GenericType<CostTagDescriptionsResponse>() {});
  }

  /** Manage optional parameters to listCostTagKeys. */
  public static class ListCostTagKeysOptionalParameters {
    private String filterMetric;
    private List<String> filterTags;

    /**
     * Set filterMetric.
     *
     * @param filterMetric The Cloud Cost Management metric to scope the tag keys to. When omitted,
     *     returns tag keys across all metrics. (optional)
     * @return ListCostTagKeysOptionalParameters
     */
    public ListCostTagKeysOptionalParameters filterMetric(String filterMetric) {
      this.filterMetric = filterMetric;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter to return only tag keys that appear with the given <code>key:value
     *     </code> tag values. For example, <code>filter[tags]=providername:aws</code> returns tag
     *     keys found on the same cost data, such as <code>is_aws_ec2_compute</code> and <code>
     *     aws_instance_type</code>. (optional)
     * @return ListCostTagKeysOptionalParameters
     */
    public ListCostTagKeysOptionalParameters filterTags(List<String> filterTags) {
      this.filterTags = filterTags;
      return this;
    }
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * <p>See {@link #listCostTagKeysWithHttpInfo}.
   *
   * @return CostTagKeysResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeysResponse listCostTagKeys() throws ApiException {
    return listCostTagKeysWithHttpInfo(new ListCostTagKeysOptionalParameters()).getData();
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * <p>See {@link #listCostTagKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CostTagKeysResponse&gt;
   */
  public CompletableFuture<CostTagKeysResponse> listCostTagKeysAsync() {
    return listCostTagKeysWithHttpInfoAsync(new ListCostTagKeysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * <p>See {@link #listCostTagKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CostTagKeysResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeysResponse listCostTagKeys(ListCostTagKeysOptionalParameters parameters)
      throws ApiException {
    return listCostTagKeysWithHttpInfo(parameters).getData();
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * <p>See {@link #listCostTagKeysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagKeysResponse&gt;
   */
  public CompletableFuture<CostTagKeysResponse> listCostTagKeysAsync(
      ListCostTagKeysOptionalParameters parameters) {
    return listCostTagKeysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagKeysResponse&gt;
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
  public ApiResponse<CostTagKeysResponse> listCostTagKeysWithHttpInfo(
      ListCostTagKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterMetric = parameters.filterMetric;
    List<String> filterTags = parameters.filterTags;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagKeys",
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
        new GenericType<CostTagKeysResponse>() {});
  }

  /**
   * List Cloud Cost Management tag keys.
   *
   * <p>See {@link #listCostTagKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagKeysResponse>> listCostTagKeysWithHttpInfoAsync(
      ListCostTagKeysOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterMetric = parameters.filterMetric;
    List<String> filterTags = parameters.filterTags;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagKeysResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagKeysResponse>() {});
  }

  /** Manage optional parameters to listCostTagKeySources. */
  public static class ListCostTagKeySourcesOptionalParameters {
    private String filterProvider;

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter results to a specific provider. Common cloud values are <code>
     *     aws</code>, <code>azure</code>, <code>gcp</code>, <code>Oracle</code> (OCI), and <code>
     *     custom</code>. SaaS billing integrations (for example, <code>Snowflake</code>, <code>
     *     MongoDB</code>, <code>Databricks</code>) are also accepted using their display-name
     *     string. Values are case-sensitive. (optional)
     * @return ListCostTagKeySourcesOptionalParameters
     */
    public ListCostTagKeySourcesOptionalParameters filterProvider(String filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }
  }

  /**
   * List Cloud Cost Management tag sources.
   *
   * <p>See {@link #listCostTagKeySourcesWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CostTagKeySourcesResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeySourcesResponse listCostTagKeySources(String filterMonth) throws ApiException {
    return listCostTagKeySourcesWithHttpInfo(
            filterMonth, new ListCostTagKeySourcesOptionalParameters())
        .getData();
  }

  /**
   * List Cloud Cost Management tag sources.
   *
   * <p>See {@link #listCostTagKeySourcesWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CompletableFuture&lt;CostTagKeySourcesResponse&gt;
   */
  public CompletableFuture<CostTagKeySourcesResponse> listCostTagKeySourcesAsync(
      String filterMonth) {
    return listCostTagKeySourcesWithHttpInfoAsync(
            filterMonth, new ListCostTagKeySourcesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag sources.
   *
   * <p>See {@link #listCostTagKeySourcesWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CostTagKeySourcesResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeySourcesResponse listCostTagKeySources(
      String filterMonth, ListCostTagKeySourcesOptionalParameters parameters) throws ApiException {
    return listCostTagKeySourcesWithHttpInfo(filterMonth, parameters).getData();
  }

  /**
   * List Cloud Cost Management tag sources.
   *
   * <p>See {@link #listCostTagKeySourcesWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagKeySourcesResponse&gt;
   */
  public CompletableFuture<CostTagKeySourcesResponse> listCostTagKeySourcesAsync(
      String filterMonth, ListCostTagKeySourcesOptionalParameters parameters) {
    return listCostTagKeySourcesWithHttpInfoAsync(filterMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag keys observed for the requested period, along with the origin
   * sources that produced them (for example, <code>aws-user-defined</code>, <code>custom</code>).
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagKeySourcesResponse&gt;
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
  public ApiResponse<CostTagKeySourcesResponse> listCostTagKeySourcesWithHttpInfo(
      String filterMonth, ListCostTagKeySourcesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostTagKeySources";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterMonth' when calling listCostTagKeySources");
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/tag_sources";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagKeySources",
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
        new GenericType<CostTagKeySourcesResponse>() {});
  }

  /**
   * List Cloud Cost Management tag sources.
   *
   * <p>See {@link #listCostTagKeySourcesWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagKeySourcesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagKeySourcesResponse>>
      listCostTagKeySourcesWithHttpInfoAsync(
          String filterMonth, ListCostTagKeySourcesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCostTagKeySources";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostTagKeySourcesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      CompletableFuture<ApiResponse<CostTagKeySourcesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterMonth' when calling listCostTagKeySources"));
      return result;
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/tag_sources";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagKeySources",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagKeySourcesResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagKeySourcesResponse>() {});
  }

  /** Manage optional parameters to listCostTagMetadata. */
  public static class ListCostTagMetadataOptionalParameters {
    private String filterProvider;
    private String filterMetric;
    private String filterTagKey;
    private CostTagMetadataDailyFilter filterDaily;

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter results to a specific provider. Common cloud values are <code>
     *     aws</code>, <code>azure</code>, <code>gcp</code>, <code>Oracle</code> (OCI), and <code>
     *     custom</code>. SaaS billing integrations (for example, <code>Snowflake</code>, <code>
     *     MongoDB</code>, <code>Databricks</code>) are also accepted using their display-name
     *     string. Values are case-sensitive. (optional)
     * @return ListCostTagMetadataOptionalParameters
     */
    public ListCostTagMetadataOptionalParameters filterProvider(String filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }

    /**
     * Set filterMetric.
     *
     * @param filterMetric Filter results to a specific Cloud Cost Management metric (for example,
     *     <code>aws.cost.net.amortized</code>). When omitted, every available metric for the
     *     requested period is returned. (optional)
     * @return ListCostTagMetadataOptionalParameters
     */
    public ListCostTagMetadataOptionalParameters filterMetric(String filterMetric) {
      this.filterMetric = filterMetric;
      return this;
    }

    /**
     * Set filterTagKey.
     *
     * @param filterTagKey Restrict results to a single tag key. (optional)
     * @return ListCostTagMetadataOptionalParameters
     */
    public ListCostTagMetadataOptionalParameters filterTagKey(String filterTagKey) {
      this.filterTagKey = filterTagKey;
      return this;
    }

    /**
     * Set filterDaily.
     *
     * @param filterDaily When <code>true</code>, return one row per day with the day in the <code>
     *     date</code> attribute. Defaults to the monthly roll-up when omitted. (optional)
     * @return ListCostTagMetadataOptionalParameters
     */
    public ListCostTagMetadataOptionalParameters filterDaily(
        CostTagMetadataDailyFilter filterDaily) {
      this.filterDaily = filterDaily;
      return this;
    }
  }

  /**
   * List Cloud Cost Management tag key metadata.
   *
   * <p>See {@link #listCostTagMetadataWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CostTagKeyMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeyMetadataResponse listCostTagMetadata(String filterMonth) throws ApiException {
    return listCostTagMetadataWithHttpInfo(filterMonth, new ListCostTagMetadataOptionalParameters())
        .getData();
  }

  /**
   * List Cloud Cost Management tag key metadata.
   *
   * <p>See {@link #listCostTagMetadataWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CompletableFuture&lt;CostTagKeyMetadataResponse&gt;
   */
  public CompletableFuture<CostTagKeyMetadataResponse> listCostTagMetadataAsync(
      String filterMonth) {
    return listCostTagMetadataWithHttpInfoAsync(
            filterMonth, new ListCostTagMetadataOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag key metadata.
   *
   * <p>See {@link #listCostTagMetadataWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CostTagKeyMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagKeyMetadataResponse listCostTagMetadata(
      String filterMonth, ListCostTagMetadataOptionalParameters parameters) throws ApiException {
    return listCostTagMetadataWithHttpInfo(filterMonth, parameters).getData();
  }

  /**
   * List Cloud Cost Management tag key metadata.
   *
   * <p>See {@link #listCostTagMetadataWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagKeyMetadataResponse&gt;
   */
  public CompletableFuture<CostTagKeyMetadataResponse> listCostTagMetadataAsync(
      String filterMonth, ListCostTagMetadataOptionalParameters parameters) {
    return listCostTagMetadataWithHttpInfoAsync(filterMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tag key metadata, including row counts, cost covered, cardinality,
   * and a sample of top tag values per cloud account. Use <code>filter[daily]=true</code> to return
   * daily rows instead of the default monthly roll-up.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagKeyMetadataResponse&gt;
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
  public ApiResponse<CostTagKeyMetadataResponse> listCostTagMetadataWithHttpInfo(
      String filterMonth, ListCostTagMetadataOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadata";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterMonth' when calling listCostTagMetadata");
    }
    String filterProvider = parameters.filterProvider;
    String filterMetric = parameters.filterMetric;
    String filterTagKey = parameters.filterTagKey;
    CostTagMetadataDailyFilter filterDaily = parameters.filterDaily;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag_key]", filterTagKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[daily]", filterDaily));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagMetadata",
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
        new GenericType<CostTagKeyMetadataResponse>() {});
  }

  /**
   * List Cloud Cost Management tag key metadata.
   *
   * <p>See {@link #listCostTagMetadataWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagKeyMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagKeyMetadataResponse>>
      listCostTagMetadataWithHttpInfoAsync(
          String filterMonth, ListCostTagMetadataOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadata";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostTagKeyMetadataResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      CompletableFuture<ApiResponse<CostTagKeyMetadataResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterMonth' when calling listCostTagMetadata"));
      return result;
    }
    String filterProvider = parameters.filterProvider;
    String filterMetric = parameters.filterMetric;
    String filterTagKey = parameters.filterTagKey;
    CostTagMetadataDailyFilter filterDaily = parameters.filterDaily;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag_key]", filterTagKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[daily]", filterDaily));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagMetadata",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagKeyMetadataResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagKeyMetadataResponse>() {});
  }

  /** Manage optional parameters to listCostTagMetadataMetrics. */
  public static class ListCostTagMetadataMetricsOptionalParameters {
    private String filterProvider;

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter results to a specific provider. Common cloud values are <code>
     *     aws</code>, <code>azure</code>, <code>gcp</code>, <code>Oracle</code> (OCI), and <code>
     *     custom</code>. SaaS billing integrations (for example, <code>Snowflake</code>, <code>
     *     MongoDB</code>, <code>Databricks</code>) are also accepted using their display-name
     *     string. Values are case-sensitive. (optional)
     * @return ListCostTagMetadataMetricsOptionalParameters
     */
    public ListCostTagMetadataMetricsOptionalParameters filterProvider(String filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }
  }

  /**
   * List available Cloud Cost Management metrics.
   *
   * <p>See {@link #listCostTagMetadataMetricsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CostMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public CostMetricsResponse listCostTagMetadataMetrics(String filterMonth) throws ApiException {
    return listCostTagMetadataMetricsWithHttpInfo(
            filterMonth, new ListCostTagMetadataMetricsOptionalParameters())
        .getData();
  }

  /**
   * List available Cloud Cost Management metrics.
   *
   * <p>See {@link #listCostTagMetadataMetricsWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CompletableFuture&lt;CostMetricsResponse&gt;
   */
  public CompletableFuture<CostMetricsResponse> listCostTagMetadataMetricsAsync(
      String filterMonth) {
    return listCostTagMetadataMetricsWithHttpInfoAsync(
            filterMonth, new ListCostTagMetadataMetricsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List available Cloud Cost Management metrics.
   *
   * <p>See {@link #listCostTagMetadataMetricsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CostMetricsResponse
   * @throws ApiException if fails to make API call
   */
  public CostMetricsResponse listCostTagMetadataMetrics(
      String filterMonth, ListCostTagMetadataMetricsOptionalParameters parameters)
      throws ApiException {
    return listCostTagMetadataMetricsWithHttpInfo(filterMonth, parameters).getData();
  }

  /**
   * List available Cloud Cost Management metrics.
   *
   * <p>See {@link #listCostTagMetadataMetricsWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostMetricsResponse&gt;
   */
  public CompletableFuture<CostMetricsResponse> listCostTagMetadataMetricsAsync(
      String filterMonth, ListCostTagMetadataMetricsOptionalParameters parameters) {
    return listCostTagMetadataMetricsWithHttpInfoAsync(filterMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management metrics that have data for the requested period.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostMetricsResponse&gt;
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
  public ApiResponse<CostMetricsResponse> listCostTagMetadataMetricsWithHttpInfo(
      String filterMonth, ListCostTagMetadataMetricsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataMetrics";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterMonth' when calling listCostTagMetadataMetrics");
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagMetadataMetrics",
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
        new GenericType<CostMetricsResponse>() {});
  }

  /**
   * List available Cloud Cost Management metrics.
   *
   * <p>See {@link #listCostTagMetadataMetricsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostMetricsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostMetricsResponse>>
      listCostTagMetadataMetricsWithHttpInfoAsync(
          String filterMonth, ListCostTagMetadataMetricsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataMetrics";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostMetricsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      CompletableFuture<ApiResponse<CostMetricsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterMonth' when calling"
                  + " listCostTagMetadataMetrics"));
      return result;
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagMetadataMetrics",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostMetricsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostMetricsResponse>() {});
  }

  /**
   * List Cloud Cost Management tag metadata months.
   *
   * <p>See {@link #listCostTagMetadataMonthsWithHttpInfo}.
   *
   * @param filterProvider Provider to scope the query to. Use the value of the <code>providername
   *     </code> tag in CCM (for example, <code>aws</code>, <code>azure</code>, <code>gcp</code>,
   *     <code>Oracle</code>, <code>Confluent Cloud</code>, <code>Snowflake</code>). For costs
   *     uploaded through the Custom Costs API, use <code>custom</code>. Values are case-sensitive.
   *     (required)
   * @return CostTagMetadataMonthsResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagMetadataMonthsResponse listCostTagMetadataMonths(String filterProvider)
      throws ApiException {
    return listCostTagMetadataMonthsWithHttpInfo(filterProvider).getData();
  }

  /**
   * List Cloud Cost Management tag metadata months.
   *
   * <p>See {@link #listCostTagMetadataMonthsWithHttpInfoAsync}.
   *
   * @param filterProvider Provider to scope the query to. Use the value of the <code>providername
   *     </code> tag in CCM (for example, <code>aws</code>, <code>azure</code>, <code>gcp</code>,
   *     <code>Oracle</code>, <code>Confluent Cloud</code>, <code>Snowflake</code>). For costs
   *     uploaded through the Custom Costs API, use <code>custom</code>. Values are case-sensitive.
   *     (required)
   * @return CompletableFuture&lt;CostTagMetadataMonthsResponse&gt;
   */
  public CompletableFuture<CostTagMetadataMonthsResponse> listCostTagMetadataMonthsAsync(
      String filterProvider) {
    return listCostTagMetadataMonthsWithHttpInfoAsync(filterProvider)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List months that have Cloud Cost Management tag metadata for a given provider, ordered
   * most-recent first. The response is capped at 36 months.
   *
   * @param filterProvider Provider to scope the query to. Use the value of the <code>providername
   *     </code> tag in CCM (for example, <code>aws</code>, <code>azure</code>, <code>gcp</code>,
   *     <code>Oracle</code>, <code>Confluent Cloud</code>, <code>Snowflake</code>). For costs
   *     uploaded through the Custom Costs API, use <code>custom</code>. Values are case-sensitive.
   *     (required)
   * @return ApiResponse&lt;CostTagMetadataMonthsResponse&gt;
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
  public ApiResponse<CostTagMetadataMonthsResponse> listCostTagMetadataMonthsWithHttpInfo(
      String filterProvider) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataMonths";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProvider' is set
    if (filterProvider == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterProvider' when calling listCostTagMetadataMonths");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/months";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagMetadataMonths",
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
        new GenericType<CostTagMetadataMonthsResponse>() {});
  }

  /**
   * List Cloud Cost Management tag metadata months.
   *
   * <p>See {@link #listCostTagMetadataMonthsWithHttpInfo}.
   *
   * @param filterProvider Provider to scope the query to. Use the value of the <code>providername
   *     </code> tag in CCM (for example, <code>aws</code>, <code>azure</code>, <code>gcp</code>,
   *     <code>Oracle</code>, <code>Confluent Cloud</code>, <code>Snowflake</code>). For costs
   *     uploaded through the Custom Costs API, use <code>custom</code>. Values are case-sensitive.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagMetadataMonthsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagMetadataMonthsResponse>>
      listCostTagMetadataMonthsWithHttpInfoAsync(String filterProvider) {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataMonths";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostTagMetadataMonthsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProvider' is set
    if (filterProvider == null) {
      CompletableFuture<ApiResponse<CostTagMetadataMonthsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterProvider' when calling"
                  + " listCostTagMetadataMonths"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/months";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagMetadataMonths",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagMetadataMonthsResponse>> result =
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
        new GenericType<CostTagMetadataMonthsResponse>() {});
  }

  /** Manage optional parameters to listCostTagMetadataOrchestrators. */
  public static class ListCostTagMetadataOrchestratorsOptionalParameters {
    private String filterProvider;

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter results to a specific provider. Common cloud values are <code>
     *     aws</code>, <code>azure</code>, <code>gcp</code>, <code>Oracle</code> (OCI), and <code>
     *     custom</code>. SaaS billing integrations (for example, <code>Snowflake</code>, <code>
     *     MongoDB</code>, <code>Databricks</code>) are also accepted using their display-name
     *     string. Values are case-sensitive. (optional)
     * @return ListCostTagMetadataOrchestratorsOptionalParameters
     */
    public ListCostTagMetadataOrchestratorsOptionalParameters filterProvider(
        String filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }
  }

  /**
   * List Cloud Cost Management orchestrators.
   *
   * <p>See {@link #listCostTagMetadataOrchestratorsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CostOrchestratorsResponse
   * @throws ApiException if fails to make API call
   */
  public CostOrchestratorsResponse listCostTagMetadataOrchestrators(String filterMonth)
      throws ApiException {
    return listCostTagMetadataOrchestratorsWithHttpInfo(
            filterMonth, new ListCostTagMetadataOrchestratorsOptionalParameters())
        .getData();
  }

  /**
   * List Cloud Cost Management orchestrators.
   *
   * <p>See {@link #listCostTagMetadataOrchestratorsWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @return CompletableFuture&lt;CostOrchestratorsResponse&gt;
   */
  public CompletableFuture<CostOrchestratorsResponse> listCostTagMetadataOrchestratorsAsync(
      String filterMonth) {
    return listCostTagMetadataOrchestratorsWithHttpInfoAsync(
            filterMonth, new ListCostTagMetadataOrchestratorsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management orchestrators.
   *
   * <p>See {@link #listCostTagMetadataOrchestratorsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CostOrchestratorsResponse
   * @throws ApiException if fails to make API call
   */
  public CostOrchestratorsResponse listCostTagMetadataOrchestrators(
      String filterMonth, ListCostTagMetadataOrchestratorsOptionalParameters parameters)
      throws ApiException {
    return listCostTagMetadataOrchestratorsWithHttpInfo(filterMonth, parameters).getData();
  }

  /**
   * List Cloud Cost Management orchestrators.
   *
   * <p>See {@link #listCostTagMetadataOrchestratorsWithHttpInfoAsync}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostOrchestratorsResponse&gt;
   */
  public CompletableFuture<CostOrchestratorsResponse> listCostTagMetadataOrchestratorsAsync(
      String filterMonth, ListCostTagMetadataOrchestratorsOptionalParameters parameters) {
    return listCostTagMetadataOrchestratorsWithHttpInfoAsync(filterMonth, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List container orchestrators (for example, <code>kubernetes</code>, <code>ecs</code>) detected
   * in Cloud Cost Management data for the requested period.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostOrchestratorsResponse&gt;
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
  public ApiResponse<CostOrchestratorsResponse> listCostTagMetadataOrchestratorsWithHttpInfo(
      String filterMonth, ListCostTagMetadataOrchestratorsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataOrchestrators";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterMonth' when calling"
              + " listCostTagMetadataOrchestrators");
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/orchestrators";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTagMetadataOrchestrators",
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
        new GenericType<CostOrchestratorsResponse>() {});
  }

  /**
   * List Cloud Cost Management orchestrators.
   *
   * <p>See {@link #listCostTagMetadataOrchestratorsWithHttpInfo}.
   *
   * @param filterMonth The month to scope the query to, in <code>YYYY-MM</code> format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostOrchestratorsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostOrchestratorsResponse>>
      listCostTagMetadataOrchestratorsWithHttpInfoAsync(
          String filterMonth, ListCostTagMetadataOrchestratorsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCostTagMetadataOrchestrators";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostOrchestratorsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterMonth' is set
    if (filterMonth == null) {
      CompletableFuture<ApiResponse<CostOrchestratorsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterMonth' when calling"
                  + " listCostTagMetadataOrchestrators"));
      return result;
    }
    String filterProvider = parameters.filterProvider;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tag_metadata/orchestrators";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[month]", filterMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[provider]", filterProvider));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTagMetadataOrchestrators",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostOrchestratorsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostOrchestratorsResponse>() {});
  }

  /** Manage optional parameters to listCostTags. */
  public static class ListCostTagsOptionalParameters {
    private String filterMetric;
    private String filterMatch;
    private List<String> filterTags;
    private List<String> filterTagKeys;
    private Integer pageSize;

    /**
     * Set filterMetric.
     *
     * @param filterMetric The Cloud Cost Management metric to scope the tags to. When omitted,
     *     returns tags across all metrics. (optional)
     * @return ListCostTagsOptionalParameters
     */
    public ListCostTagsOptionalParameters filterMetric(String filterMetric) {
      this.filterMetric = filterMetric;
      return this;
    }

    /**
     * Set filterMatch.
     *
     * @param filterMatch A substring used to filter the returned tags by name. (optional)
     * @return ListCostTagsOptionalParameters
     */
    public ListCostTagsOptionalParameters filterMatch(String filterMatch) {
      this.filterMatch = filterMatch;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter to return only tags that appear with the given <code>key:value
     *     </code> tag values. For example, <code>filter[tags]=providername:aws</code> returns tags
     *     found on the same cost data, such as <code>aws_instance_type:t3.micro</code> and <code>
     *     aws_instance_type:m5.large</code>. (optional)
     * @return ListCostTagsOptionalParameters
     */
    public ListCostTagsOptionalParameters filterTags(List<String> filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterTagKeys.
     *
     * @param filterTagKeys Restrict the returned tags to those whose key matches one of the given
     *     tag keys. (optional)
     * @return ListCostTagsOptionalParameters
     */
    public ListCostTagsOptionalParameters filterTagKeys(List<String> filterTagKeys) {
      this.filterTagKeys = filterTagKeys;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Controls the size of the internal tag search scope. This does
     *     <strong>not</strong> restrict the number of tags returned in the response. Defaults to
     *     50, maximum 10000. (optional, default to 50)
     * @return ListCostTagsOptionalParameters
     */
    public ListCostTagsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List Cloud Cost Management tags.
   *
   * <p>See {@link #listCostTagsWithHttpInfo}.
   *
   * @return CostTagsResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagsResponse listCostTags() throws ApiException {
    return listCostTagsWithHttpInfo(new ListCostTagsOptionalParameters()).getData();
  }

  /**
   * List Cloud Cost Management tags.
   *
   * <p>See {@link #listCostTagsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CostTagsResponse&gt;
   */
  public CompletableFuture<CostTagsResponse> listCostTagsAsync() {
    return listCostTagsWithHttpInfoAsync(new ListCostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tags.
   *
   * <p>See {@link #listCostTagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CostTagsResponse
   * @throws ApiException if fails to make API call
   */
  public CostTagsResponse listCostTags(ListCostTagsOptionalParameters parameters)
      throws ApiException {
    return listCostTagsWithHttpInfo(parameters).getData();
  }

  /**
   * List Cloud Cost Management tags.
   *
   * <p>See {@link #listCostTagsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostTagsResponse&gt;
   */
  public CompletableFuture<CostTagsResponse> listCostTagsAsync(
      ListCostTagsOptionalParameters parameters) {
    return listCostTagsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Cloud Cost Management tags for a given metric.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostTagsResponse&gt;
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
  public ApiResponse<CostTagsResponse> listCostTagsWithHttpInfo(
      ListCostTagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterMetric = parameters.filterMetric;
    String filterMatch = parameters.filterMatch;
    List<String> filterTags = parameters.filterTags;
    List<String> filterTagKeys = parameters.filterTagKeys;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tags";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[match]", filterMatch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[tag_keys]", filterTagKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostTags",
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
        new GenericType<CostTagsResponse>() {});
  }

  /**
   * List Cloud Cost Management tags.
   *
   * <p>See {@link #listCostTagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostTagsResponse>> listCostTagsWithHttpInfoAsync(
      ListCostTagsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterMetric = parameters.filterMetric;
    String filterMatch = parameters.filterMatch;
    List<String> filterTags = parameters.filterTags;
    List<String> filterTagKeys = parameters.filterTagKeys;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/cost/tags";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metric]", filterMetric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[match]", filterMatch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[tag_keys]", filterTagKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostTags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CostTagsResponse>() {});
  }

  /**
   * List custom allocation rules.
   *
   * <p>See {@link #listCustomAllocationRulesWithHttpInfo}.
   *
   * @return ArbitraryRuleResponseArray
   * @throws ApiException if fails to make API call
   */
  public ArbitraryRuleResponseArray listCustomAllocationRules() throws ApiException {
    return listCustomAllocationRulesWithHttpInfo().getData();
  }

  /**
   * List custom allocation rules.
   *
   * <p>See {@link #listCustomAllocationRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ArbitraryRuleResponseArray&gt;
   */
  public CompletableFuture<ArbitraryRuleResponseArray> listCustomAllocationRulesAsync() {
    return listCustomAllocationRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all custom allocation rules - Retrieve a list of all custom allocation rules for the
   * organization
   *
   * @return ApiResponse&lt;ArbitraryRuleResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArbitraryRuleResponseArray> listCustomAllocationRulesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCustomAllocationRules",
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
        new GenericType<ArbitraryRuleResponseArray>() {});
  }

  /**
   * List custom allocation rules.
   *
   * <p>See {@link #listCustomAllocationRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ArbitraryRuleResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArbitraryRuleResponseArray>>
      listCustomAllocationRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCustomAllocationRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponseArray>> result = new CompletableFuture<>();
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
        new GenericType<ArbitraryRuleResponseArray>() {});
  }

  /**
   * List custom allocation rule statuses.
   *
   * <p>See {@link #listCustomAllocationRulesStatusWithHttpInfo}.
   *
   * @return ArbitraryRuleStatusResponseArray
   * @throws ApiException if fails to make API call
   */
  public ArbitraryRuleStatusResponseArray listCustomAllocationRulesStatus() throws ApiException {
    return listCustomAllocationRulesStatusWithHttpInfo().getData();
  }

  /**
   * List custom allocation rule statuses.
   *
   * <p>See {@link #listCustomAllocationRulesStatusWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ArbitraryRuleStatusResponseArray&gt;
   */
  public CompletableFuture<ArbitraryRuleStatusResponseArray>
      listCustomAllocationRulesStatusAsync() {
    return listCustomAllocationRulesStatusWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the processing status of all custom allocation rules. Returns only the ID and processing
   * status for each rule.
   *
   * @return ApiResponse&lt;ArbitraryRuleStatusResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArbitraryRuleStatusResponseArray> listCustomAllocationRulesStatusWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule/status";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCustomAllocationRulesStatus",
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
        new GenericType<ArbitraryRuleStatusResponseArray>() {});
  }

  /**
   * List custom allocation rule statuses.
   *
   * <p>See {@link #listCustomAllocationRulesStatusWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ArbitraryRuleStatusResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArbitraryRuleStatusResponseArray>>
      listCustomAllocationRulesStatusWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule/status";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCustomAllocationRulesStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArbitraryRuleStatusResponseArray>> result =
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
        new GenericType<ArbitraryRuleStatusResponseArray>() {});
  }

  /** Manage optional parameters to listCustomCostsFiles. */
  public static class ListCustomCostsFilesOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String filterStatus;
    private String filterName;
    private List<String> filterProvider;
    private String sort;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (optional)
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Page size for pagination (optional, default to 100)
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter by file status (optional)
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName Filter files by name with case-insensitive substring matching. (optional)
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterProvider.
     *
     * @param filterProvider Filter by provider. (optional)
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters filterProvider(List<String> filterProvider) {
      this.filterProvider = filterProvider;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort key with optional descending prefix (optional, default to "created_at")
     * @return ListCustomCostsFilesOptionalParameters
     */
    public ListCustomCostsFilesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfo}.
   *
   * @return CustomCostsFileListResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileListResponse listCustomCostsFiles() throws ApiException {
    return listCustomCostsFilesWithHttpInfo(new ListCustomCostsFilesOptionalParameters()).getData();
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CustomCostsFileListResponse&gt;
   */
  public CompletableFuture<CustomCostsFileListResponse> listCustomCostsFilesAsync() {
    return listCustomCostsFilesWithHttpInfoAsync(new ListCustomCostsFilesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CustomCostsFileListResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileListResponse listCustomCostsFiles(
      ListCustomCostsFilesOptionalParameters parameters) throws ApiException {
    return listCustomCostsFilesWithHttpInfo(parameters).getData();
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CustomCostsFileListResponse&gt;
   */
  public CompletableFuture<CustomCostsFileListResponse> listCustomCostsFilesAsync(
      ListCustomCostsFilesOptionalParameters parameters) {
    return listCustomCostsFilesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Custom Costs files.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CustomCostsFileListResponse&gt;
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
  public ApiResponse<CustomCostsFileListResponse> listCustomCostsFilesWithHttpInfo(
      ListCustomCostsFilesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filterStatus = parameters.filterStatus;
    String filterName = parameters.filterName;
    List<String> filterProvider = parameters.filterProvider;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[provider]", filterProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCustomCostsFiles",
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
        new GenericType<CustomCostsFileListResponse>() {});
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileListResponse>>
      listCustomCostsFilesWithHttpInfoAsync(ListCustomCostsFilesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filterStatus = parameters.filterStatus;
    String filterName = parameters.filterName;
    List<String> filterProvider = parameters.filterProvider;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[provider]", filterProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCustomCostsFiles",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileListResponse>> result =
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
        new GenericType<CustomCostsFileListResponse>() {});
  }

  /**
   * List tag pipeline rulesets.
   *
   * <p>See {@link #listTagPipelinesRulesetsWithHttpInfo}.
   *
   * @return RulesetRespArray
   * @throws ApiException if fails to make API call
   */
  public RulesetRespArray listTagPipelinesRulesets() throws ApiException {
    return listTagPipelinesRulesetsWithHttpInfo().getData();
  }

  /**
   * List tag pipeline rulesets.
   *
   * <p>See {@link #listTagPipelinesRulesetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RulesetRespArray&gt;
   */
  public CompletableFuture<RulesetRespArray> listTagPipelinesRulesetsAsync() {
    return listTagPipelinesRulesetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all tag pipeline rulesets - Retrieve a list of all tag pipeline rulesets for the
   * organization
   *
   * @return ApiResponse&lt;RulesetRespArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesetRespArray> listTagPipelinesRulesetsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listTagPipelinesRulesets",
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
        new GenericType<RulesetRespArray>() {});
  }

  /**
   * List tag pipeline rulesets.
   *
   * <p>See {@link #listTagPipelinesRulesetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RulesetRespArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesetRespArray>>
      listTagPipelinesRulesetsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listTagPipelinesRulesets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesetRespArray>> result = new CompletableFuture<>();
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
        new GenericType<RulesetRespArray>() {});
  }

  /**
   * List tag pipeline ruleset statuses.
   *
   * <p>See {@link #listTagPipelinesRulesetsStatusWithHttpInfo}.
   *
   * @return RulesetStatusRespArray
   * @throws ApiException if fails to make API call
   */
  public RulesetStatusRespArray listTagPipelinesRulesetsStatus() throws ApiException {
    return listTagPipelinesRulesetsStatusWithHttpInfo().getData();
  }

  /**
   * List tag pipeline ruleset statuses.
   *
   * <p>See {@link #listTagPipelinesRulesetsStatusWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RulesetStatusRespArray&gt;
   */
  public CompletableFuture<RulesetStatusRespArray> listTagPipelinesRulesetsStatusAsync() {
    return listTagPipelinesRulesetsStatusWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the processing status of all tag pipeline rulesets. Returns only the ID and processing
   * status for each ruleset.
   *
   * @return ApiResponse&lt;RulesetStatusRespArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesetStatusRespArray> listTagPipelinesRulesetsStatusWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/status";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listTagPipelinesRulesetsStatus",
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
        new GenericType<RulesetStatusRespArray>() {});
  }

  /**
   * List tag pipeline ruleset statuses.
   *
   * <p>See {@link #listTagPipelinesRulesetsStatusWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RulesetStatusRespArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesetStatusRespArray>>
      listTagPipelinesRulesetsStatusWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/status";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listTagPipelinesRulesetsStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesetStatusRespArray>> result = new CompletableFuture<>();
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
        new GenericType<RulesetStatusRespArray>() {});
  }

  /**
   * Reorder custom allocation rules.
   *
   * <p>See {@link #reorderCustomAllocationRulesWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void reorderCustomAllocationRules(ReorderRuleResourceArray body) throws ApiException {
    reorderCustomAllocationRulesWithHttpInfo(body);
  }

  /**
   * Reorder custom allocation rules.
   *
   * <p>See {@link #reorderCustomAllocationRulesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> reorderCustomAllocationRulesAsync(ReorderRuleResourceArray body) {
    return reorderCustomAllocationRulesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Reorder custom allocation rules - Change the execution order of custom allocation rules.
   *
   * <p><strong>Important</strong>: You must provide the <strong>complete list</strong> of all rule
   * IDs in the desired execution order. The API will reorder ALL rules according to the provided
   * sequence.
   *
   * <p>Rules are executed in the order specified, with lower indices (earlier in the array) having
   * higher priority.
   *
   * <p><strong>Example</strong>: If you have rules with IDs [123, 456, 789] and want to change
   * order from 123→456→789 to 456→123→789, send: [{"id": "456"}, {"id": "123"}, {"id": "789"}]
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Successfully reordered rules </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> reorderCustomAllocationRulesWithHttpInfo(ReorderRuleResourceArray body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling reorderCustomAllocationRules");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule/reorder";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.reorderCustomAllocationRules",
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
   * Reorder custom allocation rules.
   *
   * <p>See {@link #reorderCustomAllocationRulesWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> reorderCustomAllocationRulesWithHttpInfoAsync(
      ReorderRuleResourceArray body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling reorderCustomAllocationRules"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/arbitrary_rule/reorder";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.reorderCustomAllocationRules",
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
   * Reorder tag pipeline rulesets.
   *
   * <p>See {@link #reorderTagPipelinesRulesetsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void reorderTagPipelinesRulesets(ReorderRulesetResourceArray body) throws ApiException {
    reorderTagPipelinesRulesetsWithHttpInfo(body);
  }

  /**
   * Reorder tag pipeline rulesets.
   *
   * <p>See {@link #reorderTagPipelinesRulesetsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> reorderTagPipelinesRulesetsAsync(
      ReorderRulesetResourceArray body) {
    return reorderTagPipelinesRulesetsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Reorder tag pipeline rulesets - Change the execution order of tag pipeline rulesets
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Successfully reordered rulesets </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> reorderTagPipelinesRulesetsWithHttpInfo(ReorderRulesetResourceArray body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling reorderTagPipelinesRulesets");
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/reorder";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.reorderTagPipelinesRulesets",
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
   * Reorder tag pipeline rulesets.
   *
   * <p>See {@link #reorderTagPipelinesRulesetsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> reorderTagPipelinesRulesetsWithHttpInfoAsync(
      ReorderRulesetResourceArray body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling reorderTagPipelinesRulesets"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/reorder";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.reorderTagPipelinesRulesets",
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

  /** Manage optional parameters to searchCostRecommendations. */
  public static class SearchCostRecommendationsOptionalParameters {
    private String pageSize;
    private String pageToken;

    /**
     * Set pageSize.
     *
     * @param pageSize Number of results per page (1–10000). (optional)
     * @return SearchCostRecommendationsOptionalParameters
     */
    public SearchCostRecommendationsOptionalParameters pageSize(String pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageToken.
     *
     * @param pageToken Pagination token from a previous response. (optional)
     * @return SearchCostRecommendationsOptionalParameters
     */
    public SearchCostRecommendationsOptionalParameters pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }
  }

  /**
   * Search cost recommendations.
   *
   * <p>See {@link #searchCostRecommendationsWithHttpInfo}.
   *
   * @param body (required)
   * @return CostRecommendationArray
   * @throws ApiException if fails to make API call
   */
  public CostRecommendationArray searchCostRecommendations(RecommendationsFilterRequest body)
      throws ApiException {
    return searchCostRecommendationsWithHttpInfo(
            body, new SearchCostRecommendationsOptionalParameters())
        .getData();
  }

  /**
   * Search cost recommendations.
   *
   * <p>See {@link #searchCostRecommendationsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CostRecommendationArray&gt;
   */
  public CompletableFuture<CostRecommendationArray> searchCostRecommendationsAsync(
      RecommendationsFilterRequest body) {
    return searchCostRecommendationsWithHttpInfoAsync(
            body, new SearchCostRecommendationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search cost recommendations.
   *
   * <p>See {@link #searchCostRecommendationsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CostRecommendationArray
   * @throws ApiException if fails to make API call
   */
  public CostRecommendationArray searchCostRecommendations(
      RecommendationsFilterRequest body, SearchCostRecommendationsOptionalParameters parameters)
      throws ApiException {
    return searchCostRecommendationsWithHttpInfo(body, parameters).getData();
  }

  /**
   * Search cost recommendations.
   *
   * <p>See {@link #searchCostRecommendationsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CostRecommendationArray&gt;
   */
  public CompletableFuture<CostRecommendationArray> searchCostRecommendationsAsync(
      RecommendationsFilterRequest body, SearchCostRecommendationsOptionalParameters parameters) {
    return searchCostRecommendationsWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List cost recommendations matching a filter, with pagination and sorting.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CostRecommendationArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CostRecommendationArray> searchCostRecommendationsWithHttpInfo(
      RecommendationsFilterRequest body, SearchCostRecommendationsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchCostRecommendations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchCostRecommendations");
    }
    String pageSize = parameters.pageSize;
    String pageToken = parameters.pageToken;
    // create path and map variables
    String localVarPath = "/api/v2/cost/recommendations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.searchCostRecommendations",
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
        new GenericType<CostRecommendationArray>() {});
  }

  /**
   * Search cost recommendations.
   *
   * <p>See {@link #searchCostRecommendationsWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CostRecommendationArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CostRecommendationArray>>
      searchCostRecommendationsWithHttpInfoAsync(
          RecommendationsFilterRequest body,
          SearchCostRecommendationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "searchCostRecommendations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CostRecommendationArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CostRecommendationArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling searchCostRecommendations"));
      return result;
    }
    String pageSize = parameters.pageSize;
    String pageToken = parameters.pageToken;
    // create path and map variables
    String localVarPath = "/api/v2/cost/recommendations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.searchCostRecommendations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CostRecommendationArray>> result = new CompletableFuture<>();
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
        new GenericType<CostRecommendationArray>() {});
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return AwsCURConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCURConfigsResponse updateCostAWSCURConfig(
      Long cloudAccountId, AwsCURConfigPatchRequest body) throws ApiException {
    return updateCostAWSCURConfigWithHttpInfo(cloudAccountId, body).getData();
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AwsCURConfigsResponse&gt;
   */
  public CompletableFuture<AwsCURConfigsResponse> updateCostAWSCURConfigAsync(
      Long cloudAccountId, AwsCURConfigPatchRequest body) {
    return updateCostAWSCURConfigWithHttpInfoAsync(cloudAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status (active/archived) and/or account filtering configuration of an AWS CUR
   * config.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return ApiResponse&lt;AwsCURConfigsResponse&gt;
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
  public ApiResponse<AwsCURConfigsResponse> updateCostAWSCURConfigWithHttpInfo(
      Long cloudAccountId, AwsCURConfigPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling updateCostAWSCURConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCostAWSCURConfig",
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
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCURConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCURConfigsResponse>>
      updateCostAWSCURConfigWithHttpInfoAsync(Long cloudAccountId, AwsCURConfigPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " updateCostAWSCURConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return AzureUCConfigPairsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigPairsResponse updateCostAzureUCConfigs(
      Long cloudAccountId, AzureUCConfigPatchRequest body) throws ApiException {
    return updateCostAzureUCConfigsWithHttpInfo(cloudAccountId, body).getData();
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AzureUCConfigPairsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigPairsResponse> updateCostAzureUCConfigsAsync(
      Long cloudAccountId, AzureUCConfigPatchRequest body) {
    return updateCostAzureUCConfigsWithHttpInfoAsync(cloudAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status of an Azure config (active/archived).
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return ApiResponse&lt;AzureUCConfigPairsResponse&gt;
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
  public ApiResponse<AzureUCConfigPairsResponse> updateCostAzureUCConfigsWithHttpInfo(
      Long cloudAccountId, AzureUCConfigPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling updateCostAzureUCConfigs");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCostAzureUCConfigs");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCostAzureUCConfigs",
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
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigPairsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>>
      updateCostAzureUCConfigsWithHttpInfoAsync(
          Long cloudAccountId, AzureUCConfigPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " updateCostAzureUCConfigs"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCostAzureUCConfigs"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Update Google Cloud Usage Cost config.
   *
   * <p>See {@link #updateCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return GCPUsageCostConfigResponse
   * @throws ApiException if fails to make API call
   */
  public GCPUsageCostConfigResponse updateCostGCPUsageCostConfig(
      Long cloudAccountId, GCPUsageCostConfigPatchRequest body) throws ApiException {
    return updateCostGCPUsageCostConfigWithHttpInfo(cloudAccountId, body).getData();
  }

  /**
   * Update Google Cloud Usage Cost config.
   *
   * <p>See {@link #updateCostGCPUsageCostConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;GCPUsageCostConfigResponse&gt;
   */
  public CompletableFuture<GCPUsageCostConfigResponse> updateCostGCPUsageCostConfigAsync(
      Long cloudAccountId, GCPUsageCostConfigPatchRequest body) {
    return updateCostGCPUsageCostConfigWithHttpInfoAsync(cloudAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status of an Google Cloud Usage Cost config (active/archived).
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return ApiResponse&lt;GCPUsageCostConfigResponse&gt;
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
  public ApiResponse<GCPUsageCostConfigResponse> updateCostGCPUsageCostConfigWithHttpInfo(
      Long cloudAccountId, GCPUsageCostConfigPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling"
              + " updateCostGCPUsageCostConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCostGCPUsageCostConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCostGCPUsageCostConfig",
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
        new GenericType<GCPUsageCostConfigResponse>() {});
  }

  /**
   * Update Google Cloud Usage Cost config.
   *
   * <p>See {@link #updateCostGCPUsageCostConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GCPUsageCostConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>>
      updateCostGCPUsageCostConfigWithHttpInfoAsync(
          Long cloudAccountId, GCPUsageCostConfigPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " updateCostGCPUsageCostConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateCostGCPUsageCostConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/gcp_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCostGCPUsageCostConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPUsageCostConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<GCPUsageCostConfigResponse>() {});
  }

  /**
   * Update custom allocation rule.
   *
   * <p>See {@link #updateCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @param body (required)
   * @return ArbitraryRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ArbitraryRuleResponse updateCustomAllocationRule(
      Long ruleId, ArbitraryCostUpsertRequest body) throws ApiException {
    return updateCustomAllocationRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update custom allocation rule.
   *
   * <p>See {@link #updateCustomAllocationRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @param body (required)
   * @return CompletableFuture&lt;ArbitraryRuleResponse&gt;
   */
  public CompletableFuture<ArbitraryRuleResponse> updateCustomAllocationRuleAsync(
      Long ruleId, ArbitraryCostUpsertRequest body) {
    return updateCustomAllocationRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing custom allocation rule with new filters and allocation strategy.
   *
   * <p><strong>Strategy Methods:</strong> - <strong>PROPORTIONAL/EVEN</strong>: Allocates costs
   * proportionally/evenly based on existing costs. Requires: granularity, allocated_by_tag_keys.
   * Optional: based_on_costs, allocated_by_filters, evaluate_grouped_by_tag_keys,
   * evaluate_grouped_by_filters. - <strong>PROPORTIONAL_TIMESERIES/EVEN_TIMESERIES</strong>:
   * Allocates based on timeseries data. Requires: granularity, based_on_timeseries. Optional:
   * evaluate_grouped_by_tag_keys. - <strong>PERCENT</strong>: Allocates fixed percentages to
   * specific tags. Requires: allocated_by (array of percentage allocations). -
   * <strong>USAGE_METRIC</strong>: Allocates based on usage metrics (implementation varies).
   *
   * <p><strong>Filter Conditions:</strong> - Use <strong>value</strong> for single-value
   * conditions: "is", "is not", "contains", "=", "!=", "like", "not like" - Use
   * <strong>values</strong> for multi-value conditions: "in", "not in" - Cannot use both value and
   * values simultaneously.
   *
   * <p><strong>Supported operators</strong>: is, is not, contains, in, not in, =, !=, like, not
   * like
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @param body (required)
   * @return ApiResponse&lt;ArbitraryRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArbitraryRuleResponse> updateCustomAllocationRuleWithHttpInfo(
      Long ruleId, ArbitraryCostUpsertRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateCustomAllocationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCustomAllocationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCustomAllocationRule",
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Update custom allocation rule.
   *
   * <p>See {@link #updateCustomAllocationRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the custom allocation rule (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ArbitraryRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArbitraryRuleResponse>>
      updateCustomAllocationRuleWithHttpInfoAsync(Long ruleId, ArbitraryCostUpsertRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling updateCustomAllocationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateCustomAllocationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/arbitrary_rule/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCustomAllocationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArbitraryRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<ArbitraryRuleResponse>() {});
  }

  /**
   * Update tag pipeline ruleset.
   *
   * <p>See {@link #updateTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @param body (required)
   * @return RulesetResp
   * @throws ApiException if fails to make API call
   */
  public RulesetResp updateTagPipelinesRuleset(String rulesetId, UpdateRulesetRequest body)
      throws ApiException {
    return updateTagPipelinesRulesetWithHttpInfo(rulesetId, body).getData();
  }

  /**
   * Update tag pipeline ruleset.
   *
   * <p>See {@link #updateTagPipelinesRulesetWithHttpInfoAsync}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @param body (required)
   * @return CompletableFuture&lt;RulesetResp&gt;
   */
  public CompletableFuture<RulesetResp> updateTagPipelinesRulesetAsync(
      String rulesetId, UpdateRulesetRequest body) {
    return updateTagPipelinesRulesetWithHttpInfoAsync(rulesetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a tag pipeline ruleset - Update an existing tag pipeline ruleset with new rules and
   * configuration
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @param body (required)
   * @return ApiResponse&lt;RulesetResp&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesetResp> updateTagPipelinesRulesetWithHttpInfo(
      String rulesetId, UpdateRulesetRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rulesetId' when calling updateTagPipelinesRuleset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTagPipelinesRuleset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateTagPipelinesRuleset",
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * Update tag pipeline ruleset.
   *
   * <p>See {@link #updateTagPipelinesRulesetWithHttpInfo}.
   *
   * @param rulesetId The unique identifier of the ruleset (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RulesetResp&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesetResp>> updateTagPipelinesRulesetWithHttpInfoAsync(
      String rulesetId, UpdateRulesetRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'rulesetId' is set
    if (rulesetId == null) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rulesetId' when calling updateTagPipelinesRuleset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTagPipelinesRuleset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tags/enrichment/{ruleset_id}"
            .replaceAll("\\{" + "ruleset_id" + "\\}", apiClient.escapeString(rulesetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateTagPipelinesRuleset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesetResp>> result = new CompletableFuture<>();
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
        new GenericType<RulesetResp>() {});
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfo}.
   *
   * @param body (required)
   * @return CustomCostsFileUploadResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileUploadResponse uploadCustomCostsFile(List<CustomCostsFileLineItem> body)
      throws ApiException {
    return uploadCustomCostsFileWithHttpInfo(body).getData();
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CustomCostsFileUploadResponse&gt;
   */
  public CompletableFuture<CustomCostsFileUploadResponse> uploadCustomCostsFileAsync(
      List<CustomCostsFileLineItem> body) {
    return uploadCustomCostsFileWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload a Custom Costs file.
   *
   * @param body (required)
   * @return ApiResponse&lt;CustomCostsFileUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomCostsFileUploadResponse> uploadCustomCostsFileWithHttpInfo(
      List<CustomCostsFileLineItem> body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling uploadCustomCostsFile");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.uploadCustomCostsFile",
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
        new GenericType<CustomCostsFileUploadResponse>() {});
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileUploadResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>>
      uploadCustomCostsFileWithHttpInfoAsync(List<CustomCostsFileLineItem> body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling uploadCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.uploadCustomCostsFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>> result =
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
        new GenericType<CustomCostsFileUploadResponse>() {});
  }

  /**
   * Create or update a budget.
   *
   * <p>See {@link #upsertBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return BudgetWithEntries
   * @throws ApiException if fails to make API call
   */
  public BudgetWithEntries upsertBudget(BudgetWithEntries body) throws ApiException {
    return upsertBudgetWithHttpInfo(body).getData();
  }

  /**
   * Create or update a budget.
   *
   * <p>See {@link #upsertBudgetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;BudgetWithEntries&gt;
   */
  public CompletableFuture<BudgetWithEntries> upsertBudgetAsync(BudgetWithEntries body) {
    return upsertBudgetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new budget or update an existing one.
   *
   * @param body (required)
   * @return ApiResponse&lt;BudgetWithEntries&gt;
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
  public ApiResponse<BudgetWithEntries> upsertBudgetWithHttpInfo(BudgetWithEntries body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertBudget");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.upsertBudget",
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
        new GenericType<BudgetWithEntries>() {});
  }

  /**
   * Create or update a budget.
   *
   * <p>See {@link #upsertBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;BudgetWithEntries&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BudgetWithEntries>> upsertBudgetWithHttpInfoAsync(
      BudgetWithEntries body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<BudgetWithEntries>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling upsertBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.upsertBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BudgetWithEntries>> result = new CompletableFuture<>();
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
        new GenericType<BudgetWithEntries>() {});
  }

  /**
   * Upsert a Cloud Cost Management tag description.
   *
   * <p>See {@link #upsertCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being upserted. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void upsertCostTagDescriptionByKey(String tagKey, CostTagDescriptionUpsertRequest body)
      throws ApiException {
    upsertCostTagDescriptionByKeyWithHttpInfo(tagKey, body);
  }

  /**
   * Upsert a Cloud Cost Management tag description.
   *
   * <p>See {@link #upsertCostTagDescriptionByKeyWithHttpInfoAsync}.
   *
   * @param tagKey The tag key whose description is being upserted. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> upsertCostTagDescriptionByKeyAsync(
      String tagKey, CostTagDescriptionUpsertRequest body) {
    return upsertCostTagDescriptionByKeyWithHttpInfoAsync(tagKey, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update a Cloud Cost Management tag key description. The new description and optional
   * cloud scoping are supplied in the request body. Omit <code>cloud</code> to set a cross-cloud
   * default for the tag key.
   *
   * @param tagKey The tag key whose description is being upserted. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> upsertCostTagDescriptionByKeyWithHttpInfo(
      String tagKey, CostTagDescriptionUpsertRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'tagKey' when calling upsertCostTagDescriptionByKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertCostTagDescriptionByKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.upsertCostTagDescriptionByKey",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Upsert a Cloud Cost Management tag description.
   *
   * <p>See {@link #upsertCostTagDescriptionByKeyWithHttpInfo}.
   *
   * @param tagKey The tag key whose description is being upserted. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> upsertCostTagDescriptionByKeyWithHttpInfoAsync(
      String tagKey, CostTagDescriptionUpsertRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'tagKey' is set
    if (tagKey == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tagKey' when calling"
                  + " upsertCostTagDescriptionByKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling upsertCostTagDescriptionByKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/tag_descriptions/{tag_key}"
            .replaceAll("\\{" + "tag_key" + "\\}", apiClient.escapeString(tagKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.upsertCostTagDescriptionByKey",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Validate budget.
   *
   * <p>See {@link #validateBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return BudgetValidationResponse
   * @throws ApiException if fails to make API call
   */
  public BudgetValidationResponse validateBudget(BudgetValidationRequest body) throws ApiException {
    return validateBudgetWithHttpInfo(body).getData();
  }

  /**
   * Validate budget.
   *
   * <p>See {@link #validateBudgetWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;BudgetValidationResponse&gt;
   */
  public CompletableFuture<BudgetValidationResponse> validateBudgetAsync(
      BudgetValidationRequest body) {
    return validateBudgetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Validate a budget configuration without creating or modifying it
   *
   * @param body (required)
   * @return ApiResponse&lt;BudgetValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BudgetValidationResponse> validateBudgetWithHttpInfo(
      BudgetValidationRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateBudget");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.validateBudget",
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
        new GenericType<BudgetValidationResponse>() {});
  }

  /**
   * Validate budget.
   *
   * <p>See {@link #validateBudgetWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;BudgetValidationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BudgetValidationResponse>> validateBudgetWithHttpInfoAsync(
      BudgetValidationRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<BudgetValidationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling validateBudget"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.validateBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BudgetValidationResponse>> result = new CompletableFuture<>();
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
        new GenericType<BudgetValidationResponse>() {});
  }

  /**
   * Validate CSV budget.
   *
   * <p>See {@link #validateCsvBudgetWithHttpInfo}.
   *
   * @return ValidationResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationResponse validateCsvBudget() throws ApiException {
    return validateCsvBudgetWithHttpInfo().getData();
  }

  /**
   * Validate CSV budget.
   *
   * <p>See {@link #validateCsvBudgetWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ValidationResponse&gt;
   */
  public CompletableFuture<ValidationResponse> validateCsvBudgetAsync() {
    return validateCsvBudgetWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;ValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ValidationResponse> validateCsvBudgetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget/csv/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.validateCsvBudget",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ValidationResponse>() {});
  }

  /**
   * Validate CSV budget.
   *
   * <p>See {@link #validateCsvBudgetWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ValidationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ValidationResponse>> validateCsvBudgetWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/budget/csv/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.validateCsvBudget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ValidationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ValidationResponse>() {});
  }

  /**
   * Validate query.
   *
   * <p>See {@link #validateQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return RulesValidateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public RulesValidateQueryResponse validateQuery(RulesValidateQueryRequest body)
      throws ApiException {
    return validateQueryWithHttpInfo(body).getData();
  }

  /**
   * Validate query.
   *
   * <p>See {@link #validateQueryWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RulesValidateQueryResponse&gt;
   */
  public CompletableFuture<RulesValidateQueryResponse> validateQueryAsync(
      RulesValidateQueryRequest body) {
    return validateQueryWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Validate a tag pipeline query - Validate the syntax and structure of a tag pipeline query
   *
   * @param body (required)
   * @return ApiResponse&lt;RulesValidateQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RulesValidateQueryResponse> validateQueryWithHttpInfo(
      RulesValidateQueryRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/validate-query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.validateQuery",
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
        new GenericType<RulesValidateQueryResponse>() {});
  }

  /**
   * Validate query.
   *
   * <p>See {@link #validateQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RulesValidateQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RulesValidateQueryResponse>> validateQueryWithHttpInfoAsync(
      RulesValidateQueryRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RulesValidateQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling validateQuery"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/tags/enrichment/validate-query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.validateQuery",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RulesValidateQueryResponse>> result = new CompletableFuture<>();
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
        new GenericType<RulesValidateQueryResponse>() {});
  }
}
