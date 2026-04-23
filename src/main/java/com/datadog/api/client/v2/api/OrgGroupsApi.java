package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OrgGroupCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupIncludeOption;
import com.datadog.api.client.v2.model.OrgGroupListResponse;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupMembershipListResponse;
import com.datadog.api.client.v2.model.OrgGroupMembershipResponse;
import com.datadog.api.client.v2.model.OrgGroupMembershipSortOption;
import com.datadog.api.client.v2.model.OrgGroupMembershipUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyConfigListResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyListResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideListResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideSortOption;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicySortOption;
import com.datadog.api.client.v2.model.OrgGroupPolicyUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupResponse;
import com.datadog.api.client.v2.model.OrgGroupSortOption;
import com.datadog.api.client.v2.model.OrgGroupUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupsApi {
  private ApiClient apiClient;

  public OrgGroupsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OrgGroupsApi(ApiClient apiClient) {
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
   * Bulk update org group memberships.
   *
   * <p>See {@link #bulkUpdateOrgGroupMembershipsWithHttpInfo}.
   *
   * @param body (required)
   * @return OrgGroupMembershipListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupMembershipListResponse bulkUpdateOrgGroupMemberships(
      OrgGroupMembershipBulkUpdateRequest body) throws ApiException {
    return bulkUpdateOrgGroupMembershipsWithHttpInfo(body).getData();
  }

  /**
   * Bulk update org group memberships.
   *
   * <p>See {@link #bulkUpdateOrgGroupMembershipsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupMembershipListResponse&gt;
   */
  public CompletableFuture<OrgGroupMembershipListResponse> bulkUpdateOrgGroupMembershipsAsync(
      OrgGroupMembershipBulkUpdateRequest body) {
    return bulkUpdateOrgGroupMembershipsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Move a batch of organizations from one org group to another. This is an atomic operation.
   * Maximum 100 orgs per request.
   *
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupMembershipListResponse&gt;
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
  public ApiResponse<OrgGroupMembershipListResponse> bulkUpdateOrgGroupMembershipsWithHttpInfo(
      OrgGroupMembershipBulkUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "bulkUpdateOrgGroupMemberships";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkUpdateOrgGroupMemberships");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_memberships/bulk";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.bulkUpdateOrgGroupMemberships",
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
        new GenericType<OrgGroupMembershipListResponse>() {});
  }

  /**
   * Bulk update org group memberships.
   *
   * <p>See {@link #bulkUpdateOrgGroupMembershipsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupMembershipListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>>
      bulkUpdateOrgGroupMembershipsWithHttpInfoAsync(OrgGroupMembershipBulkUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "bulkUpdateOrgGroupMemberships";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling bulkUpdateOrgGroupMemberships"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_memberships/bulk";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.bulkUpdateOrgGroupMemberships",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>> result =
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
        new GenericType<OrgGroupMembershipListResponse>() {});
  }

  /**
   * Create an org group.
   *
   * <p>See {@link #createOrgGroupWithHttpInfo}.
   *
   * @param body (required)
   * @return OrgGroupResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupResponse createOrgGroup(OrgGroupCreateRequest body) throws ApiException {
    return createOrgGroupWithHttpInfo(body).getData();
  }

  /**
   * Create an org group.
   *
   * <p>See {@link #createOrgGroupWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupResponse&gt;
   */
  public CompletableFuture<OrgGroupResponse> createOrgGroupAsync(OrgGroupCreateRequest body) {
    return createOrgGroupWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new organization group.
   *
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupResponse&gt;
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
  public ApiResponse<OrgGroupResponse> createOrgGroupWithHttpInfo(OrgGroupCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOrgGroup");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.createOrgGroup",
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Create an org group.
   *
   * <p>See {@link #createOrgGroupWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupResponse>> createOrgGroupWithHttpInfoAsync(
      OrgGroupCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOrgGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_groups";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.createOrgGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Create an org group policy.
   *
   * <p>See {@link #createOrgGroupPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return OrgGroupPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyResponse createOrgGroupPolicy(OrgGroupPolicyCreateRequest body)
      throws ApiException {
    return createOrgGroupPolicyWithHttpInfo(body).getData();
  }

  /**
   * Create an org group policy.
   *
   * <p>See {@link #createOrgGroupPolicyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupPolicyResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyResponse> createOrgGroupPolicyAsync(
      OrgGroupPolicyCreateRequest body) {
    return createOrgGroupPolicyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new policy for an organization group.
   *
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupPolicyResponse&gt;
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
  public ApiResponse<OrgGroupPolicyResponse> createOrgGroupPolicyWithHttpInfo(
      OrgGroupPolicyCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOrgGroupPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.createOrgGroupPolicy",
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
        new GenericType<OrgGroupPolicyResponse>() {});
  }

  /**
   * Create an org group policy.
   *
   * <p>See {@link #createOrgGroupPolicyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyResponse>>
      createOrgGroupPolicyWithHttpInfoAsync(OrgGroupPolicyCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOrgGroupPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.createOrgGroupPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupPolicyResponse>() {});
  }

  /**
   * Create an org group policy override.
   *
   * <p>See {@link #createOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param body (required)
   * @return OrgGroupPolicyOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyOverrideResponse createOrgGroupPolicyOverride(
      OrgGroupPolicyOverrideCreateRequest body) throws ApiException {
    return createOrgGroupPolicyOverrideWithHttpInfo(body).getData();
  }

  /**
   * Create an org group policy override.
   *
   * <p>See {@link #createOrgGroupPolicyOverrideWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupPolicyOverrideResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyOverrideResponse> createOrgGroupPolicyOverrideAsync(
      OrgGroupPolicyOverrideCreateRequest body) {
    return createOrgGroupPolicyOverrideWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new policy override for an organization within an org group.
   *
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupPolicyOverrideResponse&gt;
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
  public ApiResponse<OrgGroupPolicyOverrideResponse> createOrgGroupPolicyOverrideWithHttpInfo(
      OrgGroupPolicyOverrideCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOrgGroupPolicyOverride");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_overrides";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.createOrgGroupPolicyOverride",
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
        new GenericType<OrgGroupPolicyOverrideResponse>() {});
  }

  /**
   * Create an org group policy override.
   *
   * <p>See {@link #createOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>>
      createOrgGroupPolicyOverrideWithHttpInfoAsync(OrgGroupPolicyOverrideCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createOrgGroupPolicyOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_overrides";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.createOrgGroupPolicyOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
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
        new GenericType<OrgGroupPolicyOverrideResponse>() {});
  }

  /**
   * Delete an org group.
   *
   * <p>See {@link #deleteOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgGroup(UUID orgGroupId) throws ApiException {
    deleteOrgGroupWithHttpInfo(orgGroupId);
  }

  /**
   * Delete an org group.
   *
   * <p>See {@link #deleteOrgGroupWithHttpInfoAsync}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgGroupAsync(UUID orgGroupId) {
    return deleteOrgGroupWithHttpInfoAsync(orgGroupId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an organization group by its ID.
   *
   * @param orgGroupId The ID of the org group. (required)
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
  public ApiResponse<Void> deleteOrgGroupWithHttpInfo(UUID orgGroupId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'orgGroupId' when calling deleteOrgGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.deleteOrgGroup",
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
   * Delete an org group.
   *
   * <p>See {@link #deleteOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrgGroupWithHttpInfoAsync(UUID orgGroupId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'orgGroupId' when calling deleteOrgGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.deleteOrgGroup",
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
   * Delete an org group policy.
   *
   * <p>See {@link #deleteOrgGroupPolicyWithHttpInfo}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgGroupPolicy(UUID orgGroupPolicyId) throws ApiException {
    deleteOrgGroupPolicyWithHttpInfo(orgGroupPolicyId);
  }

  /**
   * Delete an org group policy.
   *
   * <p>See {@link #deleteOrgGroupPolicyWithHttpInfoAsync}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgGroupPolicyAsync(UUID orgGroupPolicyId) {
    return deleteOrgGroupPolicyWithHttpInfoAsync(orgGroupPolicyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an organization group policy by its ID.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
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
  public ApiResponse<Void> deleteOrgGroupPolicyWithHttpInfo(UUID orgGroupPolicyId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupPolicyId' is set
    if (orgGroupPolicyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupPolicyId' when calling deleteOrgGroupPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policies/{org_group_policy_id}"
            .replaceAll(
                "\\{" + "org_group_policy_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.deleteOrgGroupPolicy",
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
   * Delete an org group policy.
   *
   * <p>See {@link #deleteOrgGroupPolicyWithHttpInfo}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrgGroupPolicyWithHttpInfoAsync(
      UUID orgGroupPolicyId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupPolicyId' is set
    if (orgGroupPolicyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupPolicyId' when calling"
                  + " deleteOrgGroupPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policies/{org_group_policy_id}"
            .replaceAll(
                "\\{" + "org_group_policy_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.deleteOrgGroupPolicy",
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
   * Delete an org group policy override.
   *
   * <p>See {@link #deleteOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgGroupPolicyOverride(UUID orgGroupPolicyOverrideId) throws ApiException {
    deleteOrgGroupPolicyOverrideWithHttpInfo(orgGroupPolicyOverrideId);
  }

  /**
   * Delete an org group policy override.
   *
   * <p>See {@link #deleteOrgGroupPolicyOverrideWithHttpInfoAsync}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgGroupPolicyOverrideAsync(UUID orgGroupPolicyOverrideId) {
    return deleteOrgGroupPolicyOverrideWithHttpInfoAsync(orgGroupPolicyOverrideId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an organization group policy override by its ID.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
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
  public ApiResponse<Void> deleteOrgGroupPolicyOverrideWithHttpInfo(UUID orgGroupPolicyOverrideId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupPolicyOverrideId' is set
    if (orgGroupPolicyOverrideId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupPolicyOverrideId' when calling"
              + " deleteOrgGroupPolicyOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policy_overrides/{org_group_policy_override_id}"
            .replaceAll(
                "\\{" + "org_group_policy_override_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyOverrideId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.deleteOrgGroupPolicyOverride",
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
   * Delete an org group policy override.
   *
   * <p>See {@link #deleteOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrgGroupPolicyOverrideWithHttpInfoAsync(
      UUID orgGroupPolicyOverrideId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupPolicyOverrideId' is set
    if (orgGroupPolicyOverrideId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupPolicyOverrideId' when calling"
                  + " deleteOrgGroupPolicyOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policy_overrides/{org_group_policy_override_id}"
            .replaceAll(
                "\\{" + "org_group_policy_override_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyOverrideId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.deleteOrgGroupPolicyOverride",
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
   * Get an org group.
   *
   * <p>See {@link #getOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return OrgGroupResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupResponse getOrgGroup(UUID orgGroupId) throws ApiException {
    return getOrgGroupWithHttpInfo(orgGroupId).getData();
  }

  /**
   * Get an org group.
   *
   * <p>See {@link #getOrgGroupWithHttpInfoAsync}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return CompletableFuture&lt;OrgGroupResponse&gt;
   */
  public CompletableFuture<OrgGroupResponse> getOrgGroupAsync(UUID orgGroupId) {
    return getOrgGroupWithHttpInfoAsync(orgGroupId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific organization group by its ID.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return ApiResponse&lt;OrgGroupResponse&gt;
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
  public ApiResponse<OrgGroupResponse> getOrgGroupWithHttpInfo(UUID orgGroupId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'orgGroupId' when calling getOrgGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.getOrgGroup",
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Get an org group.
   *
   * <p>See {@link #getOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupResponse>> getOrgGroupWithHttpInfoAsync(
      UUID orgGroupId) {
    // Check if unstable operation is enabled
    String operationId = "getOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'orgGroupId' when calling getOrgGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.getOrgGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Get an org group membership.
   *
   * <p>See {@link #getOrgGroupMembershipWithHttpInfo}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @return OrgGroupMembershipResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupMembershipResponse getOrgGroupMembership(UUID orgGroupMembershipId)
      throws ApiException {
    return getOrgGroupMembershipWithHttpInfo(orgGroupMembershipId).getData();
  }

  /**
   * Get an org group membership.
   *
   * <p>See {@link #getOrgGroupMembershipWithHttpInfoAsync}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @return CompletableFuture&lt;OrgGroupMembershipResponse&gt;
   */
  public CompletableFuture<OrgGroupMembershipResponse> getOrgGroupMembershipAsync(
      UUID orgGroupMembershipId) {
    return getOrgGroupMembershipWithHttpInfoAsync(orgGroupMembershipId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific organization group membership by its ID.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @return ApiResponse&lt;OrgGroupMembershipResponse&gt;
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
  public ApiResponse<OrgGroupMembershipResponse> getOrgGroupMembershipWithHttpInfo(
      UUID orgGroupMembershipId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOrgGroupMembership";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupMembershipId' is set
    if (orgGroupMembershipId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupMembershipId' when calling"
              + " getOrgGroupMembership");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_memberships/{org_group_membership_id}"
            .replaceAll(
                "\\{" + "org_group_membership_id" + "\\}",
                apiClient.escapeString(orgGroupMembershipId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.getOrgGroupMembership",
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
        new GenericType<OrgGroupMembershipResponse>() {});
  }

  /**
   * Get an org group membership.
   *
   * <p>See {@link #getOrgGroupMembershipWithHttpInfo}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupMembershipResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupMembershipResponse>>
      getOrgGroupMembershipWithHttpInfoAsync(UUID orgGroupMembershipId) {
    // Check if unstable operation is enabled
    String operationId = "getOrgGroupMembership";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'orgGroupMembershipId' is set
    if (orgGroupMembershipId == null) {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupMembershipId' when calling"
                  + " getOrgGroupMembership"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_memberships/{org_group_membership_id}"
            .replaceAll(
                "\\{" + "org_group_membership_id" + "\\}",
                apiClient.escapeString(orgGroupMembershipId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.getOrgGroupMembership",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupMembershipResponse>() {});
  }

  /** Manage optional parameters to listOrgGroupMemberships. */
  public static class ListOrgGroupMembershipsOptionalParameters {
    private UUID filterOrgGroupId;
    private UUID filterOrgUuid;
    private Long pageNumber;
    private Long pageSize;
    private OrgGroupMembershipSortOption sort;

    /**
     * Set filterOrgGroupId.
     *
     * @param filterOrgGroupId Filter memberships by org group ID. Required when <code>
     *     filter[org_uuid]</code> is not provided. (optional)
     * @return ListOrgGroupMembershipsOptionalParameters
     */
    public ListOrgGroupMembershipsOptionalParameters filterOrgGroupId(UUID filterOrgGroupId) {
      this.filterOrgGroupId = filterOrgGroupId;
      return this;
    }

    /**
     * Set filterOrgUuid.
     *
     * @param filterOrgUuid Filter memberships by org UUID. Returns a single-item list. (optional)
     * @return ListOrgGroupMembershipsOptionalParameters
     */
    public ListOrgGroupMembershipsOptionalParameters filterOrgUuid(UUID filterOrgUuid) {
      this.filterOrgUuid = filterOrgUuid;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListOrgGroupMembershipsOptionalParameters
     */
    public ListOrgGroupMembershipsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of items per page. Maximum is 1000. (optional, default to 50)
     * @return ListOrgGroupMembershipsOptionalParameters
     */
    public ListOrgGroupMembershipsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort memberships by. Supported values: <code>name</code>, <code>uuid
     *     </code>, <code>-name</code>, <code>-uuid</code>. Defaults to <code>uuid</code>.
     *     (optional, default to "uuid")
     * @return ListOrgGroupMembershipsOptionalParameters
     */
    public ListOrgGroupMembershipsOptionalParameters sort(OrgGroupMembershipSortOption sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List org group memberships.
   *
   * <p>See {@link #listOrgGroupMembershipsWithHttpInfo}.
   *
   * @return OrgGroupMembershipListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupMembershipListResponse listOrgGroupMemberships() throws ApiException {
    return listOrgGroupMembershipsWithHttpInfo(new ListOrgGroupMembershipsOptionalParameters())
        .getData();
  }

  /**
   * List org group memberships.
   *
   * <p>See {@link #listOrgGroupMembershipsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgGroupMembershipListResponse&gt;
   */
  public CompletableFuture<OrgGroupMembershipListResponse> listOrgGroupMembershipsAsync() {
    return listOrgGroupMembershipsWithHttpInfoAsync(new ListOrgGroupMembershipsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org group memberships.
   *
   * <p>See {@link #listOrgGroupMembershipsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return OrgGroupMembershipListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupMembershipListResponse listOrgGroupMemberships(
      ListOrgGroupMembershipsOptionalParameters parameters) throws ApiException {
    return listOrgGroupMembershipsWithHttpInfo(parameters).getData();
  }

  /**
   * List org group memberships.
   *
   * <p>See {@link #listOrgGroupMembershipsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgGroupMembershipListResponse&gt;
   */
  public CompletableFuture<OrgGroupMembershipListResponse> listOrgGroupMembershipsAsync(
      ListOrgGroupMembershipsOptionalParameters parameters) {
    return listOrgGroupMembershipsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List organization group memberships. Filter by org group ID or org UUID. At least one of <code>
   * filter[org_group_id]</code> or <code>filter[org_uuid]</code> must be provided. When filtering
   * by org UUID, returns a single-item list with the membership for that org.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgGroupMembershipListResponse&gt;
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
  public ApiResponse<OrgGroupMembershipListResponse> listOrgGroupMembershipsWithHttpInfo(
      ListOrgGroupMembershipsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupMemberships";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    UUID filterOrgGroupId = parameters.filterOrgGroupId;
    UUID filterOrgUuid = parameters.filterOrgUuid;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupMembershipSortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_memberships";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[org_uuid]", filterOrgUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.listOrgGroupMemberships",
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
        new GenericType<OrgGroupMembershipListResponse>() {});
  }

  /**
   * List org group memberships.
   *
   * <p>See {@link #listOrgGroupMembershipsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupMembershipListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>>
      listOrgGroupMembershipsWithHttpInfoAsync(
          ListOrgGroupMembershipsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupMemberships";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    UUID filterOrgGroupId = parameters.filterOrgGroupId;
    UUID filterOrgUuid = parameters.filterOrgUuid;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupMembershipSortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_memberships";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[org_uuid]", filterOrgUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.listOrgGroupMemberships",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupMembershipListResponse>> result =
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
        new GenericType<OrgGroupMembershipListResponse>() {});
  }

  /** Manage optional parameters to listOrgGroupPolicies. */
  public static class ListOrgGroupPoliciesOptionalParameters {
    private String filterPolicyName;
    private Long pageNumber;
    private Long pageSize;
    private OrgGroupPolicySortOption sort;

    /**
     * Set filterPolicyName.
     *
     * @param filterPolicyName Filter policies by policy name. (optional)
     * @return ListOrgGroupPoliciesOptionalParameters
     */
    public ListOrgGroupPoliciesOptionalParameters filterPolicyName(String filterPolicyName) {
      this.filterPolicyName = filterPolicyName;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListOrgGroupPoliciesOptionalParameters
     */
    public ListOrgGroupPoliciesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of items per page. Maximum is 1000. (optional, default to 50)
     * @return ListOrgGroupPoliciesOptionalParameters
     */
    public ListOrgGroupPoliciesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort policies by. Supported values: <code>id</code>, <code>name</code>,
     *     <code>-id</code>, <code>-name</code>. Defaults to <code>id</code>. (optional, default to
     *     "id")
     * @return ListOrgGroupPoliciesOptionalParameters
     */
    public ListOrgGroupPoliciesOptionalParameters sort(OrgGroupPolicySortOption sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List org group policies.
   *
   * <p>See {@link #listOrgGroupPoliciesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @return OrgGroupPolicyListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyListResponse listOrgGroupPolicies(UUID filterOrgGroupId)
      throws ApiException {
    return listOrgGroupPoliciesWithHttpInfo(
            filterOrgGroupId, new ListOrgGroupPoliciesOptionalParameters())
        .getData();
  }

  /**
   * List org group policies.
   *
   * <p>See {@link #listOrgGroupPoliciesWithHttpInfoAsync}.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @return CompletableFuture&lt;OrgGroupPolicyListResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyListResponse> listOrgGroupPoliciesAsync(
      UUID filterOrgGroupId) {
    return listOrgGroupPoliciesWithHttpInfoAsync(
            filterOrgGroupId, new ListOrgGroupPoliciesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org group policies.
   *
   * <p>See {@link #listOrgGroupPoliciesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return OrgGroupPolicyListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyListResponse listOrgGroupPolicies(
      UUID filterOrgGroupId, ListOrgGroupPoliciesOptionalParameters parameters)
      throws ApiException {
    return listOrgGroupPoliciesWithHttpInfo(filterOrgGroupId, parameters).getData();
  }

  /**
   * List org group policies.
   *
   * <p>See {@link #listOrgGroupPoliciesWithHttpInfoAsync}.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgGroupPolicyListResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyListResponse> listOrgGroupPoliciesAsync(
      UUID filterOrgGroupId, ListOrgGroupPoliciesOptionalParameters parameters) {
    return listOrgGroupPoliciesWithHttpInfoAsync(filterOrgGroupId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List policies for an organization group. Requires a filter on org group ID.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgGroupPolicyListResponse&gt;
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
  public ApiResponse<OrgGroupPolicyListResponse> listOrgGroupPoliciesWithHttpInfo(
      UUID filterOrgGroupId, ListOrgGroupPoliciesOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterOrgGroupId' is set
    if (filterOrgGroupId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterOrgGroupId' when calling listOrgGroupPolicies");
    }
    String filterPolicyName = parameters.filterPolicyName;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupPolicySortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[policy_name]", filterPolicyName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.listOrgGroupPolicies",
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
        new GenericType<OrgGroupPolicyListResponse>() {});
  }

  /**
   * List org group policies.
   *
   * <p>See {@link #listOrgGroupPoliciesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policies by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyListResponse>>
      listOrgGroupPoliciesWithHttpInfoAsync(
          UUID filterOrgGroupId, ListOrgGroupPoliciesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterOrgGroupId' is set
    if (filterOrgGroupId == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterOrgGroupId' when calling"
                  + " listOrgGroupPolicies"));
      return result;
    }
    String filterPolicyName = parameters.filterPolicyName;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupPolicySortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[policy_name]", filterPolicyName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.listOrgGroupPolicies",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyListResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupPolicyListResponse>() {});
  }

  /**
   * List org group policy configs.
   *
   * <p>See {@link #listOrgGroupPolicyConfigsWithHttpInfo}.
   *
   * @return OrgGroupPolicyConfigListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyConfigListResponse listOrgGroupPolicyConfigs() throws ApiException {
    return listOrgGroupPolicyConfigsWithHttpInfo().getData();
  }

  /**
   * List org group policy configs.
   *
   * <p>See {@link #listOrgGroupPolicyConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgGroupPolicyConfigListResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyConfigListResponse> listOrgGroupPolicyConfigsAsync() {
    return listOrgGroupPolicyConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all org configs that are eligible to be used as organization group policies.
   *
   * @return ApiResponse&lt;OrgGroupPolicyConfigListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgGroupPolicyConfigListResponse> listOrgGroupPolicyConfigsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicyConfigs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_configs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.listOrgGroupPolicyConfigs",
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
        new GenericType<OrgGroupPolicyConfigListResponse>() {});
  }

  /**
   * List org group policy configs.
   *
   * <p>See {@link #listOrgGroupPolicyConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyConfigListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyConfigListResponse>>
      listOrgGroupPolicyConfigsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicyConfigs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyConfigListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_configs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.listOrgGroupPolicyConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyConfigListResponse>> result =
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
        new GenericType<OrgGroupPolicyConfigListResponse>() {});
  }

  /** Manage optional parameters to listOrgGroupPolicyOverrides. */
  public static class ListOrgGroupPolicyOverridesOptionalParameters {
    private UUID filterPolicyId;
    private Long pageNumber;
    private Long pageSize;
    private OrgGroupPolicyOverrideSortOption sort;

    /**
     * Set filterPolicyId.
     *
     * @param filterPolicyId Filter policy overrides by policy ID. (optional)
     * @return ListOrgGroupPolicyOverridesOptionalParameters
     */
    public ListOrgGroupPolicyOverridesOptionalParameters filterPolicyId(UUID filterPolicyId) {
      this.filterPolicyId = filterPolicyId;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListOrgGroupPolicyOverridesOptionalParameters
     */
    public ListOrgGroupPolicyOverridesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of items per page. Maximum is 1000. (optional, default to 50)
     * @return ListOrgGroupPolicyOverridesOptionalParameters
     */
    public ListOrgGroupPolicyOverridesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort overrides by. Supported values: <code>id</code>, <code>org_uuid
     *     </code>, <code>-id</code>, <code>-org_uuid</code>. Defaults to <code>id</code>.
     *     (optional, default to "id")
     * @return ListOrgGroupPolicyOverridesOptionalParameters
     */
    public ListOrgGroupPolicyOverridesOptionalParameters sort(
        OrgGroupPolicyOverrideSortOption sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List org group policy overrides.
   *
   * <p>See {@link #listOrgGroupPolicyOverridesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @return OrgGroupPolicyOverrideListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyOverrideListResponse listOrgGroupPolicyOverrides(UUID filterOrgGroupId)
      throws ApiException {
    return listOrgGroupPolicyOverridesWithHttpInfo(
            filterOrgGroupId, new ListOrgGroupPolicyOverridesOptionalParameters())
        .getData();
  }

  /**
   * List org group policy overrides.
   *
   * <p>See {@link #listOrgGroupPolicyOverridesWithHttpInfoAsync}.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @return CompletableFuture&lt;OrgGroupPolicyOverrideListResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyOverrideListResponse> listOrgGroupPolicyOverridesAsync(
      UUID filterOrgGroupId) {
    return listOrgGroupPolicyOverridesWithHttpInfoAsync(
            filterOrgGroupId, new ListOrgGroupPolicyOverridesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org group policy overrides.
   *
   * <p>See {@link #listOrgGroupPolicyOverridesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return OrgGroupPolicyOverrideListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyOverrideListResponse listOrgGroupPolicyOverrides(
      UUID filterOrgGroupId, ListOrgGroupPolicyOverridesOptionalParameters parameters)
      throws ApiException {
    return listOrgGroupPolicyOverridesWithHttpInfo(filterOrgGroupId, parameters).getData();
  }

  /**
   * List org group policy overrides.
   *
   * <p>See {@link #listOrgGroupPolicyOverridesWithHttpInfoAsync}.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgGroupPolicyOverrideListResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyOverrideListResponse> listOrgGroupPolicyOverridesAsync(
      UUID filterOrgGroupId, ListOrgGroupPolicyOverridesOptionalParameters parameters) {
    return listOrgGroupPolicyOverridesWithHttpInfoAsync(filterOrgGroupId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List policy overrides for an organization group. Requires a filter on org group ID. Optionally
   * filter by policy ID.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgGroupPolicyOverrideListResponse&gt;
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
  public ApiResponse<OrgGroupPolicyOverrideListResponse> listOrgGroupPolicyOverridesWithHttpInfo(
      UUID filterOrgGroupId, ListOrgGroupPolicyOverridesOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicyOverrides";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterOrgGroupId' is set
    if (filterOrgGroupId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterOrgGroupId' when calling"
              + " listOrgGroupPolicyOverrides");
    }
    UUID filterPolicyId = parameters.filterPolicyId;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupPolicyOverrideSortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_overrides";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[policy_id]", filterPolicyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.listOrgGroupPolicyOverrides",
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
        new GenericType<OrgGroupPolicyOverrideListResponse>() {});
  }

  /**
   * List org group policy overrides.
   *
   * <p>See {@link #listOrgGroupPolicyOverridesWithHttpInfo}.
   *
   * @param filterOrgGroupId Filter policy overrides by org group ID. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyOverrideListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyOverrideListResponse>>
      listOrgGroupPolicyOverridesWithHttpInfoAsync(
          UUID filterOrgGroupId, ListOrgGroupPolicyOverridesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroupPolicyOverrides";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterOrgGroupId' is set
    if (filterOrgGroupId == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterOrgGroupId' when calling"
                  + " listOrgGroupPolicyOverrides"));
      return result;
    }
    UUID filterPolicyId = parameters.filterPolicyId;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupPolicyOverrideSortOption sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/org_group_policy_overrides";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[org_group_id]", filterOrgGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[policy_id]", filterPolicyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.listOrgGroupPolicyOverrides",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideListResponse>> result =
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
        new GenericType<OrgGroupPolicyOverrideListResponse>() {});
  }

  /** Manage optional parameters to listOrgGroups. */
  public static class ListOrgGroupsOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private OrgGroupSortOption sort;
    private List<OrgGroupIncludeOption> include;

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListOrgGroupsOptionalParameters
     */
    public ListOrgGroupsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of items per page. Maximum is 1000. (optional, default to 50)
     * @return ListOrgGroupsOptionalParameters
     */
    public ListOrgGroupsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Field to sort org groups by. Supported values: <code>name</code>, <code>uuid
     *     </code>, <code>-name</code>, <code>-uuid</code>. Defaults to <code>uuid</code>.
     *     (optional, default to "uuid")
     * @return ListOrgGroupsOptionalParameters
     */
    public ListOrgGroupsOptionalParameters sort(OrgGroupSortOption sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set include.
     *
     * @param include List of related resources to include. (optional)
     * @return ListOrgGroupsOptionalParameters
     */
    public ListOrgGroupsOptionalParameters include(List<OrgGroupIncludeOption> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List org groups.
   *
   * <p>See {@link #listOrgGroupsWithHttpInfo}.
   *
   * @return OrgGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupListResponse listOrgGroups() throws ApiException {
    return listOrgGroupsWithHttpInfo(new ListOrgGroupsOptionalParameters()).getData();
  }

  /**
   * List org groups.
   *
   * <p>See {@link #listOrgGroupsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgGroupListResponse&gt;
   */
  public CompletableFuture<OrgGroupListResponse> listOrgGroupsAsync() {
    return listOrgGroupsWithHttpInfoAsync(new ListOrgGroupsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org groups.
   *
   * <p>See {@link #listOrgGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return OrgGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupListResponse listOrgGroups(ListOrgGroupsOptionalParameters parameters)
      throws ApiException {
    return listOrgGroupsWithHttpInfo(parameters).getData();
  }

  /**
   * List org groups.
   *
   * <p>See {@link #listOrgGroupsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgGroupListResponse&gt;
   */
  public CompletableFuture<OrgGroupListResponse> listOrgGroupsAsync(
      ListOrgGroupsOptionalParameters parameters) {
    return listOrgGroupsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all organization groups that the requesting organization has access to.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgGroupListResponse&gt;
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
  public ApiResponse<OrgGroupListResponse> listOrgGroupsWithHttpInfo(
      ListOrgGroupsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupSortOption sort = parameters.sort;
    List<OrgGroupIncludeOption> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/org_groups";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.listOrgGroups",
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
        new GenericType<OrgGroupListResponse>() {});
  }

  /**
   * List org groups.
   *
   * <p>See {@link #listOrgGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupListResponse>> listOrgGroupsWithHttpInfoAsync(
      ListOrgGroupsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOrgGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    OrgGroupSortOption sort = parameters.sort;
    List<OrgGroupIncludeOption> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/org_groups";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.listOrgGroups",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupListResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupListResponse>() {});
  }

  /**
   * Update an org group.
   *
   * <p>See {@link #updateOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @param body (required)
   * @return OrgGroupResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupResponse updateOrgGroup(UUID orgGroupId, OrgGroupUpdateRequest body)
      throws ApiException {
    return updateOrgGroupWithHttpInfo(orgGroupId, body).getData();
  }

  /**
   * Update an org group.
   *
   * <p>See {@link #updateOrgGroupWithHttpInfoAsync}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupResponse&gt;
   */
  public CompletableFuture<OrgGroupResponse> updateOrgGroupAsync(
      UUID orgGroupId, OrgGroupUpdateRequest body) {
    return updateOrgGroupWithHttpInfoAsync(orgGroupId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the name of an existing organization group.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupResponse&gt;
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
  public ApiResponse<OrgGroupResponse> updateOrgGroupWithHttpInfo(
      UUID orgGroupId, OrgGroupUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'orgGroupId' when calling updateOrgGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.updateOrgGroup",
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Update an org group.
   *
   * <p>See {@link #updateOrgGroupWithHttpInfo}.
   *
   * @param orgGroupId The ID of the org group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupResponse>> updateOrgGroupWithHttpInfoAsync(
      UUID orgGroupId, OrgGroupUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupId' is set
    if (orgGroupId == null) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'orgGroupId' when calling updateOrgGroup"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_groups/{org_group_id}"
            .replaceAll(
                "\\{" + "org_group_id" + "\\}", apiClient.escapeString(orgGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.updateOrgGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupResponse>() {});
  }

  /**
   * Update an org group membership.
   *
   * <p>See {@link #updateOrgGroupMembershipWithHttpInfo}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @param body (required)
   * @return OrgGroupMembershipResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupMembershipResponse updateOrgGroupMembership(
      UUID orgGroupMembershipId, OrgGroupMembershipUpdateRequest body) throws ApiException {
    return updateOrgGroupMembershipWithHttpInfo(orgGroupMembershipId, body).getData();
  }

  /**
   * Update an org group membership.
   *
   * <p>See {@link #updateOrgGroupMembershipWithHttpInfoAsync}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupMembershipResponse&gt;
   */
  public CompletableFuture<OrgGroupMembershipResponse> updateOrgGroupMembershipAsync(
      UUID orgGroupMembershipId, OrgGroupMembershipUpdateRequest body) {
    return updateOrgGroupMembershipWithHttpInfoAsync(orgGroupMembershipId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Move an organization to a different org group by updating its membership.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupMembershipResponse&gt;
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
  public ApiResponse<OrgGroupMembershipResponse> updateOrgGroupMembershipWithHttpInfo(
      UUID orgGroupMembershipId, OrgGroupMembershipUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupMembership";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupMembershipId' is set
    if (orgGroupMembershipId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupMembershipId' when calling"
              + " updateOrgGroupMembership");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgGroupMembership");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_memberships/{org_group_membership_id}"
            .replaceAll(
                "\\{" + "org_group_membership_id" + "\\}",
                apiClient.escapeString(orgGroupMembershipId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.updateOrgGroupMembership",
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
        new GenericType<OrgGroupMembershipResponse>() {});
  }

  /**
   * Update an org group membership.
   *
   * <p>See {@link #updateOrgGroupMembershipWithHttpInfo}.
   *
   * @param orgGroupMembershipId The ID of the org group membership. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupMembershipResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupMembershipResponse>>
      updateOrgGroupMembershipWithHttpInfoAsync(
          UUID orgGroupMembershipId, OrgGroupMembershipUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupMembership";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupMembershipId' is set
    if (orgGroupMembershipId == null) {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupMembershipId' when calling"
                  + " updateOrgGroupMembership"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgGroupMembership"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_memberships/{org_group_membership_id}"
            .replaceAll(
                "\\{" + "org_group_membership_id" + "\\}",
                apiClient.escapeString(orgGroupMembershipId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.updateOrgGroupMembership",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupMembershipResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupMembershipResponse>() {});
  }

  /**
   * Update an org group policy.
   *
   * <p>See {@link #updateOrgGroupPolicyWithHttpInfo}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @param body (required)
   * @return OrgGroupPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyResponse updateOrgGroupPolicy(
      UUID orgGroupPolicyId, OrgGroupPolicyUpdateRequest body) throws ApiException {
    return updateOrgGroupPolicyWithHttpInfo(orgGroupPolicyId, body).getData();
  }

  /**
   * Update an org group policy.
   *
   * <p>See {@link #updateOrgGroupPolicyWithHttpInfoAsync}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupPolicyResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyResponse> updateOrgGroupPolicyAsync(
      UUID orgGroupPolicyId, OrgGroupPolicyUpdateRequest body) {
    return updateOrgGroupPolicyWithHttpInfoAsync(orgGroupPolicyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the content of an existing organization group policy.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupPolicyResponse&gt;
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
  public ApiResponse<OrgGroupPolicyResponse> updateOrgGroupPolicyWithHttpInfo(
      UUID orgGroupPolicyId, OrgGroupPolicyUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupPolicyId' is set
    if (orgGroupPolicyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupPolicyId' when calling updateOrgGroupPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgGroupPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policies/{org_group_policy_id}"
            .replaceAll(
                "\\{" + "org_group_policy_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.updateOrgGroupPolicy",
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
        new GenericType<OrgGroupPolicyResponse>() {});
  }

  /**
   * Update an org group policy.
   *
   * <p>See {@link #updateOrgGroupPolicyWithHttpInfo}.
   *
   * @param orgGroupPolicyId The ID of the org group policy. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyResponse>>
      updateOrgGroupPolicyWithHttpInfoAsync(
          UUID orgGroupPolicyId, OrgGroupPolicyUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupPolicyId' is set
    if (orgGroupPolicyId == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupPolicyId' when calling"
                  + " updateOrgGroupPolicy"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgGroupPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policies/{org_group_policy_id}"
            .replaceAll(
                "\\{" + "org_group_policy_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.updateOrgGroupPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgGroupPolicyResponse>() {});
  }

  /**
   * Update an org group policy override.
   *
   * <p>See {@link #updateOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @param body (required)
   * @return OrgGroupPolicyOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public OrgGroupPolicyOverrideResponse updateOrgGroupPolicyOverride(
      UUID orgGroupPolicyOverrideId, OrgGroupPolicyOverrideUpdateRequest body) throws ApiException {
    return updateOrgGroupPolicyOverrideWithHttpInfo(orgGroupPolicyOverrideId, body).getData();
  }

  /**
   * Update an org group policy override.
   *
   * <p>See {@link #updateOrgGroupPolicyOverrideWithHttpInfoAsync}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgGroupPolicyOverrideResponse&gt;
   */
  public CompletableFuture<OrgGroupPolicyOverrideResponse> updateOrgGroupPolicyOverrideAsync(
      UUID orgGroupPolicyOverrideId, OrgGroupPolicyOverrideUpdateRequest body) {
    return updateOrgGroupPolicyOverrideWithHttpInfoAsync(orgGroupPolicyOverrideId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing organization group policy override.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgGroupPolicyOverrideResponse&gt;
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
  public ApiResponse<OrgGroupPolicyOverrideResponse> updateOrgGroupPolicyOverrideWithHttpInfo(
      UUID orgGroupPolicyOverrideId, OrgGroupPolicyOverrideUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupPolicyOverrideId' is set
    if (orgGroupPolicyOverrideId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'orgGroupPolicyOverrideId' when calling"
              + " updateOrgGroupPolicyOverride");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgGroupPolicyOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policy_overrides/{org_group_policy_override_id}"
            .replaceAll(
                "\\{" + "org_group_policy_override_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyOverrideId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgGroupsApi.updateOrgGroupPolicyOverride",
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
        new GenericType<OrgGroupPolicyOverrideResponse>() {});
  }

  /**
   * Update an org group policy override.
   *
   * <p>See {@link #updateOrgGroupPolicyOverrideWithHttpInfo}.
   *
   * @param orgGroupPolicyOverrideId The ID of the org group policy override. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgGroupPolicyOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>>
      updateOrgGroupPolicyOverrideWithHttpInfoAsync(
          UUID orgGroupPolicyOverrideId, OrgGroupPolicyOverrideUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOrgGroupPolicyOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'orgGroupPolicyOverrideId' is set
    if (orgGroupPolicyOverrideId == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'orgGroupPolicyOverrideId' when calling"
                  + " updateOrgGroupPolicyOverride"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateOrgGroupPolicyOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_group_policy_overrides/{org_group_policy_override_id}"
            .replaceAll(
                "\\{" + "org_group_policy_override_id" + "\\}",
                apiClient.escapeString(orgGroupPolicyOverrideId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgGroupsApi.updateOrgGroupPolicyOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgGroupPolicyOverrideResponse>> result =
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
        new GenericType<OrgGroupPolicyOverrideResponse>() {});
  }
}
