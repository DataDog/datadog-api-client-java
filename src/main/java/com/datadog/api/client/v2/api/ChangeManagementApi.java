package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ChangeRequestBranchCreateRequest;
import com.datadog.api.client.v2.model.ChangeRequestCreateRequest;
import com.datadog.api.client.v2.model.ChangeRequestDecisionUpdateRequest;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
import com.datadog.api.client.v2.model.ChangeRequestUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeManagementApi {
  private ApiClient apiClient;

  public ChangeManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ChangeManagementApi(ApiClient apiClient) {
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
   * Create a change request.
   *
   * <p>See {@link #createChangeRequestWithHttpInfo}.
   *
   * @param body Change request payload. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse createChangeRequest(ChangeRequestCreateRequest body)
      throws ApiException {
    return createChangeRequestWithHttpInfo(body).getData();
  }

  /**
   * Create a change request.
   *
   * <p>See {@link #createChangeRequestWithHttpInfoAsync}.
   *
   * @param body Change request payload. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> createChangeRequestAsync(
      ChangeRequestCreateRequest body) {
    return createChangeRequestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new change request.
   *
   * @param body Change request payload. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> createChangeRequestWithHttpInfo(
      ChangeRequestCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createChangeRequest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/change-management/change-request";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.createChangeRequest",
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Create a change request.
   *
   * <p>See {@link #createChangeRequestWithHttpInfo}.
   *
   * @param body Change request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>> createChangeRequestWithHttpInfoAsync(
      ChangeRequestCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createChangeRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/change-management/change-request";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.createChangeRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Create a change request branch.
   *
   * <p>See {@link #createChangeRequestBranchWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Branch creation payload. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse createChangeRequestBranch(
      String changeRequestId, ChangeRequestBranchCreateRequest body) throws ApiException {
    return createChangeRequestBranchWithHttpInfo(changeRequestId, body).getData();
  }

  /**
   * Create a change request branch.
   *
   * <p>See {@link #createChangeRequestBranchWithHttpInfoAsync}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Branch creation payload. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> createChangeRequestBranchAsync(
      String changeRequestId, ChangeRequestBranchCreateRequest body) {
    return createChangeRequestBranchWithHttpInfoAsync(changeRequestId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new branch in a repository for a change request.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Branch creation payload. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> createChangeRequestBranchWithHttpInfo(
      String changeRequestId, ChangeRequestBranchCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createChangeRequestBranch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'changeRequestId' when calling"
              + " createChangeRequestBranch");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createChangeRequestBranch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/branch"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.createChangeRequestBranch",
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Create a change request branch.
   *
   * <p>See {@link #createChangeRequestBranchWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Branch creation payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>>
      createChangeRequestBranchWithHttpInfoAsync(
          String changeRequestId, ChangeRequestBranchCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createChangeRequestBranch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'changeRequestId' when calling"
                  + " createChangeRequestBranch"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createChangeRequestBranch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/branch"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.createChangeRequestBranch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Delete a change request decision.
   *
   * <p>See {@link #deleteChangeRequestDecisionWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse deleteChangeRequestDecision(
      String changeRequestId, String decisionId) throws ApiException {
    return deleteChangeRequestDecisionWithHttpInfo(changeRequestId, decisionId).getData();
  }

  /**
   * Delete a change request decision.
   *
   * <p>See {@link #deleteChangeRequestDecisionWithHttpInfoAsync}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> deleteChangeRequestDecisionAsync(
      String changeRequestId, String decisionId) {
    return deleteChangeRequestDecisionWithHttpInfoAsync(changeRequestId, decisionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a decision from a change request.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> deleteChangeRequestDecisionWithHttpInfo(
      String changeRequestId, String decisionId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteChangeRequestDecision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'changeRequestId' when calling"
              + " deleteChangeRequestDecision");
    }

    // verify the required parameter 'decisionId' is set
    if (decisionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'decisionId' when calling deleteChangeRequestDecision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/decisions/{decision_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()))
            .replaceAll(
                "\\{" + "decision_id" + "\\}", apiClient.escapeString(decisionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.deleteChangeRequestDecision",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Delete a change request decision.
   *
   * <p>See {@link #deleteChangeRequestDecisionWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>>
      deleteChangeRequestDecisionWithHttpInfoAsync(String changeRequestId, String decisionId) {
    // Check if unstable operation is enabled
    String operationId = "deleteChangeRequestDecision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'changeRequestId' when calling"
                  + " deleteChangeRequestDecision"));
      return result;
    }

    // verify the required parameter 'decisionId' is set
    if (decisionId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'decisionId' when calling"
                  + " deleteChangeRequestDecision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/decisions/{decision_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()))
            .replaceAll(
                "\\{" + "decision_id" + "\\}", apiClient.escapeString(decisionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.deleteChangeRequestDecision",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Get a change request.
   *
   * <p>See {@link #getChangeRequestWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse getChangeRequest(String changeRequestId) throws ApiException {
    return getChangeRequestWithHttpInfo(changeRequestId).getData();
  }

  /**
   * Get a change request.
   *
   * <p>See {@link #getChangeRequestWithHttpInfoAsync}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> getChangeRequestAsync(String changeRequestId) {
    return getChangeRequestWithHttpInfoAsync(changeRequestId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a change request by its ID.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> getChangeRequestWithHttpInfo(String changeRequestId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'changeRequestId' when calling getChangeRequest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.getChangeRequest",
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Get a change request.
   *
   * <p>See {@link #getChangeRequestWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>> getChangeRequestWithHttpInfoAsync(
      String changeRequestId) {
    // Check if unstable operation is enabled
    String operationId = "getChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'changeRequestId' when calling getChangeRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.getChangeRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Update a change request.
   *
   * <p>See {@link #updateChangeRequestWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Change request update payload. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse updateChangeRequest(
      String changeRequestId, ChangeRequestUpdateRequest body) throws ApiException {
    return updateChangeRequestWithHttpInfo(changeRequestId, body).getData();
  }

  /**
   * Update a change request.
   *
   * <p>See {@link #updateChangeRequestWithHttpInfoAsync}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Change request update payload. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> updateChangeRequestAsync(
      String changeRequestId, ChangeRequestUpdateRequest body) {
    return updateChangeRequestWithHttpInfoAsync(changeRequestId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the properties of a change request.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Change request update payload. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> updateChangeRequestWithHttpInfo(
      String changeRequestId, ChangeRequestUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'changeRequestId' when calling updateChangeRequest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateChangeRequest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.updateChangeRequest",
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Update a change request.
   *
   * <p>See {@link #updateChangeRequestWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param body Change request update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>> updateChangeRequestWithHttpInfoAsync(
      String changeRequestId, ChangeRequestUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateChangeRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'changeRequestId' when calling updateChangeRequest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateChangeRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.updateChangeRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Update a change request decision.
   *
   * <p>See {@link #updateChangeRequestDecisionWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @param body Decision update payload. (required)
   * @return ChangeRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ChangeRequestResponse updateChangeRequestDecision(
      String changeRequestId, String decisionId, ChangeRequestDecisionUpdateRequest body)
      throws ApiException {
    return updateChangeRequestDecisionWithHttpInfo(changeRequestId, decisionId, body).getData();
  }

  /**
   * Update a change request decision.
   *
   * <p>See {@link #updateChangeRequestDecisionWithHttpInfoAsync}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @param body Decision update payload. (required)
   * @return CompletableFuture&lt;ChangeRequestResponse&gt;
   */
  public CompletableFuture<ChangeRequestResponse> updateChangeRequestDecisionAsync(
      String changeRequestId, String decisionId, ChangeRequestDecisionUpdateRequest body) {
    return updateChangeRequestDecisionWithHttpInfoAsync(changeRequestId, decisionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a decision on a change request, such as approving or declining it.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @param body Decision update payload. (required)
   * @return ApiResponse&lt;ChangeRequestResponse&gt;
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
  public ApiResponse<ChangeRequestResponse> updateChangeRequestDecisionWithHttpInfo(
      String changeRequestId, String decisionId, ChangeRequestDecisionUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateChangeRequestDecision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'changeRequestId' when calling"
              + " updateChangeRequestDecision");
    }

    // verify the required parameter 'decisionId' is set
    if (decisionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'decisionId' when calling updateChangeRequestDecision");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateChangeRequestDecision");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/decisions/{decision_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()))
            .replaceAll(
                "\\{" + "decision_id" + "\\}", apiClient.escapeString(decisionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChangeManagementApi.updateChangeRequestDecision",
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
        new GenericType<ChangeRequestResponse>() {});
  }

  /**
   * Update a change request decision.
   *
   * <p>See {@link #updateChangeRequestDecisionWithHttpInfo}.
   *
   * @param changeRequestId The identifier of the change request. (required)
   * @param decisionId The identifier of the change request decision. (required)
   * @param body Decision update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChangeRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChangeRequestResponse>>
      updateChangeRequestDecisionWithHttpInfoAsync(
          String changeRequestId, String decisionId, ChangeRequestDecisionUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateChangeRequestDecision";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'changeRequestId' is set
    if (changeRequestId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'changeRequestId' when calling"
                  + " updateChangeRequestDecision"));
      return result;
    }

    // verify the required parameter 'decisionId' is set
    if (decisionId == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'decisionId' when calling"
                  + " updateChangeRequestDecision"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateChangeRequestDecision"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/change-management/change-request/{change_request_id}/decisions/{decision_id}"
            .replaceAll(
                "\\{" + "change_request_id" + "\\}",
                apiClient.escapeString(changeRequestId.toString()))
            .replaceAll(
                "\\{" + "decision_id" + "\\}", apiClient.escapeString(decisionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChangeManagementApi.updateChangeRequestDecision",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChangeRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<ChangeRequestResponse>() {});
  }
}
