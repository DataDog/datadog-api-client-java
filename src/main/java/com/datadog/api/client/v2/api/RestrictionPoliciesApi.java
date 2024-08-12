package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RestrictionPolicyResponse;
import com.datadog.api.client.v2.model.RestrictionPolicyUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionPoliciesApi {
  private ApiClient apiClient;

  public RestrictionPoliciesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RestrictionPoliciesApi(ApiClient apiClient) {
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
   * Delete a restriction policy.
   *
   * <p>See {@link #deleteRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRestrictionPolicy(String resourceId) throws ApiException {
    deleteRestrictionPolicyWithHttpInfo(resourceId);
  }

  /**
   * Delete a restriction policy.
   *
   * <p>See {@link #deleteRestrictionPolicyWithHttpInfoAsync}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRestrictionPolicyAsync(String resourceId) {
    return deleteRestrictionPolicyWithHttpInfoAsync(resourceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes the restriction policy associated with a specified resource.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRestrictionPolicyWithHttpInfo(String resourceId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling deleteRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RestrictionPoliciesApi.deleteRestrictionPolicy",
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
   * Delete a restriction policy.
   *
   * <p>See {@link #deleteRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRestrictionPolicyWithHttpInfoAsync(
      String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling deleteRestrictionPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RestrictionPoliciesApi.deleteRestrictionPolicy",
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
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return RestrictionPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public RestrictionPolicyResponse getRestrictionPolicy(String resourceId) throws ApiException {
    return getRestrictionPolicyWithHttpInfo(resourceId).getData();
  }

  /**
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfoAsync}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return CompletableFuture&lt;RestrictionPolicyResponse&gt;
   */
  public CompletableFuture<RestrictionPolicyResponse> getRestrictionPolicyAsync(String resourceId) {
    return getRestrictionPolicyWithHttpInfoAsync(resourceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the restriction policy associated with a specified resource.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return ApiResponse&lt;RestrictionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionPolicyResponse> getRestrictionPolicyWithHttpInfo(String resourceId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling getRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RestrictionPoliciesApi.getRestrictionPolicy",
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
        new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionPolicyResponse>>
      getRestrictionPolicyWithHttpInfoAsync(String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling getRestrictionPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RestrictionPoliciesApi.getRestrictionPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Update a restriction policy.
   *
   * <p>See {@link #updateRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @param body Restriction policy payload (required)
   * @return RestrictionPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public RestrictionPolicyResponse updateRestrictionPolicy(
      String resourceId, RestrictionPolicyUpdateRequest body) throws ApiException {
    return updateRestrictionPolicyWithHttpInfo(resourceId, body).getData();
  }

  /**
   * Update a restriction policy.
   *
   * <p>See {@link #updateRestrictionPolicyWithHttpInfoAsync}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @param body Restriction policy payload (required)
   * @return CompletableFuture&lt;RestrictionPolicyResponse&gt;
   */
  public CompletableFuture<RestrictionPolicyResponse> updateRestrictionPolicyAsync(
      String resourceId, RestrictionPolicyUpdateRequest body) {
    return updateRestrictionPolicyWithHttpInfoAsync(resourceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the restriction policy associated with a resource.
   *
   * <h3>Supported resources</h3>
   *
   * <p>Restriction policies can be applied to the following resources: - Dashboards: <code>
   * dashboard</code> - Notebooks: <code>notebook</code> - Powerpacks: <code>powerpack</code> -
   * Security Rules: <code>security-rule</code> - Service Level Objectives: <code>slo</code> -
   * Synthetic Global Variables: <code>synthetics-global-variable</code> - Synthetic Tests: <code>
   * synthetics-test</code> - Synthetic Private Locations: <code>synthetics-private-location</code>
   * - Monitors: <code>monitor</code>
   *
   * <h3>Supported relations for resources</h3>
   *
   * <p>Resource Type | Supported Relations ----------------------------|--------------------------
   * Dashboards | <code>viewer</code>, <code>editor</code> Notebooks | <code>viewer</code>, <code>
   * editor</code> Powerpacks | <code>viewer</code>, <code>editor</code> Security Rules | <code>
   * viewer</code>, <code>editor</code> Service Level Objectives | <code>viewer</code>, <code>editor
   * </code> Synthetic Global Variables | <code>viewer</code>, <code>editor</code> Synthetic Tests |
   * <code>viewer</code>, <code>editor</code> Synthetic Private Locations | <code>viewer</code>,
   * <code>editor</code> Monitors | <code>viewer</code>, <code>editor</code>
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @param body Restriction policy payload (required)
   * @return ApiResponse&lt;RestrictionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionPolicyResponse> updateRestrictionPolicyWithHttpInfo(
      String resourceId, RestrictionPolicyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling updateRestrictionPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RestrictionPoliciesApi.updateRestrictionPolicy",
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
        new GenericType<RestrictionPolicyResponse>() {});
  }

  /**
   * Update a restriction policy.
   *
   * <p>See {@link #updateRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. Supported types: <code>
   *     connection</code>, <code>dashboard</code>, <code>notebook</code>, <code>security-rule
   *     </code>, <code>slo</code>. (required)
   * @param body Restriction policy payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionPolicyResponse>>
      updateRestrictionPolicyWithHttpInfoAsync(
          String resourceId, RestrictionPolicyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling updateRestrictionPolicy"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRestrictionPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RestrictionPoliciesApi.updateRestrictionPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<RestrictionPolicyResponse>() {});
  }
}
