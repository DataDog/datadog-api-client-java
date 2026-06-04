package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.LLMObsAnnotatedInteractionsByTraceResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotatedInteractionsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueuesResponse;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigResponse;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDataDeletionRequest;
import com.datadog.api.client.v2.model.LLMObsDataDeletionResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetBatchUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetCloneRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetDraftStateResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetExportFormat;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsListResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsMutationResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRestoreVersionRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetVersionsResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetsResponse;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationQueueInteractionsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteExperimentsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteProjectsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsV2Response;
import com.datadog.api.client.v2.model.LLMObsExperimentRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentSpansResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentsResponse;
import com.datadog.api.client.v2.model.LLMObsIntegrationAccount;
import com.datadog.api.client.v2.model.LLMObsIntegrationInferenceRequest;
import com.datadog.api.client.v2.model.LLMObsIntegrationInferenceResponse;
import com.datadog.api.client.v2.model.LLMObsIntegrationModel;
import com.datadog.api.client.v2.model.LLMObsIntegrationName;
import com.datadog.api.client.v2.model.LLMObsProjectRequest;
import com.datadog.api.client.v2.model.LLMObsProjectResponse;
import com.datadog.api.client.v2.model.LLMObsProjectUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsProjectsResponse;
import com.datadog.api.client.v2.model.LLMObsSearchSpansRequest;
import com.datadog.api.client.v2.model.LLMObsSpansResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
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
   * Aggregate LLM Observability experimentation.
   *
   * <p>See {@link #aggregateLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Analytics payload. (required)
   * @return LLMObsExperimentationAnalyticsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentationAnalyticsResponse aggregateLLMObsExperimentation(
      LLMObsExperimentationAnalyticsRequest body) throws ApiException {
    return aggregateLLMObsExperimentationWithHttpInfo(body).getData();
  }

  /**
   * Aggregate LLM Observability experimentation.
   *
   * <p>See {@link #aggregateLLMObsExperimentationWithHttpInfoAsync}.
   *
   * @param body Analytics payload. (required)
   * @return CompletableFuture&lt;LLMObsExperimentationAnalyticsResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentationAnalyticsResponse>
      aggregateLLMObsExperimentationAsync(LLMObsExperimentationAnalyticsRequest body) {
    return aggregateLLMObsExperimentationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Execute an analytics aggregation over LLM Observability experimentation data. Use this endpoint
   * to compute metrics (for example average eval scores) grouped by fields such as <code>span_id
   * </code> or <code>experiment_id</code>.
   *
   * <p>At least one <code>compute</code> definition and one <code>index</code> must be provided.
   *
   * @param body Analytics payload. (required)
   * @return ApiResponse&lt;LLMObsExperimentationAnalyticsResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsExperimentationAnalyticsResponse>
      aggregateLLMObsExperimentationWithHttpInfo(LLMObsExperimentationAnalyticsRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "aggregateLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateLLMObsExperimentation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/analytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.aggregateLLMObsExperimentation",
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
        new GenericType<LLMObsExperimentationAnalyticsResponse>() {});
  }

  /**
   * Aggregate LLM Observability experimentation.
   *
   * <p>See {@link #aggregateLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Analytics payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentationAnalyticsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentationAnalyticsResponse>>
      aggregateLLMObsExperimentationWithHttpInfoAsync(LLMObsExperimentationAnalyticsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "aggregateLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentationAnalyticsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentationAnalyticsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling aggregateLLMObsExperimentation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/analytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.aggregateLLMObsExperimentation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentationAnalyticsResponse>> result =
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
        new GenericType<LLMObsExperimentationAnalyticsResponse>() {});
  }

  /**
   * Batch update LLM Observability dataset records.
   *
   * <p>See {@link #batchUpdateLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Batch update payload. (required)
   * @return LLMObsDatasetRecordsMutationResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetRecordsMutationResponse batchUpdateLLMObsDataset(
      String projectId, String datasetId, LLMObsDatasetBatchUpdateRequest body)
      throws ApiException {
    return batchUpdateLLMObsDatasetWithHttpInfo(projectId, datasetId, body).getData();
  }

  /**
   * Batch update LLM Observability dataset records.
   *
   * <p>See {@link #batchUpdateLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Batch update payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetRecordsMutationResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetRecordsMutationResponse> batchUpdateLLMObsDatasetAsync(
      String projectId, String datasetId, LLMObsDatasetBatchUpdateRequest body) {
    return batchUpdateLLMObsDatasetWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Insert, update, and delete records in a single dataset operation. By default, a new dataset
   * version is created when the batch is applied.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Batch update payload. (required)
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
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetRecordsMutationResponse> batchUpdateLLMObsDatasetWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetBatchUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "batchUpdateLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling batchUpdateLLMObsDataset");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling batchUpdateLLMObsDataset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling batchUpdateLLMObsDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/batch_update"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.batchUpdateLLMObsDataset",
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
   * Batch update LLM Observability dataset records.
   *
   * <p>See {@link #batchUpdateLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Batch update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetRecordsMutationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>>
      batchUpdateLLMObsDatasetWithHttpInfoAsync(
          String projectId, String datasetId, LLMObsDatasetBatchUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "batchUpdateLLMObsDataset";
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
              "Missing the required parameter 'projectId' when calling batchUpdateLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling batchUpdateLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetRecordsMutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling batchUpdateLLMObsDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/batch_update"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.batchUpdateLLMObsDataset",
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
   * Clone an LLM Observability dataset.
   *
   * <p>See {@link #cloneLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the source LLM Observability dataset to clone. (required)
   * @param body Clone dataset payload. (required)
   * @return LLMObsDatasetResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetResponse cloneLLMObsDataset(
      String projectId, String datasetId, LLMObsDatasetCloneRequest body) throws ApiException {
    return cloneLLMObsDatasetWithHttpInfo(projectId, datasetId, body).getData();
  }

  /**
   * Clone an LLM Observability dataset.
   *
   * <p>See {@link #cloneLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the source LLM Observability dataset to clone. (required)
   * @param body Clone dataset payload. (required)
   * @return CompletableFuture&lt;LLMObsDatasetResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetResponse> cloneLLMObsDatasetAsync(
      String projectId, String datasetId, LLMObsDatasetCloneRequest body) {
    return cloneLLMObsDatasetWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Clone a dataset, copying its current records into a new dataset within the same project.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the source LLM Observability dataset to clone. (required)
   * @param body Clone dataset payload. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetResponse> cloneLLMObsDatasetWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetCloneRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cloneLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling cloneLLMObsDataset");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling cloneLLMObsDataset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling cloneLLMObsDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/clone"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.cloneLLMObsDataset",
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
   * Clone an LLM Observability dataset.
   *
   * <p>See {@link #cloneLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the source LLM Observability dataset to clone. (required)
   * @param body Clone dataset payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetResponse>> cloneLLMObsDatasetWithHttpInfoAsync(
      String projectId, String datasetId, LLMObsDatasetCloneRequest body) {
    // Check if unstable operation is enabled
    String operationId = "cloneLLMObsDataset";
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
              400, "Missing the required parameter 'projectId' when calling cloneLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling cloneLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling cloneLLMObsDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/clone"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.cloneLLMObsDataset",
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
   * Create an annotation queue. The <code>name</code> and <code>project_id</code> fields are
   * required. An optional <code>annotation_schema</code> can be provided to define the labels for
   * the queue. Fields such as <code>created_by</code>, <code>owned_by</code>, <code>created_at
   * </code>, <code>modified_by</code>, and <code>modified_at</code> are inferred by the backend.
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
   * Add one or more interactions to an annotation queue. At least one interaction must be provided.
   * Each interaction has a <code>type</code>:
   *
   * <ul>
   *   <li><code>trace</code>, <code>experiment_trace</code>, <code>session</code>: <code>content_id
   *       </code> references the upstream entity; the server fetches the actual content.
   *   <li><code>display_block</code>: omit <code>content_id</code> and provide the rendered content
   *       in <code>display_block</code>. The server generates <code>content_id</code> as a
   *       deterministic hash of the block list.
   * </ul>
   *
   * <p>Items of different types can be mixed in a single request.
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
   * Run an LLM inference.
   *
   * <p>See {@link #createLLMObsIntegrationInferenceWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @param body Inference request parameters. (required)
   * @return LLMObsIntegrationInferenceResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsIntegrationInferenceResponse createLLMObsIntegrationInference(
      LLMObsIntegrationName integration, String accountId, LLMObsIntegrationInferenceRequest body)
      throws ApiException {
    return createLLMObsIntegrationInferenceWithHttpInfo(integration, accountId, body).getData();
  }

  /**
   * Run an LLM inference.
   *
   * <p>See {@link #createLLMObsIntegrationInferenceWithHttpInfoAsync}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @param body Inference request parameters. (required)
   * @return CompletableFuture&lt;LLMObsIntegrationInferenceResponse&gt;
   */
  public CompletableFuture<LLMObsIntegrationInferenceResponse>
      createLLMObsIntegrationInferenceAsync(
          LLMObsIntegrationName integration,
          String accountId,
          LLMObsIntegrationInferenceRequest body) {
    return createLLMObsIntegrationInferenceWithHttpInfoAsync(integration, accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Run an LLM inference request through the specified integration and account, returning the model
   * response and token usage.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @param body Inference request parameters. (required)
   * @return ApiResponse&lt;LLMObsIntegrationInferenceResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsIntegrationInferenceResponse>
      createLLMObsIntegrationInferenceWithHttpInfo(
          LLMObsIntegrationName integration,
          String accountId,
          LLMObsIntegrationInferenceRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsIntegrationInference";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integration' when calling"
              + " createLLMObsIntegrationInference");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " createLLMObsIntegrationInference");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createLLMObsIntegrationInference");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/{account_id}/inference"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.createLLMObsIntegrationInference",
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
        new GenericType<LLMObsIntegrationInferenceResponse>() {});
  }

  /**
   * Run an LLM inference.
   *
   * <p>See {@link #createLLMObsIntegrationInferenceWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @param body Inference request parameters. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsIntegrationInferenceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>>
      createLLMObsIntegrationInferenceWithHttpInfoAsync(
          LLMObsIntegrationName integration,
          String accountId,
          LLMObsIntegrationInferenceRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createLLMObsIntegrationInference";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integration' when calling"
                  + " createLLMObsIntegrationInference"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " createLLMObsIntegrationInference"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createLLMObsIntegrationInference"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/{account_id}/inference"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.createLLMObsIntegrationInference",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsIntegrationInferenceResponse>> result =
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
        new GenericType<LLMObsIntegrationInferenceResponse>() {});
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
   * Delete LLM Observability data.
   *
   * <p>See {@link #deleteLLMObsDataWithHttpInfo}.
   *
   * @param body Data deletion request payload. (required)
   * @return LLMObsDataDeletionResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDataDeletionResponse deleteLLMObsData(LLMObsDataDeletionRequest body)
      throws ApiException {
    return deleteLLMObsDataWithHttpInfo(body).getData();
  }

  /**
   * Delete LLM Observability data.
   *
   * <p>See {@link #deleteLLMObsDataWithHttpInfoAsync}.
   *
   * @param body Data deletion request payload. (required)
   * @return CompletableFuture&lt;LLMObsDataDeletionResponse&gt;
   */
  public CompletableFuture<LLMObsDataDeletionResponse> deleteLLMObsDataAsync(
      LLMObsDataDeletionRequest body) {
    return deleteLLMObsDataWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit a request to delete LLM Observability span data matching a trace ID filter within a
   * specified time range.
   *
   * @param body Data deletion request payload. (required)
   * @return ApiResponse&lt;LLMObsDataDeletionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDataDeletionResponse> deleteLLMObsDataWithHttpInfo(
      LLMObsDataDeletionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsData";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteLLMObsData");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/deletion/data/llmobs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.deleteLLMObsData",
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
        new GenericType<LLMObsDataDeletionResponse>() {});
  }

  /**
   * Delete LLM Observability data.
   *
   * <p>See {@link #deleteLLMObsDataWithHttpInfo}.
   *
   * @param body Data deletion request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDataDeletionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDataDeletionResponse>>
      deleteLLMObsDataWithHttpInfoAsync(LLMObsDataDeletionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteLLMObsData";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDataDeletionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsDataDeletionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteLLMObsData"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/deletion/data/llmobs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.deleteLLMObsData",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDataDeletionResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsDataDeletionResponse>() {});
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

  /** Manage optional parameters to exportLLMObsDataset. */
  public static class ExportLLMObsDatasetOptionalParameters {
    private LLMObsDatasetExportFormat format;
    private Long version;

    /**
     * Set format.
     *
     * @param format Export format for the dataset contents. Only <code>csv</code> is currently
     *     supported. (optional, default to "csv")
     * @return ExportLLMObsDatasetOptionalParameters
     */
    public ExportLLMObsDatasetOptionalParameters format(LLMObsDatasetExportFormat format) {
      this.format = format;
      return this;
    }

    /**
     * Set version.
     *
     * @param version Version of the dataset to export. If omitted, the current version is used.
     *     Must be between 0 and the current version of the dataset, inclusive. (optional)
     * @return ExportLLMObsDatasetOptionalParameters
     */
    public ExportLLMObsDatasetOptionalParameters version(Long version) {
      this.version = version;
      return this;
    }
  }

  /**
   * Export an LLM Observability dataset.
   *
   * <p>See {@link #exportLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String exportLLMObsDataset(String projectId, String datasetId) throws ApiException {
    return exportLLMObsDatasetWithHttpInfo(
            projectId, datasetId, new ExportLLMObsDatasetOptionalParameters())
        .getData();
  }

  /**
   * Export an LLM Observability dataset.
   *
   * <p>See {@link #exportLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;String&gt;
   */
  public CompletableFuture<String> exportLLMObsDatasetAsync(String projectId, String datasetId) {
    return exportLLMObsDatasetWithHttpInfoAsync(
            projectId, datasetId, new ExportLLMObsDatasetOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Export an LLM Observability dataset.
   *
   * <p>See {@link #exportLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String exportLLMObsDataset(
      String projectId, String datasetId, ExportLLMObsDatasetOptionalParameters parameters)
      throws ApiException {
    return exportLLMObsDatasetWithHttpInfo(projectId, datasetId, parameters).getData();
  }

  /**
   * Export an LLM Observability dataset.
   *
   * <p>See {@link #exportLLMObsDatasetWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;String&gt;
   */
  public CompletableFuture<String> exportLLMObsDatasetAsync(
      String projectId, String datasetId, ExportLLMObsDatasetOptionalParameters parameters) {
    return exportLLMObsDatasetWithHttpInfoAsync(projectId, datasetId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Download the contents of a dataset as a CSV file. The download is streamed and includes one row
   * per dataset record.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;String&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<String> exportLLMObsDatasetWithHttpInfo(
      String projectId, String datasetId, ExportLLMObsDatasetOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "exportLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling exportLLMObsDataset");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling exportLLMObsDataset");
    }
    LLMObsDatasetExportFormat format = parameters.format;
    Long version = parameters.version;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/export"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.exportLLMObsDataset",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/csv", "application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Export an LLM Observability dataset.
   *
   * <p>See {@link #exportLLMObsDatasetWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;String&gt;&gt;
   */
  public CompletableFuture<ApiResponse<String>> exportLLMObsDatasetWithHttpInfoAsync(
      String projectId, String datasetId, ExportLLMObsDatasetOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "exportLLMObsDataset";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling exportLLMObsDataset"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling exportLLMObsDataset"));
      return result;
    }
    LLMObsDatasetExportFormat format = parameters.format;
    Long version = parameters.version;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/export"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.exportLLMObsDataset",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/csv", "application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Retrieve all interactions (traces and sessions) and their annotations for a given annotation
   * queue.
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

  /** Manage optional parameters to getLLMObsAnnotatedInteractionsByTraceIDs. */
  public static class GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters {
    private Integer offset;
    private Integer limit;

    /**
     * Set offset.
     *
     * @param offset Pagination offset. Must be &gt;= 0. Defaults to 0. (optional, default to 0)
     * @return GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters
     */
    public GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters offset(Integer offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of results to return. Must be &gt; 0. Defaults to 100. (optional,
     *     default to 100)
     * @return GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters
     */
    public GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Get annotated interactions by content IDs.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo}.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @return LLMObsAnnotatedInteractionsByTraceResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotatedInteractionsByTraceResponse getLLMObsAnnotatedInteractionsByTraceIDs(
      List<String> contentIds) throws ApiException {
    return getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo(
            contentIds, new GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters())
        .getData();
  }

  /**
   * Get annotated interactions by content IDs.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfoAsync}.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @return CompletableFuture&lt;LLMObsAnnotatedInteractionsByTraceResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotatedInteractionsByTraceResponse>
      getLLMObsAnnotatedInteractionsByTraceIDsAsync(List<String> contentIds) {
    return getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfoAsync(
            contentIds, new GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get annotated interactions by content IDs.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo}.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @param parameters Optional parameters for the request.
   * @return LLMObsAnnotatedInteractionsByTraceResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotatedInteractionsByTraceResponse getLLMObsAnnotatedInteractionsByTraceIDs(
      List<String> contentIds,
      GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters parameters)
      throws ApiException {
    return getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo(contentIds, parameters).getData();
  }

  /**
   * Get annotated interactions by content IDs.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfoAsync}.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsAnnotatedInteractionsByTraceResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotatedInteractionsByTraceResponse>
      getLLMObsAnnotatedInteractionsByTraceIDsAsync(
          List<String> contentIds,
          GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters parameters) {
    return getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfoAsync(contentIds, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns annotated interactions across all annotation queues for the given content IDs. Results
   * include queue metadata (ID and name) for each interaction.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsAnnotatedInteractionsByTraceResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsAnnotatedInteractionsByTraceResponse>
      getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo(
          List<String> contentIds,
          GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotatedInteractionsByTraceIDs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'contentIds' is set
    if (contentIds == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'contentIds' when calling"
              + " getLLMObsAnnotatedInteractionsByTraceIDs");
    }
    Integer offset = parameters.offset;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotated-interactions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contentIds", contentIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.getLLMObsAnnotatedInteractionsByTraceIDs",
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
        new GenericType<LLMObsAnnotatedInteractionsByTraceResponse>() {});
  }

  /**
   * Get annotated interactions by content IDs.
   *
   * <p>See {@link #getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfo}.
   *
   * @param contentIds One or more content IDs to retrieve annotated interactions for. At least one
   *     is required. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotatedInteractionsByTraceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsByTraceResponse>>
      getLLMObsAnnotatedInteractionsByTraceIDsWithHttpInfoAsync(
          List<String> contentIds,
          GetLLMObsAnnotatedInteractionsByTraceIDsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotatedInteractionsByTraceIDs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsByTraceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'contentIds' is set
    if (contentIds == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsByTraceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'contentIds' when calling"
                  + " getLLMObsAnnotatedInteractionsByTraceIDs"));
      return result;
    }
    Integer offset = parameters.offset;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/annotated-interactions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contentIds", contentIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.getLLMObsAnnotatedInteractionsByTraceIDs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotatedInteractionsByTraceResponse>> result =
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
        new GenericType<LLMObsAnnotatedInteractionsByTraceResponse>() {});
  }

  /**
   * Get annotation queue label schema.
   *
   * <p>See {@link #getLLMObsAnnotationQueueLabelSchemaWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return LLMObsAnnotationQueueLabelSchemaResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueueLabelSchemaResponse getLLMObsAnnotationQueueLabelSchema(
      String queueId) throws ApiException {
    return getLLMObsAnnotationQueueLabelSchemaWithHttpInfo(queueId).getData();
  }

  /**
   * Get annotation queue label schema.
   *
   * <p>See {@link #getLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueueLabelSchemaResponse>
      getLLMObsAnnotationQueueLabelSchemaAsync(String queueId) {
    return getLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync(queueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the label schema for a given annotation queue.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return ApiResponse&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>
      getLLMObsAnnotationQueueLabelSchemaWithHttpInfo(String queueId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotationQueueLabelSchema";
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
          "Missing the required parameter 'queueId' when calling"
              + " getLLMObsAnnotationQueueLabelSchema");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/label-schema"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.getLLMObsAnnotationQueueLabelSchema",
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
        new GenericType<LLMObsAnnotationQueueLabelSchemaResponse>() {});
  }

  /**
   * Get annotation queue label schema.
   *
   * <p>See {@link #getLLMObsAnnotationQueueLabelSchemaWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>>
      getLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync(String queueId) {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsAnnotationQueueLabelSchema";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling"
                  + " getLLMObsAnnotationQueueLabelSchema"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/label-schema"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.getLLMObsAnnotationQueueLabelSchema",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
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
        new GenericType<LLMObsAnnotationQueueLabelSchemaResponse>() {});
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

  /**
   * Get LLM Observability dataset draft state.
   *
   * <p>See {@link #getLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return LLMObsDatasetDraftStateResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetDraftStateResponse getLLMObsDatasetDraftState(
      String projectId, String datasetId) throws ApiException {
    return getLLMObsDatasetDraftStateWithHttpInfo(projectId, datasetId).getData();
  }

  /**
   * Get LLM Observability dataset draft state.
   *
   * <p>See {@link #getLLMObsDatasetDraftStateWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;LLMObsDatasetDraftStateResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetDraftStateResponse> getLLMObsDatasetDraftStateAsync(
      String projectId, String datasetId) {
    return getLLMObsDatasetDraftStateWithHttpInfoAsync(projectId, datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the draft state of a dataset, including whether it is currently locked for editing and
   * which user holds the lock.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return ApiResponse&lt;LLMObsDatasetDraftStateResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetDraftStateResponse> getLLMObsDatasetDraftStateWithHttpInfo(
      String projectId, String datasetId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling getLLMObsDatasetDraftState");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling getLLMObsDatasetDraftState");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.getLLMObsDatasetDraftState",
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
        new GenericType<LLMObsDatasetDraftStateResponse>() {});
  }

  /**
   * Get LLM Observability dataset draft state.
   *
   * <p>See {@link #getLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetDraftStateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>>
      getLLMObsDatasetDraftStateWithHttpInfoAsync(String projectId, String datasetId) {
    // Check if unstable operation is enabled
    String operationId = "getLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " getLLMObsDatasetDraftState"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " getLLMObsDatasetDraftState"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.getLLMObsDatasetDraftState",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
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
        new GenericType<LLMObsDatasetDraftStateResponse>() {});
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

  /**
   * List LLM Observability dataset versions.
   *
   * <p>See {@link #listLLMObsDatasetVersionsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return LLMObsDatasetVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetVersionsResponse listLLMObsDatasetVersions(String projectId, String datasetId)
      throws ApiException {
    return listLLMObsDatasetVersionsWithHttpInfo(projectId, datasetId).getData();
  }

  /**
   * List LLM Observability dataset versions.
   *
   * <p>See {@link #listLLMObsDatasetVersionsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;LLMObsDatasetVersionsResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetVersionsResponse> listLLMObsDatasetVersionsAsync(
      String projectId, String datasetId) {
    return listLLMObsDatasetVersionsWithHttpInfoAsync(projectId, datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the active versions of a dataset. A version is created each time a dataset is referenced
   * by an experiment run.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return ApiResponse&lt;LLMObsDatasetVersionsResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetVersionsResponse> listLLMObsDatasetVersionsWithHttpInfo(
      String projectId, String datasetId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasetVersions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling listLLMObsDatasetVersions");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling listLLMObsDatasetVersions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/versions"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsDatasetVersions",
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
        new GenericType<LLMObsDatasetVersionsResponse>() {});
  }

  /**
   * List LLM Observability dataset versions.
   *
   * <p>See {@link #listLLMObsDatasetVersionsWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetVersionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetVersionsResponse>>
      listLLMObsDatasetVersionsWithHttpInfoAsync(String projectId, String datasetId) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsDatasetVersions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetVersionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetVersionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling listLLMObsDatasetVersions"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetVersionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling listLLMObsDatasetVersions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/versions"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsDatasetVersions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetVersionsResponse>> result =
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
        new GenericType<LLMObsDatasetVersionsResponse>() {});
  }

  /** Manage optional parameters to listLLMObsExperimentEvents. */
  public static class ListLLMObsExperimentEventsOptionalParameters {
    private Long pageLimit;
    private String pageCursor;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of spans to return per page. Defaults to 5000. (optional,
     *     default to 5000)
     * @return ListLLMObsExperimentEventsOptionalParameters
     */
    public ListLLMObsExperimentEventsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Opaque cursor from a previous response to fetch the next page of results.
     *     (optional)
     * @return ListLLMObsExperimentEventsOptionalParameters
     */
    public ListLLMObsExperimentEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * List events for an LLM Observability experiment.
   *
   * <p>See {@link #listLLMObsExperimentEventsWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return LLMObsExperimentEventsV2Response
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentEventsV2Response listLLMObsExperimentEvents(String experimentId)
      throws ApiException {
    return listLLMObsExperimentEventsWithHttpInfo(
            experimentId, new ListLLMObsExperimentEventsOptionalParameters())
        .getData();
  }

  /**
   * List events for an LLM Observability experiment.
   *
   * <p>See {@link #listLLMObsExperimentEventsWithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return CompletableFuture&lt;LLMObsExperimentEventsV2Response&gt;
   */
  public CompletableFuture<LLMObsExperimentEventsV2Response> listLLMObsExperimentEventsAsync(
      String experimentId) {
    return listLLMObsExperimentEventsWithHttpInfoAsync(
            experimentId, new ListLLMObsExperimentEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List events for an LLM Observability experiment.
   *
   * <p>See {@link #listLLMObsExperimentEventsWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return LLMObsExperimentEventsV2Response
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentEventsV2Response listLLMObsExperimentEvents(
      String experimentId, ListLLMObsExperimentEventsOptionalParameters parameters)
      throws ApiException {
    return listLLMObsExperimentEventsWithHttpInfo(experimentId, parameters).getData();
  }

  /**
   * List events for an LLM Observability experiment.
   *
   * <p>See {@link #listLLMObsExperimentEventsWithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsExperimentEventsV2Response&gt;
   */
  public CompletableFuture<LLMObsExperimentEventsV2Response> listLLMObsExperimentEventsAsync(
      String experimentId, ListLLMObsExperimentEventsOptionalParameters parameters) {
    return listLLMObsExperimentEventsWithHttpInfoAsync(experimentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve spans and experiment-level summary metrics for a given experiment with cursor-based
   * pagination.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsExperimentEventsV2Response&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsExperimentEventsV2Response> listLLMObsExperimentEventsWithHttpInfo(
      String experimentId, ListLLMObsExperimentEventsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEvents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling listLLMObsExperimentEvents");
    }
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v3/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsExperimentEvents",
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
        new GenericType<LLMObsExperimentEventsV2Response>() {});
  }

  /**
   * List events for an LLM Observability experiment.
   *
   * <p>See {@link #listLLMObsExperimentEventsWithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentEventsV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>>
      listLLMObsExperimentEventsWithHttpInfoAsync(
          String experimentId, ListLLMObsExperimentEventsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEvents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " listLLMObsExperimentEvents"));
      return result;
    }
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v3/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsExperimentEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
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
        new GenericType<LLMObsExperimentEventsV2Response>() {});
  }

  /**
   * List LLM Observability experiment spans (v1).
   *
   * <p>See {@link #listLLMObsExperimentEventsV1WithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return LLMObsExperimentSpansResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public LLMObsExperimentSpansResponse listLLMObsExperimentEventsV1(String experimentId)
      throws ApiException {
    return listLLMObsExperimentEventsV1WithHttpInfo(experimentId).getData();
  }

  /**
   * List LLM Observability experiment spans (v1).
   *
   * <p>See {@link #listLLMObsExperimentEventsV1WithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return CompletableFuture&lt;LLMObsExperimentSpansResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<LLMObsExperimentSpansResponse> listLLMObsExperimentEventsV1Async(
      String experimentId) {
    return listLLMObsExperimentEventsV1WithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve spans with their evaluation metrics for a given experiment. Returns spans only, with
   * no summary metrics and no pagination. Deprecated in favor of <code>ListLLMObsExperimentEventsV3
   * </code>.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return ApiResponse&lt;LLMObsExperimentSpansResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<LLMObsExperimentSpansResponse> listLLMObsExperimentEventsV1WithHttpInfo(
      String experimentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEventsV1";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling"
              + " listLLMObsExperimentEventsV1");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsExperimentEventsV1",
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
        new GenericType<LLMObsExperimentSpansResponse>() {});
  }

  /**
   * List LLM Observability experiment spans (v1).
   *
   * <p>See {@link #listLLMObsExperimentEventsV1WithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentSpansResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<LLMObsExperimentSpansResponse>>
      listLLMObsExperimentEventsV1WithHttpInfoAsync(String experimentId) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEventsV1";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentSpansResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentSpansResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " listLLMObsExperimentEventsV1"));
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
              "v2.LlmObservabilityApi.listLLMObsExperimentEventsV1",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentSpansResponse>> result =
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
        new GenericType<LLMObsExperimentSpansResponse>() {});
  }

  /**
   * List LLM Observability experiment events (v2).
   *
   * <p>See {@link #listLLMObsExperimentEventsV2WithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return LLMObsExperimentEventsV2Response
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public LLMObsExperimentEventsV2Response listLLMObsExperimentEventsV2(String experimentId)
      throws ApiException {
    return listLLMObsExperimentEventsV2WithHttpInfo(experimentId).getData();
  }

  /**
   * List LLM Observability experiment events (v2).
   *
   * <p>See {@link #listLLMObsExperimentEventsV2WithHttpInfoAsync}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return CompletableFuture&lt;LLMObsExperimentEventsV2Response&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<LLMObsExperimentEventsV2Response> listLLMObsExperimentEventsV2Async(
      String experimentId) {
    return listLLMObsExperimentEventsV2WithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve spans and experiment-level summary metrics for a given experiment. Returns the full
   * events payload without pagination. Deprecated: use <code>ListLLMObsExperimentEventsV3</code>
   * instead.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return ApiResponse&lt;LLMObsExperimentEventsV2Response&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<LLMObsExperimentEventsV2Response> listLLMObsExperimentEventsV2WithHttpInfo(
      String experimentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEventsV2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling"
              + " listLLMObsExperimentEventsV2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v2/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsExperimentEventsV2",
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
        new GenericType<LLMObsExperimentEventsV2Response>() {});
  }

  /**
   * List LLM Observability experiment events (v2).
   *
   * <p>See {@link #listLLMObsExperimentEventsV2WithHttpInfo}.
   *
   * @param experimentId The ID of the LLM Observability experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentEventsV2Response&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>>
      listLLMObsExperimentEventsV2WithHttpInfoAsync(String experimentId) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsExperimentEventsV2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " listLLMObsExperimentEventsV2"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v2/experiments/{experiment_id}/events"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsExperimentEventsV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentEventsV2Response>> result =
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
        new GenericType<LLMObsExperimentEventsV2Response>() {});
  }

  /** Manage optional parameters to listLLMObsExperiments. */
  public static class ListLLMObsExperimentsOptionalParameters {
    private String filterProjectId;
    private String filterDatasetId;
    private String filterId;
    private String filterName;
    private String filterExperiment;
    private String filterMetadata;
    private String filterParentExperimentId;
    private Boolean filterIsDeleted;
    private Boolean includeUserData;
    private Boolean includeDatasetNames;
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
     * Set filterName.
     *
     * @param filterName Filter experiments by their exact run name. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterExperiment.
     *
     * @param filterExperiment Filter by logical experiment name. This is the <code>name</code>
     *     field set when creating an experiment through <code>POST /experiments</code>. Returns all
     *     experiment runs that share the same name, enabling cross-commit and cross-branch
     *     comparisons. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterExperiment(String filterExperiment) {
      this.filterExperiment = filterExperiment;
      return this;
    }

    /**
     * Set filterMetadata.
     *
     * @param filterMetadata Filter by JSONB metadata containment. Provide a JSON object string
     *     where experiments whose metadata contains all specified key-value pairs are returned. For
     *     example: <code>{"commit":"abc123","branch":"main"}</code>. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterMetadata(String filterMetadata) {
      this.filterMetadata = filterMetadata;
      return this;
    }

    /**
     * Set filterParentExperimentId.
     *
     * @param filterParentExperimentId Filter experiments by the ID of their parent (baseline)
     *     experiment. Returns all experiments that were run against the given baseline. Can be
     *     specified multiple times. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterParentExperimentId(
        String filterParentExperimentId) {
      this.filterParentExperimentId = filterParentExperimentId;
      return this;
    }

    /**
     * Set filterIsDeleted.
     *
     * @param filterIsDeleted When <code>true</code>, return only soft-deleted experiments. Defaults
     *     to <code>false</code>. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters filterIsDeleted(Boolean filterIsDeleted) {
      this.filterIsDeleted = filterIsDeleted;
      return this;
    }

    /**
     * Set includeUserData.
     *
     * @param includeUserData When <code>true</code>, enrich each experiment with its author's user
     *     data in the <code>author</code> field. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters includeUserData(Boolean includeUserData) {
      this.includeUserData = includeUserData;
      return this;
    }

    /**
     * Set includeDatasetNames.
     *
     * @param includeDatasetNames When <code>true</code>, enrich each experiment with its dataset
     *     name in the <code>dataset_name</code> field. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters includeDatasetNames(
        Boolean includeDatasetNames) {
      this.includeDatasetNames = includeDatasetNames;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Use the pagination cursor returned in <code>meta.after</code> to retrieve
     *     the next page of results. (optional)
     * @return ListLLMObsExperimentsOptionalParameters
     */
    public ListLLMObsExperimentsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return per page. Values above 5000 are clamped
     *     to 5000. Defaults to 5000. (optional)
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
    String filterName = parameters.filterName;
    String filterExperiment = parameters.filterExperiment;
    String filterMetadata = parameters.filterMetadata;
    String filterParentExperimentId = parameters.filterParentExperimentId;
    Boolean filterIsDeleted = parameters.filterIsDeleted;
    Boolean includeUserData = parameters.includeUserData;
    Boolean includeDatasetNames = parameters.includeDatasetNames;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[experiment]", filterExperiment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metadata]", filterMetadata));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_experiment_id]", filterParentExperimentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[is_deleted]", filterIsDeleted));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[user_data]", includeUserData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[dataset_names]", includeDatasetNames));
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
    String filterName = parameters.filterName;
    String filterExperiment = parameters.filterExperiment;
    String filterMetadata = parameters.filterMetadata;
    String filterParentExperimentId = parameters.filterParentExperimentId;
    Boolean filterIsDeleted = parameters.filterIsDeleted;
    Boolean includeUserData = parameters.includeUserData;
    Boolean includeDatasetNames = parameters.includeDatasetNames;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[experiment]", filterExperiment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[metadata]", filterMetadata));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_experiment_id]", filterParentExperimentId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[is_deleted]", filterIsDeleted));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[user_data]", includeUserData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[dataset_names]", includeDatasetNames));
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

  /**
   * List LLM integration accounts.
   *
   * <p>See {@link #listLLMObsIntegrationAccountsWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @return List&lt;LLMObsIntegrationAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LLMObsIntegrationAccount> listLLMObsIntegrationAccounts(
      LLMObsIntegrationName integration) throws ApiException {
    return listLLMObsIntegrationAccountsWithHttpInfo(integration).getData();
  }

  /**
   * List LLM integration accounts.
   *
   * <p>See {@link #listLLMObsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param integration The name of the LLM integration. (required)
   * @return CompletableFuture&lt;List&lt;LLMObsIntegrationAccount&gt;&gt;
   */
  public CompletableFuture<List<LLMObsIntegrationAccount>> listLLMObsIntegrationAccountsAsync(
      LLMObsIntegrationName integration) {
    return listLLMObsIntegrationAccountsWithHttpInfoAsync(integration)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of configured accounts for the specified LLM provider integration.
   *
   * @param integration The name of the LLM integration. (required)
   * @return ApiResponse&lt;List&lt;LLMObsIntegrationAccount&gt;&gt;
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
  public ApiResponse<List<LLMObsIntegrationAccount>> listLLMObsIntegrationAccountsWithHttpInfo(
      LLMObsIntegrationName integration) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integration' when calling"
              + " listLLMObsIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/accounts"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsIntegrationAccounts",
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
        new GenericType<List<LLMObsIntegrationAccount>>() {});
  }

  /**
   * List LLM integration accounts.
   *
   * <p>See {@link #listLLMObsIntegrationAccountsWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;LLMObsIntegrationAccount&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<LLMObsIntegrationAccount>>>
      listLLMObsIntegrationAccountsWithHttpInfoAsync(LLMObsIntegrationName integration) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationAccount>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationAccount>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integration' when calling"
                  + " listLLMObsIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/accounts"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationAccount>>> result =
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
        new GenericType<List<LLMObsIntegrationAccount>>() {});
  }

  /**
   * List LLM integration models.
   *
   * <p>See {@link #listLLMObsIntegrationModelsWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @return List&lt;LLMObsIntegrationModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LLMObsIntegrationModel> listLLMObsIntegrationModels(
      LLMObsIntegrationName integration, String accountId) throws ApiException {
    return listLLMObsIntegrationModelsWithHttpInfo(integration, accountId).getData();
  }

  /**
   * List LLM integration models.
   *
   * <p>See {@link #listLLMObsIntegrationModelsWithHttpInfoAsync}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @return CompletableFuture&lt;List&lt;LLMObsIntegrationModel&gt;&gt;
   */
  public CompletableFuture<List<LLMObsIntegrationModel>> listLLMObsIntegrationModelsAsync(
      LLMObsIntegrationName integration, String accountId) {
    return listLLMObsIntegrationModelsWithHttpInfoAsync(integration, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of models available for the specified LLM provider integration and account.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @return ApiResponse&lt;List&lt;LLMObsIntegrationModel&gt;&gt;
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
  public ApiResponse<List<LLMObsIntegrationModel>> listLLMObsIntegrationModelsWithHttpInfo(
      LLMObsIntegrationName integration, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsIntegrationModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integration' when calling listLLMObsIntegrationModels");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling listLLMObsIntegrationModels");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/{account_id}/models"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsIntegrationModels",
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
        new GenericType<List<LLMObsIntegrationModel>>() {});
  }

  /**
   * List LLM integration models.
   *
   * <p>See {@link #listLLMObsIntegrationModelsWithHttpInfo}.
   *
   * @param integration The name of the LLM integration. (required)
   * @param accountId The ID of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;LLMObsIntegrationModel&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<LLMObsIntegrationModel>>>
      listLLMObsIntegrationModelsWithHttpInfoAsync(
          LLMObsIntegrationName integration, String accountId) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsIntegrationModels";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationModel>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integration' is set
    if (integration == null) {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationModel>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integration' when calling"
                  + " listLLMObsIntegrationModels"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationModel>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " listLLMObsIntegrationModels"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/integrations/{integration}/{account_id}/models"
            .replaceAll(
                "\\{" + "integration" + "\\}", apiClient.escapeString(integration.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsIntegrationModels",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<LLMObsIntegrationModel>>> result =
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
        new GenericType<List<LLMObsIntegrationModel>>() {});
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

  /** Manage optional parameters to listLLMObsSpans. */
  public static class ListLLMObsSpansOptionalParameters {
    private String filterFrom;
    private String filterTo;
    private String filterQuery;
    private String filterSpanId;
    private String filterTraceId;
    private String filterSpanKind;
    private String filterSpanName;
    private String filterMlApp;
    private Long pageLimit;
    private String pageCursor;
    private String sort;
    private Boolean includeAttachments;

    /**
     * Set filterFrom.
     *
     * @param filterFrom Start of the time range. Accepts ISO 8601 or relative format (e.g., <code>
     *     now-15m</code>). Defaults to <code>now-15m</code>. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo End of the time range. Accepts ISO 8601 or relative format. Defaults to
     *     <code>now</code>. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query using LLM Observability query syntax. Supports attribute
     *     filters using the field:value syntax (e.g. session_id, trace_id, ml_app, meta.span.kind).
     *     When provided, structured field filters (<code>filter[span_id]</code>, <code>
     *     filter[trace_id]</code>, etc.) are ignored. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterSpanId.
     *
     * @param filterSpanId Filter by exact span ID. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterSpanId(String filterSpanId) {
      this.filterSpanId = filterSpanId;
      return this;
    }

    /**
     * Set filterTraceId.
     *
     * @param filterTraceId Filter by exact trace ID. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterTraceId(String filterTraceId) {
      this.filterTraceId = filterTraceId;
      return this;
    }

    /**
     * Set filterSpanKind.
     *
     * @param filterSpanKind Filter by span kind (e.g., llm, agent, tool, task, workflow).
     *     (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterSpanKind(String filterSpanKind) {
      this.filterSpanKind = filterSpanKind;
      return this;
    }

    /**
     * Set filterSpanName.
     *
     * @param filterSpanName Filter by span name. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterSpanName(String filterSpanName) {
      this.filterSpanName = filterSpanName;
      return this;
    }

    /**
     * Set filterMlApp.
     *
     * @param filterMlApp Filter by ML application name. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters filterMlApp(String filterMlApp) {
      this.filterMlApp = filterMlApp;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of spans to return. Defaults to <code>10</code>. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Cursor from the previous response to retrieve the next page. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort order for the results. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set includeAttachments.
     *
     * @param includeAttachments Whether to include attachment data in the response. Defaults to
     *     <code>true</code>. (optional)
     * @return ListLLMObsSpansOptionalParameters
     */
    public ListLLMObsSpansOptionalParameters includeAttachments(Boolean includeAttachments) {
      this.includeAttachments = includeAttachments;
      return this;
    }
  }

  /**
   * List LLM Observability spans.
   *
   * <p>See {@link #listLLMObsSpansWithHttpInfo}.
   *
   * @return LLMObsSpansResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsSpansResponse listLLMObsSpans() throws ApiException {
    return listLLMObsSpansWithHttpInfo(new ListLLMObsSpansOptionalParameters()).getData();
  }

  /**
   * List LLM Observability spans.
   *
   * <p>See {@link #listLLMObsSpansWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LLMObsSpansResponse&gt;
   */
  public CompletableFuture<LLMObsSpansResponse> listLLMObsSpansAsync() {
    return listLLMObsSpansWithHttpInfoAsync(new ListLLMObsSpansOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability spans.
   *
   * <p>See {@link #listLLMObsSpansWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LLMObsSpansResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsSpansResponse listLLMObsSpans(ListLLMObsSpansOptionalParameters parameters)
      throws ApiException {
    return listLLMObsSpansWithHttpInfo(parameters).getData();
  }

  /**
   * List LLM Observability spans.
   *
   * <p>See {@link #listLLMObsSpansWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LLMObsSpansResponse&gt;
   */
  public CompletableFuture<LLMObsSpansResponse> listLLMObsSpansAsync(
      ListLLMObsSpansOptionalParameters parameters) {
    return listLLMObsSpansWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List LLM Observability spans matching the specified filters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LLMObsSpansResponse&gt;
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
  public ApiResponse<LLMObsSpansResponse> listLLMObsSpansWithHttpInfo(
      ListLLMObsSpansOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsSpans";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterQuery = parameters.filterQuery;
    String filterSpanId = parameters.filterSpanId;
    String filterTraceId = parameters.filterTraceId;
    String filterSpanKind = parameters.filterSpanKind;
    String filterSpanName = parameters.filterSpanName;
    String filterMlApp = parameters.filterMlApp;
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    String sort = parameters.sort;
    Boolean includeAttachments = parameters.includeAttachments;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/spans/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_id]", filterSpanId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[trace_id]", filterTraceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_kind]", filterSpanKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_name]", filterSpanName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ml_app]", filterMlApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_attachments", includeAttachments));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.listLLMObsSpans",
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
        new GenericType<LLMObsSpansResponse>() {});
  }

  /**
   * List LLM Observability spans.
   *
   * <p>See {@link #listLLMObsSpansWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsSpansResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsSpansResponse>> listLLMObsSpansWithHttpInfoAsync(
      ListLLMObsSpansOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listLLMObsSpans";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterQuery = parameters.filterQuery;
    String filterSpanId = parameters.filterSpanId;
    String filterTraceId = parameters.filterTraceId;
    String filterSpanKind = parameters.filterSpanKind;
    String filterSpanName = parameters.filterSpanName;
    String filterMlApp = parameters.filterMlApp;
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    String sort = parameters.sort;
    Boolean includeAttachments = parameters.includeAttachments;
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/spans/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_id]", filterSpanId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[trace_id]", filterTraceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_kind]", filterSpanKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[span_name]", filterSpanName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ml_app]", filterMlApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_attachments", includeAttachments));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.listLLMObsSpans",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsSpansResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsSpansResponse>() {});
  }

  /**
   * Lock LLM Observability dataset draft state.
   *
   * <p>See {@link #lockLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return LLMObsDatasetDraftStateResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsDatasetDraftStateResponse lockLLMObsDatasetDraftState(
      String projectId, String datasetId) throws ApiException {
    return lockLLMObsDatasetDraftStateWithHttpInfo(projectId, datasetId).getData();
  }

  /**
   * Lock LLM Observability dataset draft state.
   *
   * <p>See {@link #lockLLMObsDatasetDraftStateWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;LLMObsDatasetDraftStateResponse&gt;
   */
  public CompletableFuture<LLMObsDatasetDraftStateResponse> lockLLMObsDatasetDraftStateAsync(
      String projectId, String datasetId) {
    return lockLLMObsDatasetDraftStateWithHttpInfoAsync(projectId, datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Acquire the draft lock on a dataset for the calling user. The lock prevents other users from
   * concurrently editing the dataset draft.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return ApiResponse&lt;LLMObsDatasetDraftStateResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsDatasetDraftStateResponse> lockLLMObsDatasetDraftStateWithHttpInfo(
      String projectId, String datasetId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "lockLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling lockLLMObsDatasetDraftState");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling lockLLMObsDatasetDraftState");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state/lock"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.lockLLMObsDatasetDraftState",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LLMObsDatasetDraftStateResponse>() {});
  }

  /**
   * Lock LLM Observability dataset draft state.
   *
   * <p>See {@link #lockLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsDatasetDraftStateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>>
      lockLLMObsDatasetDraftStateWithHttpInfoAsync(String projectId, String datasetId) {
    // Check if unstable operation is enabled
    String operationId = "lockLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " lockLLMObsDatasetDraftState"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " lockLLMObsDatasetDraftState"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state/lock"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.lockLLMObsDatasetDraftState",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsDatasetDraftStateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LLMObsDatasetDraftStateResponse>() {});
  }

  /**
   * Restore an LLM Observability dataset version.
   *
   * <p>See {@link #restoreLLMObsDatasetVersionWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Restore dataset version payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreLLMObsDatasetVersion(
      String projectId, String datasetId, LLMObsDatasetRestoreVersionRequest body)
      throws ApiException {
    restoreLLMObsDatasetVersionWithHttpInfo(projectId, datasetId, body);
  }

  /**
   * Restore an LLM Observability dataset version.
   *
   * <p>See {@link #restoreLLMObsDatasetVersionWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Restore dataset version payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> restoreLLMObsDatasetVersionAsync(
      String projectId, String datasetId, LLMObsDatasetRestoreVersionRequest body) {
    return restoreLLMObsDatasetVersionWithHttpInfoAsync(projectId, datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore a dataset to a previous version. The dataset's current version is bumped, and its
   * records are replaced with the records from the specified prior version.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Restore dataset version payload. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> restoreLLMObsDatasetVersionWithHttpInfo(
      String projectId, String datasetId, LLMObsDatasetRestoreVersionRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "restoreLLMObsDatasetVersion";
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
          "Missing the required parameter 'projectId' when calling restoreLLMObsDatasetVersion");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling restoreLLMObsDatasetVersion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling restoreLLMObsDatasetVersion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/restore"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.restoreLLMObsDatasetVersion",
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
   * Restore an LLM Observability dataset version.
   *
   * <p>See {@link #restoreLLMObsDatasetVersionWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param body Restore dataset version payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> restoreLLMObsDatasetVersionWithHttpInfoAsync(
      String projectId, String datasetId, LLMObsDatasetRestoreVersionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "restoreLLMObsDatasetVersion";
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
                  + " restoreLLMObsDatasetVersion"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " restoreLLMObsDatasetVersion"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling restoreLLMObsDatasetVersion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/restore"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.restoreLLMObsDatasetVersion",
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
   * Search LLM Observability experimentation entities.
   *
   * <p>See {@link #searchLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Experimentation search payload. (required)
   * @return LLMObsExperimentationSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentationSearchResponse searchLLMObsExperimentation(
      LLMObsExperimentationSearchRequest body) throws ApiException {
    return searchLLMObsExperimentationWithHttpInfo(body).getData();
  }

  /**
   * Search LLM Observability experimentation entities.
   *
   * <p>See {@link #searchLLMObsExperimentationWithHttpInfoAsync}.
   *
   * @param body Experimentation search payload. (required)
   * @return CompletableFuture&lt;LLMObsExperimentationSearchResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentationSearchResponse> searchLLMObsExperimentationAsync(
      LLMObsExperimentationSearchRequest body) {
    return searchLLMObsExperimentationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search across LLM Observability experimentation entities — projects, datasets, dataset records,
   * experiments, and experiment runs — using cursor-based pagination.
   *
   * <p>The <code>filter.scope</code> field controls which entity types are returned. At least one
   * valid scope must be provided.
   *
   * <p>Returns <code>200 OK</code> when all results fit in a single page. Returns <code>
   * 206 Partial Content</code> with a cursor in <code>meta.after</code> when additional pages are
   * available.
   *
   * @param body Experimentation search payload. (required)
   * @return ApiResponse&lt;LLMObsExperimentationSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK — all results returned in a single page. </td><td>  -  </td></tr>
   *       <tr><td> 206 </td><td> Partial Content — more results are available. Use &#x60;meta.after&#x60; as the next &#x60;page.cursor&#x60;. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsExperimentationSearchResponse> searchLLMObsExperimentationWithHttpInfo(
      LLMObsExperimentationSearchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchLLMObsExperimentation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.searchLLMObsExperimentation",
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
        new GenericType<LLMObsExperimentationSearchResponse>() {});
  }

  /**
   * Search LLM Observability experimentation entities.
   *
   * <p>See {@link #searchLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Experimentation search payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentationSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentationSearchResponse>>
      searchLLMObsExperimentationWithHttpInfoAsync(LLMObsExperimentationSearchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "searchLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentationSearchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentationSearchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling searchLLMObsExperimentation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.searchLLMObsExperimentation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentationSearchResponse>> result =
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
        new GenericType<LLMObsExperimentationSearchResponse>() {});
  }

  /**
   * Search LLM Observability spans.
   *
   * <p>See {@link #searchLLMObsSpansWithHttpInfo}.
   *
   * @param body Search spans payload. (required)
   * @return LLMObsSpansResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsSpansResponse searchLLMObsSpans(LLMObsSearchSpansRequest body) throws ApiException {
    return searchLLMObsSpansWithHttpInfo(body).getData();
  }

  /**
   * Search LLM Observability spans.
   *
   * <p>See {@link #searchLLMObsSpansWithHttpInfoAsync}.
   *
   * @param body Search spans payload. (required)
   * @return CompletableFuture&lt;LLMObsSpansResponse&gt;
   */
  public CompletableFuture<LLMObsSpansResponse> searchLLMObsSpansAsync(
      LLMObsSearchSpansRequest body) {
    return searchLLMObsSpansWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search LLM Observability spans using structured filters in the request body.
   *
   * @param body Search spans payload. (required)
   * @return ApiResponse&lt;LLMObsSpansResponse&gt;
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
  public ApiResponse<LLMObsSpansResponse> searchLLMObsSpansWithHttpInfo(
      LLMObsSearchSpansRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchLLMObsSpans";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchLLMObsSpans");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/spans/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.searchLLMObsSpans",
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
        new GenericType<LLMObsSpansResponse>() {});
  }

  /**
   * Search LLM Observability spans.
   *
   * <p>See {@link #searchLLMObsSpansWithHttpInfo}.
   *
   * @param body Search spans payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsSpansResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsSpansResponse>> searchLLMObsSpansWithHttpInfoAsync(
      LLMObsSearchSpansRequest body) {
    // Check if unstable operation is enabled
    String operationId = "searchLLMObsSpans";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsSpansResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling searchLLMObsSpans"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/spans/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.searchLLMObsSpans",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsSpansResponse>> result = new CompletableFuture<>();
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
        new GenericType<LLMObsSpansResponse>() {});
  }

  /**
   * Simple search experimentation entities.
   *
   * <p>See {@link #simpleSearchLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Simple search payload. (required)
   * @return LLMObsExperimentationSimpleSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsExperimentationSimpleSearchResponse simpleSearchLLMObsExperimentation(
      LLMObsExperimentationSimpleSearchRequest body) throws ApiException {
    return simpleSearchLLMObsExperimentationWithHttpInfo(body).getData();
  }

  /**
   * Simple search experimentation entities.
   *
   * <p>See {@link #simpleSearchLLMObsExperimentationWithHttpInfoAsync}.
   *
   * @param body Simple search payload. (required)
   * @return CompletableFuture&lt;LLMObsExperimentationSimpleSearchResponse&gt;
   */
  public CompletableFuture<LLMObsExperimentationSimpleSearchResponse>
      simpleSearchLLMObsExperimentationAsync(LLMObsExperimentationSimpleSearchRequest body) {
    return simpleSearchLLMObsExperimentationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search across LLM Observability experimentation entities using offset-based (page-number)
   * pagination. Use this endpoint when you need total page count or want to navigate to a specific
   * page number.
   *
   * <p>The <code>filter.scope</code> field controls which entity types are returned. At least one
   * valid scope must be provided.
   *
   * @param body Simple search payload. (required)
   * @return ApiResponse&lt;LLMObsExperimentationSimpleSearchResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsExperimentationSimpleSearchResponse>
      simpleSearchLLMObsExperimentationWithHttpInfo(LLMObsExperimentationSimpleSearchRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "simpleSearchLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling simpleSearchLLMObsExperimentation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/simple-search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.simpleSearchLLMObsExperimentation",
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
        new GenericType<LLMObsExperimentationSimpleSearchResponse>() {});
  }

  /**
   * Simple search experimentation entities.
   *
   * <p>See {@link #simpleSearchLLMObsExperimentationWithHttpInfo}.
   *
   * @param body Simple search payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsExperimentationSimpleSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsExperimentationSimpleSearchResponse>>
      simpleSearchLLMObsExperimentationWithHttpInfoAsync(
          LLMObsExperimentationSimpleSearchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "simpleSearchLLMObsExperimentation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsExperimentationSimpleSearchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsExperimentationSimpleSearchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " simpleSearchLLMObsExperimentation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/llm-obs/v1/experimentation/simple-search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.simpleSearchLLMObsExperimentation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsExperimentationSimpleSearchResponse>> result =
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
        new GenericType<LLMObsExperimentationSimpleSearchResponse>() {});
  }

  /**
   * Unlock LLM Observability dataset draft state.
   *
   * <p>See {@link #unlockLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @throws ApiException if fails to make API call
   */
  public void unlockLLMObsDatasetDraftState(String projectId, String datasetId)
      throws ApiException {
    unlockLLMObsDatasetDraftStateWithHttpInfo(projectId, datasetId);
  }

  /**
   * Unlock LLM Observability dataset draft state.
   *
   * <p>See {@link #unlockLLMObsDatasetDraftStateWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unlockLLMObsDatasetDraftStateAsync(
      String projectId, String datasetId) {
    return unlockLLMObsDatasetDraftStateWithHttpInfoAsync(projectId, datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Release the draft lock on a dataset held by the calling user, allowing other users to edit the
   * dataset draft.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unlockLLMObsDatasetDraftStateWithHttpInfo(
      String projectId, String datasetId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "unlockLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling unlockLLMObsDatasetDraftState");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling unlockLLMObsDatasetDraftState");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state/unlock"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.unlockLLMObsDatasetDraftState",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unlock LLM Observability dataset draft state.
   *
   * <p>See {@link #unlockLLMObsDatasetDraftStateWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unlockLLMObsDatasetDraftStateWithHttpInfoAsync(
      String projectId, String datasetId) {
    // Check if unstable operation is enabled
    String operationId = "unlockLLMObsDatasetDraftState";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " unlockLLMObsDatasetDraftState"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " unlockLLMObsDatasetDraftState"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/{project_id}/datasets/{dataset_id}/draft_state/unlock"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.unlockLLMObsDatasetDraftState",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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
   * Partially update an annotation queue. The <code>name</code>, <code>description</code>, and
   * <code>annotation_schema</code> fields can be updated.
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
   * Update annotation queue label schema.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueLabelSchemaWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update label schema payload. (required)
   * @return LLMObsAnnotationQueueLabelSchemaResponse
   * @throws ApiException if fails to make API call
   */
  public LLMObsAnnotationQueueLabelSchemaResponse updateLLMObsAnnotationQueueLabelSchema(
      String queueId, LLMObsAnnotationQueueLabelSchemaUpdateRequest body) throws ApiException {
    return updateLLMObsAnnotationQueueLabelSchemaWithHttpInfo(queueId, body).getData();
  }

  /**
   * Update annotation queue label schema.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update label schema payload. (required)
   * @return CompletableFuture&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;
   */
  public CompletableFuture<LLMObsAnnotationQueueLabelSchemaResponse>
      updateLLMObsAnnotationQueueLabelSchemaAsync(
          String queueId, LLMObsAnnotationQueueLabelSchemaUpdateRequest body) {
    return updateLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync(queueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or replace the label schema for a given annotation queue. The label schema defines the
   * labels annotators can apply to interactions in the queue. Label names must be unique within the
   * queue and match the pattern <code>^[a-zA-Z0-9_-]+$</code>. Each label must have a valid type:
   * score, categorical, boolean, or text.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update label schema payload. (required)
   * @return ApiResponse&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>
      updateLLMObsAnnotationQueueLabelSchemaWithHttpInfo(
          String queueId, LLMObsAnnotationQueueLabelSchemaUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsAnnotationQueueLabelSchema";
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
              + " updateLLMObsAnnotationQueueLabelSchema");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateLLMObsAnnotationQueueLabelSchema");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/label-schema"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.updateLLMObsAnnotationQueueLabelSchema",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LLMObsAnnotationQueueLabelSchemaResponse>() {});
  }

  /**
   * Update annotation queue label schema.
   *
   * <p>See {@link #updateLLMObsAnnotationQueueLabelSchemaWithHttpInfo}.
   *
   * @param queueId The ID of the LLM Observability annotation queue. (required)
   * @param body Update label schema payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LLMObsAnnotationQueueLabelSchemaResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>>
      updateLLMObsAnnotationQueueLabelSchemaWithHttpInfoAsync(
          String queueId, LLMObsAnnotationQueueLabelSchemaUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLLMObsAnnotationQueueLabelSchema";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'queueId' when calling"
                  + " updateLLMObsAnnotationQueueLabelSchema"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateLLMObsAnnotationQueueLabelSchema"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v1/annotation-queues/{queue_id}/label-schema"
            .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.updateLLMObsAnnotationQueueLabelSchema",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LLMObsAnnotationQueueLabelSchemaResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<LLMObsAnnotationQueueLabelSchemaResponse>() {});
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

  /** Manage optional parameters to uploadLLMObsDatasetRecordsFile. */
  public static class UploadLLMObsDatasetRecordsFileOptionalParameters {
    private File file;
    private Boolean deduplicate;
    private Boolean overwrite;
    private List<String> tags;
    private Boolean includeUserData;

    /**
     * Set file.
     *
     * @param file The records file to upload. Currently only CSV is supported. The file must
     *     include an <code>input</code> column. Optional columns include <code>id</code>, <code>
     *     expected_output</code>, <code>metadata</code>, and <code>tags</code>. (optional)
     * @return UploadLLMObsDatasetRecordsFileOptionalParameters
     */
    public UploadLLMObsDatasetRecordsFileOptionalParameters file(File file) {
      this.file = file;
      return this;
    }

    /**
     * Set deduplicate.
     *
     * @param deduplicate Whether to skip records whose <code>input</code> already exists in the
     *     dataset. Defaults to <code>false</code>. (optional, default to false)
     * @return UploadLLMObsDatasetRecordsFileOptionalParameters
     */
    public UploadLLMObsDatasetRecordsFileOptionalParameters deduplicate(Boolean deduplicate) {
      this.deduplicate = deduplicate;
      return this;
    }

    /**
     * Set overwrite.
     *
     * @param overwrite Whether to overwrite existing records that share the same user-provided
     *     <code>id</code>. Defaults to <code>true</code>. (optional, default to true)
     * @return UploadLLMObsDatasetRecordsFileOptionalParameters
     */
    public UploadLLMObsDatasetRecordsFileOptionalParameters overwrite(Boolean overwrite) {
      this.overwrite = overwrite;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Tags to apply to every uploaded record, in addition to any tags defined on
     *     individual rows. Can be repeated, e.g. <code>tags=env:prod&amp;tags=team:ai</code>.
     *     (optional)
     * @return UploadLLMObsDatasetRecordsFileOptionalParameters
     */
    public UploadLLMObsDatasetRecordsFileOptionalParameters tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set includeUserData.
     *
     * @param includeUserData Whether to enrich the response with user metadata. (optional)
     * @return UploadLLMObsDatasetRecordsFileOptionalParameters
     */
    public UploadLLMObsDatasetRecordsFileOptionalParameters includeUserData(
        Boolean includeUserData) {
      this.includeUserData = includeUserData;
      return this;
    }
  }

  /**
   * Upload records to an LLM Observability dataset.
   *
   * <p>See {@link #uploadLLMObsDatasetRecordsFileWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @throws ApiException if fails to make API call
   */
  public void uploadLLMObsDatasetRecordsFile(String projectId, String datasetId)
      throws ApiException {
    uploadLLMObsDatasetRecordsFileWithHttpInfo(
        projectId, datasetId, new UploadLLMObsDatasetRecordsFileOptionalParameters());
  }

  /**
   * Upload records to an LLM Observability dataset.
   *
   * <p>See {@link #uploadLLMObsDatasetRecordsFileWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadLLMObsDatasetRecordsFileAsync(
      String projectId, String datasetId) {
    return uploadLLMObsDatasetRecordsFileWithHttpInfoAsync(
            projectId, datasetId, new UploadLLMObsDatasetRecordsFileOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload records to an LLM Observability dataset.
   *
   * <p>See {@link #uploadLLMObsDatasetRecordsFileWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void uploadLLMObsDatasetRecordsFile(
      String projectId,
      String datasetId,
      UploadLLMObsDatasetRecordsFileOptionalParameters parameters)
      throws ApiException {
    uploadLLMObsDatasetRecordsFileWithHttpInfo(projectId, datasetId, parameters);
  }

  /**
   * Upload records to an LLM Observability dataset.
   *
   * <p>See {@link #uploadLLMObsDatasetRecordsFileWithHttpInfoAsync}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadLLMObsDatasetRecordsFileAsync(
      String projectId,
      String datasetId,
      UploadLLMObsDatasetRecordsFileOptionalParameters parameters) {
    return uploadLLMObsDatasetRecordsFileWithHttpInfoAsync(projectId, datasetId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload records to a dataset from a file. The request is a <code>multipart/form-data</code>
   * upload containing a single <code>file</code> part. Currently only CSV is supported. The CSV
   * must include an <code>input</code> column. Optional columns are <code>id</code>, <code>
   * expected_output</code>, <code>metadata</code>, and <code>tags</code>.
   *
   * <p>The response is a Server-Sent Events stream (<code>text/event-stream</code>) emitting
   * progress updates while records are processed. The stream emits the following named events: -
   * <code>progress</code>: incremental record counts written so far. - <code>completed</code>:
   * terminal event with a JSON body containing <code>records_created</code>. - <code>error</code>:
   * terminal event with a JSON body containing an error <code>message</code>.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> uploadLLMObsDatasetRecordsFileWithHttpInfo(
      String projectId,
      String datasetId,
      UploadLLMObsDatasetRecordsFileOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "uploadLLMObsDatasetRecordsFile";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling uploadLLMObsDatasetRecordsFile");
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datasetId' when calling uploadLLMObsDatasetRecordsFile");
    }
    File file = parameters.file;
    Boolean deduplicate = parameters.deduplicate;
    Boolean overwrite = parameters.overwrite;
    List<String> tags = parameters.tags;
    Boolean includeUserData = parameters.includeUserData;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v2/{project_id}/datasets/{dataset_id}/records/upload"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deduplicate", deduplicate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overwrite", overwrite));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[user_data]", includeUserData));
    if (file != null) {
      localVarFormParams.put("file", file);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LlmObservabilityApi.uploadLLMObsDatasetRecordsFile",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }

  /**
   * Upload records to an LLM Observability dataset.
   *
   * <p>See {@link #uploadLLMObsDatasetRecordsFileWithHttpInfo}.
   *
   * @param projectId The ID of the LLM Observability project. (required)
   * @param datasetId The ID of the LLM Observability dataset. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> uploadLLMObsDatasetRecordsFileWithHttpInfoAsync(
      String projectId,
      String datasetId,
      UploadLLMObsDatasetRecordsFileOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "uploadLLMObsDatasetRecordsFile";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " uploadLLMObsDatasetRecordsFile"));
      return result;
    }

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datasetId' when calling"
                  + " uploadLLMObsDatasetRecordsFile"));
      return result;
    }
    File file = parameters.file;
    Boolean deduplicate = parameters.deduplicate;
    Boolean overwrite = parameters.overwrite;
    List<String> tags = parameters.tags;
    Boolean includeUserData = parameters.includeUserData;
    // create path and map variables
    String localVarPath =
        "/api/v2/llm-obs/v2/{project_id}/datasets/{dataset_id}/records/upload"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deduplicate", deduplicate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overwrite", overwrite));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include[user_data]", includeUserData));
    if (file != null) {
      localVarFormParams.put("file", file);
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LlmObservabilityApi.uploadLLMObsDatasetRecordsFile",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }
}
