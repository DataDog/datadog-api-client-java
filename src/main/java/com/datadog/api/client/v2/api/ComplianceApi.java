package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RuleBasedViewResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComplianceApi {
  private ApiClient apiClient;

  public ComplianceApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ComplianceApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getRuleBasedView. */
  public static class GetRuleBasedViewOptionalParameters {
    private String framework;
    private String version;
    private Boolean queryFindingsWithoutFrameworkVersion;
    private Boolean includeRulesWithoutFindings;
    private Boolean isCustom;
    private String query;

    /**
     * Set framework.
     *
     * @param framework Compliance framework handle to filter rules and findings by. (optional,
     *     default to "")
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters framework(String framework) {
      this.framework = framework;
      return this;
    }

    /**
     * Set version.
     *
     * @param version Version of the compliance framework to filter rules and findings by.
     *     (optional)
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set queryFindingsWithoutFrameworkVersion.
     *
     * @param queryFindingsWithoutFrameworkVersion When <code>true</code>, returns findings without
     *     a <code>framework_version</code> tag. Used for findings from custom frameworks or those
     *     created before framework versioning was introduced. (optional, default to false)
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters queryFindingsWithoutFrameworkVersion(
        Boolean queryFindingsWithoutFrameworkVersion) {
      this.queryFindingsWithoutFrameworkVersion = queryFindingsWithoutFrameworkVersion;
      return this;
    }

    /**
     * Set includeRulesWithoutFindings.
     *
     * @param includeRulesWithoutFindings When <code>true</code>, includes rules in the response
     *     that have no associated findings. (optional, default to false)
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters includeRulesWithoutFindings(
        Boolean includeRulesWithoutFindings) {
      this.includeRulesWithoutFindings = includeRulesWithoutFindings;
      return this;
    }

    /**
     * Set isCustom.
     *
     * @param isCustom Set to <code>true</code> when the requested <code>framework</code> is a
     *     custom framework. (optional)
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters isCustom(Boolean isCustom) {
      this.isCustom = isCustom;
      return this;
    }

    /**
     * Set query.
     *
     * @param query Additional event-platform filters applied to the underlying findings query. For
     *     example, <code>scored:true project_id:datadog-prod-us5</code>. (optional, default to "")
     * @return GetRuleBasedViewOptionalParameters
     */
    public GetRuleBasedViewOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * Get the rule-based view of compliance findings.
   *
   * <p>See {@link #getRuleBasedViewWithHttpInfo}.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @return RuleBasedViewResponse
   * @throws ApiException if fails to make API call
   */
  public RuleBasedViewResponse getRuleBasedView(Long to) throws ApiException {
    return getRuleBasedViewWithHttpInfo(to, new GetRuleBasedViewOptionalParameters()).getData();
  }

  /**
   * Get the rule-based view of compliance findings.
   *
   * <p>See {@link #getRuleBasedViewWithHttpInfoAsync}.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @return CompletableFuture&lt;RuleBasedViewResponse&gt;
   */
  public CompletableFuture<RuleBasedViewResponse> getRuleBasedViewAsync(Long to) {
    return getRuleBasedViewWithHttpInfoAsync(to, new GetRuleBasedViewOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the rule-based view of compliance findings.
   *
   * <p>See {@link #getRuleBasedViewWithHttpInfo}.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return RuleBasedViewResponse
   * @throws ApiException if fails to make API call
   */
  public RuleBasedViewResponse getRuleBasedView(
      Long to, GetRuleBasedViewOptionalParameters parameters) throws ApiException {
    return getRuleBasedViewWithHttpInfo(to, parameters).getData();
  }

  /**
   * Get the rule-based view of compliance findings.
   *
   * <p>See {@link #getRuleBasedViewWithHttpInfoAsync}.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RuleBasedViewResponse&gt;
   */
  public CompletableFuture<RuleBasedViewResponse> getRuleBasedViewAsync(
      Long to, GetRuleBasedViewOptionalParameters parameters) {
    return getRuleBasedViewWithHttpInfoAsync(to, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an aggregated view of compliance rules with their pass, fail, and muted finding counts.
   * Supports filtering by compliance framework, framework version, and additional query filters.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RuleBasedViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RuleBasedViewResponse> getRuleBasedViewWithHttpInfo(
      Long to, GetRuleBasedViewOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRuleBasedView";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(
          400, "Missing the required parameter 'to' when calling getRuleBasedView");
    }
    String framework = parameters.framework;
    String version = parameters.version;
    Boolean queryFindingsWithoutFrameworkVersion = parameters.queryFindingsWithoutFrameworkVersion;
    Boolean includeRulesWithoutFindings = parameters.includeRulesWithoutFindings;
    Boolean isCustom = parameters.isCustom;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/compliance_findings/rule_based_view";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "framework", framework));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "query_findings_without_framework_version", queryFindingsWithoutFrameworkVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "include_rules_without_findings", includeRulesWithoutFindings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_custom", isCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ComplianceApi.getRuleBasedView",
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
        new GenericType<RuleBasedViewResponse>() {});
  }

  /**
   * Get the rule-based view of compliance findings.
   *
   * <p>See {@link #getRuleBasedViewWithHttpInfo}.
   *
   * @param to Timestamp of the query end, in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RuleBasedViewResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RuleBasedViewResponse>> getRuleBasedViewWithHttpInfoAsync(
      Long to, GetRuleBasedViewOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getRuleBasedView";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RuleBasedViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'to' is set
    if (to == null) {
      CompletableFuture<ApiResponse<RuleBasedViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'to' when calling getRuleBasedView"));
      return result;
    }
    String framework = parameters.framework;
    String version = parameters.version;
    Boolean queryFindingsWithoutFrameworkVersion = parameters.queryFindingsWithoutFrameworkVersion;
    Boolean includeRulesWithoutFindings = parameters.includeRulesWithoutFindings;
    Boolean isCustom = parameters.isCustom;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/compliance_findings/rule_based_view";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "framework", framework));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "query_findings_without_framework_version", queryFindingsWithoutFrameworkVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "include_rules_without_findings", includeRulesWithoutFindings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_custom", isCustom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ComplianceApi.getRuleBasedView",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RuleBasedViewResponse>> result = new CompletableFuture<>();
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
        new GenericType<RuleBasedViewResponse>() {});
  }
}
