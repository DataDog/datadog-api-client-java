package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TagPoliciesListResponse;
import com.datadog.api.client.v2.model.TagPolicyCreateRequest;
import com.datadog.api.client.v2.model.TagPolicyInclude;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicyScoreResponse;
import com.datadog.api.client.v2.model.TagPolicySource;
import com.datadog.api.client.v2.model.TagPolicyUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagPoliciesApi {
  private ApiClient apiClient;

  public TagPoliciesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TagPoliciesApi(ApiClient apiClient) {
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
   * Create a tag policy.
   *
   * <p>See {@link #createTagPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return TagPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyResponse createTagPolicy(TagPolicyCreateRequest body) throws ApiException {
    return createTagPolicyWithHttpInfo(body).getData();
  }

  /**
   * Create a tag policy.
   *
   * <p>See {@link #createTagPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TagPolicyResponse&gt;
   */
  public CompletableFuture<TagPolicyResponse> createTagPolicyAsync(TagPolicyCreateRequest body) {
    return createTagPolicyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new tag policy for the organization. The caller's organization is derived from the
   * authenticated user; cross-organization creation is not supported. Fields such as <code>
   * policy_id</code>, <code>version</code>, and the timestamp/audit fields are assigned by the
   * server.
   *
   * @param body (required)
   * @return ApiResponse&lt;TagPolicyResponse&gt;
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
  public ApiResponse<TagPolicyResponse> createTagPolicyWithHttpInfo(TagPolicyCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTagPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.createTagPolicy",
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
        new GenericType<TagPolicyResponse>() {});
  }

  /**
   * Create a tag policy.
   *
   * <p>See {@link #createTagPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyResponse>> createTagPolicyWithHttpInfoAsync(
      TagPolicyCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTagPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.createTagPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPolicyResponse>() {});
  }

  /** Manage optional parameters to deleteTagPolicy. */
  public static class DeleteTagPolicyOptionalParameters {
    private Boolean hardDelete;

    /**
     * Set hardDelete.
     *
     * @param hardDelete Whether to permanently delete the policy instead of performing a soft
     *     delete. Defaults to <code>false</code>. (optional)
     * @return DeleteTagPolicyOptionalParameters
     */
    public DeleteTagPolicyOptionalParameters hardDelete(Boolean hardDelete) {
      this.hardDelete = hardDelete;
      return this;
    }
  }

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagPolicy(String policyId) throws ApiException {
    deleteTagPolicyWithHttpInfo(policyId, new DeleteTagPolicyOptionalParameters());
  }

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagPolicyAsync(String policyId) {
    return deleteTagPolicyWithHttpInfoAsync(policyId, new DeleteTagPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteTagPolicy(String policyId, DeleteTagPolicyOptionalParameters parameters)
      throws ApiException {
    deleteTagPolicyWithHttpInfo(policyId, parameters);
  }

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagPolicyAsync(
      String policyId, DeleteTagPolicyOptionalParameters parameters) {
    return deleteTagPolicyWithHttpInfoAsync(policyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag policy. By default the policy is soft-deleted so it can be recovered later and so
   * that historical score data remains queryable. Pass <code>hard_delete=true</code> to remove the
   * policy permanently.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
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
  public ApiResponse<Void> deleteTagPolicyWithHttpInfo(
      String policyId, DeleteTagPolicyOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling deleteTagPolicy");
    }
    Boolean hardDelete = parameters.hardDelete;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hard_delete", hardDelete));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.deleteTagPolicy",
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
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy to delete. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagPolicyWithHttpInfoAsync(
      String policyId, DeleteTagPolicyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'policyId' when calling deleteTagPolicy"));
      return result;
    }
    Boolean hardDelete = parameters.hardDelete;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hard_delete", hardDelete));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.deleteTagPolicy",
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

  /** Manage optional parameters to getTagPolicy. */
  public static class GetTagPolicyOptionalParameters {
    private TagPolicyInclude include;
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include alongside the policy.
     *     Currently the only supported value is <code>score</code>. (optional)
     * @return GetTagPolicyOptionalParameters
     */
    public GetTagPolicyOptionalParameters include(TagPolicyInclude include) {
      this.include = include;
      return this;
    }

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. (optional)
     * @return GetTagPolicyOptionalParameters
     */
    public GetTagPolicyOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return GetTagPolicyOptionalParameters
     */
    public GetTagPolicyOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @return TagPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyResponse getTagPolicy(String policyId) throws ApiException {
    return getTagPolicyWithHttpInfo(policyId, new GetTagPolicyOptionalParameters()).getData();
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @return CompletableFuture&lt;TagPolicyResponse&gt;
   */
  public CompletableFuture<TagPolicyResponse> getTagPolicyAsync(String policyId) {
    return getTagPolicyWithHttpInfoAsync(policyId, new GetTagPolicyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return TagPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyResponse getTagPolicy(String policyId, GetTagPolicyOptionalParameters parameters)
      throws ApiException {
    return getTagPolicyWithHttpInfo(policyId, parameters).getData();
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagPolicyResponse&gt;
   */
  public CompletableFuture<TagPolicyResponse> getTagPolicyAsync(
      String policyId, GetTagPolicyOptionalParameters parameters) {
    return getTagPolicyWithHttpInfoAsync(policyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single tag policy by ID. Optionally include the policy's current compliance score
   * via the <code>include=score</code> query parameter. Policies belonging to other organizations
   * cannot be retrieved.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagPolicyResponse&gt;
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
  public ApiResponse<TagPolicyResponse> getTagPolicyWithHttpInfo(
      String policyId, GetTagPolicyOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling getTagPolicy");
    }
    TagPolicyInclude include = parameters.include;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.getTagPolicy",
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
        new GenericType<TagPolicyResponse>() {});
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyResponse>> getTagPolicyWithHttpInfoAsync(
      String policyId, GetTagPolicyOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'policyId' when calling getTagPolicy"));
      return result;
    }
    TagPolicyInclude include = parameters.include;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.getTagPolicy",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPolicyResponse>() {});
  }

  /** Manage optional parameters to getTagPolicyScore. */
  public static class GetTagPolicyScoreOptionalParameters {
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. (optional)
     * @return GetTagPolicyScoreOptionalParameters
     */
    public GetTagPolicyScoreOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return GetTagPolicyScoreOptionalParameters
     */
    public GetTagPolicyScoreOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * Get a tag policy compliance score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @return TagPolicyScoreResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyScoreResponse getTagPolicyScore(String policyId) throws ApiException {
    return getTagPolicyScoreWithHttpInfo(policyId, new GetTagPolicyScoreOptionalParameters())
        .getData();
  }

  /**
   * Get a tag policy compliance score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @return CompletableFuture&lt;TagPolicyScoreResponse&gt;
   */
  public CompletableFuture<TagPolicyScoreResponse> getTagPolicyScoreAsync(String policyId) {
    return getTagPolicyScoreWithHttpInfoAsync(policyId, new GetTagPolicyScoreOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a tag policy compliance score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return TagPolicyScoreResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyScoreResponse getTagPolicyScore(
      String policyId, GetTagPolicyScoreOptionalParameters parameters) throws ApiException {
    return getTagPolicyScoreWithHttpInfo(policyId, parameters).getData();
  }

  /**
   * Get a tag policy compliance score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagPolicyScoreResponse&gt;
   */
  public CompletableFuture<TagPolicyScoreResponse> getTagPolicyScoreAsync(
      String policyId, GetTagPolicyScoreOptionalParameters parameters) {
    return getTagPolicyScoreWithHttpInfoAsync(policyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the compliance score for a single tag policy. The score is computed over the requested
   * time window (or a source-appropriate default) and represents the percentage of telemetry within
   * that window that conforms to the policy. A <code>null</code> score indicates that no relevant
   * telemetry was found.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagPolicyScoreResponse&gt;
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
  public ApiResponse<TagPolicyScoreResponse> getTagPolicyScoreWithHttpInfo(
      String policyId, GetTagPolicyScoreOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTagPolicyScore";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling getTagPolicyScore");
    }
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}/score"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.getTagPolicyScore",
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
        new GenericType<TagPolicyScoreResponse>() {});
  }

  /**
   * Get a tag policy compliance score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyScoreResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyScoreResponse>> getTagPolicyScoreWithHttpInfoAsync(
      String policyId, GetTagPolicyScoreOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getTagPolicyScore";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPolicyScoreResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<TagPolicyScoreResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'policyId' when calling getTagPolicyScore"));
      return result;
    }
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}/score"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_start", tsStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts_end", tsEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.getTagPolicyScore",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagPolicyScoreResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPolicyScoreResponse>() {});
  }

  /** Manage optional parameters to listTagPolicies. */
  public static class ListTagPoliciesOptionalParameters {
    private Boolean includeDisabled;
    private Boolean includeDeleted;
    private TagPolicyInclude include;
    private TagPolicySource filterSource;
    private Long tsStart;
    private Long tsEnd;

    /**
     * Set includeDisabled.
     *
     * @param includeDisabled Whether to include policies that are currently disabled. Defaults to
     *     <code>false</code>. (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters includeDisabled(Boolean includeDisabled) {
      this.includeDisabled = includeDisabled;
      return this;
    }

    /**
     * Set includeDeleted.
     *
     * @param includeDeleted Whether to include policies that have been soft-deleted. Defaults to
     *     <code>false</code>. (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters includeDeleted(Boolean includeDeleted) {
      this.includeDeleted = includeDeleted;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include alongside each policy in
     *     the response. Currently the only supported value is <code>score</code>. (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters include(TagPolicyInclude include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterSource.
     *
     * @param filterSource Restrict the result set to policies whose source matches the given value.
     *     (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters filterSource(TagPolicySource filterSource) {
      this.filterSource = filterSource;
      return this;
    }

    /**
     * Set tsStart.
     *
     * @param tsStart Start of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Defaults to a recent window appropriate for the source.
     *     (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters tsStart(Long tsStart) {
      this.tsStart = tsStart;
      return this;
    }

    /**
     * Set tsEnd.
     *
     * @param tsEnd End of the time window used for compliance score computation, as a Unix
     *     timestamp in milliseconds. Must be in the past and greater than <code>ts_start</code>.
     *     (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters tsEnd(Long tsEnd) {
      this.tsEnd = tsEnd;
      return this;
    }
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfo}.
   *
   * @return TagPoliciesListResponse
   * @throws ApiException if fails to make API call
   */
  public TagPoliciesListResponse listTagPolicies() throws ApiException {
    return listTagPoliciesWithHttpInfo(new ListTagPoliciesOptionalParameters()).getData();
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TagPoliciesListResponse&gt;
   */
  public CompletableFuture<TagPoliciesListResponse> listTagPoliciesAsync() {
    return listTagPoliciesWithHttpInfoAsync(new ListTagPoliciesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TagPoliciesListResponse
   * @throws ApiException if fails to make API call
   */
  public TagPoliciesListResponse listTagPolicies(ListTagPoliciesOptionalParameters parameters)
      throws ApiException {
    return listTagPoliciesWithHttpInfo(parameters).getData();
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagPoliciesListResponse&gt;
   */
  public CompletableFuture<TagPoliciesListResponse> listTagPoliciesAsync(
      ListTagPoliciesOptionalParameters parameters) {
    return listTagPoliciesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve all tag policies for the organization. Optionally include disabled or deleted
   * policies, filter by telemetry source, and include each policy's current compliance score via
   * the <code>include=score</code> query parameter.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagPoliciesListResponse&gt;
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
  public ApiResponse<TagPoliciesListResponse> listTagPoliciesWithHttpInfo(
      ListTagPoliciesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTagPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean includeDisabled = parameters.includeDisabled;
    Boolean includeDeleted = parameters.includeDeleted;
    TagPolicyInclude include = parameters.include;
    TagPolicySource filterSource = parameters.filterSource;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

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
            "v2.TagPoliciesApi.listTagPolicies",
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
        new GenericType<TagPoliciesListResponse>() {});
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagPoliciesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPoliciesListResponse>> listTagPoliciesWithHttpInfoAsync(
      ListTagPoliciesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTagPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPoliciesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean includeDisabled = parameters.includeDisabled;
    Boolean includeDeleted = parameters.includeDeleted;
    TagPolicyInclude include = parameters.include;
    TagPolicySource filterSource = parameters.filterSource;
    Long tsStart = parameters.tsStart;
    Long tsEnd = parameters.tsEnd;
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

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
              "v2.TagPoliciesApi.listTagPolicies",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagPoliciesListResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPoliciesListResponse>() {});
  }

  /**
   * Update a tag policy.
   *
   * <p>See {@link #updateTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy to update. (required)
   * @param body (required)
   * @return TagPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyResponse updateTagPolicy(String policyId, TagPolicyUpdateRequest body)
      throws ApiException {
    return updateTagPolicyWithHttpInfo(policyId, body).getData();
  }

  /**
   * Update a tag policy.
   *
   * <p>See {@link #updateTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The unique identifier of the tag policy to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TagPolicyResponse&gt;
   */
  public CompletableFuture<TagPolicyResponse> updateTagPolicyAsync(
      String policyId, TagPolicyUpdateRequest body) {
    return updateTagPolicyWithHttpInfoAsync(policyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update one or more attributes of an existing tag policy. Only the fields supplied in the
   * request body are modified; omitted fields retain their current values. The policy's <code>
   * source</code> cannot be changed after creation.
   *
   * @param policyId The unique identifier of the tag policy to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;TagPolicyResponse&gt;
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
  public ApiResponse<TagPolicyResponse> updateTagPolicyWithHttpInfo(
      String policyId, TagPolicyUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyId' when calling updateTagPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTagPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.updateTagPolicy",
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
        new GenericType<TagPolicyResponse>() {});
  }

  /**
   * Update a tag policy.
   *
   * <p>See {@link #updateTagPolicyWithHttpInfo}.
   *
   * @param policyId The unique identifier of the tag policy to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyResponse>> updateTagPolicyWithHttpInfoAsync(
      String policyId, TagPolicyUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTagPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'policyId' when calling updateTagPolicy"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTagPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.updateTagPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPolicyResponse>() {});
  }
}
