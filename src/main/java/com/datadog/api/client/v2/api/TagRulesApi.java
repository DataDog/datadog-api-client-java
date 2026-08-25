package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TagRuleCreateRequest;
import com.datadog.api.client.v2.model.TagRuleInclude;
import com.datadog.api.client.v2.model.TagRuleResponse;
import com.datadog.api.client.v2.model.TagRuleScoreResponse;
import com.datadog.api.client.v2.model.TagRuleSource;
import com.datadog.api.client.v2.model.TagRuleUpdateRequest;
import com.datadog.api.client.v2.model.TagRulesListResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagRulesApi {
  private ApiClient apiClient;

  public TagRulesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TagRulesApi(ApiClient apiClient) {
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
   * Create a tag rule.
   *
   * <p>See {@link #createTagRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return TagRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleResponse createTagRule(TagRuleCreateRequest body) throws ApiException {
    return createTagRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a tag rule.
   *
   * <p>See {@link #createTagRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TagRuleResponse&gt;
   */
  public CompletableFuture<TagRuleResponse> createTagRuleAsync(TagRuleCreateRequest body) {
    return createTagRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new tag rule for the organization. The caller's organization is derived from the
   * authenticated user; cross-organization creation is not supported. Fields such as <code>rule_id
   * </code>, <code>version</code>, and the timestamp/audit fields are assigned by the server.
   *
   * @param body (required)
   * @return ApiResponse&lt;TagRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagRuleResponse> createTagRuleWithHttpInfo(TagRuleCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/tag_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.createTagRule",
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
        new GenericType<TagRuleResponse>() {});
  }

  /**
   * Create a tag rule.
   *
   * <p>See {@link #createTagRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagRuleResponse>> createTagRuleWithHttpInfoAsync(
      TagRuleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTagRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/tag_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.createTagRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagRuleResponse>() {});
  }

  /** Manage optional parameters to deleteTagRule. */
  public static class DeleteTagRuleOptionalParameters {
    private Boolean hardDelete;

    /**
     * Set hardDelete.
     *
     * @param hardDelete Whether to permanently delete the rule instead of performing a soft delete.
     *     Defaults to <code>false</code>. (optional)
     * @return DeleteTagRuleOptionalParameters
     */
    public DeleteTagRuleOptionalParameters hardDelete(Boolean hardDelete) {
      this.hardDelete = hardDelete;
      return this;
    }
  }

  /**
   * Delete a tag rule.
   *
   * <p>See {@link #deleteTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagRule(String ruleId) throws ApiException {
    deleteTagRuleWithHttpInfo(ruleId, new DeleteTagRuleOptionalParameters());
  }

  /**
   * Delete a tag rule.
   *
   * <p>See {@link #deleteTagRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagRuleAsync(String ruleId) {
    return deleteTagRuleWithHttpInfoAsync(ruleId, new DeleteTagRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag rule.
   *
   * <p>See {@link #deleteTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteTagRule(String ruleId, DeleteTagRuleOptionalParameters parameters)
      throws ApiException {
    deleteTagRuleWithHttpInfo(ruleId, parameters);
  }

  /**
   * Delete a tag rule.
   *
   * <p>See {@link #deleteTagRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagRuleAsync(
      String ruleId, DeleteTagRuleOptionalParameters parameters) {
    return deleteTagRuleWithHttpInfoAsync(ruleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag rule. By default the rule is soft-deleted so it can be recovered later and so that
   * historical score data remains queryable. Pass <code>hard_delete=true</code> to remove the rule
   * permanently.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTagRuleWithHttpInfo(
      String ruleId, DeleteTagRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteTagRule");
    }
    Boolean hardDelete = parameters.hardDelete;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hard_delete", hardDelete));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.deleteTagRule",
            localVarPath,
            localVarQueryParams,
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
   * Delete a tag rule.
   *
   * <p>See {@link #deleteTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule to delete. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagRuleWithHttpInfoAsync(
      String ruleId, DeleteTagRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteTagRule";
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
              400, "Missing the required parameter 'ruleId' when calling deleteTagRule"));
      return result;
    }
    Boolean hardDelete = parameters.hardDelete;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hard_delete", hardDelete));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.deleteTagRule",
              localVarPath,
              localVarQueryParams,
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

  /** Manage optional parameters to getTagRule. */
  public static class GetTagRuleOptionalParameters {
    private TagRuleInclude include;
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include alongside the rule.
     *     Currently the only supported value is <code>score</code>. (optional)
     * @return GetTagRuleOptionalParameters
     */
    public GetTagRuleOptionalParameters include(TagRuleInclude include) {
      this.include = include;
      return this;
    }

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. (optional)
     * @return GetTagRuleOptionalParameters
     */
    public GetTagRuleOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return GetTagRuleOptionalParameters
     */
    public GetTagRuleOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * Get a tag rule.
   *
   * <p>See {@link #getTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @return TagRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleResponse getTagRule(String ruleId) throws ApiException {
    return getTagRuleWithHttpInfo(ruleId, new GetTagRuleOptionalParameters()).getData();
  }

  /**
   * Get a tag rule.
   *
   * <p>See {@link #getTagRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @return CompletableFuture&lt;TagRuleResponse&gt;
   */
  public CompletableFuture<TagRuleResponse> getTagRuleAsync(String ruleId) {
    return getTagRuleWithHttpInfoAsync(ruleId, new GetTagRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a tag rule.
   *
   * <p>See {@link #getTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return TagRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleResponse getTagRule(String ruleId, GetTagRuleOptionalParameters parameters)
      throws ApiException {
    return getTagRuleWithHttpInfo(ruleId, parameters).getData();
  }

  /**
   * Get a tag rule.
   *
   * <p>See {@link #getTagRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagRuleResponse&gt;
   */
  public CompletableFuture<TagRuleResponse> getTagRuleAsync(
      String ruleId, GetTagRuleOptionalParameters parameters) {
    return getTagRuleWithHttpInfoAsync(ruleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single tag rule by ID. Optionally include the rule's current compliance score via
   * the <code>include=score</code> query parameter. Rules belonging to other organizations cannot
   * be retrieved.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagRuleResponse> getTagRuleWithHttpInfo(
      String ruleId, GetTagRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getTagRule");
    }
    TagRuleInclude include = parameters.include;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.getTagRule",
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
        new GenericType<TagRuleResponse>() {});
  }

  /**
   * Get a tag rule.
   *
   * <p>See {@link #getTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagRuleResponse>> getTagRuleWithHttpInfoAsync(
      String ruleId, GetTagRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'ruleId' when calling getTagRule"));
      return result;
    }
    TagRuleInclude include = parameters.include;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.getTagRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagRuleResponse>() {});
  }

  /** Manage optional parameters to getTagRuleScore. */
  public static class GetTagRuleScoreOptionalParameters {
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. (optional)
     * @return GetTagRuleScoreOptionalParameters
     */
    public GetTagRuleScoreOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return GetTagRuleScoreOptionalParameters
     */
    public GetTagRuleScoreOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * Get a tag rule compliance score.
   *
   * <p>See {@link #getTagRuleScoreWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @return TagRuleScoreResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleScoreResponse getTagRuleScore(String ruleId) throws ApiException {
    return getTagRuleScoreWithHttpInfo(ruleId, new GetTagRuleScoreOptionalParameters()).getData();
  }

  /**
   * Get a tag rule compliance score.
   *
   * <p>See {@link #getTagRuleScoreWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @return CompletableFuture&lt;TagRuleScoreResponse&gt;
   */
  public CompletableFuture<TagRuleScoreResponse> getTagRuleScoreAsync(String ruleId) {
    return getTagRuleScoreWithHttpInfoAsync(ruleId, new GetTagRuleScoreOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a tag rule compliance score.
   *
   * <p>See {@link #getTagRuleScoreWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return TagRuleScoreResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleScoreResponse getTagRuleScore(
      String ruleId, GetTagRuleScoreOptionalParameters parameters) throws ApiException {
    return getTagRuleScoreWithHttpInfo(ruleId, parameters).getData();
  }

  /**
   * Get a tag rule compliance score.
   *
   * <p>See {@link #getTagRuleScoreWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagRuleScoreResponse&gt;
   */
  public CompletableFuture<TagRuleScoreResponse> getTagRuleScoreAsync(
      String ruleId, GetTagRuleScoreOptionalParameters parameters) {
    return getTagRuleScoreWithHttpInfoAsync(ruleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the compliance score for a single tag rule. The score is computed over the requested
   * time window (or a source-appropriate default) and represents the percentage of telemetry within
   * that window that conforms to the rule. A <code>null</code> score indicates that no relevant
   * telemetry was found.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagRuleScoreResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagRuleScoreResponse> getTagRuleScoreWithHttpInfo(
      String ruleId, GetTagRuleScoreOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagRuleScore";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getTagRuleScore");
    }
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}/score"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.getTagRuleScore",
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
        new GenericType<TagRuleScoreResponse>() {});
  }

  /**
   * Get a tag rule compliance score.
   *
   * <p>See {@link #getTagRuleScoreWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagRuleScoreResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagRuleScoreResponse>> getTagRuleScoreWithHttpInfoAsync(
      String ruleId, GetTagRuleScoreOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getTagRuleScore";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagRuleScoreResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<TagRuleScoreResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getTagRuleScore"));
      return result;
    }
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}/score"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.getTagRuleScore",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagRuleScoreResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagRuleScoreResponse>() {});
  }

  /** Manage optional parameters to listTagRules. */
  public static class ListTagRulesOptionalParameters {
    private Boolean includeDisabled;
    private Boolean includeDeleted;
    private TagRuleInclude include;
    private TagRuleSource filterSource;
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set includeDisabled.
     *
     * @param includeDisabled Whether to include rules that are currently disabled. Defaults to
     *     <code>false</code>. (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters includeDisabled(Boolean includeDisabled) {
      this.includeDisabled = includeDisabled;
      return this;
    }

    /**
     * Set includeDeleted.
     *
     * @param includeDeleted Whether to include rules that have been soft-deleted. Defaults to
     *     <code>false</code>. (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters includeDeleted(Boolean includeDeleted) {
      this.includeDeleted = includeDeleted;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include alongside each rule in
     *     the response. Currently the only supported value is <code>score</code>. (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters include(TagRuleInclude include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterSource.
     *
     * @param filterSource Restrict the result set to rules whose source matches the given value.
     *     (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters filterSource(TagRuleSource filterSource) {
      this.filterSource = filterSource;
      return this;
    }

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Defaults to a recent window appropriate for the source.
     *     (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return ListTagRulesOptionalParameters
     */
    public ListTagRulesOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * List tag rules.
   *
   * <p>See {@link #listTagRulesWithHttpInfo}.
   *
   * @return TagRulesListResponse
   * @throws ApiException if fails to make API call
   */
  public TagRulesListResponse listTagRules() throws ApiException {
    return listTagRulesWithHttpInfo(new ListTagRulesOptionalParameters()).getData();
  }

  /**
   * List tag rules.
   *
   * <p>See {@link #listTagRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TagRulesListResponse&gt;
   */
  public CompletableFuture<TagRulesListResponse> listTagRulesAsync() {
    return listTagRulesWithHttpInfoAsync(new ListTagRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag rules.
   *
   * <p>See {@link #listTagRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TagRulesListResponse
   * @throws ApiException if fails to make API call
   */
  public TagRulesListResponse listTagRules(ListTagRulesOptionalParameters parameters)
      throws ApiException {
    return listTagRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List tag rules.
   *
   * <p>See {@link #listTagRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagRulesListResponse&gt;
   */
  public CompletableFuture<TagRulesListResponse> listTagRulesAsync(
      ListTagRulesOptionalParameters parameters) {
    return listTagRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve all tag rules for the organization. Optionally include disabled or deleted rules,
   * filter by telemetry source, and include each rule's current compliance score via the <code>
   * include=score</code> query parameter.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagRulesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagRulesListResponse> listTagRulesWithHttpInfo(
      ListTagRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTagRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean includeDisabled = parameters.includeDisabled;
    Boolean includeDeleted = parameters.includeDeleted;
    TagRuleInclude include = parameters.include;
    TagRuleSource filterSource = parameters.filterSource;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath = "/api/v2/governance/tag_rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_disabled", includeDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.listTagRules",
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
        new GenericType<TagRulesListResponse>() {});
  }

  /**
   * List tag rules.
   *
   * <p>See {@link #listTagRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagRulesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagRulesListResponse>> listTagRulesWithHttpInfoAsync(
      ListTagRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTagRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagRulesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean includeDisabled = parameters.includeDisabled;
    Boolean includeDeleted = parameters.includeDeleted;
    TagRuleInclude include = parameters.include;
    TagRuleSource filterSource = parameters.filterSource;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath = "/api/v2/governance/tag_rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_disabled", includeDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.listTagRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagRulesListResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagRulesListResponse>() {});
  }

  /**
   * Update a tag rule.
   *
   * <p>See {@link #updateTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule to update. (required)
   * @param body (required)
   * @return TagRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TagRuleResponse updateTagRule(String ruleId, TagRuleUpdateRequest body)
      throws ApiException {
    return updateTagRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update a tag rule.
   *
   * <p>See {@link #updateTagRuleWithHttpInfoAsync}.
   *
   * @param ruleId The unique identifier of the tag rule to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TagRuleResponse&gt;
   */
  public CompletableFuture<TagRuleResponse> updateTagRuleAsync(
      String ruleId, TagRuleUpdateRequest body) {
    return updateTagRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update one or more attributes of an existing tag rule. Only the fields supplied in the request
   * body are modified; omitted fields retain their current values. The rule's <code>source</code>
   * cannot be changed after creation.
   *
   * @param ruleId The unique identifier of the tag rule to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;TagRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagRuleResponse> updateTagRuleWithHttpInfo(
      String ruleId, TagRuleUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateTagRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTagRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagRulesApi.updateTagRule",
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
        new GenericType<TagRuleResponse>() {});
  }

  /**
   * Update a tag rule.
   *
   * <p>See {@link #updateTagRuleWithHttpInfo}.
   *
   * @param ruleId The unique identifier of the tag rule to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagRuleResponse>> updateTagRuleWithHttpInfoAsync(
      String ruleId, TagRuleUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTagRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling updateTagRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTagRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/tag_rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagRulesApi.updateTagRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagRuleResponse>() {});
  }
}
