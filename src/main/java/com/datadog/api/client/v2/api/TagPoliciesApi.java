package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TagPoliciesResponse;
import com.datadog.api.client.v2.model.TagPolicyCreateRequest;
import com.datadog.api.client.v2.model.TagPolicyResponse;
import com.datadog.api.client.v2.model.TagPolicyScoreResponse;
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
   * Create a new tag policy for the organization.
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
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
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

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagPolicy(String policyId) throws ApiException {
    deleteTagPolicyWithHttpInfo(policyId);
  }

  /**
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTagPolicyAsync(String policyId) {
    return deleteTagPolicyWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific tag policy by its ID.
   *
   * @param policyId The ID of the tag policy. (required)
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
  public ApiResponse<Void> deleteTagPolicyWithHttpInfo(String policyId) throws ApiException {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.deleteTagPolicy",
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
   * Delete a tag policy.
   *
   * <p>See {@link #deleteTagPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTagPolicyWithHttpInfoAsync(String policyId) {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.deleteTagPolicy",
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
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return TagPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyResponse getTagPolicy(String policyId) throws ApiException {
    return getTagPolicyWithHttpInfo(policyId).getData();
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfoAsync}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture&lt;TagPolicyResponse&gt;
   */
  public CompletableFuture<TagPolicyResponse> getTagPolicyAsync(String policyId) {
    return getTagPolicyWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific tag policy by its ID.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return ApiResponse&lt;TagPolicyResponse&gt;
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
  public ApiResponse<TagPolicyResponse> getTagPolicyWithHttpInfo(String policyId)
      throws ApiException {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.getTagPolicy",
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
        new GenericType<TagPolicyResponse>() {});
  }

  /**
   * Get a tag policy.
   *
   * <p>See {@link #getTagPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyResponse>> getTagPolicyWithHttpInfoAsync(
      String policyId) {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.getTagPolicy",
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
   * Get tag policy score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return TagPolicyScoreResponse
   * @throws ApiException if fails to make API call
   */
  public TagPolicyScoreResponse getTagPolicyScore(String policyId) throws ApiException {
    return getTagPolicyScoreWithHttpInfo(policyId).getData();
  }

  /**
   * Get tag policy score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfoAsync}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture&lt;TagPolicyScoreResponse&gt;
   */
  public CompletableFuture<TagPolicyScoreResponse> getTagPolicyScoreAsync(String policyId) {
    return getTagPolicyScoreWithHttpInfoAsync(policyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the compliance score for a specific tag policy.
   *
   * @param policyId The ID of the tag policy. (required)
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
  public ApiResponse<TagPolicyScoreResponse> getTagPolicyScoreWithHttpInfo(String policyId)
      throws ApiException {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}/score"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TagPoliciesApi.getTagPolicyScore",
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
        new GenericType<TagPolicyScoreResponse>() {});
  }

  /**
   * Get tag policy score.
   *
   * <p>See {@link #getTagPolicyScoreWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TagPolicyScoreResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPolicyScoreResponse>> getTagPolicyScoreWithHttpInfoAsync(
      String policyId) {
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
    // create path and map variables
    String localVarPath =
        "/api/v2/tag-policies/{policy_id}/score"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TagPoliciesApi.getTagPolicyScore",
              localVarPath,
              new ArrayList<Pair>(),
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
    private String filterSource;

    /**
     * Set filterSource.
     *
     * @param filterSource Filter policies by data source (e.g., logs, metrics). (optional)
     * @return ListTagPoliciesOptionalParameters
     */
    public ListTagPoliciesOptionalParameters filterSource(String filterSource) {
      this.filterSource = filterSource;
      return this;
    }
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfo}.
   *
   * @return TagPoliciesResponse
   * @throws ApiException if fails to make API call
   */
  public TagPoliciesResponse listTagPolicies() throws ApiException {
    return listTagPoliciesWithHttpInfo(new ListTagPoliciesOptionalParameters()).getData();
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TagPoliciesResponse&gt;
   */
  public CompletableFuture<TagPoliciesResponse> listTagPoliciesAsync() {
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
   * @return TagPoliciesResponse
   * @throws ApiException if fails to make API call
   */
  public TagPoliciesResponse listTagPolicies(ListTagPoliciesOptionalParameters parameters)
      throws ApiException {
    return listTagPoliciesWithHttpInfo(parameters).getData();
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagPoliciesResponse&gt;
   */
  public CompletableFuture<TagPoliciesResponse> listTagPoliciesAsync(
      ListTagPoliciesOptionalParameters parameters) {
    return listTagPoliciesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of all tag policies for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagPoliciesResponse&gt;
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
  public ApiResponse<TagPoliciesResponse> listTagPoliciesWithHttpInfo(
      ListTagPoliciesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTagPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterSource = parameters.filterSource;
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));

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
        new GenericType<TagPoliciesResponse>() {});
  }

  /**
   * List tag policies.
   *
   * <p>See {@link #listTagPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagPoliciesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagPoliciesResponse>> listTagPoliciesWithHttpInfoAsync(
      ListTagPoliciesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTagPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TagPoliciesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterSource = parameters.filterSource;
    // create path and map variables
    String localVarPath = "/api/v2/tag-policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));

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
      CompletableFuture<ApiResponse<TagPoliciesResponse>> result = new CompletableFuture<>();
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
        new GenericType<TagPoliciesResponse>() {});
  }

  /**
   * Update a tag policy.
   *
   * <p>See {@link #updateTagPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the tag policy. (required)
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
   * @param policyId The ID of the tag policy. (required)
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
   * Update an existing tag policy by its ID.
   *
   * @param policyId The ID of the tag policy. (required)
   * @param body (required)
   * @return ApiResponse&lt;TagPolicyResponse&gt;
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
   * @param policyId The ID of the tag policy. (required)
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
