package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AllocationExposureScheduleResponse;
import com.datadog.api.client.v2.model.AllocationResponse;
import com.datadog.api.client.v2.model.ApproveFlagSuggestionRequest;
import com.datadog.api.client.v2.model.CreateAllocationsRequest;
import com.datadog.api.client.v2.model.CreateEnvironmentRequest;
import com.datadog.api.client.v2.model.CreateFeatureFlagRequest;
import com.datadog.api.client.v2.model.CreateFlagSuggestionRequest;
import com.datadog.api.client.v2.model.CreateVariantRequest;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import com.datadog.api.client.v2.model.FeatureFlagDistributionChannel;
import com.datadog.api.client.v2.model.FeatureFlagProductionStatus;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.FeatureFlagStalenessStatus;
import com.datadog.api.client.v2.model.FeatureFlagSuggestionResponse;
import com.datadog.api.client.v2.model.ListAllocationsResponse;
import com.datadog.api.client.v2.model.ListEnvironmentsResponse;
import com.datadog.api.client.v2.model.ListFeatureFlagHistoryResponse;
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import com.datadog.api.client.v2.model.OverwriteAllocationsRequest;
import com.datadog.api.client.v2.model.PatchSavedFilterRequest;
import com.datadog.api.client.v2.model.RejectFlagSuggestionRequest;
import com.datadog.api.client.v2.model.SavedFilterResponse;
import com.datadog.api.client.v2.model.UpdateEnvironmentRequest;
import com.datadog.api.client.v2.model.UpdateFeatureFlagApprovalsRequest;
import com.datadog.api.client.v2.model.UpdateFeatureFlagRequest;
import com.datadog.api.client.v2.model.UpdateVariantRequest;
import com.datadog.api.client.v2.model.ValueType;
import com.datadog.api.client.v2.model.VariantResponse;
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
public class FeatureFlagsApi {
  private ApiClient apiClient;

  public FeatureFlagsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FeatureFlagsApi(ApiClient apiClient) {
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
   * Apply an approved flag change suggestion.
   *
   * <p>See {@link #applyFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return FeatureFlagSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagSuggestionResponse applyFlagSuggestion(UUID suggestionId) throws ApiException {
    return applyFlagSuggestionWithHttpInfo(suggestionId).getData();
  }

  /**
   * Apply an approved flag change suggestion.
   *
   * <p>See {@link #applyFlagSuggestionWithHttpInfoAsync}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture&lt;FeatureFlagSuggestionResponse&gt;
   */
  public CompletableFuture<FeatureFlagSuggestionResponse> applyFlagSuggestionAsync(
      UUID suggestionId) {
    return applyFlagSuggestionWithHttpInfoAsync(suggestionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Applies a previously approved feature flag change suggestion. Requires contributor or editor
   * access to the flag. Pending, rejected, or discarded suggestions return <code>409 Conflict
   * </code>. An already applied suggestion also returns <code>409 Conflict</code>, except that
   * retrying an applied experiment action succeeds. This endpoint does not require a request body.
   *
   * <p>When an <code>ALLOCATIONS</code> suggestion is applied, either by this endpoint or by an
   * approval that applies it, each exposure schedule with <code>autostart</code> set to <code>true
   * </code>, no <code>absolute_start_time</code>, and no future <code>scheduled_start_time</code>
   * starts at apply time. This includes a schedule that is already running, so a suggestion that
   * omits its <code>absolute_start_time</code> restarts its rollout. If its <code>
   * selection_interval_ms</code> is greater than <code>0</code>, every step except the last uses
   * that interval. An <code>absolute_start_time</code> in the suggestion is kept, including one set
   * by the allocations request that built the suggestion, so time spent waiting for approval counts
   * toward its rollout steps. Schedules with <code>apm_retention</code>, in the suggestion or on
   * the saved schedule, are the exception: apply does not start them, and they start only through
   * the exposure schedule start endpoint. When the suggestion omits <code>apm_retention</code> or
   * <code>absolute_start_time</code> for a saved schedule with <code>apm_retention</code>, apply
   * keeps the saved values, so a running schedule keeps its start, unless the suggestion changes
   * its rollout strategy, which stops it.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return ApiResponse&lt;FeatureFlagSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - The suggestion is not approved or the proposed change conflicts with current configuration. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagSuggestionResponse> applyFlagSuggestionWithHttpInfo(
      UUID suggestionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'suggestionId' when calling applyFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/apply"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.applyFlagSuggestion",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Apply an approved flag change suggestion.
   *
   * <p>See {@link #applyFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>>
      applyFlagSuggestionWithHttpInfoAsync(UUID suggestionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suggestionId' when calling applyFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/apply"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.applyFlagSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Approve a flag change suggestion.
   *
   * <p>See {@link #approveFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return FeatureFlagSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagSuggestionResponse approveFlagSuggestion(
      UUID suggestionId, ApproveFlagSuggestionRequest body) throws ApiException {
    return approveFlagSuggestionWithHttpInfo(suggestionId, body).getData();
  }

  /**
   * Approve a flag change suggestion.
   *
   * <p>See {@link #approveFlagSuggestionWithHttpInfoAsync}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagSuggestionResponse&gt;
   */
  public CompletableFuture<FeatureFlagSuggestionResponse> approveFlagSuggestionAsync(
      UUID suggestionId, ApproveFlagSuggestionRequest body) {
    return approveFlagSuggestionWithHttpInfoAsync(suggestionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Approves a feature flag change suggestion and applies the change immediately by default. Set
   * <code>apply</code> to <code>false</code> to approve without applying, then call <code>
   * ApplyFlagSuggestion</code> later. Until it is applied or deleted, an approved suggestion still
   * blocks conflicting changes. Requires editor access to the flag or the Feature Flag Approvals
   * Override permission. A creator cannot approve their own suggestion unless they have override
   * permission. Applied or discarded suggestions return <code>409 Conflict</code>. Retrying
   * approval of an already applied experiment action with <code>apply</code> set to <code>true
   * </code> succeeds.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - The suggestion is already applied or discarded, or the proposed change conflicts with current configuration. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagSuggestionResponse> approveFlagSuggestionWithHttpInfo(
      UUID suggestionId, ApproveFlagSuggestionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'suggestionId' when calling approveFlagSuggestion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling approveFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/approve"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.approveFlagSuggestion",
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Approve a flag change suggestion.
   *
   * <p>See {@link #approveFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>>
      approveFlagSuggestionWithHttpInfoAsync(UUID suggestionId, ApproveFlagSuggestionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suggestionId' when calling approveFlagSuggestion"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling approveFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/approve"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.approveFlagSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Archive a feature flag.
   *
   * <p>See {@link #archiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse archiveFeatureFlag(UUID featureFlagId) throws ApiException {
    return archiveFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
   * Archive a feature flag.
   *
   * <p>See {@link #archiveFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> archiveFeatureFlagAsync(UUID featureFlagId) {
    return archiveFeatureFlagWithHttpInfoAsync(featureFlagId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archives a feature flag. Archived flags are hidden from the main list but remain accessible and
   * can be unarchived.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion. The change is not applied until the suggestion is approved and applied. Use the
   * returned suggestion ID with <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>,
   * <code>RejectFlagSuggestion</code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - The flag is already archived or a conflicting suggestion is pending. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> archiveFeatureFlagWithHttpInfo(UUID featureFlagId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'featureFlagId' when calling archiveFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/archive"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.archiveFeatureFlag",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Archive a feature flag.
   *
   * <p>See {@link #archiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> archiveFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling archiveFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/archive"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.archiveFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Create targeting rules for a flag env.
   *
   * <p>See {@link #createAllocationsForFeatureFlagInEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return AllocationResponse
   * @throws ApiException if fails to make API call
   */
  public AllocationResponse createAllocationsForFeatureFlagInEnvironment(
      UUID featureFlagId, UUID environmentId, CreateAllocationsRequest body) throws ApiException {
    return createAllocationsForFeatureFlagInEnvironmentWithHttpInfo(
            featureFlagId, environmentId, body)
        .getData();
  }

  /**
   * Create targeting rules for a flag env.
   *
   * <p>See {@link #createAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AllocationResponse&gt;
   */
  public CompletableFuture<AllocationResponse> createAllocationsForFeatureFlagInEnvironmentAsync(
      UUID featureFlagId, UUID environmentId, CreateAllocationsRequest body) {
    return createAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync(
            featureFlagId, environmentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new targeting rule (allocation) for a feature flag in an environment.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>202 Accepted</code> with an <code>
   * approval-required</code> resource. No allocation is created and no suggestion is persisted. The
   * resource ID is the flag ID. Submit its <code>property</code>, <code>action</code>, <code>
   * suggestion</code>, and <code>environment_id</code> to <code>CreateFlagSuggestion</code>,
   * together with <code>notification_rule_targets</code>, to request approval. The suggestion value
   * contains the complete desired allocation set, including the new rule.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code>, including for callers with override permission or when approval is no
   * longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return ApiResponse&lt;AllocationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> Accepted - Approval required for this change </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A conflicting suggestion is pending or an allocation with this key already exists. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AllocationResponse> createAllocationsForFeatureFlagInEnvironmentWithHttpInfo(
      UUID featureFlagId, UUID environmentId, CreateAllocationsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " createAllocationsForFeatureFlagInEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " createAllocationsForFeatureFlagInEnvironment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createAllocationsForFeatureFlagInEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/allocations"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.createAllocationsForFeatureFlagInEnvironment",
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
        new GenericType<AllocationResponse>() {});
  }

  /**
   * Create targeting rules for a flag env.
   *
   * <p>See {@link #createAllocationsForFeatureFlagInEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AllocationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AllocationResponse>>
      createAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync(
          UUID featureFlagId, UUID environmentId, CreateAllocationsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<AllocationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " createAllocationsForFeatureFlagInEnvironment"));
      return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<AllocationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " createAllocationsForFeatureFlagInEnvironment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AllocationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createAllocationsForFeatureFlagInEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/allocations"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.createAllocationsForFeatureFlagInEnvironment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AllocationResponse>> result = new CompletableFuture<>();
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
        new GenericType<AllocationResponse>() {});
  }

  /**
   * Create a feature flag.
   *
   * <p>See {@link #createFeatureFlagWithHttpInfo}.
   *
   * @param body (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse createFeatureFlag(CreateFeatureFlagRequest body) throws ApiException {
    return createFeatureFlagWithHttpInfo(body).getData();
  }

  /**
   * Create a feature flag.
   *
   * <p>See {@link #createFeatureFlagWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> createFeatureFlagAsync(
      CreateFeatureFlagRequest body) {
    return createFeatureFlagWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new feature flag with variants.
   *
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
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
  public ApiResponse<FeatureFlagResponse> createFeatureFlagWithHttpInfo(
      CreateFeatureFlagRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.createFeatureFlag",
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Create a feature flag.
   *
   * <p>See {@link #createFeatureFlagWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> createFeatureFlagWithHttpInfoAsync(
      CreateFeatureFlagRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.createFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Create an environment.
   *
   * <p>See {@link #createFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param body (required)
   * @return EnvironmentResponse
   * @throws ApiException if fails to make API call
   */
  public EnvironmentResponse createFeatureFlagsEnvironment(CreateEnvironmentRequest body)
      throws ApiException {
    return createFeatureFlagsEnvironmentWithHttpInfo(body).getData();
  }

  /**
   * Create an environment.
   *
   * <p>See {@link #createFeatureFlagsEnvironmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;EnvironmentResponse&gt;
   */
  public CompletableFuture<EnvironmentResponse> createFeatureFlagsEnvironmentAsync(
      CreateEnvironmentRequest body) {
    return createFeatureFlagsEnvironmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new environment for organizing feature flags.
   *
   * @param body (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
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
  public ApiResponse<EnvironmentResponse> createFeatureFlagsEnvironmentWithHttpInfo(
      CreateEnvironmentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.createFeatureFlagsEnvironment",
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Create an environment.
   *
   * <p>See {@link #createFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>>
      createFeatureFlagsEnvironmentWithHttpInfoAsync(CreateEnvironmentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createFeatureFlagsEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.createFeatureFlagsEnvironment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Create a flag change suggestion.
   *
   * <p>See {@link #createFlagSuggestionWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return FeatureFlagSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagSuggestionResponse createFlagSuggestion(
      UUID featureFlagId, CreateFlagSuggestionRequest body) throws ApiException {
    return createFlagSuggestionWithHttpInfo(featureFlagId, body).getData();
  }

  /**
   * Create a flag change suggestion.
   *
   * <p>See {@link #createFlagSuggestionWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagSuggestionResponse&gt;
   */
  public CompletableFuture<FeatureFlagSuggestionResponse> createFlagSuggestionAsync(
      UUID featureFlagId, CreateFlagSuggestionRequest body) {
    return createFlagSuggestionWithHttpInfoAsync(featureFlagId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a persisted suggestion for a feature flag change that requires approval. The change is
   * not applied until the suggestion is approved and applied. Requires contributor or editor access
   * to the flag. The request must contain at least one <code>notification_rule_targets</code>
   * handle for review notifications.
   *
   * <p>Use this endpoint to submit the proposed change from the <code>202 Accepted</code>
   * approval-required response of <code>CreateAllocationsForFeatureFlagInEnvironment</code>. Other
   * approval-gated mutation endpoints return <code>201 Created</code> with a persisted suggestion.
   * Do not submit those suggestions again.
   *
   * <p>An <code>environment_id</code> is required for <code>ALLOCATIONS</code>, <code>
   * DEFAULT_VARIANT</code>, and <code>OVERRIDE_VARIANT</code>. For allocation and variant changes,
   * <code>suggestion</code> is a JSON-encoded string, not a nested JSON object. Conflicting
   * suggestions that are pending, or approved but not yet applied, return <code>409 Conflict</code>
   * .
   *
   * <p>The allocations in an <code>ALLOCATIONS</code> suggestion are validated with the rules that
   * <code>UpdateAllocationsForFeatureFlagInEnvironment</code> applies to a change that requires
   * approval, including the rules for request fields, targeting rules and their <code>ONE_OF</code>
   * and <code>NOT_ONE_OF</code> value limits, variant and metric references, draft allocations, and
   * exposure schedules. A schedule with <code>apm_retention</code> that has not started must be
   * started with the exposure schedule start endpoint, not with <code>autostart</code> or an <code>
   * absolute_start_time</code>. That endpoint's Product Analytics Experiments Write permission
   * checks also apply. If that endpoint would reject the allocations, this endpoint returns the
   * same error: <code>400 Bad Request</code> for invalid allocations, for example a <code>
   * UNIFORM_INTERVALS</code> schedule with a <code>selection_interval_ms</code> of <code>0</code>,
   * <code>403 Forbidden</code> when the caller lacks the Experiments Write permission the lineup
   * needs, and <code>409 Conflict</code> for a lineup that changes or omits a draft allocation.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A conflicting suggestion is pending, or the lineup changes or omits a draft allocation. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagSuggestionResponse> createFlagSuggestionWithHttpInfo(
      UUID featureFlagId, CreateFlagSuggestionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'featureFlagId' when calling createFlagSuggestion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/suggestions"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.createFlagSuggestion",
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Create a flag change suggestion.
   *
   * <p>See {@link #createFlagSuggestionWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>>
      createFlagSuggestionWithHttpInfoAsync(UUID featureFlagId, CreateFlagSuggestionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling createFlagSuggestion"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/suggestions"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.createFlagSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Add a variant to a feature flag.
   *
   * <p>See {@link #createVariantForFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return VariantResponse
   * @throws ApiException if fails to make API call
   */
  public VariantResponse createVariantForFeatureFlag(UUID featureFlagId, CreateVariantRequest body)
      throws ApiException {
    return createVariantForFeatureFlagWithHttpInfo(featureFlagId, body).getData();
  }

  /**
   * Add a variant to a feature flag.
   *
   * <p>See {@link #createVariantForFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;VariantResponse&gt;
   */
  public CompletableFuture<VariantResponse> createVariantForFeatureFlagAsync(
      UUID featureFlagId, CreateVariantRequest body) {
    return createVariantForFeatureFlagWithHttpInfoAsync(featureFlagId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Adds a single new variant to an existing feature flag. This endpoint is additive-only: it never
   * modifies existing variants. A request whose <code>key</code> already exists on the flag is
   * rejected with <code>409 Conflict</code>; a <code>value</code> whose type does not match the
   * flag's <code>value_type</code> is rejected with <code>400</code>. The server generates the
   * variant UUID and returns it in the response body; callers (for example, the flag-migration
   * tool) need this UUID to reference the new variant in subsequent allocation syncs.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return ApiResponse&lt;VariantResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A variant with this key already exists on the flag. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<VariantResponse> createVariantForFeatureFlagWithHttpInfo(
      UUID featureFlagId, CreateVariantRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " createVariantForFeatureFlag");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createVariantForFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.createVariantForFeatureFlag",
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
        new GenericType<VariantResponse>() {});
  }

  /**
   * Add a variant to a feature flag.
   *
   * <p>See {@link #createVariantForFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;VariantResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<VariantResponse>>
      createVariantForFeatureFlagWithHttpInfoAsync(UUID featureFlagId, CreateVariantRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<VariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " createVariantForFeatureFlag"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<VariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createVariantForFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.createVariantForFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<VariantResponse>> result = new CompletableFuture<>();
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
        new GenericType<VariantResponse>() {});
  }

  /**
   * Delete an environment.
   *
   * <p>See {@link #deleteFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFeatureFlagsEnvironment(UUID environmentId) throws ApiException {
    deleteFeatureFlagsEnvironmentWithHttpInfo(environmentId);
  }

  /**
   * Delete an environment.
   *
   * <p>See {@link #deleteFeatureFlagsEnvironmentWithHttpInfoAsync}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteFeatureFlagsEnvironmentAsync(UUID environmentId) {
    return deleteFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an environment. This operation cannot be undone.
   *
   * @param environmentId The ID of the environment. (required)
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
  public ApiResponse<Void> deleteFeatureFlagsEnvironmentWithHttpInfo(UUID environmentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " deleteFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.deleteFeatureFlagsEnvironment",
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
   * Delete an environment.
   *
   * <p>See {@link #deleteFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFeatureFlagsEnvironmentWithHttpInfoAsync(
      UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " deleteFeatureFlagsEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.deleteFeatureFlagsEnvironment",
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
   * Delete or discard a flag change suggestion.
   *
   * <p>See {@link #deleteFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFlagSuggestion(UUID suggestionId) throws ApiException {
    deleteFlagSuggestionWithHttpInfo(suggestionId);
  }

  /**
   * Delete or discard a flag change suggestion.
   *
   * <p>See {@link #deleteFlagSuggestionWithHttpInfoAsync}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteFlagSuggestionAsync(UUID suggestionId) {
    return deleteFlagSuggestionWithHttpInfoAsync(suggestionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a pending suggestion or discards an approved suggestion that has not been applied.
   * Requires editor access to the flag, or contributor access for the suggestion's creator. Applied
   * and rejected suggestions return <code>409 Conflict</code>. A missing or already discarded
   * suggestion returns <code>204 No Content</code>.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - Applied or rejected suggestions cannot be deleted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteFlagSuggestionWithHttpInfo(UUID suggestionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'suggestionId' when calling deleteFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.deleteFlagSuggestion",
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
   * Delete or discard a flag change suggestion.
   *
   * <p>See {@link #deleteFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFlagSuggestionWithHttpInfoAsync(
      UUID suggestionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suggestionId' when calling deleteFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.deleteFlagSuggestion",
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
   * Delete a variant.
   *
   * <p>See {@link #deleteVariantFromFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVariantFromFeatureFlag(UUID featureFlagId, UUID variantId) throws ApiException {
    deleteVariantFromFeatureFlagWithHttpInfo(featureFlagId, variantId);
  }

  /**
   * Delete a variant.
   *
   * <p>See {@link #deleteVariantFromFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteVariantFromFeatureFlagAsync(
      UUID featureFlagId, UUID variantId) {
    return deleteVariantFromFeatureFlagWithHttpInfoAsync(featureFlagId, variantId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a variant from a feature flag.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion, in the same format as the <code>GetFlagSuggestion</code> response. The change is
   * not applied until the suggestion is approved and applied. Use the returned suggestion ID with
   * <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>, <code>RejectFlagSuggestion
   * </code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A pending suggestion already exists for this property. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteVariantFromFeatureFlagWithHttpInfo(
      UUID featureFlagId, UUID variantId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " deleteVariantFromFeatureFlag");
    }

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'variantId' when calling deleteVariantFromFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants/{variant_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.deleteVariantFromFeatureFlag",
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
   * Delete a variant.
   *
   * <p>See {@link #deleteVariantFromFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteVariantFromFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId, UUID variantId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " deleteVariantFromFeatureFlag"));
      return result;
    }

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'variantId' when calling"
                  + " deleteVariantFromFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants/{variant_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.deleteVariantFromFeatureFlag",
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
   * Disable a feature flag in an environment.
   *
   * <p>See {@link #disableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @throws ApiException if fails to make API call
   */
  public void disableFeatureFlagEnvironment(UUID featureFlagId, UUID environmentId)
      throws ApiException {
    disableFeatureFlagEnvironmentWithHttpInfo(featureFlagId, environmentId);
  }

  /**
   * Disable a feature flag in an environment.
   *
   * <p>See {@link #disableFeatureFlagEnvironmentWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> disableFeatureFlagEnvironmentAsync(
      UUID featureFlagId, UUID environmentId) {
    return disableFeatureFlagEnvironmentWithHttpInfoAsync(featureFlagId, environmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disables a feature flag in a specific environment.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion, in the same format as the <code>GetFlagSuggestion</code> response. The change is
   * not applied until the suggestion is approved and applied. Use the returned suggestion ID with
   * <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>, <code>RejectFlagSuggestion
   * </code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A conflicting suggestion is pending for this flag and environment. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> disableFeatureFlagEnvironmentWithHttpInfo(
      UUID featureFlagId, UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " disableFeatureFlagEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " disableFeatureFlagEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/disable"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.disableFeatureFlagEnvironment",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Disable a feature flag in an environment.
   *
   * <p>See {@link #disableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> disableFeatureFlagEnvironmentWithHttpInfoAsync(
      UUID featureFlagId, UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " disableFeatureFlagEnvironment"));
      return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " disableFeatureFlagEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/disable"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.disableFeatureFlagEnvironment",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Enable a feature flag in an environment.
   *
   * <p>See {@link #enableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @throws ApiException if fails to make API call
   */
  public void enableFeatureFlagEnvironment(UUID featureFlagId, UUID environmentId)
      throws ApiException {
    enableFeatureFlagEnvironmentWithHttpInfo(featureFlagId, environmentId);
  }

  /**
   * Enable a feature flag in an environment.
   *
   * <p>See {@link #enableFeatureFlagEnvironmentWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> enableFeatureFlagEnvironmentAsync(
      UUID featureFlagId, UUID environmentId) {
    return enableFeatureFlagEnvironmentWithHttpInfoAsync(featureFlagId, environmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enables a feature flag in a specific environment.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion, in the same format as the <code>GetFlagSuggestion</code> response. The change is
   * not applied until the suggestion is approved and applied. Use the returned suggestion ID with
   * <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>, <code>RejectFlagSuggestion
   * </code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A conflicting suggestion is pending for this flag and environment. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> enableFeatureFlagEnvironmentWithHttpInfo(
      UUID featureFlagId, UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " enableFeatureFlagEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " enableFeatureFlagEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/enable"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.enableFeatureFlagEnvironment",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Enable a feature flag in an environment.
   *
   * <p>See {@link #enableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> enableFeatureFlagEnvironmentWithHttpInfoAsync(
      UUID featureFlagId, UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " enableFeatureFlagEnvironment"));
      return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " enableFeatureFlagEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/enable"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.enableFeatureFlagEnvironment",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /** Manage optional parameters to exportFeatureFlagHistory. */
  public static class ExportFeatureFlagHistoryOptionalParameters {
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private List<String> teams;
    private List<String> tags;
    private UUID featureFlagId;
    private UUID environmentId;
    private Boolean includeSuggestionEvents;

    /**
     * Set startDate.
     *
     * @param startDate Only include changes made after this time, for example <code>
     *     2026-01-01T00:00:00Z</code>. The bound is exclusive, so a change made exactly at this
     *     time is not included. Omit for no lower bound. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters startDate(OffsetDateTime startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Set endDate.
     *
     * @param endDate Only include changes made before this time, for example <code>
     *     2026-02-01T00:00:00Z</code>. The bound is exclusive, so a change made exactly at this
     *     time is not included. Omit for no upper bound. Must be after <code>start_date</code> when
     *     both are set. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters endDate(OffsetDateTime endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * Set teams.
     *
     * @param teams Only include changes to flags that belong to at least one of these teams. Use
     *     team handles without the <code>team:</code> prefix, as repeated parameters, such as
     *     <code>teams=checkout&amp;teams=payments</code>. Handles from <code>teams</code> and
     *     <code>team:&lt;handle&gt;</code> values from <code>tags</code> are treated as one set.
     *     Handles that are empty, have surrounding white space, or include the <code>team:</code>
     *     prefix return a <code>400 Bad Request</code> error. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters teams(List<String> teams) {
      this.teams = teams;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Only include changes to flags that have all of these exact tags, as repeated
     *     parameters, such as <code>tags=env:prod&amp;tags=tier:1</code>. Values of the form <code>
     *     team:&lt;handle&gt;</code> match any selected team and are combined with <code>teams
     *     </code>. Empty values are ignored. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set featureFlagId.
     *
     * @param featureFlagId Only include changes to this feature flag. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters featureFlagId(UUID featureFlagId) {
      this.featureFlagId = featureFlagId;
      return this;
    }

    /**
     * Set environmentId.
     *
     * @param environmentId Only include changes to this environment. Changes to the flag itself,
     *     which have no environment, are always included. (optional)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters environmentId(UUID environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set includeSuggestionEvents.
     *
     * @param includeSuggestionEvents Also include review events for change requests that needed
     *     approval: rejected requests and requests still pending review. Applies only to
     *     organizations with flag approvals enabled. (optional, default to false)
     * @return ExportFeatureFlagHistoryOptionalParameters
     */
    public ExportFeatureFlagHistoryOptionalParameters includeSuggestionEvents(
        Boolean includeSuggestionEvents) {
      this.includeSuggestionEvents = includeSuggestionEvents;
      return this;
    }
  }

  /**
   * Export feature flag change history.
   *
   * <p>See {@link #exportFeatureFlagHistoryWithHttpInfo}.
   *
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String exportFeatureFlagHistory() throws ApiException {
    return exportFeatureFlagHistoryWithHttpInfo(new ExportFeatureFlagHistoryOptionalParameters())
        .getData();
  }

  /**
   * Export feature flag change history.
   *
   * <p>See {@link #exportFeatureFlagHistoryWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;String&gt;
   */
  public CompletableFuture<String> exportFeatureFlagHistoryAsync() {
    return exportFeatureFlagHistoryWithHttpInfoAsync(
            new ExportFeatureFlagHistoryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Export feature flag change history.
   *
   * <p>See {@link #exportFeatureFlagHistoryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String exportFeatureFlagHistory(ExportFeatureFlagHistoryOptionalParameters parameters)
      throws ApiException {
    return exportFeatureFlagHistoryWithHttpInfo(parameters).getData();
  }

  /**
   * Export feature flag change history.
   *
   * <p>See {@link #exportFeatureFlagHistoryWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;String&gt;
   */
  public CompletableFuture<String> exportFeatureFlagHistoryAsync(
      ExportFeatureFlagHistoryOptionalParameters parameters) {
    return exportFeatureFlagHistoryWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Exports the organization's feature flag change events as a CSV file, newest first, without
   * pagination. It accepts the same filters as the List feature flag change history endpoint, and
   * its columns match the CSV export on the flag history page: Flag Version, Flag Name, Flag Key,
   * Flag UUID, Action, User Name, User Email, User Type, Environment, and Timestamp.
   *
   * <p>If an export fails before the file starts, the response is a JSON:API error. Large exports
   * stream as they are read. If an export fails after streaming starts, the connection closes
   * before the file ends, so the download fails instead of returning a file with missing rows. An
   * export must finish within the 60-second request timeout. If an export times out, narrow the
   * date range.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;String&gt;
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
  public ApiResponse<String> exportFeatureFlagHistoryWithHttpInfo(
      ExportFeatureFlagHistoryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    List<String> teams = parameters.teams;
    List<String> tags = parameters.tags;
    UUID featureFlagId = parameters.featureFlagId;
    UUID environmentId = parameters.environmentId;
    Boolean includeSuggestionEvents = parameters.includeSuggestionEvents;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/history/export";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_flag_id", featureFlagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environment_id", environmentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_suggestion_events", includeSuggestionEvents));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.exportFeatureFlagHistory",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/csv", "application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<String>() {});
  }

  /**
   * Export feature flag change history.
   *
   * <p>See {@link #exportFeatureFlagHistoryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;String&gt;&gt;
   */
  public CompletableFuture<ApiResponse<String>> exportFeatureFlagHistoryWithHttpInfoAsync(
      ExportFeatureFlagHistoryOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    List<String> teams = parameters.teams;
    List<String> tags = parameters.tags;
    UUID featureFlagId = parameters.featureFlagId;
    UUID environmentId = parameters.environmentId;
    Boolean includeSuggestionEvents = parameters.includeSuggestionEvents;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/history/export";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_flag_id", featureFlagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environment_id", environmentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_suggestion_events", includeSuggestionEvents));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.exportFeatureFlagHistory",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/csv", "application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
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
        new GenericType<String>() {});
  }

  /**
   * Get a feature flag.
   *
   * <p>See {@link #getFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse getFeatureFlag(UUID featureFlagId) throws ApiException {
    return getFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
   * Get a feature flag.
   *
   * <p>See {@link #getFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> getFeatureFlagAsync(UUID featureFlagId) {
    return getFeatureFlagWithHttpInfoAsync(featureFlagId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the details of a specific feature flag including variants and environment status.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
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
  public ApiResponse<FeatureFlagResponse> getFeatureFlagWithHttpInfo(UUID featureFlagId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'featureFlagId' when calling getFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.getFeatureFlag",
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Get a feature flag.
   *
   * <p>See {@link #getFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> getFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'featureFlagId' when calling getFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.getFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Get an environment.
   *
   * <p>See {@link #getFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return EnvironmentResponse
   * @throws ApiException if fails to make API call
   */
  public EnvironmentResponse getFeatureFlagsEnvironment(UUID environmentId) throws ApiException {
    return getFeatureFlagsEnvironmentWithHttpInfo(environmentId).getData();
  }

  /**
   * Get an environment.
   *
   * <p>See {@link #getFeatureFlagsEnvironmentWithHttpInfoAsync}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;EnvironmentResponse&gt;
   */
  public CompletableFuture<EnvironmentResponse> getFeatureFlagsEnvironmentAsync(
      UUID environmentId) {
    return getFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the details of a specific environment.
   *
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
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
  public ApiResponse<EnvironmentResponse> getFeatureFlagsEnvironmentWithHttpInfo(UUID environmentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling getFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.getFeatureFlagsEnvironment",
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Get an environment.
   *
   * <p>See {@link #getFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>>
      getFeatureFlagsEnvironmentWithHttpInfoAsync(UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " getFeatureFlagsEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.getFeatureFlagsEnvironment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Get a flag change suggestion.
   *
   * <p>See {@link #getFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return FeatureFlagSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagSuggestionResponse getFlagSuggestion(UUID suggestionId) throws ApiException {
    return getFlagSuggestionWithHttpInfo(suggestionId).getData();
  }

  /**
   * Get a flag change suggestion.
   *
   * <p>See {@link #getFlagSuggestionWithHttpInfoAsync}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture&lt;FeatureFlagSuggestionResponse&gt;
   */
  public CompletableFuture<FeatureFlagSuggestionResponse> getFlagSuggestionAsync(
      UUID suggestionId) {
    return getFlagSuggestionWithHttpInfoAsync(suggestionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a feature flag change suggestion by ID. Use <code>lifecycle_status</code> to
   * distinguish pending, approved, applied, rejected, and discarded suggestions. An approved
   * suggestion has not yet been applied; an applied suggestion has changed the flag.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return ApiResponse&lt;FeatureFlagSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagSuggestionResponse> getFlagSuggestionWithHttpInfo(UUID suggestionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'suggestionId' when calling getFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.getFlagSuggestion",
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Get a flag change suggestion.
   *
   * <p>See {@link #getFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>>
      getFlagSuggestionWithHttpInfoAsync(UUID suggestionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'suggestionId' when calling getFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.getFlagSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Get a saved filter.
   *
   * <p>See {@link #getSavedFilterWithHttpInfo}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @return SavedFilterResponse
   * @throws ApiException if fails to make API call
   */
  public SavedFilterResponse getSavedFilter(UUID savedFilterId) throws ApiException {
    return getSavedFilterWithHttpInfo(savedFilterId).getData();
  }

  /**
   * Get a saved filter.
   *
   * <p>See {@link #getSavedFilterWithHttpInfoAsync}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @return CompletableFuture&lt;SavedFilterResponse&gt;
   */
  public CompletableFuture<SavedFilterResponse> getSavedFilterAsync(UUID savedFilterId) {
    return getSavedFilterWithHttpInfoAsync(savedFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a saved filter by ID, including its full targeting rules, conditions, and values.
   * Supports both saved lists and saved rules. Targeting rules are combined with OR, and conditions
   * within each rule are combined with AND. Returns the stored filter definition rather than
   * evaluating it against users or organizations. Archived filters can be retrieved. Filters that
   * are deleted or belong to another organization return a not found error.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @return ApiResponse&lt;SavedFilterResponse&gt;
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
  public ApiResponse<SavedFilterResponse> getSavedFilterWithHttpInfo(UUID savedFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'savedFilterId' is set
    if (savedFilterId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'savedFilterId' when calling getSavedFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/saved-filters/{saved_filter_id}"
            .replaceAll(
                "\\{" + "saved_filter_id" + "\\}",
                apiClient.escapeString(savedFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.getSavedFilter",
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
        new GenericType<SavedFilterResponse>() {});
  }

  /**
   * Get a saved filter.
   *
   * <p>See {@link #getSavedFilterWithHttpInfo}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SavedFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SavedFilterResponse>> getSavedFilterWithHttpInfoAsync(
      UUID savedFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'savedFilterId' is set
    if (savedFilterId == null) {
      CompletableFuture<ApiResponse<SavedFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'savedFilterId' when calling getSavedFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/saved-filters/{saved_filter_id}"
            .replaceAll(
                "\\{" + "saved_filter_id" + "\\}",
                apiClient.escapeString(savedFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.getSavedFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SavedFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<SavedFilterResponse>() {});
  }

  /** Manage optional parameters to listFeatureFlagHistory. */
  public static class ListFeatureFlagHistoryOptionalParameters {
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private List<String> teams;
    private List<String> tags;
    private UUID featureFlagId;
    private UUID environmentId;
    private Boolean includeSuggestionEvents;
    private Long pageLimit;
    private Long pageOffset;

    /**
     * Set startDate.
     *
     * @param startDate Only include changes made after this time, for example <code>
     *     2026-01-01T00:00:00Z</code>. The bound is exclusive, so a change made exactly at this
     *     time is not included. Omit for no lower bound. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters startDate(OffsetDateTime startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Set endDate.
     *
     * @param endDate Only include changes made before this time, for example <code>
     *     2026-02-01T00:00:00Z</code>. The bound is exclusive, so a change made exactly at this
     *     time is not included. Omit for no upper bound. Must be after <code>start_date</code> when
     *     both are set. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters endDate(OffsetDateTime endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * Set teams.
     *
     * @param teams Only include changes to flags that belong to at least one of these teams. Use
     *     team handles without the <code>team:</code> prefix, as repeated parameters, such as
     *     <code>teams=checkout&amp;teams=payments</code>. Handles from <code>teams</code> and
     *     <code>team:&lt;handle&gt;</code> values from <code>tags</code> are treated as one set.
     *     Handles that are empty, have surrounding white space, or include the <code>team:</code>
     *     prefix return a <code>400 Bad Request</code> error. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters teams(List<String> teams) {
      this.teams = teams;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Only include changes to flags that have all of these exact tags, as repeated
     *     parameters, such as <code>tags=env:prod&amp;tags=tier:1</code>. Values of the form <code>
     *     team:&lt;handle&gt;</code> match any selected team and are combined with <code>teams
     *     </code>. Empty values are ignored. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set featureFlagId.
     *
     * @param featureFlagId Only include changes to this feature flag. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters featureFlagId(UUID featureFlagId) {
      this.featureFlagId = featureFlagId;
      return this;
    }

    /**
     * Set environmentId.
     *
     * @param environmentId Only include changes to this environment. Changes to the flag itself,
     *     which have no environment, are always included. (optional)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters environmentId(UUID environmentId) {
      this.environmentId = environmentId;
      return this;
    }

    /**
     * Set includeSuggestionEvents.
     *
     * @param includeSuggestionEvents Also include review events for change requests that needed
     *     approval: rejected requests and requests still pending review. Applies only to
     *     organizations with flag approvals enabled. (optional, default to false)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters includeSuggestionEvents(
        Boolean includeSuggestionEvents) {
      this.includeSuggestionEvents = includeSuggestionEvents;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of events to return. Defaults to <code>25</code>. Values
     *     above <code>50</code> return <code>50</code> events. Non-positive or empty values use the
     *     default. A non-integer value returns a <code>400 Bad Request</code> error. (optional,
     *     default to 25)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of matching events to skip before returning results. Defaults to
     *     <code>0</code>. Negative or empty values are set to <code>0</code>. A non-integer value
     *     returns a <code>400 Bad Request</code> error. (optional, default to 0)
     * @return ListFeatureFlagHistoryOptionalParameters
     */
    public ListFeatureFlagHistoryOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * List feature flag change history.
   *
   * <p>See {@link #listFeatureFlagHistoryWithHttpInfo}.
   *
   * @return ListFeatureFlagHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public ListFeatureFlagHistoryResponse listFeatureFlagHistory() throws ApiException {
    return listFeatureFlagHistoryWithHttpInfo(new ListFeatureFlagHistoryOptionalParameters())
        .getData();
  }

  /**
   * List feature flag change history.
   *
   * <p>See {@link #listFeatureFlagHistoryWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListFeatureFlagHistoryResponse&gt;
   */
  public CompletableFuture<ListFeatureFlagHistoryResponse> listFeatureFlagHistoryAsync() {
    return listFeatureFlagHistoryWithHttpInfoAsync(new ListFeatureFlagHistoryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List feature flag change history.
   *
   * <p>See {@link #listFeatureFlagHistoryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListFeatureFlagHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public ListFeatureFlagHistoryResponse listFeatureFlagHistory(
      ListFeatureFlagHistoryOptionalParameters parameters) throws ApiException {
    return listFeatureFlagHistoryWithHttpInfo(parameters).getData();
  }

  /**
   * List feature flag change history.
   *
   * <p>See {@link #listFeatureFlagHistoryWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListFeatureFlagHistoryResponse&gt;
   */
  public CompletableFuture<ListFeatureFlagHistoryResponse> listFeatureFlagHistoryAsync(
      ListFeatureFlagHistoryOptionalParameters parameters) {
    return listFeatureFlagHistoryWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the organization's feature flag change events, newest first. Each event includes a
   * readable description of the change. All filters are optional, and events must match every
   * filter you set. Without a date range, the whole history is listed. Results are paginated with
   * <code>page[limit]</code> and <code>page[offset]</code>; follow <code>links.next</code> to read
   * further back.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListFeatureFlagHistoryResponse&gt;
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
  public ApiResponse<ListFeatureFlagHistoryResponse> listFeatureFlagHistoryWithHttpInfo(
      ListFeatureFlagHistoryOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    List<String> teams = parameters.teams;
    List<String> tags = parameters.tags;
    UUID featureFlagId = parameters.featureFlagId;
    UUID environmentId = parameters.environmentId;
    Boolean includeSuggestionEvents = parameters.includeSuggestionEvents;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/history";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_flag_id", featureFlagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environment_id", environmentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_suggestion_events", includeSuggestionEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.listFeatureFlagHistory",
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
        new GenericType<ListFeatureFlagHistoryResponse>() {});
  }

  /**
   * List feature flag change history.
   *
   * <p>See {@link #listFeatureFlagHistoryWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListFeatureFlagHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListFeatureFlagHistoryResponse>>
      listFeatureFlagHistoryWithHttpInfoAsync(ListFeatureFlagHistoryOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime startDate = parameters.startDate;
    OffsetDateTime endDate = parameters.endDate;
    List<String> teams = parameters.teams;
    List<String> tags = parameters.tags;
    UUID featureFlagId = parameters.featureFlagId;
    UUID environmentId = parameters.environmentId;
    Boolean includeSuggestionEvents = parameters.includeSuggestionEvents;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/history";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_flag_id", featureFlagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environment_id", environmentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_suggestion_events", includeSuggestionEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.listFeatureFlagHistory",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListFeatureFlagHistoryResponse>> result =
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
        new GenericType<ListFeatureFlagHistoryResponse>() {});
  }

  /** Manage optional parameters to listFeatureFlags. */
  public static class ListFeatureFlagsOptionalParameters {
    private String key;
    private Boolean isArchived;
    private Long limit;
    private Long offset;
    private List<String> tags;
    private List<String> teams;
    private List<FeatureFlagProductionStatus> productionStatus;
    private FeatureFlagDistributionChannel distributionChannel;
    private String search;
    private List<ValueType> valueType;
    private List<UUID> createdBy;
    private List<UUID> flagIds;
    private FeatureFlagStalenessStatus stalenessStatus;
    private UUID savedFilterId;
    private String sort;
    private Long pageLimit;
    private Long pageOffset;

    /**
     * Set key.
     *
     * @param key Filter feature flags by an exact, case-sensitive key. Use <code>search</code> for
     *     partial matching. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set isArchived.
     *
     * @param isArchived Filter by archived status. If <code>true</code>, return only archived
     *     flags. If <code>false</code>, return only flags that are not archived. If omitted, return
     *     both. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters isArchived(Boolean isArchived) {
      this.isArchived = isArchived;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Deprecated alias for <code>page[limit]</code>. Use <code>page[limit]</code> for
     *     new requests. Used only when <code>page[limit]</code> is absent. When both parameters are
     *     omitted, the server defaults to <code>25</code>. Values that exceed <code>50</code> are
     *     set to <code>50</code>; non-positive or empty values use the server default. (optional,
     *     default to 100)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Deprecated alias for <code>page[offset]</code>. Used only when <code>
     *     page[offset]</code> is absent. Defaults to <code>0</code>. Negative or empty values are
     *     set to <code>0</code>. (optional, default to 0)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Filter by exact tag values using repeated parameters, such as <code>
     *     tags=env:prod&amp;tags=purpose:sitemap</code>. A flag must have all ordinary tags. Values
     *     of the form <code>team:&lt;handle&gt;</code> match any selected team and are combined
     *     with <code>teams</code> into one set. The result must match all ordinary tags, any
     *     selected team, and all other filters. Empty values are ignored. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set teams.
     *
     * @param teams Filter by team handles without the <code>team:</code> prefix. Use repeated
     *     parameters to filter by multiple team handles, such as <code>
     *     teams=checkout&amp;teams=payments</code>. A flag must belong to at least one selected
     *     team. Team handles from <code>teams</code> and <code>team:&lt;handle&gt;</code> values
     *     from tags are treated as a single set and combined with ordinary tags and other filters
     *     using AND logic. Duplicate handles do not duplicate results. Unknown handles do not match
     *     any flags. Empty handles, surrounding white space, or using the <code>team:</code> prefix
     *     return a bad request error. Response tags are unchanged. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters teams(List<String> teams) {
      this.teams = teams;
      return this;
    }

    /**
     * Set productionStatus.
     *
     * @param productionStatus Filter by status across production environments. Use repeated
     *     parameters to match any selected status. <code>ENABLED</code> matches at least one
     *     enabled production environment without a variant override. <code>OVERRIDDEN</code>
     *     matches at least one enabled production environment with a variant override. <code>
     *     DISABLED</code> matches flags whose associated production environments are all disabled.
     *     A flag can match both <code>ENABLED</code> and <code>OVERRIDDEN</code> in different
     *     environments. Flags without associated production environments do not match. This does
     *     not filter by a specific environment. Unknown values do not match any status. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters productionStatus(
        List<FeatureFlagProductionStatus> productionStatus) {
      this.productionStatus = productionStatus;
      return this;
    }

    /**
     * Set distributionChannel.
     *
     * @param distributionChannel Filter by SDK availability. <code>CLIENT</code> returns flags with
     *     channel <code>CLIENT</code> or <code>ALL</code>. <code>SERVER</code> returns flags with
     *     channel <code>SERVER</code> or <code>ALL</code>. <code>ALL</code>, an empty value, or
     *     omission applies no channel restriction; it does not select only flags whose channel is
     *     <code>ALL</code>. Values are case-insensitive and surrounding white space is ignored.
     *     Invalid values return a bad request error. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters distributionChannel(
        FeatureFlagDistributionChannel distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Case-insensitive substring search on flag names, keys, and tag names. Combined
     *     with all other filters. An empty value applies no search restriction. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set valueType.
     *
     * @param valueType Filter by variant value types using repeated parameters. A flag must match
     *     at least one selected type. Empty values are ignored. Invalid types return a bad request
     *     error. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters valueType(List<ValueType> valueType) {
      this.valueType = valueType;
      return this;
    }

    /**
     * Set createdBy.
     *
     * @param createdBy Filter by creator UUIDs using repeated parameters. A flag must match at
     *     least one creator. Empty values are ignored. Invalid UUIDs return a bad request error.
     *     (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters createdBy(List<UUID> createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set flagIds.
     *
     * @param flagIds Filter by feature flag UUIDs using repeated parameters. A flag must match at
     *     least one ID and all other filters. Duplicate IDs return each flag once. Unknown IDs and
     *     IDs from other organizations do not match any flags. Empty or invalid UUIDs return a bad
     *     request error. Pagination still applies. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters flagIds(List<UUID> flagIds) {
      this.flagIds = flagIds;
      return this;
    }

    /**
     * Set stalenessStatus.
     *
     * @param stalenessStatus Filter by the computed staleness status: <code>ACTIVE</code>, <code>
     *     STALE</code>, or <code>PERMANENT</code>. Values are case-insensitive and surrounding
     *     white space is ignored. An empty value or omission applies no restriction. Invalid values
     *     return a bad request error. Read the computed result from <code>
     *     staleness_details.staleness_status</code>, not the legacy <code>staleness_status</code>
     *     response field. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters stalenessStatus(
        FeatureFlagStalenessStatus stalenessStatus) {
      this.stalenessStatus = stalenessStatus;
      return this;
    }

    /**
     * Set savedFilterId.
     *
     * @param savedFilterId Filter to flags that reference this saved filter in their targeting
     *     conditions. An empty value or omission applies no restriction. An invalid UUID returns a
     *     bad request error. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters savedFilterId(UUID savedFilterId) {
      this.savedFilterId = savedFilterId;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort by <code>name</code>, <code>updated_at</code>, <code>created_at</code>, or
     *     <code>evaluations</code>. Use a comma-separated list for multiple sort fields and prefix
     *     a field with <code>-</code> for descending order. The default is <code>updated_at</code>
     *     descending. When favorites are enabled, the authenticated user's favorite flags take
     *     precedence over the selected ordering. Unknown fields return a bad request error.
     *     (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of flags to return. Defaults to <code>25</code> and is capped
     *     at <code>50</code>. Values that exceed <code>50</code> are set to <code>50</code>.
     *     Non-positive or empty values use the default. A non-integer value returns a bad request
     *     error. Takes precedence over <code>limit</code> when both are present. Pagination applies
     *     even when no pagination parameters are supplied. (optional, default to 25)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of matching flags to skip before returning results. Defaults to
     *     <code>0</code>. Negative or empty values are set to <code>0</code>. A non-integer value
     *     returns a bad request error. Takes precedence over <code>offset</code> when both are
     *     present. (optional, default to 0)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * List feature flags.
   *
   * <p>See {@link #listFeatureFlagsWithHttpInfo}.
   *
   * @return ListFeatureFlagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFeatureFlagsResponse listFeatureFlags() throws ApiException {
    return listFeatureFlagsWithHttpInfo(new ListFeatureFlagsOptionalParameters()).getData();
  }

  /**
   * List feature flags.
   *
   * <p>See {@link #listFeatureFlagsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListFeatureFlagsResponse&gt;
   */
  public CompletableFuture<ListFeatureFlagsResponse> listFeatureFlagsAsync() {
    return listFeatureFlagsWithHttpInfoAsync(new ListFeatureFlagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List feature flags.
   *
   * <p>See {@link #listFeatureFlagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListFeatureFlagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFeatureFlagsResponse listFeatureFlags(ListFeatureFlagsOptionalParameters parameters)
      throws ApiException {
    return listFeatureFlagsWithHttpInfo(parameters).getData();
  }

  /**
   * List feature flags.
   *
   * <p>See {@link #listFeatureFlagsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListFeatureFlagsResponse&gt;
   */
  public CompletableFuture<ListFeatureFlagsResponse> listFeatureFlagsAsync(
      ListFeatureFlagsOptionalParameters parameters) {
    return listFeatureFlagsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a paginated list of feature flags for the organization. Supports filtering by key,
   * tags, teams, SDK availability, production status, and other flag properties. Use <code>
   * page[limit]</code> and <code>page[offset]</code> to paginate, or follow the <code>next</code>
   * link in the response.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListFeatureFlagsResponse&gt;
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
  public ApiResponse<ListFeatureFlagsResponse> listFeatureFlagsWithHttpInfo(
      ListFeatureFlagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String key = parameters.key;
    Boolean isArchived = parameters.isArchived;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    List<String> tags = parameters.tags;
    List<String> teams = parameters.teams;
    List<FeatureFlagProductionStatus> productionStatus = parameters.productionStatus;
    FeatureFlagDistributionChannel distributionChannel = parameters.distributionChannel;
    String search = parameters.search;
    List<ValueType> valueType = parameters.valueType;
    List<UUID> createdBy = parameters.createdBy;
    List<UUID> flagIds = parameters.flagIds;
    FeatureFlagStalenessStatus stalenessStatus = parameters.stalenessStatus;
    UUID savedFilterId = parameters.savedFilterId;
    String sort = parameters.sort;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_archived", isArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "production_status", productionStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "distribution_channel", distributionChannel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "value_type", valueType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "created_by", createdBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "flag_ids", flagIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "staleness_status", stalenessStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "saved_filter_id", savedFilterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.listFeatureFlags",
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
        new GenericType<ListFeatureFlagsResponse>() {});
  }

  /**
   * List feature flags.
   *
   * <p>See {@link #listFeatureFlagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListFeatureFlagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListFeatureFlagsResponse>> listFeatureFlagsWithHttpInfoAsync(
      ListFeatureFlagsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String key = parameters.key;
    Boolean isArchived = parameters.isArchived;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    List<String> tags = parameters.tags;
    List<String> teams = parameters.teams;
    List<FeatureFlagProductionStatus> productionStatus = parameters.productionStatus;
    FeatureFlagDistributionChannel distributionChannel = parameters.distributionChannel;
    String search = parameters.search;
    List<ValueType> valueType = parameters.valueType;
    List<UUID> createdBy = parameters.createdBy;
    List<UUID> flagIds = parameters.flagIds;
    FeatureFlagStalenessStatus stalenessStatus = parameters.stalenessStatus;
    UUID savedFilterId = parameters.savedFilterId;
    String sort = parameters.sort;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_archived", isArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "teams", teams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "production_status", productionStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "distribution_channel", distributionChannel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "value_type", valueType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "created_by", createdBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "flag_ids", flagIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "staleness_status", stalenessStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "saved_filter_id", savedFilterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.listFeatureFlags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListFeatureFlagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListFeatureFlagsResponse>() {});
  }

  /** Manage optional parameters to listFeatureFlagsEnvironments. */
  public static class ListFeatureFlagsEnvironmentsOptionalParameters {
    private String name;
    private String key;
    private String ddEnv;
    private Long limit;
    private Long offset;

    /**
     * Set name.
     *
     * @param name Filter environments by name (partial matching). (optional)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set key.
     *
     * @param key Filter environments by key (partial matching). (optional)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set ddEnv.
     *
     * @param ddEnv Filter environments by queries that contain the provided DD_ENV value.
     *     (optional)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters ddEnv(String ddEnv) {
      this.ddEnv = ddEnv;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of results to return. (optional, default to 100)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Number of results to skip. (optional, default to 0)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * List environments.
   *
   * <p>See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
   *
   * @return ListEnvironmentsResponse
   * @throws ApiException if fails to make API call
   */
  public ListEnvironmentsResponse listFeatureFlagsEnvironments() throws ApiException {
    return listFeatureFlagsEnvironmentsWithHttpInfo(
            new ListFeatureFlagsEnvironmentsOptionalParameters())
        .getData();
  }

  /**
   * List environments.
   *
   * <p>See {@link #listFeatureFlagsEnvironmentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListEnvironmentsResponse&gt;
   */
  public CompletableFuture<ListEnvironmentsResponse> listFeatureFlagsEnvironmentsAsync() {
    return listFeatureFlagsEnvironmentsWithHttpInfoAsync(
            new ListFeatureFlagsEnvironmentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List environments.
   *
   * <p>See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListEnvironmentsResponse
   * @throws ApiException if fails to make API call
   */
  public ListEnvironmentsResponse listFeatureFlagsEnvironments(
      ListFeatureFlagsEnvironmentsOptionalParameters parameters) throws ApiException {
    return listFeatureFlagsEnvironmentsWithHttpInfo(parameters).getData();
  }

  /**
   * List environments.
   *
   * <p>See {@link #listFeatureFlagsEnvironmentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListEnvironmentsResponse&gt;
   */
  public CompletableFuture<ListEnvironmentsResponse> listFeatureFlagsEnvironmentsAsync(
      ListFeatureFlagsEnvironmentsOptionalParameters parameters) {
    return listFeatureFlagsEnvironmentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a list of environments for the organization. Supports filtering by name, key, and
   * DD_ENV.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListEnvironmentsResponse&gt;
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
  public ApiResponse<ListEnvironmentsResponse> listFeatureFlagsEnvironmentsWithHttpInfo(
      ListFeatureFlagsEnvironmentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String name = parameters.name;
    String key = parameters.key;
    String ddEnv = parameters.ddEnv;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dd_env", ddEnv));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.listFeatureFlagsEnvironments",
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
        new GenericType<ListEnvironmentsResponse>() {});
  }

  /**
   * List environments.
   *
   * <p>See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListEnvironmentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListEnvironmentsResponse>>
      listFeatureFlagsEnvironmentsWithHttpInfoAsync(
          ListFeatureFlagsEnvironmentsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String name = parameters.name;
    String key = parameters.key;
    String ddEnv = parameters.ddEnv;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dd_env", ddEnv));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.listFeatureFlagsEnvironments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListEnvironmentsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListEnvironmentsResponse>() {});
  }

  /**
   * Pause a progressive rollout.
   *
   * <p>See {@link #pauseExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return AllocationExposureScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public AllocationExposureScheduleResponse pauseExposureSchedule(UUID exposureScheduleId)
      throws ApiException {
    return pauseExposureScheduleWithHttpInfo(exposureScheduleId).getData();
  }

  /**
   * Pause a progressive rollout.
   *
   * <p>See {@link #pauseExposureScheduleWithHttpInfoAsync}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;AllocationExposureScheduleResponse&gt;
   */
  public CompletableFuture<AllocationExposureScheduleResponse> pauseExposureScheduleAsync(
      UUID exposureScheduleId) {
    return pauseExposureScheduleWithHttpInfoAsync(exposureScheduleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Pauses a progressive rollout while preserving rollout state.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return ApiResponse&lt;AllocationExposureScheduleResponse&gt;
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
  public ApiResponse<AllocationExposureScheduleResponse> pauseExposureScheduleWithHttpInfo(
      UUID exposureScheduleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureScheduleId' when calling pauseExposureSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/pause"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.pauseExposureSchedule",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Pause a progressive rollout.
   *
   * <p>See {@link #pauseExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AllocationExposureScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>>
      pauseExposureScheduleWithHttpInfoAsync(UUID exposureScheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureScheduleId' when calling"
                  + " pauseExposureSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/pause"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.pauseExposureSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Reject a flag change suggestion.
   *
   * <p>See {@link #rejectFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return FeatureFlagSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagSuggestionResponse rejectFlagSuggestion(
      UUID suggestionId, RejectFlagSuggestionRequest body) throws ApiException {
    return rejectFlagSuggestionWithHttpInfo(suggestionId, body).getData();
  }

  /**
   * Reject a flag change suggestion.
   *
   * <p>See {@link #rejectFlagSuggestionWithHttpInfoAsync}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagSuggestionResponse&gt;
   */
  public CompletableFuture<FeatureFlagSuggestionResponse> rejectFlagSuggestionAsync(
      UUID suggestionId, RejectFlagSuggestionRequest body) {
    return rejectFlagSuggestionWithHttpInfoAsync(suggestionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Rejects a pending feature flag change suggestion without applying the change. Requires editor
   * access to the flag or the Feature Flag Approvals Override permission. Rejecting an already
   * rejected suggestion succeeds. Approved, applied, or discarded suggestions return <code>
   * 409 Conflict</code>.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - The suggestion is already approved, applied, or discarded. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagSuggestionResponse> rejectFlagSuggestionWithHttpInfo(
      UUID suggestionId, RejectFlagSuggestionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'suggestionId' when calling rejectFlagSuggestion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling rejectFlagSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/reject"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.rejectFlagSuggestion",
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Reject a flag change suggestion.
   *
   * <p>See {@link #rejectFlagSuggestionWithHttpInfo}.
   *
   * @param suggestionId The ID of the feature flag change suggestion. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>>
      rejectFlagSuggestionWithHttpInfoAsync(UUID suggestionId, RejectFlagSuggestionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'suggestionId' is set
    if (suggestionId == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suggestionId' when calling rejectFlagSuggestion"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling rejectFlagSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/suggestions/{suggestion_id}/reject"
            .replaceAll(
                "\\{" + "suggestion_id" + "\\}", apiClient.escapeString(suggestionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.rejectFlagSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagSuggestionResponse>> result =
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
        new GenericType<FeatureFlagSuggestionResponse>() {});
  }

  /**
   * Resume a progressive rollout.
   *
   * <p>See {@link #resumeExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return AllocationExposureScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public AllocationExposureScheduleResponse resumeExposureSchedule(UUID exposureScheduleId)
      throws ApiException {
    return resumeExposureScheduleWithHttpInfo(exposureScheduleId).getData();
  }

  /**
   * Resume a progressive rollout.
   *
   * <p>See {@link #resumeExposureScheduleWithHttpInfoAsync}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;AllocationExposureScheduleResponse&gt;
   */
  public CompletableFuture<AllocationExposureScheduleResponse> resumeExposureScheduleAsync(
      UUID exposureScheduleId) {
    return resumeExposureScheduleWithHttpInfoAsync(exposureScheduleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Resumes progression for a previously paused progressive rollout.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return ApiResponse&lt;AllocationExposureScheduleResponse&gt;
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
  public ApiResponse<AllocationExposureScheduleResponse> resumeExposureScheduleWithHttpInfo(
      UUID exposureScheduleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureScheduleId' when calling"
              + " resumeExposureSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/resume"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.resumeExposureSchedule",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Resume a progressive rollout.
   *
   * <p>See {@link #resumeExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AllocationExposureScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>>
      resumeExposureScheduleWithHttpInfoAsync(UUID exposureScheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureScheduleId' when calling"
                  + " resumeExposureSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/resume"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.resumeExposureSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Start a progressive rollout.
   *
   * <p>See {@link #startExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return AllocationExposureScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public AllocationExposureScheduleResponse startExposureSchedule(UUID exposureScheduleId)
      throws ApiException {
    return startExposureScheduleWithHttpInfo(exposureScheduleId).getData();
  }

  /**
   * Start a progressive rollout.
   *
   * <p>See {@link #startExposureScheduleWithHttpInfoAsync}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;AllocationExposureScheduleResponse&gt;
   */
  public CompletableFuture<AllocationExposureScheduleResponse> startExposureScheduleAsync(
      UUID exposureScheduleId) {
    return startExposureScheduleWithHttpInfoAsync(exposureScheduleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Starts a progressive rollout and begins progression.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return ApiResponse&lt;AllocationExposureScheduleResponse&gt;
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
  public ApiResponse<AllocationExposureScheduleResponse> startExposureScheduleWithHttpInfo(
      UUID exposureScheduleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureScheduleId' when calling startExposureSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/start"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.startExposureSchedule",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Start a progressive rollout.
   *
   * <p>See {@link #startExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AllocationExposureScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>>
      startExposureScheduleWithHttpInfoAsync(UUID exposureScheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureScheduleId' when calling"
                  + " startExposureSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/start"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.startExposureSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Stop a progressive rollout.
   *
   * <p>See {@link #stopExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return AllocationExposureScheduleResponse
   * @throws ApiException if fails to make API call
   */
  public AllocationExposureScheduleResponse stopExposureSchedule(UUID exposureScheduleId)
      throws ApiException {
    return stopExposureScheduleWithHttpInfo(exposureScheduleId).getData();
  }

  /**
   * Stop a progressive rollout.
   *
   * <p>See {@link #stopExposureScheduleWithHttpInfoAsync}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;AllocationExposureScheduleResponse&gt;
   */
  public CompletableFuture<AllocationExposureScheduleResponse> stopExposureScheduleAsync(
      UUID exposureScheduleId) {
    return stopExposureScheduleWithHttpInfoAsync(exposureScheduleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Stops a progressive rollout and marks it as aborted.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return ApiResponse&lt;AllocationExposureScheduleResponse&gt;
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
  public ApiResponse<AllocationExposureScheduleResponse> stopExposureScheduleWithHttpInfo(
      UUID exposureScheduleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureScheduleId' when calling stopExposureSchedule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/stop"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.stopExposureSchedule",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Stop a progressive rollout.
   *
   * <p>See {@link #stopExposureScheduleWithHttpInfo}.
   *
   * @param exposureScheduleId The ID of the exposure schedule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AllocationExposureScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>>
      stopExposureScheduleWithHttpInfoAsync(UUID exposureScheduleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureScheduleId' is set
    if (exposureScheduleId == null) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureScheduleId' when calling"
                  + " stopExposureSchedule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/exposure-schedules/{exposure_schedule_id}/stop"
            .replaceAll(
                "\\{" + "exposure_schedule_id" + "\\}",
                apiClient.escapeString(exposureScheduleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.stopExposureSchedule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AllocationExposureScheduleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AllocationExposureScheduleResponse>() {});
  }

  /**
   * Unarchive a feature flag.
   *
   * <p>See {@link #unarchiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse unarchiveFeatureFlag(UUID featureFlagId) throws ApiException {
    return unarchiveFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
   * Unarchive a feature flag.
   *
   * <p>See {@link #unarchiveFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> unarchiveFeatureFlagAsync(UUID featureFlagId) {
    return unarchiveFeatureFlagWithHttpInfoAsync(featureFlagId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unarchives a previously archived feature flag, making it visible in the main list again.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion. The change is not applied until the suggestion is approved and applied. Use the
   * returned suggestion ID with <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>,
   * <code>RejectFlagSuggestion</code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - The flag is not archived or a conflicting suggestion is pending. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> unarchiveFeatureFlagWithHttpInfo(UUID featureFlagId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'featureFlagId' when calling unarchiveFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/unarchive"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.unarchiveFeatureFlag",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Unarchive a feature flag.
   *
   * <p>See {@link #unarchiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> unarchiveFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling unarchiveFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/unarchive"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.unarchiveFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /** Manage optional parameters to updateAllocationsForFeatureFlagInEnvironment. */
  public static class UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters {
    private String defaultVariantKey;

    /**
     * Set defaultVariantKey.
     *
     * @param defaultVariantKey The key of the default variant to set. When approval is required,
     *     omit this parameter and submit a <code>DEFAULT_VARIANT</code> suggestion separately.
     *     (optional)
     * @return UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters
     */
    public UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters defaultVariantKey(
        String defaultVariantKey) {
      this.defaultVariantKey = defaultVariantKey;
      return this;
    }
  }

  /**
   * Update targeting rules for a flag.
   *
   * <p>See {@link #updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return ListAllocationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAllocationsResponse updateAllocationsForFeatureFlagInEnvironment(
      UUID featureFlagId, UUID environmentId, OverwriteAllocationsRequest body)
      throws ApiException {
    return updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo(
            featureFlagId,
            environmentId,
            body,
            new UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters())
        .getData();
  }

  /**
   * Update targeting rules for a flag.
   *
   * <p>See {@link #updateAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ListAllocationsResponse&gt;
   */
  public CompletableFuture<ListAllocationsResponse>
      updateAllocationsForFeatureFlagInEnvironmentAsync(
          UUID featureFlagId, UUID environmentId, OverwriteAllocationsRequest body) {
    return updateAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync(
            featureFlagId,
            environmentId,
            body,
            new UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update targeting rules for a flag.
   *
   * <p>See {@link #updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ListAllocationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAllocationsResponse updateAllocationsForFeatureFlagInEnvironment(
      UUID featureFlagId,
      UUID environmentId,
      OverwriteAllocationsRequest body,
      UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters parameters)
      throws ApiException {
    return updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo(
            featureFlagId, environmentId, body, parameters)
        .getData();
  }

  /**
   * Update targeting rules for a flag.
   *
   * <p>See {@link #updateAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAllocationsResponse&gt;
   */
  public CompletableFuture<ListAllocationsResponse>
      updateAllocationsForFeatureFlagInEnvironmentAsync(
          UUID featureFlagId,
          UUID environmentId,
          OverwriteAllocationsRequest body,
          UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters parameters) {
    return updateAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync(
            featureFlagId, environmentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates targeting rules (allocations) for a feature flag in an environment. This operation
   * replaces the existing allocation set with the request payload.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion. The change is not applied until the suggestion is approved and applied. Use the
   * returned suggestion ID with <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>,
   * <code>RejectFlagSuggestion</code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * <p>When approval is required, combining allocation replacement with <code>default_variant_key
   * </code> returns <code>400 Bad Request</code>. Omit that parameter and submit the default
   * variant change separately with <code>CreateFlagSuggestion</code> using the <code>
   * DEFAULT_VARIANT</code> property and the variant ID.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAllocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A conflicting suggestion is pending or the allocation update conflicts with the current configuration. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListAllocationsResponse>
      updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo(
          UUID featureFlagId,
          UUID environmentId,
          OverwriteAllocationsRequest body,
          UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " updateAllocationsForFeatureFlagInEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " updateAllocationsForFeatureFlagInEnvironment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateAllocationsForFeatureFlagInEnvironment");
    }
    String defaultVariantKey = parameters.defaultVariantKey;
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/allocations"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "default_variant_key", defaultVariantKey));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateAllocationsForFeatureFlagInEnvironment",
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
        new GenericType<ListAllocationsResponse>() {});
  }

  /**
   * Update targeting rules for a flag.
   *
   * <p>See {@link #updateAllocationsForFeatureFlagInEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAllocationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAllocationsResponse>>
      updateAllocationsForFeatureFlagInEnvironmentWithHttpInfoAsync(
          UUID featureFlagId,
          UUID environmentId,
          OverwriteAllocationsRequest body,
          UpdateAllocationsForFeatureFlagInEnvironmentOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<ListAllocationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " updateAllocationsForFeatureFlagInEnvironment"));
      return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<ListAllocationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " updateAllocationsForFeatureFlagInEnvironment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ListAllocationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateAllocationsForFeatureFlagInEnvironment"));
      return result;
    }
    String defaultVariantKey = parameters.defaultVariantKey;
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/allocations"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "default_variant_key", defaultVariantKey));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateAllocationsForFeatureFlagInEnvironment",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAllocationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListAllocationsResponse>() {});
  }

  /**
   * Update a feature flag.
   *
   * <p>See {@link #updateFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse updateFeatureFlag(UUID featureFlagId, UpdateFeatureFlagRequest body)
      throws ApiException {
    return updateFeatureFlagWithHttpInfo(featureFlagId, body).getData();
  }

  /**
   * Update a feature flag.
   *
   * <p>See {@link #updateFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> updateFeatureFlagAsync(
      UUID featureFlagId, UpdateFeatureFlagRequest body) {
    return updateFeatureFlagWithHttpInfoAsync(featureFlagId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing feature flag's metadata, including its name, description, distribution
   * channel, and tags. Does not modify targeting rules or allocations.
   *
   * <p>To change the owning team, update <code>tags</code> and include a tag of the form <code>
   * team:&lt;team-handle&gt;</code> in the array. <code>tags</code> is a full replacement of the
   * existing tag set (including any <code>team:</code> tag), so include every tag you want to keep,
   * not just the ones you're adding.
   *
   * <p>To change the lifecycle, set <code>staleness_status</code> to <code>ACTIVE</code>
   * (temporary) or <code>PERMANENT</code>. Either value clears any snooze; omit it to keep the
   * lifecycle. Send <code>staleness_status</code> in a separate request from <code>
   * distribution_channel</code>. Do not copy the top-level <code>staleness_status</code> from a
   * response into the request: that legacy response field is always <code>ACTIVE</code>, so copying
   * it makes a <code>PERMANENT</code> flag temporary.
   *
   * <p>When backend approvals are enabled and a distribution channel change requires approval,
   * callers without the Feature Flag Approvals Override permission receive <code>201 Created</code>
   * with a suggestion instead of an updated flag. No fields in the request are applied. The
   * suggestion contains only the distribution channel change. To update other fields, such as name,
   * description, JSON schema, and tags, send a separate request without <code>distribution_channel
   * </code>.
   *
   * <p>While backend approvals are enabled, a request that includes <code>distribution_channel
   * </code> returns <code>409 Conflict</code> if a distribution channel suggestion for the flag is
   * pending, or approved but not yet applied. No fields are applied, including for callers with
   * override permission.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - A distribution channel suggestion was created because approval is required. No flag fields were updated. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A feature flag with this name already exists, a distribution channel suggestion is pending, or a pending experiment request or running approved experiment uses this flag. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> updateFeatureFlagWithHttpInfo(
      UUID featureFlagId, UpdateFeatureFlagRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'featureFlagId' when calling updateFeatureFlag");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateFeatureFlag",
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Update a feature flag.
   *
   * <p>See {@link #updateFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> updateFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId, UpdateFeatureFlagRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling updateFeatureFlag"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateFeatureFlag",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Set the approval requirement for a feature flag.
   *
   * <p>See {@link #updateFeatureFlagApprovalsWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return FeatureFlagResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureFlagResponse updateFeatureFlagApprovals(
      UUID featureFlagId, UpdateFeatureFlagApprovalsRequest body) throws ApiException {
    return updateFeatureFlagApprovalsWithHttpInfo(featureFlagId, body).getData();
  }

  /**
   * Set the approval requirement for a feature flag.
   *
   * <p>See {@link #updateFeatureFlagApprovalsWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;FeatureFlagResponse&gt;
   */
  public CompletableFuture<FeatureFlagResponse> updateFeatureFlagApprovalsAsync(
      UUID featureFlagId, UpdateFeatureFlagApprovalsRequest body) {
    return updateFeatureFlagApprovalsWithHttpInfoAsync(featureFlagId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enables or disables the approval requirement for a feature flag. Requires the Feature Flag
   * Write permission and contributor or editor access to the flag. Disabling approvals also
   * requires the Feature Flag Approvals Override permission, even if approvals are already
   * disabled. This operation updates the setting directly and does not create a suggestion.
   * Changing the setting returns <code>409 Conflict</code> when a pending experiment request or a
   * running approved experiment uses the flag.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - Invalid request parameters or body. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A pending experiment request or a running approved experiment uses this flag. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> updateFeatureFlagApprovalsWithHttpInfo(
      UUID featureFlagId, UpdateFeatureFlagApprovalsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling updateFeatureFlagApprovals");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateFeatureFlagApprovals");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/require-approval"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateFeatureFlagApprovals",
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Set the approval requirement for a feature flag.
   *
   * <p>See {@link #updateFeatureFlagApprovalsWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>>
      updateFeatureFlagApprovalsWithHttpInfoAsync(
          UUID featureFlagId, UpdateFeatureFlagApprovalsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " updateFeatureFlagApprovals"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateFeatureFlagApprovals"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/require-approval"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}",
                apiClient.escapeString(featureFlagId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateFeatureFlagApprovals",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
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
        new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Update an environment.
   *
   * <p>See {@link #updateFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return EnvironmentResponse
   * @throws ApiException if fails to make API call
   */
  public EnvironmentResponse updateFeatureFlagsEnvironment(
      UUID environmentId, UpdateEnvironmentRequest body) throws ApiException {
    return updateFeatureFlagsEnvironmentWithHttpInfo(environmentId, body).getData();
  }

  /**
   * Update an environment.
   *
   * <p>See {@link #updateFeatureFlagsEnvironmentWithHttpInfoAsync}.
   *
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;EnvironmentResponse&gt;
   */
  public CompletableFuture<EnvironmentResponse> updateFeatureFlagsEnvironmentAsync(
      UUID environmentId, UpdateEnvironmentRequest body) {
    return updateFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing environment's metadata such as name and description.
   *
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
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
  public ApiResponse<EnvironmentResponse> updateFeatureFlagsEnvironmentWithHttpInfo(
      UUID environmentId, UpdateEnvironmentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'environmentId' when calling"
              + " updateFeatureFlagsEnvironment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateFeatureFlagsEnvironment",
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Update an environment.
   *
   * <p>See {@link #updateFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>>
      updateFeatureFlagsEnvironmentWithHttpInfoAsync(
          UUID environmentId, UpdateEnvironmentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'environmentId' when calling"
                  + " updateFeatureFlagsEnvironment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateFeatureFlagsEnvironment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/environments/{environment_id}"
            .replaceAll(
                "\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateFeatureFlagsEnvironment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Patch a saved filter.
   *
   * <p>See {@link #updateSavedFilterAttributesWithHttpInfo}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @param body (required)
   * @return SavedFilterResponse
   * @throws ApiException if fails to make API call
   */
  public SavedFilterResponse updateSavedFilterAttributes(
      UUID savedFilterId, PatchSavedFilterRequest body) throws ApiException {
    return updateSavedFilterAttributesWithHttpInfo(savedFilterId, body).getData();
  }

  /**
   * Patch a saved filter.
   *
   * <p>See {@link #updateSavedFilterAttributesWithHttpInfoAsync}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SavedFilterResponse&gt;
   */
  public CompletableFuture<SavedFilterResponse> updateSavedFilterAttributesAsync(
      UUID savedFilterId, PatchSavedFilterRequest body) {
    return updateSavedFilterAttributesWithHttpInfoAsync(savedFilterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially updates a saved filter. Supports both <code>LIST</code> and <code>RULES</code>
   * filters. Supply at least one of <code>name</code>, <code>description</code>, or <code>
   * targeting_rules</code>. Omitted or null fields are preserved. Supplying <code>targeting_rules
   * </code> replaces the entire collection and propagates changes to every feature flag that
   * references the saved filter. Metadata-only updates do not require edit permission or approval
   * on those feature flags. Rule updates require edit permission on all consumer flags and are
   * rejected when approval is required, unless the caller has the <code>
   * feature_flag_approvals_override</code> permission. The optional <code>last_updated_at</code>
   * field detects stale updates. It does not set the update time.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @param body (required)
   * @return ApiResponse&lt;SavedFilterResponse&gt;
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
  public ApiResponse<SavedFilterResponse> updateSavedFilterAttributesWithHttpInfo(
      UUID savedFilterId, PatchSavedFilterRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'savedFilterId' is set
    if (savedFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'savedFilterId' when calling"
              + " updateSavedFilterAttributes");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSavedFilterAttributes");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/saved-filters/{saved_filter_id}"
            .replaceAll(
                "\\{" + "saved_filter_id" + "\\}",
                apiClient.escapeString(savedFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateSavedFilterAttributes",
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
        new GenericType<SavedFilterResponse>() {});
  }

  /**
   * Patch a saved filter.
   *
   * <p>See {@link #updateSavedFilterAttributesWithHttpInfo}.
   *
   * @param savedFilterId The ID of the saved filter. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SavedFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SavedFilterResponse>>
      updateSavedFilterAttributesWithHttpInfoAsync(
          UUID savedFilterId, PatchSavedFilterRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'savedFilterId' is set
    if (savedFilterId == null) {
      CompletableFuture<ApiResponse<SavedFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'savedFilterId' when calling"
                  + " updateSavedFilterAttributes"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SavedFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateSavedFilterAttributes"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/saved-filters/{saved_filter_id}"
            .replaceAll(
                "\\{" + "saved_filter_id" + "\\}",
                apiClient.escapeString(savedFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateSavedFilterAttributes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SavedFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<SavedFilterResponse>() {});
  }

  /**
   * Update a variant.
   *
   * <p>See {@link #updateVariantForFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVariantForFeatureFlag(
      UUID featureFlagId, UUID variantId, UpdateVariantRequest body) throws ApiException {
    updateVariantForFeatureFlagWithHttpInfo(featureFlagId, variantId, body);
  }

  /**
   * Update a variant.
   *
   * <p>See {@link #updateVariantForFeatureFlagWithHttpInfoAsync}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateVariantForFeatureFlagAsync(
      UUID featureFlagId, UUID variantId, UpdateVariantRequest body) {
    return updateVariantForFeatureFlagWithHttpInfoAsync(featureFlagId, variantId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the name and value of an existing variant on a feature flag.
   *
   * <p>When backend approvals are enabled and this change requires approval, callers without the
   * Feature Flag Approvals Override permission receive <code>201 Created</code> with a persisted
   * suggestion, in the same format as the <code>GetFlagSuggestion</code> response. The change is
   * not applied until the suggestion is approved and applied. Use the returned suggestion ID with
   * <code>GetFlagSuggestion</code>, <code>ApproveFlagSuggestion</code>, <code>RejectFlagSuggestion
   * </code>, or <code>DeleteFlagSuggestion</code>.
   *
   * <p>A conflicting suggestion that is pending, or approved but not yet applied, returns <code>
   * 409 Conflict</code> without applying the change, including for callers with override permission
   * or when approval is no longer required.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created - Approval is required. A suggestion was created and the change has not been applied. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - A pending suggestion already exists for this property. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateVariantForFeatureFlagWithHttpInfo(
      UUID featureFlagId, UUID variantId, UpdateVariantRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureFlagId' when calling"
              + " updateVariantForFeatureFlag");
    }

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'variantId' when calling updateVariantForFeatureFlag");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateVariantForFeatureFlag");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants/{variant_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FeatureFlagsApi.updateVariantForFeatureFlag",
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
   * Update a variant.
   *
   * <p>See {@link #updateVariantForFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param variantId The ID of the variant. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateVariantForFeatureFlagWithHttpInfoAsync(
      UUID featureFlagId, UUID variantId, UpdateVariantRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureFlagId' when calling"
                  + " updateVariantForFeatureFlag"));
      return result;
    }

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'variantId' when calling"
                  + " updateVariantForFeatureFlag"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateVariantForFeatureFlag"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/feature-flags/{feature_flag_id}/variants/{variant_id}"
            .replaceAll(
                "\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FeatureFlagsApi.updateVariantForFeatureFlag",
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
}
