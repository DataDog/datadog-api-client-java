package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequest;
import com.datadog.api.client.v2.model.ArbitraryRuleResponse;
import com.datadog.api.client.v2.model.ArbitraryRuleResponseArray;
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
import com.datadog.api.client.v2.model.ReorderRuleResourceArray;
import com.datadog.api.client.v2.model.ReorderRulesetResourceArray;
import com.datadog.api.client.v2.model.RulesValidateQueryRequest;
import com.datadog.api.client.v2.model.RulesValidateQueryResponse;
import com.datadog.api.client.v2.model.RulesetResp;
import com.datadog.api.client.v2.model.RulesetRespArray;
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
   * conditions: "is", "is not", "contains", "does not contain", "=", "!=", "like", "not like", "is
   * all values", "is untagged" - Use <strong>values</strong> for multi-value conditions: "in", "not
   * in" - Cannot use both value and values simultaneously.
   *
   * <p><strong>Supported operators</strong>: is, is not, is all values, is untagged, contains, does
   * not contain, in, not in, =, !=, like, not like
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
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @return BudgetValidationRequest
   * @throws ApiException if fails to make API call
   */
  public BudgetValidationRequest getBudget(String budgetId) throws ApiException {
    return getBudgetWithHttpInfo(budgetId).getData();
  }

  /**
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfoAsync}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture&lt;BudgetValidationRequest&gt;
   */
  public CompletableFuture<BudgetValidationRequest> getBudgetAsync(String budgetId) {
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
   * @return ApiResponse&lt;BudgetValidationRequest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BudgetValidationRequest> getBudgetWithHttpInfo(String budgetId)
      throws ApiException {
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
        new GenericType<BudgetValidationRequest>() {});
  }

  /**
   * Get budget.
   *
   * <p>See {@link #getBudgetWithHttpInfo}.
   *
   * @param budgetId Budget id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;BudgetValidationRequest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BudgetValidationRequest>> getBudgetWithHttpInfoAsync(
      String budgetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'budgetId' is set
    if (budgetId == null) {
      CompletableFuture<ApiResponse<BudgetValidationRequest>> result = new CompletableFuture<>();
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
      CompletableFuture<ApiResponse<BudgetValidationRequest>> result = new CompletableFuture<>();
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
        new GenericType<BudgetValidationRequest>() {});
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

  /** Manage optional parameters to listCustomCostsFiles. */
  public static class ListCustomCostsFilesOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String filterStatus;
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
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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
   * conditions: "is", "is not", "contains", "does not contain", "=", "!=", "like", "not like", "is
   * all values", "is untagged" - Use <strong>values</strong> for multi-value conditions: "in", "not
   * in" - Cannot use both value and values simultaneously.
   *
   * <p><strong>Supported operators</strong>: is, is not, is all values, is untagged, contains, does
   * not contain, in, not in, =, !=, like, not like
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
