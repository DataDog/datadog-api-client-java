package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OwnershipEvidenceResponse;
import com.datadog.api.client.v2.model.OwnershipFeedbackRequest;
import com.datadog.api.client.v2.model.OwnershipFeedbackResponse;
import com.datadog.api.client.v2.model.OwnershipHistoryResponse;
import com.datadog.api.client.v2.model.OwnershipInferenceListResponse;
import com.datadog.api.client.v2.model.OwnershipInferenceResponse;
import com.datadog.api.client.v2.model.OwnershipOwnerType;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmOwnershipApi {
  private ApiClient apiClient;

  public CsmOwnershipApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CsmOwnershipApi(ApiClient apiClient) {
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
   * Submit feedback on an ownership inference.
   *
   * <p>See {@link #createOwnershipFeedbackWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource that the feedback applies to. (required)
   * @param ownerType The type of owner that the feedback applies to. (required)
   * @param body (required)
   * @return OwnershipFeedbackResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipFeedbackResponse createOwnershipFeedback(
      String resourceId, OwnershipOwnerType ownerType, OwnershipFeedbackRequest body)
      throws ApiException {
    return createOwnershipFeedbackWithHttpInfo(resourceId, ownerType, body).getData();
  }

  /**
   * Submit feedback on an ownership inference.
   *
   * <p>See {@link #createOwnershipFeedbackWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource that the feedback applies to. (required)
   * @param ownerType The type of owner that the feedback applies to. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OwnershipFeedbackResponse&gt;
   */
  public CompletableFuture<OwnershipFeedbackResponse> createOwnershipFeedbackAsync(
      String resourceId, OwnershipOwnerType ownerType, OwnershipFeedbackRequest body) {
    return createOwnershipFeedbackWithHttpInfoAsync(resourceId, ownerType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit feedback on the current ownership inference for a resource and owner type. Valid actions
   * are <code>confirm</code>, <code>reject</code>, <code>correct</code>, and <code>persist</code>.
   *
   * <p>The request must include the current inference <code>checksum</code> in <code>
   * inference_checksum</code>. If the checksum does not match the current inference state, the
   * endpoint returns <code>409 Conflict</code>.
   *
   * <p>When <code>action</code> is <code>correct</code>, <code>corrected_owner_handle</code> and
   * <code>corrected_owner_type</code> are required.
   *
   * @param resourceId The identifier of the resource that the feedback applies to. (required)
   * @param ownerType The type of owner that the feedback applies to. (required)
   * @param body (required)
   * @return ApiResponse&lt;OwnershipFeedbackResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipFeedbackResponse> createOwnershipFeedbackWithHttpInfo(
      String resourceId, OwnershipOwnerType ownerType, OwnershipFeedbackRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOwnershipFeedback";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling createOwnershipFeedback");
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ownerType' when calling createOwnershipFeedback");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOwnershipFeedback");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/feedback"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.createOwnershipFeedback",
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
        new GenericType<OwnershipFeedbackResponse>() {});
  }

  /**
   * Submit feedback on an ownership inference.
   *
   * <p>See {@link #createOwnershipFeedbackWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource that the feedback applies to. (required)
   * @param ownerType The type of owner that the feedback applies to. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipFeedbackResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipFeedbackResponse>>
      createOwnershipFeedbackWithHttpInfoAsync(
          String resourceId, OwnershipOwnerType ownerType, OwnershipFeedbackRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOwnershipFeedback";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipFeedbackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipFeedbackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling createOwnershipFeedback"));
      return result;
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      CompletableFuture<ApiResponse<OwnershipFeedbackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ownerType' when calling createOwnershipFeedback"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OwnershipFeedbackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOwnershipFeedback"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/feedback"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.createOwnershipFeedback",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipFeedbackResponse>> result = new CompletableFuture<>();
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
        new GenericType<OwnershipFeedbackResponse>() {});
  }

  /** Manage optional parameters to getOwnershipEvidence. */
  public static class GetOwnershipEvidenceOptionalParameters {
    private String ifNoneMatch;

    /**
     * Set ifNoneMatch.
     *
     * @param ifNoneMatch A previously returned weak <code>ETag</code> value. When supplied and the
     *     evidence has not changed, the endpoint returns <code>304 Not Modified</code>. (optional)
     * @return GetOwnershipEvidenceOptionalParameters
     */
    public GetOwnershipEvidenceOptionalParameters ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  /**
   * Get the evidence for an ownership inference.
   *
   * <p>See {@link #getOwnershipEvidenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @return OwnershipEvidenceResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipEvidenceResponse getOwnershipEvidence(
      String resourceId, OwnershipOwnerType ownerType) throws ApiException {
    return getOwnershipEvidenceWithHttpInfo(
            resourceId, ownerType, new GetOwnershipEvidenceOptionalParameters())
        .getData();
  }

  /**
   * Get the evidence for an ownership inference.
   *
   * <p>See {@link #getOwnershipEvidenceWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @return CompletableFuture&lt;OwnershipEvidenceResponse&gt;
   */
  public CompletableFuture<OwnershipEvidenceResponse> getOwnershipEvidenceAsync(
      String resourceId, OwnershipOwnerType ownerType) {
    return getOwnershipEvidenceWithHttpInfoAsync(
            resourceId, ownerType, new GetOwnershipEvidenceOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the evidence for an ownership inference.
   *
   * <p>See {@link #getOwnershipEvidenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @param parameters Optional parameters for the request.
   * @return OwnershipEvidenceResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipEvidenceResponse getOwnershipEvidence(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipEvidenceOptionalParameters parameters)
      throws ApiException {
    return getOwnershipEvidenceWithHttpInfo(resourceId, ownerType, parameters).getData();
  }

  /**
   * Get the evidence for an ownership inference.
   *
   * <p>See {@link #getOwnershipEvidenceWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OwnershipEvidenceResponse&gt;
   */
  public CompletableFuture<OwnershipEvidenceResponse> getOwnershipEvidenceAsync(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipEvidenceOptionalParameters parameters) {
    return getOwnershipEvidenceWithHttpInfoAsync(resourceId, ownerType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the evidence versions backing the current ownership inference for a resource and owner
   * type.
   *
   * <p>This endpoint supports weak ETag caching. Pass the previously returned <code>ETag</code>
   * value in the <code>If-None-Match</code> request header to receive a <code>304 Not Modified
   * </code> response when the evidence has not changed.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OwnershipEvidenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipEvidenceResponse> getOwnershipEvidenceWithHttpInfo(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipEvidenceOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOwnershipEvidence";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling getOwnershipEvidence");
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ownerType' when calling getOwnershipEvidence");
    }
    String ifNoneMatch = parameters.ifNoneMatch;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/evidence"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (ifNoneMatch != null) {
      localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.getOwnershipEvidence",
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
        new GenericType<OwnershipEvidenceResponse>() {});
  }

  /**
   * Get the evidence for an ownership inference.
   *
   * <p>See {@link #getOwnershipEvidenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve evidence for. (required)
   * @param ownerType The owner type of the inference to retrieve evidence for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipEvidenceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipEvidenceResponse>>
      getOwnershipEvidenceWithHttpInfoAsync(
          String resourceId,
          OwnershipOwnerType ownerType,
          GetOwnershipEvidenceOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getOwnershipEvidence";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipEvidenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipEvidenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling getOwnershipEvidence"));
      return result;
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      CompletableFuture<ApiResponse<OwnershipEvidenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ownerType' when calling getOwnershipEvidence"));
      return result;
    }
    String ifNoneMatch = parameters.ifNoneMatch;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/evidence"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (ifNoneMatch != null) {
      localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.getOwnershipEvidence",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipEvidenceResponse>> result = new CompletableFuture<>();
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
        new GenericType<OwnershipEvidenceResponse>() {});
  }

  /** Manage optional parameters to getOwnershipInference. */
  public static class GetOwnershipInferenceOptionalParameters {
    private String ifNoneMatch;

    /**
     * Set ifNoneMatch.
     *
     * @param ifNoneMatch A previously returned <code>ETag</code> value. When supplied and the
     *     resource has not changed, the endpoint returns <code>304 Not Modified</code>. (optional)
     * @return GetOwnershipInferenceOptionalParameters
     */
    public GetOwnershipInferenceOptionalParameters ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }
  }

  /**
   * Get an ownership inference by owner type.
   *
   * <p>See {@link #getOwnershipInferenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @return OwnershipInferenceResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipInferenceResponse getOwnershipInference(
      String resourceId, OwnershipOwnerType ownerType) throws ApiException {
    return getOwnershipInferenceWithHttpInfo(
            resourceId, ownerType, new GetOwnershipInferenceOptionalParameters())
        .getData();
  }

  /**
   * Get an ownership inference by owner type.
   *
   * <p>See {@link #getOwnershipInferenceWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @return CompletableFuture&lt;OwnershipInferenceResponse&gt;
   */
  public CompletableFuture<OwnershipInferenceResponse> getOwnershipInferenceAsync(
      String resourceId, OwnershipOwnerType ownerType) {
    return getOwnershipInferenceWithHttpInfoAsync(
            resourceId, ownerType, new GetOwnershipInferenceOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an ownership inference by owner type.
   *
   * <p>See {@link #getOwnershipInferenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return OwnershipInferenceResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipInferenceResponse getOwnershipInference(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipInferenceOptionalParameters parameters)
      throws ApiException {
    return getOwnershipInferenceWithHttpInfo(resourceId, ownerType, parameters).getData();
  }

  /**
   * Get an ownership inference by owner type.
   *
   * <p>See {@link #getOwnershipInferenceWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OwnershipInferenceResponse&gt;
   */
  public CompletableFuture<OwnershipInferenceResponse> getOwnershipInferenceAsync(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipInferenceOptionalParameters parameters) {
    return getOwnershipInferenceWithHttpInfoAsync(resourceId, ownerType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the current ownership inference for a resource for a specific owner type.
   *
   * <p>This endpoint supports ETag-based caching. Pass the previously returned <code>ETag</code>
   * value in the <code>If-None-Match</code> request header to receive a <code>304 Not Modified
   * </code> response when the inference has not changed.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OwnershipInferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipInferenceResponse> getOwnershipInferenceWithHttpInfo(
      String resourceId,
      OwnershipOwnerType ownerType,
      GetOwnershipInferenceOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOwnershipInference";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling getOwnershipInference");
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ownerType' when calling getOwnershipInference");
    }
    String ifNoneMatch = parameters.ifNoneMatch;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (ifNoneMatch != null) {
      localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.getOwnershipInference",
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
        new GenericType<OwnershipInferenceResponse>() {});
  }

  /**
   * Get an ownership inference by owner type.
   *
   * <p>See {@link #getOwnershipInferenceWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve the ownership inference for.
   *     (required)
   * @param ownerType The owner type of the inference to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipInferenceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipInferenceResponse>>
      getOwnershipInferenceWithHttpInfoAsync(
          String resourceId,
          OwnershipOwnerType ownerType,
          GetOwnershipInferenceOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getOwnershipInference";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipInferenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipInferenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling getOwnershipInference"));
      return result;
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      CompletableFuture<ApiResponse<OwnershipInferenceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ownerType' when calling getOwnershipInference"));
      return result;
    }
    String ifNoneMatch = parameters.ifNoneMatch;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (ifNoneMatch != null) {
      localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.getOwnershipInference",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipInferenceResponse>> result = new CompletableFuture<>();
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
        new GenericType<OwnershipInferenceResponse>() {});
  }

  /** Manage optional parameters to listOwnershipHistory. */
  public static class ListOwnershipHistoryOptionalParameters {
    private String cursor;
    private Integer limit;

    /**
     * Set cursor.
     *
     * @param cursor An opaque, base64-encoded cursor token returned by a previous call in <code>
     *     pagination.next_cursor</code>. Omit to fetch the first page. (optional)
     * @return ListOwnershipHistoryOptionalParameters
     */
    public ListOwnershipHistoryOptionalParameters cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit The maximum number of history entries to return per page. (optional, default to
     *     25)
     * @return ListOwnershipHistoryOptionalParameters
     */
    public ListOwnershipHistoryOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * List ownership inference history for a resource.
   *
   * <p>See {@link #listOwnershipHistoryWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @return OwnershipHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipHistoryResponse listOwnershipHistory(String resourceId) throws ApiException {
    return listOwnershipHistoryWithHttpInfo(
            resourceId, new ListOwnershipHistoryOptionalParameters())
        .getData();
  }

  /**
   * List ownership inference history for a resource.
   *
   * <p>See {@link #listOwnershipHistoryWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @return CompletableFuture&lt;OwnershipHistoryResponse&gt;
   */
  public CompletableFuture<OwnershipHistoryResponse> listOwnershipHistoryAsync(String resourceId) {
    return listOwnershipHistoryWithHttpInfoAsync(
            resourceId, new ListOwnershipHistoryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List ownership inference history for a resource.
   *
   * <p>See {@link #listOwnershipHistoryWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param parameters Optional parameters for the request.
   * @return OwnershipHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipHistoryResponse listOwnershipHistory(
      String resourceId, ListOwnershipHistoryOptionalParameters parameters) throws ApiException {
    return listOwnershipHistoryWithHttpInfo(resourceId, parameters).getData();
  }

  /**
   * List ownership inference history for a resource.
   *
   * <p>See {@link #listOwnershipHistoryWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OwnershipHistoryResponse&gt;
   */
  public CompletableFuture<OwnershipHistoryResponse> listOwnershipHistoryAsync(
      String resourceId, ListOwnershipHistoryOptionalParameters parameters) {
    return listOwnershipHistoryWithHttpInfoAsync(resourceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List inference history entries for a resource across all owner types, ordered from most recent
   * to oldest. Uses cursor-based pagination.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OwnershipHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipHistoryResponse> listOwnershipHistoryWithHttpInfo(
      String resourceId, ListOwnershipHistoryOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipHistory";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling listOwnershipHistory");
    }
    String cursor = parameters.cursor;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/history"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.listOwnershipHistory",
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
        new GenericType<OwnershipHistoryResponse>() {});
  }

  /**
   * List ownership inference history for a resource.
   *
   * <p>See {@link #listOwnershipHistoryWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipHistoryResponse>>
      listOwnershipHistoryWithHttpInfoAsync(
          String resourceId, ListOwnershipHistoryOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipHistory";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling listOwnershipHistory"));
      return result;
    }
    String cursor = parameters.cursor;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/history"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.listOwnershipHistory",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
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
        new GenericType<OwnershipHistoryResponse>() {});
  }

  /** Manage optional parameters to listOwnershipHistoryByOwnerType. */
  public static class ListOwnershipHistoryByOwnerTypeOptionalParameters {
    private String cursor;
    private Integer limit;

    /**
     * Set cursor.
     *
     * @param cursor An opaque, base64-encoded cursor token returned by a previous call in <code>
     *     pagination.next_cursor</code>. Omit to fetch the first page. (optional)
     * @return ListOwnershipHistoryByOwnerTypeOptionalParameters
     */
    public ListOwnershipHistoryByOwnerTypeOptionalParameters cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit The maximum number of history entries to return per page. (optional, default to
     *     25)
     * @return ListOwnershipHistoryByOwnerTypeOptionalParameters
     */
    public ListOwnershipHistoryByOwnerTypeOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * List ownership history by owner type.
   *
   * <p>See {@link #listOwnershipHistoryByOwnerTypeWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @return OwnershipHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipHistoryResponse listOwnershipHistoryByOwnerType(
      String resourceId, OwnershipOwnerType ownerType) throws ApiException {
    return listOwnershipHistoryByOwnerTypeWithHttpInfo(
            resourceId, ownerType, new ListOwnershipHistoryByOwnerTypeOptionalParameters())
        .getData();
  }

  /**
   * List ownership history by owner type.
   *
   * <p>See {@link #listOwnershipHistoryByOwnerTypeWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @return CompletableFuture&lt;OwnershipHistoryResponse&gt;
   */
  public CompletableFuture<OwnershipHistoryResponse> listOwnershipHistoryByOwnerTypeAsync(
      String resourceId, OwnershipOwnerType ownerType) {
    return listOwnershipHistoryByOwnerTypeWithHttpInfoAsync(
            resourceId, ownerType, new ListOwnershipHistoryByOwnerTypeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List ownership history by owner type.
   *
   * <p>See {@link #listOwnershipHistoryByOwnerTypeWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @param parameters Optional parameters for the request.
   * @return OwnershipHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipHistoryResponse listOwnershipHistoryByOwnerType(
      String resourceId,
      OwnershipOwnerType ownerType,
      ListOwnershipHistoryByOwnerTypeOptionalParameters parameters)
      throws ApiException {
    return listOwnershipHistoryByOwnerTypeWithHttpInfo(resourceId, ownerType, parameters).getData();
  }

  /**
   * List ownership history by owner type.
   *
   * <p>See {@link #listOwnershipHistoryByOwnerTypeWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OwnershipHistoryResponse&gt;
   */
  public CompletableFuture<OwnershipHistoryResponse> listOwnershipHistoryByOwnerTypeAsync(
      String resourceId,
      OwnershipOwnerType ownerType,
      ListOwnershipHistoryByOwnerTypeOptionalParameters parameters) {
    return listOwnershipHistoryByOwnerTypeWithHttpInfoAsync(resourceId, ownerType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List inference history entries for a resource filtered by owner type, ordered from most recent
   * to oldest. Uses cursor-based pagination.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OwnershipHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipHistoryResponse> listOwnershipHistoryByOwnerTypeWithHttpInfo(
      String resourceId,
      OwnershipOwnerType ownerType,
      ListOwnershipHistoryByOwnerTypeOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipHistoryByOwnerType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'resourceId' when calling"
              + " listOwnershipHistoryByOwnerType");
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ownerType' when calling"
              + " listOwnershipHistoryByOwnerType");
    }
    String cursor = parameters.cursor;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/history"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.listOwnershipHistoryByOwnerType",
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
        new GenericType<OwnershipHistoryResponse>() {});
  }

  /**
   * List ownership history by owner type.
   *
   * <p>See {@link #listOwnershipHistoryByOwnerTypeWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve inference history for. (required)
   * @param ownerType The owner type to filter history by. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipHistoryResponse>>
      listOwnershipHistoryByOwnerTypeWithHttpInfoAsync(
          String resourceId,
          OwnershipOwnerType ownerType,
          ListOwnershipHistoryByOwnerTypeOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipHistoryByOwnerType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling"
                  + " listOwnershipHistoryByOwnerType"));
      return result;
    }

    // verify the required parameter 'ownerType' is set
    if (ownerType == null) {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ownerType' when calling"
                  + " listOwnershipHistoryByOwnerType"));
      return result;
    }
    String cursor = parameters.cursor;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}/{owner_type}/history"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()))
            .replaceAll("\\{" + "owner_type" + "\\}", apiClient.escapeString(ownerType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.listOwnershipHistoryByOwnerType",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipHistoryResponse>> result = new CompletableFuture<>();
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
        new GenericType<OwnershipHistoryResponse>() {});
  }

  /**
   * List ownership inferences for a resource.
   *
   * <p>See {@link #listOwnershipInferencesWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve ownership inferences for.
   *     (required)
   * @return OwnershipInferenceListResponse
   * @throws ApiException if fails to make API call
   */
  public OwnershipInferenceListResponse listOwnershipInferences(String resourceId)
      throws ApiException {
    return listOwnershipInferencesWithHttpInfo(resourceId).getData();
  }

  /**
   * List ownership inferences for a resource.
   *
   * <p>See {@link #listOwnershipInferencesWithHttpInfoAsync}.
   *
   * @param resourceId The identifier of the resource to retrieve ownership inferences for.
   *     (required)
   * @return CompletableFuture&lt;OwnershipInferenceListResponse&gt;
   */
  public CompletableFuture<OwnershipInferenceListResponse> listOwnershipInferencesAsync(
      String resourceId) {
    return listOwnershipInferencesWithHttpInfoAsync(resourceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all current ownership inferences for a resource, one per owner type (<code>user</code>,
   * <code>team</code>, <code>service</code>, <code>unknown</code>).
   *
   * @param resourceId The identifier of the resource to retrieve ownership inferences for.
   *     (required)
   * @return ApiResponse&lt;OwnershipInferenceListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OwnershipInferenceListResponse> listOwnershipInferencesWithHttpInfo(
      String resourceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipInferences";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling listOwnershipInferences");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmOwnershipApi.listOwnershipInferences",
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
        new GenericType<OwnershipInferenceListResponse>() {});
  }

  /**
   * List ownership inferences for a resource.
   *
   * <p>See {@link #listOwnershipInferencesWithHttpInfo}.
   *
   * @param resourceId The identifier of the resource to retrieve ownership inferences for.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OwnershipInferenceListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OwnershipInferenceListResponse>>
      listOwnershipInferencesWithHttpInfoAsync(String resourceId) {
    // Check if unstable operation is enabled
    String operationId = "listOwnershipInferences";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OwnershipInferenceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<OwnershipInferenceListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling listOwnershipInferences"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/csm/ownership/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmOwnershipApi.listOwnershipInferences",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OwnershipInferenceListResponse>> result =
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
        new GenericType<OwnershipInferenceListResponse>() {});
  }
}
