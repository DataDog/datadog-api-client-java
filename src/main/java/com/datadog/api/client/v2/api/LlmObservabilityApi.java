package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.LLMObsAnnotatedInteractionsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueuesResponse;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigResponse;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsListResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsMutationResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetsResponse;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationQueueInteractionsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteExperimentsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteProjectsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentsResponse;
import com.datadog.api.client.v2.model.LLMObsProjectRequest;
import com.datadog.api.client.v2.model.LLMObsProjectResponse;
import com.datadog.api.client.v2.model.LLMObsProjectUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsProjectsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LlmObservabilityApi {
  private ApiClient apiClient;

  public LlmObservabilityApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LlmObservabilityApi(ApiClient apiClient) {
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
   * Create an LLM Observability annotation queue.
   *
   * <p>See {@link #createLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param body Create annotation queue payload. (required)
   * @return LLMObsAnnotationQueueResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueueResponse createLLMObsAnnotationQueue(
      LLMObsAnnotationQueueRequest body) throws ApiException {
    return createLLMObsAnnotationQueueWithHttpInfo(body).getData();
  }

  /**
   * Create an LLM Observability annotation queue.
   *
   * <p>See {@link #createLLMObsAnnotationQueueWithHttpInfoAsync}.
   *
   * @param body Create annotation queue payload. (required)
   * @return CompletableFuture&lt;LLMObsAnnotationQueueResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueueResponse> createLLMObsAnnotationQueueAsync(
      LLMObsAnnotationQueueRequest body) {
    return createLLMObsAnnotationQueueWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new annotation queue. Only <code>name</code>, <code>project_id</code>, and <code>
   * description</code> are accepted. Fields such as <code>created_by</code>, <code>owned_by</code>,
   * <code>created_at</code>, <code>modified_by</code>, and <code>modified_at</code> are inferred by
   * the backend.
   *
   * @param body Create annotation queue payload. (required)
   * @return ApiResponse&lt;LLMObsAnnotationQueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsAnnotationQueueResponse> createLLMObsAnnotationQueueWithHttpInfo(
      LLMObsAnnotationQueueRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsAnnotationQueue");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotation-queues";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsAnnotationQueue",
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
        new GenericType<LLMObsAnnotationQueueResponse>() {});
  }

  /**
   * Create an LLM Observability annotation queue.
   *
   * <p>See {@link #createLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param body Create annotation queue payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>>
      createLLMObsAnnotationQueueWithHttpInfoAsync(LLMObsAnnotationQueueRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createLLMObsAnnotationQueue"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotation-queues";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsAnnotationQueue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
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
        new GenericType<LLMObsAnnotationQueueResponse>() {});
  }

  /**
   * Add annotation queue interactions.
   *
   * <p>See {@link #createLLMObsAnnotationQueueInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Add interactions payload. (required)
   * @return LLMObsAnnotationQueueInteractionsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueueInteractionsResponse createLLMObsAnnotationQueueInteractions(
      String queueId, LLMObsAnnotationQueueInteractionsRequest body) throws ApiException {
    return createLLMObsAnnotationQueueInteractionsWithHttpInfo(queueId, body).getData();
  }

  /**
   * Add annotation queue interactions.
   *
   * <p>See {@link #createLLMObsAnnotationQueueInteractionsWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Add interactions payload. (required)
   * @return CompletableFuture&lt;LLMObsAnnotationQueueInteractionsResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueueInteractionsResponse>
      createLLMObsAnnotationQueueInteractionsAsync(
          String queueId, LLMObsAnnotationQueueInteractionsRequest body) {
    return createLLMObsAnnotationQueueInteractionsWithHttpInfoAsync(queueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add one or more interactions (traces) to an annotation queue. At least one interaction must be
   * provided.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Add interactions payload. (required)
   * @return ApiResponse&lt;LLMObsAnnotationQueueInteractionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsAnnotationQueueInteractionsResponse>
      createLLMObsAnnotationQueueInteractionsWithHttpInfo(
          String queueId, LLMObsAnnotationQueueInteractionsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsAnnotationQueueInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueId' when calling"
              + " createLLMObsAnnotationQueueInteractions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createLLMObsAnnotationQueueInteractions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/interactions"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsAnnotationQueueInteractions",
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
        new GenericType<LLMObsAnnotationQueueInteractionsResponse>() {});
  }

  /**
   * Add annotation queue interactions.
   *
   * <p>See {@link #createLLMObsAnnotationQueueInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Add interactions payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueueInteractionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueueInteractionsResponse>>
      createLLMObsAnnotationQueueInteractionsWithHttpInfoAsync(
          String queueId, LLMObsAnnotationQueueInteractionsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsAnnotationQueueInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueInteractionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueInteractionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling"
                  + " createLLMObsAnnotationQueueInteractions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueInteractionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createLLMObsAnnotationQueueInteractions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/interactions"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsAnnotationQueueInteractions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueInteractionsResponse>> result =
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
        new GenericType<LLMObsAnnotationQueueInteractionsResponse>() {});
  }

  /**
   * Create an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Create dataset payload. (required)
   * @return LLMObsDatasetResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetResponse createLLMObsDataset(String projectId, LLMObsDatasetRequest body)
      throws ApiException {
    return createLLMObsDatasetWithHttpInfo(projectId, body).getData();
  }

  /**
   * Create an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Create dataset payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetResponse> createLLMObsDatasetAsync(
      String projectId, LLMObsDatasetRequest body) {
    return createLLMObsDatasetWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new LLM Observability dataset within the specified project.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Create dataset payload. (required)
   * @return ApiResponse&lt;LLMObsDatasetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetResponse> createLLMObsDatasetWithHttpInfo(
      String projectId, LLMObsDatasetRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling createLLMObsDataset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsDataset",
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
        new GenericType<LLMObsDatasetResponse>() {});
  }

  /**
   * Create an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Create dataset payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetResponse>> createLLMObsDatasetWithHttpInfoAsync(
      String projectId, LLMObsDatasetRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling createLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLLMObsDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsDatasetResponse>() {});
  }

  /**
   * Append records to an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Append records payload. (required)
   * @return LLMObsDatasetRecordsMutationResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetRecordsMutationResponse createLLMObsDatasetRecords(
      String projectId, String datasetId, LLMObsDatasetRecordsRequest body) throws ApiException {
    return createLLMObsDatasetRecordsWithHttpInfo(projectId, datasetId, body).getData();
  }

  /**
   * Append records to an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetRecordsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Append records payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetRecordsMutationResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetRecordsMutationResponse> createLLMObsDatasetRecordsAsync(
      String projectId, String datasetId, LLMObsDatasetRecordsRequest body) {
    return createLLMObsDatasetRecordsWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Append one or more records to an LLM Observability dataset.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Append records payload. (required)
   * @return ApiResponse&lt;LLMObsDatasetRecordsMutationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetRecordsMutationResponse> createLLMObsDatasetRecordsWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetRecordsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling createLLMObsDatasetRecords");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling createLLMObsDatasetRecords");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsDatasetRecords");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsDatasetRecords",
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
        new GenericType<LLMObsDatasetRecordsMutationResponse>() {});
  }

  /**
   * Append records to an LLM Observability dataset.
   *
   * <p>See {@link #createLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Append records payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetRecordsMutationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>>
      createLLMObsDatasetRecordsWithHttpInfoAsync(
          String projectId, String datasetId, LLMObsDatasetRecordsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " createLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " createLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createLLMObsDatasetRecords"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsDatasetRecords",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
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
        new GenericType<LLMObsDatasetRecordsMutationResponse>() {});
  }

  /**
   * Create an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentWithHttpInfo}.
   *
   * @param body Create experiment payload. (required)
   * @return LLMObsExperimentResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentResponse createLLMObsExperiment(LLMObsExperimentRequest body)
      throws ApiException {
    return createLLMObsExperimentWithHttpInfo(body).getData();
  }

  /**
   * Create an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentWithHttpInfoAsync}.
   *
   * @param body Create experiment payload. (required)
   * @return CompletableFuture&lt;LLMObsExperimentResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentResponse> createLLMObsExperimentAsync(
      LLMObsExperimentRequest body) {
    return createLLMObsExperimentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new LLM Observability experiment.
   *
   * @param body Create experiment payload. (required)
   * @return ApiResponse&lt;LLMObsExperimentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsExperimentResponse> createLLMObsExperimentWithHttpInfo(
      LLMObsExperimentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsExperiment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsExperiment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsExperiment",
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
        new GenericType<LLMObsExperimentResponse>() {});
  }

  /**
   * Create an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentWithHttpInfo}.
   *
   * @param body Create experiment payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentResponse>>
      createLLMObsExperimentWithHttpInfoAsync(LLMObsExperimentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsExperiment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLLMObsExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsExperiment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsExperimentResponse>() {});
  }

  /**
   * Push events for an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentEventsWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Experiment events payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void createLLMObsExperimentEvents(String experimentId, LLMObsExperimentEventsRequest body)
      throws ApiException {
    createLLMObsExperimentEventsWithHttpInfo(experimentId, body);
  }

  /**
   * Push events for an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentEventsWithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Experiment events payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createLLMObsExperimentEventsAsync(
      String experimentId, LLMObsExperimentEventsRequest body) {
    return createLLMObsExperimentEventsWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Push spans and metrics for an LLM Observability experiment.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Experiment events payload. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createLLMObsExperimentEventsWithHttpInfo(
      String experimentId, LLMObsExperimentEventsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsExperimentEvents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling"
              + " createLLMObsExperimentEvents");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsExperimentEvents");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsExperimentEvents",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Push events for an LLM Observability experiment.
   *
   * <p>See {@link #createLLMObsExperimentEventsWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Experiment events payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createLLMObsExperimentEventsWithHttpInfoAsync(
      String experimentId, LLMObsExperimentEventsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsExperimentEvents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " createLLMObsExperimentEvents"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createLLMObsExperimentEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsExperimentEvents",
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
   * Create an LLM Observability project.
   *
   * <p>See {@link #createLLMObsProjectWithHttpInfo}.
   *
   * @param body Create project payload. (required)
   * @return LLMObsProjectResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsProjectResponse createLLMObsProject(LLMObsProjectRequest body) throws ApiException {
    return createLLMObsProjectWithHttpInfo(body).getData();
  }

  /**
   * Create an LLM Observability project.
   *
   * <p>See {@link #createLLMObsProjectWithHttpInfoAsync}.
   *
   * @param body Create project payload. (required)
   * @return CompletableFuture&lt;LLMObsProjectResponse&gt;
   */
  public CompletableFuture<LLMObsProjectResponse> createLLMObsProjectAsync(
      LLMObsProjectRequest body) {
    return createLLMObsProjectWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new LLM Observability project. Returns the existing project if a name conflict occurs.
   *
   * @param body Create project payload. (required)
   * @return ApiResponse&lt;LLMObsProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsProjectResponse> createLLMObsProjectWithHttpInfo(
      LLMObsProjectRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLLMObsProject");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsProject",
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
        new GenericType<LLMObsProjectResponse>() {});
  }

  /**
   * Create an LLM Observability project.
   *
   * <p>See {@link #createLLMObsProjectWithHttpInfo}.
   *
   * @param body Create project payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsProjectResponse>> createLLMObsProjectWithHttpInfoAsync(
      LLMObsProjectRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLLMObsProject"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsProjectResponse>() {});
  }

  /**
   * Delete an LLM Observability annotation queue.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsAnnotationQueue(String queueId) throws ApiException {
    deleteLLMObsAnnotationQueueWithHttpInfo(queueId);
  }

  /**
   * Delete an LLM Observability annotation queue.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsAnnotationQueueAsync(String queueId) {
    return deleteLLMObsAnnotationQueueWithHttpInfoAsync(queueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an annotation queue by its ID.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLLMObsAnnotationQueueWithHttpInfo(String queueId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'queueId' when calling deleteLLMObsAnnotationQueue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsAnnotationQueue",
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
   * Delete an LLM Observability annotation queue.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsAnnotationQueueWithHttpInfoAsync(
      String queueId) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling deleteLLMObsAnnotationQueue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsAnnotationQueue",
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
   * Delete annotation queue interactions.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Delete interactions payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsAnnotationQueueInteractions(
      String queueId, LLMObsDeleteAnnotationQueueInteractionsRequest body) throws ApiException {
    deleteLLMObsAnnotationQueueInteractionsWithHttpInfo(queueId, body);
  }

  /**
   * Delete annotation queue interactions.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueInteractionsWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Delete interactions payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsAnnotationQueueInteractionsAsync(
      String queueId, LLMObsDeleteAnnotationQueueInteractionsRequest body) {
    return deleteLLMObsAnnotationQueueInteractionsWithHttpInfoAsync(queueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete one or more interactions from an annotation queue.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Delete interactions payload. (required)
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
  public ApiResponse<Void> deleteLLMObsAnnotationQueueInteractionsWithHttpInfo(
      String queueId, LLMObsDeleteAnnotationQueueInteractionsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsAnnotationQueueInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueId' when calling"
              + " deleteLLMObsAnnotationQueueInteractions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " deleteLLMObsAnnotationQueueInteractions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/interactions/delete"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsAnnotationQueueInteractions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete annotation queue interactions.
   *
   * <p>See {@link #deleteLLMObsAnnotationQueueInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Delete interactions payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteLLMObsAnnotationQueueInteractionsWithHttpInfoAsync(
          String queueId, LLMObsDeleteAnnotationQueueInteractionsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsAnnotationQueueInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling"
                  + " deleteLLMObsAnnotationQueueInteractions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " deleteLLMObsAnnotationQueueInteractions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/interactions/delete"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsAnnotationQueueInteractions",
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
   * Delete a custom evaluator configuration.
   *
   * <p>See {@link #deleteLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsCustomEvalConfig(String evalName) throws ApiException {
    deleteLLMObsCustomEvalConfigWithHttpInfo(evalName);
  }

  /**
   * Delete a custom evaluator configuration.
   *
   * <p>See {@link #deleteLLMObsCustomEvalConfigWithHttpInfoAsync}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsCustomEvalConfigAsync(String evalName) {
    return deleteLLMObsCustomEvalConfigWithHttpInfoAsync(evalName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a custom LLM Observability evaluator configuration by its name.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
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
  public ApiResponse<Void> deleteLLMObsCustomEvalConfigWithHttpInfo(String evalName)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'evalName' when calling deleteLLMObsCustomEvalConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsCustomEvalConfig",
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
   * Delete a custom evaluator configuration.
   *
   * <p>See {@link #deleteLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsCustomEvalConfigWithHttpInfoAsync(
      String evalName) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'evalName' when calling"
                  + " deleteLLMObsCustomEvalConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsCustomEvalConfig",
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
   * Delete LLM Observability dataset records.
   *
   * <p>See {@link #deleteLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Delete records payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsDatasetRecords(
      String projectId, String datasetId, LLMObsDeleteDatasetRecordsRequest body)
      throws ApiException {
    deleteLLMObsDatasetRecordsWithHttpInfo(projectId, datasetId, body);
  }

  /**
   * Delete LLM Observability dataset records.
   *
   * <p>See {@link #deleteLLMObsDatasetRecordsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Delete records payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsDatasetRecordsAsync(
      String projectId, String datasetId, LLMObsDeleteDatasetRecordsRequest body) {
    return deleteLLMObsDatasetRecordsWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete one or more records from an LLM Observability dataset.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Delete records payload. (required)
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
  public ApiResponse<Void> deleteLLMObsDatasetRecordsWithHttpInfo(
      String projectId, String datasetId, LLMObsDeleteDatasetRecordsRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling deleteLLMObsDatasetRecords");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling deleteLLMObsDatasetRecords");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteLLMObsDatasetRecords");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records/delete"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsDatasetRecords",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete LLM Observability dataset records.
   *
   * <p>See {@link #deleteLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Delete records payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsDatasetRecordsWithHttpInfoAsync(
      String projectId, String datasetId, LLMObsDeleteDatasetRecordsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " deleteLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " deleteLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling deleteLLMObsDatasetRecords"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records/delete"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsDatasetRecords",
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
   * Delete LLM Observability datasets.
   *
   * <p>See {@link #deleteLLMObsDatasetsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Delete datasets payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsDatasets(String projectId, LLMObsDeleteDatasetsRequest body)
      throws ApiException {
    deleteLLMObsDatasetsWithHttpInfo(projectId, body);
  }

  /**
   * Delete LLM Observability datasets.
   *
   * <p>See {@link #deleteLLMObsDatasetsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Delete datasets payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsDatasetsAsync(
      String projectId, LLMObsDeleteDatasetsRequest body) {
    return deleteLLMObsDatasetsWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete one or more LLM Observability datasets within the specified project.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Delete datasets payload. (required)
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
  public ApiResponse<Void> deleteLLMObsDatasetsWithHttpInfo(
      String projectId, LLMObsDeleteDatasetsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsDatasets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteLLMObsDatasets");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteLLMObsDatasets");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/delete"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsDatasets",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete LLM Observability datasets.
   *
   * <p>See {@link #deleteLLMObsDatasetsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Delete datasets payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsDatasetsWithHttpInfoAsync(
      String projectId, LLMObsDeleteDatasetsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsDatasets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling deleteLLMObsDatasets"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteLLMObsDatasets"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/delete"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsDatasets",
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
   * Delete LLM Observability experiments.
   *
   * <p>See {@link #deleteLLMObsExperimentsWithHttpInfo}.
   *
   * @param body Delete experiments payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsExperiments(LLMObsDeleteExperimentsRequest body) throws ApiException {
    deleteLLMObsExperimentsWithHttpInfo(body);
  }

  /**
   * Delete LLM Observability experiments.
   *
   * <p>See {@link #deleteLLMObsExperimentsWithHttpInfoAsync}.
   *
   * @param body Delete experiments payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsExperimentsAsync(LLMObsDeleteExperimentsRequest body) {
    return deleteLLMObsExperimentsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete one or more LLM Observability experiments.
   *
   * @param body Delete experiments payload. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLLMObsExperimentsWithHttpInfo(LLMObsDeleteExperimentsRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsExperiments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteLLMObsExperiments");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments/delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsExperiments",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete LLM Observability experiments.
   *
   * <p>See {@link #deleteLLMObsExperimentsWithHttpInfo}.
   *
   * @param body Delete experiments payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsExperimentsWithHttpInfoAsync(
      LLMObsDeleteExperimentsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsExperiments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteLLMObsExperiments"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments/delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsExperiments",
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
   * Delete LLM Observability projects.
   *
   * <p>See {@link #deleteLLMObsProjectsWithHttpInfo}.
   *
   * @param body Delete projects payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLLMObsProjects(LLMObsDeleteProjectsRequest body) throws ApiException {
    deleteLLMObsProjectsWithHttpInfo(body);
  }

  /**
   * Delete LLM Observability projects.
   *
   * <p>See {@link #deleteLLMObsProjectsWithHttpInfoAsync}.
   *
   * @param body Delete projects payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLLMObsProjectsAsync(LLMObsDeleteProjectsRequest body) {
    return deleteLLMObsProjectsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete one or more LLM Observability projects.
   *
   * @param body Delete projects payload. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLLMObsProjectsWithHttpInfo(LLMObsDeleteProjectsRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteLLMObsProjects");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects/delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsProjects",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete LLM Observability projects.
   *
   * <p>See {@link #deleteLLMObsProjectsWithHttpInfo}.
   *
   * @param body Delete projects payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLLMObsProjectsWithHttpInfoAsync(
      LLMObsDeleteProjectsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteLLMObsProjects"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects/delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsProjects",
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
   * Get annotated queue interactions.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return LLMObsAnnotatedInteractionsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotatedInteractionsResponse getLLMObsAnnotatedInteractions(String queueId)
      throws ApiException {
    return getLLMObsAnnotatedInteractionsWithHttpInfo(queueId).getData();
  }

  /**
   * Get annotated queue interactions.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture&lt;LLMObsAnnotatedInteractionsResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotatedInteractionsResponse> getLLMObsAnnotatedInteractionsAsync(
      String queueId) {
    return getLLMObsAnnotatedInteractionsWithHttpInfoAsync(queueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve all interactions and their annotations for a given annotation queue.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return ApiResponse&lt;LLMObsAnnotatedInteractionsResponse&gt;
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
  public ApiResponse<LLMObsAnnotatedInteractionsResponse>
      getLLMObsAnnotatedInteractionsWithHttpInfo(String queueId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotatedInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueId' when calling getLLMObsAnnotatedInteractions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/annotated-interactions"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.getLLMObsAnnotatedInteractions",
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
        new GenericType<LLMObsAnnotatedInteractionsResponse>() {});
  }

  /**
   * Get annotated queue interactions.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotatedInteractionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsResponse>>
      getLLMObsAnnotatedInteractionsWithHttpInfoAsync(String queueId) {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotatedInteractions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling"
                  + " getLLMObsAnnotatedInteractions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/annotated-interactions"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.getLLMObsAnnotatedInteractions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsResponse>> result =
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
        new GenericType<LLMObsAnnotatedInteractionsResponse>() {});
  }

  /**
   * Get a custom evaluator configuration.
   *
   * <p>See {@link #getLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return LLMObsCustomEvalConfigResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsCustomEvalConfigResponse getLLMObsCustomEvalConfig(String evalName)
      throws ApiException {
    return getLLMObsCustomEvalConfigWithHttpInfo(evalName).getData();
  }

  /**
   * Get a custom evaluator configuration.
   *
   * <p>See {@link #getLLMObsCustomEvalConfigWithHttpInfoAsync}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return CompletableFuture&lt;LLMObsCustomEvalConfigResponse&gt;
   */
  public CompletableFuture<LLMObsCustomEvalConfigResponse> getLLMObsCustomEvalConfigAsync(
      String evalName) {
    return getLLMObsCustomEvalConfigWithHttpInfoAsync(evalName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a custom LLM Observability evaluator configuration by its name.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return ApiResponse&lt;LLMObsCustomEvalConfigResponse&gt;
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
  public ApiResponse<LLMObsCustomEvalConfigResponse> getLLMObsCustomEvalConfigWithHttpInfo(
      String evalName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'evalName' when calling getLLMObsCustomEvalConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.getLLMObsCustomEvalConfig",
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
        new GenericType<LLMObsCustomEvalConfigResponse>() {});
  }

  /**
   * Get a custom evaluator configuration.
   *
   * <p>See {@link #getLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsCustomEvalConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsCustomEvalConfigResponse>>
      getLLMObsCustomEvalConfigWithHttpInfoAsync(String evalName) {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsCustomEvalConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      CompletableFuture<ApiResponse<LLMObsCustomEvalConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'evalName' when calling getLLMObsCustomEvalConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.getLLMObsCustomEvalConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsCustomEvalConfigResponse>> result =
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
        new GenericType<LLMObsCustomEvalConfigResponse>() {});
  }

  /** Manage optional parameters to listLLMObsAnnotationQueues. */
  public static class ListLLMObsAnnotationQueuesOptionalParameters {
    private String projectId;
    private List<String> queueIds;

    /**
     * Set projectId.
     *
     * @param projectId Filter annotation queues by project ID. Cannot be used together with <code>
     *     queueIds</code>. (optional)
     * @return ListLLMObsAnnotationQueuesOptionalParameters
     */
    public ListLLMObsAnnotationQueuesOptionalParameters projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set queueIds.
     *
     * @param queueIds Filter annotation queues by queue IDs (comma-separated). Cannot be used
     *     together with <code>projectId</code>. (optional)
     * @return ListLLMObsAnnotationQueuesOptionalParameters
     */
    public ListLLMObsAnnotationQueuesOptionalParameters queueIds(List<String> queueIds) {
      this.queueIds = queueIds;
      return this;
    }
  }

  /**
   * List LLM Observability annotation queues.
   *
   * <p>See {@link #listLLMObsAnnotationQueuesWithHttpInfo}.
   *
   * @return LLMObsAnnotationQueuesResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueuesResponse listLLMObsAnnotationQueues() throws ApiException {
    return listLLMObsAnnotationQueuesWithHttpInfo(
            new ListLLMObsAnnotationQueuesOptionalParameters())
        .getData();
  }

  /**
   * List LLM Observability annotation queues.
   *
   * <p>See {@link #listLLMObsAnnotationQueuesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LLMObsAnnotationQueuesResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueuesResponse> listLLMObsAnnotationQueuesAsync() {
    return listLLMObsAnnotationQueuesWithHttpInfoAsync(
            new ListLLMObsAnnotationQueuesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability annotation queues.
   *
   * <p>See {@link #listLLMObsAnnotationQueuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LLMObsAnnotationQueuesResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueuesResponse listLLMObsAnnotationQueues(
      ListLLMObsAnnotationQueuesOptionalParameters parameters) throws ApiException {
    return listLLMObsAnnotationQueuesWithHttpInfo(parameters).getData();
  }

  /**
   * List LLM Observability annotation queues.
   *
   * <p>See {@link #listLLMObsAnnotationQueuesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsAnnotationQueuesResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueuesResponse> listLLMObsAnnotationQueuesAsync(
      ListLLMObsAnnotationQueuesOptionalParameters parameters) {
    return listLLMObsAnnotationQueuesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List annotation queues. Optionally filter by project ID or queue IDs. These parameters are
   * mutually exclusive. If neither is provided, all queues in the organization are returned.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsAnnotationQueuesResponse&gt;
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
  public ApiResponse<LLMObsAnnotationQueuesResponse> listLLMObsAnnotationQueuesWithHttpInfo(
      ListLLMObsAnnotationQueuesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsAnnotationQueues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String projectId = parameters.projectId;
    List<String> queueIds = parameters.queueIds;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotation-queues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "queueIds", queueIds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsAnnotationQueues",
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
        new GenericType<LLMObsAnnotationQueuesResponse>() {});
  }

  /**
   * List LLM Observability annotation queues.
   *
   * <p>See {@link #listLLMObsAnnotationQueuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueuesResponse>>
      listLLMObsAnnotationQueuesWithHttpInfoAsync(
          ListLLMObsAnnotationQueuesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsAnnotationQueues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String projectId = parameters.projectId;
    List<String> queueIds = parameters.queueIds;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotation-queues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "queueIds", queueIds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsAnnotationQueues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueuesResponse>> result =
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
        new GenericType<LLMObsAnnotationQueuesResponse>() {});
  }

  /** Manage optional parameters to listLLMObsDatasetRecords. */
  public static class ListLLMObsDatasetRecordsOptionalParameters {
    private Long filterVersion;
    private String pageCursor;
    private Long pageLimit;

    /**
     * Set filterVersion.
     *
     * @param filterVersion Retrieve records from a specific dataset version. Defaults to the
     *     current version. (optional)
     * @return ListLLMObsDatasetRecordsOptionalParameters
     */
    public ListLLMObsDatasetRecordsOptionalParameters filterVersion(Long filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Use the Pagination cursor to retrieve the next page of results. (optional)
     * @return ListLLMObsDatasetRecordsOptionalParameters
     */
    public ListLLMObsDatasetRecordsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return per page. (optional)
     * @return ListLLMObsDatasetRecordsOptionalParameters
     */
    public ListLLMObsDatasetRecordsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List LLM Observability dataset records.
   *
   * <p>See {@link #listLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return LLMObsDatasetRecordsListResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetRecordsListResponse listLLMObsDatasetRecords(
      String projectId, String datasetId) throws ApiException {
    return listLLMObsDatasetRecordsWithHttpInfo(
            projectId, datasetId, new ListLLMObsDatasetRecordsOptionalParameters())
        .getData();
  }

  /**
   * List LLM Observability dataset records.
   *
   * <p>See {@link #listLLMObsDatasetRecordsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;LLMObsDatasetRecordsListResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetRecordsListResponse> listLLMObsDatasetRecordsAsync(
      String projectId, String datasetId) {
    return listLLMObsDatasetRecordsWithHttpInfoAsync(
            projectId, datasetId, new ListLLMObsDatasetRecordsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability dataset records.
   *
   * <p>See {@link #listLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return LLMObsDatasetRecordsListResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetRecordsListResponse listLLMObsDatasetRecords(
      String projectId, String datasetId, ListLLMObsDatasetRecordsOptionalParameters parameters)
      throws ApiException {
    return listLLMObsDatasetRecordsWithHttpInfo(projectId, datasetId, parameters).getData();
  }

  /**
   * List LLM Observability dataset records.
   *
   * <p>See {@link #listLLMObsDatasetRecordsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsDatasetRecordsListResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetRecordsListResponse> listLLMObsDatasetRecordsAsync(
      String projectId, String datasetId, ListLLMObsDatasetRecordsOptionalParameters parameters) {
    return listLLMObsDatasetRecordsWithHttpInfoAsync(projectId, datasetId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all records in an LLM Observability dataset, sorted by creation date, newest first.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsDatasetRecordsListResponse&gt;
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
  public ApiResponse<LLMObsDatasetRecordsListResponse> listLLMObsDatasetRecordsWithHttpInfo(
      String projectId, String datasetId, ListLLMObsDatasetRecordsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling listLLMObsDatasetRecords");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling listLLMObsDatasetRecords");
    }
    Long filterVersion = parameters.filterVersion;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsDatasetRecords",
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
        new GenericType<LLMObsDatasetRecordsListResponse>() {});
  }

  /**
   * List LLM Observability dataset records.
   *
   * <p>See {@link #listLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetRecordsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetRecordsListResponse>>
      listLLMObsDatasetRecordsWithHttpInfoAsync(
          String projectId,
          String datasetId,
          ListLLMObsDatasetRecordsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling listLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling listLLMObsDatasetRecords"));
      return result;
    }
    Long filterVersion = parameters.filterVersion;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsDatasetRecords",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsListResponse>> result =
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
        new GenericType<LLMObsDatasetRecordsListResponse>() {});
  }

  /** Manage optional parameters to listLLMObsDatasets. */
  public static class ListLLMObsDatasetsOptionalParameters {
    private String filterName;
    private String filterId;
    private String pageCursor;
    private Long pageLimit;

    /**
     * Set filterName.
     *
     * @param filterName Filter datasets by name. (optional)
     * @return ListLLMObsDatasetsOptionalParameters
     */
    public ListLLMObsDatasetsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter datasets by dataset ID. (optional)
     * @return ListLLMObsDatasetsOptionalParameters
     */
    public ListLLMObsDatasetsOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Use the Pagination cursor to retrieve the next page of results. (optional)
     * @return ListLLMObsDatasetsOptionalParameters
     */
    public ListLLMObsDatasetsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return per page. (optional)
     * @return ListLLMObsDatasetsOptionalParameters
     */
    public ListLLMObsDatasetsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List LLM Observability datasets.
   *
   * <p>See {@link #listLLMObsDatasetsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @return LLMObsDatasetsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetsResponse listLLMObsDatasets(String projectId) throws ApiException {
    return listLLMObsDatasetsWithHttpInfo(projectId, new ListLLMObsDatasetsOptionalParameters())
        .getData();
  }

  /**
   * List LLM Observability datasets.
   *
   * <p>See {@link #listLLMObsDatasetsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @return CompletableFuture&lt;LLMObsDatasetsResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetsResponse> listLLMObsDatasetsAsync(String projectId) {
    return listLLMObsDatasetsWithHttpInfoAsync(
            projectId, new ListLLMObsDatasetsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability datasets.
   *
   * <p>See {@link #listLLMObsDatasetsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param parameters Optional parameters for the request.
   * @return LLMObsDatasetsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetsResponse listLLMObsDatasets(
      String projectId, ListLLMObsDatasetsOptionalParameters parameters) throws ApiException {
    return listLLMObsDatasetsWithHttpInfo(projectId, parameters).getData();
  }

  /**
   * List LLM Observability datasets.
   *
   * <p>See {@link #listLLMObsDatasetsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsDatasetsResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetsResponse> listLLMObsDatasetsAsync(
      String projectId, ListLLMObsDatasetsOptionalParameters parameters) {
    return listLLMObsDatasetsWithHttpInfoAsync(projectId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all LLM Observability datasets for a project, sorted by creation date, newest first.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsDatasetsResponse&gt;
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
  public ApiResponse<LLMObsDatasetsResponse> listLLMObsDatasetsWithHttpInfo(
      String projectId, ListLLMObsDatasetsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling listLLMObsDatasets");
    }
    String filterName = parameters.filterName;
    String filterId = parameters.filterId;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsDatasets",
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
        new GenericType<LLMObsDatasetsResponse>() {});
  }

  /**
   * List LLM Observability datasets.
   *
   * <p>See {@link #listLLMObsDatasetsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetsResponse>> listLLMObsDatasetsWithHttpInfoAsync(
      String projectId, ListLLMObsDatasetsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling listLLMObsDatasets"));
      return result;
    }
    String filterName = parameters.filterName;
    String filterId = parameters.filterId;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsDatasets",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetsResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsDatasetsResponse>() {});
  }

  /** Manage optional parameters to listLLMObsExperiments. */
  public static class ListLLMObsExperimentsOptionalParameters {
    private String filterProjectId;
    private String filterDatasetId;
    private String filterId;
    private String pageCursor;
    private Long pageLimit;

    /**
     * Set filterProjectId.
     *
     * @param filterProjectId Filter experiments by project ID. Required if <code>filter[dataset_id]
     *     </code> is not provided. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterProjectId(String filterProjectId) {
      this.filterProjectId = filterProjectId;
      return this;
    }

    /**
     * Set filterDatasetId.
     *
     * @param filterDatasetId Filter experiments by dataset ID. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterDatasetId(String filterDatasetId) {
      this.filterDatasetId = filterDatasetId;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter experiments by experiment ID. Can be specified multiple times.
     *     (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Use the Pagination cursor to retrieve the next page of results. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return per page. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List LLM Observability experiments.
   *
   * <p>See {@link #listLLMObsExperimentsWithHttpInfo}.
   *
   * @return LLMObsExperimentsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentsResponse listLLMObsExperiments() throws ApiException {
    return listLLMObsExperimentsWithHttpInfo(new ListLLMObsExperimentsOptionalParameters())
        .getData();
  }

  /**
   * List LLM Observability experiments.
   *
   * <p>See {@link #listLLMObsExperimentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LLMObsExperimentsResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentsResponse> listLLMObsExperimentsAsync() {
    return listLLMObsExperimentsWithHttpInfoAsync(new ListLLMObsExperimentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability experiments.
   *
   * <p>See {@link #listLLMObsExperimentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LLMObsExperimentsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentsResponse listLLMObsExperiments(
      ListLLMObsExperimentsOptionalParameters parameters) throws ApiException {
    return listLLMObsExperimentsWithHttpInfo(parameters).getData();
  }

  /**
   * List LLM Observability experiments.
   *
   * <p>See {@link #listLLMObsExperimentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsExperimentsResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentsResponse> listLLMObsExperimentsAsync(
      ListLLMObsExperimentsOptionalParameters parameters) {
    return listLLMObsExperimentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all LLM Observability experiments sorted by creation date, newest first.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsExperimentsResponse&gt;
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
  public ApiResponse<LLMObsExperimentsResponse> listLLMObsExperimentsWithHttpInfo(
      ListLLMObsExperimentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperiments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterProjectId = parameters.filterProjectId;
    String filterDatasetId = parameters.filterDatasetId;
    String filterId = parameters.filterId;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[dataset_id]", filterDatasetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsExperiments",
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
        new GenericType<LLMObsExperimentsResponse>() {});
  }

  /**
   * List LLM Observability experiments.
   *
   * <p>See {@link #listLLMObsExperimentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentsResponse>>
      listLLMObsExperimentsWithHttpInfoAsync(ListLLMObsExperimentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperiments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterProjectId = parameters.filterProjectId;
    String filterDatasetId = parameters.filterDatasetId;
    String filterId = parameters.filterId;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experiments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[dataset_id]", filterDatasetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsExperiments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentsResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsExperimentsResponse>() {});
  }

  /** Manage optional parameters to listLLMObsProjects. */
  public static class ListLLMObsProjectsOptionalParameters {
    private String filterId;
    private String filterName;
    private String pageCursor;
    private Long pageLimit;

    /**
     * Set filterId.
     *
     * @param filterId Filter projects by project ID. (optional)
     * @return ListLLMObsProjectsOptionalParameters
     */
    public ListLLMObsProjectsOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName Filter projects by name. (optional)
     * @return ListLLMObsProjectsOptionalParameters
     */
    public ListLLMObsProjectsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Use the Pagination cursor to retrieve the next page of results. (optional)
     * @return ListLLMObsProjectsOptionalParameters
     */
    public ListLLMObsProjectsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return per page. (optional)
     * @return ListLLMObsProjectsOptionalParameters
     */
    public ListLLMObsProjectsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List LLM Observability projects.
   *
   * <p>See {@link #listLLMObsProjectsWithHttpInfo}.
   *
   * @return LLMObsProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsProjectsResponse listLLMObsProjects() throws ApiException {
    return listLLMObsProjectsWithHttpInfo(new ListLLMObsProjectsOptionalParameters()).getData();
  }

  /**
   * List LLM Observability projects.
   *
   * <p>See {@link #listLLMObsProjectsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LLMObsProjectsResponse&gt;
   */
  public CompletableFuture<LLMObsProjectsResponse> listLLMObsProjectsAsync() {
    return listLLMObsProjectsWithHttpInfoAsync(new ListLLMObsProjectsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability projects.
   *
   * <p>See {@link #listLLMObsProjectsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LLMObsProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsProjectsResponse listLLMObsProjects(ListLLMObsProjectsOptionalParameters parameters)
      throws ApiException {
    return listLLMObsProjectsWithHttpInfo(parameters).getData();
  }

  /**
   * List LLM Observability projects.
   *
   * <p>See {@link #listLLMObsProjectsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsProjectsResponse&gt;
   */
  public CompletableFuture<LLMObsProjectsResponse> listLLMObsProjectsAsync(
      ListLLMObsProjectsOptionalParameters parameters) {
    return listLLMObsProjectsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all LLM Observability projects sorted by creation date, newest first.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsProjectsResponse&gt;
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
  public ApiResponse<LLMObsProjectsResponse> listLLMObsProjectsWithHttpInfo(
      ListLLMObsProjectsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterId = parameters.filterId;
    String filterName = parameters.filterName;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsProjects",
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
        new GenericType<LLMObsProjectsResponse>() {});
  }

  /**
   * List LLM Observability projects.
   *
   * <p>See {@link #listLLMObsProjectsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsProjectsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsProjectsResponse>> listLLMObsProjectsWithHttpInfoAsync(
      ListLLMObsProjectsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsProjectsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterId = parameters.filterId;
    String filterName = parameters.filterName;
    String pageCursor = parameters.pageCursor;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/projects";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsProjects",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsProjectsResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsProjectsResponse>() {});
  }

  /**
   * Update an LLM Observability annotation queue.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update annotation queue payload. (required)
   * @return LLMObsAnnotationQueueResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueueResponse updateLLMObsAnnotationQueue(
      String queueId, LLMObsAnnotationQueueUpdateRequest body) throws ApiException {
    return updateLLMObsAnnotationQueueWithHttpInfo(queueId, body).getData();
  }

  /**
   * Update an LLM Observability annotation queue.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update annotation queue payload. (required)
   * @return CompletableFuture&lt;LLMObsAnnotationQueueResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueueResponse> updateLLMObsAnnotationQueueAsync(
      String queueId, LLMObsAnnotationQueueUpdateRequest body) {
    return updateLLMObsAnnotationQueueWithHttpInfoAsync(queueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an annotation queue. Only <code>name</code> and <code>description</code> can
   * be updated.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update annotation queue payload. (required)
   * @return ApiResponse&lt;LLMObsAnnotationQueueResponse&gt;
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
  public ApiResponse<LLMObsAnnotationQueueResponse> updateLLMObsAnnotationQueueWithHttpInfo(
      String queueId, LLMObsAnnotationQueueUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'queueId' when calling updateLLMObsAnnotationQueue");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsAnnotationQueue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsAnnotationQueue",
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
        new GenericType<LLMObsAnnotationQueueResponse>() {});
  }

  /**
   * Update an LLM Observability annotation queue.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update annotation queue payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>>
      updateLLMObsAnnotationQueueWithHttpInfoAsync(
          String queueId, LLMObsAnnotationQueueUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsAnnotationQueue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling updateLLMObsAnnotationQueue"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateLLMObsAnnotationQueue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsAnnotationQueue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueResponse>> result =
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
        new GenericType<LLMObsAnnotationQueueResponse>() {});
  }

  /**
   * Create or update a custom evaluator configuration.
   *
   * <p>See {@link #updateLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @param body Custom evaluator configuration payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLLMObsCustomEvalConfig(
      String evalName, LLMObsCustomEvalConfigUpdateRequest body) throws ApiException {
    updateLLMObsCustomEvalConfigWithHttpInfo(evalName, body);
  }

  /**
   * Create or update a custom evaluator configuration.
   *
   * <p>See {@link #updateLLMObsCustomEvalConfigWithHttpInfoAsync}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @param body Custom evaluator configuration payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateLLMObsCustomEvalConfigAsync(
      String evalName, LLMObsCustomEvalConfigUpdateRequest body) {
    return updateLLMObsCustomEvalConfigWithHttpInfoAsync(evalName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update a custom LLM Observability evaluator configuration by its name.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @param body Custom evaluator configuration payload. (required)
   * @return ApiResponse&lt;Void&gt;
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
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateLLMObsCustomEvalConfigWithHttpInfo(
      String evalName, LLMObsCustomEvalConfigUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'evalName' when calling updateLLMObsCustomEvalConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsCustomEvalConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsCustomEvalConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Create or update a custom evaluator configuration.
   *
   * <p>See {@link #updateLLMObsCustomEvalConfigWithHttpInfo}.
   *
   * @param evalName The name of the custom LLM Observability evaluator configuration. (required)
   * @param body Custom evaluator configuration payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateLLMObsCustomEvalConfigWithHttpInfoAsync(
      String evalName, LLMObsCustomEvalConfigUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsCustomEvalConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'evalName' is set
    if (evalName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'evalName' when calling"
                  + " updateLLMObsCustomEvalConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateLLMObsCustomEvalConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/llm-obs/config/evaluators/custom/{eval_name}"
            .replaceAll("\\{" + "eval_name" + "\\}", apiClient.escapeString(evalName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsCustomEvalConfig",
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
   * Update an LLM Observability dataset.
   *
   * <p>See {@link #updateLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update dataset payload. (required)
   * @return LLMObsDatasetResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetResponse updateLLMObsDataset(
      String projectId, String datasetId, LLMObsDatasetUpdateRequest body) throws ApiException {
    return updateLLMObsDatasetWithHttpInfo(projectId, datasetId, body).getData();
  }

  /**
   * Update an LLM Observability dataset.
   *
   * <p>See {@link #updateLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update dataset payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetResponse> updateLLMObsDatasetAsync(
      String projectId, String datasetId, LLMObsDatasetUpdateRequest body) {
    return updateLLMObsDatasetWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an existing LLM Observability dataset within the specified project.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update dataset payload. (required)
   * @return ApiResponse&lt;LLMObsDatasetResponse&gt;
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
  public ApiResponse<LLMObsDatasetResponse> updateLLMObsDatasetWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling updateLLMObsDataset");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling updateLLMObsDataset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsDataset",
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
        new GenericType<LLMObsDatasetResponse>() {});
  }

  /**
   * Update an LLM Observability dataset.
   *
   * <p>See {@link #updateLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update dataset payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetResponse>> updateLLMObsDatasetWithHttpInfoAsync(
      String projectId, String datasetId, LLMObsDatasetUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling updateLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling updateLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLLMObsDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsDatasetResponse>() {});
  }

  /**
   * Update LLM Observability dataset records.
   *
   * <p>See {@link #updateLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update records payload. (required)
   * @return LLMObsDatasetRecordsMutationResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetRecordsMutationResponse updateLLMObsDatasetRecords(
      String projectId, String datasetId, LLMObsDatasetRecordsUpdateRequest body)
      throws ApiException {
    return updateLLMObsDatasetRecordsWithHttpInfo(projectId, datasetId, body).getData();
  }

  /**
   * Update LLM Observability dataset records.
   *
   * <p>See {@link #updateLLMObsDatasetRecordsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update records payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetRecordsMutationResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetRecordsMutationResponse> updateLLMObsDatasetRecordsAsync(
      String projectId, String datasetId, LLMObsDatasetRecordsUpdateRequest body) {
    return updateLLMObsDatasetRecordsWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update one or more existing records in an LLM Observability dataset.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update records payload. (required)
   * @return ApiResponse&lt;LLMObsDatasetRecordsMutationResponse&gt;
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
  public ApiResponse<LLMObsDatasetRecordsMutationResponse> updateLLMObsDatasetRecordsWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetRecordsUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling updateLLMObsDatasetRecords");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling updateLLMObsDatasetRecords");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsDatasetRecords");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsDatasetRecords",
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
        new GenericType<LLMObsDatasetRecordsMutationResponse>() {});
  }

  /**
   * Update LLM Observability dataset records.
   *
   * <p>See {@link #updateLLMObsDatasetRecordsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Update records payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetRecordsMutationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>>
      updateLLMObsDatasetRecordsWithHttpInfoAsync(
          String projectId, String datasetId, LLMObsDatasetRecordsUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsDatasetRecords";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " updateLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " updateLLMObsDatasetRecords"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateLLMObsDatasetRecords"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/records"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsDatasetRecords",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
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
        new GenericType<LLMObsDatasetRecordsMutationResponse>() {});
  }

  /**
   * Update an LLM Observability experiment.
   *
   * <p>See {@link #updateLLMObsExperimentWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Update experiment payload. (required)
   * @return LLMObsExperimentResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentResponse updateLLMObsExperiment(
      String experimentId, LLMObsExperimentUpdateRequest body) throws ApiException {
    return updateLLMObsExperimentWithHttpInfo(experimentId, body).getData();
  }

  /**
   * Update an LLM Observability experiment.
   *
   * <p>See {@link #updateLLMObsExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Update experiment payload. (required)
   * @return CompletableFuture&lt;LLMObsExperimentResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentResponse> updateLLMObsExperimentAsync(
      String experimentId, LLMObsExperimentUpdateRequest body) {
    return updateLLMObsExperimentWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an existing LLM Observability experiment.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Update experiment payload. (required)
   * @return ApiResponse&lt;LLMObsExperimentResponse&gt;
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
  public ApiResponse<LLMObsExperimentResponse> updateLLMObsExperimentWithHttpInfo(
      String experimentId, LLMObsExperimentUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsExperiment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling updateLLMObsExperiment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsExperiment",
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
        new GenericType<LLMObsExperimentResponse>() {});
  }

  /**
   * Update an LLM Observability experiment.
   *
   * <p>See {@link #updateLLMObsExperimentWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param body Update experiment payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentResponse>>
      updateLLMObsExperimentWithHttpInfoAsync(
          String experimentId, LLMObsExperimentUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsExperiment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling updateLLMObsExperiment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLLMObsExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsExperiment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsExperimentResponse>() {});
  }

  /**
   * Update an LLM Observability project.
   *
   * <p>See {@link #updateLLMObsProjectWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Update project payload. (required)
   * @return LLMObsProjectResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsProjectResponse updateLLMObsProject(
      String projectId, LLMObsProjectUpdateRequest body) throws ApiException {
    return updateLLMObsProjectWithHttpInfo(projectId, body).getData();
  }

  /**
   * Update an LLM Observability project.
   *
   * <p>See {@link #updateLLMObsProjectWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Update project payload. (required)
   * @return CompletableFuture&lt;LLMObsProjectResponse&gt;
   */
  public CompletableFuture<LLMObsProjectResponse> updateLLMObsProjectAsync(
      String projectId, LLMObsProjectUpdateRequest body) {
    return updateLLMObsProjectWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an existing LLM Observability project.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Update project payload. (required)
   * @return ApiResponse&lt;LLMObsProjectResponse&gt;
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
  public ApiResponse<LLMObsProjectResponse> updateLLMObsProjectWithHttpInfo(
      String projectId, LLMObsProjectUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling updateLLMObsProject");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLLMObsProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsProject",
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
        new GenericType<LLMObsProjectResponse>() {});
  }

  /**
   * Update an LLM Observability project.
   *
   * <p>See {@link #updateLLMObsProjectWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param body Update project payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsProjectResponse>> updateLLMObsProjectWithHttpInfoAsync(
      String projectId, LLMObsProjectUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling updateLLMObsProject"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLLMObsProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsProjectResponse>() {});
  }
}
